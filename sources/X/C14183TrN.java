package X;

import android.view.View;
import java.util.Set;

/* renamed from: X.TrN  reason: case insensitive filesystem */
public final class C14183TrN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C14165Tr3 A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ 2el A04;
    public final /* synthetic */ Set A05;

    public C14183TrN(View view, C14165Tr3 tr3, C276544tV r3, 2el r4, Set set, int i) {
        this.A04 = r4;
        this.A01 = view;
        this.A05 = set;
        this.A03 = r3;
        this.A02 = tr3;
        this.A00 = i;
    }

    public final void run() {
        this.A04.A05(this.A01, AnonymousClass30Y.A07);
        this.A05.remove(this.A03);
        this.A02.A01.remove(this.A00);
    }
}
