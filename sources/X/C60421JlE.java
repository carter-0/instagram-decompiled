package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JlE  reason: case insensitive filesystem */
public final class C60421JlE extends 2Rw {
    public String A00 = "";
    public String A01 = "";
    public String A02 = "$0.00";
    public String A03;
    public final List A04;
    public final FragmentActivity A05;
    public final UserSession A06;

    public C60421JlE(FragmentActivity fragmentActivity, UserSession userSession, List list) {
        0qQ.A0B(userSession, 3);
        this.A05 = fragmentActivity;
        this.A04 = list;
        this.A06 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r12, int r13) {
        /*
            r11 = this;
            r7 = 0
            X.0qQ.A0B(r12, r7)
            int r2 = r12.mItemViewType
            if (r2 == 0) goto L_0x00dc
            r1 = 1
            if (r2 != r1) goto L_0x00d5
            X.JpO r12 = (X.C60677JpO) r12
            java.util.List r0 = r11.A04
            int r13 = r13 - r1
            java.lang.Object r4 = r0.get(r13)
            X.JuQ r4 = (X.C60968JuQ) r4
            X.0qQ.A0B(r4, r7)
            android.widget.TextView r2 = r12.A08
            java.lang.String r1 = r4.A07
            int r0 = r1.length()
            if (r0 != 0) goto L_0x002c
            android.content.res.Resources r1 = r12.A01
            r0 = 2131976275(0x7f136053, float:1.9589666E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x002c:
            r2.setText(r1)
            android.widget.TextView r1 = r12.A06
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00c4
            android.widget.TextView r3 = r12.A07
            android.content.Context r1 = r3.getContext()
            r0 = 2131976339(0x7f136093, float:1.9589796E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0047:
            r3.setText(r0)
            r3.setVisibility(r7)
        L_0x004d:
            java.lang.String r3 = r4.A04
            r6 = 8
            android.widget.TextView r2 = r12.A07
            if (r3 == 0) goto L_0x00c0
            android.content.Context r1 = r12.A00
            r0 = 2131976341(0x7f136095, float:1.95898E38)
            X.DbX.A13(r1, r2, r3, r0)
            r2.setVisibility(r7)
        L_0x0060:
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0072
            int r0 = r0.intValue()
            android.widget.TextView r2 = r12.A05
            double r0 = (double) r0
            java.lang.String r0 = X.1G0.A01(r0)
            r2.setText(r0)
        L_0x0072:
            android.widget.TextView r2 = r12.A04
            android.content.Context r1 = r12.A00
            r0 = 2131976252(0x7f13603c, float:1.958962E38)
            X.DbT.A18(r1, r2, r0)
            android.widget.TextView r5 = r12.A03
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            int r2 = r4.A00
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)
            X.0qQ.A07(r0)
            r5.setText(r0)
            java.lang.String r3 = r4.A06
            if (r3 == 0) goto L_0x00b0
            if (r2 != 0) goto L_0x00b1
            int r0 = r4.A01
            if (r0 != 0) goto L_0x00b1
            android.view.View r2 = r12.A02
            r2.setVisibility(r6)
        L_0x00a7:
            r1 = 6
            X.JfK r0 = new X.JfK
            r0.<init>(r12, r1)
            X.03v.A0B(r2, r0)
        L_0x00b0:
            return
        L_0x00b1:
            android.view.View r2 = r12.A02
            r2.setVisibility(r7)
            r1 = 6
            X.LXV r0 = new X.LXV
            r0.<init>(r4, r12, r3, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            goto L_0x00a7
        L_0x00c0:
            r2.setVisibility(r6)
            goto L_0x0060
        L_0x00c4:
            java.lang.String r2 = r4.A03
            if (r2 == 0) goto L_0x004d
            android.widget.TextView r3 = r12.A07
            android.content.Context r1 = r12.A00
            r0 = 2131976340(0x7f136094, float:1.9589798E38)
            java.lang.String r0 = X.DbW.A0h(r1, r2, r0)
            goto L_0x0047
        L_0x00d5:
            java.lang.String r0 = "Invalid View Type: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r2)
            throw r0
        L_0x00dc:
            X.JpK r12 = (X.C60673JpK) r12
            java.lang.String r4 = r11.A02
            java.lang.String r8 = r11.A03
            java.lang.String r6 = r11.A01
            java.lang.String r5 = r11.A00
            if (r8 == 0) goto L_0x0100
            android.widget.TextView r3 = r12.A05
            r3.setVisibility(r7)
            java.lang.String r0 = "$8"
            boolean r2 = X.00p.A0k(r8, r0, r7)
            android.content.Context r1 = r12.A00
            r0 = 2131976271(0x7f13604f, float:1.9589658E38)
            if (r2 == 0) goto L_0x00fd
            r0 = 2131976272(0x7f136050, float:1.958966E38)
        L_0x00fd:
            X.DbX.A13(r1, r3, r8, r0)
        L_0x0100:
            android.widget.TextView r1 = r12.A03
            r0 = 2131976270(0x7f13604e, float:1.9589656E38)
            r1.setText(r0)
            boolean r0 = X.00l.A0W(r6)
            android.widget.TextView r2 = r12.A02
            if (r0 == 0) goto L_0x013f
            r0 = 8
            r2.setVisibility(r0)
        L_0x0115:
            android.widget.TextView r0 = r12.A01
            r0.setText(r4)
            android.content.Context r1 = r12.A00
            r0 = 2131976274(0x7f136052, float:1.9589664E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r12.A06
            com.instagram.common.session.UserSession r4 = r12.A07
            java.lang.String r6 = "User Pay Earnings"
            android.widget.TextView r2 = r12.A04
            r0 = 2131976273(0x7f136051, float:1.9589662E38)
            java.lang.String r7 = X.DbY.A0c(r1, r8, r0)
            X.2EG r5 = X.2EG.A2k
            r10 = 0
            r0 = 3256(0xcb8, float:4.563E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.F6T.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x013f:
            r2.setVisibility(r7)
            android.content.Context r1 = r12.A00
            r0 = 2131976269(0x7f13604d, float:1.9589654E38)
            X.JTR.A18(r1, r2, r6, r5, r0)
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60421JlE.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View inflate = DbV.A0D(viewGroup).inflate(R.layout.user_pay_earnings_header, viewGroup, false);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            UserSession userSession = this.A06;
            FragmentActivity fragmentActivity = this.A05;
            0qQ.A0A(inflate);
            return new C60673JpK(userSession, fragmentActivity, inflate);
        } else if (i == 1) {
            return new C60677JpO(this.A06, this.A05, DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.user_pay_earnings_row_v2, false));
        } else {
            throw DbW.A0b("Invalid View Type: ", i);
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1816948989);
        int size = this.A04.size() + 1;
        AnonymousClass0fD.A0A(1768290070, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(890820749);
        boolean A1U = C51970G9q.A1U(i);
        AnonymousClass0fD.A0A(-2023166054, A032);
        return A1U ? 1 : 0;
    }
}
