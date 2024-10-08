package X;

import android.os.Handler;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtq  reason: case insensitive filesystem */
public final class C67737Mtq extends 2YL {
    public ListIterator A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final Runnable A02 = new PVU(this);
    public final List A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void onCleared() {
        this.A01.removeCallbacks(this.A02);
    }

    public C67737Mtq() {
        List A1P = 0sr.A1P(new Integer[]{2131964933, 2131964932, 2131964934, 2131964942, 2131965816});
        this.A03 = A1P;
        02z A10 = DbS.A10(new C61078JwG((Integer) null, (DefaultConstructorMarker) null, 1, 2));
        this.A04 = A10;
        this.A00 = 0jo.A1G(A1P).listIterator();
        this.A05 = 10b.A03(A10);
    }
}
