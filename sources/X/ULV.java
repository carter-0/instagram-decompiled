package X;

public final class ULV extends AnonymousClass0T0 {
    public String A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ULV(X.0xF r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            r6 = r10
            r5 = r9
            r2 = r8
            r4 = 0
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0009
            r2 = r4
        L_0x0009:
            r0 = r11 & 2
            if (r0 == 0) goto L_0x000e
            r5 = r4
        L_0x000e:
            r0 = r11 & 4
            if (r0 == 0) goto L_0x0013
            r6 = r4
        L_0x0013:
            r0 = r11 & 512(0x200, float:7.175E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        L_0x001c:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x0024:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULV.<init>(X.0xF, java.lang.String, java.lang.String, int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductCardLoggingInfo(extraBundle=");
        sb.append(this.A01);
        sb.append(", submodule=");
        sb.append(this.A04);
        sb.append(AnonymousClass000.A00(843));
        sb.append(this.A00);
        sb.append(", navigationMetadata=");
        sb.append((Object) null);
        sb.append(", moduleLoggingInfo=");
        sb.append((Object) null);
        sb.append(", mediaId=");
        sb.append((String) null);
        sb.append(", contentType=");
        sb.append((String) null);
        sb.append(", filtersLoggingInfo=");
        sb.append((Object) null);
        sb.append(", rankingLoggingInfo=");
        sb.append((Object) null);
        sb.append(", isFullWidthProductTileCellEnabled=");
        sb.append(this.A02);
        sb.append(", numMediaInProductRow=");
        return AnonymousClass7TG.A0n(this.A03, sb);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public ULV(Object obj, Object obj2, Object obj3, String str, String str2) {
        this.A01 = obj;
        this.A04 = str;
        this.A00 = str2;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
