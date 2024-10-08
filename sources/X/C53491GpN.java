package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GpN  reason: case insensitive filesystem */
public final class C53491GpN extends AnonymousClass0T0 implements JRG {
    public final 1Xj A00;
    public final boolean A01;
    public final String A02;

    public C53491GpN(1Xj r2) {
        String str;
        User Bfp;
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r2.A5q();
        C274354oA A0x = C51966G9m.A0x(r2);
        if (A0x == null || (Bfp = A0x.Bfp()) == null) {
            str = null;
        } else {
            str = Bfp.getUsername();
        }
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53491GpN) && 0qQ.A0K(this.A00, ((C53491GpN) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Boolean AkK() {
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x != null) {
            return A0x.AkK();
        }
        return null;
    }

    public final Boolean AkR() {
        boolean z;
        C274354oA A0x;
        1Xj r2 = this.A00;
        C274354oA A0x2 = C51966G9m.A0x(r2);
        if (A0x2 != null) {
            z = DbX.A1a(A0x2.CZb());
        } else {
            z = false;
        }
        if (z || r2.A00 != 0 || (A0x = C51966G9m.A0x(r2)) == null) {
            return null;
        }
        return A0x.AkR();
    }

    public final Integer AxC() {
        int i;
        Integer AxC;
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x == null || (AxC = A0x.AxC()) == null) {
            i = 0;
        } else {
            i = AxC.intValue();
        }
        return Integer.valueOf(i);
    }

    public final String Bfq() {
        return this.A02;
    }

    public final String Bj3() {
        C274334o8 BtE;
        1Xj Bj4;
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x == null || (BtE = A0x.BtE()) == null || (Bj4 = BtE.Bj4()) == null) {
            return null;
        }
        return Bj4.getId();
    }

    public final String Bn1() {
        C274334o8 BtE;
        1Xj Bn2;
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x == null || (BtE = A0x.BtE()) == null || (Bn2 = BtE.Bn2()) == null) {
            return null;
        }
        return Bn2.getId();
    }

    public final User Bn3(UserSession userSession) {
        C274334o8 BtE;
        1Xj Bn2;
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x == null || (BtE = A0x.BtE()) == null || (Bn2 = BtE.Bn2()) == null) {
            return null;
        }
        return Bn2.A2A(userSession);
    }

    public final User CCe(UserSession userSession) {
        return this.A00.A2A(userSession);
    }

    public final boolean CTT() {
        C274374oC B51;
        C274354oA A0x = C51966G9m.A0x(this.A00);
        if (A0x == null || (B51 = A0x.B51()) == null) {
            return false;
        }
        Boolean CTS = B51.CTS();
        Boolean A0v = AnonymousClass7TE.A0v();
        if (0qQ.A0K(CTS, A0v) || 0qQ.A0K(B51.B1o(), A0v)) {
            return true;
        }
        return false;
    }

    public final boolean CZr() {
        return this.A01;
    }

    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }
}
