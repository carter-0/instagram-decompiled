package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IaN  reason: case insensitive filesystem */
public final class C57417IaN implements C320576sb {
    public int A00;
    public View A01;
    public ViewPager A02;
    public TabLayout A03;
    public HashMap A04 = AnonymousClass7TE.A1E();
    public boolean A05;
    public final C52954Gg7 A06;

    public C57417IaN(0hq r2, int i) {
        0qQ.A0B(r2, 1);
        this.A06 = new C52954Gg7(r2, i);
    }

    public final boolean EtM() {
        return false;
    }

    public static final void A00(C57417IaN iaN) {
        TabLayout tabLayout = iaN.A03;
        if (tabLayout == null) {
            return;
        }
        if (iaN.A01 != null) {
            int size = iaN.A06.A01.size();
            View view = iaN.A01;
            if (size < 2) {
                0qQ.A0A(view);
                view.setVisibility(8);
                tabLayout.setVisibility(8);
                return;
            }
            0qQ.A0A(view);
            view.setVisibility(0);
            tabLayout.setVisibility(0);
            C324806zv.A00(tabLayout, new PRS(1, tabLayout, iaN), AnonymousClass7TE.A0B(tabLayout.getResources()), 0nA.A09(AnonymousClass7TE.A0S(tabLayout)));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A02() {
        C52954Gg7 gg7 = this.A06;
        int size = gg7.A01.size();
        for (int i = 0; i < size; i++) {
            C59622JQq jQq = (C59622JQq) gg7.A00.get(i);
            if (jQq != null) {
                if (this.A05) {
                    jQq.ASi();
                } else {
                    jQq.ATa();
                }
            }
        }
    }

    public final boolean A03() {
        C52954Gg7 gg7 = this.A06;
        List list = gg7.A01;
        if (list.size() != 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C59622JQq jQq = (C59622JQq) gg7.A00.get(i);
                if (jQq != null && jQq.CJz()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04() {
        C52954Gg7 gg7 = this.A06;
        int size = gg7.A01.size();
        for (int i = 0; i < size; i++) {
            C59622JQq jQq = (C59622JQq) gg7.A00.get(i);
            if (jQq != null && !jQq.Bri().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean CVD() {
        return this.A05;
    }

    public final ArrayList A01() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C52954Gg7 gg7 = this.A06;
        int size = gg7.A01.size();
        for (int i = 0; i < size; i++) {
            C59622JQq jQq = (C59622JQq) gg7.A00.get(i);
            if (jQq != null && !jQq.Bri().isEmpty()) {
                A1C.addAll(jQq.Bri());
            }
        }
        return A1C;
    }
}
