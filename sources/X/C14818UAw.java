package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.UAw  reason: case insensitive filesystem */
public final class C14818UAw extends C249403jg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5GJ A01;
    public final /* synthetic */ AnonymousClass2xS A02;
    public final /* synthetic */ C254053rr A03;

    public C14818UAw(UserSession userSession, AnonymousClass5GJ r2, AnonymousClass2xS r3, C254053rr r4) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        1Xj r8;
        AnonymousClass3W1 BQq;
        int A032 = AnonymousClass0fD.A03(738768608);
        C252553pI r6 = recyclerView.A0D;
        r6.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r6;
        AnonymousClass5GJ r4 = this.A01;
        r4.A05 = linearLayoutManager.A1M();
        int i3 = r4.A01;
        int i4 = r4.A04;
        int i5 = r4.A00;
        int i6 = r4.A03;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        int A1c = linearLayoutManager.A1c();
        int A1d = linearLayoutManager.A1d();
        if (!(i3 == A1a && i4 == A1b && i5 == A1c && i6 == A1d)) {
            UserSession userSession = this.A00;
            C254053rr r9 = this.A03;
            AnonymousClass2xS r7 = this.A02;
            int i7 = r4.A02;
            int A002 = C293275kS.A00(userSession, r9, A1a, A1b, A1c, A1d);
            if (i7 >= 0) {
                if (i7 != A002) {
                    r7.getClass();
                    r7.A0C(C273654mx.A00(299));
                }
                C2365934i r0 = r9.A08.A0A;
                r0.getClass();
                Object Bkf = r0.Bkf(A002);
                Bkf.getClass();
                C255773uh A09 = ((Reel) Bkf).A09(userSession);
                A09.getClass();
                r8 = A09.A0b;
                r4.A01 = A1a;
                r4.A04 = A1b;
                r4.A00 = A1c;
                r4.A03 = A1d;
                r4.A02 = A002;
                r4.A06 = r8;
                if (!(A002 < 0 || A002 == i7 || (BQq = r9.BQq()) == null || r8 == null)) {
                    r7.getClass();
                    r7.A09(r8, r9, BQq, new C263414Lx(), BQq.A31);
                }
            }
            if (A002 < 0) {
                r8 = null;
                r4.A01 = A1a;
                r4.A04 = A1b;
                r4.A00 = A1c;
                r4.A03 = A1d;
                r4.A02 = A002;
                r4.A06 = r8;
                r7.getClass();
                r7.A09(r8, r9, BQq, new C263414Lx(), BQq.A31);
            }
            C2365934i r02 = r9.A08.A0A;
            r02.getClass();
            Object Bkf2 = r02.Bkf(A002);
            Bkf2.getClass();
            C255773uh A092 = ((Reel) Bkf2).A09(userSession);
            A092.getClass();
            r8 = A092.A0b;
            r4.A01 = A1a;
            r4.A04 = A1b;
            r4.A00 = A1c;
            r4.A03 = A1d;
            r4.A02 = A002;
            r4.A06 = r8;
            r7.getClass();
            r7.A09(r8, r9, BQq, new C263414Lx(), BQq.A31);
        }
        AnonymousClass0fD.A0A(-112416820, A032);
    }
}
