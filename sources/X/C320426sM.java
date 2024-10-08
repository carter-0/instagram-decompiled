package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6sM  reason: invalid class name and case insensitive filesystem */
public final class C320426sM implements C270754hF, C270744hE, C270764hG {
    public static final Integer A03 = AnonymousClass05K.A00;
    public final long A00 = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MINUTES.toMillis(60));
    public final String A01;
    public final String A02;

    public final void AHo(UserSession userSession) {
    }

    public final Integer AJJ(UserSession userSession, C324596za r9, C324356z9 r10) {
        0qQ.A0B(r10, 1);
        return r10.A02(r9, this.A01, this.A00, false, true);
    }

    public final void AQ0(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        AXC axc = new AXC(this);
        UserSession userSession2 = userSession;
        1GP A04 = AnonymousClass73D.A00.A04(userSession2, A03, this.A02, (String) null, false);
        1Ga A002 = 1GZ.A00(userSession);
        String str3 = this.A01;
        0qQ.A0B(str3, 0);
        1Ga.A00(A002, axc, (AnonymousClass1GR) null, (AnonymousClass1GR) null, A04, (1GP) null, str3, this.A00, false, false);
    }

    public final boolean ARQ(UserSession userSession) {
        return false;
    }

    public final 1Xj B65(UserSession userSession) {
        return null;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A02;
        Integer num = A03;
        0qQ.A0B(num, 3);
        1NY A002 = AnonymousClass93V.A00(userSession);
        AnonymousClass73D.A02(A002, userSession, num, str, (String) null, (String) null, z);
        return A002.A0M();
    }

    public final Integer Bec(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 1GZ.A00(userSession).A06(this.A01, this.A00, false);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A02;
        Integer num = A03;
        0qQ.A0B(num, 3);
        1NY A002 = AnonymousClass93V.A00(userSession);
        AnonymousClass73D.A02(A002, userSession, num, str2, str, (String) null, false);
        return A002.A0M();
    }

    public final 1GP Cmt(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 0);
        return AnonymousClass73D.A00.A04(userSession, A03, this.A02, (String) null, z);
    }

    public final 1GP Cmv(Context context, UserSession userSession, String str, List list, boolean z) {
        0qQ.A0B(userSession, 0);
        return AnonymousClass73D.A00.A04(userSession, A03, this.A02, str, false);
    }

    public final /* synthetic */ void Cn2(UserSession userSession, String str) {
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public C320426sM(String str) {
        this.A02 = str;
        this.A01 = 002.A0R("clips/user/", str);
    }

    public final String Beh() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
