package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8RL  reason: invalid class name */
public final class AnonymousClass8RL extends C361478gI {
    public final AnonymousClass2Fj A00 = new AnonymousClass2Fj();
    public final 0V2 A01;
    public final C61770pa A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RL(Application application, UserSession userSession) {
        super(application);
        0qQ.A0B(userSession, 2);
        this.A03 = userSession;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A01 = A012;
        this.A02 = A012;
    }

    public final void A0E(AnonymousClass8RM r10, int i) {
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass9K7 r3 = new AnonymousClass9K7(this, r10, (AnonymousClass4D7) null, i, 0);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
    }

    public final void A0F(MQQ mqq) {
        0qQ.A0B(mqq, 0);
        if (mqq instanceof C65087Ln8) {
            C59895JbK.A00 = true;
            27r A012 = 27p.A01(this.A03);
            if (A012.A0J() != null) {
                27r.A08(C59725JVj.POST_CAPTURE, A012, "TIMELINE_TO_SHARE_SHEET_TAP", true);
            }
        } else if (AnonymousClass9IF.A00(1, mqq)) {
            29Z r3 = 27p.A01(this.A03).A0F;
            0wc r2 = r3.A02;
            0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
            if (A002.isSampled()) {
                A002.A8M(AnonymousClass80P.CLIPS_ADD, "tool_type");
                A002.AAJ("legacy_falco_event_name", "IG_CAMERA_ADD_CLIPS");
                AnonymousClass283 r4 = r3.A04;
                String str = r4.A0L;
                if (str == null) {
                    str = "";
                }
                A002.AAJ("camera_session_id", str);
                A002.A8M(C279294yP.CLIPS, "camera_destination");
                A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8k("event_type", 2);
                A002.A8M(C59725JVj.POST_CAPTURE, "surface");
                A002.A8M(r3.A0I(), "capture_type");
                A002.AAJ("module", 27x.A09.getModuleName());
                A002.A8M(28t.A06, "media_type");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.AAK(2AL.A07(r3.A00, r3.A03), "system_info");
                A002.Cgf();
            }
        } else if (mqq instanceof C65089LnA) {
            27r A013 = 27p.A01(this.A03);
            if (!(A013.A0J() == null || A013.A04.A0C == null)) {
                27r.A0C(A013, AnonymousClass000.A00(2128));
            }
        } else if (mqq instanceof C65090LnB) {
            27p.A01(this.A03).A0T();
        } else if (mqq instanceof C381969cs) {
            27r A014 = 27p.A01(this.A03);
            C381969cs r0 = (C381969cs) mqq;
            int i = r0.A00;
            boolean z = r0.A02;
            if (A014.A0J() != null) {
                27r.A06(C59725JVj.POST_CAPTURE, A014, "TIMELINE_AUDIO_CHANGE_TAP", i, z);
            }
        } else if (mqq instanceof C40395AbS) {
            C59895JbK.A00 = true;
        } else if (mqq instanceof C40399AbW) {
            29R r32 = 27p.A01(this.A03).A09;
            1Ln A08 = 1Ln.A08(r32.A01);
            C279294yP A0J = r32.A0J();
            if (A08.A00.isSampled() && A0J != null) {
                A08.A0t("IG_CAMERA_ENTITY_TAP");
                A08.A0r("TIMELINE_SAVE_BUTTON_TAP");
                29R.A00(A08, r32);
                A08.A0a(A0J);
                AnonymousClass283 r1 = r32.A04;
                A08.A0b(r1.A09);
                A08.A0T();
                A08.A0U();
                A08.A0n(27x.A08.getModuleName());
                A08.A0c(r1.A0A);
                A08.A0u(AnonymousClass1QI.A00.A02.A00);
                A08.Cgf();
            }
        }
        this.A00.A0B(new AnonymousClass88W(mqq));
    }
}
