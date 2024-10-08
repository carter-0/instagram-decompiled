package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GEC implements C267334bO {
    public final C295365o2 A00;
    public final 1Xj A01;

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

    public final /* synthetic */ List Alu() {
        return null;
    }

    public final /* synthetic */ C258043yN Am3() {
        return null;
    }

    public final /* synthetic */ AdFormatType B7V() {
        return null;
    }

    public final String BGe() {
        return null;
    }

    public final 1Xj BPf() {
        return this.A01;
    }

    public final /* synthetic */ List C6m() {
        return null;
    }

    public final C295365o2 CAV() {
        return this.A00;
    }

    public final boolean CUz() {
        return false;
    }

    public final boolean CYg() {
        return false;
    }

    public final String getId() {
        String id;
        1Xj r0 = this.A01;
        if (r0 == null || (id = r0.getId()) == null) {
            return this.A00.toString();
        }
        return id;
    }

    public final String getOrganicTrackingToken() {
        return null;
    }

    public GEC(C295365o2 r1, 1Xj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
