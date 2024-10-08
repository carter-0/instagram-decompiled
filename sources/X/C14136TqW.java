package X;

import com.instagram.user.model.User;

/* renamed from: X.TqW  reason: case insensitive filesystem */
public final class C14136TqW implements 1wn {
    public final /* synthetic */ AnonymousClass32L A00;

    public C14136TqW(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1600338065);
        C2370836g r6 = (C2370836g) obj;
        int A0D = AnonymousClass7TG.A0D(r6, 1139675442);
        C14074TpO tpO = this.A00.A06;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        User user = r6.A00;
        tpO.A07(user, user.CPV());
        AnonymousClass0fD.A0A(-1883049103, A0D);
        AnonymousClass0fD.A0A(1601364964, A03);
    }
}
