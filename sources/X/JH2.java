package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

public final class JH2 extends 0Yg implements 0sK {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299575vQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH2(LineType lineType, C299665vd r3, C299575vQ r4, String str, String str2, boolean z) {
        super(3);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = lineType;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        HML hml;
        C286575Wy r8 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-909511645, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1165)");
            }
            C299575vQ r1 = this.A02;
            C299495vH r11 = r1.Be5().A01;
            C53477Gp9 gp9 = (C53477Gp9) r1;
            boolean z = gp9.A02;
            boolean z2 = gp9.A00.A0C;
            switch (gp9.A01.intValue()) {
                case 0:
                    hml = HML.PostNotAvailable;
                    break;
                case 1:
                    hml = HML.ReplyNotAvailable;
                    break;
                case 2:
                    hml = HML.PostHidden;
                    break;
                case 3:
                    hml = HML.PostHiddenTifu;
                    break;
                case 4:
                    hml = HML.PostReportedTifu;
                    break;
                case 5:
                    hml = HML.PostHiddenTifu1x1;
                    break;
                case 6:
                    hml = HML.PostReportedTifu1x1;
                    break;
                case 7:
                    hml = HML.ReplyHushed;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            r8.ExS(-1659789055);
            C299665vd r7 = this.A01;
            boolean AGu = r8.AGu(r7);
            String str = this.A03;
            boolean A1Z = C51965G9l.A1Z(r8, (Object) null, C51965G9l.A1Z(r8, str, AGu));
            String str2 = this.A04;
            boolean A1Z2 = C51965G9l.A1Z(r8, str2, A1Z);
            Object ECw = r8.ECw();
            if (A1Z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58753Ix0(r7, str, str2, 3);
                r8.FLL(ECw);
            }
            C51965G9l.A1X(r8, false);
            boolean z3 = this.A05;
            C56630I5j.A00(r8, (Modifier) null, this.A00, r11, hml, (0sP) ECw, 196608, 384, z3, false, z, false, z2);
            if (0fL.A02()) {
                0fL.A00(540642339);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}
