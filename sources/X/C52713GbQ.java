package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;

/* renamed from: X.GbQ  reason: case insensitive filesystem */
public final class C52713GbQ implements AnonymousClass2WT {
    public static final C52713GbQ A00 = new C52713GbQ();

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        try {
            EditText editText = new EditText(context, (AttributeSet) null);
            editText.setBackgroundResource(17170445);
            return editText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !00l.A0d(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.fallback_text_input_view, (ViewGroup) null, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputView");
            return inflate;
        }
    }
}
