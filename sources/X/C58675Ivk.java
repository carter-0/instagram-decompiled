package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ivk  reason: case insensitive filesystem */
public final class C58675Ivk extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58675Ivk(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58675Ivk(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                boolean z = AnonymousClass1B0.A05;
                int i = 18;
                if (AnonymousClass1B1.A00(((C14074TpO) this.A01).A0C).A00(1B2.A09)) {
                    i = 12;
                }
                return Integer.valueOf(i);
            case 1:
                return new C52464GTq((UserSession) this.A01);
            case 2:
                1Bl r3 = 1Bk.A03;
                C14388TvH tvH = (C14388TvH) this.A01;
                return new C52568GXt(C51969G9p.A0i(r3, tvH.A09, "ig_explore_lazy_preferences"), tvH);
            case 3:
                return new C55487HiV((UserSession) this.A01);
            case 4:
                return new VZS((C298795u2) null, AnonymousClass7TE.A16(DbT.A08(this.A01), 2131961860), true, true);
            case 5:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52530GWh) this.A01).A09, 36312436659586161L);
            case 6:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52530GWh) this.A01).A09, 36317431707538570L);
            case 7:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52530GWh) this.A01).A09, 36317431707473033L);
            case 8:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52530GWh) this.A01).A09, 36317431707341959L);
            case 9:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52530GWh) this.A01).A09, 36317431707407496L);
            case 10:
                GXB gxb = (GXB) this.A01;
                String str = gxb.A05;
                UserSession userSession = gxb.A01;
                return new C14437TwL(gxb.A03.A00.requireActivity(), gxb.A04, userSession, str, 112, false);
            case 11:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((C52529GWg) this.A01).A04, 36601084231290985L);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52529GWg) this.A01).A04, 36319609254780452L);
            case 13:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52529GWg) this.A01).A04, 36319609254649379L);
            case 14:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((C52529GWg) this.A01).A04, 36601084231422058L);
            case 15:
                return AnonymousClass7TF.A0R(0Tu.A05, ((GT0) this.A01).A0C, 36315163963427889L);
            case 16:
                return new C52557GXi((UserSession) this.A01);
            case 17:
                return new C57099IOn((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnonymousClass7TF.A0R(0Tu.A05, ((GWY) this.A01).A06, 36315902699441833L);
            case 19:
                return AnonymousClass7TE.A0u();
            case 20:
                return C51970G9q.A0h(0Tu.A05, ((S51) this.A01).A01, 36595973221648670L);
            case 21:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((S51) this.A01).A01, 36595973221714207L);
            case 22:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((S51) this.A01).A01, 36595973221779744L);
            case 23:
                return C51970G9q.A0h(0Tu.A05, ((S51) this.A01).A01, 36595973221845281L);
            case 24:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((S51) this.A01).A01, 36595973221910818L);
            case 25:
                return C51970G9q.A0h(0Tu.A05, ((S51) this.A01).A01, 36595973222107427L);
            case 26:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((S51) this.A01).A01, 36595973222172964L);
            case 27:
                S51 s51 = (S51) this.A01;
                return C51969G9p.A0n(1Al.A01(s51.A01), 1An.A1M, s51);
            case 28:
                String string = ((SDT) ((C8124QhG) this.A01).A09.getValue()).A00.getString(Pxd.A00(C11152SCh.MAX_FACTORIAL));
                if (string == null) {
                    string = "";
                }
                return AnonymousClass7TF.A0w("rawClickSource", string);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C8124QhG qhG = (C8124QhG) this.A01;
                if (qhG.A02() != null) {
                    return C273654mx.A00(532);
                }
                String string2 = ((SDT) qhG.A09.getValue()).A00.getString(Pxd.A00(C11152SCh.MAX_FACTORIAL));
                if (string2 == null) {
                    return "";
                }
                return string2;
            case 30:
                return new C7572QKn(((BrowserLiteFragment) ((C8124QhG) this.A01).A01).A08);
            case 31:
                return 182.A04(0Tu.A05, ((C8123QhF) this.A01).A02, 36876464649601134L);
            case 32:
                return 182.A04(0Tu.A05, ((C8123QhF) this.A01).A02, 36876464649928815L);
            case 33:
                return 182.A04(0Tu.A05, ((C12432SuJ) this.A01).A02, 36876464649601134L);
            case 34:
                return 182.A04(0Tu.A05, ((C12432SuJ) this.A01).A02, 36876464649928815L);
            case 35:
                return new 2AD((UserSession) this.A01);
            case 36:
                C60340gF r32 = C60340gF.A00;
                ((AnonymousClass4D7) this.A01).resumeWith(C41845B3m.A0c(r32));
                return r32;
            case 37:
                C47477E4b e4b = (C47477E4b) this.A01;
                AnonymousClass2tC A0S = DbV.A0S(e4b);
                FragmentActivity requireActivity = e4b.requireActivity();
                A0S.A01(new EHJ(e4b.requireContext(), requireActivity, e4b, e4b.A03(), C47477E4b.A00(e4b), DbW.A0l(e4b.A0K), DbW.A0l(e4b.A0M)));
                return DbU.A0U(A0S, new H7P(e4b.requireContext()));
            case 38:
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(DbT.A0E(this.A01));
                if (A012 != null) {
                    return A012;
                }
                throw AnonymousClass7TE.A0y();
            case 39:
                return DbS.A0B(this.A01).getString(AnonymousClass000.A00(1247), "");
            case 40:
                return C311706d7.A00(DbS.A0B(this.A01), "arg_is_eligible_to_subscribe");
            case Seq.NULL_REFNUM:
                return DbS.A0B(this.A01).getString("origin", "");
            case Seq.RefTracker.REF_OFFSET:
                return C272994ll.A00(((C47477E4b) this.A01).A03());
            case 43:
                return DbU.A0g(DbS.A0B(this.A01), AnonymousClass000.A00(1495));
            case 44:
                return this.A01;
            case 45:
                return DbT.A0r(this.A01);
            case 46:
                return DbY.A0I(this.A01);
            case 47:
                return C311706d7.A00(DbS.A0B(this.A01), "arg_is_subscribed");
            case 48:
                C47477E4b e4b2 = (C47477E4b) this.A01;
                return new KEI(e4b2.requireActivity(), e4b2.A03(), DbW.A0l(e4b2.A0M), DbW.A0l(e4b2.A0K), C47477E4b.A02(e4b2));
            default:
                return new Object[((AnonymousClass0r6[]) this.A01).length];
        }
    }
}
