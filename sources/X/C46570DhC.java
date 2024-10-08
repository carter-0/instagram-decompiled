package X;

/* renamed from: X.DhC  reason: case insensitive filesystem */
public final class C46570DhC extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46570DhC(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x017f, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0184, code lost:
        r0 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0252, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0259, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02df, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0332;
                case 2: goto L_0x0325;
                case 3: goto L_0x0351;
                case 4: goto L_0x031e;
                case 5: goto L_0x0007;
                case 6: goto L_0x02ed;
                case 7: goto L_0x02e0;
                case 8: goto L_0x02c8;
                case 9: goto L_0x0351;
                case 10: goto L_0x031e;
                case 11: goto L_0x0007;
                case 12: goto L_0x02b8;
                case 13: goto L_0x02ae;
                case 14: goto L_0x029f;
                case 15: goto L_0x0351;
                case 16: goto L_0x031e;
                case 17: goto L_0x0007;
                case 18: goto L_0x028b;
                case 19: goto L_0x0280;
                case 20: goto L_0x0271;
                case 21: goto L_0x0262;
                case 22: goto L_0x0351;
                case 23: goto L_0x031e;
                case 24: goto L_0x0007;
                case 25: goto L_0x0242;
                case 26: goto L_0x0238;
                case 27: goto L_0x022d;
                case 28: goto L_0x0222;
                case 29: goto L_0x0215;
                case 30: goto L_0x0205;
                case 31: goto L_0x01f8;
                case 32: goto L_0x01e3;
                case 33: goto L_0x01c1;
                case 34: goto L_0x01ae;
                case 35: goto L_0x01d4;
                case 36: goto L_0x01c1;
                case 37: goto L_0x01ae;
                case 38: goto L_0x019b;
                case 39: goto L_0x0188;
                case 40: goto L_0x000e;
                case 41: goto L_0x0148;
                case 42: goto L_0x00c5;
                case 43: goto L_0x00b4;
                case 44: goto L_0x00ad;
                case 45: goto L_0x001b;
                case 46: goto L_0x007c;
                case 47: goto L_0x0351;
                case 48: goto L_0x031e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.07f r6 = X.DbY.A0I(r0)
        L_0x000d:
            return r6
        L_0x000e:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r6 = X.DbX.A0o(r0)
            if (r6 != 0) goto L_0x000d
            java.lang.String r6 = "unknown"
            return r6
        L_0x001b:
            java.lang.Object r5 = r2.A01
            X.E43 r5 = (X.E43) r5
            X.0eM r6 = r5.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.2Dm r0 = X.2L2.A00(r0)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r2 = r0.A0C
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L_0x0035
            java.lang.String r0 = "folderId"
            goto L_0x0252
        L_0x0035:
            X.2Ej r0 = new X.2Ej
            r0.<init>(r1)
            java.util.List r0 = r2.A0F(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0042:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r4.next()
            X.2Eq r0 = (X.2Eq) r0
            java.lang.String r3 = r0.C6C()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r2 = r6.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r1 = 0
            X.N4G r0 = new X.N4G
            r0.<init>(r1)
            X.C66671Mae.A01(r0, r2, r3)
            goto L_0x0042
        L_0x0064:
            X.0hq r0 = X.DbV.A0I(r5)
            r0.A0c()
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = X.DbS.A0a()
            r0 = 2131959718(0x7f131fa6, float:1.9556084E38)
            X.DbS.A1E(r5, r1, r0)
            X.DbY.A1K(r2, r1)
            goto L_0x02dd
        L_0x007c:
            java.lang.Object r3 = r2.A01
            X.NIv r3 = (X.C68457NIv) r3
            X.OSg r2 = r3.A03
            if (r2 == 0) goto L_0x0184
            java.lang.String r1 = "inbox_folders_manage_screen_create_folder_click"
            X.0sm r0 = X.0Yt.A0E()
            X.C70933OSg.A00(r2, r1, r0)
            X.NIx r2 = new X.NIx
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "folder_management"
            X.DbS.A1B(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r3)
            X.0eM r0 = r3.A06
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            r1.A0D(r2)
            r0 = 1
            r1.A0F = r0
            goto L_0x017f
        L_0x00ad:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            goto L_0x02dd
        L_0x00b4:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "should_use_callback"
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x00c5:
            java.lang.Object r5 = r2.A01
            X.NIx r5 = (X.C68459NIx) r5
            X.OSg r3 = r5.A00
            if (r3 == 0) goto L_0x0184
            X.0eM r0 = r5.A06
            java.lang.Object r1 = r0.getValue()
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.String r0 = "entry_point"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "inbox_folders_create_screen_save_click"
            X.C70933OSg.A00(r3, r0, r1)
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.5Oz r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = X.DbV.A12(r0)
            r0 = 33
            X.PqQ r4 = new X.PqQ
            r4.<init>(r5, r0)
            X.G1g r3 = X.C51771G1g.A00
            X.0qQ.A0B(r1, r2)
            r12 = 1
            X.AnonymousClass7TF.A1C(r7, r12, r3)
            X.1vn r2 = X.1vm.A01(r1)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 1369(0x559, float:1.918E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Df r1 = X.C41845B3m.A03(r1, r7, r0)
            java.lang.String r0 = "data"
            X.1vR r7 = X.C41847B3o.A04(r1, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BhA> r11 = X.C42713BhA.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "CreateCustomFolderMutation"
            r14 = 96
            java.lang.String r16 = "create_ig_business_custom_folder"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 4
            X.DFQ r0 = new X.DFQ
            r0.<init>(r1, r4, r3)
            X.FS6.A00(r0, r6, r2, r3, r1)
            goto L_0x02dd
        L_0x0148:
            java.lang.Object r4 = r2.A01
            X.NIx r4 = (X.C68459NIx) r4
            X.OSg r2 = r4.A00
            if (r2 == 0) goto L_0x0184
            java.lang.String r1 = "inbox_folders_create_screen_add_chats_click"
            X.0sm r0 = X.0Yt.A0E()
            X.C70933OSg.A00(r2, r1, r0)
            X.E2N r3 = new X.E2N
            r3.<init>()
            java.util.List r2 = r4.A05
            r0 = 32
            X.PqQ r1 = new X.PqQ
            r1.<init>(r4, r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r3.A02 = r2
            r3.A03 = r1
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A07
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            r0 = 1
            r1.A0F = r0
            r1.A0D(r3)
        L_0x017f:
            r1.A04()
            goto L_0x02dd
        L_0x0184:
            java.lang.String r0 = "logger"
            goto L_0x0252
        L_0x0188:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            r0 = 1038(0x40e, float:1.455E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x019b:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            r0 = 1037(0x40d, float:1.453E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x01ae:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = "longitude"
            double r0 = r1.getDouble(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L_0x01c1:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = "latitude"
            double r0 = r1.getDouble(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L_0x01d4:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = "thread_id"
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x01e3:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01f6
            r0 = 740(0x2e4, float:1.037E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.Boolean r6 = X.DbU.A0g(r1, r0)
            return r6
        L_0x01f6:
            r6 = 0
            return r6
        L_0x01f8:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r2.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            com.instagram.common.session.UserSession r6 = r1.A06(r0)
            return r6
        L_0x0205:
            java.lang.Object r0 = r2.A01
            X.E7L r0 = (X.E7L) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMb r6 = new X.NMb
            r6.<init>(r0)
            return r6
        L_0x0215:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "thread_id"
            java.lang.String r6 = X.C320236s2.A01(r1, r0)
            return r6
        L_0x0222:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.07f r6 = r0.getViewModelStore()
            return r6
        L_0x022d:
            java.lang.Object r0 = r2.A01
            com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository r0 = (com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x0238:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository r6 = new com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository
            r6.<init>(r0)
            return r6
        L_0x0242:
            java.lang.Object r3 = r2.A01
            X.E1q r3 = (X.C47422E1q) r3
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.EWM r1 = r3.A01
            if (r1 != 0) goto L_0x025a
            java.lang.String r0 = "initialOption"
        L_0x0252:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x025a:
            boolean r0 = r3.A02
            X.EFA r6 = new X.EFA
            r6.<init>(r2, r1, r0)
            return r6
        L_0x0262:
            java.lang.Object r0 = r2.A01
            X.Gzf r0 = (X.C54110Gzf) r0
            X.DbZ.A17(r0)
            X.0sa r0 = r0.A00
            if (r0 == 0) goto L_0x02dd
            r0.invoke()
            goto L_0x02dd
        L_0x0271:
            java.lang.Object r0 = r2.A01
            X.MoU r0 = (X.C67474MoU) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            X.2EX r1 = X.AnonymousClass2EX.A00
            X.2Eo r0 = X.2Eo.A04
            X.43G r6 = X.AnonymousClass43B.A00(r2, r1, r0)
            return r6
        L_0x0280:
            java.lang.Object r0 = r2.A01
            X.MoU r0 = (X.C67474MoU) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.4kA r6 = X.AnonymousClass4k9.A00(r0)
            return r6
        L_0x028b:
            java.lang.Object r0 = r2.A01
            X.E5E r0 = (X.E5E) r0
            android.app.Application r1 = X.DbY.A05(r0)
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.DlZ r6 = new X.DlZ
            r6.<init>(r1, r0)
            return r6
        L_0x029f:
            java.lang.Object r0 = r2.A01
            X.E5E r0 = (X.E5E) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x02ae:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F1x r6 = new X.F1x
            r6.<init>(r0)
            return r6
        L_0x02b8:
            java.lang.Object r0 = r2.A01
            X.E7K r0 = (X.E7K) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEg r6 = new X.EEg
            r6.<init>(r0)
            return r6
        L_0x02c8:
            java.lang.Object r2 = r2.A01
            X.E7K r2 = (X.E7K) r2
            X.0eM r0 = r2.A02
            java.lang.Object r1 = r0.getValue()
            com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel r1 = (com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel) r1
            X.0eM r0 = r2.A00
            java.lang.String r0 = X.DbS.A0t(r0)
            r1.A01(r0)
        L_0x02dd:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x02e0:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "ChannelsFeaturedEventListFragment.ARGUMENT_EVENT_IDENTIFIER"
            java.lang.String r6 = X.C320236s2.A01(r1, r0)
            return r6
        L_0x02ed:
            java.lang.Object r2 = r2.A01
            X.NVN r2 = (X.NVN) r2
            com.instagram.common.session.UserSession r5 = r2.A0C()
            X.0eM r0 = r2.A00
            java.lang.Object r4 = r0.getValue()
            X.NiP r4 = (X.C69263NiP) r4
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x031c
            r0 = 211(0xd3, float:2.96E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r3 = r1.getBoolean(r0)
        L_0x030b:
            android.os.Bundle r2 = r2.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x0316
            java.lang.String r0 = "ChannelDiscoverySuggestionsFragment.ARG_SHOW_SUGGESTIONS_SECTION"
            boolean r1 = r2.getBoolean(r0, r1)
        L_0x0316:
            X.NND r6 = new X.NND
            r6.<init>(r5, r4, r3, r1)
            return r6
        L_0x031c:
            r3 = 0
            goto L_0x030b
        L_0x031e:
            java.lang.Object r0 = r2.A01
            java.lang.Object r6 = X.DbT.A0r(r0)
            return r6
        L_0x0325:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "ChannelDiscoverySuggestionsFragment.ARG_CHANNEL_SUGGESTIONS_ENTRYPOINT"
            java.io.Serializable r6 = r1.getSerializable(r0)
            return r6
        L_0x0332:
            java.lang.Object r0 = r2.A01
            X.NKn r0 = (X.C68494NKn) r0
            com.instagram.common.session.UserSession r4 = r0.A0C()
            com.instagram.common.session.UserSession r3 = r0.A0C()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317934219433649(0x8106f8002016b1, double:3.0309460687283E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r0 = r0 ^ 1
            X.NMr r6 = new X.NMr
            r6.<init>(r4, r0)
            return r6
        L_0x0351:
            java.lang.Object r6 = r2.A01
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46570DhC.invoke():java.lang.Object");
    }
}
