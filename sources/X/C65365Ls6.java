package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: X.Ls6  reason: case insensitive filesystem */
public final class C65365Ls6 implements C66536MVq {
    public int A00;
    public Integer A01 = AnonymousClass05K.A00;
    public Drawable A02;
    public UserSession A03;
    public final int A04;
    public final Timer A05;
    public final Context A06;
    public final HashSet A07 = AnonymousClass7TE.A1F();

    public final String C6v() {
        return null;
    }

    public final void Dfh() {
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A07.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A07.remove(r2);
        this.A05.cancel();
    }

    public final void A00() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A07);
        while (A1G.hasNext()) {
            ((AnonymousClass3M8) AnonymousClass7TF.A0a(A1G)).A0B(this);
        }
    }

    public final 1iA BR7() {
        return 1iA.A05;
    }

    public final int BhS() {
        return this.A00;
    }

    public final Integer BzN() {
        return this.A01;
    }

    public final LSB BzP() {
        Context context = this.A06;
        return new LSB((View.OnClickListener) null, 8, (Long) null, AnonymousClass7TE.A16(context, 2131952721), context.getString(2131952720), (String) null);
    }

    public final Drawable C6t() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return this.A06.getDrawable(R.drawable.instagram_gen_ai_home_pano_outline_24);
        }
        return drawable;
    }

    public C65365Ls6(Drawable drawable, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = drawable;
        this.A04 = DbS.A04(0Tu.A05, userSession, 36605550997804285L);
        Timer timer = new Timer();
        this.A05 = timer;
        this.A06 = C51966G9m.A0P(this.A03);
        this.A03 = this.A03;
        this.A02 = this.A02;
        timer.schedule(new MCz(this), 1000, 1000);
    }
}
