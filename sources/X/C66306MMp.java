package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.live.model.IGTVLiveChannelNetworkDataSource;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MMp  reason: case insensitive filesystem */
public final class C66306MMp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66306MMp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C227862kA A00(Object obj, C62320sa r3, C62320sa r4, C62230ry r5, int i) {
        return new C227862kA(r3, new C66306MMp(obj, i), r4, r5);
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C66306MMp(obj, i));
    }

    public static C66306MMp A02(Object obj, int i) {
        return new C66306MMp(obj, i);
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [X.KnO, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        C61942KSr kSr;
        IGTVUploadViewModel iGTVUploadViewModel;
        Object obj;
        switch (this.A00) {
            case 0:
                return new IGTVLiveChannelRepository(new IGTVLiveChannelNetworkDataSource((UserSession) this.A01));
            case 1:
                C250653lq r2 = new C250653lq(15, IGTVSeriesRepository.A03);
                UserSession userSession = (UserSession) this.A01;
                return new IGTVSeriesRepository(AnonymousClass1Nd.A00(userSession), new IGTVSeriesNetworkDataSource(userSession), r2);
            case 2:
                C61417K6o k6o = (C61417K6o) this.A01;
                return new C55942Hq6(AnonymousClass7TE.A0l(k6o.A07), k6o.getModuleName());
            case 3:
                return new Eu6(AnonymousClass7TE.A0l(((C61417K6o) this.A01).A07));
            case 4:
                C249463jp A0E = DbZ.A0E(this.A01);
                0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.igds.components.snackbar.IgSnackBarProvider");
                return new LC8(A0E);
            case 5:
            case 23:
                return this.A01;
            case 6:
            case 17:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return DbT.A0r(this.A01);
            case 7:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 25:
            case 30:
                return DbY.A0I(this.A01);
            case 8:
                C61417K6o k6o2 = (C61417K6o) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(k6o2.A07);
                C63640L1c l1c = new C63640L1c(k6o2.requireContext());
                String moduleName = k6o2.getModuleName();
                Bundle requireArguments = k6o2.requireArguments();
                String string = requireArguments.getString("igtv_series_id_arg");
                if (string != null) {
                    String string2 = requireArguments.getString("igtv_series_name_arg");
                    if (string2 != null) {
                        String string3 = requireArguments.getString("igtv_series_user_id_arg");
                        if (string3 != null) {
                            return new C61597KDy(A0l, l1c, new C63777L6j(string, string2, string3), moduleName);
                        }
                        throw new AssertionError(002.A0g("Bundle key ", "igtv_series_user_id_arg", " cannot be null"));
                    }
                    throw new AssertionError(002.A0g("Bundle key ", "igtv_series_name_arg", " cannot be null"));
                }
                throw new AssertionError(002.A0g("Bundle key ", "igtv_series_id_arg", " cannot be null"));
            case 9:
                UserSession userSession2 = ((JVO) this.A01).A02;
                return userSession2.A01(IGTVSeriesRepository.class, A02(userSession2, 1));
            case 10:
                View findViewById = ((AppCompatActivity) this.A01).findViewById(R.id.snack_bar_stub);
                0qQ.A07(findViewById);
                return new AnonymousClass3M8((ViewStub) findViewById, false);
            case 11:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                FragmentActivity fragmentActivity = (IGTVUploadActivity) this.A01;
                Bundle A06 = DbU.A06(fragmentActivity);
                0qQ.A0A(A06);
                String string4 = A06.getString("uploadflow.extra.viewer_session_id");
                String A0m = JTP.A0m(A06, "igtv_creation_session_id_arg");
                String string5 = A06.getString("uploadflow.extra.target_group_profile_id");
                C63652L1o l1o = new C63652L1o(fragmentActivity.getSession());
                C63775L6h l6h = new C63775L6h(fragmentActivity.getSession(), A0m, string4);
                UserSession A012 = fragmentActivity.getSession();
                if (fragmentActivity.A01 == null) {
                    0qQ.A0F("entryPoint");
                    throw AnonymousClass00P.createAndThrow();
                }
                return new KEW(fragmentActivity.getSession(), l6h, new C64147LQk(fragmentActivity.A00, fragmentActivity, A012, l6h, A0m), new LF3(fragmentActivity.getSession(), new Object(), new AnonymousClass7IH(fragmentActivity)), l1o, A0m, string5);
            case 13:
                C63775L6h l6h2 = ((C64147LQk) this.A01).A06;
                return new C63776L6i(l6h2.A00, l6h2.A01, l6h2.A02);
            case 14:
            case 26:
                return ((Fragment) this.A01).requireParentFragment();
            case 16:
            case 20:
            case 22:
            case 28:
            case 32:
            case 35:
            case 37:
            case Seq.NULL_REFNUM:
            case 45:
                return JTR.A0b(this.A01);
            case 38:
                return new C65805Lzx((C61424K6y) this.A01);
            case 39:
                C60051JeJ jeJ = new C60051JeJ((C61424K6y) this.A01);
                jeJ.A01 = R.layout.gallery_picker_title_layout;
                jeJ.A00 = R.layout.gallery_picker_item_layout;
                return jeJ;
            case Seq.RefTracker.REF_OFFSET:
                1YN A002 = AnonymousClass2bO.A00();
                K8A k8a = (K8A) this.A01;
                UserSession A0l2 = AnonymousClass7TE.A0l(k8a.A07);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0w;
                AnonymousClass2bO.A00();
                return A002.A01(k8a, k8a, A0l2, 2bV.A06(new LvU(k8a, 3), (C230882qT) k8a.A05.getValue()), quickPromotionSlot);
            case 43:
                return AnonymousClass2bO.A00().A04(AnonymousClass7TE.A0l(((K8A) this.A01).A07), 0Yt.A07(DbW.A1b(QPTooltipAnchor.ADVANCED_SETTINGS_VIDEO_ROW, new C230872qQ())));
            case 46:
                0eE r1 = AnonymousClass0t1.A01;
                C61942KSr kSr2 = (C61942KSr) this.A01;
                AnonymousClass0eM r3 = kSr2.A0W;
                User A013 = r1.A01(AnonymousClass7TE.A0l(r3));
                A013.A03.Ep1(Integer.valueOf(AnonymousClass7TG.A0A(A013.A03.C8l()) + 1));
                17h.A00(AnonymousClass7TE.A0l(r3)).A03(A013);
                AnonymousClass0eM r12 = kSr2.A06;
                if (JTT.A0W(r12).A02.length() > 0) {
                    JTT.A0I(kSr2).A00(new C64672Lfy(JTT.A0W(r12).A02, AnonymousClass05K.A0N));
                }
                C63862L9r l9r = kSr2.A0D;
                if (l9r != null) {
                    LFB lfb = l9r.A04;
                    boolean z = l9r.A03.A0M.A0S;
                    boolean z2 = l9r.A05;
                    boolean z3 = l9r.A00;
                    C66299MMi mMi = new C66299MMi(l9r, 8);
                    if (182.A06(0Tu.A05, lfb.A01, 36310800276652338L) && z && z2 && !z3) {
                        AnonymousClass0eM r4 = lfb.A03;
                        if (C51968G9o.A0o(r4).getInt("igtv_creation_monetization_toggle_turn_off_count", 0) <= 2) {
                            JTS.A1S(C51968G9o.A0o(r4), "igtv_creation_monetization_toggle_turn_off_count", 0);
                            0xY AR4 = C51968G9o.A0o(r4).AR4();
                            AR4.E5Z("igtv_creation_monetization_toggle_tooltip_impression", 0);
                            AR4.apply();
                            mMi.invoke();
                            break;
                        }
                    }
                }
                break;
            case 47:
                kSr = (C61942KSr) this.A01;
                iGTVUploadViewModel = JTO.A0k(kSr.A0Y);
                obj = KT7.A00;
                break;
            case 48:
                C61942KSr kSr3 = (C61942KSr) this.A01;
                return new C64720Lgx(kSr3.requireContext(), kSr3);
            case 49:
                kSr = (C61942KSr) this.A01;
                iGTVUploadViewModel = JTO.A0k(kSr.A0Y);
                obj = KT5.A00;
                break;
            default:
                return C51971G9r.A0U(this.A01);
        }
        iGTVUploadViewModel.A04(kSr, obj);
        return C60340gF.A00;
    }
}
