package X;

import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;

public abstract class GTX {
    public static final ComposeView A00(AnonymousClass4DH r1, 0sL r2) {
        return A01(r1, r2, false, false);
    }

    public static final ComposeView A01(AnonymousClass4DH r4, 0sL r5, boolean z, boolean z2) {
        ComposeView composeView = new ComposeView(DbT.A06(r4, r5, 5), (AttributeSet) null, 0);
        composeView.setViewCompositionStrategy(GTZ.A00);
        composeView.setContent(AnonymousClass5PI.A03(new GTY(r4, r5, z2, z), 123176915));
        return composeView;
    }
}
