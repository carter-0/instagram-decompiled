package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7nv  reason: invalid class name and case insensitive filesystem */
public final class C342027nv {
    public final int A00 = 0Ap.A00();
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final boolean A00() {
        return ((Boolean) this.A07.getValue()).booleanValue();
    }

    public C342027nv(Context context, UserSession userSession) {
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9L3(this, 41));
        this.A04 = AnonymousClass0eN.A00(r2, new C377419Lt(9, userSession, this));
        this.A05 = AnonymousClass0eN.A00(r2, new C377419Lt(10, userSession, this));
        this.A07 = AnonymousClass0eN.A00(r2, new C377419Lt(6, context, this));
        this.A02 = AnonymousClass0eN.A00(r2, new C377419Lt(7, userSession, this));
        this.A03 = AnonymousClass0eN.A00(r2, new C377419Lt(8, userSession, this));
        this.A06 = AnonymousClass0eN.A00(r2, new C377419Lt(11, userSession, this));
    }
}
