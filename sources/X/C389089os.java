package X;

import android.view.View;

/* renamed from: X.9os  reason: invalid class name and case insensitive filesystem */
public final class C389089os extends C253103qD {
    public final /* synthetic */ Runnable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C389089os(int i, Runnable runnable) {
        super("", i, true);
        this.A00 = runnable;
    }

    public final void onClick(View view) {
        this.A00.run();
    }
}
