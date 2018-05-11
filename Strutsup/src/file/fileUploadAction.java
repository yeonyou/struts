package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class fileUploadAction extends ActionSupport {
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String fileUploadPath ="C:\\Users\\ศฃมุ\\Desktop\\eclipse-workspace\\Java\\upload\\";

	public String upload() throws Exception {
		return SUCCESS;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}	

}
