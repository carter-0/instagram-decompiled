package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;

public final class NM1 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public NM1(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onFail(C268654dm r5) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1823296178);
                AnonymousClass7TF.A1N(((C71013OYl) this.A01).A04);
                i = 1838913006;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(269508984);
                C64986LlP llP = (C64986LlP) ((LZJ) this.A01).A01;
                1Au.A00(llP.A0C).A1D(!this.A02);
                C59689JTv.A0A(llP.A09, "setAllowStoryReshare_error");
                C64986LlP.A04(llP);
                i = -1218347777;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-306357919);
                C64986LlP llP2 = (C64986LlP) ((LZJ) this.A01).A01;
                1Au.A00(llP2.A0C).A1F(this.A02);
                C59689JTv.A0A(llP2.A09, "setAutoSaveReelMediaToGallery_error");
                C64986LlP.A04(llP2);
                i = 683324168;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-735853476);
                CGG cgg = (CGG) obj;
                int A032 = AnonymousClass0fD.A03(643117231);
                if (cgg != null) {
                    C71013OYl oYl = (C71013OYl) this.A01;
                    UserSession userSession = oYl.A03;
                    String str = oYl.A01.A0H;
                    C74254Pri A002 = cgg.A00(userSession, str);
                    if (A002 instanceof GroupLinkPreviewResponse$Success) {
                        GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) A002;
                        String str2 = groupLinkPreviewResponse$Success.A0A;
                        if (str2 != null && str2.length() != 0) {
                            AnonymousClass7TF.A1N(oYl.A04);
                            1pE A012 = 1pE.A01(oYl.A00, oYl.A02, userSession, "inbox_notes_tray");
                            DbZ.A1Z(A012, str2);
                            DbV.A1R(A012);
                        } else if (this.A02 || !182.A06(0Tu.A05, userSession, 36323255681952802L)) {
                            C71013OYl.A00(oYl, groupLinkPreviewResponse$Success);
                        } else {
                            1NY A0N = DbU.A0N(userSession);
                            A0N.A0A("direct_v2/join_thread_via_note_chat/");
                            A0N.A9m("note_id", str);
                            1OC A0S = DbT.A0S(A0N, NH0.class, OQN.class);
                            NMH.A00(A0S, groupLinkPreviewResponse$Success, oYl, 10);
                            1ES.A06(A0S, 1695661322, false);
                        }
                    }
                }
                AnonymousClass0fD.A0A(1203169535, A032);
                i = -750474669;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(2066966949);
                int A033 = AnonymousClass0fD.A03(-196267130);
                NM1.super.onSuccess(obj);
                AnonymousClass0fD.A0A(-541541299, A033);
                i = 1805041394;
                break;
            default:
                A03 = AnonymousClass0fD.A03(791043134);
                int A034 = AnonymousClass0fD.A03(-44581615);
                NM1.super.onSuccess(obj);
                AnonymousClass0fD.A0A(1976380611, A034);
                i = -440716520;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
