package X;

import android.graphics.Rect;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tu0  reason: case insensitive filesystem */
public final class C14323Tu0 {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int[] A03;
    public int[] A04;
    public final C320536sX A05;
    public final FlowingGridLayoutManager A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();

    public C14323Tu0(C320536sX r3, FlowingGridLayoutManager flowingGridLayoutManager, int i) {
        this.A06 = flowingGridLayoutManager;
        this.A05 = r3;
        this.A01 = i;
        this.A02 = 3;
        this.A03 = new int[3];
        this.A04 = new int[3];
    }

    public final Rect A00(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A07;
        if (i < list.size()) {
            return (Rect) list.get(i);
        }
        return null;
    }

    public final void A01(int i) {
        int i2 = this.A00;
        if (i2 == -1) {
            throw new IllegalStateException("calculationStartPosition isn't already before granular notify!");
        } else if (i2 != 0) {
            this.A00 = Math.min(i2, i);
        }
    }
}
