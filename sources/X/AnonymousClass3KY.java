package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3KY  reason: invalid class name */
public abstract class AnonymousClass3KY {
    public static final AnonymousClass3KZ A00 = new Object();
    public static final List A01;
    public static final List A02;
    public static final Map A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3KZ, java.lang.Object] */
    static {
        C233162v9 r3 = C233162v9.CAPTION_CLICK;
        C233162v9 r4 = C233162v9.COMMENT_BUTTON_CLICK;
        C233162v9 r5 = C233162v9.GESTURE;
        C233162v9 r6 = C233162v9.HASHTAG_CLICK;
        C233162v9 r7 = C233162v9.SAVE_CLICK;
        C233162v9 r8 = C233162v9.SEE_TRANSLATION;
        C233162v9 r9 = C233162v9.SHARE_BUTTON_CLICK;
        C233162v9 r10 = C233162v9.TAG_CLICK;
        C233162v9 r11 = C233162v9.PROFILE_USERNAME_CAPTION_TAP;
        C233162v9 r12 = C233162v9.PRODUCT_TAG_CLICK;
        C233162v9 r13 = C233162v9.USER_TAG_CLICK;
        C233162v9 r14 = C233162v9.VIEW_ALL_COMMENTS_TAP;
        C233162v9 r15 = C233162v9.VIDEO_TAP;
        A02 = 0sr.A1P(new C233162v9[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15});
        A01 = 0sr.A1P(new C233162v9[]{r6, r8, r9, r11, r12, r13, r14, r15});
        C233162v9 r32 = C233162v9.CTA_CLICK;
        C230432pc r1 = C230432pc.CLIPS;
        List singletonList = Collections.singletonList(r1);
        0qQ.A07(singletonList);
        0eP r2 = new 0eP(r32, singletonList);
        List singletonList2 = Collections.singletonList(r1);
        0qQ.A07(singletonList2);
        A03 = 0Yt.A06(new 0eP[]{r2, new 0eP(r4, singletonList2)});
    }
}
