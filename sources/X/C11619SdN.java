package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.SdN  reason: case insensitive filesystem */
public final class C11619SdN implements AnonymousClass5L3 {
    public final AnonymousClass5LV A00;
    public final C284005Km A01;
    public final AnonymousClass5L5 A02;

    public final boolean ASr(Object obj, Object obj2) {
        return C51970G9q.A1U(((C283985Kk) obj).unknownFields.equals(((C283985Kk) obj2).unknownFields) ? 1 : 0);
    }

    public final int Bsa(Object obj) {
        C284015Ko r6 = ((C283985Kk) obj).unknownFields;
        int i = r6.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r6.A00; i2++) {
                i += 2 + C7189Pyc.A00(r6.A03[i2] >>> 3) + 1 + C7189Pyc.A02((AnonymousClass5L9) r6.A04[i2], 3);
            }
            r6.A01 = i;
        }
        return i;
    }

    public final int CL6(Object obj) {
        return ((C283985Kk) obj).unknownFields.hashCode();
    }

    public final boolean CVR(Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void ClW(Object obj) {
        ((C283985Kk) obj).unknownFields.A02 = false;
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void Co6(C284055Ku r3, C284165Lf r4, Object obj) {
        C283985Kk r5 = (C283985Kk) obj;
        if (r5.unknownFields == C284015Ko.A05) {
            r5.unknownFields = new C284015Ko();
        }
        throw AnonymousClass7TE.A11("ensureExtensionsAreMutable");
    }

    public final Object Cr9() {
        return ((PyY) ((C283985Kk) this.A01).A03(AnonymousClass05K.A0Y)).A00();
    }

    public final void FOE(C13831Ti3 ti3, Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C11619SdN(AnonymousClass5LV r1, C284005Km r2, AnonymousClass5L5 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Co5(Object obj, Object obj2) {
        AnonymousClass5L4.A0Q(obj, obj2);
    }
}
