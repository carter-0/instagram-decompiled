package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fo6  reason: case insensitive filesystem */
public final class C51076Fo6 implements G7S {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3FW A01;
    public final /* synthetic */ String A02;

    public C51076Fo6(UserSession userSession, AnonymousClass3FW r2, String str) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public final void DCw(Long l, Long l2, long j, long j2, boolean z) {
        AnonymousClass1Nd.A00(this.A00).A00(new Object());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object] */
    public final void Dov(Long l, Long l2, long j, long j2, boolean z) {
        long j3;
        long j4;
        UserSession userSession = this.A00;
        AnonymousClass1Nd.A00(userSession).A00(new Object());
        if (!(l == null || l2 == null)) {
            this.A01.A05(l.longValue(), l2.longValue());
        }
        C46359DdX.A06(userSession);
        long j5 = 0;
        if (l == null || l2 == null) {
            j3 = 0;
        } else {
            j3 = l2.longValue() - l.longValue();
        }
        0xG A0O = DbS.A0O("quiet_mode");
        AnonymousClass7TG.A1N(userSession, A0O);
        DcM dcM = new DcM(A0O, userSession);
        F10 A03 = this.A01.A03(0);
        String str = this.A02;
        if (l != null) {
            j4 = l.longValue();
        } else {
            j4 = 0;
        }
        if (l2 != null) {
            j5 = l2.longValue();
        }
        DcM.A02(dcM, A03, (Boolean) null, (Boolean) null, AnonymousClass7TE.A0v(), (Long) null, (Long) null, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j3), "ig_quiet_mode_pause_toggled", str, (List) null, (Map) null);
    }
}
