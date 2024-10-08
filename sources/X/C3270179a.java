package X;

/* renamed from: X.79a  reason: invalid class name and case insensitive filesystem */
public final class C3270179a {
    public static final C3270179a A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: X.V2E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: X.V2E} */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        if (r12 == false) goto L_0x016d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A00(android.content.Context r18, X.C69566NoA r19, com.instagram.common.session.UserSession r20, java.lang.CharSequence r21) {
        /*
            r17 = this;
            r1 = r19
            r7 = 0
            r9 = r18
            X.0qQ.A0B(r9, r7)
            r0 = 1
            r8 = r20
            X.0qQ.A0B(r8, r0)
            r0 = 2
            r6 = r21
            X.0qQ.A0B(r6, r0)
            if (r19 != 0) goto L_0x0057
            X.0Tu r2 = X.0Tu.A06
            r0 = 36330488406819478(0x81126300014296, double:3.038885387382753E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x0024
            return r6
        L_0x0024:
            java.lang.String r0 = "_"
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            boolean r0 = r6 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x0049
            r0 = r6
        L_0x0030:
            android.text.SpannableStringBuilder r10 = r1.append(r0)
            r0 = 2131237511(0x7f081a87, float:1.8091275E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            if (r0 == 0) goto L_0x004f
            X.U2O r2 = new X.U2O
            r2.<init>(r0)
            r1 = 1
            r0 = 33
            r10.setSpan(r2, r7, r1, r0)
            return r10
        L_0x0049:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            goto L_0x0030
        L_0x004f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            X.UVA r1 = (X.UVA) r1
            java.util.List r5 = r1.A01
            java.util.List r4 = r1.A00
            r16 = 1
            if (r5 == 0) goto L_0x0188
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0188
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x013a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x013a
        L_0x0071:
            if (r4 == 0) goto L_0x0188
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0188
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0109
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0109
        L_0x0083:
            java.util.Iterator r15 = r5.iterator()
        L_0x0087:
            boolean r0 = r15.hasNext()
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r11 = r15.next()
            X.V2F r11 = (X.V2F) r11
            java.util.Iterator r14 = r4.iterator()
            r13 = 0
            r10 = r13
            r12 = 0
        L_0x009c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r2 = r14.next()
            r0 = r2
            X.V2E r0 = (X.V2E) r0
            X.UVB r0 = (X.UVB) r0
            java.lang.String r1 = r0.A02
            r0 = r11
            X.UVC r0 = (X.UVC) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009c
            if (r12 != 0) goto L_0x016d
            r10 = r2
            r12 = 1
            goto L_0x009c
        L_0x00bd:
            X.Wq9 r0 = new X.Wq9
            r0.<init>()
            java.util.List r11 = X.00k.A0g(r5, r0)
            int r10 = r11.size()
            int r10 = r10 - r16
            r2 = 0
        L_0x00cd:
            if (r2 >= r10) goto L_0x0106
            java.lang.Object r0 = r11.get(r2)
            X.V2F r0 = (X.V2F) r0
            X.UVC r0 = (X.UVC) r0
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x02f3
            int r1 = r0.intValue()
            java.lang.Object r0 = r11.get(r2)
            X.V2F r0 = (X.V2F) r0
            X.UVC r0 = (X.UVC) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x02ed
            int r0 = r0.intValue()
            int r1 = r1 + r0
            int r2 = r2 + 1
            java.lang.Object r0 = r11.get(r2)
            X.V2F r0 = (X.V2F) r0
            X.UVC r0 = (X.UVC) r0
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x02e7
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x00cd
            goto L_0x0188
        L_0x0106:
            r0 = 1
            goto L_0x0189
        L_0x0109:
            java.util.Iterator r2 = r4.iterator()
        L_0x010d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r1 = r2.next()
            X.V2E r1 = (X.V2E) r1
            X.UVB r1 = (X.UVB) r1
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0188
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0188
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0188
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x010d
            goto L_0x0188
        L_0x013a:
            java.util.Iterator r3 = r5.iterator()
        L_0x013e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r2 = r3.next()
            X.V2F r2 = (X.V2F) r2
            X.UVC r2 = (X.UVC) r2
            java.lang.Integer r0 = r2.A01
            java.lang.Integer r1 = r2.A00
            if (r0 == 0) goto L_0x0188
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x0188
            if (r1 == 0) goto L_0x0188
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x0188
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x0188
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x013e
            goto L_0x0188
        L_0x016b:
            if (r12 != 0) goto L_0x016e
        L_0x016d:
            r10 = r13
        L_0x016e:
            X.V2E r10 = (X.V2E) r10
            if (r10 == 0) goto L_0x0188
            X.UVC r11 = (X.UVC) r11
            java.lang.Integer r2 = r11.A00
            X.UVB r10 = (X.UVB) r10
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x0349
            int r1 = r0.length()
            if (r2 == 0) goto L_0x0188
            int r0 = r2.intValue()
            if (r0 == r1) goto L_0x0087
        L_0x0188:
            r0 = 0
        L_0x0189:
            if (r0 == 0) goto L_0x0217
            if (r5 == 0) goto L_0x0217
            X.WqB r0 = new X.WqB
            r0.<init>()
            java.util.List r0 = X.00k.A0g(r5, r0)
            if (r0 == 0) goto L_0x0217
            java.lang.Object r3 = X.00k.A0L(r0)
            X.V2F r3 = (X.V2F) r3
            if (r3 == 0) goto L_0x0217
            X.UVC r3 = (X.UVC) r3
            java.lang.Integer r0 = r3.A01
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0343
            int r2 = r0.intValue()
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x033d
            int r0 = r0.intValue()
            int r2 = r2 + r0
            int r0 = r6.length()
            if (r2 > r0) goto L_0x0217
            r10 = 0
            java.util.Iterator r13 = r5.iterator()
        L_0x01c0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r11 = r13.next()
            X.V2F r11 = (X.V2F) r11
            if (r4 == 0) goto L_0x0217
            java.util.Iterator r12 = r4.iterator()
        L_0x01d2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r3 = r12.next()
            r0 = r3
            X.V2E r0 = (X.V2E) r0
            X.UVB r0 = (X.UVB) r0
            java.lang.String r2 = r0.A02
            r0 = r11
            X.UVC r0 = (X.UVC) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01d2
        L_0x01ee:
            X.V2E r3 = (X.V2E) r3
            if (r3 == 0) goto L_0x0217
            X.UVB r3 = (X.UVB) r3
            java.lang.String r3 = r3.A00
            X.UVC r11 = (X.UVC) r11
            java.lang.Integer r0 = r11.A01
            if (r0 == 0) goto L_0x032b
            int r2 = r0.intValue()
            java.lang.Integer r0 = r11.A00
            if (r0 == 0) goto L_0x0325
            int r0 = r0.intValue()
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r6.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x01c0
        L_0x0217:
            r0 = 0
        L_0x0218:
            if (r0 == 0) goto L_0x0324
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330488406753941(0x81126300004295, double:3.0388853873413073E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0324
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            boolean r0 = r6 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x02a5
            r10 = r6
            android.text.Spannable r10 = (android.text.Spannable) r10
        L_0x0233:
            if (r10 != 0) goto L_0x023a
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r6)
        L_0x023a:
            java.lang.String r3 = "Required value was null."
            if (r5 == 0) goto L_0x031e
            java.util.Iterator r12 = r5.iterator()
        L_0x0242:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x031d
            java.lang.Object r11 = r12.next()
            X.V2F r11 = (X.V2F) r11
            X.UVC r11 = (X.UVC) r11
            java.lang.String r2 = r11.A02
            java.lang.Object r0 = r8.get(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x0288
            if (r4 == 0) goto L_0x02ff
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x0310 }
        L_0x0260:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0310 }
            if (r0 == 0) goto L_0x0305
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x0310 }
            X.V2E r1 = (X.V2E) r1     // Catch:{ Exception -> 0x0310 }
            X.UVB r1 = (X.UVB) r1     // Catch:{ Exception -> 0x0310 }
            java.lang.String r0 = r1.A02     // Catch:{ Exception -> 0x0310 }
            boolean r0 = X.0qQ.A0K(r0, r2)     // Catch:{ Exception -> 0x0310 }
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x0310 }
            byte[] r1 = android.util.Base64.decode(r0, r7)     // Catch:{ Exception -> 0x0310 }
            int r0 = r1.length     // Catch:{ Exception -> 0x0310 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r7, r0)     // Catch:{ Exception -> 0x0310 }
            if (r2 == 0) goto L_0x02f9
            if (r0 == 0) goto L_0x0324
            r8.put(r2, r0)
        L_0x0288:
            X.U2O r5 = new X.U2O
            r5.<init>(r9, r0)
            java.lang.Integer r0 = r11.A01
            if (r0 == 0) goto L_0x0317
            int r2 = r0.intValue()
            java.lang.Integer r0 = r11.A00
            if (r0 == 0) goto L_0x0311
            int r0 = r0.intValue()
            int r1 = r2 + r0
            r0 = 33
            r10.setSpan(r5, r2, r1, r0)
            goto L_0x0242
        L_0x02a5:
            r10 = 0
            goto L_0x0233
        L_0x02a7:
            r3 = r10
            goto L_0x01ee
        L_0x02aa:
            boolean r0 = r6 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x02b1
            r10 = r6
            android.text.Spanned r10 = (android.text.Spanned) r10
        L_0x02b1:
            if (r10 == 0) goto L_0x02e4
            java.util.Iterator r11 = r5.iterator()
        L_0x02b7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r2 = r11.next()
            X.V2F r2 = (X.V2F) r2
            X.UVC r2 = (X.UVC) r2
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x0337
            int r3 = r0.intValue()
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0331
            int r2 = r0.intValue()
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r0 = r10.getSpans(r3, r2, r0)
            android.text.style.ImageSpan[] r0 = (android.text.style.ImageSpan[]) r0
            X.0qQ.A0A(r0)
            int r0 = r0.length
            if (r0 != 0) goto L_0x0217
            goto L_0x02b7
        L_0x02e4:
            r0 = 1
            goto L_0x0218
        L_0x02e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02ff:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0310 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0310 }
            goto L_0x030f
        L_0x0305:
            r0 = 3
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0310 }
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x0310 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0310 }
        L_0x030f:
            throw r1     // Catch:{ Exception -> 0x0310 }
        L_0x0310:
            return r21
        L_0x0311:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0317:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x031d:
            return r10
        L_0x031e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0324:
            return r21
        L_0x0325:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x032b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0331:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0337:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x033d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0343:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0349:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3270179a.A00(android.content.Context, X.NoA, com.instagram.common.session.UserSession, java.lang.CharSequence):java.lang.CharSequence");
    }
}
