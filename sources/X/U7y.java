package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

public final class U7y extends 06N {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C14191TrW A02;

    public U7y(FrameLayout frameLayout, Fragment fragment, C14191TrW trW) {
        this.A02 = trW;
        this.A01 = fragment;
        this.A00 = frameLayout;
    }

    public final void A01(Bundle bundle, View view, Fragment fragment, 0hq r5) {
        if (fragment == this.A01) {
            r5.A0q(this);
            C14191TrW.A02(view, this.A00);
        }
    }
}
