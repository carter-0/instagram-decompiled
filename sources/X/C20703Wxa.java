package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.Wxa  reason: case insensitive filesystem */
public final class C20703Wxa extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20703Wxa(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C20703Wxa(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20703Wxa(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        1Ng r1;
        AnonymousClass1qK r0;
        String str;
        String string;
        switch (this.A00) {
            case 1:
                try {
                    Bundle bundle = ((C61403K5y) this.A01).mArguments;
                    if (bundle != null) {
                        str = bundle.getString("media_picker_option");
                    } else {
                        str = null;
                    }
                    for (C16492Uvn uvn : C16492Uvn.values()) {
                        if (0qQ.A0K(uvn.name(), str)) {
                            return uvn;
                        }
                    }
                    throw AnonymousClass7TE.A0y();
                } catch (Exception e) {
                    ((C61403K5y) this.A01).A02 = e;
                    return C16492Uvn.SINGLE_POST;
                }
            case 2:
                C61403K5y k5y = (C61403K5y) this.A01;
                return new C15709UhG((C16492Uvn) A00(k5y, 1).getValue(), AnonymousClass7TE.A0l(k5y.A0A), DbS.A0t(k5y.A06));
            case 3:
                return ((Fragment) this.A01).requireParentFragment();
            case 4:
            case 17:
            case 38:
                return DbT.A0r(this.A01);
            case 6:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (!(bundle2 == null || (string = bundle2.getString(AnonymousClass000.A00(701))) == null)) {
                    for (BoostMediaPickerTabType boostMediaPickerTabType : BoostMediaPickerTabType.values()) {
                        if (0qQ.A0K(boostMediaPickerTabType.A00, string)) {
                            return boostMediaPickerTabType;
                        }
                    }
                }
                throw new IllegalStateException("tabType cannot be null.");
            case 7:
                C61415K6m k6m = (C61415K6m) this.A01;
                Context requireContext = k6m.requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(k6m.A0C);
                0qQ.A0B(A0l, 3);
                return new C232722uK(requireContext, A0l, k6m, (C228412ld) null, "", true, false, true, true, false);
            case 8:
                C61415K6m k6m2 = (C61415K6m) this.A01;
                return ((C60293Jiq) k6m2.A0B.getValue()).A02((BoostMediaPickerTabType) k6m2.A0D.getValue());
            case 9:
                return new C246923fS(((C61663KGn) this.A01).A03);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 49:
                return C51971G9r.A0U(this.A01);
            case 11:
            case 13:
                return JTR.A0b(this.A01);
            case 14:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), AnonymousClass000.A00(865)));
            case 15:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), AnonymousClass000.A00(2091)));
            case 16:
            case 37:
                return this.A01;
            case 19:
                return new C47718EEb(AnonymousClass7TE.A0l(((E2E) this.A01).A00));
            case 20:
                return new Object();
            case 21:
                UserSession userSession = ((VRY) this.A01).A00;
                return userSession.A01(AH0.class, new C20703Wxa(userSession, 25));
            case 22:
                r1 = AnonymousClass1Nd.A00(((VRY) this.A01).A00);
                r0 = WQR.A00;
                break;
            case 23:
                UserSession userSession2 = ((C17796Vg9) this.A01).A00;
                return userSession2.A01(AH0.class, new C20703Wxa(userSession2, 25));
            case 24:
                r1 = AnonymousClass1Nd.A00(((C17796Vg9) this.A01).A00);
                r0 = WQS.A00;
                break;
            case 25:
                return new AH0((UserSession) this.A01);
            case 26:
                return AnonymousClass0kN.A02((0lg) this.A01);
            case 27:
                return new C17853Vh6((UserSession) this.A01);
            case 28:
                return new C18418VrN((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new C18437Vrg(((C17853Vh6) this.A01).A01);
            case 30:
                return AnonymousClass0kN.A02(((C18437Vrg) this.A01).A00);
            case 31:
                return AnonymousClass0kN.A02(((C18476VsS) this.A01).A01);
            case 32:
                return 02m.A0p;
            case 33:
                return AnonymousClass0kN.A02(((C18736VzH) this.A01).A02);
            case 34:
                return C16905VAi.A00(((VZG) this.A01).A02);
            case 35:
                return AnonymousClass07i.A00(((VZG) this.A01).A00);
            case 36:
                UserSession userSession3 = ((C15317UaP) this.A01).A01;
                if (userSession3 != null) {
                    return WGU.A00(userSession3);
                }
                DbS.A14();
                throw AnonymousClass00P.createAndThrow();
            case 40:
                Fragment fragment = (Fragment) this.A01;
                PromoteData A002 = XAI.A00(fragment);
                return new C15703UhA(C18784W1k.A01(fragment, A002.A0y), A002);
            case Seq.NULL_REFNUM /*41*/:
                FragmentActivity fragmentActivity = (PromoteActivity) this.A01;
                return new C18784W1k(fragmentActivity, fragmentActivity, AnonymousClass7TE.A0l(fragmentActivity.A0A));
            case Seq.RefTracker.REF_OFFSET /*42*/:
                Bundle A06 = DbU.A06((Activity) this.A01);
                if (A06 != null) {
                    return A06;
                }
                throw AnonymousClass7TE.A0y();
            case 43:
                return WGU.A00(AnonymousClass7TE.A0l(((PromoteActivity) this.A01).A0A));
            case 44:
                return new C18476VsS(AnonymousClass7TE.A0l(((PromoteActivity) this.A01).A0A));
            case 45:
                return new C18437Vrg(AnonymousClass7TE.A0l(((PromoteActivity) this.A01).A0A));
            case 46:
                AnonymousClass0wW A04 = 09i.A0A.A04((Bundle) ((PromoteActivity) this.A01).A06.getValue());
                DbS.A1Z(A04);
                return A04;
            case 47:
                C15328Uac uac = (C15328Uac) this.A01;
                uac.A04 = null;
                DbT.A1I(uac);
                break;
            case 48:
                return JTU.A0D(((UZT) this.A01).A0B);
            default:
                return DbY.A0I(this.A01);
        }
        r1.A00(r0);
        return C60340gF.A00;
    }
}
