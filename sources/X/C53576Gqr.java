package X;

/* renamed from: X.Gqr  reason: case insensitive filesystem */
public final class C53576Gqr extends AnonymousClass0T0 implements JTL {
    public final C267324bN A00;
    public final JNJ A01;
    public final C59671JTb A02;
    public final GKJ A03;
    public final GEG A04;
    public final C52058GDe A05;
    public final C52091GEl A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53576Gqr) {
                C53576Gqr gqr = (C53576Gqr) obj;
                if (!0qQ.A0K(this.A00, gqr.A00) || !0qQ.A0K(this.A05, gqr.A05) || !0qQ.A0K(this.A04, gqr.A04) || !0qQ.A0K(this.A02, gqr.A02) || !0qQ.A0K(this.A03, gqr.A03) || !0qQ.A0K(this.A06, gqr.A06) || !0qQ.A0K(this.A01, gqr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53576Gqr(C59671JTb jTb, GKJ gkj, GEG geg, C267324bN r5, C52058GDe gDe, C52091GEl gEl, JNJ jnj) {
        0qQ.A0B(jnj, 9);
        this.A00 = r5;
        this.A05 = gDe;
        this.A04 = geg;
        this.A02 = jTb;
        this.A03 = gkj;
        this.A06 = gEl;
        this.A01 = jnj;
    }

    public final C52671Gaj AtN() {
        return null;
    }

    public final C267324bN BML() {
        return this.A00;
    }

    public final GEG BMM() {
        return this.A04;
    }

    public final C52058GDe BMN() {
        return this.A05;
    }

    public final GKJ BQN() {
        return this.A03;
    }

    public final C52093GEn Bau() {
        return null;
    }

    public final C52091GEl CB8() {
        return this.A06;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A00)))))) * 31 * 31);
    }
}
