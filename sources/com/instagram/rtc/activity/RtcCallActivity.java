package com.instagram.rtc.activity;

import X.0Jv;
import X.0QT;
import X.0Tu;
import X.0Yh;
import X.0eO;
import X.0q1;
import X.0qQ;
import X.0rq;
import X.18q;
import X.2Dd;
import X.2De;
import X.2MD;
import X.2dZ;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass37D;
import X.AnonymousClass4DS;
import X.C249453jo;
import X.C59900bo;
import X.C61170le;
import X.C62880wX;
import X.C638918c;
import X.C66953Mfm;
import X.C70845ONx;
import X.C71111Ocu;
import X.C71342cb;
import X.C71497Olm;
import X.C71632eX;
import X.C71782Oqi;
import X.C71835Orc;
import X.C72860PMw;
import X.C72862PMy;
import X.C72974PRh;
import X.C73839Pkc;
import X.C73840Pkd;
import X.C73925Pm5;
import X.DbY;
import X.O26;
import X.O29;
import X.OEO;
import X.OJ3;
import X.PL4;
import X.PNY;
import X.Pxm;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

public final class RtcCallActivity extends IgFragmentActivity implements AnonymousClass0iw, AnonymousClass07Z, C249453jo {
    public static final OJ3 A0C = new Object();
    public 2dZ A00;
    public UserSession A01;
    public C70845ONx A02;
    public 0Jv A03;
    public C71632eX A04;
    public final AnonymousClass4DS A05 = C71835Orc.A00;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(C73839Pkc.A00);
    public final AnonymousClass0eM A07 = C73925Pm5.A00(this, 5);
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A00(0eO.A02, C73840Pkd.A00);
    public final C71782Oqi A09;
    public final C71497Olm A0A = new C71497Olm(this, 3);
    public final 0QT A0B;

    public final void configureWindowInsetsAndroid15() {
    }

    public final String getModuleName() {
        return "rtc_call";
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            0qQ.A0F("presenterBridge");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oNx.A04.A05(new C72860PMw(configuration));
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            0qQ.A0F("presenterBridge");
            throw AnonymousClass00P.createAndThrow();
        }
        oNx.A04.A05(new C72862PMy(i));
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.instagram.rtc.activity.RtcCallActivity] */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        0qQ.A0B(configuration, 1);
        RtcCallActivity.super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            setTheme(R.style.CallTheme);
        }
    }

    public final 2dZ AYJ() {
        2dZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_actionBarService");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Prz] */
    public final void onBackPressed() {
        AnonymousClass37D r0 = this.mBottomSheetNavigator;
        if (r0 == null || !r0.A0X()) {
            C70845ONx oNx = this.A02;
            if (oNx == null) {
                0qQ.A0F("presenterBridge");
                throw AnonymousClass00P.createAndThrow();
            } else if (!oNx.A04.A07(new Object())) {
                super.onBackPressed();
            }
        }
    }

    public RtcCallActivity() {
        C71782Oqi oqi = new C71782Oqi(this, 2);
        this.A09 = oqi;
        this.A0B = new 0QT(new C59900bo[]{oqi});
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            0qQ.A0F("presenterBridge");
            throw AnonymousClass00P.createAndThrow();
        }
        PNY pny = new PNY(i, i2, intent);
        C71111Ocu ocu = oNx.A04;
        if (ocu.A01 == null) {
            oNx.A00 = pny;
        } else {
            ocu.A05(pny);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.activity.ComponentActivity, android.content.Context, java.lang.Object, com.instagram.rtc.activity.RtcCallActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: type inference failed for: r0v111, types: [X.OdY] */
    /* JADX WARNING: type inference failed for: r20v24, types: [X.Nef] */
    /* JADX WARNING: type inference failed for: r20v25, types: [X.Nel] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x02fc, code lost:
        if (X.182.A06(r8, r9, 36320747421311799L) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x02ff, code lost:
        if (r15 == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0301, code lost:
        r12.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0305, code lost:
        r1 = new X.PMS(r10, r11, r15, r0);
        r15 = new X.PMB(r10, r11);
        r16 = r12.A0F;
        r22 = r9;
        r6.A00(new X.C69102Neh(r21, r22, r16, r13, r5, r1, r15, r31));
        r23 = r13;
        r24 = r5;
        r6.A00(new X.C69104Nej(r17, r22, r23, r24, r30));
        r6.A00(new X.C69092NeX(r10, r22, r23, r24, r20.A09));
        r22 = r10;
        r23 = r11;
        r24 = r9;
        r6.A00(new X.C69088NeS(r7, r22, r23, r24, r5));
        r20 = new X.C70977OTy(r17, r22, r23, r24, r29);
        r6.A00(new X.C69087NeR(r9, r13, r5, r20));
        r21 = r7;
        r6.A00(new X.C69091NeW(r21, r9, r16, r13, r20));
        r22 = r10;
        r25 = r5;
        r6.A00(new X.C69080NeK(r21, r22, r11, r9, r25, new X.PM2(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x03ac, code lost:
        if (X.182.A06(X.0Tu.A06, r9, 2342157434442746402L) == false) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x03ae, code lost:
        r6.A00(new X.C69096Neb(r21, r22, r9, r13, r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x03c5, code lost:
        if (X.182.A06(r8, r9, 2342172561317576880L) == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x03c7, code lost:
        r6.A00(new X.C69079NeJ(r10, r7, r9, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x03cf, code lost:
        r1 = X.AnonymousClass7TE.A1E();
        r15 = X.C69094NeZ.class;
        r10 = X.C69107Nem.class;
        r9 = X.C69103Nei.class;
        r1.put(X.DbS.A0z(X.PMW.class), X.0sr.A1P(new X.C62230ry[]{X.DbS.A0z(r15), X.DbS.A0z(r10), X.DbS.A0z(r9)}));
        r1.put(X.DbS.A0z(X.PMX.class), X.0sr.A1P(new X.C62230ry[]{X.DbS.A0z(r15), X.DbS.A0z(r9)}));
        r1.put(X.DbS.A0z(X.PMZ.class), X.0sr.A1P(new X.C62230ry[]{X.DbS.A0z(X.C69100Nef.class), X.DbS.A0z(r10), X.DbS.A0z(X.C69112Ner.class), X.DbS.A0z(X.C69109Neo.class), X.DbS.A0z(X.C69105Nek.class), X.DbS.A0z(X.C69108Nen.class)}));
        r1.put(X.DbS.A0z(X.PMY.class), X.AnonymousClass7TE.A1I(X.DbS.A0z(r9)));
        r6.A01 = r1;
        r7 = new X.C70845ONx(r13, r20.A0C.A00, r5, r6, r12);
        r4.A02 = r7;
        new X.C64309LZj(r4, X.C66580MXl.A14(r7, 34));
        X.Pxm.A08.A05.A09(r4.A0A);
        r1 = new android.content.IntentFilter(X.AnonymousClass000.A00(1087));
        r1.addAction("android.intent.action.SCREEN_ON");
        X.0DH.A00(r4.A0B, r4, r1);
        r2 = r3.findViewById(com.instagram.android.R.id.action_bar_container);
        X.C66580MXl.A1R(r2);
        r1 = X.2dY.A01(new X.C71396Ojv(r4, 28), (android.view.ViewGroup) r2);
        r4.A00 = r1;
        r1.A0X(r4.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x04b0, code lost:
        if (isInPictureInPictureMode() == false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x04b2, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x04b4, code lost:
        if (r1 != null) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x04b6, code lost:
        X.0qQ.A0F("presenterBridge");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x04f6, code lost:
        r1.A02(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x04fb, code lost:
        X.AnonymousClass0fD.A07(-689233622, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0503, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x02f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = 1203890981(0x47c1eb25, float:99286.29)
            int r19 = X.AnonymousClass0fD.A00(r0)
            r4 = r32
            X.0eM r6 = r4.A07
            X.0lg r2 = X.DbT.A0X(r6)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323667999075697(0x810c2f00062d71, double:3.0345721340620085E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            r5 = 0
            if (r0 != 0) goto L_0x04e0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            r4.A01 = r0
        L_0x0023:
            com.instagram.common.session.UserSession r2 = r4.A01
            java.lang.String r6 = "inCallUserSession"
            if (r2 == 0) goto L_0x04dc
            r0 = 36317083813810969(0x81063200001319, double:3.0304082687882085E-306)
            boolean r0 = X.DbY.A1Y(r8, r2, r0)
            if (r0 == 0) goto L_0x0049
            X.2X1 r2 = r4.getDelegate()
            r1 = 2
            X.2X4 r2 = (X.2X4) r2
            int r0 = r2.A02
            if (r0 == r1) goto L_0x0049
            r2.A02 = r1
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0049
            r0 = 1
            X.2X4.A0E(r2, r0, r0)
        L_0x0049:
            X.0wX r0 = X.C61170le.A00
            X.18g r1 = X.C638918c.A01(r0)
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.PRh r0 = (X.C72974PRh) r0
            r1.A0R(r0)
            r0 = r33
            super.onCreate(r0)
            r0 = 2132017443(0x7f140123, float:1.9673165E38)
            r4.setTheme(r0)
            r4.setupColorTheme()
            r0 = 2131626407(0x7f0e09a7, float:1.888005E38)
            r4.setContentView((int) r0)
            android.view.Window r0 = r4.getWindow()
            X.0qQ.A07(r0)
            X.O29.A00(r4, r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            if (r0 == 0) goto L_0x04dc
            X.2De r1 = X.2Dd.A00(r0)
            X.0eM r0 = r4.A06
            java.lang.Object r2 = r0.getValue()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.List r1 = r1.A00
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x0095
            r1.add(r2)
        L_0x0095:
            r0 = 2131429386(0x7f0b080a, float:1.8480443E38)
            android.view.View r3 = r4.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.0qQ.A0A(r3)
            r1 = 3
            X.Olh r0 = new X.Olh
            r0.<init>(r4, r1)
            X.AnonymousClass03j.A00(r3, r0)
            X.2ej r0 = X.C71682ef.A00()
            X.2el r5 = X.C71682ef.A01(r5, r0)
            X.2eX r2 = new X.2eX
            r2.<init>(r3)
            r4.A04 = r2
            r18 = 1
            r0 = 2131429356(0x7f0b07ec, float:1.8480382E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r3, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            X.OzS r0 = new X.OzS
            r0.<init>(r1)
            X.2eo[] r0 = new X.AnonymousClass2eo[]{r0}
            r5.A08(r3, r2, r0)
            com.instagram.common.session.UserSession r1 = r4.A01
            if (r1 == 0) goto L_0x04dc
            X.0hq r23 = r4.getSupportFragmentManager()
            X.0qQ.A07(r23)
            r14 = 34
            X.PgO r28 = X.C66580MXl.A15(r4, r14)
            r0 = 35
            X.PgO r29 = X.C66580MXl.A15(r4, r0)
            X.OIN r2 = new X.OIN
            r24 = r4
            r25 = r4
            r26 = r1
            r27 = r5
            r20 = r2
            r21 = r3
            r22 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            android.view.ViewGroup r10 = r2.A00
            com.instagram.common.session.UserSession r9 = r2.A04
            X.PMH r1 = new X.PMH
            r1.<init>(r10, r9)
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            X.Ocu r5 = r2.A07
            X.0sa r0 = r2.A0F
            r31 = r0
            X.OKY r13 = r2.A06
            r0 = 58
            X.PgO r27 = X.C66580MXl.A15(r2, r0)
            r0 = 59
            X.PgO r28 = X.C66580MXl.A15(r2, r0)
            X.Nee r0 = new X.Nee
            r22 = r9
            r23 = r13
            r24 = r5
            r25 = r1
            r26 = r31
            r21 = r7
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            X.OLU r6 = r2.A08
            r6.A00(r0)
            X.PMU r11 = new X.PMU
            r11.<init>(r7, r10, r9, r5)
            X.OZx r1 = r2.A0E
            X.Nen r0 = new X.Nen
            r20 = r0
            r22 = r10
            r23 = r9
            r24 = r13
            r25 = r5
            r26 = r11
            r27 = r1
            r28 = r31
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            X.Nec r0 = new X.Nec
            r0.<init>(r5)
            r6.A00(r0)
            X.PMP r11 = new X.PMP
            r11.<init>(r10, r9)
            X.Nem r0 = new X.Nem
            r0.<init>(r7, r9, r5, r11)
            r6.A00(r0)
            X.Nei r0 = new X.Nei
            r0.<init>(r7, r9, r13, r5)
            r6.A00(r0)
            android.content.Context r17 = X.AnonymousClass7TE.A0S(r10)
            X.0hq r12 = r2.A02
            X.PM1 r11 = new X.PM1
            r0 = r17
            r11.<init>(r0, r12, r9)
            X.NeT r0 = new X.NeT
            r22 = r9
            r23 = r13
            r24 = r5
            r25 = r11
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.0iw r11 = r2.A03
            X.POV r15 = new X.POV
            r15.<init>(r10, r11, r9, r1)
            X.Neo r0 = new X.Neo
            r22 = r17
            r23 = r11
            r24 = r9
            r25 = r13
            r26 = r5
            r27 = r15
            r28 = r1
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            X.OLF r0 = r2.A0D
            r30 = r0
            X.Nea r0 = new X.Nea
            r22 = r9
            r23 = r5
            r24 = r30
            r25 = r1
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.PME r15 = new X.PME
            r15.<init>(r10, r12, r9)
            X.NeO r0 = new X.NeO
            r0.<init>(r5, r15, r1)
            r6.A00(r0)
            X.Neq r0 = new X.Neq
            r0.<init>(r10, r9, r13, r5)
            r6.A00(r0)
            X.NeP r0 = new X.NeP
            r0.<init>()
            r6.A00(r0)
            X.PMQ r12 = new X.PMQ
            r12.<init>(r10)
            r0 = 36310327830380563(0x81000d00020013, double:3.026135757662658E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x04be
            X.Nel r0 = new X.Nel
            r22 = r17
            r23 = r9
            r24 = r13
            r25 = r5
            r26 = r12
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
        L_0x01ff:
            r6.A00(r0)
        L_0x0202:
            X.PM8 r1 = new X.PM8
            r1.<init>(r10)
            X.Ner r0 = new X.Ner
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r13
            r26 = r5
            r27 = r1
            r28 = r30
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            X.PMT r1 = new X.PMT
            r1.<init>(r10, r9)
            X.Nek r0 = new X.Nek
            r20 = r0
            r21 = r10
            r22 = r9
            r23 = r13
            r24 = r5
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.Neg r0 = new X.Neg
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r5
            r26 = r30
            r20 = r0
            r21 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.A00(r0)
            X.NeV r0 = new X.NeV
            r0.<init>(r7, r11, r9, r5)
            r6.A00(r0)
            X.0xi r16 = X.0tS.A4E
            X.0tS r15 = r16.A00()
            X.0s0 r12 = r15.A2z
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 94
            boolean r0 = X.AnonymousClass7TG.A1a(r15, r12, r1, r0)
            if (r0 == 0) goto L_0x0275
            X.PMC r1 = new X.PMC
            r1.<init>(r10)
            X.Ned r0 = new X.Ned
            r0.<init>(r5, r1)
            r6.A00(r0)
        L_0x0275:
            X.0tS r0 = r16.A00()
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0287
            X.NeN r0 = new X.NeN
            r0.<init>(r10, r5)
            r6.A00(r0)
        L_0x0287:
            X.PMG r12 = new X.PMG
            r12.<init>(r10, r11)
            X.0sa r1 = r2.A0G
            X.NeZ r0 = new X.NeZ
            r20 = r0
            r22 = r17
            r23 = r9
            r24 = r13
            r26 = r12
            r27 = r31
            r28 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            X.PM4 r1 = new X.PM4
            r1.<init>(r10)
            X.NeQ r0 = new X.NeQ
            r22 = r9
            r23 = r13
            r24 = r5
            r25 = r1
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.NeY r0 = new X.NeY
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r5
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.OWA r12 = r2.A0A
            X.OEO r1 = r12.A0G
            X.2el r0 = r2.A05
            r29 = r0
            X.Nep r0 = new X.Nep
            r20 = r0
            r25 = r29
            r26 = r1
            r27 = r13
            r28 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            r0 = 36320747420918578(0x81098700002332, double:3.032725148675222E-306)
            boolean r15 = X.182.A06(r8, r9, r0)
            if (r15 == 0) goto L_0x02fe
            r0 = 36320747421311799(0x81098700062337, double:3.032725148923897E-306)
            boolean r1 = X.182.A06(r8, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0301
        L_0x02fe:
            r0 = 0
            if (r15 == 0) goto L_0x0305
        L_0x0301:
            r1 = r18
            r12.A05 = r1
        L_0x0305:
            X.PMS r1 = new X.PMS
            r1.<init>(r10, r11, r15, r0)
            X.PMB r15 = new X.PMB
            r15.<init>(r10, r11)
            X.OFV r0 = r12.A0F
            r16 = r0
            X.Neh r0 = new X.Neh
            r20 = r0
            r22 = r9
            r23 = r16
            r24 = r13
            r25 = r5
            r26 = r1
            r27 = r15
            r28 = r31
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r0)
            X.Nej r0 = new X.Nej
            r20 = r0
            r21 = r17
            r23 = r13
            r24 = r5
            r25 = r30
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.O9L r1 = r2.A09
            X.NeX r0 = new X.NeX
            r20 = r0
            r21 = r10
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.NeS r0 = new X.NeS
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r5
            r20 = r0
            r21 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.OTy r1 = new X.OTy
            r20 = r1
            r21 = r17
            r25 = r29
            r20.<init>(r21, r22, r23, r24, r25)
            X.NeR r0 = new X.NeR
            r0.<init>(r9, r13, r5, r1)
            r6.A00(r0)
            X.NeW r0 = new X.NeW
            r22 = r9
            r23 = r16
            r24 = r13
            r25 = r1
            r20 = r0
            r21 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
            X.PM2 r1 = new X.PM2
            r1.<init>(r10)
            X.NeK r0 = new X.NeK
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r5
            r26 = r1
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.A00(r0)
            X.0Tu r11 = X.0Tu.A06
            r0 = 2342157434442746402(0x208103c700000a22, double:4.060858947368408E-152)
            boolean r0 = X.182.A06(r11, r9, r0)
            if (r0 == 0) goto L_0x03bc
            X.Neb r0 = new X.Neb
            r23 = r9
            r24 = r13
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A00(r0)
        L_0x03bc:
            r0 = 2342172561317576880(0x20811189000040b0, double:4.073685254047871E-152)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x03cf
            X.NeJ r0 = new X.NeJ
            r0.<init>(r10, r7, r9, r5)
            r6.A00(r0)
        L_0x03cf:
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.Class<X.PMW> r0 = X.PMW.class
            X.0Yh r8 = X.DbS.A0z(r0)
            java.lang.Class<X.NeZ> r15 = X.C69094NeZ.class
            X.0Yh r11 = X.DbS.A0z(r15)
            java.lang.Class<X.Nem> r10 = X.C69107Nem.class
            X.0Yh r7 = X.DbS.A0z(r10)
            java.lang.Class<X.Nei> r9 = X.C69103Nei.class
            X.0Yh r0 = X.DbS.A0z(r9)
            X.0ry[] r0 = new X.C62230ry[]{r11, r7, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r1.put(r8, r0)
            java.lang.Class<X.PMX> r0 = X.PMX.class
            X.0Yh r8 = X.DbS.A0z(r0)
            X.0Yh r7 = X.DbS.A0z(r15)
            X.0Yh r0 = X.DbS.A0z(r9)
            X.0ry[] r0 = new X.C62230ry[]{r7, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r1.put(r8, r0)
            java.lang.Class<X.PMZ> r0 = X.PMZ.class
            X.0Yh r0 = X.DbS.A0z(r0)
            java.lang.Class<X.Nef> r7 = X.C69100Nef.class
            X.0Yh r20 = X.DbS.A0z(r7)
            X.0Yh r21 = X.DbS.A0z(r10)
            java.lang.Class<X.Ner> r7 = X.C69112Ner.class
            X.0Yh r22 = X.DbS.A0z(r7)
            java.lang.Class<X.Neo> r7 = X.C69109Neo.class
            X.0Yh r23 = X.DbS.A0z(r7)
            java.lang.Class<X.Nek> r7 = X.C69105Nek.class
            X.0Yh r24 = X.DbS.A0z(r7)
            java.lang.Class<X.Nen> r7 = X.C69108Nen.class
            X.0Yh r25 = X.DbS.A0z(r7)
            X.0ry[] r7 = new X.C62230ry[]{r20, r21, r22, r23, r24, r25}
            java.util.List r7 = X.0sr.A1P(r7)
            r1.put(r0, r7)
            java.lang.Class<X.PMY> r0 = X.PMY.class
            X.0Yh r7 = X.DbS.A0z(r0)
            X.0Yh r0 = X.DbS.A0z(r9)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.put(r7, r0)
            r6.A01 = r1
            X.OER r0 = r2.A0C
            X.Pug r1 = r0.A00
            X.ONx r0 = new X.ONx
            r7 = r0
            r8 = r13
            r9 = r1
            r10 = r5
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r4.A02 = r0
            java.lang.String r5 = "presenterBridge"
            X.PgU r1 = X.C66580MXl.A14(r0, r14)
            X.LZj r0 = new X.LZj
            r0.<init>(r4, r1)
            X.Pxm r0 = X.Pxm.A08
            X.0h9 r1 = r0.A05
            X.Olm r0 = r4.A0A
            r1.A09(r0)
            r0 = 1087(0x43f, float:1.523E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            r1.addAction(r0)
            X.0QT r0 = r4.A0B
            X.0DH.A00(r0, r4, r1)
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r2 = r3.findViewById(r0)
            X.C66580MXl.A1R(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 28
            X.Ojv r0 = new X.Ojv
            r0.<init>(r4, r1)
            X.2dZ r1 = X.2dY.A01(r0, r2)
            r4.A00 = r1
            X.4DS r0 = r4.A05
            r1.A0X(r0)
            boolean r0 = r4.isInPictureInPictureMode()
            if (r0 == 0) goto L_0x04fb
            X.ONx r1 = r4.A02
            if (r1 != 0) goto L_0x04f6
            X.0qQ.A0F(r5)
        L_0x04b9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04be:
            r0 = 36310327830249489(0x81000d00000011, double:3.026135757579766E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0202
            X.Nef r0 = new X.Nef
            r22 = r17
            r23 = r9
            r24 = r13
            r25 = r5
            r26 = r12
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            goto L_0x01ff
        L_0x04dc:
            X.0qQ.A0F(r6)
            goto L_0x04b9
        L_0x04e0:
            r0 = 7
            X.PPn r3 = new X.PPn
            r3.<init>(r4, r0)
            X.08y r2 = X.09i.A0A
            java.lang.String r1 = X.DbU.A0u(r6)
            X.0t6 r0 = new X.0t6
            r0.<init>()
            r2.A0A(r0, r5, r3, r1)
            goto L_0x0023
        L_0x04f6:
            r0 = r18
            r1.A02(r0)
        L_0x04fb:
            r1 = -689233622(0xffffffffd6eb212a, float:-1.29263836E14)
            r0 = r19
            X.AnonymousClass0fD.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.activity.RtcCallActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.rtc.activity.RtcCallActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-1259745508);
        super.onDestroy();
        0Jv r1 = this.A03;
        if (r1 != null) {
            r1.AId((Object) null);
        }
        Pxm.A08.A05.A0A(this.A0A);
        unregisterReceiver(this.A0B);
        UserSession userSession = this.A01;
        if (userSession == null) {
            0qQ.A0F("inCallUserSession");
            throw AnonymousClass00P.createAndThrow();
        }
        2De A003 = 2Dd.A00(userSession);
        Object value = this.A06.getValue();
        0qQ.A0B(value, 0);
        A003.A00.remove(value);
        AnonymousClass0fD.A07(1912147577, A002);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.rtc.activity.RtcCallActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(1684719822);
        super.onPause();
        UserSession userSession = this.A01;
        if (userSession != null) {
            if (DbY.A1Y(0Tu.A05, userSession, 36314493948529272L)) {
                2MD.A01().A08.remove(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_REELS_TOGETHER);
            }
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                C66953Mfm.A00(this, userSession2).A09.A0H.A00(false);
                C71632eX r0 = this.A04;
                if (r0 != null) {
                    r0.A02();
                }
                AnonymousClass0fD.A07(876800186, A002);
                return;
            }
        }
        0qQ.A0F("inCallUserSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPostResume() {
        super.onPostResume();
        C62880wX r1 = C61170le.A00;
        C638918c.A01(r1).A0F();
        C72974PRh pRh = (C72974PRh) this.A08.getValue();
        0rq r3 = pRh.A00;
        if (r3 != null) {
            C638918c.A01(r1).A0L(r3, 18q.A03, (Long) null);
        }
        pRh.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.Ps0, java.lang.Object] */
    public final void onResume() {
        String str;
        int A002 = AnonymousClass0fD.A00(-818108545);
        super.onResume();
        long longExtra = getIntent().getLongExtra("rtc_call_activity_arguments_key_notification_trace_id", 0);
        UserSession userSession = this.A01;
        if (userSession == null) {
            str = "inCallUserSession";
        } else {
            OEO A003 = O26.A00(userSession);
            A003.A01.BWh(Long.valueOf(longExtra)).AIe("call_activity_on_resume");
            Class<?> cls = getClass();
            Map map = 0Yh.A03;
            0qQ.A0B(cls, 1);
            0q1.A00(cls);
            C70845ONx oNx = this.A02;
            str = "presenterBridge";
            if (oNx != null) {
                oNx.A03(true);
                2dZ r1 = this.A00;
                String str2 = "_actionBarService";
                if (r1 != null) {
                    r1.A0X(this.A05);
                    2dZ r0 = this.A00;
                    if (r0 != null) {
                        r0.A0T();
                        UserSession userSession2 = this.A01;
                        str2 = "inCallUserSession";
                        if (userSession2 != null) {
                            if (DbY.A1Y(0Tu.A05, userSession2, 36314493948529272L)) {
                                2MD.A01().A08.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_REELS_TOGETHER, (Object) null);
                            }
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                C66953Mfm.A00(this, userSession3).A09.A0H.A00(true);
                                C71632eX r02 = this.A04;
                                if (r02 != null) {
                                    r02.A01();
                                }
                                C70845ONx oNx2 = this.A02;
                                if (oNx2 != null) {
                                    oNx2.A04.A05(new Object());
                                    AnonymousClass0fD.A07(-2065037130, A002);
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(-721187148);
        super.onStart();
        C70845ONx oNx = this.A02;
        String str = "presenterBridge";
        if (oNx != null) {
            oNx.A00();
            C70845ONx oNx2 = this.A02;
            if (oNx2 != null) {
                oNx2.A03(true);
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "inCallUserSession";
                } else {
                    C71342cb.A00(userSession).A0E("ig_activity", this);
                    C638918c.A01(C61170le.A00).A0R((C72974PRh) this.A08.getValue());
                    AnonymousClass0fD.A07(-203850566, A002);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A002 = AnonymousClass0fD.A00(1087097273);
        super.onStop();
        C70845ONx oNx = this.A02;
        if (oNx != null) {
            oNx.A03(false);
            C70845ONx oNx2 = this.A02;
            if (oNx2 != null) {
                oNx2.A01();
                AnonymousClass0fD.A07(-1178881364, A002);
                return;
            }
        }
        0qQ.A0F("presenterBridge");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            0qQ.A0F("presenterBridge");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oNx.A02.A00(new PL4(i));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Prz] */
    public final void onUserLeaveHint() {
        RtcCallActivity.super.onUserLeaveHint();
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            0qQ.A0F("presenterBridge");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oNx.A04.A07(new Object());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.rtc.activity.RtcCallActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            0qQ.A07(window);
            O29.A00(this, window);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.activity.ComponentActivity, com.instagram.rtc.activity.RtcCallActivity, android.app.Activity] */
    public final void onPictureInPictureModeChanged(boolean z) {
        String str;
        RtcCallActivity.super.onPictureInPictureModeChanged(z);
        C70845ONx oNx = this.A02;
        if (oNx == null) {
            str = "presenterBridge";
        } else {
            oNx.A02(z);
            if (z) {
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "inCallUserSession";
                } else {
                    C71342cb.A00(userSession).A0A(this, "enter_pip_mode");
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
