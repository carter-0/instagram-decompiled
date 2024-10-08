package X;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.5fM  reason: invalid class name and case insensitive filesystem */
public final class C290465fM {
    public final Uri A00;
    public final List A01;
    @Deprecated
    public final List A02;
    public final Map A03;
    @Deprecated
    public final Map A04;
    public final UUID A05;
    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C290465fM)) {
            return false;
        }
        C290465fM r4 = (C290465fM) obj;
        return this.A05.equals(r4.A05) && Util.A0I(this.A00, r4.A00) && Util.A0I(this.A03, r4.A03) && this.A08 == r4.A08 && this.A07 == r4.A07 && this.A09 == r4.A09 && this.A01.equals(r4.A01) && Arrays.equals(this.A0A, r4.A0A);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A05.hashCode() * 31;
        Uri uri = this.A00;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((hashCode + i) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.A00 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C290465fM(X.AnonymousClass4RH r4) {
        /*
            r3 = this;
            r3.<init>()
            boolean r2 = r4.A04
            if (r2 == 0) goto L_0x000c
            android.net.Uri r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            X.C256703wD.A04(r0)
            java.util.UUID r0 = r4.A03
            r0.getClass()
            r3.A05 = r0
            r3.A06 = r0
            android.net.Uri r0 = r4.A00
            r3.A00 = r0
            java.util.Map r0 = r4.A02
            r3.A04 = r0
            r3.A03 = r0
            boolean r0 = r4.A05
            r3.A08 = r0
            r3.A07 = r2
            boolean r0 = r4.A06
            r3.A09 = r0
            java.util.List r0 = r4.A01
            r3.A02 = r0
            r3.A01 = r0
            byte[] r1 = r4.A07
            if (r1 == 0) goto L_0x003f
            int r0 = r1.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
        L_0x003c:
            r3.A0A = r0
            return
        L_0x003f:
            r0 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290465fM.<init>(X.4RH):void");
    }
}
