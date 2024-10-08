package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Oxm  reason: case insensitive filesystem */
public final class C72177Oxm implements AnonymousClass3KO {
    public final /* synthetic */ C254703su A00;
    public final /* synthetic */ C68167N3h A01;
    public final /* synthetic */ DirectVisualMessageViewerController A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C72177Oxm(C254703su r1, C68167N3h n3h, DirectVisualMessageViewerController directVisualMessageViewerController, boolean z, boolean z2) {
        this.A02 = directVisualMessageViewerController;
        this.A00 = r1;
        this.A01 = n3h;
        this.A04 = z;
        this.A03 = z2;
    }

    public final void DhB(long j) {
        C300145wb r1;
        double d;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A02;
        UserSession userSession = directVisualMessageViewerController.A0m;
        String A06 = DirectVisualMessageViewerController.A06(directVisualMessageViewerController);
        AnonymousClass2Ep r5 = directVisualMessageViewerController.A0n;
        C254703su r8 = this.A00;
        C68167N3h n3h = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A03;
        0qQ.A0B(r5, 2);
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(userSession, "igd_screenshot_capture"), "igd_screenshot_capture");
        if (A0e.isSampled()) {
            C66580MXl.A1J(A0e, A06);
            A0e.A7p("is_ephemeral", JTP.A0g(A0e, "sender_igid", r8.A1u, z2));
            A0e.A8M(C69435Nlf.IMAGE, AnonymousClass000.A00(540));
            switch (DbU.A02(n3h.A0B, 0)) {
                case 0:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                    r1 = C300145wb.IMAGE;
                    break;
                case 1:
                case EglBase14Impl.EGLExt_SDK_VERSION:
                case 23:
                case 25:
                    r1 = C300145wb.VIDEO;
                    break;
                case 3:
                    r1 = C300145wb.BROADCAST;
                    break;
                case 4:
                    r1 = C300145wb.CAROUSEL_V2;
                    break;
                case 6:
                    r1 = C300145wb.COLLECTION;
                    break;
                case 7:
                    r1 = C300145wb.AUDIO;
                    break;
                case 8:
                    r1 = C300145wb.SHOWREEL;
                    break;
                case 9:
                    r1 = C300145wb.GUIDE_FACADE;
                    break;
                case 10:
                    r1 = C300145wb.HSCROLL_ADS;
                    break;
                case 11:
                    r1 = C300145wb.REPOST_FACADE;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 26:
                case 27:
                    r1 = C300145wb.TEXT_POST;
                    break;
                case 13:
                    r1 = C300145wb.DIRECT_MESSAGE_COMMENT_FACADE;
                    break;
                case 14:
                    r1 = C300145wb.AI_AGENT;
                    break;
                case 15:
                    r1 = C300145wb.CONTAINER;
                    break;
                case 16:
                    r1 = C300145wb.SHOWCASE;
                    break;
                case 17:
                    r1 = C300145wb.FILE;
                    break;
                default:
                    r1 = C300145wb.UNKNOWN;
                    break;
            }
            A0e.A8M(r1, "media_type");
            A0e.A7p("should_block", Boolean.valueOf(z));
            0bb r2 = new 0bb();
            PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = n3h.A00;
            if (privacyMediaOverlayViewModel == null || privacyMediaOverlayViewModel.A00 != 2) {
                d = 0.0d;
            } else {
                d = 1.0d;
            }
            r2.A04("nudity", Double.valueOf(d));
            A0e.AAK(r2, "ml_sensitivity_score");
            A0e.A7p("is_dm", Boolean.valueOf(r5.Axj()));
            A0e.A7p("is_vm", Boolean.valueOf(n3h.A0X));
            A0e.Cgf();
        }
    }
}
