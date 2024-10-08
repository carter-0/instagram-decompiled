package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Wcc  reason: case insensitive filesystem */
public final class C19613Wcc implements C20988X8e, C322776wO {
    public C320156rr A00 = C320156rr.LOADING;
    public final FragmentActivity A01;
    public final C18000Vjc A02;
    public final 0sP A03;
    public final 0sP A04;
    public final UserSession A05;
    public final C15347Uay A06;
    public final String A07;
    public final Map A08 = new LinkedHashMap();

    public C19613Wcc(FragmentActivity fragmentActivity, UserSession userSession, C18000Vjc vjc, C15347Uay uay, String str, 0sP r7, 0sP r8) {
        C51973G9u.A0r(2, userSession, str, vjc);
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A07 = str;
        this.A02 = vjc;
        this.A06 = uay;
        this.A04 = r7;
        this.A03 = r8;
    }

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final C3253572b Afm() {
        Map map = this.A08;
        C320156rr r1 = this.A00;
        Object obj = map.get(r1);
        if (obj == null) {
            obj = new C3253572b();
            map.put(r1, obj);
        }
        return (C3253572b) obj;
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void DBy() {
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A05;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A002 = C46548Dgp.A00(userSession, "shopping_featured_products_seller_management", "instagram_shopping_featured_product_seller_management");
        A002.A0O = C273654mx.A00(51);
        A002.A0c = true;
        A002.A0L = this.A07;
        C46474Dfc.A03(A0Q, userSession, A022, A002);
    }

    public final void Epa() {
        Map map = this.A08;
        C320156rr r2 = C320156rr.LOADING;
        C3253572b r1 = new C3253572b();
        FragmentActivity fragmentActivity = this.A01;
        C13991Tnr.A0s(fragmentActivity, r1);
        r1.A02 = R.drawable.loadmore_icon_refresh_compound;
        map.put(r2, r1);
        C320156rr r7 = C320156rr.EMPTY;
        C3253572b r6 = new C3253572b();
        C13991Tnr.A0s(fragmentActivity, r6);
        r6.A02 = R.drawable.ig_illustrations_illo_add_photos_videos_refresh;
        r6.A01 = 0;
        r6.A0D = fragmentActivity.getString(2131962252);
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131964884);
        r6.A07 = AnonymousClass7AV.A00(DbT.A09(AnonymousClass000.A00(298)), A16, DbW.A0h(fragmentActivity, A16, 2131962251));
        r6.A0C = fragmentActivity.getString(2131962250);
        r6.A06 = this;
        map.put(r7, r6);
        C320156rr r22 = C320156rr.ERROR;
        C3253572b r12 = new C3253572b();
        C13991Tnr.A0s(fragmentActivity, r12);
        r12.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r12, this, 52);
        map.put(r22, r12);
    }

    public final void FKG() {
        C320156rr r0;
        C320156rr r2 = this.A00;
        C16508Uw5 uw5 = this.A02.A00;
        if (uw5 == C16508Uw5.LOADING) {
            r0 = C320156rr.LOADING;
        } else if (uw5 == C16508Uw5.FAILED) {
            r0 = C320156rr.ERROR;
        } else {
            r0 = C320156rr.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r2) {
            C15486Udb.A00(this.A06.A07);
        }
    }
}
