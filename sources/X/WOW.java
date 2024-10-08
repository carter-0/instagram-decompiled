package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;

public final class WOW implements X3N {
    public final /* synthetic */ UZ7 A00;

    public final void DLt(AudienceGeoLocation audienceGeoLocation) {
        String str;
        UZ7 uz7 = this.A00;
        InputMethodManager A07 = C13991Tnr.A07(uz7.requireContext());
        RecyclerView recyclerView = uz7.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            A07.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
            EditText editText = uz7.A00;
            if (editText == null) {
                str = "searchEditText";
            } else {
                editText.getText().clear();
                U92 u92 = (U92) uz7.A0B.getValue();
                ArrayList A0U = 00k.A0U(u92.A0A().A05);
                A0U.add(audienceGeoLocation);
                U92.A05(u92, A0U);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public WOW(UZ7 uz7) {
        this.A00 = uz7;
    }
}
