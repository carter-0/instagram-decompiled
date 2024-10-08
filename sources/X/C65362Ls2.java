package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* renamed from: X.Ls2  reason: case insensitive filesystem */
public final class C65362Ls2 implements C66536MVq {
    public int A00;
    public final HashSet A01 = AnonymousClass7TE.A1F();
    public final Context A02;
    public final AnonymousClass3Q2 A03;
    public final String A04;

    public C65362Ls2(Context context, AnonymousClass3Q2 r3) {
        0qQ.A0B(r3, 2);
        this.A02 = context;
        this.A03 = r3;
        this.A04 = r3.A33;
    }

    public final void Dfh() {
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A01.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A01.remove(r2);
    }

    public final 1iA BR7() {
        return 1iA.A0Q;
    }

    public final int BhS() {
        return this.A00;
    }

    public final Integer BzN() {
        if (this.A00 < 100) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public final LSB BzP() {
        return new LSB((View.OnClickListener) null, 8, C51971G9r.A0m(), AnonymousClass7TE.A16(02K.A01(this.A02), 2131969903), (String) null, (String) null);
    }

    public final Drawable C6t() {
        return null;
    }

    public final String C6v() {
        return this.A04;
    }
}
