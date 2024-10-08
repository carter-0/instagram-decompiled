package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fo7  reason: case insensitive filesystem */
public final class C51077Fo7 implements G7S {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ AnonymousClass3FW A02;
    public final /* synthetic */ String A03;

    public C51077Fo7(UserSession userSession, User user, AnonymousClass3FW r3, String str) {
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = r3;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public final void DCw(Long l, Long l2, long j, long j2, boolean z) {
        AnonymousClass1Nd.A00(this.A00).A00(new Object());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object] */
    public final void Dov(Long l, Long l2, long j, long j2, boolean z) {
        UserSession userSession = this.A00;
        AnonymousClass1Nd.A00(userSession).A00(new Object());
        User user = this.A01;
        user.A1D(false);
        C46359DdX.A07(userSession, user, (List) null, j, j2);
        user.A0x(0sn.A00);
        C46359DdX.A06(userSession);
        0xG A0O = DbS.A0O("quiet_mode");
        AnonymousClass7TG.A1N(userSession, A0O);
        new DcM(A0O, userSession).A04(Dba.A0Q(this.A02), (Boolean) null, (Long) null, (Long) null, (Long) null, this.A03, false, true);
    }
}
