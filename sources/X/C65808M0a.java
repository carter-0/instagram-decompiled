package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.M0a  reason: case insensitive filesystem */
public final class C65808M0a implements C66519MUx, JSz, MSR {
    public C64744LhL A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final Context A04;
    public final LiveUserPaySupportTier A05;
    public final UserSession A06;
    public final User A07;
    public final LA4 A08;
    public final C61636KFm A09;
    public final C62261Kcv A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final List A0C = AnonymousClass7TE.A1C();
    public final List A0D;
    public final C62320sa A0E;
    public final boolean A0F;
    public final AnonymousClass2t9 A0G;
    public final AnonymousClass4DU A0H;
    public final C63680L2q A0I;
    public final boolean A0J;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.2tF, java.lang.Object] */
    public C65808M0a(Context context, LiveUserPaySupportTier liveUserPaySupportTier, UserSession userSession, AnonymousClass4DU r13, User user, C62261Kcv kcv, C62320sa r16, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 2);
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = user;
        this.A05 = liveUserPaySupportTier;
        this.A03 = i;
        this.A0A = kcv;
        this.A0H = r13;
        this.A0F = z;
        this.A0J = z2;
        this.A0E = r16;
        LA4 la4 = new LA4(context, userSession, new MP8(this, 39));
        this.A08 = la4;
        C63680L2q l2q = new C63680L2q(this);
        this.A0I = l2q;
        this.A0D = AnonymousClass7TE.A1C();
        C61636KFm kFm = new C61636KFm(r13, new C63681L2r(this));
        this.A09 = kFm;
        AnonymousClass2tC A0K = JTT.A0K(context, r13, userSession);
        A0K.A01(new C61629KFf(context, r13));
        A0K.A01(new Object());
        A0K.A01(new C61630KFg(context, new C63679L2p(this)));
        A0K.A01(new C61638KFo(context, r13, l2q));
        A0K.A01(new C61646KFw(userSession, r13, this, EXG.A0Q, this));
        A0K.A01(kFm);
        A0K.A01(new Object());
        A0K.A02 = new C64738LhF(this);
        A0K.A08 = true;
        this.A0G = A0K.A00();
        if (z) {
            C66292MMb A012 = C66292MMb.A01(this, 20);
            1Z6 A002 = AnonymousClass2MF.A00();
            Context context2 = la4.A03;
            UserSession userSession2 = la4.A04;
            if (AnonymousClass7TF.A1Y(A002.A01(context2, userSession2, "live_broadcast"), false)) {
                la4.A01 = true;
                la4.A00 = "off";
                A012.invoke();
            } else {
                C61499KAe kAe = new C61499KAe(17, A012, la4);
                1OC A003 = F7X.A00(userSession2, C273654mx.A00(970));
                A003.A00 = kAe;
                1ES.A03(A003);
            }
        }
        A00(this);
        if (A01()) {
            this.A0E.invoke();
        }
    }

    public final boolean AB7() {
        return false;
    }

    public final int Ap7(int i, int i2) {
        int i3;
        C232262tL r1;
        if (i < 0) {
            return 0;
        }
        int itemViewType = this.A0G.getItemViewType(i);
        if (itemViewType == 6) {
            C232262tL r12 = (C232262tL) 00k.A0O(this.A0D, i);
            if (r12 == null || !(r12 instanceof C61170JyM)) {
                return 0;
            }
            i3 = ((C61170JyM) r12).A00;
        } else if (itemViewType != 7 || (r1 = (C232262tL) 00k.A0O(this.A0D, i)) == null || !(r1 instanceof C64790LiA)) {
            return 0;
        } else {
            i3 = ((C64790LiA) r1).A00;
        }
        return i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r3.A0G.getItemViewType(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int By6(int r4, int r5) {
        /*
            r3 = this;
            r2 = 2
            if (r4 < 0) goto L_0x000f
            X.2t9 r0 = r3.A0G
            int r1 = r0.getItemViewType(r4)
            r0 = 6
            if (r1 == r0) goto L_0x0010
            r0 = 7
            if (r1 == r0) goto L_0x0010
        L_0x000f:
            return r2
        L_0x0010:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65808M0a.By6(int, int):int");
    }

    public final void D1S(MXT mxt, IGTVViewerLoggingToken iGTVViewerLoggingToken, String str, boolean z) {
        Long A0h;
        FollowStatus followStatus;
        MXT mxt2 = mxt;
        0qQ.A0B(mxt2, 0);
        C62261Kcv kcv = this.A0A;
        1Xj BPf = mxt2.BPf();
        List<CGB> list = this.A0B;
        0qQ.A0B(list, 1);
        0qQ.A0A(1YO.A00);
        AnonymousClass0eM r4 = kcv.A08;
        UserSession A0S = DbW.A0S(r4, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        Resources resources = kcv.requireActivity().getResources();
        C61292K1d k1d = (C61292K1d) A1E.get("post_live");
        if (k1d == null) {
            C61292K1d k1d2 = new C61292K1d(C62573Ki6.POST_LIVE, "post_live", resources.getString(2131964052));
            k1d = k1d2;
            C61292K1d k1d3 = (C61292K1d) A1E.get(k1d2.A03);
            String str2 = k1d2.A03;
            if (k1d3 != k1d2) {
                if (A1E.containsKey(str2)) {
                    k1d3.A02(A0S, k1d2, true);
                } else {
                    A1E.put(str2, k1d2);
                    2PP.A00(k1d2.A02, AnonymousClass7TF.A0Q(A0S));
                }
            }
            k1d2 = k1d3;
            2PP.A00(k1d2.A02, AnonymousClass7TF.A0Q(A0S));
        }
        0lg A0X = DbT.A0X(r4);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (CGB cgb : list) {
            1Xj r0 = cgb.A01;
            if (r0 != null) {
                A1C.add(r0);
            }
        }
        Iterator it = A1C.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            if (C61292K1d.A00(A0t)) {
                Map map = k1d.A0F;
                if (!map.containsKey(A0t.getId())) {
                    k1d.A0A.add(A0t);
                    map.put(A0t.getId(), A0t);
                    z2 = true;
                }
            }
        }
        if (z2) {
            AnonymousClass1Nd.A00(A0X).A05(new C64657Lfj(k1d));
        }
        String A0j = AnonymousClass7TG.A0j();
        I6Y.A03(kcv, AnonymousClass7TE.A0l(r4), A0j, AnonymousClass7TE.A1D(k1d.A0A));
        FragmentActivity requireActivity = kcv.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        ClipsViewerSource clipsViewerSource = ClipsViewerSource.POST_LIVE;
        String str3 = kcv.A04;
        String str4 = "viewerSessionId";
        if (str3 != null) {
            I6Y.A00(requireActivity, new C270634h3(clipsViewerSource, AnonymousClass7TE.A0l(r4)), A0l, BPf, kcv, (Long) null, str3, A0j, (String) null, 0, true, false, false, false);
            C270194gL r8 = kcv.A00;
            if (r8 != null) {
                L5O l5o = (L5O) C313636gl.A00(kcv, AnonymousClass7TE.A0l(r4)).A03.getValue();
                int size = list.size();
                String str5 = kcv.A04;
                if (str5 != null) {
                    String str6 = kcv.A02;
                    if (str6 == null) {
                        str4 = "entryPoint";
                    } else {
                        UserSession userSession = l5o.A01;
                        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(l5o.A00, userSession), "ig_live_suggested_post_live_click");
                        User A2A = BPf.A2A(userSession);
                        if (A2A != null && (A0h = C51972G9s.A0h(A2A)) != null) {
                            A0e.A9F("parent_a_pk", DbV.A0q(JTP.A0q(r8)));
                            String str7 = r8.A0X;
                            str7.getClass();
                            A0e.A9F("parent_b_pk", DbV.A0q(str7));
                            String str8 = r8.A0e;
                            str8.getClass();
                            A0e.AAJ("parent_m_pk", str8);
                            User A2A2 = BPf.A2A(userSession);
                            if (A2A2 != null) {
                                followStatus = AnonymousClass2f1.A00(userSession).A0N(A2A2);
                            } else {
                                followStatus = null;
                            }
                            A0e.A9F("suggested_live_count", DbV.A0p(A0e, "suggested_live_follow_status", 1aC.A06(followStatus), size));
                            A0e.A9F("a_pk", A0h);
                            String id = BPf.getId();
                            if (id != null) {
                                C51965G9l.A1I(A0e, id);
                                C51965G9l.A1O(A0e, str5);
                                DbV.A1J(A0e, str6);
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D2T(Context context, I9I i9i, MXT mxt, HNQ hnq) {
    }

    public final void D2t(UserSession userSession, String str, String str2) {
    }

    public final void D32(Context context, UserSession userSession, 1Xj r3, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: X.WSf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.WSf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: X.WSe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.WSe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: X.WSe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.WSe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C65808M0a r23) {
        /*
            r0 = r23
            X.2t9 r4 = r0.A0G
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = X.DbS.A0R()
            java.util.List r1 = r0.A0D
            r1.clear()
            boolean r3 = r0.A01
            if (r3 == 0) goto L_0x02ba
            boolean r3 = r0.A02
            if (r3 == 0) goto L_0x02ba
            com.instagram.api.schemas.LiveUserPaySupportTier r3 = r0.A05
            if (r3 == 0) goto L_0x0062
            X.0eE r5 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r0.A06
            com.instagram.user.model.User r3 = r5.A01(r3)
            java.lang.String r13 = r3.getId()
            com.instagram.common.typedurl.ImageUrl r10 = r3.Bh3()
            android.content.Context r5 = r0.A04
            com.instagram.user.model.User r3 = r0.A07
            java.lang.String r8 = r3.getUsername()
            int r7 = r0.A03
            android.content.res.Resources r6 = r5.getResources()
            r5 = 2131820891(0x7f11015b, float:1.927451E38)
            java.lang.Object[] r3 = X.C51968G9o.A1Z(r8, r7)
            java.lang.String r3 = r6.getQuantityString(r5, r7, r3)
            X.0qQ.A07(r3)
            android.text.SpannableStringBuilder r9 = X.DbS.A0C(r3)
            X.DbV.A1D(r9, r8)
            r11 = 0
            X.LiS r8 = new X.LiS
            r12 = r11
            r14 = r11
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.add(r8)
            java.lang.String r5 = "KEY_VIEWER_LIST_DIVIDER"
            X.WRt r3 = new X.WRt
            r3.<init>(r5)
            r1.add(r3)
        L_0x0062:
            boolean r3 = r0.A01()
            if (r3 == 0) goto L_0x00b3
            com.instagram.common.session.UserSession r5 = r0.A06
            android.content.Context r15 = r0.A04
            r3 = 2131965178(0x7f1334fa, float:1.9567159E38)
            java.lang.String r11 = r15.getString(r3)
            r3 = 2131965177(0x7f1334f9, float:1.9567157E38)
            java.lang.String r12 = r15.getString(r3)
            boolean r3 = X.JTR.A1X(r5)
            r17 = 2131238286(0x7f081d8e, float:1.8092846E38)
            if (r3 == 0) goto L_0x0086
            r17 = 2131237949(0x7f081c3d, float:1.8092163E38)
        L_0x0086:
            r6 = 0
            r13 = 0
            r3 = 2131099843(0x7f0600c3, float:1.781205E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            int r18 = X.JTR.A04(r15)
            X.Jcp r7 = new X.Jcp
            r14 = r7
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            r3 = 2131238091(0x7f081ccb, float:1.809245E38)
            android.graphics.drawable.Drawable r8 = X.C61360ml.A00(r15, r3)
            r3 = 40
            X.LYA r10 = X.LYA.A00(r5, r15, r0, r3)
            X.WSf r5 = new X.WSf
            r9 = r6
            r14 = r13
            r15 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A00(r5)
        L_0x00b3:
            boolean r3 = r0.A0F
            if (r3 == 0) goto L_0x0113
            X.LA4 r3 = r0.A08
            com.instagram.user.model.User r8 = r0.A07
            r5 = 21
            X.MMb r7 = X.C66292MMb.A01(r0, r5)
            r15 = 0
            boolean r5 = r3.A01
            if (r5 == 0) goto L_0x0113
            java.lang.String r6 = r3.A00
            java.lang.String r5 = "off"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0183
            android.content.Context r6 = r3.A03
            r5 = 2131965180(0x7f1334fc, float:1.9567163E38)
            java.lang.String r12 = r6.getString(r5)
            r5 = 2131965179(0x7f1334fb, float:1.956716E38)
            r14 = 1
            java.lang.String r13 = X.DbY.A0b(r6, r8, r5)
            r5 = 2131237864(0x7f081be8, float:1.809199E38)
            android.graphics.drawable.Drawable r8 = X.C61360ml.A00(r6, r5)
            r6 = 38
            X.LsA r5 = new X.LsA
            r5.<init>(r3, r6)
            r7 = 0
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0178
            X.Njo r19 = X.C69349Njo.TYPE_SWITCH
            r3 = 2131165230(0x7f07002e, float:1.7944671E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)
            X.WSe r6 = new X.WSe
            r14 = r6
            r15 = r8
            r16 = r7
            r17 = r7
            r18 = r5
            r20 = r7
            r22 = r12
            r23 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0110:
            r1.add(r6)
        L_0x0113:
            X.LhL r8 = r0.A00
            if (r8 == 0) goto L_0x0136
            java.util.List r3 = r8.A00
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x0136
            android.content.Context r5 = r0.A04
            r3 = 2131976029(0x7f135f5d, float:1.9589167E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r5, r3)
            r6 = 0
            java.lang.String r5 = "KEY_UPCOMING_EVENT_SECTION_HEADER"
            X.LiB r3 = new X.LiB
            r3.<init>(r5, r7, r6)
            r1.add(r3)
            r1.add(r8)
        L_0x0136:
            java.util.List r10 = r0.A0C
            boolean r3 = X.AnonymousClass7TE.A1b(r10)
            r5 = 0
            if (r3 == 0) goto L_0x0237
            android.content.Context r3 = r0.A04
            r6 = 2131965279(0x7f13355f, float:1.9567363E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r3, r6)
            r6 = 2131965280(0x7f133560, float:1.9567365E38)
            java.lang.String r8 = r3.getString(r6)
            java.lang.String r7 = "KEY_LIVE_NOW_SECTION_HEADER"
            X.LiB r6 = new X.LiB
            r6.<init>(r7, r9, r8)
            r1.add(r6)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r10.iterator()
        L_0x0161:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x01d7
            java.lang.Object r7 = r8.next()
            r6 = r7
            X.4gL r6 = (X.C270194gL) r6
            com.instagram.common.typedurl.ImageUrl r6 = r6.A02()
            if (r6 == 0) goto L_0x0161
            r9.add(r7)
            goto L_0x0161
        L_0x0178:
            X.WSf r6 = new X.WSf
            r9 = r7
            r10 = r7
            r11 = r7
            r16 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0110
        L_0x0183:
            com.instagram.api.schemas.IGLiveNotificationPreference r6 = com.instagram.api.schemas.IGLiveNotificationPreference.ALL
            com.instagram.api.schemas.IGLiveNotificationPreference r5 = r8.A0A()
            if (r6 == r5) goto L_0x0113
            android.content.Context r6 = r3.A03
            r5 = 2131965180(0x7f1334fc, float:1.9567163E38)
            java.lang.String r12 = r6.getString(r5)
            r5 = 2131965179(0x7f1334fb, float:1.956716E38)
            r16 = 1
            java.lang.String r13 = X.DbY.A0b(r6, r8, r5)
            r5 = 2131237864(0x7f081be8, float:1.809199E38)
            android.graphics.drawable.Drawable r8 = X.C61360ml.A00(r6, r5)
            r5 = 38
            X.LY5 r11 = X.LY5.A00(r7, r5)
            r7 = 0
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x01cd
            X.Njo r19 = X.C69349Njo.TYPE_CHEVRON
            r3 = 2131165230(0x7f07002e, float:1.7944671E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)
            X.WSe r6 = new X.WSe
            r14 = r6
            r15 = r8
            r16 = r7
            r17 = r11
            r18 = r7
            r20 = r7
            r22 = r12
            r23 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0110
        L_0x01cd:
            X.WSf r6 = new X.WSf
            r9 = r7
            r10 = r7
            r14 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0110
        L_0x01d7:
            java.util.Iterator r9 = r9.iterator()
            r18 = 0
        L_0x01dd:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0237
            java.lang.Object r12 = r9.next()
            int r8 = r18 + 1
            if (r18 < 0) goto L_0x02b2
            X.4gL r12 = (X.C270194gL) r12
            com.instagram.common.typedurl.ImageUrl r11 = r12.A02()
            if (r11 == 0) goto L_0x0234
            int r6 = X.AnonymousClass7TG.A02(r3)
            int r7 = r6 * 2
            int r6 = X.DbY.A01(r3)
            int r7 = r7 + r6
            int r6 = X.0nA.A09(r3)
            int r6 = r6 - r7
            int r6 = r6 / 2
            float r7 = (float) r6
            r6 = 1059363750(0x3f249ba6, float:0.643)
            int r17 = X.JTO.A05(r7, r6)
            java.lang.String r15 = r12.A0Y
            if (r15 != 0) goto L_0x0213
            java.lang.String r15 = ""
        L_0x0213:
            java.lang.String r13 = r12.A0X
            r13.getClass()
            int r16 = r12.A00()
            com.instagram.user.model.User r6 = r12.A03()
            java.lang.String r14 = r6.getUsername()
            com.instagram.user.model.User r6 = r12.A03()
            boolean r19 = r6.isVerified()
            X.JyM r10 = new X.JyM
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.add(r10)
        L_0x0234:
            r18 = r8
            goto L_0x01dd
        L_0x0237:
            java.util.List r9 = r0.A0B
            boolean r3 = X.AnonymousClass7TE.A1b(r9)
            if (r3 == 0) goto L_0x02c2
            android.content.Context r11 = r0.A04
            r10 = 2131969641(0x7f134669, float:1.957621E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r11, r10)
            r3 = 2131969642(0x7f13466a, float:1.9576213E38)
            java.lang.String r7 = r11.getString(r3)
            java.lang.String r6 = "KEY_POST_LIVE_SECTION_HEADER"
            X.LiB r3 = new X.LiB
            r3.<init>(r6, r8, r7)
            r1.add(r3)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r9.iterator()
        L_0x0261:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0276
            java.lang.Object r6 = r7.next()
            r3 = r6
            X.CGB r3 = (X.CGB) r3
            X.1Xj r3 = r3.A01
            if (r3 == 0) goto L_0x0261
            r8.add(r6)
            goto L_0x0261
        L_0x0276:
            java.util.Iterator r15 = r8.iterator()
        L_0x027a:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x02c2
            java.lang.Object r9 = r15.next()
            int r14 = r5 + 1
            if (r5 < 0) goto L_0x02b2
            X.CGB r9 = (X.CGB) r9
            com.instagram.common.session.UserSession r12 = r0.A06
            X.1Xj r8 = r9.A01
            java.lang.String r13 = r11.getString(r10)
            java.lang.String r6 = r8.A30()
            java.lang.String r3 = "chaining_"
            java.lang.String r7 = X.002.A0R(r3, r6)
            X.Ki6 r6 = X.C62573Ki6.CHAINING
            X.K1d r3 = new X.K1d
            r3.<init>(r6, r7, r13)
            X.LsP r6 = new X.LsP
            r6.<init>(r12, r8, r3)
            X.LiA r3 = new X.LiA
            r3.<init>(r6, r9, r5)
            r1.add(r3)
            r5 = r14
            goto L_0x027a
        L_0x02b2:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ba:
            X.LhT r0 = new X.LhT
            r0.<init>()
            r1.add(r0)
        L_0x02c2:
            r2.A01(r1)
            r4.A05(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65808M0a.A00(X.M0a):void");
    }

    private final boolean A01() {
        UserSession userSession = this.A06;
        if (!0qQ.A0K(25x.A00(userSession).A01.A00, C297385rf.A00) || !C278264wZ.A01(userSession) || !182.A06(0Tu.A05, userSession, 36321262817584347L) || !this.A0J) {
            return false;
        }
        return true;
    }

    public final AnonymousClass2t9 BkO() {
        return this.A0G;
    }
}
