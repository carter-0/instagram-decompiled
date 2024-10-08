package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import java.util.List;

/* renamed from: X.Jm3  reason: case insensitive filesystem */
public final class C60471Jm3 extends C249403jg {
    public boolean A00;
    public final LinearLayoutManager A01;
    public final IgdExpressionTrayHscrollLayout A02;
    public final List A03;

    public C60471Jm3(LinearLayoutManager linearLayoutManager, IgdExpressionTrayHscrollLayout igdExpressionTrayHscrollLayout, List list) {
        0qQ.A0B(linearLayoutManager, 1);
        this.A01 = linearLayoutManager;
        this.A02 = igdExpressionTrayHscrollLayout;
        this.A03 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 != 1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r3, int r4) {
        /*
            r2 = this;
            r0 = 1801831801(0x6b65c579, float:2.7777655E26)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            super.onScrollStateChanged(r3, r4)
            if (r4 == 0) goto L_0x001a
            r0 = 1
            if (r4 == r0) goto L_0x001a
        L_0x0013:
            r0 = -1971605664(0xffffffff8a7baf60, float:-1.2118195E-32)
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x001a:
            r2.A00 = r0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60471Jm3.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, 824584562);
        super.onScrolled(recyclerView, i, i2);
        int A1a = this.A01.A1a();
        int i3 = 0;
        int i4 = 0;
        for (Object next : this.A03) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (A1a >= ((C61072JwA) next).A01) {
                i4 = i3;
            }
            i3 = i5;
        }
        if (this.A00) {
            this.A02.setSelectedIndex(i4);
        }
        AnonymousClass0fD.A0A(654350060, A0D);
    }
}
