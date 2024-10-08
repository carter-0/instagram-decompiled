package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.F7r  reason: case insensitive filesystem */
public abstract class C49805F7r {
    public static final void A00(Activity activity, 28D r4, UserSession userSession, AnonymousClass80E r6, PendingRecipient pendingRecipient, Integer num) {
        AnonymousClass7TG.A1T(userSession, activity, r4);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable(C273654mx.A00(31), pendingRecipient);
        A0a.putSerializable("camera_entry_point", r4);
        A0a.putParcelable(C66579MXk.A00(55), (Parcelable) null);
        A0a.putString(AnonymousClass000.A00(2929), (String) null);
        if (r6 != null) {
            A0a.putSerializable(C273654mx.A00(175), r6);
        }
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(27));
        A02.A07();
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007a, code lost:
        if (X.182.A06(r6, r3, 36314893383502721L) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        r6 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        if (X.182.A06(r6, r3, 36317749533742582L) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        if (r26 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        if (X.182.A06(r6, r3, 36327511994481124L) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0096, code lost:
        X.JW1.A00(r3).A03(r4);
        r3 = X.AnonymousClass36R.A00(r2, r3, new X.C50348FZf(r2, 10));
        r2 = X.AnonymousClass36W.FOLLOWERS_SHARE;
        r1 = X.AnonymousClass7TE.A0a();
        X.Dbb.A0n(r1, r7, r4, "targetGroupProfile", false);
        r1.putBoolean(X.AnonymousClass000.A00(35), false);
        r3.A04(r1, X.EXF.A0J, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c2, code lost:
        X.JW1.A00(r3).A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d2, code lost:
        if (X.182.A06(r6, r3, 2342160758747567607L) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d4, code lost:
        if (r26 != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d6, code lost:
        r0 = X.182.A06(r6, r3, 36327511994481124L);
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        if (r0 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e2, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e5, code lost:
        if ((r2 instanceof X.2Zg) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e7, code lost:
        if (r25 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
        r12 = X.C358098aM.A00(X.C363138jC.A00, new X.C358088aL[0]);
        r12.A00 = r6;
        ((X.2Zg) r2).FLD(new com.instagram.ui.swipenavigation.PositionConfig((X.AnonymousClass57C) null, r12, (X.AnonymousClass3QO) null, X.AnonymousClass000.A00(3804), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1.0f, 0, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011d, code lost:
        r1 = X.AnonymousClass7TE.A0a();
        X.Dbb.A0n(r1, r7, r4, "targetGroupProfile", r6);
        r1.putBoolean(X.AnonymousClass000.A00(35), r8);
        r0 = X.AnonymousClass6W8.A02(r2, r1, r3, com.instagram.modal.TransparentModalActivity.class, X.C273654mx.A00(1005));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        if (r24 != null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.app.Activity r21, X.28D r22, com.instagram.common.session.UserSession r23, com.instagram.pendingmedia.model.recipients.PendingRecipient r24, boolean r25, boolean r26) {
        /*
            r2 = r21
            r5 = 0
            r3 = r23
            X.0qQ.A0B(r3, r5)
            r9 = 1
            r4 = r22
            X.AnonymousClass7TF.A1B(r2, r9, r4)
            r7 = r24
            r8 = r26
            if (r24 == 0) goto L_0x0021
            X.0Tu r6 = X.0Tu.A05
            r0 = 36314893383502721(0x810434002e0b81, double:3.0290230318411176E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x006f
        L_0x0021:
            boolean r0 = X.2cg.A01(r3)
            if (r0 == 0) goto L_0x006d
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.8jC r1 = X.C363138jC.A00
            X.8aL[] r0 = new X.C358088aL[r5]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r1 = X.C358098aM.A00(r1, r0)
            r0 = 22
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putParcelable(r0, r1)
            r0 = 1156(0x484, float:1.62E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putBoolean(r0, r9)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "targetGroupProfile"
            X.Dbb.A0n(r1, r7, r4, r0, r5)
            r0 = 35
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r8)
            r6.putAll(r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 713(0x2c9, float:9.99E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r2, r6, r3, r1, r0)
        L_0x0066:
            r0.A07()
            r0.A0C(r2)
            return
        L_0x006d:
            if (r24 == 0) goto L_0x007c
        L_0x006f:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36314893383502721(0x810434002e0b81, double:3.0290230318411176E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0089
        L_0x007c:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36317749533742582(0x8106cd000015f6, double:3.0308292727535995E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x00c2
        L_0x0089:
            if (r26 != 0) goto L_0x00c2
            r0 = 36327511994481124(0x810fae000139e4, double:3.0370030922349276E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x00c2
            X.JaN r0 = X.JW1.A00(r3)
            r0.A03(r4)
            r1 = 10
            X.FZf r0 = new X.FZf
            r0.<init>(r2, r1)
            X.36U r3 = X.AnonymousClass36R.A00(r2, r3, r0)
            X.36W r2 = X.AnonymousClass36W.FOLLOWERS_SHARE
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "targetGroupProfile"
            X.Dbb.A0n(r1, r7, r4, r0, r5)
            r0 = 35
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r5)
            X.EXF r0 = X.EXF.A0J
            r3.A04(r1, r0, r2)
            return
        L_0x00c2:
            X.JaN r0 = X.JW1.A00(r3)
            r0.A03(r4)
            r0 = 2342160758747567607(0x208106cd000215f7, double:4.0636776758639254E-152)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x00e2
            if (r26 != 0) goto L_0x00e2
            r0 = 36327511994481124(0x810fae000139e4, double:3.0370030922349276E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r6 = 1
            if (r0 == 0) goto L_0x00e3
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            boolean r0 = r2 instanceof X.2Zg
            if (r0 == 0) goto L_0x011d
            if (r25 != 0) goto L_0x011d
            X.2Zg r2 = (X.2Zg) r2
            X.8jC r1 = X.C363138jC.A00
            X.8aL[] r0 = new X.C358088aL[r5]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r12 = X.C358098aM.A00(r1, r0)
            r12.A00 = r6
            r11 = 0
            r0 = 3804(0xedc, float:5.33E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.instagram.ui.swipenavigation.PositionConfig r10 = new com.instagram.ui.swipenavigation.PositionConfig
            r13 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r26 = r9
            r25 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.FLD(r10)
            return
        L_0x011d:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r5 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "targetGroupProfile"
            X.Dbb.A0n(r1, r7, r4, r0, r6)
            r0 = 35
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r8)
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r2, r1, r3, r5, r0)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49805F7r.A01(android.app.Activity, X.28D, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.recipients.PendingRecipient, boolean, boolean):void");
    }
}
