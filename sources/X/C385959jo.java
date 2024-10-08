package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9jo  reason: invalid class name and case insensitive filesystem */
public final class C385959jo extends 2Cl {
    public final int A00;
    public final Object A01;

    public C385959jo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass87F r0;
        switch (this.A00) {
            case 1:
                r0 = ((C40018AOa) this.A01).A09;
                break;
            case 2:
                r0 = ((WBM) this.A01).A0H;
                break;
            case 3:
                AnonymousClass8Z5 r1 = ((WDA) this.A01).A09.A03;
                AnonymousClass8Z5.A00(r1, r1.A01);
                return null;
            case 5:
                C69242Nhw nhw = (C69242Nhw) this.A01;
                if (!nhw.isMarkerOn()) {
                    return null;
                }
                nhw.annotateEndPointReason(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                nhw.onEndFlowFail(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                return null;
            default:
                return ((AnonymousClass9DH) this.A01).A00();
        }
        AnonymousClass8Z5 r12 = r0.A03;
        AnonymousClass8Z5.A00(r12, r12.A01);
        return AnonymousClass7TE.A0v();
    }

    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 670942303;
            case 1:
                return 1988238439;
            case 2:
                return 227;
            case 3:
                return 257;
            case 4:
                return 91;
            default:
                return 1887904277;
        }
    }
}
