package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.nido.impl.NidoFeatureProviderImpl;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Luk  reason: case insensitive filesystem */
public final class C65521Luk implements C74486Pvg {
    public View A00;
    public TextView A01;
    public RecyclerView A02;
    public WW4 A03;
    public IgdsButton A04;
    public C59824JZz A05;
    public C60111Jfs A06;
    public SpinnerImageView A07;
    public AnonymousClass0r6 A08;
    public int A09;
    public C231302rO A0A;
    public final ViewTreeObserver.OnGlobalLayoutListener A0B = new LZ0(this, 9);

    public final void D6Z(UserSession userSession, WW4 ww4, C60111Jfs jfs) {
        NidoExploreViewModel nidoExploreViewModel;
        0qQ.A0B(userSession, 2);
        this.A03 = ww4;
        this.A06 = jfs;
        this.A05 = new C59824JZz(ww4);
        AnonymousClass0Ud r0 = null;
        if ((jfs instanceof NidoExploreViewModel) && (nidoExploreViewModel = (NidoExploreViewModel) jfs) != null) {
            r0 = nidoExploreViewModel.A09;
        }
        this.A08 = r0;
        A00(this);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        0xY AR4 = A0q.AR4();
        AR4.E5c("explore_topic_picker_last_shown_time_ms", System.currentTimeMillis());
        AR4.apply();
        AnonymousClass7TG.A1M(A0q, "explore_topic_picker_impressions", DbT.A00(A0q, "explore_topic_picker_impressions") + 1);
        NidoFeatureProviderImpl.A00 = true;
    }

    public final void D71(ViewGroup viewGroup, Fragment fragment, UserSession userSession) {
        RecyclerView recyclerView;
        IgdsButton igdsButton;
        SpinnerImageView spinnerImageView;
        TextView textView;
        View findViewById;
        View findViewById2;
        ViewTreeObserver viewTreeObserver;
        int A022 = DbW.A02(0, userSession, viewGroup);
        boolean A0A2 = C61670oa.A0A();
        View inflate = DbV.A0E(fragment).inflate(R.layout.explore_qp_topic_picker, viewGroup);
        this.A00 = inflate;
        if (!(inflate == null || (viewTreeObserver = inflate.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0B);
        }
        View view = this.A00;
        if (view != null) {
            recyclerView = DbZ.A0F(view, R.id.topic_picker_rv);
        } else {
            recyclerView = null;
        }
        this.A02 = recyclerView;
        if (recyclerView != null) {
            C59824JZz jZz = this.A05;
            if (jZz != null) {
                recyclerView.setAdapter(jZz);
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getRootView().getContext());
                int i = 2;
                if (A0A2) {
                    i = 0;
                }
                if (flexboxLayoutManager.A04 != i) {
                    flexboxLayoutManager.A04 = i;
                    flexboxLayoutManager.A0b();
                }
                recyclerView.setLayoutManager(flexboxLayoutManager);
                recyclerView.A11(new C60454Jlm(DbU.A05(recyclerView).getDimension(R.dimen.abc_action_bar_elevation_material)));
                C60473Jm5.A00(recyclerView, this, 15);
            }
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
        View view2 = this.A00;
        if (view2 != null) {
            igdsButton = (IgdsButton) view2.findViewById(R.id.more_topics_btn);
        } else {
            igdsButton = null;
        }
        this.A04 = igdsButton;
        if (igdsButton != null) {
            igdsButton.setText(2131968378);
        }
        View view3 = this.A00;
        if (view3 != null) {
            spinnerImageView = (SpinnerImageView) view3.findViewById(R.id.topic_picker_spinner);
        } else {
            spinnerImageView = null;
        }
        this.A07 = spinnerImageView;
        View view4 = this.A00;
        if (view4 != null) {
            textView = AnonymousClass7TE.A0d(view4, R.id.topic_picker_body_text);
        } else {
            textView = null;
        }
        this.A01 = textView;
        View view5 = this.A00;
        if (!(view5 == null || (findViewById2 = view5.findViewById(R.id.topic_picker_close_btn)) == null)) {
            C64273LXz.A00(findViewById2, 19, this);
        }
        if (A0A2) {
            View view6 = this.A00;
            if (!(view6 == null || (findViewById = view6.findViewById(R.id.topic_picker_header_text)) == null)) {
                findViewById.setTextAlignment(A022);
            }
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setTextAlignment(A022);
            }
        }
        C59824JZz jZz2 = this.A05;
        if (jZz2 != null) {
            jZz2.registerAdapterDataObserver(new C60448Jlg(1, fragment, this));
            C60473Jm5.A00(DbZ.A0F(fragment.requireView(), R.id.recycler_view), this, 16);
            AnonymousClass7TE.A1Z(new C66929MfO(this, userSession, (AnonymousClass4D7) null, 43), DbV.A0J(fragment));
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FKY(C231302rO r4, float f) {
        0qQ.A0B(r4, 1);
        this.A0A = r4;
        View view = this.A00;
        if (view != null) {
            DbX.A1C(view, view.getPaddingLeft(), (int) f);
            A01(this);
        }
    }

    public static final void A00(C65521Luk luk) {
        C60111Jfs jfs = luk.A06;
        if (jfs == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        } else if (jfs instanceof NidoExploreViewModel) {
            AnonymousClass7TE.A1Z(new C66170MGh(jfs, (AnonymousClass4D7) null, 35), C318116oQ.A00(jfs));
        }
    }

    public static final void A01(C65521Luk luk) {
        C231302rO r2;
        View view = luk.A00;
        if (view != null && (r2 = luk.A0A) != null) {
            int height = view.getHeight();
            if (height > 0) {
                r2.EZ4(height);
                luk.A09 = height;
                return;
            }
            int i = luk.A09;
            if (i <= 0) {
                i = DbS.A03(DbU.A05(view), R.dimen.alt_text_carousel_card_width);
            }
            r2.EZ4(i);
        }
    }

    public final Integer C9n() {
        return AnonymousClass05K.A01;
    }

    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        View view = this.A00;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0B);
        }
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A0A = null;
        this.A07 = null;
    }
}
