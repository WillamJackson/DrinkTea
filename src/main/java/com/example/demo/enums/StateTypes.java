package com.example.demo.enums;

/**
 * 返却状態の定義クラスです。
 * 
 * @version 1.0
 * @author 陳強
 */
public enum StateTypes {

  SUCCESS("SUCCESS"), FAIL("FAIL"), ERROR("ERROR"), CHECKERROR("CHECKERROR");

  private final String code;

  StateTypes(String code) {
    this.code = code;
  }

  /**
   * 状態に対するコードを取得する。
   * 
   * @return 状態コード
   */
  public String getCode() {
    return code;
  }

}

