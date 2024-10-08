package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HWt  reason: case insensitive filesystem */
public abstract class C54886HWt {
    public static final void A00(C286575Wy r16, C335847dd r17, ImageUrl imageUrl, 0sP r19, int i) {
        C335847dd r3 = r17;
        ImageUrl imageUrl2 = imageUrl;
        0sP r1 = r19;
        boolean A1b = C51973G9u.A1b(imageUrl2, r3, r1);
        C286575Wy r15 = r16;
        if (C51967G9n.A1T(r15, -257582844)) {
            0fL.A01(-1995834530, "com.instagram.comments.mvvm.view.compose.RoundedVisualThumbnail (RoundedVisualThumbnail.kt:26)");
        }
        int i2 = i;
        AnonymousClass2DN A0o = C51966G9m.A0o(r15, imageUrl2, i2);
        Modifier A0P = C51968G9o.A0P(C287205Zk.A0D(C287205Zk.A08(C287195Zj.A0B(Modifier.A00, 0.0f, 2.0f, 0.0f, 0.0f), 126.0f), 81.0f), 8.0f);
        C51965G9l.A1X(r15, false);
        AnonymousClass6G3.A0A(r15, C288255bc.A00((C287605aT) C51974G9v.A0V(r15, -1731981746), A0P, (C287625aV) null, (String) null, new C58188Ins(17, r1, r3), (C62320sa) null, new C58188Ins(18, r1, r3), A1b), A0o, C288075bK.A00, "", 24632);
        if (0fL.A02()) {
            0fL.A00(174112813);
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(imageUrl2, r1, r3, i2, 16);
        }
    }
}
