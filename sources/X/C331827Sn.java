package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.7Sn  reason: invalid class name and case insensitive filesystem */
public final class C331827Sn {
    public AnonymousClass3SZ A00;
    public Long A01;
    public final UserSession A02;
    public final 2Dm A03;

    public C331827Sn(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A02 = userSession;
        this.A03 = r3;
    }

    public final List A00(AnonymousClass2Ep r4, DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 0);
        AnonymousClass3SZ r1 = this.A00;
        if (r1 == null && r4 != null) {
            r1 = r4.Aue(this.A02.A06);
            this.A00 = r1;
        }
        if (this.A01 == null && r1 != null) {
            this.A01 = Long.valueOf(this.A03.B6G(r1, directThreadKey));
        }
        return this.A03.Aax(directThreadKey, false);
    }
}
