package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Fvp  reason: case insensitive filesystem */
public final /* synthetic */ class C51543Fvp implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Status A01;
    public final /* synthetic */ C49914FEn A02;
    public final /* synthetic */ G78 A03;
    public final /* synthetic */ C46634DiE A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C51543Fvp(Activity activity, Status status, C49914FEn fEn, G78 g78, C46634DiE diE, boolean z) {
        this.A02 = fEn;
        this.A03 = g78;
        this.A04 = diE;
        this.A05 = z;
        this.A00 = activity;
        this.A01 = status;
    }

    public final void run() {
        C49914FEn fEn = this.A02;
        this.A03.Dez(new C50537Fdx(this.A00, this.A01, fEn, this.A04, this.A05));
    }
}
