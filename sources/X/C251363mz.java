package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3mz  reason: invalid class name and case insensitive filesystem */
public final class C251363mz implements C251373n0 {
    public final C250973mM A00;
    public final int A01;
    public final UserSession A02;
    public final Integer A03;
    public final Integer A04;

    public final long AsM() {
        long j = this.A00.A0F;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException(C273654mx.A00(472));
    }

    public final long B2r() {
        Long l = this.A00.A0H.A0j;
        if (l != null) {
            return l.longValue();
        }
        return Long.MIN_VALUE;
    }

    public final int B9W() {
        Integer num;
        Reel reel = this.A00.A0H;
        UserSession userSession = this.A02;
        synchronized (reel.A1n) {
            if ((!182.A06(0Tu.A05, userSession, 36313463156770833L)) && !reel.A0v.isEmpty()) {
                num = ((AnonymousClass3OA) reel.A0v.get(0)).A0P;
            } else if (!reel.A15.isEmpty()) {
                num = C231122qu.A05(userSession, (1Xj) reel.A15.get(0));
            } else {
                num = -1;
            }
            if (num == null) {
                return -1;
            }
        }
        return num.intValue();
    }

    public final /* bridge */ /* synthetic */ Object BTb() {
        return this.A00;
    }

    public final Integer Bdb() {
        return this.A03;
    }

    public final String BnF() {
        String str = this.A00.A0I;
        if (str == null) {
            return "-1";
        }
        return str;
    }

    public final int BnH() {
        return this.A01;
    }

    public final String BnL() {
        String str = this.A00.A0J;
        if (str == null) {
            return "-1";
        }
        return str;
    }

    public final /* synthetic */ boolean Bo5() {
        return false;
    }

    public final Integer Bxj() {
        return this.A04;
    }

    public final boolean CUo() {
        return this.A00.A09;
    }

    public final /* synthetic */ void Eiv(boolean z) {
        throw new UnsupportedOperationException("Not supported");
    }

    public C251363mz(UserSession userSession, C250973mM r2, Integer num, Integer num2, int i) {
        this.A00 = r2;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        r2.A03 = num;
        this.A02 = userSession;
    }
}
