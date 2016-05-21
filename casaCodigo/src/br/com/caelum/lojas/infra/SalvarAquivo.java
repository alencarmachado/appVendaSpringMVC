package br.com.caelum.lojas.infra;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class SalvarAquivo {

	@Autowired
	private HttpServletRequest request;
		
	public String write(String arquivoBase, MultipartFile file){
					
		try{
			String realPath = request.getServletContext().getRealPath("/"+arquivoBase);
			String path = realPath + "/" +file.getOriginalFilename();
			
			file.transferTo(new File(path));
			return arquivoBase+"/"+file.getOriginalFilename();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	
	}
	
}
