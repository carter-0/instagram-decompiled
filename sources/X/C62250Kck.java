package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Kck  reason: case insensitive filesystem */
public final class C62250Kck extends K8D implements C273494mf {
    public static final String __redex_internal_original_name = "IgLiveHostRequestsToJoinFragment";
    public final int A00;
    public final int A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C62305Kdd) this.A03.getValue()).A07();
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C62250Kck() {
        String A16 = C51968G9o.A16(this);
        0qQ.A07(A16);
        this.A04 = A16;
        this.A01 = R.layout.iglive_cohost_request_top;
        this.A00 = R.layout.iglive_cohost_request_empty;
        C66293MMc mMc = new C66293MMc(this, 21);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(this, 18), 0eO.A02, 19);
        this.A03 = DbS.A0I(new C66293MMc(A012, 20), mMc, C66304MMn.A01(A012, (Object) null, 26), DbS.A0z(C62305Kdd.class));
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() == 0 || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1938133868);
        super.onDestroy();
        ((C62305Kdd) this.A03.getValue()).A08();
        AnonymousClass0fD.A09(200604443, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1706524933);
        C62250Kck.super.onPause();
        ((C62305Kdd) this.A03.getValue()).A08();
        AnonymousClass0fD.A09(-1112468269, A022);
    }
}
