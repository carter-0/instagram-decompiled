package X;

import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FIv  reason: case insensitive filesystem */
public final class C50010FIv implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public C50010FIv(Handler handler, AnonymousClass4DH r2, AnonymousClass0aP r3, G69 g69, RegFlowExtras regFlowExtras, EEK eek, C46634DiE diE, String str, String str2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A04 = r3;
            this.A02 = r2;
            this.A01 = g69;
            this.A03 = handler;
            this.A06 = regFlowExtras;
        } else {
            this.A06 = regFlowExtras;
            this.A04 = r3;
            this.A02 = r2;
            this.A01 = g69;
            this.A03 = handler;
        }
        this.A05 = eek;
        this.A08 = str;
        this.A07 = diE;
        this.A09 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RegFlowExtras regFlowExtras;
        AnonymousClass0aP r3;
        C46634DiE diE;
        1Q0 r0;
        if (this.A00 != 0) {
            r3 = (AnonymousClass0aP) this.A04;
            AnonymousClass4DH r1 = (AnonymousClass4DH) this.A02;
            Handler handler = (Handler) this.A03;
            regFlowExtras = (RegFlowExtras) this.A06;
            String str = this.A08;
            diE = (C46634DiE) this.A07;
            C50144FRb.A02(handler, r1, r1, r3, (G67) null, (G69) this.A01, regFlowExtras, (EEK) this.A05, diE, regFlowExtras.A0Z, str, false);
            r0 = 1Q0.A16;
        } else {
            regFlowExtras = (RegFlowExtras) this.A06;
            regFlowExtras.A0l = true;
            r3 = (AnonymousClass0aP) this.A04;
            AnonymousClass4DH r12 = (AnonymousClass4DH) this.A02;
            Handler handler2 = (Handler) this.A03;
            String str2 = this.A08;
            diE = (C46634DiE) this.A07;
            C50144FRb.A02(handler2, r12, r12, r3, (G67) null, (G69) this.A01, regFlowExtras, (EEK) this.A05, diE, regFlowExtras.A0Z, str2, false);
            r0 = 1Q0.A14;
        }
        C49886FBm A062 = r0.A02(r3).A06(regFlowExtras.A01(), diE);
        A062.A04("existing_user_username", this.A09);
        A062.A02();
    }
}
