package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public abstract class LJC {
    public static final int A00(Context context, int i) {
        if (i == AnonymousClass7TE.A0A(context)) {
            return R.color.chat_sticker_button_divider_color;
        }
        return R.color.countdown_sticker_title_text_color;
    }

    public static C363208jL A01(Context context, Drawable.Callback callback, int i) {
        C363208jL r0 = new C363208jL(context, (float) context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), A00(context, i), 80);
        r0.setCallback(callback);
        return r0;
    }
}
