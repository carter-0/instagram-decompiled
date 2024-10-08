package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4MI  reason: invalid class name */
public final class AnonymousClass4MI {
    public static final Handler A0D = new Handler(Looper.getMainLooper());
    public View A00 = null;
    public AnonymousClass4MJ A01;
    public String A02;
    public List A03;
    public final long A04;
    public final AnonymousClass4MK A05;
    public final Runnable A06;
    public final ArrayList A07;
    public final Context A08;
    public final Rect A09;
    public final Rect A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass4MI(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A08 = context;
        boolean z = false;
        this.A0A = new Rect(0, 0, 0, 0);
        this.A09 = new Rect(0, 0, 0, 0);
        this.A07 = new ArrayList();
        this.A01 = new AnonymousClass4MJ(-2);
        this.A03 = 0sn.A00;
        0Tu r4 = 0Tu.A05;
        long A012 = 182.A01(r4, userSession, 36593585218979198L);
        if (A012 > 0 && 182.A06(r4, userSession, 36312110242202518L)) {
            z = true;
        }
        this.A0C = 182.A06(r4, userSession, 36312110242923424L);
        this.A05 = new AnonymousClass4MK(userSession, new WeakReference(context));
        this.A04 = !z ? 200 : A012;
        this.A0B = 182.A06(r4, userSession, 36312110242005908L);
        this.A06 = new AnonymousClass4ML(this);
    }

    public final void A01(ViewGroup viewGroup, C257403xL r5) {
        0qQ.A0B(viewGroup, 0);
        if (!this.A0C || !this.A07.contains(r5)) {
            this.A07.add(r5);
            A0D.post(this.A06);
            this.A05.A00(viewGroup, 002.A03(this.A01.A00, " %"));
            return;
        }
        this.A00 = viewGroup;
        A02(r5);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r2[0] = r1.findViewById(r0);
        r2[1] = r4.getRootView().findViewById(com.instagram.android.R.id.direct_private_share_container_view);
        r2[2] = r4.getRootView().findViewById(com.instagram.android.R.id.action_sheet_container);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        if (r2.equals(r0) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r2 = new android.view.View[]{r4.getRootView().findViewById(com.instagram.android.R.id.direct_private_share_container_view), r4.getRootView().findViewById(com.instagram.android.R.id.action_sheet_container)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        r0 = X.0sr.A1P(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r13 = this;
            android.view.View r4 = r13.A00
            if (r4 == 0) goto L_0x023b
            android.graphics.Rect r6 = r13.A0A
            r4.getGlobalVisibleRect(r6)
            android.graphics.Rect r5 = r13.A09
            r4.getHitRect(r5)
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x00fa
            java.util.ArrayList r0 = r13.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x0018:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()
            X.3xL r0 = (X.C257403xL) r0
            java.lang.String r0 = r0.CEM()
            r13.A02 = r0
            goto L_0x0018
        L_0x002b:
            java.lang.String r2 = r13.A02
            r3 = 0
            if (r2 == 0) goto L_0x003a
            int r0 = r2.hashCode()
            r1 = 3
            r8 = 1
            r7 = 2
            switch(r0) {
                case -2030702205: goto L_0x006a;
                case -1000113548: goto L_0x006d;
                case -975990334: goto L_0x0082;
                case -588644591: goto L_0x0070;
                case -32305112: goto L_0x00b4;
                case 771409393: goto L_0x0067;
                case 935219501: goto L_0x00dc;
                default: goto L_0x003a;
            }
        L_0x003a:
            X.0sn r0 = X.0sn.A00
        L_0x003c:
            java.util.List r1 = X.00k.A0X(r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r3, r3, r3, r3)
            r1.getGlobalVisibleRect(r0)
            r4.add(r0)
            goto L_0x004f
        L_0x0067:
            java.lang.String r0 = "clips_viewer_feed_timeline"
            goto L_0x00b6
        L_0x006a:
            java.lang.String r0 = "explore_event_viewer"
            goto L_0x00b6
        L_0x006d:
            java.lang.String r0 = "clips_viewer_explore_event_viewer"
            goto L_0x00b6
        L_0x0070:
            java.lang.String r0 = "igtv_viewer"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            android.view.View[] r2 = new android.view.View[r1]
            android.view.View r1 = r4.getRootView()
            r0 = 2131429827(0x7f0b09c3, float:1.8481338E38)
            goto L_0x0093
        L_0x0082:
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            android.view.View[] r2 = new android.view.View[r1]
            android.view.View r1 = r4.getRootView()
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
        L_0x0093:
            android.view.View r0 = r1.findViewById(r0)
            r2[r3] = r0
            android.view.View r1 = r4.getRootView()
            r0 = 2131431688(0x7f0b1108, float:1.8485112E38)
            android.view.View r0 = r1.findViewById(r0)
            r2[r8] = r0
            android.view.View r1 = r4.getRootView()
            r0 = 2131427600(0x7f0b0110, float:1.847682E38)
            android.view.View r0 = r1.findViewById(r0)
            r2[r7] = r0
            goto L_0x00d6
        L_0x00b4:
            java.lang.String r0 = "clips_viewer_clips_tab"
        L_0x00b6:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = r4.getRootView()
            r0 = 2131431688(0x7f0b1108, float:1.8485112E38)
            android.view.View r2 = r1.findViewById(r0)
            android.view.View r1 = r4.getRootView()
            r0 = 2131427600(0x7f0b0110, float:1.847682E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.View[] r2 = new android.view.View[]{r2, r0}
        L_0x00d6:
            java.util.List r0 = X.0sr.A1P(r2)
            goto L_0x003c
        L_0x00dc:
            java.lang.String r0 = "explore_popular"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = r4.getRootView()
            r0 = 2131431446(0x7f0b1016, float:1.8484621E38)
            android.view.View r0 = r1.findViewById(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            goto L_0x003c
        L_0x00f8:
            r13.A03 = r4
        L_0x00fa:
            java.util.List r1 = r13.A03
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r3 = 0
            android.graphics.Rect[] r0 = new android.graphics.Rect[]{r6}
            java.util.ArrayList r8 = X.0sr.A1M(r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0111:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r9 = r12.next()
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            java.util.Iterator r11 = r8.iterator()
        L_0x0121:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r10 = r11.next()
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            int r2 = r9.bottom
            int r1 = r10.top
            if (r2 <= r1) goto L_0x0121
            int r7 = r9.top
            int r0 = r10.bottom
            if (r7 >= r0) goto L_0x0121
            if (r7 > r1) goto L_0x0142
            int r0 = java.lang.Math.max(r1, r2)
            r10.top = r0
            goto L_0x0121
        L_0x0142:
            if (r2 < r0) goto L_0x014b
            int r0 = java.lang.Math.min(r0, r7)
            r10.bottom = r0
            goto L_0x0121
        L_0x014b:
            r10.bottom = r7
            int r4 = r10.left
            int r2 = r9.bottom
            int r1 = r10.right
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r2, r1, r7)
            r8.add(r0)
            goto L_0x0121
        L_0x015c:
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x016b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r2.next()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r1 = r0.bottom
            int r0 = r0.top
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L_0x016b
        L_0x0188:
            int r0 = X.00k.A02(r4)
            float r4 = (float) r0
            int r0 = r5.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r6.width()
            float r0 = (float) r0
            float r4 = r4 * r0
            int r0 = r5.width()
            float r0 = (float) r0
            float r4 = r4 / r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x01a6
            r0 = 1
        L_0x01a6:
            r2 = -2
            if (r0 != 0) goto L_0x01dc
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d4
            X.4MJ r1 = new X.4MJ
            r1.<init>(r3)
        L_0x01b4:
            X.4MJ r0 = r13.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x023b
            r13.A01 = r1
            java.util.ArrayList r0 = r13.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x01c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r1.next()
            X.3xL r0 = (X.C257403xL) r0
            r0.Dyi()
            goto L_0x01c4
        L_0x01d4:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e2
            r2 = 25
        L_0x01dc:
            X.4MJ r1 = new X.4MJ
            r1.<init>(r2)
            goto L_0x01b4
        L_0x01e2:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01eb
            r2 = 50
            goto L_0x01dc
        L_0x01eb:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f4
            r2 = 75
            goto L_0x01dc
        L_0x01f4:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01dc
            r2 = 100
            goto L_0x01dc
        L_0x01fb:
            X.4MK r2 = r13.A05
            X.4MJ r0 = r13.A01
            int r1 = r0.A00
            java.lang.String r0 = " %"
            java.lang.String r1 = X.002.A03(r1, r0)
            X.0qQ.A0B(r1, r3)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x023b
            java.lang.ref.WeakReference r0 = r2.A03
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x021d
            r0.setText(r1)
        L_0x021d:
            java.lang.ref.WeakReference r0 = r2.A01
            if (r0 == 0) goto L_0x022c
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x022c
            r0.setText(r1)
        L_0x022c:
            java.lang.ref.WeakReference r0 = r2.A02
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x023b
            r0.setText(r1)
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MI.A00():void");
    }

    public final void A02(C257403xL r5) {
        ViewGroup viewGroup;
        Handler handler = A0D;
        Runnable runnable = this.A06;
        handler.removeCallbacks(runnable);
        ArrayList arrayList = this.A07;
        if (!arrayList.contains(r5)) {
            arrayList.add(r5);
        }
        A00();
        handler.postDelayed(runnable, this.A04);
        View view = this.A00;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            this.A05.A00(viewGroup, 002.A03(this.A01.A00, " %"));
        }
    }
}
