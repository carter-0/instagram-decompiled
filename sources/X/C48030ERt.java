package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.ERt  reason: case insensitive filesystem */
public final class C48030ERt extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectReadReceiptControlFragment";
    public PR9 A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131973869);
    }

    public final String getModuleName() {
        return "direct_read_receipt_control";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        0qQ.A0C(view2, C66579MXk.A00(24));
        ((EmptyStateView) view2).A0P(C320156rr.LOADING);
        PR9 pr9 = this.A00;
        Context context = getContext();
        if (context != null) {
            str = context.getString(2131971330);
        } else {
            str = null;
        }
        pr9.A0A = str;
        AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 22), DbV.A0J(this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C48030ERt() {
        C46573DhF dhF = new C46573DhF(this, 32);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 29), 0eO.A02, 30);
        this.A02 = DbS.A0I(new C46573DhF(A002, 31), dhF, new C20613Wvu(4, A002, (Object) null), DbS.A0z(C46740DkT.class));
        this.A00 = DbS.A0f(new FQO(this, 28), 2131971329, true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1964439611);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state, false);
        AnonymousClass0fD.A09(1268392461, A022);
        return A0D;
    }
}
