package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7D9  reason: invalid class name */
public final class AnonymousClass7D9 implements AnonymousClass7D2 {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass7VM A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.header_label_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new AnonymousClass7EI(this.A00, this.A01, new C71662eb(viewStub), this.A02);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EI r22 = (AnonymousClass7EI) r2;
        C3255473b r32 = (C3255473b) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(r32, 1);
        r22.A01(r32);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EI r22 = (AnonymousClass7EI) r2;
        0qQ.A0B(r22, 0);
        r22.A00();
    }

    public AnonymousClass7D9(Activity activity, UserSession userSession, AnonymousClass7VM r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = activity;
    }
}
