package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FjK  reason: case insensitive filesystem */
public final class C50840FjK implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public C50840FjK(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        HashMap A1E = AnonymousClass7TE.A1E();
        UserSession userSession = this.A01;
        Dbc.A0M(C49891FBs.A00(DbS.A0N(userSession), C46649DiU.A04("com.instagram.appointment.messaging_guidance.appt_messaging_hub.MessagingHubScreen", A1E)), this.A00, userSession);
    }
}
