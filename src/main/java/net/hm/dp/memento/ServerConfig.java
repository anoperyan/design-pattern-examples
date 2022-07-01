package net.hm.dp.memento;


import java.util.Date;

/**
 * @author Yan Jiahong
 * Created on 2022/7/1
 */

public class ServerConfig {
    private String versionNo;
    private String content;
    private Date gmtPublish;
    private String operator;

    public ServerConfig() {

    }

    public ServerConfig(String versionNo, String content, Date gmtPublish, String operator) {
        this.versionNo = versionNo;
        this.content = content;
        this.gmtPublish = gmtPublish;
        this.operator = operator;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getGmtPublish() {
        return gmtPublish;
    }

    public void setGmtPublish(Date gmtPublish) {
        this.gmtPublish = gmtPublish;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "versionNo='" + versionNo + '\'' +
                ", content='" + content + '\'' +
                ", gmtPublish=" + gmtPublish +
                ", operator='" + operator + '\'' +
                '}';
    }
}
