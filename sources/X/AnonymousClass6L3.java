package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6L3  reason: invalid class name */
public final class AnonymousClass6L3 extends AnonymousClass59E {
    public final String A00;
    public final View A01;

    public AnonymousClass6L3(View view, C244063aa r12, String str) {
        super(view, r12);
        C300635xX r5;
        this.A01 = view;
        this.A00 = str;
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_type", "text");
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        Drawable drawable = imageView.getDrawable();
        if ((drawable instanceof C300635xX) && (r5 = (C300635xX) drawable) != null) {
            linkedHashMap.put("text_string", r5.A0B);
            int i = r5.A02;
            linkedHashMap.put("background_color", 0nH.A0F(i));
            linkedHashMap.put(AnonymousClass000.A00(4518), Float.valueOf(((float) Color.alpha(i)) / 255.0f));
            int[] iArr = r5.A0C;
            if (iArr.length != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(002.A0R("#", Integer.toHexString(iArr[0])));
                sb.append(',');
                sb.append(002.A0R("#", Integer.toHexString(iArr[1])));
                sb.append(']');
                linkedHashMap.put("text_color", sb.toString());
            }
            Paint paint = r5.A0O;
            float textSize = paint.getTextSize();
            0qQ.A0A(context);
            linkedHashMap.put("font_size", Long.valueOf((long) 0nA.A01(context, textSize)));
            Typeface typeface = paint.getTypeface();
            if (typeface != null) {
                linkedHashMap.put("font_style", C244083ac.A01(Integer.valueOf(typeface.getStyle())));
            }
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            linkedHashMap.put("font_line_height", Double.valueOf((double) 0nA.A01(context, fontMetrics.descent - fontMetrics.ascent)));
            linkedHashMap.put("number_lines_showed", 1L);
            linkedHashMap.put("view_rendering_component_type", "NATIVE");
        }
        Integer A06 = AnonymousClass59A.A00.A06(this.A00);
        if (A06 != null) {
            linkedHashMap.put("index_of_card", A06);
        }
        map.putAll(linkedHashMap);
    }
}
