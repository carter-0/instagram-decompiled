package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.JjH  reason: case insensitive filesystem */
public final class C60314JjH extends 2YL {
    public MQV A00;
    public boolean A01;
    public final C234072ww A02;
    public final C53335GmL A03;
    public final C333747a3 A04;
    public final MediaCommentListRepository A05;
    public final C333757a5 A06;
    public final UserSession A07;
    public final LSm A08;
    public final C70804OLz A09;
    public final L87 A0A;
    public final L6X A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;
    public final AnonymousClass0Ud A0I;
    public final AnonymousClass0Ud A0J;
    public final C333717a0 A0K;
    public final C63929LDm A0L;

    /* JADX WARNING: type inference failed for: r0v8, types: [X.MQV, java.lang.Object] */
    public C60314JjH(C333747a3 r60, UserSession userSession, LSm lSm, C70804OLz oLz, AnonymousClass4DU r64) {
        UserSession userSession2 = userSession;
        AnonymousClass4DU r3 = r64;
        AnonymousClass7TF.A1C(userSession2, 1, r3);
        this.A07 = userSession2;
        C70804OLz oLz2 = oLz;
        this.A09 = oLz2;
        C333747a3 r7 = r60;
        this.A04 = r7;
        this.A08 = lSm;
        String str = oLz2.A06;
        if (str != null) {
            String str2 = oLz2.A00;
            boolean A1W = C51966G9m.A1W(userSession2, oLz2.A0A);
            AnonymousClass5OB r12 = AnonymousClass5OB.BROADCAST_CHANNEL;
            boolean z = oLz2.A0H;
            boolean A062 = 182.A06(0Tu.A05, userSession2, 36319407397215595L);
            String A002 = AnonymousClass000.A00(98);
            C53335GmL gmL = new C53335GmL(r12, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, (String) null, A002, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, A1W, false, false, z, false, false, false, false, false, false, false, false, false, false, false, false, false, A062, true, false, false, false, false, false, false, false);
            this.A03 = gmL;
            String str3 = gmL.A0E;
            C333757a5 r1 = new C333757a5((C54039GyO) null, gmL, userSession2, str3);
            this.A06 = r1;
            C333717a0 r10 = new C333717a0(gmL, userSession2, r3, 1L2.A00());
            this.A0K = r10;
            this.A02 = new C234072ww(userSession2, r3, 1L2.A00());
            MediaCommentListRepository mediaCommentListRepository = new MediaCommentListRepository((C333787a8) null, (C54039GyO) null, gmL, r1, r10, userSession2, r3, A002);
            this.A05 = mediaCommentListRepository;
            02z A012 = 106.A01(Lq9.A00);
            this.A0E = A012;
            this.A00 = new Object();
            C61820pm A013 = C66193MHj.A01(MCA.A00(this, mediaCommentListRepository.A0L, 36), A012, 19);
            C318136oS A003 = C318116oQ.A00(this);
            AnonymousClass109 r32 = AnonymousClass10A.A01;
            05F A022 = 10b.A02(new Object(), A003, A013, r32);
            this.A0J = A022;
            0pq A014 = AnonymousClass10H.A01(new C58124Imq(this, 1), A022, r7.A0A, r7.A0D, r7.A0C);
            this.A0F = 10b.A02(C334057ab.A00, C318116oQ.A00(this), A014, r32);
            02z A015 = 106.A01(P0h.A00);
            this.A0C = A015;
            this.A0G = 10b.A03(A015);
            02z A016 = 106.A01(C65257LqC.A00);
            this.A0D = A016;
            this.A0I = 10b.A03(A016);
            MC9 A004 = MC9.A00(r1.A03, 38);
            AnonymousClass0Ud A023 = 10b.A02(C51967G9n.A0j(), C318116oQ.A00(this), A004, r32);
            this.A0H = A023;
            C318136oS A005 = C318116oQ.A00(this);
            C63929LDm lDm = new C63929LDm(userSession2, oLz2.A09, oLz2.A07, str3, A005, A023);
            this.A0L = lDm;
            this.A0B = new L6X(mediaCommentListRepository, lDm, str3);
            this.A0A = new L87(mediaCommentListRepository, userSession2, oLz2.A0C);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(C335907dj r15, C60314JjH jjH) {
        C335907dj r1 = r15;
        String str = r15.A0N;
        String str2 = str;
        if (str == null) {
            str = r15.A0K;
        }
        C60314JjH jjH2 = jjH;
        C333747a3 r8 = jjH2.A04;
        String str3 = r15.A0K;
        String str4 = r15.A0J;
        User user = r15.A0C;
        boolean z = true;
        r8.A03(user, r15.A0I, str3, str4, str, r15.A0i, AnonymousClass7TF.A1V(r15.A03), AnonymousClass7TF.A1V(r1.A08));
        if (user.A2G()) {
            05G r5 = jjH2.A0C;
            String format = String.format(Locale.getDefault(), "@%s ", Arrays.copyOf(new Object[]{user.getUsername()}, 1));
            0qQ.A07(format);
            r5.Epw(new P0f(format));
        }
        05G r6 = jjH2.A0E;
        do {
        } while (!r6.AIY(r6.getValue(), new C382029cy(str3, UUID.randomUUID(), true)));
        if (str2 == null) {
            z = false;
        }
        AnonymousClass7TE.A1Z(new C59673JTe((Object) jjH2, (AnonymousClass4D7) null, 13, z), C318116oQ.A00(jjH2));
    }

    public final void A05(String str, String str2, String str3, boolean z) {
        C242243Te r0;
        String str4;
        String str5;
        0qQ.A0B(str, 1);
        A03(this, str, str2, str3, z);
        LSm lSm = this.A08;
        boolean A1V = AnonymousClass7TF.A1V(str2);
        boolean z2 = !z;
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (A002 != null && (r0 = ((AnonymousClass3U9) A002).A01.A0s) != null) {
            0eP A022 = LSm.A02(lSm);
            0eP A032 = LSm.A03(lSm, r0, A002);
            if (A1V) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            LinkedHashMap A0p = JTS.A0p("is_reply", str4, A022, A032);
            C313756gx A0R = DbZ.A0R(lSm.A04);
            int AdN = A002.AdN();
            if (z2) {
                str5 = AnonymousClass000.A00(1549);
            } else {
                str5 = "unlike_comment";
            }
            A0R.A0W(str5, "tap", "comment_options_like_or_unlike", "comments_view", A002.C6C(), A002.C6k(), A0p, AdN);
        }
    }

    public static final void A01(C335907dj r8, C60314JjH jjH) {
        C242243Te r1;
        String str;
        05G r5 = jjH.A0E;
        do {
        } while (!r5.AIY(r5.getValue(), new C382029cy(r8.A0K, UUID.randomUUID(), false)));
        jjH.A0L.A00(C318116oQ.A00(jjH));
        LSm lSm = jjH.A08;
        boolean z = r8.A0V;
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (A002 != null && (r1 = ((AnonymousClass3U9) A002).A01.A0s) != null) {
            C313756gx A0R = DbZ.A0R(lSm.A04);
            int AdN = A002.AdN();
            String C6C = A002.C6C();
            String C6k = A002.C6k();
            String A003 = lSm.A01.A00();
            String A012 = LSm.A01(lSm, r1, A002);
            1Ln A0J2 = DbT.A0J(A0R);
            if (DbT.A1Y(A0J2)) {
                DbW.A17(A0J2, A0R);
                DbV.A1M(A0J2, AnonymousClass000.A00(3758));
                A0J2.A0p("comments_composer");
                A0J2.A0i(DbZ.A0b(A0J2, "comments_view", C6C, C6k, AdN));
                0eP A1L = AnonymousClass7TE.A1L("message_client_context_id", A003);
                0eP A1L2 = AnonymousClass7TE.A1L("user_type", A012);
                if (z) {
                    str = "True";
                } else {
                    str = "False";
                }
                A0J2.A0w(DbY.A0q("is_reply", str, A1L, A1L2));
                A0J2.Cgf();
            }
        }
    }

    public static final void A02(C60314JjH jjH, String str, String str2) {
        jjH.A0K.A0C(str2, jjH.A03.A0E, str, jjH.A09.A0C);
    }

    public static final void A03(C60314JjH jjH, String str, String str2, String str3, boolean z) {
        1Xl r2 = jjH.A06.A00;
        if (r2 != null) {
            String str4 = str;
            String str5 = str2;
            1Xl r7 = r2;
            String str6 = str;
            String str7 = str2;
            jjH.A05.A0H(r7, str6, str7, z, 0qQ.A0K(jjH.A07.A06, jjH.A09.A03));
            C333717a0 r1 = jjH.A0K;
            String str8 = str3;
            if (!z) {
                r1.A07(r2, str8, str4, str5, -1, -1);
            } else {
                r1.A08(r2, str8, str4, str5, -1, -1);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A04(String str, String str2) {
        1Xl r4 = this.A06.A00;
        if (r4 != null) {
            this.A05.A0G(C64564Le5.A00, new C57056IMw(this, 6), r4, str, str2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCleared() {
        C333747a3 r3 = this.A04;
        int length = JTO.A11(r3.A0A).length();
        String str = this.A03.A0E;
        if (length > 0) {
            r3.A04(str);
            return;
        }
        0qQ.A0B(str, 0);
        r3.A00.A00.remove(str);
    }
}
