package com.facebook.smartcapture.view;

import X.00k;
import X.0Yt;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10242Rp2;
import X.C13445TaY;
import X.C13581Td7;
import X.C13582Td8;
import X.C13722Tfo;
import X.C13857Tic;
import X.C8879RDw;
import X.DbS;
import X.Dba;
import X.JTQ;
import X.Pxj;
import X.RF2;
import X.Rk6;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggerActivity;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Map;

public abstract class BaseSelfieCaptureActivity extends FragmentActivity implements C13722Tfo, C13581Td7, SelfieCaptureLoggerActivity, C13445TaY {
    public Resources A00;
    public SelfieCaptureConfig A01;
    public SelfieCaptureLogger A02;
    public C13857Tic A03;
    public C13582Td8 A04;
    public SelfieCaptureUi A05;

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    public final void A04(SelfieEvidence selfieEvidence, String str) {
        String str2;
        0qQ.A0B(selfieEvidence, 0);
        Intent A09 = DbS.A09();
        String str3 = selfieEvidence.A06;
        boolean z = true;
        if (str3 != null) {
            A09.setData(JTQ.A09(str3));
            0qQ.A0A(A09.putExtra("result_photo_path", str3));
        } else {
            ImmutableList immutableList = selfieEvidence.A00;
            if (immutableList == null || (str2 = (String) 00k.A0J(immutableList)) == null) {
                z = false;
            } else {
                A09.setData(JTQ.A09(str2));
                A09.putExtra("result_photo_path", str2);
            }
        }
        String str4 = selfieEvidence.A07;
        if (str4 != null) {
            if (!z) {
                A09.setData(JTQ.A09(str4));
            }
            A09.putExtra("result_video_path", str4);
        }
        if (A02().A07 != null) {
            String str5 = "NOT_SET";
            String string = new C10242Rp2(this).A00.getString("consent_decision", str5);
            if (string != null) {
                str5 = string;
            }
            A09.putExtra("result_user_consent", C8879RDw.valueOf(str5).toString());
        }
        if (str != null) {
            A09.putExtra("result_upload_response", str);
        }
        Dba.A0k(this, A09);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        BaseSelfieCaptureActivity.super.onSaveInstanceState(bundle);
        A00(this).onSaveInstanceState(bundle);
    }

    public final SelfieCaptureConfig A02() {
        SelfieCaptureConfig selfieCaptureConfig = this.A01;
        if (selfieCaptureConfig != null) {
            return selfieCaptureConfig;
        }
        0qQ.A0F("selfieCaptureConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SelfieCaptureStep A03() {
        if (this instanceof SelfieTimeoutActivity) {
            return SelfieCaptureStep.TIMEOUT;
        }
        if (this instanceof SelfieReviewActivity) {
            return SelfieCaptureStep.CONFIRMATION;
        }
        if ((this instanceof SelfieOnboardingActivity) || (this instanceof SelfieDataInformationActivity)) {
            return SelfieCaptureStep.ONBOARDING;
        }
        if (this instanceof SelfieCapturePermissionsActivity) {
            return SelfieCaptureStep.PERMISSIONS;
        }
        return SelfieCaptureStep.CAPTURE;
    }

    public final C13857Tic Az2() {
        return this.A03;
    }

    public final Map BEc() {
        SelfieCaptureUi selfieCaptureUi = this.A05;
        if (selfieCaptureUi == null || !(selfieCaptureUi instanceof XMDSIgSelfieCaptureUi)) {
            return 0Yt.A0E();
        }
        return Rk6.A00;
    }

    public final C13582Td8 C1r() {
        C13582Td8 td8 = this.A04;
        if (td8 != null) {
            return td8;
        }
        0qQ.A0F("stringOverride");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SelfieCaptureLogger getLogger() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.view.ContextThemeWrapper] */
    public final Resources getResources() {
        Resources resources = this.A00;
        if (resources != null) {
            return resources;
        }
        Resources resources2 = BaseSelfieCaptureActivity.super.getResources();
        0qQ.A07(resources2);
        return resources2;
    }

    public static SelfieCaptureLogger A00(BaseSelfieCaptureActivity baseSelfieCaptureActivity) {
        SelfieCaptureLogger logger = baseSelfieCaptureActivity.getLogger();
        0qQ.A0A(logger);
        return logger;
    }

    public final void A05(String str, Throwable th) {
        SelfieCaptureLogger A002 = A00(this);
        if (str == null) {
            str = "";
        }
        A002.logError(str, th);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        BaseSelfieCaptureActivity.super.onActivityResult(i, i2, intent);
        A00(this).onActivityResult(i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.activity.ComponentActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    public void onBackPressed() {
        BaseSelfieCaptureActivity.super.onBackPressed();
        A00(this).onBackPressed();
        setResult(0);
        finish();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [android.content.Context, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        Boolean bool;
        int A002 = AnonymousClass0fD.A00(1793962689);
        if (!Pxj.A1V(this)) {
            finish();
            i2 = 318867285;
        } else {
            SelfieCaptureConfig selfieCaptureConfig = (SelfieCaptureConfig) getIntent().getParcelableExtra("selfie_capture_config");
            if (selfieCaptureConfig == null) {
                finish();
                i2 = -1141326930;
            } else {
                this.A01 = selfieCaptureConfig;
                SelfieCaptureConfig A022 = A02();
                if (((this instanceof SelfieCaptureActivity) && (bool = A02().A0J) != null && bool.booleanValue() && (i = A022.A01) != 0) || (i = A022.A00) != 0) {
                    setTheme(i);
                    if (A022.A0D != null) {
                        getTheme().applyStyle(R.style.IgdsSemanticColors, true);
                    }
                }
                StringOverrideFactory A012 = A022.A01();
                0qQ.A0A(A012);
                this.A04 = A012.AL3();
                BaseSelfieCaptureActivity.super.onCreate(bundle);
                Intent intent = getIntent();
                SelfieCaptureConfig A023 = A02();
                SelfieCaptureUi selfieCaptureUi = A023.A0D;
                0qQ.A0A(selfieCaptureUi);
                this.A05 = selfieCaptureUi;
                ResourcesProvider resourcesProvider = A023.A0C;
                if (resourcesProvider != null) {
                    resourcesProvider.CN1(this);
                    this.A00 = resourcesProvider.Bng();
                    this.A03 = resourcesProvider.Az2();
                }
                SmartCaptureLoggerProvider smartCaptureLoggerProvider = A023.A0B;
                if (smartCaptureLoggerProvider != null) {
                    this.A02 = new SelfieCaptureLogger(smartCaptureLoggerProvider.get(this), A03());
                    long j = A023.A02;
                    if (j != 0) {
                        str = String.valueOf(j);
                    } else {
                        str = null;
                    }
                    SelfieCaptureLogger A003 = A00(this);
                    Parcelable.Creator creator = CommonLoggingFields.CREATOR;
                    RF2 A004 = A023.A00();
                    0qQ.A07(A004);
                    String str2 = A023.A0O;
                    0qQ.A07(str2);
                    A003.setCommonFields(new CommonLoggingFields(A004, "v1_selfie", str2, A023.A0N, A023.A03, str));
                } else {
                    this.A02 = new SelfieCaptureLogger((SmartCaptureLogger) null, A03());
                }
                if (A023.A08 != null) {
                    throw AnonymousClass7TE.A11("get");
                }
                SelfieCaptureLogger logger = getLogger();
                if (logger != null) {
                    logger.onCreate(intent, bundle);
                }
                i2 = -1278164223;
            }
        }
        AnonymousClass0fD.A07(i2, A002);
    }

    public void onResume() {
        int A002 = AnonymousClass0fD.A00(399267509);
        BaseSelfieCaptureActivity.super.onResume();
        A00(this).onResume();
        AnonymousClass0fD.A07(-750278084, A002);
    }
}
