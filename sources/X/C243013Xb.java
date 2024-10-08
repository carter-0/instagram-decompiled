package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3Xb  reason: invalid class name and case insensitive filesystem */
public final class C243013Xb {
    public static final C243013Xb A00 = new Object();

    public static final void A01(View view, View view2, UserSession userSession, 1Xj r7, AnonymousClass3W1 r8, String str, int i) {
        int min;
        0qQ.A0B(r8, 1);
        0qQ.A0B(view2, 4);
        view.getHitRect(new Rect());
        if (view2.getTouchDelegate() == null) {
            Rect rect = new Rect();
            rect.left = Math.max(view.getLeft(), view2.getLeft());
            rect.right = Math.min(view.getRight(), view2.getRight());
            if (str.equals("cta_extension_tap_on_media")) {
                rect.top = Math.max(0, view2.getHeight() - i);
                min = view2.getHeight();
            } else {
                if (str.equals("cta_extension_tap_on_ufi")) {
                    rect.top = 0;
                    min = Math.min(view2.getHeight(), i);
                }
                view2.setTouchDelegate(new C52841GdX(rect, view, view2, userSession, r7, r8, str));
            }
            rect.bottom = min;
            view2.setTouchDelegate(new C52841GdX(rect, view, view2, userSession, r7, r8, str));
        }
    }

    public final boolean A05(UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        String moduleName = r6.getModuleName();
        if ((0qQ.A0K(moduleName, "feed_timeline") || ((0qQ.A0K(moduleName, "feed_contextual_chain") || 0qQ.A0K(moduleName, "feed_contextual_profile")) && 182.A06(0Tu.A05, userSession, 36321065249481789L))) && r5.CcK() && 182.A06(0Tu.A05, userSession, 36321065249088569L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(int i) {
        if (i == C231592rv.AD_CTA.ordinal() || i == C231592rv.APP_INSTALL_CTA.ordinal() || i == C231592rv.COLLECTION_CTA.ordinal() || i == C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA.ordinal() || i == C231592rv.SHOPPING_CTA.ordinal() || i == C231592rv.MEDIA_FUNDRAISER.ordinal() || i == C231592rv.MEDIA_FUNDRAISER_DONATE_BUTTON.ordinal() || i == C231592rv.UPCOMING_LIVE_EVENT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.MEDIA_OPEN_CAROUSEL_REVIEW_CTA.ordinal() || i == C231592rv.MEDIA_OPEN_CAROUSEL_TURN_ON_CTA.ordinal() || i == C231592rv.BOOST_GUIDANCE_CTA.ordinal() || i == C231592rv.LITHO_AD_CTA.ordinal()) {
            return true;
        }
        return false;
    }

    public static final View A00(View view, int i) {
        RecyclerView recyclerView;
        C252553pI r2;
        int A06;
        ViewParent parent = view.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null || (r2 = recyclerView.A0D) == null || (A06 = C252553pI.A06(view) + i) < 0 || A06 >= r2.A0U()) {
            return null;
        }
        return r2.A1D(A06);
    }

    public final View A03(View view) {
        if (view.getTag(R.id.feed_cta_extra_tappable_target) != null) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                0qQ.A07(childAt);
                View A03 = A03(childAt);
                if (A03 != null) {
                    return A03;
                }
            }
        }
        return null;
    }

    public final ArrayList A04(View view) {
        ArrayList arrayList = new ArrayList();
        if (view.getTag(R.id.feed_cta_extra_tappable_target) != null) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                0qQ.A07(childAt);
                View A03 = A03(childAt);
                if (A03 != null) {
                    arrayList.addAll(A00.A04(A03));
                }
            }
        }
        return arrayList;
    }
}
