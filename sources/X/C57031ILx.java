package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ILx  reason: case insensitive filesystem */
public final class C57031ILx implements C267334bO {
    public final int A00;
    public final C376699Iz A01;
    public final AnonymousClass3OA A02;
    public final C295365o2 A03 = C295365o2.MULTI_ADS;
    public final 1Xj A04;
    public final String A05;
    public final boolean A06;

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
        return true;
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
        return this.A05;
    }

    public final 1Xj BPf() {
        return this.A04;
    }

    public final String ByO(UserSession userSession) {
        return this.A02.A0j;
    }

    public final /* synthetic */ List C6m() {
        return null;
    }

    public final C295365o2 CAV() {
        return this.A03;
    }

    public final boolean CUz() {
        return this.A06;
    }

    public final boolean CYg() {
        return false;
    }

    public final String getId() {
        return this.A01.A02;
    }

    public final String getOrganicTrackingToken() {
        return null;
    }

    public C57031ILx(C376699Iz r2, AnonymousClass3OA r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r3.A0u;
        this.A04 = r3.A0K;
        this.A05 = r3.A0j;
        this.A00 = DbX.A02(((IntentAwareAdsInfoIntf) r2.A01).BUY());
    }

    public static IntentAwareAdsInfoIntf A00(C267324bN r0) {
        return (IntentAwareAdsInfoIntf) r0.A03().A01.A01;
    }

    public static Integer A01(C267324bN r0) {
        return AnonymousClass4I5.A00(Integer.valueOf(r0.A03().A00));
    }

    public static List A02(C267324bN r0) {
        return (List) r0.A03().A01.A00;
    }
}
