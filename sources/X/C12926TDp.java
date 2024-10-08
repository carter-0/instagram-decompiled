package X;

import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.TDp  reason: case insensitive filesystem */
public final class C12926TDp implements Runnable {
    public final /* synthetic */ BottomSheetFragment A00;

    public C12926TDp(BottomSheetFragment bottomSheetFragment) {
        this.A00 = bottomSheetFragment;
    }

    public final void run() {
        AnonymousClass37D bottomSheetNavigator = this.A00.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            C7218Pzn pzn = ((AnonymousClass37F) bottomSheetNavigator).A0D;
            if (pzn != null) {
                int A0F = pzn.A0F();
                double A002 = (double) C7218Pzn.A00(pzn);
                float min = (float) Math.min(Math.max((double) A0F, A002), (double) C7218Pzn.A02(pzn));
                if (((float) A0F) != min) {
                    pzn.A0V.A06((double) min);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
