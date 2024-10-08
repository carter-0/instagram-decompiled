package X;

import java.util.Set;

/* renamed from: X.7aC  reason: invalid class name and case insensitive filesystem */
public final class C333817aC extends C333827aD {
    public final C333807aB A00;
    public final String A01;
    public final Set A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333817aC) {
                C333817aC r5 = (C333817aC) obj;
                if (!(0qQ.A0K(this.A00, r5.A00) && 0qQ.A0K(this.A01, r5.A01) && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C333817aC(X.C333807aB r3, java.lang.String r4, boolean r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "parent_comment_head_loading_state_"
            r1.append(r0)
            r1.append(r4)
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = X.C333837aE.A01(r0)
        L_0x0015:
            r1.append(r0)
            X.7aA r0 = r3.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            r2.A00 = r3
            r2.A01 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A05 = r7
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            X.0qQ.A07(r0)
            r2.A02 = r0
            return
        L_0x0038:
            java.lang.String r0 = "null"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333817aC.<init>(X.7aB, java.lang.String, boolean, boolean, boolean):void");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A00.hashCode() * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A05) {
            i6 = 1231;
        }
        return i5 + i6;
    }
}
