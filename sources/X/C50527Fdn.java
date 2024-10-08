package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fdn  reason: case insensitive filesystem */
public final /* synthetic */ class C50527Fdn implements C13675Tek {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Credential A01;
    public final /* synthetic */ C49914FEn A02;
    public final /* synthetic */ G78 A03;
    public final /* synthetic */ C46634DiE A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C50527Fdn(Activity activity, Credential credential, C49914FEn fEn, G78 g78, C46634DiE diE, boolean z) {
        this.A02 = fEn;
        this.A01 = credential;
        this.A00 = activity;
        this.A04 = diE;
        this.A05 = z;
        this.A03 = g78;
    }

    public final void D5D(Object obj) {
        String str;
        C49914FEn fEn = this.A02;
        Credential credential = this.A01;
        Activity activity = this.A00;
        C46634DiE diE = this.A04;
        boolean z = this.A05;
        G78 g78 = this.A03;
        AnonymousClass63S r11 = (AnonymousClass63S) obj;
        if (r11 != null) {
            AnonymousClass3Qk.A03(credential, "credential must not be null");
            r11.A07(new C8409Qtp(credential, r11)).A07(new C50190FSw(activity, fEn, g78, diE, z), TimeUnit.MILLISECONDS, C49914FEn.A05);
            return;
        }
        if (!z) {
            0lg r1 = fEn.A03;
            if (diE == null) {
                str = null;
            } else {
                str = diE.A01;
            }
            0qQ.A0B(r1, 0);
            C49956FGl.A05(r1, str, (String) null, false, false);
        }
        g78.D5C(false, (String) null);
    }
}
