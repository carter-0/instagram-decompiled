package X;

import android.net.Uri;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;

/* renamed from: X.T8b  reason: case insensitive filesystem */
public final class C12814T8b implements MUX {
    public final /* synthetic */ R8T A00;

    public C12814T8b(R8T r8t) {
        this.A00 = r8t;
    }

    public final void DJm(Integer num) {
        SQH.A03(this.A00);
    }

    public final void DJn() {
        R8T r8t = this.A00;
        Uri uri = r8t.A02;
        if (uri == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (uri.getPath() != null) {
            UserSession userSession = r8t.A08;
            0qQ.A0A(userSession);
            Uri uri2 = r8t.A02;
            0qQ.A0A(uri2);
            String path = uri2.getPath();
            0qQ.A0A(path);
            new C63930LDn(AuthenticityUploadMedium.IMAGE_PICKER, userSession, new C12813T8a(r8t), path, r8t.A0C).A00();
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
