package ew.demo.service;

import ew.demo.dao.SchoolMapper;
import ew.demo.model.BaseModelExample;
import ew.demo.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    public List<School> getSchoolData(BaseModelExample baseModelExample){
   return schoolMapper.getSchoolData(baseModelExample);
    }
   public int getSchoolCount(){
        return schoolMapper.getSchoolCount();
    }
    public School loadById(int id){
        return schoolMapper.loadById(id);
    }
    public int delete(int id) {

        return this.schoolMapper.delete(id);


    }
    public int insert(School school) {

        return this.schoolMapper.insert(school);

    }


    public int update(School school) {

        return this.schoolMapper.update(school);
    }
    }



