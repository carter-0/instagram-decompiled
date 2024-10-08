package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.6iF  reason: invalid class name and case insensitive filesystem */
public final class C314426iF implements View.OnKeyListener {
    public boolean A00 = true;
    public boolean A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C273434mZ A04;
    public final C310016aI A05;
    public final C314226hr A06;
    public final C273384mU A07;
    public final C311506cn A08;
    public final C313426gQ A09;

    public C314426iF(AnonymousClass4DH r3, UserSession userSession, C273434mZ r5, C310016aI r6, C314226hr r7, C273384mU r8, C313426gQ r9, C311506cn r10) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r7, 3);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r9, 5);
        0qQ.A0B(r6, 6);
        this.A02 = r3;
        this.A03 = userSession;
        this.A06 = r7;
        this.A08 = r10;
        this.A09 = r9;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
    }

    public final void A01(C68137N2b n2b, C255773uh r13, C250973mM r14) {
        User user = r13.A0i;
        if (user != null) {
            DirectShareTarget A002 = AnonymousClass6UD.A00(user, false);
            1Xj r4 = r13.A0b;
            if (r4 != null) {
                String id = user.getId();
                String str = r13.A0k;
                0qQ.A07(str);
                C68165N3f n3f = new C68165N3f(r4, A002, id, str, "", "reel", r14.A0B);
                n3f.A00 = n2b.A01;
                n3f.A03 = false;
                1as.A04.A0D(this.A03, n3f.A00(), "reel", "");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(keyEvent, 2);
        return this.A09.onKey(view, i, keyEvent);
    }

    public final C316006kx A00() {
        Object obj;
        View Atm = this.A07.Atm();
        if (Atm != null) {
            obj = Atm.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C316006kx) {
            return (C316006kx) obj;
        }
        return null;
    }
}
