package X;

import com.instagram.api.schemas.GraphGuardianContent;
import java.util.List;

/* renamed from: X.Y0v  reason: case insensitive filesystem */
public final class C22367Y0v implements G8I {
    public final CTT A00;

    public C22367Y0v(CTT ctt) {
        0qQ.A0B(ctt, 1);
        this.A00 = ctt;
    }

    public final int BCX() {
        return 0;
    }

    public final long AjP() {
        return this.A00.A01.A01;
    }

    public final G9S B8C() {
        return C21055XCg.A0G(this.A00.A01, C43688C5k.class, 1931829463);
    }

    public final List BAC() {
        return this.A00.A00.BAC();
    }

    public final boolean BUB() {
        return this.A00.A01.getCoercedBooleanField(4, "more_groups_available");
    }

    public final List BW1() {
        List CD6 = this.A00.A00.CD6();
        if (CD6 == null) {
            return 0sn.A00;
        }
        return CD6;
    }

    public final boolean BuE() {
        return this.A00.A01.getCoercedBooleanField(7, AnonymousClass000.A00(188));
    }

    public final GraphGuardianContent By9() {
        return this.A00.A00.By9();
    }

    public final List C2q() {
        List C2q = this.A00.A00.C2q();
        if (C2q == null) {
            return 0sn.A00;
        }
        return C2q;
    }

    public final boolean CCU() {
        return this.A00.A01.getCoercedBooleanField(11, "use_clickable_see_more");
    }

    public final boolean CPt() {
        return this.A00.A01.CPt();
    }

    public final String getNextMaxId() {
        return this.A00.A00.getNextMaxId();
    }

    public final List Bey() {
        return 0sn.A00;
    }
}
