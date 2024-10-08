package X;

/* renamed from: X.NKu  reason: case insensitive filesystem */
public final class C68501NKu extends C361158fl {
    public final /* synthetic */ OTP A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void A04(C268654dm r4) {
        0qQ.A0B(r4, 0);
        0KC.A0F("InstagramConsentBloksActionLauncher", "Failure in prefetching consent payloads.", r4.A01());
    }

    public C68501NKu(OTP otp, String str, String str2) {
        this.A00 = otp;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 di0 = (C46620Di0) obj;
        0qQ.A0B(di0, 0);
        this.A00.A02.put(this.A01, new C61081JwJ(di0, this.A02));
    }
}
