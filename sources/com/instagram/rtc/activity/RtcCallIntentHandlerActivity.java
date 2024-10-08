package com.instagram.rtc.activity;

import X.002;
import X.02m;
import X.08y;
import X.09i;
import X.0Jv;
import X.0Tu;
import X.0fS;
import X.0qQ;
import X.0sP;
import X.0wj;
import X.182;
import X.1DL;
import X.2SP;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C61170le;
import X.C638918c;
import X.C66581MXm;
import X.C66583MXo;
import X.C70386O4n;
import X.C70777OKx;
import X.C70902OQu;
import X.C71004OWb;
import X.C72929PPn;
import X.C74120PpN;
import X.C74186PqS;
import X.C74190PqW;
import X.C74496Pvq;
import X.DbU;
import X.ON9;
import X.OW1;
import X.SJD;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.systrace.Systrace;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

public final class RtcCallIntentHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public C74496Pvq A00;
    public SJD A01;
    public final Handler A02 = AnonymousClass7TF.A0D();

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.0Js] */
    private final void A00(0sP r9, boolean z) {
        String A002 = AnonymousClass000.A00(2);
        try {
            08y r5 = 09i.A0A;
            Bundle A06 = DbU.A06(this);
            if (A06 != null) {
                UserSession A062 = r5.A06(A06);
                if (!182.A06(0Tu.A05, A062, 36323667999075697L)) {
                    AnonymousClass0wW A012 = getSession();
                    if (A012 == null) {
                        if (!z) {
                            C71004OWb.A00.A04("RtcCallIntentHandlerActivity", AnonymousClass7TF.A0i(getIntent(), AnonymousClass7TF.A0n("No active user session while processing intent: ")), (Throwable) null);
                            finish();
                        }
                        A012 = r5.A05(this);
                        0qQ.A0C(A012, A002);
                    }
                    r9.invoke(A012);
                    return;
                }
                r5.A0A(new Object(), (0Jv) null, new C72929PPn(r9, 8), A062.A06);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } catch (IllegalStateException e) {
            C71004OWb.A00.A04("RtcCallIntentHandlerActivity", AnonymousClass7TF.A0i(getIntent(), AnonymousClass7TF.A0n("No active user session while processing intent: ")), e);
            if (getSession() != null) {
                0qQ.A0C(getSession(), A002);
                OW1 ow1 = new OW1(new ON9(0wj.A01).A00, "RtcCallIntentHandlerActivity: No active user session while processing intent", 659044095);
                ow1.A00 = e;
                ow1.A01.ERJ(e);
                ow1.A02("intent_action", String.valueOf(getIntent().getAction()));
                ow1.A01();
            }
            finish();
        }
    }

    public final String getModuleName() {
        return "rtc_call_launcher";
    }

    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onNewIntent");
        RtcCallIntentHandlerActivity.super.onNewIntent(intent);
        A00(new C74186PqS(10, (Object) this, (Object) intent), true);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.app.Activity] */
    /* renamed from: A01 */
    public final UserSession getSession() {
        08y r1 = 09i.A0A;
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            return r1.A07(A06);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A02(boolean z, boolean z2) {
        SJD sjd = this.A01;
        if (z) {
            if (sjd != null) {
                if (!1DL.A08(sjd.A04.A01, (String[]) Arrays.copyOf(new String[]{"android.permission.RECORD_AUDIO"}, 1))) {
                    SJD sjd2 = this.A01;
                    if (sjd2 != null) {
                        sjd2.A01();
                        return;
                    }
                }
            }
            0qQ.A0F("permissionsPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        if (sjd != null) {
            C70777OKx oKx = sjd.A04;
            String[] strArr = C70386O4n.A00;
            0qQ.A0B(strArr, 0);
            if (!1DL.A08(oKx.A01, (String[]) Arrays.copyOf(strArr, 2))) {
                SJD sjd3 = this.A01;
                if (sjd3 != null) {
                    sjd3.A02(z2);
                    return;
                }
            }
        }
        0qQ.A0F("permissionsPresenter");
        throw AnonymousClass00P.createAndThrow();
        C74496Pvq pvq = this.A00;
        if (pvq != null) {
            C70902OQu.A00(pvq);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1035399313);
        String A0y = C66581MXm.A0y(this);
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            C66583MXo.A1H(r5, A0y, A03);
            r5.markerAnnotate(694558626, A03, "operation_name", "onCreate");
            try {
                String A0T = 002.A0T(A0y, "onCreate", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, 1502399360);
                }
                C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onCreate");
                super.onCreate(bundle);
                Intent intent = getIntent();
                0qQ.A07(intent);
                A00(new C74186PqS(10, (Object) this, (Object) intent), true);
                C638918c.A01(C61170le.A00).A0J(this, getSession());
                if (Systrace.A0E(1)) {
                    0fS.A00(773341169);
                }
                r5.markerEnd(694558626, A03, 2);
            } catch (Throwable th) {
                try {
                    AnonymousClass0fD.A07(-403322601, A002);
                    throw th;
                } catch (Throwable th2) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(-157657150, A002);
                    throw th2;
                }
            }
        } else {
            C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onCreate");
            super.onCreate(bundle);
            Intent intent2 = getIntent();
            0qQ.A07(intent2);
            A00(new C74186PqS(10, (Object) this, (Object) intent2), true);
            C638918c.A01(C61170le.A00).A0J(this, getSession());
        }
        AnonymousClass0fD.A07(520900295, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-643572130);
        String A0y = C66581MXm.A0y(this);
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            C66583MXo.A1H(r5, A0y, A03);
            r5.markerAnnotate(694558626, A03, "operation_name", "onDestroy");
            try {
                String A0T = 002.A0T(A0y, "onDestroy", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, 2060061117);
                }
                C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onDestroy");
                super.onDestroy();
                this.A02.removeCallbacksAndMessages((Object) null);
                C74496Pvq pvq = this.A00;
                if (pvq != null) {
                    pvq.AIa();
                }
                this.A00 = null;
                A00(C74120PpN.A00, false);
                if (Systrace.A0E(1)) {
                    0fS.A00(-74571412);
                }
                r5.markerEnd(694558626, A03, 2);
            } catch (Throwable th) {
                try {
                    AnonymousClass0fD.A07(1067352755, A002);
                    throw th;
                } catch (Throwable th2) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(532655411, A002);
                    throw th2;
                }
            }
        } else {
            C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onDestroy");
            super.onDestroy();
            this.A02.removeCallbacksAndMessages((Object) null);
            C74496Pvq pvq2 = this.A00;
            if (pvq2 != null) {
                pvq2.AIa();
            }
            this.A00 = null;
            A00(C74120PpN.A00, false);
        }
        AnonymousClass0fD.A07(-53041088, A002);
    }

    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(797759280);
        String A0y = C66581MXm.A0y(this);
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            C66583MXo.A1H(r5, A0y, A03);
            r5.markerAnnotate(694558626, A03, "operation_name", "onStart");
            try {
                String A0T = 002.A0T(A0y, "onStart", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, -1481123511);
                }
                C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onStart");
                super.onStart();
                A00(new C74190PqW(this, 7), false);
                if (Systrace.A0E(1)) {
                    0fS.A00(1542725300);
                }
                r5.markerEnd(694558626, A03, 2);
            } catch (Throwable th) {
                try {
                    AnonymousClass0fD.A07(709656470, A002);
                    throw th;
                } catch (Throwable th2) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(-1766569516, A002);
                    throw th2;
                }
            }
        } else {
            C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "onStart");
            super.onStart();
            A00(new C74190PqW(this, 7), false);
        }
        AnonymousClass0fD.A07(843925702, A002);
    }
}
