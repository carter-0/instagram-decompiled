package X;

import android.os.Handler;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OZQ {
    public C71002OVz A00;
    public Runnable A01;
    public final long A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C69447Nlr A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final OME A07;
    public final String A08;
    public final C62320sa A09;
    public final C62320sa A0A;
    public final 0sL A0B;
    public final 1vn A0C;

    public static final void A00(OZQ ozq, C71002OVz oVz, String str) {
        UserSession userSession = ozq.A06;
        AnonymousClass0iw r2 = ozq.A05;
        String str2 = oVz.A00;
        0qQ.A06(str2);
        String str3 = oVz.A01;
        C71048OaQ.A02(ozq.A04, r2, userSession, str, str2, str3, ozq.A08, (List) null);
        OME ome = ozq.A07;
        0qQ.A06(str3);
        int hashCode = str3.hashCode();
        02m r22 = ome.A00;
        r22.markerAnnotate(944520647, hashCode, "error", str);
        r22.markerEnd(944520647, hashCode, 3);
    }

    public final void A02() {
        C71002OVz oVz = new C71002OVz(this.A00.A00, 0sn.A00);
        this.A00 = oVz;
        UserSession userSession = this.A06;
        AnonymousClass0iw r1 = this.A05;
        String str = oVz.A00;
        0qQ.A06(str);
        String str2 = oVz.A01;
        C69447Nlr nlr = this.A04;
        String str3 = this.A08;
        0qQ.A0B(nlr, 4);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "direct_ai_sticker_regenerate_stickers");
            if (A0e.isSampled()) {
                A0e.AAJ("search_query", str);
                C66584MXp.A0n(nlr, A0e, str2, str3);
                A0e.Cgf();
            }
        }
        A01(this, oVz, true);
    }

    public OZQ(C69447Nlr nlr, AnonymousClass0iw r6, UserSession userSession, String str, String str2, C62320sa r10, C62320sa r11, 0sL r12) {
        this.A06 = userSession;
        this.A05 = r6;
        this.A08 = str;
        this.A0A = r10;
        this.A0B = r12;
        this.A09 = r11;
        this.A04 = nlr;
        this.A0C = 1vm.A01(userSession);
        this.A07 = C73918Ply.A00(userSession);
        this.A02 = Math.max(182.A01(0Tu.A05, userSession, 36599207331433933L) - 300, 0);
        this.A00 = new C71002OVz(str2, 0sn.A00);
    }

    public static final void A01(OZQ ozq, C71002OVz oVz, boolean z) {
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        String str = oVz.A00;
        boolean A1Z = C41848B3p.A1Z(A042, "prompt", str);
        A042.A04("media_type", "image/png");
        A042.A03("scaling_factor", Double.valueOf(1.0d));
        A042.A04("caller", "igd_ai_gen_stickers");
        Boolean valueOf = Boolean.valueOf(z);
        A042.A02("bypass_cache", valueOf);
        PandoGraphQLRequest A002 = C71582OnJ.A00(A042, A043, AnonymousClass7TF.A1V(valueOf), A1Z);
        UserSession userSession = ozq.A06;
        AnonymousClass0iw r1 = ozq.A05;
        0qQ.A06(str);
        String str2 = oVz.A01;
        C69447Nlr nlr = ozq.A04;
        String str3 = ozq.A08;
        0qQ.A0B(nlr, 4);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "direct_ai_sticker_model_request_sent");
            if (A0e.isSampled()) {
                A0e.AAJ("search_query", str);
                C66584MXp.A0n(nlr, A0e, str2, str3);
                A0e.Cgf();
            }
        }
        OME ome = ozq.A07;
        0qQ.A06(str2);
        ome.A00(str2, false);
        1vn r3 = ozq.A0C;
        0qQ.A0A(A002);
        r3.ATL(new C71556Omr(5, ozq, oVz), new C71579OnG(9, ozq, oVz), A002);
    }
}
