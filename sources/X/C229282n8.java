package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2n8  reason: invalid class name and case insensitive filesystem */
public final class C229282n8 implements C229292n9 {
    public final String A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 46));
    public final AnonymousClass0eM A03;

    public final boolean Axa() {
        Object value = this.A01.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }

    public final 1Bm BM2() {
        return (1Bm) this.A02.getValue();
    }

    public final boolean BuY() {
        Object value = this.A03.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }

    public final String getFileName() {
        return this.A00;
    }

    public C229282n8(UserSession userSession, String str) {
        this.A00 = str;
        this.A01 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 45));
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 47));
    }
}
