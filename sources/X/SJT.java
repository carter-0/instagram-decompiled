package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

public final class SJT {
    public final String A00;
    public final LocusId A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A00;
        String str2 = ((SJT) obj).A00;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static SJT A00(LocusId locusId) {
        02V.A03(locusId, "locusId cannot be null");
        String A012 = C11047S7r.A01(locusId);
        if (!TextUtils.isEmpty(A012)) {
            return new SJT(A012);
        }
        throw AnonymousClass7TE.A0w(String.valueOf("id cannot be empty"));
    }

    public final LocusId A01() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00) + 31;
    }

    public final String toString() {
        return 002.A0g("LocusIdCompat[", 002.A03(this.A00.length(), "_chars"), "]");
    }

    public SJT(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = C11047S7r.A00(str);
            } else {
                locusId = null;
            }
            this.A01 = locusId;
            return;
        }
        throw AnonymousClass7TE.A0w(String.valueOf("id cannot be empty"));
    }
}
