package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.List;

public final class WOV implements X3N {
    public final /* synthetic */ C15284UZo A00;

    public final void DLt(AudienceGeoLocation audienceGeoLocation) {
        String str;
        W2W w2w = C17149VKb.A00;
        C15284UZo uZo = this.A00;
        boolean A03 = W2W.A03(audienceGeoLocation, ((PromoteData) AnonymousClass7TE.A14(uZo.A0E)).A0o.A05);
        InputMethodManager A07 = C13991Tnr.A07(uZo.requireContext());
        RecyclerView recyclerView = uZo.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            A07.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
            C14799U9t u9t = uZo.A05;
            if (u9t == null) {
                str = "selectedLocationAdapter";
            } else {
                PendingLocation pendingLocation = u9t.A01.A0o;
                List list = pendingLocation.A05;
                list.add(audienceGeoLocation);
                pendingLocation.A05 = list;
                PromoteState.A01(u9t.A02, AnonymousClass05K.A1I);
                u9t.notifyDataSetChanged();
                EditText editText = uZo.A00;
                if (editText == null) {
                    str = "searchEditText";
                } else {
                    editText.getText().clear();
                    if (A03) {
                        List list2 = uZo.A06;
                        if (list2 != null) {
                            list2.add(audienceGeoLocation);
                        }
                        C59689JTv.A09(uZo.requireContext(), DbV.A0z(uZo, audienceGeoLocation.A05, 2131952234));
                        C15284UZo.A00(uZo);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public WOV(C15284UZo uZo) {
        this.A00 = uZo;
    }
}
