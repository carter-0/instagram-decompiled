package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4gA  reason: invalid class name and case insensitive filesystem */
public final class C270084gA implements 1Nv {
    public String A00;
    public List A01;
    public boolean A02;
    public final AnonymousClass3IT A03;
    public final String A04;

    public C270084gA(AnonymousClass3IT r4) {
        this.A03 = r4;
        String str = r4.A04;
        this.A04 = str == null ? "" : str;
        0sn r0 = r4.A09;
        this.A01 = r0 == null ? 0sn.A00 : r0;
        this.A00 = r4.A05;
        this.A02 = 0qQ.A0K(r4.A00, true);
    }

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CcK() {
        return false;
    }

    public final boolean CUz() {
        return false;
    }

    public final boolean CYg() {
        return false;
    }

    public final String getId() {
        return String.valueOf(this.A03.A02);
    }
}
