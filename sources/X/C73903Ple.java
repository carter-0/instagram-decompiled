package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ple  reason: case insensitive filesystem */
public final class C73903Ple extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73903Ple(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C329827Kj A00(StringBuilder sb, C73903Ple ple) {
        sb.append('@');
        C329827Kj r2 = (C329827Kj) ple.A01;
        Context context = r2.A07.getContext();
        AnonymousClass9B9.A00();
        sb.append(context.getText(2131960442));
        sb.append(' ');
        return r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return C69868NtW.A00(((1kM) this.A01).A00);
            case 1:
                return AnonymousClass7IP.A00(DbS.A0O("mutation_processor"), ((1kM) this.A01).A00);
            case 2:
                return 1bJ.A00(((1jl) this.A01).A00);
            case 3:
                ((C74551Pwk) this.A01).DTM((C270214gN) null, (String) null);
                break;
            case 4:
                return 02m.A0p;
            case 5:
                String str = ((AnonymousClass1dM) this.A01).A04;
                0qQ.A07(str);
                return str;
            case 6:
                return new C66638Ma7((UserSession) this.A01);
            case 7:
                return new C70833ONf((UserSession) this.A01);
            case 8:
                return new OO5((UserSession) this.A01);
            case 9:
                return new I6A(((OO5) this.A01).A00);
            case 10:
                return new OO1((UserSession) this.A01);
            case 11:
                0lg r2 = (0lg) this.A01;
                return new C59960JcS(AnonymousClass1Nd.A00(r2), new C73459Pd1(r2, 11));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new OEC((UserSession) this.A01);
            case 13:
            case 14:
                return 09i.A0A.A05(this.A01);
            case 15:
            case 16:
                Dialog dialog = ((0SM) this.A01).A01;
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            case 17:
                return AnonymousClass7TE.A0c(((C329897Kq) this.A01).A07).requireViewById(R.id.link_preview_bar_background);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                View inflate = ((C329897Kq) this.A01).A05.inflate();
                C66580MXl.A1R(inflate);
                return inflate;
            case 19:
                return AnonymousClass7TE.A0c(((C329897Kq) this.A01).A07).requireViewById(R.id.link_preview_bar_divider);
            case 20:
                return AnonymousClass7TE.A0c(((C329897Kq) this.A01).A07).requireViewById(R.id.link_preview_bar_subtitle);
            case 21:
                return Integer.valueOf(AnonymousClass7TG.A02(((C329897Kq) this.A01).A04));
            case 22:
                return AnonymousClass7TE.A0c(((C329897Kq) this.A01).A07).requireViewById(R.id.link_preview_bar_image);
            case 23:
                return AnonymousClass7TE.A0c(((C329897Kq) this.A01).A07).requireViewById(R.id.link_preview_bar_title);
            case 24:
                ((AnonymousClass7KG) this.A01).A00.invoke();
                break;
            case 25:
                return AnonymousClass7TE.A0c(((C70797OLs) this.A01).A07).requireViewById(R.id.close_edit_bar_icon);
            case 26:
                View inflate2 = ((C70797OLs) this.A01).A04.inflate();
                C66580MXl.A1R(inflate2);
                return inflate2;
            case 27:
                return AnonymousClass7TE.A0c(((C70797OLs) this.A01).A07).requireViewById(R.id.edit_bar_divider);
            case 28:
                return AnonymousClass7TE.A0c(((C70797OLs) this.A01).A07).requireViewById(R.id.edit_bar_header);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                Context context = ((C329827Kj) this.A01).A07.getContext();
                AnonymousClass9B9.A00();
                A1A.append(context.getText(2131960533));
                return C51967G9n.A0r(A1A, ' ');
            case 30:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C329827Kj) this.A01).A08, 36326914993961034L);
            case 31:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C329827Kj) this.A01).A08, 36326914994026571L);
            case 32:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C329827Kj) this.A01).A08, 36326914994092108L);
            case 33:
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                return AnonymousClass7TF.A0l(DbS.A0t(A00(A1A2, this).A0A), A1A2);
            case 34:
                StringBuilder A1A3 = AnonymousClass7TE.A1A();
                return AnonymousClass7TF.A0l(DbS.A0t(A00(A1A3, this).A0I), A1A3);
            case 35:
                StringBuilder A1A4 = AnonymousClass7TE.A1A();
                A1A4.append('@');
                Context context2 = ((C329827Kj) this.A01).A07.getContext();
                AnonymousClass9B9.A00();
                return AnonymousClass7TF.A0i(context2.getText(2131960442), A1A4);
            case 36:
                return 002.A0D(DbS.A0t(((C329827Kj) this.A01).A0A), '/');
            case 37:
                List A0x = DbX.A0x(182.A04(0Tu.A06, ((C329827Kj) this.A01).A08, 36890268674294639L));
                ArrayList A0r = AnonymousClass7TG.A0r(A0x);
                Iterator it = A0x.iterator();
                while (it.hasNext()) {
                    A0r.add(002.A0C(DbV.A12(AnonymousClass7TE.A18(it)), ' '));
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : A0r) {
                    DbV.A1U(next, A1C, 00l.A0W((String) next) ? 1 : 0);
                }
                return A1C;
            case 38:
                C331127Pr A0W = DbS.A0W(((C49694F2e) this.A01).A02);
                DbS.A1S(A0W, true);
                A0W.A0x = true;
                A0W.A1G = true;
                A0W.A03 = 0.7f;
                return A0W;
            case 39:
                C49694F2e f2e = (C49694F2e) this.A01;
                return new AnonymousClass7IR(f2e.A01, f2e.A02);
            case 40:
                return C313746gw.A00(((OZO) this.A01).A03);
            case Seq.NULL_REFNUM:
                return C66582MXn.A0A(((OZS) this.A01).A0A);
            case Seq.RefTracker.REF_OFFSET:
                return Boolean.valueOf(((AnonymousClass2Es) this.A01).Cbs());
            case 43:
                return new Oy8((UserSession) this.A01);
            case 45:
            case 49:
                return new C68540NMm(DbT.A0E(this.A01));
            case 46:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case 47:
                return new C68540NMm((Activity) this.A01);
            default:
                return C51971G9r.A0U(this.A01);
        }
        return C60340gF.A00;
    }
}
