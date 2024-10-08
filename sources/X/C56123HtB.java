package X;

import java.util.List;

/* renamed from: X.HtB  reason: case insensitive filesystem */
public final class C56123HtB {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56123HtB) {
                C56123HtB htB = (C56123HtB) obj;
                if (!0qQ.A0K(this.A01, htB.A01) || !0qQ.A0K(this.A02, htB.A02) || this.A00 != htB.A00 || this.A03 != htB.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return DbS.A06(this.A03, (AnonymousClass7TF.A07(this.A02, A0O) + this.A00) * 31);
    }

    public C56123HtB(String str, List list, int i, boolean z) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineGenerateResponse(prompt=");
        A1A.append(this.A01);
        A1A.append(", images=");
        A1A.append(this.A02);
        A1A.append(", numOfImagesRequested=");
        A1A.append(this.A00);
        A1A.append(", isMEmuPrompt=");
        return G9t.A1C(A1A, this.A03);
    }
}
