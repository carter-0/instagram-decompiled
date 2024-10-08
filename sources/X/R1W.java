package X;

public class R1W extends C11032S6k {
    public final C11285SJd A00;
    public final Character A01;
    public volatile C11032S6k A02;

    public final void A04(Appendable appendable, byte[] bArr, int i, int i2) {
        17k.A03(i, i + i2, bArr.length);
        C11285SJd sJd = this.A00;
        int i3 = sJd.A01;
        int i4 = 0;
        17k.A0E(Pxg.A1T(i2, i3));
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = sJd.A00;
        int i7 = ((i2 + 1) * 8) - i6;
        while (i4 < i2 * 8) {
            appendable.append(sJd.A07[((int) (j >>> (i7 - i4))) & sJd.A03]);
            i4 += i6;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i4 < i3 * 8) {
                appendable.append(ch.charValue());
                i4 += i6;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R1W)) {
            return false;
        }
        R1W r1w = (R1W) obj;
        if (!this.A00.equals(r1w.A00) || !2Ob.A00(this.A01, r1w.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass7TG.A0C(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder A16 = Pxe.A16("BaseEncoding.");
        C11285SJd sJd = this.A00;
        A16.append(sJd);
        if (8 % sJd.A00 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A16.append(".withPadChar('");
                A16.append(ch);
                str = "')";
            }
            A16.append(str);
        }
        return A16.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 == -1) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R1W(X.C11285SJd r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 == 0) goto L_0x0016
            char r2 = r5.charValue()
            byte[] r1 = r4.A06
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0016
            byte r2 = r1[r2]
            r0 = -1
            r1 = 0
            if (r2 != r0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            X.17k.A0A(r5, r0, r1)
            r3.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1W.<init>(X.SJd, java.lang.Character):void");
    }
}
