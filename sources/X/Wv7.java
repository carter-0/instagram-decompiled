package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

public abstract class Wv7 extends UFT {
    public final List A00;
    public final AnonymousClass08u A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Wv7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            this.A00 = new ArrayList();
            C18954WEh wEh = new C18954WEh(this, 3);
            this.A01 = wEh;
            super.setOnPageChangeListener(wEh);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0J(AnonymousClass08u r2) {
        this.A00.add(r2);
    }

    public void setOnPageChangeListener(AnonymousClass08u r3) {
        throw new UnsupportedOperationException("Unsupported function. Use addOnPageChangeListener instead");
    }
}
