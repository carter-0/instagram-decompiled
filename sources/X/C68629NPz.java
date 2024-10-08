package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NPz  reason: case insensitive filesystem */
public final class C68629NPz extends C232232tF {
    public final Context A00;
    public final UserSession A01;
    public final C56023HrV A02;

    public C68629NPz(Context context, UserSession userSession, C56023HrV hrV) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = hrV;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67981My6(DbU.A09(layoutInflater, viewGroup, R.layout.layout_meta_ai_hcm_sources_list_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        String str;
        N61 n61 = (N61) r5;
        C67981My6 my6 = (C67981My6) r6;
        AnonymousClass7TG.A1N(n61, my6);
        String A0g = 002.A0g(String.valueOf(n61.A00), ". ", n61.A01);
        0qQ.A07(A0g);
        my6.A01.setText(A0g);
        IgTextView igTextView = my6.A02;
        String host = 0cp.A03(n61.A02).getHost();
        if (host != null) {
            str = new 11S("^www\\.").A01(host, "");
        } else {
            str = null;
        }
        igTextView.setText(str);
        C71409Ok8.A01(my6.A00, 5, this, n61);
    }

    public final Class modelClass() {
        return N61.class;
    }
}
