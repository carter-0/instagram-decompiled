package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GPk  reason: case insensitive filesystem */
public final class C52364GPk implements C267334bO {
    public final AnonymousClass3OA A00;
    public final C295365o2 A01;

    public final String AyM(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A00.A03(userSession);
    }

    public final boolean CcK() {
        return true;
    }

    public final String getOrganicTrackingToken() {
        return null;
    }

    public final List Alu() {
        return this.A00.A01();
    }

    public final C258043yN Am3() {
        return this.A00.A05;
    }

    public final AdFormatType B7V() {
        return this.A00.A01;
    }

    public final String BGe() {
        return this.A00.A0j;
    }

    public final 1Xj BPf() {
        return this.A00.A0K;
    }

    public final 1iA BR7() {
        AnonymousClass3OA r1 = this.A00;
        1iA r0 = r1.A0M;
        if (r0 == null) {
            return r1.A0K.BR7();
        }
        return r0;
    }

    public final String ByO(UserSession userSession) {
        return this.A00.A0j;
    }

    public final /* synthetic */ List C6m() {
        return null;
    }

    public final C295365o2 CAV() {
        return this.A01;
    }

    public final boolean CJc() {
        AnonymousClass3OA r1 = this.A00;
        if (r1.A0J.A4Y()) {
            return true;
        }
        C257853y4 r0 = r1.A0I;
        if (r0 == null || r0.BUi() == null) {
            return false;
        }
        return true;
    }

    public final boolean CUz() {
        return this.A00.A0u;
    }

    public final boolean CYg() {
        return false;
    }

    public final String getId() {
        return this.A00.A0S;
    }

    public C52364GPk(C295365o2 r1, AnonymousClass3OA r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
