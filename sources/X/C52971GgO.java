package X;

import android.app.Application;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository$locallyHideComment$1;
import com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.GgO  reason: case insensitive filesystem */
public final class C52971GgO extends C361478gI {
    public AnonymousClass9I8 A00;
    public C335377cr A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final GSY A06;
    public final C333787a8 A07;
    public final C53335GmL A08;
    public final C333747a3 A09;
    public final MediaCommentListRepository A0A;
    public final C333757a5 A0B;
    public final C333717a0 A0C;
    public final 1Ng A0D;
    public final UserSession A0E;
    public final 0Rd A0F;
    public final AnonymousClass2f1 A0G;
    public final C334007aW A0H;
    public final C333937aO A0I;
    public final String A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final AnonymousClass0Ud A0T;
    public final AnonymousClass0Ud A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final AnonymousClass0Ud A0X;
    public final FollowUserDataSourceImpl A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52971GgO(android.app.Application r32, X.C333787a8 r33, X.C53335GmL r34, X.C333747a3 r35, com.instagram.comments.mvvm.data.MediaCommentListRepository r36, X.C333757a5 r37, X.C333717a0 r38, X.1Ng r39, com.instagram.common.session.UserSession r40, X.AnonymousClass2f1 r41, com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl r42, X.C334007aW r43, X.C333937aO r44, java.lang.String r45) {
        /*
            r31 = this;
            r5 = 1
            r12 = r40
            X.0qQ.A0B(r12, r5)
            r21 = 2
            r20 = 3
            r4 = 4
            r19 = 5
            r18 = 6
            r0 = 7
            r1 = r32
            r6 = r39
            X.AnonymousClass7TF.A1F(r6, r0, r1)
            r0 = 12
            r2 = r45
            X.0qQ.A0B(r2, r0)
            r7 = r31
            r7.<init>(r1)
            r7.A0E = r12
            r28 = r34
            r0 = r28
            r7.A08 = r0
            r0 = r38
            r7.A0C = r0
            r10 = r36
            r7.A0A = r10
            r11 = r35
            r7.A09 = r11
            r1 = r37
            r7.A0B = r1
            r7.A0D = r6
            r0 = r44
            r7.A0I = r0
            r0 = r41
            r7.A0G = r0
            r0 = r33
            r7.A07 = r0
            r7.A0J = r2
            r0 = r42
            r7.A0Y = r0
            r0 = r43
            r7.A0H = r0
            X.0Rd r0 = new X.0Rd
            r0.<init>(r12)
            r7.A0F = r0
            X.7aX r0 = X.C334017aX.A00
            X.02z r17 = X.106.A01(r0)
            r0 = r17
            r7.A0S = r0
            r9 = 0
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r9)
            X.02z r8 = X.DbS.A10(r16)
            r7.A0R = r8
            X.0Ud r3 = r10.A0L
            X.0Ud r0 = r1.A03
            r30 = r0
            X.0Ud r2 = r10.A0J
            X.0Ud r1 = r10.A0I
            X.0Ud r0 = r10.A0K
            r23 = r30
            r24 = r2
            r25 = r1
            r26 = r0
            r27 = r8
            r22 = r3
            X.0Ud[] r0 = new X.AnonymousClass0Ud[]{r22, r23, r24, r25, r26, r27}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.List r1 = X.00k.A0a(r0)
            X.0r6[] r0 = new X.AnonymousClass0r6[r9]
            java.lang.Object[] r1 = r1.toArray(r0)
            X.IkL r2 = new X.IkL
            r0 = r20
            r2.<init>(r0, r7, r1)
            X.6oS r1 = X.C318116oQ.A00(r7)
            X.109 r3 = X.AnonymousClass10A.A01
            r0 = r28
            int r15 = r0.A00
            X.7aZ r0 = new X.7aZ
            r0.<init>(r15)
            X.05F r14 = X.10b.A02(r0, r1, r2, r3)
            r7.A0a = r14
            r0 = 19
            X.MC9 r2 = new X.MC9
            r2.<init>(r14, r0)
            X.6oS r0 = X.C318116oQ.A00(r7)
            X.0sn r1 = X.0sn.A00
            X.05F r2 = X.10b.A02(r1, r0, r2, r3)
            r7.A0Z = r2
            r1 = 0
            X.MHj r13 = new X.MHj
            r0 = r18
            r13.<init>(r0, r1)
            r0 = r17
            X.0pm r14 = X.AnonymousClass10H.A03(r13, r14, r0)
            X.6oS r13 = X.C318116oQ.A00(r7)
            X.7aZ r0 = new X.7aZ
            r0.<init>(r15)
            X.05F r0 = X.10b.A02(r0, r13, r14, r3)
            r7.A0X = r0
            r0 = r28
            java.lang.Integer r15 = r0.A04
            int r13 = X.AnonymousClass7TG.A0A(r15)
            X.7a5 r0 = r7.A0B
            X.1Xl r0 = r0.A00
            boolean r0 = X.1sx.A0R(r0, r13)
            if (r0 == 0) goto L_0x021a
            X.7a5 r0 = r7.A0B
            X.1Xl r14 = r0.A00
            if (r14 == 0) goto L_0x021a
            android.app.Application r0 = r7.A0D()
            android.content.Context r13 = X.DbT.A05(r0)
            int r0 = X.AnonymousClass7TG.A0A(r15)
            X.GSY r0 = X.C55001HaY.A00(r13, r12, r14, r0)
        L_0x010d:
            r7.A06 = r0
            X.0Ud r0 = r11.A0A
            r17 = r0
            X.0Ud r15 = r11.A0B
            X.0Ud r14 = r11.A0D
            X.0Ud r13 = r11.A0C
            X.7a5 r0 = r7.A0B
            X.0Ud r12 = r0.A03
            X.0Ud r0 = r11.A0F
            r23 = r17
            r24 = r15
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r8
            r29 = r0
            r22 = r2
            X.0Ud[] r0 = new X.AnonymousClass0Ud[]{r22, r23, r24, r25, r26, r27, r28, r29}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.List r11 = X.00k.A0a(r0)
            X.0r6[] r0 = new X.AnonymousClass0r6[r9]
            java.lang.Object[] r0 = r11.toArray(r0)
            X.IkL r11 = new X.IkL
            r11.<init>(r4, r7, r0)
            X.6oS r9 = X.C318116oQ.A00(r7)
            X.7ab r0 = X.C334057ab.A00
            X.05F r0 = X.10b.A02(r0, r9, r11, r3)
            r7.A0V = r0
            X.0Ud r10 = r10.A0M
            X.7dr r9 = new X.7dr
            r9.<init>(r7)
            r0 = r30
            X.0pq r8 = X.AnonymousClass10H.A01(r9, r2, r10, r0, r8)
            X.6oS r2 = X.C318116oQ.A00(r7)
            X.7ad r0 = X.C334077ad.A00
            X.05F r0 = X.10b.A02(r0, r2, r8, r3)
            r7.A0T = r0
            X.7af r0 = X.C334097af.A00
            X.02z r0 = X.106.A01(r0)
            r7.A0P = r0
            X.05F r0 = X.10b.A03(r0)
            r7.A0W = r0
            X.7ah r0 = X.C334117ah.A00
            X.02z r0 = X.106.A01(r0)
            r7.A0O = r0
            X.05F r0 = X.10b.A03(r0)
            r7.A0U = r0
            X.9I8 r2 = new X.9I8
            r0 = r21
            r2.<init>(r5, r5, r0)
            r7.A00 = r2
            X.02z r0 = X.DbS.A10(r16)
            r7.A0Q = r0
            X.Wvs r2 = new X.Wvs
            r0 = r19
            r2.<init>(r7, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r2)
            r7.A0N = r0
            r2 = 48
            X.Inh r0 = new X.Inh
            r0.<init>(r7, r2)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0M = r0
            X.0eO r3 = X.0eO.A02
            r2 = 46
            X.Inh r0 = new X.Inh
            r0.<init>(r7, r2)
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r7.A0K = r0
            r2 = 47
            X.Inh r0 = new X.Inh
            r0.<init>(r7, r2)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0L = r0
            X.64X r2 = new X.64X
            r2.<init>(r6)
            java.lang.Class<X.7aj> r0 = X.C334137aj.class
            X.032 r3 = r2.A00(r0)
            X.MGa r2 = new X.MGa
            r0 = r20
            r2.<init>(r7, r1, r0)
            X.DbY.A19(r7, r2, r3)
            X.64X r2 = new X.64X
            r2.<init>(r6)
            java.lang.Class<X.7ak> r0 = X.C334147ak.class
            X.032 r2 = r2.A00(r0)
            X.MG0 r0 = new X.MG0
            r0.<init>(r7, r1, r4)
            X.DbY.A19(r7, r0, r2)
            X.64X r2 = new X.64X
            r2.<init>(r6)
            java.lang.Class<X.3KA> r0 = X.AnonymousClass3KA.class
            X.032 r2 = r2.A00(r0)
            X.MGa r0 = new X.MGa
            r0.<init>(r7, r1, r4)
            X.DbY.A19(r7, r0, r2)
            X.6oS r3 = X.C318116oQ.A00(r7)
            r2 = 25
            X.MG7 r0 = new X.MG7
            r0.<init>(r7, r1, r2)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r7.A04 = r5
            r7.A05 = r5
            return
        L_0x021a:
            r0 = 0
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52971GgO.<init>(android.app.Application, X.7a8, X.GmL, X.7a3, com.instagram.comments.mvvm.data.MediaCommentListRepository, X.7a5, X.7a0, X.1Ng, com.instagram.common.session.UserSession, X.2f1, com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl, X.7aW, X.7aO, java.lang.String):void");
    }

    public static final void A01(C61081JwJ jwJ, C335907dj r9, C52971GgO ggO, String str, List list, boolean z) {
        C52971GgO ggO2 = ggO;
        C333787a8 r5 = ggO.A07;
        ConcurrentHashMap concurrentHashMap = r5.A03;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            r5.A00.flowMarkPoint(number.longValue(), "request_end");
        }
        C333787a8.A01(r5, str, "successful_comment_post", concurrentHashMap);
        ggO.A0B.A01(new C58788IxZ(3, ggO2, list, jwJ, r9, z));
    }

    public final void A0H(RectF rectF, Reel reel, String str, C62320sa r7) {
        0qQ.A0B(r7, 3);
        if (str != null) {
            C240443Kx.A00(this.A0C.A02).Eaj(str);
        }
        GNG gng = new GNG(2, r7, this);
        05G r1 = this.A0O;
        r1.Epw(C334907c4.A00);
        r1.Epw(new C376469Ic(rectF, reel, (C62320sa) gng));
    }

    public final void A0N(C335847dd r6) {
        0qQ.A0B(r6, 0);
        String str = r6.A04;
        if (str != null) {
            AnonymousClass7TE.A1Z(new C66187MGy(this, str, (AnonymousClass4D7) null, 13), C318116oQ.A00(this));
        }
    }

    public final void A0R(C337207ft r14, String str, String str2) {
        String str3;
        String str4;
        String str5 = str;
        0qQ.A0B(str, 0);
        C333747a3 r2 = this.A09;
        C335377cr A002 = r2.A00(str);
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        if (r14 != null) {
            if (A002 != null) {
                str4 = A002.A04;
            } else {
                str4 = null;
            }
            AnonymousClass7TE.A1Z(new MFe((Object) mediaCommentListRepository, str4, str5, (AnonymousClass4D7) null, 5), mediaCommentListRepository.A01);
            this.A0C.A05(r14);
        } else {
            if (A002 != null) {
                str3 = A002.A04;
            } else {
                str3 = null;
            }
            AnonymousClass7TE.A1Z(new MFe((Object) mediaCommentListRepository, str3, str5, (AnonymousClass4D7) null, 6), mediaCommentListRepository.A01);
        }
        if (A002 != null) {
            r2.A03(A002.A00, A002.A01, A002.A02, A002.A03, A002.A04, A002.A05, A002.A07, A002.A06);
        }
        this.A0P.Epw(new C335247ce((AnonymousClass7a4) null, str2));
    }

    public final void A0S(C333797aA r8, Integer num) {
        C333797aA r2 = r8;
        Integer num2 = num;
        AnonymousClass7TG.A1N(r8, num);
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass0Ud r1 = mediaCommentListRepository.A0L;
        if (((C333867aH) r1.getValue()).A03.A00.A03 != num || ((C333867aH) r1.getValue()).A03.A00.A02 != r8) {
            AnonymousClass7TE.A1Z(new MH4(r2, mediaCommentListRepository, num2, (AnonymousClass4D7) null, 17), mediaCommentListRepository.A01);
        }
    }

    public final void A0T(C272034jz r13, Integer num, String str, String str2, int i) {
        C297825sP.A01(A0D(), this.A0E, r13, num, Integer.valueOf(i), str, this.A08.A0F, str2, "", -1, false);
    }

    public final void A0U(C272034jz r13, String str, String str2, int i) {
        0qQ.A0B(str, 0);
        boolean A1Y = DbW.A1Y(r13);
        Application A0D2 = A0D();
        UserSession userSession = this.A0E;
        C297825sP.A01(A0D2, userSession, r13, Integer.valueOf(i), (Integer) null, str, this.A08.A0F, str2, "", -1, A1Y);
    }

    public final void A0X(User user, String str, boolean z) {
        1Xj BPf;
        User user2 = user;
        String str2 = str;
        AnonymousClass7TG.A1N(user, str);
        1Xl r0 = this.A0B.A00;
        if (!(r0 == null || (BPf = r0.BPf()) == null)) {
            this.A0D.A00(new C240253Ke(BPf, user2, AnonymousClass000.A00(1206), str2, z));
        }
        C240443Kx.A00(this.A0C.A02).Eaj(str);
    }

    public final void A0Y(String str) {
        1Xj BPf;
        1Xl r0 = this.A0B.A00;
        if (r0 != null && (BPf = r0.BPf()) != null) {
            1Ng r02 = this.A0D;
            String lowerCase = str.toLowerCase();
            0qQ.A07(lowerCase);
            r02.A00(new C240323Kl((ClickableSpan) null, (View) null, BPf, lowerCase, false));
        }
    }

    public final void A0Z(String str) {
        1Xj BPf;
        1Xl r0 = this.A0B.A00;
        if (r0 != null && (BPf = r0.BPf()) != null) {
            1Ng r02 = this.A0D;
            String lowerCase = str.toLowerCase();
            0qQ.A07(lowerCase);
            r02.A00(new C240303Kj((ClickableSpan) null, (View) null, BPf, lowerCase, false));
        }
    }

    public final void A0c(String str, String str2) {
        if (C335067cK.A01(C51968G9o.A0g(this.A0A), str, str2) != null) {
            this.A0B.A00(new J6I(this, 17));
            this.A0O.Epw(new C376589Io(str, 0));
        }
    }

    public final void A0d(String str, String str2) {
        05G r6;
        Object r2;
        28D r4;
        05G r62;
        Object obj;
        Object value;
        long A012;
        String str3 = str;
        String str4 = str2;
        C335907dj A013 = C335067cK.A01(C51968G9o.A0g(this.A0A), str3, str4);
        if (A013 != null) {
            String str5 = A013.A0N;
            if (str5 == null) {
                str5 = A013.A0K;
            }
            C333757a5 r1 = this.A0B;
            r1.A00(new J6I(this, 19));
            C333747a3 r63 = this.A09;
            String str6 = A013.A0J;
            User user = A013.A0C;
            r63.A03(user, A013.A0I, str3, str6, str5, A013.A0i, AnonymousClass7TF.A1V(A013.A03), AnonymousClass7TF.A1V(A013.A08));
            if (!user.A2G() || 0qQ.A0K(this.A08.A0B, A013.A00)) {
                r62 = this.A0P;
                obj = C335257cf.A00;
            } else {
                r62 = this.A0P;
                obj = new C335247ce((AnonymousClass7a4) null, StringFormatUtil.formatStrLocaleSafe("@%s ", user.getUsername()));
            }
            r62.Epw(obj);
            05G r64 = this.A0S;
            do {
                value = r64.getValue();
                A012 = 182.A01(0Tu.A05, this.A0E, 36600246713454388L);
                if (A012 == 0) {
                    A012 = 300;
                }
            } while (!r64.AIY(value, new C335537d7(str3, UUID.randomUUID(), A012, true)));
            Integer num = AnonymousClass05K.A01;
            this.A05 = false;
            r1.A00(new C74192PqY((Object) this, (Object) num, str3, str4, 15));
        }
        AnonymousClass0Ud r8 = this.A09.A0D;
        C335377cr r22 = (C335377cr) r8.getValue();
        if (r22 != null && !this.A03) {
            UserSession userSession = this.A0E;
            AnonymousClass0Ud r42 = this.A0B.A03;
            if (C393889xC.A00(r22, (C333777a7) r42.getValue(), userSession)) {
                1Av A002 = 1Au.A00(userSession);
                0s0 r23 = A002.A7L;
                AnonymousClass0YZ[] r65 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(A002, r23, r65, 282)) {
                    this.A03 = true;
                    r6 = this.A0O;
                    C335377cr r5 = (C335377cr) r8.getValue();
                    C333777a7 r12 = (C333777a7) r42.getValue();
                    if (r12 == null || !r12.A0W) {
                        r4 = 28D.A2k;
                    } else {
                        r4 = 28D.A0u;
                    }
                    r2 = new C334727bm(new I9B(this, 0), new I9J(this, 0), r4, r5);
                } else {
                    int i = AnonymousClass7TE.A0q(userSession).getInt(AnonymousClass000.A00(2816), 0);
                    1Av A003 = 1Au.A00(userSession);
                    if (!AnonymousClass7TG.A1a(A003, A003.A0i, r65, 284) && i == 0) {
                        this.A03 = true;
                        KSO kso = new KSO(this, 0);
                        r6 = this.A0P;
                        r2 = new C335317cl(kso);
                    }
                }
                r6.Epw(r2);
            }
        }
        A05(this, false);
    }

    public final void A0g(String str, String str2, boolean z) {
        boolean z2;
        List list = (List) this.A0Z.getValue();
        String str3 = str;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(((C335907dj) it.next()).A0K, str)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        boolean A072 = A07(this);
        String str4 = str2;
        if (z2) {
            this.A0A.A0N(str, str4, false);
            I21 i21 = I21.A00;
            UserSession userSession = this.A0E;
            C51965G9l.A0l().markerPoint(309476254, 002.A0O(AnonymousClass000.A00(3941), DbT.A02(list, 1)));
            if (list.size() == 1 && !this.A02) {
                i21.A00(userSession);
                return;
            }
            return;
        }
        int size = list.size();
        if (size == 0 || (A072 && size < 25 && DbX.A1b(this.A0R))) {
            if (list.isEmpty()) {
                Integer A0l = C51967G9n.A0l(z ? 1 : 0);
                Integer num = AnonymousClass05K.A01;
                I21.A00.A03(this.A0E, A0l, num, num, A072);
            }
            C51965G9l.A0l().markerPoint(309476254, 002.A0O("select_comment_screen_comment_select_tap_", list.size() + 1));
            if (!A06(this) || DbX.A1b(this.A0R)) {
                this.A0A.A0N(str, str4, true);
                return;
            }
            this.A02 = false;
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            List A002 = A00((C333777a7) this.A0B.A03.getValue(), this, str, str4);
            AnonymousClass7TE.A1Z(new MFj(A002, mediaCommentListRepository, str3, str4, (AnonymousClass4D7) null, 1, true), mediaCommentListRepository.A01);
        } else if (list.size() == 1) {
            this.A0O.Epw(new AnonymousClass9IK(IN5.A00));
        }
    }

    public final void A0h(String str, String str2, boolean z) {
        this.A0B.A01(new C58773IxK(this, str, str2, 3, z));
        A05(this, true);
    }

    public final void A0i(String str, String str2, boolean z, String str3) {
        1Xj BPf;
        String str4 = str;
        0qQ.A0B(str, 0);
        String str5 = str2;
        String str6 = str3;
        AnonymousClass7TG.A1P(str2, str3);
        A05(this, false);
        1Xl r0 = this.A0B.A00;
        if (r0 != null && (BPf = r0.BPf()) != null) {
            this.A0D.A00(new C240343Kn(this.A0E, BPf, A0E(BPf), str6, str4, str5, z));
        }
    }

    public static final List A00(C333777a7 r13, C52971GgO ggO, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        C55770Hn5 hn5;
        C335907dj A012 = C335067cK.A01(C51968G9o.A0g(ggO.A0A), str, str2);
        1sw r1 = null;
        if (A012 == null) {
            return null;
        }
        C335457cz r2 = C335457cz.A00;
        C333777a7 r4 = r13;
        if (r13 != null) {
            z = r13.A0f;
            z2 = r13.A0e;
            z3 = r13.A0c;
            r1 = r13.A06;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean A1W = AnonymousClass7TF.A1W(r1, 1sw.A04);
        boolean z4 = ggO.A08.A0b;
        C333717a0 r5 = ggO.A0C;
        UserSession userSession = ggO.A0E;
        ArrayList A022 = r2.A02(A012, r4, r5, userSession, DbT.A0j(userSession), z, z2, z3, A1W, z4, true);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            C59481JLf jLf = (C59481JLf) it.next();
            GNG gng = new GNG(1, jLf, ggO);
            if (C53495GpR.A00(0, jLf)) {
                C55462Hi6 hi6 = new C55462Hi6(2131956345);
                hn5 = new C55770Hn5(H3T.A00, new C55461Hi5(R.drawable.instagram_block_pano_outline_24), hi6, gng);
            } else {
                if (!0qQ.A0K(jLf, C57057IMx.A00)) {
                    if (0qQ.A0K(jLf, C57058IMy.A00)) {
                        continue;
                    } else if (0qQ.A0K(jLf, C57059IMz.A00)) {
                        C55462Hi6 hi62 = new C55462Hi6(2131956347);
                        hn5 = new C55770Hn5(H3T.A00, new C55461Hi5(R.drawable.instagram_delete_pano_outline_24), hi62, gng);
                    } else if (jLf instanceof C53494GpQ) {
                        if (((C53494GpQ) jLf).A03) {
                            C55462Hi6 hi63 = new C55462Hi6(2131956353);
                            hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_pin_pano_filled_24), hi63, gng);
                        } else {
                            C55462Hi6 hi64 = new C55462Hi6(2131956348);
                            hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_pin_pano_outline_24), hi64, gng);
                        }
                    } else if (0qQ.A0K(jLf, IN2.A00)) {
                        C55462Hi6 hi65 = new C55462Hi6(2131956352);
                        hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_user_unfollow_pano_outline_24), hi65, gng);
                    } else if (C53495GpR.A00(1, jLf)) {
                        C55462Hi6 hi66 = new C55462Hi6(2131956349);
                        hn5 = new C55770Hn5(H3T.A00, new C55461Hi5(R.drawable.instagram_report_pano_outline_24), hi66, gng);
                    } else if (0qQ.A0K(jLf, IN1.A00)) {
                        C55462Hi6 hi67 = new C55462Hi6(2131956344);
                        hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_new_story_pano_outline_24), hi67, gng);
                    } else if (C53496GpS.A00(1, jLf)) {
                        C55462Hi6 hi68 = new C55462Hi6(2131966184);
                        hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_app_messenger_pano_outline_24), hi68, gng);
                    } else if (!0qQ.A0K(jLf, IN0.A00)) {
                        if (0qQ.A0K(jLf, IN3.A00)) {
                            C55462Hi6 hi69 = new C55462Hi6(2131956354);
                            hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_restrict_pano_outline_24), hi69, gng);
                        } else if (jLf instanceof C53493GpP) {
                            C55462Hi6 hi610 = new C55462Hi6(2131972799);
                            hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_user_pano_outline_20), hi610, gng);
                        } else if (C53496GpS.A00(0, jLf)) {
                            C55462Hi6 hi611 = new C55462Hi6(2131956360);
                            hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_app_threads_pano_outline_24), hi611, gng);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    }
                }
                C55462Hi6 hi612 = new C55462Hi6(2131956350);
                hn5 = new C55770Hn5(H3U.A00, new C55461Hi5(R.drawable.instagram_restrict_pano_outline_24), hi612, gng);
            }
            A1C.add(hn5);
        }
        return 00k.A0a(A1C);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C53285GlX r22, X.C52971GgO r23, X.1Xl r24) {
        /*
            r13 = r24
            X.1Xj r0 = r13.BPf()
            boolean r0 = r0.CcK()
            r2 = r23
            X.7a0 r10 = r2.A0C
            r3 = r22
            if (r0 == 0) goto L_0x00e1
            X.1Xj r0 = r13.BPf()
            boolean r0 = r0.A5D()
            r12 = -1
            if (r0 == 0) goto L_0x001e
            r12 = 0
        L_0x001e:
            long r5 = r3.A01
            X.GmL r0 = r2.A08
            java.lang.Integer r11 = r0.A06
            java.lang.Integer r9 = r0.A05
            java.lang.String r8 = r0.A0A
            java.lang.String r7 = r0.A0D
            r1 = 0
            X.1Xj r3 = r13.BPf()
            com.instagram.common.session.UserSession r2 = r10.A02
            X.0kM r0 = new X.0kM
            r0.<init>(r2)
            X.4DU r14 = r10.A03
            r0.A00 = r14
            X.0wc r4 = r0.A00()
            java.lang.String r0 = "instagram_ad_comment"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00e0
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.0qQ.A07(r0)
            X.1QM r0 = r0.A02
            java.lang.String r10 = r0.A00
            java.lang.String r13 = r14.getModuleName()
            java.lang.String r0 = "source_of_action"
            X.C51972G9s.A16(r4, r3, r0, r13)
            java.lang.String r0 = X.C294185m0.A08(r3)
            X.DbS.A1J(r4, r0)
            java.lang.String r0 = X.C294185m0.A07(r2, r3, r14)
            X.C51965G9l.A1L(r4, r0)
            X.0qQ.A0B(r3, r1)
            java.lang.String r1 = X.C51965G9l.A0t(r3)
            java.lang.String r0 = "inventory_source"
            X.C51974G9v.A0p(r4, r3, r0, r1)
            X.G9w.A18(r4, r2, r3)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "is_from_inline_composer"
            r4.A9F(r0, r1)
            double r0 = (double) r5
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "comment_compose_duration"
            r4.A8D(r0, r1)
            X.G9w.A19(r4, r3, r10, r12)
            X.C51965G9l.A1R(r4, r8)
            java.lang.String r0 = "ranking_session_id"
            r4.AAJ(r0, r7)
            if (r11 == 0) goto L_0x00b3
            int r0 = r11.intValue()
        L_0x009d:
            java.lang.Long r1 = X.DbS.A0j(r0)
        L_0x00a1:
            java.lang.String r0 = "client_position"
            r4.A9F(r0, r1)
            java.lang.String r0 = r3.getId()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r3 = X.C231122qu.A0H(r2, r0)
            if (r3 == 0) goto L_0x00dd
            goto L_0x00bc
        L_0x00b3:
            if (r9 == 0) goto L_0x00ba
            int r0 = r9.intValue()
            goto L_0x009d
        L_0x00ba:
            r1 = 0
            goto L_0x00a1
        L_0x00bc:
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r3)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.String r0 = "host_profile_id"
            r4.A9F(r0, r1)     // Catch:{ NumberFormatException -> 0x00cb }
            goto L_0x00dd
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00cb:
            X.0wj r2 = X.0wj.A01
            r1 = 817902424(0x30c03358, float:1.3984431E-9)
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r3)
            X.DbT.A1Q(r2, r0, r1)
        L_0x00dd:
            r4.Cgf()
        L_0x00e0:
            return
        L_0x00e1:
            X.7a3 r0 = r2.A09
            X.0Ud r1 = r0.A0D
            java.lang.Object r0 = r1.getValue()
            X.7cr r0 = (X.C335377cr) r0
            r8 = 0
            if (r0 == 0) goto L_0x014e
            java.lang.String r9 = r0.A02
        L_0x00f0:
            java.lang.Object r0 = r1.getValue()
            X.7cr r0 = (X.C335377cr) r0
            if (r0 == 0) goto L_0x00fa
            java.lang.String r8 = r0.A04
        L_0x00fa:
            long r0 = r3.A01
            X.GmL r5 = r2.A08
            java.lang.String r7 = r5.A0C
            java.lang.Integer r4 = r5.A06
            java.lang.Integer r2 = r5.A05
            java.lang.Integer r3 = r5.A04
            java.lang.String r6 = r5.A0A
            java.lang.String r5 = r5.A0D
            r24 = 0
            com.instagram.common.session.UserSession r12 = r10.A02
            X.4DU r14 = r10.A03
            int r21 = X.C333717a0.A00(r4, r2)
            X.1Xj r2 = r13.BPf()
            java.lang.Long r2 = X.C294185m0.A03(r2, r3)
            if (r2 == 0) goto L_0x014c
            long r2 = r2.longValue()
            int r4 = (int) r2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
        L_0x0127:
            r11 = 0
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r5
            r22 = r0
            r16 = r9
            X.3sc r3 = X.C254513sb.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            X.1Xj r2 = r13.BPf()
            X.1Xj r0 = r13.BPf()
            boolean r1 = r0.A5D()
            r0 = -1
            if (r1 == 0) goto L_0x0148
            r0 = 0
        L_0x0148:
            X.C233822wX.A0E(r12, r3, r2, r14, r0)
            return
        L_0x014c:
            r15 = 0
            goto L_0x0127
        L_0x014e:
            r9 = r8
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52971GgO.A02(X.GlX, X.GgO, X.1Xl):void");
    }

    public static final void A03(C52971GgO ggO) {
        String str;
        C333777a7 r0;
        User user;
        C52971GgO ggO2 = ggO;
        C333757a5 r2 = ggO2.A0B;
        AnonymousClass0Ud r1 = r2.A03;
        C333777a7 r02 = (C333777a7) r1.getValue();
        if (r02 == null || (user = r02.A0A) == null) {
            str = "";
        } else {
            str = user.getUsername();
        }
        05G r12 = r2.A02;
        C333777a7 r03 = (C333777a7) r1.getValue();
        if (r03 != null) {
            Integer num = r03.A0B;
            boolean z = r03.A0Y;
            String str2 = r03.A0H;
            boolean z2 = r03.A0T;
            boolean z3 = r03.A0W;
            boolean z4 = r03.A0Z;
            boolean z5 = r03.A0U;
            boolean z6 = r03.A0g;
            boolean z7 = r03.A0a;
            boolean z8 = r03.A0b;
            boolean z9 = r03.A0c;
            boolean z10 = r03.A0d;
            boolean z11 = r03.A0e;
            boolean z12 = r03.A0f;
            User user2 = r03.A0A;
            String str3 = r03.A0I;
            1iA r10 = r03.A05;
            String str4 = r03.A0J;
            String str5 = r03.A0K;
            ProductType productType = r03.A07;
            String str6 = r03.A0L;
            String str7 = r03.A0O;
            String str8 = r03.A0P;
            String str9 = r03.A0D;
            boolean z13 = r03.A0h;
            String str10 = r03.A0E;
            Long l = r03.A0C;
            String str11 = r03.A0F;
            boolean z14 = r03.A0V;
            1sw r8 = r03.A06;
            C272034jz r24 = r03.A09;
            C272034jz r25 = r03.A08;
            AnonymousClass3QO r7 = r03.A04;
            int i = r03.A00;
            boolean z15 = r03.A0R;
            Map map = r03.A0Q;
            ImageUrl imageUrl = r03.A03;
            boolean z16 = r03.A0X;
            String str12 = r03.A0G;
            String str13 = r03.A0M;
            String str14 = r03.A0N;
            TestimonialDict testimonialDict = r03.A02;
            IGCommentSheetMoreInfo iGCommentSheetMoreInfo = r03.A01;
            C51969G9p.A1S(str3, 16, r10);
            0qQ.A0B(str5, 19);
            0qQ.A0B(r8, 30);
            0qQ.A0B(r7, 33);
            r0 = new C333777a7(iGCommentSheetMoreInfo, testimonialDict, imageUrl, r7, r10, r8, productType, r24, r25, user2, num, l, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, map, i, true, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16);
        } else {
            r0 = null;
        }
        r12.Epw(r0);
        ggO2.A0O.Epw(new C376589Io(str, 1));
    }

    public static final void A04(C52971GgO ggO, Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        if (z) {
            A03(ggO);
        } else if (list != null && !list.isEmpty()) {
            ggO.A0P.Epw(new AXY(num, str, str2, list));
        }
        C333787a8 r4 = ggO.A07;
        ConcurrentHashMap concurrentHashMap = r4.A03;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            r4.A00.flowMarkPoint(number.longValue(), "request_end");
        }
        C333787a8.A00(r4, str, "post_comment_fail", str3, str4, concurrentHashMap);
    }

    public static final void A05(C52971GgO ggO, boolean z) {
        ggO.A0O.Epw(new AnonymousClass9I3(z, 1));
    }

    public static final boolean A06(C52971GgO ggO) {
        C53335GmL gmL = ggO.A08;
        if (!gmL.A0d && !gmL.A0e) {
            UserSession userSession = ggO.A0E;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36319042319031162L) || 182.A06(r2, userSession, 36323032344177408L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A07(C52971GgO ggO) {
        User user;
        C333777a7 r0 = (C333777a7) ggO.A0B.A03.getValue();
        if (r0 == null || (user = r0.A0A) == null) {
            return false;
        }
        return 0qQ.A0K(AnonymousClass0t1.A01.A01(ggO.A0E), user);
    }

    public final void A0F() {
        Dba.A1I(this.A0C.A01, "tap_on_avatar_comment");
        if (0qQ.A0K(25x.A00(this.A0E).A01.A00, C299715vi.A00)) {
            A0k(true);
            return;
        }
        this.A0O.Epw(new AnonymousClass9IK((Object) new C64509LdB(this, 2), 4));
    }

    public final void A0G() {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        mediaCommentListRepository.A0S(new C58177Inh(this, 49));
        if (C51968G9o.A0g(mediaCommentListRepository).A09) {
            C53335GmL gmL = this.A08;
            if (gmL.A0e && gmL.A0O) {
                mediaCommentListRepository.A0E();
            }
        }
    }

    public final void A0I(CommentGiphyMediaInfo commentGiphyMediaInfo) {
        1Xl r9 = this.A0B.A00;
        if (r9 != null) {
            String A0j = AnonymousClass7TG.A0j();
            C333787a8 r11 = this.A07;
            String str = this.A0J;
            AnonymousClass0Ud r1 = this.A09.A0D;
            boolean A1V = AnonymousClass7TF.A1V(r1.getValue());
            C53335GmL gmL = this.A08;
            r11.A02(gmL.A01, r9.BPf().BR7(), str, A0j, gmL.A00, 0, A1V);
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            String str2 = null;
            C53285GlX glX = new C53285GlX((AnonymousClass7a4) null, A0j, "", 0, 0, false);
            C335377cr r12 = (C335377cr) r1.getValue();
            if (r12 != null) {
                str2 = r12.A02;
            }
            mediaCommentListRepository.A0F(commentGiphyMediaInfo, new C57055IMv(this, 1), new C57056IMw(this, 1), glX, (AnonymousClass571) null, (AnonymousClass572) null, r9, str2);
            r11.A03(A0j);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0J(C53285GlX glX, long j, boolean z) {
        C333757a5 r5 = this.A0B;
        1Xl r4 = r5.A00;
        if (r4 != null) {
            UserSession userSession = this.A0E;
            String A002 = LKN.A00(userSession);
            if (A002 == null) {
                A002 = AnonymousClass7TG.A0j();
                LKN.A01(userSession, A002);
            }
            C53285GlX glX2 = glX;
            C335377cr A003 = this.A09.A00(glX2.A04);
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            1Xl r10 = r5.A00;
            if (r10 != null) {
                AnonymousClass7a4 r0 = glX2.A02;
                String str = null;
                if (r0 != null) {
                    r0.A00();
                }
                if (A003 != null) {
                    str = A003.A04;
                }
                C41567AwZ awZ = new C41567AwZ(4, glX2, this, r4);
                C74189PqV pqV = new C74189PqV((Object) glX2, (Object) this, (Object) A003, A002, 25);
                C57056IMw iMw = new C57056IMw(this, 3);
                C57055IMv iMv = new C57055IMv(this, 3);
                AnonymousClass7TE.A1Z(new MediaCommentListRepository$postDelayedComment$1((CommentGiphyMediaInfo) null, iMv, iMw, mediaCommentListRepository, glX2, (AnonymousClass571) null, (AnonymousClass572) null, r10, A002, str, (AnonymousClass4D7) null, awZ, pqV, j, z), mediaCommentListRepository.A01);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A0K(C336617eu r6) {
        this.A0B.A00(new C59101J6j(44, (Object) this, (Object) r6));
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        String str = r6.A06;
        mediaCommentListRepository.A0K(r6.A03, Integer.valueOf(r6.A00), str, r6.A05);
    }

    public final void A0L(C333897aK r12, String str) {
        05G r2;
        1Xl r0;
        1Xj BPf;
        C333897aK r5 = C333897aK.SHOW_TRANSLATION;
        if (!(r12 != r5 || (r0 = this.A0B.A00) == null || (BPf = r0.BPf()) == null)) {
            C333717a0 r3 = this.A0C;
            C53335GmL gmL = this.A08;
            r3.A06(BPf, gmL.A04, gmL.A06, gmL.A05);
        }
        String str2 = str;
        if (str != null) {
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            C376649Iu r7 = (C376649Iu) mediaCommentListRepository.A0J.getValue();
            if (r12 != r5) {
                r2 = mediaCommentListRepository.A0G;
                r12 = C333897aK.SHOW_ORIGINAL;
            } else if (r7.A01 != null) {
                r2 = mediaCommentListRepository.A0G;
            } else {
                AnonymousClass7TE.A1Z(new C66174MGl((Object) mediaCommentListRepository, (Object) r7, str2, (AnonymousClass4D7) null, 19), mediaCommentListRepository.A01);
                return;
            }
            r2.Epw(new C376649Iu(r12, r7.A01));
        }
    }

    public final void A0M(C333897aK r10, String str, String str2) {
        1Xl r0;
        1Xj BPf;
        C333897aK r5 = r10;
        if (!(r10 != C333897aK.SHOW_TRANSLATION || (r0 = this.A0B.A00) == null || (BPf = r0.BPf()) == null)) {
            C333717a0 r3 = this.A0C;
            C53335GmL gmL = this.A08;
            r3.A06(BPf, gmL.A04, gmL.A06, gmL.A05);
        }
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass7TE.A1Z(new C376999Kd(mediaCommentListRepository, r5, str, str2, (AnonymousClass4D7) null), mediaCommentListRepository.A01);
    }

    public final void A0O(C59481JLf jLf) {
        Object r6;
        Long A0n;
        1Xj r5;
        String str;
        Object r13;
        Object r1;
        Object r3;
        C14068TpH tpH;
        C16677UzD uzD;
        C59481JLf jLf2 = jLf;
        0qQ.A0B(jLf2, 0);
        I47 i47 = (I47) this.A0L.getValue();
        05G r0 = this.A0O;
        05G r8 = this.A0P;
        C318136oS A002 = C318116oQ.A00(this);
        C333717a0 r12 = this.A0C;
        C58161InR inR = new C58161InR(this, 6);
        0qQ.A0B(r0, 1);
        AnonymousClass7TF.A1D(r8, 2, r12);
        MediaCommentListRepository mediaCommentListRepository = i47.A01;
        C333867aH A0g = C51968G9o.A0g(mediaCommentListRepository);
        0qQ.A0B(A0g, 0);
        ArrayList A0A2 = C335067cK.A0A(A0g, J1R.A00);
        if (A0A2.isEmpty()) {
            r3 = new AnonymousClass9IK(new C53498GpU(DbS.A0Q(new Object[0], 2131956373)));
        } else if (jLf2.equals(C57059IMz.A00)) {
            C51965G9l.A0l().markerPoint(309476254, "select_comment_screen_delete_comments_tap");
            i47.A03.A01(r12, A002, r0);
            return;
        } else {
            if (!C53495GpR.A00(1, jLf2)) {
                if (jLf2 instanceof C53494GpQ) {
                    I21 i21 = I21.A00;
                    UserSession userSession = i47.A04;
                    C53494GpQ gpQ = (C53494GpQ) jLf2;
                    boolean z = gpQ.A03;
                    boolean z2 = !z;
                    02m A0l = C51965G9l.A0l();
                    if (z2) {
                        A0l.markerPoint(309476254, "select_comment_screen_pin_comment_tap");
                        i21.A01(userSession);
                    } else {
                        A0l.markerPoint(309476254, "select_comment_screen_unpin_comment_tap");
                    }
                    String str2 = gpQ.A00;
                    String str3 = gpQ.A01;
                    boolean z3 = gpQ.A02;
                    0qQ.A0B(str2, 0);
                    if (z) {
                        0qQ.A0B(str3, 1);
                        r1 = new C376469Ic((DialogInterface.OnCancelListener) new I88(this, str2, str3, z3), (DialogInterface.OnClickListener) new I8L(this, str2, str3, 1, z3), (DialogInterface.OnClickListener) new I8L(this, str2, str3, 0, z3));
                    } else {
                        0qQ.A0B(str3, 1);
                        r12.A0D("pin_comment", str2, str3, z3);
                        r0.Epw(C334787bs.A00);
                        C20611Wvs wvs = new C20611Wvs(this, 1);
                        C20611Wvs wvs2 = new C20611Wvs(this, 0);
                        MediaCommentListRepository mediaCommentListRepository2 = ((C55465Hi9) this.A0N.getValue()).A00;
                        AnonymousClass0Ud r32 = mediaCommentListRepository2.A0L;
                        int i = 3;
                        if (((C333867aH) r32.getValue()).A08) {
                            i = 4;
                        }
                        if (((C333867aH) r32.getValue()).A00 >= i) {
                            r1 = C334777br.A00;
                        } else {
                            AnonymousClass7TE.A1Z(new MH7((Object) wvs, (Object) wvs2, (Object) mediaCommentListRepository2, str2, (AnonymousClass4D7) null, 6), mediaCommentListRepository2.A01);
                            return;
                        }
                    }
                } else if (C53495GpR.A00(0, jLf2)) {
                    ArrayList A0p = AnonymousClass7TF.A0p(A0A2);
                    Iterator it = A0A2.iterator();
                    while (it.hasNext()) {
                        A0p.add(((C335907dj) it.next()).A0K);
                    }
                    String A042 = r12.A04();
                    C51965G9l.A0l().markerPoint(309476254, "select_comment_screen_block_comments_tap");
                    C51965G9l.A0l().markerPoint(309476254, AnonymousClass000.A00(2707));
                    C333717a0.A02(r12, "bulk_block_button", A042, A0p);
                    if (((C53495GpR) jLf2).A01) {
                        r3 = new C334767bq(((C335907dj) 00k.A0I(A0A2)).A0C, (String) 00k.A0I(A0p));
                    } else {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        Iterator it2 = A0A2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            DbY.A1T(((C335907dj) next).A0C, AnonymousClass0t1.A01.A01(i47.A04), next, A1C);
                        }
                        ArrayList A0p2 = AnonymousClass7TF.A0p(A1C);
                        Iterator it3 = A1C.iterator();
                        while (it3.hasNext()) {
                            A0p2.add(((C335907dj) it3.next()).A0C.getId());
                        }
                        Set A0k = 00k.A0k(A0p2);
                        r1 = new AnonymousClass9IX(new C58221IoP(r12, i47, A042, A0p, A0A2, A0k, r0), new C73949PmT(A0p, r12, A042, 17), A0k.size(), 0);
                    }
                } else {
                    if (jLf2.equals(IN2.A00)) {
                        I21 i212 = I21.A00;
                        UserSession userSession2 = i47.A04;
                        C51965G9l.A0l().markerPoint(309476254, "unfollow_account_click");
                        i212.A01(userSession2);
                        r6 = new C334687bi(((C335907dj) 00k.A0I(A0A2)).A0C);
                    } else if (jLf2.equals(C57057IMx.A00)) {
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        Iterator it4 = A0A2.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            DbY.A1T(((C335907dj) next2).A0C, AnonymousClass0t1.A01.A01(i47.A04), next2, A1C2);
                        }
                        ArrayList A0p3 = AnonymousClass7TF.A0p(A1C2);
                        Iterator it5 = A1C2.iterator();
                        while (it5.hasNext()) {
                            A0p3.add(((C335907dj) it5.next()).A0C.getId());
                        }
                        Set A0k2 = 00k.A0k(A0p3);
                        ArrayList A0p4 = AnonymousClass7TF.A0p(A0A2);
                        Iterator it6 = A0A2.iterator();
                        while (it6.hasNext()) {
                            A0p4.add(((C335907dj) it6.next()).A0K);
                        }
                        String A043 = r12.A04();
                        C51965G9l.A0l().markerPoint(309476254, "select_comment_screen_restrict_comments_tap");
                        C333717a0.A02(r12, "bulk_block_button", A043, A0p4);
                        C51965G9l.A0l().markerPoint(309476254, AnonymousClass000.A00(3893));
                        r1 = new AnonymousClass9IX(new C58220IoO(r12, A0k2, A0p4, r0, A043, 2), new C73949PmT(A0p4, r12, A043, 18), A0k2.size(), 1);
                    } else {
                        String str4 = "";
                        String str5 = null;
                        if (C53496GpS.A00(1, jLf2)) {
                            if (((C53496GpS) jLf2).A01 == AnonymousClass05K.A00) {
                                C335907dj r82 = (C335907dj) 00k.A0I(A0A2);
                                C333757a5 r62 = i47.A02;
                                1Xl r2 = r62.A00;
                                if (r2 != null) {
                                    r5 = r2.BPf();
                                } else {
                                    r5 = null;
                                }
                                mediaCommentListRepository.A0D();
                                r62.A00(new J6W(11, r12, r82, i47));
                                if (r5 != null) {
                                    str = r5.A0P;
                                    str5 = r5.A0Q;
                                } else {
                                    str = null;
                                }
                                String str6 = r82.A0K;
                                String str7 = r82.A0J;
                                if (str7 == null) {
                                    str7 = str4;
                                }
                                r13 = new C334827bw(r5, r82.A0C, str, str5, str6, str7);
                            } else {
                                return;
                            }
                        } else if (jLf2.equals(IN1.A00)) {
                            if (DbT.A1b(A0A2)) {
                                C335907dj r10 = (C335907dj) 00k.A0I(A0A2);
                                I21 i213 = I21.A00;
                                UserSession userSession3 = i47.A04;
                                C51965G9l.A0l().markerPoint(309476254, "comment_share_click");
                                i213.A01(userSession3);
                                String str8 = r10.A0K;
                                String str9 = r10.A0J;
                                if (str9 != null) {
                                    str4 = str9;
                                }
                                User user = r10.A0C;
                                r0.Epw(new AnonymousClass9J9(user, str8, str4));
                                String id = user.getId();
                                C333777a7 r02 = (C333777a7) i47.A02.A03.getValue();
                                if (r02 != null) {
                                    str5 = r02.A0K;
                                }
                                0Aj A0e = AnonymousClass7TE.A0e(r12.A01, "ig_creator_connections_events");
                                DbS.A1I(A0e, "click");
                                A0e.A8M(EZb.COMMENTS, "screen");
                                DbS.A1N(A0e, AnonymousClass000.A00(2898));
                                A0e.A8M(C54669HOa.SHARE_COMMENT_TO_STORY, "project");
                                A0e.A9F(C273654mx.A00(116), 00y.A0n(10, r12.A02.A06));
                                Long A0n2 = 00y.A0n(10, id);
                                if (A0n2 != null) {
                                    A0e.A9F(C273654mx.A00(410), A0n2);
                                }
                                if (!(str5 == null || (A0n = 00y.A0n(10, str5)) == null)) {
                                    A0e.A9F("media_igid", A0n);
                                }
                                A0e.AAJ("extra", new JSONObject(AnonymousClass7TF.A0w("comment_id", str8)).toString());
                                A0e.Cgf();
                                return;
                            }
                            return;
                        } else if (jLf2.equals(C57058IMy.A00)) {
                            mediaCommentListRepository.A0D();
                            return;
                        } else if (jLf2.equals(IN0.A00)) {
                            C335907dj r33 = (C335907dj) 00k.A0I(A0A2);
                            r6 = new C334877c1(r33.A0C, new C57476IbK((C335907dj) 00k.A0I(A0A2), r12, i47, inR), r33.A0K, r33.A0N, I47.A00(AnonymousClass7TE.A1I(r33)));
                        } else if (jLf2.equals(IN3.A00)) {
                            C335907dj r63 = (C335907dj) 00k.A0I(A0A2);
                            i47.A02.A00(new C59101J6j(43, (Object) r63, (Object) r12));
                            String str10 = r63.A0K;
                            String str11 = r63.A0N;
                            User user2 = r63.A0C;
                            0qQ.A0B(str10, 0);
                            A0V(user2, str10, str11);
                            return;
                        } else if (jLf2 instanceof C53493GpP) {
                            r8.Epw(new C335267cg(((C53493GpP) jLf2).A00));
                            return;
                        } else if (C53496GpS.A00(0, jLf2)) {
                            C335907dj r14 = (C335907dj) 00k.A0I(A0A2);
                            String str12 = r14.A0J;
                            if (str12 == null) {
                                str12 = str4;
                            }
                            r0.Epw(new C334937c7((ProductType) ((C53496GpS) jLf2).A01, str12, r14.A0M, r14.A0L, r14.A0K, r14.A0C.getId()));
                            return;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    }
                    r0.Epw(r6);
                    return;
                }
                r0.Epw(r1);
                return;
            } else if (DbT.A1b(A0A2)) {
                C335907dj r9 = (C335907dj) 00k.A0I(A0A2);
                C61084JwM A003 = C335067cK.A00(A0A2);
                String str13 = r9.A0K;
                User user3 = r9.A0C;
                user3.getId();
                int size = A0A2.size();
                UserSession userSession4 = r12.A02;
                C51965G9l.A0l().markerPoint(309476254, "select_comment_screen_self_remediation_actions_icon_tap");
                r12.A0B("comments_bulk_report_tapped", size);
                userSession4.A01(C49530ExC.class, new GA1(44, userSession4, false));
                boolean z4 = ((C53495GpR) jLf2).A01;
                if (z4 && I47.A01(i47, user3)) {
                    i47.A02.A00(new C59101J6j(42, (Object) r9, (Object) r12));
                }
                HH3 hh3 = new HH3(0, i47, r0, A003);
                C335847dd r22 = r9.A07;
                String str14 = r22.A04;
                boolean z5 = r22.A05;
                if (!z5 || str14 == null) {
                    str14 = str13;
                }
                if (z5) {
                    tpH = C14068TpH.CLIPS_POST;
                    uzD = C16677UzD.MEDIA;
                } else {
                    tpH = C14068TpH.COMMENTS;
                    uzD = C16677UzD.COMMENT;
                }
                String str15 = r9.A0N;
                String str16 = i47.A00.A0E;
                C57476IbK ibK = new C57476IbK((C335907dj) 00k.A0I(A0A2), r12, i47, inR);
                HH3 hh32 = hh3;
                C57476IbK ibK2 = ibK;
                String str17 = str14;
                String str18 = str13;
                String str19 = str15;
                r13 = new C334747bo(user3, tpH, uzD, hh32, ibK2, str17, str18, str19, str16, I47.A00(AnonymousClass7TE.A1I(r9)), I47.A01(i47, user3), z4);
            } else {
                return;
            }
            r0.Epw(r13);
            return;
        }
        r0.Epw(r3);
    }

    public final void A0P(1bK r5, String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass7TE.A1Z(new MediaCommentListRepository$locallyHideComment$1(mediaCommentListRepository, str, str2, (AnonymousClass4D7) null), mediaCommentListRepository.A01);
        this.A0O.Epw(new AnonymousClass9J9(r5, str, str2));
        A05(this, false);
    }

    public final void A0Q(C337207ft r4, String str) {
        this.A0C.A05(r4);
        this.A0P.Epw(new C335247ce((AnonymousClass7a4) null, str));
    }

    public final void A0V(User user, String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        C59101J6j j6j = new C59101J6j(45, (Object) this, (Object) user);
        C20611Wvs wvs = new C20611Wvs(this, 4);
        AnonymousClass7TE.A1Z(new JVS(j6j, wvs, mediaCommentListRepository, str, str2, (AnonymousClass4D7) null, 0), mediaCommentListRepository.A01);
    }

    public final void A0W(User user, String str, boolean z) {
        User user2;
        1Xj BPf;
        HLF hlf;
        C333757a5 r2 = this.A0B;
        1Xl r0 = r2.A00;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams = null;
        if (!(r0 == null || (BPf = r0.BPf()) == null || str == null)) {
            C333717a0 r1 = this.A0C;
            UserSession userSession = r1.A02;
            C240443Kx.A00(userSession).Eaj(str);
            AnonymousClass4DU r7 = r1.A03;
            C271794jb r4 = new C271794jb(userSession, BPf);
            int i = -1;
            if (BPf.A5D()) {
                i = 0;
            }
            r4.A00 = i;
            boolean A2Q = user.A2Q();
            if (user.equals(BPf.A2A(userSession))) {
                hlf = HLF.BRAND;
            } else {
                hlf = HLF.USER;
            }
            C233822wX.A0K(userSession, r4, hlf, BPf, r7, (C249763kK) null, (Integer) null, (String) null, A2Q);
        }
        C333777a7 r02 = (C333777a7) r2.A03.getValue();
        if (r02 != null) {
            user2 = r02.A0A;
        } else {
            user2 = null;
        }
        if (z && user2 != null) {
            userPayFanclubUpsellParams = FGM.A00(this.A0E, user2);
        }
        this.A0O.Epw(new AnonymousClass9J9(userPayFanclubUpsellParams, user.getId(), str));
    }

    public final void A0a(String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass7TE.A1Z(new MGN((Object) mediaCommentListRepository, str, str2, (AnonymousClass4D7) null, 3), mediaCommentListRepository.A01);
    }

    public final void A0b(String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass7TE.A1Z(new MFe((Object) mediaCommentListRepository, str2, str, (AnonymousClass4D7) null, 3), mediaCommentListRepository.A01);
    }

    public final void A0e(String str, String str2) {
        this.A0C.A0C(str2, this.A08.A0E, str, (String) null);
    }

    public final void A0f(String str, String str2) {
        1Xl r11 = this.A0B.A00;
        if (r11 != null) {
            C333787a8 r2 = this.A07;
            String str3 = this.A0J;
            boolean A1V = AnonymousClass7TF.A1V(this.A09.A0D.getValue());
            C53335GmL gmL = this.A08;
            int i = gmL.A00;
            r2.A02(gmL.A01, r11.BPf().BR7(), str3, str, i, 0, A1V);
            r2.A03(str);
            this.A0A.A0G(new C57055IMv(this, 4), new C57056IMw(this, 4), r11, str, str2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0j(UUID uuid) {
        UUID uuid2;
        05G r2 = this.A0S;
        C334027aY r1 = (C334027aY) r2.getValue();
        if (r1 instanceof C335537d7) {
            uuid2 = ((C335537d7) r1).A02;
        } else if (r1 instanceof C335547d8) {
            uuid2 = ((C335547d8) r1).A00;
        } else if (r1 instanceof C334017aX) {
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            AnonymousClass7TE.A1Z(new C66188MGz((Object) uuid, (Object) mediaCommentListRepository, (AnonymousClass4D7) null, 19), mediaCommentListRepository.A01);
            return;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (0qQ.A0K(uuid2, uuid)) {
            r2.Epw(C334017aX.A00);
        }
    }

    public final void A0k(boolean z) {
        1Xj r2;
        05G r4 = this.A0P;
        C333757a5 r3 = this.A0B;
        1Xl r0 = r3.A00;
        if (r0 != null) {
            r2 = r0.BPf();
        } else {
            r2 = null;
        }
        r4.Epw(new C335277ch(r2, z, false));
        r3.A00(new J6I(this, 20));
    }

    public final void A0l(boolean z) {
        28D r1;
        1Xl r12 = this.A0B.A00;
        if (r12 != null) {
            05G r3 = this.A0P;
            C335377cr r2 = (C335377cr) this.A09.A0D.getValue();
            boolean A5G = r12.BPf().A5G();
            if (z) {
                r1 = 28D.A5R;
            } else if (A5G) {
                r1 = 28D.A0u;
            } else {
                r1 = 28D.A2k;
            }
            r3.Epw(new C335307ck(r1, r2));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCleared() {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AnonymousClass7TE.A1Z(new C376879Jr(mediaCommentListRepository, (AnonymousClass4D7) null, 10), mediaCommentListRepository.A01);
        AnonymousClass0eM r1 = this.A0M;
        if (r1.CVQ()) {
            I0j i0j = (I0j) r1.getValue();
            Map map = i0j.A02;
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                I0j.A00((C61084JwM) A16.next(), i0j, C59446JJw.A00);
            }
            map.clear();
        }
        if (!this.A02) {
            I21.A00.A00(this.A0E);
        }
        C333747a3 r3 = this.A09;
        if (((String) r3.A0A.getValue()).length() > 0) {
            r3.A0D.getValue();
            this.A0B.A00(new J6I(this, 15));
            r3.A04(this.A08.A0E);
            return;
        }
        String str = this.A08.A0E;
        0qQ.A0B(str, 0);
        r3.A00.A00.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r4.CcK() != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3W1 A0E(X.1Xj r4) {
        /*
            r3 = this;
            X.3W1 r2 = X.G9t.A18(r4)
            X.1sy r0 = X.1sy.A08
            r2.A0O(r0)
            X.GmL r1 = r3.A08
            java.lang.Integer r0 = r1.A06
            if (r0 == 0) goto L_0x0016
            int r0 = r0.intValue()
            r2.A0D(r0)
        L_0x0016:
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x0021
            int r0 = r0.intValue()
            r2.A0B(r0)
        L_0x0021:
            int r0 = r4.A0w()
            if (r0 == 0) goto L_0x002e
            boolean r1 = r4.CcK()
            r0 = 1
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r2.A2V = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52971GgO.A0E(X.1Xj):X.3W1");
    }
}
