package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2lA  reason: invalid class name and case insensitive filesystem */
public final class C228272lA implements Runnable {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public C228272lA(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        AnonymousClass2l3 r4 = this.A00;
        18q r0 = AnonymousClass2l3.A0V;
        if (!r4.A05) {
            if (r4.A0O == AnonymousClass05K.A1F || r4.A0O == AnonymousClass05K.A1I) {
                str = "replaced";
            } else {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            }
            AnonymousClass1H6 r2 = r4.A0H.A01.A01;
            r2.A01.A03("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_FAILED", str);
            r2.A00().A00(1Gx.A03);
        }
        if (182.A06(0Tu.A05, r4.A0F, 2342160629899531639L) && r4.A0O == AnonymousClass05K.A02) {
            r4.A01 = false;
            AnonymousClass2l3.A01(r4);
        }
    }
}
