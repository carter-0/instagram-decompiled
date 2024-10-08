package X;

import android.os.Bundle;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fal  reason: case insensitive filesystem */
public final class C50386Fal implements C51901G6v {
    public final Bundle A00;
    public final FanClubInfoDict A01;
    public final UserSession A02;

    public C50386Fal(Bundle bundle, UserSession userSession) {
        0qQ.A0B(bundle, 2);
        this.A02 = userSession;
        this.A00 = bundle;
        this.A01 = DbX.A0m(userSession).B3v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CfS(androidx.fragment.app.FragmentActivity r4) {
        /*
            r3 = this;
            r2 = 0
            X.0qQ.A0B(r4, r2)
            android.os.Bundle r1 = r3.A00
            java.lang.String r0 = "InterestBasedChannelType"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0020
            X.EV0 r0 = X.C48845El7.A00(r1)
            if (r0 == 0) goto L_0x0020
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0037
            r0 = 1
            r2 = 2131974604(0x7f1359cc, float:1.9586277E38)
            if (r1 == r0) goto L_0x0023
        L_0x0020:
            r2 = 2131974093(0x7f1357cd, float:1.958524E38)
        L_0x0023:
            X.8ab r1 = X.DbS.A0X(r4)
            r1.A06()
            r0 = 2131974615(0x7f1359d7, float:1.95863E38)
            r1.A09(r0)
            r1.A08(r2)
            X.DbT.A1V(r1)
            return
        L_0x0037:
            r2 = 2131974614(0x7f1359d6, float:1.9586297E38)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50386Fal.CfS(androidx.fragment.app.FragmentActivity):void");
    }

    public final boolean CWt() {
        EV0 A002;
        boolean z;
        boolean z2;
        int i;
        Integer C2R;
        Bundle bundle = this.A00;
        if (!bundle.containsKey("InterestBasedChannelType") || (A002 = C48845El7.A00(bundle)) == null) {
            return false;
        }
        int ordinal = A002.ordinal();
        if (ordinal == 0) {
            UserSession userSession = this.A02;
            z = C375489Dt.A01(userSession);
            z2 = C375479Ds.A01(userSession);
            FanClubInfoDict fanClubInfoDict = this.A01;
            if (fanClubInfoDict != null) {
                i = AnonymousClass7TF.A1Y(fanClubInfoDict.BB1(), true);
            }
            i = 0;
        } else if (ordinal != 1) {
            return false;
        } else {
            UserSession userSession2 = this.A02;
            z = AnonymousClass7K4.A00(userSession2);
            z2 = C375479Ds.A01(userSession2);
            FanClubInfoDict fanClubInfoDict2 = this.A01;
            if (!(fanClubInfoDict2 == null || (C2R = fanClubInfoDict2.C2R()) == null)) {
                i = C2R.intValue();
            }
            i = 0;
        }
        if (!z2 || z || i != 0) {
            return false;
        }
        return true;
    }
}
