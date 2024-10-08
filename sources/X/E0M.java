package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class E0M extends C240383Kr {
    public final AnonymousClass0eM A00;

    public E0M() {
        C46573DhF dhF = new C46573DhF(this, 25);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 22), 0eO.A02, 23);
        this.A00 = DbS.A0I(new C46573DhF(A002, 24), dhF, new C20613Wvu(2, A002, (Object) null), DbS.A0z(C46731DkK.class));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.E0M, androidx.fragment.app.Fragment, X.0SM, java.lang.Object] */
    public final Dialog A0F(Bundle bundle) {
        E0M.super.A0F(bundle);
        View inflate = DbV.A0E(this).inflate(R.layout.language_locale_menu, (ViewGroup) null);
        C46812Dlo dlo = new C46812Dlo(new C50937FlQ(this));
        ColorFilter A002 = AnonymousClass37O.A00(Dbb.A05(this));
        SearchEditText searchEditText = (SearchEditText) inflate.findViewById(R.id.search);
        AnonymousClass7TG.A10(A002, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A002);
        searchEditText.A0C = new C51004Fmr(this, 6);
        RecyclerView A0F = DbZ.A0F(inflate, R.id.language_locale_list);
        A0F.setAdapter(dlo);
        DbU.A15(requireContext(), A0F, 1, false);
        A0F.A0S = true;
        A0F.setFocusableInTouchMode(true);
        A0F.requestFocus();
        AnonymousClass7TE.A1Z(new C66168MGf((Object) dlo, (Object) this, (AnonymousClass4D7) null, 22), DbW.A0E(this));
        FF8 ff8 = new FF8(requireContext());
        String upperCase = DbU.A0m(this, 2131973043).toUpperCase(AnonymousClass1Q2.A03());
        0qQ.A07(upperCase);
        TextView textView = ff8.A0C;
        textView.getClass();
        textView.setText(upperCase);
        View view = ff8.A06;
        view.getClass();
        view.setVisibility(0);
        ViewGroup viewGroup = ff8.A07;
        viewGroup.getClass();
        viewGroup.addView(inflate);
        viewGroup.setVisibility(0);
        C46659Dig dig = ff8.A0D;
        dig.setCancelable(true);
        dig.setCanceledOnTouchOutside(true);
        C46659Dig A003 = ff8.A00();
        0qQ.A07(A003);
        return A003;
    }

    public final void onActivityCreated(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1374451115);
        E0M.super.onActivityCreated(bundle);
        Window window = A06().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            AnonymousClass0fD.A09(1587719995, A02);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1256983218, A02);
        throw A0y;
    }
}
