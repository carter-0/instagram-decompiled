package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9SR  reason: invalid class name */
public final class AnonymousClass9SR implements View.OnLayoutChangeListener {
    public final /* synthetic */ C349137ze A00;
    public final /* synthetic */ C349067zX A01;

    public AnonymousClass9SR(C349137ze r1, C349067zX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C349067zX r2 = this.A01;
        RecyclerView recyclerView = r2.A07;
        recyclerView.A11(this.A00);
        if (!r2.A01) {
            0nA.A0t(recyclerView, new C41309Arp(r2));
        }
        r2.A01 = true;
    }
}
