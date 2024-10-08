package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Kcl  reason: case insensitive filesystem */
public final class C62251Kcl extends K8D implements C273494mf, G77 {
    public static final String __redex_internal_original_name = "IgLiveHostInviteFragment";
    public final int A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04;

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        ((C62303Kdb) this.A03.getValue()).A07(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) this.A01.getValue();
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = this;
        }
        ((C62303Kdb) this.A03.getValue()).A07("");
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onSearchCleared(String str) {
        ((C62303Kdb) this.A03.getValue()).A07("");
    }

    public C62251Kcl() {
        String A16 = C51968G9o.A16(this);
        0qQ.A07(A16);
        this.A04 = A16;
        C66293MMc mMc = new C66293MMc(this, 5);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(this, 2), 0eO.A02, 3);
        this.A03 = DbS.A0I(new C66293MMc(A012, 4), mMc, C66304MMn.A01(A012, (Object) null, 21), DbS.A0z(C62303Kdb.class));
        this.A00 = R.layout.iglive_cohost_invite_top;
        this.A01 = C66293MMc.A00(this, 1);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() == 0 || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }
}
