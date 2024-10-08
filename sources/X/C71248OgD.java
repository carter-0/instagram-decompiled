package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.OgD  reason: case insensitive filesystem */
public final class C71248OgD implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C71248OgD(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A06 = obj5;
        this.A05 = obj2;
        this.A01 = obj4;
        this.A04 = obj;
        this.A07 = obj7;
        this.A02 = obj3;
        this.A03 = obj6;
    }

    public static ArrayList A00(C71248OgD ogD) {
        return new ArrayList(((Map) ogD.A05).keySet());
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C67492Mom mom;
        Map map;
        int i2;
        if (this.A00 != 0) {
            C50604FfK ffK = (C50604FfK) this.A06;
            1Q0 r0 = 1Q0.A1Z;
            E3Y e3y = ffK.A01;
            0xI A002 = FGI.A00(e3y, r0);
            A002.A0C("autocomplete_account_type", ffK.A00.AXz());
            DbU.A1R(A002, e3y.A05);
            C49669F1b.A00.A00((AnonymousClass4DH) this.A04, (AnonymousClass0aP) this.A05, (G8H) this.A02, (G8G) this.A01, (C50604FfK) this.A03, (C46634DiE) this.A07);
            return;
        }
        C67521MpG mpG = (C67521MpG) this.A07;
        UserSession userSession = (UserSession) this.A06;
        2EM r7 = (2EM) this.A04;
        FragmentActivity fragmentActivity = mpG.A00;
        0qQ.A0C(fragmentActivity, Pxd.A00(0));
        if (C71118OdC.A03((Activity) fragmentActivity, fragmentActivity, (AnonymousClass0iw) this.A01, userSession, r7, -1, false)) {
            DbS.A1U(this.A03);
        }
        int A0M = AnonymousClass7TE.A0M(((List) this.A02).get(i));
        if (A0M == 3) {
            mpG.A03.AVo((Map) this.A05);
        } else if (A0M != 4) {
            if (A0M == 5) {
                mom = mpG.A03;
                map = (Map) this.A05;
                i2 = 1;
            } else if (A0M == 6) {
                mom = mpG.A03;
                map = (Map) this.A05;
                i2 = 0;
            } else if (A0M == 8) {
                mpG.A03.Coz(A00(this));
            } else if (A0M == 13) {
                mpG.A03.FIk(A00(this));
            } else if (A0M == 15) {
                mpG.A03.FIp(A00(this));
            } else if (A0M == 45) {
                Object obj = this.A05;
                DbS.A1X(fragmentActivity);
                C70886OQd.A01(fragmentActivity, userSession, r7, new PFA(0, mpG, obj));
            } else if (A0M == 10) {
                mpG.A03.Cp7(A00(this));
            } else if (A0M == 11) {
                mpG.A03.FIX((Map) this.A05);
            } else if (A0M == 30) {
                mpG.A03.Cp2(A00(this));
            } else if (A0M == 31) {
                mpG.A03.FIm(A00(this));
            } else {
                throw AnonymousClass7TE.A0z("Unsupported dialog option for dialog listener");
            }
            mom.Cog(new N4G(i2), map);
        } else {
            mpG.A03.Cm5((Map) this.A05);
        }
        DbS.A1U(this.A03);
    }
}
