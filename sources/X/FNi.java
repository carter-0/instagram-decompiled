package X;

import android.view.View;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class FNi implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C46825Dm1 A01;
    public final /* synthetic */ String A02;

    public FNi(C46825Dm1 dm1, String str, int i) {
        this.A01 = dm1;
        this.A02 = str;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-733739434);
        C46825Dm1 dm1 = this.A01;
        C49601EzK ezK = (C49601EzK) dm1.A01;
        SearchEditText searchEditText = ezK.A03;
        String str = this.A02;
        searchEditText.setText(str);
        searchEditText.setSelection(str.length());
        AnonymousClass7TH.A0R(ezK.A00);
        0nA.A0Q(searchEditText);
        int i = this.A00;
        C49886FBm A06 = 1Q0.A1X.A02((0lg) dm1.A02).A06(EXD.SAC, C48156EZy.A0E.A00);
        A06.A03("username_position", i);
        A06.A02();
        AnonymousClass0fD.A0C(527197948, A05);
    }
}
