package X;

import java.util.List;

/* renamed from: X.A9q  reason: case insensitive filesystem */
public final class C39795A9q {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39795A9q)) {
            return false;
        }
        C39795A9q a9q = (C39795A9q) obj;
        if (!0qQ.A0K(this.A02, a9q.A02) || !0qQ.A0K(this.A00, a9q.A00) || !0qQ.A0K(this.A01, a9q.A01) || !0qQ.A0K(this.A03, a9q.A03)) {
            return false;
        }
        return 0qQ.A0K(this.A04, a9q.A04);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)))));
    }

    public C39795A9q(String str, String str2, String str3, List list, List list2) {
        AnonymousClass7TG.A1R(list, list2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ForeignKey{referenceTable='");
        A1A.append(this.A02);
        A1A.append("', onDelete='");
        A1A.append(this.A00);
        A1A.append(" +', onUpdate='");
        A1A.append(this.A01);
        A1A.append("', columnNames=");
        A1A.append(this.A03);
        A1A.append(", referenceColumnNames=");
        A1A.append(this.A04);
        A1A.append('}');
        return A1A.toString();
    }
}
