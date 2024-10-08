package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.IVv  reason: case insensitive filesystem */
public final class C57286IVv implements C254153s1 {
    public final View A00;
    public final ConstraintLayout A01;
    public final RecyclerView A02;
    public final ViewPager2 A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final UserSession A09;

    public C57286IVv(View view, UserSession userSession) {
        0qQ.A0B(view, 2);
        this.A09 = userSession;
        this.A01 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_container);
        this.A08 = DbX.A0Z(view, R.id.intent_aware_ad_pivot_see_all_button);
        this.A02 = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_carousel);
        this.A03 = (ViewPager2) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_view_pager);
        this.A06 = DbX.A0Z(view, R.id.intent_aware_ad_pivot_header_title);
        this.A05 = DbX.A0Z(view, R.id.intent_aware_ad_pivot_sub_header_label);
        this.A04 = DbX.A0Y(view, R.id.intent_aware_ad_pivot_dismiss_button);
        this.A07 = DbX.A0Z(view, R.id.intent_aware_ad_pivot_title_see_all_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.carousel_page_indicator);
    }

    public final Object BDh(1Xj r7) {
        Object obj;
        Object obj2;
        C53155GjR gjR;
        1Xj r0;
        Object obj3;
        C53155GjR gjR2;
        1Xj r02;
        RecyclerView recyclerView;
        C252553pI r03;
        View A1D;
        if (182.A06(0Tu.A05, this.A09, 36312887638033843L)) {
            ViewPager2 viewPager2 = this.A03;
            int i = viewPager2.A00;
            View A002 = AnonymousClass046.A00(viewPager2, 0);
            obj = null;
            if (!(A002 instanceof RecyclerView) || (recyclerView = (RecyclerView) A002) == null || (r03 = recyclerView.A0D) == null || (A1D = r03.A1D(i)) == null) {
                obj3 = null;
            } else {
                obj3 = A1D.getTag();
            }
            if (obj3 instanceof C53155GjR) {
                gjR2 = (C53155GjR) obj3;
                if (gjR2 != null) {
                    r02 = gjR2.A00;
                }
                r02 = null;
            } else {
                gjR2 = null;
                r02 = null;
            }
            if (0qQ.A0K(r02, r7)) {
                return gjR2;
            }
        } else {
            RecyclerView recyclerView2 = this.A02;
            C53082GiG giG = recyclerView2.A0A;
            C252553pI r3 = recyclerView2.A0D;
            obj = null;
            if ((giG instanceof C53082GiG) && r3 != null && (r3 instanceof LinearLayoutManager)) {
                C53082GiG giG2 = giG;
                1Xj r2 = r7;
                boolean A5E = r7.A5E();
                List list = giG2.A04;
                if (A5E) {
                    r2 = r7.A1e(giG2.A08);
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r3;
                int indexOf = list.indexOf(r2) - linearLayoutManager.A1a();
                if (indexOf >= 0 && indexOf < linearLayoutManager.A0T()) {
                    View A0X = linearLayoutManager.A0X(indexOf);
                    if (A0X != null) {
                        obj2 = A0X.getTag();
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof C53155GjR) {
                        gjR = (C53155GjR) obj2;
                        if (gjR != null) {
                            r0 = gjR.A00;
                        }
                        r0 = null;
                    } else {
                        gjR = null;
                        r0 = null;
                    }
                    if (0qQ.A0K(r0, r7)) {
                        return gjR;
                    }
                }
            }
        }
        return obj;
    }

    public final Map BR4() {
        Object obj;
        Object obj2;
        RecyclerView recyclerView;
        C252553pI r0;
        View A1D;
        if (182.A06(0Tu.A05, this.A09, 36312887638033843L)) {
            ViewPager2 viewPager2 = this.A03;
            C53082GiG giG = viewPager2.A04.A0A;
            if (giG instanceof C53082GiG) {
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                C53082GiG giG2 = giG;
                int itemCount = giG2.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    View A002 = AnonymousClass046.A00(viewPager2, 0);
                    Object obj3 = null;
                    if (!(A002 instanceof RecyclerView) || (recyclerView = (RecyclerView) A002) == null || (r0 = recyclerView.A0D) == null || (A1D = r0.A1D(i)) == null) {
                        obj2 = null;
                    } else {
                        obj2 = A1D.getTag();
                    }
                    if (obj2 instanceof C53155GjR) {
                        obj3 = obj2;
                    }
                    Object A0O = 00k.A0O(giG2.A04, i);
                    if (!(obj3 == null || A0O == null)) {
                        A1H.put(A0O, obj3);
                    }
                }
                return A1H;
            }
        } else {
            RecyclerView recyclerView2 = this.A02;
            C53082GiG giG3 = recyclerView2.A0A;
            C252553pI r4 = recyclerView2.A0D;
            if ((giG3 instanceof C53082GiG) && r4 != null && (r4 instanceof LinearLayoutManager)) {
                LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                C53082GiG giG4 = giG3;
                int itemCount2 = giG4.getItemCount();
                for (int i2 = 0; i2 < itemCount2; i2++) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r4;
                    View A1D2 = linearLayoutManager.A1D(linearLayoutManager.A1a() + i2);
                    if (A1D2 != null) {
                        obj = A1D2.getTag();
                    } else {
                        obj = null;
                    }
                    Object A0O2 = 00k.A0O(giG4.A04, i2);
                    if (!(obj == null || A0O2 == null)) {
                        A1H2.put(A0O2, obj);
                    }
                }
                return A1H2;
            }
        }
        return AnonymousClass7TE.A1H();
    }
}
