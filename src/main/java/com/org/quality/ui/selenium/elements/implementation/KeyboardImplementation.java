package com.org.quality.ui.selenium.elements.implementation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.org.quality.ui.selenium.elements.Keyboard;

public class KeyboardImplementation extends ElementImplementation implements Keyboard {

    public KeyboardImplementation(WebElement element) {
        super(element);
    }

    public void pressNull() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NULL);
    }

    public void pressCancel() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.CANCEL);
    }

    public void pressHelp() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.HELP);
    }

    public void pressBackSpace() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.BACK_SPACE);
    }

    public void pressTab() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.TAB);
    }

    public void pressClear() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.CLEAR);
    }

    public void pressReturn() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.RETURN);
    }

    public void pressEnter() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ENTER);
    }

    public void pressShift() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.SHIFT);
    }

    public void pressLeftShift() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.LEFT_SHIFT);
    }

    public void pressControl() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.CONTROL);
    }

    public void pressLeftControl() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.LEFT_CONTROL);
    }

    public void pressAlt() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ALT);
    }

    public void pressLeftAlt() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.LEFT_ALT);
    }

    public void pressPause() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.PAUSE);
    }

    public void pressEscape() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ESCAPE);
    }

    public void pressSpace() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.SPACE);
    }

    public void pressPagUp() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.PAGE_UP);
    }

    public void pressPageDown() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.PAGE_DOWN);
    }

    public void pressEnd() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.END);
    }

    public void pressHome() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.HOME);
    }

    public void pressLeft() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.LEFT);
    }

    public void pressArrowLeft() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ARROW_LEFT);
    }

    public void pressUp() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.UP);
    }

    public void pressArrowUp() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ARROW_UP);
    }

    public void pressRight() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.RIGHT);
    }

    public void pressArrowRight() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ARROW_RIGHT);
    }

    public void pressDown() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.DOWN);
    }

    public void pressArrowDown() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ARROW_DOWN);
    }

    public void pressInsert() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.INSERT);
    }

    public void pressDelete() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.DELETE);
    }

    public void pressSemicolon() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.SEMICOLON);
    }

    public void pressEquals() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.EQUALS);
    }

    public void pressNumpad0() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD0);
    }

    public void pressNumpad1() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD1);
    }

    public void pressNumpad2() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD2);
    }

    public void pressNumpad3() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD3);
    }

    public void pressNumpad4() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD4);
    }

    public void pressNumpad5() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD5);
    }

    public void pressNumpad6() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD6);
    }

    public void pressNumpad7() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD7);
    }

    public void pressNumpad8() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD8);
    }

    public void pressNumpad9() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.NUMPAD9);
    }

    public void Multiply() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.MULTIPLY);
    }

    public void pressAdd() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.ADD);
    }

    public void pressSeparator() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.SEPARATOR);
    }

    public void pressSubtract() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.SUBTRACT);
    }

    public void pressDecimal() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.DECIMAL);
    }

    public void pressDivede() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.DIVIDE);
    }

    public void pressF1() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F1);
    }

    public void pressF2() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F2);
    }

    public void pressF3() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F3);
    }

    public void pressF4() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F4);
    }

    public void pressF5() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F5);
    }

    public void pressF6() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F6);
    }

    public void pressF7() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F7);
    }

    public void pressF8() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F8);
    }

    public void pressF9() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F9);
    }

    public void pressF10() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F10);
    }

    public void pressF11() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F11);
    }

    public void pressF12() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.F12);
    }

    public void pressMeta() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.META);
    }

    public void pressCommand() {
        wait.forVisibilityOf(element);
        element.sendKeys(Keys.COMMAND);
    }
}
