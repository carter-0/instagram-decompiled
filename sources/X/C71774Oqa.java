package X;

import android.content.Intent;

/* renamed from: X.Oqa  reason: case insensitive filesystem */
public final class C71774Oqa implements C282425Da {
    public final Intent A00;
    public final C241903Rv A01;
    public final String A02;

    public final boolean CeP() {
        0cS r1 = new 0cS();
        r1.A01 = 0cQ.A02(((AnonymousClass3RX) AnonymousClass3RD.A00).A07);
        r1.A04(this.A02);
        r1.A01();
        return r1.A00().A03(this.A01.A00, this.A00, (0bY) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Oqe, java.lang.Object, X.0bY] */
    public final void FMy() {
        C241863Rp r0;
        0cS r1 = new 0cS();
        r1.A01 = 0cQ.A02(((AnonymousClass3RX) AnonymousClass3RD.A00).A07);
        r1.A04(this.A02);
        r1.A01();
        AnonymousClass0cT A002 = r1.A00();
        ? obj = new Object();
        if (!A002.A03(this.A01.A00, this.A00, obj) && (r0 = obj.A00) != null) {
            throw r0;
        }
    }

    public C71774Oqa(Intent intent, C241903Rv r2, String str) {
        this.A01 = r2;
        this.A00 = intent;
        this.A02 = str == null ? "FBNS_DEFAULT_DOMAIN" : str;
    }

    public final boolean CeN() {
        try {
            FMy();
            return true;
        } catch (C241863Rp e) {
            0KC.A0H("FBNS_DEFAULT_DOMAIN", "Error verifying signature", e);
            return false;
        }
    }
}
