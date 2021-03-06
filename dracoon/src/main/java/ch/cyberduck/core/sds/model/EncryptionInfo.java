/*
 * Secure Data Space API
 * Version 4.2.0.beta2 - built at: 2017-06-02 17:44:30, API server: https://duck.ssp-europe.eu/api/v4
 *
 * OpenAPI spec version: 4.2.0.beta2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.model;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * EncryptionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-29T20:48:51.396+02:00")
public class EncryptionInfo {
  /**
   * shows if there is no key/ should be a key/ is a key
   */
  public enum UserKeyStateEnum {
    NONE("none"),
    
    PENDING("pending"),
    
    AVAILABLE("available");

    private String value;

    UserKeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UserKeyStateEnum fromValue(String text) {
      for (UserKeyStateEnum b : UserKeyStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("userKeyState")
  private UserKeyStateEnum userKeyState = null;

  /**
   * shows if there is no key/ should be a key/ is a key
   */
  public enum RoomKeyStateEnum {
    NONE("none"),
    
    PENDING("pending"),
    
    AVAILABLE("available");

    private String value;

    RoomKeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoomKeyStateEnum fromValue(String text) {
      for (RoomKeyStateEnum b : RoomKeyStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roomKeyState")
  private RoomKeyStateEnum roomKeyState = null;

  /**
   * shows if there is no key/ should be a key/ is a key
   */
  public enum DataSpaceKeyStateEnum {
    NONE("none"),
    
    PENDING("pending"),
    
    AVAILABLE("available");

    private String value;

    DataSpaceKeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataSpaceKeyStateEnum fromValue(String text) {
      for (DataSpaceKeyStateEnum b : DataSpaceKeyStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataSpaceKeyState")
  private DataSpaceKeyStateEnum dataSpaceKeyState = null;

  public EncryptionInfo userkeyState(UserKeyStateEnum userkeyState) {
    this.userKeyState = userkeyState;
    return this;
  }

   /**
   * shows if there is no key/ should be a key/ is a key
   * @return userKeyState
  **/
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  public UserKeyStateEnum getUserKeyState() {
    return userKeyState;
  }

  public void setUserKeyState(UserKeyStateEnum userKeyState) {
    this.userKeyState = userKeyState;
  }

  public EncryptionInfo roomkeyState(RoomKeyStateEnum roomkeyState) {
    this.roomKeyState = roomkeyState;
    return this;
  }

   /**
   * shows if there is no key/ should be a key/ is a key
   * @return roomKeyState
  **/
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  public RoomKeyStateEnum getRoomKeyState() {
    return roomKeyState;
  }

  public void setRoomKeyState(RoomKeyStateEnum roomKeyState) {
    this.roomKeyState = roomKeyState;
  }

  public EncryptionInfo dataSpaceKeyState(DataSpaceKeyStateEnum dataSpaceKeyState) {
    this.dataSpaceKeyState = dataSpaceKeyState;
    return this;
  }

   /**
   * shows if there is no key/ should be a key/ is a key
   * @return dataSpaceKeyState
  **/
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  public DataSpaceKeyStateEnum getDataSpaceKeyState() {
    return dataSpaceKeyState;
  }

  public void setDataSpaceKeyState(DataSpaceKeyStateEnum dataSpaceKeyState) {
    this.dataSpaceKeyState = dataSpaceKeyState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionInfo encryptionInfo = (EncryptionInfo) o;
    return Objects.equals(this.userKeyState, encryptionInfo.userKeyState) &&
        Objects.equals(this.roomKeyState, encryptionInfo.roomKeyState) &&
        Objects.equals(this.dataSpaceKeyState, encryptionInfo.dataSpaceKeyState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userKeyState, roomKeyState, dataSpaceKeyState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionInfo {\n");

    sb.append("    userKeyState: ").append(toIndentedString(userKeyState)).append("\n");
    sb.append("    roomKeyState: ").append(toIndentedString(roomKeyState)).append("\n");
    sb.append("    dataSpaceKeyState: ").append(toIndentedString(dataSpaceKeyState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

