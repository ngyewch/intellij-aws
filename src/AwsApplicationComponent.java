import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class AwsApplicationComponent implements ApplicationComponent {

    public AwsApplicationComponent() {
        super();
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "AwsApplicationComponent";
    }
}
