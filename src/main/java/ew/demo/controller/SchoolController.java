package ew.demo.controller;


import ew.demo.common.BaseResult;
import ew.demo.common.BootstrapTable;
import ew.demo.common.QueryParam;
import ew.demo.model.BaseModelExample;
import ew.demo.model.School;
import ew.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/getSchoolData")
    @ResponseBody
    public BootstrapTable getSchoolData(@RequestBody(required = false) final QueryParam queryParam){
        //System.out.println("queryParam"+queryParam);
        int index = queryParam.getOffset();
        int Pagesize = queryParam.getLimit();
        BaseModelExample baseModelExample = new BaseModelExample();
        baseModelExample.setRowIndex(index);
        baseModelExample.setPagesize(Pagesize);
        List<School> schoolData = schoolService.getSchoolData(baseModelExample);
        int count = schoolService.getSchoolCount();
        return  new BootstrapTable(count,schoolData);
    }
    /**
     * 保存
     *
     * @param
     * @param
     * @param school   学校信息
     * @return
     */
    @RequestMapping("/save.json")
    @ResponseBody
    public BaseResult save(@RequestBody School school) {
        //TODO：服务器端验证
//        System.out.println("........................................");
        int count;
        if (school.getId() == null || school.getId() == 0) {
            count =  this.schoolService.insert(school);

        } else {
            count = this.schoolService.update(school);
        }
        BaseResult result = new BaseResult();
//        System.out.println("............."+count);
        result.setSuccess(count>0 ? true :false);
//        System.out.println("++++++++++++++" + result);


        return result;

    }
    /**
     * 编辑页面
     *
     * @param model
     * @param id    ID
     * @return
     */
    @RequestMapping({"{id}/edit.html"})
    public String toEdit(Model model, @PathVariable final int id) {
        School school = this.schoolService.loadById(id);
        model.addAttribute("school", school);
        return "school/new";
    }
    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @RequestMapping("delete.json")
    @ResponseBody
    public BaseResult delete(@RequestParam final int id) {

        //TODO：服务器端验证id的权限

        //删除
        int count = this.schoolService.delete(id);

        BaseResult result = new BaseResult();
        result.setSuccess(count > 0 ? true : false);
        return result;

    }

    @RequestMapping("school/school.html")
    public String school(){
        return "school/school";
    }
}
