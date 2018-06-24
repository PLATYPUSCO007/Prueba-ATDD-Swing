/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;

/**
 *
 * @author Bautista
 */
public class ventanaTest {

    private FrameFixture window;

    @Given("^inicializo una ventana$")
    public void inicializo_una_ventana() {
        FailOnThreadViolationRepaintManager.install();
        ventana frame = GuiActionRunner.execute(() -> new ventana());
        window = new FrameFixture(frame);
    }

    @When("^la ejecuto$")
    public void la_ejecuto() {
        window.show();
    }

    @Then("^debe ser visible$")
    public void debe_ser_visible() {
        window.textBox().enterText("Some random text");
        window.button().click();
        window.label().requireText("Some random text");
        window.cleanUp();
    }

}
