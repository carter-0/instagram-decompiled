package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.8xE  reason: invalid class name and case insensitive filesystem */
public final class C370888xE implements 1UV {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;

    public C370888xE(UserSession userSession, DirectThreadKey directThreadKey) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C254703su r4 = (C254703su) obj;
        C300945yD A002 = C300935yC.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        0qQ.A0A(r4);
        return A002.A02(r4, directThreadKey, false);
    }
}
