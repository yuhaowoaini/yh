package ew.demo.dao;

import ew.demo.model.BaseModelExample;
import ew.demo.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {
    List<School> getSchoolData(BaseModelExample baseModelExample);
    int getSchoolCount();
    School loadById(int id);
    int delete(int id);
    int insert(School school);
    int update(School school);
}
