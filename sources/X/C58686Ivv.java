package X;

/* renamed from: X.Ivv  reason: case insensitive filesystem */
public final class C58686Ivv extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58686Ivv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58686Ivv A00(Object obj, int i) {
        return new C58686Ivv(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x036a, code lost:
        r0.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x036f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0376, code lost:
        return r3.A05.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        X.C53029GhK.A00(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00af;
                case 3: goto L_0x00e9;
                case 4: goto L_0x0005;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00af;
                case 7: goto L_0x00e9;
                case 8: goto L_0x0005;
                case 9: goto L_0x011a;
                case 10: goto L_0x0123;
                case 11: goto L_0x012a;
                case 12: goto L_0x0131;
                case 13: goto L_0x013c;
                case 14: goto L_0x0150;
                case 15: goto L_0x0188;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01ac;
                case 18: goto L_0x01b3;
                case 19: goto L_0x00af;
                case 20: goto L_0x00e9;
                case 21: goto L_0x0005;
                case 22: goto L_0x01ea;
                case 23: goto L_0x01f4;
                case 24: goto L_0x01fe;
                case 25: goto L_0x0208;
                case 26: goto L_0x0072;
                case 27: goto L_0x0212;
                case 28: goto L_0x0231;
                case 29: goto L_0x023c;
                case 30: goto L_0x0247;
                case 31: goto L_0x000c;
                case 32: goto L_0x025c;
                case 33: goto L_0x004e;
                case 34: goto L_0x02af;
                case 35: goto L_0x02b9;
                case 36: goto L_0x02c8;
                case 37: goto L_0x00af;
                case 38: goto L_0x00af;
                case 39: goto L_0x02d2;
                case 40: goto L_0x02e6;
                case 41: goto L_0x02f0;
                case 42: goto L_0x030c;
                case 43: goto L_0x0314;
                case 44: goto L_0x031d;
                case 45: goto L_0x0314;
                case 46: goto L_0x033f;
                case 47: goto L_0x0356;
                case 48: goto L_0x035d;
                case 49: goto L_0x0364;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r3 = r15.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r3 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r3
            X.5Oz r0 = r3.A06
            java.lang.Object r4 = r0.getValue()
            if (r4 != 0) goto L_0x000b
            X.5PZ r0 = r3.A03
            float r6 = r0.B6X()
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L_0x0370
            X.5Oz r0 = r3.A05
            java.lang.Object r4 = r0.getValue()
            X.Htm r5 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r3)
            float r3 = r5.A00(r4)
            r2 = 1
            r1 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x000b
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x000b
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            java.lang.Object r0 = r5.A02(r6, r2)
        L_0x0046:
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x0049:
            java.lang.Object r0 = r5.A02(r6, r1)
            goto L_0x0046
        L_0x004e:
            java.lang.Object r3 = r15.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r3 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r3
            X.5Oz r0 = r3.A06
            java.lang.Object r4 = r0.getValue()
            if (r4 != 0) goto L_0x000b
            X.5PZ r0 = r3.A03
            float r2 = r0.B6X()
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x0370
            X.5Oz r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            r0 = 0
            java.lang.Object r4 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A02(r3, r1, r2, r0)
            return r4
        L_0x0072:
            java.lang.Object r6 = r15.A01
            X.I07 r6 = (X.I07) r6
            X.Hmj r5 = r6.A00
            X.49g r0 = r5.A01
            int r1 = r0.A00
            r0 = 2
            if (r1 < r0) goto L_0x0377
            java.lang.ref.WeakReference r0 = r6.A05
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0377
            r0 = 0
            X.2HY r0 = X.C229632nm.A0C(r0, r1)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0094:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000b
            r0 = r2
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            X.0sK r1 = r6.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r3, r0, r5)
            r4.add(r0)
            goto L_0x0094
        L_0x00af:
            java.lang.Object r4 = r15.A01
            return r4
        L_0x00b2:
            java.lang.Object r1 = r15.A01
            X.H0b r1 = (X.C54132H0b) r1
            r0 = 0
            r1.A00 = r0
            goto L_0x036d
        L_0x00bb:
            java.lang.Object r2 = r15.A01
            X.H0b r2 = (X.C54132H0b) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "arg_wall_post_item"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            if (r3 == 0) goto L_0x00e4
            com.instagram.wonderwall.model.WallPostItem r3 = (com.instagram.wonderwall.model.WallPostItem) r3
            android.os.Bundle r2 = r2.requireArguments()
            r1 = 0
            java.lang.String r0 = "arg_preview_launch_in_reply_mode"
            boolean r0 = r2.getBoolean(r0, r1)
            X.H6O r4 = new X.H6O
            r4.<init>(r5, r3, r0)
            return r4
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e9:
            java.lang.Object r0 = r15.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x00f0:
            java.lang.Object r1 = r15.A01
            X.H08 r1 = (X.H08) r1
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A04
            java.lang.Object r3 = r0.getValue()
            X.HMX r3 = (X.HMX) r3
            X.0eM r2 = r1.A05
            java.lang.Object r0 = r2.getValue()
            X.Gh5 r0 = (X.C53014Gh5) r0
            X.0pa r1 = r0.A04
            java.lang.Object r0 = r2.getValue()
            X.Gh5 r0 = (X.C53014Gh5) r0
            X.Hmi r0 = r0.A01
            X.H6c r4 = new X.H6c
            r4.<init>(r5, r3, r0, r1)
            return r4
        L_0x011a:
            java.lang.Object r0 = r15.A01
            X.JQr r0 = (X.C59623JQr) r0
            r0.CLN()
            goto L_0x036d
        L_0x0123:
            java.lang.Object r1 = r15.A01
            X.GhK r1 = (X.C53029GhK) r1
            X.Ibt r0 = X.C57505Ibt.A00
            goto L_0x0137
        L_0x012a:
            java.lang.Object r1 = r15.A01
            X.GhK r1 = (X.C53029GhK) r1
            X.Ibu r0 = X.C57506Ibu.A00
            goto L_0x0137
        L_0x0131:
            java.lang.Object r1 = r15.A01
            X.GhK r1 = (X.C53029GhK) r1
            X.Ibs r0 = X.C57504Ibs.A00
        L_0x0137:
            X.C53029GhK.A00(r0, r1)
            goto L_0x036d
        L_0x013c:
            java.lang.Object r4 = r15.A01
            X.2YL r4 = (X.2YL) r4
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 2
            X.ImE r0 = new X.ImE
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x036d
        L_0x0150:
            java.lang.Object r0 = r15.A01
            X.GhK r0 = (X.C53029GhK) r0
            X.05G r1 = r0.A06
        L_0x0156:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            X.Gm7 r2 = (X.C53321Gm7) r2
            r5 = 0
            com.instagram.user.model.User r4 = r2.A01
            X.5Tl r3 = r2.A00
            X.YBO r6 = r2.A03
            X.62P r9 = r2.A06
            boolean r10 = r2.A07
            java.lang.String r7 = r2.A04
            boolean r11 = r2.A0B
            java.lang.String r8 = r2.A05
            boolean r12 = r2.A0A
            boolean r13 = r2.A09
            boolean r14 = r2.A08
            X.C51974G9v.A1K(r4, r3, r9)
            r2 = 5
            X.0qQ.A0B(r7, r2)
            X.Gm7 r2 = new X.Gm7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r1.AIY(r0, r2)
            if (r0 == 0) goto L_0x0156
            goto L_0x036d
        L_0x0188:
            java.lang.Object r2 = r15.A01
            X.Ghg r2 = (X.C53048Ghg) r2
            java.util.List r1 = r2.A05
            java.util.List r0 = r2.A06
            r0.clear()
            r0.addAll(r1)
            r0 = 19
            X.J6g r0 = X.C59098J6g.A01(r2, r0)
            X.C53048Ghg.A03(r2, r0)
            goto L_0x036d
        L_0x01a1:
            java.lang.Object r0 = r15.A01
            X.Ghg r0 = (X.C53048Ghg) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.17i r4 = X.17h.A00(r0)
            return r4
        L_0x01ac:
            r0 = 1
            com.facebook.gltf.jni.GltfRenderSession r4 = new com.facebook.gltf.jni.GltfRenderSession
            r4.<init>(r0)
            return r4
        L_0x01b3:
            java.lang.Object r2 = r15.A01
            X.H0k r2 = (X.C54140H0k) r2
            X.0eM r0 = r2.A08
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.1Xj r0 = r2.A02
            if (r0 != 0) goto L_0x01cb
            java.lang.String r0 = "entryMedia"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01cb:
            X.JSO r0 = X.C51966G9m.A0l(r0)
            if (r0 == 0) goto L_0x01e3
            com.instagram.api.schemas.WorldLocationPagesInfo r0 = r0.CGk()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = r0.getWorldId()
            if (r0 == 0) goto L_0x01e3
            X.H6P r4 = new X.H6P
            r4.<init>(r1, r2, r0)
            return r4
        L_0x01e3:
            java.lang.String r0 = "Must supply World ID"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01ea:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.zero.cma.CampaignAPITokenFetcher r4 = new com.instagram.zero.cma.CampaignAPITokenFetcher
            r4.<init>(r0)
            return r4
        L_0x01f4:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OEf r4 = new X.OEf
            r4.<init>(r0)
            return r4
        L_0x01fe:
            java.lang.Object r0 = r15.A01
            X.0lg r0 = (X.0lg) r0
            com.instagram.zero.dogfooding.IgZeroDogfoodingInit r4 = new com.instagram.zero.dogfooding.IgZeroDogfoodingInit
            r4.<init>(r0)
            return r4
        L_0x0208:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r4 = new com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository
            r4.<init>(r0)
            return r4
        L_0x0212:
            java.lang.Object r0 = r15.A01
            X.0lg r0 = (X.0lg) r0
            X.49d r4 = new X.49d
            r4.<init>(r0)
            X.1J9 r1 = X.AnonymousClass1J9.A00()
            X.4CD r0 = r4.A02
            r1.A01(r0)
            X.4Cq r3 = r4.A03
            r2 = 0
            r1 = 1
            X.9Jt r0 = new X.9Jt
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return r4
        L_0x0231:
            java.lang.Object r0 = r15.A01
            com.meta.compose.component.swipeable.SwipeableState r0 = (com.meta.compose.component.swipeable.SwipeableState) r0
            X.5Oz r0 = r0.A05
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x023c:
            java.lang.Object r0 = r15.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r0 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r0
            X.5Oz r0 = r0.A04
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x0247:
            java.lang.Object r2 = r15.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r2 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r2
            X.5Oz r0 = r2.A04
            java.lang.Object r1 = r0.getValue()
            X.4gU r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r0)
            return r4
        L_0x025c:
            java.lang.Object r6 = r15.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r6 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r6
            X.5Oz r2 = r6.A04
            java.lang.Object r1 = r2.getValue()
            X.Htm r1 = (X.C56158Htm) r1
            X.5Oz r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            float r5 = r1.A00(r0)
            java.lang.Object r1 = r2.getValue()
            X.Htm r1 = (X.C56158Htm) r1
            X.4gU r0 = r6.A07
            java.lang.Object r0 = r0.getValue()
            float r4 = r1.A00(r0)
            float r4 = r4 - r5
            float r1 = java.lang.Math.abs(r4)
            boolean r0 = java.lang.Float.isNaN(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x02a1
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a1
            float r1 = r6.A03()
            float r1 = r1 - r5
            float r1 = r1 / r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a6
            r3 = 0
        L_0x02a1:
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            return r4
        L_0x02a6:
            r0 = 1065353199(0x3f7fffef, float:0.999999)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02a1
            r3 = r1
            goto L_0x02a1
        L_0x02af:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x02b9:
            java.lang.Object r1 = r15.A01
            X.4cd r1 = (X.C268024cd) r1
            r0 = 1123680256(0x42fa0000, float:125.0)
            float r0 = r1.F06(r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x02c8:
            java.lang.Object r1 = r15.A01
            X.GwB r1 = (X.C53905GwB) r1
            X.0sP r0 = r1.A01
            com.meta.foa.accountswitcher.UserAccountInfo r1 = r1.A00
            goto L_0x036a
        L_0x02d2:
            java.lang.Object r0 = r15.A01
            X.GtS r0 = (X.C53737GtS) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r3 = r0.A02
            java.util.List r5 = r0.A03
            java.lang.String r4 = "suma"
            r6 = 0
            X.C49901FCe.A02(r1, r2, r3, r4, r5, r6)
            goto L_0x036d
        L_0x02e6:
            java.lang.Object r1 = r15.A01
            X.F3q r1 = (X.C49726F3q) r1
            X.J53 r0 = X.J53.A00
            r1.A04(r0)
            goto L_0x036d
        L_0x02f0:
            java.lang.Object r0 = r15.A01
            X.GtT r0 = (X.C53738GtT) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r3 = r0.A02
            X.0sn r5 = X.0sn.A00
            java.lang.String r4 = "vertical_overflow_full_sheet"
            r6 = 0
            X.C49901FCe.A02(r1, r2, r3, r4, r5, r6)
            X.Iom r0 = new X.Iom
            r0.<init>(r6)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x030c:
            java.lang.Object r0 = r15.A01
            X.7cD r0 = (X.C334997cD) r0
            r0.A00()
            goto L_0x036d
        L_0x0314:
            java.lang.Object r1 = r15.A01
            X.F3q r1 = (X.C49726F3q) r1
            r0 = 0
            r1.A03(r0)
            goto L_0x036d
        L_0x031d:
            java.lang.Object r1 = r15.A01
            X.Guf r1 = (X.C53812Guf) r1
            java.lang.Integer r0 = r1.A04
            int r0 = r0.intValue()
            r7 = 1
            if (r0 != r7) goto L_0x033c
            java.lang.String r5 = "accounts_center_overflow_menu"
        L_0x032c:
            com.meta.foa.session.FoaUserSession r2 = r1.A03
            java.lang.String r3 = r1.A05
            java.lang.String r4 = r1.A06
            X.0sn r6 = X.0sn.A00
            X.C49901FCe.A02(r2, r3, r4, r5, r6, r7)
            X.3dj r4 = X.C58243Iom.A00()
            return r4
        L_0x033c:
            java.lang.String r5 = "overflow_menu_half_sheet"
            goto L_0x032c
        L_0x033f:
            java.lang.Object r0 = r15.A01
            X.Gw2 r0 = (X.Gw2) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r3 = r0.A02
            X.0sn r5 = X.0sn.A00
            java.lang.String r4 = "manage_notification_sheet"
            r6 = 1
            X.C49901FCe.A02(r1, r2, r3, r4, r5, r6)
            X.3dj r4 = X.C58243Iom.A00()
            return r4
        L_0x0356:
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            X.HLi r1 = X.C54625HLi.SHOW
            goto L_0x036a
        L_0x035d:
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            X.HLi r1 = X.C54625HLi.HIDE
            goto L_0x036a
        L_0x0364:
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            X.HLi r1 = X.C54625HLi.HIDE_FOR_30_DAYS
        L_0x036a:
            r0.invoke(r1)
        L_0x036d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0370:
            X.5Oz r0 = r3.A05
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x0377:
            X.0sn r4 = X.0sn.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58686Ivv.invoke():java.lang.Object");
    }
}
