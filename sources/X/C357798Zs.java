package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.8Zs  reason: invalid class name and case insensitive filesystem */
public final class C357798Zs extends ArrayList<Integer> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return super.contains(obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof Integer)) {
            return super.remove(obj);
        }
        return false;
    }

    public C357798Zs(Context context) {
        addAll(0sr.A1P(new Integer[]{Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background)), Integer.valueOf(context.getColor(R.color.black)), Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink))), Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_gradient_purple))), Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange))), Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_green))), Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue))), -1711276033}));
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
