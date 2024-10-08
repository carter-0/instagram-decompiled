package com.instagram.debug.devoptions.section.identitycapture;

import X.0kR;
import X.0lg;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10261RpL;
import X.C10969S3b;
import X.Pxf;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.security.cert.Certificate;

public final class IdentityCaptureOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IdentityCaptureOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebook.smartcapture.resources.ResourcesProvider, java.lang.Object] */
    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-349086121);
        C10261RpL rpL = new C10261RpL();
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 1);
        C10969S3b s3b = new C10969S3b();
        s3b.A09 = new Object();
        s3b.A07 = new Object();
        s3b.A00 = R.style.IgSmartCaptureTheme;
        s3b.A04 = new IgVoltronAndNmlModulesDownloader((0lg) userSession);
        String token = userSession.getToken();
        0qQ.A0B(token, 0);
        s3b.A0D = token;
        FragmentActivity fragmentActivity = this.$activity;
        0qQ.A0B(fragmentActivity, 0);
        s3b.A02 = fragmentActivity;
        s3b.A0E = "IG Internal Settings";
        Certificate certificate = rpL.A00.getCertificate("alias");
        if (certificate != null) {
            s3b.A0F = Pxf.A0p(certificate.getPublicKey().getEncoded(), 2);
            0kR.A0B(this.$activity, s3b.A00());
            AnonymousClass0fD.A0C(-1626921256, A05);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
