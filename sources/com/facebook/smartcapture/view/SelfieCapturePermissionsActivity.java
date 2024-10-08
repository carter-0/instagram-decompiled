package com.facebook.smartcapture.view;

import X.02K;
import X.0qQ;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C67004Mgc;
import X.C68377NEd;
import X.C74298PsX;
import X.C7912Qci;
import X.C7921Qcs;
import X.C9584RdO;
import X.C9952Rk7;
import X.DbW;
import X.Pxe;
import X.Pxj;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi;
import com.instagram.android.R;

public final class SelfieCapturePermissionsActivity extends BaseSelfieCaptureActivity implements C74298PsX {
    public int A00;
    public C7921Qcs A01;
    public boolean A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.smartcapture.view.SelfieCapturePermissionsActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AnonymousClass7TF.A1B(strArr, 1, iArr);
        SelfieCapturePermissionsActivity.super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10 && iArr.length > 0) {
            int i2 = iArr[0];
            if (i2 == 0) {
                BaseSelfieCaptureActivity.A00(this).logPermissionGrant(this.A00);
            } else if (i2 == -1) {
                BaseSelfieCaptureActivity.A00(this).logPermissionReject();
                if (!C67004Mgc.A06(this, "android.permission.CAMERA")) {
                    this.A02 = true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.SelfieCapturePermissionsActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    public final void CzA() {
        this.A00++;
        if (this.A02) {
            Intent A0G = Pxe.A0G("android.settings.APPLICATION_DETAILS_SETTINGS");
            A0G.setData(Uri.fromParts("package", getPackageName(), (String) null));
            startActivityForResult(A0G, 2);
            BaseSelfieCaptureActivity.A00(this).logPermissionNeverAskAgain();
            return;
        }
        C67004Mgc.A05(this, new String[]{"android.permission.CAMERA"}, 10);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.SelfieCapturePermissionsActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.SelfieCapturePermissionsActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Class cls;
        String str;
        String str2;
        String str3;
        int A002 = AnonymousClass0fD.A00(-906699008);
        if (!Pxj.A1V(this)) {
            finish();
            i = -351049216;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            if (02K.A00(this, C9952Rk7.A00[0]) != 0) {
                if (bundle == null) {
                    SelfieCaptureUi selfieCaptureUi = this.A05;
                    String str4 = null;
                    if (selfieCaptureUi != null) {
                        try {
                            if (selfieCaptureUi instanceof XMDSIgSelfieCaptureUi) {
                                cls = C68377NEd.class;
                            } else {
                                cls = C7912Qci.class;
                            }
                            this.A01 = (C7921Qcs) cls.newInstance();
                            Bundle bundle2 = A02().A03;
                            C7921Qcs qcs = this.A01;
                            0qQ.A0A(qcs);
                            String str5 = A02().A0P;
                            String str6 = A02().A0L;
                            if (bundle2 != null) {
                                str = bundle2.getString("challenge_use_case");
                                str2 = bundle2.getString("av_session_id");
                                str3 = bundle2.getString("flow_id");
                                str4 = bundle2.getString("product_surface");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            qcs.A00(str5, str6, str, str2, str3, str4);
                            0s1 A0D = DbW.A0D(this);
                            C7921Qcs qcs2 = this.A01;
                            0qQ.A0A(qcs2);
                            A0D.A0A(qcs2, R.id.fragment_container);
                            A0D.A00();
                        } catch (IllegalAccessException | InstantiationException e) {
                            A05(e.getMessage(), e);
                        }
                    } else {
                        A05("SmartCaptureUi is null", (Throwable) null);
                        IllegalStateException A0z = AnonymousClass7TE.A0z("SmartCaptureUi must not be null");
                        AnonymousClass0fD.A07(-1484077836, A002);
                        throw A0z;
                    }
                }
                i = -2560216;
            } else {
                Intent A003 = C9584RdO.A00(this, A02(), SelfieCaptureStep.PERMISSIONS);
                BaseSelfieCaptureActivity.A00(this).nextStep = SelfieCaptureStep.CAPTURE;
                startActivityForResult(A003, 1);
                i = -110895599;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.SelfieCapturePermissionsActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(1334803524);
        super.onResume();
        if (02K.A00(this, C9952Rk7.A00[0]) == 0 && this.A01 != null) {
            Intent A003 = C9584RdO.A00(this, A02(), SelfieCaptureStep.PERMISSIONS);
            BaseSelfieCaptureActivity.A00(this).nextStep = SelfieCaptureStep.CAPTURE;
            startActivityForResult(A003, 1);
        }
        AnonymousClass0fD.A07(543765449, A002);
    }
}
