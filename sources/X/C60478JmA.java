package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.JmA  reason: case insensitive filesystem */
public final class C60478JmA extends C249403jg implements C301525zS {
    public final /* synthetic */ KB5 A00;

    public final void D1n(MotionEvent motionEvent, View view) {
    }

    public final void DhI(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    public final void Dqc(View view, int i) {
    }

    public final void DsU(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public C60478JmA(KB5 kb5) {
        this.A00 = kb5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (((X.C66539MVt) r1.get(r5)).CeS() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKQ(com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r4, int r5, int r6) {
        /*
            r3 = this;
            X.KB5 r1 = r3.A00
            r1.A01 = r5
            X.KB5.A07(r1)
            r1.A0L()
            android.view.View r0 = r1.A06
            if (r0 != 0) goto L_0x0029
            com.instagram.creation.fragment.AlbumEditFragment r2 = r1.A0U
            java.util.List r1 = r1.A0E
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0025
            java.lang.Object r0 = r1.get(r5)
            X.MVt r0 = (X.C66539MVt) r0
            boolean r1 = r0.CeS()
            r0 = 1
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2.A0P(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60478JmA.DKQ(com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView, int, int):void");
    }

    public final void Dse(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        C64905Lk5 lk5 = this.A00.A0B;
        if (lk5 != null) {
            lk5.A02();
        }
    }

    public final void DhW(C301495zP r3, C301495zP r4, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        AnonymousClass0fD.A0A(-1774253556, AnonymousClass0fD.A03(1315622119));
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(1997512870);
        KB5 kb5 = this.A00;
        if (i != 0) {
            C64905Lk5 lk5 = kb5.A0B;
            if (lk5 != null) {
                lk5.A02();
            }
        } else if (kb5.A06 == null) {
            int i2 = kb5.A01;
            C66545MVz mVz = kb5.A0R;
            if (i2 != mVz.Atv()) {
                kb5.A01 = mVz.Atv();
                if (mVz.Au6() != null) {
                    KB5.A0C(kb5, mVz.Au6());
                    kb5.A0U.A0P(!mVz.Au6().CeS());
                }
            }
        }
        AnonymousClass0fD.A0A(916702084, A03);
    }

    public C60478JmA() {
    }
}
