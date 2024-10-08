package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Lql  reason: case insensitive filesystem */
public final class C65292Lql implements MXS {
    public final Context A00;
    public final UserSession A01;
    public final MSM A02;
    public final DirectShareTarget A03;
    public final String A04;
    public final String A05;
    public final C62320sa A06;
    public final boolean A07;
    public final boolean A08;

    public final int BtD() {
        return 3;
    }

    public final boolean CKn(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        return 0qQ.A0K(this.A03, directShareTarget);
    }

    public final List AxF() {
        return AnonymousClass7TE.A1I(this.A03);
    }

    public final void EM2() {
        if (this.A08) {
            DirectShareTarget directShareTarget = this.A03;
            if (directShareTarget.A01() instanceof AnonymousClass9HR) {
                OWT A002 = C70174NyS.A00(DbT.A05(this.A00), this.A01);
                String str = this.A04;
                C254783t2 A012 = directShareTarget.A01();
                C71148Oe6.A06(A002.A02, A002.A00(str), A012, str);
                this.A02.DuY();
            }
        }
        String str2 = this.A04;
        UserSession userSession = this.A01;
        DirectShareTarget directShareTarget2 = this.A03;
        AnonymousClass7Z7 A0O = JTS.A0O(userSession, directShareTarget2);
        boolean z = this.A07;
        A0O.EMx((C69343Nji) null, directShareTarget2, (Boolean) null, str2, "share_extension", (String) null, z);
        String str3 = this.A05;
        if (!(str3 == null || str3.length() == 0)) {
            JTS.A0O(userSession, directShareTarget2).EMx((C69343Nji) null, directShareTarget2, (Boolean) null, str3, "share_extension", (String) null, z);
        }
        this.A02.DuY();
    }

    public C65292Lql(Context context, UserSession userSession, MSM msm, DirectShareTarget directShareTarget, String str, String str2, boolean z, boolean z2) {
        AnonymousClass7TG.A1Q(userSession, str);
        C73667Phg phg = new C73667Phg(27, directShareTarget, userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = directShareTarget;
        this.A02 = msm;
        this.A07 = z;
        this.A06 = phg;
        this.A08 = z2;
    }
}
