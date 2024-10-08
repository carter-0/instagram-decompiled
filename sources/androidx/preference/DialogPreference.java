package androidx.preference;

import X.C13991Tnr;
import X.C17166VKv;
import X.C18666VwO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;

public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17166VKv.A02, i, 0);
        String A0c = C13991Tnr.A0c(obtainStyledAttributes, 9, 0);
        this.A03 = A0c;
        if (A0c == null) {
            this.A03 = this.A0C;
        }
        this.A02 = C13991Tnr.A0c(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = C13991Tnr.A0c(obtainStyledAttributes, 11, 3);
        this.A04 = C13991Tnr.A0c(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18666VwO.A00(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
