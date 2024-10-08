package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3fA  reason: invalid class name and case insensitive filesystem */
public final class C246743fA implements C246753fB {
    public final Fragment A00;
    public final UserSession A01;
    public final C246733f9 A02;
    public final AnonymousClass2lU A03;
    public final C231332rR A04;
    public final AnonymousClass2xS A05;

    public C246743fA(Fragment fragment, UserSession userSession, C246733f9 r4, AnonymousClass2lU r5, C231332rR r6, AnonymousClass2xS r7) {
        0qQ.A0B(r4, 5);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void DKC(C240983Nk r8, 1Xj r9, AnonymousClass3W1 r10) {
        String str;
        0qQ.A0B(r9, 1);
        0qQ.A0B(r10, 2);
        r10.A0I(r8);
        AnonymousClass2xS r2 = this.A05;
        if (r2.A0B == null) {
            AnonymousClass2xX r1 = r2.A0F;
            if ((!r1.A0Q || ((!r1.A09 || !r1.A06) && !AnonymousClass2xX.A07(r1))) && r8.A02 != null && r9.CeS()) {
                r1.A0D.sendEmptyMessage(0);
            }
        }
        AnonymousClass2lU r3 = this.A03;
        if (r3 != null && r3.A0A(this.A00.getModuleName())) {
            if (r8.A02 == null && r8.A04 == null && r8.A03 == null) {
                r3.A02(r9);
                return;
            }
            String id = r9.getId();
            boolean A06 = 182.A06(0Tu.A05, this.A01, 36322774645483932L);
            if (r9.CeS() && id != null && !r3.A06.contains(id) && A06) {
                1Xj A002 = r2.A00();
                if (r9.getId() != null) {
                    String id2 = r9.getId();
                    if (A002 != null) {
                        str = A002.getId();
                    } else {
                        str = null;
                    }
                    if (0qQ.A0K(id2, str)) {
                        return;
                    }
                }
            }
            r3.A03(r9);
        }
    }

    public final void DPp(1Xj r2, IgProgressImageView igProgressImageView) {
        0qQ.A0B(r2, 0);
    }
}
