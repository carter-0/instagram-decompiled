package X;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class LMX {
    public 2dZ A00;
    public final View.OnClickListener A01 = LY6.A00(this, 4);
    public final AppCompatActivity A02;

    public static final void A00(LMX lmx) {
        2dZ r1;
        AnonymousClass4DS r2;
        FragmentActivity fragmentActivity = lmx.A02;
        AnonymousClass4DS A0P = fragmentActivity.getSupportFragmentManager().A0P(R.id.layout_container_main);
        if (A0P instanceof AnonymousClass4DS) {
            AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
            if (A0i != null && !((AnonymousClass37F) A0i).A0g) {
                r1 = lmx.A00;
                if (r1 != null) {
                    r2 = A0P;
                }
                0qQ.A0F("actionBarService");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        boolean z = A0P instanceof C249453jo;
        r1 = lmx.A00;
        if (r1 != null) {
            if (z) {
                r1.A0P.setVisibility(8);
                return;
            }
            r2 = null;
        }
        0qQ.A0F("actionBarService");
        throw AnonymousClass00P.createAndThrow();
        r1.A0X(r2);
    }

    public LMX(AppCompatActivity appCompatActivity) {
        this.A02 = appCompatActivity;
    }
}
