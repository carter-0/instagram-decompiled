package X;

import android.content.Context;
import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;

/* renamed from: X.59E  reason: invalid class name */
public abstract class AnonymousClass59E {
    public final View A00;
    public final Map A01;

    public AnonymousClass59E(View view, C244063aa r10) {
        this.A00 = view;
        this.A01 = 0Yt.A07(new 0eP[]{new 0eP("view_tracking_node_name", r10)});
        int[] iArr = new int[2];
        View view2 = this.A00;
        view2.getLocationOnScreen(iArr);
        Map map = this.A01;
        Context context = view2.getContext();
        0qQ.A07(context);
        boolean z = false;
        map.put("x_pos", Double.valueOf((double) 0nA.A01(context, (float) iArr[0])));
        map.put("y_pos", Double.valueOf((double) 0nA.A01(context, (float) iArr[1])));
        map.put(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf((double) 0nA.A01(context, (float) view2.getWidth())));
        map.put(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf((double) 0nA.A01(context, (float) view2.getHeight())));
        map.put("is_tappable", Boolean.valueOf((view2.isClickable() || view2.isLongClickable() || view2.hasOnClickListeners()) ? true : z));
    }
}
