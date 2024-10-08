package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.I6i  reason: case insensitive filesystem */
public final class C56653I6i {
    public static final C56653I6i A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r6 = r17;
        r7 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r11, android.graphics.drawable.Drawable r12, X.JR4 r13, X.C275524qU r14, X.C53278GlQ r15, X.1Xj r16, X.C230662pz r17, java.lang.Integer r18) {
        /*
            r10 = r14
            r8 = r11
            if (r14 == 0) goto L_0x00dd
            java.lang.String r1 = r14.AnX()
        L_0x0008:
            r3 = r12
            r9 = r13
            r11 = r15
            r15 = r16
            if (r16 == 0) goto L_0x00e0
            java.lang.String r0 = "see_more"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e0
            r6 = r17
            com.instagram.common.session.UserSession r7 = r6.A00
            r0 = r18
            X.3DY r5 = X.C55040HbB.A00(r7, r0)
            X.3DY r0 = X.AnonymousClass3DY.AFI_VIEW_SIMILAR
            if (r5 != r0) goto L_0x00e0
            java.util.Map r2 = r6.A03
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r1.append(r5)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r15.getId()
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.Object r4 = r2.get(r0)
            X.Gz1 r4 = (X.C54077Gz1) r4
            if (r4 == 0) goto L_0x00e0
            java.util.List r0 = X.C230662pz.A00(r4, r6)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00e0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318965010209563(0x8107e8000b1b1b, double:3.031597944965649E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00e0
            r0 = 2131976672(0x7f1361e0, float:1.9590471E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r8, r0)
            X.Ho5 r13 = new X.Ho5
            r14 = r8
            r17 = r4
            r18 = r6
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            X.Hl1 r12 = new X.Hl1
            r12.<init>(r13, r0)
            java.lang.String r1 = ""
            if (r10 == 0) goto L_0x007c
            java.lang.String r5 = r10.B1U()
            if (r5 != 0) goto L_0x007d
        L_0x007c:
            r5 = r1
        L_0x007d:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00e0
            if (r11 == 0) goto L_0x008f
            X.4qU r0 = r11.A01
            if (r0 == 0) goto L_0x008f
            java.lang.String r4 = r0.getText()
            if (r4 != 0) goto L_0x0090
        L_0x008f:
            r4 = r1
        L_0x0090:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00e0
            java.lang.String r1 = r12.A01
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e0
            r7 = 0
            X.IVL r6 = new X.IVL
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Hr6 r2 = new X.Hr6
            r2.<init>()
            r2.A04 = r5
            r0 = 5000(0x1388, float:7.006E-42)
            r2.A00 = r0
            r2.A06 = r1
            r2.A07 = r4
            int r0 = X.2Yu.A05(r8)
            int r1 = r8.getColor(r0)
            r2.A01 = r3
            X.0qQ.A0A(r3)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r1, r0)
            r2.A03 = r6
            X.Hon r1 = r2.A00()
            r0 = 7
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r8, r0)
            com.instagram.base.activity.BaseFragmentActivity r8 = (com.instagram.base.activity.BaseFragmentActivity) r8
            X.3M8 r0 = r8.Bx5()
            r0.A07(r1)
            return
        L_0x00dd:
            r1 = 0
            goto L_0x0008
        L_0x00e0:
            X.6ap r2 = X.DbS.A0a()
            X.C51975G9x.A0y(r8, r3, r2)
            r2.A02()
            java.lang.String r1 = ""
            if (r11 == 0) goto L_0x00f8
            X.4qU r0 = r11.A01
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x00f9
        L_0x00f8:
            r0 = r1
        L_0x00f9:
            r2.A0G = r0
            r7 = 1
            r2.A0L = r7
            r0 = 5000(0x1388, float:7.006E-42)
            r2.A01 = r0
            if (r10 == 0) goto L_0x010b
            java.lang.String r0 = r10.B1U()
            if (r0 == 0) goto L_0x010b
            r1 = r0
        L_0x010b:
            r2.A0D = r1
            X.IVZ r6 = new X.IVZ
            r6.<init>(r7, r8, r9, r10, r11)
            r2.A0A(r6)
            X.DbY.A1N(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56653I6i.A02(android.content.Context, android.graphics.drawable.Drawable, X.JR4, X.4qU, X.GlQ, X.1Xj, X.2pz, java.lang.Integer):void");
    }

    public static final void A00(Context context, Drawable drawable, JR4 jr4, C275524qU r19, C53278GlQ glQ, UserSession userSession, IgLinearLayout igLinearLayout, 1Xj r23, AnonymousClass3W1 r24, C230662pz r25, Integer num, String str, int i) {
        C275524qU r6 = r19;
        if (r19 != null && r6.getText() != null && r6.AnX() != null) {
            Context context2 = context;
            H7X h7x = new H7X(context2, new C53308Glu(Integer.valueOf(i), r6.getText(), str, 2Yu.A07(context2), R.drawable.afi_ini_segmented_pill_background, R.style.afi_ini_segmented_pill_text, 0, 8, 0mk.A02(context2)));
            AnonymousClass0fU.A00(new C56785ICi(context2, drawable, jr4, r6, glQ, userSession, r23, r24, r25, num, 1), h7x);
            IgLinearLayout igLinearLayout2 = igLinearLayout;
            if (igLinearLayout2.getChildCount() < 1) {
                igLinearLayout2.addView(h7x);
            }
        }
    }

    public static final void A01(Context context, Drawable drawable, JR4 jr4, C275524qU r14, C53278GlQ glQ, UserSession userSession, 1Xj r17, AnonymousClass3W1 r18, IgdsButton igdsButton, C230662pz r20, Integer num, String str, boolean z) {
        String str2;
        IgdsButton igdsButton2 = igdsButton;
        if (igdsButton != null) {
            2eS.A01(igdsButton2);
            String str3 = null;
            C275524qU r7 = r14;
            if (r14 != null) {
                str2 = r14.getText();
            } else {
                str2 = null;
            }
            igdsButton2.setContentDescription(str2);
            if (r14 != null) {
                str3 = r14.getText();
            }
            igdsButton2.setText(str3);
            Context context2 = context;
            AnonymousClass0fU.A00(new C56785ICi(context2, drawable, jr4, r7, glQ, userSession, r17, r18, r20, num, 2), igdsButton2);
            if (z) {
                Integer A05 = C14091Tpi.A05(str);
                if (A05 != null) {
                    igdsButton2.A02(C273084lx.START, A05.intValue());
                    igdsButton2.setIconPadding(context2.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                    return;
                }
                return;
            }
            igdsButton2.A02(C273084lx.END, 0);
        }
    }

    public static final void A03(JR4 jr4, C275524qU r2, C53278GlQ glQ) {
        String AnX;
        String str;
        C275524qU r0;
        if (r2 == null || (AnX = r2.AnX()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        jr4.Cl2(AnX);
        C310336ap A0Z = C51975G9x.A0Z();
        if (glQ == null || (r0 = glQ.A01) == null) {
            str = null;
        } else {
            str = r0.B1U();
        }
        A0Z.A0D = str;
        A0Z.A0A(new C65357Lrx(1));
        DbY.A1N(A0Z);
    }

    public static final void A04(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4, Integer num, String str) {
        Integer num2;
        AnonymousClass2yJ.A00(AnonymousClass05K.A09);
        if (0qQ.A0K(str, "see_more")) {
            num2 = AnonymousClass05K.A0B;
        } else {
            if (0qQ.A0K(str, "see_less")) {
                num2 = AnonymousClass05K.A0A;
            }
            if (0qQ.A0K(str, "see_more") && r3 != null && r4 != null && num == AnonymousClass05K.A0C) {
                C55040HbB.A00(userSession, num);
                return;
            }
            return;
        }
        AnonymousClass2yJ.A00(num2);
        if (0qQ.A0K(str, "see_more")) {
        }
    }
}
