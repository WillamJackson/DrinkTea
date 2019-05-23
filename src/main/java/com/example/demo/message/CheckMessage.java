package com.example.demo.message;

import java.util.List;

/**
 * FormDataのチェックエラー情報の定義クラスです。
 * 
 * @version 1.0
 * @author 陳強
 */
public class CheckMessage {
  private String field;
  private String code;
  private List<String> args;

  /**
   * デフォルトコンストラクタです。
   */
  public CheckMessage() {

  }

  /**
   * エラー項目とエラーコードにより、エラー情報を作成する。
   * 
   * @param field エラー項目
   * @param code エラーコード
   */
  public CheckMessage(String field, String code) {
    this.field = field;
    this.code = code;
  }

  /**
   * fieldを取得する。
   * 
   * @return the field
   */
  public String getField() {
    return field;
  }

  /**
   * fieldを設定する。
   * 
   * @param field the field to set
   */
  public void setField(String field) {
    this.field = field;
  }

  /**
   * codeを取得する。
   * 
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * codeを設定する。
   * 
   * @param code the code to set
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * argsを取得する。
   * 
   * @return the args
   */
  public List<String> getArgs() {
    return args;
  }

  /**
   * argsを設定する。
   * 
   * @param args the args to set
   */
  public void setArgs(List<String> args) {
    this.args = args;
  }

}

