package X;

/* renamed from: X.N8n  reason: case insensitive filesystem */
public final class C68276N8n extends AnonymousClass0T0 implements C74256Prk {
    public final long A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68276N8n) {
                C68276N8n n8n = (C68276N8n) obj;
                if (!0qQ.A0K(this.A01, n8n.A01) || this.A00 != n8n.A00 || !0qQ.A0K(this.A02, n8n.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C68276N8n(String str, long j, String str2) {
        AnonymousClass7TG.A1P(str, str2);
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
