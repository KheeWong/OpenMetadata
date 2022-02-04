package org.openmetadata.catalog.selenium.objectRepository;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopicDetails {

  WebDriver webDriver;

  public TopicDetails(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  By addTag = By.xpath("(//div[@class=\"tw-flex tw-flex-wrap\"])");
  By selectTag = By.xpath("(//div[@data-testid=\"list-item\"])[2]");
  By selectedTag =
      By.xpath("//span[@class=\"tw-no-underline hover:tw-no-underline tw-py-0.5 tw-px-2 tw-pl-2 tw-pr-1\"]");
  By breadCrumbTags = By.xpath("//span[@class=\"tw-no-underline hover:tw-no-underline tw-px-1\"]");
  By editDescriptionButton = By.xpath("//button[@data-testid=\"edit-description\"]");
  By config = By.xpath("(//button[@data-testid = \"tab\"])[2]");
  By manage = By.xpath("(//button[@data-testid = \"tab\"])[3]");

  public By addTag() {
    return addTag;
  }

  public By selectTag() {
    return selectTag;
  }

  public List<WebElement> selectedTag() {
    return webDriver.findElements(selectedTag);
  }

  public List<WebElement> breadCrumbTag() {
    return webDriver.findElements(breadCrumbTags);
  }

  public By editDescriptionButton() {
    return editDescriptionButton;
  }

  public By config() {
    return config;
  }

  public By manage() {
    return manage;
  }
}
