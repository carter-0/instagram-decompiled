package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5w0  reason: invalid class name */
public final class AnonymousClass5w0 {
    public static final AnonymousClass5w0 A00 = new Object();

    public static final View A00(Context context, ViewGroup viewGroup, 0Pl r5) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r5, 2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_media_headline, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new AnonymousClass5w1(inflate, r5));
        return inflate;
    }

    public static final void A01(Context context, AnonymousClass9IE r10, UserSession userSession, AnonymousClass5w1 r12, AnonymousClass4DU r13, AnonymousClass3W1 r14, 0Pl r15, boolean z) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        AnonymousClass5w1 r5 = r12;
        0qQ.A0B(r12, 2);
        0qQ.A0B(r10, 3);
        0qQ.A0B(r14, 4);
        0Pl r8 = r15;
        0qQ.A0B(r15, 5);
        AnonymousClass4DU r7 = r13;
        0qQ.A0B(r13, 6);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 7);
        AnonymousClass3W1 r2 = r12.A03;
        if (r2 != null) {
            r2.A0M(r12, (Integer) null, true);
        }
        A02(context2, userSession2, r5, (1Xj) r10.A00, r7, r8, r14.A03);
        if (z) {
            2eQ.A04(r12.A04, 4);
        }
        r12.A00 = r10;
        r12.A03 = r14;
        r12.A01 = userSession;
        r12.A02 = r13;
        r14.A0L(r12, (Integer) null, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r5, com.instagram.common.session.UserSession r6, X.AnonymousClass5w1 r7, X.1Xj r8, X.AnonymousClass4DU r9, X.0Pl r10, int r11) {
        /*
            boolean r0 = r8.A5D()
            if (r0 == 0) goto L_0x0069
            X.1Xj r0 = r8.A1c(r11)
            if (r0 == 0) goto L_0x0061
            X.3gp r2 = r0.A1U()
        L_0x0010:
            if (r2 == 0) goto L_0x0061
            java.lang.String r0 = r2.A0d
            r1 = 0
            if (r0 == 0) goto L_0x0061
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0061
            com.instagram.ui.widget.textview.IgTextLayoutView r3 = r7.A04
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.2Yu.A0F(r5, r0)
            android.text.Layout r0 = r10.A0B(r5, r2, r0)
            r3.setTextLayout(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r3.A01 = r0
            r3.setVisibility(r1)
        L_0x0036:
            X.3Ds r5 = X.C238863Ds.USER_MESSAGE
            r4 = 0
            r2 = r4
            boolean r0 = r8.A5D()
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
        L_0x0044:
            X.3Dp r1 = X.C238833Dp.A00(r6)
            X.0qQ.A07(r1)
            X.3Dt r0 = new X.3Dt
            r0.<init>(r2, r5, r4, r4)
            r1.A08(r3, r0)
            X.3e7 r0 = new X.3e7
            r0.<init>(r4, r6, r8, r9)
            r1.A0A(r3, r0)
            X.3aa r0 = X.C244063aa.DPA_HEADLINE
            X.C244083ac.A05(r3, r0)
            return
        L_0x0061:
            com.instagram.ui.widget.textview.IgTextLayoutView r3 = r7.A04
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0036
        L_0x0069:
            X.3gp r2 = r8.A1U()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5w0.A02(android.content.Context, com.instagram.common.session.UserSession, X.5w1, X.1Xj, X.4DU, X.0Pl, int):void");
    }
}
