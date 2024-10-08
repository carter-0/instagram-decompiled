package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.VKg  reason: case insensitive filesystem */
public abstract class C17154VKg {
    public static final long A00;
    public static final String[] A01 = {"fb_friends", "fb_friends_of_friends", "people_with_your_phone_number", "others_on_fb", "fb_messaged_your_page", "fb_liked_or_followed_your_page"};

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A00 = timeUnit.toMillis(2);
        timeUnit.toSeconds(1);
    }
}
