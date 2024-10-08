package X;

/* renamed from: X.HWk  reason: case insensitive filesystem */
public abstract class C54877HWk {
    public static final void A00(String str, C286575Wy r11, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str, 0);
        C286575Wy r3 = r11;
        r11.ExV(212626117);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1481622023, "com.instagram.comments.mvvm.view.compose.CommentLoadText (CommentLoadText.kt:10)");
            }
            AnonymousClass5ZZ.A0j(r3, C51966G9m.A0f(r3), str2, 1, 1, i2 & 14, 11258, C51966G9m.A0M(r11));
            if (0fL.A02()) {
                0fL.A00(1161033119);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i, 1);
        }
    }
}
