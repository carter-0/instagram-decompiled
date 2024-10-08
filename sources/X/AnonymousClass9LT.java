package X;

/* renamed from: X.9LT  reason: invalid class name */
public final class AnonymousClass9LT extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LT(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.2dQ} */
    /* JADX WARNING: type inference failed for: r3v16, types: [X.5oe, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r0v87, types: [X.7e4, X.0Ya] */
    /* JADX WARNING: type inference failed for: r0v89, types: [X.7e6, X.0Ya] */
    /* JADX WARNING: type inference failed for: r2v13, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0060, code lost:
        X.AnonymousClass0fU.A00(new X.C64273LXz(r2, r1), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x024c, code lost:
        r0 = r0[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0273, code lost:
        r0 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0276, code lost:
        r3 = (X.2XO) r2.CDM(r12, r0);
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x028c, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x028d, code lost:
        r0 = r0[r5];
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x028f, code lost:
        r3 = (X.2XO) r2.CDM(r12, r0);
        r0 = java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0299, code lost:
        r4.A02(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x02a9, code lost:
        r3 = (X.2XO) r1.CDM(r12, r0[r2]);
        r0 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x02b5, code lost:
        r4.A02(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x03d7, code lost:
        if (r12.get() == null) goto L_0x03d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x053c;
                case 1: goto L_0x0531;
                case 2: goto L_0x051e;
                case 3: goto L_0x0371;
                case 4: goto L_0x0509;
                case 5: goto L_0x0335;
                case 6: goto L_0x032c;
                case 7: goto L_0x04e2;
                case 8: goto L_0x04b6;
                case 9: goto L_0x02e0;
                case 10: goto L_0x02ba;
                case 11: goto L_0x04a6;
                case 12: goto L_0x048c;
                case 13: goto L_0x029e;
                case 14: goto L_0x0282;
                case 15: goto L_0x0269;
                case 16: goto L_0x025c;
                case 17: goto L_0x024f;
                case 18: goto L_0x0240;
                case 19: goto L_0x0233;
                case 20: goto L_0x0228;
                case 21: goto L_0x021d;
                case 22: goto L_0x01f2;
                case 23: goto L_0x01c7;
                case 24: goto L_0x01a5;
                case 25: goto L_0x0197;
                case 26: goto L_0x0189;
                case 27: goto L_0x017b;
                case 28: goto L_0x0157;
                case 29: goto L_0x0133;
                case 30: goto L_0x0111;
                case 31: goto L_0x00ef;
                case 32: goto L_0x00cd;
                case 33: goto L_0x00b2;
                case 34: goto L_0x0098;
                case 35: goto L_0x007d;
                case 36: goto L_0x047d;
                case 37: goto L_0x03c0;
                case 38: goto L_0x046c;
                case 39: goto L_0x0069;
                case 40: goto L_0x03df;
                case 41: goto L_0x0056;
                case 42: goto L_0x004b;
                case 43: goto L_0x003e;
                case 44: goto L_0x0030;
                case 45: goto L_0x03c0;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x000f;
                case 49: goto L_0x0380;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r12)
        L_0x000c:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x000f:
            java.util.Map r12 = (java.util.Map) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r0 = (com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository) r0
            X.2CO r4 = r0.A02
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599946067644059(0x82077500290e9b, double:3.2092914971071285E-306)
            long r0 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A02(r0, r12)
            goto L_0x000c
        L_0x0030:
            X.27H r12 = (X.AnonymousClass27H) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.6hr r0 = (X.C314226hr) r0
            X.C314226hr.A04(r12, r0)
            goto L_0x000c
        L_0x003e:
            X.5nL r12 = (X.C294975nL) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.6iU r0 = (X.C314576iU) r0
            r0.A01 = r12
            goto L_0x000c
        L_0x004b:
            android.view.View r12 = (android.view.View) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r2 = r11.A01
            r1 = 33
            goto L_0x0060
        L_0x0056:
            android.view.View r12 = (android.view.View) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r2 = r11.A01
            r1 = 31
        L_0x0060:
            X.LXz r0 = new X.LXz
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r12)
            goto L_0x000c
        L_0x0069:
            java.lang.Number r12 = (java.lang.Number) r12
            long r2 = r12.longValue()
            java.lang.Object r1 = r11.A01
            X.2bq r1 = (X.2bq) r1
            android.util.SparseIntArray r0 = X.2bq.A02
            com.facebook.quicklog.reliability.UserFlowLogger r1 = r1.A01
            java.lang.String r0 = "logic_constraint"
            r1.flowEndCancel(r2, r0)
            goto L_0x000c
        L_0x007d:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r1 = X.AnonymousClass2Y3.A01
            X.0YZ[] r0 = X.AnonymousClass2Y3.A02
            r0 = r0[r2]
            java.lang.Object r3 = r1.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0299
        L_0x0098:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r1 = X.AnonymousClass2Y3.A01
            X.0YZ[] r0 = X.AnonymousClass2Y3.A02
            r0 = r0[r2]
            java.lang.Object r3 = r1.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0299
        L_0x00b2:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.0w6 r1 = X.AnonymousClass2Y3.A01
            X.0YZ[] r0 = X.AnonymousClass2Y3.A02
            r0 = r0[r2]
            java.lang.Object r3 = r1.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02b5
        L_0x00cd:
            X.2Xw r12 = (X.AnonymousClass2Xw) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XO r1 = r12.A01()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r0)
            X.2XO r3 = r12.A00()
            r0 = 700(0x2bc, double:3.46E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0299
        L_0x00ef:
            X.2Xw r12 = (X.AnonymousClass2Xw) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XO r1 = r12.A01()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r0)
            X.2XO r3 = r12.A00()
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0299
        L_0x0111:
            X.2Xw r12 = (X.AnonymousClass2Xw) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XO r1 = r12.A01()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r0)
            X.2XO r3 = r12.A00()
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0299
        L_0x0133:
            X.2Xw r12 = (X.AnonymousClass2Xw) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XO r1 = r12.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r0)
            X.2XO r3 = r12.A00()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0299
        L_0x0157:
            X.2Xw r12 = (X.AnonymousClass2Xw) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.2XO r1 = r12.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r0)
            X.2XO r3 = r12.A00()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x02b5
        L_0x017b:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r2 = X.AnonymousClass2Xr.A01
            X.0YZ[] r0 = X.AnonymousClass2Xr.A02
            goto L_0x024c
        L_0x0189:
            r5 = 0
            X.0qQ.A0B(r12, r5)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r2 = X.AnonymousClass2Xr.A01
            X.0YZ[] r0 = X.AnonymousClass2Xr.A02
            goto L_0x028d
        L_0x0197:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.0w6 r1 = X.AnonymousClass2Xr.A01
            X.0YZ[] r0 = X.AnonymousClass2Xr.A02
            goto L_0x02a9
        L_0x01a5:
            r5 = 0
            X.0qQ.A0B(r12, r5)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r1 = X.C70902Xm.A01
            X.0YZ[] r3 = X.C70902Xm.A03
            r0 = r3[r5]
            java.lang.Object r2 = r1.CDM(r12, r0)
            X.2XO r2 = (X.2XO) r2
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A02(r2, r0)
            X.0w6 r2 = X.C70902Xm.A02
            r0 = r3[r1]
            goto L_0x028f
        L_0x01c7:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r1 = X.C70902Xm.A01
            X.0YZ[] r3 = X.C70902Xm.A03
            r0 = r3[r0]
            java.lang.Object r1 = r1.CDM(r12, r0)
            X.2XO r1 = (X.2XO) r1
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r4.A02(r1, r2)
            X.0w6 r1 = X.C70902Xm.A02
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r12, r0)
            X.2XO r0 = (X.2XO) r0
            r4.A02(r0, r2)
            goto L_0x000c
        L_0x01f2:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.0w6 r1 = X.C70902Xm.A01
            X.0YZ[] r3 = X.C70902Xm.A03
            r0 = r3[r2]
            java.lang.Object r0 = r1.CDM(r12, r0)
            X.2XO r0 = (X.2XO) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.A02(r0, r2)
            X.0w6 r1 = X.C70902Xm.A02
            r0 = 1
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r12, r0)
            X.2XO r0 = (X.2XO) r0
            r4.A02(r0, r2)
            goto L_0x000c
        L_0x021d:
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2Xh r12 = X.AnonymousClass2Xh.A00
            X.0w6 r2 = X.AnonymousClass2Xh.A01
            X.0YZ[] r1 = X.AnonymousClass2Xh.A02
            goto L_0x0273
        L_0x0228:
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2Xh r12 = X.AnonymousClass2Xh.A00
            X.0w6 r2 = X.AnonymousClass2Xh.A01
            X.0YZ[] r0 = X.AnonymousClass2Xh.A02
            goto L_0x028c
        L_0x0233:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.0w6 r1 = X.AnonymousClass2Xh.A01
            X.0YZ[] r0 = X.AnonymousClass2Xh.A02
            goto L_0x02a9
        L_0x0240:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r2 = X.AnonymousClass2Xc.A01
            X.0YZ[] r0 = X.AnonymousClass2Xc.A02
        L_0x024c:
            r0 = r0[r1]
            goto L_0x0276
        L_0x024f:
            r5 = 0
            X.0qQ.A0B(r12, r5)
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.0w6 r2 = X.AnonymousClass2Xc.A01
            X.0YZ[] r0 = X.AnonymousClass2Xc.A02
            goto L_0x028d
        L_0x025c:
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.0w6 r1 = X.AnonymousClass2Xc.A01
            X.0YZ[] r0 = X.AnonymousClass2Xc.A02
            goto L_0x02a9
        L_0x0269:
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XE r12 = X.AnonymousClass2XE.A00
            X.0w6 r2 = X.AnonymousClass2XE.A01
            X.0YZ[] r1 = X.AnonymousClass2XE.A02
        L_0x0273:
            r0 = 0
            r0 = r1[r0]
        L_0x0276:
            java.lang.Object r3 = r2.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0299
        L_0x0282:
            java.lang.Object r4 = r11.A01
            X.2XS r4 = (X.2XS) r4
            X.2XE r12 = X.AnonymousClass2XE.A00
            X.0w6 r2 = X.AnonymousClass2XE.A01
            X.0YZ[] r0 = X.AnonymousClass2XE.A02
        L_0x028c:
            r5 = 0
        L_0x028d:
            r0 = r0[r5]
        L_0x028f:
            java.lang.Object r3 = r2.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x0299:
            r4.A02(r3, r0)
            goto L_0x000c
        L_0x029e:
            java.lang.Object r4 = r11.A01
            X.2XJ r4 = (X.2XJ) r4
            X.2XE r12 = X.AnonymousClass2XE.A00
            X.0w6 r1 = X.AnonymousClass2XE.A01
            X.0YZ[] r0 = X.AnonymousClass2XE.A02
            r2 = 0
        L_0x02a9:
            r0 = r0[r2]
            java.lang.Object r3 = r1.CDM(r12, r0)
            X.2XO r3 = (X.2XO) r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x02b5:
            r4.A02(r3, r0)
            goto L_0x000c
        L_0x02ba:
            X.2WE r12 = (X.2WE) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r3 = r11.A01
            X.7dv r3 = (X.C336017dv) r3
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7e4 r0 = X.C336107e4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.A00(r1, r2, r0)
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7e6 r0 = X.C336117e6.A00
            r12.A00(r1, r2, r0)
            goto L_0x000c
        L_0x02e0:
            X.2WE r12 = (X.2WE) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r3 = r11.A01
            X.3bA r3 = (X.C244423bA) r3
            com.instagram.api.schemas.RingSpec r0 = r3.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 40
            X.JFt r0 = new X.JFt
            r0.<init>(r3, r1)
            r12.A02(r0, r2)
            java.lang.Float r0 = r3.A03
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 41
            X.JFt r0 = new X.JFt
            r0.<init>(r3, r1)
            r12.A02(r0, r2)
            java.lang.Float r0 = r3.A04
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 42
            X.JFt r0 = new X.JFt
            r0.<init>(r3, r1)
            r12.A02(r0, r2)
            X.3b8 r0 = r3.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 43
            X.JFt r0 = new X.JFt
            r0.<init>(r3, r1)
            r12.A02(r0, r2)
            goto L_0x000c
        L_0x032c:
            java.lang.Object r0 = r11.A01
            X.1EO r0 = (X.AnonymousClass1EO) r0
            r0.cancel()
            goto L_0x000c
        L_0x0335:
            com.facebook.msys.mca.Mailbox r12 = (com.facebook.msys.mca.Mailbox) r12
            r4 = 0
            X.0qQ.A0B(r12, r4)
            com.facebook.msys.mca.MailboxFeature r0 = com.facebook.msys.mca.MailboxFeature.$redex_init_class
            X.Mcg r0 = new X.Mcg
            r0.<init>(r12)
            X.5oe r3 = new X.5oe
            r3.<init>(r0)
            X.68J r0 = r3.mMailboxApiHandleMetaProvider
            X.68L r1 = r0.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = new com.facebook.msys.mca.MailboxFutureImpl
            r2.<init>(r1)
            X.5of r0 = new X.5of
            r0.<init>(r3, r2)
            boolean r0 = r1.EJd(r0)
            if (r0 != 0) goto L_0x0360
            r2.cancel(r4)
        L_0x0360:
            r0 = 222397358(0xd4183ae, float:5.963122E-31)
            X.0nX r1 = new X.0nX
            r1.<init>(r0)
            java.lang.Object r0 = r11.A01
            com.facebook.msys.mca.MailboxCallback r0 = (com.facebook.msys.mca.MailboxCallback) r0
            r2.addResultCallback(r1, r0)
            goto L_0x000c
        L_0x0371:
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            java.lang.Object r0 = r11.A01
            X.339 r0 = (X.AnonymousClass339) r0
            r0.AAo(r1)
            goto L_0x000c
        L_0x0380:
            android.content.Context r12 = (android.content.Context) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r1 = r11.A01
            r0 = 12
            X.Dj8 r4 = new X.Dj8
            r4.<init>(r1, r0)
            r3 = 2131976919(0x7f1362d7, float:1.9590972E38)
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r2 = r0.getString(r1)
            X.0qQ.A07(r2)
            android.content.res.Resources r1 = r12.getResources()
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            android.text.Spanned r0 = X.0bC.A00(r1, r0, r3)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            int r0 = X.2Yu.A06(r12)
            int r0 = r12.getColor(r0)
            X.AnonymousClass7AV.A06(r3, r4, r2, r0)
            return r3
        L_0x03c0:
            java.lang.ref.Reference r12 = (java.lang.ref.Reference) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r1 = r12.get()
            java.lang.Object r0 = r11.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x03d9
            java.lang.Object r1 = r12.get()
            r0 = 0
            if (r1 != 0) goto L_0x03da
        L_0x03d9:
            r0 = 1
        L_0x03da:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x03df:
            X.9JK r12 = (X.AnonymousClass9JK) r12
            r9 = 0
            X.0qQ.A0B(r12, r9)
            java.lang.Object r7 = r11.A01
            X.6iR r7 = (X.C314546iR) r7
            java.lang.String r8 = r12.A04
            java.lang.Object r4 = r12.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.String r5 = r12.A03
            X.0eM r3 = r7.A0B
            java.lang.Object r0 = r3.getValue()
            X.0qQ.A07(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131629501(0x7f0e15bd, float:1.8886325E38)
            X.0eM r0 = r7.A0H
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r6 = r2.inflate(r1, r0, r9)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            boolean r0 = r10 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x0467
            X.2dQ r10 = (X.C71492dQ) r10
            if (r10 == 0) goto L_0x0467
            java.lang.Object r0 = r3.getValue()
            X.0qQ.A07(r0)
            android.content.Context r0 = (android.content.Context) r0
            int r0 = X.AnonymousClass0nB.A01(r0)
            double r2 = (double) r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r0
            int r0 = X.AnonymousClass1GB.A00(r2)
            r10.A0d = r0
        L_0x0432:
            r6.setLayoutParams(r10)
            r6.setVisibility(r9)
            int r0 = android.view.View.generateViewId()
            r6.setId(r0)
            r6.setTag(r8)
            X.9Yk r2 = new X.9Yk
            r2.<init>(r6)
            X.0iw r1 = r7.A01
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r5)
            if (r4 == 0) goto L_0x0461
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.setUrl(r4, r1)
        L_0x0461:
            android.view.View r3 = r2.itemView
            X.0qQ.A06(r3)
            return r3
        L_0x0467:
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            goto L_0x0432
        L_0x046c:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r12)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x047d:
            java.lang.String r12 = (java.lang.String) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            com.instagram.pendingmedia.store.PendingMediaStore r0 = (com.instagram.pendingmedia.store.PendingMediaStore) r0
            X.3Q2 r3 = r0.A03(r12)
            return r3
        L_0x048c:
            X.5Gl r12 = (X.C283185Gl) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.5Gg r0 = (X.C283135Gg) r0
            int r5 = r0.A00
            boolean r4 = r12.A03
            boolean r6 = r12.A04
            boolean r7 = r12.A02
            boolean r8 = r12.A01
            X.5Gl r3 = new X.5Gl
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x04a6:
            X.1GU r12 = (X.AnonymousClass1GU) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r0 = r11.A01
            X.2lr r0 = (X.C228552lr) r0
            X.2mP r3 = new X.2mP
            r3.<init>(r12, r0, r1, r1)
            return r3
        L_0x04b6:
            java.lang.String r12 = (java.lang.String) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.Object r1 = r11.A01
            com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo r1 = (com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo) r1
            boolean r0 = r1.shouldUseRegionHint(r12)
            if (r0 == 0) goto L_0x04d4
            java.lang.String r1 = r1.getRegionHint()
            java.lang.String r0 = "x-ig-graphql-region-hint"
            r3.put(r0, r1)
        L_0x04d4:
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r1 = r1.A05(r0)
            java.lang.String r0 = "X-IG-Device-ID"
            r3.put(r0, r1)
            return r3
        L_0x04e2:
            java.lang.String r1 = X.C61930qI.A00()
            r0 = 2099(0x833, float:2.941E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r2 = r1.A05(r0)
            java.lang.String r1 = "X-IG-Device-ID"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r3, r0}
            java.util.LinkedHashMap r3 = X.0Yt.A06(r0)
            return r3
        L_0x0509:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r1 = r12.getValue()
            java.lang.Object r0 = r11.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x051e:
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            java.lang.Object r0 = r11.A01
            X.339 r0 = (X.AnonymousClass339) r0
            int r0 = r0.AFA(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0531:
            X.HGy r12 = (X.C54512HGy) r12
            java.lang.Object r0 = r11.A01
            X.339 r0 = (X.AnonymousClass339) r0
            java.lang.Integer r3 = r0.B2a(r12)
            return r3
        L_0x053c:
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            java.lang.Object r0 = r11.A01
            X.339 r0 = (X.AnonymousClass339) r0
            float r0 = r0.AiC(r1)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LT.invoke(java.lang.Object):java.lang.Object");
    }
}
