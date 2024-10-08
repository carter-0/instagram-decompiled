package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.data.SettingsNetworkInteractor;
import com.instagram.settings2.core.data.SettingsRepository;
import go.Seq;
import java.io.Serializable;
import org.webrtc.EglBase14Impl;

/* renamed from: X.DhF  reason: case insensitive filesystem */
public final class C46573DhF extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46573DhF(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C46573DhF(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C61363K4f k4f = (C61363K4f) this.A01;
                return new C61571KCy(AnonymousClass7TE.A0l(k4f.A0a), new C58691Iw0(46, k4f.requireContext(), k4f));
            case 1:
                TwD twD = new TwD();
                Context context = ((K9H) this.A01).A07;
                String string = context.getString(2131972868);
                int A012 = DbV.A01(context);
                twD.A01 = string;
                twD.A00 = A012;
                return twD;
            case 2:
                Context context2 = ((C63870L9z) this.A01).A01;
                return DbV.A0n(context2, 2Yu.A0C(context2));
            case 3:
            case 9:
            case 14:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 33:
                return this.A01;
            case 4:
            case 10:
            case 15:
            case 19:
            case 23:
            case 30:
            case 34:
                return DbT.A0r(this.A01);
            case 6:
                return new KC4(AnonymousClass7TE.A0l(((C47416E1k) this.A01).A05));
            case 7:
                E26.A00((E26) this.A01);
                break;
            case 8:
                AnonymousClass4DH r3 = (AnonymousClass4DH) this.A01;
                C290815g0 r2 = new C290815g0(new C66069MAc(r3, 5), 1726365662);
                r2.A00 = new KH1((Object) r3, 17);
                r3.schedule(r2);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new EF6(AnonymousClass7TE.A0l(((E26) this.A01).A0N));
            case 13:
                ESH.A06((ESH) this.A01);
                break;
            case 17:
                C47431E2d e2d = (C47431E2d) this.A01;
                AnonymousClass0eM r4 = e2d.A01;
                boolean A06 = 182.A06(0Tu.A05, DbT.A0X(r4), 36319562009943524L);
                return new EFL(DbY.A05(e2d), AnonymousClass0kN.A01(e2d.A00, DbT.A0X(r4)), A06);
            case 21:
                C47432E2e e2e = (C47432E2e) this.A01;
                return new EF7(DbY.A05(e2e), AnonymousClass7TE.A0l(e2e.A00));
            case 25:
                return new EFL(DbY.A05((Fragment) this.A01), new AnonymousClass0kM(C61170le.A00).A00(), false);
            case 26:
                PQ2.A00((PQ2) this.A01);
                break;
            case 27:
            case 28:
                DbS.A1U(this.A01);
                break;
            case 32:
                return new EEr(AnonymousClass7TE.A0l(((C48030ERt) this.A01).A01));
            case 36:
                return new C47734EEs(AnonymousClass7TE.A0l(((C48031ERu) this.A01).A01));
            case 37:
                return new C46481Dfk((UserSession) this.A01);
            case 38:
                return 02m.A0p;
            case 39:
                return new SettingsNetworkInteractor((UserSession) this.A01);
            case 40:
                return new LGF((UserSession) this.A01);
            case Seq.NULL_REFNUM:
                return new LFr(DbS.A0O(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE), ((SettingsRepository) this.A01).A01);
            case Seq.RefTracker.REF_OFFSET:
                return DbX.A0o((Fragment) this.A01);
            case 43:
            case 44:
            case 45:
                C59844JaK.A00((C59844JaK) this.A01).A04();
                break;
            case 46:
                return new C49859F9z(AnonymousClass7TE.A0l(((C59844JaK) this.A01).A06));
            case 47:
                Serializable serializable = DbS.A0B(this.A01).getSerializable("new_settings_session");
                0qQ.A0C(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                return serializable;
            case 48:
                1YN A002 = AnonymousClass2bO.A00();
                C59844JaK jaK = (C59844JaK) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(jaK.A06);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A03;
                AnonymousClass2bO.A00();
                return A002.A01(jaK, jaK, A0l, 2bV.A03(new C50733FhY(jaK, 4)), quickPromotionSlot);
            case 49:
                Serializable serializable2 = DbS.A0B(this.A01).getSerializable("screen_id");
                0qQ.A0C(serializable2, "null cannot be cast to non-null type com.instagram.settings2.extension.common.generated.id.ScreenId");
                return serializable2;
            default:
                return DbY.A0I(this.A01);
        }
        return C60340gF.A00;
    }
}
