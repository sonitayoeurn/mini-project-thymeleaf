package com.example.spring.miniproject.service;



import com.example.spring.miniproject.model.FileUpload;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    FileUpload uploadSingle(MultipartFile file);
}
