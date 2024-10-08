package X;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceInterest;

public final class WOU implements X3M {
    public final /* synthetic */ UZV A00;

    public final void DLu(AudienceInterest audienceInterest) {
        Editable text;
        UZV uzv = this.A00;
        Context context = uzv.getContext();
        if (context != null) {
            InputMethodManager A07 = C13991Tnr.A07(context);
            RecyclerView recyclerView = uzv.A02;
            IBinder iBinder = null;
            if (recyclerView != null) {
                iBinder = recyclerView.getWindowToken();
            }
            if (!A07.hideSoftInputFromWindow(iBinder, 0)) {
                UAD uad = uzv.A06;
                if (uad == null) {
                    0qQ.A0F("selectedAndSuggestedInterestsAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                uad.A01(audienceInterest);
                EditText editText = uzv.A00;
                if (!(editText == null || (text = editText.getText()) == null)) {
                    text.clear();
                }
                UZV.A01(uzv);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public WOU(UZV uzv) {
        this.A00 = uzv;
    }
}
