package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WrD  reason: case insensitive filesystem */
public final class C20428WrD implements 02o {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0rm A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C20428WrD(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, 0rm r7, boolean z, boolean z2, boolean z3) {
        this.A06 = r7;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A02 = str3;
        this.A05 = str4;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r10) {
        1Yh A002 = C18138VmE.A00();
        0rm r0 = this.A06;
        UserSession userSession = this.A01;
        C17945Via via = new C17945Via(this.A00, new WPZ(r0), userSession, (1Xj) obj, (String) r0.A00);
        via.A06 = this.A03;
        via.A08 = this.A04;
        via.A0C = this.A07;
        via.A0E = this.A09;
        via.A0D = this.A08;
        via.A05 = this.A02;
        via.A09 = this.A05;
        via.A0F = true;
        via.A0B = true;
        A002.A0C(via);
        return C60340gF.A00;
    }
}
