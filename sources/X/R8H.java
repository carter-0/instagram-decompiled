package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.HashMap;

public final class R8H extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IGAutofillBloksSoftKeyboardFragment";
    public AnonymousClass6NS A00;
    public C3034368u A01;
    public FrameLayout A02;
    public C273694n2 A03;
    public C229382nI A04;
    public 2el A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "autofill_bloks_soft_keyboard_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C3034368u r1 = this.A01;
        if (r1 == null) {
            str = "bloksParseResult";
        } else {
            C229382nI r0 = this.A04;
            if (r0 == null) {
                str = "igBloksHost";
            } else {
                AnonymousClass6NR A002 = AnonymousClass6NS.A00(requireContext, r1, r0);
                A002.A01 = new HashMap();
                AnonymousClass6NS A003 = A002.A00();
                this.A00 = A003;
                C273694n2 r02 = this.A03;
                if (r02 != null) {
                    A003.A07(r02);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(157948549);
        R8H.super.onCreate(bundle);
        this.A05 = 2el.A00();
        0lg A0X = DbT.A0X(this.A06);
        2el r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = C229382nI.A03(this, A0X, r0);
        AnonymousClass0fD.A09(1552526207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(144302482);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_autofill_soft_keyboard, false);
        this.A02 = (FrameLayout) A0D.requireViewById(R.id.iab_autofill_soft_keyboard);
        C273694n2 r1 = new C273694n2(requireContext());
        this.A03 = r1;
        C51968G9o.A1D(r1, -2);
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            frameLayout.addView(this.A03);
        }
        AnonymousClass0fD.A09(-1882898106, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(151802163);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        AnonymousClass6NS r0 = this.A00;
        if (r0 != null) {
            r0.A04();
        }
        AnonymousClass0fD.A09(-761579425, A022);
    }
}
