package X;

import android.database.DataSetObserver;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3TD  reason: invalid class name */
public final class AnonymousClass3TD extends DataSetObserver {
    public final /* synthetic */ ReboundViewPager A00;

    public AnonymousClass3TD(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
    }

    public final void onChanged() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("ReboundViewPagerDataSetObserver.onChanged", -334719782);
        }
        try {
            ReboundViewPager.A06(reboundViewPager, true, false);
            reboundViewPager.A0D = reboundViewPager.A08;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1164592996);
            }
        }
    }

    public final void onInvalidated() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("ReboundViewPagerDataSetObserver.onInvalidated", -447724086);
        }
        try {
            ReboundViewPager.A06(reboundViewPager, true, false);
            reboundViewPager.A0D = reboundViewPager.A08;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(38888443);
            }
        }
    }

    public AnonymousClass3TD() {
    }
}
