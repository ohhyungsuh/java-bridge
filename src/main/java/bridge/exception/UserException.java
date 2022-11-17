package bridge.exception;

public class UserException {

    private static final String ERROR_MESSAGE = "[ERROR] ";
    private static final String MOVING_MESSAGE = "이동할 경우 \"U\"또는 \"D\"를 입력해주세요.";
    private static final String REPLAY_MESSAGE = "재시작을 원할 경우 \"R\", 종료를 원할 경우 \"Q\"를 입력해주세요.";

    public static void isValidMovingInput(String userMoving) throws IllegalArgumentException{
        if(userMoving != "U" && userMoving != "D"){
            throw new IllegalArgumentException(ERROR_MESSAGE + MOVING_MESSAGE);
        }
    }

    public static void isValidGameCommand(String userReplayCommand) throws IllegalArgumentException{
        if(userReplayCommand != "R" && userReplayCommand != "Q"){
            throw new IllegalArgumentException(ERROR_MESSAGE + REPLAY_MESSAGE);
        }
    }
}
