package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.3b5  reason: invalid class name and case insensitive filesystem */
public final class C244373b5 extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ C242813Wa A03;
    public final /* synthetic */ C244363b4 A04;
    public final /* synthetic */ AnonymousClass3W1 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C244373b5(1Xj r2, AnonymousClass4DU r3, C242813Wa r4, C244363b4 r5, AnonymousClass3W1 r6, String str, int i, boolean z, boolean z2) {
        super(3);
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A08 = z;
        this.A06 = str;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = i;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        AnonymousClass3N3 r15 = (AnonymousClass3N3) obj2;
        ImageUrl imageUrl = (ImageUrl) obj3;
        0qQ.A0B(context, 0);
        UserSession userSession = this.A04.A00;
        1Xj r10 = this.A01;
        AnonymousClass3W1 r12 = this.A05;
        boolean z = this.A08;
        String str = this.A06;
        AnonymousClass4DU r0 = this.A02;
        C242813Wa r11 = this.A03;
        int i = this.A00;
        boolean z2 = this.A07;
        Reel A002 = AnonymousClass3X0.A00.A00(userSession, r10, r12);
        if (C244393b7.A00(userSession, r10, str) && r15 != null) {
            User A2A = r10.A2A(userSession);
            if (A2A != null) {
                ReelStore A052 = 1OP.A05(userSession);
                String BNG = A2A.A03.BNG();
                if (BNG != null) {
                    Reel A0K = A052.A0K(new 1Nr(A2A), BNG, false);
                    r15.Bkt().A05();
                    r11.D2w(r10, r12, A0K, r15);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else if (A002 != null && !z && r15 != null) {
            Integer num = AnonymousClass05K.A00;
            if (!C70349O3b.A00(userSession, num)) {
                r11.D2z(r10, r12, A002, r15);
            } else {
                1Av A003 = 1Au.A00(userSession);
                int i2 = A003.A01.getInt(AnonymousClass000.A00(200), 0);
                Context context2 = context;
                C49256Erz.A00(context2, new WAC(r10, r11, r12, A002, A003, r15, i2), AnonymousClass1Qz.A00(userSession).C82(), r0, imageUrl, false, num);
            }
            C63007Kpx.A00(userSession).A00(userSession, r10);
        } else if (!r10.A4t() || !0qQ.A0K(r10.A0C.BYH(), true) || !182.A06(0Tu.A05, userSession, 36320279273087168L)) {
            r11.D2u(r10, r12, (Boolean) null, i, z2);
        } else {
            r11.Cx1(r10);
        }
        return C60340gF.A00;
    }
}
