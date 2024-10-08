package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.feed.widget.IgProgressImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.306  reason: invalid class name */
public final class AnonymousClass306 extends C235412zs {
    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        View view;
        View findViewById;
        ReboundViewPager reboundViewPager;
        View view2;
        IgImageView igImageView;
        C240983Nk r1;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        Object obj = r9.A03;
        0qQ.A06(obj);
        AnonymousClass59J A02 = A02((1Xj) obj);
        if (r10.CEk(r9) != AnonymousClass05K.A0C && (view = (View) this.A00.get(obj)) != null && (findViewById = view.findViewById(R.id.carousel_media_group)) != null && (reboundViewPager = (ReboundViewPager) findViewById.findViewById(R.id.carousel_viewpager)) != null && (view2 = reboundViewPager.A0F) != null) {
            IgProgressImageView igProgressImageView = (IgProgressImageView) view2.findViewById(R.id.carousel_image);
            IgProgressImageView igProgressImageView2 = (IgProgressImageView) view2.findViewById(R.id.carousel_video_image);
            if (igProgressImageView != null) {
                igImageView = igProgressImageView.getIgImageView();
            } else if (igProgressImageView2 != null) {
                igImageView = igProgressImageView2.getIgImageView();
            } else {
                return;
            }
            int currentDataIndex = reboundViewPager.getCurrentDataIndex();
            1Xj r7 = A02.A0K;
            if (currentDataIndex >= r7.A0o()) {
                0wb.A03("AD_RENDERING_ACTION_PROVIDER", "Carousel view was accessed during update.");
                return;
            }
            StringBuilder sb = new StringBuilder(144);
            AnonymousClass3W1 r6 = (AnonymousClass3W1) r9.A04;
            WeakReference weakReference = r6.A1c;
            if (weakReference != null) {
                r1 = (C240983Nk) weakReference.get();
            } else {
                r1 = null;
            }
            igImageView.A08(sb);
            A02.A02 = igImageView.getMeasuredHeight();
            A02.A03 = igImageView.getMeasuredWidth();
            if (r1 != null) {
                A02.A03 = r1;
            }
            A02.A09 = sb.toString();
            0bb r5 = new 0bb();
            1Xj A1c = r7.A1c(currentDataIndex);
            if (A1c == null) {
                A1c = r7;
            }
            r5.A06("carousel_media_id", A1c.getId());
            r5.A06("carousel_media_type", A1c.BR7().name());
            Long valueOf = Long.valueOf((long) currentDataIndex);
            r5.A05("index_of_card", valueOf);
            r5.A05("number_of_cards", Long.valueOf((long) r7.A0o()));
            String str = r6.A1D;
            Map map = A02.A0F;
            if (map != null) {
                map.put(valueOf, str);
            }
            String str2 = r6.A1F;
            Map map2 = A02.A0G;
            if (map2 != null) {
                map2.put(valueOf, str2);
            }
            r5.A08("cta_secondary_texts", map);
            r5.A08("cta_text_dividers", map2);
            A02.A02 = r5;
        }
    }
}
