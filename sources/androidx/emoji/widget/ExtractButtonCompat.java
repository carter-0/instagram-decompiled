package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;

public class ExtractButtonCompat extends Button {
    public final boolean hasWindowFocus() {
        if (!isEnabled() || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ExtractButtonCompat(Context context) {
        super(context, (AttributeSet) null);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
