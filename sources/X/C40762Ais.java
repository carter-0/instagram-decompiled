package X;

import android.view.ViewGroup;

/* renamed from: X.Ais  reason: case insensitive filesystem */
public final class C40762Ais implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public C40762Ais(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.announceForAccessibility(viewGroup.getResources().getString(2131969132));
    }
}
