package X;

/* renamed from: X.Iwb  reason: case insensitive filesystem */
public final class C58728Iwb extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58728Iwb(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: X.HoB} */
    /* JADX WARNING: type inference failed for: r8v7, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.business.promote.activity.PromoteActivity] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x049b, code lost:
        r2.ED3(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x058c, code lost:
        r7 = "promoteData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x058e, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06c0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0741, code lost:
        return new X.GP2(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1 = r3.A01.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r0 = "error_message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r2.addPointData(r0, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r20
            r2 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0715;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00df;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00fc;
                case 6: goto L_0x010f;
                case 7: goto L_0x0722;
                case 8: goto L_0x0135;
                case 9: goto L_0x014b;
                case 10: goto L_0x0161;
                case 11: goto L_0x0727;
                case 12: goto L_0x0245;
                case 13: goto L_0x0742;
                case 14: goto L_0x024c;
                case 15: goto L_0x028c;
                case 16: goto L_0x079c;
                case 17: goto L_0x028c;
                case 18: goto L_0x028c;
                case 19: goto L_0x029a;
                case 20: goto L_0x02ad;
                case 21: goto L_0x02da;
                case 22: goto L_0x02f0;
                case 23: goto L_0x036d;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x03cf;
                case 27: goto L_0x0009;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x03ec;
                case 31: goto L_0x03fb;
                case 32: goto L_0x040b;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x0428;
                case 36: goto L_0x0432;
                case 37: goto L_0x0442;
                case 38: goto L_0x0470;
                case 39: goto L_0x0479;
                case 40: goto L_0x0486;
                case 41: goto L_0x048f;
                case 42: goto L_0x04a0;
                case 43: goto L_0x0545;
                case 44: goto L_0x0558;
                case 45: goto L_0x0593;
                case 46: goto L_0x05bc;
                case 47: goto L_0x05e4;
                case 48: goto L_0x062c;
                case 49: goto L_0x062c;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.quicklog.PointEditor r2 = (com.facebook.quicklog.PointEditor) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
        L_0x000f:
            java.lang.Object r0 = r3.A01
            java.lang.String r1 = r0.toString()
        L_0x0015:
            java.lang.String r0 = "error_message"
        L_0x0017:
            r2.addPointData(r0, r1)
        L_0x001a:
            X.0gF r5 = X.C60340gF.A00
        L_0x001c:
            return r5
        L_0x001d:
            float r5 = X.AnonymousClass7TE.A04(r2)
            java.lang.Object r8 = r3.A01
            X.Hr5 r8 = (X.C55999Hr5) r8
            X.Ib5 r10 = r8.A05
            X.Tol r0 = r10.A01
            if (r0 == 0) goto L_0x0038
            X.4M3 r0 = r0.A06
            int r0 = r0.AzN()
        L_0x0031:
            r9 = 1
            if (r0 != 0) goto L_0x003a
            r8.A00(r9)
            goto L_0x001a
        L_0x0038:
            r0 = 0
            goto L_0x0031
        L_0x003a:
            X.Tol r0 = r10.A01
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.A0F()
            if (r0 != r9) goto L_0x00c4
        L_0x0044:
            X.5Oz r7 = r8.A02
            java.lang.Object r0 = r7.getValue()
            X.HM0 r6 = X.HM0.Scrubbing
            if (r0 == r6) goto L_0x0052
            r0 = 0
            r10.A00(r0)
        L_0x0052:
            X.5Oz r4 = r8.A03
            java.lang.Object r0 = r4.getValue()
            X.Gmf r0 = (X.C53355Gmf) r0
            float r0 = r0.A00
            float r3 = r5 * r0
            java.lang.Object r0 = r4.getValue()
            X.Gmf r0 = (X.C53355Gmf) r0
            float r1 = r0.A00
            float r1 = r1 - r3
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            r2 = 1053609165(0x3ecccccd, float:0.4)
            X.Tol r1 = r10.A01
            if (r1 == 0) goto L_0x0078
            r0 = 0
            r1.A03(r2, r0)
        L_0x0078:
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r11 = r11 - r0
            r1 = 100
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            X.Tol r2 = r10.A01
            if (r2 == 0) goto L_0x008f
            java.lang.String r1 = "resume"
            r0 = 0
            r2.A0C(r1, r0)
        L_0x008f:
            int r1 = (int) r3
            X.Tol r0 = r10.A01
            if (r0 == 0) goto L_0x0097
            r0.A05(r1, r9)
        L_0x0097:
            long r0 = java.lang.System.currentTimeMillis()
            r8.A00 = r0
            X.4Co r0 = r8.A01
            X.4D7 r9 = X.C51975G9x.A0t(r0)
            X.4Cq r2 = r8.A07
            r1 = 36
            X.MFS r0 = new X.MFS
            r0.<init>(r8, r9, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            r8.A01 = r0
        L_0x00b2:
            java.lang.Object r0 = r4.getValue()
            X.Gmf r0 = (X.C53355Gmf) r0
            float r2 = r0.A00
            r1 = 0
            X.Gmf r0 = new X.Gmf
            r0.<init>(r5, r3, r2, r1)
            r4.Epw(r0)
            goto L_0x010a
        L_0x00c4:
            X.Tol r0 = r10.A01
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A01
            if (r0 != r9) goto L_0x001a
            goto L_0x0044
        L_0x00ce:
            X.5RU r1 = X.C51968G9o.A0S(r2)
            java.lang.Object r0 = r3.A01
            X.4gU r0 = (X.C270284gU) r0
            float r0 = X.C51971G9r.A03(r0)
            r1.Ej5(r0)
            goto L_0x001a
        L_0x00df:
            X.4cl r2 = (X.C268104cl) r2
            r4 = 0
            X.0qQ.A0B(r2, r4)
            java.lang.Object r1 = r3.A01
            X.4cY r1 = (X.C267974cY) r1
            r0 = 0
            r2.A05(r1, r0, r4, r4)
            goto L_0x001a
        L_0x00ef:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r2)
            goto L_0x001a
        L_0x00fc:
            float r1 = X.AnonymousClass7TE.A04(r2)
            java.lang.Object r0 = r3.A01
            X.6D9 r0 = (X.AnonymousClass6D9) r0
            X.5Oz r7 = r0.A09
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
        L_0x010a:
            r7.Epw(r6)
            goto L_0x001a
        L_0x010f:
            X.5Q3 r2 = X.C51968G9o.A0T(r2)
            java.lang.Object r0 = r3.A01
            X.Hqp r0 = (X.C55984Hqp) r0
            X.Gey r3 = r0.A00(r2)
            r4 = 0
            long r0 = r2.Bwg()
            float r6 = X.C288025bF.A01(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            long r9 = r2.AmQ()
            r7 = 1065353216(0x3f800000, float:1.0)
            X.5dw r5 = X.C289635dw.A00
            r8 = 3
            r2.AQU(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001a
        L_0x0135:
            X.5RU r1 = X.C51968G9o.A0S(r2)
            java.lang.Object r0 = r3.A01
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r0 = r0.A04
            float r0 = X.C51975G9x.A00(r0)
            r1.EjG(r0)
            r1.EjH(r0)
            goto L_0x001a
        L_0x014b:
            float r4 = X.AnonymousClass7TE.A04(r2)
            java.lang.Object r2 = r3.A01
            X.5PZ r2 = (X.AnonymousClass5PZ) r2
            float r1 = r2.B6X()
            r0 = 1064388155(0x3f71463b, float:0.9424779)
            float r4 = r4 * r0
            float r1 = r1 + r4
            r2.EWt(r1)
            goto L_0x001a
        L_0x0161:
            float r1 = X.AnonymousClass7TE.A04(r2)
            java.lang.Object r5 = r3.A01
            X.Hn3 r5 = (X.C55768Hn3) r5
            X.5PZ r2 = r5.A01
            float r0 = r2.B6X()
            float r0 = r0 + r1
            r2.EWt(r0)
            java.util.List r0 = r5.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x0179:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r7 = r8.next()
            X.Hn2 r7 = (X.C55767Hn2) r7
            float r1 = r7.A00
            float r0 = r2.B6X()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0179
            float r1 = r2.B6X()
            X.Pxc r0 = X.I42.A00
            float r0 = X.I42.A00(r0)
            float r1 = r1 + r0
            r7.A00 = r1
            X.5Oz r4 = r5.A03
            java.lang.Object r6 = r4.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            X.2Ha r1 = r7.A03
            X.2SP r3 = X.2SP.A01
            float r0 = r3.A02()
            float r10 = X.I42.A01(r1, r0)
            float r11 = r7.A02
            X.2Ha r1 = X.I42.A03
            float r0 = r3.A02()
            float r12 = X.I42.A01(r1, r0)
            float r13 = r7.A01
            float r14 = r2.B6X()
            X.5Oz r0 = r5.A02
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            X.2SQ r0 = X.2SP.A00
            java.lang.Object r0 = X.00k.A0H(r1, r0)
            X.5RW r0 = (X.AnonymousClass5RW) r0
            if (r0 == 0) goto L_0x01f1
            long r0 = r0.A00
        L_0x01d6:
            X.Pxc r3 = X.I42.A01
            float r15 = X.I42.A00(r3)
            X.Pxc r3 = X.I42.A02
            float r16 = X.I42.A00(r3)
            X.Hoi r9 = new X.Hoi
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r0 = X.00k.A0T(r9, r6)
            r4.Epw(r0)
            goto L_0x0179
        L_0x01f1:
            long r0 = X.AnonymousClass5RW.A07
            goto L_0x01d6
        L_0x01f4:
            X.5Oz r6 = r5.A03
            java.lang.Object r0 = r6.getValue()
            java.util.Iterator r5 = X.C51966G9m.A1H(r0)
            r4 = 0
        L_0x01ff:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r3 = r5.next()
            X.Hoi r3 = (X.C55861Hoi) r3
            float r1 = r3.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            float r0 = r2.B6X()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ff
            if (r4 == 0) goto L_0x021e
            r4.add(r3)
            goto L_0x01ff
        L_0x021e:
            X.Hoi[] r0 = new X.C55861Hoi[]{r3}
            java.util.ArrayList r4 = X.0sr.A1M(r0)
            goto L_0x01ff
        L_0x0227:
            if (r4 == 0) goto L_0x001a
            java.util.Iterator r2 = r4.iterator()
        L_0x022d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r6.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.00k.A0f(r0, r1)
            r6.Epw(r0)
            goto L_0x022d
        L_0x0245:
            java.lang.Object r0 = r3.A01
            X.C51965G9l.A1W(r0, r2)
            goto L_0x001a
        L_0x024c:
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r6 = r3.A01
            X.6Rm r6 = (X.C307786Rm) r6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r2.iterator()
        L_0x025e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r3 = r4.next()
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            android.content.Context r0 = r6.A00
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r1 = r0.getCanonicalPath()
            X.0qQ.A07(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = X.AnonymousClass5Kg.A09(r2, r0)
            if (r0 == 0) goto L_0x025e
            r5.add(r3)
            goto L_0x025e
        L_0x028c:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r3.A01
            X.MYR r0 = (X.MYR) r0
            X.0qQ.A0A(r2)
            r0.A0B(r2)
            goto L_0x001a
        L_0x029a:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r3.A01
            X.E47 r0 = (X.E47) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.JlH r0 = (X.C60424JlH) r0
            r0.A00(r2)
            goto L_0x001a
        L_0x02ad:
            X.6Gb r6 = X.C51968G9o.A0L(r2)
            X.0sK r0 = X.C55382Hgo.A00
            r5 = 0
            r6.Cf4(r5, r0)
            X.0sK r0 = X.C55382Hgo.A01
            r6.Cf4(r5, r0)
            java.lang.Object r0 = r3.A01
            X.K5c r0 = (X.C61384K5c) r0
            java.util.List r4 = r0.A01
            X.J1P r1 = X.J1P.A00
            int r3 = r4.size()
            r0 = 14
            X.J6j r2 = new X.J6j
            r2.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r1)
            r1 = 6
            X.JK0 r0 = new X.JK0
            r0.<init>(r4, r1)
            X.C51967G9n.A12(r6, r0, r5, r2, r3)
            goto L_0x001a
        L_0x02da:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A01
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r0.<init>()
            X.0qQ.A0A(r2)
            r0.A01(r2)
            r1.A05(r0)
            goto L_0x001a
        L_0x02f0:
            java.lang.Object r2 = r3.A01
            X.K5F r2 = (X.K5F) r2
            X.0eM r3 = r2.A06
            java.lang.Object r1 = r3.getValue()
            java.lang.String r0 = "feed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r7 = "brandedContentTags"
            r15 = 0
            if (r0 == 0) goto L_0x0337
            X.0eM r4 = r2.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.LBY r11 = X.LLA.A00
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = r2.A03
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x058e
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r13 = r2.A01
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r12 = r2.A00
            r18 = 0
            r16 = r0
            r17 = r1
            X.JbE r0 = r11.A00(r12, r13, r14, r15, r16, r17, r18)
            X.C59888JbD.A01(r3, r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r3 = X.AnonymousClass05K.A0I
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JVF.A02(r2, r4, r3, r1, r0)
            goto L_0x001a
        L_0x0337:
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A07
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.util.List r9 = r2.A02
            if (r9 == 0) goto L_0x058e
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r5 = r2.A01
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r4 = r2.A00
            boolean r14 = r2.A03
            java.lang.String r8 = X.DbS.A0t(r3)
            X.0eM r0 = r2.A05
            java.lang.String r7 = X.DbS.A0t(r0)
            r0 = 1
            X.AnonymousClass7TF.A1E(r6, r0, r8)
            r10 = 0
            r11 = r10
            r12 = r10
            r13 = r10
            androidx.fragment.app.Fragment r0 = X.LLA.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A0B(r15, r0)
            r1.A04()
            goto L_0x001a
        L_0x036d:
            X.LMD r2 = (X.LMD) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r3.A01
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r1 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r1
            com.instagram.common.session.UserSession r15 = r1.A02
            X.LBY r12 = X.LLA.A00
            com.instagram.pendingmedia.model.BrandedContentTag r3 = r2.A01
            if (r3 == 0) goto L_0x03cc
            java.util.List r17 = X.AnonymousClass7TE.A1I(r3)
        L_0x0383:
            X.Jus r2 = r2.A00
            r3 = 0
            if (r2 == 0) goto L_0x03ca
            com.instagram.api.schemas.BrandedContentProjectAction r4 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            java.lang.String r10 = r2.A05
            java.lang.String r6 = r2.A01
            java.lang.String r7 = r2.A02
            java.lang.String r11 = r2.A06
            java.lang.String r9 = r2.A04
            java.lang.String r8 = r2.A03
            com.instagram.api.schemas.BrandedContentProjectMetadata r2 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r5 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x039c:
            r18 = 1
            r13 = r3
            r14 = r2
            r16 = r3
            r19 = r0
            X.JbE r0 = r12.A00(r13, r14, r15, r16, r17, r18, r19)
            X.C59888JbD.A01(r15, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0I
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JVF.A02(r1, r15, r3, r2, r0)
            X.JaN r1 = X.JW1.A00(r15)
            X.1QP r0 = r1.A0A
            long r2 = r1.A07
            X.AE4 r1 = new X.AE4
            r1.<init>(r0)
            r1.A01 = r2
            java.lang.String r0 = "BRANDED_CONTENT_SUGGESTION_TAPPED"
            r1.A04(r0)
            goto L_0x001a
        L_0x03ca:
            r2 = r3
            goto L_0x039c
        L_0x03cc:
            X.0sn r17 = X.0sn.A00
            goto L_0x0383
        L_0x03cf:
            java.lang.String r5 = X.C41847B3o.A1E(r2)
            r4 = 0
            X.4Cq r0 = X.C71132OdV.A01
            java.lang.String r3 = "message"
            X.0wj r2 = X.0wj.A01
            r1 = 817892340(0x30c00bf4, float:1.3973236E-9)
            r0 = 488(0x1e8, float:6.84E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0f9 r0 = r2.AEf(r0, r1)
            X.AnonymousClass7TF.A19(r0, r3, r5, r4)
            goto L_0x001a
        L_0x03ec:
            com.facebook.quicklog.PointEditor r2 = (com.facebook.quicklog.PointEditor) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "source"
            java.lang.String r0 = "TakeScreenshotHelper"
            r2.addPointData(r1, r0)
            goto L_0x000f
        L_0x03fb:
            com.facebook.quicklog.PointEditor r2 = (com.facebook.quicklog.PointEditor) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "error"
            goto L_0x0017
        L_0x040b:
            com.facebook.quicklog.PointEditor r2 = (com.facebook.quicklog.PointEditor) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "source"
            r0 = 597(0x255, float:8.37E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.addPointData(r1, r0)
            java.lang.Object r0 = r3.A01
            java.lang.Throwable r0 = X.0eR.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0015
        L_0x0428:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r3.A01
            X.E4G r0 = (X.E4G) r0
            r0.A06 = r2
            goto L_0x001a
        L_0x0432:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r0 = r3.A01
            X.E4H r0 = (X.E4H) r0
            java.util.Set r0 = r0.A0A
            X.0qQ.A0A(r2)
            r0.addAll(r2)
            goto L_0x001a
        L_0x0442:
            int r1 = X.AnonymousClass7TE.A0M(r2)
            if (r1 == 0) goto L_0x001a
            java.lang.Object r3 = r3.A01
            X.JfD r3 = (X.C60077JfD) r3
            int r0 = r3.A00
            int r0 = java.lang.Math.min(r1, r0)
            r3.A00 = r0
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x045a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.next()
            X.Jf8 r0 = (X.C60075Jf8) r0
            int r1 = r3.A00
            X.Jdv r0 = r0.A00
            if (r0 == 0) goto L_0x045a
            X.C60042Jdv.A00(r0, r1)
            goto L_0x045a
        L_0x0470:
            X.0xY r2 = (X.0xY) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "ad_account_info"
            goto L_0x049b
        L_0x0479:
            X.0xY r2 = (X.0xY) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1148(0x47c, float:1.609E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x049b
        L_0x0486:
            X.0xY r2 = (X.0xY) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "fb_page_info"
            goto L_0x049b
        L_0x048f:
            X.0xY r2 = (X.0xY) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x049b:
            r2.ED3(r0)
            goto L_0x001a
        L_0x04a0:
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            X.0qQ.A0B(r2, r4)
            java.lang.Object r8 = r3.A01
            com.instagram.business.promote.activity.PromoteActivity r8 = (com.instagram.business.promote.activity.PromoteActivity) r8
            com.instagram.business.promote.model.PromoteData r0 = r8.A00
            if (r0 == 0) goto L_0x058c
            r0.A1A = r2
            X.0eM r0 = r8.A08
            java.lang.Object r6 = r0.getValue()
            X.VsS r6 = (X.C18476VsS) r6
            com.instagram.business.promote.model.PromoteData r0 = r8.A00
            java.lang.String r7 = "promoteData"
            r5 = 0
            if (r0 == 0) goto L_0x058e
            java.lang.String r3 = r0.A1K
            X.0qQ.A06(r3)
            X.WGU r0 = com.instagram.business.promote.activity.PromoteActivity.A00(r8)
            java.lang.String r2 = r0.A03
            X.0qQ.A07(r2)
            X.1Ln r1 = r6.A00
            java.lang.String r0 = "pro_identity_open_boost_prevalidation_bloks"
            r1.A0l(r0)
            java.lang.String r0 = "entry_point"
            r1.A0R(r0, r3)
            r0 = 3136(0xc40, float:4.394E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0R(r0, r2)
            java.lang.String r0 = "token_type"
            r1.A0R(r0, r5)
            r1.Cgf()
            X.02m r1 = X.C18476VsS.A00(r6)
            r2 = 409679146(0x186b352a, float:3.039988E-24)
            java.lang.String r0 = "pro_identity_launch_boost_prevalidation_bloks"
            r1.markerPoint(r2, r0)
            X.02m r1 = X.C18476VsS.A00(r6)
            r0 = 1404(0x57c, float:1.967E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.markerAnnotate(r2, r0, r4)
            com.instagram.business.promote.model.PromoteData r0 = r8.A00
            if (r0 == 0) goto L_0x058e
            java.lang.String r0 = r0.A1b
            if (r0 == 0) goto L_0x051a
            X.WGU r2 = com.instagram.business.promote.activity.PromoteActivity.A00(r8)
            r0 = 2375(0x947, float:3.328E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "bfa_prevalidation"
            r2.A0R(r1, r0)
        L_0x051a:
            X.0gy r1 = X.AnonymousClass07i.A00(r8)
            com.instagram.common.session.UserSession r9 = r8.A0n()
            com.instagram.business.promote.model.PromoteData r0 = r8.A00
            if (r0 == 0) goto L_0x058e
            java.lang.String r11 = r0.A1K
            X.0qQ.A06(r11)
            X.WGU r0 = com.instagram.business.promote.activity.PromoteActivity.A00(r8)
            java.lang.String r12 = r0.A03
            X.0qQ.A07(r12)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            com.instagram.business.promote.model.PromoteData r0 = r8.A00
            if (r0 == 0) goto L_0x058e
            java.lang.String r13 = r0.A1b
            X.8ey r0 = X.C18678Vwb.A01(r8, r9, r10, r11, r12, r13)
            X.1ES.A00(r8, r1, r0)
            goto L_0x001a
        L_0x0545:
            java.lang.String r2 = X.C41847B3o.A1E(r2)
            java.lang.Object r1 = r3.A01
            com.instagram.business.promote.activity.PromoteActivity r1 = (com.instagram.business.promote.activity.PromoteActivity) r1
            com.instagram.business.promote.model.PromoteData r0 = r1.A00
            if (r0 == 0) goto L_0x058c
            r0.A1A = r2
            com.instagram.business.promote.activity.PromoteActivity.A06(r1)
            goto L_0x001a
        L_0x0558:
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            X.0qQ.A0B(r2, r4)
            java.lang.Object r3 = r3.A01
            com.instagram.business.promote.activity.PromoteActivity r3 = (com.instagram.business.promote.activity.PromoteActivity) r3
            com.instagram.business.promote.model.PromoteData r0 = r3.A00
            if (r0 == 0) goto L_0x058c
            r0.A1A = r2
            com.instagram.business.promote.activity.PromoteActivity.A03(r3)
            X.1Wy r0 = X.C322576w3.A00()
            X.Vl8 r0 = r0.A01()
            X.UaU r1 = r0.A03(r4)
            com.instagram.common.session.UserSession r0 = r3.A0n()
            X.6Yo r0 = X.DbS.A0M(r3, r0)
            r0.A0D = r4
            r0.A0D(r1)
            r0.A04()
            r3.A0a()
            goto L_0x001a
        L_0x058c:
            java.lang.String r7 = "promoteData"
        L_0x058e:
            X.0qQ.A0F(r7)
            goto L_0x06bc
        L_0x0593:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r4 = r3.A01
            X.E1j r4 = (X.C47415E1j) r4
            android.view.View r1 = r4.A01
            r3 = 0
            if (r1 == 0) goto L_0x05ab
            boolean r0 = r2.booleanValue()
            r0 = r0 ^ 1
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x05ab:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x001a
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x05b7
            r3 = 8
        L_0x05b7:
            r1.setVisibility(r3)
            goto L_0x001a
        L_0x05bc:
            java.lang.Object r3 = r3.A01
            X.Ua7 r3 = (X.C15300Ua7) r3
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A00
            if (r1 == 0) goto L_0x05cb
            boolean r0 = X.AnonymousClass7TF.A1V(r2)
            r1.setPrimaryButtonEnabled(r0)
        L_0x05cb:
            if (r21 == 0) goto L_0x001a
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r3.A01
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r0.findViewWithTag(r2)
            if (r0 == 0) goto L_0x001a
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = r3.A01
            if (r1 == 0) goto L_0x001a
            int r0 = r0.getId()
            r1.A02(r0)
            goto L_0x001a
        L_0x05e4:
            X.Jvy r2 = (X.C61060Jvy) r2
            java.lang.Object r3 = r3.A01
            X.Ua7 r3 = (X.C15300Ua7) r3
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.U8Y r0 = (X.U8Y) r0
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0603
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A00
            if (r1 == 0) goto L_0x0603
            boolean r0 = r2.A03
            r1.setPrimaryActionIsLoading(r0)
        L_0x0603:
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r3.A01
            if (r0 == 0) goto L_0x001a
            X.0kx r3 = new X.0kx
            r3.<init>(r0)
        L_0x060c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof X.U5O
            if (r0 == 0) goto L_0x060c
            X.U5O r1 = (X.U5O) r1
            if (r1 == 0) goto L_0x060c
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0628
            r1.A00()
            goto L_0x060c
        L_0x0628:
            r1.A01()
            goto L_0x060c
        L_0x062c:
            X.GnV r2 = (X.C53398GnV) r2
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0640
            java.lang.Object r0 = r3.A01
            X.UaC r0 = (X.C15305UaC) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            X.Ggh r0 = (X.C52990Ggh) r0
            r0.A00 = r1
        L_0x0640:
            java.lang.Object r1 = r2.A01
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x064c
            java.lang.Object r0 = r3.A01
            X.UaC r0 = (X.C15305UaC) r0
            r0.A05 = r1
        L_0x064c:
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x06fd
            java.lang.Object r5 = r3.A01
            X.UaC r5 = (X.C15305UaC) r5
            boolean r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L_0x06ed
            r5.A08 = r4
            com.instagram.business.promote.model.PromoteData r0 = r5.A03
            java.lang.String r8 = "promoteData"
            if (r0 == 0) goto L_0x06b9
            java.util.List r0 = r0.A1u
            r0.clear()
            X.C15305UaC.A00(r5, r1)
            com.instagram.business.promote.model.PromoteData r0 = r5.A03
            if (r0 == 0) goto L_0x06b9
            com.instagram.leadgen.core.api.LeadForm r7 = r0.A16
            if (r7 == 0) goto L_0x0692
            java.util.List r0 = r0.A1u
            X.0qQ.A06(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x067c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x06e3
            java.lang.Object r0 = r6.next()
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r7.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x067c
        L_0x0692:
            android.content.Context r0 = r5.requireContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 == 0) goto L_0x06a2
            r0.setLayoutManager(r1)
        L_0x06a2:
            androidx.recyclerview.widget.RecyclerView r1 = r5.A00
            if (r1 == 0) goto L_0x06d6
            com.instagram.business.promote.model.PromoteData r0 = r5.A03
            if (r0 == 0) goto L_0x06b9
            java.util.List r12 = r0.A1u
            X.0qQ.A06(r12)
            com.instagram.business.promote.model.PromoteData r10 = r5.A03
            if (r10 == 0) goto L_0x06b9
            X.WGU r9 = r5.A02
            if (r9 != 0) goto L_0x06c1
            java.lang.String r8 = "promoteLogger"
        L_0x06b9:
            X.0qQ.A0F(r8)
        L_0x06bc:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x06c1:
            X.WYX r8 = r5.A01
            if (r8 != 0) goto L_0x06c8
            java.lang.String r8 = "leadAdsLogger"
            goto L_0x06b9
        L_0x06c8:
            java.lang.Long r11 = r5.A06
            androidx.fragment.app.FragmentActivity r7 = r5.requireActivity()
            X.UA1 r6 = new X.UA1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.setAdapter(r6)
        L_0x06d6:
            androidx.recyclerview.widget.RecyclerView r1 = r5.A00
            if (r1 == 0) goto L_0x06fd
            X.GiT r0 = new X.GiT
            r0.<init>(r5, r4)
            r1.A15(r0)
            goto L_0x06fd
        L_0x06e3:
            com.instagram.business.promote.model.PromoteData r0 = r5.A03
            if (r0 == 0) goto L_0x06b9
            java.util.List r0 = r0.A1u
            r0.add(r4, r7)
            goto L_0x0692
        L_0x06ed:
            X.C15305UaC.A00(r5, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 == 0) goto L_0x06fb
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x06fb
            r0.notifyDataSetChanged()
        L_0x06fb:
            r5.A09 = r4
        L_0x06fd:
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r3.A01
            X.UaC r0 = (X.C15305UaC) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            if (r1 == 0) goto L_0x0712
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.W2F.A02(r1, r0)
            goto L_0x001a
        L_0x0712:
            java.lang.String r8 = "session"
            goto L_0x06b9
        L_0x0715:
            int r1 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            r0.get(r1)
            r5 = 0
            return r5
        L_0x0722:
            java.lang.Object r1 = r3.A01
            r0 = 13
            goto L_0x073c
        L_0x0727:
            java.lang.Object r1 = r3.A01
            X.HoB r1 = (X.C55828HoB) r1
            X.4Co r0 = r1.A04
            r0.EwR()
            X.4Co r0 = r1.A03
            r0.EwR()
            X.4Co r0 = r1.A05
            r0.EwR()
            r0 = 14
        L_0x073c:
            X.GP2 r5 = new X.GP2
            r5.<init>(r1, r0)
            return r5
        L_0x0742:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            X.Ggz r0 = (X.C53008Ggz) r0
            X.HpH r0 = r0.A03
            X.0Ud r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            X.GmK r0 = (X.C53334GmK) r0
            X.62P r0 = r0.A0K
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x075e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0770
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C299625vV
            if (r0 == 0) goto L_0x075e
            r5.add(r1)
            goto L_0x075e
        L_0x0770:
            java.util.Iterator r4 = r5.iterator()
        L_0x0774:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x079a
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.5vQ r1 = (X.C299575vQ) r1
            boolean r0 = r1 instanceof X.C299625vV
            if (r0 == 0) goto L_0x0774
            X.5vJ r0 = r1.Be5()
            java.lang.String r0 = r0.A07
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0774
        L_0x0791:
            int r0 = r5.indexOf(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x079a:
            r3 = 0
            goto L_0x0791
        L_0x079c:
            int r1 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r5 = X.DbU.A0m(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58728Iwb.invoke(java.lang.Object):java.lang.Object");
    }
}
