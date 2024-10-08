package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Ls5  reason: case insensitive filesystem */
public final class C65364Ls5 implements C66536MVq {
    public int A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final Drawable A02;
    public final LSB A03;
    public final HashSet A04 = AnonymousClass7TE.A1F();

    public final String C6v() {
        return null;
    }

    public final void Dfh() {
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A04.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A04.remove(r2);
    }

    public final void A00(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3M8) it.next()).A0B(this);
        }
    }

    public final 1iA BR7() {
        return 1iA.A0F;
    }

    public final int BhS() {
        return this.A00;
    }

    public final Integer BzN() {
        return this.A01;
    }

    public final LSB BzP() {
        return this.A03;
    }

    public final Drawable C6t() {
        return this.A02;
    }

    public C65364Ls5(Context context, Drawable drawable) {
        this.A02 = drawable;
        this.A03 = new LSB(AnonymousClass7TE.A16(context, 2131975232), AnonymousClass7TE.A16(context, 2131975231));
    }
}
