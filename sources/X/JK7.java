package X;

import androidx.compose.ui.Modifier;

public final class JK7 extends 0Yg implements 0sH {
    public static final JK7 A00 = new JK7();

    public JK7() {
        super(6);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        String str = (String) obj;
        C62320sa r9 = (C62320sa) obj2;
        String str2 = (String) obj3;
        C62320sa r10 = (C62320sa) obj4;
        C286575Wy r4 = (C286575Wy) obj5;
        int A0M = AnonymousClass7TE.A0M(obj6);
        boolean A1U = AnonymousClass7TF.A1U(0, str, r9);
        if ((A0M & 6) == 0) {
            i = G9t.A0O(r4, str) | A0M;
        } else {
            i = A0M;
        }
        if ((A0M & 48) == 0) {
            i |= G9t.A0F(r4, r9);
        }
        if ((A0M & 384) == 0) {
            i |= G9t.A0Q(r4, str2);
        }
        if ((A0M & 3072) == 0) {
            i |= G9t.A0H(r4, r10);
        }
        if ((i & 9363) != 9362 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(609763966, "com.instagram.compose.igds.components.headline.ComposableSingletons$IgdsHeadlineKt.lambda-1.<anonymous> (IgdsHeadline.kt:350)");
            }
            int i2 = i << 9;
            I7L.A03(r4, C287195Zj.A0A(Modifier.A00, 0.0f, 16.0f, 0.0f), (CharSequence) null, str, str2, r9, r10, (0sP) null, (i & 14) | 384 | (i & 112) | (458752 & i2) | (i2 & 3670016), 27648, 8088, false, false, false, false, false, false, false, A1U);
            if (0fL.A02()) {
                0fL.A00(1847175523);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
