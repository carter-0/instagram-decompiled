package X;

public final class N8N extends AnonymousClass0T0 implements C254713sv {
    public final long A00;
    public final 2FW A01;
    public final boolean A02;
    public final String A03;

    public final boolean CRd() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8N) {
                N8N n8n = (N8N) obj;
                if (!(0qQ.A0K(this.A03, n8n.A03) && this.A00 == n8n.A00 && this.A01 == n8n.A01 && this.A02 == n8n.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BsI() {
        return this.A03;
    }

    public final long C7c() {
        return this.A00;
    }

    public final 2FW CAa() {
        return this.A01;
    }

    public final boolean Cbp() {
        return false;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A01, C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A03)));
        int A002 = C54732HQn.A00();
        return DbS.A06(this.A02, (((A07 + A002) * 31) + A002) * 31);
    }

    public N8N(2FW r1, String str, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = z;
    }
}
