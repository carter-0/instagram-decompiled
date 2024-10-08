package X;

public final class MGF extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final long A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGF(Object obj, long j, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = j;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MGF, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r4 = new X.MGF(r5, r6, r12, r9);
        r4.A01 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        return new X.MGF(r1, r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r4 = new X.MGF(r5, r12, r7, r8);
        r4.A02 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            int r0 = r10.A03
            r3 = r12
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0031;
                case 2: goto L_0x0037;
                case 3: goto L_0x003f;
                case 4: goto L_0x0047;
                case 5: goto L_0x004f;
                case 6: goto L_0x005e;
                case 7: goto L_0x0066;
                case 8: goto L_0x0016;
                case 9: goto L_0x0073;
                case 10: goto L_0x007c;
                case 11: goto L_0x001d;
                case 12: goto L_0x0085;
                case 13: goto L_0x008e;
                case 14: goto L_0x0097;
                case 15: goto L_0x00a0;
                case 16: goto L_0x0024;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r10.A01
            long r8 = r10.A04
            r7 = 17
        L_0x000c:
            X.MGF r0 = new X.MGF
            r4 = r0
            r6 = r12
            r4.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7, (long) r8)
            r0.A02 = r11
            return r0
        L_0x0016:
            long r8 = r10.A04
            java.lang.Object r5 = r10.A01
            r7 = 8
            goto L_0x000c
        L_0x001d:
            java.lang.Object r5 = r10.A01
            long r8 = r10.A04
            r7 = 11
            goto L_0x000c
        L_0x0024:
            java.lang.Object r5 = r10.A01
            long r8 = r10.A04
            r7 = 16
            goto L_0x000c
        L_0x002b:
            java.lang.Object r5 = r10.A02
            long r6 = r10.A04
            r9 = 0
            goto L_0x0054
        L_0x0031:
            java.lang.Object r5 = r10.A02
            long r6 = r10.A04
            r9 = 1
            goto L_0x0054
        L_0x0037:
            java.lang.Object r1 = r10.A01
            long r5 = r10.A04
            java.lang.Object r2 = r10.A02
            r4 = 2
            goto L_0x00a8
        L_0x003f:
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            java.lang.Object r2 = r10.A02
            r4 = 3
            goto L_0x00a8
        L_0x0047:
            java.lang.Object r2 = r10.A02
            java.lang.Object r1 = r10.A01
            long r5 = r10.A04
            r4 = 4
            goto L_0x00a8
        L_0x004f:
            java.lang.Object r5 = r10.A02
            long r6 = r10.A04
            r9 = 5
        L_0x0054:
            X.MGF r0 = new X.MGF
            r4 = r0
            r8 = r12
            r4.<init>((java.lang.Object) r5, (long) r6, (X.AnonymousClass4D7) r8, (int) r9)
            r0.A01 = r11
            return r0
        L_0x005e:
            java.lang.Object r1 = r10.A01
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            r4 = 6
            goto L_0x00a8
        L_0x0066:
            java.lang.Object r5 = r10.A02
            long r6 = r10.A04
            r9 = 7
            X.MGF r0 = new X.MGF
            r4 = r0
            r8 = r12
            r4.<init>((java.lang.Object) r5, (long) r6, (X.AnonymousClass4D7) r8, (int) r9)
            return r0
        L_0x0073:
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            r4 = 9
            goto L_0x00a8
        L_0x007c:
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            r4 = 10
            goto L_0x00a8
        L_0x0085:
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            r4 = 12
            goto L_0x00a8
        L_0x008e:
            java.lang.Object r1 = r10.A01
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            r4 = 13
            goto L_0x00a8
        L_0x0097:
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            r4 = 14
            goto L_0x00a8
        L_0x00a0:
            java.lang.Object r2 = r10.A02
            long r5 = r10.A04
            java.lang.Object r1 = r10.A01
            r4 = 15
        L_0x00a8:
            X.MGF r0 = new X.MGF
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGF.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v96, types: [java.lang.Object, X.Ky4] */
    /* JADX WARNING: type inference failed for: r1v105, types: [java.lang.Object, X.Ky5] */
    /* JADX WARNING: type inference failed for: r3v28, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v21, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0469, code lost:
        X.0eS.A00(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0485, code lost:
        if (r1 != r0) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0487, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04a6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A03
            switch(r0) {
                case 0: goto L_0x045b;
                case 1: goto L_0x03fd;
                case 2: goto L_0x03d0;
                case 3: goto L_0x0488;
                case 4: goto L_0x0373;
                case 5: goto L_0x032b;
                case 6: goto L_0x0304;
                case 7: goto L_0x0254;
                case 8: goto L_0x0214;
                case 9: goto L_0x01f1;
                case 10: goto L_0x0033;
                case 11: goto L_0x01c3;
                case 12: goto L_0x0199;
                case 13: goto L_0x0169;
                case 14: goto L_0x012b;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00cb;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r2 = 1
            if (r1 == 0) goto L_0x0013
            if (r1 == r2) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0013:
            X.0eS.A00(r15)
            java.lang.Object r5 = r14.A02
            X.02o r5 = (X.02o) r5
            X.0rl r4 = new X.0rl
            r4.<init>()
            java.lang.Object r1 = r14.A01
            X.0r6 r1 = (X.AnonymousClass0r6) r1
            long r7 = r14.A04
            r6 = 2
            X.JVt r3 = new X.JVt
            r3.<init>(r4, r5, r6, r7)
            r14.A00 = r2
            java.lang.Object r1 = r1.collect(r3, r14)
            goto L_0x0485
        L_0x0033:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 3
            r6 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0067
            if (r1 == r4) goto L_0x0083
            if (r1 == r6) goto L_0x00b5
            X.0eS.A00(r15)
        L_0x0043:
            int r1 = X.AnonymousClass7TE.A0M(r15)
            java.lang.Object r0 = r14.A01
            X.1Av r0 = (X.1Av) r0
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            if (r1 != 0) goto L_0x005d
            java.lang.String r2 = "igtv_drafts_cleanup_last_check_ts"
            r0 = 0
            r3.E5c(r2, r0)
        L_0x0058:
            r3.apply()
            goto L_0x04a4
        L_0x005d:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "igtv_drafts_cleanup_last_check_ts"
            r3.E5c(r0, r1)
            goto L_0x0058
        L_0x0067:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A02
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r1
            com.instagram.igtv.draft.model.IGTVDraftsRepository r1 = X.JTP.A0a(r1)
            long r2 = r14.A04
            X.MVv r1 = r1.A01
            X.0r6 r1 = r1.CCB(r2)
            r14.A00 = r4
            java.lang.Object r15 = X.AnonymousClass10c.A03(r14, r1)
            if (r15 != r0) goto L_0x0086
            return r0
        L_0x0083:
            X.0eS.A00(r15)
        L_0x0086:
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r1 = r14.A02
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r1
            com.instagram.igtv.draft.model.IGTVDraftsRepository r4 = X.JTP.A0a(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r15)
            java.util.Iterator r2 = r15.iterator()
        L_0x009a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r2.next()
            X.Juf r1 = (X.C60983Juf) r1
            int r1 = r1.A00
            X.JTT.A1S(r3, r1)
            goto L_0x009a
        L_0x00ac:
            r14.A00 = r6
            java.lang.Object r1 = r4.AOU(r3, r14)
            if (r1 != r0) goto L_0x00b8
            return r0
        L_0x00b5:
            X.0eS.A00(r15)
        L_0x00b8:
            java.lang.Object r1 = r14.A02
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r1
            com.instagram.igtv.draft.model.IGTVDraftsRepository r1 = X.JTP.A0a(r1)
            r14.A00 = r5
            X.MVv r1 = r1.A01
            java.lang.Object r15 = r1.BXM(r14)
            if (r15 != r0) goto L_0x0043
            return r0
        L_0x00cb:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 1
            if (r1 == 0) goto L_0x00d9
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d9:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A02
            X.02o r4 = (X.02o) r4
            X.0rl r3 = new X.0rl
            r3.<init>()
            java.lang.Object r1 = r14.A01
            X.0r6 r1 = (X.AnonymousClass0r6) r1
            long r6 = r14.A04
            X.JVt r2 = new X.JVt
            r2.<init>(r3, r4, r5, r6)
            r14.A00 = r5
            java.lang.Object r1 = r1.collect(r2, r14)
            goto L_0x0485
        L_0x00f8:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 1
            if (r1 == 0) goto L_0x0106
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0106:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A02
            X.2Cd r1 = (X.2Cd) r1
            com.instagram.common.session.UserSession r2 = r1.A00
            X.Ky5 r1 = new X.Ky5
            r1.<init>()
            X.LDL r4 = new X.LDL
            r4.<init>(r2, r1)
            long r2 = r14.A04
            java.lang.Object r1 = r14.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r1 = r1.A00
            X.MUY r1 = (X.MUY) r1
            r14.A00 = r5
            java.lang.Object r1 = r4.A00(r1, r14, r2)
            goto L_0x0485
        L_0x012b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r7 = 1
            if (r1 == 0) goto L_0x0139
            if (r1 == r7) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0139:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A02
            X.2Cd r1 = (X.2Cd) r1
            com.instagram.common.session.UserSession r2 = r1.A00
            X.Ky4 r1 = new X.Ky4
            r1.<init>()
            X.L7R r4 = new X.L7R
            r4.<init>(r2, r1)
            long r8 = r14.A04
            java.lang.Object r1 = r14.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r5 = r1.A00
            r14.A00 = r7
            X.4HW r1 = r4.A00
            r6 = 0
            X.MEM r3 = new X.MEM
            r3.<init>(r4, r5, r6, r7, r8)
            X.0gF r2 = X.C60340gF.A00
            java.lang.Object r1 = r1.A00(r2, r14, r3)
            if (r1 == r0) goto L_0x0485
            r1 = r2
            goto L_0x0485
        L_0x0169:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 1
            if (r1 == 0) goto L_0x0177
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0177:
            X.0eS.A00(r15)
            X.0eM r1 = X.C64551Qq.A01
            java.lang.Object r4 = r1.getValue()
            X.0V2 r4 = (X.0V2) r4
            java.lang.Object r3 = r14.A01
            X.1QS r3 = (X.1QS) r3
            java.lang.Object r1 = r14.A02
            X.KAj r1 = (X.C61504KAj) r1
            X.1QU r2 = r1.A03
            X.KbH r1 = new X.KbH
            r1.<init>(r3, r2)
            r14.A00 = r5
            java.lang.Object r1 = r4.emit(r1, r14)
            goto L_0x0485
        L_0x0199:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r6 = 1
            if (r1 == 0) goto L_0x01a7
            if (r1 == r6) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a7:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A02
            X.Liy r1 = (X.C64836Liy) r1
            X.3jv r5 = r1.A03
            long r3 = r14.A04
            java.lang.Object r2 = r14.A01
            X.OHc r2 = (X.C70707OHc) r2
            X.Lxq r1 = new X.Lxq
            r1.<init>(r2, r3)
            r14.A00 = r6
            java.lang.Object r1 = r5.ELH(r1, r14)
            goto L_0x0485
        L_0x01c3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r2 = 1
            if (r1 == 0) goto L_0x01d1
            if (r1 == r2) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01d1:
            X.0eS.A00(r15)
            java.lang.Object r5 = r14.A02
            X.02o r5 = (X.02o) r5
            X.0rl r4 = new X.0rl
            r4.<init>()
            java.lang.Object r1 = r14.A01
            X.0r6 r1 = (X.AnonymousClass0r6) r1
            long r7 = r14.A04
            r6 = 0
            X.JVt r3 = new X.JVt
            r3.<init>(r4, r5, r6, r7)
            r14.A00 = r2
            java.lang.Object r1 = r1.collect(r3, r14)
            goto L_0x0485
        L_0x01f1:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 1
            if (r1 == 0) goto L_0x01ff
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ff:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A02
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r4 = (com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r4
            long r2 = r14.A04
            java.lang.Object r1 = r14.A01
            X.L4l r1 = (X.C63727L4l) r1
            r14.A00 = r5
            X.0gF r1 = com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator.A01(r4, r1, r2, r5)
            goto L_0x0485
        L_0x0214:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0225
            if (r1 == r4) goto L_0x0239
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0225:
            X.0eS.A00(r15)
            java.lang.Object r3 = r14.A02
            X.4Cq r3 = (X.C262224Cq) r3
            long r1 = r14.A04
            r14.A02 = r3
            r14.A00 = r4
            java.lang.Object r1 = X.C241603Pv.A01(r14, r1)
            if (r1 != r0) goto L_0x023f
            return r0
        L_0x0239:
            java.lang.Object r1 = r14.A02
            X.4Cq r3 = X.JTO.A1D(r1, r15)
        L_0x023f:
            boolean r1 = X.19E.A07(r3)
            if (r1 == 0) goto L_0x04a4
            java.lang.Object r2 = r14.A01
            X.0sL r2 = (X.0sL) r2
            r1 = 0
            r14.A02 = r1
            r14.A00 = r5
            java.lang.Object r1 = r2.invoke(r3, r14)
            goto L_0x0485
        L_0x0254:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 2
            r7 = 1
            if (r1 == 0) goto L_0x027e
            if (r1 == r7) goto L_0x02e3
            if (r1 != r5) goto L_0x02ff
            java.lang.Object r4 = r14.A01
            X.0eS.A00(r15)
        L_0x0265:
            java.lang.Object r0 = r14.A02
            com.instagram.friendmap.data.FriendMapRepository r0 = (com.instagram.friendmap.data.FriendMapRepository) r0
            X.05G r2 = r0.A0H
        L_0x026b:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.00k.A0T(r4, r0)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x026b
            goto L_0x04a4
        L_0x027e:
            X.0eS.A00(r15)
            java.lang.Object r9 = r14.A02
            com.instagram.friendmap.data.FriendMapRepository r9 = (com.instagram.friendmap.data.FriendMapRepository) r9
            X.05G r1 = r9.A0H
            java.lang.Iterable r3 = X.JTO.A0x(r1)
            long r1 = r14.A04
            java.util.Iterator r6 = r3.iterator()
        L_0x0291:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x04a4
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.N3Q r3 = (X.N3Q) r3
            java.lang.String r3 = r3.A08
            java.lang.String r8 = java.lang.String.valueOf(r1)
            boolean r3 = X.0qQ.A0K(r3, r8)
            if (r3 == 0) goto L_0x0291
            if (r4 == 0) goto L_0x04a4
            X.05G r10 = r9.A0H
        L_0x02ae:
            java.lang.Object r11 = r10.getValue()
            r1 = r11
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x02bd:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02d0
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.N3Q r1 = (X.N3Q) r1
            java.lang.String r1 = r1.A08
            X.JTR.A1Q(r1, r8, r2, r6)
            goto L_0x02bd
        L_0x02d0:
            boolean r1 = r10.AIY(r11, r6)
            if (r1 == 0) goto L_0x02ae
            com.instagram.direct.inbox.notes.NotesApi r1 = r9.A07
            r14.A01 = r4
            r14.A00 = r7
            java.lang.Object r15 = r1.A04(r8, r14)
            if (r15 != r0) goto L_0x02e8
            return r0
        L_0x02e3:
            java.lang.Object r4 = r14.A01
            X.0eS.A00(r15)
        L_0x02e8:
            boolean r1 = r15 instanceof X.C297815sO
            if (r1 == 0) goto L_0x04a4
            java.lang.Object r1 = r14.A02
            com.instagram.friendmap.data.FriendMapRepository r1 = (com.instagram.friendmap.data.FriendMapRepository) r1
            X.0V2 r2 = r1.A0G
            X.NjD r1 = X.C69312NjD.DELETE_NOTE
            r14.A01 = r4
            r14.A00 = r5
            java.lang.Object r1 = r2.emit(r1, r14)
            if (r1 != r0) goto L_0x0265
            return r0
        L_0x02ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0304:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r5 = 1
            if (r1 == 0) goto L_0x0312
            if (r1 == r5) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0312:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A01
            com.instagram.direct.inbox.notes.NotesRepository r4 = (com.instagram.direct.inbox.notes.NotesRepository) r4
            java.lang.Object r3 = r14.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            long r1 = r14.A04
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r14.A00 = r5
            java.lang.Object r1 = r4.A09(r3, r1, r14)
            goto L_0x0485
        L_0x032b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x033c
            if (r1 == r2) goto L_0x0362
            if (r1 == r8) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x033c:
            X.0eS.A00(r15)
            java.lang.Object r7 = r14.A01
            X.02o r7 = (X.02o) r7
            java.lang.Object r1 = r14.A02
            X.OF2 r1 = (X.OF2) r1
            com.instagram.common.session.UserSession r6 = r1.A01
            long r3 = r14.A04
            r14.A01 = r7
            r14.A00 = r2
            X.12T r1 = X.AnonymousClass12T.A00
            r5 = 0
            X.0nV r2 = X.DbX.A0c(r1)
            X.MGH r1 = new X.MGH
            r1.<init>(r6, r5, r3)
            java.lang.Object r15 = X.1Eo.A00(r14, r2, r1)
            if (r15 != r0) goto L_0x0368
            return r0
        L_0x0362:
            java.lang.Object r1 = r14.A01
            X.02o r7 = X.JTO.A1H(r1, r15)
        L_0x0368:
            r1 = 0
            r14.A01 = r1
            r14.A00 = r8
            java.lang.Object r1 = r7.emit(r15, r14)
            goto L_0x0485
        L_0x0373:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r3 = 1
            if (r1 == 0) goto L_0x03aa
            if (r1 != r3) goto L_0x03cb
            X.0eS.A00(r15)
        L_0x037f:
            java.lang.Object r0 = r14.A01
            X.7l2 r0 = (X.C340297l2) r0
            r0.A0S(r3)
            X.7rU r1 = r0.A0G
            X.7rc r0 = X.C345507td.A00
            X.7rb r0 = r1.A02(r0)
            X.7td r0 = (X.C345507td) r0
            com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController r0 = (com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController) r0
            X.7nc r0 = r0.A01
            if (r0 == 0) goto L_0x039d
            X.7ne r1 = r0.A02
            android.view.ScaleGestureDetector r0 = r0.A01
            r1.onScaleBegin(r0)
        L_0x039d:
            java.lang.Object r0 = r14.A02
            X.8GT r0 = (X.AnonymousClass8GT) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.A09
            X.8GV r0 = X.AnonymousClass8GV.NORMAL
            r1.set(r0)
            goto L_0x04a4
        L_0x03aa:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A02
            X.8GT r1 = (X.AnonymousClass8GT) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.A09
            X.8GV r1 = X.AnonymousClass8GV.STUCK
            r2.set(r1)
            java.lang.Object r2 = r14.A01
            X.7l2 r2 = (X.C340297l2) r2
            r1 = 0
            r2.A0S(r1)
            long r1 = r14.A04
            r14.A00 = r3
            java.lang.Object r1 = X.C241603Pv.A01(r14, r1)
            if (r1 != r0) goto L_0x037f
            return r0
        L_0x03cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03d0:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r3 = 1
            if (r1 == 0) goto L_0x03de
            if (r1 == r3) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03de:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A01
            X.07V r2 = X.JTO.A0J(r1)
            X.07U r1 = X.07U.A05
            long r8 = r14.A04
            java.lang.Object r5 = r14.A02
            r6 = 0
            r7 = 9
            X.MGA r4 = new X.MGA
            r4.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7, (long) r8)
            r14.A00 = r3
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r1, r2, r14, r4)
            goto L_0x0485
        L_0x03fd:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r6 = 1
            if (r1 == 0) goto L_0x040b
            if (r1 == r6) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x040b:
            X.0eS.A00(r15)
            java.lang.Object r7 = r14.A01
            java.lang.Object r8 = r14.A02
            X.GeO r8 = (X.C52888GeO) r8
            X.0sK r5 = r8.A03
            long r3 = r14.A04
            r13 = 1065353216(0x3f800000, float:1.0)
            r12 = 32
            long r1 = r3 >> r12
            int r9 = (int) r1
            float r11 = java.lang.Float.intBitsToFloat(r9)
            float r11 = r11 * r13
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            int r1 = (int) r3
            float r2 = java.lang.Float.intBitsToFloat(r1)
            float r2 = r2 * r13
            int r1 = java.lang.Float.floatToRawIntBits(r11)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            long r3 = r3 << r12
            long r1 = r1 & r9
            long r3 = r3 | r1
            X.6Gj r2 = r8.A01
            X.0sK r1 = X.GQV.A00
            X.6Gj r1 = X.AnonymousClass6Gj.Vertical
            if (r2 != r1) goto L_0x0454
            float r1 = X.GQ9.A00(r3)
        L_0x0449:
            java.lang.Float r1 = X.C51965G9l.A0q(r1)
            r14.A00 = r6
            java.lang.Object r1 = r5.invoke(r7, r1, r14)
            goto L_0x0485
        L_0x0454:
            long r3 = r3 >> r12
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            goto L_0x0449
        L_0x045b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r6 = 1
            if (r1 == 0) goto L_0x046d
            if (r1 == r6) goto L_0x0469
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0469:
            X.0eS.A00(r15)
            goto L_0x04a4
        L_0x046d:
            X.0eS.A00(r15)
            java.lang.Object r5 = r14.A01
            java.lang.Object r1 = r14.A02
            X.GeO r1 = (X.C52888GeO) r1
            X.0sK r4 = r1.A02
            long r2 = r14.A04
            X.5dM r1 = new X.5dM
            r1.<init>(r2)
            r14.A00 = r6
            java.lang.Object r1 = r4.invoke(r5, r1, r14)
        L_0x0485:
            if (r1 != r0) goto L_0x04a4
            return r0
        L_0x0488:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r3 = 1
            if (r1 == 0) goto L_0x04a7
            if (r1 != r3) goto L_0x04b5
            X.0eS.A00(r15)
        L_0x0494:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x049d
            r0.invoke()
        L_0x049d:
            java.lang.Object r0 = r14.A02
            X.5Oz r0 = (X.C284945Oz) r0
            X.C51967G9n.A16(r0, r3)
        L_0x04a4:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x04a7:
            X.0eS.A00(r15)
            long r1 = r14.A04
            r14.A00 = r3
            java.lang.Object r1 = X.C241603Pv.A01(r14, r1)
            if (r1 != r0) goto L_0x0494
            return r0
        L_0x04b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGF) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGF(Object obj, Object obj2, AnonymousClass4D7 r4, int i, long j) {
        super(2, r4);
        this.A03 = i;
        this.A04 = j;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGF(Object obj, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A03 = i;
        this.A04 = j;
        this.A01 = obj;
    }
}
