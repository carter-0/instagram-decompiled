package X;

/* renamed from: X.IGp  reason: case insensitive filesystem */
public final class C56894IGp implements JNY {
    public final int A00;
    public final C286025Tq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56894IGp) {
                C56894IGp iGp = (C56894IGp) obj;
                if (!0qQ.A0K(this.A01.A00, iGp.A01.A00) || this.A00 != iGp.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C56894IGp(String str, int i) {
        0sn r1 = 0sn.A00;
        this.A01 = new C286025Tq(r1, r1, str);
        this.A00 = i;
    }

    public final void AC8(C56159Htn htn) {
        int i;
        int i2 = htn.A01;
        boolean z = false;
        if (i2 != -1) {
            z = true;
        }
        int i3 = 1;
        if (z) {
            i = htn.A00;
        } else {
            i2 = htn.A03;
            i = htn.A02;
        }
        String str = this.A01.A00;
        htn.A04(i2, i, str);
        int length = str.length();
        if (length > 0) {
            htn.A02(i2, length + i2);
        }
        int i4 = htn.A03;
        int i5 = htn.A02;
        if (i4 != i5) {
            i5 = -1;
        }
        int i6 = this.A00;
        int i7 = i5 + i6;
        if (i6 <= 0) {
            i3 = length;
        }
        int A03 = C229632nm.A03(i7 - i3, 0, htn.A04.A00());
        htn.A03(A03, A03);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01.A00) + this.A00;
    }

    public final String toString() {
        return 002.A0l("SetComposingTextCommand(text='", this.A01.A00, "', newCursorPosition=", ')', this.A00);
    }
}
