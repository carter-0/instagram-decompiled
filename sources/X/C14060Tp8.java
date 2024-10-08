package X;

import com.instagram.ui.gesture.GestureManagerFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tp8  reason: case insensitive filesystem */
public final class C14060Tp8 {
    public C317956o7 A00;
    public boolean A01 = true;
    public final GestureManagerFrameLayout A02;
    public final List A03;
    public final List A04;

    public C14060Tp8(GestureManagerFrameLayout gestureManagerFrameLayout, List list, List list2) {
        this.A02 = gestureManagerFrameLayout;
        this.A03 = new ArrayList(list);
        this.A04 = new ArrayList(list2);
        gestureManagerFrameLayout.A00 = this;
    }
}
