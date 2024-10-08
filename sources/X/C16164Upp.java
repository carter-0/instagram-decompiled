package X;

import android.app.Activity;
import android.graphics.RectF;
import android.widget.ListView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Upp  reason: case insensitive filesystem */
public class C16164Upp extends AnonymousClass6UX {
    public final ListView A00;
    public final C2366034j A01;

    public final void A09(Reel reel) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6.getLastVisiblePosition() < r7) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.instagram.ui.widget.framelayout.MediaFrameLayout A00(com.instagram.model.reels.Reel r9, X.C255773uh r10) {
        /*
            r8 = this;
            X.34j r0 = r8.A01
            int r7 = r0.CMH(r9, r10)
            android.widget.ListView r6 = r8.A00
            int r0 = r6.getFirstVisiblePosition()
            if (r0 > r7) goto L_0x0015
            int r1 = r6.getLastVisiblePosition()
            r0 = 1
            if (r1 >= r7) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r1 = 0
            if (r0 == 0) goto L_0x005a
            android.widget.ListAdapter r0 = r6.getAdapter()
            java.lang.Object r5 = r0.getItem(r7)
            boolean r0 = r5 instanceof X.VVA
            if (r0 == 0) goto L_0x005a
            X.VVA r5 = (X.VVA) r5
            java.lang.String r4 = r10.A0j
            r3 = 0
        L_0x002a:
            X.71g r1 = r5.A00
            int r0 = r1.A01()
            if (r3 >= r0) goto L_0x005e
            java.lang.Object r2 = r1.A02(r3)
            X.Vbs r2 = (X.C17662Vbs) r2
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x005b
            X.3uh r0 = r2.A04
            if (r0 == 0) goto L_0x005b
            X.3uh r0 = r2.A04
            java.lang.String r0 = r0.A0j
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x005b
        L_0x004c:
            android.view.View r0 = X.C13989Tnp.A0O(r6, r7)
            java.lang.Object r0 = r0.getTag()
            X.Vg7 r0 = (X.C17795Vg7) r0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r0.A00(r3)
        L_0x005a:
            return r1
        L_0x005b:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x005e:
            r3 = -1
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16164Upp.A00(com.instagram.model.reels.Reel, X.3uh):com.instagram.ui.widget.framelayout.MediaFrameLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.getLastVisiblePosition() < r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(int r5) {
        /*
            r4 = this;
            android.widget.ListView r3 = r4.A00
            int r0 = r3.getFirstVisiblePosition()
            if (r0 > r5) goto L_0x000f
            int r1 = r3.getLastVisiblePosition()
            r0 = 1
            if (r1 >= r5) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2 = 0
            if (r0 == 0) goto L_0x0028
            android.view.View r1 = X.C13989Tnp.A0O(r3, r5)
            int r0 = r1.getTop()
            if (r0 < 0) goto L_0x0028
            int r1 = r1.getBottom()
            int r0 = r3.getHeight()
            if (r1 > r0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16164Upp.A01(int):boolean");
    }

    public void A0C(Reel reel, C255773uh r7) {
        int CMH = this.A01.CMH(reel, r7);
        if (!A01(CMH)) {
            if (!A01(CMH)) {
                ListView listView = this.A00;
                if (CMH <= listView.getLastVisiblePosition() && (CMH < listView.getFirstVisiblePosition() || C13989Tnp.A0O(listView, CMH).getTop() < 0)) {
                    listView.setSelection(CMH);
                    return;
                }
            }
            if (!A01(CMH)) {
                ListView listView2 = this.A00;
                if (CMH < listView2.getFirstVisiblePosition()) {
                    return;
                }
                if (CMH > listView2.getLastVisiblePosition() || C13989Tnp.A0O(listView2, CMH).getBottom() > listView2.getHeight()) {
                    int i = 0;
                    if (listView2.getChildCount() > 0) {
                        i = 0 + (listView2.getHeight() - listView2.getChildAt(0).getMeasuredHeight());
                    }
                    listView2.setSelectionFromTop(CMH, i);
                }
            }
        }
    }

    public C16164Upp(Activity activity, ListView listView, C2366034j r3, C230222pE r4) {
        super(activity, r4);
        this.A00 = listView;
        this.A01 = r3;
    }

    public AnonymousClass6KT A08(Reel reel, C255773uh r4) {
        MediaFrameLayout A002 = A00(reel, r4);
        if (A002 == null) {
            return AnonymousClass6KT.A00();
        }
        RectF rectF = 0nA.A01;
        RectF rectF2 = new RectF();
        0nA.A0L(rectF2, A002);
        return AnonymousClass6KT.A03(rectF2);
    }

    public final void A0A(Reel reel, C255773uh r4) {
        MediaFrameLayout A002 = A00(reel, r4);
        if (A002 != null) {
            A002.setVisibility(4);
        }
    }

    public void A0B(Reel reel, C255773uh r3) {
        super.A0B(reel, r3);
        AnonymousClass7TF.A16(A00(reel, r3));
    }
}
