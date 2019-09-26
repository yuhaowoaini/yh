package ew.demo.dao;

import ew.demo.model.Qq;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QqMapper {
     List<Qq> selByidandsex(Qq qq);
}
