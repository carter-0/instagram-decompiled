package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.PBn  reason: case insensitive filesystem */
public final class C72582PBn implements C74514Pw9 {
    public final int A00;
    public final long A01;
    public final 2FW A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public final C282485Dg AxK() {
        return null;
    }

    public final String BsG() {
        return null;
    }

    public final ImageUrl BsN() {
        return null;
    }

    public final String CFp() {
        return null;
    }

    public final boolean COD() {
        return false;
    }

    public final boolean CRS() {
        return false;
    }

    public final boolean CRV() {
        return false;
    }

    public final boolean CXc() {
        return false;
    }

    public final boolean CXd() {
        return false;
    }

    public final Boolean Cen() {
        return null;
    }

    public final boolean Cep() {
        return false;
    }

    public final boolean Ceq() {
        return false;
    }

    public final boolean EHm() {
        return false;
    }

    public final 2FW Aqm() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        if (r1 != 6) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer BMS() {
        /*
            r2 = this;
            int r1 = r2.A00
            if (r1 == 0) goto L_0x0013
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x001c
            r0 = 4
            if (r1 == r0) goto L_0x0019
            r0 = 5
            if (r1 == r0) goto L_0x0016
            r0 = 6
            if (r1 == r0) goto L_0x001c
        L_0x0013:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0016:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0019:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x001c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            return r0
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72582PBn.BMS():java.lang.Integer");
    }

    public final List BrL() {
        return this.A07;
    }

    public final String BsJ() {
        return this.A05;
    }

    public final CharSequence BxI() {
        return this.A06;
    }

    public final long C7a() {
        return this.A01;
    }

    public final Set CFh() {
        return 0sl.A00;
    }

    public final /* bridge */ /* synthetic */ Collection CFi() {
        return 0sl.A00;
    }

    public final List CGC() {
        return 0sn.A00;
    }

    public final boolean CKy() {
        int i = this.A00;
        if (i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    public final boolean CU0() {
        return DbV.A1Z(this.A03, this.A05);
    }

    public final boolean CU3() {
        return this.A03.A1X();
    }

    public final boolean Cbp() {
        return this.A08;
    }

    public final String getId() {
        return this.A04;
    }

    public C72582PBn(2FW r1, User user, String str, String str2, String str3, List list, int i, long j, boolean z) {
        this.A03 = user;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A01 = j;
        this.A02 = r1;
        this.A07 = list;
        this.A08 = z;
    }
}
