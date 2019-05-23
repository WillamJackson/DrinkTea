package com.example.demo.forms;

import java.util.List;

import com.example.demo.message.CheckMessage;
import com.example.demo.enums.StateTypes;

/**
 * 請求状態基本情報の戻り値定義クラスです。
 * 
 * @version 1.0
 * @author 陳強
 */
public class ResultInfo {
  private StateTypes state;
  private String text;
  private String[] args;

  private List<CheckMessage> checkMessages;

  /**
   * stateを取得する。
   * 
   * @return the state
   */
  public StateTypes getState() {
    return state;
  }

  /**
   * stateを設定する。
   * 
   * @param state the state to set
   */
  public void setState(StateTypes state) {
    this.state = state;
  }

  /**
   * textを取得する。
   * 
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * textを設定する。
   * 
   * @param text the text to set
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * checkMessagesを取得する。
   * 
   * @return the checkMessages
   */
  public List<CheckMessage> getCheckMessages() {
    return checkMessages;
  }

  /**
   * checkMessagesを設定する。
   * 
   * @param checkMessages the checkMessages to set
   */
  public void setCheckMessages(List<CheckMessage> checkMessages) {
    this.checkMessages = checkMessages;
  }

  /**
   * argsを取得する。
   * 
   * @return the args
   */
  public String[] getArgs() {
    return args;
  }

  /**
   * argsを設定する。
   * 
   * @param args the args to set
   */
  public void setArgs(String[] args) {
    this.args = args;
  }

}

