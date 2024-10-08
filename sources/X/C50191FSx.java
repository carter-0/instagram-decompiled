package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.FSx  reason: case insensitive filesystem */
public final /* synthetic */ class C50191FSx implements C13634Te0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ C49914FEn A02;
    public final /* synthetic */ C13675Tek A03;
    public final /* synthetic */ C13675Tek A04;
    public final /* synthetic */ C46634DiE A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C50191FSx(Activity activity, 0lg r2, C49914FEn fEn, C13675Tek tek, C13675Tek tek2, C46634DiE diE, boolean z) {
        this.A02 = fEn;
        this.A00 = activity;
        this.A05 = diE;
        this.A03 = tek;
        this.A04 = tek2;
        this.A01 = r2;
        this.A06 = z;
    }

    public final void DfS(AnonymousClass63X r21) {
        G85 g85;
        String str;
        C51457FuR fuR;
        C50519Fdf fdf;
        String str2;
        String str3;
        String str4;
        String str5;
        C49914FEn fEn = this.A02;
        Activity activity = this.A00;
        C46634DiE diE = this.A05;
        C13675Tek tek = this.A03;
        C13675Tek tek2 = this.A04;
        0lg r12 = this.A01;
        boolean z = this.A06;
        G9X g9x = (G9X) r21;
        Sx9 sx9 = fEn.A00;
        if (sx9 == null) {
            g85 = fEn.A01;
            if (g85 != null) {
                str = "ApiClientWrapper not bound";
            } else {
                return;
            }
        } else if (g9x == null) {
            g85 = fEn.A01;
            if (g85 != null) {
                str = "credentialRequestResult null";
            } else {
                return;
            }
        } else {
            Status BzI = g9x.BzI();
            if (BzI != null) {
                PendingIntent pendingIntent = BzI.A01;
                if (pendingIntent != null && BzI.A00 == 6) {
                    try {
                        C47910EMe eMe = new C47910EMe(r12, tek2, fEn.A01, diE, z);
                        List list = fEn.A04;
                        synchronized (list) {
                            list.add(eMe);
                        }
                        BzI.A00(activity, eMe.A00);
                        if (z) {
                            0qQ.A0B(r12, 0);
                            C319616qu.A00(r12, AnonymousClass05K.A00, "login_smartlock_impression", "login_smart_lock", "smartlock", (String) null, (String) null, (HashMap) null);
                            return;
                        }
                        if (diE == null) {
                            str5 = null;
                        } else {
                            str5 = diE.A01;
                        }
                        int A022 = DbY.A02(r12);
                        boolean A1S = AnonymousClass7TF.A1S(sx9.A01, 10);
                        0qQ.A0B(r12, 0);
                        C49956FGl.A00(BzI, r12, str5, A022, A1S);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        C49956FGl fGl = C49956FGl.A00;
                        if (diE == null) {
                            str4 = null;
                        } else {
                            str4 = diE.A01;
                        }
                        fGl.A06(BzI, r12, str4, "start_resolution", "send_intent_exception", DbY.A02(r12), AnonymousClass7TF.A1S(sx9.A01, 10));
                        fuR = new C51457FuR(activity, tek2, new C50519Fdf((C51908G7c) null));
                    }
                } else if (BzI.A00 == 0) {
                    if (!z) {
                        if (diE == null) {
                            str3 = null;
                        } else {
                            str3 = diE.A01;
                        }
                        int A023 = DbY.A02(r12);
                        Sx9 sx92 = fEn.A00;
                        sx92.getClass();
                        boolean A1S2 = AnonymousClass7TF.A1S(sx92.A01, 10);
                        0qQ.A0B(r12, 0);
                        long currentTimeMillis = System.currentTimeMillis();
                        long A002 = 1Q0.A00();
                        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r12), "ig_android_smart_lock_auto_sign_in");
                        DbZ.A1E(A0e);
                        DbY.A1E(A0e, currentTimeMillis, A002);
                        DbW.A12(A0e, (double) A002);
                        DbS.A1H(A0e, str3);
                        DbY.A1A(A0e);
                        A0e.A9F("num_one_tap_accounts", DbS.A0j(A023));
                        A0e.A7p("is_auto_login_enable", Boolean.valueOf(A1S2));
                        boolean z2 = true;
                        A0e.A7p("has_status", true);
                        if (pendingIntent == null) {
                            z2 = false;
                        }
                        A0e.A7p("has_resolution", Boolean.valueOf(z2));
                        A0e.A9F(TraceFieldType.StatusCode, 0L);
                        A0e.AAJ(TraceFieldType.StatusMessage, BzI.A03);
                        A0e.A7p("status_is_cancelled", false);
                        A0e.A7p("status_is_success", true);
                        A0e.A7p("status_is_interrupted", false);
                        A0e.Cgf();
                    }
                    Credential credential = ((C50188FSu) g9x).A00;
                    credential.getClass();
                    fdf = new C50519Fdf(new C50518Fde(credential));
                    fuR = new C51457FuR(activity, tek, fdf);
                    activity.runOnUiThread(fuR);
                    return;
                }
            }
            fdf = null;
            if (!z) {
                C49956FGl fGl2 = C49956FGl.A00;
                if (diE == null) {
                    str2 = null;
                } else {
                    str2 = diE.A01;
                }
                fGl2.A06(BzI, r12, str2, "handle_ig_credentials_response", "invalid_status", DbY.A02(r12), AnonymousClass7TF.A1S(sx9.A01, 10));
            }
            fuR = new C51457FuR(activity, tek, fdf);
            activity.runOnUiThread(fuR);
            return;
        }
        g85.CJG(str);
    }
}
