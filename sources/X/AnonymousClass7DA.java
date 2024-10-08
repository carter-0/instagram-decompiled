package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DA  reason: invalid class name */
public final class AnonymousClass7DA implements AnonymousClass7D2 {
    public final UserSession A00;
    public final AnonymousClass7Y0 A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.footer_label_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EJ(this.A00, new C71662eb((ViewStub) inflate), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EJ r22 = (AnonymousClass7EJ) r2;
        0qQ.A0B(r22, 0);
        r22.A00((C3262275x) r3);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EJ r22 = (AnonymousClass7EJ) r2;
        0qQ.A0B(r22, 0);
        r22.A01.A02();
    }

    public AnonymousClass7DA(UserSession userSession, AnonymousClass7Y0 r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
