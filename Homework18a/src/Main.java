//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
public class homework18a extends BaseTest  {
    @Test
    public void playSong() {
        provideEmail("Paul.Adams@testpro.io");
        providePassword("Amanda$12");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }

    public void clickPlay() {
        WebElement playNextButton = driver.findElement(By.xpath(xpathExpression:"//i[@data-testid='play-next-btn']"));
        WebElement playButton = driver.findElement(By.xpath(xpathExpression:"//span[@data-testid= 'play-btn']"));
        playNextButton.click();
        playButton.click();
    }
       public boolean is SongPlaying();    {
        WebElement  soundBar = driver.findElement(By.xpath(xpathExpression "//div[@data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();

    }
}