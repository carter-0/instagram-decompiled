package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2l9  reason: invalid class name */
public final class AnonymousClass2l9 implements Runnable {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public AnonymousClass2l9(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2l3 r4 = this.A00;
        if (r4.A0O != AnonymousClass05K.A01 && r4.A0O != AnonymousClass05K.A0j && r4.A0O != AnonymousClass05K.A00) {
            r4.A0O = AnonymousClass05K.A15;
            1Gs r3 = r4.A0H;
            r3.A01.A03("FIRST_MEDIA_LOAD_FAILED", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            r3.A02.A02.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, (Long) null);
            AnonymousClass2l3.A01(r4);
        }
    }
}
