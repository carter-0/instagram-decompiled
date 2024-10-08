package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.K9l  reason: case insensitive filesystem */
public final class C61480K9l extends C231632rz {
    public 1Xj A00;
    public final ReelDashboardFragment A01;
    public final AnonymousClass0iw A02;
    public final C317376nA A03;
    public final C317746nl A04;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r3.intValue() <= 0) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r21, android.view.View r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r20 = this;
            r6 = r23
            r0 = 1080745186(0x406adce2, float:3.6697316)
            r2 = r22
            int r4 = X.DbX.A04(r2, r0)
            boolean r0 = r6 instanceof X.1bK
            if (r0 == 0) goto L_0x00c8
            X.1bK r6 = (X.1bK) r6
            if (r6 == 0) goto L_0x00c8
            X.3gp r0 = new X.3gp
            r0.<init>(r6)
            r1 = r20
            X.1Xj r3 = r1.A00
            r0.A02(r3)
            com.instagram.user.model.User r3 = r6.A09
            if (r3 != 0) goto L_0x002a
            r0 = -1336837769(0xffffffffb0517977, float:-7.620637E-10)
        L_0x0026:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x002a:
            X.GjM r8 = new X.GjM
            r8.<init>(r2)
            com.instagram.common.typedurl.ImageUrl r7 = r3.Bh3()
            java.lang.String r10 = r3.getUsername()
            java.lang.Long r9 = r6.A0h
            java.lang.String r11 = r6.A0t
            X.6nl r3 = r1.A04
            boolean r17 = r3.A00()
            X.1Xj r3 = r1.A00
            if (r3 == 0) goto L_0x00c5
            java.util.List r3 = X.JTO.A14(r3)
            if (r3 == 0) goto L_0x00c5
            java.util.Map r5 = X.JZW.A02(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Object r3 = r5.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x00c5
            boolean r18 = r3.booleanValue()
        L_0x005d:
            X.1Xj r3 = r1.A00
            if (r3 == 0) goto L_0x00c2
            java.util.List r3 = X.JTO.A14(r3)
            if (r3 == 0) goto L_0x00c2
            java.util.Map r5 = X.JZW.A01(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Number r3 = X.C51966G9m.A14(r3, r5)
            if (r3 == 0) goto L_0x00c2
            int r16 = r3.intValue()
        L_0x0077:
            X.1Xj r3 = r1.A00
            if (r3 == 0) goto L_0x0095
            java.util.List r3 = X.JTO.A14(r3)
            if (r3 == 0) goto L_0x0095
            java.util.Map r5 = X.JZW.A01(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Number r3 = X.C51966G9m.A14(r3, r5)
            if (r3 == 0) goto L_0x0095
            int r3 = r3.intValue()
            r19 = 1
            if (r3 > 0) goto L_0x0097
        L_0x0095:
            r19 = 0
        L_0x0097:
            X.0iw r6 = r1.A02
            r3 = 13
            X.MJ8 r12 = new X.MJ8
            r12.<init>(r3, r0, r1)
            r3 = 14
            X.MJ8 r13 = new X.MJ8
            r13.<init>(r3, r0, r1)
            r3 = 15
            X.MJ8 r14 = new X.MJ8
            r14.<init>(r3, r0, r1)
            r3 = 16
            X.MJ8 r15 = new X.MJ8
            r15.<init>(r3, r0, r1)
            X.C55096Hc5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.6nA r1 = r1.A03
            r1.A00(r2, r0)
            r0 = 1854013094(0x6e81fea6, float:2.0115709E28)
            goto L_0x0026
        L_0x00c2:
            r16 = 0
            goto L_0x0077
        L_0x00c5:
            r18 = 0
            goto L_0x005d
        L_0x00c8:
            r0 = 1829321963(0x6d093ceb, float:2.6545682E27)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61480K9l.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C61480K9l(AnonymousClass0iw r1, C317376nA r2, C317746nl r3, ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass7TG.A1O(reelDashboardFragment, r1);
        this.A01 = reelDashboardFragment;
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-853616548);
        LayoutInflater A0F = DbX.A0F(viewGroup, 1);
        0qQ.A07(A0F);
        View A0D = DbT.A0D(A0F, viewGroup, R.layout.row_story_dashboard_comment, false);
        AnonymousClass0fD.A0A(-10692682, A032);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
