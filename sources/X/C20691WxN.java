package X;

import androidx.fragment.app.Fragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxN  reason: case insensitive filesystem */
public final class C20691WxN extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20691WxN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C20691WxN(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        WYY wyy;
        switch (this.A00) {
            case 0:
                return new String[((AnonymousClass0r6[]) this.A01).length];
            case 2:
            case 5:
            case 8:
            case 14:
            case 17:
            case 20:
            case 26:
            case 30:
            case 34:
            case 38:
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case 46:
                return DbT.A0r(this.A01);
            case 3:
            case 6:
            case 9:
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 21:
            case 27:
            case 31:
            case 35:
            case 39:
            case 43:
            case 47:
                return DbY.A0I(this.A01);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 32:
            case 44:
                Fragment fragment = (AnonymousClass4DH) this.A01;
                return new U8D(fragment.requireArguments(), fragment, fragment);
            case 11:
                wyy = ((C16057Unk) ((C16007Umo) this.A01).A04.getValue()).A04;
                break;
            case 22:
            case 24:
            case 36:
            case 40:
            case 48:
                Fragment fragment2 = (AnonymousClass4DH) this.A01;
                return new U8E(fragment2.requireArguments(), fragment2, fragment2);
            case 23:
                wyy = C13990Tnq.A0S(((C15314UaL) this.A01).A0G).A0C;
                break;
            case 28:
                Fragment fragment3 = (AnonymousClass4DH) this.A01;
                return new U8C(fragment3.requireArguments(), fragment3, fragment3);
            default:
                return this.A01;
        }
        return new C15704UhB(wyy, "organic_lead_gen_consumer");
    }
}
