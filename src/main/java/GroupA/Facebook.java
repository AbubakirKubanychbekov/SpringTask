package GroupA;

public class Facebook implements SocialMedia{
    @Override
    public void getSocialMedia() {
        System.out.println("Facebook...");
    }

    @Override
    public String toString() {
        return "Facebook{}";
    }
}
