package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5td  reason: invalid class name and case insensitive filesystem */
public final class C298545td extends AnonymousClass59E {
    public final Object A00;
    public final String A01;
    public final View A02;

    public C298545td(View view, C244063aa r10, Object obj, String str) {
        super(view, r10);
        this.A02 = view;
        this.A00 = obj;
        this.A01 = str;
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_type", "carousel");
        Object obj2 = this.A00;
        boolean z = view instanceof SegmentedProgressBar;
        if (z) {
            SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) view;
            linkedHashMap.put("index_of_card", Integer.valueOf(segmentedProgressBar.A03));
            linkedHashMap.put("number_of_cards", Long.valueOf((long) segmentedProgressBar.A04));
        } else if ((view instanceof ReboundViewPager) && (obj2 instanceof 1Xj)) {
            int A0o = ((1Xj) obj2).A0o();
            linkedHashMap.put("number_of_cards", Long.valueOf((long) A0o));
            linkedHashMap.put("view_rendering_component_type", "NATIVE");
            String str2 = this.A01;
            AnonymousClass59A r1 = AnonymousClass59A.A00;
            Integer A06 = r1.A06(str2);
            if (A06 == null || A06.intValue() >= A0o) {
                0wb.A03("ProductCorrectnessViewpointAction", "Carousel view was accessed during update, failed to get correct carousel media");
                linkedHashMap.put("index_of_card", "Carousel view was accessed during update");
            } else {
                Object A062 = r1.A06(str2);
                linkedHashMap.put("index_of_card", A062 == null ? AnonymousClass000.A00(3632) : A062);
            }
        }
        linkedHashMap.put("is_progress_bar", Boolean.valueOf(z));
        map.putAll(linkedHashMap);
    }
}
