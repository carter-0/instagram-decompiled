package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5o1  reason: invalid class name and case insensitive filesystem */
public final class C295355o1 implements C267334bO {
    public final 1Xj A00;
    public final AnonymousClass3OA A01;
    public final C295365o2 A02 = C295365o2.ORGANIC;
    public final String A03;
    public final String A04;
    public final List A05;

    public C295355o1(1Xj r2, AnonymousClass3OA r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r2.A0C.getOrganicTrackingToken();
        this.A03 = this.A00.A0C.BGe();
        this.A05 = this.A00.A0C.Alu();
    }

    public final /* synthetic */ String AyM(UserSession userSession) {
        return C295385o4.A01(this, userSession);
    }

    public final /* synthetic */ 1iA BR7() {
        return C295385o4.A00(this);
    }

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final /* synthetic */ boolean CJc() {
        return C295385o4.A02(this);
    }

    public final boolean CcK() {
        return false;
    }

    public final List Alu() {
        return this.A05;
    }

    public final /* synthetic */ C258043yN Am3() {
        return null;
    }

    public final /* synthetic */ AdFormatType B7V() {
        return null;
    }

    public final String BGe() {
        return this.A03;
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final /* synthetic */ List C6m() {
        return null;
    }

    public final C295365o2 CAV() {
        return this.A02;
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getOrganicTrackingToken() {
        return this.A04;
    }
}
