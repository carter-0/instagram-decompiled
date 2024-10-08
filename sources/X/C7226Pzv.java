package X;

import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.Pzv  reason: case insensitive filesystem */
public final class C7226Pzv implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomSheetFragment A00;

    public C7226Pzv(BottomSheetFragment bottomSheetFragment) {
        this.A00 = bottomSheetFragment;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AnonymousClass37D bottomSheetNavigator;
        C7218Pzn pzn;
        if (i8 - i6 != i4 - i2 && (bottomSheetNavigator = this.A00.A04.getBottomSheetNavigator()) != null && (pzn = ((AnonymousClass37F) bottomSheetNavigator).A0D) != null) {
            pzn.A0I(false);
        }
    }
}
