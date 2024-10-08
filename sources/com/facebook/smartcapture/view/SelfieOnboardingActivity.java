package com.facebook.smartcapture.view;

import X.0qQ;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10242Rp2;
import X.C13443TaW;
import X.C7923Qcu;
import X.C7924Qcv;
import X.C8879RDw;
import X.C9577RdH;
import X.DbW;
import X.Pxj;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.ui.consent.ConsentTextsProvider;
import com.instagram.android.R;

public final class SelfieOnboardingActivity extends BaseSelfieCaptureActivity implements C13443TaW {
    public C7924Qcv A00;
    public C10242Rp2 A01;

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, com.facebook.smartcapture.view.SelfieOnboardingActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.facebook.smartcapture.view.SelfieOnboardingActivity r4) {
        /*
            X.Rp2 r0 = r4.A01
            X.0qQ.A0A(r0)
            r3 = 1
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "onboarding_has_seen"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r3)
            r0.apply()
            com.facebook.smartcapture.flow.SelfieCaptureConfig r1 = r4.A02()
            com.facebook.smartcapture.logging.SelfieCaptureStep r0 = com.facebook.smartcapture.logging.SelfieCaptureStep.ONBOARDING
            android.content.Intent r2 = X.C9584RdO.A00(r4, r1, r0)
            com.facebook.smartcapture.logging.SelfieCaptureStep r1 = com.facebook.smartcapture.logging.SelfieCaptureStep.CAPTURE
            com.facebook.smartcapture.logging.SelfieCaptureLogger r0 = com.facebook.smartcapture.view.BaseSelfieCaptureActivity.A00(r4)
            r0.nextStep = r1
            r4.startActivityForResult(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.SelfieOnboardingActivity.A01(com.facebook.smartcapture.view.SelfieOnboardingActivity):void");
    }

    public final void onBackPressed() {
        C7924Qcv qcv = this.A00;
        if (qcv != null) {
            C7923Qcu qcu = (C7923Qcu) qcv;
            ViewPager viewPager = qcu.A04;
            0qQ.A0A(viewPager);
            if (viewPager.getVisibility() == 0) {
                ViewPager viewPager2 = qcu.A04;
                0qQ.A0A(viewPager2);
                if (viewPager2.getCurrentItem() > 0) {
                    ViewPager viewPager3 = qcu.A04;
                    0qQ.A0A(viewPager3);
                    ViewPager viewPager4 = qcu.A04;
                    0qQ.A0A(viewPager4);
                    viewPager3.setCurrentItem(viewPager4.getCurrentItem() - 1);
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, com.facebook.smartcapture.view.SelfieOnboardingActivity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, com.facebook.smartcapture.view.SelfieOnboardingActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1998299601);
        if (!Pxj.A1V(this)) {
            finish();
            i = -637762949;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            this.A01 = new C10242Rp2(this);
            if (bundle == null) {
                if (this.A05 != null) {
                    try {
                        0qQ.A07(A02().A0O);
                        C7924Qcv newInstance = C7923Qcu.class.newInstance();
                        this.A00 = newInstance;
                        0qQ.A0A(newInstance);
                        C8879RDw rDw = A02().A07;
                        ConsentTextsProvider consentTextsProvider = A02().A0E;
                        String str = A02().A0P;
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putBoolean("no_face_tracker", false);
                        A0a.putSerializable("training_consent", rDw);
                        A0a.putParcelable("texts_provider", consentTextsProvider);
                        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                        newInstance.setArguments(A0a);
                        0s1 A0D = DbW.A0D(this);
                        C7924Qcv qcv = this.A00;
                        0qQ.A0A(qcv);
                        A0D.A0A(qcv, R.id.fragment_container);
                        A0D.A00();
                    } catch (IllegalAccessException | InstantiationException e) {
                        A05(e.getMessage(), e);
                    }
                } else {
                    A05("SmartCaptureUi is null", (Throwable) null);
                    IllegalStateException A0z = AnonymousClass7TE.A0z("SmartCaptureUi must not be null");
                    AnonymousClass0fD.A07(797039746, A002);
                    throw A0z;
                }
            }
            SelfieCaptureConfig A02 = A02();
            C10242Rp2 rp2 = this.A01;
            0qQ.A0A(rp2);
            if (!C9577RdH.A00(A02, rp2)) {
                A01(this);
            }
            i = 1469084819;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
