package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class H7I extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C14819UAy A01;
    public final UserSession A02;
    public final XC8 A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A00;
        XC8 xc8 = this.A03;
        C51974G9v.A1M(userSession, r3, xc8);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53141GjD(DbT.A0D(LayoutInflater.from(A0S), viewGroup, R.layout.layout_product_pivots, false), r3, userSession, xc8);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        int dimensionPixelSize;
        IOY ioy = (IOY) r8;
        C53141GjD gjD = (C53141GjD) r9;
        AnonymousClass7TG.A1N(ioy, gjD);
        C14819UAy uAy = this.A01;
        boolean A1Y = C51970G9q.A1Y(uAy);
        View view = gjD.itemView;
        0qQ.A06(view);
        C53391GnO gnO = ioy.A00;
        if (gnO.A07) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        }
        view.setPadding(A1Y ? 1 : 0, A1Y, A1Y, dimensionPixelSize);
        0sP r1 = ioy.A01.A01;
        View view2 = gjD.itemView;
        0qQ.A06(view2);
        r1.invoke(view2);
        uAy.A00(gjD.A03, ioy.A02);
        TextView textView = gjD.A02;
        Resources resources = textView.getResources();
        boolean z = gnO.A08;
        int i = R.dimen.abc_text_size_menu_header_material;
        if (z) {
            i = R.dimen.account_group_management_row_text_size;
        }
        textView.setTextSize(A1Y, (float) resources.getDimensionPixelSize(i));
        C56078HsR hsR = (C56078HsR) gnO.A04;
        if (hsR != null) {
            textView.setText(C56259HvT.A00(resources, hsR));
        }
        String str = gnO.A06;
        if (str != null) {
            textView.setText(str);
        }
        if (hsR == null && str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(A1Y);
        }
        C56078HsR hsR2 = (C56078HsR) gnO.A02;
        TextView textView2 = gjD.A01;
        if (hsR2 != null) {
            Resources resources2 = textView2.getResources();
            int i2 = R.dimen.abc_text_size_menu_header_material;
            if (z) {
                i2 = R.dimen.account_group_management_row_text_size;
            }
            textView2.setTextSize(A1Y, (float) resources2.getDimensionPixelSize(i2));
            String str2 = gnO.A05;
            if (str2 == null) {
                str2 = C56259HvT.A00(resources2, hsR2);
            }
            textView2.setText(str2);
            ID1.A01(textView2, 6, ioy);
            textView2.setVisibility(A1Y);
        } else {
            textView2.setVisibility(8);
        }
        Number number = (Number) gnO.A01;
        if (number != null) {
            int intValue = number.intValue();
            View view3 = gjD.A00;
            view3.setBackgroundResource(2Yu.A0H(view3.getContext(), intValue));
        }
        AnonymousClass2t9 r2 = gjD.A04;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01((List) gnO.A03);
        r2.A05(viewModelListUpdate);
        r2.notifyDataSetChanged();
    }

    public final Class modelClass() {
        return IOY.class;
    }

    public H7I(AnonymousClass0iw r1, C14819UAy uAy, UserSession userSession, XC8 xc8) {
        AnonymousClass7TG.A1P(userSession, xc8);
        this.A02 = userSession;
        this.A00 = r1;
        this.A03 = xc8;
        this.A01 = uAy;
    }
}
