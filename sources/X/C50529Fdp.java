package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fdp  reason: case insensitive filesystem */
public final /* synthetic */ class C50529Fdp implements C13675Tek {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CredentialRequest A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ C49914FEn A03;
    public final /* synthetic */ C13675Tek A04;
    public final /* synthetic */ C13675Tek A05;
    public final /* synthetic */ C46634DiE A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C50529Fdp(Activity activity, CredentialRequest credentialRequest, 0lg r3, C49914FEn fEn, C13675Tek tek, C13675Tek tek2, C46634DiE diE, boolean z) {
        this.A03 = fEn;
        this.A01 = credentialRequest;
        this.A00 = activity;
        this.A06 = diE;
        this.A04 = tek;
        this.A05 = tek2;
        this.A02 = r3;
        this.A07 = z;
    }

    public final void D5D(Object obj) {
        C49914FEn fEn = this.A03;
        CredentialRequest credentialRequest = this.A01;
        Activity activity = this.A00;
        C46634DiE diE = this.A06;
        C13675Tek tek = this.A04;
        C13675Tek tek2 = this.A05;
        0lg r6 = this.A02;
        boolean z = this.A07;
        AnonymousClass63S r13 = (AnonymousClass63S) obj;
        if (r13 != null) {
            r13.A07(new C8412Qts(C10136RnD.A04, r13));
            AnonymousClass3Qk.A03(credentialRequest, AnonymousClass000.A00(1765));
            C8408Qto qto = new C8408Qto(credentialRequest, r13);
            r13.A06(qto);
            qto.A07(new C50191FSx(activity, r6, fEn, tek, tek2, diE, z), TimeUnit.MILLISECONDS, C49914FEn.A05);
        }
    }
}
