package com.instagram.notifications.badging.plugin;

import X.00k;
import X.0Tu;
import X.0eP;
import X.0eQ;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.0sn;
import X.0sr;
import X.182;
import X.1Hj;
import X.2aD;
import X.2aV;
import X.2aX;
import X.AnonymousClass0xl;
import X.AnonymousClass1Ek;
import X.AnonymousClass2g1;
import X.AnonymousClass4D7;
import X.AnonymousClass4EN;
import X.AnonymousClass5m2;
import X.AnonymousClass9MF;
import X.C226252fx;
import X.C239993Jd;
import X.C241603Pv;
import X.C294195m3;
import X.C377349Lm;
import X.C377419Lt;
import X.C48214Eav;
import X.C60340gF;
import X.C61170le;
import X.C62320sa;
import X.C62880wX;
import X.C71062aE;
import X.C71132ar;
import X.Ff4;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.plugin.BadgingPluginImpl$onAppOpen$1", f = "BadgingPluginImpl.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"logger"}, s = {"L$1"})
public final class BadgingPluginImpl$onAppOpen$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ int A0B;
    public final /* synthetic */ UserSession A0C;
    public final /* synthetic */ C71132ar A0D;
    public final /* synthetic */ C62320sa A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgingPluginImpl$onAppOpen$1(UserSession userSession, C71132ar r3, AnonymousClass4D7 r4, C62320sa r5, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2, r4);
        this.A0D = r3;
        this.A0C = userSession;
        this.A0E = r5;
        this.A0F = z;
        this.A0G = z2;
        this.A0H = z3;
        this.A0B = i;
        this.A09 = i2;
        this.A0A = i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.notifications.badging.plugin.BadgingPluginImpl$onAppOpen$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        C71132ar r2 = this.A0D;
        AnonymousClass4D7 r3 = r13;
        ? badgingPluginImpl$onAppOpen$1 = new BadgingPluginImpl$onAppOpen$1(this.A0C, r2, r3, this.A0E, this.A0B, this.A09, this.A0A, this.A0F, this.A0G, this.A0H);
        badgingPluginImpl$onAppOpen$1.A08 = obj;
        return badgingPluginImpl$onAppOpen$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BadgingPluginImpl$onAppOpen$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.notifications.badging.plugin.BadgingPluginImpl$onAppOpen$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        2aV r14;
        C62320sa r8;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        C226252fx r0;
        0eP r02;
        C239993Jd r1;
        Object obj2 = 1Hj.A02;
        if (this.A03 != 0) {
            i2 = this.A02;
            i3 = this.A01;
            i = this.A00;
            z = this.A07;
            z2 = this.A06;
            z3 = this.A05;
            r14 = (2aV) this.A04;
            r8 = (C62320sa) this.A08;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C71132ar r03 = this.A0D;
            UserSession userSession = this.A0C;
            r8 = this.A0E;
            z3 = this.A0F;
            z2 = this.A0G;
            z = this.A0H;
            i = this.A0B;
            i3 = this.A09;
            i2 = this.A0A;
            try {
                r14 = r03.A01();
                long A012 = 182.A01(0Tu.A05, userSession, 36592142110359886L);
                this.A08 = r8;
                this.A04 = r14;
                this.A05 = z3;
                this.A06 = z2;
                this.A07 = z;
                this.A00 = i;
                this.A01 = i3;
                this.A02 = i2;
                this.A03 = 1;
                if (C241603Pv.A01(this, A012) == obj2) {
                    return obj2;
                }
            } catch (Throwable th) {
                new 0eQ(th);
            }
        }
        C62880wX r13 = C61170le.A00;
        if (AnonymousClass0xl.A00(r13).A00.getLong("notification_clicked_timestamp", 0) + 15000 > System.currentTimeMillis()) {
            return C60340gF.A00;
        }
        if (!((Boolean) r8.invoke()).booleanValue()) {
            return C60340gF.A00;
        }
        if (z3) {
            if (z2) {
                2aD r82 = 2aD.A0p;
                0qQ.A0B(AnonymousClass2g1.BOTTOM_SHEET, 0);
                if (r14.A05) {
                    2aX r2 = C48214Eav.A01;
                    if (r2 == null || (r1 = C48214Eav.A00) == null) {
                        r02 = null;
                    } else {
                        r02 = new 0eP(r2, r1);
                    }
                    C48214Eav.A01 = null;
                    C48214Eav.A00 = null;
                    if (r02 != null) {
                        2aX r6 = (2aX) r02.A00;
                        C239993Jd r7 = (C239993Jd) r02.A01;
                        Object obj3 = r7.A02;
                        if (obj3 == null) {
                            obj3 = new Ff4("invalid", "invalid");
                        }
                        List singletonList = Collections.singletonList(r14.A02.get());
                        0qQ.A07(singletonList);
                        0sn r04 = ((2aX) r14.A03.get()).A04;
                        if (r04 == null) {
                            r04 = 0sn.A00;
                        }
                        2aX r5 = new 2aX(r82, 00k.A0S(r04, singletonList), 0, 0);
                        2aV.A01(C294195m3.TAP, r14, (Integer) null, (Integer) null, AnonymousClass4EN.A03(r6), AnonymousClass4EN.A02(r7.A01), AnonymousClass4EN.A01(r7.A00), new AnonymousClass9MF(42, r6, r14, obj3), new C377419Lt(28, r5, r14), AnonymousClass5m2.A00, r6.A01, r5.A00);
                    }
                }
            }
        } else if (z) {
            2aX r72 = new 2aX(2aD.A0V, 0sr.A1M(new 2aX[]{new 2aX(2aD.A09, (List) null, i, i), new 2aX(2aD.A0I, (List) null, i3, i3)}), 0, 0);
            AnonymousClass2g1 r22 = AnonymousClass2g1.APP_ICON;
            0qQ.A0B(r22, 0);
            if (AnonymousClass0xl.A00(r13).A00.getBoolean("launcher_badge_supported", false)) {
                r0 = C226252fx.NUMBERED;
            } else {
                r0 = C226252fx.DOT;
            }
            C239993Jd r12 = new C239993Jd(r0, r22, (C71062aE) null, (Set) null);
            2aX r05 = (2aX) r14.A03.get();
            int i4 = r05.A01 + r05.A00;
            2aX r06 = (2aX) r14.A02.get();
            int i5 = r06.A01 + r06.A00;
            int i6 = r72.A00;
            String A032 = AnonymousClass4EN.A03(r72);
            String A022 = AnonymousClass4EN.A02(r12.A01);
            String A013 = AnonymousClass4EN.A01(r12.A00);
            AnonymousClass9MF r23 = new AnonymousClass9MF(43, r72, r14, r12);
            C377349Lm r07 = new C377349Lm((Object) r14, i4, i5, 4);
            2aV.A01(C294195m3.TAP, r14, (Integer) null, Integer.valueOf(i2), A032, A022, A013, r23, r07, AnonymousClass5m2.A00, i6, i4 + i5);
        }
        return C60340gF.A00;
    }
}
