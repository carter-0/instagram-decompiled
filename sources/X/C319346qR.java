package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6qR  reason: invalid class name and case insensitive filesystem */
public final class C319346qR extends 1P0 {
    public final /* synthetic */ C323336xK A00;

    public C319346qR(C323336xK r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(144572550);
        C319366qT r6 = (C319366qT) obj;
        int A032 = AnonymousClass0fD.A03(1908644695);
        0qQ.A0B(r6, 0);
        C323336xK r2 = this.A00;
        YBM ybm = r6.A00;
        if (ybm == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A00 = ((XED) ybm).A00;
        if (r2.A03.isResumed()) {
            2dZ.A0t.A03(r2.A02).A0T();
            DcA dcA = r2.A01;
            if (dcA != null) {
                dcA.A02();
            }
        }
        AnonymousClass0fD.A0A(1628167846, A032);
        AnonymousClass0fD.A0A(2025265249, A03);
    }
}
