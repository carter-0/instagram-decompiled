package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.9DP  reason: invalid class name */
public final class AnonymousClass9DP {
    public final File A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9DP)) {
            return super.equals(obj);
        }
        AnonymousClass9DP r4 = (AnonymousClass9DP) obj;
        if (!2PP.A00(this.A03, r4.A03) || !2PP.A00(this.A02, r4.A02) || !2PP.A00(this.A00, r4.A00) || this.A01 != r4.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A00, Boolean.valueOf(this.A01)});
    }

    public AnonymousClass9DP(File file, String str, String str2, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = z;
        this.A00 = file;
    }
}
