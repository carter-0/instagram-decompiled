package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DD  reason: invalid class name */
public final class AnonymousClass7DD implements AnonymousClass7D2 {
    public final Activity A00;
    public final UserSession A01;
    public final C333107Xr A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.share_to_story_shortcut_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EM(this.A00, this.A01, 2b1.A01(inflate, false, false), this.A02);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EM r22 = (AnonymousClass7EM) r2;
        C376679Ix r32 = (C376679Ix) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A01(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EM r22 = (AnonymousClass7EM) r2;
        0qQ.A0B(r22, 0);
        r22.A00();
    }

    public AnonymousClass7DD(Activity activity, UserSession userSession, C333107Xr r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = userSession;
    }
}
