package X;

public final class GRE {
    public boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannedString A00(android.content.Context r9, X.0sP r10, boolean r11) {
        /*
            r8 = this;
            r0 = 1
            X.0qQ.A0B(r9, r0)
            java.lang.Integer r0 = r8.A01
            if (r11 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0099
            int r1 = r0.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.0nH.A08(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0018:
            if (r0 == 0) goto L_0x0099
            int r7 = r0.intValue()
        L_0x001e:
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            java.lang.String r0 = r8.A03
            int r0 = r0.length()
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            r4 = 17
            int r0 = r8.A06
            if (r1 == 0) goto L_0x007a
            X.HBI r6 = new X.HBI
            r6.<init>((X.GRE) r8, (X.0sP) r10, (int) r7, (int) r0)
            int r5 = r3.length()
            java.lang.String r0 = r8.A02
            r3.append(r0)
        L_0x0040:
            int r0 = r3.length()
            r3.setSpan(r6, r5, r0, r4)
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0074
            android.graphics.drawable.BitmapDrawable r0 = X.C244273av.A00(r9)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            X.0qQ.A07(r1)
            X.AnonymousClass7TG.A13(r1)
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            X.DbX.A11(r9, r1, r0)
            X.46l r2 = new X.46l
            r2.<init>(r1)
            int r1 = r3.length()
            java.lang.String r0 = "verified"
            r3.append(r0)
            int r0 = r3.length()
            r3.setSpan(r2, r1, r0, r4)
        L_0x0074:
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r3)
            return r0
        L_0x007a:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            int r5 = r3.length()
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r7)
            int r1 = r3.length()
            java.lang.String r0 = r8.A02
            r3.append(r0)
            int r0 = r3.length()
            r3.setSpan(r2, r1, r0, r4)
            goto L_0x0040
        L_0x0099:
            r7 = -1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRE.A00(android.content.Context, X.0sP, boolean):android.text.SpannedString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 >= 6) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GRE(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r9 = "Failed to parse the color string: "
            java.lang.String r8 = "NewsfeedEmbeddedText_Color"
            r3 = 1
            X.0qQ.A0B(r13, r3)
            r12.<init>()
            r2 = 1
            char[] r1 = new char[r3]
            r0 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r1[r11] = r0
            r6 = 6
            java.util.List r5 = X.00l.A0Q(r13, r1, r11)
            int r1 = r5.size()
            r4 = 4
            if (r4 > r1) goto L_0x0022
            r0 = 1
            if (r1 < r6) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r7 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r5.get(r11)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0035 }
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x004d
        L_0x0035:
            r10 = move-exception
            java.lang.String r1 = "Failed to decode embedded text: "
            java.lang.Object r0 = r5.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "Couldn't decode embedded text"
            X.0wb.A06(r0, r1, r10)
            java.lang.Object r0 = r5.get(r11)
            java.lang.String r0 = (java.lang.String) r0
        L_0x004d:
            r12.A02 = r0
            r1 = 35
            java.lang.Object r0 = r5.get(r3)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0064 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0064 }
            java.lang.String r0 = X.002.A0D(r0, r1)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0064 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0064 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0064 }
            goto L_0x0071
        L_0x0064:
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.002.A0R(r9, r0)
            X.0wb.A03(r8, r0)
        L_0x0071:
            r12.A01 = r7
            r8 = 2
            java.lang.Object r0 = r5.get(r8)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x008d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x008d }
            goto L_0x00b3
        L_0x007f:
            r12.A02 = r6
            r12.A03 = r6
            r12.A00 = r3
            java.lang.String r1 = "NewsfeedEmbeddedText"
            java.lang.String r0 = "Response does not have correct number of fields"
            X.0wb.A03(r1, r0)
            goto L_0x00d8
        L_0x008d:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse style info: "
            r1.append(r0)
            java.lang.Object r0 = r5.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = ", Exception: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "NewsfeedEmbeddedText_Style"
            X.0wb.A03(r0, r1)
            r0 = 0
        L_0x00b3:
            r12.A06 = r0
            r0 = 3
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.00l.A0W(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "ig://"
            java.lang.String r6 = X.002.A0R(r0, r1)
        L_0x00ca:
            r12.A03 = r6
            java.lang.Object r1 = X.00k.A0O(r5, r4)
            java.lang.String r0 = "verified"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r12.A05 = r0
        L_0x00d8:
            int r0 = r12.A06
            r0 = r0 & 1
            if (r0 == r3) goto L_0x00df
            r2 = 0
        L_0x00df:
            r12.A04 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRE.<init>(java.lang.String):void");
    }
}
