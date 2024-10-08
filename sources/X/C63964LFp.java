package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LFp  reason: case insensitive filesystem */
public final class C63964LFp {
    public final Activity A00;
    public final C2356030m A01;
    public final UserSession A02;

    public C63964LFp(Activity activity, C2356030m r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r14 != false) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.DialogInterface.OnCancelListener r26, android.content.DialogInterface.OnDismissListener r27, androidx.fragment.app.Fragment r28, X.C62574Ki7 r29, X.C66538MVs r30, X.AnonymousClass6ZM r31, X.AnonymousClass0iw r32, X.L5V r33) {
        /*
            r25 = this;
            r4 = 1
            r11 = 2
            r23 = r30
            com.instagram.user.model.User r9 = r23.CCd()
            java.lang.String r8 = r23.getMediaId()
            boolean r12 = r23.CeS()
            boolean r24 = r23.Cce()
            boolean r7 = r23.CQD()
            boolean r15 = r23.CWU()
            X.0eE r10 = X.AnonymousClass0t1.A01
            r5 = r25
            com.instagram.common.session.UserSession r3 = r5.A02
            com.instagram.user.model.User r0 = r10.A01(r3)
            boolean r14 = X.0qQ.A0K(r9, r0)
            if (r7 == 0) goto L_0x002f
            r13 = 1
            if (r14 == 0) goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            android.app.Activity r2 = r5.A00
            android.content.res.Resources r1 = r2.getResources()
            if (r14 == 0) goto L_0x015d
            r7 = 2131958497(0x7f131ae1, float:1.9553608E38)
            r0 = 2131973650(0x7f135612, float:1.9584342E38)
            if (r12 == 0) goto L_0x0043
            r0 = 2131973651(0x7f135613, float:1.9584344E38)
        L_0x0043:
            if (r24 != 0) goto L_0x0048
            r0 = 2131973649(0x7f135611, float:1.958434E38)
        L_0x0048:
            java.lang.String r0 = r1.getString(r0)
        L_0x004c:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            android.graphics.drawable.LayerDrawable r12 = X.C346697vb.A01(r2)
            r6.add(r12)
            if (r13 != 0) goto L_0x0088
            r12 = 58
            int r19 = X.DbS.A02(r2, r12)
            int r20 = X.DbS.A02(r2, r11)
            int r11 = X.2Yu.A02(r2)
            int r21 = r2.getColor(r11)
            r11 = 2131100246(0x7f060256, float:1.7812868E38)
            int r22 = r2.getColor(r11)
            com.instagram.user.model.User r10 = r10.A01(r3)
            com.instagram.common.typedurl.ImageUrl r17 = r10.Bh3()
            java.lang.String r18 = r32.getModuleName()
            X.3ay r10 = new X.3ay
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.add(r10)
        L_0x0088:
            r10 = 58
            int r21 = X.DbS.A02(r2, r10)
            r20 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            X.3b0 r11 = new X.3b0
            r16 = r11
            r17 = r2
            r19 = r6
            r22 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.8ab r10 = X.DbS.A0X(r2)
            r10.A0i(r11)
            r10.A09(r7)
            r10.A0q(r0)
            r10.A0s(r4)
            r2 = 2131960992(0x7f1324a0, float:1.9558668E38)
            if (r15 == 0) goto L_0x00b8
            r2 = 2131964901(0x7f1333e5, float:1.9566597E38)
        L_0x00b8:
            X.LUg r0 = X.C64216LUg.A00
            r10.A0H(r0, r2)
            r0 = r27
            r10.A0f(r0)
            r0 = r26
            r10.A0B(r0)
            if (r13 == 0) goto L_0x00d7
            boolean r0 = X.JU9.A00(r3)
            if (r0 == 0) goto L_0x00d7
            r2 = 2131956836(0x7f131464, float:1.9550239E38)
            r0 = 23
            X.LV3.A01(r10, r5, r0, r2)
        L_0x00d7:
            r6 = 2131961516(0x7f1326ac, float:1.9559731E38)
            X.FIb r2 = new X.FIb
            r21 = r29
            r19 = r2
            r20 = r4
            r22 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            r0 = r15 ^ 1
            r10.A0M(r2, r6, r0)
            if (r8 == 0) goto L_0x0108
            X.0Tu r0 = X.0Tu.A05
            r6 = 36322912084437662(0x810b7f00002a9e, double:3.034094090601091E-306)
            boolean r0 = X.182.A06(r0, r3, r6)
            if (r0 == 0) goto L_0x0108
            r2 = 2131969669(0x7f134685, float:1.9576267E38)
            X.LUW r0 = new X.LUW
            r6 = r28
            r0.<init>(r6, r5, r8, r4)
            r10.A0I(r0, r2)
        L_0x0108:
            if (r15 == 0) goto L_0x013e
            r2 = 2131956482(0x7f131302, float:1.954952E38)
            java.lang.String r0 = r9.getUsername()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r1, r0, r2)
            X.0qQ.A07(r1)
            r0 = 24
            r2 = r33
            X.LV3 r0 = X.LV3.A00(r2, r0)
        L_0x0120:
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            r10.A0c(r0, r1)
        L_0x0125:
            X.DbT.A1V(r10)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r3)
            java.lang.String r0 = "has_tapped_on_favorites_badge"
            r1.E5T(r0, r4)
            r1.apply()
            r23.BR9()
            r23.CCA()
            r23.BPj()
            return
        L_0x013e:
            if (r14 != 0) goto L_0x0125
            boolean r0 = r9.A1z()
            if (r0 != 0) goto L_0x0125
            r2 = 2131952415(0x7f13031f, float:1.9541272E38)
            java.lang.String r0 = r9.getUsername()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r1, r0, r2)
            X.0qQ.A07(r1)
            r0 = 9
            r2 = r31
            X.LV0 r0 = X.LV0.A00(r9, r2, r0)
            goto L_0x0120
        L_0x015d:
            if (r24 == 0) goto L_0x0198
            r6 = 2131973647(0x7f13560f, float:1.9584336E38)
            if (r12 == 0) goto L_0x0167
            r6 = 2131973648(0x7f135610, float:1.9584338E38)
        L_0x0167:
            java.lang.String r0 = r9.getUsername()
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r0, r6)
            if (r7 == 0) goto L_0x0193
            if (r13 != 0) goto L_0x0193
            r6 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r12 = X.AnonymousClass7TF.A0d(r1, r6)
            android.text.SpannableStringBuilder r0 = X.DbZ.A0B(r0, r12)
            java.lang.String r6 = "https://help.instagram.com/511598247387828"
            android.net.Uri r6 = X.DbT.A09(r6)
            X.Dj7 r7 = new X.Dj7
            r7.<init>(r6)
            java.lang.String r6 = r12.toString()
            X.0qQ.A0A(r0)
            X.AnonymousClass7AV.A03(r0, r7, r6)
        L_0x0193:
            r7 = 2131958496(0x7f131ae0, float:1.9553606E38)
            goto L_0x004c
        L_0x0198:
            if (r7 == 0) goto L_0x01a3
            r6 = 2131973613(0x7f1355ed, float:1.9584267E38)
            if (r13 == 0) goto L_0x0167
            r6 = 2131973614(0x7f1355ee, float:1.9584269E38)
            goto L_0x0167
        L_0x01a3:
            r6 = 2131973646(0x7f13560e, float:1.9584334E38)
            if (r15 == 0) goto L_0x0167
            r6 = 2131973619(0x7f1355f3, float:1.9584279E38)
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63964LFp.A00(android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnDismissListener, androidx.fragment.app.Fragment, X.Ki7, X.MVs, X.6ZM, X.0iw, X.L5V):void");
    }

    public final void A02(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C62574Ki7 ki7, C66538MVs mVs, AnonymousClass6ZM r14, AnonymousClass0iw r15) {
        0qQ.A0B(r14, 3);
        A00((DialogInterface.OnCancelListener) null, onDismissListener, fragment, ki7, mVs, r14, r15, (L5V) null);
    }

    public final void A01(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener) {
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        C358248ab A0X = DbS.A0X(activity);
        A0X.A0q(resources.getString(2131968409));
        A0X.A0H((DialogInterface.OnClickListener) null, 2131960862);
        Dba.A1M(A0X);
        A0X.A0g(onShowListener);
        A0X.A0f(onDismissListener);
        DbT.A1V(A0X);
    }
}
