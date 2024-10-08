package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.J9h  reason: case insensitive filesystem */
public final class C59177J9h extends 0Yg implements 0sL {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass5S2 A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59177J9h(Bitmap bitmap, AnonymousClass5S2 r3, ImageUrl imageUrl, String str, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9) {
        super(2);
        this.A05 = r6;
        this.A02 = imageUrl;
        this.A04 = r7;
        this.A07 = r8;
        this.A00 = bitmap;
        this.A01 = r3;
        this.A06 = r9;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r0 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-741362301, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoContributionPostCaptureScreen.<anonymous> (PotatoContributionPostCaptureScreen.kt:57)");
            }
            C62320sa r13 = this.A05;
            ImageUrl imageUrl = this.A02;
            C62320sa r24 = this.A04;
            C62320sa r23 = this.A07;
            Bitmap bitmap = this.A00;
            AnonymousClass5S2 r21 = this.A01;
            C62320sa r20 = this.A06;
            String str = this.A03;
            C285245Qk r1 = Modifier.A00;
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r0);
            C286565Wx r9 = (C286565Wx) r0;
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r0, r1);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r0, r9, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A002, A042, r6);
            0sL r5 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r5, A003);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            C289515dj r4 = C289515dj.A00;
            Modifier AAz = r4.AAz(alignment, C287195Zj.A07(r1, 16.0f));
            C286565Wx.A0L(r9, false);
            C288165bT.A00(r0, G9w.A0B((C287605aT) C51974G9v.A0V(r0, 1533161027), AAz, r13), C287975bA.A00(r0, R.drawable.instagram_chevron_left_pano_outline_24, 0), 0, 18, C51966G9m.A0E(r0));
            C56267Hvb.A01(r4, r0, imageUrl, r24, r23, 6);
            Modifier A0L = C51965G9l.A0L(r4, JJP.A00(C287195Zj.A0B(r1, 34.0f, 0.0f, 34.0f, 0.0f).Ezh(C287205Zk.A01), C287655aY.A00, 0));
            AnonymousClass5RD A0M = G9w.A0M(r0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r9);
            Modifier A013 = C287435a8.A01(r0, A0L);
            C51973G9u.A0z(r0, r9, r7);
            C287595aO.A00(r0, A0M, r6);
            if (C51965G9l.A1Y(r0, r9, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r5, A004);
            }
            C287595aO.A00(r0, A013, A1K);
            C54906HXo.A00(bitmap, r0, r21, r20, 0.0f, 0, 4);
            G9w.A15(r0, r1, 40.0f);
            Modifier A072 = C287195Zj.A07(r1, 16.0f);
            String A14 = C51968G9o.A14(r0, str, 2131969702);
            long A014 = AnonymousClass5Z7.A01(14);
            C286575Wy r3 = r0;
            AnonymousClass5ZZ.A0J(r3, A072, C51966G9m.A0b(r0), A14, 3120, 16240, G9w.A05(r0), A014);
            G9w.A15(r0, r1, 16.0f);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-1786506576);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
