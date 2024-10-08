package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.expanding.ExpandingListView;
import java.util.HashMap;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public final class C241383Oz implements AnonymousClass3P0 {
    public ViewGroup A00;
    public AnonymousClass9J0 A01;
    public AnonymousClass3W1 A02;
    public TextView A03;
    public CircularImageView A04;
    public Integer A05;
    public final View A06;
    public final ViewStub A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final boolean A0A;

    public C241383Oz(View view, AnonymousClass0iw r3, UserSession userSession, boolean z) {
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A09 = userSession;
        this.A0A = z;
        this.A08 = r3;
        this.A07 = (ViewStub) view.findViewById(R.id.feed_inline_composer_button_stub);
    }

    public final void DEA() {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A00() {
        ? r4;
        ViewGroup viewGroup = (ViewGroup) this.A06.requireViewById(R.id.feed_inline_composer_button_container);
        this.A00 = viewGroup;
        if (viewGroup != null) {
            this.A04 = (CircularImageView) viewGroup.requireViewById(R.id.feed_inline_composer_button_avatar);
            this.A03 = (TextView) viewGroup.findViewById(R.id.feed_inline_composer_button_textview);
            CircularImageView circularImageView = this.A04;
            if (circularImageView != null) {
                circularImageView.setUrl(AnonymousClass0t1.A01.A01(this.A09).Bh3(), this.A08);
            }
            if (AnonymousClass3DI.A00.A04(this.A09) && (r4 = this.A04) != 0) {
                ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
                Resources resources = r4.getResources();
                layoutParams.width = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                r4.setLayoutParams(layoutParams);
            }
            if (this.A0A) {
                2eQ.A04(viewGroup, 4);
            }
        }
    }

    public final void DEB() {
        ViewGroup viewGroup;
        AnonymousClass3W1 r0 = this.A02;
        if (r0 != null && r0.A3D) {
            if (this.A00 == null) {
                ViewStub viewStub = this.A07;
                if (viewStub != null) {
                    viewStub.inflate();
                }
                A00();
            }
            AnonymousClass9J0 r3 = this.A01;
            if (!(r3 == null || (viewGroup = this.A00) == null)) {
                AnonymousClass0fU.A00(new C39993AMz(r3), viewGroup);
            }
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            View view = this.A06;
            if (view.getParent() instanceof ExpandingListView) {
                ViewParent parent = view.getParent();
                0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.ui.widget.expanding.ExpandingListView");
                ExpandingListView expandingListView = (ExpandingListView) parent;
                Integer num = this.A05;
                if (num == null) {
                    Context context = view.getContext();
                    0qQ.A07(context);
                    view.measure(View.MeasureSpec.makeMeasureSpec(0nA.A09(context), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = Integer.valueOf(view.getMeasuredHeight());
                    this.A05 = num;
                    if (num == null) {
                        return;
                    }
                }
                int intValue = num.intValue();
                if (expandingListView.A01) {
                    int height = intValue - view.getHeight();
                    HashMap hashMap = new HashMap();
                    int childCount = expandingListView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = expandingListView.getChildAt(i);
                        if (childAt.getTop() >= view.getTop()) {
                            childAt.setHasTransientState(true);
                            hashMap.put(childAt, new int[]{childAt.getTop(), childAt.getBottom()});
                        }
                    }
                    if (hashMap.containsKey(view)) {
                        ViewTreeObserver viewTreeObserver = expandingListView.getViewTreeObserver();
                        viewTreeObserver.addOnPreDrawListener(new WCN(view, viewTreeObserver, expandingListView, hashMap, height));
                        view.getLayoutParams().height = intValue;
                        view.requestLayout();
                    }
                }
            }
        }
    }

    public final void DEC(float f) {
        ViewGroup viewGroup;
        AnonymousClass3W1 r0 = this.A02;
        if (r0 != null && r0.A3D && (viewGroup = this.A00) != null) {
            viewGroup.setAlpha(f);
        }
    }
}
