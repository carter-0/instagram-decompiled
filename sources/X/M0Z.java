package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class M0Z implements C66519MUx {
    public static final C19260WRt A0O = new C19260WRt("KEY_VIEWER_LIST_DIVIDER");
    public int A00;
    public C62552Khi A01;
    public C60949Ju7 A02;
    public Integer A03;
    public List A04 = 0sn.A00;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final QP7 A09;
    public final UserSession A0A;
    public final AnonymousClass3NV A0B;
    public final C62260Kcu A0C;
    public final Boolean A0D;
    public final String A0E;
    public final List A0F = AnonymousClass7TE.A1C();
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final AnonymousClass2t9 A0N;

    /* JADX WARNING: type inference failed for: r0v19, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.2tF, java.lang.Object] */
    public M0Z(Context context, AnonymousClass0iw r5, UserSession userSession, AnonymousClass3NV r7, C62260Kcu kcu, Boolean bool, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        QP7 qp7;
        0qQ.A0B(userSession, 2);
        this.A08 = context;
        this.A0A = userSession;
        this.A05 = z;
        this.A0H = z2;
        this.A0L = z3;
        this.A0J = z4;
        this.A0I = z5;
        this.A0M = z6;
        this.A0K = z7;
        this.A0G = z8;
        this.A0B = r7;
        this.A0C = kcu;
        this.A0E = str;
        this.A0D = bool;
        C257443xP r0 = (C257443xP) ((C70599OCw) LKG.A01(userSession).A01.getValue()).A00.A0X();
        if (r0 != null) {
            qp7 = (QP7) r0.A04();
        } else {
            qp7 = null;
        }
        this.A09 = qp7;
        LKG.A01(userSession).A01.getValue();
        AnonymousClass2tC A0K2 = JTT.A0K(context, r5, userSession);
        A0K2.A01(new EGA(context, r5));
        A0K2.A01(new C61629KFf(context, r5));
        A0K2.A01(new Object());
        A0K2.A01(new Object());
        A0K2.A01(new C61638KFo(context, r5, (C63680L2q) null));
        A0K2.A01(new C61630KFg(context, (C63679L2p) null));
        A0K2.A02 = new C64739LhG(this);
        A0K2.A08 = true;
        this.A0N = A0K2.A00();
        A04(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.WSf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.WSe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.WSe} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C232262tL A00(android.graphics.Typeface r19, android.graphics.drawable.Drawable r20, android.graphics.drawable.Drawable r21, android.text.SpannableStringBuilder r22, android.view.View.OnClickListener r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            r18 = this;
            r7 = 0
            r8 = 0
            r10 = 1
            r1 = r18
            boolean r0 = r1.A07
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            r9 = r25
            if (r0 == 0) goto L_0x0041
            if (r25 == 0) goto L_0x003f
            android.content.Context r0 = r1.A08
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131100341(0x7f0602b5, float:1.781306E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x0026:
            if (r26 == 0) goto L_0x003c
            X.Njo r13 = X.C69349Njo.TYPE_CHEVRON
        L_0x002a:
            X.WSe r0 = new X.WSe
            r8 = r0
            r9 = r2
            r10 = r4
            r11 = r5
            r12 = r7
            r15 = r7
            r16 = r6
            r17 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0039:
            X.2tL r0 = (X.C232262tL) r0
            return r0
        L_0x003c:
            X.Njo r13 = X.C69349Njo.TYPE_UNKNOWN
            goto L_0x002a
        L_0x003f:
            r14 = 0
            goto L_0x0026
        L_0x0041:
            X.WSf r0 = new X.WSf
            r1 = r19
            r3 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0Z.A00(android.graphics.Typeface, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.text.SpannableStringBuilder, android.view.View$OnClickListener, java.lang.String, boolean, boolean):X.2tL");
    }

    private final C232262tL A01(Drawable drawable, View.OnClickListener onClickListener, String str) {
        return A00((Typeface) null, drawable, (Drawable) null, (SpannableStringBuilder) null, onClickListener, str, false, false);
    }

    public final int Ap7(int i, int i2) {
        return 0;
    }

    public final int By6(int i, int i2) {
        return 2;
    }

    public static void A03(Drawable drawable, M0Z m0z, String str, List list, int i) {
        list.add(m0z.A01(drawable, new LY5(m0z, i), str));
    }

    public static final void A04(M0Z m0z) {
        String str;
        String str2;
        String str3;
        ImageUrl imageUrl;
        String quantityString;
        String str4;
        String str5;
        M0Z m0z2 = m0z;
        AnonymousClass2t9 r27 = m0z2.A0N;
        ViewModelListUpdate A0R = DbS.A0R();
        List list = m0z2.A0F;
        list.clear();
        if (m0z2.A0I) {
            list.add(new C71971Otw(AnonymousClass7TE.A16(m0z2.A08, 2131954156), (Integer) null));
        }
        QP7 qp7 = m0z2.A09;
        UserSession userSession = m0z2.A0A;
        if (m0z2.A0J) {
            SpannableStringBuilder A0E2 = C51965G9l.A0E();
            Context context = m0z2.A08;
            A0E2.append(context.getString(2131969630));
            DbV.A1D(A0E2, AnonymousClass7TE.A16(context, 2131964884));
            M0Z m0z3 = m0z2;
            list.add(m0z3.A00(Typeface.DEFAULT, C61360ml.A00(context, R.drawable.instagram_warning_pano_outline_24), (Drawable) null, A0E2, LY5.A00(m0z2, 30), (String) null, true, false));
        }
        C60949Ju7 ju7 = m0z2.A02;
        if (!(ju7 == null || (str4 = ju7.A02) == null || (str5 = ju7.A03) == null)) {
            User user = ju7.A00;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36312415184421993L)) {
                list.add(m0z2.A02(user, ju7.A01, str4, str5));
            }
        }
        boolean z = m0z2.A0G;
        if (z) {
            Context context2 = m0z2.A08;
            String A16 = AnonymousClass7TE.A16(context2, 2131969634);
            SpannableStringBuilder A0C2 = DbS.A0C(DbY.A0c(context2, A16, 2131969633));
            DbV.A1D(A0C2, A16);
            list.add(m0z2.A00((Typeface) null, C61360ml.A00(context2, R.drawable.instagram_creator_experience_assets_badges_onboarding_qp_illustration_android), (Drawable) null, A0C2, LY5.A00(m0z2, 34), (String) null, false, false));
        }
        User user2 = (User) 00k.A0O(m0z2.A04, 0);
        if (user2 != null) {
            User user3 = (User) 00k.A0O(m0z2.A04, 1);
            String username = user2.getUsername();
            ImageUrl Bh3 = user2.Bh3();
            if (user3 != null) {
                str3 = user3.getUsername();
                imageUrl = user3.Bh3();
            } else {
                str3 = "";
                imageUrl = null;
            }
            SpannableStringBuilder A0E3 = C51965G9l.A0E();
            if (m0z2.A00 != 2 || imageUrl == null) {
                Resources resources = m0z2.A08.getResources();
                int i = m0z2.A00;
                quantityString = resources.getQuantityString(R.plurals.post_live_viewer_count, i, new Object[]{username, str3, Integer.valueOf(i - 2)});
            } else {
                quantityString = DbV.A0u(m0z2.A08, username, str3, 2131969650);
            }
            A0E3.append(quantityString);
            DbV.A1D(A0E3, username);
            if (!TextUtils.isEmpty(str3)) {
                DbV.A1D(A0E3, str3);
            }
            list.add(new WSV(A0E3, Bh3, imageUrl, m0z2.A03));
        }
        if (m0z2.A05) {
            Context context3 = m0z2.A08;
            A03(C61360ml.A00(context3, R.drawable.instagram_shield_pano_outline_24), m0z2, context3.getString(2131965270), list, 33);
        }
        C60949Ju7 ju72 = m0z2.A02;
        if (!(ju72 == null || (str = ju72.A02) == null || (str2 = ju72.A03) == null)) {
            User user4 = ju72.A00;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36312415184421993L)) {
                list.add(m0z2.A02(user4, ju72.A01, str, str2));
                Integer A0l = 00y.A0l(str2);
                if (!(A0l == null || A0l.intValue() == 0 || m0z2.A06)) {
                    Context context4 = m0z2.A08;
                    A03(C61360ml.A00(context4, R.drawable.instagram_new_story_pano_outline_24), m0z2, context4.getString(2131969631), list, 29);
                }
            }
        }
        if (qp7 != null || m0z2.A02 != null || AnonymousClass7TE.A1b(m0z2.A04) || z) {
            list.add(A0O);
        }
        if (!m0z2.A0L && !m0z2.A0K) {
            if (m0z2.A0B != AnonymousClass3NV.A07 && 182.A06(0Tu.A05, userSession, 36311650680177344L)) {
                Context context5 = m0z2.A08;
                M0Z m0z4 = m0z2;
                list.add(m0z4.A00((Typeface) null, C61360ml.A00(context5, R.drawable.instagram_insights_pano_outline_24), C61360ml.A00(context5, R.drawable.instagram_chevron_right_pano_outline_16), (SpannableStringBuilder) null, LY5.A00(m0z2, 37), context5.getString(2131969649), false, true));
            }
            if (m0z2.A01 == C62552Khi.ARCHIVE) {
                Context context6 = m0z2.A08;
                A03(C61360ml.A00(context6, R.drawable.instagram_history_pano_outline_24), m0z2, context6.getString(2131965140), list, 36);
            }
        }
        Context context7 = m0z2.A08;
        A03(C61360ml.A00(context7, R.drawable.instagram_delete_pano_outline_24), m0z2, context7.getString(2131965137), list, 31);
        if (m0z2.A0M) {
            A03(C61360ml.A00(context7, R.drawable.instagram_heart_pano_outline_24), m0z2, context7.getString(2131969638), list, 35);
        }
        if (m0z2.A0H) {
            list.add(A0O);
            list.add(new C71971Otw(AnonymousClass7TE.A16(context7, 2131969647), m0z2.A03));
        }
        if (m0z2.A0B == AnonymousClass3NV.A07 && AnonymousClass7TF.A1Y(m0z2.A0D, false)) {
            A03(C61360ml.A00(context7, R.drawable.instagram_live_pano_outline_24), m0z2, context7.getString(2131969639), list, 32);
        }
        A0R.A01(list);
        r27.A05(A0R);
    }

    public final AnonymousClass2t9 BkO() {
        return this.A0N;
    }

    private final C64807LiS A02(User user, Integer num, String str, String str2) {
        String string;
        int intValue;
        String id = user.getId();
        ImageUrl Bh3 = user.Bh3();
        Context context = this.A08;
        Integer A0l = 00y.A0l(str2);
        if (A0l == null || (intValue = A0l.intValue()) == 0) {
            string = context.getString(2131969636);
        } else {
            string = context.getResources().getQuantityString(R.plurals.post_live_broadcaster_user_pay_summary_info, intValue, C51968G9o.A1Z(str, intValue));
        }
        0qQ.A0A(string);
        return new C64807LiS((SpannableStringBuilder) null, Bh3, new L8Z(this, num, str, str2), this.A03, id, string, context.getResources().getString(2131969635));
    }
}
