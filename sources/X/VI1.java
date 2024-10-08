package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class VI1 {
    public static final void A00(View view, TextView textView, UOL uol, C62320sa r5) {
        int i;
        view.setVisibility(DbW.A01(uol.A02 ? 1 : 0));
        if (!VI0.A00(textView, uol.A00)) {
            r5.invoke();
        }
        int intValue = uol.A01.intValue();
        if (intValue == 0 || intValue == 1) {
            i = R.drawable.story_message_composer_background;
        } else if (intValue == 2) {
            i = R.drawable.story_message_composer_background_shhmode;
        } else if (intValue == 3) {
            i = R.drawable.story_message_composer_background_modernized;
        } else {
            throw new RuntimeException();
        }
        DbU.A11(view.getContext(), view, i);
    }
}
