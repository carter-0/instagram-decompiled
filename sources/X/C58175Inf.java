package X;

/* renamed from: X.Inf  reason: case insensitive filesystem */
public final class C58175Inf extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58175Inf(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0310, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x032c, code lost:
        if (X.0qQ.A0K(r2, "bcf__block_first") != false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r2.A06(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0293, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0061;
                case 2: goto L_0x0085;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00d9;
                case 7: goto L_0x003d;
                case 8: goto L_0x00ea;
                case 9: goto L_0x0005;
                case 10: goto L_0x00f1;
                case 11: goto L_0x003d;
                case 12: goto L_0x00ea;
                case 13: goto L_0x0005;
                case 14: goto L_0x0101;
                case 15: goto L_0x003d;
                case 16: goto L_0x00ea;
                case 17: goto L_0x0005;
                case 18: goto L_0x0111;
                case 19: goto L_0x003d;
                case 20: goto L_0x00ea;
                case 21: goto L_0x0005;
                case 22: goto L_0x0121;
                case 23: goto L_0x0131;
                case 24: goto L_0x013e;
                case 25: goto L_0x0148;
                case 26: goto L_0x0164;
                case 27: goto L_0x017a;
                case 28: goto L_0x01f0;
                case 29: goto L_0x01ff;
                case 30: goto L_0x0222;
                case 31: goto L_0x000c;
                case 32: goto L_0x024e;
                case 33: goto L_0x003d;
                case 34: goto L_0x00ea;
                case 35: goto L_0x0005;
                case 36: goto L_0x029d;
                case 37: goto L_0x02c4;
                case 38: goto L_0x02cf;
                case 39: goto L_0x02dc;
                case 40: goto L_0x02e6;
                case 41: goto L_0x02f0;
                case 42: goto L_0x0311;
                case 43: goto L_0x02fa;
                case 44: goto L_0x003d;
                case 45: goto L_0x00ea;
                case 46: goto L_0x0005;
                case 47: goto L_0x0330;
                case 48: goto L_0x0025;
                case 49: goto L_0x033d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.07f r2 = X.DbY.A0I(r0)
        L_0x000b:
            return r2
        L_0x000c:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 3643(0xe3b, float:5.105E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r2 = r1.getSerializable(r0)
            boolean r0 = r2 instanceof X.C335737dS
            if (r0 == 0) goto L_0x0022
            if (r2 != 0) goto L_0x000b
        L_0x0022:
            X.7dS r2 = X.C335737dS.BOTTOMSHEET_MEDIA_CREATION_GENERIC
            return r2
        L_0x0025:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "key_upsell_type"
            java.io.Serializable r2 = r1.getSerializable(r0)
        L_0x0034:
            boolean r0 = r2 instanceof X.HMF
            if (r0 == 0) goto L_0x003a
            if (r2 != 0) goto L_0x000b
        L_0x003a:
            X.HMF r2 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_NONE
            return r2
        L_0x003d:
            java.lang.Object r2 = r7.A01
            return r2
        L_0x0040:
            X.GkP r2 = new X.GkP
            r2.<init>()
            java.lang.Object r0 = r7.A01
            X.Mqm r0 = (X.C67614Mqm) r0
            java.util.Map r1 = r0.A0C
            java.lang.String r0 = "input"
            r2.A08(r0, r1)
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x00a6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0061:
            X.GkQ r2 = new X.GkQ
            r2.<init>()
            java.lang.Object r0 = r7.A01
            X.Mqm r0 = (X.C67614Mqm) r0
            java.util.Map r1 = r0.A0C
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "containermodule"
            r2.A06(r0, r1)
            return r2
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0085:
            X.GkR r2 = new X.GkR
            r2.<init>()
            java.lang.Object r0 = r7.A01
            X.Mqm r0 = (X.C67614Mqm) r0
            java.util.Map r1 = r0.A0C
            java.lang.String r0 = "input"
            r2.A08(r0, r1)
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x00a6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00a6:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "type"
            r2.A06(r0, r1)
            return r2
        L_0x00ae:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r2 = new com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository
            r2.<init>(r0)
            return r2
        L_0x00b8:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = "feature_customization_enabled"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x00ca:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x00d9:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = X.AnonymousClass9NF.A01()
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x00ea:
            java.lang.Object r0 = r7.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x00f1:
            java.lang.Object r0 = r7.A01
            X.H1l r0 = (X.C54166H1l) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5k r2 = new X.H5k
            r2.<init>(r0)
            return r2
        L_0x0101:
            java.lang.Object r0 = r7.A01
            X.H0E r0 = (X.H0E) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5l r2 = new X.H5l
            r2.<init>(r0)
            return r2
        L_0x0111:
            java.lang.Object r0 = r7.A01
            X.K4R r0 = (X.K4R) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5m r2 = new X.H5m
            r2.<init>(r0)
            return r2
        L_0x0121:
            java.lang.Object r0 = r7.A01
            X.H0F r0 = (X.H0F) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5n r2 = new X.H5n
            r2.<init>(r0)
            return r2
        L_0x0131:
            X.02m r2 = X.C51965G9l.A0l()
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            r0 = 4
            r2.markerEnd(r1, r0)
            goto L_0x0291
        L_0x013e:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2SG r2 = new X.2SG
            r2.<init>(r0)
            return r2
        L_0x0148:
            java.lang.Object r1 = r7.A01
            X.OcF r1 = (X.C71093OcF) r1
            com.instagram.common.session.UserSession r0 = r1.A0K
            X.7Pr r2 = X.DbS.A0W(r0)
            java.lang.String r0 = r1.A0A
            r2.A0d = r0
            r0 = 1
            X.DbS.A1S(r2, r0)
            r0 = 0
            r2.A06 = r0
            r2.A0E = r0
            float r0 = r1.A00
            r2.A03 = r0
            return r2
        L_0x0164:
            java.lang.Object r2 = r7.A01
            X.OcF r2 = (X.C71093OcF) r2
            X.0iw r0 = r2.A0J
            java.lang.String r4 = r0.getModuleName()
            X.Uz2 r3 = r2.A02
            X.TpH r1 = r2.A0L
            X.UzD r0 = r2.A0M
            X.Oa2 r2 = new X.Oa2
            r2.<init>(r3, r1, r0, r4)
            return r2
        L_0x017a:
            java.lang.Object r6 = r7.A01
            X.Gzb r6 = (X.C54106Gzb) r6
            X.Hob r0 = r6.A00
            if (r0 == 0) goto L_0x01e8
            X.1Xj r5 = r0.A01
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A04
            X.0wc r1 = r0.A00
            java.lang.String r0 = "instagram_wellbeing_nudging"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r1 = "comment_reply"
            java.lang.String r0 = "source_of_action"
            r2.AAJ(r0, r1)
            X.0sm r1 = X.0Yt.A0E()
            java.lang.String r0 = "extra_values"
            r2.A9H(r0, r1)
            java.lang.Long r1 = X.C51972G9s.A0j(r3)
            java.lang.String r0 = "parent_comment_id"
            r2.A9F(r0, r1)
            java.lang.Long r1 = X.C51972G9s.A0i(r4)
            java.lang.String r0 = "replied_to_comment_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = r5.getId()
            X.C51965G9l.A1J(r2, r0)
            java.lang.String r0 = "learn_more_click"
            X.DbS.A1H(r2, r0)
            r2.Cgf()
        L_0x01c1:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r4 = r6.requireContext()
            X.0eM r0 = r6.A01
            X.0lg r3 = X.DbT.A0X(r0)
            r0 = 632(0x278, float:8.86E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131956462(0x7f1312ee, float:1.954948E38)
            java.lang.String r0 = r1.getString(r0)
            X.C49906FEe.A01(r4, r3, r5, r2, r0)
            goto L_0x0291
        L_0x01e8:
            java.lang.String r1 = "RespectfulCommentNudge"
            java.lang.String r0 = "Analytics: learn_more_click failed"
            X.0wb.A03(r1, r0)
            goto L_0x01c1
        L_0x01f0:
            java.lang.Object r1 = r7.A01
            X.GzT r1 = (X.C54098GzT) r1
            X.0eM r0 = r1.A02
            X.0lg r0 = X.DbT.A0X(r0)
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r0)
            return r2
        L_0x01ff:
            java.lang.Object r2 = r7.A01
            X.GzT r2 = (X.C54098GzT) r2
            X.HlJ r0 = r2.A00
            if (r0 == 0) goto L_0x0218
            X.0eM r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.1Yp.A02(r1, r0)
        L_0x0218:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.DbX.A10(r0, r1)
            goto L_0x0291
        L_0x0222:
            java.lang.Object r2 = r7.A01
            X.GzT r2 = (X.C54098GzT) r2
            X.HlJ r0 = r2.A00
            if (r0 == 0) goto L_0x023b
            X.0eM r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.1Yp.A02(r1, r0)
        L_0x023b:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.DbX.A10(r0, r1)
            X.HlJ r0 = r2.A00
            if (r0 == 0) goto L_0x0291
            X.7dV r0 = r0.A01
            r0.CyZ()
            goto L_0x0291
        L_0x024e:
            java.lang.Object r0 = r7.A01
            X.Gzy r0 = (X.C54129Gzy) r0
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.Ggu r3 = (X.C53003Ggu) r3
            X.0wc r2 = r3.A00
            if (r2 == 0) goto L_0x0273
            boolean r1 = r3.A05
            X.1Yp r0 = r3.A01
            if (r1 == 0) goto L_0x0294
            if (r0 == 0) goto L_0x0273
            X.7dS r1 = r3.A02
            X.7dS r0 = X.C335737dS.BOTTOMSHEET_MEDIA_CREATION_STORY
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.1Yp.A03(r2, r0, r1)
        L_0x0273:
            X.05G r4 = r3.A03
        L_0x0275:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Object r1 = r0.A01
            X.7dS r1 = (X.C335737dS) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.JwL r0 = new X.JwL
            r0.<init>((X.C335737dS) r1, (java.lang.Integer) r2)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0275
        L_0x0291:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0294:
            if (r0 == 0) goto L_0x0273
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 1
            X.1Yp.A04(r2, r1, r0)
            goto L_0x0273
        L_0x029d:
            java.lang.Object r1 = r7.A01
            X.Gzy r1 = (X.C54129Gzy) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A01
            java.lang.Object r3 = r0.getValue()
            X.7dS r3 = (X.C335737dS) r3
            X.JQO r2 = r1.A00
            r1 = 0
            if (r2 == 0) goto L_0x02c2
            X.0wc r0 = r2.BO2()
            X.1Yp r1 = r2.BO7()
        L_0x02bc:
            X.H6a r2 = new X.H6a
            r2.<init>(r0, r4, r1, r3)
            return r2
        L_0x02c2:
            r0 = r1
            goto L_0x02bc
        L_0x02c4:
            java.lang.Object r0 = r7.A01
            X.E66 r0 = (X.E66) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x02cf:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0eM r0 = X.C227642jf.A02(r0)
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x02dc:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4lT r2 = new X.4lT
            r2.<init>(r0)
            return r2
        L_0x02e6:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2MN r2 = new X.2MN
            r2.<init>(r0)
            return r2
        L_0x02f0:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2MP r2 = new X.2MP
            r2.<init>(r0)
            return r2
        L_0x02fa:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x032e
            r0 = 1537(0x601, float:2.154E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = r1.getBoolean(r0)
        L_0x030c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0311:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "key_upsell_variant"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "bcf__bcf_first"
            boolean r0 = X.0qQ.A0K(r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x030c
            java.lang.String r0 = "bcf__block_first"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x030c
        L_0x032e:
            r1 = 0
            goto L_0x030c
        L_0x0330:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "key_target_user_name"
            java.lang.String r2 = X.C320236s2.A01(r1, r0)
            return r2
        L_0x033d:
            java.lang.Object r1 = r7.A01
            X.UbQ r1 = (X.C15372UbQ) r1
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Hs7 r2 = new X.Hs7
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58175Inf.invoke():java.lang.Object");
    }
}
