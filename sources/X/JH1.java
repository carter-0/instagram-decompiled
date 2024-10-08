package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

public final class JH1 extends 0Yg implements 0sK {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299575vQ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH1(LineType lineType, C299665vd r3, C299575vQ r4, UserSession userSession, String str, boolean z) {
        super(3);
        this.A02 = r4;
        this.A00 = lineType;
        this.A05 = z;
        this.A01 = r3;
        this.A04 = str;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r7 = (C286575Wy) obj2;
        if (C51968G9o.A0D(obj3) != 16 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(888976113, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:774)");
            }
            C299575vQ r6 = this.A02;
            AnonymousClass9JB r1 = (AnonymousClass9JB) r6;
            boolean z = ((AnonymousClass9IC) r1.A01).A01;
            String str = r1.A04;
            LineType lineType = this.A00;
            boolean z2 = this.A05;
            r7.ExS(-1660293655);
            C299665vd r5 = this.A01;
            boolean AGu = r7.AGu(r5);
            String str2 = this.A04;
            boolean A1Z = C51965G9l.A1Z(r7, str2, AGu);
            Object ECw = r7.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C73670Phj(str2, r5, 45);
                r7.FLL(ECw);
            }
            C62320sa r11 = (C62320sa) ECw;
            C286565Wx r4 = (C286565Wx) r7;
            C286565Wx.A0L(r4, false);
            r7.ExS(-1660308574);
            UserSession userSession = this.A03;
            boolean A1X = C51972G9s.A1X(r7, r6, r5, r7.AGw(userSession));
            Object ECw2 = r7.ECw();
            if (A1X || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58696Iw5.A00(r7, r5, r6, userSession, 40);
            }
            HV0.A00(r7, (Modifier) null, lineType, str, r11, C51965G9l.A0y(r4, ECw2, false), 0, 160, z2, false, z);
            if (0fL.A02()) {
                0fL.A00(652999953);
            }
        } else {
            r7.Evl();
        }
        return C60340gF.A00;
    }
}
