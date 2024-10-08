package X;

import android.widget.TextSwitcher;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ftd  reason: case insensitive filesystem */
public final class C51407Ftd implements Runnable {
    public final /* synthetic */ TextSwitcher A00;
    public final /* synthetic */ IgTextView A01;

    public C51407Ftd(TextSwitcher textSwitcher, IgTextView igTextView) {
        this.A01 = igTextView;
        this.A00 = textSwitcher;
    }

    public final void run() {
        this.A01.setVisibility(0);
        this.A00.setVisibility(8);
    }
}
