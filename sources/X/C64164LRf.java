package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.LRf  reason: case insensitive filesystem */
public final class C64164LRf {
    public C312426eP A00;
    public OdrSnapshotHelper A01;
    public L38 A02;
    public C41791B0u A03;
    public AH4 A04;
    public C312156dv A05;
    public CameraAREffect A06;
    public UserSession A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final LGB A0C;
    public final C64357LaZ A0D = new C64357LaZ();
    public final C64359Lab A0E;
    public final C61042Jvg A0F;
    public final QuickPerformanceLogger A0G;
    public final C262224Cq A0H;
    public final AnonymousClass0r6 A0I;
    public final 0V2 A0J;
    public final boolean A0K;

    public C64164LRf(Context context, LGB lgb, C61042Jvg jvg, C262224Cq r8) {
        0qQ.A0B(context, 2);
        this.A0H = r8;
        this.A0B = context;
        this.A0F = jvg;
        this.A0C = lgb;
        boolean z = false;
        QuickPerformanceLogger quickPerformanceLogger = null;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 10);
        this.A0J = A012;
        this.A0I = new 0V1((C262204Co) null, A012);
        C64359Lab lab = new C64359Lab(this);
        this.A0E = lab;
        this.A0G = lgb != null ? lgb.A05 : quickPerformanceLogger;
        z = lgb != null ? true : z;
        this.A0K = z;
        if (z) {
            lab.A00.setFixedElapsedTimeForAnimation(1.0f);
        }
    }

    public final void A05(UserSession userSession, Context context) {
        this.A07 = userSession;
        String str = "userSession";
        C312156dv A002 = C312146dt.A00(userSession);
        this.A05 = A002;
        UserSession userSession2 = this.A07;
        if (userSession2 != null) {
            HashMap A012 = A01(context, this, A002, userSession2, true);
            C392559v0 r0 = B37.A01;
            C361848gv A003 = A00(context, this);
            UserSession userSession3 = this.A07;
            if (userSession3 != null) {
                C312426eP r6 = this.A00;
                if (r6 == null) {
                    str = "effectManagerFactory";
                } else {
                    C41791B0u b0u = this.A03;
                    if (b0u == null) {
                        str = "dataProvider";
                    } else {
                        AR2 ar2 = new AR2(r6, b0u, A003, userSession3, true);
                        0qQ.A0B(r0, 0);
                        A012.put(r0, ar2);
                        this.A0D.A00 = new C63572KzL(this);
                        LGB lgb = this.A0C;
                        if (lgb != null) {
                            this.A01 = new OdrSnapshotHelper(context, lgb, JTO.A1C(this, 0));
                            C392559v0 r2 = C39630A2u.A07;
                            C53368Gms gms = new C53368Gms(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 0);
                            0qQ.A0B(r2, 0);
                            A012.put(r2, gms);
                            HashMap A1E = AnonymousClass7TE.A1E();
                            A1E.putAll(A012);
                            this.A04 = new AH4(A1E);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.82L, java.lang.Object] */
    public static final C361848gv A00(Context context, C64164LRf lRf) {
        L38 l38 = lRf.A02;
        if (l38 == null) {
            0qQ.A0F("rendererProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        ? obj = new Object();
        UserSession userSession = l38.A01;
        return C368558sq.A00(context, obj, (GPUTimerImpl) null, (AnonymousClass82I) null, l38.A00, userSession, 0);
    }

    public static HashMap A01(Context context, C64164LRf lRf, C312156dv r10, UserSession userSession, boolean z) {
        L38 l38 = new L38(r10, userSession);
        lRf.A02 = l38;
        Context context2 = context;
        C312426eP A002 = C312406eN.A00(context, l38.A00, l38.A01);
        0qQ.A07(A002);
        lRf.A00 = A002;
        L38 l382 = lRf.A02;
        if (l382 == null) {
            0qQ.A0F("rendererProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        K03 k03 = new K03(lRf, z);
        C371838zD r5 = lRf.A0D.A01;
        C64359Lab lab = lRf.A0E;
        0qQ.A0B(r5, 4);
        lRf.A03 = new ARS(new A7Z(context2, A002, lab, r5, k03, l382.A01, "rich_avatar_view"));
        HashMap hashMap = new HashMap();
        hashMap.put(C39630A2u.A02, context2);
        hashMap.put(C39630A2u.A08, "rich_avatar_view");
        return hashMap;
    }

    public final Object A02(AnonymousClass4D7 r3) {
        String str;
        OdrSnapshotHelper odrSnapshotHelper = this.A01;
        if (odrSnapshotHelper == null) {
            str = "odrSnapshotHelper";
        } else {
            AH4 ah4 = this.A04;
            if (ah4 != null) {
                return JTP.A0l(odrSnapshotHelper.A02(ah4, r3));
            }
            str = "richMediaViewerAr3d";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03() {
        AH4 ah4 = this.A04;
        if (ah4 != null) {
            ah4.A09.destroy();
        }
    }

    public final void A04(Context context, String str) {
        String str2;
        if (this.A04 != null) {
            C62977KpT.A00(this, AnonymousClass05K.A00);
            QuickPerformanceLogger quickPerformanceLogger = this.A0G;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerPoint(603995461, "effect_download_start");
            }
            AH4 ah4 = this.A04;
            if (ah4 == null) {
                str2 = "richMediaViewerAr3d";
            } else {
                UserSession userSession = this.A07;
                if (userSession == null) {
                    str2 = "userSession";
                } else {
                    C63923LDe lDe = new C63923LDe(context, new C64352LaU(this), userSession, this.A0H);
                    ah4.A03 = new C64355LaX(this);
                    lDe.A00 = str;
                    lDe.A00(ah4.A0D);
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
