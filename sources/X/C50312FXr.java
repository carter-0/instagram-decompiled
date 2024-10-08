package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FXr  reason: case insensitive filesystem */
public final class C50312FXr implements C232302tS {
    public final /* synthetic */ E62 A00;

    public final void Dyk(C249703kE r12) {
        0qQ.A0B(r12, 0);
        int bindingAdapterPosition = r12.getBindingAdapterPosition();
        E62 e62 = this.A00;
        C46753Dkg dkg = (C46753Dkg) e62.A03.getValue();
        String A0r = DbX.A0r(dkg.A00.A02(dkg.A01));
        UserSession A0l = AnonymousClass7TE.A0l(e62.A02);
        0qQ.A0B(A0l, 2);
        C49075Eot.A00(e62, A0l, "impression", "address", "viewer", "ig_addresses_consumption_bottom_sheet", A0r, AnonymousClass7TF.A0w("index", String.valueOf(bindingAdapterPosition)));
    }

    public C50312FXr(E62 e62) {
        this.A00 = e62;
    }
}
