package secretjuju.gaemihouse.room.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "주주방 정보", description = "방 아이디, 방 최대 인원, 방 등록 인원, 방 수익률, 맵 아이디")
public class ShareholderRoomDTO {

    @ApiModelProperty(value = "방 아이디")
    private int roomCode;
    @ApiModelProperty(value = "방 최대 인원")
    private int roomLimitedNumber;
    @ApiModelProperty(value = "방 등록 인원")
    private int roomRegistedNumber;
    @ApiModelProperty(value = "방 수익률")
    private int roomYield;
    @ApiModelProperty(value = "맵 아이디")
    private  int mapCode;

    public ShareholderRoomDTO() {
    }

    public ShareholderRoomDTO(int roomCode, int roomLimitedNumber, int roomRegistedNumber, int roomYield, int mapCode) {
        this.roomCode = roomCode;
        this.roomLimitedNumber = roomLimitedNumber;
        this.roomRegistedNumber = roomRegistedNumber;
        this.roomYield = roomYield;
        this.mapCode = mapCode;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(int roomCode) {
        this.roomCode = roomCode;
    }

    public int getRoomLimitedNumber() {
        return roomLimitedNumber;
    }

    public void setRoomLimitedNumber(int roomLimitedNumber) {
        this.roomLimitedNumber = roomLimitedNumber;
    }

    public int getRoomRegistedNumber() {
        return roomRegistedNumber;
    }

    public void setRoomRegistedNumber(int roomRegistedNumber) {
        this.roomRegistedNumber = roomRegistedNumber;
    }

    public int getRoomYield() {
        return roomYield;
    }

    public void setRoomYield(int roomYield) {
        this.roomYield = roomYield;
    }

    public int getMapCode() {
        return mapCode;
    }

    public void setMapCode(int mapCode) {
        this.mapCode = mapCode;
    }

    @Override
    public String toString() {
        return "ShareholderRoomDTO{" +
                "roomCode=" + roomCode +
                ", roomLimitedNumber=" + roomLimitedNumber +
                ", roomRegistedNumber=" + roomRegistedNumber +
                ", roomYield=" + roomYield +
                ", mapCode=" + mapCode +
                '}';
    }
}