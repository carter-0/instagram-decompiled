package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERv  reason: case insensitive filesystem */
public final class C48032ERv extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TakeABreakMenuFragment";
    public long A00;
    public UserSession A01;
    public long A02;
    public String A03 = "off";

    public final void configureActionBar(2da r1) {
    }

    public final String getModuleName() {
        return "time_spent";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(500657806);
        super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        AnonymousClass0fD.A09(-489661974, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r15 = this;
            r0 = 1032344701(0x3d88547d, float:0.0665674)
            int r7 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            com.instagram.common.session.UserSession r0 = r15.A01
            if (r0 == 0) goto L_0x00ed
            X.0Tu r9 = X.0Tu.A05
            r4 = 36313725149448399(0x810324000108cf, double:3.0282842359210634E-306)
            boolean r0 = X.DbY.A1Y(r9, r0, r4)
            if (r0 == 0) goto L_0x0094
            r2 = 1
        L_0x001d:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r8 = r15.A01
            if (r8 == 0) goto L_0x00ed
            r0 = 36876675102998643(0x83032400030073, double:3.384296053363753E-306)
            java.lang.String r1 = X.182.A04(r9, r8, r0)
            java.lang.String r0 = ","
            java.util.List r8 = X.DbW.A0o(r1, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0091
            int r0 = r8.size()
            java.util.ListIterator r1 = r8.listIterator(r0)
        L_0x0042:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0091
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x0042
            java.util.List r0 = X.DbX.A0y(r8, r1)
        L_0x0052:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.00k.A0r(r0, r10)
            r0 = 2131974997(0x7f135b55, float:1.9587074E38)
            X.FGF.A01(r6, r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = X.AnonymousClass7TE.A1G(r10)
        L_0x0067:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r12 = X.AnonymousClass7TF.A0a(r14)
            java.lang.String r12 = (java.lang.String) r12
            int r13 = java.lang.Integer.parseInt(r12)
            if (r13 <= 0) goto L_0x0067
            android.content.res.Resources r11 = X.DbV.A05(r15)
            X.0qQ.A07(r11)
            com.instagram.common.session.UserSession r0 = r15.A01
            if (r0 == 0) goto L_0x00ed
            boolean r1 = X.DbY.A1Y(r9, r0, r4)
            r0 = 1
            java.lang.String r0 = X.C49927FFd.A01(r11, r13, r1, r0)
            X.DbV.A1V(r12, r0, r8)
            goto L_0x0067
        L_0x0091:
            X.0sn r0 = X.0sn.A00
            goto L_0x0052
        L_0x0094:
            r2 = 60
            goto L_0x001d
        L_0x0097:
            com.instagram.common.session.UserSession r0 = r15.A01
            if (r0 == 0) goto L_0x00ed
            X.2Cd r11 = new X.2Cd
            r11.<init>(r0)
            long r0 = r11.A01()
            r15.A02 = r0
            r15.A00 = r0
            r4 = 0
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d5
            android.content.res.Resources r1 = X.DbV.A05(r15)
            r0 = 2131974999(0x7f135b57, float:1.9587078E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "off"
            X.DbV.A1V(r0, r1, r8)
            long r0 = r15.A02
            long r0 = r0 / r2
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e9
            java.lang.String r9 = java.lang.String.valueOf(r0)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x00e9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r15.A03 = r0
        L_0x00d5:
            java.lang.String r1 = r15.A03
            X.FQY r0 = new X.FQY
            r0.<init>(r15, r8, r2)
            X.DbU.A1F(r0, r1, r6, r8)
            r15.setItems(r6)
            r0 = 1955538403(0x748f25e3, float:9.073082E31)
            X.AnonymousClass0fD.A09(r0, r7)
            return
        L_0x00e9:
            r11.A03(r15, r4)
            goto L_0x00d5
        L_0x00ed:
            X.DbS.A17()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48032ERv.onResume():void");
    }
}
