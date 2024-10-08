package X;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.LjZ  reason: case insensitive filesystem */
public final class C64873LjZ implements C252213ok {
    public MTA A00;
    public boolean A01;
    public final Activity A02;
    public final GestureDetector A03;
    public final ViewGroup A04;
    public final AnonymousClass3E6 A05;
    public final A96 A06;
    public final LGX A07;
    public final C62320sa A08;
    public final C62320sa A09;
    public final C340307l3 A0A;
    public final UserSession A0B;
    public final MUS A0C;
    public final LPE A0D;

    public C64873LjZ(Activity activity, ViewGroup viewGroup, C340307l3 r6, UserSession userSession, A96 a96, MUS mus, LGX lgx, LPE lpe, C62320sa r12, C62320sa r13) {
        DbW.A1N(viewGroup, 2, lpe);
        0qQ.A0B(userSession, 8);
        this.A02 = activity;
        this.A04 = viewGroup;
        this.A0A = r6;
        this.A07 = lgx;
        this.A0D = lpe;
        this.A0C = mus;
        this.A06 = a96;
        this.A0B = userSession;
        this.A09 = r12;
        this.A08 = r13;
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A05 = A012;
        this.A03 = new GestureDetector(activity, new C60799JrU(this, 1));
        A012.A9Y(this);
    }

    public final void DMr(int i, boolean z) {
        this.A07.A02(i);
        MTA mta = this.A00;
        if (mta != null) {
            mta.DMr(i, z);
        }
    }
}
