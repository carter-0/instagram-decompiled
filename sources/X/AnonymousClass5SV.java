package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5SV  reason: invalid class name */
public final class AnonymousClass5SV implements Iterable, AnonymousClass5SW, C62650uo {
    public boolean A00;
    public boolean A01;
    public final Map A02 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SV) {
                AnonymousClass5SV r5 = (AnonymousClass5SV) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object A00(C285635Sb r3) {
        Object obj = this.A02.get(r3);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key not present: ");
        sb.append(r3);
        sb.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(sb.toString());
    }

    public final void ENH(C285635Sb r6, Object obj) {
        if (obj instanceof C290145ep) {
            Map map = this.A02;
            if (map.containsKey(r6)) {
                Object obj2 = map.get(r6);
                0qQ.A0C(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C290145ep r3 = (C290145ep) obj2;
                C290145ep r7 = (C290145ep) obj;
                String str = r7.A00;
                if (str == null) {
                    str = r3.A00;
                }
                AnonymousClass0eL r1 = r7.A01;
                if (r1 == null) {
                    r1 = r3.A01;
                }
                map.put(r6, new C290145ep(str, r1));
                return;
            }
        }
        this.A02.put(r6, obj);
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A00) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public final Iterator iterator() {
        return this.A02.entrySet().iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.A01) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((C285635Sb) entry.getKey()).A01);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C9150RRb.A00(this));
        sb2.append("{ ");
        sb2.append(sb);
        sb2.append(" }");
        return sb2.toString();
    }
}
