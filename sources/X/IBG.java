package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class IBG implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C242813Wa A01;
    public final /* synthetic */ String A02;

    public IBG(FragmentActivity fragmentActivity, C242813Wa r2, String str) {
        this.A00 = fragmentActivity;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(1701933770);
        if (!(this.A00 == null || (str = this.A02) == null)) {
            this.A01.DV6(str);
        }
        AnonymousClass0fD.A0C(645515966, A05);
    }
}
