package com.facebook.smartcapture.view;

import X.0qQ;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13446TaZ;
import X.C7928Qcz;
import X.C7929Qd0;
import X.DbW;
import X.Pxj;
import X.REX;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

public final class SelfieReviewActivity extends BaseSelfieCaptureActivity implements C13446TaZ {
    public SelfieEvidence A00 = new SelfieEvidence((ImmutableList) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (String) null, (String) null);

    /* JADX WARNING: type inference failed for: r15v0, types: [androidx.activity.ComponentActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, com.facebook.smartcapture.view.SelfieReviewActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        Throwable th;
        int i;
        int i2;
        Class cls;
        String str;
        String str2;
        String str3;
        int A002 = AnonymousClass0fD.A00(-1907602095);
        super.onCreate(bundle);
        if (!Pxj.A1V(this)) {
            finish();
            i2 = -1762662060;
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("selfie_evidence");
            if (parcelableExtra instanceof SelfieEvidence) {
                this.A00 = (SelfieEvidence) parcelableExtra;
                setContentView(R.layout.selfie_fragment_container_activity);
                if (bundle == null) {
                    SelfieCaptureUi selfieCaptureUi = this.A05;
                    String str4 = null;
                    if (selfieCaptureUi != null) {
                        try {
                            REX rex = A02().A06;
                            if (rex == null) {
                                rex = REX.VIDEO;
                            }
                            A02();
                            String str5 = A02().A0O;
                            0qQ.A07(str5);
                            if (selfieCaptureUi instanceof XMDSIgSelfieCaptureUi) {
                                cls = C7928Qcz.class;
                            } else {
                                cls = C7929Qd0.class;
                            }
                            Fragment fragment = (Fragment) cls.newInstance();
                            Bundle bundle2 = A02().A03;
                            if (bundle2 != null) {
                                str = bundle2.getString("product_surface");
                            } else {
                                str = null;
                            }
                            SelfieEvidence selfieEvidence = this.A00;
                            String str6 = A02().A0L;
                            String str7 = A02().A0P;
                            if (bundle2 != null) {
                                str2 = bundle2.getString("challenge_use_case");
                                str3 = bundle2.getString("av_session_id");
                                str4 = bundle2.getString("flow_id");
                            } else {
                                str2 = null;
                                str3 = null;
                            }
                            if (str == null) {
                                str = str5;
                            }
                            String str8 = A02().A0Q;
                            String str9 = A02().A0M;
                            boolean A1Y = AnonymousClass7TF.A1Y(A02().A0H, true);
                            Bundle A0a = AnonymousClass7TE.A0a();
                            A0a.putParcelable("selfie_evidence", selfieEvidence);
                            A0a.putSerializable("review_type", rex);
                            if (str6 != null) {
                                A0a.putString("challenge_id", str6);
                            }
                            if (str7 != null) {
                                A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str7);
                            }
                            if (str2 != null) {
                                A0a.putString("challenge_use_case", str2);
                            }
                            if (str3 != null) {
                                A0a.putString("av_session_id", str3);
                            }
                            if (str4 != null) {
                                A0a.putString("flow_id", str4);
                            }
                            A0a.putString("product_surface", str);
                            if (str8 != null) {
                                A0a.putString("ig_user_id", str8);
                            }
                            if (str9 != null) {
                                A0a.putString("entity_id", str9);
                            }
                            A0a.putBoolean("is_cancel_confirmation_action_sheet_enabled", A1Y);
                            fragment.setArguments(A0a);
                            0s1 A0D = DbW.A0D(this);
                            A0D.A0A(fragment, R.id.fragment_container);
                            A0D.A00();
                        } catch (IllegalAccessException | InstantiationException e) {
                            A05(e.getMessage(), e);
                        }
                    } else {
                        A05("SmartCaptureUi is null", (Throwable) null);
                        th = AnonymousClass7TE.A0z("SmartCaptureUi must not be null");
                        i = 560833265;
                    }
                }
                i2 = -1422980204;
            } else {
                th = AnonymousClass7TE.A0w("SelfieEvidence must be set");
                i = 1357078678;
            }
            AnonymousClass0fD.A07(i, A002);
            throw th;
        }
        AnonymousClass0fD.A07(i2, A002);
    }
}
