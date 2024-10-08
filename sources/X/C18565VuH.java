package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.VuH  reason: case insensitive filesystem */
public final class C18565VuH {
    public C20565Wui A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final synchronized void A01(C20565Wui wui) {
        wui.A01 = true;
        if (this.A00 == wui) {
            this.A00 = null;
        }
        notifyAll();
    }

    public static final void A00(C18565VuH vuH) {
        if (!vuH.A04) {
            if (GLDrawingView.A0H >= 131072) {
                vuH.A03 = true;
            }
            vuH.A04 = true;
        }
    }
}
