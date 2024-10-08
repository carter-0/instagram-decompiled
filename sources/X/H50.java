package X;

import android.database.ContentObserver;
import android.os.SystemClock;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public final class H50 extends 1P0 {
    public final int A00;
    public final Object A01;

    public H50(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(1OC r1, Object obj, int i) {
        r1.A00 = new H50(obj, i);
    }

    public final void onFail(C268654dm r12) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        List list;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A03(729751111);
                synchronized (C56490HzM.A03) {
                    C56490HzM.A02 = false;
                    C56490HzM.A01 = null;
                }
                C57100IOo iOo = (C57100IOo) this.A01;
                1OC r1 = iOo.A00;
                if (r1 != null) {
                    r1.A00 = null;
                }
                iOo.A00 = null;
                i = 2069344129;
                break;
            case 3:
                i2 = AnonymousClass0fD.A03(-1829415199);
                H1V h1v = (H1V) this.A01;
                C59689JTv.A00(h1v.getContext(), DbV.A05(h1v).getString(2131961740), "createSingleMediaRequestTask onFail", 0);
                DbZ.A17(h1v);
                i = -1092415417;
                break;
            case 4:
                i2 = AnonymousClass0fD.A03(343131928);
                i = -258378681;
                break;
            case 5:
                i2 = AnonymousClass0fD.A03(1590441320);
                0qQ.A0B(r12, 0);
                1XQ r13 = (1XQ) r12.A00();
                if (r13 != null) {
                    i3 = r13.mStatusCode;
                } else {
                    i3 = 0;
                }
                C55721HmI hmI = (C55721HmI) this.A01;
                IY0 iy0 = hmI.A02;
                long elapsedRealtime = SystemClock.elapsedRealtime() - hmI.A01;
                IY4 iy4 = iy0.A00;
                iy4.A0B.Cgz(i3, iy4.A05, elapsedRealtime);
                iy4.A05 = false;
                i = -1677951365;
                break;
            case 7:
                i2 = AnonymousClass7TG.A0D(r12, -889196233);
                C53990GxY gxY = (C53990GxY) this.A01;
                1Ng A002 = AnonymousClass1Nd.A00(gxY.A00);
                1XP r14 = (1XP) r12.A00();
                if (r14 != null) {
                    str = r14.getErrorMessage();
                } else {
                    str = null;
                }
                A002.A00(new C57075INp((1Xj) null, (String) null, str, gxY.A01.getId(), true));
                i = -1870705925;
                break;
            case 8:
                i2 = AnonymousClass0fD.A03(-518870598);
                0qQ.A0B(r12, 0);
                C53990GxY gxY2 = (C53990GxY) this.A01;
                1Ng A003 = AnonymousClass1Nd.A00(gxY2.A00);
                1XP r15 = (1XP) r12.A00();
                if (r15 != null) {
                    str2 = r15.getErrorMessage();
                } else {
                    str2 = null;
                }
                A003.A00(new C57075INp((1Xj) null, (String) null, str2, gxY2.A01.getId(), false));
                i = 1738211923;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i2 = AnonymousClass0fD.A03(1363314596);
                C52765GcI gcI = (C52765GcI) this.A01;
                gcI.A0G.A04.A03((1Xj) null, AnonymousClass05K.A0C, gcI.A0I);
                gcI.A0F.DeI();
                i = -992689147;
                break;
            case 14:
                i2 = AnonymousClass0fD.A03(1595489723);
                C46433Dev dev = (C46433Dev) this.A01;
                String string = dev.A02.getString(2131972232);
                if (r12 instanceof C268674do) {
                    Object A004 = r12.A00();
                    A004.getClass();
                    String errorMessage = ((AnonymousClass1XT) A004).getErrorMessage();
                    if (errorMessage != null && !TextUtils.isEmpty(errorMessage)) {
                        string = errorMessage;
                    }
                }
                dev.A03.Ckh(new C22030Xtl("activity_feed_reminder", "activity_feed", (String) null, string, (String) null, (Map) null, (Map) null, (Map) null));
                i = -377903131;
                break;
            case 15:
                i2 = AnonymousClass7TG.A0D(r12, 1845228332);
                H50.super.onFail(r12);
                C54438HDp.A02(C54634HLr.ERROR, (C54438HDp) this.A01);
                i = 1951846595;
                break;
            case 16:
                i2 = AnonymousClass7TG.A0D(r12, 1501755278);
                H50.super.onFail(r12);
                C54438HDp hDp = (C54438HDp) this.A01;
                C61078JwG jwG = (C61078JwG) ((N4R) hDp.A01.getValue()).A00;
                if (jwG == null || (list = (List) jwG.A00) == null || list.isEmpty()) {
                    C54438HDp.A02(C54634HLr.ERROR, hDp);
                }
                C54438HDp.A02(C54634HLr.SUCCESS, hDp);
                i = -1910924962;
                break;
            case 17:
                i2 = AnonymousClass0fD.A03(339944001);
                C52770GcN gcN = (C52770GcN) this.A01;
                C51975G9x.A17(gcN, false);
                C59689JTv.A0C(gcN.requireContext(), "add_to_collection_failed");
                i = 368567689;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i2 = AnonymousClass0fD.A03(701386922);
                C52770GcN gcN2 = (C52770GcN) this.A01;
                C51975G9x.A17(gcN2, false);
                C59689JTv.A0C(gcN2.requireContext(), "add_to_collection_failed");
                i = 2094084315;
                break;
            case 19:
                i2 = AnonymousClass7TG.A0D(r12, -846347600);
                i = -703962378;
                break;
            default:
                H50.super.onFail(r12);
                return;
        }
        AnonymousClass0fD.A0A(i, i2);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 4:
                i = AnonymousClass0fD.A03(-1427796954);
                i2 = 1508289425;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1981799509);
                ((C55721HmI) this.A01).A02.A00.A03 = AnonymousClass05K.A00;
                i2 = 2139725894;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(-17071130);
                ((C52765GcI) this.A01).A0F.DeS();
                i2 = -402261609;
                break;
            case 17:
                i = AnonymousClass0fD.A03(2101462980);
                i2 = 1810418124;
                break;
            case 19:
                i = AnonymousClass0fD.A03(611884532);
                i2 = -1704246658;
                break;
            case 22:
                i = AnonymousClass0fD.A03(-1029038603);
                IgdsMediaButton igdsMediaButton = ((GPN) this.A01).A03;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setEnabled(true);
                }
                i2 = 928490623;
                break;
            case 23:
                i = AnonymousClass0fD.A03(-1021486281);
                IgdsMediaButton igdsMediaButton2 = ((GPN) this.A01).A03;
                if (igdsMediaButton2 != null) {
                    igdsMediaButton2.setEnabled(true);
                }
                i2 = -999036823;
                break;
            default:
                H50.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        String str;
        String str2;
        switch (this.A00) {
            case 4:
                i = AnonymousClass0fD.A03(-1062905444);
                i2 = 149091450;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1548258461);
                ((C55721HmI) this.A01).A01 = SystemClock.elapsedRealtime();
                i2 = -1416638244;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-932468190);
                C53990GxY gxY = (C53990GxY) this.A01;
                1Ng A002 = AnonymousClass1Nd.A00(gxY.A00);
                1Xj r0 = gxY.A01;
                String A2n = r0.A2n();
                ExtendedImageUrl extendedImageUrl = r0.A0E;
                if (extendedImageUrl != null) {
                    str2 = extendedImageUrl.A0A;
                } else {
                    str2 = null;
                }
                A002.A00(new C57073INn(A2n, true, str2));
                i2 = 983762943;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-449304362);
                C53990GxY gxY2 = (C53990GxY) this.A01;
                1Ng A003 = AnonymousClass1Nd.A00(gxY2.A00);
                1Xj r02 = gxY2.A01;
                String A2n2 = r02.A2n();
                ExtendedImageUrl extendedImageUrl2 = r02.A0E;
                if (extendedImageUrl2 != null) {
                    str = extendedImageUrl2.A0A;
                } else {
                    str = null;
                }
                A003.A00(new C57073INn(A2n2, false, str));
                i2 = 1191089818;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(1621026796);
                C52765GcI gcI = (C52765GcI) this.A01;
                GAQ gaq = gcI.A0G;
                gaq.A08((1Xj) null, false);
                C228362lW r4 = gaq.A04;
                String str3 = gcI.A0I;
                Integer num = AnonymousClass05K.A0C;
                r4.A07(num, str3, AnonymousClass000.A00(881), str3);
                String str4 = gcI.A04;
                if (str4 == null) {
                    str4 = "";
                }
                r4.A07(num, str3, "AD_ID", str4);
                r4.A07(num, str3, "MULTI_ADS_TYPE", String.valueOf(gcI.A01));
                r4.A01((1Xj) null, num, AnonymousClass05K.A03, str3);
                gcI.A0F.Dei();
                i2 = -417223255;
                break;
            case 17:
                i = AnonymousClass0fD.A03(446810935);
                i2 = 1750232620;
                break;
            case 19:
                i = AnonymousClass0fD.A03(1322235914);
                i2 = 1406234886;
                break;
            default:
                H50.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.3mI, X.GV9] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c9, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07cc, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0828, code lost:
        r20 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x082d, code lost:
        X.0qQ.A0F(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0834, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0936, code lost:
        X.AnonymousClass0fD.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0939, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0128, code lost:
        if (r2 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e8, code lost:
        if (r0 != null) goto L_0x02ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            r22 = this;
            r2 = r22
            r5 = r23
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0912;
                case 1: goto L_0x0009;
                case 2: goto L_0x08db;
                case 3: goto L_0x08a6;
                case 4: goto L_0x0835;
                case 5: goto L_0x06c8;
                case 6: goto L_0x0684;
                case 7: goto L_0x07df;
                case 8: goto L_0x0645;
                case 9: goto L_0x05ff;
                case 10: goto L_0x05d6;
                case 11: goto L_0x05b2;
                case 12: goto L_0x03d3;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0317;
                case 16: goto L_0x025f;
                case 17: goto L_0x0236;
                case 18: goto L_0x020d;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01a1;
                case 21: goto L_0x0077;
                case 22: goto L_0x0009;
                case 23: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.H50.super.onSuccess(r5)
            return
        L_0x000d:
            r0 = -876507260(0xffffffffcbc18f84, float:-2.5370376E7)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 1253197874(0x4ab24832, float:5841945.0)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r2.A01
            X.GPN r7 = (X.GPN) r7
            com.instagram.common.session.UserSession r0 = r7.A07
            X.1Av r0 = X.1Au.A00(r0)
            long r8 = java.lang.System.currentTimeMillis()
            X.0xa r6 = r0.A01
            java.lang.String r5 = "last_seen_timestamp_for_clips_creator_pick_add_to_story_upsell"
            long r2 = X.DbW.A06(r6, r5)
            long r8 = r8 - r2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r2 = 7
            long r2 = r0.toMillis(r2)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            android.content.Context r0 = r7.A05
            X.8ab r3 = X.DbS.A0Y(r0)
            r0 = 2131956108(0x7f13118c, float:1.9548762E38)
            r3.A09(r0)
            r0 = 2131956107(0x7f13118b, float:1.954876E38)
            r3.A08(r0)
            r2 = 2131956106(0x7f13118a, float:1.9548758E38)
            r0 = 49
            X.C56719I8z.A01(r3, r7, r0, r2)
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            X.DbY.A1M(r3, r0)
            X.0xY r0 = r6.AR4()
            long r2 = java.lang.System.currentTimeMillis()
            r0.E5c(r5, r2)
            r0.apply()
        L_0x006c:
            r0 = -1806308330(0xffffffff9455ec16, float:-1.08003116E-26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 751233265(0x2cc6e8f1, float:5.65336E-12)
            goto L_0x0936
        L_0x0077:
            r0 = -188948178(0xfffffffff4bce12e, float:-1.1971667E32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.5u7 r5 = (X.C298835u7) r5
            r0 = 568317355(0x21dfd5ab, float:1.5167625E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.H50.super.onSuccess(r5)
            java.util.List r8 = r5.Ao4()
            java.lang.Object r6 = r2.A01
            X.GBE r6 = (X.GBE) r6
            com.instagram.common.session.UserSession r13 = r6.A0a
            X.1E8 r5 = X.1E7.A00(r13)
            java.util.Iterator r2 = r8.iterator()
        L_0x00a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b0
            X.1Xj r0 = X.C51968G9o.A0n(r2)
            if (r0 == 0) goto L_0x00a0
            r5.A03(r0)
            goto L_0x00a0
        L_0x00b0:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r5 = r8.iterator()
        L_0x00b8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ca
            X.4bN r2 = X.C51966G9m.A0m(r5)
            X.0sn r0 = X.0sn.A00
            r2.A08 = r0
            r7.add(r2)
            goto L_0x00b8
        L_0x00ca:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            X.0qQ.A0A(r2)
            X.0qQ.A0B(r2, r1)
            com.instagram.clips.intf.ClipsViewerConfig r7 = r6.A0Y
            java.lang.String r9 = r7.A1H
            X.4bN r0 = X.GDY.A00(r7, r13, r9)
            boolean r8 = r7.A1t
            r10 = 1
            r5 = r8 ^ 1
            if (r0 == 0) goto L_0x0166
            int r0 = r2.size()
            if (r0 < r10) goto L_0x010f
            X.2is r0 = r6.A07
            if (r0 == 0) goto L_0x015e
            X.GD6 r0 = r0.A0C
            if (r0 == 0) goto L_0x019d
            int r0 = X.GD6.A00(r0)
            if (r0 <= r10) goto L_0x015e
            X.2is r9 = r6.A07
            if (r9 == 0) goto L_0x010f
            int r0 = r2.size()
            java.util.List r2 = r2.subList((int) r10, (int) r0)
            X.0qQ.A0B(r2, r1)
            X.GD6 r0 = r9.A0C
            if (r0 == 0) goto L_0x019d
            X.GBg r0 = r0.A0A
            r0.A0O(r10, r2)
        L_0x010f:
            X.GE0 r9 = r6.A1B
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r0 = 20
            X.C58711IwK.A01(r9, r2, r0)
            X.2is r0 = r6.A07
            if (r0 == 0) goto L_0x012a
            X.5o2 r2 = X.C295365o2.ORGANIC
            X.GD6 r0 = r0.A0C
            if (r0 == 0) goto L_0x019d
            X.GBg r0 = r0.A0A
            java.util.List r2 = r0.A0K(r2)
            if (r2 != 0) goto L_0x012c
        L_0x012a:
            X.0sn r2 = X.0sn.A00
        L_0x012c:
            X.GMD r0 = X.GNS.A00(r13)
            X.0qQ.A07(r0)
            r0.A02 = r2
            r6.A0P(r2)
        L_0x0138:
            if (r8 == 0) goto L_0x014c
            X.GCH r2 = r6.A1A
            X.5u8 r0 = X.C276114sa.A00
            X.5u9 r1 = r0.A00(r1)
            r0 = 0
            r1.A00 = r0
            X.4sZ r0 = r1.A00()
            r2.A02(r0)
        L_0x014c:
            boolean r0 = r7.A1Z
            if (r0 != 0) goto L_0x0153
            r6.A0T(r5)
        L_0x0153:
            r0 = 1657730150(0x62cef466, float:1.90882E21)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1723300789(0xffffffff9948844b, float:-1.0366474E-23)
            goto L_0x03c9
        L_0x015e:
            X.2is r0 = r6.A07
            if (r0 == 0) goto L_0x010f
            r0.A0Q(r2, r5)
            goto L_0x010f
        L_0x0166:
            if (r9 == 0) goto L_0x0138
            com.instagram.clips.intf.ClipsViewerSource r12 = r7.A0J
            java.lang.String r15 = r7.A00
            boolean r2 = r7.A1f
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = r7.A1L
            r17 = 0
            r16 = r0
            r18 = r2
            boolean r0 = X.C52047GCt.A00(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != 0) goto L_0x0138
            X.0wj r11 = X.0wj.A01
            r10 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ClipsMediaCacheMiss.ClipsViewerFragmentViewModel."
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r12, r0, r2)
            X.0f9 r2 = r11.AEf(r0, r10)
            java.lang.String r0 = "MediaCache does not include the media for media id = "
            java.lang.String r0 = X.002.A0R(r0, r9)
            X.C51969G9p.A1K(r2, r0)
            goto L_0x0138
        L_0x019d:
            java.lang.String r20 = "viewerAdapter"
            goto L_0x082d
        L_0x01a1:
            r0 = -1413138486(0xffffffffabc537ca, float:-1.4013176E-12)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.Gyg r5 = (X.C54057Gyg) r5
            r0 = 570445623(0x22004f37, float:1.738917E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.H50.super.onSuccess(r5)
            if (r5 == 0) goto L_0x01c3
            X.1Xj r3 = r5.A00
            if (r3 == 0) goto L_0x01ce
            java.lang.Object r0 = r2.A01
            X.GIY r0 = (X.GIY) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.C51967G9n.A1K(r0, r3)
        L_0x01c3:
            r0 = -1324413871(0xffffffffb10f0c51, float:-2.081624E-9)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 238858632(0xe3cb188, float:2.3258267E-30)
            goto L_0x0936
        L_0x01ce:
            java.lang.String r20 = "clipsMedia"
            goto L_0x082d
        L_0x01d2:
            r0 = -2062774077(0xffffffff850c90c3, float:-6.609357E-36)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.1XO r5 = (X.1XO) r5
            r0 = -1102430412(0xffffffffbe4a3f34, float:-0.19750673)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r3 = r2.A01
            com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity r3 = (com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity) r3
            java.util.List r0 = r5.A06
            X.0qQ.A07(r0)
            java.lang.Object r2 = X.00k.A0J(r0)
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x0202
            r2.getId()
            X.0eM r0 = r3.A00
            X.1E8 r0 = X.DbX.A0d(r0)
            r0.A03(r2)
            com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity.A00(r2, r3)
        L_0x0202:
            r0 = 1696826654(0x6523851e, float:4.826258E22)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1273428745(0xffffffffb41904f7, float:-1.4251042E-7)
            goto L_0x0936
        L_0x020d:
            r0 = -1586548396(0xffffffffa16f3154, float:-8.1041635E-19)
            int r1 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r5 = (com.instagram.save.model.SavedCollection) r5
            r0 = -1572497632(0xffffffffa2459720, float:-2.6778483E-18)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r3 = r2.A01
            X.GcN r3 = (X.C52770GcN) r3
            android.os.Handler r2 = r3.A0P
            X.Ihb r0 = new X.Ihb
            r0.<init>(r3, r5)
            r2.post(r0)
            r0 = 676992373(0x285a1575, float:1.2106084E-14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -181960649(0xfffffffff5278037, float:-2.1233254E32)
            goto L_0x0936
        L_0x0236:
            r0 = -1357322831(0xffffffffaf18e5b1, float:-1.3905922E-10)
            int r1 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r5 = (com.instagram.save.model.SavedCollection) r5
            r0 = -635287776(0xffffffffda224720, float:-1.14192872E16)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r3 = r2.A01
            X.GcN r3 = (X.C52770GcN) r3
            android.os.Handler r2 = r3.A0P
            X.Iha r0 = new X.Iha
            r0.<init>(r3, r5)
            r2.post(r0)
            r0 = -606757387(0xffffffffdbd59df5, float:-1.20255691E17)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -328522839(0xffffffffec6b23a9, float:-1.1370639E27)
            goto L_0x0936
        L_0x025f:
            r0 = -2142880206(0xffffffff80463e32, float:-6.450796E-39)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.5u7 r5 = (X.C298835u7) r5
            r0 = -2031291280(0xffffffff86ecf470, float:-8.91325E-35)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r5, r7)
            X.H50.super.onSuccess(r5)
            java.util.List r4 = r5.Ao4()
            java.lang.Object r11 = r2.A01
            X.HDp r11 = (X.C54438HDp) r11
            r1 = 6
            X.05G r8 = r11.A01
            java.lang.Object r0 = r8.getValue()
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r0 = r0.A00
            X.JwG r0 = (X.C61078JwG) r0
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02c8
            int r0 = r0.size()
        L_0x0297:
            int r1 = r1 - r0
            java.util.List r0 = X.00k.A0d(r4, r1)
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x02a4:
            boolean r0 = r10.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x02ca
            X.4bN r9 = X.C51966G9m.A0m(r10)
            X.3WR r2 = X.C54438HDp.A00(r9)
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x02bb
            com.instagram.user.model.User r4 = X.C51966G9m.A11(r0)
        L_0x02bb:
            java.lang.String r1 = X.C54438HDp.A01(r9, r11)
            X.Hns r0 = new X.Hns
            r0.<init>(r9, r4, r2, r1)
            r5.add(r0)
            goto L_0x02a4
        L_0x02c8:
            r0 = 0
            goto L_0x0297
        L_0x02ca:
            java.lang.Object r9 = r8.getValue()
            r0 = r9
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r0 = r0.A00
            X.JwG r0 = (X.C61078JwG) r0
            if (r0 == 0) goto L_0x0315
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x030e
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r0.addAll(r5)
            X.62P r0 = X.AnonymousClass62Q.A00(r0)
            if (r0 == 0) goto L_0x030e
        L_0x02ea:
            X.0qQ.A0B(r0, r7)
            X.JwG r2 = new X.JwG
            r2.<init>((X.AnonymousClass62P) r0)
        L_0x02f2:
            X.HLr r1 = X.C54634HLr.SUCCESS
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.N4R r0 = new X.N4R
            r0.<init>((X.C61078JwG) r2, (X.C54634HLr) r1)
            boolean r0 = r8.AIY(r9, r0)
            if (r0 == 0) goto L_0x02ca
            r0 = -1340172190(0xffffffffb01e9862, float:-5.7696614E-10)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 64738759(0x3dbd5c7, float:1.2920744E-36)
            goto L_0x03c9
        L_0x030e:
            X.0sn r0 = X.0sn.A00
            X.62P r0 = X.AnonymousClass62Q.A00(r0)
            goto L_0x02ea
        L_0x0315:
            r2 = r4
            goto L_0x02f2
        L_0x0317:
            r0 = -1484248246(0xffffffffa7882b4a, float:-3.7794517E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.5u7 r5 = (X.C298835u7) r5
            r0 = -1615306238(0xffffffff9fb86202, float:-7.808917E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            X.H50.super.onSuccess(r5)
            java.util.List r0 = r5.Ao4()
            java.lang.Object r8 = r2.A01
            X.HDp r8 = (X.C54438HDp) r8
            r11 = 6
            java.util.List r0 = X.00k.A0d(r0, r11)
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0343:
            boolean r0 = r10.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0367
            X.4bN r9 = X.C51966G9m.A0m(r10)
            X.3WR r7 = X.C54438HDp.A00(r9)
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x035a
            com.instagram.user.model.User r2 = X.C51966G9m.A11(r0)
        L_0x035a:
            java.lang.String r1 = X.C54438HDp.A01(r9, r8)
            X.Hns r0 = new X.Hns
            r0.<init>(r9, r2, r7, r1)
            r12.add(r0)
            goto L_0x0343
        L_0x0367:
            X.05G r10 = r8.A01
        L_0x0369:
            java.lang.Object r9 = r10.getValue()
            r1 = r9
            X.N4R r1 = (X.N4R) r1
            X.62P r0 = X.AnonymousClass62Q.A00(r12)
            X.JwG r2 = new X.JwG
            r2.<init>((X.AnonymousClass62P) r0)
            java.lang.Object r1 = r1.A02
            X.HLr r1 = (X.C54634HLr) r1
            r7 = 1
            X.0qQ.A0B(r1, r7)
            X.N4R r0 = new X.N4R
            r0.<init>((X.C61078JwG) r2, (X.C54634HLr) r1)
            boolean r0 = r10.AIY(r9, r0)
            if (r0 == 0) goto L_0x0369
            int r0 = r12.size()
            if (r0 >= r11) goto L_0x03cd
            X.4sa r0 = r5.BaP()
            java.lang.String r5 = r0.BP8()
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            r0 = 1174(0x496, float:1.645E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            java.lang.Class<X.5u5> r1 = X.C298815u5.class
            java.lang.Class<X.93W> r0 = X.AnonymousClass93W.class
            X.C51968G9o.A1J(r2, r1, r0, r5)
            X.1OC r2 = r2.A0M()
            r0 = 16
            A00(r2, r8, r0)
            r1 = 2097882485(0x7d0b2575, float:1.1559824E37)
            r0 = 2
            X.1ES.A05(r2, r1, r0, r7, r6)
        L_0x03c0:
            r0 = -656310844(0xffffffffd8e17dc4, float:-1.9834422E15)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1680641439(0xffffffff9bd37261, float:-3.4980937E-22)
        L_0x03c9:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x03cd:
            X.HLr r0 = X.C54634HLr.SUCCESS
            X.C54438HDp.A02(r0, r8)
            goto L_0x03c0
        L_0x03d3:
            r0 = -1754381491(0xffffffff976e434d, float:-7.6986893E-25)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.Gz1 r5 = (X.C54077Gz1) r5
            r0 = -1481185762(0xffffffffa7b6e61e, float:-5.076464E-15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            java.lang.Object r7 = r2.A01
            X.GcI r7 = (X.C52765GcI) r7
            X.2un r0 = r7.A0H
            java.lang.String r20 = "intentAwareAdPivotState"
            if (r0 == 0) goto L_0x04ca
            X.2pK r13 = r0.A0K
            int r14 = r7.A00
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L_0x03fd
            java.lang.String r20 = "categoryHashId"
            goto L_0x082d
        L_0x03fd:
            java.util.Set r0 = r7.A0J
            int r19 = r0.size()
            java.lang.String r12 = r7.A0B
            if (r12 != 0) goto L_0x040b
            java.lang.String r20 = "seedMediaId"
            goto L_0x082d
        L_0x040b:
            java.lang.String r3 = r7.A09
            if (r3 != 0) goto L_0x0413
            java.lang.String r20 = "seedAdTrackingToken"
            goto L_0x082d
        L_0x0413:
            int r11 = r7.A01
            java.lang.String r9 = r7.A08
            if (r9 != 0) goto L_0x041d
            java.lang.String r20 = "multiAdsUnitId"
            goto L_0x082d
        L_0x041d:
            java.util.List r0 = r5.A0B
            int r18 = r0.size()
            boolean r0 = r5.A0D
            r21 = r0
            com.instagram.feed.ui.state.IntentAwareAdPivotState r15 = r7.A02
            if (r15 == 0) goto L_0x082d
            java.lang.String r10 = r7.A07
            java.lang.Integer r17 = r5.A02()
            X.0wc r8 = r13.A01
            java.lang.String r0 = "instagram_contextual_ads_pagination_response"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r8, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x04ca
            X.C51971G9r.A17(r8, r14)
            java.lang.String r0 = r15.A0E
            X.C51965G9l.A1R(r8, r0)
            X.3kK r0 = r13.A04
            X.C51969G9p.A1B(r8, r0)
            java.lang.String r13 = ""
            java.lang.String r0 = "contextual_ads_category"
            r8.AAJ(r0, r13)
            int r0 = r2.length()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r15 = 0
            if (r0 == 0) goto L_0x05a1
            r13 = 0
        L_0x0461:
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            java.lang.String r0 = "category_hash_id"
            r8.A9F(r0, r2)
            java.lang.Long r2 = X.DbS.A0j(r19)
            java.lang.String r0 = "last_ad_index"
            r8.A9F(r0, r2)
            java.lang.Long r2 = X.DbS.A0j(r18)
            r0 = 344(0x158, float:4.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9F(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "more_ads_available"
            r8.A7p(r0, r2)
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0493
            long r15 = java.lang.Long.parseLong(r12)
        L_0x0493:
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "hscroll_seed_ad_id"
            r8.A9F(r0, r2)
            java.lang.String r2 = "feed_timeline"
            java.lang.String r0 = "container_module"
            java.lang.Long r2 = X.DbV.A0p(r8, r0, r2, r11)
            java.lang.String r0 = "multi_ads_type_number"
            r8.A9F(r0, r2)
            java.lang.String r0 = "multi_ads_unit_id"
            r8.AAJ(r0, r9)
            java.lang.String r2 = X.C241323Ot.A02(r10)
            java.lang.String r0 = "inventory_source"
            r8.AAJ(r0, r2)
            if (r17 == 0) goto L_0x059e
            java.lang.String r2 = X.C55034Hb5.A00(r17)
        L_0x04bd:
            java.lang.String r0 = "insertion_mechanism"
            r8.AAJ(r0, r2)
            java.lang.String r0 = "hscroll_seed_ad_tracking_token"
            r8.AAJ(r0, r3)
            r8.Cgf()
        L_0x04ca:
            X.GAQ r0 = r7.A0G
            X.2lW r10 = r0.A04
            java.lang.String r9 = r7.A0I
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r2 = "IS_EMPTY"
            java.util.List r0 = r5.A0B
            boolean r0 = r0.isEmpty()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = 0
            r10.A07(r8, r9, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r10.A01(r3, r8, r0, r9)
            r10.A02(r3, r8, r9)
            boolean r0 = X.C52765GcI.A03(r7)
            if (r0 == 0) goto L_0x0594
            java.lang.String r8 = r7.A05
            if (r8 == 0) goto L_0x0503
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r7.A02
            if (r0 == 0) goto L_0x082d
            java.util.Map r2 = r0.A0G
            boolean r0 = r5.A0D
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r8, r0)
        L_0x0503:
            java.util.List r0 = r5.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0524
            X.JRI r0 = r7.A0F
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r7 = r0
            r8 = r3
            r9 = r3
            r11 = r6
            r12 = r6
            r7.Dex(r8, r9, r10, r11, r12)
            r0 = -182936022(0xfffffffff5189e2a, float:-1.9346608E32)
        L_0x051c:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1150188464(0xffffffffbb718450, float:-0.0036852546)
            goto L_0x0936
        L_0x0524:
            java.util.List r0 = r5.A0B
            java.util.Iterator r5 = r0.iterator()
        L_0x052a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0564
            java.lang.Object r0 = r5.next()
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r3 = r0.getId()
            if (r3 == 0) goto L_0x05a7
            java.util.Set r2 = r7.A0J
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L_0x052a
            r2.add(r3)
            boolean r0 = X.C52765GcI.A03(r7)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r2 = r7.A02
            if (r0 == 0) goto L_0x055f
            if (r2 == 0) goto L_0x082d
            java.lang.String r0 = r7.A05
            java.util.List r0 = r2.A00(r0)
        L_0x055b:
            r0.add(r3)
            goto L_0x052a
        L_0x055f:
            if (r2 == 0) goto L_0x082d
            java.util.List r0 = r2.A0F
            goto L_0x055b
        L_0x0564:
            boolean r0 = X.C52765GcI.A03(r7)
            if (r0 == 0) goto L_0x058d
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r7.A02
            if (r0 == 0) goto L_0x082d
            java.util.Map r2 = r0.A07
            java.lang.String r0 = r7.A05
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x058d
            java.lang.String r3 = r7.A05
            if (r3 == 0) goto L_0x0589
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r7.A02
            if (r0 == 0) goto L_0x082d
            java.util.Map r2 = r0.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.put(r3, r0)
        L_0x0589:
            r0 = -553562595(0xffffffffdf014e1d, float:-9.317417E18)
            goto L_0x051c
        L_0x058d:
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r7.A02
            if (r0 == 0) goto L_0x082d
            r0.A0C = r6
            goto L_0x0589
        L_0x0594:
            com.instagram.feed.ui.state.IntentAwareAdPivotState r2 = r7.A02
            if (r2 == 0) goto L_0x082d
            boolean r0 = r5.A0D
            r2.A0D = r0
            goto L_0x0503
        L_0x059e:
            r2 = 0
            goto L_0x04bd
        L_0x05a1:
            long r13 = java.lang.Long.parseLong(r2)
            goto L_0x0461
        L_0x05a7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 104818915(0x63f68e3, float:3.6000166E-35)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x05b2:
            r0 = 15811881(0xf14529, float:2.2157165E-38)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.3JC r5 = (X.AnonymousClass3JC) r5
            r0 = 63246206(0x3c50f7e, float:1.1582176E-36)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r2 = r2.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            java.lang.Object r0 = r5.A01
            r2.resumeWith(r0)
            r0 = -629202319(0xffffffffda7f2271, float:-1.79534969E16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 2055288238(0x7a8135ae, float:3.3544752E35)
            goto L_0x0936
        L_0x05d6:
            r0 = -388391666(0xffffffffe8d99d0e, float:-8.2212054E24)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.9hV r5 = (X.C384549hV) r5
            r0 = -1486300292(0xffffffffa768db7c, float:-3.231545E-15)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r3 = r2.A01
            X.Gzk r3 = (X.C54115Gzk) r3
            java.util.Set r2 = r3.A03
            java.util.List r0 = r5.A00
            r2.addAll(r0)
            r0 = 1
            r3.A02 = r0
            r0 = -1225040950(0xffffffffb6fb5bca, float:-7.4910686E-6)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -950385619(0xffffffffc75a442d, float:-55876.176)
            goto L_0x0936
        L_0x05ff:
            r0 = 629686263(0x25883ff7, float:2.3635584E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r0 = 2125916956(0x7eb6eb1c, float:1.2157013E38)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r0 = r5.FH3()
            X.Gl0 r0 = (X.C53252Gl0) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r5 = r0.iterator()
        L_0x061b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0641
            java.lang.String r1 = X.AnonymousClass7TE.A18(r5)
            java.lang.Object r0 = r2.A01
            X.33f r0 = (X.C2363033f) r0
            X.2rR r3 = r0.A03
            int r1 = r3.BJU(r1)
            r0 = -1
            if (r1 != r0) goto L_0x063d
            r0 = 878091991(0x34569ed7, float:1.9988089E-7)
        L_0x0635:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 763611273(0x2d83c889, float:1.4982031E-11)
            goto L_0x07cc
        L_0x063d:
            r3.EDl(r1)
            goto L_0x061b
        L_0x0641:
            r0 = -357063788(0xffffffffeab7a394, float:-1.1100295E26)
            goto L_0x0635
        L_0x0645:
            r0 = 1146452715(0x44557aeb, float:853.9206)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.GyW r5 = (X.C54047GyW) r5
            r0 = 2037765131(0x7975d40b, float:7.977584E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            X.0qQ.A0B(r5, r9)
            X.GlD r0 = r5.A00
            if (r0 == 0) goto L_0x0828
            X.1Xj r5 = r0.A00
            if (r5 == 0) goto L_0x0679
            java.lang.Object r0 = r2.A01
            X.GxY r0 = (X.C53990GxY) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r6 = 0
            java.lang.String r8 = r5.getId()
            X.INp r4 = new X.INp
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A00(r4)
        L_0x0679:
            r0 = 1051566968(0x3eada378, float:0.3391378)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1586742026(0x5e93c30a, float:5.3236825E18)
            goto L_0x0936
        L_0x0684:
            r0 = 1150109677(0x448d47ed, float:1130.2477)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 458248580(0x1b505184, float:1.7231696E-22)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            X.H50.super.onSuccess(r5)
            java.lang.Object r2 = r2.A01
            X.IHg r2 = (X.C56911IHg) r2
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x06b8
            X.1Wj r5 = X.DcL.A00()
            androidx.fragment.app.FragmentActivity r4 = r2.A05
            com.instagram.common.session.UserSession r3 = r2.A0A
            X.1Xj r0 = r2.A0E
            java.lang.String r2 = r0.A30()
            if (r2 == 0) goto L_0x06c3
            java.lang.String r0 = "nua_target_id"
            java.util.HashMap r2 = X.DbY.A0m(r0, r2)
            java.lang.String r0 = "1453419422175275"
            r5.A00(r4, r3, r0, r2)
        L_0x06b8:
            r0 = -420889971(0xffffffffe6e9ba8d, float:-5.5187632E23)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1480743313(0xffffffffa7bda66f, float:-5.2638486E-15)
            goto L_0x0936
        L_0x06c3:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x06c8:
            r0 = -255902399(0xfffffffff0bf3d41, float:-4.734855E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Gyp r5 = (X.C54066Gyp) r5
            r0 = 614960247(0x24a78c77, float:7.266266E-17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            java.lang.Object r7 = r2.A01
            X.HmI r7 = (X.C55721HmI) r7
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x07dc
            java.util.Iterator r11 = r0.iterator()
        L_0x06ec:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0764
            java.lang.Object r1 = r11.next()
            X.Hkm r1 = (X.C55627Hkm) r1
            X.1Xj r9 = r1.A00
            if (r9 == 0) goto L_0x082b
            java.lang.String r10 = r9.C9L()
            X.3lZ r0 = X.C51966G9m.A0w(r9)
            if (r0 == 0) goto L_0x0712
            java.util.List r0 = r0.getCookies()
            if (r0 == 0) goto L_0x0712
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r8 != 0) goto L_0x0716
        L_0x0712:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of()
        L_0x0716:
            X.GV9 r2 = new X.GV9
            r2.<init>()
            r2.A0L = r9
            X.3lZ r0 = X.C51966G9m.A0w(r9)
            if (r0 == 0) goto L_0x0762
            java.lang.String r0 = r0.BKL()
        L_0x0727:
            r2.A0g = r0
            java.util.List r0 = r9.A3k()
            r2.A0q = r0
            if (r10 != 0) goto L_0x0733
            java.lang.String r10 = ""
        L_0x0733:
            r2.A0l = r10
            java.lang.String r0 = r9.A2S()
            r2.A0b = r0
            r2.A00 = r8
            java.lang.String r0 = r9.A2R()
            r2.A0Z = r0
            java.util.List r0 = r9.A3P()
            r2.A0m = r0
            X.1Xy r0 = r9.A0C
            java.lang.String r0 = r0.BMq()
            r2.A0h = r0
            X.2vo r1 = r1.A01
            X.2vm r0 = new X.2vm
            r0.<init>(r1)
            r2.A00 = r0
            X.GV8 r0 = r2.A01()
            r12.add(r0)
            goto L_0x06ec
        L_0x0762:
            r0 = 0
            goto L_0x0727
        L_0x0764:
            java.lang.Integer r0 = r5.A00
            if (r0 == 0) goto L_0x0798
            int r0 = r0.intValue()
        L_0x076c:
            r7.A00 = r0
            X.IY0 r2 = r7.A02
            int r13 = r5.mStatusCode
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A01
            long r14 = r14 - r0
            X.IY4 r5 = r2.A00
            X.2vI r10 = r5.A0B
            boolean r0 = r5.A05
            X.4LN r11 = X.AnonymousClass4LN.A0D
            r16 = r0
            r10.Ch2(r11, r12, r13, r14, r16)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r12.iterator()
        L_0x078e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x079c
            X.C51972G9s.A1G(r8, r1)
            goto L_0x078e
        L_0x0798:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x076c
        L_0x079c:
            android.content.Context r7 = r5.A08
            com.instagram.common.session.UserSession r1 = r5.A09
            X.4DU r9 = r5.A0A
            int r0 = r5.A00
            java.util.ArrayList r8 = X.C242613Ve.A01(r7, r9, r1, r8, r0)
            X.HrC r7 = r2.A01
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x07d0
            X.1y3 r1 = X.1y1.A00(r1)
            java.lang.String r0 = r9.getModuleName()
            r1.A06(r0, r8)
            r0 = 1
            r7.A04 = r0
        L_0x07bc:
            r5.A05 = r6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.Dlz(r0, r12)
            r0 = -1951099875(0xffffffff8bb4941d, float:-6.9556334E-32)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1430698064(0x5546b850, float:1.36559324E13)
        L_0x07cc:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x07d0:
            X.1y3 r1 = X.1y1.A00(r1)
            java.lang.String r0 = r9.getModuleName()
            r1.A05(r0, r8)
            goto L_0x07bc
        L_0x07dc:
            java.lang.String r20 = "injectedMedias"
            goto L_0x082d
        L_0x07df:
            r0 = -807133927(0xffffffffcfe41d19, float:-7.6542244E9)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.GyW r5 = (X.C54047GyW) r5
            r0 = -1251940682(0xffffffffb560e6b6, float:-8.378223E-7)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            X.GlD r0 = r5.A00
            if (r0 == 0) goto L_0x0828
            X.1Xj r6 = r0.A00
            if (r6 == 0) goto L_0x081b
            java.lang.Object r2 = r2.A01
            X.GxY r2 = (X.C53990GxY) r2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            r10 = 1
            X.1Xj r2 = r2.A01
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            if (r0 == 0) goto L_0x0826
            java.lang.String r7 = r0.getUrl()
        L_0x080e:
            r8 = 0
            java.lang.String r9 = r2.getId()
            X.INp r5 = new X.INp
            r5.<init>(r6, r7, r8, r9, r10)
            r3.A00(r5)
        L_0x081b:
            r0 = -2112274729(0xffffffff82193ed7, float:-1.1258699E-37)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1643658330(0x61f83c5a, float:5.7239266E20)
            goto L_0x0936
        L_0x0826:
            r7 = 0
            goto L_0x080e
        L_0x0828:
            java.lang.String r20 = "response"
            goto L_0x082d
        L_0x082b:
            java.lang.String r20 = "item"
        L_0x082d:
            X.0qQ.A0F(r20)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0835:
            r0 = 1872234917(0x6f9809a5, float:9.410676E28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r5 = (com.instagram.save.model.SavedCollection) r5
            r0 = -341730363(0xffffffffeba19bc5, float:-3.907453E26)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            r8 = 1
            r5.A0N = r8
            X.0eE r7 = X.AnonymousClass0t1.A01
            java.lang.Object r4 = r2.A01
            X.H1P r4 = (X.H1P) r4
            X.0eM r6 = r4.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.user.model.User r0 = r7.A01(r0)
            X.4Cl r2 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.EYC(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.user.model.User r2 = r7.A01(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            r2.A0d(r0)
            X.HqI r2 = r4.A07
            if (r2 == 0) goto L_0x0879
            com.instagram.common.typedurl.ImageUrl r0 = r5.A01
            r2.A00(r0, r5)
        L_0x0879:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.I33.A00(r4, r0, r5)
            X.0eM r0 = r4.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r0)
            java.lang.String r0 = r0.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r2 = X.0sr.A1L(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.I33.A02(r0, r4, r5, r2)
            r0 = -787281038(0xffffffffd1130b72, float:-3.9472013E10)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -2006851580(0xffffffff8861e004, float:-6.7971804E-34)
            goto L_0x0936
        L_0x08a6:
            r0 = -1260529437(0xffffffffb4ddd8e3, float:-4.1322264E-7)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.1XO r5 = (X.1XO) r5
            r0 = 1727178247(0x66f2a607, float:5.7293768E23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.util.List r0 = r5.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x08d1
            java.lang.Object r2 = r2.A01
            X.H1V r2 = (X.H1V) r2
            java.util.List r0 = r5.A06
            X.1Xj r0 = X.DbZ.A0T(r0, r3)
            r2.A00 = r0
            X.H1V.A00(r2)
        L_0x08d1:
            r0 = 1724213199(0x66c567cf, float:4.6611056E23)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 368868654(0x15fc7d2e, float:1.0197949E-25)
            goto L_0x0936
        L_0x08db:
            r0 = -991572914(0xffffffffc4e5cc4e, float:-1838.3845)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.1XO r5 = (X.1XO) r5
            r0 = 516405025(0x1ec7b721, float:2.1145685E-20)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            java.util.List r0 = r5.A06
            X.0qQ.A07(r0)
            java.lang.Object r3 = X.00k.A0J(r0)
            X.1Xj r3 = (X.1Xj) r3
            if (r3 == 0) goto L_0x0908
            java.lang.Object r0 = r2.A01
            X.0lg r0 = (X.0lg) r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            X.INh r0 = new X.INh
            r0.<init>(r3)
            r2.A00(r0)
        L_0x0908:
            r0 = -666690332(0xffffffffd8431ce4, float:-8.5811541E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1428669125(0x5527c2c5, float:1.15284357E13)
            goto L_0x0936
        L_0x0912:
            r0 = -986459058(0xffffffffc533d44e, float:-2877.269)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 636818919(0x25f515e7, float:4.2515567E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r2.A01
            X.IOo r3 = (X.C57100IOo) r3
            X.1OC r2 = r3.A00
            r0 = 0
            if (r2 == 0) goto L_0x092b
            r2.A00 = r0
        L_0x092b:
            r3.A00 = r0
            r0 = 532699592(0x1fc059c8, float:8.1463694E-20)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1681133378(0x64340f42, float:1.3286053E22)
        L_0x0936:
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H50.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.barcelona.feed.crossapp.contentprovider.ThreadsContentProvider$Impl, X.4Zn] */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        int i3;
        AnonymousClass4LE CGz;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1656738785);
                C8749R7n r7n = (C8749R7n) obj;
                int A0D = AnonymousClass7TG.A0D(r7n, -19716554);
                synchronized (C56490HzM.A03) {
                    C56490HzM.A01 = r7n;
                    C266604Zx r0 = C56490HzM.A00;
                    if (r0 != null) {
                        r0.A00.A00.getContext().getContentResolver().notifyChange(0cp.A03(AnonymousClass000.A00(2926)), (ContentObserver) null);
                    }
                }
                AnonymousClass0fD.A0A(-607046212, A0D);
                i2 = 967405924;
                break;
            case 1:
                int A03 = AnonymousClass0fD.A03(-414590617);
                AnonymousClass3JC r10 = (AnonymousClass3JC) obj;
                int A032 = AnonymousClass0fD.A03(-1196767005);
                0qQ.A0B(r10, 0);
                C229002mg r02 = (C229002mg) r10.A01;
                if (r02 == null || (CGz = r02.CGz()) == null) {
                    i3 = -416077815;
                } else {
                    String str = null;
                    if (CGz.CJx() && CGz.BJ1()) {
                        str = 1Az.A0A.toString();
                    } else if (CGz.C7A() != null) {
                        str = String.valueOf(CGz.C7A());
                    }
                    UserSession userSession = (UserSession) this.A01;
                    1Av A002 = 1Au.A00(userSession);
                    DbS.A1a(A002, str, A002.A0I, 1Av.A8a, 368);
                    0qQ.A0B(userSession, 0);
                    if (str != null && !str.equals(1Az.A07.toString()) && 182.A06(0Tu.A05, userSession, 36312879042856307L)) {
                        1PG A003 = 1PG.A00(userSession);
                        AnonymousClass1PA r1 = AnonymousClass1PA.A00;
                        if (A003.A02.containsKey(r1)) {
                            A003.A06(r1).A04();
                        }
                    }
                    i3 = -655588463;
                }
                AnonymousClass0fD.A0A(i3, A032);
                AnonymousClass0fD.A0A(181056541, A03);
                return;
            case 13:
                i = AnonymousClass0fD.A03(235844222);
                int A033 = AnonymousClass0fD.A03(2036331607);
                ((AnonymousClass540) this.A01).AVX("feed_parsing_test");
                AnonymousClass0fD.A0A(-463296096, A033);
                i2 = 1035874632;
                break;
            default:
                H50.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
