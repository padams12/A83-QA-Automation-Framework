public class Homework20 extends BaseTest {
    public void renamePlaylist() {
        String updatePlaylist = "Updated Playlist \*Sample Edited Playlist.\**
        provideEmail( * Paul.Adams @testpro.io*);
        providePassword( * Amanda$12 *);
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMessage, updatePlaylistMsg);
              }


                public void doubleClickPlaylist()  {
                WebElement playlistElement= wait until(ExpectedConditions.visibilityOfElementLocated(By.cssSelcetor(*[name='name'}*)));
                actions.doubleClick(playlistElement).perform();

                public void enterdNewPlaylistName() {
                    WebElement playlistInputFIeld = wait.until(ExpectedConditins.visibilityofElementLocated(By.cssselector( *[name = 'name'] *)))
                    ;
                    playlistInputField.sendKeys(Keys.chord(Keus.Control * A *, Keys.Back_Space));

                    playlistInputField.sendKeys(newPlaylistName);
                    playlistInputFIeld.sendKeys(Keys.ENTER);
                }
                public String getRenamedPlaylistSuccessMsg() {
                    WebElement notificatio = wait.until(ExpectedConditions.visibilityOfElementLocated(BY.cssSelector("div.Success.show")));
                    return notifiction.getText();




            }

        }

}
