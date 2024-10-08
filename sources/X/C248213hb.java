package X;

/* renamed from: X.3hb  reason: invalid class name and case insensitive filesystem */
public final class C248213hb extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248213hb(2Lk r7) {
        super("zero_day_language_signal_extract", 2118577885, 5, true, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0302 A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }, EDGE_INSN: B:173:0x0302->B:100:0x0302 ?: BREAK  
    EDGE_INSN: B:174:0x0302->B:100:0x0302 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0317 A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x031f A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016f A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e1 A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0283 A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02fd A[Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0, Exception -> 0x04b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r32 = this;
            X.95B r0 = X.AnonymousClass95B.$redex_init_class
            r0 = r32
            X.2Lk r1 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r5 = r1.A01
            com.instagram.common.session.UserSession r8 = r1.A04
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r2 = 1
            X.0qQ.A0B(r8, r2)
            r1 = 38
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            X.0t0 r9 = X.AnonymousClass0eN.A01(r0)
            r1 = 35
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            X.0t0 r4 = X.AnonymousClass0eN.A01(r0)
            r1 = 40
            X.Pln r0 = new X.Pln
            r0.<init>(r4, r1)
            X.0t0 r10 = X.AnonymousClass0eN.A01(r0)
            r1 = 36
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            X.0t0 r4 = X.AnonymousClass0eN.A01(r0)
            r1 = 37
            X.Pln r0 = new X.Pln
            r0.<init>(r4, r1)
            X.0t0 r11 = X.AnonymousClass0eN.A01(r0)
            X.95C r6 = new X.95C
            r6.<init>()
            X.95D r7 = new X.95D
            r7.<init>()
            X.95E r0 = X.AnonymousClass95E.A00
            X.0t0 r12 = X.AnonymousClass0eN.A01(r0)
            r23 = 39
            X.Pln r1 = new X.Pln
            r0 = r23
            r1.<init>(r8, r0)
            X.0t0 r13 = X.AnonymousClass0eN.A01(r1)
            java.lang.Class<X.95B> r0 = X.AnonymousClass95B.class
            X.Iod r4 = new X.Iod
            r14 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = r8.A01(r0, r4)
            X.95B r4 = (X.AnonymousClass95B) r4
            X.95F r0 = r4.A05
            X.0gq r9 = r0.A00
            if (r9 == 0) goto L_0x04bd
            r0 = 36316598482506250(0x8105c10000120a, double:3.030101343316832E-306)
            boolean r0 = r9.Agw(r0)
            if (r0 != r2) goto L_0x04bd
            java.lang.String r11 = r4.A08
            X.0JP r0 = r4.A01
            long r29 = r0.now()
            X.95H r0 = r4.A04
            r26 = r0
            X.95J r6 = r4.A07
            X.95G r0 = r4.A03
            r31 = r0
            android.content.Context r10 = r4.A00
            r0 = r26
            com.facebook.quicklog.QuickPerformanceLogger r0 = r0.A00
            r24 = r0
            r15 = 966997352(0x39a33568, float:3.1129573E-4)
            r0.markerStart(r15)
            r8 = 0
            r4 = 36598073459346524(0x8205c100020c5c, double:3.208107252079379E-306)
            r16 = 0
            r0 = r16
            long r0 = r9.BOO(r4, r0)     // Catch:{ Exception -> 0x04b7 }
            int r4 = (int) r0     // Catch:{ Exception -> 0x04b7 }
            X.Hm0 r7 = new X.Hm0     // Catch:{ Exception -> 0x04b7 }
            r7.<init>(r6, r11, r4)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "input_method"
            java.lang.Object r13 = r10.getSystemService(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.0qQ.A0C(r13, r0)     // Catch:{ Exception -> 0x04b7 }
            android.view.inputmethod.InputMethodManager r13 = (android.view.inputmethod.InputMethodManager) r13     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "CurrentKeyboardLanguages"
            X.95I r6 = (X.AnonymousClass95I) r6     // Catch:{ Exception -> 0x04b7 }
            X.0xa r5 = r6.A00     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = ""
            r4 = r1
            java.lang.String r0 = r5.getString(r0, r1)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x00d8
            r1 = r0
        L_0x00d8:
            java.lang.String r22 = ","
            java.lang.String[] r0 = new java.lang.String[]{r22}     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = X.00l.A0R(r1, r0, r3)     // Catch:{ Exception -> 0x04b7 }
            java.util.List r21 = X.00k.A0a(r0)     // Catch:{ Exception -> 0x04b7 }
            android.view.inputmethod.InputMethodSubtype r5 = r13.getCurrentInputMethodSubtype()     // Catch:{ Exception -> 0x04b7 }
            if (r5 == 0) goto L_0x0136
            java.lang.String r1 = r5.getLocale()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x04b7 }
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            java.util.List r1 = r13.getEnabledInputMethodList()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x0107:
            boolean r1 = r11.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r1 == 0) goto L_0x012f
            java.lang.Object r6 = r11.next()     // Catch:{ Exception -> 0x04b7 }
            r1 = r6
            android.view.inputmethod.InputMethodInfo r1 = (android.view.inputmethod.InputMethodInfo) r1     // Catch:{ Exception -> 0x04b7 }
            java.util.List r1 = r13.getEnabledInputMethodSubtypeList(r1, r2)     // Catch:{ Exception -> 0x04b7 }
            if (r1 != 0) goto L_0x011c
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x04b7 }
        L_0x011c:
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x04b7 }
            if (r1 == 0) goto L_0x0107
        L_0x0122:
            android.view.inputmethod.InputMethodInfo r6 = (android.view.inputmethod.InputMethodInfo) r6     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r5 = X.AnonymousClass95C.A00(r10, r6, r5)     // Catch:{ Exception -> 0x04b7 }
            int r1 = r0.length()     // Catch:{ Exception -> 0x04b7 }
            if (r1 > 0) goto L_0x0153
            goto L_0x0131
        L_0x012f:
            r6 = 0
            goto L_0x0122
        L_0x0131:
            if (r6 == 0) goto L_0x0134
            goto L_0x0139
        L_0x0134:
            r1 = 0
            goto L_0x013d
        L_0x0136:
            X.N49 r6 = X.C45173Crb.A00     // Catch:{ Exception -> 0x04b7 }
            goto L_0x0159
        L_0x0139:
            java.lang.String r1 = r6.getPackageName()     // Catch:{ Exception -> 0x04b7 }
        L_0x013d:
            java.lang.String r0 = "com.google.android.inputmethod.latin"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0136
            boolean r0 = r21.isEmpty()     // Catch:{ Exception -> 0x04b7 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0136
            java.lang.Object r0 = X.00k.A0I(r21)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04b7 }
        L_0x0153:
            r1 = 3
            X.N49 r6 = new X.N49     // Catch:{ Exception -> 0x04b7 }
            r6.<init>(r0, r5, r1)     // Catch:{ Exception -> 0x04b7 }
        L_0x0159:
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r20.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = r13.getEnabledInputMethodList()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r19 = r0.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x0169:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x01db
            java.lang.Object r12 = r19.next()     // Catch:{ Exception -> 0x04b7 }
            android.view.inputmethod.InputMethodInfo r12 = (android.view.inputmethod.InputMethodInfo) r12     // Catch:{ Exception -> 0x04b7 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r11.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = r13.getEnabledInputMethodSubtypeList(r12, r2)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x0185:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r1 = r18.next()     // Catch:{ Exception -> 0x04b7 }
            android.view.inputmethod.InputMethodSubtype r1 = (android.view.inputmethod.InputMethodSubtype) r1     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r5 = r1.getMode()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "keyboard"
            boolean r0 = X.0qQ.A0K(r5, r0)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = r1.getLocale()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x04b7 }
            if (r0 <= 0) goto L_0x0185
            java.lang.String r5 = r1.getLocale()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r5)     // Catch:{ Exception -> 0x04b7 }
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r14 = r5.toLowerCase(r0)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r14)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r5 = X.AnonymousClass95C.A00(r10, r12, r1)     // Catch:{ Exception -> 0x04b7 }
            r1 = 3
            X.N49 r0 = new X.N49     // Catch:{ Exception -> 0x04b7 }
            r0.<init>(r14, r5, r1)     // Catch:{ Exception -> 0x04b7 }
            r11.add(r0)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x0185
        L_0x01c8:
            java.lang.String r5 = r12.getId()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r5)     // Catch:{ Exception -> 0x04b7 }
            r0 = 4
            X.JwJ r1 = new X.JwJ     // Catch:{ Exception -> 0x04b7 }
            r1.<init>((java.util.List) r11, (int) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x04b7 }
            r0 = r20
            r0.add(r1)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x0169
        L_0x01db:
            boolean r0 = r21.isEmpty()     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x0274
            java.util.Iterator r12 = r20.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x01e5:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x04b7 }
            r11 = 0
            if (r0 == 0) goto L_0x0232
            java.lang.Object r5 = r12.next()     // Catch:{ Exception -> 0x04b7 }
            r0 = r5
            X.JwJ r0 = (X.C61081JwJ) r0     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r0.A01     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "com.google.android.inputmethod.latin/com.android.inputmethod.latin.LatinIME"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x01e5
        L_0x01fd:
            X.JwJ r5 = (X.C61081JwJ) r5     // Catch:{ Exception -> 0x04b7 }
            if (r5 == 0) goto L_0x0274
            java.lang.Object r0 = r5.A00     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x04b7 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0274
            java.util.List r0 = r13.getEnabledInputMethodList()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x0218:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0235
            java.lang.Object r12 = r14.next()     // Catch:{ Exception -> 0x04b7 }
            r0 = r12
            android.view.inputmethod.InputMethodInfo r0 = (android.view.inputmethod.InputMethodInfo) r0     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "com.google.android.inputmethod.latin"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0218
            goto L_0x0234
        L_0x0232:
            r5 = r11
            goto L_0x01fd
        L_0x0234:
            r11 = r12
        L_0x0235:
            android.view.inputmethod.InputMethodInfo r11 = (android.view.inputmethod.InputMethodInfo) r11     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = r13.getEnabledInputMethodSubtypeList(r11, r2)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.Object r0 = X.00k.A0I(r0)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x04b7 }
            android.view.inputmethod.InputMethodSubtype r0 = (android.view.inputmethod.InputMethodSubtype) r0     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r11 = X.AnonymousClass95C.A00(r10, r11, r0)     // Catch:{ Exception -> 0x04b7 }
            r1 = 10
            r0 = r21
            int r0 = X.0Yv.A1E(r0, r1)     // Catch:{ Exception -> 0x04b7 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r13 = r21.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x025c:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0272
            java.lang.Object r10 = r13.next()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x04b7 }
            r1 = 3
            X.N49 r0 = new X.N49     // Catch:{ Exception -> 0x04b7 }
            r0.<init>(r10, r11, r1)     // Catch:{ Exception -> 0x04b7 }
            r12.add(r0)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x025c
        L_0x0272:
            r5.A00 = r12     // Catch:{ Exception -> 0x04b7 }
        L_0x0274:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r14.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r20 = r20.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x027d:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r5 = r20.next()     // Catch:{ Exception -> 0x04b7 }
            X.JwJ r5 = (X.C61081JwJ) r5     // Catch:{ Exception -> 0x04b7 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r13.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r12 = r5.A01     // Catch:{ Exception -> 0x04b7 }
            java.lang.String[] r19 = X.AnonymousClass95C.A00     // Catch:{ Exception -> 0x04b7 }
            r11 = 5
            r1 = 0
        L_0x0294:
            r0 = r19[r1]     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = X.00l.A0d(r12, r0, r3)     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x027d
            int r1 = r1 + 1
            if (r1 < r11) goto L_0x0294
            java.lang.Object r0 = r5.A00     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x02a8:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x02d2
            java.lang.Object r10 = r18.next()     // Catch:{ Exception -> 0x04b7 }
            X.N49 r10 = (X.N49) r10     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A0B(r10, r3)     // Catch:{ Exception -> 0x04b7 }
            r5 = 0
        L_0x02b8:
            r1 = r19[r5]     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r10.A01     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = X.00l.A0d(r0, r1, r3)     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x02a8
            java.lang.String r0 = r10.A00     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = X.00l.A0d(r0, r1, r3)     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x02a8
            int r5 = r5 + 1
            if (r5 < r11) goto L_0x02b8
            r13.add(r10)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x02a8
        L_0x02d2:
            boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x04b7 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x027d
            r1 = 4
            X.JwJ r0 = new X.JwJ     // Catch:{ Exception -> 0x04b7 }
            r0.<init>((java.util.List) r13, (int) r1, (java.lang.String) r12)     // Catch:{ Exception -> 0x04b7 }
            r14.add(r0)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x027d
        L_0x02e4:
            X.0qQ.A0B(r6, r3)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String[] r11 = X.AnonymousClass95C.A00     // Catch:{ Exception -> 0x04b7 }
            r10 = 5
            r5 = 0
        L_0x02eb:
            r1 = r11[r5]     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r6.A01     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = X.00l.A0d(r0, r1, r3)     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x0302
            java.lang.String r0 = r6.A00     // Catch:{ Exception -> 0x04b7 }
            boolean r0 = X.00l.A0d(r0, r1, r3)     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x0302
            int r5 = r5 + 1
            if (r5 >= r10) goto L_0x0304
            goto L_0x02eb
        L_0x0302:
            X.N49 r6 = X.C45173Crb.A00     // Catch:{ Exception -> 0x04b7 }
        L_0x0304:
            X.0qQ.A0B(r6, r2)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r5 = r6.A01     // Catch:{ Exception -> 0x04b7 }
            int r0 = r5.length()     // Catch:{ Exception -> 0x04b7 }
            if (r0 != 0) goto L_0x031f
            boolean r0 = r14.isEmpty()     // Catch:{ Exception -> 0x04b7 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x031f
            java.lang.String r1 = "Keyboard input signal not available"
            r0 = r26
            r0.A00(r1, r8)     // Catch:{ Exception -> 0x04b7 }
            return
        L_0x031f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r1.<init>()     // Catch:{ Exception -> 0x04b7 }
            r1.add(r5)     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r10 = r14.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x032b:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x04b7 }
            X.JwJ r0 = (X.C61081JwJ) r0     // Catch:{ Exception -> 0x04b7 }
            java.lang.Object r0 = r0.A00     // Catch:{ Exception -> 0x04b7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x033f:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x04b7 }
            X.N49 r0 = (X.N49) r0     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x04b7 }
            r1.add(r0)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x033f
        L_0x0351:
            r0 = r22
            java.lang.String r18 = X.00k.A0P(r0, r4, r4, r1, r8)     // Catch:{ Exception -> 0x04b7 }
            X.95J r1 = r7.A01     // Catch:{ Exception -> 0x04b7 }
            r0 = 4287(0x10bf, float:6.007E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r12 = r7.A02     // Catch:{ Exception -> 0x04b7 }
            r11 = 95
            int r10 = r7.A00     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = X.002.A0V(r0, r12, r11, r10)     // Catch:{ Exception -> 0x04b7 }
            X.95I r1 = (X.AnonymousClass95I) r1     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A0B(r0, r3)     // Catch:{ Exception -> 0x04b7 }
            X.0xa r13 = r1.A00     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r13.getString(r0, r4)     // Catch:{ Exception -> 0x04b7 }
            if (r0 == 0) goto L_0x0377
            r4 = r0
        L_0x0377:
            r0 = r18
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x04b7 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03c7
            r4 = 36598073459280987(0x8205c100010c5b, double:3.208107252037933E-306)
            r0 = r16
            long r0 = r9.BOO(r4, r0)     // Catch:{ Exception -> 0x04b7 }
            int r4 = (int) r0     // Catch:{ Exception -> 0x04b7 }
            int r0 = r4 + -1
            int r0 = java.lang.Math.max(r0, r3)     // Catch:{ Exception -> 0x04b7 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04b7 }
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r16
            long r16 = r29 - r0
            r0 = 4288(0x10c0, float:6.009E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r5 = X.002.A0V(r0, r12, r11, r10)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A0B(r5, r3)     // Catch:{ Exception -> 0x04b7 }
            r0 = -1
            long r9 = r13.getLong(r5, r0)     // Catch:{ Exception -> 0x04b7 }
            if (r4 == 0) goto L_0x03c7
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x03b9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b9
            goto L_0x03c7
        L_0x03b9:
            java.lang.String r2 = "languages are same as last time and not enough days have passed since last upload"
            java.lang.String r1 = "success_reason"
            r0 = r24
            r0.markerAnnotate(r15, r1, r2)     // Catch:{ Exception -> 0x04b7 }
            r1 = 2
            r0.markerEnd(r15, r1)     // Catch:{ Exception -> 0x04b7 }
            return
        L_0x03c7:
            java.lang.String r4 = "languages"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04b7 }
            r1.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "KeyboardInputSignal(currentLanguage="
            r1.append(r0)     // Catch:{ Exception -> 0x04b7 }
            r1.append(r6)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = ", inputMethods="
            r1.append(r0)     // Catch:{ Exception -> 0x04b7 }
            r1.append(r14)     // Catch:{ Exception -> 0x04b7 }
            r0 = 41
            r1.append(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A0B(r1, r2)     // Catch:{ Exception -> 0x04b7 }
            r0 = r24
            r0.markerAnnotate(r15, r4, r1)     // Catch:{ Exception -> 0x04b7 }
            X.IoD r5 = new X.IoD     // Catch:{ Exception -> 0x04b7 }
            r24 = r5
            r25 = r7
            r27 = r18
            r28 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x04b7 }
            X.PqL r2 = new X.PqL     // Catch:{ Exception -> 0x04b7 }
            r1 = r23
            r0 = r26
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x04b7 }
            java.lang.Class<X.CxW> r7 = X.C45496CxW.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0 }
            java.lang.reflect.Method r1 = r7.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0 }
            java.lang.Object r9 = r1.invoke(r8, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0 }
            X.DFq r9 = (X.C45936DFq) r9     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x04b0 }
            X.2IV r3 = new X.2IV     // Catch:{ Exception -> 0x04b7 }
            r3.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = r6.A01     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r11 = "locale"
            r3.A09(r0, r11)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r6.A00     // Catch:{ Exception -> 0x04b7 }
            r0 = 47
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x04b7 }
            r3.A09(r1, r0)     // Catch:{ Exception -> 0x04b7 }
            X.2IS r10 = r9.A00     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = "current_language"
            r10.A00(r3, r1)     // Catch:{ Exception -> 0x04b7 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r12.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x043e:
            boolean r1 = r15.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r1 == 0) goto L_0x0489
            java.lang.Object r6 = r15.next()     // Catch:{ Exception -> 0x04b7 }
            X.JwJ r6 = (X.C61081JwJ) r6     // Catch:{ Exception -> 0x04b7 }
            X.2IV r13 = new X.2IV     // Catch:{ Exception -> 0x04b7 }
            r13.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r3 = r6.A01     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = "name"
            r13.A09(r3, r1)     // Catch:{ Exception -> 0x04b7 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b7 }
            r7.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x04b7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x04b7 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x04b7 }
        L_0x0463:
            boolean r1 = r14.hasNext()     // Catch:{ Exception -> 0x04b7 }
            if (r1 == 0) goto L_0x0482
            java.lang.Object r6 = r14.next()     // Catch:{ Exception -> 0x04b7 }
            X.N49 r6 = (X.N49) r6     // Catch:{ Exception -> 0x04b7 }
            X.2IV r3 = new X.2IV     // Catch:{ Exception -> 0x04b7 }
            r3.<init>()     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r6.A01     // Catch:{ Exception -> 0x04b7 }
            r3.A09(r1, r11)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r1 = r6.A00     // Catch:{ Exception -> 0x04b7 }
            r3.A09(r1, r0)     // Catch:{ Exception -> 0x04b7 }
            r7.add(r3)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x0463
        L_0x0482:
            r13.A05(r4, r7)     // Catch:{ Exception -> 0x04b7 }
            r12.add(r13)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x043e
        L_0x0489:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r12)     // Catch:{ Exception -> 0x04b7 }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "input_methods"
            r10.A05(r0, r1)     // Catch:{ Exception -> 0x04b7 }
            com.facebook.pando.PandoGraphQLRequest r4 = r9.build()     // Catch:{ Exception -> 0x04b7 }
            X.WMv r3 = new X.WMv     // Catch:{ Exception -> 0x04b7 }
            r3.<init>(r5, r2)     // Catch:{ Exception -> 0x04b7 }
            r0 = r31
            X.1vo r2 = r0.A00     // Catch:{ Exception -> 0x04b7 }
            X.WHn r1 = new X.WHn     // Catch:{ Exception -> 0x04b7 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x04b7 }
            X.WHd r0 = new X.WHd     // Catch:{ Exception -> 0x04b7 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x04b7 }
            r2.ATL(r0, r1, r4)     // Catch:{ Exception -> 0x04b7 }
            return
        L_0x04b0:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x04b7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04b7 }
            throw r0     // Catch:{ Exception -> 0x04b7 }
        L_0x04b7:
            r1 = move-exception
            r0 = r26
            r0.A00(r8, r1)
        L_0x04bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248213hb.loggedRun():void");
    }
}
