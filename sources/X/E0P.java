package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

public final class E0P extends C240373Kq implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgBloksIdfaDialog";
    public int A00 = 4;
    public 0lg A01;
    public FrameLayout A02;
    public C229382nI A03;
    public IgBloksScreenConfig A04;
    public AnonymousClass6NS A05;
    public 2el A06;

    public final String getModuleName() {
        return "bloks-idfa-dialog";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        E0P.super.onAttach(context);
    }

    public final 0lg A0M() {
        return this.A01;
    }

    public final Dialog A0F(Bundle bundle) {
        E0P.super.A0F(bundle);
        Context context = getContext();
        if (context != null) {
            Dialog dialog = new Dialog(context, R.style.IgDialog);
            dialog.setCancelable(false);
            if (this.A05 == null) {
                1Kn.A02(__redex_internal_original_name, "Hosting component is null");
                this.A07 = false;
                A08();
                return dialog;
            }
            Context context2 = getContext();
            if (context2 != null) {
                View inflate = LayoutInflater.from(context2).inflate(R.layout.idfa_dialog, (ViewGroup) null);
                0qQ.A07(inflate);
                this.A02 = (FrameLayout) inflate.requireViewById(R.id.bloks_container);
                C273694n2 r2 = new C273694n2(requireContext());
                FrameLayout frameLayout = this.A02;
                if (frameLayout != null) {
                    frameLayout.addView(r2);
                    AnonymousClass6NS r0 = this.A05;
                    if (r0 != null) {
                        r0.A07(r2);
                    }
                    2el r02 = this.A06;
                    if (r02 != null) {
                        Dba.A0z(frameLayout, r02, this);
                    }
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius((float) this.A00);
                Context context3 = getContext();
                if (context3 != null) {
                    gradientDrawable.setColor(context3.getColor(2Yu.A0C(getContext())));
                    inflate.setBackground(gradientDrawable);
                    dialog.setContentView(inflate);
                    return dialog;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onCreate(Bundle bundle) {
        int i;
        C3034368u r1;
        int A022 = AnonymousClass0fD.A02(-1807793478);
        E0P.super.onCreate(bundle);
        AnonymousClass0wW A042 = 09i.A0A.A04(requireArguments());
        this.A01 = A042;
        if (A042 != null) {
            IgBloksScreenConfig A012 = IgBloksScreenConfig.A01(this.mArguments, A042);
            if (A012 != null) {
                this.A04 = A012;
                2el A0U = DbY.A0U();
                this.A06 = A0U;
                0lg r0 = this.A01;
                if (r0 != null) {
                    C229382nI A023 = C229382nI.A02(this, this, r0, A0U);
                    this.A03 = A023;
                    IgBloksScreenConfig igBloksScreenConfig = this.A04;
                    if (igBloksScreenConfig == null || (r1 = igBloksScreenConfig.A07) == null) {
                        i = 616787432;
                        AnonymousClass0fD.A09(i, A022);
                        return;
                    }
                    this.A05 = AnonymousClass6NS.A00(requireContext(), r1, A023).A00();
                }
                i = 1020200645;
                AnonymousClass0fD.A09(i, A022);
                return;
            }
            throw AnonymousClass7TE.A0z("IgBloksScreenConfig is null");
        }
        throw AnonymousClass7TE.A0z("Session can not be null");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(784329951);
        E0P.super.onDestroy();
        AnonymousClass6NS r0 = this.A05;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass0fD.A09(1773340820, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1164242359);
        E0P.super.onDestroyView();
        AnonymousClass6NS r0 = this.A05;
        if (r0 != null) {
            r0.A04();
        }
        this.A05 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-1775274152, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-916897706);
        E0P.super.onResume();
        AnonymousClass0fD.A09(158786884, A022);
    }
}
