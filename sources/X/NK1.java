package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class NK1 extends AnonymousClass4DH implements C268594df, C74332Pt8, C74472PvS {
    public static final String __redex_internal_original_name = "DirectPollMessageCreationFragment";
    public View A00;
    public LinearLayout A01;
    public NestedScrollView A02;
    public P4G A03;
    public O76 A04;
    public IgdsBottomButtonLayout A05;
    public IgFormField A06;
    public DirectShareTarget A07;
    public View A08;
    public ViewGroup A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgImageView A0C;
    public AnonymousClass7L0 A0D;
    public final long A0E = 200;
    public final String A0F = "direct_poll_message";
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final AnonymousClass9HB A0H = new AnonymousClass9HB();
    public final boolean A0I = true;

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
        View view = this.A00;
        if (view != null) {
            C66582MXn.A14(view, 0);
        }
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        int i3 = i + i2;
        View view = this.A00;
        if (view != null) {
            C66582MXn.A14(view, i3);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = DbU.A0C(view, R.id.poll_message_root_container);
        this.A08 = view.requireViewById(R.id.drag_handle);
        this.A0B = DbT.A0a(view, R.id.poll_message_title);
        IgImageView A0b = DbT.A0b(view, R.id.poll_message_back_button);
        this.A0C = A0b;
        if (A0b != null) {
            C71401Ok0.A01(A0b, 65, this);
        }
        IgTextView A0a = DbT.A0a(view, R.id.poll_message_cancel);
        this.A0A = A0a;
        if (A0a != null) {
            C71401Ok0.A01(A0a, 66, this);
        }
        this.A02 = (NestedScrollView) view.requireViewById(R.id.poll_message_scroll_view);
        IgFormField igFormField = (IgFormField) view.requireViewById(R.id.poll_message_question);
        this.A06 = igFormField;
        if (igFormField != null) {
            igFormField.A0G(new C71273OhE(this, 15));
        }
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.poll_message_options_layout);
        this.A01 = linearLayout;
        this.A03 = new P4G(new O74(this));
        if (linearLayout != null) {
            linearLayout.setLayoutTransition(new LayoutTransition());
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.poll_message_create_button);
        this.A05 = igdsBottomButtonLayout;
        int i = 0;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A05;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setPrimaryActionOnClickListener(C71401Ok0.A00(this, 67));
        }
        this.A00 = view.requireViewById(R.id.poll_message_spacing_view);
        A00();
        P4G p4g = this.A03;
        if (p4g != null) {
            if (p4g.A02.isEmpty()) {
                P4G p4g2 = this.A03;
                if (p4g2 != null) {
                    p4g2.A03();
                }
            }
            Bundle requireArguments = requireArguments();
            if (requireArguments.containsKey("bottom_sheet_top_y") && requireArguments.containsKey("bottom_sheet_bottom_y")) {
                onBottomSheetPositionChanged(requireArguments.getInt("bottom_sheet_top_y", 0), requireArguments.getInt("bottom_sheet_bottom_y", 0));
            }
            IgImageView igImageView = this.A0C;
            if (igImageView != null) {
                igImageView.setVisibility(DbW.A01(requireArguments.getBoolean("should_show_back_button", true) ? 1 : 0));
            }
            View view2 = this.A08;
            if (view2 != null) {
                if (!requireArguments.getBoolean("should_show_drag_handle", false)) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
            return;
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00() {
        AnonymousClass7L0 r0 = this.A0D;
        if (r0 != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), r0.A0E);
            IgTextView igTextView = this.A0B;
            if (igTextView != null) {
                igTextView.setTextColor(2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
            IgImageView igImageView = this.A0C;
            if (igImageView != null) {
                igImageView.setColorFilter(2Yu.A01(contextThemeWrapper));
            }
            IgTextView igTextView2 = this.A0A;
            if (igTextView2 != null) {
                igTextView2.setTextColor(2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
        }
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final void ADi(AnonymousClass7L0 r1) {
        this.A0D = r1;
        A00();
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0I;
    }

    public final void DMu(int i) {
        View view = this.A00;
        if (view != null) {
            C66582MXn.A14(view, i);
        }
    }

    public final String getModuleName() {
        return this.A0F;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A02;
        if (nestedScrollView == null || nestedScrollView.getScrollY() != 0) {
            return false;
        }
        return true;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(298187806);
        NK1.super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable(AnonymousClass000.A00(530));
        0qQ.A0C(parcelable, "null cannot be cast to non-null type com.instagram.model.direct.DirectShareTarget");
        this.A07 = (DirectShareTarget) parcelable;
        AnonymousClass0eM r6 = this.A0G;
        this.A04 = new O76(this, AnonymousClass7TE.A0l(r6));
        DirectShareTarget directShareTarget = this.A07;
        String str2 = "shareTarget";
        if (directShareTarget != null) {
            if (!(directShareTarget.A02() instanceof MsysThreadId)) {
                O76 o76 = this.A04;
                if (o76 == null) {
                    str2 = "logger";
                } else {
                    DirectShareTarget directShareTarget2 = this.A07;
                    if (directShareTarget2 != null) {
                        C254783t2 A0c = DbS.A0c(directShareTarget2);
                        DirectShareTarget directShareTarget3 = this.A07;
                        if (directShareTarget3 != null) {
                            boolean A0Y = directShareTarget3.A0Y(DbU.A0u(r6));
                            C254763t0 A002 = AnonymousClass6W4.A00(AnonymousClass6W3.A01(A0c));
                            if (A002 == null || (str = A002.A00) == null) {
                                DbT.A1Q(0wj.A01, "threadId is null while reporting start poll event", 20134884);
                            } else {
                                0Aj A0e = AnonymousClass7TE.A0e(o76.A00, "start_new_poll");
                                0bb r0 = new 0bb();
                                C66584MXp.A0z(r0, str, A0Y);
                                C66583MXo.A13(A0e, r0);
                            }
                        }
                    }
                }
            }
            AnonymousClass0fD.A09(1752382451, A022);
            return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1083200530);
        0qQ.A0B(layoutInflater, 0);
        this.A0H.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_creation, viewGroup, false);
        AnonymousClass0fD.A09(771150532, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(721763993);
        super.onDestroyView();
        this.A09 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0A = null;
        this.A02 = null;
        this.A06 = null;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-632684216, A022);
    }
}
