package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.7jN  reason: invalid class name and case insensitive filesystem */
public final class C339297jN implements C339307jO {
    public static final String __redex_internal_original_name = "IgLiveComposeController";
    public View A00;
    public ImageView A01;
    public TextView A02;
    public C231002qi A03;
    public AnonymousClass3NV A04 = AnonymousClass3NV.A08;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Handler A08;
    public final ViewGroup A09;
    public final 2cs A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass82W A0C;
    public final AnonymousClass0iw A0D;
    public final UserSession A0E;
    public final C357638Yz A0F;
    public final C353398Hl A0G;
    public final C339407jY A0H;
    public final C339357jT A0I;
    public final C339337jR A0J;
    public final C230882qT A0K;
    public final AnonymousClass3NV A0L;
    public final C339317jP A0M = new Object();
    public final Boolean A0N;
    public final Long A0O;
    public final C41837B2s A0P;
    public final C339707k2 A0Q;
    public final C339697k1 A0R;
    public final String A0S;

    public final void D12(Intent intent, 28D r6, int i) {
        0qQ.A0B(r6, 2);
        this.A0B.registerLifecycleListener(this.A0G);
        if (i == -1) {
            28D r0 = 28D.A42;
            C41837B2s b2s = this.A0P;
            if (r6 == r0) {
                b2s.AI5();
            } else {
                b2s.Cpi(NetInfoModule.CONNECTION_TYPE_NONE);
            }
        } else if (i != 6001) {
            String A002 = C273654mx.A00(110);
            if (intent != null && intent.hasExtra(A002)) {
                String stringExtra = intent.getStringExtra(A002);
                C310336ap r1 = new C310336ap();
                r1.A05();
                r1.A0H = AnonymousClass000.A00(3511);
                r1.A0D = stringExtra;
                1xC.A01.A00(new AnonymousClass3GP(r1.A00()));
            }
            C71342cb.A00(this.A0E).A0E("unknown", this.A0D);
            return;
        }
        C339407jY r3 = this.A0H;
        C339407jY.A01(C339417jZ.A03, r3);
        C339407jY.A02(r3);
        C339407jY.A09(r3, (String) null, new ArrayList(), false);
        r3.A02 = null;
        r3.A08 = new ArrayList();
        r3.A0D(AnonymousClass3NV.A08, false);
        r3.A0B = false;
        C339407jY.A00(C358088aL.A0c, r3, false);
        r3.A0N.A09(true);
    }

    public final void Dzb(C279284yO r6) {
        0qQ.A0B(r6, 0);
        this.A06 = true;
        if (r6 == AnonymousClass80L.A00) {
            A00(this);
        }
        1pS A002 = C2601144i.A00();
        UserSession userSession = this.A0E;
        String str = C339717k3.A00(userSession).A02;
        C339697k1 r1 = this.A0R;
        A002.A05(userSession, this.A0Q, r1, str);
        C2601144i.A00().A06(userSession, r1);
        if (C339637jv.A00(userSession).A00 != null) {
            C339407jY.A06(this.A0H);
        }
    }

    public static final void A00(C339297jN r5) {
        r5.A0I.A03(C391019sD.LIVE);
        if (r5.A06) {
            r5.A06 = false;
            AnonymousClass3NV r4 = r5.A0L;
            if (r4 != null) {
                UserSession userSession = r5.A0E;
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A05, userSession, 36320451068174815L)) {
                    r5.A0H.A0D(r4, true);
                    return;
                }
            }
            if (r4 != null && r4 != AnonymousClass3NV.A08) {
                if (!182.A06(0Tu.A05, r5.A0E, 36323865567178313L)) {
                    r5.A08.postDelayed(new C40824Aju(r5), 200);
                }
            }
        }
    }

    public static final void A01(C339297jN r4) {
        Window window;
        AnonymousClass4DH r2 = r4.A0B;
        Activity rootActivity = r2.getRootActivity();
        if (rootActivity != null) {
            window = rootActivity.getWindow();
        } else {
            window = null;
        }
        if (r2.isAdded() && window != null) {
            window.clearFlags(128);
        }
        r4.A0A.A06(0.0d);
        View view = r4.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        r4.A08.removeCallbacksAndMessages((Object) null);
    }

    public final void DJo() {
        String str;
        String str2;
        AnonymousClass3NV r0;
        String str3;
        String str4;
        NewFundraiserInfo newFundraiserInfo;
        FundraiserDisplayInfoModel fundraiserDisplayInfoModel;
        UserSession userSession = this.A0E;
        if (C324536zU.A00(userSession)) {
            FFO.A02(this.A0B.requireContext(), userSession, "ig_live");
            return;
        }
        AnonymousClass82W r7 = this.A0C;
        CameraAREffect cameraAREffect = r7.A00().A05.A09;
        27r A012 = 27p.A01(userSession);
        28t r10 = 28t.A04;
        C59725JVj jVj = C59725JVj.LIVE;
        C279294yP r9 = C279294yP.LIVE;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
            str2 = null;
        }
        A012.A0y(r9, r10, jVj, str, str2);
        Object obj = this.A0F.A08.A00;
        if (obj != AnonymousClass80L.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(2351));
            sb.append(obj);
            0kD.A07("ig_live", sb.toString(), (Throwable) null);
            return;
        }
        AnonymousClass4DH r2 = this.A0B;
        Context applicationContext = r2.requireContext().getApplicationContext();
        1X9 A002 = AnonymousClass38W.A00();
        0qQ.A0A(applicationContext);
        if (A002.A02(applicationContext, userSession)) {
            C358248ab r1 = new C358248ab(r2.requireContext());
            r1.A09(2131965436);
            r1.A08(2131965435);
            r1.A06();
            r1.A04();
            AnonymousClass0fN.A00(r1.A02());
            return;
        }
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36318221980211199L)) {
            r0 = this.A04;
        } else {
            r0 = this.A0H.A05;
        }
        boolean z = false;
        if (r0 == AnonymousClass3NV.A06) {
            z = true;
        }
        CameraAREffect A013 = r7.A00().A01();
        if (A013 == null || (A013.A0f && !z)) {
            str3 = null;
        } else {
            str3 = A013.A0K;
        }
        C339407jY r8 = this.A0H;
        String str5 = r8.A07;
        ArrayList arrayList = r8.A08;
        C339417jZ r6 = r8.A01;
        if (r6 == C339417jZ.A02) {
            str4 = r8.A06;
            newFundraiserInfo = r8.A04;
            fundraiserDisplayInfoModel = r8.A03;
        } else {
            str4 = null;
            newFundraiserInfo = null;
            fundraiserDisplayInfoModel = null;
        }
        boolean z2 = false;
        if (r6 == C339417jZ.A0A) {
            z2 = true;
        }
        boolean z3 = r8.A0B;
        LEQ A014 = C357488Yc.A03.A00(r2.requireContext(), userSession).A01();
        A014.A00.Epw(r0);
        A014.A01.Epw(arrayList);
        A014.A02.Epw(new C64082LMa(fundraiserDisplayInfoModel, newFundraiserInfo, str4));
        A014.A03.Epw((Object) null);
        A014.A04.Epw(Boolean.valueOf(z2));
        A014.A05.Epw(this.A0O);
        A014.A06.Epw(str3);
        A014.A07.Epw(Boolean.valueOf(z3));
        A014.A08.Epw(C339717k3.A00(userSession).A02);
        A014.A09.Epw(str5);
        C71342cb.A00(userSession).A0D(this.A0D, "button", this.A07 + 1);
        Class<ModalActivity> cls = ModalActivity.class;
        Bundle bundle = new Bundle();
        Object A003 = 0mE.A00(r2.requireContext(), Activity.class);
        if (A003 != null) {
            AnonymousClass6W8 r11 = new AnonymousClass6W8((Activity) A003, bundle, userSession, cls, C273654mx.A00(747));
            r11.A0J = ModalActivity.A08;
            r11.A0B = true;
            r11.A0D(r2, 5150);
            C353398Hl r02 = this.A0G;
            r2.unregisterLifecycleListener(r02);
            r02.A06();
            r02.A07();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getModuleName() {
        return this.A0S;
    }

    public final void onDestroyView() {
        AnonymousClass4DH r5 = this.A0B;
        r5.unregisterLifecycleListener(this.A0K);
        C339407jY r4 = this.A0H;
        UserSession userSession = r4.A0K;
        AnonymousClass1Nd.A00(userSession).A02(r4.A0J, C339547jm.class);
        AnonymousClass1Nd.A00(userSession).A02(r4.A0I, C339557jn.class);
        r5.unregisterLifecycleListener(r4);
        r5.unregisterLifecycleListener(this.A0G);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.7jP] */
    public C339297jN(ViewGroup viewGroup, AnonymousClass4DH r41, AnonymousClass82W r42, AnonymousClass0iw r43, UserSession userSession, C357638Yz r45, AnonymousClass8E7 r46, C41837B2s b2s, C353398Hl r48, FundraiserSharedToLive fundraiserSharedToLive, AnonymousClass3NV r50, Boolean bool, Long l, String str, int i) {
        AnonymousClass8E7 r10 = r46;
        0qQ.A0B(r10, 2);
        C353398Hl r9 = r48;
        0qQ.A0B(r9, 8);
        AnonymousClass0iw r2 = r43;
        0qQ.A0B(r2, 9);
        AnonymousClass82W r5 = r42;
        0qQ.A0B(r5, 15);
        AnonymousClass4DH r12 = r41;
        this.A0B = r12;
        UserSession userSession2 = userSession;
        C339327jQ r3 = new C339327jQ(userSession2, this);
        this.A0J = r3;
        C357638Yz r11 = r45;
        this.A0F = r11;
        this.A08 = new Handler(Looper.getMainLooper());
        r11.A0F(new C339347jS(this));
        this.A0P = b2s;
        ViewGroup viewGroup2 = viewGroup;
        this.A09 = viewGroup2;
        this.A0E = userSession2;
        this.A07 = i;
        this.A0I = new C339357jT(viewGroup2, r12, userSession2, r11);
        this.A0D = r2;
        this.A0C = r5;
        AnonymousClass3NV r52 = r50;
        this.A0L = r52;
        Boolean bool2 = bool;
        this.A0N = bool2;
        this.A0G = r9;
        2cs A022 = C61340me.A00().A02();
        A022.A08(0.0d, true);
        A022.A0A(new C339367jU(this));
        this.A0A = A022;
        this.A0O = l;
        1YN A002 = AnonymousClass2bO.A00();
        HashMap hashMap = new HashMap();
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.LIVE_CREATE_TITLE_BUTTON;
        hashMap.put(qPTooltipAnchor, new C339377jV());
        hashMap.put(QPTooltipAnchor.LIVE_CREATE_FUNDRAISER_BUTTON, new C339377jV());
        hashMap.put(QPTooltipAnchor.LIVE_CREATE_SHOPPING_BUTTON, new C339377jV());
        hashMap.put(QPTooltipAnchor.LIVE_CREATE_USER_PAY_BUTTON, new C339377jV());
        QPTooltipAnchor qPTooltipAnchor2 = QPTooltipAnchor.LIVE_CREATE_DETAILS_BUTTON;
        hashMap.put(qPTooltipAnchor2, new C339377jV());
        hashMap.put(QPTooltipAnchor.LIVE_SCHEDULED_LIVE_CREATION_BUTTON, new C339377jV());
        hashMap.put(QPTooltipAnchor.LIVE_SCHEDULED_LIVE_MANAGEMENT_BUTTON, new C339377jV());
        C230882qT A042 = A002.A04(userSession2, hashMap);
        this.A0K = A042;
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0b;
        AnonymousClass2bO.A00();
        C231002qi A012 = A003.A01(r12, r12, userSession2, 2bV.A00((C230942qc) null, (AnonymousClass574) null, new C339397jX(userSession2, this), (AnonymousClass2bQ) null, (C230902qW) null, (AnonymousClass573) null, (C230972qf) null, (C71212bU) null, new C339387jW(this), (C71202bS) null, A042, (AnonymousClass575) null, (Boolean) null), quickPromotionSlot);
        this.A03 = A012;
        C339407jY r19 = new C339407jY(r12, this, userSession2, r11, r10, r9, fundraiserSharedToLive, A012, A042, str);
        this.A0H = r19;
        if (!(r50 == null || !C342557on.A00(userSession2).A00().contains(r52) || this.A04 == r52)) {
            this.A04 = r52;
            r3.CwQ(r52);
            if (0qQ.A0K(bool2, true)) {
                r19.A0C(r12.requireView(), r52);
            }
        }
        r12.registerLifecycleListener(A042);
        r12.registerLifecycleListener(r19);
        r12.registerLifecycleListener(r9);
        AnonymousClass8E7 r192 = r19.A0M;
        AnonymousClass8E8 A004 = r192.A00();
        C358088aL r112 = r19.A00;
        A004.A08(r112, new AnonymousClass9M5(2, r19, viewGroup2));
        AnonymousClass8E8 A005 = r192.A00();
        C230882qT r102 = r19.A0P;
        C231002qi r92 = r19.A0O;
        boolean z = r19.A0C;
        A005.A07(r112, z ? qPTooltipAnchor2 : qPTooltipAnchor, r92, r102);
        C339407jY.A03(r19);
        C339407jY.A05(r19);
        C339407jY.A04(r19);
        UserSession userSession3 = r19.A0K;
        if (2R8.A00(userSession3)) {
            C357638Yz r1 = r19.A0L;
            if (0qQ.A0K(r1.A08.A00, AnonymousClass80L.A00)) {
                C339407jY.A07(r19);
            }
            r1.A0F(new AYS(r19));
            r192.A00().A08(C358088aL.A0Z, new C66309MMs(r19, 25));
        } else {
            0xY AR4 = C339667jy.A03.A00(userSession3).A01.AR4();
            AR4.E5T("ig_live_employee_only_mode", false);
            AR4.apply();
        }
        if (182.A06(0Tu.A05, userSession3, 36318221980211199L)) {
            r19.A0L.A0J(AnonymousClass80L.A00, C358088aL.A0V, false);
        } else {
            if (C278264wZ.A02(userSession3)) {
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376889Js(r19, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(r19.A0G.getViewLifecycleOwner()));
            }
            r192.A00().A08(C358088aL.A0V, new AnonymousClass9M5(1, r19, viewGroup2));
            r192.A00().A07(r112, z ? qPTooltipAnchor2 : qPTooltipAnchor, r92, r102);
        }
        String str2 = r19.A0R;
        if (str2 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new C41035AnJ(r19, str2), 500);
        }
        this.A0R = new C339687k0(this);
        this.A0Q = new C339707k2(userSession2, this, r52, bool2);
        this.A0S = "live_composer";
    }
}
