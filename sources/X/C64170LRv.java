package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LRv  reason: case insensitive filesystem */
public abstract class C64170LRv {
    public static final Dialog A00(Context context, UserSession userSession, Integer num, boolean z) {
        Context context2;
        0qQ.A0B(userSession, 1);
        boolean A03 = A03(userSession, num);
        if (z) {
            context2 = 2Yn.A01(context);
        } else {
            context2 = context;
        }
        if (A03) {
            C52780GcX gcX = new C52780GcX(context2);
            gcX.setCancelable(false);
            String A16 = AnonymousClass7TE.A16(context, 2131972639);
            View findViewById = gcX.findViewById(R.id.message);
            0qQ.A07(findViewById);
            TextView textView = (TextView) findViewById;
            textView.setVisibility(0);
            textView.setText(A16);
            return gcX;
        }
        AnonymousClass6ST r2 = new AnonymousClass6ST(context2, true);
        DbU.A18(context, r2, 2131969785);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r6 == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        if (r1 != 2) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r6 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C49945FFy A01(android.content.Context r7, android.view.View.OnClickListener r8, android.view.View.OnClickListener r9, android.view.View.OnClickListener r10, com.instagram.common.session.UserSession r11, java.lang.Integer r12, boolean r13, boolean r14) {
        /*
            r0 = 1
            X.0qQ.A0B(r11, r0)
            if (r14 == 0) goto L_0x004e
            android.content.Context r0 = X.2Yn.A01(r7)
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r0, r11)
            X.2k4 r1 = X.AnonymousClass2k4.NIGHT
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A02 = r1
        L_0x0017:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321550580393483(0x810a420009260b, double:3.033233069961216E-306)
            boolean r6 = X.182.A06(r3, r11, r0)
            int r1 = r12.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x004a
            r0 = 1
            if (r1 == r0) goto L_0x004a
            r3 = 2
            r0 = 2131955378(0x7f130eb2, float:1.9547282E38)
            if (r1 == r3) goto L_0x0035
            r0 = 2131955867(0x7f13109b, float:1.9548274E38)
        L_0x0035:
            java.lang.String r3 = r7.getString(r0)
            r0 = 0
            if (r1 == r0) goto L_0x005d
            r0 = 1
            if (r1 == r0) goto L_0x0054
            r0 = 2
            if (r1 == r0) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x005d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004a:
            r0 = 2131955868(0x7f13109c, float:1.9548276E38)
            goto L_0x0035
        L_0x004e:
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r7, r11)
            goto L_0x0017
        L_0x0054:
            r0 = 2131955370(0x7f130eaa, float:1.9547266E38)
            if (r6 == 0) goto L_0x0064
            r0 = 2131955371(0x7f130eab, float:1.9547268E38)
            goto L_0x0064
        L_0x005d:
            r0 = 2131955764(0x7f131034, float:1.9548065E38)
            goto L_0x0064
        L_0x0061:
            r0 = 2131955377(0x7f130eb1, float:1.954728E38)
        L_0x0064:
            java.lang.String r0 = r7.getString(r0)
            r2.A0D(r3, r0)
            r5 = 2
            X.LXU r4 = new X.LXU
            r4.<init>(r5, r8, r11, r13)
            r0 = 3
            X.LXU r3 = new X.LXU
            r3.<init>(r0, r9, r11, r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r12 != r0) goto L_0x00b0
            r0 = 2131973663(0x7f13561f, float:1.9584368E38)
            r2.A03(r3, r0)
            r0 = 2131955366(0x7f130ea6, float:1.9547257E38)
            if (r6 == 0) goto L_0x0089
            r0 = 2131973656(0x7f135618, float:1.9584354E38)
        L_0x0089:
            r2.A04(r4, r0)
        L_0x008c:
            r0 = 0
            if (r1 == r0) goto L_0x0097
            r0 = 1
            if (r1 != r0) goto L_0x0097
            r3 = 2131956706(0x7f1313e2, float:1.9549975E38)
            if (r6 == 0) goto L_0x009a
        L_0x0097:
            r3 = 2131955368(0x7f130ea8, float:1.9547261E38)
        L_0x009a:
            r1 = 1
            X.LXU r0 = new X.LXU
            r0.<init>(r1, r10, r11, r13)
            r2.A04(r0, r3)
            X.Lrn r0 = new X.Lrn
            r0.<init>(r11, r13)
            r2.A03 = r0
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            return r0
        L_0x00b0:
            r0 = 0
            if (r1 == r0) goto L_0x00b8
            r0 = 1
            if (r1 == r0) goto L_0x00c7
            if (r1 == r5) goto L_0x00cc
        L_0x00b8:
            r0 = 2131955373(0x7f130ead, float:1.9547272E38)
        L_0x00bb:
            r2.A02(r4, r0)
            if (r9 == 0) goto L_0x008c
            r0 = 2131973663(0x7f13561f, float:1.9584368E38)
            r2.A04(r3, r0)
            goto L_0x008c
        L_0x00c7:
            r0 = 2131955366(0x7f130ea6, float:1.9547257E38)
            if (r6 == 0) goto L_0x00bb
        L_0x00cc:
            r0 = 2131973656(0x7f135618, float:1.9584354E38)
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64170LRv.A01(android.content.Context, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, java.lang.Integer, boolean, boolean):X.FFy");
    }

    public static final boolean A03(UserSession userSession, Integer num) {
        0Tu r2;
        long j;
        int intValue = num.intValue();
        if (intValue == 0) {
            r2 = 0Tu.A05;
            j = 36321550580524557L;
        } else if (intValue == 1) {
            r2 = 0Tu.A05;
            j = 36321550580459020L;
        } else if (intValue != 2) {
            return true;
        } else {
            r2 = 0Tu.A05;
            j = 36321550580000261L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static final void A02(AnonymousClass4MS r6, UserSession userSession, Integer num, C62320sa r9) {
        AnonymousClass7TG.A1N(userSession, r6);
        long A00 = r6.A00(TimeUnit.MILLISECONDS);
        if (A00 < 1000 && A03(userSession, num)) {
            long j = 1000 - A00;
            if (j != 0) {
                11Z.A04(new C65898M3n(r9), j);
                return;
            }
        }
        r9.invoke();
    }
}
