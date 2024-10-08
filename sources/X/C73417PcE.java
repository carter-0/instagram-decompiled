package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PcE  reason: case insensitive filesystem */
public final /* synthetic */ class C73417PcE implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass2Ep A03;
    public final /* synthetic */ C74489Pvj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C73417PcE(Activity activity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass2Ep r4, C74489Pvj pvj, String str, String str2, List list, boolean z, boolean z2) {
        this.A07 = list;
        this.A02 = userSession;
        this.A00 = activity;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = r4;
        this.A08 = z;
        this.A04 = pvj;
        this.A01 = r2;
        this.A09 = z2;
    }

    public final void run() {
        C14068TpH tpH;
        String str;
        C14068TpH tpH2;
        C16677UzD uzD;
        List list = this.A07;
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        String str2 = this.A05;
        String str3 = this.A06;
        AnonymousClass2Ep r5 = this.A03;
        boolean z = this.A08;
        C74489Pvj pvj = this.A04;
        AnonymousClass0iw r7 = this.A01;
        boolean z2 = this.A09;
        if (list.isEmpty()) {
            boolean CVr = r5.CVr();
            if (z2) {
                str = 002.A0g(str3, "_", str2);
            } else {
                str = str3;
            }
            if (C71128OdR.A06(userSession, str3)) {
                tpH2 = C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_INSTAMADILLO;
            } else {
                tpH2 = C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_VANISH;
            }
            if (z) {
                uzD = C16677UzD.ENCRYPTED_DIRECT_MESSAGE;
            } else {
                uzD = C16677UzD.DIRECT_MESSAGE_THREAD;
            }
            C71128OdR.A04(activity, r7, userSession, tpH2, uzD, pvj, str2, str, str3, CVr, z);
            return;
        }
        String A0g = 002.A0g(str3, "_", str2);
        if (C71128OdR.A06(userSession, str3)) {
            tpH = C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_INSTAMADILLO;
        } else {
            tpH = C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_VANISH;
        }
        C71128OdR.A01(activity, r7, userSession, (C70453O7e) null, tpH, C16677UzD.ENCRYPTED_DIRECT_MESSAGE, pvj, (Long) null, str2, (String) null, A0g, str3, (String) null, (String) null, (String) null, list, false, true, false);
    }
}
