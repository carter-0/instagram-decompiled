package X;

import com.instagram.leadgen.core.api.LeadForm;

/* renamed from: X.N8s  reason: case insensitive filesystem */
public final class C68281N8s extends AnonymousClass0T0 implements C74537PwW {
    public final LeadForm A00;
    public final C60903JtN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68281N8s) {
                C68281N8s n8s = (C68281N8s) obj;
                if (!0qQ.A0K(this.A01, n8s.A01) || !0qQ.A0K(this.A00, n8s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C68281N8s(LeadForm leadForm, C60903JtN jtN) {
        this.A01 = jtN;
        this.A00 = leadForm;
    }
}
