package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7WU  reason: invalid class name */
public final class AnonymousClass7WU implements AnonymousClass7WV {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new AnonymousClass9L0(this, 41));
    public final C62320sa A03;

    public AnonymousClass7WU(AnonymousClass4DH r3, UserSession userSession, C62320sa r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r5, 3);
        this.A00 = r3;
        this.A01 = userSession;
        this.A03 = r5;
    }

    public final void Cua(int i, String str, String str2) {
    }

    public final void Cub(int i) {
    }

    public final boolean Etx(C254793t3 r10, String str, int i) {
        AnonymousClass7S7 C6l = ((C333517Zg) this.A03.invoke()).C6l();
        if (!r10.equals(C6l.CBU())) {
            return false;
        }
        C330957Ox.A04.A01(this.A00.requireContext(), this.A01, str, C6l.C6f(), i);
        return true;
    }
}
