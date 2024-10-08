package X;

import androidx.fragment.app.Fragment;
import com.instagram.business.promote.model.PromoteState;

public interface XA9 {
    PromoteState Bhj();

    static PromoteState A00(Fragment fragment) {
        XA9 requireActivity = fragment.requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteState.Delegate");
        return requireActivity.Bhj();
    }
}
