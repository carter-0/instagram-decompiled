package com.instagram.debug.devoptions.section.identitycapture;

import X.0KC;
import X.0kR;
import X.AnonymousClass0fD;
import X.C7906Qca;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class IdentityCaptureOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IdentityCaptureOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2023498748);
        try {
            0kR.A0B(this.$activity, new C7906Qca(this.$activity, this.$userSession, (String) null, (String) null, (String) null, (String) null).A00());
        } catch (IOException e) {
            0KC.A0F(IdentityCaptureOptions.TAG, "Exception when launching ID Capture", e);
        }
        AnonymousClass0fD.A0C(-1306702811, A05);
    }
}
