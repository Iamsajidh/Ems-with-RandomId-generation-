package com.cg.Hussain.ems.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.cg.Hussain.ems.model.DBSequence;

@Service
public class SeqGeneratorService {

	@Autowired
	private MongoOperations mongoOperations;

//	@Autowired
//	public SeqGeneratorService(MongoOperations mongoOperations)
//	{
//		this.mongoOperations = mongoOperations;
//	}

	public int generateSequence(String seqName) {
		DBSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
				new Update().inc("sequence", 1), options().returnNew(true).upsert(true), DBSequence.class);
		return !Objects.isNull(counter) ? counter.getSequence() : 1;
	}

}
