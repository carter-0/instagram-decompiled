package X;

import android.widget.FrameLayout;
import com.instagram.react.delegate.IgReactDelegate;

/* renamed from: X.TIf  reason: case insensitive filesystem */
public final /* synthetic */ class C13023TIf implements Runnable {
    public final /* synthetic */ SSW A00;
    public final /* synthetic */ QZK A01;
    public final /* synthetic */ C13428TaF[] A02;

    public /* synthetic */ C13023TIf(SSW ssw, QZK qzk, C13428TaF[] taFArr) {
        this.A00 = ssw;
        this.A02 = taFArr;
        this.A01 = qzk;
    }

    public final void run() {
        SSW ssw = this.A00;
        C13428TaF[] taFArr = this.A02;
        synchronized (ssw) {
            Integer num = ssw.A0I;
            Integer num2 = AnonymousClass05K.A0C;
            if (num == num2) {
                Q6H A04 = ssw.A04();
                if (A04 != null) {
                    A04.A08(ssw.A00);
                }
                ssw.A0I = num2;
            }
        }
        for (C13428TaF taF : taFArr) {
            if (taF != null) {
                IgReactDelegate igReactDelegate = ((C12205Sp0) taF).A00;
                FrameLayout frameLayout = igReactDelegate.mFrameLayout;
                if (!igReactDelegate.A09 && frameLayout != null) {
                    frameLayout.removeView(igReactDelegate.mLoadingIndicator);
                    IgReactDelegate.A00(igReactDelegate);
                    igReactDelegate.A06.A01().A0D.remove(igReactDelegate.A02);
                    igReactDelegate.A02 = null;
                }
            }
        }
    }
}
