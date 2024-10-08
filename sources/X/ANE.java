package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class ANE implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;

    public ANE(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1470379300);
        FragmentActivity fragmentActivity = this.A00;
        fragmentActivity.setResult(-1);
        fragmentActivity.onBackPressed();
        AnonymousClass0fD.A0C(-1488182376, A05);
    }
}
