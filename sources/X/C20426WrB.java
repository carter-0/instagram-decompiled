package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;

/* renamed from: X.WrB  reason: case insensitive filesystem */
public final class C20426WrB implements 02o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0rm A05;

    public C20426WrB(FragmentActivity fragmentActivity, UserSession userSession, String str, 0rm r4, int i, int i2) {
        this.A05 = r4;
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r10) {
        1Yh A002 = C18138VmE.A00();
        0rm r0 = this.A05;
        UserSession userSession = this.A03;
        C17945Via via = new C17945Via(this.A02, new C19194WPa(r0), userSession, (1Xj) obj, (String) r0.A00);
        via.A03 = PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE;
        via.A08 = this.A04;
        via.A00 = this.A00;
        via.A01 = this.A01;
        via.A0F = true;
        via.A0B = true;
        A002.A0C(via);
        return C60340gF.A00;
    }
}
