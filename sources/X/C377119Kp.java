package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Kp  reason: invalid class name and case insensitive filesystem */
public final class C377119Kp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377119Kp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [com.instagram.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v43, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v47, types: [java.lang.Object, X.Hs6] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        ViewGroup viewGroup;
        switch (this.A00) {
            case 0:
                return new AnonymousClass6CV((UserSession) this.A01);
            case 1:
                ? r1 = (IgFragmentActivity) this.A01;
                View requireViewById = r1.requireViewById(R.id.snack_bar_stub);
                0qQ.A07(requireViewById);
                return new AnonymousClass3M8((ViewStub) requireViewById, 182.A06(0Tu.A05, r1.getSession(), 36324694495867127L));
            case 2:
                ? r3 = (BaseFragmentActivity) this.A01;
                if (r3.findViewById(R.id.action_bar_view_stub) == null) {
                    View requireViewById2 = r3.requireViewById(R.id.action_bar_container);
                    0qQ.A07(requireViewById2);
                    viewGroup = (ViewGroup) requireViewById2;
                } else {
                    View inflate = ((ViewStub) r3.requireViewById(R.id.action_bar_view_stub)).inflate();
                    0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewGroup = (ViewGroup) inflate;
                    if (r3.A06) {
                        r3.requireViewById(R.id.action_bar_container).setVisibility(8);
                    }
                }
                2dZ A012 = 2dY.A01(r3.A0I, viewGroup);
                r3.A02 = A012;
                0qQ.A0A(A012);
                return A012;
            case 3:
                View requireViewById3 = ((Activity) this.A01).requireViewById(R.id.search_container_stub);
                0qQ.A0C(requireViewById3, C273654mx.A00(15));
                View inflate2 = ((ViewStub) requireViewById3).inflate();
                0qQ.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                return inflate2;
            case 4:
                View findViewById = ((AppCompatActivity) this.A01).findViewById(R.id.voice_message_bar_stub);
                if (findViewById != null) {
                    return 2b1.A00(findViewById);
                }
                return null;
            case 5:
                Context context = ((LayoutInflater) ((0rm) this.A01).A00).getContext();
                0qQ.A0C(context, Pxd.A00(9));
                return ((IgFragmentActivity) context).getSession();
            case 6:
                return new AnonymousClass2kL(02m.A0p, 002.A0g("<cls>", this.A01.getClass().getName(), "</cls>"));
            case 7:
                AnonymousClass4DH r2 = (AnonymousClass4DH) this.A01;
                AnonymousClass2k4 r12 = r2.dayNightMode;
                AnonymousClass2k4 r0 = AnonymousClass2k4.NIGHT;
                Context requireContext = r2.requireContext();
                if (r12 == r0) {
                    return 2Yn.A01(requireContext);
                }
                0qQ.A0A(requireContext);
                return requireContext;
            case 8:
                return AnonymousClass0t1.A01.A01(((C247283g5) this.A01).A02);
            case 9:
                AnonymousClass3TX r22 = (AnonymousClass3TX) this.A01;
                TextView textView = (TextView) r22.A00().requireViewById(R.id.violation_banner_text);
                textView.setHighlightColor(r22.A00().getContext().getColor(R.color.fds_transparent));
                return textView;
            case 10:
                return ((AnonymousClass3TX) this.A01).A00.inflate();
            case 11:
                return new AnonymousClass9F4((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                UserSession userSession = (UserSession) this.A01;
                return new WO0(new AnonymousClass9F5(userSession, AnonymousClass05K.A0N), userSession);
            case 13:
                UserSession userSession2 = (UserSession) this.A01;
                return new WO1(new AnonymousClass9F5(userSession2, AnonymousClass05K.A0C), userSession2);
            case 14:
                UserSession userSession3 = (UserSession) this.A01;
                return new C14248TsV(new AnonymousClass9F5(userSession3, AnonymousClass05K.A00), userSession3);
            case 15:
                UserSession userSession4 = (UserSession) this.A01;
                return new AnonymousClass9F6(new AnonymousClass9F5(userSession4, AnonymousClass05K.A01), userSession4);
            case 16:
                UserSession userSession5 = ((AnonymousClass9F5) this.A01).A00;
                return userSession5.A01(AH0.class, new C20703Wxa(userSession5, 25));
            case 17:
                return new C239803Ii[((AnonymousClass0r6[]) this.A01).length];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C365928nu((UserSession) this.A01);
            case 19:
                UserSession userSession6 = (UserSession) this.A01;
                return new 2Nl(new 29E(userSession6), userSession6);
            case 20:
                return ((AnonymousClass4O0) this.A01).A08.invoke();
            case 21:
                return new C361308g1((ClipsDraftLocalDataSource) this.A01);
            case 22:
                return new List[((AnonymousClass0r6[]) this.A01).length];
            case 23:
                return new C229352nF((UserSession) this.A01);
            case 24:
                C320416sL r02 = (C320416sL) this.A01;
                return Boolean.valueOf(((C270744hE) r02.A01).ARQ(r02.A03));
            case 25:
                ArrayList arrayList = new ArrayList();
                arrayList.add(ClipsTemplatesStickerType.GIF);
                arrayList.add(ClipsTemplatesStickerType.CUTOUT_PHOTO);
                return arrayList;
            case 26:
                return new C346677vZ((UserSession) this.A01);
            case 27:
                return new C333737a2((UserSession) this.A01);
            case 28:
                AnonymousClass1Y4 r03 = (AnonymousClass1Y4) this.A01;
                C56057Hs6 hs6 = r03.A00;
                if (hs6 != null) {
                    return hs6;
                }
                ? obj = new Object();
                r03.A00 = obj;
                return obj;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                ((1GP) this.A01).A0A = true;
                return C60340gF.A00;
            case 31:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case 34:
            case 35:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 36:
                C336837fG r04 = (C336837fG) this.A01;
                return 1OP.A01(r04.A01, r04.A02);
            case 37:
                return Boolean.valueOf(((C336857fI) this.A01).A0F);
            case 38:
                AnonymousClass3Y5 r13 = (AnonymousClass3Y5) this.A01;
                SpannableString spannableString = new SpannableString(C244013aV.A0E(r13, 2131954762));
                spannableString.setSpan(new ForegroundColorSpan(C244013aV.A02(r13, 2Yu.A08(r13.A05.A0C))), 0, spannableString.length(), 33);
                return spannableString;
            case 39:
                ((C334977cB) this.A01).A02.A0G();
                return C60340gF.A00;
            case 40:
                C334977cB r05 = (C334977cB) this.A01;
                UserSession userSession7 = r05.A04;
                return new C335027cG(AnonymousClass0kN.A02(userSession7), userSession7, r05.A01.A04);
            case Seq.NULL_REFNUM:
                C10625RvJ rvJ = (C10625RvJ) this.A01;
                if (rvJ != null) {
                    if (!rvJ.A00) {
                        rvJ.A01.start();
                    }
                    rvJ.A00 = true;
                }
                return new C245943dj(new C58177Inh(rvJ, 34));
            case Seq.RefTracker.REF_OFFSET:
                C336007du r32 = new C336007du();
                AnonymousClass3Y5 r23 = (AnonymousClass3Y5) this.A01;
                r32.A05(C244013aV.A01(r23, R.attr.igds_color_stroke));
                int A02 = C244013aV.A02(r23, R.color.cds_white_a20);
                AnonymousClass3O5 r24 = r32.A00;
                r24.A09 = A02;
                r24.A06 = 0;
                r32.A04(1500);
                r24.A03 = 0.0f;
                return r32.A01();
            case 43:
                C52971GgO ggO = ((C334527bR) this.A01).A00;
                ggO.A09.A01();
                ggO.A0P.Epw(C335237cd.A00);
                return C60340gF.A00;
            case 44:
                UserSession userSession8 = ((C334527bR) this.A01).A01;
                AnonymousClass4Ew r06 = 2Vi.A01;
                return new AnonymousClass4Ex((int) 182.A01(0Tu.A05, userSession8, 36600246713454388L));
            case 45:
                Context context2 = ((AnonymousClass3Y5) this.A01).A05.A0C;
                0qQ.A07(context2);
                return Integer.valueOf((int) 0nA.A04(context2, 36));
            case 46:
                return new LinearLayout.LayoutParams(((C336487eh) this.A01).A00, -2, 1.0f);
            case 47:
                UserSession userSession9 = ((AnonymousClass5WP) this.A01).A02;
                if (userSession9 != null) {
                    return new C56509Hzf(userSession9);
                }
                throw new IllegalStateException("Required value was null.");
            case 48:
                AnonymousClass5WP r14 = (AnonymousClass5WP) this.A01;
                r14.A02 = (UserSession) C288795cU.A00(C286955Yl.A00, r14);
                r14.A03 = (AnonymousClass4DU) C288795cU.A00(C286935Yj.A00, r14);
                return C60340gF.A00;
            case 49:
                AnonymousClass5WP r07 = (AnonymousClass5WP) this.A01;
                UserSession userSession10 = r07.A02;
                if (userSession10 != null) {
                    return AnonymousClass0kN.A01(r07.A03, userSession10);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                return new C335137cS((UserSession) this.A01);
        }
    }
}
