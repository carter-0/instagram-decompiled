package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.UEa  reason: case insensitive filesystem */
public abstract class C14898UEa extends C249703kE {
    public C18077Vl6 A00;
    public boolean A01;
    public final Rect A02 = new Rect();
    public final ViewTreeObserver.OnPreDrawListener A03;
    public final ConstraintLayout A04;
    public final NestedScrollView A05;
    public final UserSession A06;
    public final IgTextView A07;
    public final 2el A08;
    public final IgdsBottomButtonLayout A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14898UEa(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 2);
        this.A06 = userSession;
        this.A09 = (IgdsBottomButtonLayout) view.findViewById(R.id.bottom_button_layout);
        this.A07 = JTO.A0X(view, R.id.privacy_policy_text_view);
        this.A04 = (ConstraintLayout) view.findViewById(R.id.inline_context_card);
        this.A05 = (NestedScrollView) view.findViewById(R.id.scroll_view);
        2el A0U = DbY.A0U();
        this.A08 = A0U;
        this.A03 = new WCE(this, 5);
        A0U.A08(view, new C71632eX(view), new AnonymousClass2eo[0]);
    }

    public static final void A00(View view) {
        InputMethodManager A072 = C13991Tnr.A07(JTP.A0C(view, 0));
        if (A072.isActive()) {
            A072.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void A02() {
        ViewTreeObserver viewTreeObserver;
        IgTextView igTextView = this.A07;
        if (igTextView != null && (viewTreeObserver = igTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.A03);
        }
    }
}
