package X;

/* renamed from: X.J6u  reason: case insensitive filesystem */
public final class C59112J6u extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59112J6u(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c0, code lost:
        return X.C51965G9l.A0f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0ec8, code lost:
        r0 = java.lang.Float.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0ecc, code lost:
        r5.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0fce, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0fd3, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0fd4, code lost:
        r9.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0fdf, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
        /*
            r21 = this;
            r0 = r21
            r10 = r23
            r9 = r22
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0035;
                case 1: goto L_0x006d;
                case 2: goto L_0x008d;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00fd;
                case 8: goto L_0x012d;
                case 9: goto L_0x015d;
                case 10: goto L_0x01ba;
                case 11: goto L_0x01ec;
                case 12: goto L_0x0224;
                case 13: goto L_0x0241;
                case 14: goto L_0x024d;
                case 15: goto L_0x0259;
                case 16: goto L_0x0268;
                case 17: goto L_0x029b;
                case 18: goto L_0x029b;
                case 19: goto L_0x02af;
                case 20: goto L_0x02c4;
                case 21: goto L_0x037f;
                case 22: goto L_0x000b;
                case 23: goto L_0x000b;
                case 24: goto L_0x042a;
                case 25: goto L_0x0435;
                case 26: goto L_0x04f0;
                case 27: goto L_0x0771;
                case 28: goto L_0x07a5;
                case 29: goto L_0x0818;
                case 30: goto L_0x0851;
                case 31: goto L_0x0867;
                case 32: goto L_0x0877;
                case 33: goto L_0x08b9;
                case 34: goto L_0x08fd;
                case 35: goto L_0x091c;
                case 36: goto L_0x092e;
                case 37: goto L_0x097d;
                case 38: goto L_0x0a74;
                case 39: goto L_0x0b55;
                case 40: goto L_0x0b8d;
                case 41: goto L_0x0cb8;
                case 42: goto L_0x0cf0;
                case 43: goto L_0x0dcd;
                case 44: goto L_0x0e0e;
                case 45: goto L_0x0e7e;
                case 46: goto L_0x0ebf;
                case 47: goto L_0x0ed1;
                case 48: goto L_0x0f01;
                case 49: goto L_0x0f6b;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r3 = r0.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r3.get(r10)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0030
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.get(r9)
            if (r0 == 0) goto L_0x002b
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r1 - r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            return r9
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0035:
            android.view.ViewGroup r1 = X.C51969G9p.A0Q(r10)
            r4 = 0
            android.view.View r3 = r1.getChildAt(r4)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r3, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            java.lang.Object r2 = r0.A01
            X.Gws r2 = (X.C53948Gws) r2
            X.7dd r0 = r2.A01
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            if (r1 == 0) goto L_0x0061
            X.0iw r0 = r2.A03
            r3.setUrl(r1, r0)
            r0 = 20
            X.C56800ICx.A00(r3, r0, r2)
            X.IDG r0 = new X.IDG
            r0.<init>(r2, r4)
            r3.setOnLongClickListener(r0)
        L_0x0061:
            r1 = 42
            X.Inh r0 = new X.Inh
            r0.<init>(r3, r1)
            X.3eI r9 = X.C51965G9l.A0f(r0)
            return r9
        L_0x006d:
            X.2WF r9 = (X.AnonymousClass2WF) r9
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r10 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            android.content.Context r1 = r9.A00()
            java.lang.Object r0 = r0.A01
            X.Gws r0 = (X.C53948Gws) r0
            int r0 = r0.A00
            int r0 = X.DbS.A02(r1, r0)
            r10.setCornerRadius(r0)
            r1 = 43
            X.Inh r0 = new X.Inh
            r0.<init>(r10, r1)
            goto L_0x00bc
        L_0x008d:
            android.view.ViewGroup r1 = X.C51969G9p.A0Q(r10)
            r4 = 0
            android.view.View r3 = r1.getChildAt(r4)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.comments.commentactions.CommentActionsMultiSelect"
            X.0qQ.A0C(r3, r1)
            com.instagram.comments.commentactions.CommentActionsMultiSelect r3 = (com.instagram.comments.commentactions.CommentActionsMultiSelect) r3
            java.lang.Object r2 = r0.A01
            X.Gwe r2 = (X.C53934Gwe) r2
            X.GpT r1 = r2.A01
            boolean r0 = r1.A00
            r3.setRestrictButtonVisibility(r0)
            r3.setBlockButtonVisibility(r0)
            boolean r0 = r1.A01
            r3.setDeleteButtonVisibility(r0)
            X.GgO r1 = r2.A00
            X.0qQ.A0B(r1, r4)
            java.util.Set r0 = r3.A00
            r0.add(r1)
            X.Ipu r0 = X.C58313Ipu.A00
        L_0x00bc:
            X.3eI r9 = X.C51965G9l.A0f(r0)
            return r9
        L_0x00c1:
            X.7et r9 = (X.C336607et) r9
            java.lang.String r10 = (java.lang.String) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            X.2V1 r1 = r9.A00
            android.content.Context r1 = r1.A0C
            int r14 = X.C51968G9o.A04(r1)
            java.lang.Object r1 = r0.A01
            X.Gts r1 = (X.C53763Gts) r1
            r0 = 21
            X.Phi r11 = new X.Phi
            r11.<init>(r10, r1, r0)
            X.J1Z r12 = X.J1Z.A00
            X.0sP r13 = r1.A04
            X.GuH r9 = new X.GuH
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x00e5:
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r0 = r0.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.C16917VAu.A00(r0, r9)
            goto L_0x0fd1
        L_0x00f0:
            java.lang.Object r0 = r0.A01
            X.LjJ r0 = (X.C64857LjJ) r0
            java.lang.Runnable r0 = r0.A08
            if (r0 == 0) goto L_0x0fd1
            r0.run()
            goto L_0x0fd1
        L_0x00fd:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x010c
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x010c:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x011a
            r2 = 873406610(0x340f2092, float:1.3329762E-7)
            java.lang.String r1 = "com.instagram.compose.core.viewpoint.ProvideMerlinNodeRegistry.<anonymous> (LocalMerlinNodeRegistry.kt:115)"
            X.0fL.A01(r2, r1)
        L_0x011a:
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 0
            X.C51967G9n.A1P(r9, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 2084981497(0x7c464af9, float:4.1183816E36)
            goto L_0x0fce
        L_0x012d:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x013c
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x013c:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x014a
            r2 = -1908850999(0xffffffff8e393ec9, float:-2.283324E-30)
            java.lang.String r1 = "com.instagram.compose.fragment.IgComposeView.<anonymous>.<anonymous>.<anonymous> (IgComposeView.kt:29)"
            X.0fL.A01(r2, r1)
        L_0x014a:
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 0
            X.C51967G9n.A1P(r9, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -969342429(0xffffffffc6390223, float:-11840.534)
            goto L_0x0fce
        L_0x015d:
            X.I1m r9 = (X.C56558I1m) r9
            X.I1m r10 = (X.C56558I1m) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r5 = r0.A01
            X.5Oz r5 = (X.C284945Oz) r5
            int r7 = r10.A01
            int r6 = r9.A02
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r7 >= r6) goto L_0x01b8
            int r3 = r10.A02
            int r0 = r9.A01
            if (r3 > r0) goto L_0x01a4
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0178:
            int r8 = r10.A03
            int r7 = r9.A00
            if (r8 >= r7) goto L_0x01a2
            int r6 = r10.A00
            int r0 = r9.A03
            if (r6 <= r0) goto L_0x0197
            int r3 = r6 - r8
            if (r3 == 0) goto L_0x01a2
            int r2 = java.lang.Math.max(r0, r8)
            int r0 = java.lang.Math.min(r7, r6)
            int r2 = r2 + r0
            int r0 = r2 / 2
            int r0 = r0 - r8
            float r4 = (float) r0
            float r0 = (float) r3
            float r4 = r4 / r0
        L_0x0197:
            long r1 = X.C285615Rz.A00(r1, r4)
            X.5Ry r0 = new X.5Ry
            r0.<init>(r1)
            goto L_0x0ecc
        L_0x01a2:
            r4 = 0
            goto L_0x0197
        L_0x01a4:
            int r2 = r3 - r7
            if (r2 == 0) goto L_0x01b8
            int r1 = java.lang.Math.max(r0, r7)
            int r0 = java.lang.Math.min(r6, r3)
            int r1 = r1 + r0
            int r0 = r1 / 2
            int r0 = r0 - r7
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            goto L_0x0178
        L_0x01b8:
            r1 = 0
            goto L_0x0178
        L_0x01ba:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x01c9
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x01c9:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01d7
            r2 = 1150749034(0x4497096a, float:1208.2942)
            java.lang.String r1 = "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBar.<anonymous>.<anonymous>.<anonymous> (IgdsActionBar.kt:249)"
            X.0fL.A01(r2, r1)
        L_0x01d7:
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            if (r1 == 0) goto L_0x01e1
            r0 = 0
            X.C51967G9n.A1P(r9, r1, r0)
        L_0x01e1:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 1592649024(0x5eede540, float:8.571089E18)
            goto L_0x0fce
        L_0x01ec:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x01fb
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x01fb:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0209
            r2 = -1499310133(0xffffffffa6a257cb, float:-1.1264804E-15)
            java.lang.String r1 = "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBarEndAddOn.<anonymous> (IgdsActionBar.kt:281)"
            X.0fL.A01(r2, r1)
        L_0x0209:
            java.lang.Object r0 = r0.A01
            X.JNx r0 = (X.C59551JNx) r0
            X.Gpl r0 = (X.C53515Gpl) r0
            X.JLl r0 = r0.A01
            X.IPb r0 = (X.C57112IPb) r0
            int r1 = r0.A00
            r0 = 0
            X.C52739Gbr.A00(r9, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -2024139986(0xffffffff875a132e, float:-1.6406134E-34)
            goto L_0x0fce
        L_0x0224:
            X.07T r10 = (X.07T) r10
            r1 = 1
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.GVt r1 = (X.C52516GVt) r1
            int r0 = r10.ordinal()
            switch(r0) {
                case 0: goto L_0x0fd1;
                case 1: goto L_0x0fd1;
                case 2: goto L_0x0fd1;
                case 3: goto L_0x023a;
                case 4: goto L_0x0fd1;
                case 5: goto L_0x0fd1;
                case 6: goto L_0x0fd1;
                default: goto L_0x0235;
            }
        L_0x0235:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x023a:
            X.2nK r0 = r1.A00
            r0.onPause()
            goto L_0x0fd1
        L_0x0241:
            float r1 = X.C51975G9x.A02(r9, r10)
            java.lang.Object r0 = r0.A01
            X.6G1 r0 = (X.AnonymousClass6G1) r0
            X.5Oz r5 = r0.A01
            goto L_0x0ec8
        L_0x024d:
            float r1 = X.C51975G9x.A02(r9, r10)
            java.lang.Object r0 = r0.A01
            X.GQw r0 = (X.C52397GQw) r0
            X.5Oz r5 = r0.A03
            goto L_0x0ec8
        L_0x0259:
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r0 = r0.A01
            X.JWt r0 = (X.C59756JWt) r0
            X.0sL r0 = r0.A05
            r0.invoke(r9, r10)
            goto L_0x0fd1
        L_0x0268:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0277
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0277:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0285
            r2 = 1595118065(0x5f1391f1, float:1.0633545E19)
            java.lang.String r1 = "com.instagram.creation.capture.assetpicker.AssetGridRowItemViewBinder.Companion.bindView.<anonymous>.<anonymous>.<anonymous> (AssetGridRowItemViewBinder.kt:215)"
            X.0fL.A01(r2, r1)
        L_0x0285:
            java.lang.Object r2 = r0.A01
            X.0lg r2 = (X.0lg) r2
            X.0sL r1 = X.C45181Crj.A00
            java.lang.String r0 = "AssetGridRowItemViewBinder"
            X.C286885Ye.A02(r9, r2, r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -756729542(0xffffffffd2e5393a, float:-4.92253807E11)
            goto L_0x0fce
        L_0x029b:
            X.GPU r9 = (X.GPU) r9
            X.5dM r10 = (X.C289295dM) r10
            long r2 = r10.A00
            r1 = 0
            X.0qQ.A0B(r9, r1)
            r9.A01()
            java.lang.Object r0 = r0.A01
            X.C51971G9r.A1N(r0, r2)
            goto L_0x0fd1
        L_0x02af:
            X.5dM r10 = (X.C289295dM) r10
            long r2 = r10.A00
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            X.5dM r0 = X.C51965G9l.A0M(r2)
            r1.invoke(r9, r0)
            goto L_0x0fd1
        L_0x02c4:
            X.HKo r9 = (X.C54605HKo) r9
            X.5dM r10 = (X.C289295dM) r10
            long r1 = r10.A00
            r3 = 0
            X.0qQ.A0B(r9, r3)
            int[] r4 = X.C55325Hfs.A00
            int r3 = r9.ordinal()
            r4 = r4[r3]
            r3 = 1
            if (r4 == r3) goto L_0x0359
            r3 = 2
            if (r4 == r3) goto L_0x0333
            r3 = 3
            if (r4 == r3) goto L_0x030d
            r3 = 4
            if (r4 != r3) goto L_0x0308
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x02e8:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A00(r0, r9, r1)
            float r5 = X.C53037GhT.A02(r0, r9, r1)
            float r4 = r0.A01
            float r3 = r0.A03
            X.5VN r0 = new X.5VN
            r0.<init>(r4, r3, r5, r6)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x02e8
            goto L_0x0fd1
        L_0x0308:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x030d:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x0313:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A00(r0, r9, r1)
            float r5 = X.C53037GhT.A01(r0, r9, r1)
            float r4 = r0.A03
            float r3 = r0.A02
            X.5VN r0 = new X.5VN
            r0.<init>(r5, r4, r3, r6)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x0313
            goto L_0x0fd1
        L_0x0333:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x0339:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A03(r0, r9, r1)
            float r5 = X.C53037GhT.A02(r0, r9, r1)
            float r4 = r0.A01
            float r3 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r4, r6, r5, r3)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x0339
            goto L_0x0fd1
        L_0x0359:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x035f:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A03(r0, r9, r1)
            float r5 = X.C53037GhT.A01(r0, r9, r1)
            float r4 = r0.A02
            float r3 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r5, r6, r4, r3)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x035f
            goto L_0x0fd1
        L_0x037f:
            X.HLo r9 = (X.C54631HLo) r9
            X.5dM r10 = (X.C289295dM) r10
            long r1 = r10.A00
            r3 = 0
            int r4 = X.DbU.A02(r9, r3)
            if (r4 == r3) goto L_0x0406
            r3 = 1
            if (r4 == r3) goto L_0x03e2
            r3 = 2
            if (r4 == r3) goto L_0x03be
            r3 = 3
            if (r4 != r3) goto L_0x03b9
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x039b:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A00(r0, r9, r1)
            float r5 = r0.A01
            float r4 = r0.A03
            float r3 = r0.A02
            X.5VN r0 = new X.5VN
            r0.<init>(r5, r4, r3, r6)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x039b
            goto L_0x0fd1
        L_0x03b9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03be:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x03c4:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A02(r0, r9, r1)
            float r5 = r0.A01
            float r4 = r0.A03
            float r3 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r5, r4, r6, r3)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x03c4
            goto L_0x0fd1
        L_0x03e2:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x03e8:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A01(r0, r9, r1)
            float r5 = r0.A03
            float r4 = r0.A02
            float r3 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r6, r5, r4, r3)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x03e8
            goto L_0x0fd1
        L_0x0406:
            java.lang.Object r9 = r0.A01
            X.GhT r9 = (X.C53037GhT) r9
            X.05G r8 = r9.A00
        L_0x040c:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r6 = X.C53037GhT.A03(r0, r9, r1)
            float r5 = r0.A01
            float r4 = r0.A02
            float r3 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r5, r6, r4, r3)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x040c
            goto L_0x0fd1
        L_0x042a:
            java.lang.Object r0 = r0.A01
            X.8hG r0 = (X.C362048hG) r0
            android.app.Activity r0 = r0.A0N
            X.C63138Ks6.A00(r0)
            goto L_0x0fd1
        L_0x0435:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0444
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0444:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0452
            r2 = 1343774843(0x5018607b, float:1.02258391E10)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoAudienceSelectorFragment.onCreateView.<anonymous> (PotatoAudienceSelectorFragment.kt:41)"
            X.0fL.A01(r2, r1)
        L_0x0452:
            java.lang.Object r4 = r0.A01
            X.K41 r4 = (X.K41) r4
            X.0eM r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            X.Jgw r0 = (X.C60177Jgw) r0
            X.0Ud r0 = r0.A04
            r3 = 0
            X.4gU r1 = X.C3025664b.A01(r9, r0)
            java.lang.Object r0 = r1.getValue()
            X.Jw1 r0 = (X.C61063Jw1) r0
            java.lang.Object r14 = r0.A03
            X.62P r14 = (X.AnonymousClass62P) r14
            java.lang.Object r0 = r1.getValue()
            X.Jw1 r0 = (X.C61063Jw1) r0
            java.lang.Object r10 = r0.A02
            X.HN3 r10 = (X.HN3) r10
            java.lang.Object r0 = r1.getValue()
            X.Jw1 r0 = (X.C61063Jw1) r0
            int r15 = r0.A01
            r0 = -89919863(0xfffffffffaa3ee89, float:-4.2559123E35)
            boolean r0 = X.C51967G9n.A1Z(r9, r4, r0)
            java.lang.Object r11 = r9.ECw()
            if (r0 != 0) goto L_0x0492
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r11 != r0) goto L_0x049c
        L_0x0492:
            r0 = 38
            X.MMU r11 = new X.MMU
            r11.<init>(r4, r0)
            r9.FLL(r11)
        L_0x049c:
            X.0sa r11 = (X.C62320sa) r11
            X.5Wx r2 = X.C51965G9l.A0H(r9, r3)
            r0 = -89917337(0xfffffffffaa3f867, float:-4.256913E35)
            boolean r1 = X.C51967G9n.A1Z(r9, r4, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x04b3
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x04bd
        L_0x04b3:
            r1 = 39
            X.MMU r0 = new X.MMU
            r0.<init>(r4, r1)
            r9.FLL(r0)
        L_0x04bd:
            X.0sa r12 = X.C51965G9l.A0y(r2, r0, r3)
            r0 = -89914663(0xfffffffffaa402d9, float:-4.2579722E35)
            boolean r1 = X.C51967G9n.A1Z(r9, r4, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x04d2
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x04dc
        L_0x04d2:
            r1 = 44
            X.MMs r0 = new X.MMs
            r0.<init>(r4, r1)
            r9.FLL(r0)
        L_0x04dc:
            X.0sP r13 = X.C51965G9l.A0z(r2, r0)
            r16 = r3
            X.C56571I2b.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -1917176878(0xffffffff8dba33d2, float:-1.147561E-30)
            goto L_0x0fce
        L_0x04f0:
            X.5Wy r9 = (X.C286575Wy) r9
            int r1 = X.C51968G9o.A0B(r10)
            r6 = 2
            if (r1 != r6) goto L_0x04ff
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x04ff:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x050d
            r2 = -957331862(0xffffffffc6f0466a, float:-30755.207)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoPostCaptureFragment.onCreateView.<anonymous>.<anonymous> (PotatoPostCaptureFragment.kt:75)"
            X.0fL.A01(r2, r1)
        L_0x050d:
            android.content.Context r1 = X.C51968G9o.A0I(r9)
            android.app.Activity r5 = X.C61270mF.A01(r1)
            boolean r1 = r5 instanceof androidx.activity.ComponentActivity
            r10 = 0
            if (r1 == 0) goto L_0x0766
            androidx.activity.ComponentActivity r5 = (androidx.activity.ComponentActivity) r5
        L_0x051c:
            r1 = -1777588827(0xffffffff960c25a5, float:-1.1320988E-25)
            r9.ExS(r1)
            if (r5 == 0) goto L_0x0547
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r9)
            long r1 = r1.A0c
            int r1 = X.C285595Rx.A00(r1)
            X.IyQ r4 = X.C58839IyQ.A00
            X.OEk r3 = new X.OEk
            r3.<init>(r4, r1, r1, r6)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r9)
            long r1 = r1.A0c
            int r2 = X.C285595Rx.A00(r1)
            X.OEk r1 = new X.OEk
            r1.<init>(r4, r2, r2, r6)
            X.OSU.A00(r5, r3, r1)
        L_0x0547:
            r1 = r9
            X.5Wx r1 = (X.C286565Wx) r1
            r2 = 0
            X.C286565Wx.A0L(r1, r2)
            java.lang.Object r0 = r0.A01
            X.K4N r0 = (X.K4N) r0
            X.0eM r3 = r0.A01
            java.lang.Object r3 = r3.getValue()
            X.JhI r3 = (X.C60199JhI) r3
            X.0Ud r3 = r3.A06
            X.4gU r4 = X.C3025664b.A01(r9, r3)
            X.4bM r3 = X.AnonymousClass5YA.A01
            java.lang.Object r7 = r9.AJO(r3)
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0574
            r5 = -353618658(0xffffffffeaec351e, float:-1.4277867E26)
            java.lang.String r3 = "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)"
            X.0fL.A01(r5, r3)
        L_0x0574:
            X.HpJ r3 = X.I4O.A0N
            X.I4O r3 = r3.A00(r9)
            X.IF1 r5 = r3.A08
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0588
            r3 = 1645738837(0x6217fb55, float:7.008922E20)
            X.0fL.A00(r3)
        L_0x0588:
            X.5Oz r6 = X.C287175Zh.A00(r9, r5)
            r3 = -1777566594(0xffffffff960c7c7e, float:-1.1348393E-25)
            boolean r5 = X.G9t.A1Z(r9, r6, r7, r3)
            java.lang.Object r3 = r9.ECw()
            if (r5 != 0) goto L_0x059d
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r3 != r5) goto L_0x05a7
        L_0x059d:
            r5 = 38
            X.MJ9 r3 = new X.MJ9
            r3.<init>(r5, r7, r6)
            r9.FLL(r3)
        L_0x05a7:
            X.0sa r3 = X.C51965G9l.A0y(r1, r3, r2)
            X.5TX r3 = X.C51965G9l.A0I(r10, r3)
            java.lang.Object r5 = r3.getValue()
            boolean r5 = X.AnonymousClass7TE.A1a(r5)
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x05be
            r11 = 1062836634(0x3f59999a, float:0.85)
        L_0x05be:
            r6 = 1061158912(0x3f400000, float:0.75)
            r5 = 1153138688(0x44bb8000, float:1500.0)
            X.5b7 r8 = X.C51965G9l.A0F(r10, r6, r5)
            r12 = 3120(0xc30, float:4.372E-42)
            r13 = 20
            X.4gU r7 = X.I69.A02(r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r4.getValue()
            X.JwC r5 = (X.C61074JwC) r5
            java.lang.Object r6 = r5.A01
            X.MQJ r6 = (X.MQJ) r6
            boolean r5 = r6 instanceof X.C65027Lm6
            if (r5 == 0) goto L_0x06b8
            r5 = -1777548302(0xffffffff960cc3f2, float:-1.1370939E-25)
            java.lang.Object r5 = X.C51967G9n.A0n(r9, r4, r5)
            X.JwC r5 = (X.C61074JwC) r5
            java.lang.Object r5 = r5.A00
            X.HN3 r5 = (X.HN3) r5
            int r5 = r5.A01
            java.lang.Object r6 = r4.getValue()
            X.JwC r6 = (X.C61074JwC) r6
            java.lang.Object r6 = r6.A03
            X.L0M r6 = (X.L0M) r6
            android.graphics.Path r6 = r6.A00
            X.IG5 r10 = new X.IG5
            r10.<init>(r6)
            float r16 = X.C51971G9r.A03(r7)
            java.lang.Object r4 = r4.getValue()
            X.JwC r4 = (X.C61074JwC) r4
            java.lang.Object r8 = r4.A02
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r4 = -1777538741(0xffffffff960ce94b, float:-1.1382724E-25)
            boolean r6 = X.G9t.A1X(r9, r0, r3, r4)
            java.lang.Object r4 = r9.ECw()
            if (r6 != 0) goto L_0x061c
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x0626
        L_0x061c:
            r6 = 35
            X.MJ9 r4 = new X.MJ9
            r4.<init>(r6, r3, r0)
            r9.FLL(r4)
        L_0x0626:
            X.0sa r11 = X.C51965G9l.A0y(r1, r4, r2)
            r3 = -1777534000(0xffffffff960cfbd0, float:-1.1388568E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x063b
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x0645
        L_0x063b:
            r4 = 44
            X.MMU r3 = new X.MMU
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x0645:
            X.0sa r12 = X.C51965G9l.A0y(r1, r3, r2)
            r3 = -1777530853(0xffffffff960d081b, float:-1.1392447E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x065a
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x0664
        L_0x065a:
            r4 = 45
            X.MMs r3 = new X.MMs
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x0664:
            X.0sP r15 = X.C51965G9l.A0z(r1, r3)
            r3 = -1777526213(0xffffffff960d1a3b, float:-1.1398166E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x0679
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x0683
        L_0x0679:
            r4 = 45
            X.MMU r3 = new X.MMU
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x0683:
            X.0sa r13 = X.C51965G9l.A0y(r1, r3, r2)
            r3 = -1777521969(0xffffffff960d2acf, float:-1.1403397E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x0698
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x06a2
        L_0x0698:
            r4 = 46
            X.MMU r3 = new X.MMU
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x06a2:
            X.0sa r14 = X.C51965G9l.A0y(r1, r3, r2)
            r17 = r5
            r18 = r2
            X.C54907HXp.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x06ad:
            boolean r0 = X.C51967G9n.A1b(r1, r2)
            if (r0 == 0) goto L_0x0fd1
            r0 = 147871082(0x8d0556a, float:1.2538625E-33)
            goto L_0x0fce
        L_0x06b8:
            boolean r5 = r6 instanceof X.IQA
            if (r5 == 0) goto L_0x0769
            r5 = -1777517282(0xffffffff960d3d1e, float:-1.1409174E-25)
            r9.ExS(r5)
            X.IQA r6 = (X.IQA) r6
            java.lang.String r12 = r6.A01
            com.instagram.common.typedurl.ImageUrl r11 = r6.A00
            java.lang.Object r5 = r4.getValue()
            X.JwC r5 = (X.C61074JwC) r5
            java.lang.Object r5 = r5.A03
            X.L0M r5 = (X.L0M) r5
            android.graphics.Path r5 = r5.A00
            X.IG5 r10 = new X.IG5
            r10.<init>(r5)
            java.lang.Object r4 = r4.getValue()
            X.JwC r4 = (X.C61074JwC) r4
            java.lang.Object r8 = r4.A02
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r4 = -1777506965(0xffffffff960d656b, float:-1.1421891E-25)
            boolean r5 = X.G9t.A1X(r9, r0, r3, r4)
            java.lang.Object r4 = r9.ECw()
            if (r5 != 0) goto L_0x06f4
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x06fe
        L_0x06f4:
            r5 = 36
            X.MJ9 r4 = new X.MJ9
            r4.<init>(r5, r3, r0)
            r9.FLL(r4)
        L_0x06fe:
            X.0sa r13 = X.C51965G9l.A0y(r1, r4, r2)
            r4 = -1777502133(0xffffffff960d784b, float:-1.1427847E-25)
            boolean r5 = X.G9t.A1X(r9, r0, r3, r4)
            java.lang.Object r4 = r9.ECw()
            if (r5 != 0) goto L_0x0713
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x071d
        L_0x0713:
            r5 = 37
            X.MJ9 r4 = new X.MJ9
            r4.<init>(r5, r3, r0)
            r9.FLL(r4)
        L_0x071d:
            X.0sa r14 = X.C51965G9l.A0y(r1, r4, r2)
            r3 = -1777497456(0xffffffff960d8a90, float:-1.1433612E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x0732
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x073c
        L_0x0732:
            r4 = 47
            X.MMU r3 = new X.MMU
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x073c:
            X.0sa r15 = X.C51965G9l.A0y(r1, r3, r2)
            r3 = -1777494545(0xffffffff960d95ef, float:-1.14372E-25)
            boolean r4 = X.C51967G9n.A1Z(r9, r0, r3)
            java.lang.Object r3 = r9.ECw()
            if (r4 != 0) goto L_0x0751
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x075b
        L_0x0751:
            r4 = 48
            X.MMU r3 = new X.MMU
            r3.<init>(r0, r4)
            r9.FLL(r3)
        L_0x075b:
            X.0sa r16 = X.C51965G9l.A0y(r1, r3, r2)
            r17 = r2
            X.C56267Hvb.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x06ad
        L_0x0766:
            r5 = r10
            goto L_0x051c
        L_0x0769:
            r0 = -1777550535(0xffffffff960cbb39, float:-1.1368187E-25)
            X.Wub r0 = X.C51972G9s.A0v(r9, r1, r0)
            throw r0
        L_0x0771:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0780
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0780:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x078e
            r2 = -837210887(0xffffffffce192cf9, float:-6.4246534E8)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoPostCaptureFragment.onCreateView.<anonymous> (PotatoPostCaptureFragment.kt:74)"
            X.0fL.A01(r2, r1)
        L_0x078e:
            r3 = 554836319(0x2112215f, float:4.951089E-19)
            java.lang.Object r2 = r0.A01
            r1 = 26
            X.J6u r0 = new X.J6u
            r0.<init>(r2, r1)
            boolean r0 = X.C51975G9x.A1T(r9, r0, r3)
            if (r0 == 0) goto L_0x0fd1
            r0 = 909322017(0x36332721, float:2.6695855E-6)
            goto L_0x0fce
        L_0x07a5:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x07b4
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x07b4:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x07c2
            r2 = 1887425470(0x707fd3be, float:3.1669863E29)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.publiccollections.PublicCollectionsDeprecationBottomSheet.onCreateView.<anonymous> (PublicCollectionsDeprecationBottomSheet.kt:49)"
            X.0fL.A01(r2, r1)
        L_0x07c2:
            r1 = -178186082(0xfffffffff561189e, float:-2.8534328E32)
            r9.ExS(r1)
            java.lang.Object r5 = r0.A01
            boolean r0 = r9.AGw(r5)
            java.lang.Object r4 = r9.ECw()
            if (r0 != 0) goto L_0x07d8
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x07e2
        L_0x07d8:
            r0 = 9
            X.MMe r4 = new X.MMe
            r4.<init>(r5, r0)
            r9.FLL(r4)
        L_0x07e2:
            X.0sa r4 = (X.C62320sa) r4
            r3 = r9
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r0 = -178184382(0xfffffffff5611f42, float:-2.8537617E32)
            boolean r1 = X.C51967G9n.A1Z(r9, r5, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x07fc
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0806
        L_0x07fc:
            r1 = 10
            X.MMe r0 = new X.MMe
            r0.<init>(r5, r1)
            r9.FLL(r0)
        L_0x0806:
            X.0sa r0 = X.C51965G9l.A0y(r3, r0, r2)
            X.C56268Hvc.A01(r9, r4, r0, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -1876055960(0xffffffff902da868, float:-3.424797E-29)
            goto L_0x0fce
        L_0x0818:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0827
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0827:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0835
            r2 = -1521104693(0xffffffffa555c8cb, float:-1.8542836E-16)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.maybeInitializeContainer.<anonymous>.<anonymous> (ClipsTimelineEditorDrawerController.kt:1630)"
            X.0fL.A01(r2, r1)
        L_0x0835:
            java.lang.Object r0 = r0.A01
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r0
            com.instagram.common.session.UserSession r2 = r0.A0a
            X.0sL r1 = X.C45182Crk.A00
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C286885Ye.A02(r9, r2, r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 1063371055(0x3f61c12f, float:0.881854)
            goto L_0x0fce
        L_0x0851:
            X.C51965G9l.A1U(r9)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            r1 = 1
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.KLu r1 = (X.C61781KLu) r1
            java.util.List r0 = X.C60680JpR.A00
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.A02
            r0.setImageBitmap(r10)
            goto L_0x0fd1
        L_0x0867:
            int r1 = X.AnonymousClass7TE.A0M(r9)
            X.C51965G9l.A1U(r10)
            java.lang.Object r0 = r0.A01
            X.KMS r0 = (X.KMS) r0
            r0.A0O(r1)
            goto L_0x0fd1
        L_0x0877:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0886
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0886:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0894
            r2 = 1133589125(0x43913285, float:290.39468)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.sundial.overlay.ClipsPostCaptureOverlay.<anonymous>.<anonymous>.<anonymous> (ClipsPostCaptureOverlay.kt:41)"
            X.0fL.A01(r2, r1)
        L_0x0894:
            java.lang.Object r3 = r0.A01
            X.Hrl r3 = (X.C56038Hrl) r3
            X.0eM r0 = r3.A02
            java.lang.Object r0 = r0.getValue()
            X.GgV r0 = (X.C52978GgV) r0
            X.0Ud r0 = r0.A01
            r2 = 0
            java.lang.Object r1 = X.G9w.A0g(r9, r0, r2)
            X.9rn r1 = (X.C390759rn) r1
            X.0sP r0 = r3.A05
            X.C56600I3q.A00(r9, r1, r0, r2, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 1878504468(0x6ff7b414, float:1.53321E29)
            goto L_0x0fce
        L_0x08b9:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x08c8
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x08c8:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x08d6
            r2 = 1659602610(0x62eb86b2, float:2.1723453E21)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.sundial.overlay.ClipsPostCaptureOverlay.<anonymous>.<anonymous> (ClipsPostCaptureOverlay.kt:39)"
            X.0fL.A01(r2, r1)
        L_0x08d6:
            java.lang.Object r3 = r0.A01
            X.Hrl r3 = (X.C56038Hrl) r3
            X.4DH r10 = r3.A01
            r13 = 1
            r14 = 0
            r2 = 1615727025(0x604e09b1, float:5.938637E19)
            r1 = 32
            X.J6u r0 = new X.J6u
            r0.<init>(r3, r1)
            X.5PJ r11 = X.AnonymousClass5PI.A01(r9, r0, r2)
            r12 = 28080(0x6db0, float:3.9348E-41)
            r15 = r14
            X.C52450GTc.A00(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -5226326(0xffffffffffb040aa, float:NaN)
            goto L_0x0fce
        L_0x08fd:
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r5 = r0.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            X.12T r0 = X.AnonymousClass12T.A00
            r3 = 0
            X.0nV r2 = X.DbX.A0c(r0)
            r1 = 41
            X.MGV r0 = new X.MGV
            r0.<init>(r5, r9, r3, r1)
            X.1Eo.A05(r2, r0, r4)
            goto L_0x0fd1
        L_0x091c:
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.51M r10 = (X.AnonymousClass51M) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r0 = r0.A01
            X.87s r0 = (X.C3511387s) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A0L
            r0.A0d(r10, r9)
            goto L_0x0fd1
        L_0x092e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = (java.lang.String) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r1 = r0.A01
            X.K4A r1 = (X.K4A) r1
            X.0eM r0 = r1.A02
            java.lang.Object r5 = r0.getValue()
            X.Jfb r5 = (X.C60095Jfb) r5
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            r3 = 0
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 1105(0x451, float:1.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r10)
            r0 = 40
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putBoolean(r0, r3)
            X.K4Z r2 = new X.K4Z
            r2.<init>()
            r2.setArguments(r1)
            X.ILs r0 = new X.ILs
            r0.<init>(r5, r9)
            r2.A00 = r0
            com.instagram.common.session.UserSession r0 = r5.A02
            X.7Pr r1 = X.DbS.A0W(r0)
            X.2k4 r0 = X.AnonymousClass2k4.DEFAULT
            X.0qQ.A0B(r0, r3)
            r1.A0O = r0
            X.DbU.A0y(r4, r2, r1)
            goto L_0x0fd1
        L_0x097d:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x098c
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x098c:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x099a
            r2 = 2043023746(0x79c61182, float:1.2855373E35)
            java.lang.String r1 = "com.instagram.creation.drafts.fragments.FeedDraftsFragment.onCreateView.<anonymous> (FeedDraftsFragment.kt:75)"
            X.0fL.A01(r2, r1)
        L_0x099a:
            java.lang.Object r2 = r0.A01
            X.K4A r2 = (X.K4A) r2
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.Jfb r0 = (X.C60095Jfb) r0
            X.0r6 r0 = r0.A05
            r4 = 0
            r7 = 3
            r8 = 38
            X.JVf r3 = new X.JVf
            r5 = r4
            r6 = r4
            r3.<init>((X.C54649HMg) r4, (kotlin.jvm.internal.DefaultConstructorMarker) r5, (X.AnonymousClass62P) r6, (int) r7, (int) r8)
            r14 = 0
            X.4gU r6 = X.AnonymousClass6FW.A01(r9, r3, r0, r14)
            androidx.compose.ui.Modifier r4 = X.C51969G9p.A0U()
            X.5RD r1 = X.C51969G9p.A0Z(r9, r14)
            int r5 = X.C287425a7.A00(r9)
            r3 = r9
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r9, r4)
            X.C51973G9u.A0y(r9, r3)
            X.C51971G9r.A12(r9, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x09e1
            boolean r0 = X.C51972G9s.A1Q(r9, r5)
            if (r0 != 0) goto L_0x09e4
        L_0x09e1:
            X.C51971G9r.A13(r9, r1, r5)
        L_0x09e4:
            X.C51965G9l.A18(r9, r4)
            java.lang.Object r0 = r6.getValue()
            X.JVf r0 = (X.C59721JVf) r0
            java.lang.Object r4 = r0.A00
            X.HMg r4 = (X.C54649HMg) r4
            r0 = -1236143176(0xffffffffb651f3b8, float:-3.128529E-6)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0a02
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0a06
        L_0x0a02:
            X.MP4 r1 = X.C51969G9p.A0z(r9, r2, r14)
        L_0x0a06:
            X.0sP r0 = X.C51965G9l.A0z(r3, r1)
            X.C56270Hve.A01(r9, r4, r0, r14)
            java.lang.Object r10 = r6.getValue()
            X.JVf r10 = (X.C59721JVf) r10
            r0 = -1236139188(0xffffffffb652034c, float:-3.1294358E-6)
            boolean r1 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x0a24
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0a2e
        L_0x0a24:
            r1 = 36
            X.J6u r0 = new X.J6u
            r0.<init>(r2, r1)
            r9.FLL(r0)
        L_0x0a2e:
            X.0sL r13 = X.C51965G9l.A10(r3, r0)
            r0 = -1236133969(0xffffffffb65217af, float:-3.1306224E-6)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0a43
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0a48
        L_0x0a43:
            r0 = 1
            X.MP4 r1 = X.C51969G9p.A0z(r9, r2, r0)
        L_0x0a48:
            X.0sP r11 = X.C51965G9l.A0z(r3, r1)
            r0 = -1236127817(0xffffffffb6522fb7, float:-3.1320212E-6)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0a5d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0a62
        L_0x0a5d:
            r0 = 2
            X.MP4 r1 = X.C51969G9p.A0z(r9, r2, r0)
        L_0x0a62:
            X.0sP r12 = X.C51965G9l.A0z(r3, r1)
            X.C56667I6w.A01(r9, r10, r11, r12, r13, r14)
            boolean r0 = X.C51967G9n.A1R(r9)
            if (r0 == 0) goto L_0x0fd1
            r0 = 391029330(0x174ea252, float:6.6767067E-25)
            goto L_0x0fce
        L_0x0a74:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0a83
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0a83:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0a91
            r2 = 1149118497(0x447e2821, float:1016.627)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreatedWithAIBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (CreatedWithAIBottomSheetFragment.kt:64)"
            X.0fL.A01(r2, r1)
        L_0x0a91:
            X.5Zr r2 = X.C287215Zl.A00
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r10 = 0
            r4 = 1094713344(0x41400000, float:12.0)
            r1 = 1101529088(0x41a80000, float:21.0)
            r3 = 0
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0B(r5, r3, r4, r3, r1)
            java.lang.Object r8 = r0.A01
            X.H1m r8 = (X.C54167H1m) r8
            X.5Zx r0 = X.C287275Zs.A07
            X.5RD r1 = X.C291495hO.A00(r0, r9, r2)
            r14 = 0
            int r7 = X.C287425a7.A00(r9)
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r9, r6)
            X.C51973G9u.A0y(r9, r2)
            X.C51971G9r.A12(r9, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0acb
            boolean r0 = X.C51972G9s.A1Q(r9, r7)
            if (r0 != 0) goto L_0x0ace
        L_0x0acb:
            X.C51971G9r.A13(r9, r1, r7)
        L_0x0ace:
            X.C51965G9l.A18(r9, r6)
            X.1Xj r6 = r8.A00
            r0 = 1442342658(0x55f86702, float:3.41401624E13)
            r9.ExS(r0)
            if (r6 != 0) goto L_0x0b45
            r1 = r10
        L_0x0adc:
            X.C286565Wx.A0L(r2, r14)
            r0 = 1442345829(0x55f87365, float:3.41468124E13)
            r9.ExS(r0)
            if (r1 == 0) goto L_0x0b0b
            X.2DN r17 = X.1zC.A00(r9, r1)
            X.5bM r18 = X.C288075bK.A01
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r5, r3, r3, r3, r4)
            r0 = 1116733440(0x42900000, float:72.0)
            androidx.compose.ui.Modifier r1 = X.C287205Zk.A0D(r1, r0)
            r0 = 1058013184(0x3f100000, float:0.5625)
            androidx.compose.ui.Modifier r1 = X.C54739HQw.A00(r1, r0, r14)
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r16 = X.C51968G9o.A0P(r1, r0)
            r20 = 24624(0x6030, float:3.4506E-41)
            java.lang.String r19 = ""
            r15 = r9
            X.AnonymousClass6G3.A0A(r15, r16, r17, r18, r19, r20)
        L_0x0b0b:
            X.C286565Wx.A0L(r2, r14)
            r11 = 2131238544(0x7f081e90, float:1.809337E38)
            r12 = 2131956911(0x7f1314af, float:1.9550391E38)
            r13 = 2131956910(0x7f1314ae, float:1.955039E38)
            r15 = 8
            X.C54910HXs.A00(r9, r10, r11, r12, r13, r14, r15)
            X.0sL r1 = X.C55388Hgu.A00
            r2 = 2131238319(0x7f081daf, float:1.8092913E38)
            r3 = 2131956913(0x7f1314b1, float:1.9550395E38)
            r4 = 2131956912(0x7f1314b0, float:1.9550393E38)
            r5 = 3072(0xc00, float:4.305E-42)
            r0 = r9
            r6 = r14
            X.C54910HXs.A00(r0, r1, r2, r3, r4, r5, r6)
            r11 = 2131238628(0x7f081ee4, float:1.809354E38)
            r12 = 2131956904(0x7f1314a8, float:1.9550377E38)
            r13 = 2131956903(0x7f1314a7, float:1.9550375E38)
            X.C54910HXs.A00(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.C51967G9n.A1R(r9)
            if (r0 == 0) goto L_0x0fd1
            r0 = 234506799(0xdfa4a2f, float:1.5425299E-30)
            goto L_0x0fce
        L_0x0b45:
            X.4cd r1 = X.C51968G9o.A0Y(r9)
            r0 = 1116733440(0x42900000, float:72.0)
            float r0 = r1.F06(r0)
            int r0 = (int) r0
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A1m(r0)
            goto L_0x0adc
        L_0x0b55:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0b64
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0b64:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0b72
            r2 = -1356781732(0xffffffffaf21275c, float:-1.4656848E-10)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreatedWithAIBottomSheetFragment.onCreateView.<anonymous> (CreatedWithAIBottomSheetFragment.kt:63)"
            X.0fL.A01(r2, r1)
        L_0x0b72:
            long r2 = X.C51966G9m.A0J(r9)
            r5 = 805429559(0x3001e137, float:4.7249976E-10)
            java.lang.Object r4 = r0.A01
            r1 = 38
            X.J6u r0 = new X.J6u
            r0.<init>(r4, r1)
            boolean r0 = X.C51975G9x.A1U(r9, r0, r5, r2)
            if (r0 == 0) goto L_0x0fd1
            r0 = 222503957(0xd432415, float:6.0132446E-31)
            goto L_0x0fce
        L_0x0b8d:
            X.5Wy r9 = (X.C286575Wy) r9
            int r1 = X.C51968G9o.A0B(r10)
            r3 = 2
            if (r1 != r3) goto L_0x0b9c
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0b9c:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0baa
            r2 = -121495567(0xfffffffff8c21ff1, float:-3.1498545E34)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (CreationGenAIAttributionBottomSheetFragment.kt:58)"
            X.0fL.A01(r2, r1)
        L_0x0baa:
            java.lang.Object r2 = r0.A01
            X.K7h r2 = (X.C61432K7h) r2
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r2.A00
            java.lang.String r5 = "params"
            if (r0 == 0) goto L_0x0cb3
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0c9b
            r0 = 1
            if (r1 == r0) goto L_0x0c9b
            r0 = 0
            if (r1 == r0) goto L_0x0c92
            if (r1 != r3) goto L_0x0cae
            android.content.Context r1 = r2.requireContext()
            r0 = 2131952607(0x7f1303df, float:1.9541662E38)
        L_0x0bcc:
            java.lang.String r10 = r1.getString(r0)
            java.lang.String r4 = ""
            if (r10 != 0) goto L_0x0bd5
            r10 = r4
        L_0x0bd5:
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r2.A00
            if (r0 == 0) goto L_0x0cb3
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0c89
            r0 = 1
            if (r1 == r0) goto L_0x0c89
            r0 = 0
            if (r1 == r0) goto L_0x0c80
            if (r1 != r3) goto L_0x0ca9
            android.content.Context r1 = r2.requireContext()
            r0 = 2131952606(0x7f1303de, float:1.954166E38)
        L_0x0bf1:
            java.lang.String r11 = r1.getString(r0)
            if (r11 != 0) goto L_0x0bf8
            r11 = r4
        L_0x0bf8:
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r2.A00
            if (r0 == 0) goto L_0x0cb3
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0c74
            r0 = 1
            if (r1 == r0) goto L_0x0c74
            r0 = 0
            if (r1 == r0) goto L_0x0c74
            if (r1 != r3) goto L_0x0ca4
            r12 = 0
        L_0x0c0e:
            r0 = -1022460586(0xffffffffc30e7d56, float:-142.4896)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r13 = r9.ECw()
            if (r0 != 0) goto L_0x0c1f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x0c25
        L_0x0c1f:
            r0 = 24
            X.MIz r13 = X.C51975G9x.A0x(r9, r2, r0)
        L_0x0c25:
            X.0sa r13 = (X.C62320sa) r13
            r4 = r9
            X.5Wx r4 = (X.C286565Wx) r4
            r3 = 0
            X.C286565Wx.A0L(r4, r3)
            r0 = -1022454667(0xffffffffc30e9475, float:-142.57991)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0c3f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0c45
        L_0x0c3f:
            r0 = 25
            X.MIz r1 = X.C51975G9x.A0x(r9, r2, r0)
        L_0x0c45:
            X.0sa r14 = X.C51965G9l.A0y(r4, r1, r3)
            r0 = -1022452359(0xffffffffc30e9d79, float:-142.61513)
            boolean r0 = X.C51967G9n.A1Z(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0c5a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0c60
        L_0x0c5a:
            r0 = 26
            X.MIz r1 = X.C51975G9x.A0x(r9, r2, r0)
        L_0x0c60:
            X.0sa r15 = X.C51965G9l.A0y(r4, r1, r3)
            r16 = r3
            X.C54911HXt.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 794484304(0x2f5ade50, float:1.9905966E-10)
            goto L_0x0fce
        L_0x0c74:
            android.content.Context r1 = r2.requireContext()
            r0 = 2131956909(0x7f1314ad, float:1.9550387E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x0c0e
        L_0x0c80:
            android.content.Context r1 = r2.requireContext()
            r0 = 2131964140(0x7f1330ec, float:1.9565053E38)
            goto L_0x0bf1
        L_0x0c89:
            android.content.Context r1 = r2.requireContext()
            r0 = 2131964134(0x7f1330e6, float:1.9565041E38)
            goto L_0x0bf1
        L_0x0c92:
            android.content.Context r1 = r2.requireContext()
            r0 = 2131964141(0x7f1330ed, float:1.9565055E38)
            goto L_0x0bcc
        L_0x0c9b:
            android.content.Context r1 = r2.requireContext()
            r0 = 2131964135(0x7f1330e7, float:1.9565043E38)
            goto L_0x0bcc
        L_0x0ca4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0ca9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0cae:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0cb3:
            X.0qQ.A0F(r5)
            goto L_0x0fdb
        L_0x0cb8:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0cc7
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0cc7:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0cd5
            r2 = -2107825586(0xffffffff825d224e, float:-1.6246361E-37)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetFragment.onCreateView.<anonymous> (CreationGenAIAttributionBottomSheetFragment.kt:57)"
            X.0fL.A01(r2, r1)
        L_0x0cd5:
            long r2 = X.C51966G9m.A0J(r9)
            r5 = -521482223(0xffffffffe0ead011, float:-1.3536034E20)
            java.lang.Object r4 = r0.A01
            r1 = 40
            X.J6u r0 = new X.J6u
            r0.<init>(r4, r1)
            boolean r0 = X.C51975G9x.A1U(r9, r0, r5, r2)
            if (r0 == 0) goto L_0x0fd1
            r0 = 1774672953(0x69c75c39, float:3.0126468E25)
            goto L_0x0fce
        L_0x0cf0:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0cff
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0cff:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0d0d
            r2 = 82909234(0x4f11832, float:5.6681048E-36)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIFeatureUnavailableBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (CreationGenAIFeatureUnavailableBottomSheetFragment.kt:69)"
            X.0fL.A01(r2, r1)
        L_0x0d0d:
            java.lang.Object r3 = r0.A01
            X.K7S r3 = (X.K7S) r3
            X.0eM r1 = r3.A02
            java.lang.Object r0 = r1.getValue()
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            r11 = 0
            if (r0 == 0) goto L_0x0dca
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            java.lang.String r10 = r0.getText()
        L_0x0d22:
            java.lang.Object r0 = r1.getValue()
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            if (r0 == 0) goto L_0x0d32
            com.instagram.user.model.User r0 = r0.A02
            if (r0 == 0) goto L_0x0d32
            java.lang.String r11 = r0.getUsername()
        L_0x0d32:
            if (r10 == 0) goto L_0x0d85
            if (r11 == 0) goto L_0x0d85
            r0 = 328976298(0x139bc7aa, float:3.9324385E-27)
            r9.ExS(r0)
            r0 = 1534636835(0x5b78b323, float:7.0002757E16)
            boolean r0 = X.C51967G9n.A1Z(r9, r3, r0)
            java.lang.Object r12 = r9.ECw()
            if (r0 != 0) goto L_0x0d4d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r12 != r0) goto L_0x0d53
        L_0x0d4d:
            r0 = 29
            X.MIz r12 = X.C51975G9x.A0x(r9, r3, r0)
        L_0x0d53:
            X.0sa r12 = (X.C62320sa) r12
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            r14 = 0
            X.C286565Wx.A0L(r2, r14)
            r0 = 1534639448(0x5b78bd58, float:7.001398E16)
            boolean r0 = X.C51967G9n.A1Z(r9, r3, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0d6d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0d73
        L_0x0d6d:
            r0 = 30
            X.MIz r1 = X.C51975G9x.A0x(r9, r3, r0)
        L_0x0d73:
            X.0sa r13 = X.C51965G9l.A0y(r2, r1, r14)
            X.C54912HXu.A00(r9, r10, r11, r12, r13, r14)
        L_0x0d7a:
            boolean r0 = X.C51967G9n.A1b(r2, r14)
            if (r0 == 0) goto L_0x0fd1
            r0 = -128049561(0xfffffffff85e1e67, float:-1.8020415E34)
            goto L_0x0fce
        L_0x0d85:
            r0 = 328763421(0x1398881d, float:3.8504412E-27)
            r9.ExS(r0)
            r0 = 1534628387(0x5b789223, float:6.9966473E16)
            boolean r0 = X.C51967G9n.A1Z(r9, r3, r0)
            java.lang.Object r4 = r9.ECw()
            if (r0 != 0) goto L_0x0d9c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x0da2
        L_0x0d9c:
            r0 = 27
            X.MIz r4 = X.C51975G9x.A0x(r9, r3, r0)
        L_0x0da2:
            X.0sa r4 = (X.C62320sa) r4
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            r14 = 0
            X.C286565Wx.A0L(r2, r14)
            r0 = 1534631000(0x5b789c58, float:6.9977696E16)
            boolean r0 = X.C51967G9n.A1Z(r9, r3, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0dbc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0dc2
        L_0x0dbc:
            r0 = 28
            X.MIz r1 = X.C51975G9x.A0x(r9, r3, r0)
        L_0x0dc2:
            X.0sa r0 = X.C51965G9l.A0y(r2, r1, r14)
            X.C54913HXv.A00(r9, r4, r0, r14)
            goto L_0x0d7a
        L_0x0dca:
            r10 = r11
            goto L_0x0d22
        L_0x0dcd:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0ddc
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0ddc:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0dea
            r2 = 809345579(0x303da22b, float:6.8988254E-10)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIFeatureUnavailableBottomSheetFragment.onCreateView.<anonymous> (CreationGenAIFeatureUnavailableBottomSheetFragment.kt:67)"
            X.0fL.A01(r2, r1)
        L_0x0dea:
            java.lang.Object r5 = r0.A01
            X.K7S r5 = (X.K7S) r5
            X.MUn r0 = r5.A00
            if (r0 == 0) goto L_0x0df5
            r0.Cl1()
        L_0x0df5:
            long r3 = X.C51966G9m.A0J(r9)
            r2 = 749592215(0x2cadde97, float:4.941668E-12)
            r1 = 42
            X.J6u r0 = new X.J6u
            r0.<init>(r5, r1)
            boolean r0 = X.C51975G9x.A1U(r9, r0, r2, r3)
            if (r0 == 0) goto L_0x0fd1
            r0 = -441069387(0xffffffffe5b5d0b5, float:-1.0732479E23)
            goto L_0x0fce
        L_0x0e0e:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0e1d
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0e1d:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0e2b
            r2 = 1638052622(0x61a2b30e, float:3.7515935E20)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIFeatureUnavailableGenericBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (CreationGenAIFeatureUnavailableGenericBottomSheetFragment.kt:57)"
            X.0fL.A01(r2, r1)
        L_0x0e2b:
            r1 = -412524482(0xffffffffe769603e, float:-1.10208675E24)
            r9.ExS(r1)
            java.lang.Object r5 = r0.A01
            boolean r0 = r9.AGw(r5)
            java.lang.Object r4 = r9.ECw()
            if (r0 != 0) goto L_0x0e41
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x0e47
        L_0x0e41:
            r0 = 32
            X.MIz r4 = X.C51975G9x.A0x(r9, r5, r0)
        L_0x0e47:
            X.0sa r4 = (X.C62320sa) r4
            r3 = r9
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r0 = -412521937(0xffffffffe7696a2f, float:-1.1022701E24)
            boolean r1 = X.C51967G9n.A1Z(r9, r5, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x0e61
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0e6a
        L_0x0e61:
            r1 = 2
            X.MIX r0 = new X.MIX
            r0.<init>(r5, r1)
            r9.FLL(r0)
        L_0x0e6a:
            X.0Ya r0 = X.C51965G9l.A12(r3, r0)
            X.0sa r0 = (X.C62320sa) r0
            X.C54913HXv.A00(r9, r4, r0, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = -1653439242(0xffffffff9d7284f6, float:-3.2097173E-21)
            goto L_0x0fce
        L_0x0e7e:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0e8d
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0e8d:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0e9b
            r2 = -838824993(0xffffffffce008bdf, float:-5.3916256E8)
            java.lang.String r1 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIFeatureUnavailableGenericBottomSheetFragment.onCreateView.<anonymous> (CreationGenAIFeatureUnavailableGenericBottomSheetFragment.kt:55)"
            X.0fL.A01(r2, r1)
        L_0x0e9b:
            java.lang.Object r5 = r0.A01
            X.K7R r5 = (X.K7R) r5
            X.MUn r0 = r5.A00
            if (r0 == 0) goto L_0x0ea6
            r0.Cl1()
        L_0x0ea6:
            long r3 = X.C51966G9m.A0J(r9)
            r2 = 1138189389(0x43d7644d, float:430.7836)
            r1 = 44
            X.J6u r0 = new X.J6u
            r0.<init>(r5, r1)
            boolean r0 = X.C51975G9x.A1U(r9, r0, r2, r3)
            if (r0 == 0) goto L_0x0fd1
            r0 = -1408411526(0xffffffffac0d587a, float:-2.008642E-12)
            goto L_0x0fce
        L_0x0ebf:
            int r1 = X.AnonymousClass7TE.A0M(r9)
            java.lang.Object r5 = r0.A01
            X.5Oz r5 = (X.C284945Oz) r5
            float r1 = (float) r1
        L_0x0ec8:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L_0x0ecc:
            r5.Epw(r0)
            goto L_0x0fd1
        L_0x0ed1:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0ee0
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0ee0:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0eee
            r2 = 1847585624(0x6e1feb58, float:1.2373157E28)
            java.lang.String r1 = "com.instagram.creation.genai.contextualbackground.ui.FooterContent.<anonymous> (ContextualBackgroundScreen.kt:266)"
            X.0fL.A01(r2, r1)
        L_0x0eee:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            r0 = 0
            X.I7I.A09(r1, r9, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 67447214(0x40529ae, float:1.5653213E-36)
            goto L_0x0fce
        L_0x0f01:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0f10
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0f10:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0f1e
            r2 = 327928120(0x138bc938, float:3.528695E-27)
            java.lang.String r1 = "com.instagram.creation.genai.contextualbackground.ui.HeaderContent.<anonymous> (ContextualBackgroundScreen.kt:185)"
            X.0fL.A01(r2, r1)
        L_0x0f1e:
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            r5 = 0
            java.lang.String r12 = X.C288035bG.A00(r9, r2)
            long r13 = X.G9w.A05(r9)
            X.5ZE r1 = X.AnonymousClass5aQ.A01(r9)
            X.5Z4 r11 = r1.A08
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A01(r1)
            java.lang.String r3 = X.C288035bG.A00(r9, r2)
            r1 = -1450225661(0xffffffffa98f5003, float:-6.3643555E-14)
            r9.ExS(r1)
            java.lang.Object r2 = r0.A01
            boolean r0 = r9.AGu(r2)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0f50
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0f55
        L_0x0f50:
            r0 = 2
            X.Ivn r1 = X.C58678Ivn.A00(r9, r2, r0)
        L_0x0f55:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r9, r5)
            androidx.compose.ui.Modifier r10 = X.C288235ba.A03(r9, r4, r3, r1)
            X.AnonymousClass5ZZ.A0Q(r9, r10, r11, r12, r13)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 929879631(0x376cd64f, float:1.4116594E-5)
            goto L_0x0fce
        L_0x0f6b:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0f7a
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0fd4
        L_0x0f7a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0f88
            r2 = -1760301358(0xffffffff9713eed2, float:-4.7799695E-25)
            java.lang.String r1 = "com.instagram.creation.genai.magicmod.bottomsheet.MagicModAttributionBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (MagicModAttributionBottomSheetFragment.kt:68)"
            X.0fL.A01(r2, r1)
        L_0x0f88:
            r3 = 2131965754(0x7f13373a, float:1.9568327E38)
            java.lang.Object r2 = r0.A01
            X.H1n r2 = (X.C54168H1n) r2
            X.8hK r0 = r2.A01
            java.lang.String r1 = "tool"
            if (r0 == 0) goto L_0x0fd8
            int r0 = r0.A04
            java.lang.String r0 = X.C304346Dc.A00(r9, r0)
            java.lang.String r10 = X.G9w.A0h(r9, r0, r3)
            X.8hK r0 = r2.A01
            if (r0 == 0) goto L_0x0fd8
            int r0 = r0.A03
            java.lang.String r11 = X.C304346Dc.A00(r9, r0)
            r0 = 2131956909(0x7f1314ad, float:1.9550387E38)
            java.lang.String r12 = X.C304346Dc.A00(r9, r0)
            r0 = 12
            X.Ivn r13 = new X.Ivn
            r13.<init>(r2, r0)
            r0 = 13
            X.Ivn r14 = new X.Ivn
            r14.<init>(r2, r0)
            X.IqR r15 = X.C58346IqR.A00
            r16 = 196608(0x30000, float:2.75506E-40)
            X.C54911HXt.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fd1
            r0 = 1415976280(0x54661558, float:3.95280227E12)
        L_0x0fce:
            X.0fL.A00(r0)
        L_0x0fd1:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0fd4:
            r9.Evl()
            goto L_0x0fd1
        L_0x0fd8:
            X.0qQ.A0F(r1)
        L_0x0fdb:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59112J6u.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
