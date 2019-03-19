package com.org.quality.ui.selenium.elements;

import com.org.quality.ui.selenium.ImplementedBy;
import com.org.quality.ui.selenium.elements.implementation.KeyboardImplementation;

@ImplementedBy(KeyboardImplementation.class)
public interface Keyboard extends Element {

    void pressNull();

    void pressCancel();

    void pressHelp();

    void pressBackSpace();

    void pressTab();

    void pressClear();

    void pressReturn();

    void pressEnter();

    void pressShift();

    void pressLeftShift();

    void pressControl();

    void pressLeftControl();

    void pressAlt();

    void pressLeftAlt();

    void pressPause();

    void pressEscape();

    void pressSpace();

    void pressPagUp();

    void pressPageDown();

    void pressEnd();

    void pressHome();

    void pressLeft();

    void pressArrowLeft();

    void pressUp();

    void pressArrowUp();

    void pressRight();

    void pressArrowRight();

    void pressDown();

    void pressArrowDown();

    void pressInsert();

    void pressDelete();

    void pressSemicolon();

    void pressEquals();

    void pressNumpad0();

    void pressNumpad1();

    void pressNumpad2();

    void pressNumpad3();

    void pressNumpad4();

    void pressNumpad5();

    void pressNumpad6();

    void pressNumpad7();

    void pressNumpad8();

    void pressNumpad9();

    void Multiply();

    void pressAdd();

    void pressSeparator();

    void pressSubtract();

    void pressDecimal();

    void pressDivede();

    void pressF1();

    void pressF2();

    void pressF3();

    void pressF4();

    void pressF5();

    void pressF6();

    void pressF7();

    void pressF8();

    void pressF9();

    void pressF10();

    void pressF11();

    void pressF12();

    void pressMeta();

    void pressCommand();
}
