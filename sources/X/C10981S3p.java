package X;

import java.lang.ref.WeakReference;

/* renamed from: X.S3p  reason: case insensitive filesystem */
public final class C10981S3p {
    public final /* synthetic */ QL1 A00;

    public C10981S3p(QL1 ql1) {
        this.A00 = ql1;
    }

    public final void A00(String str) {
        S6T s6t = this.A00.A01;
        if (s6t != null) {
            WeakReference weakReference = s6t.A00;
            if (weakReference != null) {
                QLA qla = (QLA) weakReference.get();
                if (qla != null) {
                    SB5.A00(new TIT(s6t, qla, str));
                    return;
                }
                return;
            }
            0qQ.A0F("browserLiteWebView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01(String str, String str2) {
        QL1 ql1 = this.A00;
        C73950PmU pmU = new C73950PmU(ql1, str, str2, 0);
        C262204Co r2 = ql1.A09;
        if (r2 == null || !r2.isActive()) {
            pmU.invoke(str);
        } else {
            r2.CO3(new C73943PmN(str, pmU, 2));
        }
    }
}
