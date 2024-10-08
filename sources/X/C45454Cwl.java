package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

/* renamed from: X.Cwl  reason: case insensitive filesystem */
public final class C45454Cwl {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C18487Vsi A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public C45454Cwl(UserSession userSession, C18487Vsi vsi, 1Xj r3, AnonymousClass3W1 r4) {
        this.A03 = r4;
        this.A01 = vsi;
        this.A02 = r3;
        this.A00 = userSession;
    }

    public final void A00(Integer num, String str) {
        C18487Vsi.A00(this.A01, num, "failure", str);
        this.A03.A2W = false;
    }

    public final void A01(Integer num, List list, int i, boolean z) {
        1Xj r3 = this.A02;
        r3.A4H(list);
        r3.A0C.Edd(Boolean.valueOf(z));
        1E7.A00(this.A00).A03(r3);
        C18487Vsi.A00(this.A01, num, RealtimeConstants.SEND_SUCCESS, (String) null);
        11Z.A02(new DI0(r3, this.A03, i));
    }
}
