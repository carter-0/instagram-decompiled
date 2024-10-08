package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jm9  reason: case insensitive filesystem */
public final class C60477Jm9 extends C249403jg implements AnonymousClass4DR, View.OnTouchListener {
    public int A00;
    public int A01;
    public C64276LYc A02;
    public C60423JlG A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final C355568Qm A0D;
    public final RecyclerView A0E;
    public final UserSession A0F;
    public final L00 A0G;
    public final C355538Qj A0H;

    public final boolean onBackPressed() {
        return A00(this, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r11.A08 != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r2 = r11.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r4 = 1
            X.0qQ.A0B(r13, r4)
            int r2 = r13.getAction()
            r7 = 0
            r1 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r4) goto L_0x0044
            r0 = 2
            if (r2 != r0) goto L_0x0043
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x0043
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x0043
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0E
            int r0 = r11.A01
            X.3kE r1 = r2.A0W(r0)
            if (r1 == 0) goto L_0x0043
            X.8Qm r0 = r11.A0D
            r0.A07(r1)
            long r3 = r13.getEventTime()
            long r5 = r13.getEventTime()
            r0 = 100
            long r5 = r5 + r0
            float r8 = r13.getX()
            float r9 = r13.getY()
            r10 = r7
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r2.dispatchTouchEvent(r0)
        L_0x0043:
            return r7
        L_0x0044:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0070
            boolean r1 = r11.A06
            X.L00 r0 = r11.A0G
            int r3 = r11.A01
            if (r1 == 0) goto L_0x0067
            X.KB5 r2 = r0.A00
            X.MVz r1 = r2.A0R
            android.view.View r0 = r1.AnC(r3)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r1.AnC(r3)
            X.KB5.A05(r0, r2, r4)
        L_0x0061:
            r11.A05 = r4
        L_0x0063:
            A00(r11, r4)
            return r7
        L_0x0067:
            int r1 = r11.A00
            X.KB5 r0 = r0.A00
            r0.A04 = r3
            r0.A01 = r1
            goto L_0x0063
        L_0x0070:
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0075:
            androidx.recyclerview.widget.RecyclerView r0 = r11.A0E
            android.view.View r0 = X.JTS.A0B(r13, r0)
            if (r0 == 0) goto L_0x007e
            r1 = 0
        L_0x007e:
            r11.A08 = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60477Jm9.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean A00(C60477Jm9 jm9, boolean z) {
        ViewGroup viewGroup = jm9.A0C;
        View view = jm9.A0B;
        if (viewGroup.indexOfChild(view) == -1) {
            return false;
        }
        MJ0 mj0 = new MJ0(jm9, 24);
        if (z) {
            C51972G9s.A0I(view).setDuration(200).setListener(new C64194LTc(mj0, 2));
            return true;
        }
        mj0.invoke();
        return true;
    }

    public C60477Jm9(Context context, ViewGroup viewGroup, UserSession userSession, L00 l00) {
        AnonymousClass7TG.A1O(userSession, context);
        0qQ.A0B(viewGroup, 3);
        this.A0F = userSession;
        this.A09 = context;
        this.A0C = viewGroup;
        this.A0G = l00;
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.layout_reorder_overlay_view);
        0qQ.A07(A082);
        this.A0B = A082;
        this.A0E = JTR.A0c(A082, R.id.reorder_recycler);
        this.A0A = AnonymousClass7TF.A0G(A082, R.id.reorder_trash_can);
        C60370JkL jkL = new C60370JkL(this);
        this.A0H = jkL;
        this.A0D = new C355568Qm(jkL);
        int A042 = DbS.A04(0Tu.A05, this.A0F, 36606122228127073L);
        Context context2 = this.A09;
        C60423JlG jlG = new C60423JlG(context2, A042);
        this.A03 = jlG;
        RecyclerView recyclerView = this.A0E;
        recyclerView.setAdapter(jlG);
        DbV.A1A(context2, recyclerView);
        C60467Jlz.A00(recyclerView, this, 3);
        this.A0D.A0A(recyclerView);
        recyclerView.setOnTouchListener(this);
        recyclerView.A15(this);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(1563820231);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        this.A08 = false;
        AnonymousClass0fD.A0A(-758302194, A032);
    }
}
