package name.nvshen.common.vo;

public class ResultVO {

    private static final String SUCCESS_INFO = "操作成功";
    private static final String FAIL_INFO = "操作失败";
    
    private static final int SUCCESS_STATUS = 1;
    private static final int FAIL_STATUS = 0;
    
    private int status;
    private String depiction;
    private Object data;
    
    public ResultVO(){
        
    }
    
    public ResultVO(int status, String depiction){
        this.status = status;
        this.depiction = depiction;
    }
    
    public ResultVO(int status, String depiction, Object data){
        this.status = status;
        this.depiction = depiction;
        this.data = data;
    }
    
    public static ResultVO success(){
        
        return new ResultVO(SUCCESS_STATUS, SUCCESS_INFO);
    }
    
    public static ResultVO success(String depiction){
        
        return new ResultVO(SUCCESS_STATUS, depiction);
    }
    
    public static ResultVO success(String depiction, Object data){
        
        return new ResultVO(SUCCESS_STATUS, depiction, data);
    }
    
    public static ResultVO fail(){
        
        return new ResultVO(FAIL_STATUS, FAIL_INFO);
    }
    
    public static ResultVO fail(String depiction){
        
        return new ResultVO(FAIL_STATUS, depiction);
    }
    
    public static ResultVO fail(String depiction, Object data){
        
        return new ResultVO(FAIL_STATUS, depiction, data);
    }
    
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getDepiction() {
        return depiction;
    }
    public void setDepiction(String depiction) {
        this.depiction = depiction;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
