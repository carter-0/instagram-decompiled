package X;

import android.view.View;
import com.instagram.android.R;

public final class Fq5 implements Runnable {
    public final /* synthetic */ C328227Dz A00;

    public Fq5(C328227Dz r1) {
        this.A00 = r1;
    }

    public final void run() {
        View findViewById = this.A00.A04.findViewById(R.id.message_comments_pill_container);
        if (findViewById != null) {
            C49686F1w A002 = C48781Ek4.A00(findViewById);
            A002.A01.A05 = new C71392co(80.0d, 10.0d);
            A002.A00(5.0f);
        }
    }
}
