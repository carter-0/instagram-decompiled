package X;

/* renamed from: X.407  reason: invalid class name */
public final class AnonymousClass407 implements AnonymousClass408 {
    public final C258943zt A00;
    public final C258943zt A01;
    public final AnonymousClass404 A02;
    public final C258993zy A03;
    public final C258833zi A04;
    public final C258743zZ A05;
    public final C258483z9 A06;

    public AnonymousClass407(C258943zt r2, C258943zt r3, AnonymousClass404 r4, C258993zy r5, C258833zi r6, C258743zZ r7, C258483z9 r8) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(r2, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r4, 5);
        0qQ.A0B(r3, 6);
        0qQ.A0B(r8, 7);
        this.A05 = r7;
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r3;
        this.A06 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080 A[Catch:{ Exception -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fe A[Catch:{ Exception -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ X.AnonymousClass40G E3W(X.C258943zt r16, com.facebook.odin.model.OdinContext r17) {
        /*
            r15 = this;
            r6 = 1
            r0 = r17
            X.0qQ.A0B(r0, r6)
            java.util.List r7 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r7)
            java.lang.String r4 = "ml engine error"
            r3 = 0
            X.3zy r5 = r15.A03
            r5.A00()
            X.3zZ r9 = r15.A05
            java.lang.String r1 = r9.CCP()
            java.lang.String r0 = "use_case_name"
            r5.A02(r0, r1)
            java.lang.String r1 = r9.CCS()
            java.lang.String r0 = "use_case_version"
            r5.A02(r0, r1)
            java.lang.Integer r0 = r9.BeZ()
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0063;
                case 2: goto L_0x0066;
                case 3: goto L_0x0069;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r1 = "PYTORCH_BINARY_CLASSIFIER_USING_NEURAL_NET"
        L_0x0036:
            java.lang.String r0 = "predictor_type"
            r5.A02(r0, r1)
            X.3zt r1 = r15.A00
            r0 = 0
            X.40G r0 = r1.ATg(r0)
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            com.facebook.odin.model.FeatureData r0 = (com.facebook.odin.model.FeatureData) r0
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "app_start_type"
            r5.A02(r0, r1)
            int r0 = r7.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "examples_requested"
            r5.A02(r0, r1)
            goto L_0x006c
        L_0x0063:
            java.lang.String r1 = "LITE_BINARY_CLASSIFIER_USING_NEURAL_NET"
            goto L_0x0036
        L_0x0066:
            java.lang.String r1 = "LINEAR_REGRESSION"
            goto L_0x0036
        L_0x0069:
            java.lang.String r1 = "PYTORCH_TEXT_CLASSIFIER"
            goto L_0x0036
        L_0x006c:
            boolean r0 = r9.CTQ()     // Catch:{ Exception -> 0x0207 }
            r10 = 0
            if (r0 != 0) goto L_0x00b1
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "cannot extract features"
        L_0x0077:
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x0207 }
            r2.<init>(r1, r0, r3)     // Catch:{ Exception -> 0x0207 }
        L_0x007c:
            boolean r0 = r2.A02     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r1 = r2.A00     // Catch:{ Exception -> 0x0207 }
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0207 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0207 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ab
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0207 }
            java.text.NumberFormat r7 = java.text.NumberFormat.getInstance(r0)     // Catch:{ Exception -> 0x0207 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0207 }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ Exception -> 0x0207 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x0207 }
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = r7.format(r0)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "score"
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0207 }
            r5.A02(r0, r1)     // Catch:{ Exception -> 0x0207 }
        L_0x00ab:
            r0 = 0
            r5.A04(r6, r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0220
        L_0x00b1:
            boolean r0 = r9.CTQ()     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x00ca
            X.0sn r2 = X.0sn.A00     // Catch:{ Exception -> 0x0207 }
        L_0x00b9:
            boolean r0 = r9.CZg()     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x017f
            boolean r0 = r9.CdU()     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x017f
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "cannot train and cannot predict"
            goto L_0x0077
        L_0x00ca:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0207 }
            r2.<init>()     // Catch:{ Exception -> 0x0207 }
            java.util.Iterator r14 = r7.iterator()     // Catch:{ Exception -> 0x0207 }
        L_0x00d3:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x016b
            java.lang.Object r12 = r14.next()     // Catch:{ Exception -> 0x0207 }
            com.facebook.odin.model.OdinContext r12 = (com.facebook.odin.model.OdinContext) r12     // Catch:{ Exception -> 0x0207 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0207 }
            r1.<init>()     // Catch:{ Exception -> 0x0207 }
            X.3zt r0 = r15.A01     // Catch:{ Exception -> 0x0207 }
            X.40G r7 = r0.ATg(r12)     // Catch:{ Exception -> 0x0207 }
            boolean r0 = r7.A02     // Catch:{ Exception -> 0x0207 }
            java.lang.String r11 = "example_error"
            java.lang.String r8 = "error_point"
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x0207 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0207 }
            r1.addAll(r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0102
        L_0x00fa:
            java.lang.String r0 = r7.A01     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x00ff
            r0 = r11
        L_0x00ff:
            r5.A03(r8, r0)     // Catch:{ Exception -> 0x0207 }
        L_0x0102:
            r0 = r16
            if (r16 == 0) goto L_0x0115
            X.40G r7 = r0.ATg(r12)     // Catch:{ Exception -> 0x0207 }
            boolean r0 = r7.A02     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x0207 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0207 }
            r1.addAll(r0)     // Catch:{ Exception -> 0x0207 }
        L_0x0115:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0207 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d3
            X.0qQ.A0B(r12, r6)     // Catch:{ Exception -> 0x0207 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Exception -> 0x0207 }
            r11.<init>()     // Catch:{ Exception -> 0x0207 }
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)     // Catch:{ Exception -> 0x0207 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x0207 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0207 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Exception -> 0x0207 }
        L_0x0134:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x0154
            java.lang.Object r7 = r8.next()     // Catch:{ Exception -> 0x0207 }
            com.facebook.odin.model.FeatureData r7 = (com.facebook.odin.model.FeatureData) r7     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = r7.A03     // Catch:{ Exception -> 0x0207 }
            X.0eP r0 = new X.0eP     // Catch:{ Exception -> 0x0207 }
            r0.<init>(r1, r7)     // Catch:{ Exception -> 0x0207 }
            r13.add(r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0134
        L_0x014b:
            java.lang.String r0 = r7.A01     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x0150
            r11 = r0
        L_0x0150:
            r5.A03(r8, r11)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0115
        L_0x0154:
            X.0Yt.A0F(r13, r11)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r8 = r12.A01     // Catch:{ Exception -> 0x0207 }
            r7 = 0
            r0 = 30
            com.facebook.odin.model.ExampleContext r1 = new com.facebook.odin.model.ExampleContext     // Catch:{ Exception -> 0x0207 }
            r1.<init>(r7, r8, r0)     // Catch:{ Exception -> 0x0207 }
            com.facebook.odin.model.Example r0 = new com.facebook.odin.model.Example     // Catch:{ Exception -> 0x0207 }
            r0.<init>(r1, r8, r11)     // Catch:{ Exception -> 0x0207 }
            r2.add(r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x00d3
        L_0x016b:
            int r0 = r2.size()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "examples_extracted"
            r5.A02(r0, r1)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "example_extraction_complete"
            r5.A01(r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x00b9
        L_0x017f:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x018b
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "no examples extracted"
            goto L_0x0077
        L_0x018b:
            int r8 = r2.size()     // Catch:{ Exception -> 0x0207 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0207 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0207 }
        L_0x0194:
            if (r10 >= r8) goto L_0x01a5
            r0 = -4511741717132607488(0xc16312d000000000, double:-1.0E7)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0207 }
            r7.add(r0)     // Catch:{ Exception -> 0x0207 }
            int r10 = r10 + 1
            goto L_0x0194
        L_0x01a5:
            boolean r0 = r9.CZg()     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x01c1
            X.3zi r0 = r15.A04     // Catch:{ Exception -> 0x0207 }
            X.40G r1 = r0.E3X(r5, r2)     // Catch:{ Exception -> 0x0207 }
            boolean r0 = r1.A02     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x01bd
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x0207 }
            X.40G r2 = X.AnonymousClass40H.A00(r1, r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x007c
        L_0x01bd:
            java.lang.Object r7 = r1.A00     // Catch:{ Exception -> 0x0207 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x0207 }
        L_0x01c1:
            boolean r0 = r9.CdU()     // Catch:{ Exception -> 0x0207 }
            if (r0 == 0) goto L_0x01e6
            int r1 = r2.size()     // Catch:{ Exception -> 0x0207 }
            int r0 = r7.size()     // Catch:{ Exception -> 0x0207 }
            if (r1 == r0) goto L_0x01ee
            java.lang.String r8 = "Example Size : "
            int r2 = r2.size()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = " Prediction Size: "
            int r0 = r7.size()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = X.002.A02(r2, r0, r8, r1)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "example_size_dont_match_prediction"
            r5.A03(r0, r1)     // Catch:{ Exception -> 0x0207 }
        L_0x01e6:
            r0 = 0
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x0207 }
            r2.<init>(r7, r0, r6)     // Catch:{ Exception -> 0x0207 }
            goto L_0x007c
        L_0x01ee:
            java.lang.String r0 = "features storing started"
            r5.A01(r0)     // Catch:{ Exception -> 0x0207 }
            X.3z9 r1 = r15.A06     // Catch:{ Exception -> 0x0207 }
            X.47z r0 = new X.47z     // Catch:{ Exception -> 0x0207 }
            r0.<init>(r15, r2, r7)     // Catch:{ Exception -> 0x0207 }
            r1.execute(r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x01e6
        L_0x01fe:
            java.lang.String r0 = r2.A01     // Catch:{ Exception -> 0x0207 }
            if (r0 != 0) goto L_0x0203
            r0 = r4
        L_0x0203:
            r5.A04(r3, r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0220
        L_0x0207:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L_0x020f
            r0 = r4
        L_0x020f:
            r5.A04(r3, r0)
            X.0sn r1 = X.0sn.A00
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x021b
            r4 = r0
        L_0x021b:
            X.40G r2 = new X.40G
            r2.<init>(r1, r4, r3)
        L_0x0220:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0237
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0237
            java.lang.Object r0 = r1.get(r3)
        L_0x0232:
            X.40G r0 = X.AnonymousClass40H.A00(r2, r0)
            return r0
        L_0x0237:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x0232
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass407.E3W(X.3zt, com.facebook.odin.model.OdinContext):X.40G");
    }
}
