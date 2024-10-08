package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VAm  reason: case insensitive filesystem */
public abstract class C16909VAm {
    public static final void A00(2IR r5, UserSession userSession, String str) {
        2IS r3 = new 2IS();
        r3.A04("effect_id", str);
        C239113Fa r4 = new C239113Fa(r3, UJY.class, "IGRemoveAREffectMutation", true);
        C363088j4.A00(userSession).ATL(new C56925IHu(r5, 2), new FSC(r5, 1), r4);
    }
}
