package X;

import com.instagram.common.ui.base.IgSimpleImageView;

public final /* synthetic */ class M27 implements Runnable {
    public final /* synthetic */ KB5 A00;

    public /* synthetic */ M27(KB5 kb5) {
        this.A00 = kb5;
    }

    public final void run() {
        KB5 kb5 = this.A00;
        IgSimpleImageView igSimpleImageView = kb5.A09;
        if (igSimpleImageView != null) {
            igSimpleImageView.callOnClick();
            1Au.A00(kb5.A0P).A1a(true);
        }
    }
}
