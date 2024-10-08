package X;

import java.util.ArrayList;

/* renamed from: X.4fd  reason: invalid class name and case insensitive filesystem */
public final class C269754fd {
    public ArrayList A00;
    public final C269754fd A01;
    public final Class A02;

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(arrayList.size());
        }
        sb.append(valueOf);
        sb.append(')');
        C269754fd r1 = this;
        do {
            sb.append(' ');
            sb.append(r1.A02.getName());
            r1 = r1.A01;
        } while (r1 != null);
        sb.append(']');
        return sb.toString();
    }

    public C269754fd(C269754fd r1, Class cls) {
        this.A01 = r1;
        this.A02 = cls;
    }
}
