package X;

import androidx.fragment.app.Fragment;

public final class J6O extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6O(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0360, code lost:
        r0.invoke(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0.A0Z(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x03e7;
                case 1: goto L_0x03de;
                case 2: goto L_0x03de;
                case 3: goto L_0x03d7;
                case 4: goto L_0x03b6;
                case 5: goto L_0x03a8;
                case 6: goto L_0x03a8;
                case 7: goto L_0x039b;
                case 8: goto L_0x038d;
                case 9: goto L_0x0365;
                case 10: goto L_0x035c;
                case 11: goto L_0x030a;
                case 12: goto L_0x0545;
                case 13: goto L_0x02d0;
                case 14: goto L_0x02c3;
                case 15: goto L_0x04c1;
                case 16: goto L_0x028f;
                case 17: goto L_0x0282;
                case 18: goto L_0x0266;
                case 19: goto L_0x04ae;
                case 20: goto L_0x0495;
                case 21: goto L_0x0248;
                case 22: goto L_0x0466;
                case 23: goto L_0x045d;
                case 24: goto L_0x023b;
                case 25: goto L_0x022f;
                case 26: goto L_0x022f;
                case 27: goto L_0x022f;
                case 28: goto L_0x021a;
                case 29: goto L_0x043c;
                case 30: goto L_0x0209;
                case 31: goto L_0x01f2;
                case 32: goto L_0x01ce;
                case 33: goto L_0x018d;
                case 34: goto L_0x0179;
                case 35: goto L_0x015f;
                case 36: goto L_0x0138;
                case 37: goto L_0x0107;
                case 38: goto L_0x00e0;
                case 39: goto L_0x00c5;
                case 40: goto L_0x00a5;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x0095;
                case 45: goto L_0x0074;
                case 46: goto L_0x0045;
                case 47: goto L_0x0045;
                case 48: goto L_0x0036;
                case 49: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r2 = X.C41847B3o.A1E(r6)
            java.lang.Object r0 = r15.A01
            X.Gwq r0 = (X.C53946Gwq) r0
            X.GgO r0 = r0.A02
        L_0x0011:
            if (r0 == 0) goto L_0x0016
            r0.A0Z(r2)
        L_0x0016:
            X.0gF r6 = X.C60340gF.A00
        L_0x0018:
            return r6
        L_0x0019:
            java.lang.Object r2 = r15.A01
            X.7fJ r2 = (X.C336867fJ) r2
            X.2WX r0 = X.C336867fJ.A0F
            X.GgO r1 = r2.A02
            X.7dj r0 = r2.A00
            java.lang.String r4 = r0.A0K
            java.lang.String r3 = r0.A0N
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = r1.A0A
            X.4Cq r0 = r2.A01
            r5 = 0
            r6 = 4
            X.MFe r1 = new X.MFe
            r1.<init>((java.lang.Object) r2, (java.lang.String) r3, (java.lang.String) r4, (X.AnonymousClass4D7) r5, (int) r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x0016
        L_0x0036:
            java.lang.Object r1 = r15.A01
            X.7fJ r1 = (X.C336867fJ) r1
            X.2WX r0 = X.C336867fJ.A0F
            X.GgO r2 = r1.A02
            X.7dj r0 = r1.A00
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r0.A0N
            goto L_0x0070
        L_0x0045:
            java.lang.Object r2 = r15.A01
            X.7fJ r2 = (X.C336867fJ) r2
            X.2WX r0 = X.C336867fJ.A0F
            X.7dj r4 = r2.A00
            X.7fv r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x0016
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x006a
            r0 = 1
            if (r1 != r0) goto L_0x0016
            X.GgO r2 = r2.A02
            java.lang.String r1 = r4.A0K
            java.lang.String r0 = r4.A0J
            r2.A0R(r3, r1, r0)
            goto L_0x0016
        L_0x006a:
            X.GgO r2 = r2.A02
            java.lang.String r1 = r4.A0K
            java.lang.String r0 = r4.A0N
        L_0x0070:
            r2.A0f(r1, r0)
            goto L_0x0016
        L_0x0074:
            java.lang.Object r1 = r15.A01
            X.7fJ r1 = (X.C336867fJ) r1
            X.2WX r0 = X.C336867fJ.A0F
            X.GgO r6 = r1.A02
            X.7dj r0 = r1.A00
            X.1bK r5 = r0.A09
            java.lang.String r4 = r0.A0K
            java.lang.String r3 = r0.A0N
            X.7de r2 = r0.A05
            X.05G r1 = r6.A0O
            X.9JC r0 = new X.9JC
            r0.<init>(r2, r5, r4, r3)
            r1.Epw(r0)
            r0 = 0
            X.C52971GgO.A05(r6, r0)
            goto L_0x0016
        L_0x0095:
            java.lang.Object r0 = r15.A01
            X.7hK r0 = (X.C338047hK) r0
            X.GgO r2 = r0.A02
            X.7dj r0 = r0.A00
            java.lang.String r1 = r0.A0K
            r0 = 0
            r2.A0d(r1, r0)
            goto L_0x0016
        L_0x00a5:
            java.lang.String r2 = X.C41847B3o.A1E(r6)
            java.lang.Object r1 = r15.A01
            X.7fI r1 = (X.C336857fI) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0016
        L_0x00b5:
            android.view.GestureDetector r0 = r1.A00
            if (r0 == 0) goto L_0x00bc
            X.C336857fI.A00(r0)
        L_0x00bc:
            X.GgO r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            r0.A0Y(r2)
            goto L_0x0016
        L_0x00c5:
            java.lang.String r2 = X.C41847B3o.A1E(r6)
            java.lang.Object r1 = r15.A01
            X.7fI r1 = (X.C336857fI) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0016
        L_0x00d5:
            android.view.GestureDetector r0 = r1.A00
            if (r0 == 0) goto L_0x00dc
            X.C336857fI.A00(r0)
        L_0x00dc:
            X.GgO r0 = r1.A01
            goto L_0x0011
        L_0x00e0:
            java.lang.Object r5 = r15.A01
            X.Grx r5 = (X.C53644Grx) r5
            X.7eu r1 = r5.A00
            java.lang.Integer r0 = r1.A02
            int r4 = r0.intValue()
            r3 = 1
            r2 = 0
            X.GgO r0 = r5.A01
            if (r4 == r2) goto L_0x0102
            java.lang.String r1 = r1.A06
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r0.A0A
            if (r4 == r3) goto L_0x00fd
            r0.A0O(r1, r3)
            goto L_0x0016
        L_0x00fd:
            r0.A0O(r1, r2)
            goto L_0x0016
        L_0x0102:
            r0.A0K(r1)
            goto L_0x0016
        L_0x0107:
            X.2WE r4 = X.C51968G9o.A0f(r6)
            java.lang.Object r3 = r15.A01
            X.Gww r3 = (X.C53952Gww) r3
            java.lang.String r5 = r3.A04
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = r3.A05
            X.0iw r8 = r3.A02
            X.GgO r9 = r3.A01
            java.lang.String r10 = r3.A03
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            r1 = 41
            X.J6t r0 = new X.J6t
            r0.<init>(r3, r1)
            r4.A02(r0, r2)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            X.JEw r0 = X.C59318JEw.A00
            r4.A02(r0, r1)
            goto L_0x0016
        L_0x0138:
            java.lang.Object r2 = r15.A01
            X.9d8 r2 = (X.C382089d8) r2
            X.9iT r3 = r2.A00
            X.7aK r0 = r3.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0158
            r0 = 1
            if (r1 == r0) goto L_0x0016
            r0 = 2
            if (r1 != r0) goto L_0x055c
            X.GgO r2 = r2.A01
            java.lang.String r1 = r3.A05
            X.7aK r0 = X.C333897aK.SHOW_ORIGINAL
        L_0x0153:
            r2.A0L(r0, r1)
            goto L_0x0016
        L_0x0158:
            X.GgO r2 = r2.A01
            java.lang.String r1 = r3.A05
            X.7aK r0 = X.C333897aK.SHOW_TRANSLATION
            goto L_0x0153
        L_0x015f:
            X.4ch r0 = X.C51968G9o.A0U(r6)
            java.lang.Object r3 = r15.A01
            X.5Oz r3 = (X.C284945Oz) r3
            long r0 = r0.Bwh()
            long r1 = X.C289155d7.A01(r0)
            X.5bF r0 = new X.5bF
            r0.<init>(r1)
            r3.Epw(r0)
            goto L_0x0016
        L_0x0179:
            X.4ch r0 = X.C51968G9o.A0U(r6)
            java.lang.Object r2 = r15.A01
            X.H3n r2 = (X.C54218H3n) r2
            long r0 = r0.Bwh()
            int r0 = X.C289005cr.A00(r0)
            r2.A00 = r0
            goto L_0x0016
        L_0x018d:
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r3 = r15.A01
            X.GT9 r3 = (X.GT9) r3
            r0 = 6
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r6, r0)
            com.instagram.common.ui.base.IgLinearLayout r6 = (com.instagram.common.ui.base.IgLinearLayout) r6
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x0016
            r1 = 0
            r0 = 2131957153(0x7f1315a1, float:1.9550882E38)
            java.lang.String r0 = r2.getString(r0)
            X.HWX.A00(r2, r1, r6, r0, r1)
            r0 = 2130772117(0x7f010095, float:1.7147343E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r2, r0)
            X.0qQ.A07(r0)
            r6.startAnimation(r0)
            r0 = 0
            r6.setVisibility(r0)
            X.GgO r0 = r3.A04()
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            r3.A03()
            goto L_0x0016
        L_0x01ce:
            float r5 = X.AnonymousClass7TE.A04(r6)
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0016
            X.37D r3 = X.DbT.A0i(r0)
            if (r3 == 0) goto L_0x0016
            X.0xx r0 = X.DbW.A0E(r2)
            r4 = 0
            r6 = 0
            X.AwB r1 = new X.AwB
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x0016
        L_0x01f2:
            java.lang.String r3 = X.C41847B3o.A1E(r6)
            java.lang.Object r0 = r15.A01
            X.7b7 r0 = (X.C334347b7) r0
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r0.A0B
            int r1 = r2.getSelectionStart()
            int r0 = r2.getSelectionEnd()
            X.C334337b6.A00(r2, r3, r1, r0)
            goto L_0x0016
        L_0x0209:
            java.lang.String r3 = X.C41847B3o.A1E(r6)
            X.7b6 r2 = X.C334337b6.A00
            java.lang.Object r1 = r15.A01
            X.7b7 r1 = (X.C334347b7) r1
            X.Ipf r0 = X.C58298Ipf.A00
            r2.A08(r1, r3, r0)
            goto L_0x0016
        L_0x021a:
            X.4ch r0 = X.C51968G9o.A0U(r6)
            java.lang.Object r2 = r15.A01
            X.5dh r2 = (X.C289495dh) r2
            long r0 = r0.Bwh()
            int r0 = X.C289005cr.A00(r0)
            r2.EZz(r0)
            goto L_0x0016
        L_0x022f:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r15.A01
            X.IPS r0 = (X.IPS) r0
            X.0sP r0 = r0.A05
            goto L_0x0360
        L_0x023b:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r15.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r6)
            goto L_0x0016
        L_0x0248:
            X.7aH r6 = (X.C333867aH) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.JwJ r0 = r6.A01
            if (r0 == 0) goto L_0x0264
            java.lang.Object r1 = r0.A00
        L_0x0254:
            java.lang.Object r0 = r15.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0018
            r1 = 0
            r0 = 8159(0x1fdf, float:1.1433E-41)
            X.7aH r6 = X.C333867aH.A00((X.C61081JwJ) null, (X.C333847aF) null, (X.C333817aC) null, r6, r1, (java.util.List) null, 0, r0, false, false)
            return r6
        L_0x0264:
            r1 = 0
            goto L_0x0254
        L_0x0266:
            X.1Xl r6 = (X.1Xl) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.1Xj r0 = r6.BPf()
            X.1i5 r0 = r0.A0d
            r0.A01()
            X.1Xj r1 = r6.BPf()
            java.lang.Object r0 = r15.A01
            X.Cto r0 = (X.C45285Cto) r0
            r1.A42(r0)
            goto L_0x0016
        L_0x0282:
            java.lang.String r1 = X.C41847B3o.A1E(r6)
            java.lang.Object r0 = r15.A01
            X.IOA r0 = (X.IOA) r0
            X.IOA.A05(r0, r1)
            goto L_0x0016
        L_0x028f:
            java.lang.String r4 = X.C41847B3o.A1E(r6)
            java.lang.Object r3 = r15.A01
            X.IOA r3 = (X.IOA) r3
            X.0Rd r0 = r3.A0I
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0016
            X.HrN r0 = r3.A02
            java.lang.String r2 = "viewHolder"
            if (r0 == 0) goto L_0x0561
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0D
            X.0lr r1 = r3.A0F
            r0.removeTextChangedListener(r1)
            X.HrN r0 = r3.A02
            if (r0 == 0) goto L_0x0561
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0D
            r0.setText(r4)
            X.HrN r0 = r3.A02
            if (r0 == 0) goto L_0x0561
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0D
            r0.addTextChangedListener(r1)
            r3.A08()
            goto L_0x0016
        L_0x02c3:
            boolean r0 = X.AnonymousClass7TE.A1a(r6)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r15.A01
            X.C51969G9p.A1M(r0)
            goto L_0x0016
        L_0x02d0:
            X.JVf r6 = (X.C59721JVf) r6
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.Object r2 = r6.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r6.A01
            X.Kgk r0 = (X.C62494Kgk) r0
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0016
            r0 = 1
            if (r1 == r0) goto L_0x02fa
            r0 = 2
            if (r1 == r0) goto L_0x0301
            if (r1 != r3) goto L_0x0569
            java.lang.Object r2 = r15.A01
            X.MYR r2 = (X.MYR) r2
            X.JXP r1 = X.JXP.ERROR
        L_0x02f3:
            X.0sn r0 = X.0sn.A00
            r2.updateUi(r1, r0)
            goto L_0x0016
        L_0x02fa:
            java.lang.Object r2 = r15.A01
            X.MYR r2 = (X.MYR) r2
            X.JXP r1 = X.JXP.LOADING
            goto L_0x02f3
        L_0x0301:
            java.lang.Object r0 = r15.A01
            X.MYR r0 = (X.MYR) r0
            r0.A0B(r2)
            goto L_0x0016
        L_0x030a:
            X.OID r6 = (X.OID) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r2 = 2131626320(0x7f0e0950, float:1.8879873E38)
            r1 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            X.OBB r0 = new X.OBB
            r0.<init>(r2, r1)
            r6.A02 = r0
            X.72b r1 = new X.72b
            r1.<init>()
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            A00(r2, r1)
            r0 = 2131953254(0x7f130666, float:1.9542974E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A08 = r0
            r6.A03 = r1
            X.72b r0 = new X.72b
            r0.<init>()
            A00(r2, r0)
            r6.A05 = r0
            X.72b r1 = new X.72b
            r1.<init>()
            A00(r2, r1)
            r0 = 2131965094(0x7f1334a6, float:1.9566988E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A08 = r0
            r6.A04 = r1
            r1 = 37
            X.IwJ r0 = new X.IwJ
            r0.<init>(r2, r1)
            r6.A07 = r0
            goto L_0x0016
        L_0x035c:
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
        L_0x0360:
            r0.invoke(r6)
            goto L_0x0016
        L_0x0365:
            java.util.Map r6 = (java.util.Map) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r15.A01
            X.72N r3 = (X.AnonymousClass72N) r3
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r6)
        L_0x0373:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            X.8vc r1 = (X.C369968vc) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.A0H(r1, r0)
            goto L_0x0373
        L_0x038d:
            java.lang.Object r2 = r15.A01
            X.5g0 r2 = (X.C290815g0) r2
            r1 = 0
            X.H7T r0 = new X.H7T
            r0.<init>(r1)
            r2.A00 = r0
            goto L_0x0016
        L_0x039b:
            java.lang.Object r0 = r15.A01
            X.HqU r0 = (X.C55963HqU) r0
            X.8Im r1 = r0.A00
            if (r1 == 0) goto L_0x0016
            r0 = 0
            r1.A00 = r0
            goto L_0x0016
        L_0x03a8:
            X.3sc r6 = (X.C254523sc) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r15.A01
            X.0jB r0 = (X.0jB) r0
            r6.A0k = r0
            goto L_0x0016
        L_0x03b6:
            com.instagram.igsignals.core.IgSignalsModelPrediction r6 = (com.instagram.igsignals.core.IgSignalsModelPrediction) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x03d0
            double r3 = r6.A03
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            long r0 = (long) r3
        L_0x03c7:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.invoke(r0)
            goto L_0x0016
        L_0x03d0:
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            r0 = -1
            goto L_0x03c7
        L_0x03d7:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
            goto L_0x0016
        L_0x03de:
            java.lang.Object r0 = r15.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C59689JTv.A04(r0)
            goto L_0x0016
        L_0x03e7:
            X.Gl6 r6 = (X.C53258Gl6) r6
            java.lang.Object r5 = r15.A01
            X.UZm r5 = (X.C15282UZm) r5
            boolean r0 = r6.A01
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r5.A01
            if (r0 == 0) goto L_0x042f
            if (r1 == 0) goto L_0x03fa
            X.3uy r0 = X.C255943uy.LOADING
            r1.setLoadingStatus(r0)
        L_0x03fa:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0403
            r0 = 8
        L_0x0400:
            r1.setVisibility(r0)
        L_0x0403:
            X.JvH r1 = r6.A00
            if (r1 == 0) goto L_0x0016
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            if (r3 == 0) goto L_0x0016
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x0016
            X.0eM r0 = r5.A02
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r4 = r1.A02
            com.instagram.api.schemas.XIGIGBoostDestination r4 = (com.instagram.api.schemas.XIGIGBoostDestination) r4
            java.lang.Object r10 = r1.A01
            java.util.List r10 = (java.util.List) r10
            boolean r11 = r1.A06
            boolean r12 = r1.A04
            boolean r13 = r1.A05
            boolean r14 = r1.A07
            r8 = 0
            r6 = r5
            r9 = r8
            X.VAG.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0016
        L_0x042f:
            if (r1 == 0) goto L_0x0436
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x0436:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0403
            r0 = 0
            goto L_0x0400
        L_0x043c:
            X.4cd r6 = (X.C268024cd) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            int r1 = r6.EJS(r0)
            java.lang.Object r0 = r15.A01
            X.5dh r0 = (X.C289495dh) r0
            int r0 = r0.BI6()
            int r0 = r0 / 2
            int r0 = -r0
            long r0 = X.AnonymousClass5TW.A00(r1, r0)
            X.5d8 r6 = new X.5d8
            r6.<init>(r0)
            return r6
        L_0x045d:
            java.lang.Object r0 = r15.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            X.7aH r6 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(r0)
            return r6
        L_0x0466:
            X.7aH r6 = (X.C333867aH) r6
            r9 = 0
            X.0qQ.A0B(r6, r9)
            java.lang.Object r3 = r15.A01
            X.Gkv r3 = (X.C53247Gkv) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.util.List r1 = r6.A06
            java.util.List r0 = r3.A01
            java.util.ArrayList r7 = X.00k.A0S(r0, r1)
            X.7aF r0 = r6.A02
            java.lang.String r2 = r3.A00
            boolean r1 = r3.A02
            r3 = 0
            X.9In r0 = r0.A00
            X.7aF r4 = new X.7aF
            r4.<init>(r0, r2, r1)
            r10 = 8182(0x1ff6, float:1.1465E-41)
            r5 = r3
            r8 = r3
            r11 = r9
            r12 = r9
            X.7aH r6 = X.C333867aH.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0495:
            X.7dj r6 = (X.C335907dj) r6
            r13 = 0
            X.0qQ.A0B(r6, r13)
            java.lang.Object r5 = r15.A01
            X.7df r5 = (X.C335867df) r5
            r7 = 0
            r11 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r12 = 65535(0xffff, float:9.1834E-41)
            r8 = r7
            r9 = r7
            r10 = r7
            X.7dj r6 = X.C335907dj.A00(r5, r6, (X.C337227fv) null, (X.C335857de) null, (X.C333897aK) null, r7, r8, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, r9, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, r10, r11, r12, false, false, false, false, false, r13, false, false)
            return r6
        L_0x04ae:
            X.7dj r6 = (X.C335907dj) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r15.A01
            X.7fv r2 = (X.C337227fv) r2
            r1 = 0
            r0 = 65023(0xfdff, float:9.1117E-41)
            X.7dj r6 = X.C335907dj.A00((X.C335867df) null, r6, r2, (X.C335857de) null, (X.C333897aK) null, (X.C337207ft) null, (X.C337217fu) null, r1, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, -1, r0, false, false, false, false, false, false, false, false)
            return r6
        L_0x04c1:
            X.5gs r6 = (X.C291265gs) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r5 = r15.A01
            android.widget.EditText r5 = (android.widget.EditText) r5
            java.lang.String r0 = "@\\[\\] ?[0-9]+"
            X.11S r4 = new X.11S
            r4.<init>(r0)
            android.text.Editable r3 = r5.getText()
            X.0qQ.A07(r3)
            X.2HY r0 = r6.A01()
            int r2 = r0.A00
            X.2HY r0 = r6.A01()
            int r0 = r0.A01
            int r1 = r0 + 2
            android.text.Editable r0 = r5.getText()
            int r0 = r0.length()
            if (r1 <= r0) goto L_0x04f2
            r1 = r0
        L_0x04f2:
            java.lang.CharSequence r0 = r3.subSequence(r2, r1)
            java.lang.String r0 = r0.toString()
            boolean r4 = r4.A08(r0)
            android.text.Editable r0 = r5.getText()
            X.0qQ.A07(r0)
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r0)
            X.2HY r0 = r6.A01()
            int r2 = r0.A00
            X.2HY r0 = r6.A01()
            int r1 = r0.A01
            java.lang.Class<android.text.style.ForegroundColorSpan> r0 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r0 = r3.getSpans(r2, r1, r0)
            X.0qQ.A07(r0)
            int r0 = r0.length
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r0 = r0 ^ 1
            if (r4 != 0) goto L_0x053b
            if (r0 == 0) goto L_0x053b
            java.util.regex.Matcher r0 = r6.A01
            java.lang.String r1 = r0.group()
            X.0qQ.A07(r1)
            r0 = 3
            java.lang.String r6 = r1.substring(r0)
            X.0qQ.A07(r6)
            return r6
        L_0x053b:
            java.util.regex.Matcher r0 = r6.A01
            java.lang.String r6 = r0.group()
            X.0qQ.A07(r6)
            return r6
        L_0x0545:
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r6 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.String r1 = r6.A01
            java.lang.Object r0 = r15.A01
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r0 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x055c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0561:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0569:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6O.invoke(java.lang.Object):java.lang.Object");
    }

    public static void A00(Fragment fragment, C3253572b r3) {
        r3.A00 = fragment.requireContext().getColor(2Yu.A02(fragment.getContext()));
    }
}
