package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import go.Seq;
import java.util.Map;

public final class MMF extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMF(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMF(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String A11;
        View view;
        Window window;
        View decorView;
        C277884vt r0;
        ViewStub A0F;
        switch (this.A00) {
            case 0:
            case 6:
            case 27:
                return this.A01;
            case 1:
            case 7:
            case 28:
                return DbT.A0r(this.A01);
            case 2:
            case 8:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return DbY.A0I(this.A01);
            case 3:
                C63886LAp lAp = (C63886LAp) this.A01;
                UserSession userSession = lAp.A04;
                Context context = lAp.A01;
                AnonymousClass4DH r3 = lAp.A03;
                C277954w0 r02 = lAp.A05.A02;
                boolean z = true;
                if (r02 == null || (r0 = r02.A0A) == null || !r0.CVs()) {
                    z = false;
                }
                return new KEB(context, r3, userSession, z);
            case 4:
                View A0c = AnonymousClass7TE.A0c(((LBM) this.A01).A0D);
                if (A0c != null) {
                    return A0c.findViewById(R.id.wave_reaction);
                }
                return null;
            case 5:
                View A0c2 = AnonymousClass7TE.A0c(((LBM) this.A01).A0D);
                if (A0c2 != null) {
                    return A0c2.findViewById(R.id.host_avatar);
                }
                return null;
            case 9:
                View A0c3 = AnonymousClass7TE.A0c(((LBM) this.A01).A0D);
                if (A0c3 != null) {
                    return A0c3.findViewById(R.id.wave_text);
                }
                return null;
            case 10:
                LBM lbm = (LBM) this.A01;
                return new KDB(lbm.A04, lbm.A05);
            case 11:
                AnonymousClass0eM r32 = ((LBM) this.A01).A0D;
                View A0c4 = AnonymousClass7TE.A0c(r32);
                if (A0c4 != null && (A0F = DbS.A0F(A0c4, R.id.iglive_comment_wave_back_button_stub)) != null) {
                    return A0F.inflate();
                }
                View A0c5 = AnonymousClass7TE.A0c(r32);
                if (A0c5 != null) {
                    return A0c5.findViewById(R.id.iglive_comment_wave_back_button_stub);
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                View A0c6 = AnonymousClass7TE.A0c(((LBM) this.A01).A0A);
                if (A0c6 != null) {
                    return A0c6.findViewById(R.id.iglive_comment_wave_back_button);
                }
                return null;
            case 13:
                View A0c7 = AnonymousClass7TE.A0c(((LBM) this.A01).A0D);
                if (A0c7 != null) {
                    return A0c7.findViewById(R.id.guest_avatar);
                }
                return null;
            case 14:
                LBM lbm2 = (LBM) this.A01;
                Activity rootActivity = lbm2.A04.getRootActivity();
                if (rootActivity == null || (window = rootActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (view = decorView.getRootView()) == null) {
                    view = lbm2.A03;
                }
                ViewStub A0F2 = DbS.A0F(view, R.id.reaction_overlay_stub);
                if (A0F2 == null) {
                    return view.findViewById(R.id.reaction_overlay);
                }
                return JTP.A0H(A0F2, R.layout.layout_iglive_viewer_wave_reaction_overlay);
            case 15:
                return new Boolean[((AnonymousClass0r6[]) this.A01).length];
            case 21:
                ((C60312JjF) this.A01).A00.A02.Epw((Object) null);
                return C60340gF.A00;
            case 22:
                2YL r2 = (2YL) this.A01;
                MGU.A02(r2, C318116oQ.A00(r2), 34);
                return C60340gF.A00;
            case 24:
                0xa r4 = ((C62415KfQ) this.A01).A02.A01;
                JTS.A1S(r4, "live_badges_ufi_tooltip_view_count", 0);
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = r4.AR4();
                AR4.E5c("live_badges_ufi_tooltip_last_impression_timestamp", currentTimeMillis);
                AR4.apply();
                return C60340gF.A00;
            case 25:
                1Av r42 = ((C62415KfQ) this.A01).A02;
                AnonymousClass7TF.A1J(r42, r42.A6Q, 1Av.A8a, 120, false);
                return C60340gF.A00;
            case 26:
                1X5 A002 = C49054EoY.A00();
                C64102LMw lMw = (C64102LMw) this.A01;
                return A002.A00(lMw.A00, lMw.A02);
            case 30:
                return 09i.A0A.A06(DbS.A0B(this.A01));
            case 31:
                return new KD9(AnonymousClass7TE.A0l(((K40) this.A01).A00), false);
            case 32:
                return AnonymousClass7TF.A0R(0Tu.A05, DbY.A0R(((C61428K7d) this.A01).A0G), 36312415184421993L);
            case 33:
                return C63492Kxw.A00(AnonymousClass7TE.A0l(((C61428K7d) this.A01).A0G));
            case 34:
                K4Q k4q = (K4Q) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(k4q.A03);
                FragmentActivity activity = k4q.getActivity();
                0qQ.A0A(activity);
                AnonymousClass7TG.A1N(A0l, activity);
                C64102LMw lMw2 = C64102LMw.A05;
                if (lMw2 != null) {
                    return lMw2;
                }
                C64102LMw lMw3 = new C64102LMw(A0l, activity);
                C64102LMw.A05 = lMw3;
                return lMw3;
            case 35:
                return new AnonymousClass4X2((UserSession) this.A01);
            case 36:
                Context context2 = C60960kU.A00;
                0qQ.A07(context2);
                C256303vY r43 = new C256303vY(AnonymousClass1UZ.A00(context2));
                UserSession userSession2 = (UserSession) this.A01;
                1wS A012 = 1wS.A01(userSession2);
                0qQ.A07(A012);
                return new C256293vX(userSession2, C61410nE.A00, r43, A012);
            case 37:
                return new C263804Nk((UserSession) this.A01);
            case 38:
                return new C263714Nb((UserSession) this.A01);
            case 39:
                return new 1y6((UserSession) this.A01);
            case 40:
                Q2G q2g = (Q2G) this.A01;
                if (q2g.A0A) {
                    Q2G.A01(q2g, AnonymousClass05K.A01, false);
                }
                q2g.A0D.DPg();
                return C60340gF.A00;
            case Seq.NULL_REFNUM:
                HandlerThread handlerThread = ((T8W) this.A01).A01;
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case Seq.RefTracker.REF_OFFSET:
                11Z.A02(new M5Q((T8W) this.A01));
                return C60340gF.A00;
            case 43:
                return new LCQ((UserSession) this.A01);
            case 44:
                return new DiversityInfoRepository((UserSession) this.A01);
            case 45:
                return new JVR(AnonymousClass12T.A00, (UserSession) this.A01);
            case 46:
                return new C50348FZf(this.A01, 14);
            case 47:
                return DbS.A0B(this.A01).getString(AnonymousClass000.A00(511));
            case 48:
                0bb r22 = new 0bb();
                Map map = ((C67614Mqm) this.A01).A0C;
                Object obj = map.get(AnonymousClass000.A00(1902));
                if (obj != null) {
                    r22.A06(AnonymousClass9NF.A01(), (String) obj);
                    r22.A01(C21123XFn.FETCHING_FAILED, C66579MXk.A00(314));
                    r22.A01(C67612Mqk.IXT, "event_source");
                    if (0qQ.A0K(map.get("is_e2ee"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        A11 = "0";
                    } else {
                        A11 = DbT.A11(C66579MXk.A00(894), map);
                    }
                    r22.A06("entity_id", A11);
                    return r22;
                }
                throw AnonymousClass7TE.A0y();
            case 49:
                0bb r23 = new 0bb();
                Object obj2 = ((C67614Mqm) this.A01).A0C.get(AnonymousClass000.A00(160));
                if (obj2 != null) {
                    r23.A06("containermodule", (String) obj2);
                    return r23;
                }
                throw AnonymousClass7TE.A0y();
            default:
                return new Object[((AnonymousClass0r6[]) this.A01).length];
        }
    }
}
