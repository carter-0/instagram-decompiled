package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ILw  reason: case insensitive filesystem */
public final class C57030ILw implements C267334bO {
    public 1Xj A00;
    public final C45427Cw7 A01;
    public final C295365o2 A02 = C295365o2.BRAND_SURVEY;
    public final String A03;

    public final /* synthetic */ String AyM(UserSession userSession) {
        return C295385o4.A01(this, userSession);
    }

    public final /* synthetic */ 1iA BR7() {
        return C295385o4.A00(this);
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
        return this.A00;
    }

    public final String ByO(UserSession userSession) {
        return this.A01.A08;
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
        return this.A01.A06;
    }

    public final String getOrganicTrackingToken() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Xy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.1Xy, java.lang.Object] */
    public C57030ILw(C45427Cw7 cw7) {
        this.A01 = cw7;
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        this.A00 = new 1Xj(new 1hu((UserSession) null), new Object());
        String str = cw7.A08;
        this.A03 = str == null ? "" : str;
        1Xj r1 = new 1Xj(new 1hu((UserSession) null), new Object());
        r1.A4G(cw7.A06);
        this.A00 = r1;
    }
}
