package X;

public final class DIL implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DIL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e7, code lost:
        if (r12 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031e, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0468, code lost:
        if (r8 != null) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x046d, code lost:
        r6 = ((X.C239793Ih) r6).A00;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0472, code lost:
        r6 = new X.C56135HtN(new X.C56551I1f((java.lang.String) null, r4), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, X.0sn.A00);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0482, code lost:
        r5.A00 = r4 ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0488, code lost:
        if (r2.emit(r6, r5) != r0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x048a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04d1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0145, code lost:
        if (r12 != null) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0242 A[LOOP:5: B:112:0x023c->B:114:0x0242, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = r18
            r6 = r19
            int r0 = r3.A00
            r8 = r20
            switch(r0) {
                case 0: goto L_0x0491;
                case 1: goto L_0x02f2;
                default: goto L_0x000b;
            }
        L_0x000b:
            r7 = 10
            boolean r0 = X.C58075Il7.A02(r7, r8)
            if (r0 == 0) goto L_0x0031
            r5 = r8
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0021:
            java.lang.Object r2 = r5.A02
            X.1Hj r0 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r4) goto L_0x031e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.Il7 r5 = new X.Il7
            r5.<init>(r3, r8, r7)
            goto L_0x0021
        L_0x0037:
            X.0eS.A00(r2)
            java.lang.Object r2 = r3.A03
            X.02o r2 = (X.02o) r2
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0259
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r9 = r6.A00
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.BWu> r8 = X.C42251BWu.class
            java.lang.String r6 = "xfb_genai_wwai_suggestion_stream_mutation(input:$input)"
            r1 = -1629499129(0xffffffff9edfd107, float:-2.3697495E-20)
            X.3lr r12 = r9.A03(r8, r6, r1)
            X.3lr r10 = r9.A03(r8, r6, r1)
            r16 = 0
            if (r10 == 0) goto L_0x00df
            java.lang.Class<X.BWt> r9 = X.C42250BWt.class
            r8 = 5
            java.lang.String r6 = "user_interactions"
            r1 = 556682527(0x212e4d1f, float:5.905556E-19)
            X.3lr r1 = r10.getOptionalTreeField(r8, r6, r9, r1)
            if (r1 == 0) goto L_0x00df
            java.lang.String r15 = X.C41845B3m.A0k(r1)
        L_0x006f:
            r14 = 0
            if (r12 == 0) goto L_0x0141
            java.lang.Class<X.BWs> r9 = X.C42249BWs.class
            r8 = 4
            java.lang.String r6 = "response"
            r1 = 285556134(0x11053da6, float:1.0510847E-28)
            X.3lr r9 = r12.getOptionalTreeField(r8, r6, r9, r1)
            if (r9 == 0) goto L_0x0141
            java.lang.Class<X.BWr> r8 = X.C42248BWr.class
            java.lang.String r6 = "tentative_suggestions"
            r1 = 770112000(0x2de6fa00, float:2.6258995E-11)
            X.3lr r9 = r9.getOptionalTreeField(r14, r6, r8, r1)
            if (r9 == 0) goto L_0x0141
            java.lang.Class<X.BWq> r8 = X.C42247BWq.class
            java.lang.String r6 = "edges"
            r1 = 12875420(0xc4769c, float:1.8042306E-38)
            com.google.common.collect.ImmutableList r1 = r9.getRequiredCompactedTreeListField(r14, r6, r8, r1)
            if (r1 == 0) goto L_0x0141
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r1.iterator()
        L_0x00a2:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r8 = r13.next()
            r11 = r8
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x00a2
            java.lang.Class<X.BWp> r10 = X.C42246BWp.class
            java.lang.String r9 = "node"
            r1 = -655610887(0xffffffffd8ec2bf9, float:-2.07738884E15)
            X.3lr r11 = r11.A03(r10, r9, r1)
            if (r11 == 0) goto L_0x00a2
            java.lang.Class<X.BWn> r10 = X.C42244BWn.class
            java.lang.String r9 = "XFBWriteWithAITentativeSuggestion"
            r1 = 515623217(0x1ebbc931, float:1.9882606E-20)
            X.3lr r9 = r11.reinterpretIfFulfillsType(r4, r9, r10, r1)
            if (r9 == 0) goto L_0x00a2
            java.lang.String r1 = "suggestion_id"
            java.lang.String r1 = r9.getOptionalStringField(r14, r1)
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "suggestion"
            java.lang.String r1 = r9.getOptionalStringField(r4, r1)
            if (r1 == 0) goto L_0x00a2
            r6.add(r8)
            goto L_0x00a2
        L_0x00df:
            r15 = r16
            goto L_0x006f
        L_0x00e2:
            int r1 = X.0Yv.A1E(r6, r7)
            int r1 = X.AnonymousClass7TG.A01(r1)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r1)
            java.util.Iterator r9 = r6.iterator()
        L_0x00f3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0147
            X.3lr r8 = X.C41845B3m.A0V(r9)
            if (r8 == 0) goto L_0x012f
            java.lang.Class<X.BWp> r7 = X.C42246BWp.class
            java.lang.String r6 = "node"
            r1 = -655610887(0xffffffffd8ec2bf9, float:-2.07738884E15)
            X.3lr r8 = r8.A03(r7, r6, r1)
            if (r8 == 0) goto L_0x012f
            java.lang.Class<X.BWn> r7 = X.C42244BWn.class
            java.lang.String r6 = "XFBWriteWithAITentativeSuggestion"
            r1 = 515623217(0x1ebbc931, float:1.9882606E-20)
            X.3lr r8 = r8.reinterpretIfFulfillsType(r4, r6, r7, r1)
        L_0x0117:
            java.lang.String r7 = "Required value was null."
            if (r8 == 0) goto L_0x013c
            java.lang.String r1 = "suggestion_id"
            java.lang.String r6 = r8.getOptionalStringField(r14, r1)
            if (r6 == 0) goto L_0x0137
            java.lang.String r1 = "suggestion"
            java.lang.String r1 = r8.getOptionalStringField(r4, r1)
            if (r1 == 0) goto L_0x0132
            r13.put(r6, r1)
            goto L_0x00f3
        L_0x012f:
            r8 = r16
            goto L_0x0117
        L_0x0132:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x013c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0141:
            X.0sm r13 = X.0Yt.A0E()
            if (r12 == 0) goto L_0x01f8
        L_0x0147:
            java.lang.Class<X.BWs> r8 = X.C42249BWs.class
            r7 = 4
            java.lang.String r6 = "response"
            r1 = 285556134(0x11053da6, float:1.0510847E-28)
            X.3lr r8 = r12.getOptionalTreeField(r7, r6, r8, r1)
            if (r8 == 0) goto L_0x01f8
            java.lang.Class<X.BWr> r7 = X.C42248BWr.class
            java.lang.String r6 = "tentative_suggestions"
            r1 = 770112000(0x2de6fa00, float:2.6258995E-11)
            X.3lr r8 = r8.getOptionalTreeField(r14, r6, r7, r1)
            if (r8 == 0) goto L_0x01f8
            java.lang.Class<X.BWq> r7 = X.C42247BWq.class
            java.lang.String r6 = "edges"
            r1 = 12875420(0xc4769c, float:1.8042306E-38)
            com.google.common.collect.ImmutableList r1 = r8.getRequiredCompactedTreeListField(r14, r6, r7, r1)
            if (r1 == 0) goto L_0x01f8
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r1.iterator()
        L_0x0177:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r10 = r17.next()
            r8 = r10
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x0177
            java.lang.Class<X.BWp> r7 = X.C42246BWp.class
            java.lang.String r6 = "node"
            r1 = -655610887(0xffffffffd8ec2bf9, float:-2.07738884E15)
            X.3lr r9 = r8.A03(r7, r6, r1)
            if (r9 == 0) goto L_0x0177
            java.lang.Class<X.BWo> r8 = X.C42245BWo.class
            r7 = 2
            java.lang.String r6 = "XFBWriteWithAITentativeSuggestionResult"
            r1 = -1279594305(0xffffffffb3baf0bf, float:-8.7050914E-8)
            X.3lr r6 = r9.reinterpretIfFulfillsType(r7, r6, r8, r1)
            if (r6 == 0) goto L_0x0177
            java.lang.String r1 = "suggestion_id"
            java.lang.String r1 = r6.getOptionalStringField(r14, r1)
            if (r1 == 0) goto L_0x0177
            java.lang.String r1 = "result"
            boolean r1 = r6.hasFieldValue(r1)
            if (r1 == 0) goto L_0x0177
            r11.add(r10)
            goto L_0x0177
        L_0x01b5:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r11.iterator()
        L_0x01bd:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x01fb
            X.3lr r9 = X.C41845B3m.A0V(r11)
            if (r9 == 0) goto L_0x01bd
            java.lang.Class<X.BWp> r8 = X.C42246BWp.class
            java.lang.String r7 = "node"
            r1 = -655610887(0xffffffffd8ec2bf9, float:-2.07738884E15)
            X.3lr r10 = r9.A03(r8, r7, r1)
            if (r10 == 0) goto L_0x01bd
            java.lang.Class<X.BWo> r9 = X.C42245BWo.class
            r8 = 2
            java.lang.String r7 = "XFBWriteWithAITentativeSuggestionResult"
            r1 = -1279594305(0xffffffffb3baf0bf, float:-8.7050914E-8)
            X.3lr r7 = r10.reinterpretIfFulfillsType(r8, r7, r9, r1)
            if (r7 == 0) goto L_0x01bd
            java.lang.String r1 = "result"
            boolean r1 = r7.getCoercedBooleanField(r4, r1)
            if (r1 != 0) goto L_0x01bd
            java.lang.String r1 = "suggestion_id"
            java.lang.String r1 = r7.getOptionalStringField(r14, r1)
            if (r1 == 0) goto L_0x01bd
            r6.add(r1)
            goto L_0x01bd
        L_0x01f8:
            r8 = r16
            goto L_0x01ff
        L_0x01fb:
            java.util.Set r8 = X.00k.A0k(r6)
        L_0x01ff:
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.Set r1 = r13.entrySet()
            java.util.Iterator r10 = r1.iterator()
        L_0x020b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0230
            java.lang.Object r9 = r10.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            if (r8 == 0) goto L_0x0224
            java.lang.Object r1 = r9.getKey()
            boolean r1 = r8.contains(r1)
            if (r1 != r4) goto L_0x0224
            goto L_0x020b
        L_0x0224:
            java.lang.Object r6 = r9.getKey()
            java.lang.Object r1 = r9.getValue()
            r7.put(r6, r1)
            goto L_0x020b
        L_0x0230:
            java.util.Collection r1 = r7.values()
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x023c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0262
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            int r8 = r14 + 1
            X.Hsk r7 = new X.Hsk
            r7.<init>(r1, r15)
            X.Hsj r1 = new X.Hsj
            r1.<init>(r7, r14)
            r6.add(r1)
            r14 = r8
            goto L_0x023c
        L_0x0259:
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x02d0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0262:
            int r7 = r6.size()
            java.lang.Object r1 = r3.A02
            X.I1x r1 = (X.C56568I1x) r1
            int r1 = r1.A00
            if (r7 > r1) goto L_0x02ec
            if (r12 == 0) goto L_0x02e5
            java.lang.Class<X.BWm> r8 = X.C42243BWm.class
            java.lang.String r7 = "error_info"
            r1 = 1698479540(0x653cbdb4, float:5.570652E22)
            X.3lr r7 = r12.A03(r8, r7, r1)
            if (r7 == 0) goto L_0x02e5
            java.lang.String r1 = "message"
            java.lang.String r9 = r7.getOptionalStringField(r4, r1)
        L_0x0283:
            java.lang.Class<X.BWm> r10 = X.C42243BWm.class
            r8 = 0
            java.lang.String r7 = "error_info"
            r1 = 1698479540(0x653cbdb4, float:5.570652E22)
            X.3lr r7 = r12.getOptionalTreeField(r8, r7, r10, r1)
            if (r7 == 0) goto L_0x02ea
            java.lang.String r1 = "can_retry"
            boolean r1 = r7.getCoercedBooleanField(r8, r1)
        L_0x0297:
            X.I1f r8 = new X.I1f
            r8.<init>(r9, r1)
            if (r12 == 0) goto L_0x02e0
            java.lang.String r1 = "request_id"
            java.lang.String r9 = r12.getOptionalStringField(r4, r1)
            java.lang.String r1 = "response_id"
            java.lang.String r10 = r12.A09(r1)
            java.lang.String r1 = "tracking"
            java.lang.String r11 = r12.A0A(r1)
        L_0x02b0:
            java.lang.Object r1 = r3.A01
            X.I1x r1 = (X.C56568I1x) r1
            if (r1 == 0) goto L_0x02dd
            X.HtJ r1 = r1.A02
            X.JMY r3 = r1.A00
        L_0x02ba:
            boolean r1 = r3 instanceof X.C57595IdM
            if (r1 == 0) goto L_0x02c4
            X.IdM r3 = (X.C57595IdM) r3
            java.lang.String r1 = r3.A00
            r16 = r1
        L_0x02c4:
            X.HtN r7 = new X.HtN
            r12 = r16
            r13 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.3Ih r6 = X.C41845B3m.A0d(r7)
        L_0x02d0:
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x046d
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0472
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02dd:
            r3 = r16
            goto L_0x02ba
        L_0x02e0:
            r9 = r16
            r10 = r9
            r11 = r9
            goto L_0x02b0
        L_0x02e5:
            r9 = r16
            if (r12 == 0) goto L_0x02ea
            goto L_0x0283
        L_0x02ea:
            r1 = 1
            goto L_0x0297
        L_0x02ec:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>()
            throw r0
        L_0x02f2:
            r4 = 9
            boolean r0 = X.C58075Il7.A02(r4, r8)
            if (r0 == 0) goto L_0x0318
            r5 = r8
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0318
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0308:
            java.lang.Object r2 = r5.A02
            X.1Hj r0 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0323
            if (r1 == r4) goto L_0x031e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0318:
            X.Il7 r5 = new X.Il7
            r5.<init>(r3, r8, r4)
            goto L_0x0308
        L_0x031e:
            X.0eS.A00(r2)
            goto L_0x04cf
        L_0x0323:
            X.0eS.A00(r2)
            java.lang.Object r2 = r3.A03
            X.02o r2 = (X.02o) r2
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x03de
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r9 = r6.A00
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.BWk> r7 = X.C42241BWk.class
            java.lang.String r6 = "xfb_genai_wwai_suggestion_stream_mutation(input:$input)"
            r1 = 540697555(0x203a63d3, float:1.5787842E-19)
            X.3lr r8 = r9.A03(r7, r6, r1)
            X.3lr r11 = r9.A03(r7, r6, r1)
            r1 = 0
            if (r11 == 0) goto L_0x03db
            java.lang.Class<X.BWj> r10 = X.C42240BWj.class
            r9 = 5
            java.lang.String r7 = "user_interactions"
            r6 = -1487239695(0xffffffffa75a85f1, float:-3.0326187E-15)
            X.3lr r6 = r11.getOptionalTreeField(r9, r7, r10, r6)
            if (r6 == 0) goto L_0x03db
            java.lang.String r12 = X.C41845B3m.A0k(r6)
        L_0x035a:
            if (r8 == 0) goto L_0x03e7
            java.lang.Class<X.BWi> r10 = X.C42239BWi.class
            r9 = 4
            java.lang.String r7 = "response"
            r6 = 676326271(0x284feb7f, float:1.1541873E-14)
            X.3lr r10 = r8.getOptionalTreeField(r9, r7, r10, r6)
            if (r10 == 0) goto L_0x03e7
            java.lang.Class<X.BWh> r9 = X.C42238BWh.class
            java.lang.String r7 = "suggestions"
            r6 = 877742938(0x34514b5a, float:1.9492055E-7)
            X.3lr r10 = r10.A03(r9, r7, r6)
            if (r10 == 0) goto L_0x03e7
            java.lang.Class<X.BWg> r9 = X.C42237BWg.class
            java.lang.String r7 = "edges"
            r6 = -1523057508(0xffffffffa537fc9c, float:-1.5958307E-16)
            com.google.common.collect.ImmutableList r6 = r10.A06(r9, r7, r6)
            if (r6 == 0) goto L_0x03e7
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r6.iterator()
        L_0x038c:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x03e9
            X.3lr r15 = X.C41845B3m.A0V(r16)
            java.lang.Class<X.BWf> r14 = X.C42236BWf.class
            r13 = 0
            java.lang.String r11 = "node"
            r9 = -1229628626(0xffffffffb6b55b2e, float:-5.404835E-6)
            X.3lr r10 = r15.getOptionalTreeField(r13, r11, r14, r9)
            if (r10 == 0) goto L_0x03d9
            java.lang.String r6 = "index"
            int r6 = r10.getCoercedIntField(r13, r6)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r6)
        L_0x03af:
            X.3lr r9 = r15.getOptionalTreeField(r13, r11, r14, r9)
            if (r9 == 0) goto L_0x03d7
            java.lang.String r6 = "suggestion"
            java.lang.String r11 = r9.getOptionalStringField(r4, r6)
        L_0x03bb:
            if (r10 == 0) goto L_0x038c
            if (r11 == 0) goto L_0x038c
            boolean r6 = X.00l.A0W(r11)
            if (r6 != 0) goto L_0x038c
            int r10 = r10.intValue()
            X.Hsk r9 = new X.Hsk
            r9.<init>(r11, r12)
            X.Hsj r6 = new X.Hsj
            r6.<init>(r9, r10)
            r7.add(r6)
            goto L_0x038c
        L_0x03d7:
            r11 = r1
            goto L_0x03bb
        L_0x03d9:
            r10 = r1
            goto L_0x03af
        L_0x03db:
            r12 = r1
            goto L_0x035a
        L_0x03de:
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0454
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03e7:
            X.0sn r7 = X.0sn.A00
        L_0x03e9:
            int r9 = r7.size()
            java.lang.Object r6 = r3.A02
            X.I1x r6 = (X.C56568I1x) r6
            int r6 = r6.A00
            if (r9 > r6) goto L_0x048b
            if (r8 == 0) goto L_0x0467
            java.lang.Class<X.BWe> r10 = X.C42235BWe.class
            java.lang.String r9 = "error_info"
            r6 = -1808755000(0xffffffff943096c8, float:-8.9154656E-27)
            X.3lr r9 = r8.A03(r10, r9, r6)
            if (r9 == 0) goto L_0x0467
            java.lang.String r6 = "message"
            java.lang.String r11 = r9.getOptionalStringField(r4, r6)
        L_0x040a:
            java.lang.Class<X.BWe> r12 = X.C42235BWe.class
            r10 = 0
            java.lang.String r9 = "error_info"
            r6 = -1808755000(0xffffffff943096c8, float:-8.9154656E-27)
            X.3lr r9 = r8.getOptionalTreeField(r10, r9, r12, r6)
            if (r9 == 0) goto L_0x046b
            java.lang.String r6 = "can_retry"
            boolean r6 = r9.getCoercedBooleanField(r10, r6)
        L_0x041e:
            X.I1f r9 = new X.I1f
            r9.<init>(r11, r6)
            if (r8 == 0) goto L_0x0463
            java.lang.String r6 = "request_id"
            java.lang.String r10 = r8.getOptionalStringField(r4, r6)
            java.lang.String r6 = "response_id"
            java.lang.String r11 = r8.A09(r6)
            java.lang.String r6 = "tracking"
            java.lang.String r12 = r8.A0A(r6)
        L_0x0437:
            java.lang.Object r3 = r3.A01
            X.I1x r3 = (X.C56568I1x) r3
            if (r3 == 0) goto L_0x0461
            X.HtJ r3 = r3.A02
            X.JMY r6 = r3.A00
        L_0x0441:
            boolean r3 = r6 instanceof X.C57595IdM
            if (r3 == 0) goto L_0x0449
            X.IdM r6 = (X.C57595IdM) r6
            java.lang.String r1 = r6.A00
        L_0x0449:
            X.HtN r8 = new X.HtN
            r14 = r7
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.3Ih r6 = X.C41845B3m.A0d(r8)
        L_0x0454:
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x046d
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0472
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0461:
            r6 = r1
            goto L_0x0441
        L_0x0463:
            r10 = r1
            r11 = r1
            r12 = r1
            goto L_0x0437
        L_0x0467:
            r11 = r1
            if (r8 == 0) goto L_0x046b
            goto L_0x040a
        L_0x046b:
            r6 = 1
            goto L_0x041e
        L_0x046d:
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r6 = r6.A00
            goto L_0x0482
        L_0x0472:
            X.0sn r12 = X.0sn.A00
            r8 = 0
            X.I1f r7 = new X.I1f
            r7.<init>(r8, r4)
            X.HtN r6 = new X.HtN
            r9 = r8
            r10 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0482:
            r5.A00 = r4
            java.lang.Object r1 = r2.emit(r6, r5)
            if (r1 != r0) goto L_0x04cf
            return r0
        L_0x048b:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>()
            throw r0
        L_0x0491:
            int r4 = X.AnonymousClass7TE.A0M(r6)
            java.lang.Object r2 = r3.A03
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1 = 0
            X.DIA r0 = new X.DIA
            r0.<init>(r1)
            java.util.List r0 = X.00k.A0g(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x04a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04d2
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.DQY r0 = (X.DQY) r0
            int r0 = r0.getIndex()
            if (r4 < r0) goto L_0x04a7
        L_0x04ba:
            java.lang.Object r1 = r3.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x04cf
            r1.A00 = r2
            java.lang.Object r0 = r3.A02
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r2)
        L_0x04cf:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x04d2:
            r2 = 0
            goto L_0x04ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIL.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
