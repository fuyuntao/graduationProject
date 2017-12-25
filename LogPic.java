package travel.platform.entity;

import java.io.Serializable;
import java.util.Arrays;

public class LogPic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5037908555096510280L;
	private String logId;
	private byte[] pic;
	private String picSer;
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getPicSer() {
		return picSer;
	}
	public void setPicSer(String picSer) {
		this.picSer = picSer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LogPic [logId=" + logId + ", pic=" + Arrays.toString(pic) + ", picSer=" + picSer + "]";
	}
	
}
