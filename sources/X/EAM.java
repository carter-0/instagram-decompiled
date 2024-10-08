package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EAM extends C231632rz {
    public final UserSession A00;
    public final C319866rM A01;
    public final User A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAM(UserSession userSession, C319866rM r2, User user) {
        this.A01 = r2;
        this.A02 = user;
        this.A00 = userSession;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, X.AnonymousClass1Q2.A02().getCountry());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = 223608692(0xd53ff74, float:6.5326885E-31)
            int r2 = X.DbX.A04(r11, r0)
            r1 = 2
            X.0qQ.A0B(r12, r1)
            java.lang.Object r5 = r11.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ContactOptionViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.Exy r5 = (X.C49563Exy) r5
            X.6pK r12 = (X.C318666pK) r12
            com.instagram.user.model.User r4 = r9.A02
            X.6rM r3 = r9.A01
            X.AnonymousClass7TG.A1N(r5, r12)
            X.0qQ.A0B(r4, r1)
            int r6 = r12.A01
            int r1 = r12.ordinal()
            java.lang.String r0 = ""
            switch(r1) {
                case 0: goto L_0x007a;
                case 1: goto L_0x007a;
                case 2: goto L_0x00a9;
                case 3: goto L_0x0042;
                case 4: goto L_0x004f;
                case 5: goto L_0x002d;
                case 6: goto L_0x002d;
                case 7: goto L_0x002d;
                case 8: goto L_0x002d;
                case 9: goto L_0x002d;
                case 10: goto L_0x002d;
                case 11: goto L_0x006c;
                case 12: goto L_0x0038;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r1 = "Don't know how to display Contact Option: "
            java.lang.String r0 = r12.name()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0038:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131956580(0x7f131364, float:1.954972E38)
            goto L_0x0075
        L_0x0042:
            boolean r1 = r4.A1d()
            if (r1 == 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00bd
            java.lang.String r1 = r3.AyH()
            goto L_0x008e
        L_0x004f:
            android.view.View r0 = r5.A00
            android.content.Context r8 = r0.getContext()
            X.4Cl r0 = r4.A03
            java.lang.String r7 = r0.AZg()
            X.4Cl r0 = r4.A03
            java.lang.String r1 = r0.CHc()
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.AnQ()
            java.lang.String r0 = X.AnonymousClass703.A05(r8, r7, r1, r0)
            goto L_0x00bd
        L_0x006c:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131956579(0x7f131363, float:1.9549718E38)
        L_0x0075:
            java.lang.String r0 = X.DbY.A0b(r1, r4, r0)
            goto L_0x00bd
        L_0x007a:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.AqG()
            if (r0 == 0) goto L_0x009b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x009b
            X.4Cl r0 = r4.A03
            java.lang.String r1 = r0.AqG()
        L_0x008e:
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, r0)
            goto L_0x00bd
        L_0x009b:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131972231(0x7f135087, float:1.9581464E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00bd
        L_0x00a9:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BiE()
            if (r0 == 0) goto L_0x00d7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d7
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BiE()
        L_0x00bd:
            android.widget.TextView r1 = r5.A01
            r1.setText(r6)
            android.widget.TextView r1 = r5.A02
            r1.setText(r0)
            if (r3 == 0) goto L_0x00d0
            android.view.View r1 = r5.A00
            r0 = 40
            X.FPH.A00(r1, r12, r4, r3, r0)
        L_0x00d0:
            r0 = -675878989(0xffffffffd7b6e7b3, float:-4.02212514E14)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00d7:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131972229(0x7f135085, float:1.958146E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAM.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -377396117);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_contact_option_row, false);
        A0A.setTag(new C49563Exy(A0A));
        AnonymousClass0fD.A0A(-1152096252, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
