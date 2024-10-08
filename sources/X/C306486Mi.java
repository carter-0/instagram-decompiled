package X;

import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: X.6Mi  reason: invalid class name and case insensitive filesystem */
public abstract class C306486Mi {
    public static Field A00;
    public static boolean A01;

    public static final void A00(TextView textView, float f, boolean z) {
        0qQ.A0B(textView, 0);
        if (Build.VERSION.SDK_INT <= 28) {
            if (A00 == null) {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mShadowRadius");
                    declaredField.setAccessible(true);
                    A00 = declaredField;
                } catch (NoSuchFieldException e) {
                    0KC.A0G("TextShadowUtil", "unable to find shadow radius for text background padding hack", e);
                }
            }
            Field field = A00;
            if (field != null) {
                try {
                    field.set(textView, Float.valueOf(f));
                } catch (IllegalAccessException e2) {
                    0KC.A0G("TextShadowUtil", "unable to apply shadow radius for text background padding hack", e2);
                }
            }
            if (!A01) {
                0wb.A03("stories_text_background_padding_hack", "failed_to_apply_shadow_radius");
                A01 = true;
            }
        } else {
            textView.setShadowLayer(f, 0.0f, 0.0f, 0);
        }
        if (z) {
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = textView.getPaddingTop();
            int i = (int) (f / 2.0f);
            if (paddingTop < i) {
                paddingTop = i;
            }
            int paddingRight = textView.getPaddingRight();
            int paddingBottom = textView.getPaddingBottom();
            if (paddingBottom < i) {
                paddingBottom = i;
            }
            textView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }
}
