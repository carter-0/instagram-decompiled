package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7cA  reason: invalid class name and case insensitive filesystem */
public final class C334967cA {
    public Object A00;
    public WeakReference A01;

    public C334967cA(UserSession userSession, Object obj) {
        0qQ.A0B(userSession, 2);
        if (C231492rl.A00(userSession).A0C) {
            this.A01 = new WeakReference(obj);
        } else {
            this.A00 = obj;
        }
    }
}
