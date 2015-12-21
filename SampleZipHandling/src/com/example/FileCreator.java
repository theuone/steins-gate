package com.example;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileCreator {


	
	public static void main(String[] args)  {
		byte[] buffer = new byte[1024];
		//Stream from the UI
		File file = new File("C:\\Users\\abinash\\Pictures\\2014-05\\IMG-20140513-WA0001.jpg");
		
		
		//Stream for the url
		File newFile = new File("C:\\Users\\abinash\\Pictures\\2014-05\\temp.g2i");
		
		
		
		try(InputStream is = new FileInputStream(file);
				OutputStream os = new FileOutputStream(newFile);
				ZipOutputStream zos = new ZipOutputStream(os);) {
			
			ZipEntry ze = new ZipEntry("IMG-20140513-WA0001.jpg");
			zos.putNextEntry(ze);
			
			int len;
    		while ((len = is.read(buffer)) > 0) {
    			zos.write(buffer, 0, len);
    		}
			zos.closeEntry();
			
			
		} catch (IOException e) {
			// TODO: handle exception
		} 
		
		
		
		
		

	}

}
