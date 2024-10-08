package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b6, code lost:
        r9.A08 = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c5, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r9.A05 = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r9.A0N = X.Pxf.A0Z(X.AnonymousClass7TE.A19(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0105, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0107, code lost:
        r9.A0G = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        r9.A0F = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0120, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0127, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0129, code lost:
        r1 = X.Pxh.A1b(X.AnonymousClass7TE.A19(r1.A00, 0), "/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2 = java.lang.Integer.parseInt(r1[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (r1.length <= 1) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013e, code lost:
        r1 = X.Pxf.A0Z(r1[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0144, code lost:
        r9.A0T = java.lang.Integer.valueOf(r2);
        r9.A0S = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0158, code lost:
        r9.A09 = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0167, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0169, code lost:
        r9.A04 = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0171, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0178, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017a, code lost:
        r9.A06 = X.Pxe.A0f(r1.A00, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0182, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0189, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1 = X.AnonymousClass7TE.A19(r1.A00, 0);
        r2 = java.lang.Integer.parseInt(r1.substring(2, 4));
        r1 = java.lang.Integer.parseInt(r1.substring(0, 2));
        r9.A0M = java.lang.Integer.valueOf(r2);
        r9.A0L = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b4, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void E36(X.Xo1 r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof androidx.media3.extractor.metadata.id3.TextInformationFrame
            if (r0 == 0) goto L_0x01d3
            r1 = r8
            androidx.media3.extractor.metadata.id3.TextInformationFrame r1 = (androidx.media3.extractor.metadata.id3.TextInformationFrame) r1
            java.lang.String r6 = r1.A00
            int r0 = r6.hashCode()
            r7 = 4
            r2 = 3
            r5 = 2
            r4 = 1
            r3 = 0
            switch(r0) {
                case 82815: goto L_0x01bf;
                case 82878: goto L_0x01ae;
                case 82897: goto L_0x0183;
                case 83253: goto L_0x0172;
                case 83254: goto L_0x0161;
                case 83255: goto L_0x0150;
                case 83341: goto L_0x0121;
                case 83378: goto L_0x0110;
                case 83536: goto L_0x00ff;
                case 83552: goto L_0x00e9;
                case 2567331: goto L_0x00e5;
                case 2569357: goto L_0x00e1;
                case 2569358: goto L_0x00a0;
                case 2569891: goto L_0x009c;
                case 2570401: goto L_0x0067;
                case 2570410: goto L_0x0032;
                case 2571565: goto L_0x002e;
                case 2575251: goto L_0x002a;
                case 2581512: goto L_0x0026;
                case 2581513: goto L_0x0022;
                case 2581514: goto L_0x001e;
                case 2583398: goto L_0x001a;
                case 2590194: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r0 = "TYER"
            goto L_0x00eb
        L_0x001a:
            java.lang.String r0 = "TRCK"
            goto L_0x0123
        L_0x001e:
            java.lang.String r0 = "TPE3"
            goto L_0x0152
        L_0x0022:
            java.lang.String r0 = "TPE2"
            goto L_0x0163
        L_0x0026:
            java.lang.String r0 = "TPE1"
            goto L_0x0174
        L_0x002a:
            java.lang.String r0 = "TIT2"
            goto L_0x0112
        L_0x002e:
            java.lang.String r0 = "TEXT"
            goto L_0x0101
        L_0x0032:
            java.lang.String r0 = "TDRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r3)
            java.util.ArrayList r1 = androidx.media3.extractor.metadata.id3.TextInformationFrame.A00(r0)
            int r0 = r1.size()
            if (r0 == r4) goto L_0x005e
            if (r0 == r5) goto L_0x0056
            if (r0 != r2) goto L_0x0015
            java.lang.Object r0 = r1.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0O = r0
        L_0x0056:
            java.lang.Object r0 = r1.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0P = r0
        L_0x005e:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0Q = r0
            return
        L_0x0067:
            java.lang.String r0 = "TDRC"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r3)
            java.util.ArrayList r1 = androidx.media3.extractor.metadata.id3.TextInformationFrame.A00(r0)
            int r0 = r1.size()
            if (r0 == r4) goto L_0x0093
            if (r0 == r5) goto L_0x008b
            if (r0 != r2) goto L_0x0015
            java.lang.Object r0 = r1.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0L = r0
        L_0x008b:
            java.lang.Object r0 = r1.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0M = r0
        L_0x0093:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0N = r0
            return
        L_0x009c:
            java.lang.String r0 = "TDAT"
            goto L_0x0185
        L_0x00a0:
            java.lang.String r0 = "TCON"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r7 = r1.A00
            java.lang.String r0 = X.AnonymousClass7TE.A19(r7, r3)
            java.lang.Long r0 = X.C9744Rg2.A00(r0)
            if (r0 == 0) goto L_0x00dc
            long r5 = r0.longValue()
            int r4 = r0.intValue()
            long r1 = (long) r4
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x00dc
            com.google.common.collect.ImmutableList r0 = X.XY6.A00
            if (r4 < 0) goto L_0x0015
            com.google.common.collect.ImmutableList r1 = X.XY6.A00
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0015
            java.lang.String r0 = X.AnonymousClass7TE.A19(r1, r4)
            if (r0 == 0) goto L_0x0015
        L_0x00d9:
            r9.A0C = r0
            return
        L_0x00dc:
            java.lang.CharSequence r0 = X.Pxe.A0f(r7, r3)
            goto L_0x00d9
        L_0x00e1:
            java.lang.String r0 = "TCOM"
            goto L_0x01b0
        L_0x00e5:
            java.lang.String r0 = "TALB"
            goto L_0x01c1
        L_0x00e9:
            java.lang.String r0 = "TYE"
        L_0x00eb:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00     // Catch:{  }
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r3)     // Catch:{  }
            java.lang.Integer r0 = X.Pxf.A0Z(r0)     // Catch:{  }
            r9.A0N = r0     // Catch:{  }
            goto L_0x01d0
        L_0x00ff:
            java.lang.String r0 = "TXT"
        L_0x0101:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A0G = r0
            return
        L_0x0110:
            java.lang.String r0 = "TT2"
        L_0x0112:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A0F = r0
            return
        L_0x0121:
            java.lang.String r0 = "TRK"
        L_0x0123:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.String r1 = X.AnonymousClass7TE.A19(r0, r3)
            java.lang.String r0 = "/"
            java.lang.String[] r1 = X.Pxh.A1b(r1, r0)
            r0 = r1[r3]     // Catch:{  }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            int r0 = r1.length     // Catch:{  }
            if (r0 <= r4) goto L_0x014e
            r0 = r1[r4]     // Catch:{  }
            java.lang.Integer r1 = X.Pxf.A0Z(r0)     // Catch:{  }
        L_0x0144:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{  }
            r9.A0T = r0     // Catch:{  }
            r9.A0S = r1     // Catch:{  }
            goto L_0x01d1
        L_0x014e:
            r1 = 0
            goto L_0x0144
        L_0x0150:
            java.lang.String r0 = "TP3"
        L_0x0152:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A09 = r0
            return
        L_0x0161:
            java.lang.String r0 = "TP2"
        L_0x0163:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A04 = r0
            return
        L_0x0172:
            java.lang.String r0 = "TP1"
        L_0x0174:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A06 = r0
            return
        L_0x0183:
            java.lang.String r0 = "TDA"
        L_0x0185:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.String r1 = X.AnonymousClass7TE.A19(r0, r3)     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.String r0 = r1.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x0015 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.String r0 = r1.substring(r3, r5)     // Catch:{ NumberFormatException -> 0x0015 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0015 }
            r9.A0M = r0     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0015 }
            r9.A0L = r0     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x01d2
        L_0x01ae:
            java.lang.String r0 = "TCM"
        L_0x01b0:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A08 = r0
            return
        L_0x01bf:
            java.lang.String r0 = "TAL"
        L_0x01c1:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r3)
            r9.A05 = r0
            return
        L_0x01d0:
            return
        L_0x01d1:
            return
        L_0x01d2:
            return
        L_0x01d3:
            boolean r0 = r8 instanceof androidx.media3.extractor.metadata.id3.ApicFrame
            if (r0 == 0) goto L_0x01e1
            r0 = r8
            androidx.media3.extractor.metadata.id3.ApicFrame r0 = (androidx.media3.extractor.metadata.id3.ApicFrame) r0
            byte[] r1 = r0.A03
            int r0 = r0.A00
            r9.A00(r1, r0)
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.Id3Frame.E36(X.Xo1):void");
    }

    public String toString() {
        return this.A00;
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }
}
