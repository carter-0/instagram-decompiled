package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.ViR  reason: case insensitive filesystem */
public final class C17936ViR {
    public final C18778W1d A00;
    public final C323426xT A01;
    public final 05G A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final UserSession A08;
    public final Product A09;

    public final Object A00(String str, AnonymousClass4D7 r9, int i) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C241503Pl.A01;
        C241503Pl r6 = new C241503Pl(1Ey.A02(r9));
        AnonymousClass7TF.A1O(this.A04, true);
        UserSession userSession = this.A08;
        Product product = this.A09;
        String str2 = product.A0H;
        String A0q = C13989Tnp.A0q(product);
        0qQ.A0A(A0q);
        C19594WcJ wcJ = new C19594WcJ(1, this, r6);
        1OC A002 = C18262VoT.A00(userSession, String.valueOf(i), str2, A0q, str);
        A002.A00 = new C15620Ufm(wcJ, userSession, str2, 3);
        1ES.A03(A002);
        return r6.A00();
    }

    public C17936ViR(UserSession userSession, C18778W1d w1d, C323426xT r5, Product product) {
        C51974G9v.A1P(userSession, product, r5, w1d);
        this.A08 = userSession;
        this.A09 = product;
        this.A01 = r5;
        this.A00 = w1d;
        02z A012 = 106.A01(Boolean.valueOf(r5.A08(product)));
        this.A03 = A012;
        this.A06 = 10b.A03(A012);
        Boolean A0u = AnonymousClass7TE.A0u();
        02z r0 = new 02z(A0u);
        this.A02 = r0;
        this.A05 = 10b.A03(r0);
        02z r02 = new 02z(A0u);
        this.A04 = r02;
        this.A07 = 10b.A03(r02);
    }
}
