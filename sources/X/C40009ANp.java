package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.ANp  reason: case insensitive filesystem */
public final class C40009ANp implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C2357130x A01;

    public C40009ANp(UserSession userSession, C2357130x r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1471543860);
        C3018660j.A01(this.A00).A0D(C69506Nmo.A0Y);
        C227802jw r1 = this.A01.A0O;
        AnonymousClass332 r0 = r1.A07;
        if (r0 != null) {
            r0.A00.onPause();
        }
        2Zg A07 = r1.A07();
        if (A07 != null) {
            A07.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "on_launch_direct_inbox_from_notes_in_feed", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1.0f, 0, true));
        }
        AnonymousClass0fD.A0C(-1156356182, A05);
    }
}
