package X;

/* renamed from: X.Txq  reason: case insensitive filesystem */
public final class C14530Txq {
    public static final C14530Txq A00 = new Object();

    public static final C17821Vga A00(C14529Txp txp) {
        0qQ.A0B(txp, 0);
        String str = txp.A01;
        if (str != null) {
            C16663Uyz uyz = txp.A00;
            if (uyz != null) {
                String str2 = txp.A02;
                if (str2 != null) {
                    return new C17821Vga(str, str2, DbY.A0j(uyz.name()));
                }
                throw new Exception("Showreel Native Action Parameter value is null");
            }
            throw new Exception("Showreel Native Action Parameter type is null");
        }
        throw new Exception("Showreel Native Action Parameter name is null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: X.WKI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: X.Txm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: X.WKG} */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.WKH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.lang.Object, X.WKL] */
    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object, X.WKJ] */
    /* JADX WARNING: type inference failed for: r11v9, types: [java.lang.Object, X.WKK] */
    /* JADX WARNING: type inference failed for: r3v45, types: [X.V3K, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v46, types: [X.V3K, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v47, types: [X.V3K, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0107, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52594GYt A01(X.Q2X r27, X.C14515Txb r28) {
        /*
            r26 = this;
            r2 = 1
            r25 = r27
            r0 = r25
            X.0qQ.A0B(r0, r2)
            com.google.common.collect.ImmutableList$Builder r24 = new com.google.common.collect.ImmutableList$Builder
            r24.<init>()
            r1 = r28
            java.util.List r0 = r1.A01
            java.util.Iterator r23 = r0.iterator()
        L_0x0015:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x034a
            java.lang.Object r4 = r23.next()
            X.Txd r4 = (X.C14517Txd) r4
            X.0qQ.A0A(r4)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.lang.String r0 = r4.A02
            r22 = r0
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = r4.A01
            r21 = r0
            if (r0 == 0) goto L_0x033a
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            java.util.List r0 = r4.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x003f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r3 = r8.next()
            X.Txf r3 = (X.C14519Txf) r3
            X.0qQ.A0A(r3)
            X.0qQ.A0B(r3, r6)
            java.lang.String r7 = r3.A00
            if (r7 == 0) goto L_0x02d2
            int r0 = r7.length()
            if (r0 == 0) goto L_0x02d2
            java.lang.String r3 = r3.A01
            if (r3 == 0) goto L_0x02ca
            int r0 = r3.length()
            if (r0 == 0) goto L_0x02ca
            X.JV7 r0 = new X.JV7
            r0.<init>((java.lang.String) r7, (java.lang.String) r3)
            r5.add(r0)
            goto L_0x003f
        L_0x006e:
            com.google.common.collect.ImmutableList$Builder r20 = new com.google.common.collect.ImmutableList$Builder
            r20.<init>()
            java.util.List r0 = r4.A04
            java.util.Iterator r19 = r0.iterator()
        L_0x0079:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r19.next()
            X.VSb r0 = (X.C17348VSb) r0
            X.0qQ.A0A(r0)
            X.0qQ.A0B(r0, r6)
            java.lang.String r7 = r0.A00
            if (r7 == 0) goto L_0x0332
            com.google.common.collect.ImmutableList$Builder r9 = new com.google.common.collect.ImmutableList$Builder
            r9.<init>()
            java.util.List r0 = r0.A01
            java.util.Iterator r18 = r0.iterator()
        L_0x009a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r18.next()
            X.VSa r0 = (X.C17347VSa) r0
            X.0qQ.A0A(r0)
            X.0qQ.A0B(r0, r6)
            java.lang.String r8 = r0.A00
            if (r8 == 0) goto L_0x032a
            com.google.common.collect.ImmutableList$Builder r10 = new com.google.common.collect.ImmutableList$Builder
            r10.<init>()
            java.util.List r0 = r0.A01
            java.util.Iterator r17 = r0.iterator()
        L_0x00bb:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r13 = r17.next()
            X.VSZ r13 = (X.VSZ) r13
            X.0qQ.A0A(r13)
            X.0qQ.A0B(r13, r6)
            X.UyR r12 = r13.A00
            if (r12 == 0) goto L_0x0322
            int r3 = r12.ordinal()
            r0 = 3
            if (r3 == r0) goto L_0x01a4
            if (r3 == r2) goto L_0x0174
            r0 = 2
            if (r3 == r0) goto L_0x00ff
            com.google.common.collect.ImmutableList$Builder r11 = new com.google.common.collect.ImmutableList$Builder
            r11.<init>()
            java.util.List r0 = r13.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r0 = r3.next()
            X.Txp r0 = (X.C14529Txp) r0
            X.0qQ.A0A(r0)
            X.Vga r0 = A00(r0)
            r11.add(r0)
            goto L_0x00e8
        L_0x00ff:
            java.util.List r0 = r13.A01
            java.util.Iterator r16 = r0.iterator()
            r13 = 0
            r3 = r13
        L_0x0107:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r11 = r16.next()
            X.Txp r11 = (X.C14529Txp) r11
            java.lang.String r14 = r11.A02
            java.lang.String r12 = r11.A01
            java.lang.String r0 = "layer"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0127
            X.Uyz r15 = X.C16663Uyz.STRING
            X.Uyz r0 = r11.A00
            if (r15 != r0) goto L_0x0127
            r13 = r14
            goto L_0x0107
        L_0x0127:
            if (r14 == 0) goto L_0x0107
            if (r12 == 0) goto L_0x0107
            X.Uyz r0 = X.C16663Uyz.INT
            X.Uyz r11 = r11.A00
            if (r0 != r11) goto L_0x0142
            int r0 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.UU3 r3 = new X.UU3
            r3.<init>()
            r3.A01 = r12
            r3.A00 = r0
        L_0x0142:
            X.Uyz r0 = X.C16663Uyz.FLOAT
            if (r0 != r11) goto L_0x0157
            float r0 = java.lang.Float.parseFloat(r14)     // Catch:{ NumberFormatException -> 0x02e2 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.UU2 r3 = new X.UU2
            r3.<init>()
            r3.A01 = r12
            r3.A00 = r0
        L_0x0157:
            X.Uyz r0 = X.C16663Uyz.STRING
            if (r0 != r11) goto L_0x0107
            X.UU4 r3 = new X.UU4
            r3.<init>()
            r3.A01 = r12
            r3.A00 = r14
            goto L_0x0107
        L_0x0165:
            if (r13 == 0) goto L_0x02f2
            if (r3 == 0) goto L_0x02ea
            X.WKK r11 = new X.WKK
            r11.<init>()
            r11.A01 = r13
            r11.A00 = r3
            goto L_0x020a
        L_0x0174:
            java.util.List r0 = r13.A01
            java.util.Iterator r13 = r0.iterator()
            r0 = 0
        L_0x017b:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x019a
            java.lang.Object r12 = r13.next()
            X.Txp r12 = (X.C14529Txp) r12
            java.lang.String r11 = r12.A01
            java.lang.String r3 = "new_state"
            boolean r3 = r3.equalsIgnoreCase(r11)
            if (r3 == 0) goto L_0x017b
            X.Uyz r11 = X.C16663Uyz.STRING
            X.Uyz r3 = r12.A00
            if (r11 != r3) goto L_0x017b
            java.lang.String r0 = r12.A02
            goto L_0x017b
        L_0x019a:
            if (r0 == 0) goto L_0x02fa
            X.WKJ r11 = new X.WKJ
            r11.<init>()
            r11.A00 = r0
            goto L_0x020a
        L_0x01a4:
            java.util.List r0 = r13.A01
            java.util.Iterator r15 = r0.iterator()
            r12 = 0
            r0 = r12
        L_0x01ac:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x01db
            java.lang.Object r13 = r15.next()
            X.Txp r13 = (X.C14529Txp) r13
            java.lang.String r14 = r13.A01
            java.lang.String r3 = "start_progress"
            boolean r3 = r3.equalsIgnoreCase(r14)
            if (r3 == 0) goto L_0x01ca
            X.Uyz r11 = X.C16663Uyz.FLOAT
            X.Uyz r3 = r13.A00
            if (r11 != r3) goto L_0x01ca
            java.lang.String r12 = r13.A02
        L_0x01ca:
            java.lang.String r3 = "end_progress"
            boolean r3 = r3.equalsIgnoreCase(r14)
            if (r3 == 0) goto L_0x01ac
            X.Uyz r11 = X.C16663Uyz.FLOAT
            X.Uyz r3 = r13.A00
            if (r11 != r3) goto L_0x01ac
            java.lang.String r0 = r13.A02
            goto L_0x01ac
        L_0x01db:
            if (r12 == 0) goto L_0x031a
            if (r0 == 0) goto L_0x0312
            float r3 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x030a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0302 }
            X.WKL r11 = new X.WKL
            r11.<init>()
            r11.A01 = r3
            r11.A00 = r0
            goto L_0x020a
        L_0x01f1:
            java.lang.String r3 = r12.name()
            java.util.Locale r0 = java.util.Locale.US
            X.0qQ.A08(r0)
            java.lang.String r3 = r3.toLowerCase(r0)
            X.0qQ.A07(r3)
            com.google.common.collect.ImmutableList r0 = r11.build()
            X.WKM r11 = new X.WKM
            r11.<init>(r0, r3)
        L_0x020a:
            r10.add(r11)
            goto L_0x00bb
        L_0x020f:
            com.google.common.collect.ImmutableList r3 = r10.build()
            X.Hpt r0 = new X.Hpt
            r0.<init>(r3, r8)
            r9.add(r0)
            goto L_0x009a
        L_0x021d:
            com.google.common.collect.ImmutableList r0 = r9.build()
            X.Hps r3 = new X.Hps
            r3.<init>(r7, r0)
            r0 = r20
            r0.add(r3)
            goto L_0x0079
        L_0x022d:
            X.Txh r0 = r4.A00
            com.google.common.collect.ImmutableList$Builder r8 = new com.google.common.collect.ImmutableList$Builder
            r8.<init>()
            if (r0 == 0) goto L_0x029d
            java.util.List r0 = r0.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x023c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x029d
            java.lang.Object r4 = r9.next()
            X.VY8 r4 = (X.VY8) r4
            X.0qQ.A0A(r4)     // Catch:{ Nn9 -> 0x028e }
            X.0qQ.A0B(r4, r6)     // Catch:{ Nn9 -> 0x028e }
            java.lang.String r11 = r4.A03     // Catch:{ Nn9 -> 0x028e }
            if (r11 == 0) goto L_0x027e
            java.lang.String r12 = r4.A02     // Catch:{ Nn9 -> 0x028e }
            if (r12 == 0) goto L_0x0286
            X.UyS r0 = r4.A00     // Catch:{ Nn9 -> 0x028e }
            if (r0 == 0) goto L_0x0276
            java.lang.String r3 = r0.name()     // Catch:{ Nn9 -> 0x028e }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Nn9 -> 0x028e }
            X.0qQ.A08(r0)     // Catch:{ Nn9 -> 0x028e }
            java.lang.String r13 = r3.toLowerCase(r0)     // Catch:{ Nn9 -> 0x028e }
            X.0qQ.A07(r13)     // Catch:{ Nn9 -> 0x028e }
            java.lang.String r14 = r4.A01     // Catch:{ Nn9 -> 0x028e }
            r15 = 2
            X.QP5 r10 = new X.QP5     // Catch:{ Nn9 -> 0x028e }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ Nn9 -> 0x028e }
            r8.add(r10)     // Catch:{ Nn9 -> 0x028e }
            goto L_0x023c
        L_0x0276:
            java.lang.String r0 = "Showreel Native Visible Layer type is null"
            X.Nn9 r3 = new X.Nn9     // Catch:{ Nn9 -> 0x028e }
            r3.<init>(r0)     // Catch:{ Nn9 -> 0x028e }
            goto L_0x028d
        L_0x027e:
            java.lang.String r0 = "Showreel Native Visible Layer tag is null"
            X.Nn9 r3 = new X.Nn9     // Catch:{ Nn9 -> 0x028e }
            r3.<init>(r0)     // Catch:{ Nn9 -> 0x028e }
            goto L_0x028d
        L_0x0286:
            java.lang.String r0 = "Showreel Native Visible Layer name is null"
            X.Nn9 r3 = new X.Nn9     // Catch:{ Nn9 -> 0x028e }
            r3.<init>(r0)     // Catch:{ Nn9 -> 0x028e }
        L_0x028d:
            throw r3     // Catch:{ Nn9 -> 0x028e }
        L_0x028e:
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.RegularImmutableMap.A02
            X.0qQ.A07(r4)
            java.lang.String r3 = "Document model metadata parse error"
            r0 = r25
            r0.Dlm(r4, r7, r3)
            goto L_0x023c
        L_0x029d:
            com.google.common.collect.ImmutableList r4 = r8.build()
            X.0qQ.A07(r4)
            r3 = 11
            X.JwI r0 = new X.JwI
            r0.<init>((java.util.List) r4, (int) r3)
            com.google.common.collect.ImmutableList r5 = r5.build()
            X.0qQ.A07(r5)
            com.google.common.collect.ImmutableList r6 = r20.build()
            X.0qQ.A07(r6)
            X.Q1n r3 = new X.Q1n
            r4 = r0
            r7 = r22
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = r24
            r0.add(r3)
            goto L_0x0015
        L_0x02ca:
            java.lang.String r1 = "Showreel Native Bitmap uri is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02d2:
            java.lang.String r1 = "Showreel Native Bitmap name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02da:
            java.lang.String r1 = "Value is not a valid Integer in MUTATE_PROPERTY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02e2:
            java.lang.String r1 = "Value is not a valid Float in MUTATE_PROPERTY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02ea:
            java.lang.String r1 = "Property is null in MUTATE_PROPERTY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02f2:
            java.lang.String r1 = "Layer is null in MUTATE_PROPERTY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x02fa:
            java.lang.String r1 = "State is null in CHANGE_STATE DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0302:
            java.lang.String r1 = "end progress is not a valid Float in PLAY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x030a:
            java.lang.String r1 = "start progress is not a valid Float in PLAY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0312:
            java.lang.String r1 = "end progress is null in PLAY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x031a:
            java.lang.String r1 = "start progress is null in PLAY DocumentAction"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0322:
            java.lang.String r1 = "Showreel Native Document Action Type is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x032a:
            java.lang.String r1 = "Showreel Native Event Action name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0332:
            java.lang.String r1 = "Showreel Native Document state name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x033a:
            java.lang.String r1 = "Showreel Native Keyframes Document is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0342:
            java.lang.String r1 = "Showreel Native Document name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x034a:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            java.util.List r0 = r1.A02
            java.util.Iterator r13 = r0.iterator()
        L_0x0355:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04c7
            java.lang.Object r0 = r13.next()
            X.Txl r0 = (X.C14525Txl) r0
            X.0qQ.A0A(r0)
            r8 = 0
            X.0qQ.A0B(r0, r8)
            java.lang.String r6 = r0.A00
            if (r6 == 0) goto L_0x04bf
            com.google.common.collect.ImmutableList$Builder r7 = new com.google.common.collect.ImmutableList$Builder
            r7.<init>()
            java.util.List r0 = r0.A01
            java.util.Iterator r12 = r0.iterator()
        L_0x0377:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0486
            java.lang.Object r2 = r12.next()
            X.Txj r2 = (X.C14523Txj) r2
            X.0qQ.A0A(r2)
            X.0qQ.A0B(r2, r8)
            X.UyQ r4 = r2.A00
            if (r4 == 0) goto L_0x04b7
            int r0 = r4.ordinal()
            switch(r0) {
                case 1: goto L_0x0456;
                case 2: goto L_0x0428;
                case 3: goto L_0x03b6;
                case 4: goto L_0x0394;
                case 5: goto L_0x045c;
                case 6: goto L_0x0462;
                case 7: goto L_0x03f8;
                default: goto L_0x0394;
            }
        L_0x0394:
            com.google.common.collect.ImmutableList$Builder r3 = new com.google.common.collect.ImmutableList$Builder
            r3.<init>()
            java.util.List r0 = r2.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x039f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0468
            java.lang.Object r0 = r2.next()
            X.Txp r0 = (X.C14529Txp) r0
            X.0qQ.A0A(r0)
            X.Vga r0 = A00(r0)
            r3.add(r0)
            goto L_0x039f
        L_0x03b6:
            java.util.List r0 = r2.A01
            java.util.Iterator r11 = r0.iterator()
            r4 = 0
            r0 = r4
        L_0x03be:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x03ed
            java.lang.Object r9 = r11.next()
            X.Txp r9 = (X.C14529Txp) r9
            java.lang.String r10 = r9.A01
            java.lang.String r2 = "type"
            boolean r2 = r2.equalsIgnoreCase(r10)
            if (r2 == 0) goto L_0x03dc
            X.Uyz r3 = X.C16663Uyz.STRING
            X.Uyz r2 = r9.A00
            if (r3 != r2) goto L_0x03dc
            java.lang.String r4 = r9.A02
        L_0x03dc:
            java.lang.String r2 = "value"
            boolean r2 = r2.equalsIgnoreCase(r10)
            if (r2 == 0) goto L_0x03be
            X.Uyz r3 = X.C16663Uyz.STRING
            X.Uyz r2 = r9.A00
            if (r3 != r2) goto L_0x03be
            java.lang.String r0 = r9.A02
            goto L_0x03be
        L_0x03ed:
            if (r4 == 0) goto L_0x049f
            if (r0 == 0) goto L_0x0497
            X.Txm r3 = new X.Txm
            r3.<init>(r4, r0)
            goto L_0x0481
        L_0x03f8:
            java.util.List r0 = r2.A01
            java.util.Iterator r9 = r0.iterator()
            r0 = 0
        L_0x03ff:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x041e
            java.lang.Object r4 = r9.next()
            X.Txp r4 = (X.C14529Txp) r4
            java.lang.String r3 = r4.A01
            java.lang.String r2 = "event_name"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x03ff
            X.Uyz r3 = X.C16663Uyz.STRING
            X.Uyz r2 = r4.A00
            if (r3 != r2) goto L_0x03ff
            java.lang.String r0 = r4.A02
            goto L_0x03ff
        L_0x041e:
            if (r0 == 0) goto L_0x04a7
            X.WKH r3 = new X.WKH
            r3.<init>()
            r3.A00 = r0
            goto L_0x0481
        L_0x0428:
            java.util.List r0 = r2.A01
            java.util.Iterator r9 = r0.iterator()
            r0 = 0
        L_0x042f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x044e
            java.lang.Object r4 = r9.next()
            X.Txp r4 = (X.C14529Txp) r4
            java.lang.String r3 = r4.A01
            java.lang.String r2 = "document"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x042f
            X.Uyz r3 = X.C16663Uyz.STRING
            X.Uyz r2 = r4.A00
            if (r3 != r2) goto L_0x042f
            java.lang.String r0 = r4.A02
            goto L_0x042f
        L_0x044e:
            if (r0 == 0) goto L_0x04af
            X.WKI r3 = new X.WKI
            r3.<init>(r0)
            goto L_0x0481
        L_0x0456:
            X.WKD r3 = new X.WKD
            r3.<init>()
            goto L_0x0481
        L_0x045c:
            X.WKE r3 = new X.WKE
            r3.<init>()
            goto L_0x0481
        L_0x0462:
            X.WKF r3 = new X.WKF
            r3.<init>()
            goto L_0x0481
        L_0x0468:
            java.lang.String r2 = r4.name()
            java.util.Locale r0 = java.util.Locale.US
            X.0qQ.A08(r0)
            java.lang.String r2 = r2.toLowerCase(r0)
            X.0qQ.A07(r2)
            com.google.common.collect.ImmutableList r0 = r3.build()
            X.WKG r3 = new X.WKG
            r3.<init>(r0, r2)
        L_0x0481:
            r7.add(r3)
            goto L_0x0377
        L_0x0486:
            com.google.common.collect.ImmutableList r2 = r7.build()
            X.0qQ.A07(r2)
            X.9Iu r0 = new X.9Iu
            r0.<init>((com.google.common.collect.ImmutableList) r2, (java.lang.String) r6)
            r5.add(r0)
            goto L_0x0355
        L_0x0497:
            java.lang.String r1 = "Value is null in LAUNCH_NATIVE_VIEW Action"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x049f:
            java.lang.String r1 = "Type is null in LAUNCH_NATIVE_VIEW Action"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04a7:
            java.lang.String r1 = "Event name is null in SEND_DOCUMENT_EVENT Action"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04af:
            java.lang.String r1 = "Document name is null in LAUNCH_DOCUMENT Action"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04b7:
            java.lang.String r1 = "Showreel Native Action Parameter type is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04bf:
            java.lang.String r1 = "Showreel Native Action Parameter name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04c7:
            com.google.common.collect.ImmutableList$Builder r4 = new com.google.common.collect.ImmutableList$Builder
            r4.<init>()
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x04d2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0506
            java.lang.Object r1 = r3.next()
            X.VSY r1 = (X.VSY) r1
            X.0qQ.A0A(r1)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x04fe
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x04f6
            X.HkA r0 = new X.HkA
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x04d2
        L_0x04f6:
            java.lang.String r1 = "Showreel Native Additional Part template is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x04fe:
            java.lang.String r1 = "Showreel Native Additional Part name is null"
            X.Nn9 r0 = new X.Nn9
            r0.<init>(r1)
            throw r0
        L_0x0506:
            com.google.common.collect.ImmutableList r3 = r24.build()
            X.0qQ.A07(r3)
            com.google.common.collect.ImmutableList r2 = r5.build()
            X.0qQ.A07(r2)
            com.google.common.collect.ImmutableList r1 = r4.build()
            X.0qQ.A07(r1)
            X.GYt r0 = new X.GYt
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14530Txq.A01(X.Q2X, X.Txb):X.GYt");
    }
}
