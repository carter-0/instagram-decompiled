package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.Dfm  reason: case insensitive filesystem */
public final class C46483Dfm {
    public final Context A00;
    public final UserSession A01;
    public final 1Ou A02;
    public final C46484Dfn A03;
    public final User A04;
    public final AnonymousClass0iw A05;
    public final 2Dm A06;

    public C46483Dfm(Context context, AnonymousClass0iw r3, UserSession userSession, 1Ou r5, 2Dm r6, C46484Dfn dfn, User user) {
        0qQ.A0B(r6, 4);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = r3;
        this.A06 = r6;
        this.A02 = r5;
        this.A03 = dfn;
        this.A04 = user;
    }

    public final boolean A00(Fragment fragment, C51871G5i g5i, DirectThreadKey directThreadKey, String str) {
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey2, 2);
        AnonymousClass3U9 A032 = 2Dr.A03(this.A06, directThreadKey2);
        User A052 = AnonymousClass48N.A05(A032);
        if (A032 == null || A052 == null) {
            return false;
        }
        boolean isPending = A032.isPending();
        boolean CUG = A032.CUG();
        boolean contains = A032.AZs().contains(this.A01.A06);
        boolean A012 = C66640Ma9.A01(A032);
        return A01(fragment, g5i, A052, str, C66647MaG.A0A(directThreadKey2), A032.C6a(), false, isPending, CUG, contains, A012);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(androidx.fragment.app.Fragment r26, X.C51871G5i r27, X.AnonymousClass170 r28, java.lang.String r29, java.lang.String r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            r25 = this;
            r0 = 1
            r23 = r28
            boolean r1 = r23.CXO()
            if (r1 != 0) goto L_0x01cd
            boolean r1 = r23.CXR()
            if (r1 == 0) goto L_0x01cd
            r1 = r25
            X.0iw r2 = r1.A05
            java.lang.String r12 = r2.getModuleName()
            int r19 = r23.BIW()
            com.instagram.user.model.FollowStatus r5 = r23.B6o()
            java.lang.String r13 = "pseudo_block_warning_card"
            r9 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r33)
            r3 = r34
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r4 = r29
            if (r29 == 0) goto L_0x01c8
            int r2 = r4.hashCode()
            switch(r2) {
                case 100344454: goto L_0x01bc;
                case 207788079: goto L_0x01b0;
                case 216169857: goto L_0x01a4;
                case 523198058: goto L_0x0198;
                case 1813209097: goto L_0x0195;
                default: goto L_0x0037;
            }
        L_0x0037:
            X.EZf r4 = X.C48137EZf.DEFAULT
        L_0x0039:
            r2 = r32
            X.76k r8 = X.C3263476j.A00(r2, r3)
            if (r32 == 0) goto L_0x0191
            X.EZZ r2 = X.EZZ.SECURE_OVER_WA_PSEUDO_BLOCK_WARNING
        L_0x0043:
            java.lang.String r14 = r5.name()
            java.lang.String r16 = r4.name()
            java.lang.String r17 = r2.name()
            java.lang.String r18 = X.AnonymousClass7TF.A0b()
            X.FFp r7 = new X.FFp
            r15 = r30
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r14 = r1.A01
            java.lang.String r2 = r23.getId()
            r3 = 2
            X.0qQ.A0B(r2, r3)
            X.F1O r10 = X.C49279EsO.A00
            X.0xG r13 = X.C49936FFp.A00(r7)
            int r6 = r7.A00
            java.lang.String r5 = r7.A0A
            X.0qQ.A07(r5)
            java.lang.String r4 = r7.A07
            X.0qQ.A07(r4)
            java.lang.String r3 = r7.A0B
            X.76k r11 = r7.A01
            X.Nlp r12 = r7.A02
            java.lang.String r16 = "impression"
            r15 = r9
            r17 = r2
            r18 = r5
            r19 = r4
            r20 = r3
            r21 = r6
            r22 = r0
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = X.C49936FFp.A01(r7)
            if (r3 == 0) goto L_0x00b8
            X.0xG r12 = X.C49936FFp.A00(r7)
            int r5 = r7.A00
            java.lang.String r4 = r7.A0A
            java.lang.String r3 = r7.A05
            X.EZf r10 = X.C48137EZf.valueOf(r3)
            java.lang.String r3 = r7.A06
            X.EZZ r11 = X.EZZ.valueOf(r3)
            com.google.common.collect.ImmutableMap r16 = X.C49962FGu.A00(r7)
            r15 = r4
            r17 = r0
            r18 = r5
            r19 = r0
            r13 = r14
            r14 = r2
            X.C49760F5m.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00b8:
            X.EwG r3 = new X.EwG
            r4 = r31
            r2 = r35
            r3.<init>(r2, r4)
            X.Dfn r6 = r1.A03
            X.F0F r2 = new X.F0F
            r19 = r26
            r21 = r27
            r18 = r2
            r20 = r3
            r22 = r1
            r24 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1 = 48
            X.FJi r5 = X.C50023FJi.A00(r2, r1)
            r1 = 47
            X.FJi r4 = X.C50023FJi.A00(r2, r1)
            android.content.Context r1 = r6.A00
            X.8ab r3 = X.DbS.A0Y(r1)
            X.Dfo r2 = r6.A02
            int r1 = r23.BIW()
            r9 = 0
            if (r36 == 0) goto L_0x0162
            if (r1 != 0) goto L_0x015c
            java.lang.String r1 = r23.getFullName()
            if (r1 == 0) goto L_0x0156
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0156
            android.content.Context r8 = r2.A00
            r7 = 2131970926(0x7f134b6e, float:1.9578817E38)
        L_0x0102:
            java.lang.String r2 = r23.getFullName()
            java.lang.String r1 = r23.getUsername()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
        L_0x010e:
            java.lang.String r1 = r8.getString(r7, r2)
            X.0qQ.A0A(r1)
            r3.A05 = r1
            int r1 = r23.BIW()
            r2 = 2131970929(0x7f134b71, float:1.9578823E38)
            if (r1 != 0) goto L_0x0151
            java.lang.String r1 = r23.getUsername()
        L_0x0124:
            java.lang.String r1 = X.DbW.A0h(r8, r1, r2)
            X.0qQ.A0A(r1)
            r3.A0q(r1)
            com.instagram.common.typedurl.ImageUrl r2 = r23.Bh3()
            X.0iw r1 = r6.A01
            r3.A0n(r2, r1)
            r2 = 2131958466(0x7f131ac2, float:1.9553545E38)
            X.8ae r1 = X.C358278ae.DEFAULT
            r3.A0Q(r5, r1, r2)
            r1 = 2131970933(0x7f134b75, float:1.9578831E38)
            if (r36 == 0) goto L_0x0147
            r1 = 2131970934(0x7f134b76, float:1.9578833E38)
        L_0x0147:
            r3.A0G(r4, r1)
            r3.A05()
            X.DbT.A1V(r3)
            return r0
        L_0x0151:
            java.lang.String r1 = r23.getFullName()
            goto L_0x0124
        L_0x0156:
            android.content.Context r8 = r2.A00
            r7 = 2131970928(0x7f134b70, float:1.957882E38)
            goto L_0x0187
        L_0x015c:
            android.content.Context r8 = r2.A00
            r7 = 2131970927(0x7f134b6f, float:1.9578819E38)
            goto L_0x017b
        L_0x0162:
            if (r1 != 0) goto L_0x0176
            java.lang.String r1 = r23.getFullName()
            if (r1 == 0) goto L_0x0182
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0182
            android.content.Context r8 = r2.A00
            r7 = 2131970930(0x7f134b72, float:1.9578825E38)
            goto L_0x0102
        L_0x0176:
            android.content.Context r8 = r2.A00
            r7 = 2131970931(0x7f134b73, float:1.9578827E38)
        L_0x017b:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = r23.getFullName()
            goto L_0x018d
        L_0x0182:
            android.content.Context r8 = r2.A00
            r7 = 2131970932(0x7f134b74, float:1.957883E38)
        L_0x0187:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = r23.getUsername()
        L_0x018d:
            r2[r9] = r1
            goto L_0x010e
        L_0x0191:
            X.EZZ r2 = X.EZZ.PSEUDO_BLOCK_WARNING
            goto L_0x0043
        L_0x0195:
            java.lang.String r2 = "more_menu"
            goto L_0x019a
        L_0x0198:
            java.lang.String r2 = "message_button"
        L_0x019a:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0037
            X.EZf r4 = X.C48137EZf.PROFILE
            goto L_0x0039
        L_0x01a4:
            java.lang.String r2 = "inbox_search"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0037
            X.EZf r4 = X.C48137EZf.SEARCH
            goto L_0x0039
        L_0x01b0:
            java.lang.String r2 = "inbox_new_message"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0037
            X.EZf r4 = X.C48137EZf.INBOX_NEW_MESSAGE
            goto L_0x0039
        L_0x01bc:
            java.lang.String r2 = "inbox"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0037
            X.EZf r4 = X.C48137EZf.INBOX_THREAD_LIST
            goto L_0x0039
        L_0x01c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01cd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46483Dfm.A01(androidx.fragment.app.Fragment, X.G5i, X.170, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):boolean");
    }
}
