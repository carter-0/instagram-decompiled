package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.JyD  reason: case insensitive filesystem */
public final class C61161JyD extends AnonymousClass0T0 implements C232262tL {
    public final Context A00;
    public final Drawable A01;
    public final FGF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61161JyD) {
                C61161JyD jyD = (C61161JyD) obj;
                if (!0qQ.A0K(this.A00, jyD.A00) || !0qQ.A0K(this.A02, jyD.A02) || !0qQ.A0K(this.A01, jyD.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A02.A08);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0C(this.A01);
    }

    public C61161JyD(Context context, Drawable drawable, FGF fgf) {
        this.A00 = context;
        this.A02 = fgf;
        this.A01 = drawable;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return 0qQ.A0K(obj, this);
    }
}
