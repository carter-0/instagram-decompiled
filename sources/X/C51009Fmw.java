package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.Fmw  reason: case insensitive filesystem */
public final class C51009Fmw implements G6W {
    public final /* synthetic */ C50423FbW A00;

    public final void D8H(View view) {
        DirectShareTarget directShareTarget;
        0qQ.A0B(view, 0);
        C50423FbW fbW = this.A00;
        SearchWithDeleteEditText searchWithDeleteEditText = fbW.A07;
        searchWithDeleteEditText.requestFocus();
        0nA.A0Q(searchWithDeleteEditText);
        Object tag = view.getTag();
        if ((tag instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) tag) != null) {
            ((C49916FEq) fbW.A06.A01).A05.Dbp(directShareTarget);
            fbW.A09.remove(directShareTarget.A09());
            C50423FbW.A01(fbW);
        }
    }

    public C51009Fmw(C50423FbW fbW) {
        this.A00 = fbW;
    }
}
