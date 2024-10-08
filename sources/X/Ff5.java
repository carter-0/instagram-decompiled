package X;

import com.instagram.android.R;
import java.util.List;
import java.util.Map;

public final class Ff5 implements C51943G8m {
    public final Integer A00;
    public final List A01;
    public final Map A02;

    public Ff5(Integer num) {
        this.A00 = num;
        2aD r8 = 2aD.A0I;
        0eP A0x = AnonymousClass7TF.A0x(r8, R.plurals.chat_badge);
        2aD r7 = 2aD.A0G;
        0eP A0x2 = AnonymousClass7TF.A0x(r7, R.plurals.comment_badge);
        2aD r5 = 2aD.A0f;
        0eP A0x3 = AnonymousClass7TF.A0x(r5, R.plurals.follow_badge);
        2aD r3 = 2aD.A0T;
        0eP A0x4 = AnonymousClass7TF.A0x(r3, R.plurals.like_badge);
        2aD r1 = 2aD.A0X;
        this.A02 = 0Yt.A06(new 0eP[]{A0x, A0x2, A0x3, A0x4, AnonymousClass7TF.A0x(r1, R.plurals.new_post_badge)});
        this.A01 = 0sr.A1P(new 2aD[]{r8, r7, r5, r3, r1});
    }
}
