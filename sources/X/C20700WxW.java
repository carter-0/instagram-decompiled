package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxW  reason: case insensitive filesystem */
public final class C20700WxW extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20700WxW(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C20700WxW(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        C16602Uxw uxw;
        UserSession userSession;
        String str4;
        switch (this.A00) {
            case 0:
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 16:
            case 20:
            case 23:
            case 28:
            case 31:
            case 37:
            case 40:
            case 45:
            case 48:
                return DbT.A0r(this.A01);
            case 2:
            case 6:
            case 14:
            case 26:
            case 35:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                Fragment fragment = (AnonymousClass4DH) this.A01;
                return new U8D(fragment.requireArguments(), fragment, fragment);
            case 3:
            case 7:
            case 11:
            case 15:
            case 19:
            case 22:
            case 27:
            case 30:
            case 36:
            case 39:
            case 44:
            case 47:
                return this.A01;
            case 10:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 34:
            case 43:
                Fragment fragment2 = (AnonymousClass4DH) this.A01;
                return new U8E(fragment2.requireArguments(), fragment2, fragment2);
            case 25:
                UaM uaM = (UaM) this.A01;
                userSession = uaM.A02().A02;
                String str5 = uaM.A02().A00;
                if (str5 == null) {
                    str5 = "";
                }
                LeadForm leadForm = uaM.A02().A03.A01;
                String str6 = null;
                if (leadForm != null) {
                    str4 = leadForm.A03;
                } else {
                    str4 = null;
                }
                XIGIGBoostCallToAction xIGIGBoostCallToAction = uaM.A02().A03.A00;
                if (xIGIGBoostCallToAction != null) {
                    str6 = xIGIGBoostCallToAction.A00;
                }
                uxw = uaM.A02().A05;
                break;
            case 33:
                C15311UaI uaI = (C15311UaI) this.A01;
                userSession = uaI.A01().A06;
                str3 = uaI.A01().A02;
                if (str3 == null) {
                    str3 = "";
                }
                LeadForm leadForm2 = uaI.A01().A08.A01;
                str = null;
                if (leadForm2 != null) {
                    str2 = leadForm2.A03;
                } else {
                    str2 = null;
                }
                XIGIGBoostCallToAction xIGIGBoostCallToAction2 = uaI.A01().A08.A00;
                if (xIGIGBoostCallToAction2 != null) {
                    str = xIGIGBoostCallToAction2.A00;
                }
                uxw = uaI.A01().A0A;
                break;
            default:
                return DbY.A0I(this.A01);
        }
        return new C15719UhQ(userSession, uxw, str3, str2, str);
    }
}
