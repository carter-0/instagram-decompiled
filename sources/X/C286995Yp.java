package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Yp  reason: invalid class name and case insensitive filesystem */
public final class C286995Yp implements C287005Yq {
    public final Context A00;
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();

    public final Drawable AQx(Context context, int i) {
        Drawable newDrawable;
        0qQ.A0B(context, 0);
        if (context != this.A00) {
            return context.getDrawable(i);
        }
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        Drawable.ConstantState constantState = (Drawable.ConstantState) map.get(valueOf);
        if (constantState != null && (newDrawable = constantState.newDrawable(context.getResources())) != null) {
            return newDrawable;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return drawable;
        }
        map.put(valueOf, drawable.getConstantState());
        return drawable;
    }

    public final String Eye(Context context, int i) {
        0qQ.A0B(context, 0);
        if (context == this.A00) {
            Map map = this.A02;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = context.getString(i);
                0qQ.A07(obj);
                map.put(valueOf, obj);
            }
            return (String) obj;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        return string;
    }

    public C286995Yp(Context context) {
        this.A00 = context;
    }
}
