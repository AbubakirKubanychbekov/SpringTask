package GroupA;

public class Instagram implements SocialMedia{

    @Override
    public void getSocialMedia() {
        System.out.println("Instagram...");
    }

    @Override
    public String toString() {
        return "Instagram{}";
    }
}
