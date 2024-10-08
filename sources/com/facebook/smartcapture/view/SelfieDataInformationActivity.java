package com.facebook.smartcapture.view;

import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C7920Qcr;
import X.DbU;
import X.DbW;
import X.Pxj;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;
import com.instagram.android.R;

public final class SelfieDataInformationActivity extends BaseSelfieCaptureActivity {
    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.activity.ComponentActivity, com.facebook.smartcapture.view.SelfieDataInformationActivity, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(143707883);
        if (!Pxj.A1V(this)) {
            finish();
            i = -444045952;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            Parcelable parcelable = null;
            if (this.A05 != null) {
                try {
                    Fragment newInstance = C7920Qcr.class.newInstance();
                    Bundle A06 = DbU.A06(this);
                    if (A06 != null) {
                        parcelable = A06.getParcelable("texts_provider");
                    }
                    if (!(parcelable instanceof ResolvedConsentTextsProvider) || parcelable == null) {
                        IllegalArgumentException A0w = AnonymousClass7TE.A0w("Missing consent texts provider");
                        AnonymousClass0fD.A07(524885099, A00);
                        throw A0w;
                    }
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("texts_provider", parcelable);
                    newInstance.setArguments(A0a);
                    0s1 A0D = DbW.A0D(this);
                    A0D.A0A(newInstance, R.id.fragment_container);
                    A0D.A00();
                    i = 2052269366;
                } catch (IllegalAccessException | InstantiationException e) {
                    A05(e.getMessage(), e);
                }
            } else {
                A05("SmartCaptureUi is null", (Throwable) null);
                IllegalStateException A0z = AnonymousClass7TE.A0z("SmartCaptureUi must not be null");
                AnonymousClass0fD.A07(905598511, A00);
                throw A0z;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
