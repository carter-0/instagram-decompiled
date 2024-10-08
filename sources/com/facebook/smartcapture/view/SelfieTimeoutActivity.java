package com.facebook.smartcapture.view;

import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C13447Taa;
import X.C7922Qct;
import X.DbW;
import android.os.Bundle;
import com.instagram.android.R;

public final class SelfieTimeoutActivity extends BaseSelfieCaptureActivity implements C13447Taa {
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(361467093);
        super.onCreate(bundle);
        setContentView(R.layout.selfie_fragment_container_activity);
        try {
            if (this.A05 != null) {
                0s1 A0D = DbW.A0D(this);
                A0D.A0A(C7922Qct.class.newInstance(), R.id.fragment_container);
                A0D.A00();
                AnonymousClass0fD.A07(-316789280, A00);
                return;
            }
            A05("SmartCaptureUi is null", (Throwable) null);
            IllegalStateException A0z = AnonymousClass7TE.A0z("SmartCaptureUi must not be null");
            AnonymousClass0fD.A07(111281715, A00);
            throw A0z;
        } catch (IllegalAccessException | InstantiationException e) {
            A05(e.getMessage(), e);
        }
    }
}
