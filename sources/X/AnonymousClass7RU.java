package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.7RU  reason: invalid class name */
public final class AnonymousClass7RU extends C232232tF {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final boolean A03 = true;
    public final boolean A04;

    public AnonymousClass7RU(Activity activity, AnonymousClass0iw r4, UserSession userSession, boolean z) {
        0qQ.A0B(r4, 3);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r4;
        this.A04 = z;
    }

    /* renamed from: A00 */
    public final C68060MzR createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_reply_item_root, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        return new C68060MzR(activity, layoutInflater, this.A01, userSession, (IgFrameLayout) inflate, this.A04, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (X.0qQ.A0K(r4.A0G, r3.A05) != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r17, X.C249703kE r18) {
        /*
            r16 = this;
            r3 = r17
            r0 = r18
            X.7OC r3 = (X.AnonymousClass7OC) r3
            X.MzR r0 = (X.C68060MzR) r0
            r14 = 0
            X.0qQ.A0B(r3, r14)
            r5 = 1
            X.0qQ.A0B(r0, r5)
            X.OWa r1 = r0.A00
            if (r1 == 0) goto L_0x0041
            r2 = 0
            java.lang.String r4 = r1.A0D
            java.lang.String r1 = r3.A03
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 == 0) goto L_0x0041
            X.OWa r1 = r0.A00
            if (r1 == 0) goto L_0x0025
            com.instagram.user.model.User r2 = r1.A0C
        L_0x0025:
            com.instagram.user.model.User r1 = r3.A02
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0041
            X.OWa r4 = r0.A00
            if (r4 == 0) goto L_0x0041
            boolean r2 = r4.A0H
            boolean r1 = r3.A06
            if (r2 != r1) goto L_0x0041
            X.0sK r2 = r4.A0G
            X.0sK r1 = r3.A05
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x007a
        L_0x0041:
            android.view.View r1 = r0.itemView
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r1, r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeAllViews()
            android.view.LayoutInflater r6 = r0.A02
            r2 = 2131625079(0x7f0e0477, float:1.8877356E38)
            android.view.View r1 = r0.itemView
            X.0qQ.A0C(r1, r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.inflate(r2, r1, r5)
            android.app.Activity r5 = r0.A01
            android.view.View r7 = r0.itemView
            X.0qQ.A06(r7)
            com.instagram.common.session.UserSession r9 = r0.A04
            java.lang.String r11 = r3.A03
            if (r11 != 0) goto L_0x006b
            java.lang.String r11 = ""
        L_0x006b:
            com.instagram.user.model.User r10 = r3.A02
            X.0iw r8 = r0.A03
            boolean r13 = r3.A06
            X.0sK r12 = r3.A05
            X.OWa r4 = new X.OWa
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A00 = r4
        L_0x007a:
            X.OWa r2 = r0.A00
            if (r2 == 0) goto L_0x0083
            X.7L0 r1 = r3.A01
            r2.A03(r1, r14)
        L_0x0083:
            X.OWa r6 = r0.A00
            if (r6 == 0) goto L_0x00a4
            X.7Er r2 = r3.A00
            java.util.List r10 = r2.A05
            X.Cte r8 = r2.A01
            X.9IV r7 = r2.A00
            X.3su r9 = r2.A02
            boolean r11 = r0.A06
            java.lang.Boolean r1 = r2.A04
            boolean r12 = r1.booleanValue()
            java.lang.Boolean r1 = r2.A03
            boolean r13 = r1.booleanValue()
            boolean r15 = r0.A05
            r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RU.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AnonymousClass7OC.class;
    }
}
