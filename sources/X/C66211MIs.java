package X;

/* renamed from: X.MIs  reason: case insensitive filesystem */
public final /* synthetic */ class C66211MIs extends 03J implements 0sH {
    public static final C66211MIs A00 = new C66211MIs();

    public C66211MIs() {
        super(6, C63524KyZ.class, "convertViewModelStateToUiState", "convertViewModelStateToUiState(Ljava/util/List;Landroid/graphics/Bitmap;Lcom/instagram/creation/genai/contextualbackground/domain/SuccessfulGeneration;Lcom/instagram/creation/genai/contextualbackground/model/ContextualBackgroundSourceImage;ZLandroid/graphics/Bitmap;)Lcom/instagram/creation/genai/contextualbackground/domain/ContextualBackgroundUiState;", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r2 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r1.hasNext() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if ((r1.next() instanceof X.LLH) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r12.isEmpty() != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[LOOP:3: B:31:0x0084->B:33:0x008a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[LOOP:5: B:41:0x00b8->B:43:0x00be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r11 = this;
            r6 = r17
            r5 = r13
            java.util.List r12 = (java.util.List) r12
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            X.L4A r14 = (X.L4A) r14
            com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage r15 = (com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage) r15
            boolean r1 = X.AnonymousClass7TE.A1a(r16)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r0 = 0
            X.0qQ.A0B(r12, r0)
            if (r1 != 0) goto L_0x002d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0073
            boolean r2 = r12 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0049
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0049
        L_0x0027:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0061
        L_0x002d:
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
        L_0x002f:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r12.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.L4A
            if (r0 == 0) goto L_0x0037
            r3.add(r1)
            goto L_0x0037
        L_0x0049:
            java.util.Iterator r1 = r12.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.L4A
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x002f
        L_0x005e:
            if (r2 == 0) goto L_0x0061
            goto L_0x0027
        L_0x0061:
            java.util.Iterator r1 = r12.iterator()
        L_0x0065:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.LLH
            if (r0 != 0) goto L_0x0065
        L_0x0073:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            goto L_0x002f
        L_0x0076:
            r0 = 12
            java.util.List r0 = X.MAY.A00(r3, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0084:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()
            X.L4A r0 = (X.L4A) r0
            X.IQK r0 = r0.A01
            r3.add(r0)
            goto L_0x0084
        L_0x0096:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r12.iterator()
        L_0x009e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.LLI
            if (r0 == 0) goto L_0x009e
            r4.add(r1)
            goto L_0x009e
        L_0x00b0:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x00b8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c7
            r1.next()
            X.IQL r0 = X.IQL.A00
            r2.add(r0)
            goto L_0x00b8
        L_0x00c7:
            r7 = 0
            if (r15 == 0) goto L_0x00da
            java.lang.String r9 = r15.A02
        L_0x00cc:
            java.util.ArrayList r10 = X.00k.A0S(r2, r3)
            if (r14 == 0) goto L_0x00d4
            X.IQK r7 = r14.A01
        L_0x00d4:
            X.Jvo r4 = new X.Jvo
            r4.<init>((android.graphics.Bitmap) r5, (android.graphics.Bitmap) r6, (X.IQK) r7, (java.lang.Integer) r8, (java.lang.String) r9, (java.util.List) r10)
            return r4
        L_0x00da:
            r9 = r7
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66211MIs.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
