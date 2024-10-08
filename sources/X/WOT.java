package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceInterest;

public final class WOT implements X3M {
    public final /* synthetic */ UZW A00;

    public final void DLu(AudienceInterest audienceInterest) {
        String str;
        UZW uzw = this.A00;
        Context context = uzw.getContext();
        if (context != null) {
            InputMethodManager A07 = C13991Tnr.A07(context);
            RecyclerView recyclerView = uzw.A02;
            if (recyclerView == null) {
                str = "interestTypeaheadRecyclerView";
            } else if (!A07.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0)) {
                UAI uai = uzw.A06;
                if (uai == null) {
                    str = "selectedAndSuggestedInterestsAdapter";
                } else {
                    uai.A02(audienceInterest);
                    EditText editText = uzw.A00;
                    if (editText == null) {
                        str = "searchEditText";
                    } else {
                        editText.getText().clear();
                        UZW.A01(uzw);
                        return;
                    }
                }
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public WOT(UZW uzw) {
        this.A00 = uzw;
    }
}
