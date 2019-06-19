package com.djyz.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Configuration
public class FileUpload {
    /*上传图片*/
    public String upload(MultipartFile file, HttpSession session) throws IOException {
        //确定上传路径
        String realPath = session.getServletContext().getRealPath("images");
        //变成程序中的路径
        File uploadPath = new File(realPath);
        if(!uploadPath.exists()){
            uploadPath.mkdirs();
        }
        //确认最终的路径
        String filename = file.getOriginalFilename();

        String newnewName = UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf("."),filename.length());
        System.out.println("新名字--------------------------"+newnewName);

        uploadPath = new File(uploadPath+"/"+filename);
        //开始上传
        file.transferTo(uploadPath);
        return filename;
    }

    /*删除服务器图片*/
    public void deleteFile(String picname,HttpSession session){
        String path = session.getServletContext().getRealPath("/images");
        if(picname != null || !"".equals(picname)){
            File file = new File(path+'/'+picname);
            file.delete();
        }
    }
}
