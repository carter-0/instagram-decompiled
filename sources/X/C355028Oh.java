package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.8Oh  reason: invalid class name and case insensitive filesystem */
public final class C355028Oh {
    public final /* synthetic */ AnonymousClass8BA A00;

    public C355028Oh(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final C279284yO A00() {
        return (C279284yO) this.A00.A0w.A08.A00;
    }

    public final boolean A01() {
        AnonymousClass8BA r1 = this.A00;
        boolean z = r1.A0w.A08.A00 instanceof AnonymousClass80O;
        AnonymousClass82Y r2 = r1.A14.A01;
        Integer num = r2.A0B;
        0qQ.A07(num);
        if (num == AnonymousClass05K.A0C) {
            return false;
        }
        if (r2.A0X == null || !z) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        ArrayList A17 = ((AnonymousClass8ME) this.A00.A1g.get()).A17();
        0qQ.A0B(A17, 0);
        if (AnonymousClass497.A00(AnonymousClass3WT.JOIN_CHAT, A17) != null) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        AnonymousClass8BA r4 = this.A00;
        if (AnonymousClass8BA.A0M(r4)) {
            UserSession userSession = r4.A0v;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36321550580327946L)) {
                return true;
            }
        }
        C314676if r0 = r4.A1a;
        if (r0 == null || ((C359318cb) r0.get()).A0u.A04 == null) {
            return false;
        }
        return true;
    }
}
