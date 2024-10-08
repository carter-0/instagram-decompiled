package X;

import android.content.Context;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public final class F2D {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C331157Pu A02;

    public F2D(Context context, AnonymousClass0iw r2, C331157Pu r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void A00(boolean z) {
        if (!0qQ.A0K(this.A01.getModuleName(), "profile")) {
            C331157Pu r3 = this.A02;
            Context context = this.A00;
            int i = 2131968361;
            if (z) {
                i = 2131953335;
            }
            String A16 = AnonymousClass7TE.A16(context, i);
            BottomSheetFragment bottomSheetFragment = r3.A03;
            BottomSheetFragment.A00(bottomSheetFragment).A0g = A16;
            bottomSheetFragment.A0Q();
            bottomSheetFragment.A0Q();
        }
    }
}
