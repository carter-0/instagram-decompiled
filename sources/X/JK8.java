package X;

import androidx.compose.ui.Modifier;

public final class JK8 extends 0Yg implements 0sH {
    public static final JK8 A00 = new JK8();

    public JK8() {
        super(6);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        String str = (String) obj;
        C62320sa r7 = (C62320sa) obj2;
        C286575Wy r3 = (C286575Wy) obj5;
        int A0M = AnonymousClass7TE.A0M(obj6);
        AnonymousClass7TG.A1N(str, r7);
        if ((A0M & 6) == 0) {
            i = A0M | G9t.A0O(r3, str);
        } else {
            i = A0M;
        }
        if ((A0M & 48) == 0) {
            i |= G9t.A0F(r3, r7);
        }
        if ((i & 8211) != 8210 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-816886716, "com.instagram.compose.igds.components.headline.ComposableSingletons$IgdsHeadlineKt.lambda-2.<anonymous> (IgdsHeadline.kt:371)");
            }
            AnonymousClass6CE.A06(r3, C51967G9n.A0C(Modifier.A00, 12.0f), AnonymousClass6CA.A00(r3), str, r7, ((i >> 3) & 14) | 384 | ((i << 3) & 112));
            if (0fL.A02()) {
                0fL.A00(-2072078834);
            }
        } else {
            r3.Evl();
        }
        return C60340gF.A00;
    }
}
