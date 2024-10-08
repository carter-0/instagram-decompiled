package X;

/* renamed from: X.7O9  reason: invalid class name */
public final class AnonymousClass7O9 implements C232262tL, C331837So {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C327637Bp A05;
    public final CharSequence A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final int getType() {
        return 35;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7O9 A00(android.content.Context r18, X.C327637Bp r19, int r20, long r21, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r2 = r18
            r15 = r25
            r18 = r27
            if (r25 == 0) goto L_0x0098
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r6 = r2.getString(r0)
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131964441(0x7f133219, float:1.9565664E38)
            if (r26 == 0) goto L_0x001b
            r3 = 2131973720(0x7f135658, float:1.9584484E38)
        L_0x001b:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            java.lang.String r0 = r4.getString(r3, r0)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            int r5 = r0.indexOf(r6)
            int r0 = r6.length()
            int r4 = r5 + r0
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r3 = 17
            r7.setSpan(r0, r5, r4, r3)
            int r0 = X.2Yu.A08(r2)
            int r1 = r2.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r7.setSpan(r0, r5, r4, r3)
        L_0x004d:
            android.content.res.Resources r1 = r2.getResources()
            r16 = r23
            if (r23 == 0) goto L_0x008f
            r0 = 2131964442(0x7f13321a, float:1.9565666E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x005c:
            r0 = 2131973722(0x7f13565a, float:1.9584488E38)
            r2.getString(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r9 = r1.getDimensionPixelSize(r0)
            if (r23 == 0) goto L_0x008d
            int r0 = X.2Yu.A07(r2)
            int r10 = r2.getColor(r0)
        L_0x0077:
            int r0 = X.2Yu.A08(r2)
            int r11 = r2.getColor(r0)
            X.7O9 r5 = new X.7O9
            r6 = r19
            r12 = r20
            r13 = r21
            r17 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            return r5
        L_0x008d:
            r10 = -1
            goto L_0x0077
        L_0x008f:
            r0 = 2131964438(0x7f133216, float:1.9565658E38)
            java.lang.String r8 = r1.getString(r0)
            r7 = 0
            goto L_0x005c
        L_0x0098:
            android.content.res.Resources r1 = r2.getResources()
            if (r27 == 0) goto L_0x00a6
            r0 = 2131973717(0x7f135655, float:1.9584478E38)
        L_0x00a1:
            java.lang.String r7 = r1.getString(r0)
            goto L_0x004d
        L_0x00a6:
            r0 = 2131964440(0x7f133218, float:1.9565662E38)
            if (r26 == 0) goto L_0x00a1
            r0 = 2131973719(0x7f135657, float:1.9584482E38)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7O9.A00(android.content.Context, X.7Bp, int, long, boolean, boolean, boolean, boolean, boolean):X.7O9");
    }

    /* renamed from: A01 */
    public final boolean isContentSame(AnonymousClass7O9 r6) {
        if (this.A04 == r6.A04 && this.A01 == r6.A01 && 2PP.A00(this.A07, r6.A07) && 2PP.A00(this.A06, r6.A06) && this.A02 == r6.A02 && this.A03 == r6.A03 && this.A00 == r6.A00 && this.A0A == r6.A0A && this.A0B == r6.A0B) {
            return true;
        }
        return false;
    }

    public final long C7Z() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05.toString();
    }

    public AnonymousClass7O9(C327637Bp r1, CharSequence charSequence, String str, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A07 = str;
        this.A06 = charSequence;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = j;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A05 = r1;
        this.A0B = z4;
    }
}
