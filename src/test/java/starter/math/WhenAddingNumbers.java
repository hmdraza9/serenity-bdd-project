package starter.math;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important."})
public class WhenAddingNumbers {

    @Steps
    MathWizSteps michael;

    @Test
    public void addingSums() {
        // Given
        michael.startsWith(1);

        // When
        michael.adds(2);

        // Then
        michael.shouldHave(3);
    }
}
