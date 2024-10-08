package X;

import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Pn0  reason: case insensitive filesystem */
public final class C73982Pn0 extends 0Yg implements 0sP {
    public final /* synthetic */ C71143Odx A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73982Pn0(C71143Odx odx, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A00 = odx;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = list;
        this.A04 = str4;
        this.A08 = z3;
        this.A09 = z4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean z;
        N4R n4r = (N4R) obj;
        0qQ.A0B(n4r, 0);
        C71143Odx odx = this.A00;
        UserSession userSession = odx.A0H;
        C70320O1y.A00(userSession).A01(8);
        boolean z2 = this.A06;
        C68364NCd nCd = new C68364NCd(odx, new C58736Iwj(24, odx, z2));
        String str = this.A02;
        String str2 = this.A03;
        boolean z3 = !0qQ.A0K(str, str2);
        String str3 = this.A01;
        boolean A0K = 0qQ.A0K(str3, "video_call_business_profile");
        boolean contains = C66581MXm.A11("video_call_creator_ai_sandbox_thread", "video_call_creator_ai_embodiment_canonical_thread").contains(str3);
        if (A0K) {
            i = 3;
        } else {
            i = 0;
            if (contains) {
                i = 5;
            }
        }
        if (!z2 || (this.A07 && !182.A06(0Tu.A05, userSession, 36320957874512874L))) {
            z = false;
        } else {
            z = true;
        }
        List list = this.A05;
        if (list.isEmpty()) {
            OX3.A02(C56316HwT.A01(userSession), "ig_outbound_failure_empty_callee_list", this.A04, (String) null, AnonymousClass7TE.A1I("error"), DbY.A0p("is_e2ee", String.valueOf(z2), AnonymousClass7TE.A1L("trigger", str3)), true);
            if (182.A06(0Tu.A05, userSession, 36323667999927674L)) {
                C71004OWb.A00.A02("RtcRsysInteractor", "startCall() with empty callee list", (Throwable) null);
                return C60340gF.A00;
            }
        }
        OEP oep = (OEP) n4r.A00;
        String str4 = this.A04;
        if (z2) {
            str2 = str;
        }
        String startCallCopyId = oep.A01.startCallCopyId(str4, str, str2, AnonymousClass7TE.A1D(list), z3, this.A08, str3, i, this.A09, z2, z, C273654mx.A00(816).equals(str3), nCd, (PregenerateSdp) null, (OverlayConfigLayerInterface) null);
        0qQ.A07(startCallCopyId);
        C71004OWb.A00.A01("RtcRsysInteractor", 002.A0R("startCall() with localCallId ", startCallCopyId));
        return C60340gF.A00;
    }
}
