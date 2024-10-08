package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mdp  reason: case insensitive filesystem */
public final class C66856Mdp extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66856Mdp(Context context, UserSession userSession, List list) {
        super(1505345961, 3, false, true);
        this.A00 = context;
        this.A02 = list;
        this.A01 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.util.Set r0 = X.C66959Mfs.A04
            android.content.Context r6 = r13.A00
            java.util.List r8 = r13.A02
            com.instagram.common.session.UserSession r3 = r13.A01
            java.lang.Class<android.content.pm.ShortcutManager> r5 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r5)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r4 = X.C51970G9q.A0m(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x001c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.next()
            android.content.pm.ShortcutInfo r1 = (android.content.pm.ShortcutInfo) r1
            X.PzB r0 = new X.PzB
            r0.<init>((android.content.Context) r6, (android.content.pm.ShortcutInfo) r1)
            X.PzA r0 = r0.A00()
            r4.add(r0)
            goto L_0x001c
        L_0x0035:
            int r2 = r4.size()
            java.lang.Object r0 = r6.getSystemService(r5)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            int r1 = r0.getMaxShortcutCountPerActivity()
            int r1 = r1 - r2
            r0 = 8
            int r0 = java.lang.Math.min(r0, r1)
            r2 = 0
            int r4 = java.lang.Math.max(r0, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r8.iterator()
        L_0x0057:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r1 = r9.next()
            r8 = r1
            X.2Ep r8 = (X.AnonymousClass2Ep) r8
            java.lang.String r0 = r8.C6f()
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0057
            boolean r0 = r8.COb()
            if (r0 != 0) goto L_0x0057
            boolean r0 = r8.isPending()
            if (r0 != 0) goto L_0x0057
            boolean r0 = r8.CcG()
            if (r0 != 0) goto L_0x0057
            java.util.List r0 = r8.BRZ()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0057
            int r0 = r8.C6a()
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 != 0) goto L_0x0057
            r7.add(r1)
            goto L_0x0057
        L_0x009c:
            java.util.List r0 = X.00k.A0d(r7, r4)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x00a8:
            boolean r0 = r12.hasNext()
            java.lang.String r8 = "DirectShareShortcutUtil"
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r12.next()
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            boolean r0 = r1.CUG()
            if (r0 == 0) goto L_0x0177
            X.4jH r0 = r1.C6F()
            if (r0 == 0) goto L_0x016e
            com.instagram.model.mediasize.ImageInfoImpl r9 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            com.instagram.model.mediasize.ExtendedImageUrl r9 = X.1iI.A04(r9, r0)
        L_0x00ca:
            if (r9 == 0) goto L_0x016e
            X.1NK r0 = X.1NK.A00()
            android.graphics.Bitmap r0 = r0.A0I(r9, r8)
            if (r0 == 0) goto L_0x016e
            android.graphics.Bitmap r0 = X.1MF.A05(r0)
            if (r0 == 0) goto L_0x016e
            androidx.core.graphics.drawable.IconCompat r11 = androidx.core.graphics.drawable.IconCompat.A02(r0)
        L_0x00e0:
            java.util.Set r8 = X.C66959Mfs.A02
            java.lang.String r0 = r1.C6C()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.add(r0)
            java.lang.String r0 = r1.C6C()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.PzB r8 = new X.PzB
            r8.<init>((android.content.Context) r6, (java.lang.String) r0)
            java.lang.String r0 = r1.C6f()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.PzA r10 = r8.A01
            r10.A0B = r0
            boolean r1 = r1.CUG()
            r0 = 6
            if (r1 == 0) goto L_0x010e
            r0 = 5
        L_0x010e:
            r10.A02 = r0
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r9 = 1
            android.content.Intent[] r0 = new android.content.Intent[]{r0}
            r10.A0P = r0
            r10.A09 = r11
            boolean r0 = X.2Iw.A00(r3)
            if (r0 == 0) goto L_0x016b
            java.util.Set r1 = X.C66959Mfs.A03
        L_0x0128:
            X.04u r0 = new X.04u
            r0.<init>(r2)
            r0.addAll(r1)
            r10.A0F = r0
            X.0Tu r11 = X.0Tu.A05
            r0 = 36328139059641298(0x81104000003bd2, double:3.0373996507672104E-306)
            boolean r0 = X.182.A06(r11, r3, r0)
            if (r0 == 0) goto L_0x015c
            r0 = 36328139059706835(0x81104000013bd3, double:3.037399650808656E-306)
            boolean r0 = X.182.A06(r11, r3, r0)
            if (r0 == 0) goto L_0x014c
            r10.A0N = r9
        L_0x014c:
            java.lang.String r1 = "actions.intent.SEND_MESSAGE"
            java.util.Set r0 = r8.A00
            if (r0 != 0) goto L_0x0159
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r8.A00 = r0
        L_0x0159:
            r0.add(r1)
        L_0x015c:
            X.PzA r0 = r8.A00()
            X.0qQ.A07(r0)
            X.C66753Mby.A02(r6, r0)
            r7.add(r0)
            goto L_0x00a8
        L_0x016b:
            java.util.Set r1 = X.C66959Mfs.A04
            goto L_0x0128
        L_0x016e:
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            androidx.core.graphics.drawable.IconCompat r11 = androidx.core.graphics.drawable.IconCompat.A00(r6, r0)
            goto L_0x00e0
        L_0x0177:
            java.util.List r0 = r1.BRZ()
            com.instagram.common.typedurl.ImageUrl r9 = X.DcW.A00(r3, r0)
            goto L_0x00ca
        L_0x0181:
            boolean r0 = X.DbT.A1b(r7)
            if (r0 == 0) goto L_0x01c5
            r2 = 20134884(0x1333be4, float:3.2920077E-38)
            X.C66753Mby.A04(r6, r7)     // Catch:{ IllegalArgumentException -> 0x018e, IllegalStateException -> 0x01b4 }
            goto L_0x01b3
        L_0x018e:
            r3 = move-exception
            X.0wj r0 = X.0wj.A01
            X.0f9 r2 = r0.AEf(r8, r2)
            int r1 = r7.size()
            java.lang.String r0 = "shortcuts size"
            r2.ABO(r0, r1)
            java.lang.String r0 = "max allowed"
            r2.ABO(r0, r4)
            java.lang.Object r0 = r6.getSystemService(r5)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            int r1 = r0.getMaxShortcutCountPerActivity()
            java.lang.String r0 = "getMaxShortcutCountPerActivity"
            r2.ABO(r0, r1)
            goto L_0x01bf
        L_0x01b3:
            return
        L_0x01b4:
            r1 = move-exception
            X.0wj r0 = X.0wj.A01
            X.0f9 r2 = r0.AEf(r8, r2)
            java.lang.Throwable r3 = r1.getCause()
        L_0x01bf:
            r2.ERJ(r3)
            r2.report()
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66856Mdp.run():void");
    }
}
