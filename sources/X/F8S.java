package X;

import android.content.Context;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class F8S {
    public static final void A01(Context context, GrowthFrictionInterventionDetail growthFrictionInterventionDetail, UserSession userSession, User user, Runnable runnable) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(context, userSession);
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail2 = growthFrictionInterventionDetail;
        if (growthFrictionInterventionDetail != null) {
            A00(context2, growthFrictionInterventionDetail2, userSession2, C358278ae.BLUE_BOLD, user, AnonymousClass05K.A0C, runnable, false);
        }
    }

    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.FIh] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.FJj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r19, com.instagram.api.schemas.GrowthFrictionInterventionDetail r20, com.instagram.common.session.UserSession r21, X.C358278ae r22, com.instagram.user.model.User r23, java.lang.Integer r24, java.lang.Runnable r25, boolean r26) {
        /*
            r11 = r19
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00f1
            r1 = r11
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x00f1
            X.8ab r3 = X.DbS.A0X(r1)
            r8 = r20
            java.lang.String r0 = r8.getTitle()
            r3.A05 = r0
            java.lang.String r0 = r8.getDescription()
            r3.A0q(r0)
            r13 = r23
            if (r26 == 0) goto L_0x002e
            com.instagram.common.typedurl.ImageUrl r1 = r13.Bh3()
            r0 = 0
            r3.A0n(r1, r0)
        L_0x002e:
            java.util.List r0 = r8.Aj1()
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x0037:
            boolean r0 = r5.hasNext()
            r10 = r21
            r9 = r24
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r12 = r5.next()
            com.instagram.api.schemas.GrowthFrictionInterventionButton r12 = (com.instagram.api.schemas.GrowthFrictionInterventionButton) r12
            java.lang.String r1 = r12.getText()
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = r12.AYH()
            if (r2 != 0) goto L_0x0055
            java.lang.String r2 = ""
        L_0x0055:
            java.lang.String r0 = "CANCEL"
            boolean r0 = r2.equals(r0)
            r6 = 0
            if (r0 == 0) goto L_0x008d
            r15 = 16
            X.FJj r6 = new X.FJj
            r14 = r6
            r16 = r8
            r17 = r10
            r18 = r9
            r19 = r13
            r14.<init>((int) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19)
        L_0x006e:
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
        L_0x0070:
            java.lang.Boolean r0 = r12.CZp()
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 == 0) goto L_0x0081
            r0 = r22
            r3.A0Y(r6, r0, r1, r2)
            goto L_0x0037
        L_0x0081:
            if (r4 != 0) goto L_0x0089
            r3.A0a(r6, r1)
        L_0x0086:
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0089:
            r3.A0b(r6, r1)
            goto L_0x0086
        L_0x008d:
            r0 = 208(0xd0, float:2.91E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r15 = 7
            X.FIh r6 = new X.FIh
            r16 = r25
            r14 = r6
            r17 = r9
            r18 = r8
            r19 = r13
            r20 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x006e
        L_0x00ab:
            java.lang.String r0 = "OPEN_URL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r7 = 7
            X.FJe r6 = new X.FJe
            r6.<init>((int) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13)
            goto L_0x006e
        L_0x00ba:
            java.lang.String r0 = "error_in_showing_dialog"
            X.FEL.A00(r8, r10, r13, r9, r0)
            goto L_0x0070
        L_0x00c0:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325768237692109(0x810e18000034cd, double:3.0359003334200095E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00e5
            X.DbT.A1V(r3)     // Catch:{ BadTokenException -> 0x00da }
            r0 = 786(0x312, float:1.101E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ BadTokenException -> 0x00da }
            X.FEL.A00(r8, r10, r13, r9, r0)     // Catch:{ BadTokenException -> 0x00da }
            return
        L_0x00da:
            X.0wj r2 = X.0wj.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "crash_when_dismissing_dialog"
            X.DbT.A1Q(r2, r0, r1)
            return
        L_0x00e5:
            X.DbT.A1V(r3)
            r0 = 786(0x312, float:1.101E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FEL.A00(r8, r10, r13, r9, r0)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F8S.A00(android.content.Context, com.instagram.api.schemas.GrowthFrictionInterventionDetail, com.instagram.common.session.UserSession, X.8ae, com.instagram.user.model.User, java.lang.Integer, java.lang.Runnable, boolean):void");
    }
}
