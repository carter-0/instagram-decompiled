package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.7Pw  reason: invalid class name and case insensitive filesystem */
public final class C331177Pw implements C249443jn {
    public final /* synthetic */ BottomSheetFragment A00;

    public C331177Pw(BottomSheetFragment bottomSheetFragment) {
        this.A00 = bottomSheetFragment;
    }

    public final AnonymousClass37D getBottomSheetNavigator() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            return AnonymousClass37D.A00.A01(activity);
        }
        return null;
    }
}
