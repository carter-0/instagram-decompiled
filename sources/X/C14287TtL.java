package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.TtL  reason: case insensitive filesystem */
public final class C14287TtL extends C14284TtI {
    public static final Property A00 = new C14638Tzk(3);
    public static final Property A01 = new C14638Tzk(2);
    public static final Property A02 = new C14638Tzk(5);
    public static final Property A03 = new C14638Tzk(4);
    public static final Property A04 = new C14638Tzk(1);
    public static final String[] A05 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    public static void A01(C14286TtK ttK) {
        View view = ttK.A00;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = ttK.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", view.getParent());
        }
    }
}
