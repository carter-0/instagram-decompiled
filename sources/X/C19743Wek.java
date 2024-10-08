package X;

import android.widget.AbsListView;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.Wek  reason: case insensitive filesystem */
public abstract class C19743Wek implements C229122ms, C229132mt, AbsListView.OnScrollListener {
    public Integer A00 = AnonymousClass05K.A0C;
    public String A01 = "";
    public String A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final X6y A06;
    public final C14190TrU A07;
    public final G9d A08;
    public final C14221Ts1 A09;
    public final AnonymousClass7g1 A0A;

    public final void CgO() {
        A03(false);
    }

    public static void A00(Object obj) {
        C15334Uaj uaj = (C15334Uaj) obj;
        C15334Uaj.A00(uaj).A05.A01();
        C15334Uaj.A00(uaj).A01("");
    }

    public final void A01() {
        this.A0A.clear();
        this.A02 = null;
    }

    public final void A02(ProductSource productSource) {
        String str;
        if (this instanceof C16230Uqt) {
            C16230Uqt uqt = (C16230Uqt) this;
            if (productSource != null) {
                C16659Uyv uyv = productSource.A00;
                if (uyv != C16659Uyv.BRAND || productSource.A01 != null) {
                    ProductSource productSource2 = uqt.A00;
                    if (!(productSource2 == null || (str = productSource2.A01) == null || (uyv == productSource2.A00 && 2Ob.A00(productSource.A01, str)))) {
                        uqt.A01();
                    }
                    uqt.A00 = productSource;
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A03(boolean z) {
        this.A03 = z;
        if (z) {
            this.A02 = null;
            AnonymousClass7g1 r2 = this.A0A;
            if (r2.BiX(this.A01).A01 == AnonymousClass05K.A0C) {
                X6y x6y = this.A06;
                List list = r2.BiX(this.A01).A06;
                list.getClass();
                x6y.DMY(this.A01, list, true, this.A04);
                return;
            }
            this.A09.A06(this.A01);
            return;
        }
        this.A09.A03(this.A01);
    }

    public final void ACw() {
        if (this.A00 == AnonymousClass05K.A0C && this.A04 && this.A02 != null) {
            A03(false);
        }
    }

    public final boolean CJz() {
        return !this.A06.isEmpty();
    }

    public final boolean CKB() {
        return this.A04;
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A01);
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A00);
    }

    public C19743Wek(UserSession userSession, X6y x6y) {
        C19551Wbb wbb = new C19551Wbb(this, 2);
        this.A08 = wbb;
        this.A05 = userSession;
        this.A06 = x6y;
        AnonymousClass7g1 r7 = new AnonymousClass7g1();
        this.A0A = r7;
        this.A09 = C14225Ts5.A01(userSession, (AnonymousClass4D6) null, (C337247fx) null, wbb, r7, AnonymousClass05K.A00, false);
        this.A07 = new C14190TrU(userSession, this, AnonymousClass05K.A01, 5);
    }

    public final boolean CWV() {
        if (isLoading()) {
            return !this.A06.isEmpty();
        }
        return true;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-1497324974);
        this.A07.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(98569853, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(501763814);
        this.A07.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-589133773, A032);
    }
}
