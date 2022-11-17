package bridge.exception;

public class BridgeException {

    private static final String ERROR_MESSAGE = "[ERROR] ";
    private static final String BRIDGE_SIZE_MESSAGE = "다리 길이는 3이상 20이하의 숫자로 입력해주세요.";


    public static void isInRangeBridgeSize(String bridgeSize) throws IllegalArgumentException{
        if(Integer.parseInt(bridgeSize) < 3 || Integer.parseInt(bridgeSize) > 20){
            throw new IllegalArgumentException(ERROR_MESSAGE + BRIDGE_SIZE_MESSAGE);
        }
    }

    public static void isIntegerBridgeSize(String bridgeSize) throws IllegalArgumentException{
        try{
            Integer.parseInt(bridgeSize);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(ERROR_MESSAGE + BRIDGE_SIZE_MESSAGE);
        }
    }

}
