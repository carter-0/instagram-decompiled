package X;

import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.GYb  reason: case insensitive filesystem */
public final class C52576GYb {
    public static final AtomicInteger A09 = new AtomicInteger();
    public int A00 = 0;
    public int A01 = -1;
    public int A02 = -1;
    public final 2V1 A03;
    public final GYX A04;
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final boolean A06;
    public final int A07;
    public final C52584GYj A08;

    public static void A00(C52576GYb gYb) {
        C52576GYb gYb2 = gYb;
        if (gYb.A02 != -1 && gYb.A01 != -1) {
            int i = gYb2.A00;
            int i2 = gYb2.A07;
            ArrayList arrayList = gYb2.A05;
            int min = Math.min(arrayList.size() - 1, i + i2);
            for (int max = Math.max(0, i - i2); max <= min; max++) {
                GYZ gyz = (GYZ) arrayList.get(max);
                ComponentTree A002 = gyz.A00();
                C52576GYb gYb3 = gyz.A04;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gYb3.A02, SN3.MAX_SIGNED_POWER_OF_TWO);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gYb3.A01, SN3.MAX_SIGNED_POWER_OF_TWO);
                if (gyz.A01) {
                    A002.A0N(gyz.A00.A00, makeMeasureSpec, makeMeasureSpec2);
                    gyz.A01 = false;
                } else {
                    ComponentTree.A06((C251263mp) null, A002, (AnonymousClass2T3) null, (2VJ) null, (String) null, makeMeasureSpec, makeMeasureSpec2, 3, true, false);
                }
            }
        }
    }

    public final void A02(List list) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        AnonymousClass2VL.A00();
        ComponentsSystrace.A02("LithoViewPagerAdapter.insertItemsAt");
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            GYZ gyz = new GYZ(this);
            C338347ho r3 = (C338347ho) list.get(i);
            boolean z = gyz.A01;
            boolean z2 = false;
            if (r3 != gyz.A00) {
                z2 = true;
            }
            gyz.A01 = z | z2;
            gyz.A00 = r3;
            arrayList.add(size + i, gyz);
        }
        A00(this);
        this.A04.Cs4();
        ComponentsSystrace.A01();
    }

    public C52576GYb(2V1 r2, boolean z) {
        this.A03 = r2;
        this.A04 = new GYX(this);
        this.A08 = new C52584GYj(this);
        this.A07 = 4;
        this.A06 = z;
    }

    public final void A01(ReboundViewPager reboundViewPager, int i) {
        AnonymousClass2VL.A00();
        reboundViewPager.A0O(this.A04, (float) i);
        reboundViewPager.A0P(this.A08);
        reboundViewPager.A0L = new C52577GYc(this);
    }
}
