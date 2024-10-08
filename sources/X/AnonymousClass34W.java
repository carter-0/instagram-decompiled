package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

/* renamed from: X.34W  reason: invalid class name */
public abstract class AnonymousClass34W extends C249403jg implements C252293os {
    public int A00;

    public final void DVx(int i, int i2) {
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final void A00(int i) {
        int A03;
        int i2;
        if (this instanceof AnonymousClass34V) {
            AnonymousClass34V r1 = (AnonymousClass34V) this;
            A03 = AnonymousClass0fD.A03(1661800009);
            if (i == 1 || i == 2) {
                AnonymousClass34T r2 = r1.A00;
                HashSet hashSet = r2.A03;
                if (!hashSet.isEmpty()) {
                    AnonymousClass34T.A01(AnonymousClass3BU.ON_SCROLL, r2, hashSet);
                    hashSet.clear();
                }
            }
            i2 = 1691399930;
        } else {
            C2367534y r12 = (C2367534y) this;
            A03 = AnonymousClass0fD.A03(1601986727);
            if (i == 1) {
                C2365134a r22 = r12.A00;
                r22.A0M.A01("SCROLL_REEL_TRAY");
                1OH.A00(r22.A0F).A0D(AnonymousClass05K.A00);
            }
            i2 = -1653581475;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DhS(AnonymousClass3TF r6, AnonymousClass3TF r7) {
        int A03 = AnonymousClass0fD.A03(-1615305865);
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        if (r6 != r7) {
            int ordinal = r6.ordinal();
            int i = 2;
            if (ordinal == 0) {
                i = 1;
            } else if (ordinal != 1) {
                i = 0;
            }
            this.A00 = i;
            A00(i);
        }
        AnonymousClass0fD.A0A(-380779998, A03);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(-1708389473);
        0qQ.A0B(recyclerView, 0);
        super.onScrollStateChanged(recyclerView, i);
        if (i != this.A00) {
            this.A00 = i;
            A00(i);
        }
        AnonymousClass0fD.A0A(1694166288, A03);
    }
}
