package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DH  reason: invalid class name */
public final class AnonymousClass7DH implements AnonymousClass7D2 {
    public final UserSession A00;
    public final C333107Xr A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.three_dot_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new AnonymousClass7EQ(this.A00, new C71662eb(viewStub), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EQ r22 = (AnonymousClass7EQ) r2;
        NYV nyv = (NYV) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(nyv, 1);
        r22.A01(nyv);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EQ r22 = (AnonymousClass7EQ) r2;
        0qQ.A0B(r22, 0);
        r22.A00();
    }

    public AnonymousClass7DH(UserSession userSession, C333107Xr r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
