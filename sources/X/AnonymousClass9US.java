package X;

/* renamed from: X.9US  reason: invalid class name */
public abstract class AnonymousClass9US {
    public static final boolean A01() {
        C62880wX r4 = C61170le.A00;
        if (AnonymousClass0xl.A00(r4).A00.getBoolean("has_used_text_emphasis_button", false) || AnonymousClass0xl.A00(r4).A00.getInt("text_emphasis_button_tooltip_impressions", 0) >= 1) {
            return false;
        }
        return true;
    }

    public static final boolean A00() {
        if (!A01()) {
            C62880wX r3 = C61170le.A00;
            if (AnonymousClass0xl.A00(r3).A00.getBoolean("has_used_text_animation_button", false) || AnonymousClass0xl.A00(r3).A00.getInt("text_animation_button_tooltip_impressions", 0) >= 3) {
                return false;
            }
            return true;
        }
        return false;
    }
}
