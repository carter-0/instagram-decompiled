package X;

import androidx.fragment.app.Fragment;

public final class WUP implements C41837B2s {
    public final int A00;
    public final Object A01;

    public WUP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void AI5() {
        if (33 - this.A00 == 0) {
            DbX.A1I((Fragment) this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018f, code lost:
        r3.postDelayed(r2, 750);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0194, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01dc, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01de, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01df, code lost:
        r5.A05("button", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a0, code lost:
        r2.setResult(-1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a4, code lost:
        r3.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0311, code lost:
        X.DbT.A1K(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0314, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        X.DbX.A1I(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e9, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        r0.A05(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r5 != null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r4.A05(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015e, code lost:
        r4.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0161, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AI6(java.lang.String r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01d6;
                case 1: goto L_0x02ed;
                case 2: goto L_0x0005;
                case 3: goto L_0x01cf;
                case 4: goto L_0x0014;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x019c;
                case 10: goto L_0x0195;
                case 11: goto L_0x0014;
                case 12: goto L_0x02c7;
                case 13: goto L_0x0179;
                case 14: goto L_0x02a8;
                case 15: goto L_0x0293;
                case 16: goto L_0x0162;
                case 17: goto L_0x0248;
                case 18: goto L_0x0122;
                case 19: goto L_0x0092;
                case 20: goto L_0x00f1;
                case 21: goto L_0x00c4;
                case 22: goto L_0x020a;
                case 23: goto L_0x02a8;
                case 24: goto L_0x0204;
                case 25: goto L_0x0092;
                case 26: goto L_0x01f3;
                case 27: goto L_0x0082;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0052;
                case 31: goto L_0x0015;
                case 32: goto L_0x01e5;
                case 33: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = -1
            r1.setResult(r0)
            X.DbT.A1K(r2)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x0027
            r1 = -1
            android.content.Intent r0 = X.LSf.A00(r8, r9)
            r2.setResult(r1, r0)
        L_0x0027:
            X.80Q r5 = r3.A01
            if (r5 == 0) goto L_0x004e
            goto L_0x01de
        L_0x002d:
            java.lang.Object r3 = r6.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0014
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            if (r10 == 0) goto L_0x0044
            r1 = 1
            java.lang.String r0 = "fx_is_xposting_upsell_after_sharing_story_should_display"
            r2.putExtra(r0, r1)
        L_0x0044:
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x004e
            r0 = -1
            r1.setResult(r0, r2)
        L_0x004e:
            X.DbX.A1I(r3)
            return
        L_0x0052:
            java.lang.Object r5 = r6.A01
            X.UZw r5 = (X.C15291UZw) r5
            X.80Q r0 = r5.A01
            if (r0 == 0) goto L_0x0311
            r3 = 1
            java.lang.String r2 = "button"
            if (r8 == 0) goto L_0x0078
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00e9
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00e9
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0078
            goto L_0x00e9
        L_0x0078:
            X.80Q r4 = r5.A01
            if (r4 == 0) goto L_0x0014
            android.content.Context r0 = r5.getContext()
            goto L_0x015e
        L_0x0082:
            java.lang.Object r2 = r6.A01
            X.UZw r2 = (X.C15291UZw) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = -1
            r1.setResult(r0)
            X.80Q r5 = r2.A01
            goto L_0x01dc
        L_0x0092:
            java.lang.Object r1 = r6.A01
            X.UZw r1 = (X.C15291UZw) r1
            X.80Q r0 = r1.A01
            if (r0 == 0) goto L_0x0014
            r3 = 1
            java.lang.String r2 = "button"
            if (r8 == 0) goto L_0x00ba
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00b7
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00b7
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00ba
        L_0x00b7:
            X.80Q r0 = r1.A01
            goto L_0x00eb
        L_0x00ba:
            X.80Q r4 = r1.A01
            if (r4 == 0) goto L_0x0014
            android.content.Context r0 = r1.getContext()
            goto L_0x015e
        L_0x00c4:
            java.lang.Object r5 = r6.A01
            X.UZw r5 = (X.C15291UZw) r5
            X.80Q r0 = r5.A01
            if (r0 == 0) goto L_0x0311
            r3 = 1
            java.lang.String r2 = "button"
            if (r8 == 0) goto L_0x0156
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00e9
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00e9
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0156
        L_0x00e9:
            X.80Q r0 = r5.A01
        L_0x00eb:
            if (r0 == 0) goto L_0x0014
            r0.A05(r2, r3)
            return
        L_0x00f1:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            X.80Q r4 = r3.A01
            if (r4 == 0) goto L_0x0014
            r2 = 1
            java.lang.String r1 = "button"
            if (r8 == 0) goto L_0x0117
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0147
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0147
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0117
            goto L_0x0147
        L_0x0117:
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x015e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0122:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            X.80Q r4 = r3.A01
            if (r4 == 0) goto L_0x0014
            r2 = 1
            java.lang.String r1 = "button"
            if (r8 == 0) goto L_0x014b
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0147
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0147
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x014b
        L_0x0147:
            r4.A05(r1, r2)
            return
        L_0x014b:
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x015e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0156:
            X.80Q r4 = r5.A01
            if (r4 == 0) goto L_0x0014
            android.content.Context r0 = r5.requireContext()
        L_0x015e:
            r4.A02(r0)
            return
        L_0x0162:
            java.lang.Object r0 = r6.A01
            X.UZw r0 = (X.C15291UZw) r0
            r0.A01()
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0014
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.WlC r2 = new X.WlC
            r2.<init>(r0)
            goto L_0x018f
        L_0x0179:
            java.lang.Object r0 = r6.A01
            X.UZw r0 = (X.C15291UZw) r0
            r0.A01()
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0014
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.WlB r2 = new X.WlB
            r2.<init>(r0)
        L_0x018f:
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0195:
            java.lang.Object r0 = r6.A01
            X.UZy r0 = (X.UZy) r0
            X.80Q r5 = r0.A01
            goto L_0x01dc
        L_0x019c:
            java.lang.Object r4 = r6.A01
            X.Ua0 r4 = (X.C15294Ua0) r4
            X.80Q r5 = r4.A00
            if (r5 == 0) goto L_0x0014
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r8 == 0) goto L_0x01b6
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = "story"
            r3.add(r0)
        L_0x01b6:
            if (r9 == 0) goto L_0x01c3
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01c3
            java.lang.String r0 = "direct"
            r3.add(r0)
        L_0x01c3:
            java.lang.String r2 = ""
            r1 = 1
            r0 = 0
            X.C15294Ua0.A00(r4, r2, r3, r1, r0)
            boolean r0 = r4.A03
            r1 = r0 ^ 1
            goto L_0x01df
        L_0x01cf:
            java.lang.Object r0 = r6.A01
            X.Uc6 r0 = (X.C15400Uc6) r0
            X.80Q r5 = r0.A00
            goto L_0x01dc
        L_0x01d6:
            java.lang.Object r0 = r6.A01
            X.UZx r0 = (X.C15292UZx) r0
            X.80Q r5 = r0.A01
        L_0x01dc:
            if (r5 == 0) goto L_0x0014
        L_0x01de:
            r1 = 1
        L_0x01df:
            java.lang.String r0 = "button"
            r5.A05(r0, r1)
            return
        L_0x01e5:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            android.content.Intent r1 = X.LSf.A00(r8, r9)
            goto L_0x02a0
        L_0x01f3:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            X.Dba.A0k(r1, r0)
            return
        L_0x0204:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            goto L_0x02a4
        L_0x020a:
            java.lang.Object r5 = r6.A01
            X.UZw r5 = (X.C15291UZw) r5
            X.80Q r0 = r5.A01
            if (r0 == 0) goto L_0x0311
            r2 = 1
            java.lang.String r1 = "button"
            if (r8 == 0) goto L_0x0238
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x022f
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x022f
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0238
        L_0x022f:
            X.80Q r0 = r5.A01
            X.0qQ.A0A(r0)
            r0.A05(r1, r2)
            return
        L_0x0238:
            X.80Q r1 = r5.A01
            X.0qQ.A0A(r1)
            android.content.Context r0 = r5.getContext()
            X.0qQ.A0A(r0)
            r1.A02(r0)
            return
        L_0x0248:
            X.EUz r2 = X.C48081EUz.AVATAR
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 388(0x184, float:5.44E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r0 = r1.getSerializable(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x026f
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r1 = -1
            android.content.Intent r0 = X.LSf.A00(r8, r9)
            r2.setResult(r1, r0)
            goto L_0x02a4
        L_0x026f:
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 1282(0x502, float:1.796E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x02a4
            X.14B r1 = X.AnonymousClass14B.A00()
            android.content.Context r0 = r3.requireContext()
            android.content.Intent r1 = r1.A01(r0)
            android.content.Context r0 = r3.requireContext()
            X.0kR.A0B(r0, r1)
            goto L_0x02a4
        L_0x0293:
            java.lang.Object r3 = r6.A01
            X.UZw r3 = (X.C15291UZw) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
        L_0x02a0:
            r0 = -1
            r2.setResult(r0, r1)
        L_0x02a4:
            r3.A01()
            return
        L_0x02a8:
            java.lang.Object r2 = r6.A01
            X.UZw r2 = (X.C15291UZw) r2
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            android.content.Intent r1 = X.LSf.A00(r8, r9)
            r0 = -1
            r3.setResult(r0, r1)
            X.80Q r2 = r2.A01
            if (r2 == 0) goto L_0x02c3
            r1 = 1
            java.lang.String r0 = "button"
            r2.A05(r0, r1)
            return
        L_0x02c3:
            r3.finish()
            return
        L_0x02c7:
            X.2ZQ r1 = X.C71172bH.A00()
            r0 = 49
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.2ZS r1 = (X.2ZS) r1
            r2 = 1
            X.C240073Jm.A00 = r2
            X.1QK r0 = X.1QK.A0C
            r1.Enh(r0)
            java.lang.Object r0 = r6.A01
            X.UZw r0 = (X.C15291UZw) r0
            X.80Q r1 = r0.A01
            X.0qQ.A0A(r1)
            java.lang.String r0 = "button"
            r1.A05(r0, r2)
            return
        L_0x02ed:
            java.lang.Object r0 = r6.A01
            X.UaZ r0 = (X.C15326UaZ) r0
            X.80Q r2 = r0.A01
            if (r2 != 0) goto L_0x02ff
            java.lang.String r0 = "quickCaptureController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ff:
            X.80R r0 = r2.A00
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A1S
            if (r1 != r0) goto L_0x030e
            java.lang.String r1 = "back"
        L_0x0309:
            r0 = 1
            r2.A05(r1, r0)
            return
        L_0x030e:
            java.lang.String r1 = "button"
            goto L_0x0309
        L_0x0311:
            X.DbT.A1K(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUP.AI6(java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001a: MOVE  (r1v1 X.2ZS) = (r1v0 X.2ZS)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* synthetic */ void Cpf(java.lang.String r22) {
        /*
            r21 = this;
            r0 = 1582(0x62e, float:2.217E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r3 = r21
            int r0 = r3.A00
            int r0 = 11 - r0
            if (r0 != 0) goto L_0x005b
            r2 = 0
            X.0qQ.A0B(r8, r2)
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof X.2ZS
            if (r0 == 0) goto L_0x005b
            X.2ZS r1 = (X.2ZS) r1
            if (r1 == 0) goto L_0x005b
            r5 = 0
            r18 = 0
            com.instagram.ui.swipenavigation.PositionConfig r4 = new com.instagram.ui.swipenavigation.PositionConfig     // Catch:{ Exception -> 0x0050 }
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r19 = r2
            r20 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0050 }
            r1.FLD(r4)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r0 = r3.A01     // Catch:{ Exception -> 0x0050 }
            X.9Qm r0 = (X.C378609Qm) r0     // Catch:{ Exception -> 0x0050 }
            X.0eM r0 = r0.A1Z     // Catch:{ Exception -> 0x0050 }
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)     // Catch:{ Exception -> 0x0050 }
            X.2gm r0 = X.C226412gl.A00(r0)     // Catch:{ Exception -> 0x0050 }
            X.1QK r0 = r0.A00()     // Catch:{ Exception -> 0x0050 }
            r1.Enh(r0)     // Catch:{ Exception -> 0x0050 }
            return
        L_0x0050:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817897248(0x30c01f20, float:1.3978685E-9)
            java.lang.String r0 = "navigateToExplore"
            X.AnonymousClass7TG.A1I(r2, r0, r3, r1)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUP.Cpf(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1qK, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0012: MOVE  (r1v5 X.2ZS) = (r1v4 X.2ZS)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* synthetic */ void Cpi(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            switch(r0) {
                case 1: goto L_0x0042;
                case 11: goto L_0x0008;
                case 18: goto L_0x0022;
                case 19: goto L_0x0022;
                case 20: goto L_0x0022;
                case 21: goto L_0x0022;
                case 22: goto L_0x0022;
                case 30: goto L_0x0022;
                case 33: goto L_0x001a;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r17 = 0
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof X.2ZS
            if (r0 == 0) goto L_0x0007
            X.2ZS r1 = (X.2ZS) r1
            if (r1 == 0) goto L_0x0007
            r3 = 0
            r16 = 0
            goto L_0x005b
        L_0x001a:
            java.lang.Object r0 = r1.A01
            X.9rV r0 = (X.C390579rV) r0
            X.C390579rV.A00(r0)
            return
        L_0x0022:
            java.lang.Object r3 = r1.A01
            X.UZw r3 = (X.C15291UZw) r3
            X.80Q r2 = r3.A01
            if (r2 == 0) goto L_0x0030
            r1 = 1
            java.lang.String r0 = "button"
            r2.A05(r0, r1)
        L_0x0030:
            com.instagram.common.session.UserSession r0 = r3.A00
            X.0qQ.A07(r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.37a r0 = new X.37a
            r0.<init>()
            r1.A00(r0)
            return
        L_0x0042:
            java.lang.Object r0 = r1.A01
            X.UaZ r0 = (X.C15326UaZ) r0
            X.80Q r2 = r0.A01
            if (r2 != 0) goto L_0x0054
            java.lang.String r0 = "quickCaptureController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0054:
            r1 = 1
            java.lang.String r0 = "button"
            r2.A05(r0, r1)
            return
        L_0x005b:
            com.instagram.ui.swipenavigation.PositionConfig r2 = new com.instagram.ui.swipenavigation.PositionConfig     // Catch:{ Exception -> 0x007b }
            r6 = r20
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            r18 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x007b }
            r1.FLD(r2)     // Catch:{ Exception -> 0x007b }
            r0 = 1
            X.C240073Jm.A00 = r0     // Catch:{ Exception -> 0x007b }
            X.1QK r0 = X.1QK.A0C     // Catch:{ Exception -> 0x007b }
            r1.Enh(r0)     // Catch:{ Exception -> 0x007b }
            return
        L_0x007b:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817897248(0x30c01f20, float:1.3978685E-9)
            java.lang.String r0 = "navigateToFeed"
            X.AnonymousClass7TG.A1I(r2, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUP.Cpi(java.lang.String):void");
    }

    public final /* synthetic */ void CqO(String str) {
    }

    public final /* synthetic */ void E11() {
        if (6 - this.A00 == 0) {
            C384909i5.A00((C384909i5) this.A01, false, true);
        }
    }
}
