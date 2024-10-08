package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Locale;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxS  reason: case insensitive filesystem */
public final class C20696WxS extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20696WxS(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C20696WxS(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                Fragment fragment = (AnonymousClass4DH) this.A01;
                return new U8G(fragment.requireArguments(), fragment, fragment);
            case 1:
            case 5:
            case 8:
            case 11:
            case 17:
            case 21:
            case 27:
            case 31:
            case 35:
            case 45:
                return this.A01;
            case 2:
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 22:
            case 28:
            case 32:
            case 36:
            case 46:
                return DbT.A0r(this.A01);
            case 4:
                Fragment fragment2 = (C16388Uu6) this.A01;
                return new U87(fragment2.mArguments, fragment2, AnonymousClass7TE.A0l(fragment2.A02));
            case 14:
                Fragment fragment3 = (C15998Umf) this.A01;
                AnonymousClass0eM r3 = fragment3.A0D;
                return new U8A(fragment3.mArguments, fragment3, ((C16039UnS) r3.getValue()).A0H, ((C16039UnS) r3.getValue()).A0I);
            case 15:
                return new C15704UhB(((C16039UnS) ((C15998Umf) this.A01).A0D.getValue()).A0I, "lead_ad_question_page");
            case 16:
                Fragment fragment4 = (AnonymousClass4DH) this.A01;
                return new U8B(fragment4.requireArguments(), fragment4, fragment4);
            case 20:
                Fragment fragment5 = (AnonymousClass4DH) this.A01;
                return new U8H(fragment5.requireArguments(), fragment5, fragment5);
            case 24:
            case 30:
                Fragment fragment6 = (AnonymousClass4DH) this.A01;
                return new U8F(fragment6.requireArguments(), fragment6, fragment6);
            case 25:
            case 40:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return C51971G9r.A0U(this.A01);
            case 26:
                return JTR.A0b(this.A01);
            case 34:
                Fragment fragment7 = (Fragment) this.A01;
                return new C60086JfS(fragment7.requireArguments(), fragment7);
            case 38:
                Fragment fragment8 = (Fragment) this.A01;
                FragmentActivity requireActivity = fragment8.requireActivity();
                String[] iSOCountries = Locale.getISOCountries();
                0qQ.A07(iSOCountries);
                ArrayList arrayList = new ArrayList(r3);
                for (String str : iSOCountries) {
                    0qQ.A0A(str);
                    arrayList.add(W33.A00(requireActivity, str));
                }
                return new U8I(fragment8.requireArguments(), fragment8, W33.A00(fragment8.requireActivity(), ""), 00k.A0g(00k.A0a(00k.A0k(arrayList)), new C20373WqD(11)));
            case 39:
                C15315UaN uaN = (C15315UaN) this.A01;
                return new C61565KCs(uaN.A02().A02(), C51970G9q.A0g(uaN.requireContext(), uaN.requireActivity(), uaN.A02().A02()));
            case Seq.NULL_REFNUM /*41*/:
                UYu uYu = (UYu) this.A01;
                AnonymousClass2tC A002 = AnonymousClass2t9.A00(uYu.requireActivity());
                A002.A08 = true;
                AnonymousClass2t9 A0U = DbU.A0U(A002, new C61641KFr(new C19174WOg(uYu), uYu, ((C60247Ji4) uYu.A07.getValue()).A06, 1.0f));
                A0U.A05(new ViewModelListUpdate());
                return A0U;
            case 43:
                UYu uYu2 = (UYu) this.A01;
                Context requireContext = uYu2.requireContext();
                AnonymousClass0eM r2 = uYu2.A06;
                return new C61565KCs(AnonymousClass7TE.A0l(r2), C51970G9q.A0g(requireContext, uYu2.requireActivity(), AnonymousClass7TE.A0l(r2)));
            case 44:
                return new U9d(((Fragment) this.A01).getContext(), 3);
            case 48:
                Fragment fragment9 = (Fragment) this.A01;
                return new U88(fragment9.requireArguments(), fragment9);
            case 49:
                return new C61072JwA[((AnonymousClass0r6[]) this.A01).length];
            default:
                return DbY.A0I(this.A01);
        }
    }
}
