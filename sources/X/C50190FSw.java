package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: X.FSw  reason: case insensitive filesystem */
public final /* synthetic */ class C50190FSw implements C13634Te0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C49914FEn A01;
    public final /* synthetic */ G78 A02;
    public final /* synthetic */ C46634DiE A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C50190FSw(Activity activity, C49914FEn fEn, G78 g78, C46634DiE diE, boolean z) {
        this.A01 = fEn;
        this.A00 = activity;
        this.A03 = diE;
        this.A04 = z;
        this.A02 = g78;
    }

    public final void DfS(AnonymousClass63X r12) {
        String str;
        C49914FEn fEn = this.A01;
        Activity activity = this.A00;
        C46634DiE diE = this.A03;
        boolean z = this.A04;
        G78 g78 = this.A02;
        Status status = (Status) r12;
        String str2 = null;
        if (status != null) {
            int i = status.A00;
            if (i <= 0) {
                0xY AR4 = DbV.A0d().AR4();
                AR4.E5T("preference_smartlock_credential_have_been_saved", true);
                AR4.apply();
                activity.runOnUiThread(new C51221Fqc(g78));
                if (z) {
                    0lg r5 = fEn.A03;
                    0qQ.A0B(r5, 0);
                    C319616qu.A01(r5, "login_smartlock_save_success", "login_smart_lock", "smartlock", (String) null);
                } else {
                    0lg r1 = fEn.A03;
                    if (diE != null) {
                        str2 = diE.A01;
                    }
                    0qQ.A0B(r1, 0);
                    C49956FGl.A05(r1, str2, (String) null, true, false);
                }
                if (1WP.getInstance() != null) {
                    1WP.getInstance().A00 = true;
                }
            } else if (status.A01 != null) {
                activity.runOnUiThread(new C51543Fvp(activity, status, fEn, g78, diE, z));
            } else {
                if (!z) {
                    0lg r13 = fEn.A03;
                    if (diE != null) {
                        str2 = diE.A01;
                    }
                    String num = Integer.toString(i);
                    0qQ.A0B(r13, 0);
                    C49956FGl.A05(r13, str2, num, false, false);
                }
                g78.D5C(false, status.A03);
            }
        } else {
            if (!z) {
                0lg r14 = fEn.A03;
                if (diE == null) {
                    str = null;
                } else {
                    str = diE.A01;
                }
                0qQ.A0B(r14, 0);
                C49956FGl.A05(r14, str, (String) null, false, false);
            }
            g78.D5C(false, (String) null);
        }
    }
}
