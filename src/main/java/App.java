import lombok.Builder;
import lombok.Value;

public class App 
{
    @Builder
    @Value
    public class Holder {
        @Builder.Default
        String value = "";
    }

    public static void main( String[] args )
    {
        Holder.builder()
                .value("foo")
                .build();
    }
}
