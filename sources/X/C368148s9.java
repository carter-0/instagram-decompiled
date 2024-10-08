package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.8s9  reason: invalid class name and case insensitive filesystem */
public abstract class C368148s9 {
    public final Uri A00;
    public final 0PH A01;
    public final String A02;
    public final C368128s7 A03;
    public final C368098s4 A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C368148s9)) {
            return false;
        }
        C368148s9 r4 = (C368148s9) obj;
        if (!this.A00.equals(r4.A00)) {
            return false;
        }
        C368128s7 r1 = this.A03;
        C368128s7 r0 = r4.A03;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        0PH r12 = this.A01;
        0PH r02 = r4.A01;
        if (r12 == null) {
            if (r02 != null) {
                return false;
            }
        } else if (!r12.equals(r02)) {
            return false;
        }
        if (this.A02.equals(r4.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A03, this.A04, this.A01});
    }

    public C368148s9(C368098s4 r3) {
        this.A00 = Uri.EMPTY;
        this.A03 = null;
        this.A04 = r3;
        this.A02 = "";
        this.A01 = null;
    }

    public C368148s9(0PH r2, String str, String str2, C368128s7 r5, C368098s4 r6) {
        Uri A032 = 0cp.A03(str);
        0qQ.A07(A032);
        this.A00 = A032;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = str2;
        this.A01 = r2;
    }
}
