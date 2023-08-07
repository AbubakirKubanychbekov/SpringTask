package GroupA;

import java.util.List;

public class SocialMediaa {
    private List<SocialMedia> socialMedia;

    public SocialMediaa() {
    }

    public SocialMediaa(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "SocialMediaa{" +
                "socialMedia=" + socialMedia +
                '}';
    }
}
