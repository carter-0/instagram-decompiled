package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.JeD  reason: case insensitive filesystem */
public final class C60045JeD extends View implements MUU {
    public final Drawable A00;
    public final Drawable A01;
    public final C59796JYp A02;

    public final void D3Y(C59796JYp jYp, Integer num) {
        Drawable drawable;
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            drawable = this.A00;
        } else if (num == AnonymousClass05K.A0C) {
            drawable = this.A01;
        } else {
            return;
        }
        setBackground(drawable);
    }

    public C60045JeD(Context context, Drawable drawable, Drawable drawable2, C59796JYp jYp) {
        super(context);
        setTag(jYp);
        this.A02 = jYp;
        jYp.A08.add(this);
        this.A00 = drawable;
        this.A01 = drawable2;
        Integer num = jYp.A05;
        if (!(num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01)) {
            if (num == AnonymousClass05K.A0C) {
                drawable = drawable2;
            } else {
                return;
            }
        }
        setBackground(drawable);
    }

    public final void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        parent.getClass();
        int measuredWidth = ((View) parent).getMeasuredWidth();
        setMeasuredDimension((int) Math.max((((long) measuredWidth) * this.A02.A03) / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, 0), View.MeasureSpec.getSize(i2));
    }

    public final void D3S(C59796JYp jYp, long j) {
        requestLayout();
    }
}
