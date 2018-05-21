package com.org.commons.selenium.elements.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	private WebDriverWait wait;

	public WaitHelper(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
	}

	/**
	 * Responsável por aguardar que quantidade de tela tenha sido aberta
	 * 
	 * @param windowsNumber
	 *            a quantidade de telas que devem estar abertas
	 */
	public void forWindowToBeOpen(int windowsNumber) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(WindowConditions.windowsNumberToBe(windowsNumber));
	}

	/**
	 * Responsável por aguardar que todos os elementos tenham sido "carregados" e
	 * estejam invisiveis.
	 * 
	 * @param elements
	 *            a lista de elementos que será feita a verificação.
	 */
	public void forInvisibilityOfAllElements(List<? extends WebElement> elements) {
		@SuppressWarnings("unchecked")
		List<WebElement> webs = (List<WebElement>) (List<?>) elements;
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.invisibilityOfAllElements(webs));
	}

	/**
	 * Responsável por aguardar que o elemento seja clicavel.
	 * 
	 * @param elements
	 *            a lista de elementos que será feita a verificação.
	 */
	public void forElementToBeClickable(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Responsável por aguardar e verificar durante o tempo de 10 (dez) segundos se
	 * o alert está presente em tela.
	 */
	public void forAlertPresent() {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * Responsável por aguardar e verificar durante o tempo de 10 (dez) segundos se
	 * o elemento está invisibel em tela.
	 * 
	 * @param elemento
	 *            o elemento no qual será realizada a função de aguardar a sua
	 *            invisibilidade.
	 */
	public void forInvisibilityOf(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.invisibilityOf(element));
	}

	/**
	 * Responsável por aguardar e verificar durante o tempo de 10 (dez) segundos se
	 * o elemento está invisibel em tela.
	 * 
	 * @param elemento
	 *            o elemento no qual será realizada a função de aguardar a sua
	 *            invisibilidade.
	 */
	public void forFrameToBeAvailableAndSwitchToIt(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	/**
	 * Responsável por aguardar e verificar durante o tempo de 10 (dez) segundos se
	 * o elemento está presente em tela.
	 * 
	 * @param elemento
	 *            o elemento no qual será realizada a função de aguardar a sua
	 *            presença.
	 */
	public void forVisibilityOf(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Responsável por aguardar que o elemento <b>NÃO</b> tenha um determinado
	 * atributo.
	 * 
	 * @param element
	 *            o elemento no qual será realizada a verificação
	 * @param attribute
	 *            o atributo a ser verificado
	 * @param value
	 *            o valor do atributo a ser verificado
	 */
	public void forElementeNotContainsAttributeValue(WebElement element, String attribute, String value) {
		wait.ignoring(StaleElementReferenceException.class).withTimeout(Duration.ofMillis(15000))
				.pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, attribute, value)));
	}

	/**
	 * Responsável por aguardar que a quantidade de telas seja igual ao parametro
	 * <b>windowsNumber</b>.
	 * 
	 * @param windowsNumber
	 *            quantidade de telas que devem estar abertas.
	 */
	public void forNumberOfWindowToBe(int windowsNumber) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.numberOfWindowsToBe(windowsNumber));
	}

	/**
	 * Responsável por aguardar que a url possua tal informação.
	 * 
	 * @param url
	 * @param time
	 */
	public void forUrlContains(String url, int time) {
		try {
			wait.ignoring(StaleElementReferenceException.class).withTimeout(Duration.ofMillis(time))
					.pollingEvery(Duration.ofMillis(100)).until(ExpectedConditions.urlContains(url));
		} catch (TimeoutException e) {
		}
	}
}
