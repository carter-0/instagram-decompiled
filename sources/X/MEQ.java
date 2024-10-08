package X;

import android.view.Choreographer;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class MEQ extends AnonymousClass1Ek implements 0sL {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEQ(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.MEQ] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            default:
                i = 28;
                break;
        }
        return new MEQ(i, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
            case 1:
            case 10:
            case 11:
            case 13:
            case 17:
            case 19:
            case 21:
                return ((MEQ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
            case 2:
            case 3:
            case 27:
                return ((MEQ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
            case 7:
                AnonymousClass4D7 r4 = (AnonymousClass4D7) obj2;
                if (r4 != null) {
                    r4.getContext();
                }
                0eS.A00(C60340gF.A00);
                return C61753KKs.A00;
            case 8:
                AnonymousClass4D7 r42 = (AnonymousClass4D7) obj2;
                if (r42 != null) {
                    r42.getContext();
                }
                0eS.A00(C60340gF.A00);
                return C61752KKr.A00;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                AnonymousClass4D7 r43 = (AnonymousClass4D7) obj2;
                if (r43 != null) {
                    r43.getContext();
                }
                0eS.A00(C60340gF.A00);
                return "bad_response";
            case 20:
                AnonymousClass4D7 r44 = (AnonymousClass4D7) obj2;
                if (r44 != null) {
                    r44.getContext();
                }
                0eS.A00(C60340gF.A00);
                return AnonymousClass000.A00(363);
            default:
                AnonymousClass4D7 r45 = (AnonymousClass4D7) obj2;
                if (r45 != null) {
                    r45.getContext();
                }
                C60340gF r0 = C60340gF.A00;
                0eS.A00(r0);
                return r0;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                0eS.A00(obj);
                return Choreographer.getInstance();
            case 2:
            case 3:
                0eS.A00(obj);
                return AnonymousClass7TE.A0v();
            case 7:
                0eS.A00(obj);
                return C61753KKs.A00;
            case 8:
                0eS.A00(obj);
                return C61752KKr.A00;
            case 11:
                0eS.A00(obj);
                0KC.A0C("SocialChannelPreviewHandler", "update_channel_invite api failed");
                return C60340gF.A00;
            case 13:
                0eS.A00(obj);
                return C41845B3m.A0c(new Object());
            case 17:
            case 19:
                0eS.A00(obj);
                FGv.A02();
                return C60340gF.A00;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                0eS.A00(obj);
                return "bad_response";
            case 20:
                0eS.A00(obj);
                return AnonymousClass000.A00(363);
            case 21:
                0eS.A00(obj);
                return new C50619Ffa(new C50617FfY(0));
            case 27:
                0eS.A00(obj);
                return new Jv0(0sn.A00, false, true);
            default:
                0eS.A00(obj);
                return C60340gF.A00;
        }
    }
}
