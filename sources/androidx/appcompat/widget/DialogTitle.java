package androidx.appcompat.widget;

import X.AnonymousClass0fD;
import X.AnonymousClass2Z3;
import X.AnonymousClass3Tj;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

public class DialogTitle extends AnonymousClass3Tj {
    public final void onMeasure(int i, int i2) {
        int lineCount;
        int A06 = AnonymousClass0fD.A06(-1298431475);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass2Z3.A0N, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
        AnonymousClass0fD.A0D(-927110089, A06);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context) {
        super(context, (AttributeSet) null);
    }
}
