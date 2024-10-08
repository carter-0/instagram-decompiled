package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.concurrent.CancellationException;

/* renamed from: X.38U  reason: invalid class name */
public final class AnonymousClass38U {
    public C262224Cq A00;
    public C262204Co A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final AnonymousClass12V A05 = AnonymousClass12T.A00;
    public final UserSession A06;
    public final AnonymousClass388 A07;
    public final AnonymousClass38Y A08;
    public final Integer A09;
    public final String A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0Ud A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (X.182.A06(X.0Tu.A05, r13.A06, 36314850430880581L) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass38U r13, X.C2375338c r14) {
        /*
            r8 = 0
            r3 = 1
            boolean r0 = r14.A01
            r9 = r13
            if (r0 == 0) goto L_0x0023
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0023
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x0023
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r4 = r13.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314850430880581(0x81042a00010b45, double:3.02899586842992E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r4 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            X.4Co r1 = r13.A01
            if (r1 == 0) goto L_0x002c
            r0 = 0
            r1.AG7(r0)
        L_0x002c:
            java.lang.Long r0 = r14.A00
            if (r0 == 0) goto L_0x0086
            long r1 = r0.longValue()
            X.0eM r0 = r13.A0B
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            java.lang.String r0 = android.text.format.DateUtils.formatElapsedTime(r5)
            X.0qQ.A07(r0)
        L_0x0053:
            r3[r8] = r0
            java.lang.String r3 = X.0mp.A06(r7, r3)
            if (r4 == 0) goto L_0x0079
            r12 = 1000(0x3e8, double:4.94E-321)
            X.4Co r0 = r9.A01
            r10 = 0
            if (r0 == 0) goto L_0x0065
            r0.AG7(r10)
        L_0x0065:
            X.4Cq r2 = r9.A00
            if (r2 == 0) goto L_0x0077
            r11 = 3
            X.9K5 r8 = new X.9K5
            r8.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11, (long) r12)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r10 = X.1Eo.A03(r0, r1, r8, r2)
        L_0x0077:
            r9.A01 = r10
        L_0x0079:
            X.388 r0 = r9.A07
            r0.A01(r3, r4)
            boolean r0 = r14.A03
            r9.A02 = r0
            return
        L_0x0083:
            java.lang.String r0 = ""
            goto L_0x0053
        L_0x0086:
            X.0eM r0 = r13.A0B
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0eM r0 = r13.A0C
            java.lang.Object r0 = r0.getValue()
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass38U.A00(X.38U, X.38c):void");
    }

    public final void A01() {
        IgTextView igTextView;
        AnonymousClass388 r3 = this.A07;
        r3.A00 = null;
        if (r3.A03 && (igTextView = r3.A02) != null) {
            AnonymousClass0fU.A00((View.OnClickListener) null, igTextView);
        }
        r3.A01("", false);
        C262224Cq r0 = this.A00;
        if (r0 != null) {
            19E.A05((CancellationException) null, r0);
        }
        this.A00 = null;
        this.A01 = null;
    }

    public final void A02() {
        IgTextView igTextView;
        C262224Cq r0 = this.A00;
        if (r0 != null) {
            19E.A05((CancellationException) null, r0);
        }
        this.A00 = 19E.A02(AnonymousClass199.A02(((AnonymousClass12U) this.A05).A04, new AnonymousClass19G((C262204Co) null)));
        AnonymousClass388 r2 = this.A07;
        AnonymousClass3HD r1 = new AnonymousClass3HD(this);
        r2.A00 = r1;
        if (r2.A03 && (igTextView = r2.A02) != null) {
            AnonymousClass0fU.A00(r1, igTextView);
        }
        C262224Cq r3 = this.A00;
        if (r3 != null) {
            C376909Ju r22 = new C376909Ju(this, (AnonymousClass4D7) null, 14);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, r3);
        }
    }

    public /* synthetic */ AnonymousClass38U(Context context, AnonymousClass0iw r5, UserSession userSession, AnonymousClass388 r7, Integer num) {
        String str;
        AnonymousClass38Y A002 = AnonymousClass38W.A00().A00(context, userSession);
        0qQ.A0B(A002, 6);
        this.A09 = num;
        this.A03 = context;
        this.A06 = userSession;
        this.A07 = r7;
        this.A04 = r5;
        this.A08 = A002;
        this.A0D = 10b.A03(A002.A0D);
        this.A02 = true;
        this.A0B = AnonymousClass1YB.A00(new AnonymousClass9LX(this, 37));
        this.A0C = AnonymousClass1YB.A00(new AnonymousClass9LX(this, 38));
        switch (num.intValue()) {
            case 0:
                str = "THREAD";
                break;
            case 1:
                str = "INBOX";
                break;
            default:
                str = "MAIN_ACTIVITY";
                break;
        }
        this.A0A = 002.A0R("OngoingCallBarPresenter_", str);
    }
}
