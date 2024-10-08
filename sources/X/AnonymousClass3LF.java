package X;

import java.util.Arrays;

/* renamed from: X.3LF  reason: invalid class name */
public final class AnonymousClass3LF {
    public AnonymousClass3LG A00;
    public Boolean A01;
    public String A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3LF r5 = (AnonymousClass3LF) obj;
            if (!this.A05.equals(r5.A05) || this.A04 != r5.A04) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return A01(false);
    }

    private String A00(AnonymousClass3LG r4, boolean z) {
        String str = r4.A01;
        if (str == null) {
            str = "";
        }
        if (str.isEmpty() || !z) {
            return str;
        }
        String A052 = 0mp.A05("#", C256393vh.A02(new C57001IKt(this), Arrays.asList(str.split("#"))));
        if (A052 == null) {
            return "";
        }
        return A052;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.3LG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.3LG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.3LG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(boolean r11) {
        /*
            r10 = this;
            java.lang.String r3 = r10.A05
            java.lang.String r0 = "TRUNCATEDx"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x000b
            return r3
        L_0x000b:
            X.3LG r2 = r10.A00
            if (r2 != 0) goto L_0x0014
            X.3LG r2 = new X.3LG
            r2.<init>()
        L_0x0014:
            java.lang.Boolean r0 = r10.A01
            boolean r1 = r0.booleanValue()
            int r0 = r10.A03
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = r10.A06
            java.lang.String r6 = r10.A07
            java.lang.String r7 = r10.A00(r2, r11)
            java.lang.String r8 = r2.A00
            if (r1 == 0) goto L_0x003d
            if (r8 != 0) goto L_0x0030
            java.lang.String r8 = ""
        L_0x0030:
            java.lang.String r9 = r10.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9}
            java.lang.String r0 = "%s:%d:%s:%s:%s:%s:%s"
        L_0x0038:
            java.lang.String r0 = X.0mp.A06(r0, r1)
            return r0
        L_0x003d:
            if (r8 != 0) goto L_0x0041
            java.lang.String r8 = ""
        L_0x0041:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r0 = "%s:%d:%s:%s:%s:%s"
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LF.A01(boolean):java.lang.String");
    }

    public final int hashCode() {
        return (this.A05.hashCode() * 31) + this.A04;
    }

    public AnonymousClass3LF(String str, String str2, int i, int i2, String str3, String str4) {
        this.A05 = str;
        this.A03 = i;
        this.A06 = str2;
        this.A07 = str3;
        this.A02 = str4;
        this.A04 = i2;
        this.A01 = Boolean.valueOf(str4 != null);
    }
}
