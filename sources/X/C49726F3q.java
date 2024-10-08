package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.F3q  reason: case insensitive filesystem */
public final class C49726F3q {
    public G9A A00;
    public final boolean A01;
    public final Context A02;
    public final C49684F1u A03;
    public final FoaUserSession A04;

    public final void A01(C51892G6h g6h, C49719F3f f3f, Object obj, int i) {
        G9A g9a = this.A00;
        if (g9a != null) {
            WE9 we9 = new WE9(this.A02, this, g6h, f3f, this.A04, obj);
            g9a.E0j(we9, new C14578Tyi(we9, i, false));
            return;
        }
        throw AnonymousClass7TE.A0z("Must be attached to a fragment to open!");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.ExE, java.lang.Object] */
    public final void A02(C49719F3f f3f, Object obj, 0sP r15) {
        C49719F3f f3f2 = f3f;
        0qQ.A0B(f3f, 0);
        ? obj2 = new Object();
        obj2.A01 = null;
        obj2.A00 = null;
        r15.invoke(obj2);
        G9A g9a = this.A00;
        if (g9a != null) {
            C49684F1u f1u = this.A03;
            Context context = this.A02;
            C51892G6h A002 = f1u.A00(context, f3f, obj);
            A002.E3m();
            WE9 we9 = new WE9(context, this, A002, f3f2, this.A04, obj);
            g9a.E5D(we9, new C46619Dhz(obj2.A00, we9, obj2.A01, 0, false));
            return;
        }
        throw AnonymousClass7TE.A0z("Must be attached to a fragment to push!");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Evb, java.lang.Object] */
    public final void A04(0sP r4) {
        C49435Evb evb;
        Integer num = null;
        if (r4 != null) {
            ? obj = new Object();
            obj.A00 = null;
            r4.invoke(obj);
            evb = obj;
        } else {
            evb = null;
        }
        G9A g9a = this.A00;
        if (g9a != null) {
            if (evb != null) {
                num = evb.A00;
            }
            g9a.E30(new C16399UuH(num));
            return;
        }
        throw AnonymousClass7TE.A0z("Must be attached to a fragment to pop!");
    }

    public final Fragment A00() {
        Fragment fragment = this.A00;
        if (fragment != null) {
            return fragment;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass000.A00(2387));
    }

    public final void A03(C62320sa r5) {
        C51321FsF fsF;
        G9A g9a = this.A00;
        if (g9a != null) {
            if (r5 != null) {
                fsF = new C51321FsF(r5);
            } else {
                fsF = null;
            }
            g9a.APb(new C48059EUd((Integer) null), fsF);
            return;
        }
        throw AnonymousClass7TE.A0z("Must be attached to a fragment to dismiss!");
    }

    public C49726F3q(Context context, FoaUserSession foaUserSession, boolean z) {
        this.A02 = context;
        this.A04 = foaUserSession;
        this.A01 = z;
        C49684F1u f1u = (C49684F1u) ((IgMetaSessionImpl) foaUserSession).A00.A01(C49684F1u.class, C51777G1m.A00);
        0qQ.A07(f1u);
        this.A03 = f1u;
    }
}
