package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4gE  reason: invalid class name and case insensitive filesystem */
public final class C270124gE implements 1Nv {
    public final int A00;
    public final AnonymousClass3I6 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;

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
        String id = this.A01.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C270124gE(AnonymousClass3I6 r5) {
        String str;
        this.A01 = r5;
        ArrayList arrayList = null;
        if (r5.BSY() != null) {
            str = String.valueOf(r5.BSY());
        } else {
            str = null;
        }
        this.A04 = str;
        this.A09 = r5.BR3();
        List<C46252DSh> BQM = r5.BQM();
        if (BQM != null) {
            arrayList = new ArrayList(0Yv.A1E(BQM, 10));
            for (C46252DSh cuy : BQM) {
                arrayList.add(new C45356Cuy(cuy));
            }
        }
        this.A08 = arrayList;
        this.A03 = this.A01.BCi();
        this.A05 = this.A01.C7x();
        this.A02 = this.A01.Ago();
        this.A06 = this.A01.C8H();
        Integer AzO = this.A01.AzO();
        if (AzO != null) {
            this.A00 = AzO.intValue();
            String C9L = this.A01.C9L();
            if (C9L != null) {
                this.A07 = C9L;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
