package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Q2j  reason: case insensitive filesystem */
public final class C7284Q2j {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7284Q2j) {
                C7284Q2j q2j = (C7284Q2j) obj;
                if (!0qQ.A0K(this.A00, q2j.A00) || !0qQ.A0K(this.A03, q2j.A03) || !0qQ.A0K(this.A01, q2j.A01) || !0qQ.A0K(this.A02, q2j.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00))));
    }

    public C7284Q2j(Object obj, String str, List list, Map map) {
        C51974G9v.A1P(obj, map, str, list);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Template(templateObject=");
        A1A.append(this.A00);
        A1A.append(", expandedVariables=");
        A1A.append(this.A03);
        A1A.append(", scopeKey=");
        A1A.append(this.A01);
        A1A.append(", keyPathBase=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
