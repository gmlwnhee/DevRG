package kr.inhatc.spring.file.entity;

import lombok.Data;

@Data
public class Files {
		
		private int idx;
		
		//private String userId;
		private String originalFileName;
		private String storedFilePath;
		private long fileSize;
		
}
