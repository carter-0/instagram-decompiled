package X;

/* renamed from: X.OPb  reason: case insensitive filesystem */
public abstract class C70862OPb {
    public static final C68894NaW A00(AnonymousClass7LQ r1) {
        C2606546n r12 = r1.A0e.A0N;
        if (r12 instanceof C68894NaW) {
            return (C68894NaW) r12;
        }
        return null;
    }

    public static final boolean A01(C2606546n r2) {
        String str = null;
        if (r2 instanceof C68894NaW) {
            str = r2.A02;
        }
        if (0qQ.A0K(str, "disappearing_mode_on_client_admin_message") || 0qQ.A0K(str, "disappearing_mode_upgrade_from_vanish_mode_swipe_up") || 0qQ.A0K(str, "disappearing_mode_upgrade_from_vanish_mode_update_app")) {
            return true;
        }
        return false;
    }
}
