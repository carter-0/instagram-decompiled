package X;

import android.content.Context;
import androidx.compose.ui.Modifier;

public final class J8I extends 0Yg implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ AnonymousClass62P A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8I(Context context, String str, 0sP r4, AnonymousClass62P r5, boolean z, boolean z2) {
        super(2);
        this.A04 = z;
        this.A05 = z2;
        this.A00 = context;
        this.A03 = r5;
        this.A01 = str;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r10 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-485358527, "com.instagram.schools.management.badge.EditBadgeComposeView.<anonymous> (EditBadgeComposeView.kt:33)");
            }
            if (this.A04) {
                r10.ExS(1181819437);
                HXV.A00(r10, (String) null, 0, 1);
            } else if (this.A05) {
                r10.ExS(-2018253360);
                C60340gF r3 = C60340gF.A00;
                r10.ExS(1181821995);
                Context context = this.A00;
                boolean AGw = r10.AGw(context);
                Object ECw = r10.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new C66160MFx(context, (AnonymousClass4D7) null, 12);
                    r10.FLL(ECw);
                }
                C51972G9s.A0z(r10, ECw, r3);
            } else {
                r10.ExS(-2018055642);
                AnonymousClass62P r7 = this.A03;
                String str = this.A01;
                0sP r5 = this.A02;
                C285245Qk r2 = Modifier.A00;
                AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
                int A002 = C287425a7.A00(r10);
                C286565Wx r32 = (C286565Wx) r10;
                AnonymousClass5RM A042 = C286565Wx.A04(r32);
                Modifier A012 = C287435a8.A01(r10, r2);
                C51973G9u.A0y(r10, r32);
                C51971G9r.A12(r10, A0Z, A042);
                0sL r1 = C287485aD.A02;
                if (r32.A0K || !C51972G9s.A1Q(r10, A002)) {
                    C51971G9r.A13(r10, r1, A002);
                }
                C51965G9l.A18(r10, A012);
                C55130Hce.A00(C304346Dc.A00(r10, 2131972718), r10, 0);
                r10.ExS(-1199587580);
                if (r7 != null) {
                    C56345Hww.A00(r10, str, r5, r7, 0);
                }
                C286565Wx.A0L(r32, false);
                r10.ASN();
            }
            if (C51970G9q.A1a(r10, false)) {
                0fL.A00(896458435);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}
