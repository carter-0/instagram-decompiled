package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class GDW {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final GDV A03;
    public final FragmentActivity A04;

    public GDW(FragmentActivity fragmentActivity, GDV gdv) {
        this.A03 = gdv;
        this.A04 = fragmentActivity;
        this.A02 = fragmentActivity.findViewById(R.id.action_bar_title);
    }
}
