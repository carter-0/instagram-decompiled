package X;

/* renamed from: X.9yo  reason: invalid class name and case insensitive filesystem */
public abstract class C394859yo {
    /* JADX WARNING: type inference failed for: r14v6, types: [X.5Eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v36, types: [X.5Eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [X.A5d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v12, types: [X.5Eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.A5d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v14, types: [X.5Eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.A5d, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(com.instagram.common.session.UserSession r20, java.util.Map r21) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = X.AnonymousClass7TF.A0u(r21)
        L_0x0008:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0282
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r2 = r0.getKey()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            java.lang.Object r13 = r0.getValue()
            java.util.Set r13 = (java.util.Set) r13
            r4 = r2
            boolean r0 = r2 instanceof X.AnonymousClass5MI     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0046
            X.5MI r4 = (X.AnonymousClass5MI) r4     // Catch:{ FileNotFoundException -> 0x0008 }
            int r1 = r4.Byn()     // Catch:{ FileNotFoundException -> 0x0008 }
            int r0 = r4.B1e()     // Catch:{ FileNotFoundException -> 0x0008 }
            X.A5d r9 = new X.A5d     // Catch:{ FileNotFoundException -> 0x0008 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0008 }
            r9.A01 = r1     // Catch:{ FileNotFoundException -> 0x0008 }
            r9.A00 = r0     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x0036:
            X.6tV r4 = X.AnonymousClass9SF.A00(r2)     // Catch:{ FileNotFoundException -> 0x0008 }
            r8 = 0
            if (r4 == 0) goto L_0x00a8
            X.6tR r4 = (X.C321016tR) r4     // Catch:{ FileNotFoundException -> 0x0008 }
            java.lang.String r11 = r4.A0D     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r11 != 0) goto L_0x0048
            java.lang.String r11 = r4.A0F     // Catch:{ FileNotFoundException -> 0x0008 }
            goto L_0x0048
        L_0x0046:
            r9 = 0
            goto L_0x0036
        L_0x0048:
            if (r11 == 0) goto L_0x0096
            java.io.File r0 = X.AnonymousClass7TE.A0t(r11)     // Catch:{ FileNotFoundException -> 0x0008 }
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0096
            boolean r0 = r2 instanceof X.C347017w8     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0079
            r0 = r2
            X.7w8 r0 = (X.C347017w8) r0     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0065
            java.lang.Iterable r0 = r0.A05()     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x0061:
            java.lang.Object r8 = X.00k.A0A(r0)     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x0065:
            boolean r0 = r8 instanceof X.AnonymousClass8N6     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0093
            boolean r0 = X.AnonymousClass8IK.A06(r20)     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0093
            X.5Er r10 = X.C282775Er.A05     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x0071:
            java.lang.String r12 = r4.A0l     // Catch:{ FileNotFoundException -> 0x0008 }
            X.5Eo r8 = new X.5Eo     // Catch:{ FileNotFoundException -> 0x0008 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ FileNotFoundException -> 0x0008 }
            goto L_0x00a8
        L_0x0079:
            boolean r0 = r2 instanceof X.AnonymousClass5MH     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0093
            r0 = r2
            X.5MH r0 = (X.AnonymousClass5MH) r0     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0091
            android.graphics.drawable.Drawable r1 = r0.A0A     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x0084:
            boolean r0 = r1 instanceof X.C347017w8     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r0 == 0) goto L_0x0065
            X.7w8 r1 = (X.C347017w8) r1     // Catch:{ FileNotFoundException -> 0x0008 }
            if (r1 == 0) goto L_0x0065
            java.lang.Iterable r0 = r1.A05()     // Catch:{ FileNotFoundException -> 0x0008 }
            goto L_0x0061
        L_0x0091:
            r1 = r8
            goto L_0x0084
        L_0x0093:
            X.5Er r10 = X.C282775Er.A06     // Catch:{ FileNotFoundException -> 0x0008 }
            goto L_0x0071
        L_0x0096:
            java.lang.String r0 = "missing cache file: "
            java.lang.String r2 = X.002.A0R(r0, r11)     // Catch:{ FileNotFoundException -> 0x0008 }
            java.lang.String r1 = "animated gif video render failed"
            r0 = 0
            X.0kD.A07(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x0008 }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0008 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0008 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0008 }
        L_0x00a8:
            if (r8 == 0) goto L_0x00af
            r3.add(r8)     // Catch:{ FileNotFoundException -> 0x0008 }
            goto L_0x0008
        L_0x00af:
            boolean r0 = r2 instanceof X.AnonymousClass9X8
            r14 = 0
            if (r0 == 0) goto L_0x00cf
            r1 = r2
            X.9X8 r1 = (X.AnonymousClass9X8) r1
            if (r1 == 0) goto L_0x00cf
            X.5Er r0 = X.C282775Er.A09
            X.50v r1 = r1.BzV()
            X.5Eo r14 = new X.5Eo
            r14.<init>()
            r14.A03 = r0
            X.513 r0 = new X.513
            r0.<init>(r1)
            r14.A04 = r0
            r14.A07 = r13
        L_0x00cf:
            if (r14 != 0) goto L_0x01d9
            boolean r6 = r2 instanceof X.AnonymousClass5MH
            r14 = 0
            if (r6 == 0) goto L_0x010b
            r5 = r2
            X.5MH r5 = (X.AnonymousClass5MH) r5
            if (r5 == 0) goto L_0x010b
            android.graphics.drawable.Drawable r1 = r5.A0A
            boolean r0 = r1 instanceof X.AnonymousClass9XD
            if (r0 == 0) goto L_0x010b
            X.9XD r1 = (X.AnonymousClass9XD) r1
            if (r1 == 0) goto L_0x010b
            java.lang.String r4 = r1.A05
            int r0 = r4.length()
            if (r0 != 0) goto L_0x00f1
            java.lang.String r4 = X.AnonymousClass45F.A03(r2)
        L_0x00f1:
            X.5Er r16 = X.C282775Er.A07
            r18 = 0
            int r1 = r5.A01
            int r0 = r5.A00
            X.A5d r15 = new X.A5d
            r15.<init>()
            r15.A01 = r1
            r15.A00 = r0
            X.5Eo r14 = new X.5Eo
            r17 = r4
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x010b:
            if (r14 != 0) goto L_0x01d9
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable"
            if (r6 == 0) goto L_0x019e
            r0 = r2
            X.5MH r0 = (X.AnonymousClass5MH) r0
            android.graphics.drawable.Drawable r1 = r0.A0A
            boolean r0 = r1 instanceof X.AnonymousClass9X8
            if (r0 == 0) goto L_0x019e
            X.0qQ.A0C(r1, r4)
            X.9X8 r1 = (X.AnonymousClass9X8) r1
            X.9sQ r1 = r1.A0C
            X.9sQ r0 = X.C391149sQ.GALLERY_STICKER
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
        L_0x0127:
            X.5MJ r6 = X.AnonymousClass9SF.A02(r2)
            r14 = 0
            if (r6 == 0) goto L_0x0178
            X.50v r0 = r6.BzV()
            if (r0 == 0) goto L_0x0178
            if (r1 == 0) goto L_0x0171
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.timedstickers.TimedStickerDrawable"
            X.0qQ.A0C(r2, r0)
            r0 = r2
            X.5MH r0 = (X.AnonymousClass5MH) r0
            android.graphics.drawable.Drawable r0 = r0.A0A
            X.0qQ.A0C(r0, r4)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.5Er r5 = X.C282775Er.A09
            int r1 = r0.A02
            int r0 = r0.A01
            X.A5d r4 = new X.A5d
            r4.<init>()
            r4.A01 = r1
            r4.A00 = r0
            X.5Eo r14 = new X.5Eo
            r14.<init>()
            r14.A03 = r5
            X.50v r1 = r6.BzV()
            X.513 r0 = new X.513
            r0.<init>(r1)
            r14.A04 = r0
            r14.A07 = r13
            r14.A02 = r4
        L_0x016a:
            if (r14 != 0) goto L_0x01d9
            r8 = 817891909(0x30c00a45, float:1.3972757E-9)
            r14 = 0
            goto L_0x01a0
        L_0x0171:
            X.5Er r5 = X.C282775Er.A08
            X.50v r1 = r6.BzV()
            goto L_0x018d
        L_0x0178:
            boolean r0 = X.AnonymousClass9SF.A03(r2)
            if (r0 == 0) goto L_0x016a
            boolean r0 = r2 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x016a
            X.5Er r5 = X.C282775Er.A08
            r4 = r2
            X.6Ly r4 = (X.C306386Ly) r4
            r1 = 0
            r0 = 1
            X.50u r1 = X.C394809yj.A00(r14, r4, r1, r0)
        L_0x018d:
            X.5Eo r14 = new X.5Eo
            r14.<init>()
            r14.A03 = r5
            X.513 r0 = new X.513
            r0.<init>(r1)
            r14.A04 = r0
            r14.A07 = r13
            goto L_0x016a
        L_0x019e:
            r1 = 0
            goto L_0x0127
        L_0x01a0:
            int r0 = X.AnonymousClass7TF.A06(r2)     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            if (r0 <= 0) goto L_0x01d7
            android.graphics.Rect r0 = r2.getBounds()     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            int r0 = r0.height()     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            if (r0 <= 0) goto L_0x01d7
            java.lang.String r14 = X.AnonymousClass45F.A03(r2)     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            X.5Er r6 = X.C282775Er.A07     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r5 = 0
            int r4 = X.AnonymousClass7TF.A06(r2)     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            android.graphics.Rect r0 = r2.getBounds()     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            int r1 = r0.height()     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            X.5Eo r0 = new X.5Eo     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.<init>()     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A03 = r6     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A05 = r14     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A06 = r5     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A07 = r13     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A02 = r5     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A01 = r4     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r0.A00 = r1     // Catch:{ NullPointerException -> 0x020c, Exception -> 0x01de }
            r14 = r0
        L_0x01d7:
            if (r14 == 0) goto L_0x0008
        L_0x01d9:
            r3.add(r14)
            goto L_0x0008
        L_0x01de:
            r4 = move-exception
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "getReelImageRegionsForRegionTrackedSticker_Exception"
            X.0f9 r3 = r1.AEf(r0, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "imagePath = "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " e="
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            java.lang.String r0 = "message"
            r3.ABQ(r0, r1)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "drawable"
            X.AnonymousClass7TF.A19(r3, r0, r1, r4)
            throw r4
        L_0x020c:
            r7 = move-exception
            boolean r0 = r2 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x0281
            r5 = r2
            X.6Ly r5 = (X.C306386Ly) r5
            android.text.Spannable r6 = r5.A0F
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spanned"
            X.0qQ.A0C(r6, r0)
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "getReelImageRegionsForRegionTrackedSticker_NullPointerException"
            X.0f9 r4 = r1.AEf(r0, r8)
            int r1 = X.AnonymousClass7TF.A06(r5)
            java.lang.String r0 = "width"
            r4.ABO(r0, r1)
            android.graphics.Rect r0 = r5.getBounds()
            int r1 = r0.height()
            java.lang.String r0 = "height"
            r4.ABO(r0, r1)
            android.text.Spannable r0 = r5.A0F
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "text"
            r4.ABQ(r0, r1)
            java.lang.CharSequence r0 = r5.A0L
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "formattedText"
            r4.ABQ(r0, r1)
            r3 = 0
            int r1 = r6.length()
            java.lang.Class<android.view.ViewTreeObserver$OnPreDrawListener> r0 = android.view.ViewTreeObserver.OnPreDrawListener.class
            java.lang.Object[] r0 = r6.getSpans(r3, r1, r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "spans"
            r4.ABQ(r0, r1)
            boolean r1 = r5.A0P
            java.lang.String r0 = "hasOutline"
            r4.ABR(r0, r1)
            X.6Lz r0 = r5.A0I
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "effectId"
            r4.ABQ(r0, r1)
            boolean r1 = X.AnonymousClass9SF.A03(r2)
            java.lang.String r0 = "hasTextEffect"
            r4.ABR(r0, r1)
            r4.report()
        L_0x0281:
            throw r7
        L_0x0282:
            X.Azw r2 = X.C41767Azw.A00
            r1 = 6
            X.ArV r0 = new X.ArV
            r0.<init>((X.0sL) r2, (int) r1)
            X.01V.A1D(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394859yo.A00(com.instagram.common.session.UserSession, java.util.Map):java.util.ArrayList");
    }
}
