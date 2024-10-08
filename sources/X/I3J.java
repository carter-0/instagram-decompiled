package X;

public abstract class I3J {
    public static Integer A00(String str) {
        if (str.equals("FB_COMMENTS_CREATION")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("FB_POST_CREATION")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("FB_POST_CREATION_CAPTIONS")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("FB_STORIES_CREATION")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("IG_STORIES_CREATION")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("IG_STORIES_IMAGE_CAPTION")) {
            return AnonymousClass05K.A0j;
        }
        if (str.equals("BLOKS")) {
            return AnonymousClass05K.A0u;
        }
        if (str.equals("FB_VIDEO_CREATION")) {
            return AnonymousClass05K.A15;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "fb_post_creation";
            case 2:
                return "fb_post_creation_captions";
            case 3:
                return "fb_stories_creation";
            case 4:
                return AnonymousClass000.A00(4865);
            case 5:
                return "ig_stories_image_caption";
            case 6:
                return "Bloks";
            case 7:
                return "fb_video_creation";
            default:
                return "fb_comments_creation";
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FB_POST_CREATION";
            case 2:
                return "FB_POST_CREATION_CAPTIONS";
            case 3:
                return "FB_STORIES_CREATION";
            case 4:
                return "IG_STORIES_CREATION";
            case 5:
                return "IG_STORIES_IMAGE_CAPTION";
            case 6:
                return "BLOKS";
            case 7:
                return "FB_VIDEO_CREATION";
            default:
                return "FB_COMMENTS_CREATION";
        }
    }
}
