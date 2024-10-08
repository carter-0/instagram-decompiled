package X;

import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* renamed from: X.Ge0  reason: case insensitive filesystem */
public final class C52867Ge0 extends EditText {
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    public final int getAutofillType() {
        return super.getAutofillType();
    }

    public final void invalidate() {
        AnonymousClass0fD.A0A(-803244546, AnonymousClass0fD.A03(-550975839));
    }
}
