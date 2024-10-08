package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2jT  reason: invalid class name and case insensitive filesystem */
public final class C227522jT extends 1KD {
    public final /* synthetic */ UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C227522jT(UserSession userSession) {
        super("scheduleInitLocationPlugin");
        this.A00 = userSession;
    }

    public final boolean onQueueIdle() {
        1ES.A03(new AnonymousClass3S6(this));
        return false;
    }
}
