package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DF  reason: invalid class name */
public final class AnonymousClass7DF implements AnonymousClass7D2 {
    public final UserSession A00;
    public final C333107Xr A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_info_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new AnonymousClass7EO(this.A00, new C71662eb(viewStub), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EO r22 = (AnonymousClass7EO) r2;
        AnonymousClass7AC r32 = (AnonymousClass7AC) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A01(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
        AnonymousClass7EO r12 = (AnonymousClass7EO) r1;
        if (r12 != null) {
            r12.A00();
        }
    }

    public AnonymousClass7DF(UserSession userSession, C333107Xr r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
