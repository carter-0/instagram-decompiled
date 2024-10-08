package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class IMZ implements C270744hE {
    public static final long A04;
    public static final long A05;
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final void AHo(UserSession userSession) {
    }

    public final Integer AJJ(UserSession userSession, C324596za r9, C324356z9 r10) {
        0qQ.A0B(r10, 1);
        return r10.A01(r9, this.A02, A05, false);
    }

    public final void AQ0(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        ILD ild = new ILD(this, 0);
        String str3 = this.A01;
        Integer num = AnonymousClass05K.A01;
        UserSession userSession2 = userSession;
        boolean z3 = this.A03;
        1OC A002 = C56248HvF.A00(userSession2, num, str3, (String) null, false, true, true, z3);
        1P2 A003 = 1P1.A00(userSession2);
        String str4 = this.A02;
        0qQ.A0B(str4, 0);
        1P2.A00(A003, ild, (1P0) null, (1P0) null, A002, C56248HvF.A00(userSession2, AnonymousClass05K.A0C, str3, (String) null, false, true, true, z3), str4, A05, false, false);
    }

    public final boolean ARQ(UserSession userSession) {
        return true;
    }

    public final 1Xj B65(UserSession userSession) {
        return null;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        return C56248HvF.A00(userSession, AnonymousClass05K.A0N, this.A01, (String) null, z, true, false, this.A03);
    }

    public final Integer Bec(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 1P1.A00(userSession).A06(this.A02, A05, false);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        return C56248HvF.A00(userSession, (Integer) null, this.A01, str, false, false, false, false);
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

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A05 = timeUnit.toSeconds(60);
        A04 = timeUnit.toMillis(60);
    }

    public IMZ(String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = i;
        this.A02 = 002.A0R("effect_page_cache_", str);
    }

    public final String Beh() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
