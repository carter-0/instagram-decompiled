package X;

import android.view.View;

public final class LY5 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LY5 A00(Object obj, int i) {
        return new LY5(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY5(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [com.instagram.modal.ModalActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r8v13, types: [X.07Z, java.lang.Object, X.K6D] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x07d0, code lost:
        r5 = "liveVisibilityMode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0a4b, code lost:
        r5 = "viewBinder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0abf, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0ac6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0dbb, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0dbe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0e24, code lost:
        if (r3 != 1) goto L_0x0e26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0f1a, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0f1d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0b51;
                case 2: goto L_0x0b3c;
                case 3: goto L_0x0b27;
                case 4: goto L_0x0eff;
                case 5: goto L_0x0edf;
                case 6: goto L_0x0b14;
                case 7: goto L_0x0aef;
                case 8: goto L_0x012c;
                case 9: goto L_0x0b64;
                case 10: goto L_0x0109;
                case 11: goto L_0x00f2;
                case 12: goto L_0x0e71;
                case 13: goto L_0x0e4a;
                case 14: goto L_0x0d96;
                case 15: goto L_0x0ad9;
                case 16: goto L_0x0aae;
                case 17: goto L_0x0042;
                case 18: goto L_0x0a99;
                case 19: goto L_0x0a7d;
                case 20: goto L_0x0a6a;
                case 21: goto L_0x00b5;
                case 22: goto L_0x0a4e;
                case 23: goto L_0x0a11;
                case 24: goto L_0x09fe;
                case 25: goto L_0x09c8;
                case 26: goto L_0x096b;
                case 27: goto L_0x0956;
                case 28: goto L_0x0897;
                case 29: goto L_0x0827;
                case 30: goto L_0x07d4;
                case 31: goto L_0x0769;
                case 32: goto L_0x0d36;
                case 33: goto L_0x0711;
                case 34: goto L_0x06df;
                case 35: goto L_0x06b4;
                case 36: goto L_0x0682;
                case 37: goto L_0x05b0;
                case 38: goto L_0x059f;
                case 39: goto L_0x0588;
                case 40: goto L_0x0c83;
                case 41: goto L_0x056b;
                case 42: goto L_0x054c;
                case 43: goto L_0x052d;
                case 44: goto L_0x0bcc;
                case 45: goto L_0x050e;
                case 46: goto L_0x04f9;
                case 47: goto L_0x04e4;
                case 48: goto L_0x04c5;
                case 49: goto L_0x04a6;
                case 50: goto L_0x0b7a;
                case 51: goto L_0x047d;
                case 52: goto L_0x0454;
                case 53: goto L_0x0441;
                case 54: goto L_0x03d3;
                case 55: goto L_0x03b0;
                case 56: goto L_0x0391;
                case 57: goto L_0x0343;
                case 58: goto L_0x0324;
                case 59: goto L_0x0313;
                case 60: goto L_0x02d2;
                case 61: goto L_0x02b4;
                case 62: goto L_0x0295;
                case 63: goto L_0x0276;
                case 64: goto L_0x0265;
                case 65: goto L_0x0246;
                case 66: goto L_0x0227;
                case 67: goto L_0x0214;
                case 68: goto L_0x01e9;
                case 69: goto L_0x01cb;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1567210877(0x5d69bd7d, float:1.05267223E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Lm4 r2 = (X.C65026Lm4) r2
            X.0eM r1 = r2.A09
            java.lang.Object r3 = r1.getValue()
            X.Jgr r3 = (X.C60172Jgr) r3
            X.0eM r1 = r2.A07
            java.lang.Object r1 = r1.getValue()
            X.8O4 r1 = (X.AnonymousClass8O4) r1
            boolean r4 = r1.CJj()
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 7
            X.MG2.A01(r3, r2, r1)
            X.LES r3 = r3.A00
            r2 = 0
            X.05G r1 = r3.A0F
            X.AnonymousClass7TF.A1O(r1, r2)
            X.05G r1 = r3.A09
            X.AnonymousClass7TF.A1O(r1, r4)
            r1 = -11887131(0xffffffffff4a9de5, float:-2.693239E38)
        L_0x003e:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0042:
            r0 = 830943591(0x31873167, float:3.9346335E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LO9 r0 = (X.LO9) r0
            X.K6D r8 = r0.A02
            X.JuA r4 = r8.A03
            if (r4 == 0) goto L_0x00b1
            com.instagram.user.model.UpcomingEvent r7 = r4.A01
            if (r7 == 0) goto L_0x00a1
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = X.K6D.A08
            long r4 = r4 + r0
            long r1 = X.C18810W3l.A02(r7)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            X.LO9 r0 = r8.A04
            if (r0 == 0) goto L_0x0a4b
            android.content.Context r1 = r0.A01
            X.8ab r2 = X.DbS.A0Y(r1)
            r0 = 2131971945(0x7f134f69, float:1.9580884E38)
            r2.A09(r0)
            r0 = 2131971944(0x7f134f68, float:1.9580882E38)
            r2.A08(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.LUy r0 = X.C64234LUy.A00
            r2.A0c(r0, r1)
            X.DbT.A1V(r2)
        L_0x008b:
            r0 = -1760187694(0xffffffff9715aad2, float:-4.83601E-25)
            goto L_0x0f1a
        L_0x0090:
            X.JuA r6 = r8.A03
            r9 = 0
            if (r6 == 0) goto L_0x00b1
            X.0xx r1 = X.DbW.A0E(r8)
            r10 = 27
            X.JaL r5 = new X.JaL
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x00ad
        L_0x00a1:
            r2 = 0
            X.0xx r1 = X.DbW.A0E(r8)
            r0 = 8
            X.MGD r5 = new X.MGD
            r5.<init>(r4, r8, r2, r0)
        L_0x00ad:
            X.AnonymousClass7TE.A1Z(r5, r1)
            goto L_0x008b
        L_0x00b1:
            java.lang.String r5 = "viewState"
            goto L_0x0abf
        L_0x00b5:
            r0 = 1695249084(0x650b72bc, float:4.115784E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LO9 r0 = (X.LO9) r0
            X.K6D r4 = r0.A02
            X.JuA r0 = r4.A03
            java.lang.String r5 = "viewState"
            if (r0 == 0) goto L_0x0abf
            r9 = 0
            com.instagram.user.model.UpcomingEvent r7 = r0.A01
            X.Khz r6 = r0.A00
            java.lang.String r8 = r0.A02
            java.util.Date r10 = r0.A03
            boolean r11 = r0.A05
            boolean r12 = r0.A06
            X.AnonymousClass7TG.A1O(r6, r8)
            X.JuA r5 = new X.JuA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.A03 = r5
            X.LO9 r2 = r4.A04
            if (r2 == 0) goto L_0x0a4b
            java.util.Date r1 = r5.A04
            java.util.Date r0 = r5.A03
            r2.A01(r1, r0)
            X.LBP r0 = r4.A02
            if (r0 != 0) goto L_0x0b70
            java.lang.String r5 = "viewHolder"
            goto L_0x0abf
        L_0x00f2:
            r0 = -2087957650(0xffffffff838c4b6e, float:-8.245778E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LOJ r0 = (X.LOJ) r0
            X.MVV r0 = r0.A00
            if (r0 == 0) goto L_0x0104
            r0.onBackPressed()
        L_0x0104:
            r0 = 1447576281(0x564842d9, float:5.5047359E13)
            goto L_0x01c0
        L_0x0109:
            r0 = -1689424425(0xffffffff9b4d6dd7, float:-1.6992694E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LPF r0 = (X.LPF) r0
            X.MVI r1 = r0.A08
            if (r1 == 0) goto L_0x0125
            X.LGD r0 = r0.A07
            android.widget.ToggleButton r0 = r0.A0B
            if (r0 == 0) goto L_0x012a
            boolean r0 = r0.isChecked()
        L_0x0122:
            r1.DIn(r0)
        L_0x0125:
            r0 = -1090014905(0xffffffffbf07b147, float:-0.5300488)
            goto L_0x01c0
        L_0x012a:
            r0 = 0
            goto L_0x0122
        L_0x012c:
            r0 = -185499164(0xfffffffff4f181e4, float:-1.5307349E32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K4a r3 = (X.C61358K4a) r3
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r0 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0
            X.LSk r5 = r0.A03
            java.lang.String r9 = r0.A06
            java.lang.String r1 = r0.A07
            X.Dbv r0 = r0.A00
            X.Jqu r4 = X.LSk.A01(r0, r1)
            java.lang.String r6 = "user"
            r0 = 3762(0xeb2, float:5.272E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = "tap_close"
            X.LSk.A02(r4, r5, r6, r7, r8, r9)
            X.DbZ.A17(r3)
            r0 = -1995184855(0xffffffff8913e529, float:-1.7802232E-33)
            goto L_0x01c0
        L_0x015f:
            r0 = 418704466(0x18f4ec52, float:6.3311144E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            com.instagram.tagging.activity.TaggingActivity r7 = (com.instagram.tagging.activity.TaggingActivity) r7
            X.Kj1 r1 = r7.A0H
            if (r1 != 0) goto L_0x0172
            java.lang.String r5 = "tagType"
            goto L_0x0abf
        L_0x0172:
            X.Kj1 r0 = X.C62630Kj1.PRODUCT
            if (r1 == r0) goto L_0x01bd
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0S(r7)
            if (r0 == 0) goto L_0x01ae
            X.JbO r6 = r7.A06
            if (r6 != 0) goto L_0x0184
            java.lang.String r5 = "creationLogger"
            goto L_0x0abf
        L_0x0184:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x01c8
            java.lang.String r5 = "edit_media_info"
        L_0x018a:
            r4 = 1
            X.0wc r1 = r6.A04
            java.lang.String r0 = "instagram_shopping_product_tagging_tab_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "prior_module"
            java.lang.String r1 = X.C59899JbO.A02(r3, r6, r0, r5)
            java.lang.String r0 = "session_instance_id"
            java.lang.String r1 = X.C59899JbO.A02(r3, r6, r0, r1)
            java.lang.String r0 = "waterfall_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "feed_sharing"
            java.lang.String r0 = "usage"
            r3.AAJ(r0, r1)
            X.JTU.A12(r3, r4)
        L_0x01ae:
            X.LPD r1 = r7.A0C
            java.lang.String r5 = "merchantTaggingStatusHelper"
            if (r1 == 0) goto L_0x0abf
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x01c4
            r1.A03()
        L_0x01bd:
            r0 = 1333122040(0x4f75d3f8, float:4.1243095E9)
        L_0x01c0:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x01c4:
            r1.A01()
            goto L_0x01bd
        L_0x01c8:
            java.lang.String r5 = "followers_share"
            goto L_0x018a
        L_0x01cb:
            r0 = -433298126(0xffffffffe62c6532, float:-2.0352844E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K5O r1 = (X.K5O) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 3
            X.MG2.A01(r3, r2, r1)
            r1 = 1946638092(0x7407570c, float:4.2890967E31)
            goto L_0x003e
        L_0x01e9:
            r0 = -1558483679(0xffffffffa31b6d21, float:-8.425676E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K5O r2 = (X.K5O) r2
            X.0eM r1 = r2.A01
            java.lang.Object r4 = r1.getValue()
            X.LDK r4 = (X.LDK) r4
            android.os.Bundle r3 = r2.requireArguments()
            java.lang.Class<com.instagram.user.model.UpcomingEvent> r2 = com.instagram.user.model.UpcomingEvent.class
            java.lang.String r1 = "upcoming_live"
            android.os.Parcelable r3 = X.C320236s2.A00(r3, r2, r1)
            com.instagram.user.model.UpcomingEvent r3 = (com.instagram.user.model.UpcomingEvent) r3
            r2 = 0
            r1 = 1
            r4.A00(r3, r2, r1)
            r1 = 1842856935(0x6dd7c3e7, float:8.3470136E27)
            goto L_0x003e
        L_0x0214:
            r0 = -1787095667(0xffffffff957b158d, float:-5.0706047E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K5O r1 = (X.K5O) r1
            r1.onBackPressed()
            r1 = -270418125(0xffffffffefe1bf33, float:-1.3973055E29)
            goto L_0x003e
        L_0x0227:
            r0 = 671601870(0x2807d4ce, float:7.54015E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K43 r1 = (X.K43) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 49
            X.MGU.A02(r3, r2, r1)
            r1 = -1451675324(0xffffffffa9793144, float:-5.5331838E-14)
            goto L_0x003e
        L_0x0246:
            r0 = -1036469801(0xffffffffc238b9d7, float:-46.181484)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K43 r1 = (X.K43) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 49
            X.MGU.A02(r3, r2, r1)
            r1 = -295547111(0xffffffffee624f19, float:-1.7509809E28)
            goto L_0x003e
        L_0x0265:
            r0 = 1593174478(0x5ef5e9ce, float:8.8599604E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 41542993(0x279e551, float:1.8359441E-37)
            goto L_0x003e
        L_0x0276:
            r0 = -791752912(0xffffffffd0cecf30, float:-2.77574779E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.Jic r1 = (X.C60281Jic) r1
            X.05G r2 = r1.A0F
            X.3NV r1 = X.AnonymousClass3NV.A08
            r2.Epw(r1)
            r1 = -278389390(0xffffffffef681d72, float:-7.183612E28)
            goto L_0x003e
        L_0x0295:
            r0 = 2092495341(0x7cb8f1ed, float:7.6823157E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 43
            X.MGU.A02(r3, r2, r1)
            r1 = 944977271(0x38533577, float:5.0356113E-5)
            goto L_0x003e
        L_0x02b4:
            r0 = 791585185(0x2f2ea1a1, float:1.588263E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.Jic r1 = (X.C60281Jic) r1
            X.05G r2 = r1.A0D
            r1 = 0
            r2.Epw(r1)
            r1 = -1365185784(0xffffffffaea0eb08, float:-7.3177076E-11)
            goto L_0x003e
        L_0x02d2:
            r0 = -783675225(0xffffffffd14a10a7, float:-5.4241423E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            java.lang.Object r3 = r1.getValue()
            X.Jic r3 = (X.C60281Jic) r3
            X.6oS r2 = X.C318116oQ.A00(r3)
            r5 = 0
            r1 = 48
            X.MGU.A02(r3, r2, r1)
            X.LMy r4 = r3.A06
            X.0eM r1 = r4.A05
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "upcoming_event_creation_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "tap_start_time"
            X.DbS.A1J(r3, r1)
            java.lang.String r2 = r4.A03
            java.lang.String r1 = "prior_module"
            r3.AAJ(r1, r2)
            X.C64104LMy.A00(r3, r4, r5)
            r1 = 1869119050(0x6f687e4a, float:7.1953196E28)
            goto L_0x003e
        L_0x0313:
            r0 = -191173235(0xfffffffff49aed8d, float:-9.819724E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -1352909824(0xffffffffaf5c3c00, float:-2.00302E-10)
            goto L_0x003e
        L_0x0324:
            r0 = -978930379(0xffffffffc5a6b535, float:-5334.651)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 47
            X.MGU.A02(r3, r2, r1)
            r1 = 1298214959(0x4d61302f, float:2.3612696E8)
            goto L_0x003e
        L_0x0343:
            r0 = 8780929(0x85fc81, float:1.2304702E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6B r1 = (X.K6B) r1
            X.0eM r1 = r1.A02
            java.lang.Object r7 = r1.getValue()
            X.Jic r7 = (X.C60281Jic) r7
            X.05G r1 = r7.A0D
            java.lang.Object r6 = r1.getValue()
            if (r6 == 0) goto L_0x038c
            X.LMy r5 = r7.A06
            X.0eM r1 = r5.A05
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "upcoming_event_creation_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "schedule_live"
            X.DbS.A1J(r3, r1)
            java.lang.String r2 = r5.A03
            java.lang.String r1 = "prior_module"
            r3.AAJ(r1, r2)
            r4 = 0
            X.C64104LMy.A00(r3, r5, r4)
            X.6oS r3 = X.C318116oQ.A00(r7)
            r2 = 46
            X.MHL r1 = new X.MHL
            r1.<init>((java.lang.Object) r7, (java.lang.Object) r6, (X.AnonymousClass4D7) r4, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r3)
        L_0x038c:
            r1 = -543012497(0xffffffffdfa2496f, float:-2.3388E19)
            goto L_0x003e
        L_0x0391:
            r0 = 710062652(0x2a52b23c, float:1.8713584E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lgj r1 = (X.C64710Lgj) r1
            X.0eM r1 = r1.A0V
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 36
            X.MGU.A02(r3, r2, r1)
            r1 = -1472693430(0xffffffffa8387b4a, float:-1.0240786E-14)
            goto L_0x003e
        L_0x03b0:
            r0 = 1674609006(0x63d0816e, float:7.6924983E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lgj r1 = (X.C64710Lgj) r1
            X.JjF r3 = X.C64710Lgj.A00(r1)
            X.LEQ r1 = r3.A00
            java.lang.String r2 = r3.A01
            X.05G r1 = r1.A09
            X.6oS r2 = X.JTP.A0K(r3, r2, r1)
            r1 = 35
            X.MGU.A02(r3, r2, r1)
            r1 = -513989573(0xffffffffe15d243b, float:-2.5495882E20)
            goto L_0x003e
        L_0x03d3:
            r0 = 1121967952(0x42dfdf50, float:111.93616)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A01
            X.Kcu r9 = (X.C62260Kcu) r9
            r8 = 1
            X.0eM r1 = r9.A0E
            java.lang.Object r3 = r1.getValue()
            X.Jhd r3 = (X.C60220Jhd) r3
            X.M0X r2 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0U
            X.M0X.A0A(r2, r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r7 = 0
            r1 = 19
            X.MGU.A02(r3, r2, r1)
            X.0eM r1 = r9.A0C
            X.6gx r6 = X.DbZ.A0R(r1)
            java.lang.String r5 = r9.A07
            X.3NV r1 = r9.A02
            if (r1 == 0) goto L_0x07d0
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r9.A09
            X.0qQ.A0B(r4, r8)
            X.1Ln r3 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x043c
            X.DbW.A17(r3, r6)
            java.lang.String r1 = "share_bc_live_as_reel_sheet_rendered"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "share_button"
            r3.A0p(r1)
            java.lang.String r1 = "live_stream_ended_view"
            X.JTS.A1G(r3, r1, r2)
            X.JTT.A1F(r3, r6, r7)
            java.lang.String r1 = "live_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = "audience"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r1, r4, r2)
            r3.A0w(r1)
            r3.Cgf()
        L_0x043c:
            r1 = -824646619(0xffffffffced8e425, float:-1.81941517E9)
            goto L_0x003e
        L_0x0441:
            r0 = -987737962(0xffffffffc5205096, float:-2565.0366)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = -1263664367(0xffffffffb4ae0311, float:-3.2412257E-7)
            goto L_0x003e
        L_0x0454:
            r0 = -1638727411(0xffffffff9e53010d, float:-1.1170464E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LGN r1 = (X.LGN) r1
            X.Ji1 r3 = r1.A01()
            boolean r1 = r3 instanceof com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel
            if (r1 == 0) goto L_0x0478
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r3 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r3
            if (r3 == 0) goto L_0x0478
            X.4Co r1 = r3.A00
            X.C51970G9q.A1S(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 6
            X.MGU.A02(r3, r2, r1)
        L_0x0478:
            r1 = -1032909489(0xffffffffc26f0d4f, float:-59.762997)
            goto L_0x003e
        L_0x047d:
            r0 = 1190975690(0x46fcd8ca, float:32364.395)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LGN r1 = (X.LGN) r1
            X.Ji1 r3 = r1.A01()
            boolean r1 = r3 instanceof com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel
            if (r1 == 0) goto L_0x04a1
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r3 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r3
            if (r3 == 0) goto L_0x04a1
            X.4Co r1 = r3.A00
            X.C51970G9q.A1S(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 6
            X.MGU.A02(r3, r2, r1)
        L_0x04a1:
            r1 = 709269592(0x2a469858, float:1.7638788E-13)
            goto L_0x003e
        L_0x04a6:
            r0 = -2134620219(0xffffffff80c447c5, float:-1.8025503E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LMb r1 = (X.C64083LMb) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 47
            X.C66184MGv.A02(r3, r2, r1)
            r1 = 1464910442(0x5750c26a, float:2.29533421E14)
            goto L_0x003e
        L_0x04c5:
            r0 = 21012102(0x1409e86, float:3.5378566E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LMb r1 = (X.C64083LMb) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 48
            X.C66184MGv.A02(r3, r2, r1)
            r1 = 1134238636(0x439b1bac, float:310.2162)
            goto L_0x003e
        L_0x04e4:
            r0 = 269549755(0x101100bb, float:2.859677E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jip r1 = X.C64083LMb.A00(r1)
            r1.A03()
            r1 = 836034962(0x31d4e192, float:6.1956564E-9)
            goto L_0x003e
        L_0x04f9:
            r0 = 281619600(0x10c92c90, float:7.934918E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jip r1 = X.C64083LMb.A00(r1)
            r1.A02()
            r1 = -785521904(0xffffffffd12de310, float:-4.6677426E10)
            goto L_0x003e
        L_0x050e:
            r0 = 1533479638(0x5b670ad6, float:6.5032634E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LMb r1 = (X.C64083LMb) r1
            X.0eM r1 = r1.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 47
            X.C66184MGv.A02(r3, r2, r1)
            r1 = 1827248976(0x6ce99b50, float:2.2593053E27)
            goto L_0x003e
        L_0x052d:
            r0 = 972538141(0x39f7c11d, float:4.7255392E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K3z r1 = (X.C61357K3z) r1
            X.0eM r1 = r1.A01
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 24
            X.MG2.A01(r3, r2, r1)
            r1 = -814339660(0xffffffffcf7629b4, float:-4.12992819E9)
            goto L_0x003e
        L_0x054c:
            r0 = 1491478148(0x58e62684, float:2.02442478E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K3z r1 = (X.C61357K3z) r1
            X.0eM r1 = r1.A01
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 25
            X.MG2.A01(r3, r2, r1)
            r1 = 1016345002(0x3c9431aa, float:0.018090088)
            goto L_0x003e
        L_0x056b:
            r0 = -2007083114(0xffffffff885e5796, float:-6.690865E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LjG r1 = (X.C64854LjG) r1
            X.Jhw r3 = r1.A01
            if (r3 == 0) goto L_0x0583
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 35
            X.C66184MGv.A02(r3, r2, r1)
        L_0x0583:
            r1 = 1773770052(0x69b99544, float:2.804452E25)
            goto L_0x003e
        L_0x0588:
            r0 = 1045324622(0x3e4e634e, float:0.20155069)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K8D r1 = (X.K8D) r1
            X.DlH r1 = r1.A0C()
            r1.A06()
            r1 = 1666367362(0x6352bf82, float:3.8876158E21)
            goto L_0x003e
        L_0x059f:
            r0 = 747547074(0x2c8ea9c2, float:4.0547296E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 490573383(0x1d3d8e47, float:2.5087497E-21)
            goto L_0x003e
        L_0x05b0:
            r0 = -382798049(0xffffffffe92ef71f, float:-1.3220006E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r7 = r1.A0C
            java.lang.String r5 = r7.A07
            if (r5 == 0) goto L_0x0660
            X.LDJ r1 = r7.A04
            if (r1 == 0) goto L_0x0618
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            android.content.Context r11 = r7.requireContext()
            r4 = 1
            com.instagram.common.session.UserSession r6 = r1.A02
            X.02m r2 = X.02m.A0p
            r1 = 39133251(0x2552043, float:1.5658027E-37)
            r2.markerStart(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            java.lang.String r10 = X.1Xv.A06(r5)
            X.0Tu r8 = X.0Tu.A05
            r1 = 36313372962195364(0x8102d2000207a4, double:3.0280615112841E-306)
            boolean r1 = X.182.A06(r8, r6, r1)
            if (r1 == 0) goto L_0x0665
            java.lang.Class<com.instagram.modal.ModalActivity> r9 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "target_id"
            r8.putString(r1, r10)
            java.lang.String r2 = "origin"
            java.lang.String r1 = "live_session_end"
            r8.putString(r2, r1)
            android.content.res.Resources r2 = r11.getResources()
            r1 = 2131965240(0x7f133538, float:1.9567284E38)
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "title"
            r8.putString(r1, r2)
            java.lang.String r1 = "live_insights_full_screen"
            X.6W8 r1 = X.DbV.A0Y(r3, r8, r6, r9, r1)
            r1.A07 = r4
            r1.A0C(r3)
        L_0x0618:
            X.0eM r1 = r7.A0C
            X.6gx r6 = X.DbZ.A0R(r1)
            X.3NV r1 = r7.A02
            if (r1 == 0) goto L_0x07d0
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r7.A09
            r1 = 1
            X.0qQ.A0B(r4, r1)
            X.1Ln r3 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x0660
            X.DbW.A17(r3, r6)
            java.lang.String r1 = "view_insights_bc_live_video"
            X.DbV.A1M(r3, r1)
            r1 = 4203(0x106b, float:5.89E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A0p(r1)
            java.lang.String r1 = "live_stream_ended_view"
            X.JTS.A1G(r3, r1, r2)
            r1 = 0
            X.JTT.A1F(r3, r6, r1)
            java.lang.String r1 = "live_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = "audience"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r1, r4, r2)
            r3.A0w(r1)
            r3.Cgf()
        L_0x0660:
            r1 = -1270518915(0xffffffffb4456b7d, float:-1.8386159E-7)
            goto L_0x003e
        L_0x0665:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "media_id"
            r3.put(r1, r10)
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "live_session_end"
            r3.put(r2, r1)
            X.F29 r2 = new X.F29
            r2.<init>(r6)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r2.A00(r7, r1, r3, r4)
            goto L_0x0618
        L_0x0682:
            r0 = 21223714(0x143d922, float:3.597163E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r1 = r1.A0C
            X.0eM r1 = r1.A0E
            java.lang.Object r6 = r1.getValue()
            X.Jhd r6 = (X.C60220Jhd) r6
            X.1Av r5 = r6.A01
            X.KiM r1 = X.C62589KiM.LIVE
            java.lang.String r4 = r1.A01
            X.0s0 r3 = r5.A85
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 211(0xd3, float:2.96E-43)
            X.DbS.A1a(r5, r4, r3, r2, r1)
            X.6oS r2 = X.C318116oQ.A00(r6)
            r1 = 20
            X.MGU.A02(r6, r2, r1)
            r1 = 1298792096(0x4d69fea0, float:2.45361152E8)
            goto L_0x003e
        L_0x06b4:
            r0 = -396879009(0xffffffffe8581b5f, float:-4.0821443E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r1 = r1.A0C
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0eM r1 = r1.A0D
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r2 = X.2EG.A2r
            java.lang.String r1 = "https://help.instagram.com/resources/66726565"
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            java.lang.String r1 = "live_broadcast_ending"
            r2.A0S = r1
            r2.A0A()
            r1 = 1686574548(0x648715d4, float:1.9935067E22)
            goto L_0x003e
        L_0x06df:
            r0 = 254922921(0xf31d0a9, float:8.76696E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r2 = r1.A0C
            X.LDJ r1 = r2.A04
            if (r1 == 0) goto L_0x070c
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            com.instagram.common.session.UserSession r4 = r1.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r1 = 1524(0x5f4, float:2.136E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r2 = X.DbV.A0Y(r5, r2, r4, r3, r1)
            r1 = 1
            r2.A07 = r1
            r2.A0C(r5)
        L_0x070c:
            r1 = 1976930270(0x75d58fde, float:5.4144395E32)
            goto L_0x003e
        L_0x0711:
            r0 = -443136974(0xffffffffe5964432, float:-8.870162E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r2 = r1.A0C
            java.lang.String r8 = r1.A0E
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0764
            X.LDJ r1 = r2.A04
            if (r1 == 0) goto L_0x0764
            androidx.fragment.app.FragmentActivity r6 = r2.requireActivity()
            android.content.Context r7 = r2.requireContext()
            java.lang.String r2 = r2.A07
            com.instagram.common.session.UserSession r5 = r1.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "moderator_broadcast_id"
            r3.putString(r1, r8)
            java.lang.String r1 = "moderator_media_id"
            r3.putString(r1, r2)
            android.content.res.Resources r2 = r7.getResources()
            r1 = 2131965271(0x7f133557, float:1.9567347E38)
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "title"
            r3.putString(r1, r2)
            r1 = 3273(0xcc9, float:4.586E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r2 = X.DbV.A0Y(r6, r3, r5, r4, r1)
            r1 = 1
            r2.A07 = r1
            r2.A0C(r6)
        L_0x0764:
            r1 = 1377254759(0x52173d67, float:1.62392556E11)
            goto L_0x003e
        L_0x0769:
            r0 = -1449354675(0xffffffffa99c9a4d, float:-6.9545586E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r8 = r1.A0C
            X.0eM r1 = r8.A0E
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r7 = 0
            r1 = 18
            X.MGU.A02(r3, r2, r1)
            X.0eM r1 = r8.A0C
            X.6gx r6 = X.DbZ.A0R(r1)
            java.lang.String r5 = r8.A07
            X.3NV r1 = r8.A02
            if (r1 == 0) goto L_0x07d0
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r8.A09
            r1 = 1
            X.0qQ.A0B(r4, r1)
            X.1Ln r3 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x07cb
            X.DbW.A17(r3, r6)
            java.lang.String r1 = "discard_bc_live_stream_video"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "discard_video_button"
            r3.A0p(r1)
            java.lang.String r1 = "live_stream_ended_view"
            X.JTS.A1G(r3, r1, r2)
            X.JTT.A1F(r3, r6, r7)
            java.lang.String r1 = "live_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = "audience"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r1, r4, r2)
            r3.A0w(r1)
            r3.Cgf()
        L_0x07cb:
            r1 = -69739694(0xfffffffffbd7db52, float:-2.2415843E36)
            goto L_0x003e
        L_0x07d0:
            java.lang.String r5 = "liveVisibilityMode"
            goto L_0x0abf
        L_0x07d4:
            r0 = 1886892436(0x7077b194, float:3.066299E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.M0Z r1 = (X.M0Z) r1
            X.Kcu r6 = r1.A0C
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            r1 = 205(0xcd, float:2.87E-43)
            java.lang.String r2 = X.C273654mx.A00(r1)
            java.lang.String r1 = "not_eligible"
            r7.putString(r2, r1)
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            java.lang.String r2 = r1.A00
            r1 = 1190(0x4a6, float:1.668E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r7.putString(r1, r2)
            r1 = 206(0xce, float:2.89E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5 = 1
            r7.putBoolean(r1, r5)
            X.0eM r1 = r6.A0D
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            r1 = 3043(0xbe3, float:4.264E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.DbV.A0Y(r2, r7, r4, r3, r1)
            r1.A07 = r5
            X.DbT.A1M(r6, r1)
            r1 = 1424368836(0x54e624c4, float:7.9076744E12)
            goto L_0x003e
        L_0x0827:
            r0 = 2107275443(0x7d9a78b3, float:2.5665977E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.M0Z r2 = (X.M0Z) r2
            X.Ju7 r1 = r2.A02
            if (r1 == 0) goto L_0x0892
            java.lang.Integer r1 = r1.A01
            if (r1 == 0) goto L_0x0892
            int r13 = r1.intValue()
            X.Kcu r6 = r2.A0C
            X.0eM r5 = r6.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.KVj r3 = X.C63492Kxw.A00(r1)
            java.lang.String r2 = r6.A07
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r10 = 0
            r3.A01(r1, r2, r10, r10)
            X.0wc r2 = r3.A00
            r1 = 1442(0x5a2, float:2.02E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            X.LMi r3 = r3.A01
            java.lang.String r2 = r3.A02
            java.lang.String r1 = "media_id"
            r4.AAJ(r1, r2)
            java.lang.String r2 = "live"
            java.lang.String r1 = "product"
            r4.AAJ(r1, r2)
            java.lang.String r2 = "badges"
            java.lang.String r1 = "product_type"
            X.C64090LMi.A00(r4, r3, r1, r2)
            X.EZV r2 = X.EZV.POST_LIVE
            java.lang.String r1 = "origin"
            r4.A8M(r2, r1)
            r4.Cgf()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.28D r7 = X.28D.A5N
            java.lang.String r11 = r6.A07
            java.lang.String r12 = r6.A08
            java.lang.Long r9 = r6.A06
            X.VG4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0892:
            r1 = 137961570(0x8392062, float:5.570948E-34)
            goto L_0x003e
        L_0x0897:
            r0 = -851505746(0xffffffffcd3f0dae, float:-2.00334048E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LiS r1 = (X.C64807LiS) r1
            X.L8Z r2 = r1.A02
            if (r2 == 0) goto L_0x0951
            X.M0Z r1 = r2.A00
            X.Kcu r3 = r1.A0C
            android.content.Context r6 = r1.A08
            java.lang.String r14 = r2.A02
            java.lang.String r15 = r2.A03
            java.lang.Integer r10 = r2.A01
            X.AnonymousClass7TG.A1O(r14, r15)
            java.lang.Integer r1 = X.00y.A0l(r15)
            if (r1 == 0) goto L_0x0951
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x0951
            java.lang.String r13 = r3.A07
            if (r13 == 0) goto L_0x0951
            X.LDJ r4 = r3.A04
            if (r4 == 0) goto L_0x093f
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            r1 = 0
            r8 = 1
            X.7Pu r2 = r4.A01
            if (r2 == 0) goto L_0x093f
            X.1Yw r7 = X.C49195Er0.A00()
            X.LEU r9 = r7.A00()
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r12 = 0
            r16 = r12
            r17 = r12
            r19 = r1
            r18 = r8
            X.K7d r7 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r4 = r4.A02
            X.7Pr r4 = X.DbS.A0W(r4)
            r9 = 7
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            X.0qQ.A0C(r7, r9)
            r4.A0T = r7
            android.content.res.Resources r10 = r6.getResources()
            r9 = 2131965433(0x7f1335f9, float:1.9567676E38)
            java.lang.String r9 = r10.getString(r9)
            r4.A0d = r9
            r4.A0k = r1
            r9 = 1058642330(0x3f19999a, float:0.6)
            r4.A03 = r9
            X.DbS.A1S(r4, r8)
            java.lang.String r17 = ""
            X.7Ps r14 = new X.7Ps
            r15 = r12
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = 2131238082(0x7f081cc2, float:1.8092433E38)
            r14.A02 = r1
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131953555(0x7f130793, float:1.9543584E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r6, r1)
            r14.A07 = r1
            r1 = 53
            X.LY5 r1 = A00(r5, r1)
            r14.A05 = r1
            X.7Pt r1 = r14.A00()
            r4.A06(r1)
            r2.A0F(r7, r4)
        L_0x093f:
            X.0eM r1 = r3.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.FYn r4 = X.FCG.A00(r1)
            java.lang.String r3 = "live_broadcast_ending"
            X.EZV r2 = X.EZV.POST_LIVE
            r1 = 0
            r4.A00(r2, r3, r13, r1)
        L_0x0951:
            r1 = 1062151352(0x3f4f24b8, float:0.80915403)
            goto L_0x003e
        L_0x0956:
            r0 = -1982253604(0xffffffff89d935dc, float:-5.22915E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KFP r1 = (X.KFP) r1
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = -897850944(0xffffffffca7be1c0, float:-4126832.0)
            goto L_0x003e
        L_0x096b:
            r0 = 1612315758(0x6019fc6e, float:4.438346E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r8 = (com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment) r8
            X.M0W r5 = r8.A05
            r7 = 0
            if (r5 != 0) goto L_0x097f
            java.lang.String r5 = "liveWithGuestWaterfall"
            goto L_0x0abf
        L_0x097f:
            java.lang.Long r1 = r5.A04
            if (r1 != 0) goto L_0x09be
            r3 = 0
        L_0x0985:
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            X.1Ln r9 = X.M0W.A03(r5, r1)
            r1 = 4612(0x1204, float:6.463E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "reason"
            r9.A0R(r1, r2)
            double r5 = (double) r3
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 / r1
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            java.lang.String r1 = "response_time"
            r9.A0P(r1, r2)
            r9.Cgf()
            r1 = 1
            r8.A0B = r1
            androidx.fragment.app.FragmentActivity r2 = r8.getActivity()
            if (r2 == 0) goto L_0x09b9
            r1 = -1
            r2.setResult(r1, r7)
            r2.onBackPressed()
        L_0x09b9:
            r1 = -1019422997(0xffffffffc33cd6eb, float:-188.83952)
            goto L_0x003e
        L_0x09be:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1.longValue()
            long r3 = r3 - r1
            goto L_0x0985
        L_0x09c8:
            r0 = -150253038(0xfffffffff70b5212, float:-2.8257572E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K4s r4 = (X.C61374K4s) r4
            X.0eM r1 = r4.A02
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131976267(0x7f13604b, float:1.958965E38)
            java.lang.String r1 = r4.getString(r1)
            r2.A0d = r1
            X.7Pu r3 = r2.A00()
            android.content.Context r2 = r4.requireContext()
            X.1Yw r1 = X.C49195Er0.A00()
            r1.A00()
            X.K3s r1 = new X.K3s
            r1.<init>()
            r3.A03(r2, r1)
            r1 = 319315646(0x13085ebe, float:1.7212325E-27)
            goto L_0x003e
        L_0x09fe:
            r0 = -148287017(0xfffffffff72951d7, float:-3.4342112E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LO9 r1 = (X.LO9) r1
            X.LO9.A00(r1)
            r1 = 665754526(0x27ae9b9e, float:4.846342E-15)
            goto L_0x003e
        L_0x0a11:
            r0 = 1474490476(0x57e2f06c, float:4.99044464E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LO9 r1 = (X.LO9) r1
            X.K6D r2 = r1.A02
            X.JuA r1 = r2.A03
            java.lang.String r5 = "viewState"
            if (r1 == 0) goto L_0x0abf
            r9 = 0
            com.instagram.user.model.UpcomingEvent r6 = r1.A01
            X.Khz r5 = r1.A00
            java.lang.String r7 = r1.A02
            java.util.Date r8 = r1.A04
            boolean r10 = r1.A05
            boolean r11 = r1.A06
            X.AnonymousClass7TG.A1O(r5, r7)
            X.JuA r4 = new X.JuA
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.A03 = r4
            X.LO9 r3 = r2.A04
            if (r3 == 0) goto L_0x0a4b
            java.util.Date r2 = r4.A04
            java.util.Date r1 = r4.A03
            r3.A01(r2, r1)
            r1 = -1598135810(0xffffffffa0be61fe, float:-3.2252098E-19)
            goto L_0x003e
        L_0x0a4b:
            java.lang.String r5 = "viewBinder"
            goto L_0x0abf
        L_0x0a4e:
            r0 = -1658608634(0xffffffff9d23a406, float:-2.1657669E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LO9 r2 = (X.LO9) r2
            X.LBP r1 = r2.A03
            android.view.View r1 = r1.A03
            X.0nA.A0N(r1)
            X.K6D r1 = r2.A02
            r1.A03()
            r1 = -192251168(0xfffffffff48a7ae0, float:-8.777212E31)
            goto L_0x003e
        L_0x0a6a:
            r0 = -1467497017(0xffffffffa887c5c7, float:-1.5073783E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LO9 r1 = (X.LO9) r1
            X.LO9.A00(r1)
            r1 = 121723983(0x7415c4f, float:1.4546833E-34)
            goto L_0x003e
        L_0x0a7d:
            r0 = -2086289606(0xffffffff83a5bf3a, float:-9.741732E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LO9 r2 = (X.LO9) r2
            X.LBP r1 = r2.A03
            android.view.View r1 = r1.A03
            X.0nA.A0N(r1)
            X.K6D r1 = r2.A02
            r1.A03()
            r1 = 1211152330(0x4830b7ca, float:180959.16)
            goto L_0x003e
        L_0x0a99:
            r0 = 791453466(0x2f2c9f1a, float:1.5699833E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LO9 r1 = (X.LO9) r1
            X.K6D r1 = r1.A02
            X.K6D.A02(r1)
            r1 = 1914702811(0x72200bdb, float:3.1700438E30)
            goto L_0x003e
        L_0x0aae:
            r0 = 349650581(0x14d73e95, float:2.1734136E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K4S r2 = (X.K4S) r2
            X.Khz r1 = r2.A00
            if (r1 != 0) goto L_0x0ac7
            java.lang.String r5 = "priorSurface"
        L_0x0abf:
            X.0qQ.A0F(r5)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0ac7:
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0ad5
            X.0eM r1 = r2.A05
            X.C59888JbD.A02(r1)
        L_0x0ad0:
            r1 = 519366129(0x1ef4e5f1, float:2.5929606E-20)
            goto L_0x003e
        L_0x0ad5:
            X.K4S.A00(r2)
            goto L_0x0ad0
        L_0x0ad9:
            r0 = -1862825122(0xffffffff90f78b5e, float:-9.763905E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Jlf r3 = (X.C60447Jlf) r3
            X.MUQ r2 = r3.A03
            r1 = 0
            X.C60447Jlf.A00(r3, r2, r1)
            r1 = 454034783(0x1b10055f, float:1.1913136E-22)
            goto L_0x003e
        L_0x0aef:
            r0 = -603541556(0xffffffffdc06afcc, float:-1.5164375E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K4a r1 = (X.C61358K4a) r1
            X.0eM r1 = r1.A08
            X.2YL r5 = X.DbS.A0H(r1)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 43
            X.MG5 r1 = new X.MG5
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 541256712(0x2042ec08, float:1.6510535E-19)
            goto L_0x003e
        L_0x0b14:
            r0 = -1093645877(0xffffffffbed049cb, float:-0.406813)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.5Dn r1 = (X.C282555Dn) r1
            r1.A00()
            r1 = -1652635567(0xffffffff9d7ec851, float:-3.3720181E-21)
            goto L_0x003e
        L_0x0b27:
            r0 = -281033492(0xffffffffef3fc4ec, float:-5.93497E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.5Dn r1 = (X.C282555Dn) r1
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = r1.A00
            r1.A0T()
            r1 = -873321285(0xffffffffcbf22cbb, float:-3.1742326E7)
            goto L_0x003e
        L_0x0b3c:
            r0 = 2130056573(0x7ef6157d, float:1.6355083E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.5Dn r1 = (X.C282555Dn) r1
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = r1.A00
            r1.A0T()
            r1 = -448243889(0xffffffffe548574f, float:-5.913024E22)
            goto L_0x003e
        L_0x0b51:
            r0 = -1160509090(0xffffffffbad4095e, float:-0.0016177108)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.5Dn r1 = (X.C282555Dn) r1
            r1.A00()
            r1 = -166570517(0xfffffffff61255eb, float:-7.420097E32)
            goto L_0x003e
        L_0x0b64:
            r0 = -313657188(0xffffffffed4df89c, float:-3.984061E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r1 = 386526376(0x1709eca8, float:4.456579E-25)
            goto L_0x003e
        L_0x0b70:
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            X.K6D.A00(r0, r4)
            r0 = 1264567414(0x4b5fc476, float:1.4664822E7)
            goto L_0x0f1a
        L_0x0b7a:
            r0 = -1767876813(0xffffffff96a05733, float:-2.5904425E-25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Lh5 r5 = (X.C64728Lh5) r5
            java.lang.String[] r4 = X.C64100LMu.A05
            X.LMu r2 = r5.A01
            X.7kB r0 = r2.A00
            if (r0 == 0) goto L_0x0bad
            java.util.HashMap r1 = r0.A06
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
        L_0x0b94:
            X.7vz r0 = X.1DL.A01(r0, r4)
            X.0qQ.A07(r0)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0bb2
            r0 = 2
            if (r1 == r0) goto L_0x0bbf
            r0 = 0
            if (r1 == r0) goto L_0x0bc7
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0bad:
            X.0sm r0 = X.0Yt.A0E()
            goto L_0x0b94
        L_0x0bb2:
            android.app.Activity r1 = r2.A01
            r0 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            X.1DL.A04(r1, r5, r0)
            goto L_0x0bc7
        L_0x0bbf:
            android.app.Activity r1 = r2.A01
            r0 = 2131954557(0x7f130b7d, float:1.9545617E38)
            X.W38.A03(r1, r0)
        L_0x0bc7:
            r0 = 1536063617(0x5b8e7881, float:8.0203884E16)
            goto L_0x0f1a
        L_0x0bcc:
            r0 = -1614628735(0xffffffff9fc2b881, float:-8.246743E-20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LNA r0 = (X.LNA) r0
            X.0eM r0 = r0.A08
            java.lang.Object r5 = r0.getValue()
            X.JhE r5 = (X.C60195JhE) r5
            X.05G r4 = r5.A05
            int r1 = X.JTR.A0K(r4)
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0c38
            r1 = 0
            X.LES r2 = r5.A04
            X.05G r0 = r2.A0N
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.Epw(r1)
            X.05G r0 = r2.A0M
            r0.Epw(r1)
            X.M0X r4 = r5.A03
            X.0Ae r1 = r4.A0N
            java.lang.String r0 = "ig_live_tutorial_action"
            X.0Aj r2 = X.M0X.A01(r4, r1, r0)
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0c35
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0c35
            long r0 = r0.longValue()
        L_0x0c12:
            X.JTQ.A10(r2, r0)
            X.0iw r0 = r4.A0O
            X.C51969G9p.A1A(r2, r0)
            java.lang.String r0 = r4.A0A
            if (r0 != 0) goto L_0x0c20
            java.lang.String r0 = ""
        L_0x0c20:
            X.C51965G9l.A1I(r2, r0)
            X.JTP.A1G(r2)
            java.lang.String r1 = "tap_done"
            java.lang.String r0 = "step"
            X.M0X.A06(r2, r4, r0, r1)
            r2.Cgf()
        L_0x0c30:
            r0 = -476344993(0xffffffffe39b8d5f, float:-5.7388644E21)
            goto L_0x0f1a
        L_0x0c35:
            r0 = 0
            goto L_0x0c12
        L_0x0c38:
            X.M0X r6 = r5.A03
            int r5 = X.JTR.A0K(r4)
            X.0Ae r1 = r6.A0N
            java.lang.String r0 = "ig_live_tutorial_action"
            X.0Aj r2 = X.M0X.A01(r6, r1, r0)
            java.lang.String r0 = r6.A08
            if (r0 == 0) goto L_0x0c80
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0c80
            long r0 = r0.longValue()
        L_0x0c54:
            X.JTQ.A10(r2, r0)
            X.0iw r0 = r6.A0O
            X.C51969G9p.A1A(r2, r0)
            java.lang.String r0 = r6.A0A
            if (r0 != 0) goto L_0x0c62
            java.lang.String r0 = ""
        L_0x0c62:
            X.C51965G9l.A1I(r2, r0)
            X.JTP.A1G(r2)
            java.lang.String r0 = "tap_next"
            java.lang.String r1 = X.002.A0O(r0, r5)
            java.lang.String r0 = "step"
            X.M0X.A06(r2, r6, r0, r1)
            r2.Cgf()
            int r0 = X.JTR.A0K(r4)
            int r0 = r0 + 1
            X.JTP.A1W(r4, r0)
            goto L_0x0c30
        L_0x0c80:
            r0 = 0
            goto L_0x0c54
        L_0x0c83:
            r0 = 573818188(0x2233c54c, float:2.4363472E-18)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LjY r0 = (X.C64872LjY) r0
            X.0eM r0 = r0.A07
            java.lang.Object r7 = r0.getValue()
            X.Jhb r7 = (X.C60218Jhb) r7
            X.6go r0 = r7.A03
            int r1 = r0.ordinal()
            r0 = 0
            r8 = 0
            if (r1 == r0) goto L_0x0d2a
            r0 = 1
            if (r1 != r0) goto L_0x0d22
            com.instagram.common.session.UserSession r2 = r7.A02
            X.0iw r1 = r7.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r7.A04
            X.0Ud r3 = r0.A06
            X.JvD r0 = X.JTO.A0r(r3)
            if (r0 == 0) goto L_0x0cb5
            java.lang.String r6 = r0.A08
            if (r6 != 0) goto L_0x0cb7
        L_0x0cb5:
            java.lang.String r6 = "0"
        L_0x0cb7:
            X.JvD r0 = X.JTO.A0r(r3)
            if (r0 == 0) goto L_0x0d27
            X.QP7 r0 = r0.A02
            if (r0 == 0) goto L_0x0d27
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0d27
            java.lang.String r4 = r0.getId()
        L_0x0ccb:
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r0 = "ig_cg_click_live_donate_cta"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r4)
            r0 = 69
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9F(r0, r1)
            long r0 = java.lang.Long.parseLong(r6)
            X.JTQ.A10(r2, r0)
            X.XSG r1 = X.XSG.IG_LIVE_FOR_CHARITY
            java.lang.String r0 = "fundraiser_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "LIVE_VIDEO"
            java.lang.String r0 = "source_name"
            r2.AAJ(r0, r1)
            r2.Cgf()
            X.JvD r0 = X.JTO.A0r(r3)
            if (r0 == 0) goto L_0x0d22
            X.QP7 r0 = r0.A02
            if (r0 == 0) goto L_0x0d22
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0d22
            long r10 = r0.longValue()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0d22
            X.6oS r1 = X.C318116oQ.A00(r7)
            r9 = 26
            X.MGA r6 = new X.MGA
            r6.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9, (long) r10)
        L_0x0d1f:
            X.AnonymousClass7TE.A1Z(r6, r1)
        L_0x0d22:
            r0 = -1543468782(0xffffffffa4008912, float:-2.787168E-17)
            goto L_0x0dbb
        L_0x0d27:
            java.lang.String r4 = ""
            goto L_0x0ccb
        L_0x0d2a:
            X.6oS r1 = X.C318116oQ.A00(r7)
            r0 = 31
            X.MGv r6 = new X.MGv
            r6.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r0)
            goto L_0x0d1f
        L_0x0d36:
            r0 = -1675992535(0xffffffff9c1a6229, float:-5.1081195E-22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.M0Z r0 = (X.M0Z) r0
            X.Kcu r5 = r0.A0C
            X.0eM r0 = r5.A0E
            java.lang.Object r0 = r0.getValue()
            X.Jhd r0 = (X.C60220Jhd) r0
            X.M0X r4 = r0.A02
            X.0Ae r1 = r4.A0N
            java.lang.String r0 = "ig_live_practice_tap_go_live"
            X.0Aj r2 = X.M0X.A01(r4, r1, r0)
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0d93
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0d93
            long r0 = r0.longValue()
        L_0x0d63:
            X.JTQ.A10(r2, r0)
            java.lang.String r0 = r4.A0A
            if (r0 != 0) goto L_0x0d6c
            java.lang.String r0 = ""
        L_0x0d6c:
            X.C51965G9l.A1I(r2, r0)
            X.0iw r0 = r4.A0O
            X.C51969G9p.A1A(r2, r0)
            X.JTP.A1G(r2)
            r2.Cgf()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            boolean r0 = r1 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0d8e
            com.instagram.modal.ModalActivity r1 = (com.instagram.modal.ModalActivity) r1
            if (r1 == 0) goto L_0x0d8e
            r0 = 6001(0x1771, float:8.409E-42)
            r1.setResult(r0)
            r1.finish()
        L_0x0d8e:
            r0 = 1364505473(0x5154b381, float:5.709654E10)
            goto L_0x0f1a
        L_0x0d93:
            r0 = 0
            goto L_0x0d63
        L_0x0d96:
            r0 = 386869809(0x170f2a31, float:4.6259045E-25)
            r2 = r21
            int r5 = X.DbX.A03(r2, r0)
            java.lang.Object r4 = r1.A01
            X.JeZ r4 = (X.C60058JeZ) r4
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0dbf
            r2 = 2131973688(0x7f135638, float:1.9584419E38)
            r1 = 2131973687(0x7f135637, float:1.9584417E38)
            android.content.Context r0 = r4.getContext()
            X.8ab r0 = X.JTU.A0N(r0, r2, r1)
            X.Dba.A1L(r0)
            r0 = -1543515560(0xffffffffa3ffd258, float:-2.773624E-17)
        L_0x0dbb:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0dbf:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0dd8
            r2 = 2131973690(0x7f13563a, float:1.9584423E38)
            r1 = 2131973689(0x7f135639, float:1.958442E38)
            android.content.Context r0 = r4.getContext()
            X.8ab r0 = X.JTU.A0N(r0, r2, r1)
            X.Dba.A1L(r0)
            r0 = 1717399774(0x665d70de, float:2.6143126E23)
            goto L_0x0dbb
        L_0x0dd8:
            X.MT7 r7 = r4.A07
            if (r7 == 0) goto L_0x0e3a
            java.lang.Object r6 = r2.getTag()
            if (r6 == 0) goto L_0x0e3f
            X.EZv r6 = (X.C48153EZv) r6
            java.lang.Integer r0 = X.AnonymousClass05K.A0e
            X.0xI r3 = X.C59882Jb5.A00(r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r4.A0J
            com.instagram.user.model.User r0 = r0.A01(r2)
            java.lang.String r1 = r6.A01(r1, r0)
            java.lang.String r0 = "name"
            r3.A0C(r0, r1)
            X.DbU.A1R(r3, r2)
            X.MUP r1 = r4.A0M
            java.lang.String r0 = r6.A02
            r1.Cha(r0)
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0e37
            X.LM3 r4 = r4.A03
            if (r4 == 0) goto L_0x0e37
            X.EZv r0 = X.C48153EZv.A05
            if (r6 != r0) goto L_0x0e34
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0e17:
            int r3 = r0.intValue()
            if (r3 == 0) goto L_0x0e30
            r2 = 2131961828(0x7f1327e4, float:1.9560364E38)
            r1 = 1
            r0 = 2131961802(0x7f1327ca, float:1.9560311E38)
            if (r3 == r1) goto L_0x0e29
        L_0x0e26:
            r0 = 2131961801(0x7f1327c9, float:1.956031E38)
        L_0x0e29:
            X.LM3.A00(r4, r2, r0)
            r0 = 1762256137(0x6909e509, float:1.0419027E25)
            goto L_0x0dbb
        L_0x0e30:
            r2 = 2131961826(0x7f1327e2, float:1.956036E38)
            goto L_0x0e26
        L_0x0e34:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0e17
        L_0x0e37:
            r7.Cvj(r6)
        L_0x0e3a:
            r0 = -743567281(0xffffffffd3ae104f, float:-1.49519584E12)
            goto L_0x0dbb
        L_0x0e3f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1318343700(0x4e945414, float:1.24426906E9)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x0e4a:
            r0 = 1199182926(0x477a144e, float:64020.305)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.ui.widget.gallery.GalleryView r1 = (com.instagram.ui.widget.gallery.GalleryView) r1
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 != 0) goto L_0x0e6d
            android.app.Activity r0 = r1.getRootActivity()
            if (r0 == 0) goto L_0x0e68
            X.W38.A01(r0)
        L_0x0e68:
            r0 = -923669491(0xffffffffc8f1ec0d, float:-495456.4)
            goto L_0x0f1a
        L_0x0e6d:
            com.instagram.ui.widget.gallery.GalleryView.A06(r1)
            goto L_0x0e68
        L_0x0e71:
            r0 = -497969060(0xffffffffe251985c, float:-9.6658704E20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.LOJ r4 = (X.LOJ) r4
            com.instagram.common.session.UserSession r6 = r4.A04
            X.0Tu r5 = X.0Tu.A05
            r0 = 36316662907015732(0x8105d000001234, double:3.030142085636045E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0ea0
            X.LeG r7 = new X.LeG
            r7.<init>()
            java.lang.String r2 = "direct"
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 501(0x1f5, float:7.02E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.AnonymousClass9PQ.A08(r7, r6, r1, r2, r0)
        L_0x0ea0:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0edb
            X.LGD r2 = r4.A05
            android.widget.ImageView r1 = r2.A07
            if (r1 == 0) goto L_0x0eb0
            r0 = 2131238095(0x7f081ccf, float:1.809246E38)
            r1.setImageResource(r0)
        L_0x0eb0:
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x0eb9
            android.view.View r0 = r2.A02
            X.AnonymousClass7TF.A16(r0)
        L_0x0eb9:
            X.MVV r2 = r4.A00
            if (r2 == 0) goto L_0x0ece
            r0 = 36317912742565516(0x8106f30001168c, double:3.030932486670412E-306)
            X.182.A06(r5, r6, r0)
            boolean r0 = X.C63272KuH.A00(r6)
            if (r0 == 0) goto L_0x0ed5
            r2.Etw()
        L_0x0ece:
            r0 = 1
            r4.A02 = r0
        L_0x0ed1:
            r0 = 2022485917(0x788caf9d, float:2.2827607E34)
            goto L_0x0f1a
        L_0x0ed5:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r2.Ev1(r0)
            goto L_0x0ece
        L_0x0edb:
            X.LOJ.A00(r4)
            goto L_0x0ed1
        L_0x0edf:
            r0 = -1332360265(0xffffffffb095cbb7, float:-1.0899076E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5Dn r0 = (X.C282555Dn) r0
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = r0.A00
            X.LPD r1 = r0.A0O
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0efb
            r1.A01()
        L_0x0ef7:
            r0 = -1787875256(0xffffffff956f3048, float:-4.8303753E-26)
            goto L_0x0f1a
        L_0x0efb:
            r1.A03()
            goto L_0x0ef7
        L_0x0eff:
            r0 = 128213716(0x7a462d4, float:2.4734063E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5Dn r0 = (X.C282555Dn) r0
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = r0.A00
            X.LPD r1 = r0.A0O
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0f1e
            r1.A01()
        L_0x0f17:
            r0 = 254985941(0xf32c6d5, float:8.814371E-30)
        L_0x0f1a:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0f1e:
            r1.A03()
            goto L_0x0f17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY5.onClick(android.view.View):void");
    }
}
