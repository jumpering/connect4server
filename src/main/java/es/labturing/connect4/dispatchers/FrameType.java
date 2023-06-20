package es.labturing.connect4.dispatchers;

public enum FrameType {
    START,
	CREATE_PLAYERS,
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	CLOSE,
	PLAYER_TYPE,
	COORDINATE_VALID,
	BOARD_COMPLETE,
	RANDOM_COORDINATE,
	CHANGE_TURN,
	TOKEN_CHAR,
	EMPTY_TOKEN,
	DIMENSION,
	TICTACTOE,
	ERRORS_PUT,
	PUT_TOKEN,
	VALUE_TURN,
	CONTINUE_STATE,
	NEW_GAME;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
