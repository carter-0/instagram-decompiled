package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7zd  reason: invalid class name and case insensitive filesystem */
public final class C349127zd extends C249403jg {
    public final /* synthetic */ C349067zX A00;

    public C349127zd(C349067zX r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        View A03;
        int A032 = AnonymousClass0fD.A03(-275464653);
        C349067zX r2 = this.A00;
        if (!r2.A01) {
            i2 = 1362328946;
        } else {
            if (i == 0) {
                if (!r2.A03 && (A03 = r2.A06.A03(r2.A05)) != null) {
                    C349067zX.A01(r2, C252553pI.A06(A03), true, true);
                }
                r2.A03 = false;
                r2.A02 = false;
            }
            i2 = 815833933;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(566223238);
        0qQ.A0B(recyclerView, 0);
        C349067zX r3 = this.A00;
        if (!r3.A01) {
            i3 = -877138863;
        } else {
            if (!r3.A03 && recyclerView.getScrollState() == 1) {
                r3.A02 = true;
                View A032 = r3.A06.A03(r3.A05);
                if (A032 != null) {
                    C349067zX.A01(r3, C252553pI.A06(A032), false, true);
                }
            }
            i3 = 1850435237;
        }
        AnonymousClass0fD.A0A(i3, A03);
    }
}
