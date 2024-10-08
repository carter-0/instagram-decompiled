package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GiW  reason: case insensitive filesystem */
public final class C53098GiW extends C249403jg {
    public final float A00;
    public final Rect A01 = AnonymousClass7TE.A0W();
    public final C53368Gms A02;
    public final HLD A03;
    public final 0sP A04;
    public final 0sL A05;

    public C53098GiW(C53368Gms gms, HLD hld, 0sP r4, 0sL r5, float f) {
        AnonymousClass7TG.A1U(gms, r5, r4);
        0qQ.A0B(hld, 5);
        this.A02 = gms;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = f;
        this.A03 = hld;
    }

    private final void A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView.getScrollState() == 0) {
            C252553pI r1 = recyclerView.A0D;
            if ((r1 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r1) != null) {
                int A1a = linearLayoutManager.A1a();
                int A1b = linearLayoutManager.A1b();
                C53368Gms gms = this.A02;
                int i = gms.A00;
                if (A1a == A1b && A1a != i) {
                    gms.A00 = A1a;
                    C51967G9n.A1P(Integer.valueOf(i), this.A05, A1a);
                }
                if (gms.A01 == -1) {
                    C51967G9n.A0w(gms.A00, this.A04);
                    gms.A01 = gms.A00;
                }
            }
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, -104696775);
        super.onScrollStateChanged(recyclerView, i);
        A00(recyclerView);
        AnonymousClass0fD.A0A(-1897026765, A0D);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        View A1D;
        int width;
        int width2;
        int A032 = AnonymousClass0fD.A03(788809774);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        A00(recyclerView);
        C252553pI r7 = recyclerView.A0D;
        if ((r7 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r7) != null && (A1a = linearLayoutManager.A1a()) <= (A1b = linearLayoutManager.A1b())) {
            while (true) {
                C53368Gms gms = this.A02;
                if (!(A1a == gms.A01 || (A1D = linearLayoutManager.A1D(A1a)) == null)) {
                    Rect rect = this.A01;
                    A1D.getGlobalVisibleRect(rect);
                    int ordinal = this.A03.ordinal();
                    if (ordinal == 1) {
                        width = rect.width();
                        width2 = A1D.getWidth();
                    } else if (ordinal == 0) {
                        width = rect.height();
                        width2 = A1D.getHeight();
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    if (((float) width) / ((float) width2) >= this.A00) {
                        gms.A01 = A1a;
                        C51967G9n.A0w(A1a, this.A04);
                        break;
                    }
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
        }
        AnonymousClass0fD.A0A(-1490767498, A032);
    }
}
