package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.concurrent.CancellationException;

/* renamed from: X.Lgj  reason: case insensitive filesystem */
public final class C64710Lgj implements C252243on, C252213ok, C339307jO {
    public static final String __redex_internal_original_name = "IgLivePreLiveView";
    public C231002qi A00;
    public C262204Co A01;
    public C262204Co A02;
    public final int A03;
    public final Context A04;
    public final ViewGroup A05;
    public final 2cs A06;
    public final 2cs A07;
    public final LgJ A08;
    public final LgJ A09;
    public final AnonymousClass4DH A0A;
    public final AnonymousClass82W A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;
    public final AnonymousClass3E6 A0E;
    public final C357638Yz A0F;
    public final AnonymousClass8E8 A0G;
    public final C41837B2s A0H;
    public final C353398Hl A0I;
    public final C339357jT A0J;
    public final C230882qT A0K;
    public final String A0L;
    public final AnonymousClass0eM A0M = C66302MMl.A00(this, 40);
    public final AnonymousClass0eM A0N = C66302MMl.A00(this, 41);
    public final AnonymousClass0eM A0O = C66302MMl.A00(this, 42);
    public final AnonymousClass0eM A0P = C66302MMl.A00(this, 43);
    public final AnonymousClass0eM A0Q = C66302MMl.A00(this, 44);
    public final AnonymousClass0eM A0R = C66302MMl.A00(this, 45);
    public final AnonymousClass0eM A0S = C66302MMl.A00(this, 46);
    public final AnonymousClass0eM A0T = C66302MMl.A00(this, 47);
    public final AnonymousClass0eM A0U = C66302MMl.A00(this, 48);
    public final AnonymousClass0eM A0V;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D12(Intent intent, 28D r8, int i) {
        String str;
        0qQ.A0B(r8, 2);
        this.A0E.onStop();
        C60312JjF A002 = A00(this);
        if (intent != null) {
            str = intent.getStringExtra(C273654mx.A00(110));
        } else {
            str = null;
        }
        if (i == -1) {
            int ordinal = r8.ordinal();
            if (ordinal == 70) {
                MGU.A02(A002, C318116oQ.A00(A002), 24);
            }
            A002.A00.A00();
            MGU.A02(A002, C318116oQ.A00(A002), 25);
            if (ordinal != 70) {
                this.A0H.Cpi(NetInfoModule.CONNECTION_TYPE_NONE);
            }
        } else if (i != 6001) {
            if (str != null) {
                DbX.A1W(A002, str, C318116oQ.A00(A002), 36);
            }
            A002.A06.A0E("unknown", A002.A07);
        } else {
            A002.A00.A00();
            MGU.A02(A002, C318116oQ.A00(A002), 23);
        }
        C262204Co r0 = this.A01;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A01 = null;
        C262204Co r02 = this.A02;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A02 = null;
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void Dzb(C279284yO r7) {
        0qQ.A0B(r7, 0);
        JTP.A18(this.A0A, this.A0E);
        C60312JjF A002 = A00(this);
        if (r7 == AnonymousClass80L.A00) {
            C60312JjF.A02(A002);
        }
        LEQ leq = A002.A00;
        leq.A08.Epw(A002.A0A.A02);
        A002.A0H.A05(A002.A08, (C339707k2) null, new M03(A002), JTO.A11(A002.A00.A0I));
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public /* synthetic */ C64710Lgj(ViewGroup viewGroup, AnonymousClass4DH r32, AnonymousClass82W r33, AnonymousClass0iw r34, UserSession userSession, C357638Yz r36, AnonymousClass8E8 r37, C41837B2s b2s, C353398Hl r39, int i) {
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass4DH r4 = r32;
        UserSession userSession2 = userSession;
        C357638Yz r2 = r36;
        C339357jT r6 = new C339357jT(viewGroup2, r4, userSession2, r2);
        Context requireContext = r4.requireContext();
        AnonymousClass8E8 r7 = r37;
        C353398Hl r8 = r39;
        AnonymousClass7TF.A1F(r7, 2, r8);
        AnonymousClass0iw r12 = r34;
        0qQ.A0B(r12, 9);
        AnonymousClass82W r15 = r33;
        0qQ.A0B(r15, 10);
        this.A0A = r4;
        this.A0G = r7;
        this.A0F = r2;
        this.A0H = b2s;
        this.A05 = viewGroup2;
        this.A0D = userSession2;
        this.A03 = i;
        this.A0I = r8;
        this.A0C = r12;
        this.A0B = r15;
        this.A0J = r6;
        this.A04 = requireContext;
        C66298MMh A012 = C66298MMh.A01(this, 2);
        AnonymousClass0eM A002 = C66298MMh.A00(new C66302MMl(r4, 49), 0eO.A02, 0);
        this.A0V = DbS.A0I(C66298MMh.A01(A002, 1), A012, C66304MMn.A01(A002, (Object) null, 48), DbS.A0z(C60312JjF.class));
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A08(0.0d, true);
        K0E.A00(A0J2, this, 10);
        this.A07 = A0J2;
        2cs A0J3 = AnonymousClass7TF.A0J();
        A0J3.A08(0.0d, true);
        K0E.A00(A0J3, this, 9);
        this.A06 = A0J3;
        1YN A003 = AnonymousClass2bO.A00();
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.LIVE_CREATE_TITLE_BUTTON;
        0eP A013 = A01(qPTooltipAnchor);
        QPTooltipAnchor qPTooltipAnchor2 = QPTooltipAnchor.LIVE_CREATE_FUNDRAISER_BUTTON;
        0eP A014 = A01(qPTooltipAnchor2);
        0eP A015 = A01(QPTooltipAnchor.LIVE_CREATE_SHOPPING_BUTTON);
        0eP A016 = A01(QPTooltipAnchor.LIVE_CREATE_USER_PAY_BUTTON);
        QPTooltipAnchor qPTooltipAnchor3 = QPTooltipAnchor.LIVE_CREATE_DETAILS_BUTTON;
        0eP A017 = A01(qPTooltipAnchor3);
        QPTooltipAnchor qPTooltipAnchor4 = QPTooltipAnchor.LIVE_SCHEDULED_LIVE_CREATION_BUTTON;
        0eP A018 = A01(qPTooltipAnchor4);
        QPTooltipAnchor qPTooltipAnchor5 = QPTooltipAnchor.LIVE_SCHEDULED_LIVE_MANAGEMENT_BUTTON;
        C230882qT A042 = A003.A04(userSession2, 0Yt.A07(new 0eP[]{A013, A014, A015, A016, A017, A018, A01(qPTooltipAnchor5)}));
        this.A0K = A042;
        AnonymousClass3E5 A019 = AnonymousClass3E4.A01(this, false, false);
        this.A0E = A019;
        this.A09 = new LgJ(this, 13);
        this.A08 = new LgJ(this, 12);
        r4.registerLifecycleListener(this);
        1YN A004 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0b;
        AnonymousClass2bO.A00();
        C231002qi A0110 = A004.A01(r4, r4, userSession2, 2bV.A01((C230942qc) null, new C50733FhY(this, 6), (C230902qW) null, new LvU(this, 4), (C71202bS) null, A042, (Boolean) null), quickPromotionSlot);
        this.A00 = A0110;
        r2.A0F(new C66097MBf(this));
        r15.A00().A08(new C66096MBe(this));
        AnonymousClass4DH r22 = this.A0A;
        r22.registerLifecycleListener(this.A0K);
        r22.registerLifecycleListener(this.A0I);
        A019.A9Y(this);
        LY5.A01(AnonymousClass7TH.A06(this.A0S), 55, this);
        LY5.A01(AnonymousClass7TH.A06(this.A0T), 56, this);
        AnonymousClass8E8 r62 = this.A0G;
        C358088aL r42 = C358088aL.A0d;
        r62.A08(r42, new MPC(this, 18));
        r62.A07(r42, qPTooltipAnchor, A0110, this.A0K);
        AnonymousClass8E8 r63 = this.A0G;
        C358088aL r43 = C358088aL.A0X;
        r63.A08(r43, new MPC(this, 14));
        r63.A07(r43, qPTooltipAnchor3, A0110, this.A0K);
        AnonymousClass8E8 r64 = this.A0G;
        C358088aL r44 = C358088aL.A0Y;
        r64.A08(r44, new MPC(this, 15));
        r64.A07(r44, qPTooltipAnchor2, A0110, this.A0K);
        1Ng A005 = AnonymousClass1Nd.A00(this.A0D);
        A005.A01(this.A09, C339547jm.class);
        A005.A01(this.A08, C339557jn.class);
        AnonymousClass8E8 r65 = this.A0G;
        C358088aL r45 = C358088aL.A0a;
        r65.A08(r45, new MPC(this, 16));
        r65.A07(r45, C339637jv.A00(this.A0D).A01.isEmpty() ? qPTooltipAnchor4 : qPTooltipAnchor5, A0110, this.A0K);
        this.A0G.A08(C358088aL.A0V, new MPC(this, 13));
        this.A0G.A08(C358088aL.A0c, new MPC(this, 17));
        A03();
        A02();
        this.A0L = "live_composer";
    }

    public static C60312JjF A00(C64710Lgj lgj) {
        return (C60312JjF) lgj.A0V.getValue();
    }

    public static 0eP A01(Object obj) {
        return new 0eP(obj, new C339377jV());
    }

    private final void A02() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass11O.A03(DbV.A0J(this.A0A), MHB.A02(this, A00(this).A0J, 9));
        }
    }

    private final void A03() {
        if (this.A02 == null) {
            this.A02 = AnonymousClass11O.A03(DbV.A0J(this.A0A), MHB.A02(this, new AnonymousClass0qC(A00(this).A0T), 10));
        }
    }

    public static final void A04(C358088aL r2, C64710Lgj lgj, boolean z, boolean z2) {
        C357638Yz r1 = lgj.A0F;
        r1.A0J(AnonymousClass80L.A00, r2, z);
        if (z2 != C357638Yz.A03(r2, r1)) {
            r1.A0L(r2);
        }
    }

    public final void DJo() {
        String str;
        C318136oS A002;
        int i;
        CameraAREffect cameraAREffect = this.A0B.A00().A05.A09;
        C60312JjF A003 = A00(this);
        boolean A022 = AnonymousClass38W.A00().A02(this.A04, this.A0D);
        String str2 = null;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
        }
        27p.A01(A003.A08).A0y(C279294yP.LIVE, 28t.A04, C59725JVj.LIVE, str, str2);
        C357638Yz r2 = A003.A09;
        if (r2.A08.A00 != AnonymousClass80L.A00) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(AnonymousClass000.A00(2351));
            A1A.append(r2);
            0wb.A03("ig_live", AnonymousClass7TF.A0l(".cameraDestination", A1A));
        } else {
            if (A022) {
                A002 = C318116oQ.A00(A003);
                i = 31;
            } else {
                A003.A06.A0D(A003.A07, "button", A003.A05 + 1);
                A003.A00.A0C.getValue();
                A002 = C318116oQ.A00(A003);
                i = 32;
            }
            MGU.A02(A003, A002, i);
        }
        C262204Co r0 = this.A01;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A01 = null;
        C262204Co r02 = this.A02;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A02 = null;
    }

    public final String getModuleName() {
        return this.A0L;
    }

    public final void onDestroyView() {
        C262204Co r0 = this.A01;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A01 = null;
        C262204Co r02 = this.A02;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A02 = null;
        AnonymousClass4DH r1 = this.A0A;
        r1.unregisterLifecycleListener(this.A0K);
        r1.unregisterLifecycleListener(this.A0I);
        UserSession userSession = this.A0D;
        AnonymousClass1Nd.A00(userSession).A02(this.A09, C339547jm.class);
        AnonymousClass1Nd.A00(userSession).A02(this.A08, C339557jn.class);
    }

    public final void onPause() {
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A02 = null;
        C262204Co r02 = this.A01;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A01 = null;
    }

    public final void DMr(int i, boolean z) {
        C60312JjF A002 = A00(this);
        JTP.A1W(A002.A0P, i);
        if (i == 0) {
            MGU.A02(A002, C318116oQ.A00(A002), 33);
        }
    }

    public final void onResume() {
        A03();
        A02();
    }
}
