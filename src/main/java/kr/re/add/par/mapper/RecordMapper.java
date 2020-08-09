package kr.re.add.par.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper { 
    Map<Object,Object> selectRecord();
}