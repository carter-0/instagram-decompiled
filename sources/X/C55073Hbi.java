package X;

import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Hbi  reason: case insensitive filesystem */
public abstract class C55073Hbi {
    public static final ComposeView A00(AnonymousClass4DH r7, AnonymousClass0iw r8, String str, C62320sa r10, boolean z, boolean z2, boolean z3) {
        ComposeView A01 = GTX.A01(r7, AnonymousClass5PI.A03(new C59124J7g(r8, str, r10, z3, z), 1842693592), z2, false);
        A01.setTag("opal_floating_switch_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 85);
        int A02 = DbS.A02(r7.requireContext(), 12);
        layoutParams.bottomMargin = A02;
        layoutParams.rightMargin = A02;
        A01.setLayoutParams(layoutParams);
        return A01;
    }
}
