package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DG  reason: invalid class name */
public final class AnonymousClass7DG implements AnonymousClass7D2 {
    public final Activity A00;
    public final UserSession A01;
    public final C333167Xx A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.shared_stack_creation_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new AnonymousClass7EP(this.A00, this.A01, new C71662eb(viewStub), this.A02);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EP r22 = (AnonymousClass7EP) r2;
        N8H n8h = (N8H) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(n8h, 1);
        r22.A00(n8h);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EP r22 = (AnonymousClass7EP) r2;
        0qQ.A0B(r22, 0);
        r22.A03.A02();
        r22.A00 = null;
    }

    public AnonymousClass7DG(Activity activity, UserSession userSession, C333167Xx r3) {
        this.A00 = activity;
        this.A02 = r3;
        this.A01 = userSession;
    }
}
