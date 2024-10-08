package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DM  reason: invalid class name */
public final class AnonymousClass7DM implements AnonymousClass7D2 {
    public final UserSession A00;
    public final AnonymousClass7Y2 A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        return new AnonymousClass7EW(this.A00, 2b1.A01(layoutInflater.inflate(R.layout.subscribe_shortcut_stub, viewGroup, false), false, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EW r22 = (AnonymousClass7EW) r2;
        N8L n8l = (N8L) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(n8l, 1);
        r22.A01(n8l);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EW r22 = (AnonymousClass7EW) r2;
        0qQ.A0B(r22, 0);
        r22.A00();
    }

    public AnonymousClass7DM(UserSession userSession, AnonymousClass7Y2 r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
