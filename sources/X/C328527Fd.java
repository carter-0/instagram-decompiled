package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* renamed from: X.7Fd  reason: invalid class name and case insensitive filesystem */
public abstract class C328527Fd {
    public static C331847Sp A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (X.182.A06(r5, r14, r0) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r5 != X.2FW.A1g) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r2 != X.2FW.A1g) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        if (r1 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012f, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36325613619852380L) == false) goto L_0x0133;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C376679Ix A00(android.content.Context r13, com.instagram.common.session.UserSession r14, X.AnonymousClass7LQ r15, int r16, int r17) {
        /*
            X.3su r8 = r15.A0e
            X.7SD r2 = r15.A0G
            int r4 = r2.A01
            java.lang.String r0 = r8.A0g()
            r3 = 0
            r7 = r14
            if (r0 == 0) goto L_0x005c
            int r1 = r2.A08
            r0 = 29
            if (r1 != r0) goto L_0x005c
            boolean r0 = A0F(r15)
            if (r0 == 0) goto L_0x005c
            boolean r12 = r2.A0n
            X.7SD r0 = r15.A0G
            int r11 = r0.A08
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.util.List r10 = r0.A0b
            boolean r0 = X.AnonymousClass7FO.A01(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x005c
            X.9HW r5 = X.AnonymousClass9HV.A00(r14)
            X.3t0 r1 = r8.A0U()
            r0 = 5
            boolean r0 = r5.A00(r1, r0)
            X.0Tu r5 = X.0Tu.A05
            if (r0 == 0) goto L_0x0056
            r0 = 36319407395380563(0x81084f00411d53, double:3.031877711129132E-306)
        L_0x0042:
            boolean r0 = X.182.A06(r5, r14, r0)
            if (r0 == 0) goto L_0x005c
        L_0x0048:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = r8.A0V()
            X.9Ix r0 = new X.9Ix
            r4 = r16
            r2 = r17
            r0.<init>(r1, r3, r4, r2)
            return r0
        L_0x0056:
            r0 = 36319407395118415(0x81084f003d1d4f, double:3.031877710963348E-306)
            goto L_0x0042
        L_0x005c:
            java.lang.String r0 = r8.A0g()
            if (r0 == 0) goto L_0x00ea
            int r1 = r2.A08
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 == r0) goto L_0x006c
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 != r0) goto L_0x00ea
        L_0x006c:
            boolean r12 = r2.A0n
            X.7SD r0 = r15.A0G
            int r11 = r0.A08
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.util.List r10 = r0.A0b
            boolean r0 = X.AnonymousClass7FO.A01(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x00ea
            X.7AG r0 = r8.A0Q
            if (r0 == 0) goto L_0x00ea
            X.2FW r5 = r8.A10
            boolean r0 = r15.A0W
            if (r0 == 0) goto L_0x008d
            X.2FW r0 = X.2FW.A1g
            r1 = 1
            if (r5 == r0) goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            X.2FW r0 = X.2FW.A1A
            if (r5 == r0) goto L_0x0094
            if (r1 == 0) goto L_0x00ea
        L_0x0094:
            X.7SD r0 = r15.A0G
            int r1 = r0.A08
            r0 = 1014(0x3f6, float:1.421E-42)
            X.0Tu r5 = X.0Tu.A05
            if (r1 != r0) goto L_0x00e4
            r0 = 36327065318406284(0x810f460009388c, double:3.0367206124865786E-306)
        L_0x00a3:
            boolean r1 = X.182.A06(r5, r14, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x00ea
            r0 = 36327065318865042(0x810f4600103892, double:3.036720612776699E-306)
            boolean r0 = X.182.A06(r5, r14, r0)
            if (r0 == 0) goto L_0x0048
            X.1Av r6 = X.1Au.A00(r14)
            java.lang.String r2 = "preference_snippet_shortcut_tooltip_shown_count"
            r1 = 0
            X.0xa r0 = r6.A01
            int r4 = r0.getInt(r2, r1)
            r0 = 36608540295632603(0x820f46001116db, double:3.214726521493262E-306)
            long r1 = X.182.A01(r5, r14, r0)
            int r0 = (int) r1
            if (r4 >= r0) goto L_0x0048
            int r1 = r4 + 1
            java.lang.String r0 = "preference_share_ai_tooltip_shown_count"
            r6.A0z(r0, r1)
            r0 = 2131975302(0x7f135c86, float:1.9587692E38)
            java.lang.String r3 = r13.getString(r0)
            goto L_0x0048
        L_0x00e4:
            r0 = 36325613619524695(0x810df4000a3457, double:3.0358025522683395E-306)
            goto L_0x00a3
        L_0x00ea:
            java.lang.String r0 = r8.A0g()
            if (r0 == 0) goto L_0x0133
            boolean r12 = r2.A0n
            X.7SD r0 = r15.A0G
            int r11 = r0.A08
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.util.List r10 = r0.A0b
            boolean r0 = X.AnonymousClass7FO.A01(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0133
            java.lang.String r1 = X.C3262475z.A00(r14)
            java.lang.String r0 = r8.A1u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0133
            X.7AG r0 = r8.A0Q
            if (r0 == 0) goto L_0x0133
            X.2FW r2 = r8.A10
            boolean r0 = r15.A0W
            if (r0 == 0) goto L_0x011d
            X.2FW r0 = X.2FW.A1g
            r1 = 1
            if (r2 == r0) goto L_0x011e
        L_0x011d:
            r1 = 0
        L_0x011e:
            X.2FW r0 = X.2FW.A1A
            if (r2 == r0) goto L_0x0124
            if (r1 == 0) goto L_0x0133
        L_0x0124:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325613619852380(0x810df4000f345c, double:3.035802552475569E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x0133
            goto L_0x0048
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328527Fd.A00(android.content.Context, com.instagram.common.session.UserSession, X.7LQ, int, int):X.9Ix");
    }

    public static C376679Ix A01(Context context, UserSession userSession, AnonymousClass7LQ r13, AnonymousClass7L2 r14, Boolean bool) {
        int color;
        if (A00 == null) {
            A00 = new C331847Sp(userSession);
        }
        C254703su r5 = r13.A0e;
        C254793t3 r6 = r13.A0G.A0P;
        context.getResources();
        C329967Kx r4 = r14.A04;
        int[] iArr = r4.A0X;
        if (r6 == null || r5.A0Q == null || !182.A06(0Tu.A05, userSession, 36319398802627812L) || r5.A0g() == null || bool.booleanValue()) {
            return null;
        }
        C254793t3 r1 = r13.A0G.A0P;
        String A0g = r5.A0g();
        boolean z = false;
        if (!(r1 == null || A0g == null)) {
            C331847Sp r0 = A00;
            String str = ((C254763t0) r1).A00;
            0qQ.A0B(str, 0);
            if (0qQ.A0K(r0.A00.getString(002.A0R("thread_id_", str), (String) null), A0g)) {
                C331847Sp r2 = A00;
                if (!0qQ.A0K(r2.A00.getString(002.A0R("thread_id_feedback_", str), (String) null), A0g)) {
                    z = true;
                }
            }
        }
        if (!Boolean.valueOf(z).booleanValue()) {
            return null;
        }
        AnonymousClass7AG r02 = r5.A0Q;
        if (r02 != null && r02.A02 == AnonymousClass05K.A01) {
            return null;
        }
        String str2 = ((C254763t0) r6).A00;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(2FW.A0H, r5.A0g(), r5.A0f());
        int i = r4.A0K;
        if (iArr.length > 0) {
            color = iArr[0];
        } else {
            color = context.getColor(2Yu.A0H(context, R.attr.igds_color_gradient_purple));
        }
        return new C376679Ix(directMessageIdentifier, str2, i, color, 0);
    }

    public static AnonymousClass7AE A02(UserSession userSession, AnonymousClass7LQ r4) {
        if (r4.A01 != 0 && 182.A06(0Tu.A05, userSession, 36324677317243117L)) {
            return null;
        }
        C254703su r0 = r4.A0e;
        return new AnonymousClass7AE(new MessageIdentifier(r0.A0h(), r0.A0f()), r4.A01, r4.A0O);
    }

    public static AnonymousClass7AD A03(UserSession userSession, AnonymousClass7LQ r4, int i, int i2) {
        AnonymousClass7FP r3 = (AnonymousClass7FP) userSession.A01(AnonymousClass7FP.class, new C73918Ply(userSession, 43));
        C254703su r2 = r4.A0e;
        0qQ.A07(r2);
        boolean z = r4.A0G.A0r;
        if (r2.A0g() == null || !AnonymousClass7FP.A00(r3, r2, z)) {
            return null;
        }
        String A0g = r2.A0g();
        if (A0g != null) {
            2FW r22 = r2.A10;
            0qQ.A07(r22);
            return new AnonymousClass7AD(r22, A0g, 28D.A2R.toString(), i, i2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static C3265777i A04(UserSession userSession, AnonymousClass7LQ r9, int i, int i2) {
        C254703su r3 = r9.A0e;
        if (!A0F(r9)) {
            return null;
        }
        0qQ.A07(r3);
        AnonymousClass7SD r0 = r9.A0G;
        if (!AnonymousClass7FI.A00(userSession, r3, r0.A08, r0.A1G, r0.A0y) || r3.A0g() == null) {
            return null;
        }
        return new C3265777i(r3.A10, r3.A0g(), i, i2, 0, 0qQ.A0K(userSession.A06, r3.BsI()));
    }

    public static C3255473b A05(Context context, UserSession userSession, AnonymousClass7LQ r20, AnonymousClass7L2 r21) {
        HashMap hashMap;
        String A02;
        2FW r5;
        String str;
        String string;
        int dimensionPixelOffset;
        AnonymousClass7LQ r1 = r20;
        if (!r1.A0Z) {
            AnonymousClass7LQ r6 = r1.A0E;
            if (r6 == null) {
                r6 = r1;
            }
            C254703su r0 = r6.A0e;
            UserSession userSession2 = userSession;
            if (!r0.A1R() || !182.A06(0Tu.A05, userSession2, 36317732356429292L)) {
                int i = 8388611;
                if (r0.A1j(AnonymousClass0t1.A01.A01(userSession2))) {
                    i = 8388613;
                }
                AnonymousClass9I4 r12 = r0.A04;
                Context context2 = context;
                AnonymousClass7L2 r4 = r21;
                if (r12 == null || !r12.A00) {
                    AnonymousClass7AG r13 = r0.A0Q;
                    if (r13 != null && (str = r13.A07) != null && str.equals("source:bm_genai_agent") && !r6.A0U) {
                        string = context2.getString(2131958587);
                        dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                    } else if (!r0.A2F || (r5 = r0.A10) == 2FW.A1T || r5 == 2FW.A1y || r5 == 2FW.A1x || r5 == 2FW.A1e || r5 == 2FW.A20) {
                        String A0E = A0E(context2, userSession2, r6, A0C(context2, userSession2, r6));
                        if (!TextUtils.isEmpty(A0E)) {
                            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                            int i2 = r4.A00;
                            int i3 = r4.A04.A04;
                            DirectMessageIdentifier A0V = r0.A0V();
                            if (r0.A00 == 12 && !C69903Nu5.A00(userSession2)) {
                                ImmutableList A0H = r0.A0H();
                                C62948Kp0 A01 = C59737JVv.A01(userSession2, r0.A1V, 0sn.A00);
                                if (!(A01 == null || (A02 = A01.A02()) == null || A02.equals(""))) {
                                    hashMap = new HashMap();
                                    if (A0H != null) {
                                        C249803kO it = A0H.iterator();
                                        while (it.hasNext()) {
                                            hashMap.put(String.valueOf(((C254873tC) it.next()).A0K), A02);
                                        }
                                    } else {
                                        1Xj r02 = r0.A0s;
                                        if (r02 != null) {
                                            hashMap.put(r02.getId(), A02);
                                        }
                                    }
                                    return new C3255473b(A0V, A0E, (String) null, (String) null, hashMap, dimensionPixelOffset2, i, i2, i3);
                                }
                            }
                            hashMap = null;
                            return new C3255473b(A0V, A0E, (String) null, (String) null, hashMap, dimensionPixelOffset2, i, i2, i3);
                        }
                    } else {
                        String A0E2 = A0E(context2, userSession2, r6, O0S.A00(context2, userSession2, r6));
                        if (!TextUtils.isEmpty(A0E2)) {
                            return new C3255473b(r0.A0V(), A0E2, r0.A1Z, r0.A1a, (HashMap) null, 12, i, r4.A00, r4.A04.A04);
                        }
                    }
                } else {
                    string = context2.getString(2131958665);
                    dimensionPixelOffset = 12;
                }
                return new C3255473b(r0.A0V(), string, (String) null, (String) null, (HashMap) null, dimensionPixelOffset, i, r4.A00, r4.A04.A04);
            }
        }
        return null;
    }

    public static AnonymousClass7AC A06(UserSession userSession, AnonymousClass7LQ r8, int i, int i2) {
        Integer num;
        boolean z;
        C254703su r2 = r8.A0e;
        String str = null;
        if (r2.A0g() != null) {
            String A0g = r2.A0g();
            if (r2.A1T != null) {
                synchronized (r2) {
                    z = r2.A2E;
                }
                if (z && r2.A10 != 2FW.A1i) {
                    if (C308556Us.A0U(r8.A0G.A0H)) {
                        num = r2.A1T() ? AnonymousClass05K.A01 : AnonymousClass05K.A0N;
                    } else if (C308556Us.A05(userSession)) {
                        num = AnonymousClass05K.A00;
                    }
                    return new AnonymousClass7AC(num, str, r2.A1u, A0g, i, i2);
                }
            }
            if (r2.A10 == 2FW.A1s && !r2.A1S() && 182.A06(0Tu.A05, userSession, 36322594256857379L)) {
                num = AnonymousClass05K.A0C;
                C254873tC A01 = C3266377o.A01(r2);
                if (A01 != null) {
                    str = A01.A0u;
                }
                return new AnonymousClass7AC(num, str, r2.A1u, A0g, i, i2);
            }
        }
        return null;
    }

    public static C328557Fg A08(AnonymousClass7LQ r4, Integer num) {
        int i;
        C328547Ff r3;
        ImageUrl Bh3;
        User user = r4.A0K;
        if (num != null) {
            i = num.intValue();
        } else {
            i = r4.A00;
        }
        if (i != 0) {
            if (i != 4) {
                r3 = AnonymousClass7GB.A00;
            }
            r3 = C328537Fe.A00;
        } else {
            if (user != null) {
                r3 = new AnonymousClass7G5(MessagingUser.A00(user), AnonymousClass50n.A07(user));
                Bh3 = user.Bh3();
                return new C328557Fg(Bh3, r3, r4.A0G.A0r);
            }
            r3 = C328537Fe.A00;
        }
        if (user == null) {
            Bh3 = null;
            return new C328557Fg(Bh3, r3, r4.A0G.A0r);
        }
        Bh3 = user.Bh3();
        return new C328557Fg(Bh3, r3, r4.A0G.A0r);
    }

    public static AnonymousClass7AA A09(UserSession userSession, AnonymousClass9HC r14, AnonymousClass7LQ r15, C329967Kx r16) {
        C254703su r5 = r15.A0e;
        DirectMessageComments directMessageComments = r5.A0q;
        C254793t3 r4 = r15.A0G.A0P;
        if (directMessageComments == null || r5.A0g() == null || r4 == null) {
            return null;
        }
        UserSession userSession2 = userSession;
        if (!AnonymousClass9HV.A00(userSession).A00(r4, 44) || 182.A06(0Tu.A05, userSession, 36319407392628013L)) {
            return null;
        }
        return new AnonymousClass7AA(userSession2, r14, r16, new MessageIdentifier(r5.A0g(), r5.A0f()), C300965yF.A01(r4).A00, directMessageComments.A01, directMessageComments.A00, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        if (r11 == false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x039a, code lost:
        if (r0.isEmpty() != false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05b1, code lost:
        if (r3.isEmpty() != false) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (X.182.A06(X.0Tu.A05, r28, 36319407392628013L) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021d, code lost:
        if (r11 == false) goto L_0x021f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0334 A[EDGE_INSN: B:211:0x0334->B:109:0x0334 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7A9 A0A(android.content.Context r59, com.instagram.common.session.UserSession r60, X.AnonymousClass9HC r61, X.AnonymousClass7LQ r62, X.C329967Kx r63, boolean r64) {
        /*
            r4 = r62
            X.7SD r3 = r4.A0G
            int r7 = r3.A08
            r0 = 29
            r1 = 0
            if (r7 != r0) goto L_0x000c
            r1 = 1
        L_0x000c:
            boolean r13 = X.AnonymousClass48O.A03(r7)
            r28 = r60
            X.C331057Pi.A00(r28)
            X.3Tu r0 = r3.A0H
            boolean r6 = X.C331057Pi.A02(r0)
            int r0 = r4.A06
            if (r0 == 0) goto L_0x00e2
            if (r1 != 0) goto L_0x0030
            X.0Tu r5 = X.0Tu.A05
            r1 = 36320266385039501(0x8109170007208d, double:3.032420939648318E-306)
            r0 = r28
            boolean r0 = X.182.A06(r5, r0, r1)
            if (r0 == 0) goto L_0x00e2
        L_0x0030:
            r1 = 1
        L_0x0031:
            int r0 = r4.A06
            if (r0 == 0) goto L_0x0038
            r10 = 0
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r10 = 1
        L_0x0039:
            r0 = r28
            boolean r0 = X.AnonymousClass7FS.A00(r0, r7, r6)
            r29 = 0
            if (r0 == 0) goto L_0x05d0
            X.3su r5 = r4.A0e
            boolean r11 = r4.A0X
            X.2FW r0 = r5.A10
            r33 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r5.C7c()
            long r40 = r2.toMillis(r0)
            java.lang.String r0 = r5.A0g()
            if (r0 != 0) goto L_0x00d1
            r26 = r29
        L_0x005d:
            X.3t3 r2 = r3.A0P
            if (r2 == 0) goto L_0x00ce
            X.3t0 r0 = X.C300965yF.A01(r2)
            java.lang.String r0 = r0.A00
            r55 = r0
        L_0x0069:
            com.instagram.direct.model.comments.DirectMessageComments r7 = r5.A0q
            X.9HW r1 = X.AnonymousClass9HV.A00(r28)
            r0 = 44
            boolean r0 = r1.A00(r2, r0)
            if (r0 == 0) goto L_0x0087
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319407392628013(0x81084f00171d2d, double:3.031877709388408E-306)
            r2 = r28
            boolean r0 = X.182.A06(r3, r2, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0088
        L_0x0087:
            r9 = 0
        L_0x0088:
            r0 = r28
            boolean r44 = X.AnonymousClass7FH.A00(r0, r4)
            if (r7 == 0) goto L_0x00ca
            java.lang.String r6 = r7.A01
            int r7 = r7.A00
        L_0x0094:
            r1 = r59
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r3 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r25 = X.AnonymousClass0nB.A01(r1)
            int r25 = r25 - r3
            int r25 = r25 - r0
            X.0Tu r8 = X.0Tu.A05
            r2 = 36601741361484096(0x82091700031140, double:3.210426848160636E-306)
            r0 = r28
            long r2 = X.182.A01(r8, r0, r2)
            int r12 = (int) r2
            r30 = r61
            r42 = r64
            if (r13 == 0) goto L_0x03b4
            monitor-enter(r5)
            goto L_0x00e5
        L_0x00ca:
            r6 = r29
            r7 = 0
            goto L_0x0094
        L_0x00ce:
            r55 = r29
            goto L_0x0069
        L_0x00d1:
            java.lang.String r2 = r5.A0g()
            java.lang.String r1 = r5.A0f()
            com.instagram.model.direct.messageid.MessageIdentifier r26 = new com.instagram.model.direct.messageid.MessageIdentifier
            r0 = r26
            r0.<init>(r2, r1)
            goto L_0x005d
        L_0x00e2:
            r1 = 0
            goto L_0x0031
        L_0x00e5:
            java.util.LinkedHashMap r2 = r5.A2U     // Catch:{ all -> 0x05cd }
            java.util.LinkedHashMap r24 = new java.util.LinkedHashMap     // Catch:{ all -> 0x05cd }
            r0 = r24
            r0.<init>(r2)     // Catch:{ all -> 0x05cd }
            monitor-exit(r5)
            int r0 = r24.size()
            r2 = r28
            java.lang.String r2 = r2.A06
            r46 = r2
            com.google.common.collect.ImmutableList r3 = r4.A0A
            r23 = 0
            r4 = 7
            r2 = r33
            X.0qQ.A0B(r2, r4)
            r2 = 10
            X.0qQ.A0B(r3, r2)
            if (r9 == 0) goto L_0x02b0
            if (r6 == 0) goto L_0x02b0
            if (r7 <= 0) goto L_0x02b0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            android.content.res.Resources r7 = r1.getResources()
            X.0qQ.A07(r7)
            r5 = 1
            r4 = 10000(0x2710, float:1.4013E-41)
            r2 = r23
            java.lang.String r7 = X.C253673rC.A04(r7, r8, r4, r5, r2)
            X.7E9 r22 = new X.7E9
            r5 = r63
            r4 = r26
            r2 = r22
            r2.<init>(r5, r4, r6, r7)
        L_0x012d:
            if (r10 == 0) goto L_0x0387
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0387
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            if (r11 != 0) goto L_0x0292
            if (r0 == 0) goto L_0x0292
            r2 = 3
            if (r0 <= r2) goto L_0x0292
            r4 = 2131959224(0x7f131db8, float:1.9555082E38)
            int r2 = r0 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r8 = r1.getString(r4, r2)
            X.0qQ.A07(r8)
            X.7E6 r20 = new X.7E6
            r4 = r20
            r5 = r63
            r6 = r26
            r7 = r55
            r9 = r44
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0164:
            r45 = 0
        L_0x0166:
            if (r22 == 0) goto L_0x028e
            r2 = r22
            java.lang.String r5 = r2.A02
            r2 = 1
            X.0qQ.A0B(r5, r2)
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r19 = r4.getDimensionPixelSize(r2)
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r19 = r19 + r2
            int r2 = X.C66849Mdi.A01(r1, r5)
            int r19 = r19 + r2
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r5 = r2 * 2
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r5 = r5 + r2
            int r19 = r19 + r5
        L_0x01a9:
            if (r20 == 0) goto L_0x028a
            r2 = r20
            java.lang.String r4 = r2.A02
            r2 = 1
            X.0qQ.A0B(r4, r2)
            int r18 = X.C66849Mdi.A01(r1, r4)
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r5 = r2 * 2
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r5 = r5 + r2
            int r18 = r18 + r5
        L_0x01d2:
            if (r45 == 0) goto L_0x0286
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165222(0x7f070026, float:1.7944655E38)
            int r17 = r4.getDimensionPixelSize(r2)
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r4.getDimensionPixelSize(r2)
            int r17 = r17 + r2
        L_0x01ec:
            if (r11 == 0) goto L_0x0283
            int r13 = r24.size()
        L_0x01f2:
            X.3kO r16 = r3.iterator()
            X.0qQ.A07(r16)
            r10 = 0
            r9 = 1
            r8 = 0
        L_0x01fc:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x02b4
            java.lang.Object r2 = r16.next()
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r2 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r2
            if (r8 >= r13) goto L_0x02b4
            java.lang.String r15 = r2.A01
            r2 = r24
            java.lang.Object r7 = r2.get(r15)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r7 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r7
            if (r7 == 0) goto L_0x01fc
            int r2 = r7.A00
            if (r2 <= 0) goto L_0x01fc
            if (r9 == r12) goto L_0x021f
            r14 = 0
            if (r11 != 0) goto L_0x022c
        L_0x021f:
            r14 = 1
            int r19 = r19 + r18
            int r19 = r19 + r17
            int r10 = r10 + r19
            r19 = 0
            r18 = 0
            r17 = 0
        L_0x022c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            android.content.res.Resources r4 = r1.getResources()
            X.0qQ.A07(r4)
            r3 = 1
            r2 = 10000(0x2710, float:1.4013E-41)
            r6 = r23
            java.lang.String r3 = X.C253673rC.A04(r4, r5, r2, r3, r6)
            int r4 = X.C66849Mdi.A00(r1, r3)
            int r10 = r10 + r4
            int r2 = r0 - r8
            int r2 = X.C66850Mdj.A00(r1, r2, r14, r11)
            int r2 = r25 - r2
            if (r10 <= r2) goto L_0x0256
            if (r11 == 0) goto L_0x02b4
            if (r9 >= r12) goto L_0x02b4
            int r9 = r9 + 1
            r10 = r4
        L_0x0256:
            java.lang.String r6 = r7.A01
            int r5 = r7.A00
            boolean r4 = r7.A02
            X.7E5 r2 = new X.7E5
            r27 = r2
            r31 = r29
            r32 = r63
            r34 = r26
            r35 = r6
            r36 = r3
            r37 = r55
            r38 = r46
            r39 = r5
            r43 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            r3 = r21
            r3.add(r2)
            r2 = r24
            r2.remove(r15)
            int r8 = r8 + 1
            goto L_0x01fc
        L_0x0283:
            r13 = 3
            goto L_0x01f2
        L_0x0286:
            r17 = 0
            goto L_0x01ec
        L_0x028a:
            r18 = 0
            goto L_0x01d2
        L_0x028e:
            r19 = 0
            goto L_0x01a9
        L_0x0292:
            r20 = 0
            r2 = 3
            if (r0 == 0) goto L_0x0164
            if (r11 != 0) goto L_0x029d
            if (r0 <= r2) goto L_0x029d
            goto L_0x0164
        L_0x029d:
            X.7E8 r45 = new X.7E8
            r31 = r45
            r32 = r63
            r34 = r26
            r35 = r55
            r36 = r40
            r38 = r44
            r31.<init>(r32, r33, r34, r35, r36, r38)
            goto L_0x0166
        L_0x02b0:
            r22 = 0
            goto L_0x012d
        L_0x02b4:
            java.util.Collection r2 = r24.values()
            java.util.Iterator r15 = r2.iterator()
        L_0x02bc:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0334
            java.lang.Object r4 = r15.next()
            X.0qQ.A07(r4)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r4 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r4
            if (r8 >= r13) goto L_0x0334
            int r2 = r4.A00
            if (r2 <= 0) goto L_0x02bc
            if (r9 == r12) goto L_0x02d6
            r3 = 0
            if (r11 != 0) goto L_0x02e3
        L_0x02d6:
            r3 = 1
            int r19 = r19 + r18
            int r19 = r19 + r17
            int r10 = r10 + r19
            r19 = 0
            r18 = 0
            r17 = 0
        L_0x02e3:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            android.content.res.Resources r7 = r1.getResources()
            X.0qQ.A07(r7)
            r6 = 1
            r5 = 10000(0x2710, float:1.4013E-41)
            r2 = r23
            java.lang.String r5 = X.C253673rC.A04(r7, r14, r5, r6, r2)
            int r6 = X.C66849Mdi.A00(r1, r5)
            int r10 = r10 + r6
            int r2 = r0 - r8
            int r2 = X.C66850Mdj.A00(r1, r2, r3, r11)
            int r2 = r25 - r2
            if (r10 <= r2) goto L_0x030d
            if (r11 == 0) goto L_0x0384
            if (r9 >= r12) goto L_0x0334
            int r9 = r9 + 1
            r10 = r6
        L_0x030d:
            java.lang.String r7 = r4.A01
            int r6 = r4.A00
            boolean r3 = r4.A02
            X.7E5 r2 = new X.7E5
            r27 = r2
            r31 = r29
            r32 = r63
            r34 = r26
            r35 = r7
            r36 = r5
            r37 = r55
            r38 = r46
            r39 = r6
            r43 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            r3 = r21
            r3.add(r2)
            int r8 = r8 + 1
            goto L_0x02bc
        L_0x0334:
            int r2 = r0 - r8
            if (r11 == 0) goto L_0x0384
            if (r2 <= 0) goto L_0x0384
            r3 = 2131959224(0x7f131db8, float:1.9555082E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = r1.getString(r3, r2)
            X.0qQ.A07(r5)
            X.7E7 r48 = new X.7E7
            r1 = r48
            r2 = r63
            r3 = r26
            r4 = r55
            r6 = r44
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x035b:
            java.lang.Integer r50 = java.lang.Integer.valueOf(r25)
            java.util.Set r1 = r24.keySet()
            X.0qQ.A07(r1)
            java.util.HashSet r51 = X.00k.A0V(r1)
            X.7A9 r25 = new X.7A9
            r43 = r30
            r44 = r63
            r46 = r20
            r47 = r22
            r49 = r26
            r52 = r21
            r53 = r0
            r54 = r11
            r55 = r23
            r42 = r25
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return r25
        L_0x0384:
            r48 = 0
            goto L_0x035b
        L_0x0387:
            X.0sn r35 = X.0sn.A00
            java.lang.Integer r33 = java.lang.Integer.valueOf(r25)
            java.util.HashSet r34 = new java.util.HashSet
            r34.<init>()
            if (r10 != 0) goto L_0x039c
            boolean r1 = r24.isEmpty()
            r38 = 1
            if (r1 == 0) goto L_0x039e
        L_0x039c:
            r38 = 0
        L_0x039e:
            X.7A9 r25 = new X.7A9
            r26 = r30
            r27 = r63
            r28 = r29
            r30 = r22
            r31 = r29
            r32 = r29
            r36 = r0
            r37 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r25
        L_0x03b4:
            com.google.common.collect.ImmutableMap r4 = r4.A0B
            monitor-enter(r5)
            java.util.LinkedHashMap r0 = r5.A1y     // Catch:{ all -> 0x05cd }
            if (r0 == 0) goto L_0x03c0
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r0)     // Catch:{ all -> 0x05cd }
            goto L_0x03c1
        L_0x03c0:
            r3 = 0
        L_0x03c1:
            monitor-exit(r5)
            r43 = 0
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r6 = 10
            r0 = r33
            X.0qQ.A0B(r0, r6)
            if (r10 == 0) goto L_0x059c
            if (r3 == 0) goto L_0x059c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x059c
            r0 = r28
            java.lang.String r2 = r0.A06
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x03ea:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0431
            java.lang.Object r8 = r10.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getValue()
            X.4ur r0 = (X.C277304ur) r0
            java.util.List r9 = r0.A00
            int r0 = X.0Yv.A1E(r9, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x040b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x041f
            java.lang.Object r0 = r9.next()
            X.46u r0 = (X.C2607246u) r0
            java.lang.String r0 = r0.A00()
            r5.add(r0)
            goto L_0x040b
        L_0x041f:
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r5 = r8.getKey()
            java.lang.Object r0 = r8.getValue()
            r7.put(r5, r0)
            goto L_0x03ea
        L_0x0431:
            java.util.Set r9 = r7.keySet()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r3)
            if (r11 == 0) goto L_0x04b7
            int r8 = r3.size()
        L_0x0445:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r13 = r0.iterator()
            r0 = 0
        L_0x044e:
            boolean r4 = r13.hasNext()
            r10 = 0
            if (r4 == 0) goto L_0x04b9
            java.lang.Object r4 = r13.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.getValue()
            if (r0 >= r8) goto L_0x04b9
            java.lang.Object r4 = r3.get(r5)
            X.4ur r4 = (X.C277304ur) r4
            if (r4 == 0) goto L_0x044e
            java.util.List r6 = r4.A00
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x044e
            int r57 = r6.size()
            java.lang.String r54 = java.lang.String.valueOf(r57)
            boolean r61 = r9.contains(r5)
            X.0qQ.A0A(r5)
            X.46u r4 = X.AnonymousClass79F.A00(r2, r6)
            if (r4 == 0) goto L_0x048d
            com.instagram.model.mediasize.ExtendedImageUrl r10 = r4.A00
        L_0x048d:
            X.46u r49 = X.AnonymousClass79F.A01(r2, r6)
            X.7E5 r4 = new X.7E5
            r45 = r4
            r46 = r28
            r47 = r10
            r48 = r30
            r50 = r63
            r51 = r33
            r52 = r26
            r53 = r5
            r56 = r2
            r58 = r40
            r60 = r42
            r62 = r44
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r61, r62)
            r12.add(r4)
            r7.remove(r5)
            int r0 = r0 + 1
            goto L_0x044e
        L_0x04b7:
            r8 = 3
            goto L_0x0445
        L_0x04b9:
            java.util.Set r4 = r7.entrySet()
            java.util.Iterator r10 = r4.iterator()
        L_0x04c1:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0524
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            X.4ur r4 = (X.C277304ur) r4
            if (r0 >= r8) goto L_0x0524
            java.util.List r6 = r4.A00
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x04c1
            int r57 = r6.size()
            java.lang.String r54 = java.lang.String.valueOf(r57)
            boolean r61 = r9.contains(r5)
            X.0qQ.A0A(r5)
            X.46u r4 = X.AnonymousClass79F.A00(r2, r6)
            if (r4 == 0) goto L_0x0521
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r4.A00
        L_0x04fa:
            X.46u r49 = X.AnonymousClass79F.A01(r2, r6)
            X.7E5 r4 = new X.7E5
            r45 = r4
            r46 = r28
            r47 = r7
            r48 = r30
            r50 = r63
            r51 = r33
            r52 = r26
            r53 = r5
            r56 = r2
            r58 = r40
            r60 = r42
            r62 = r44
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r61, r62)
            r12.add(r4)
            int r0 = r0 + 1
            goto L_0x04c1
        L_0x0521:
            r7 = r29
            goto L_0x04fa
        L_0x0524:
            int r4 = r3.size()
            if (r11 != 0) goto L_0x057e
            if (r4 == 0) goto L_0x057e
            r0 = 3
            if (r4 <= r0) goto L_0x057e
            r2 = 2131959224(0x7f131db8, float:1.9555082E38)
            int r4 = r4 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r8 = r1.getString(r2, r0)
            X.0qQ.A07(r8)
            X.7E6 r48 = new X.7E6
            r5 = r63
            r6 = r26
            r7 = r55
            r9 = r44
            r4 = r48
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0551:
            r47 = 0
        L_0x0553:
            java.lang.Integer r52 = java.lang.Integer.valueOf(r25)
            int r55 = r3.size()
            java.util.Set r0 = r3.keySet()
            X.0qQ.A07(r0)
            java.util.HashSet r53 = X.00k.A0V(r0)
            X.7A9 r25 = new X.7A9
            r44 = r25
            r45 = r30
            r46 = r63
            r49 = r29
            r50 = r29
            r51 = r26
            r54 = r12
            r56 = r11
            r57 = r43
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            return r25
        L_0x057e:
            r48 = 0
            if (r4 == 0) goto L_0x0551
            if (r11 != 0) goto L_0x0588
            r0 = 3
            if (r4 <= r0) goto L_0x0588
            goto L_0x0551
        L_0x0588:
            X.7E8 r47 = new X.7E8
            r13 = r47
            r14 = r63
            r15 = r33
            r16 = r26
            r17 = r55
            r18 = r40
            r20 = r44
            r13.<init>(r14, r15, r16, r17, r18, r20)
            goto L_0x0553
        L_0x059c:
            X.0sn r42 = X.0sn.A00
            java.lang.Integer r40 = java.lang.Integer.valueOf(r25)
            java.util.HashSet r41 = new java.util.HashSet
            r41.<init>()
            if (r10 != 0) goto L_0x05b3
            if (r3 == 0) goto L_0x05b3
            boolean r0 = r3.isEmpty()
            r45 = 1
            if (r0 == 0) goto L_0x05b5
        L_0x05b3:
            r45 = 0
        L_0x05b5:
            X.7A9 r25 = new X.7A9
            r32 = r25
            r33 = r30
            r34 = r63
            r35 = r29
            r36 = r29
            r37 = r29
            r38 = r29
            r39 = r26
            r44 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r25
        L_0x05cd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x05d0:
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328527Fd.A0A(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7Kx, boolean):X.7A9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (((X.C254873tC) r0.A0H().get(0)).A02 == 6) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36320266385039501L) == false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass79G A0B(android.content.Context r25, android.graphics.PointF r26, com.instagram.common.session.UserSession r27, X.AnonymousClass9HC r28, X.AnonymousClass7LQ r29, X.C329967Kx r30, X.17i r31, boolean r32) {
        /*
            r7 = r29
            X.7SD r1 = r7.A0G
            int r2 = r1.A08
            boolean r9 = X.AnonymousClass48O.A03(r2)
            X.3t3 r6 = r1.A0P
            r10 = r27
            X.C331057Pi.A00(r10)
            X.3Tu r0 = r1.A0H
            boolean r0 = X.C331057Pi.A02(r0)
            boolean r0 = X.AnonymousClass7FS.A00(r10, r2, r0)
            r5 = 0
            if (r0 == 0) goto L_0x001f
            return r5
        L_0x001f:
            X.3su r0 = r7.A0e
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r2 = r2.A01(r10)
            boolean r15 = r0.A1j(r2)
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            r8 = 0
            if (r2 == 0) goto L_0x00db
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00db
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            java.lang.Object r2 = r2.get(r8)
            if (r2 == 0) goto L_0x00db
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            java.lang.Object r2 = r2.get(r8)
            X.3tC r2 = (X.C254873tC) r2
            int r4 = r2.A02
            r2 = 7
            r3 = 1
            if (r4 == r2) goto L_0x0067
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            java.lang.Object r2 = r2.get(r8)
            X.3tC r2 = (X.C254873tC) r2
            int r4 = r2.A02
            r2 = 6
            r17 = 0
            if (r4 != r2) goto L_0x0069
        L_0x0067:
            r17 = 1
        L_0x0069:
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            java.lang.Object r2 = r2.get(r8)
            X.3tC r2 = (X.C254873tC) r2
            java.lang.Integer r2 = r2.A0j
            if (r2 == 0) goto L_0x008a
            com.google.common.collect.ImmutableList r2 = r0.A0H()
            java.lang.Object r2 = r2.get(r8)
            X.3tC r2 = (X.C254873tC) r2
            java.lang.Integer r2 = r2.A0j
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x008a
            r8 = 1
        L_0x008a:
            java.util.List r2 = r0.A0v()
            boolean r14 = r2.isEmpty()
            if (r9 == 0) goto L_0x00a2
            com.google.common.collect.ImmutableList r2 = r0.A0J()
            if (r2 == 0) goto L_0x00a2
            com.google.common.collect.ImmutableList r2 = r0.A0J()
            boolean r14 = r2.isEmpty()
        L_0x00a2:
            boolean r4 = r7.A0W
            X.2FW r3 = r0.A10
            int r2 = r1.A08
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r11 = r3
            r13 = r4
            r16 = r8
            boolean r24 = X.AnonymousClass7CZ.A06(r10, r11, r12, r13, r14, r15, r16, r17)
            int r2 = r7.A06
            r21 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00ca
            X.0Tu r7 = X.0Tu.A05
            r2 = 36320266385039501(0x8109170007208d, double:3.032420939648318E-306)
            boolean r2 = X.182.A06(r7, r10, r2)
            r23 = 1
            if (r2 != 0) goto L_0x00cc
        L_0x00ca:
            r23 = 0
        L_0x00cc:
            X.0Tu r7 = X.0Tu.A05
            r2 = 36324033071820489(0x810c84000e2ec9, double:3.034803007535845E-306)
            boolean r2 = X.182.A06(r7, r10, r2)
            if (r2 == 0) goto L_0x00e5
            monitor-enter(r0)
            goto L_0x00de
        L_0x00db:
            r17 = 0
            goto L_0x008a
        L_0x00de:
            java.lang.String r2 = r0.A1k     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)
            goto L_0x00eb
        L_0x00e2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00e5:
            X.OW8 r2 = r0.A0Y
            if (r2 == 0) goto L_0x0125
            java.lang.String r2 = r2.A06
        L_0x00eb:
            r11 = r28
            r12 = r30
            r22 = r32
            if (r9 == 0) goto L_0x0127
            android.content.res.Resources r7 = r25.getResources()
            com.google.common.collect.ImmutableList r8 = r0.A0J()
            java.lang.String r13 = r0.A0g()
            if (r6 == 0) goto L_0x0107
            X.3t0 r2 = X.C300965yF.A01(r6)
            java.lang.String r5 = r2.A00
        L_0x0107:
            java.lang.String r2 = r10.A06
            int r1 = r1.A03
            if (r1 > r4) goto L_0x010e
            r4 = 0
        L_0x010e:
            X.2FW r0 = r0.A10
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r0
            r14 = r5
            r15 = r2
            r16 = r4
            r17 = r22
            r18 = r21
            r19 = r23
            r20 = r24
            X.79G r0 = X.C66850Mdj.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0125:
            r2 = 0
            goto L_0x00eb
        L_0x0127:
            java.util.List r20 = r0.A0v()
            java.lang.String r16 = r0.A0g()
            if (r6 == 0) goto L_0x0137
            X.3t0 r3 = X.C300965yF.A01(r6)
            java.lang.String r5 = r3.A00
        L_0x0137:
            java.lang.String r3 = r10.A06
            int r1 = r1.A03
            if (r1 <= r4) goto L_0x013f
            r21 = 1
        L_0x013f:
            X.2FW r13 = r0.A10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.C7c()
            long r0 = r4.toMillis(r0)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r9 = r26
            r14 = r31
            r18 = r5
            r19 = r3
            r17 = r2
            X.79G r0 = X.AnonymousClass79F.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328527Fd.A0B(android.content.Context, android.graphics.PointF, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7Kx, X.17i, boolean):X.79G");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a7, code lost:
        r1 = (java.util.List) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a9, code lost:
        if (r1 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ab, code lost:
        r4 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01af, code lost:
        if (r4 <= 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b5, code lost:
        if (X.C328447Ev.A00(r15) == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b7, code lost:
        if (r3 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b9, code lost:
        r2 = r3.getUsername();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bd, code lost:
        if (r13 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bf, code lost:
        r1 = 2131958763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c2, code lost:
        r0 = new java.lang.Object[]{java.lang.Integer.valueOf(r4)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ce, code lost:
        return r8.getString(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01cf, code lost:
        if (r12 == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d1, code lost:
        if (r2 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d3, code lost:
        r1 = 2131958762;
        r0 = new java.lang.Object[]{r2, java.lang.Integer.valueOf(r4)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01df, code lost:
        r1 = 2131958761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e3, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e9, code lost:
        if (r5.A0z != X.2FW.A0m) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01f8, code lost:
        if (X.182.A06(X.0Tu.A06, r15, 2342161759475210669L) == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01fa, code lost:
        r0 = r5.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fe, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0200, code lost:
        r1 = (X.C254873tC) r0.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x020a, code lost:
        if (X.C254873tC.A00(r1) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020c, code lost:
        r1 = r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0210, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0212, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0218, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x021a, code lost:
        if (r13 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x021c, code lost:
        r0 = ((X.AnonymousClass9JN) r1.get(0)).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0224, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0226, code lost:
        r1 = X.0cp.A03(r0).getQueryParameter("user_ids");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0230, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0232, code lost:
        r5 = r1.split(",").length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0250, code lost:
        return r8.getResources().getQuantityString(com.instagram.android.R.plurals.rff_message_receiver_header_text, r5, new java.lang.Object[]{r3.B8Q(), java.lang.Integer.valueOf(r5)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0251, code lost:
        r1 = r5.A0n();
        r0 = r5.A0l();
        r7 = r5.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025d, code lost:
        if (r3 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025f, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0261, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0263, code lost:
        if (r7 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0278, code lost:
        return X.C70869OPi.A01(X.C69421Nl3.A00(r1), X.C69420Nl2.A00(r0), r15, r3.getId(), r7, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02b0, code lost:
        if (r0.A6I() == false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        return r8.getString(r1, new java.lang.Object[]{((com.instagram.user.model.User) r2.get(0)).getUsername()});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0145, code lost:
        if ((!android.text.TextUtils.isEmpty(r10.A03)) != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0147, code lost:
        r0 = 2131959072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        if (r13 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014c, code lost:
        r0 = 2131959140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0153, code lost:
        return r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0154, code lost:
        r1 = X.C331287Qh.A00(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015c, code lost:
        if (r5.A0g() == null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015e, code lost:
        r4 = r5.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0162, code lost:
        if (r4 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0164, code lost:
        r7 = r1.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016e, code lost:
        if (r7.hasNext() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0170, code lost:
        r1 = r7.next();
        r6 = (java.util.List) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0179, code lost:
        if ((r6 instanceof java.util.Collection) == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017f, code lost:
        if (r6.isEmpty() == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0182, code lost:
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018a, code lost:
        if (r6.hasNext() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019e, code lost:
        if (X.0qQ.A0K(((X.C254703su) ((X.0eP) r6.next()).A00).A0g(), r4) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a1, code lost:
        r4 = r5.A0f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A0C(android.content.Context r14, com.instagram.common.session.UserSession r15, X.AnonymousClass7LQ r16) {
        /*
            r1 = r16
            X.3su r5 = r1.A0e
            X.0eE r0 = X.AnonymousClass0t1.A01
            r9 = r15
            com.instagram.user.model.User r0 = r0.A01(r15)
            boolean r13 = r5.A1j(r0)
            r8 = r14
            java.lang.CharSequence r0 = A0D(r14, r15, r5, r13)
            if (r0 == 0) goto L_0x0017
            return r0
        L_0x0017:
            com.instagram.user.model.User r3 = r1.A0K
            X.7SD r0 = r1.A0G
            boolean r12 = r0.A0r
            java.util.List r2 = r0.A0b
            boolean r1 = r5.A2F
            java.lang.Object r10 = r5.A1T
            X.7Fi r0 = X.C328577Fi.$redex_init_class
            X.2FW r0 = r5.A10
            int r0 = r0.ordinal()
            java.lang.String r4 = "tag"
            r6 = 1
            r14 = 0
            r11 = 0
            switch(r0) {
                case 20: goto L_0x0099;
                case 22: goto L_0x0299;
                case 23: goto L_0x0034;
                case 28: goto L_0x00ec;
                case 29: goto L_0x0048;
                case 30: goto L_0x02be;
                case 32: goto L_0x02d4;
                case 46: goto L_0x010a;
                case 49: goto L_0x0154;
                case 57: goto L_0x01ed;
                case 74: goto L_0x02eb;
                case 75: goto L_0x02f0;
                default: goto L_0x0033;
            }
        L_0x0033:
            return r11
        L_0x0034:
            X.2FW r1 = r5.A0z
            X.2FW r0 = X.2FW.A0N
            if (r1 == r0) goto L_0x0279
            X.2FW r0 = X.2FW.A0m
            if (r1 == r0) goto L_0x0279
            r0 = 2131960187(0x7f13217b, float:1.9557036E38)
            if (r13 == 0) goto L_0x014f
            r0 = 2131960190(0x7f13217e, float:1.9557042E38)
            goto L_0x014f
        L_0x0048:
            com.google.common.collect.ImmutableList r1 = r5.A0H()
            if (r1 == 0) goto L_0x0080
            int r0 = r1.size()
            if (r0 != r6) goto L_0x0080
            java.lang.Object r0 = r1.get(r14)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A11
        L_0x005c:
            if (r13 != 0) goto L_0x0065
            r3.getClass()
            java.lang.String r11 = X.AnonymousClass50n.A07(r3)
        L_0x0065:
            if (r0 == 0) goto L_0x0082
            if (r11 != 0) goto L_0x0072
            r1 = 2131960428(0x7f13226c, float:1.9557524E38)
        L_0x006c:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L_0x01ca
        L_0x0072:
            r1 = 2131960423(0x7f132267, float:1.9557514E38)
            if (r12 == 0) goto L_0x006c
            r1 = 2131960420(0x7f132264, float:1.9557508E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            goto L_0x01ca
        L_0x0080:
            r0 = r11
            goto L_0x005c
        L_0x0082:
            if (r11 != 0) goto L_0x0089
            r0 = 2131960426(0x7f13226a, float:1.955752E38)
            goto L_0x014f
        L_0x0089:
            if (r12 == 0) goto L_0x0094
            r1 = 2131960418(0x7f132262, float:1.9557504E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            goto L_0x01ca
        L_0x0094:
            r0 = 2131960421(0x7f132265, float:1.955751E38)
            goto L_0x014f
        L_0x0099:
            boolean r6 = r5.A1Y()
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r10)
            if (r0 == 0) goto L_0x00cb
            X.9JI r10 = (X.AnonymousClass9JI) r10
            java.lang.String r3 = r10.A03
        L_0x00a8:
            X.1Xj r0 = r5.A0T()
            r0.getClass()
            boolean r1 = r0.CcK()
            if (r6 == 0) goto L_0x00cd
            if (r13 == 0) goto L_0x00c2
            r0 = 2131960217(0x7f132199, float:1.9557096E38)
        L_0x00ba:
            java.lang.String r1 = r8.getString(r0)
            X.0qQ.A07(r1)
            return r1
        L_0x00c2:
            r0 = 2131960216(0x7f132198, float:1.9557094E38)
            if (r1 == 0) goto L_0x00ba
            r0 = 2131960215(0x7f132197, float:1.9557092E38)
            goto L_0x00ba
        L_0x00cb:
            r3 = r11
            goto L_0x00a8
        L_0x00cd:
            boolean r0 = r5.A1X()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r5.A1T
            java.lang.String r1 = X.C70044NwM.A00(r8, r0, r2, r13)
            return r1
        L_0x00da:
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x0033
            if (r13 == 0) goto L_0x02f5
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0033
            r1 = 2131959135(0x7f131d5f, float:1.9554902E38)
            goto L_0x0125
        L_0x00ec:
            r10.getClass()
            X.7FJ r10 = (X.AnonymousClass7FJ) r10
            X.0qQ.A0B(r10, r14)
            X.1Xj r0 = r10.A01
            if (r0 == 0) goto L_0x0033
            r3.getClass()
            java.lang.String r5 = X.AnonymousClass50n.A07(r3)
            r2 = r8
            r3 = r15
            r4 = r10
            r6 = r13
            r7 = r1
            r8 = r12
            java.lang.String r11 = X.C70868OPh.A00(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x010a:
            boolean r0 = r10 instanceof X.AnonymousClass77X
            if (r0 == 0) goto L_0x0138
            X.77X r10 = (X.AnonymousClass77X) r10
            if (r10 == 0) goto L_0x0139
            java.lang.String r0 = r10.A04
        L_0x0114:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x013b
            if (r13 == 0) goto L_0x02fd
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0033
            r1 = 2131959136(0x7f131d60, float:1.9554904E38)
        L_0x0125:
            java.lang.Object r0 = r2.get(r14)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r8.getString(r1, r0)
            return r1
        L_0x0138:
            r10 = r11
        L_0x0139:
            r0 = r11
            goto L_0x0114
        L_0x013b:
            if (r10 == 0) goto L_0x0154
            java.lang.String r0 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0154
        L_0x0147:
            r0 = 2131959072(0x7f131d20, float:1.9554774E38)
            if (r13 == 0) goto L_0x014f
            r0 = 2131959140(0x7f131d64, float:1.9554912E38)
        L_0x014f:
            java.lang.String r1 = r8.getString(r0)
            return r1
        L_0x0154:
            X.7Qj r1 = X.C331287Qh.A00(r15)
            java.lang.String r0 = r5.A0g()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r4 = r5.A0g()
        L_0x0162:
            if (r4 == 0) goto L_0x01e5
            java.util.List r0 = r1.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x016a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r1 = r7.next()
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0182
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0182
            goto L_0x016a
        L_0x0182:
            java.util.Iterator r6 = r6.iterator()
        L_0x0186:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r6.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A0g()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0186
            goto L_0x01a7
        L_0x01a1:
            java.lang.String r4 = r5.A0f()
            goto L_0x0162
        L_0x01a6:
            r1 = 0
        L_0x01a7:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01e5
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x01e5
            boolean r0 = X.C328447Ev.A00(r15)
            if (r0 == 0) goto L_0x01e5
            if (r3 == 0) goto L_0x01e3
            java.lang.String r2 = r3.getUsername()
        L_0x01bd:
            if (r13 == 0) goto L_0x01cf
            r1 = 2131958763(0x7f131beb, float:1.9554147E38)
        L_0x01c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x01ca:
            java.lang.String r1 = r8.getString(r1, r0)
            return r1
        L_0x01cf:
            if (r12 == 0) goto L_0x01df
            if (r2 == 0) goto L_0x01df
            r1 = 2131958762(0x7f131bea, float:1.9554145E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            goto L_0x01ca
        L_0x01df:
            r1 = 2131958761(0x7f131be9, float:1.9554143E38)
            goto L_0x01c2
        L_0x01e3:
            r2 = 0
            goto L_0x01bd
        L_0x01e5:
            X.2FW r1 = r5.A0z
            X.2FW r0 = X.2FW.A0m
            if (r1 != r0) goto L_0x01ed
            goto L_0x0147
        L_0x01ed:
            X.0Tu r4 = X.0Tu.A06
            r0 = 2342161759475210669(0x208107b6000619ad, double:4.064526208015898E-152)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 == 0) goto L_0x0251
            com.google.common.collect.ImmutableList r0 = r5.A0H()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r0.get(r14)
            X.3tC r1 = (X.C254873tC) r1
            boolean r0 = X.C254873tC.A00(r1)
            if (r0 == 0) goto L_0x0033
            com.google.common.collect.ImmutableList r1 = r1.A01()
            if (r3 == 0) goto L_0x0305
            if (r1 == 0) goto L_0x0305
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0305
            if (r13 != 0) goto L_0x0305
            java.lang.Object r0 = r1.get(r14)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0305
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.String r0 = "user_ids"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0305
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            int r5 = r0.length
            android.content.res.Resources r4 = r8.getResources()
            r2 = 2131820926(0x7f11017e, float:1.927458E38)
            java.lang.String r1 = r3.B8Q()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = r4.getQuantityString(r2, r5, r0)
            return r1
        L_0x0251:
            java.lang.String r1 = r5.A0n()
            java.lang.String r0 = r5.A0l()
            java.lang.String r7 = r5.A0m()
            if (r3 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            if (r7 == 0) goto L_0x0033
            java.lang.String r6 = r3.getId()
            X.Nl3 r3 = X.C69421Nl3.A00(r1)
            X.Nl2 r4 = X.C69420Nl2.A00(r0)
            r5 = r15
            r8 = r2
            r9 = r12
            java.lang.String r1 = X.C70869OPi.A01(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0279:
            java.lang.String r0 = r5.A1q
            if (r0 != 0) goto L_0x027f
            java.lang.String r0 = ""
        L_0x027f:
            if (r13 == 0) goto L_0x0289
            r0 = 2131959142(0x7f131d66, float:1.9554916E38)
            java.lang.String r1 = r8.getString(r0)
            return r1
        L_0x0289:
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131960170(0x7f13216a, float:1.9557001E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r2.getString(r1, r0)
            return r1
        L_0x0299:
            r10.getClass()
            X.7FN r10 = (X.AnonymousClass7FN) r10
            com.instagram.model.reels.ReelType r1 = r10.A04
            r1.getClass()
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0P
            if (r1 == r0) goto L_0x02b2
            X.1Xj r0 = r10.A02
            if (r0 == 0) goto L_0x02b2
            boolean r0 = r0.A6I()
            r15 = 1
            if (r0 != 0) goto L_0x02b3
        L_0x02b2:
            r15 = 0
        L_0x02b3:
            if (r3 == 0) goto L_0x02b9
            java.lang.String r11 = r3.getUsername()
        L_0x02b9:
            android.text.SpannableString r1 = X.OXE.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x02be:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131959636(0x7f131f54, float:1.9555918E38)
            if (r13 == 0) goto L_0x02ca
            r0 = 2131959637(0x7f131f55, float:1.955592E38)
        L_0x02ca:
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            return r1
        L_0x02d4:
            r10.getClass()
            X.Cw5 r10 = (X.C45425Cw5) r10
            X.4gL r0 = r10.A01
            if (r0 != 0) goto L_0x02e0
            java.lang.String r1 = r10.A07
            return r1
        L_0x02e0:
            android.content.res.Resources r1 = r8.getResources()
            X.4gL r0 = r10.A01
            android.text.SpannableString r1 = X.C70023Nw1.A00(r1, r0, r13)
            return r1
        L_0x02eb:
            java.lang.String r1 = X.C70044NwM.A00(r8, r10, r2, r14)
            return r1
        L_0x02f0:
            java.lang.String r1 = X.C70044NwM.A00(r8, r10, r2, r6)
            return r1
        L_0x02f5:
            r0 = 2131959064(0x7f131d18, float:1.9554758E38)
            java.lang.String r1 = r8.getString(r0)
            return r1
        L_0x02fd:
            r0 = 2131959065(0x7f131d19, float:1.955476E38)
            java.lang.String r1 = r8.getString(r0)
            return r1
        L_0x0305:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328527Fd.A0C(android.content.Context, com.instagram.common.session.UserSession, X.7LQ):java.lang.CharSequence");
    }

    public static CharSequence A0D(Context context, UserSession userSession, C254703su r9, boolean z) {
        String str = r9.A1V;
        if (str != null) {
            int i = r9.A00;
            if (i == 8) {
                0qQ.A0B(userSession, 0);
                0qQ.A0B(context, 1);
            } else if (i != 11) {
                if (i != 13) {
                    return str;
                }
                0qQ.A0B(context, 0);
                Drawable drawable = context.getDrawable(R.drawable.instagram_blend_pano_filled_12);
                if (drawable != null) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igdsSecondaryIcon))));
                    C2606346l r4 = new C2606346l(drawable);
                    boolean A02 = 0mk.A02(context);
                    if (!z ? A02 : !A02) {
                        SpannableString spannableString = new SpannableString(002.A0C(str, ' '));
                        r4.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                        spannableString.setSpan(r4, spannableString.length() - 1, spannableString.length(), 18);
                        return spannableString;
                    }
                    SpannableString spannableString2 = new SpannableString(002.A0D(str, ' '));
                    r4.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                    spannableString2.setSpan(r4, 0, 1, 18);
                    return spannableString2;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return C346697vb.A07(context, str, z);
        }
        AnonymousClass9I4 r0 = r9.A04;
        if (r0 == null || !r0.A00) {
            return null;
        }
        return context.getString(2131958665);
    }

    public static String A0E(Context context, UserSession userSession, AnonymousClass7LQ r7, CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        C254703su r4 = r7.A0e;
        if (r4.A01 > 0 && (0qQ.A0K(userSession.A06, r4.BsI()) || !r7.A0G.A0r)) {
            int i = 2131959745;
            if (r7.A0Z) {
                i = 2131959755;
            }
            String string = context.getString(i);
            if (sb.length() > 0) {
                string = context.getString(2131964456, new Object[]{"", string});
            }
            sb.append(string);
        }
        if (r4.A2H && (0qQ.A0K(userSession.A06, r4.BsI()) || !r7.A0G.A0r)) {
            String string2 = context.getString(2131959775);
            if (sb.length() > 0) {
                string2 = context.getString(2131964456, new Object[]{"", string2});
            }
            sb.append(string2);
            if (r4.A0U() != null) {
                C69841Nt5.A00(userSession).A00(r4.A0U().A00, String.valueOf(r4.A10));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public static boolean A0F(AnonymousClass7LQ r5) {
        C254703su r3 = r5.A0e;
        int i = r5.A0G.A08;
        2FW r1 = r3.A10;
        if ((r1 == 2FW.A1D && !r3.A1Y()) || r1 == 2FW.A0t || r1 == 2FW.A0W || r1 == 2FW.A1p || r1 == 2FW.A17 || r1 == 2FW.A1A) {
            return true;
        }
        ImmutableList A0H = r3.A0H();
        if (A0H != null) {
            if (A0H.size() != 1 || A0H.get(0) == null) {
                if (!A0H.isEmpty() && A0H.get(0) != null && ((C254873tC) A0H.get(0)).A02 == 9 && ((C254873tC) A0H.get(0)).A04()) {
                    return true;
                }
            } else if (((C254873tC) A0H.get(0)).A02 != 20 && ((C254873tC) A0H.get(0)).A04()) {
                return true;
            }
        }
        if (i != 29 || !r5.A0W) {
            return false;
        }
        return true;
    }

    public static AnonymousClass7AF A07(Context context, N3J n3j, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (!0tS.A00().A0b()) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss.SSS");
        N3J n3j2 = n3j;
        long j = n3j2.A00;
        String format = simpleDateFormat.format(new Date(j));
        Long l = n3j2.A02;
        if (l != null) {
            long longValue = l.longValue();
            str3 = simpleDateFormat.format(new Date(longValue));
            str4 = 002.A0A(longValue - j, " MS");
        } else {
            str3 = null;
            str4 = null;
        }
        Long l2 = n3j2.A05;
        if (l2 != null) {
            str5 = simpleDateFormat.format(new Date(l2.longValue()));
        } else {
            str5 = null;
        }
        Long l3 = n3j2.A04;
        if (l3 == null || l2 == null) {
            str6 = null;
        } else {
            long longValue2 = l3.longValue();
            str7 = simpleDateFormat.format(new Date(longValue2));
            str6 = 002.A0A(longValue2 - l2.longValue(), " MS");
        }
        Context context2 = context;
        return new AnonymousClass7AF(format, context2.getString(2131957470), str3, context2.getString(2131957468), str4, context2.getString(2131957467), str5, context2.getString(2131957473), str7, context2.getString(2131957472), str6, context2.getString(2131957471), n3j2.A08, context2.getString(2131957469), str, str2);
    }
}
