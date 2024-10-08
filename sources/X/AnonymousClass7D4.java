package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7D4  reason: invalid class name */
public final class AnonymousClass7D4 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7D5 A01;
    public final C332807Wl A02;
    public final AnonymousClass9HC A03;
    public final UserSession A04;

    public AnonymousClass7D4(AnonymousClass0iw r2, UserSession userSession, C332807Wl r4, AnonymousClass9HC r5) {
        0qQ.A0B(userSession, 4);
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = userSession;
        this.A01 = new AnonymousClass7D5(userSession);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_multiple_reaction_pills, viewGroup, false);
        0qQ.A0A(inflate);
        AnonymousClass9HC r5 = this.A03;
        return new C328227Dz(inflate, this.A00, this.A01, this.A02, r5);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        C328227Dz r22 = (C328227Dz) r2;
        AnonymousClass7A9 r32 = (AnonymousClass7A9) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A01(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
        C328227Dz r12 = (C328227Dz) r1;
        if (r12 != null) {
            r12.A00();
        }
    }

    public final C328227Dz A00(View view) {
        View requireViewById = view.requireViewById(R.id.pills_view_container);
        0qQ.A07(requireViewById);
        AnonymousClass9HC r5 = this.A03;
        return new C328227Dz(requireViewById, this.A00, this.A01, this.A02, r5);
    }
}
