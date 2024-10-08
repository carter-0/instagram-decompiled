package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.3lW  reason: invalid class name and case insensitive filesystem */
public final class C250483lW extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 19Y A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C250483lW(UserSession userSession, 19Y r5) {
        super(1297312377, 3, false, false);
        this.A00 = userSession;
        this.A01 = r5;
    }

    public final void run() {
        1AA r8;
        183 r1;
        UserSession userSession = this.A00;
        0Tu r0 = 0Tu.A05;
        1AW.A06(r0, 18298540660885039L);
        1AW.A00(r0, 19142965591146547L);
        1AW.A01(r0, 18580015637661392L);
        1AW.A04(r0, 18861490614501457L);
        if (182.A06(r0, userSession, 36312934875399725L)) {
            0wj.A01.AEf("Fake failure to simulate F&S canary failures, push_event_test_ig_user_session_canary_test.bool1", 817892914).report();
        }
        182.A06(r0, userSession, 36312934875465262L);
        182.A00(r0, userSession, 37157359805726770L);
        182.A01(r0, userSession, 36594409852241615L);
        182.A04(r0, userSession, 36875884829081680L);
        182.A01(r0, userSession, 36612517434235224L);
        if (182.A06(r0, userSession, 36315778143751713L) && 19Y.A04.nextInt(50000) == 0 && (r1 = 183.A01) != null) {
            1AV A02 = r1.A02(userSession);
            0qQ.A0A(A02);
            1AA r5 = A02.A01.A00;
            0Tu A002 = 0Tu.A00(new 0Tu());
            A002.A02 = true;
            String valueOf = String.valueOf(r5.BOa(A002, 36597227350788845L));
            boolean z = false;
            if (A002.A00.A00.getSource() > 1) {
                z = true;
            }
            C283475Hv.A01(userSession, valueOf, 36597227350788845L, z);
            String valueOf2 = String.valueOf(r5.BOa(A002, 36597231645756142L));
            boolean z2 = false;
            if (A002.A00.A00.getSource() > 1) {
                z2 = true;
            }
            C283475Hv.A01(userSession, valueOf2, 36597231645756142L, z2);
            String valueOf3 = String.valueOf(r5.BOa(A002, 36597235940723439L));
            boolean z3 = false;
            if (A002.A00.A00.getSource() > 1) {
                z3 = true;
            }
            C283475Hv.A01(userSession, valueOf3, 36597235940723439L, z3);
            String valueOf4 = String.valueOf(r5.BOa(A002, 36597240235690736L));
            boolean z4 = false;
            if (A002.A00.A00.getSource() > 1) {
                z4 = true;
            }
            C283475Hv.A01(userSession, valueOf4, 36597240235690736L, z4);
        }
        if (182.A06(r0, userSession, 36318548397660388L)) {
            1NY r4 = new 1NY(userSession, -2);
            r4.A08(AnonymousClass05K.A0N);
            r4.A0A("fast_and_safe/server_configs_test/");
            r4.A0O((15p) null, C15235UWu.class, C18113Vlh.class, false);
            1OC A0M = r4.A0M();
            A0M.A00 = new C15574Uf2();
            1ES.A03(A0M);
        }
        19Y r52 = this.A01;
        1AV A012 = r52.A01();
        1AV.A00(A012, true);
        1AA r11 = r52.A01().A01.A00;
        StringBuilder sb = new StringBuilder();
        C283475Hv.A00(r11, Boolean.valueOf(1AW.A06(r0, 18300894302964852L)), false, "bool1", sb, 18300894302964852L);
        C283475Hv.A00(r11, Boolean.valueOf(1AW.A06(r0, 2324143903516724341L)), true, "bool2", sb, 2324143903516724341L);
        C283475Hv.A00(r11, Boolean.valueOf(1AW.A06(r0, 2324143903516789878L)), (Object) null, "bool3", sb, 2324143903516789878L);
        C283475Hv.A00(r11, Boolean.valueOf(1AW.A06(r0, 18300894303161463L)), 1, "bool4", sb, 18300894303161463L);
        Double valueOf5 = Double.valueOf(1AW.A00(r0, 19145319233421412L));
        Double valueOf6 = Double.valueOf(-142.5d);
        C283475Hv.A00(r11, valueOf5, valueOf6, "double1", sb, 19145319233421412L);
        Double valueOf7 = Double.valueOf(1AW.A00(r0, 19145319233552485L));
        Double valueOf8 = Double.valueOf(0.0d);
        C283475Hv.A00(r11, valueOf7, valueOf8, "double2", sb, 19145319233552485L);
        Double valueOf9 = Double.valueOf(1AW.A00(r0, 19145319233749094L));
        Double valueOf10 = Double.valueOf(9.876543210125E9d);
        C283475Hv.A00(r11, valueOf9, valueOf10, "double3", sb, 19145319233749094L);
        C283475Hv.A00(r11, Long.valueOf(1AW.A01(r0, 18582369280199280L)), 975612L, "int1", sb, 18582369280199280L);
        C283475Hv.A00(r11, Long.valueOf(1AW.A01(r0, 18582369280395889L)), 0L, "int2", sb, 18582369280395889L);
        C283475Hv.A00(r11, Long.valueOf(1AW.A01(r0, 18582369280461426L)), -4321L, "int3", sb, 18582369280461426L);
        C283475Hv.A00(r11, 1AW.A04(r0, 18863844256645281L), "Lorem Ipsum", "string1", sb, 18863844256645281L);
        C283475Hv.A00(r11, 1AW.A04(r0, 18863844256776354L), "", "string2", sb, 18863844256776354L);
        C283475Hv.A00(r11, 1AW.A04(r0, 18863844256972963L), "MobileConfig is a cross-platform framework for Android and iOS apps to access server-side configurations", "string3", sb, 18863844256972963L);
        if (sb.length() > 0) {
            sb.insert(0, "Failed to get remote config values: ");
            0f9 AEf = 0wj.A01.AEf("NEEDLE_FAILURE_FDIDIG", 13636632);
            AEf.ERJ(new IllegalStateException(sb.toString()));
            AEf.report();
        }
        1AW.A04(r0, 18863844257235108L);
        1AV A022 = r52.A02(userSession);
        if (A022 != null) {
            1AV.A00(A022, true);
        }
        1AV A023 = r52.A02(userSession);
        if (A023 != null) {
            1AA r112 = A023.A01.A00;
            StringBuilder sb2 = new StringBuilder();
            C283475Hv.A00(r112, Boolean.valueOf(182.A06(r0, userSession, 36312999300499024L)), false, "bool1", sb2, 36312999300499024L);
            C283475Hv.A00(r112, Boolean.valueOf(182.A06(r0, userSession, 2342156008514258513L)), true, "bool2", sb2, 2342156008514258513L);
            C283475Hv.A00(r112, Boolean.valueOf(182.A06(r0, userSession, 2342156008514324050L)), (Object) null, "bool3", sb2, 2342156008514324050L);
            C283475Hv.A00(r112, Boolean.valueOf(182.A06(r0, userSession, 36312999300695635L)), 1, "bool4", sb2, 36312999300695635L);
            C283475Hv.A00(r112, Double.valueOf(182.A00(r0, userSession, 37157424230170676L)), valueOf6, "double1", sb2, 37157424230170676L);
            C283475Hv.A00(r112, Double.valueOf(182.A00(r0, userSession, 37157424230301749L)), valueOf8, "double2", sb2, 37157424230301749L);
            C283475Hv.A00(r112, Double.valueOf(182.A00(r0, userSession, 37157424230432822L)), valueOf10, "double3", sb2, 37157424230432822L);
            C283475Hv.A00(r112, Long.valueOf(182.A01(r0, userSession, 36594474276620008L)), 975612, "int1", sb2, 36594474276620008L);
            C283475Hv.A00(r112, Long.valueOf(182.A01(r0, userSession, 36594474277078761L)), (Object) null, "int2", sb2, 36594474277078761L);
            C283475Hv.A00(r112, Long.valueOf(182.A01(r0, userSession, 36594474277144298L)), -4321, "int3", sb2, 36594474277144298L);
            C283475Hv.A00(r112, 182.A04(r0, userSession, 36875949253394516L), "Lorem Ipsum", "string1", sb2, 36875949253394516L);
            C283475Hv.A00(r112, 182.A04(r0, userSession, 36875949253525589L), "", "string2", sb2, 36875949253525589L);
            C283475Hv.A00(r112, 182.A04(r0, userSession, 36875949253656662L), "MobileConfig is a cross-platform framework for Android and iOS apps to access server-side configurations", "string3", sb2, 36875949253656662L);
            if (sb2.length() > 0) {
                sb2.insert(0, "Failed to get remote config values: ");
                0f9 AEf2 = 0wj.A01.AEf("NEEDLE_FAILURE_IG_CONFIG", 13636632);
                AEf2.ERJ(new IllegalStateException(sb2.toString()));
                AEf2.report();
            }
            182.A04(r0, userSession, 36875953548296279L);
        }
        1AA r7 = null;
        if (A012 != null) {
            r8 = A012.A01.A00;
        } else {
            r8 = null;
        }
        if (A022 != null) {
            r7 = A022.A01.A00;
        }
        1At.A00(r7, r8, (LightweightQuickPerformanceLogger) null, userSession, 1Aj.A01(userSession), 1Aj.A00(), AnonymousClass05K.A00, 0sr.A1P(new 1As[]{new 1As(AnonymousClass0yP.A00(36328942218526399L)), new 1As(AnonymousClass0yP.A00(36891892171998104L))}), 0sr.A1P(new 1As[]{new 1As(C63130yM.A00(18315226608845024L)), new 1As(C63130yM.A00(18878176562316219L))}), 1792);
    }
}
