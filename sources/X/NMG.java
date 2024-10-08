package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class NMG extends 1P0 {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public NMG(C2366634p r2, C47523E6j e6j) {
        this.A01 = 3;
        this.A02 = r2;
        this.A03 = e6j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a7, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a2;
                case 4: goto L_0x006c;
                case 5: goto L_0x0173;
                case 6: goto L_0x0156;
                case 7: goto L_0x012a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1285877516(0x4ca4ef0c, float:8.64728E7)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            X.NMG.super.onFail(r7)
            java.lang.Object r1 = r6.A03
            X.OyI r1 = (X.C72197OyI) r1
            android.widget.Toast r0 = r1.A00
            if (r0 == 0) goto L_0x001a
            r0.cancel()
        L_0x001a:
            r0 = 0
            r1.A00 = r0
            X.NMJ r0 = r1.A04
            if (r0 == 0) goto L_0x0029
            X.NMJ.A00(r0)
            android.content.Context r0 = r0.A05
            X.OR9.A00(r0)
        L_0x0029:
            java.lang.Object r4 = r6.A02
            X.OVB r4 = (X.OVB) r4
            boolean r3 = r6.A00
            X.0wc r1 = r4.A00
            java.lang.String r0 = "instagram_waverly_ig_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "submit_error"
            X.OVB.A00(r2, r4, r0)
            java.lang.String r1 = "ig_message_settings"
            java.lang.String r0 = "step"
            java.lang.Boolean r1 = X.JTP.A0g(r2, r0, r1, r3)
            java.lang.String r0 = "attempted_toggle_value"
            r2.A7p(r0, r1)
            java.lang.String r1 = "v2"
            java.lang.String r0 = "message_controls_settings_version"
            r2.AAJ(r0, r1)
            java.lang.String r1 = X.C319126q5.A02(r7)
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r1)
            java.lang.String r1 = X.C319126q5.A01(r7)
            java.lang.String r0 = "error_identifier"
            r2.AAJ(r0, r1)
            r2.Cgf()
            r0 = 399371452(0x17cdecbc, float:1.3307575E-24)
        L_0x0068:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x006c:
            r0 = 954327426(0x38e1e182, float:1.077084E-4)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r6.A03
            X.GhV r4 = (X.C53039GhV) r4
            X.05G r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.GMQ r0 = (X.GMQ) r0
            java.lang.Object r0 = r0.A03
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r3 = X.00k.A0U(r0)
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            r3.removeAll(r0)
            boolean r2 = r6.A00
            if (r2 == 0) goto L_0x009f
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0094:
            int r0 = r0.size()
            X.C53039GhV.A03(r4, r1, r3, r0, r2)
            r0 = 1494075119(0x590dc6ef, float:2.49416884E15)
            goto L_0x0068
        L_0x009f:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0094
        L_0x00a2:
            r0 = -1906365276(0xffffffff8e5f2ca4, float:-2.7508366E-30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            r6.A00 = r0
            r0 = -1288259342(0xffffffffb336b8f2, float:-4.2543384E-8)
            goto L_0x0068
        L_0x00b0:
            r0 = -1244626110(0xffffffffb5d08342, float:-1.5535409E-6)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r6.A03
            X.P8c r0 = (X.C72493P8c) r0
            X.6ST r0 = r0.A01
            if (r0 == 0) goto L_0x00c2
            r0.dismiss()
        L_0x00c2:
            r0 = -258849049(0xfffffffff09246e7, float:-3.621642E29)
            goto L_0x0068
        L_0x00c6:
            r0 = 236690471(0xe1b9c27, float:1.918041E-30)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            X.NMG.super.onFail(r7)
            java.lang.Object r0 = r6.A03
            X.McN r0 = (X.C66777McN) r0
            X.Pux r0 = r0.A00
            if (r0 == 0) goto L_0x00db
            r0.CtL()
        L_0x00db:
            r0 = 1930357095(0x730ee967, float:1.1322634E31)
            goto L_0x0068
        L_0x00df:
            r0 = 54270014(0x33c183e, float:5.5276063E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r7, r4)
            java.lang.Object r0 = r7.A00()
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x00fe
            java.lang.String r2 = r0.getClientFacingErrorMessage()
            if (r2 != 0) goto L_0x0100
            java.lang.String r2 = r0.getErrorMessage()
            if (r2 != 0) goto L_0x0100
        L_0x00fe:
            java.lang.String r2 = ""
        L_0x0100:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0127
            java.lang.String r1 = "Failed to toggle TTLC"
        L_0x0106:
            java.lang.Object r0 = r6.A02
            android.content.Context r0 = (android.content.Context) r0
            X.8ab r3 = X.DbX.A0g(r0, r2, r1)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            X.8ae r1 = X.C358278ae.BLUE
            X.OfW r0 = X.C71205OfW.A00
            r3.A0R(r0, r1, r2)
            X.DbT.A1V(r3)
            java.lang.Object r0 = r6.A03
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r4)
            r0 = 1183957346(0x4691c162, float:18656.691)
            goto L_0x0068
        L_0x0127:
            java.lang.String r1 = "Cannot cutover this thread"
            goto L_0x0106
        L_0x012a:
            r0 = -1483569956(0xffffffffa79284dc, float:-4.0667187E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.NMG.super.onFail(r7)
            java.lang.Object r0 = r6.A03
            X.FF7 r0 = (X.FF7) r0
            androidx.fragment.app.Fragment r0 = r0.A02
            android.content.Context r2 = r0.requireContext()
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "spam_followers_setting_update_failed"
            X.C59689JTv.A00(r2, r1, r0, r4)
            r0 = -1308613310(0xffffffffb2002542, float:-7.459052E-9)
            goto L_0x01a7
        L_0x0156:
            r0 = -2075943775(0xffffffff84439ca1, float:-2.299406E-36)
            int r3 = X.AnonymousClass7TG.A0D(r7, r0)
            X.NMG.super.onFail(r7)
            boolean r0 = r6.A00
            r2 = r0 ^ 1
            java.lang.Object r1 = r6.A03
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            java.lang.Object r0 = r6.A02
            com.instagram.model.effect.AttributedAREffect r0 = (com.instagram.model.effect.AttributedAREffect) r0
            X.C309196Xh.A05(r1, r0, r2)
            r0 = 1953463723(0x746f7dab, float:7.5897693E31)
            goto L_0x01a7
        L_0x0173:
            r0 = 885157683(0x34c26f33, float:3.6216224E-7)
            int r3 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r1 = r6.A02
            X.VW6 r1 = (X.VW6) r1
            boolean r0 = r6.A00
            r0 = r0 ^ 1
            r1.A00 = r0
            java.lang.Object r2 = r6.A03
            X.VYK r2 = (X.VYK) r2
            java.lang.ref.WeakReference r0 = r2.A00
            X.0qQ.A0A(r0)
            java.lang.Object r0 = r0.get()
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            if (r0 == 0) goto L_0x019d
            X.TzX r1 = r0.mListAdapter
            r0 = -335352360(0xffffffffec02edd8, float:-6.331342E26)
            X.0fE.A00(r1, r0)
        L_0x019d:
            android.content.Context r0 = r2.A01
            if (r0 == 0) goto L_0x01ab
            X.C49952FGh.A02(r0, r7)
            r0 = 1566155305(0x5d59a229, float:9.8013387E17)
        L_0x01a7:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x01ab:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1443750832(0x560de3b0, float:3.9002262E13)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMG.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A01) {
            case 3:
                i = AnonymousClass0fD.A03(629205798);
                E9K e9k = ((C47523E6j) this.A03).A01;
                if (e9k != null) {
                    e9k.FK4();
                    boolean z = this.A00;
                    C2366634p r0 = (C2366634p) this.A02;
                    if (z) {
                        r0.A01();
                    } else {
                        r0.A05();
                    }
                    i2 = 1423840032;
                    break;
                } else {
                    0qQ.A0F("explorePeopleAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 5:
                i = AnonymousClass0fD.A03(730649724);
                i2 = -145423907;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-368204069);
                ((View) this.A02).setEnabled(true);
                i2 = 1804934665;
                break;
            case 8:
                i = AnonymousClass0fD.A03(1547834074);
                NMG.super.onFinish();
                ((C72197OyI) this.A03).A02 = null;
                i2 = 87219974;
                break;
            default:
                NMG.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        Object value;
        GMQ gmq;
        switch (this.A01) {
            case 3:
                i = AnonymousClass0fD.A03(916870229);
                ((C2366634p) this.A02).A04();
                i2 = 671536682;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-1038926764);
                boolean z = this.A00;
                if (z) {
                    ((C53039GhV) this.A03).A00 += DbS.A05(this.A02);
                }
                05G r4 = ((C53039GhV) this.A03).A04;
                ArrayList A0U = 00k.A0U((Collection) ((GMQ) r4.getValue()).A03);
                List list = (List) this.A02;
                A0U.addAll(list);
                do {
                    value = r4.getValue();
                    gmq = (GMQ) value;
                } while (!r4.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, (Integer) null, 00k.A0T(new PG1(list, z), (Collection) gmq.A02), 0sn.A00, A0U, 0Yt.A0E(), 49)));
                i2 = -876610158;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1695426652);
                i2 = -1819328107;
                break;
            default:
                NMG.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0261, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0264, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028c, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            r6 = r18
            int r0 = r6.A01
            switch(r0) {
                case 1: goto L_0x0218;
                case 2: goto L_0x010c;
                case 3: goto L_0x0009;
                case 4: goto L_0x015a;
                case 5: goto L_0x0275;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00b6;
                case 8: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.NMG.super.onSuccess(r1)
            return
        L_0x000d:
            r0 = 2114369809(0x7e06b911, float:4.476937E37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.NHA r1 = (X.NHA) r1
            r0 = 906428603(0x360700bb, float:2.0116993E-6)
            int r7 = X.AnonymousClass7TG.A0D(r1, r0)
            X.NMG.super.onSuccess(r1)
            boolean r8 = r1.A01
            if (r8 == 0) goto L_0x0066
            java.lang.Boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0066
            java.lang.Object r2 = r6.A02
            X.OVB r2 = (X.OVB) r2
            boolean r0 = r6.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "submit_error"
            r2.A01(r0, r1)
            r8 = 0
        L_0x0038:
            java.lang.Object r1 = r6.A03
            X.OyI r1 = (X.C72197OyI) r1
            android.widget.Toast r0 = r1.A00
            if (r0 == 0) goto L_0x0043
            r0.cancel()
        L_0x0043:
            r0 = 0
            r1.A00 = r0
            X.NMJ r1 = r1.A04
            if (r1 == 0) goto L_0x005b
            r0 = 1
            r1.A02 = r0
            r1.A04 = r8
            if (r8 != 0) goto L_0x0056
            android.content.Context r0 = r1.A05
            X.OR9.A00(r0)
        L_0x0056:
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = r1.A0E
            r0.A00()
        L_0x005b:
            r0 = -1510345583(0xffffffffa5f9f491, float:-4.336034E-16)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1303959280(0x4db8d6f0, float:3.87636736E8)
            goto L_0x0261
        L_0x0066:
            java.lang.Object r9 = r6.A02
            X.OVB r9 = (X.OVB) r9
            java.lang.Boolean r4 = r1.A00
            X.0wc r2 = r9.A00
            java.lang.String r0 = "instagram_waverly_ig_event"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = "submit"
            X.OVB.A00(r3, r9, r0)
            java.lang.String r2 = "ig_message_settings"
            java.lang.String r0 = "step"
            java.lang.Boolean r2 = X.JTP.A0g(r3, r0, r2, r8)
            java.lang.String r0 = "eligible_ig_dm_toggle"
            r3.A7p(r0, r2)
            java.lang.String r0 = "source_of_truth_toggle_value"
            r3.A7p(r0, r4)
            java.lang.String r2 = "v2"
            java.lang.String r0 = "message_controls_settings_version"
            r3.AAJ(r0, r2)
            r3.Cgf()
            if (r8 == 0) goto L_0x0038
            java.lang.Object r0 = r6.A03
            X.OyI r0 = (X.C72197OyI) r0
            X.1Av r4 = r0.A06
            java.lang.Boolean r3 = r1.A00
            if (r3 == 0) goto L_0x00ab
            X.0s0 r2 = r4.A6J
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 264(0x108, float:3.7E-43)
            X.DbS.A1a(r4, r3, r2, r1, r0)
            goto L_0x0038
        L_0x00ab:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 907798829(0x361be92d, float:2.3232526E-6)
            X.AnonymousClass0fD.A0A(r0, r7)
            throw r1
        L_0x00b6:
            r0 = -1661419197(0xffffffff9cf8c143, float:-1.646122E-21)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -410907119(0xffffffffe7820e11, float:-1.2283342E24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r6.A03
            X.FF7 r0 = (X.FF7) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            boolean r0 = r6.A00
            com.instagram.user.model.User r3 = X.DbT.A0j(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.By1()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00e5
            X.4Cl r0 = r3.A03
            r0.Elg(r1)
        L_0x00e5:
            r0 = 1623629080(0x60c69d18, float:1.1449297E20)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -42236524(0xfffffffffd7b8594, float:-2.0895613E37)
            goto L_0x028c
        L_0x00f0:
            r0 = 2033041103(0x792dbecf, float:5.638359E34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1245193692(0x4a3825dc, float:3017079.0)
            int r3 = X.AnonymousClass7TG.A0D(r1, r0)
            X.NMG.super.onSuccess(r1)
            r0 = -1244614237(0xffffffffb5d0b1a3, float:-1.5548907E-6)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -863909763(0xffffffffcc81c87d, float:-6.8043752E7)
            goto L_0x028c
        L_0x010c:
            r0 = 769035659(0x2dd68d8b, float:2.4391841E-11)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.NH2 r1 = (X.NH2) r1
            r0 = 1729043701(0x670f1cf5, float:6.758326E23)
            int r5 = X.AnonymousClass7TG.A0D(r1, r0)
            X.1Xj r1 = r1.A00
            java.lang.Object r4 = r6.A03
            X.P8c r4 = (X.C72493P8c) r4
            if (r1 != 0) goto L_0x0136
            X.6ST r0 = r4.A01
            if (r0 == 0) goto L_0x012b
            r0.dismiss()
        L_0x012b:
            r0 = 1308078570(0x4df7b1ea, float:5.19454016E8)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1840460050(0xffffffff924cceee, float:-6.462611E-28)
            goto L_0x028c
        L_0x0136:
            com.instagram.common.session.UserSession r0 = r4.A08
            X.1E8 r0 = X.1E7.A00(r0)
            r0.A03(r1)
            java.lang.String r3 = r1.getId()
            if (r3 == 0) goto L_0x014f
            java.lang.Object r1 = r6.A02
            X.3t0 r1 = (X.C254763t0) r1
            boolean r0 = r6.A00
            X.C72493P8c.A00(r4, r1, r3, r0)
            goto L_0x012b
        L_0x014f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1943764063(0x73db7c5f, float:3.4778917E31)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x015a:
            r0 = 1506364329(0x59c94ba9, float:7.0824574E15)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.GyW r1 = (X.C54047GyW) r1
            r0 = 1978366023(0x75eb7847, float:5.9698695E32)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            X.GlD r0 = r1.A00
            if (r0 == 0) goto L_0x0210
            java.lang.String r11 = r0.A01
            r9 = 0
            if (r11 == 0) goto L_0x01ae
            boolean r0 = X.00l.A0W(r11)
            if (r0 != 0) goto L_0x01ae
            java.lang.Object r8 = r6.A03
            X.GhV r8 = (X.C53039GhV) r8
            X.05G r0 = r8.A04
            java.lang.Object r0 = r0.getValue()
            X.GMQ r0 = (X.GMQ) r0
            java.lang.Object r0 = r0.A03
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = X.00k.A0U(r0)
            X.GlD r0 = r1.A00
            if (r0 == 0) goto L_0x0210
            java.util.List r5 = r0.A02
            if (r5 == 0) goto L_0x01e2
            java.util.Iterator r10 = r5.iterator()
        L_0x0199:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.String r3 = X.AnonymousClass7TE.A18(r10)
            r1 = 31
            X.MYK r0 = new X.MYK
            r0.<init>(r3, r1)
            X.018.A1A(r7, r0)
            goto L_0x0199
        L_0x01ae:
            java.lang.Object r0 = r6.A03
            X.GhV r0 = (X.C53039GhV) r0
            X.05G r8 = r0.A04
            java.lang.Object r7 = r6.A02
            java.util.List r7 = (java.util.List) r7
            boolean r5 = r6.A00
        L_0x01ba:
            java.lang.Object r3 = r8.getValue()
            r9 = r3
            X.GMQ r9 = (X.GMQ) r9
            r10 = 0
            java.lang.Object r1 = r9.A02
            java.util.Collection r1 = (java.util.Collection) r1
            X.PG0 r0 = new X.PG0
            r0.<init>(r7, r5)
            java.util.ArrayList r13 = X.00k.A0T(r0, r1)
            r17 = 125(0x7d, float:1.75E-43)
            r11 = r10
            r12 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            X.GMQ r0 = X.GMQ.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r8.AIY(r3, r0)
            if (r0 == 0) goto L_0x01ba
            goto L_0x01f7
        L_0x01e2:
            java.lang.String r0 = "delete pending media fails"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0202
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x01ec:
            boolean r0 = r6.A00
            if (r5 == 0) goto L_0x01f4
            int r9 = r5.size()
        L_0x01f4:
            X.C53039GhV.A03(r8, r1, r7, r9, r0)
        L_0x01f7:
            r0 = -966286175(0xffffffffc667a4a1, float:-14825.157)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 939864989(0x3805339d, float:3.175774E-5)
            goto L_0x028c
        L_0x0202:
            java.lang.String r0 = "Cannot accept more than max number of subposts."
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x020d
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x01ec
        L_0x020d:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x01ec
        L_0x0210:
            X.C41845B3m.A0v()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0218:
            r0 = 1519478780(0x5a9167fc, float:2.04641018E16)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.MpS r1 = (X.C67533MpS) r1
            r0 = 1046879298(0x3e661c42, float:0.22471717)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            X.NMG.super.onSuccess(r1)
            java.lang.Object r3 = r6.A03
            X.McN r3 = (X.C66777McN) r3
            java.lang.String r0 = r1.A00
            r3.A01 = r0
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0265
            java.util.Map r1 = r3.A07
            java.lang.Object r0 = r6.A02
            X.Mq3 r0 = (X.C67569Mq3) r0
            java.lang.String r0 = r0.A00()
            X.C66580MXl.A1S(r1, r0)
        L_0x0244:
            X.C66777McN.A00(r3)
            X.Pux r0 = r3.A00
            if (r0 == 0) goto L_0x024e
            r0.CtV()
        L_0x024e:
            X.1Ng r1 = r3.A04
            X.MqH r0 = new X.MqH
            r0.<init>()
            r1.A00(r0)
            r0 = -1434902979(0xffffffffaa791e3d, float:-2.2126134E-13)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1724621875(0x66cba433, float:4.8083467E23)
        L_0x0261:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0265:
            java.lang.Object r2 = r6.A02
            X.Mq3 r2 = (X.C67569Mq3) r2
            java.lang.String r1 = r2.A00()
            if (r1 == 0) goto L_0x0244
            java.util.Map r0 = r3.A07
            r0.put(r1, r2)
            goto L_0x0244
        L_0x0275:
            r0 = 1622515912(0x60b5a0c8, float:1.0470144E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1921703709(0x728adf1d, float:5.5012683E30)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -244561376(0xfffffffff16c4a20, float:-1.1700492E30)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 2089277958(0x7c87da06, float:5.643057E36)
        L_0x028c:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMG.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        if (this.A01 != 0) {
            NMG.super.onSuccessInBackground(obj);
            return;
        }
        int A032 = AnonymousClass0fD.A03(-166723021);
        int A033 = AnonymousClass0fD.A03(337731385);
        AnonymousClass7TF.A0D().postDelayed(new PV0((0sP) this.A03), 500);
        AnonymousClass0fD.A0A(-1662275730, A033);
        AnonymousClass0fD.A0A(1902511658, A032);
    }

    public NMG(int i, Object obj, Object obj2, boolean z) {
        this.A01 = i;
        this.A03 = obj2;
        this.A00 = z;
        this.A02 = obj;
    }
}
