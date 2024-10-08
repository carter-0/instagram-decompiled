package X;

import java.util.Set;

/* renamed from: X.3qb  reason: invalid class name and case insensitive filesystem */
public final class C253323qb implements C253333qc {
    public Set A00;

    public final boolean getBoolForContext(String str, String str2, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        if (str2.equals("useSecondaryConnection")) {
            return this.A00.contains(str);
        }
        return z;
    }

    public final boolean getGlobalBool(String str, boolean z) {
        return z;
    }

    public final int getGlobalInt(String str, int i) {
        return i;
    }

    public final String getGlobalString(String str, String str2) {
        0qQ.A0B(str2, 1);
        return str2;
    }

    public final String getStringForContext(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        return str3;
    }
}
