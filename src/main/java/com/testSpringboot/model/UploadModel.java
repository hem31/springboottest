package com.testSpringboot.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class UploadModel {

    private String extraField;
    
    private String fileType;
    
    private String email;

    private MultipartFile[] files;

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }
    
    public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return "UploadModel{" +
                "extraField='" + extraField + '\'' +
                ", files=" + Arrays.toString(files) +
                '}';
    }
}
