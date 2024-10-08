package X;

import java.util.List;

/* renamed from: X.6SH  reason: invalid class name */
public final class AnonymousClass6SH {
    public final AnonymousClass2TS A00;
    public final Object A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6SH) {
                AnonymousClass6SH r5 = (AnonymousClass6SH) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass2TS r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Object obj = this.A01;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResolveResult(resolvedNode=");
        sb.append(this.A00);
        sb.append(", resolvedState=");
        sb.append(this.A01);
        sb.append(", appliedStateUpdates=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6SH(AnonymousClass2TS r1, Object obj, List list) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = list;
    }
}
