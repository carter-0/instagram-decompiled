package X;

import com.instagram.common.ui.base.IgTextView;

public final class PVO implements Runnable {
    public final /* synthetic */ IgTextView A00;

    public PVO(IgTextView igTextView) {
        this.A00 = igTextView;
    }

    public final void run() {
        IgTextView igTextView = this.A00;
        AnonymousClass7PT.A00(igTextView.getBackground(), igTextView.getTop());
    }
}
