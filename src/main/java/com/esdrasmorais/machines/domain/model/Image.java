package com.esdrasmorais.machines.domain.model;

import java.io.File;
import java.io.IOException;

import com.esdrasmorais.ddd.repository.Context;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class Image extends Context {
	protected String fileName;
	protected File imageFile;
	
	public Image(String fileName, File imageFile) throws IOException {
		super(null, null, null);
		
		this.fileName = fileName;
		this.imageFile = imageFile;
		
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("db");
		
		GridFS gfsPhoto = new GridFS(db, "photo");

		// get image file from local drive
		GridFSInputFile gfsFile = gfsPhoto.createFile(this.imageFile);

		// set a new filename for identify purpose
		gfsFile.setFilename(this.fileName);

		// save the image file into mongoDB
		gfsFile.save();
	}
}