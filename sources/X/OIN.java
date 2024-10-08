package X;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OIN {
    public final ViewGroup A00;
    public final FragmentActivity A01;
    public final 0hq A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final 2el A05;
    public final OKY A06;
    public final C71111Ocu A07;
    public final OLU A08 = new OLU();
    public final O9L A09;
    public final OWA A0A;
    public final C72192OyC A0B;
    public final OER A0C;
    public final OLF A0D;
    public final OZx A0E;
    public final C62320sa A0F;
    public final C62320sa A0G;
    public final AnonymousClass07Z A0H;

    public OIN(ViewGroup viewGroup, FragmentActivity fragmentActivity, 0hq r7, AnonymousClass07Z r8, AnonymousClass0iw r9, UserSession userSession, 2el r11, C62320sa r12, C62320sa r13) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A01 = fragmentActivity;
        this.A02 = r7;
        this.A03 = r9;
        this.A0F = r12;
        this.A0G = r13;
        this.A05 = r11;
        this.A0H = r8;
        C71111Ocu ocu = new C71111Ocu((Handler) null, (DefaultConstructorMarker) null, 1);
        this.A07 = ocu;
        OKY oky = new OKY(userSession);
        this.A06 = oky;
        this.A0E = new OZx(userSession, oky);
        this.A0D = new OLF(fragmentActivity, viewGroup, userSession, ocu);
        C72192OyC A002 = C66953Mfm.A00(DbT.A05(fragmentActivity), userSession);
        OER oer = new OER(A002.A08, A002.A04, A002.A06);
        this.A0C = oer;
        OWA owa = oer.A02;
        0qQ.A0C(owa, "null cannot be cast to non-null type com.instagram.rtc.manager.RtcCallAnalyticsManager");
        this.A0A = owa;
        this.A09 = oer.A01;
        this.A0B = C66953Mfm.A00(DbT.A05(fragmentActivity), userSession);
    }
}
