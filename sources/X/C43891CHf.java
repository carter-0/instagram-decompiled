package X;

import com.instagram.user.model.User;
import java.util.Collection;

/* renamed from: X.CHf  reason: case insensitive filesystem */
public final class C43891CHf extends C48262Ebh {
    public final EM5 A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(DJT.A00);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C51797G2g(this, 48));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C51797G2g(this, 49));
    public final AnonymousClass0eM A04 = C41847B3o.A1G(this, 0);
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(DJU.A00);
    public final AnonymousClass0eM A06 = C41847B3o.A1G(this, 1);
    public final AnonymousClass0eM A07 = C41847B3o.A1G(this, 2);
    public final AnonymousClass0eM A08 = C41847B3o.A1G(this, 3);
    public final AnonymousClass0eM A09 = C41847B3o.A1G(this, 4);
    public final AnonymousClass0eM A0A = C41847B3o.A1G(this, 5);

    public C43891CHf(EM5 em5) {
        0qQ.A0B(em5, 1);
        this.A00 = em5;
    }

    public final int A00() {
        return AnonymousClass7TE.A0M(this.A04.getValue());
    }

    public final C49345Eu9 A01() {
        return (C49345Eu9) this.A07.getValue();
    }

    public final C47361Dvv A02() {
        return (C47361Dvv) this.A09.getValue();
    }

    public final User A03() {
        Object value = this.A0A.getValue();
        0qQ.A07(value);
        return (User) value;
    }

    public final String A04() {
        return (String) this.A02.getValue();
    }

    public final String A05() {
        return (String) this.A03.getValue();
    }

    public final String A06() {
        return (String) this.A05.getValue();
    }

    public final String A07() {
        return (String) this.A06.getValue();
    }

    public final String A08() {
        return (String) this.A08.getValue();
    }

    public final Collection A09() {
        return (Collection) this.A01.getValue();
    }

    public final boolean A0A() {
        if (this.A00.A00 == 4) {
            return true;
        }
        return false;
    }
}
