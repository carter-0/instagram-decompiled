package X;

import android.text.Editable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7Hn  reason: invalid class name and case insensitive filesystem */
public final class C329087Hn {
    public final /* synthetic */ C329067Hl A00;

    public C329087Hn(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void A00(C69347Njm njm, String str) {
        C329067Hl r7 = this.A00;
        C329067Hl.A0j(r7, true);
        AnonymousClass7HC r0 = r7.A1e;
        C254783t2 r8 = r7.A1z;
        0qQ.A0B(r8, 0);
        0qQ.A0B(njm, 1);
        0wc r3 = r0.A00;
        0Aj A002 = r3.A00(r3.A00, "direct_quoted_reply_canceled");
        if (A002.isSampled()) {
            boolean A07 = AnonymousClass6W3.A07(r8);
            String A02 = AnonymousClass4KK.A02(r8);
            Long A01 = AnonymousClass4KK.A01(r8);
            A002.AAJ("action", njm.A00);
            A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A002.A7p("is_e2ee", Boolean.valueOf(A07));
            A002.AAJ("open_thread_id", A02);
            A002.A9F("occamadillo_thread_id", A01);
            A002.Cgf();
        }
        Editable text = r7.A0b.A0S.getText();
        for (OCB ocb : (OCB[]) text.getSpans(0, text.length(), OCB.class)) {
            if (ocb.A00.A00) {
                text.replace(text.getSpanStart(ocb), text.getSpanEnd(ocb), "");
            }
        }
    }
}
