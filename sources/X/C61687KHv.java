package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;

/* renamed from: X.KHv  reason: case insensitive filesystem */
public final class C61687KHv extends AnonymousClass3NK implements C252203oj, View.OnFocusChangeListener, AnonymousClass8Z4 {
    public final 2cs A00;
    public final C64287LYn A01;
    public final SearchEditText A02;
    public final View A03;
    public final View A04;
    public final View A05;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public final void A00() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText.isFocused()) {
            searchEditText.clearFocus();
            0nA.A0N(searchEditText);
        }
        C64287LYn lYn = this.A01;
        LZF lzf = lYn.A06;
        lzf.A01 = false;
        lzf.A03.EEH(lzf);
        C315596kB.A08(new View[]{lzf.A02}, true);
        LZF.A00(lzf);
        C294975nL.A04((C295005nO) null, new View[]{lYn.A08, lYn.A0B}, true);
        this.A00.A04();
        searchEditText.setHint(2131972797);
        DbS.A1C(searchEditText);
    }

    public final boolean Dqe(View view) {
        if (view == this.A03) {
            A00();
            return true;
        } else if (view != this.A04) {
            return false;
        } else {
            DbS.A1C(this.A02);
            return true;
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C64287LYn lYn = this.A01;
            LZF lzf = lYn.A06;
            lzf.A01 = true;
            lzf.A03.A9Y(lzf);
            K9K k9k = lzf.A05;
            ArrayList A022 = lzf.A04.A02();
            ArrayList arrayList = k9k.A0D;
            arrayList.clear();
            arrayList.addAll(A022);
            K9K.A01(k9k);
            View[] viewArr = {lzf.A02};
            C71392co r0 = C315596kB.A02;
            C294975nL.A04((C295005nO) null, viewArr, true);
            LZF.A00(lzf);
            lYn.A0S.A04();
            C315596kB.A08(new View[]{lYn.A08, lYn.A0B}, true);
            lYn.A06.A01("");
            this.A00.A03();
        }
    }

    public C61687KHv(View view, C64287LYn lYn) {
        View A0F = DbY.A0F(view, R.id.asset_search_bar_stub);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        Context context = view.getContext();
        C363208jL r1 = new C363208jL(context, 0nA.A00(context, 0.5f), R.color.fds_white_alpha80, 80);
        r1.A00(dimensionPixelSize, 0, dimensionPixelSize, 0);
        view.requireViewById(R.id.search_bar_container).setBackground(r1);
        View requireViewById = view.requireViewById(R.id.back_button);
        this.A03 = requireViewById;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(requireViewById);
        A0m.A04 = this;
        A0m.A07 = true;
        A0m.A0C = true;
        A0m.A00();
        View requireViewById2 = view.requireViewById(R.id.clear_button);
        this.A04 = requireViewById2;
        JTQ.A1H(this, AnonymousClass7TE.A0m(requireViewById2));
        this.A05 = view.requireViewById(R.id.search_icon);
        this.A01 = lYn;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = true;
        A0J.A0A(this);
        this.A00 = A0J;
        SearchEditText searchEditText = (SearchEditText) A0F.requireViewById(R.id.search_bar);
        this.A02 = searchEditText;
        searchEditText.setAllowTextSelection(true);
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
    }

    public final void DmE(2cs r7) {
        float A032 = JTO.A03(r7);
        View view = this.A03;
        view.setAlpha(A032);
        int i = 0;
        int i2 = 4;
        if (view.getAlpha() > 0.0f) {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.A05;
        view2.setAlpha(1.0f - A032);
        if (view2.getAlpha() <= 0.0f) {
            i = 4;
        }
        view2.setVisibility(i);
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        this.A01.A06.A01(charSequence2);
        boolean isEmpty = charSequence2.isEmpty();
        View[] viewArr = {this.A04};
        if (isEmpty) {
            C315596kB.A08(viewArr, true);
            return;
        }
        C71392co r0 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, viewArr, true);
    }
}
