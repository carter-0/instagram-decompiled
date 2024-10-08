package X;

import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;

/* renamed from: X.DFh  reason: case insensitive filesystem */
public final class C45927DFh implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C45927DFh(IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = iABExtensionEventHandlerCallback;
            this.A02 = str;
            return;
        }
        this.A01 = iABExtensionEventHandlerCallback;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14, types: [com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d4, code lost:
        if (r5 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d8, code lost:
        if (r5 != null) goto L_0x02a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r17) {
        /*
            r16 = this;
            r7 = r16
            int r0 = r7.A00
            r2 = r17
            switch(r0) {
                case 0: goto L_0x0231;
                case 1: goto L_0x0192;
                case 2: goto L_0x010d;
                case 3: goto L_0x001d;
                case 4: goto L_0x0090;
                default: goto L_0x0009;
            }
        L_0x0009:
            if (r17 == 0) goto L_0x001b
            java.lang.String r0 = r7.A02
            X.UXv r1 = X.VEV.A00(r2, r0)
        L_0x0011:
            java.lang.Object r0 = r7.A01
            X.X6j r0 = (X.C20956X6j) r0
            if (r0 == 0) goto L_0x001a
            r0.DKU(r1)
        L_0x001a:
            return
        L_0x001b:
            r1 = 0
            goto L_0x0011
        L_0x001d:
            java.lang.Object r6 = r7.A01
            com.facebook.browser.lite.ipc.IABBloksGraphQLCallback r6 = (com.facebook.browser.lite.ipc.IABBloksGraphQLCallback) r6
            java.lang.String r4 = r7.A02
            if (r17 == 0) goto L_0x02eb
            java.lang.Object r12 = r2.Bny()
            if (r12 == 0) goto L_0x02eb
            X.C7y r12 = (X.C43754C7y) r12
            X.BpY r0 = r12.A0E()
            if (r0 == 0) goto L_0x02eb
            X.BpY r0 = r12.A0E()
            java.lang.Class<X.BpX> r11 = X.BpX.class
            java.lang.String r10 = "footer_template"
            r9 = -1347623361(0xffffffffaface63f, float:-3.1450217E-10)
            X.3lr r0 = r0.A03(r11, r10, r9)
            if (r0 == 0) goto L_0x02eb
            X.BpY r0 = r12.A0E()
            X.3lr r0 = r0.A03(r11, r10, r9)
            java.lang.Class<X.BpW> r8 = X.BpW.class
            java.lang.String r7 = "component"
            r2 = 650199343(0x26c1412f, float:1.3409733E-15)
            X.3lr r0 = r0.A02(r8, r7, r2)
            if (r0 == 0) goto L_0x02eb
            X.BpY r0 = r12.A0E()
            X.3lr r0 = r0.A03(r11, r10, r9)
            X.3lr r1 = r0.A02(r8, r7, r2)
            java.lang.Class<X.BpV> r5 = X.BpV.class
            java.lang.String r3 = "bundle"
            r0 = 1204455462(0x47ca8826, float:103696.3)
            X.3lr r0 = r1.A03(r5, r3, r0)
            if (r0 == 0) goto L_0x02eb
            X.BpY r0 = r12.A0E()
            X.3lr r0 = r0.A03(r11, r10, r9)
            X.3lr r1 = r0.A02(r8, r7, r2)
            r2 = 0
            r0 = 1204455462(0x47ca8826, float:103696.3)
            X.3lr r1 = r1.getOptionalTreeField(r2, r3, r5, r0)
            java.lang.String r0 = "bloks_bundle_tree"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
            if (r0 == 0) goto L_0x001a
            goto L_0x02e3
        L_0x0090:
            java.lang.Object r9 = r7.A01
            com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback r9 = (com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback) r9
            java.lang.String r4 = r7.A02
            if (r17 == 0) goto L_0x0109
            java.lang.Object r5 = r2.Bny()
            if (r5 == 0) goto L_0x0109
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.Bpd> r3 = X.C42987Bpd.class
            r10 = 0
            java.lang.String r2 = "iab_extension_pixel_event_handler(extra_params:$extra_params,params:$params)"
            r1 = -844251297(0xffffffffcdadbf5f, float:-3.64375008E8)
            X.3lr r0 = r5.getOptionalTreeField(r10, r2, r3, r1)
            if (r0 == 0) goto L_0x0109
            X.3lr r3 = r5.getOptionalTreeField(r10, r2, r3, r1)     // Catch:{ RemoteException -> 0x0105 }
            java.lang.Class<X.Bpc> r2 = X.C42986Bpc.class
            java.lang.String r1 = "pixel_handlers"
            r0 = -521017995(0xffffffffe0f1e575, float:-1.3944373E20)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r10, r1, r2, r0)     // Catch:{ RemoteException -> 0x0105 }
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x0105 }
            X.3kO r12 = r0.iterator()     // Catch:{ RemoteException -> 0x0105 }
        L_0x00c5:
            boolean r0 = r12.hasNext()     // Catch:{ RemoteException -> 0x0105 }
            if (r0 == 0) goto L_0x0101
            X.3lr r11 = X.C41845B3m.A0V(r12)     // Catch:{ RemoteException -> 0x0105 }
            X.EWY r7 = X.EWY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ RemoteException -> 0x0105 }
            java.lang.String r6 = "handler_type"
            java.lang.Enum r0 = r11.getOptionalEnumField(r10, r6, r7)     // Catch:{ RemoteException -> 0x0105 }
            if (r0 == 0) goto L_0x00c5
            X.RH5 r5 = X.RH5.A02     // Catch:{ RemoteException -> 0x0105 }
            r3 = 1
            java.lang.String r2 = "iab_extension_type"
            java.lang.Enum r0 = r11.getOptionalEnumField(r3, r2, r5)     // Catch:{ RemoteException -> 0x0105 }
            if (r0 == 0) goto L_0x00c5
            com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload r1 = new com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload     // Catch:{ RemoteException -> 0x0105 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0105 }
            java.lang.Enum r0 = r11.getOptionalEnumField(r10, r6, r7)     // Catch:{ RemoteException -> 0x0105 }
            java.lang.String r0 = r0.toString()     // Catch:{ RemoteException -> 0x0105 }
            r1.A00 = r0     // Catch:{ RemoteException -> 0x0105 }
            java.lang.Enum r0 = r11.getOptionalEnumField(r3, r2, r5)     // Catch:{ RemoteException -> 0x0105 }
            java.lang.String r0 = r0.toString()     // Catch:{ RemoteException -> 0x0105 }
            r1.A01 = r0     // Catch:{ RemoteException -> 0x0105 }
            r8.add(r1)     // Catch:{ RemoteException -> 0x0105 }
            goto L_0x00c5
        L_0x0101:
            r9.Czu(r8)     // Catch:{ RemoteException -> 0x0105 }
            return
        L_0x0105:
            X.9su r0 = X.C391409su.A0k
            goto L_0x02f2
        L_0x0109:
            X.9su r0 = X.C391409su.A0k
            goto L_0x02f2
        L_0x010d:
            java.lang.Object r10 = r7.A01
            com.facebook.browser.lite.ipc.IABExpandableFooterCallback r10 = (com.facebook.browser.lite.ipc.IABExpandableFooterCallback) r10
            java.lang.String r4 = r7.A02
            if (r17 == 0) goto L_0x018e
            java.lang.Object r9 = r2.Bny()
            if (r9 == 0) goto L_0x018e
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.Bpa> r7 = X.C42984Bpa.class
            r8 = 0
            java.lang.String r6 = "xfb_iab_ig_expandable_sheet_content(ad_id:$ad_id,ad_tracking_token:$ad_tracking_token,extra_params:$extra_params,iab_session_id:$iab_session_id,is_launch_url:$is_launch_url,web_url:$url)"
            r5 = 144484936(0x89caa48, float:9.428941E-34)
            X.3lr r0 = r9.getOptionalTreeField(r8, r6, r7, r5)
            if (r0 == 0) goto L_0x018e
            X.3lr r0 = r9.getOptionalTreeField(r8, r6, r7, r5)
            java.lang.Class<X.BpZ> r3 = X.BpZ.class
            java.lang.String r2 = "items"
            r1 = -1001970296(0xffffffffc4472588, float:-796.5864)
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r8, r2, r3, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x018e
            X.3lr r0 = r9.getOptionalTreeField(r8, r6, r7, r5)     // Catch:{ RemoteException -> 0x018a }
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r8, r2, r3, r1)     // Catch:{ RemoteException -> 0x018a }
            java.lang.Object r6 = r0.get(r8)     // Catch:{ RemoteException -> 0x018a }
            X.3lr r6 = (X.C250663lr) r6     // Catch:{ RemoteException -> 0x018a }
            java.lang.String r7 = "item_id"
            java.lang.String r0 = r6.getOptionalStringField(r8, r7)     // Catch:{ RemoteException -> 0x018a }
            if (r0 == 0) goto L_0x0184
            X.RGm r5 = X.C8944RGm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ RemoteException -> 0x018a }
            r3 = 1
            java.lang.String r1 = "type"
            java.lang.Enum r0 = r6.getOptionalEnumField(r3, r1, r5)     // Catch:{ RemoteException -> 0x018a }
            if (r0 == 0) goto L_0x0184
            java.lang.String r2 = "iab_extension_type"
            java.lang.String r0 = r6.A0A(r2)     // Catch:{ RemoteException -> 0x018a }
            if (r0 == 0) goto L_0x0184
            java.lang.String r11 = r6.getOptionalStringField(r8, r7)     // Catch:{ RemoteException -> 0x018a }
            java.lang.Enum r0 = r6.getOptionalEnumField(r3, r1, r5)     // Catch:{ RemoteException -> 0x018a }
            java.lang.String r12 = r0.toString()     // Catch:{ RemoteException -> 0x018a }
            r1 = 2
            java.lang.String r0 = "peek_height"
            double r13 = r6.getCoercedDoubleField(r1, r0)     // Catch:{ RemoteException -> 0x018a }
            java.lang.String r15 = r6.A0A(r2)     // Catch:{ RemoteException -> 0x018a }
            r10.Czr(r11, r12, r13, r15)     // Catch:{ RemoteException -> 0x018a }
            return
        L_0x0184:
            X.9su r0 = X.C391409su.A0j     // Catch:{ RemoteException -> 0x018a }
            X.A0N.A00(r0, r4)     // Catch:{ RemoteException -> 0x018a }
            return
        L_0x018a:
            X.9su r0 = X.C391409su.A0j
            goto L_0x02f2
        L_0x018e:
            X.9su r0 = X.C391409su.A0j
            goto L_0x02f2
        L_0x0192:
            if (r17 == 0) goto L_0x022b
            X.3lr r3 = X.C41845B3m.A0U(r2)
            if (r3 == 0) goto L_0x022b
            java.lang.Class<X.Bpr> r2 = X.C43001Bpr.class
            java.lang.String r1 = "iab_extension_pre_exit_handler(extra_params:$extra_params,params:$params)"
            r0 = 1145641146(0x444918ba, float:804.38635)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x022b
            java.lang.Class<X.Bpq> r2 = X.C43000Bpq.class
            java.lang.String r1 = "pre_exit_handlers"
            r0 = -760294797(0xffffffffd2aed273, float:-3.75427531E11)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)     // Catch:{ RemoteException -> 0x0225 }
            X.0qQ.A07(r0)     // Catch:{ RemoteException -> 0x0225 }
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x0225 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ RemoteException -> 0x0225 }
        L_0x01bd:
            boolean r0 = r5.hasNext()     // Catch:{ RemoteException -> 0x0225 }
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r4 = r5.next()     // Catch:{ RemoteException -> 0x0225 }
            r3 = r4
            X.3lr r3 = (X.C250663lr) r3     // Catch:{ RemoteException -> 0x0225 }
            X.EWY r2 = X.EWY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ RemoteException -> 0x0225 }
            r1 = 0
            java.lang.String r0 = "handler_type"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)     // Catch:{ RemoteException -> 0x0225 }
            if (r0 == 0) goto L_0x01bd
            X.RH5 r2 = X.RH5.A02     // Catch:{ RemoteException -> 0x0225 }
            r1 = 1
            java.lang.String r0 = "iab_extension_type"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)     // Catch:{ RemoteException -> 0x0225 }
            if (r0 == 0) goto L_0x01bd
            r6.add(r4)     // Catch:{ RemoteException -> 0x0225 }
            goto L_0x01bd
        L_0x01e4:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r6)     // Catch:{ RemoteException -> 0x0225 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0225 }
        L_0x01ec:
            boolean r0 = r6.hasNext()     // Catch:{ RemoteException -> 0x0225 }
            if (r0 == 0) goto L_0x021d
            X.3lr r4 = X.C41845B3m.A0V(r6)     // Catch:{ RemoteException -> 0x0225 }
            com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload r3 = new com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload     // Catch:{ RemoteException -> 0x0225 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0225 }
            X.EWY r2 = X.EWY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ RemoteException -> 0x0225 }
            r1 = 0
            java.lang.String r0 = "handler_type"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r2)     // Catch:{ RemoteException -> 0x0225 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RemoteException -> 0x0225 }
            r3.A00 = r0     // Catch:{ RemoteException -> 0x0225 }
            X.RH5 r2 = X.RH5.A02     // Catch:{ RemoteException -> 0x0225 }
            r1 = 1
            java.lang.String r0 = "iab_extension_type"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r2)     // Catch:{ RemoteException -> 0x0225 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RemoteException -> 0x0225 }
            r3.A01 = r0     // Catch:{ RemoteException -> 0x0225 }
            r5.add(r3)     // Catch:{ RemoteException -> 0x0225 }
            goto L_0x01ec
        L_0x021d:
            java.lang.Object r0 = r7.A01     // Catch:{ RemoteException -> 0x0225 }
            com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback r0 = (com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback) r0     // Catch:{ RemoteException -> 0x0225 }
            r0.Czu(r5)     // Catch:{ RemoteException -> 0x0225 }
            return
        L_0x0225:
            java.lang.String r4 = r7.A02
            X.9su r0 = X.C391409su.A0m
            goto L_0x02f2
        L_0x022b:
            java.lang.String r4 = r7.A02
            X.9su r0 = X.C391409su.A0m
            goto L_0x02f2
        L_0x0231:
            r1 = 0
            if (r17 == 0) goto L_0x02d2
            X.3lr r4 = X.C41845B3m.A0U(r2)
            if (r4 == 0) goto L_0x02d2
            java.lang.Class<X.Bpo> r3 = X.C42998Bpo.class
            r6 = 0
            java.lang.String r2 = "iab_extension_pre_exit_bloks_handler_template(bloks_params:$bloks_params,extra_params:$extra_params,params:$params)"
            r0 = -650187302(0xffffffffd93eedda, float:-3.35886038E15)
            X.3lr r5 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r5 == 0) goto L_0x02d3
            java.lang.Class<X.Bpn> r3 = X.C42997Bpn.class
            java.lang.String r2 = "should_block_exit"
            r0 = -828409507(0xffffffffce9f795d, float:-1.3377655E9)
            X.3lr r4 = r5.getOptionalTreeField(r6, r2, r3, r0)
            if (r4 == 0) goto L_0x02d3
            java.lang.Class<X.Bpm> r3 = X.C42996Bpm.class
            java.lang.String r2 = "action"
            r0 = 1629363613(0x611e1d9d, float:1.8229496E20)
            X.3lr r4 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r4 == 0) goto L_0x02d3
            java.lang.Class<X.Bpl> r3 = X.C42995Bpl.class
            java.lang.String r2 = "bundle"
            r0 = -1009031954(0xffffffffc3db64ee, float:-438.7885)
            X.3lr r2 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r2 == 0) goto L_0x02d3
            java.lang.String r0 = "bloks_bundle_tree"
            java.lang.String r8 = r2.getOptionalStringField(r6, r0)
        L_0x0275:
            java.lang.Class<X.Bpk> r3 = X.C42994Bpk.class
            java.lang.String r2 = "present_exit_blocking_ui"
            r0 = 393737714(0x1777f5f2, float:8.012043E-25)
            X.3lr r4 = r5.A02(r3, r2, r0)
            if (r4 == 0) goto L_0x02d7
            java.lang.Class<X.Bpj> r3 = X.C42993Bpj.class
            r6 = 0
            java.lang.String r2 = "action"
            r0 = -1258543406(0xffffffffb4fc26d2, float:-4.6966903E-7)
            X.3lr r4 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r4 == 0) goto L_0x02d7
            java.lang.Class<X.Bpi> r3 = X.C42992Bpi.class
            java.lang.String r2 = "bundle"
            r0 = -638606404(0xffffffffd9efa3bc, float:-8.4315684E15)
            X.3lr r2 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r2 == 0) goto L_0x02d7
            java.lang.String r0 = "bloks_bundle_tree"
            java.lang.String r6 = r2.getOptionalStringField(r6, r0)
        L_0x02a3:
            java.lang.Class<X.Bph> r3 = X.C42991Bph.class
            java.lang.String r2 = "execute_non_exit_blocking_action"
            r0 = 253210418(0xf17af32, float:7.478616E-30)
            X.3lr r4 = r5.A04(r3, r2, r0)
            if (r4 == 0) goto L_0x02db
            java.lang.Class<X.Bpg> r3 = X.C42990Bpg.class
            r5 = 0
            java.lang.String r2 = "action"
            r0 = 458837633(0x1b594e81, float:1.7975185E-22)
            X.3lr r4 = r4.getOptionalTreeField(r5, r2, r3, r0)
            if (r4 == 0) goto L_0x02db
            java.lang.Class<X.Bpf> r3 = X.C42989Bpf.class
            java.lang.String r2 = "bundle"
            r0 = 346180161(0x14a24a41, float:1.6387108E-26)
            X.3lr r2 = r4.getOptionalTreeField(r5, r2, r3, r0)
            if (r2 == 0) goto L_0x02db
            java.lang.String r0 = "bloks_bundle_tree"
            java.lang.String r1 = r2.getOptionalStringField(r5, r0)
            goto L_0x02db
        L_0x02d2:
            r5 = r1
        L_0x02d3:
            r8 = r1
            if (r5 == 0) goto L_0x02d7
            goto L_0x0275
        L_0x02d7:
            r6 = r1
            if (r5 == 0) goto L_0x02db
            goto L_0x02a3
        L_0x02db:
            java.lang.Object r0 = r7.A01     // Catch:{ RemoteException -> 0x02ee }
            com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback r0 = (com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback) r0     // Catch:{ RemoteException -> 0x02ee }
            r0.Czs(r8, r6, r1)     // Catch:{ RemoteException -> 0x02ee }
            return
        L_0x02e3:
            r6.Czq(r0)     // Catch:{ RemoteException -> 0x02e7 }
            goto L_0x02ea
        L_0x02e7:
            X.9su r0 = X.C391409su.A0i
            goto L_0x02f2
        L_0x02ea:
            return
        L_0x02eb:
            X.9su r0 = X.C391409su.A0i
            goto L_0x02f2
        L_0x02ee:
            java.lang.String r4 = r7.A02
            X.9su r0 = X.C391409su.A0l
        L_0x02f2:
            X.A0N.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45927DFh.invoke(X.3JD):void");
    }

    public C45927DFh(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
