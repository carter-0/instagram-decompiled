package X;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;

/* renamed from: X.VlH  reason: case insensitive filesystem */
public abstract class C18087VlH {
    public static final int[] A01(RectF rectF, C292075iM r5, 0sL r6, int i) {
        SegmentFinder graphemeClusterSegmentFinder;
        Layout layout = r5.A09;
        CharSequence text = layout.getText();
        if (i == 1) {
            graphemeClusterSegmentFinder = C16754V4n.A00(new C18931WDj(r5.A06(), text));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(text, r5.A0A);
        }
        return layout.getRangeForRect(rectF, graphemeClusterSegmentFinder, new W7Y(r6));
    }
}
