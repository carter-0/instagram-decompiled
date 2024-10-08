package X;

import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

public final class UAn extends C249403jg {
    public final /* synthetic */ C307786Rm A00;

    public UAn(C307786Rm r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(548185627);
        if (i == 1) {
            C13989Tnp.A1A(recyclerView, (InputMethodManager) this.A00.A00.getSystemService("input_method"));
        }
        AnonymousClass0fD.A0A(-267474578, A03);
    }
}
