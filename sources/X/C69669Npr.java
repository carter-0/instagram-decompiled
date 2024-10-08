package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.Npr  reason: case insensitive filesystem */
public abstract class C69669Npr {
    public int A00;
    public String A01;
    public String A02;

    public final AnonymousClass87G A00(Context context) {
        Drawable drawable;
        AnonymousClass8YE r3;
        Drawable drawable2;
        C68502NKv nKv = (C68502NKv) this;
        if (nKv instanceof NI0) {
            0qQ.A0B(context, 0);
            AnonymousClass87I r2 = AnonymousClass87I.EMPTY_AVATAR_BACKGROUND;
            int i = nKv.A00;
            if (i != 0) {
                drawable2 = context.getDrawable(i);
            } else {
                drawable2 = null;
            }
            r3 = new AnonymousClass8YE(drawable2, r2, nKv.A02);
            r3.A03 = nKv.A01;
        } else {
            0qQ.A0B(context, 0);
            AnonymousClass87I r22 = AnonymousClass87I.AVATAR_BACKGROUND;
            int i2 = nKv.A00;
            if (i2 != 0) {
                drawable = context.getDrawable(i2);
            } else {
                drawable = null;
            }
            r3 = new AnonymousClass8YE(drawable, r22, nKv.A02);
            r3.A03 = nKv.A01;
            r3.A00 = nKv.A00;
        }
        return new AnonymousClass87G(r3);
    }
}
