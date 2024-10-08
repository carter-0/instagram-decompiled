package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GTw  reason: case insensitive filesystem */
public final class C52470GTw extends C249383je {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C52470GTw(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        int i6;
        String str;
        int A03 = AnonymousClass0fD.A03(2030390298);
        0qQ.A0B(r7, 0);
        ViewGroup CEd = r7.CEd();
        0qQ.A07(CEd);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        contextualFeedFragment.A1H.onScrolled((RecyclerView) CEd, i4, i5);
        HDB hdb = contextualFeedFragment.A0N;
        if (hdb == null) {
            str = "adapter";
        } else {
            hdb.Crn();
            C233812wV r4 = contextualFeedFragment.A0L;
            if (r4 != null && (i + i2) - 1 >= 0) {
                str = "adapter";
                if (i6 < hdb.getItemCount()) {
                    HDB hdb2 = contextualFeedFragment.A0N;
                    if (hdb2 != null) {
                        1Xj A04 = C231122qu.A04(hdb2.getItem(i6));
                        if (A04 != null) {
                            HDB hdb3 = contextualFeedFragment.A0N;
                            if (hdb3 != null) {
                                int position = hdb3.BQr(A04).getPosition();
                                int i7 = contextualFeedFragment.A00;
                                if (position != i7) {
                                    r4.A0D(position, i7);
                                    r4.A0C(position);
                                    contextualFeedFragment.A00 = position;
                                }
                            }
                        }
                    }
                }
            }
            AnonymousClass0fD.A0A(1944903677, A03);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A0D = AnonymousClass7TG.A0D(r3, -879562182);
        this.A00.A1H.onScrollStateChanged(r3, i);
        AnonymousClass0fD.A0A(-947290518, A0D);
    }
}
