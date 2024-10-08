package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Q1l {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q1l)) {
            return false;
        }
        Q1l q1l = (Q1l) obj;
        if (q1l.hashCode() != hashCode() || !C296675qS.A04(q1l.A02, this.A02) || !C296675qS.A04(q1l.A01, this.A01) || !C296675qS.A04(q1l.A00, this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, null});
    }

    public Q1l(String str, String str2, String str3, List list, List list2) {
        if (C296675qS.A03(str)) {
            throw new Exception("Template name is empty");
        } else if (!C296675qS.A03(str2)) {
            this.A02 = str;
            this.A01 = str2;
            this.A03 = list;
            this.A04 = list2 == null ? Collections.emptyList() : list2;
            this.A00 = str3;
        } else {
            throw new Exception("Content is empty");
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[templateName: ");
        A1A.append(this.A02);
        A1A.append(", content: ");
        A1A.append(this.A01);
        A1A.append(", assets: ");
        A1A.append(this.A03);
        A1A.append(", assetsInfo: ");
        A1A.append(this.A04);
        A1A.append(", animationPayload: ");
        A1A.append(this.A00);
        A1A.append(", audioDataSrc: ");
        return Pxg.A0r((Object) null, A1A);
    }
}
