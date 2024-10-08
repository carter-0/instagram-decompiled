package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public abstract class LHC {
    public static final void A01(IgdsBottomButtonLayout igdsBottomButtonLayout, CharSequence charSequence) {
        if (igdsBottomButtonLayout.A06()) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        igdsBottomButtonLayout.setPrimaryActionText(charSequence);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener((View.OnClickListener) null);
    }

    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, C331157Pu r6) {
        AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
        if (A0i != null) {
            AnonymousClass37F r2 = (AnonymousClass37F) A0i;
            if (r2.A0g) {
                r2.A0H = new C65751Lz5(0, fragmentActivity, fragment, r6);
                A0i.A0B();
                return;
            }
            r6.A02(fragmentActivity, fragment);
        }
    }
}
