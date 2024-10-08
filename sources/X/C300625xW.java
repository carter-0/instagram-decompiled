package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.5xW  reason: invalid class name and case insensitive filesystem */
public final class C300625xW {
    public long A00;
    public long A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C300625xW r7 = (C300625xW) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final String A00() {
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("NON_REVEALABLE")) {
                return "NON_REVEALABLE";
            }
            if (str.equals("REVEALABLE")) {
                return "REVEALABLE";
            }
        }
        return "UNKNOWN";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Long.valueOf(this.A01), this.A02});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r4.equals(r3) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C300625xW(long r6, long r8, java.lang.String r10) {
        /*
            r5 = this;
            r5.<init>()
            r5.A00 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x002d
            r4 = 0
        L_0x000c:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r3 = "REVEALABLE"
            java.lang.String r2 = "UNKNOWN"
            java.lang.String r1 = "NON_REVEALABLE"
            if (r0 != 0) goto L_0x002b
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0024
            r3 = r1
        L_0x001f:
            r5.A02 = r3
            r5.A01 = r8
            return
        L_0x0024:
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x002b
            goto L_0x001f
        L_0x002b:
            r3 = r2
            goto L_0x001f
        L_0x002d:
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r4 = r10.replaceAll(r1, r0)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300625xW.<init>(long, long, java.lang.String):void");
    }

    public C300625xW() {
    }
}
