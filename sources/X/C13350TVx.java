package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.webrtc.EglBase14Impl;

/* renamed from: X.TVx  reason: case insensitive filesystem */
public final class C13350TVx extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13350TVx(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C13350TVx(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C13350TVx(obj, i));
    }

    /* JADX WARNING: type inference failed for: r4v38, types: [java.lang.Object, X.RQE] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0eM r0;
        LinkedHashMap linkedHashMap;
        0sP r2;
        Class cls;
        switch (this.A00) {
            case 0:
                C10858RzJ rzJ = (C10858RzJ) this.A01;
                C60400gq r3 = ((C258733zY) rzJ.A08.getValue()).A00;
                if (r3 == null || !r3.Agw(36317779600479759L)) {
                    return rzJ.A0D.getValue();
                }
                return rzJ.A09.getValue();
            case 1:
                ArrayList A1C = AnonymousClass7TE.A1C();
                C10858RzJ rzJ2 = (C10858RzJ) this.A01;
                AnonymousClass0eM r6 = rzJ2.A08;
                C60400gq r22 = ((C258733zY) r6.getValue()).A00;
                if (r22 != null && r22.Agw(2342160788815091229L)) {
                    A1C.add(rzJ2.A0I.getValue());
                }
                C60400gq r23 = ((C258733zY) r6.getValue()).A00;
                if (r23 != null && r23.Agw(2342160788815025692L)) {
                    C60400gq r24 = ((C258733zY) r6.getValue()).A00;
                    if (r24 == null || !r24.Agw(36317779601593888L)) {
                        r0 = rzJ2.A0G;
                    } else {
                        r0 = rzJ2.A0H;
                    }
                    A1C.add(r0.getValue());
                }
                A1C.add(rzJ2.A06);
                return new C259003zz((C258993zy) rzJ2.A0E.getValue(), CameraRollManager.ASSET_TYPE_ALL, A1C);
            case 2:
                return new C258993zy(C51965G9l.A0l(), 424086240);
            case 3:
                1L7 A012 = 1L7.A01();
                0qQ.A07(A012);
                return new C258903zp((AnonymousClass0JP) AnonymousClass7TE.A14(((C10858RzJ) this.A01).A0A), new C258873zm(new C258863zl(A012).A00()));
            case 4:
                C10858RzJ rzJ3 = (C10858RzJ) this.A01;
                return new C259003zz((C258993zy) rzJ3.A0E.getValue(), "System", 0sr.A1P(new C258943zt[]{rzJ3.A00, rzJ3.A01, rzJ3.A02, rzJ3.A03, rzJ3.A05, rzJ3.A04}));
            case 5:
                return new AnonymousClass951((UserSession) this.A01);
            case 6:
                return new C10736RxF();
            case 7:
                return new C258873zm(((C258863zl) ((C10736RxF) this.A01).A02.getValue()).A00());
            case 8:
                return new C258863zl((1L7) AnonymousClass7TE.A14(((C10736RxF) this.A01).A04));
            case 9:
                C10736RxF rxF = (C10736RxF) this.A01;
                return new C258903zp((AnonymousClass0JP) AnonymousClass7TE.A14(rxF.A00), (C258883zn) rxF.A01.getValue());
            case 10:
                return new C258803zf((UserSession) this.A01);
            case 11:
                return new C258783zd((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AnonymousClass40I((UserSession) this.A01);
            case 13:
                return new C64416LbX(((C64417LbY) this.A01).A01);
            case 14:
                return new ATB(((C64417LbY) this.A01).A01);
            case 15:
                return new C71741Oq1(((C64417LbY) this.A01).A01);
            case 16:
                return new C71742Oq2(((C64416LbX) this.A01).A01);
            case 17:
                return new C298105st((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return 1Al.A01((UserSession) this.A01).A04(1An.A15, C2604745u.class);
            case 19:
                return new C2604745u(new 0xc((0xa) ((C10841Rz1) this.A01).A07.getValue()), "ig_reels_scroll_");
            case 20:
                C10841Rz1 rz1 = (C10841Rz1) this.A01;
                return new C259003zz((C258993zy) null, "System", 0sr.A1P(new C258943zt[]{rz1.A03, rz1.A00, rz1.A01, rz1.A02, rz1.A05, rz1.A04}));
            case 21:
                C10807RyT ryT = (C10807RyT) this.A01;
                UserSession userSession = ryT.A01;
                Context context = ryT.A00;
                AnonymousClass7TG.A1N(userSession, context);
                return userSession.A01(C10841Rz1.class, new TTP(18, context, userSession));
            case 22:
                C10807RyT ryT2 = (C10807RyT) this.A01;
                return C258763zb.A00(ryT2.A01).A00((C258833zi) ryT2.A04.getValue(), (AnonymousClass94R) ryT2.A05.getValue(), AnonymousClass7TE.A1I(((C10841Rz1) ryT2.A02.getValue()).A09.getValue()));
            case 23:
                C10807RyT ryT3 = (C10807RyT) this.A01;
                return new C12158So9((C9264RVp) ryT3.A07.getValue(), (S4A) ryT3.A06.getValue(), (AnonymousClass94R) ryT3.A05.getValue());
            case 24:
                return new AnonymousClass94R(((C10807RyT) this.A01).A01);
            case 25:
                return C9265RVq.A00(((C10807RyT) this.A01).A01);
            case 26:
                return new C3731494e((UserSession) this.A01);
            case 27:
                ? obj = new Object();
                obj.A00 = new ATA((0sP) this.A01);
                return obj;
            case 28:
                C10831Ryr ryr = (C10831Ryr) this.A01;
                return new AT8((AnonymousClass0JP) AnonymousClass7TE.A14(ryr.A01), (AnonymousClass953) ryr.A04.getValue(), (AnonymousClass94N) ryr.A0A.getValue(), AnonymousClass05K.A0N);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new AnonymousClass953((1vn) ((C10831Ryr) this.A01).A05.getValue());
            case 30:
                return 1vm.A01((UserSession) this.A01);
            case 31:
                C10831Ryr ryr2 = (C10831Ryr) this.A01;
                C258943zt r5 = (C258943zt) ryr2.A02.getValue();
                C258833zi r9 = (C258833zi) ryr2.A09.getValue();
                C258993zy r8 = (C258993zy) ryr2.A07.getValue();
                AT8 at8 = (AT8) ryr2.A03.getValue();
                return new AnonymousClass407(r5, (AnonymousClass406) ryr2.A00.getValue(), at8, r8, r9, (AnonymousClass94N) ryr2.A0A.getValue(), (C258483z9) AnonymousClass7TE.A14(ryr2.A06));
            case 32:
                return new AnonymousClass94N((UserSession) this.A01);
            case 33:
                return new C10737RxG((UserSession) this.A01);
            case 34:
                return new AnonymousClass94N(((C10737RxG) this.A01).A01);
            case 35:
            case 36:
                return ((Fragment) this.A01).requireParentFragment().requireParentFragment();
            case 37:
            case 39:
            case 43:
            case 45:
                return ((C62320sa) this.A01).invoke();
            case Seq.NULL_REFNUM /*41*/:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((Fragment) this.A01).requireParentFragment();
            case 47:
                GMQ gmq = ((C7614QQe) ((C8607Qxo) this.A01)).A02;
                linkedHashMap = C51972G9s.A0t(gmq);
                r2 = new TY5(gmq, 30);
                cls = QD9.class;
                break;
            case 48:
                C7614QQe qQe = (C7614QQe) ((C8607Qxo) this.A01);
                RRG rrg = qQe.A04;
                C13712Tfa tfa = qQe.A05;
                AnonymousClass7TG.A1N(rrg, tfa);
                linkedHashMap = AnonymousClass7TE.A1H();
                r2 = new TYA(29, (Object) tfa, (Object) rrg);
                cls = C60104Jfk.class;
                break;
            case 49:
                return this.A01;
            default:
                return DbY.A0I(this.A01);
        }
        C392359ug.A00(linkedHashMap, r2, DbS.A0z(cls));
        return C48264Ebj.A00(linkedHashMap.values());
    }
}
