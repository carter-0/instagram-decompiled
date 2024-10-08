package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Ndc  reason: case insensitive filesystem */
public final class C69042Ndc extends C333417Yw implements C254793t3 {
    public final C254763t0 A00;
    public final MsysThreadId A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69042Ndc(C254763t0 r2, MsysThreadId msysThreadId) {
        super(r2, msysThreadId);
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = msysThreadId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69042Ndc) {
                C69042Ndc ndc = (C69042Ndc) obj;
                if (!0qQ.A0K(this.A00, ndc.A00) || !0qQ.A0K(this.A01, ndc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
