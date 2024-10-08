package X;

/* renamed from: X.QvA  reason: case insensitive filesystem */
public class C8465QvA extends S01 {
    public final SJF A00;
    public final Character A01;
    public volatile S01 A02;

    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        SKo.A02(i, i + i2, bArr.length);
        SJF sjf = this.A00;
        int i3 = sjf.A03;
        int i4 = 0;
        if (i2 <= i3) {
            long j = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                j = (j | ((long) (bArr[i + i5] & 255))) << 8;
            }
            int i6 = (i2 + 1) * 8;
            while (i4 < i2 * 8) {
                int i7 = sjf.A01;
                int i8 = sjf.A00;
                appendable.append(sjf.A07[i8 & ((int) (j >>> ((i6 - i7) - i4)))]);
                i4 += i7;
            }
            if (this.A01 != null) {
                while (i4 < i3 * 8) {
                    appendable.append('=');
                    i4 += sjf.A01;
                }
                return;
            }
            return;
        }
        throw Pxe.A0g();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8465QvA)) {
            return false;
        }
        C8465QvA qvA = (C8465QvA) obj;
        if (!this.A00.equals(qvA.A00) || !2Ob.A00(this.A01, qvA.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Character ch = this.A01;
        return AnonymousClass7TG.A0C(ch) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder A16 = Pxe.A16("BaseEncoding.");
        SJF sjf = this.A00;
        A16.append(sjf);
        if (8 % sjf.A01 != 0) {
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

    public C8465QvA(SJF sjf, Character ch) {
        this.A00 = sjf;
        if (ch != null) {
            byte[] bArr = sjf.A06;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw AnonymousClass7TE.A0w(C9705RfO.A00("Padding character %s was already in alphabet", ch));
            }
        }
        this.A01 = ch;
    }
}
