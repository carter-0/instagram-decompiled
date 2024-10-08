package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.6kC  reason: invalid class name and case insensitive filesystem */
public final class C315606kC extends C232922uf {
    public final /* synthetic */ C315596kB A00;

    public C315606kC(C315596kB r1) {
        this.A00 = r1;
    }

    public final void DmB(2cs r4) {
        C315596kB r2 = this.A00;
        int i = r2.A04;
        if (i != -1) {
            r2.A0a.setVisibility(i);
        }
    }

    public final void DmC(2cs r5) {
        C315596kB r3 = this.A00;
        View view = r3.A0a;
        view.setTag(R.id.view_animator, (Object) null);
        int i = r3.A03;
        if (i != -1) {
            view.setVisibility(i);
        }
        C295005nO r0 = r3.A05;
        if (r0 != null) {
            r0.onFinish();
        }
    }

    public final void DmE(2cs r5) {
        this.A00.A0L((float) r5.A09.A00);
    }
}
