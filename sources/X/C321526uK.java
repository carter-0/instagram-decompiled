package X;

import android.view.ViewTreeObserver;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6uK  reason: invalid class name and case insensitive filesystem */
public final class C321526uK implements C240963Ni {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C267644bx A04;
    public final /* synthetic */ boolean A05;

    public final void DO4(C240983Nk r7) {
        MediaCroppingCoordinatesIntf C6q;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnPreDrawListener wcl;
        MediaCroppingCoordinatesIntf ByW;
        0qQ.A0B(r7, 0);
        C267644bx r3 = this.A04;
        if (r3 != null) {
            r3.DQS(this.A03, this.A01, this.A00);
        }
        boolean z = this.A05;
        if (!z) {
            1Xj r1 = this.A03;
            if (r1.A5Y() || r1.A5G()) {
                int i = r7.A01;
                int i2 = r7.A00;
                IgImageView igImageView = this.A02;
                C66901qt BPu = r1.A0C.BPu();
                if (BPu != null && (ByW = BPu.ByW()) != null && ByW.Asu() - ByW.Ass() > 0.0f && i > 0) {
                    viewTreeObserver = igImageView.getViewTreeObserver();
                    wcl = new C14353Tui(ByW, igImageView, i, i2);
                    viewTreeObserver.addOnPreDrawListener(wcl);
                }
                return;
            }
        }
        if (z) {
            1Xj r0 = this.A03;
            int i3 = r7.A01;
            int i4 = r7.A00;
            IgImageView igImageView2 = this.A02;
            C66901qt BPu2 = r0.A0C.BPu();
            if (BPu2 != null && (C6q = BPu2.C6q()) != null) {
                if (!(C6q.Asu() == 0.0f && C6q.Ass() == 0.0f && C6q.Asv() == 0.0f && C6q.Asp() == 0.0f) && i3 > 0) {
                    viewTreeObserver = igImageView2.getViewTreeObserver();
                    wcl = new WCL(C6q, igImageView2, i3, i4);
                    viewTreeObserver.addOnPreDrawListener(wcl);
                }
            }
        }
    }

    public C321526uK(IgImageView igImageView, 1Xj r2, C267644bx r3, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A02 = igImageView;
    }

    public final void DEN() {
        C267644bx r3 = this.A04;
        if (r3 != null) {
            r3.DQQ(this.A03, this.A01, this.A00);
        }
    }
}
