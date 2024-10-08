package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Ftb  reason: case insensitive filesystem */
public final class C51405Ftb implements Runnable {
    public final /* synthetic */ IgdsBottomButtonLayout A00;
    public final /* synthetic */ C47505E5n A01;

    public C51405Ftb(IgdsBottomButtonLayout igdsBottomButtonLayout, C47505E5n e5n) {
        this.A01 = e5n;
        this.A00 = igdsBottomButtonLayout;
    }

    public final void run() {
        C47505E5n e5n = this.A01;
        e5n.A00 = this.A00.getHeight();
        C47505E5n.A00(e5n);
    }
}
