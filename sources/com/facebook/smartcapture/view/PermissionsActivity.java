package com.facebook.smartcapture.view;

import X.02K;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C67004Mgc;
import X.C74298PsX;
import X.C7921Qcs;
import X.C9952Rk7;
import X.DbW;
import X.Pxe;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.instagram.android.R;

public final class PermissionsActivity extends IdCaptureBaseActivity implements C74298PsX {
    public boolean A00;
    public int A01;
    public C7921Qcs A02;
    public boolean A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.smartcapture.view.PermissionsActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AnonymousClass7TF.A1B(strArr, 1, iArr);
        PermissionsActivity.super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10 && iArr.length > 0) {
            int i2 = iArr[0];
            if (i2 == 0) {
                A02().logPermissionGrant(this.A01);
            } else if (i2 == -1) {
                A02().logPermissionReject();
                if (!C67004Mgc.A06(this, "android.permission.CAMERA")) {
                    this.A03 = true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.PermissionsActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final void CzA() {
        this.A01++;
        if (this.A03) {
            Intent A0G = Pxe.A0G("android.settings.APPLICATION_DETAILS_SETTINGS");
            A0G.setData(Uri.fromParts("package", getPackageName(), (String) null));
            startActivityForResult(A0G, 2);
            A02().logPermissionNeverAskAgain();
            return;
        }
        C67004Mgc.A05(this, new String[]{"android.permission.CAMERA"}, 10);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.PermissionsActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    public final void onBackPressed() {
        A02().logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.PermissionsActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int A002 = AnonymousClass0fD.A00(2086729728);
        super.onCreate(bundle);
        setContentView(R.layout.permissions_activity);
        boolean booleanExtra = getIntent().getBooleanExtra("permissions_activity_force_show", false);
        this.A00 = booleanExtra;
        if (booleanExtra || 02K.A00(this, C9952Rk7.A00[0]) != 0) {
            if (bundle == null) {
                IdCaptureUi idCaptureUi = this.A07;
                String str5 = null;
                if (idCaptureUi != null) {
                    try {
                        C7921Qcs qcs = (C7921Qcs) idCaptureUi.Bbl().newInstance();
                        Bundle bundle2 = A01().A03;
                        String str6 = A01().A0G;
                        if (bundle2 != null) {
                            str = bundle2.getString("challenge_id");
                            str2 = bundle2.getString("challenge_use_case");
                            str3 = bundle2.getString("av_session_id");
                            str4 = bundle2.getString("flow_id");
                            str5 = bundle2.getString("product_surface");
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        qcs.A00(str6, str, str2, str3, str4, str5);
                        0s1 A0D = DbW.A0D(this);
                        A0D.A0A(qcs, R.id.permissions_container);
                        A0D.A00();
                        this.A02 = qcs;
                    } catch (IllegalAccessException | InstantiationException e) {
                        A02().logError(e.toString(), e.getMessage(), e);
                    }
                } else {
                    A02().logError("IdCaptureUi is null", (Throwable) null);
                    IllegalStateException A0z = AnonymousClass7TE.A0z("IdCaptureUi must not be null");
                    AnonymousClass0fD.A07(1746595195, A002);
                    throw A0z;
                }
            }
            if (this.A05 == IdCaptureStep.INITIAL) {
                A02().logFlowStart();
            }
            A02().logPermissionExplain();
            i = -1742291520;
        } else {
            Intent A003 = IdCaptureActivity.A07.A00(this, this.A01, A01(), IdCaptureStep.PERMISSIONS);
            this.A04 = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A003, 1);
            i = -1626083041;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.activity.ComponentActivity, android.content.Context, com.facebook.smartcapture.view.PermissionsActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-1928878986);
        super.onResume();
        if (!this.A00 && 02K.A00(this, C9952Rk7.A00[0]) == 0 && this.A02 != null) {
            Intent A003 = IdCaptureActivity.A07.A00(this, this.A01, A01(), IdCaptureStep.PERMISSIONS);
            this.A04 = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A003, 1);
        }
        AnonymousClass0fD.A07(-795199342, A002);
    }
}
