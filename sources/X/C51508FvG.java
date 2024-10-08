package X;

import android.widget.TextSwitcher;
import java.util.List;

/* renamed from: X.FvG  reason: case insensitive filesystem */
public final class C51508FvG implements Runnable {
    public int A00;
    public final /* synthetic */ TextSwitcher A01;
    public final /* synthetic */ AnonymousClass599 A02;
    public final /* synthetic */ List A03;

    public C51508FvG(TextSwitcher textSwitcher, AnonymousClass599 r2, List list) {
        this.A01 = textSwitcher;
        this.A03 = list;
        this.A02 = r2;
    }

    public final void run() {
        TextSwitcher textSwitcher = this.A01;
        List list = this.A03;
        textSwitcher.setText((CharSequence) list.get(this.A00));
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == list.size()) {
            this.A00 = 0;
        }
        this.A02.A02.postDelayed(this, 2500);
    }
}
