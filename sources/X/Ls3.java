package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashSet;

public final class Ls3 implements C66536MVq {
    public int A00;
    public 1Xj A01;
    public final Handler A02 = new Handler();
    public final LEF A03;
    public final HashSet A04 = AnonymousClass7TE.A1F();
    public final Context A05;

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
        return 1iA.A0a;
    }

    public final int BhS() {
        return this.A00;
    }

    public final Integer BzN() {
        AnonymousClass3Q2 r0;
        LEF lef = this.A03;
        if (lef.A06.get() || (((r0 = lef.A03) != null && r0.A0n()) || this.A00 != 100)) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public final LSB BzP() {
        return new LSB((View.OnClickListener) null, 8, (Long) null, AnonymousClass7TE.A16(02K.A01(this.A05), 2131955160), (String) null, (String) null);
    }

    public final /* synthetic */ Drawable C6t() {
        return null;
    }

    public final String C6v() {
        ImageUrl A1Q = this.A01.A1Q();
        if (A1Q != null) {
            return A1Q.getUrl();
        }
        return null;
    }

    public Ls3(Context context, 1Xj r3, LEF lef) {
        AnonymousClass7TG.A1Q(r3, lef);
        this.A05 = context;
        this.A01 = r3;
        this.A03 = lef;
        new M5T(this).run();
    }
}
