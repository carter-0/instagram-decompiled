package X;

/* renamed from: X.9qe  reason: invalid class name and case insensitive filesystem */
public final class C390049qe extends AnonymousClass8YP {
    public final int A00;
    public final AnonymousClass51M A01;
    public final 0sL A02;
    public final AnonymousClass89v A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C390049qe) {
                C390049qe r5 = (C390049qe) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31));
    }

    public C390049qe(AnonymousClass89v r1, AnonymousClass51M r2, 0sL r3, int i) {
        this.A01 = r2;
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenerateSingleFrameEvent(videoSegment=");
        A1A.append(this.A01);
        A1A.append(", frameMs=");
        A1A.append(this.A00);
        A1A.append(", onBitmapReady=");
        A1A.append(this.A02);
        A1A.append(", bitmapGeneratorParams=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
