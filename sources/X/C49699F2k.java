package X;

import android.os.Handler;
import com.instagram.android.R;
import java.util.AbstractMap;

/* renamed from: X.F2k  reason: case insensitive filesystem */
public final class C49699F2k {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C49576Eyl A04;
    public final Runnable A05;
    public final boolean A06;

    public final void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        C49576Eyl eyl = this.A04;
        C307786Rm r2 = (C307786Rm) eyl.A03.get();
        if (r2 != null) {
            ((AbstractMap) r2.A00(R.id.bk_context_key_timers)).remove(eyl.A02);
        }
    }

    public C49699F2k(C49576Eyl eyl, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A00 = false;
        this.A01 = true;
        this.A04 = eyl;
        this.A05 = new C51188Fpy(this);
    }
}
