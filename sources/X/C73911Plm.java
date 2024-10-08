package X;

import android.app.Activity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor;
import com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import go.Seq;
import org.webrtc.CameraCapturer;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Plm  reason: case insensitive filesystem */
public final class C73911Plm extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73911Plm(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C73911Plm A00(Object obj, int i) {
        return new C73911Plm(obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.PuQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v64, types: [X.NAb, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r0v68, types: [X.NAa, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r0v76, types: [com.facebook.msys.mca.MailboxFeature, X.NAJ] */
    /* JADX WARNING: type inference failed for: r0v90, types: [com.facebook.msys.mca.MailboxFeature, X.67N] */
    /* JADX WARNING: type inference failed for: r0v95, types: [com.facebook.msys.mca.MailboxFeature, X.NAY] */
    /* JADX WARNING: type inference failed for: r0v102, types: [X.NAC, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r0v106, types: [X.NAB, com.facebook.msys.mca.MailboxFeature] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass68J A002;
        switch (this.A00) {
            case 0:
                return C66582MXn.A0A((AnonymousClass7L2) this.A01);
            case 1:
                return C66582MXn.A0A(((C68909Nam) this.A01).A01);
            case 2:
                return Boolean.valueOf(C3267277x.A00(1Au.A00((UserSession) this.A01)));
            case 3:
                return Boolean.valueOf(C3267277x.A01(1Au.A00((UserSession) this.A01)));
            case 4:
                return new C70471O7w((UserSession) this.A01);
            case 5:
                UserSession A0Q = C66581MXm.A0Q(this.A01);
                return new C71620Oo0(C300345wy.A02(A0Q, AnonymousClass45R.A00(A0Q)), (AnonymousClass66a) A0Q.A01(AnonymousClass66a.class, AnonymousClass66b.A00), C3027865g.A00(A0Q, AnonymousClass0yP.A00(36325965806908832L), true));
            case 6:
                return new C70937OSk((UserSession) this.A01);
            case 7:
                return new C70744OJp((UserSession) this.A01);
            case 8:
                return new MsysMessageEditor((UserSession) this.A01);
            case 9:
                return new C70472O7x((UserSession) this.A01);
            case 10:
                return MYc.A01((UserSession) this.A01, "IgMailboxThreadSessionController").A01;
            case 11:
                MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
                return new C70473O7y(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                MailboxFeature mailboxFeature2 = MailboxFeature.$redex_init_class;
                return new C70474O7z(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case 13:
                C66611MYx mYx = C66612MYy.A00;
                UserSession userSession = (UserSession) this.A01;
                if (mYx.A02(userSession, true)) {
                    0qQ.A0B(userSession, 0);
                    A002 = (C71620Oo0) userSession.A01(C71620Oo0.class, A00(userSession, 5));
                } else if (AnonymousClass45R.A00(userSession)) {
                    A002 = C67471MoQ.A00(userSession);
                } else {
                    A002 = C66845Mdd.A00.A00(userSession);
                }
                return new O80(new MailboxFeature(A002));
            case 14:
                return new C70947OSu(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case 15:
                AnonymousClass681 r0 = AnonymousClass6AW.A00;
                return new O81(new C70626ODx(1aU.A09(new MailboxFeature(C66845Mdd.A00.A00((UserSession) this.A01)))));
            case 16:
                return new OKQ((UserSession) this.A01);
            case 17:
                AnonymousClass1aS r1 = 1aD.A01((UserSession) this.A01, "IgRxSafeBrowsing").A02;
                0qQ.A07(r1);
                return new O83(new O82(r1));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C300675xb(14i.A08, (UserSession) this.A01);
            case 19:
                MailboxFeature mailboxFeature3 = MailboxFeature.$redex_init_class;
                return new C67472MoR(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case 20:
                return new AnonymousClass61F((UserSession) this.A01);
            case 21:
                return new C70745OJr((UserSession) this.A01);
            case 22:
                AnonymousClass681 r02 = C68313NAa.A00;
                return new O85(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case 23:
                AnonymousClass681 r03 = C68314NAb.A00;
                return new C70948OSv(new MailboxFeature(C67471MoQ.A00((UserSession) this.A01)));
            case 24:
                SessionedNotificationCenter sessionedNotificationCenter = (SessionedNotificationCenter) this.A01;
                C72211Oyc oyc = new C72211Oyc(sessionedNotificationCenter);
                sessionedNotificationCenter.addObserver(oyc.A01, "MEMOfflineHandlingPreviewNotification", 1, (AnonymousClass2Lq) null);
                sessionedNotificationCenter.addObserver(oyc.A00, "MEMOfflineHandlingCompletionNotification", 1, (AnonymousClass2Lq) null);
                return oyc;
            case 25:
                UserSession userSession2 = (UserSession) this.A01;
                int i = 200;
                if (1CI.A00(userSession2)) {
                    i = CameraCapturer.OPEN_CAMERA_DELAY_MS;
                }
                return new 2Af(userSession2, i);
            case 26:
                return Boolean.valueOf(RealtimeClientManager.getInstance((UserSession) this.A01).isReceivingRealtimeAndForeground());
            case 27:
                return C70123Nxd.A00((UserSession) this.A01);
            case 28:
                C66870Me6 me6 = (C66870Me6) this.A01;
                return 0sr.A1P(new C74410PuQ[]{new C66875MeB(me6), new C66873Me9(me6), new C66874MeA(me6), new C66872Me8(me6), new C66883MeL(me6), new C66885MeN(me6), new C66882MeK(me6), new C66881MeJ(me6), new MeI(me6), new C66884MeM(me6)});
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                OGB ogb = (OGB) this.A01;
                return 0sr.A1P(new C74410PuQ[]{new PDU(ogb), new PDV(ogb)});
            case 30:
                OGB ogb2 = (OGB) this.A01;
                return 0sr.A1P(new C74410PuQ[]{new PDT(ogb2), new PDW(ogb2)});
            case 31:
                OFL ofl = (OFL) this.A01;
                return 0sr.A1P(new C74410PuQ[]{new PDY(ofl), new C72621PDa(ofl), new PDZ(ofl), new Object()});
            case 32:
                return new C72212Oyd((UserSession) this.A01);
            case 33:
                return new C3027365b(AnonymousClass0kN.A02((0lg) this.A01), 14i.A08);
            case 34:
                return new C71005OWe(AnonymousClass0kN.A02((0lg) this.A01));
            case 35:
                UserSession userSession3 = (UserSession) this.A01;
                MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = new MSGNotificationEngineValueProvider();
                C68309N9w n9w = new C68309N9w(userSession3);
                0qQ.A0B(userSession3, 0);
                return new NotificationEngineInstagramSyncIntegrator(userSession3, mSGNotificationEngineValueProvider, n9w, new C70767OKn(userSession3, new C71604Onf(userSession3), new C71606Onh(userSession3, OSH.A00)));
            case 36:
                return new AnonymousClass43R((UserSession) this.A01);
            case 37:
                return Integer.valueOf(DbV.A01(((C67177MjZ) this.A01).A00));
            case 38:
                return Integer.valueOf(C51968G9o.A04(((C67177MjZ) this.A01).A00));
            case 39:
                return ((C67177MjZ) this.A01).A00.getDrawable(R.drawable.instagram_creator_marketplace_pano_outline_24);
            case 40:
                Activity activity = ((C67177MjZ) this.A01).A00;
                C67077Mhs mhs = new C67077Mhs(activity);
                int A012 = DbU.A01(activity);
                mhs.A00 = A012;
                mhs.A01 = A012;
                mhs.A02 = true;
                mhs.A03 = false;
                return mhs;
            case Seq.NULL_REFNUM:
                return new C70628ODz(C51965G9l.A0l(), (UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET:
                return new MZQ(C51965G9l.A0l(), (UserSession) this.A01);
            case 43:
                return new AnonymousClass43M(C51965G9l.A0l());
            case 44:
                return new AnonymousClass43M(C51965G9l.A0l());
            case 45:
                return new AnonymousClass43M(C51965G9l.A0l());
            case 46:
                return new A8r((UserSession) this.A01);
            case 47:
                return new OTV(C51965G9l.A0l(), 14i.A08, (UserSession) this.A01);
            case 48:
                return new OE0(C51965G9l.A0l(), 14i.A08);
            default:
                return new C66902Mel(C51965G9l.A0l());
        }
    }
}
