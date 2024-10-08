package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P9a  reason: case insensitive filesystem */
public final class C72517P9a implements C333107Xr, AnonymousClass7XW, C332937Xa, C332947Xb, C332307Ul {
    public final UserSession A00;
    public final AnonymousClass7XW A01;
    public final AnonymousClass7XP A02;

    public final boolean CPk() {
        return false;
    }

    public final void Etu(2FW r1, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    public final void Ewv(AnonymousClass7EF r1, MessageIdentifier messageIdentifier, String str) {
    }

    public final void FHP(MessageIdentifier messageIdentifier, boolean z) {
    }

    public final AnonymousClass4kA AxJ() {
        return AnonymousClass4k9.A00(this.A00);
    }

    public final void DBq(MessageIdentifier messageIdentifier, boolean z) {
        AnonymousClass7XW r2 = this.A01;
        if (r2 instanceof C72535P9s) {
            ((C72535P9s) r2).A00 = this.A02;
        }
        if (r2 != null) {
            r2.DBq(messageIdentifier, z);
        }
    }

    public C72517P9a(UserSession userSession, AnonymousClass7XW r2, AnonymousClass7XP r3) {
        AnonymousClass7TG.A1P(userSession, r3);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
