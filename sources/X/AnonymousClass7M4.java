package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7M4  reason: invalid class name */
public final class AnonymousClass7M4 implements AnonymousClass7M2 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C333517Zg A04;

    public AnonymousClass7M4(Activity activity, Context context, AnonymousClass0iw r3, UserSession userSession, C333517Zg r5) {
        this.A04 = r5;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = context;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cly(X.C254793t3 r31, boolean r32) {
        /*
            r30 = this;
            r8 = r30
            X.7Zg r4 = r8.A04
            X.7S7 r12 = r4.C6l()
            X.3Te r3 = r12.BiC()
            if (r3 == 0) goto L_0x0126
            com.instagram.common.session.UserSession r0 = r8.A03
            java.lang.String r1 = r0.A06
            X.7SD r2 = r12.C6Q()
            int r2 = r2.A08
            java.lang.String r5 = X.C329997La.A00(r3, r1, r2)
            r6 = r31
            if (r31 == 0) goto L_0x002f
            X.7ZA r4 = r4.C62()
            java.lang.String r3 = r12.C6k()
            int r2 = r12.AdN()
            r4.Clk(r6, r3, r5, r2)
        L_0x002f:
            android.app.Activity r10 = r8.A00
            android.content.Context r7 = r8.A01
            X.2Ep r2 = r12.Cms()
            if (r2 == 0) goto L_0x0143
            X.0iw r4 = r8.A02
            r15 = 0
            r9 = 1
            r3 = 5
            X.0qQ.A0B(r4, r3)
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r6 = X.0eY.A00(r3)
            java.lang.String r3 = "Screenshots"
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r3)
            boolean r3 = r5.exists()
            if (r3 != 0) goto L_0x0127
            boolean r3 = r5.mkdirs()
            if (r3 != 0) goto L_0x0127
        L_0x005a:
            r17 = 0
        L_0x005c:
            X.34S r3 = X.AnonymousClass48N.A00(r0, r2)
            java.lang.String r19 = r2.BA0()
            java.lang.String r20 = r2.C6C()
            java.lang.String r21 = r12.C6k()
            java.lang.String r5 = r12.BiB()
            boolean r28 = X.0qQ.A0K(r5, r1)
            java.lang.String r22 = r12.BiB()
            java.lang.String r23 = r12.C6f()
            java.lang.Object r3 = r3.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.7SD r5 = r12.C6Q()
            int r11 = r5.A08
            int r26 = r12.AdN()
            int r27 = r12.BRT()
            X.9HW r8 = X.AnonymousClass9HV.A00(r0)
            X.7SD r5 = r12.C6Q()
            X.3t3 r6 = r5.A0P
            r5 = 24
            boolean r29 = r8.A00(r6, r5)
            X.3U9 r2 = (X.AnonymousClass3U9) r2
            X.3S9 r2 = r2.A01
            X.3Te r5 = r2.A0s
            r2 = 29
            java.lang.String r24 = X.C329997La.A00(r5, r1, r2)
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r1 = new com.instagram.direct.groupinvites.models.InviteLinkShareInfo
            r16 = r1
            r18 = r3
            r25 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r3 = r1.A02
            if (r3 != r2) goto L_0x0126
            X.0Tu r5 = X.0Tu.A05
            r2 = 36325209891943141(0x810d96000032e5, double:3.035547233320084E-306)
            boolean r2 = X.182.A06(r5, r0, r2)
            if (r2 == 0) goto L_0x0126
            X.1as r2 = X.1as.A04
            X.1ap r3 = r2.A02
            X.2FW r2 = X.2FW.A0T
            X.F3w r4 = r3.A07(r4, r0, r2)
            android.os.Bundle r3 = r4.A07
            java.lang.String r2 = "DirectShareSheetConstants.channel_invite_link"
            r3.putParcelable(r2, r1)
            r1 = 2131960271(0x7f1321cf, float:1.9557206E38)
            java.lang.String r13 = r7.getString(r1)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 0
            com.instagram.direct.intf.DirectShareSheetAppearance r11 = new com.instagram.direct.intf.DirectShareSheetAppearance
            r16 = r15
            r18 = r9
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r9
            r24 = r15
            r25 = r15
            r26 = r9
            r27 = r9
            r28 = r9
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1 = 42
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putParcelable(r1, r11)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r4.A00()
            X.7Pr r1 = new X.7Pr
            r1.<init>(r0)
            r1.A13 = r9
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r1.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r1.A0a = r0
            X.7Pu r0 = r1.A00()
            r0.A02(r10, r2)
        L_0x0126:
            return
        L_0x0127:
            X.Ahu r3 = X.Ahu.A00
            java.io.File[] r5 = r5.listFiles(r3)
            if (r5 == 0) goto L_0x005a
            int r3 = r5.length
            if (r3 == 0) goto L_0x005a
            java.io.File[] r5 = X.AnonymousClass3KI.A01(r5, r15)
            int r3 = r5.length
            if (r3 == 0) goto L_0x005a
            r3 = r5[r15]
            if (r3 == 0) goto L_0x005a
            android.net.Uri r17 = androidx.core.content.FileProvider.A00(r7, r3)
            goto L_0x005c
        L_0x0143:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M4.Cly(X.3t3, boolean):void");
    }
}
