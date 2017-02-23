package com.eryuzhisen.model.exception;
/**
 * 

  * @ClassName: ProtocolException

  * @Description: TODO

  * @author Comsys-huangmiao

  * @date 2014年11月25日 上午10:26:12

  *
 */
public class ProtocolException extends BaseException{

	private static final long serialVersionUID = 8791079903575951015L;
	public ProtocolException(int errCode, String rootName){

	}
	
	public ProtocolException(int errCode, String result, String rootName){

	}

	public ProtocolException(String errCode, String errInfo){
		super(errCode,errInfo);
	}
	public ProtocolException(String errCode, String errInfo,String attachCode){
		super(errCode,errInfo);
		super.setAttachCode(attachCode);
	}
}
