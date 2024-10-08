package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Ls7  reason: case insensitive filesystem */
public final class C65366Ls7 implements C66536MVq, AnonymousClass2sT {
    public final AnonymousClass3Q2 A00;
    public final String A01;
    public final Context A02;
    public final 1iA A03 = 1iA.A0Q;
    public final HashSet A04 = AnonymousClass7TE.A1F();
    public final boolean A05;

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

    public final 1iA BR7() {
        return this.A03;
    }

    public final int BhS() {
        return this.A00.A03();
    }

    public final Integer BzN() {
        AnonymousClass55U r0;
        AnonymousClass3Q2 r2 = this.A00;
        if (r2.A0n()) {
            return AnonymousClass05K.A00;
        }
        if (r2.A1f == AnonymousClass3QD.CONFIGURED || ((r0 = r2.A6I) != null && r0.A00 == 403)) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0N;
    }

    public final LSB BzP() {
        int i = 2131968933;
        if (this.A05) {
            i = 2131968934;
        }
        return new LSB(i, 0);
    }

    public final Drawable C6t() {
        if (this.A01 == null) {
            return this.A02.getDrawable(R.drawable.grid_camera_icon_small);
        }
        return null;
    }

    public final String C6v() {
        return this.A01;
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        Iterator A1G = AnonymousClass7TE.A1G(this.A04);
        while (A1G.hasNext()) {
            ((AnonymousClass3M8) A1G.next()).A0B(this);
        }
    }

    public C65366Ls7(Context context, AnonymousClass3Q2 r3, boolean z) {
        this.A02 = context;
        this.A00 = r3;
        this.A05 = z;
        String str = r3.A33;
        this.A01 = str == null ? r3.A3K : str;
    }
}
