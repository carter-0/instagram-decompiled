package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Tqa  reason: case insensitive filesystem */
public final class C14140Tqa implements G88, C66526MVe, C74585PxY, C74428Pui, C74368Pti, XC1, XC2, XC4 {
    public String A00;
    public final UserSession A01;
    public final X42 A02;
    public final C293005js A03;
    public final C358448av A04;
    public final C20910X4b A05;
    public final C20911X4c A06;
    public final String A07;
    public final AnonymousClass32A A08;
    public final SearchContext A09;
    public final X4X A0A;
    public final C20964X6r A0B;
    public final C20909X4a A0C;
    public final C20985X8b A0D;
    public final C14437TwL A0E;
    public final C59830Ja5 A0F;
    public final C14436TwK A0G;
    public final String A0H;
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public C14140Tqa(UserSession userSession, X42 x42, C293005js r5, AnonymousClass32A r6, SearchContext searchContext, C358448av r8, X4X x4x, C20964X6r x6r, C20909X4a x4a, C20910X4b x4b, C20911X4c x4c, C20985X8b x8b, C14437TwL twL, C59830Ja5 ja5, C14436TwK twK, String str, String str2, C62320sa r20, C62320sa r21, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(userSession, 1);
        String str3 = str;
        C51974G9v.A0d(2, str3, x4b, x6r, twL);
        C13988Tno.A1O(x42, 9, r8);
        0qQ.A0B(x4c, 13);
        0qQ.A0B(x4x, 14);
        this.A01 = userSession;
        this.A07 = str3;
        this.A0H = str2;
        this.A05 = x4b;
        this.A0B = x6r;
        this.A0E = twL;
        this.A0G = twK;
        this.A0F = ja5;
        this.A02 = x42;
        this.A08 = r6;
        this.A04 = r8;
        this.A03 = r5;
        this.A06 = x4c;
        this.A0A = x4x;
        this.A0C = x4a;
        this.A0N = z;
        this.A0O = z2;
        this.A0D = x8b;
        this.A09 = searchContext;
        this.A0I = r20;
        this.A0J = r21;
        this.A0K = z3;
        this.A0L = z4;
        this.A0M = z5;
    }

    public final Integer Auv(String str) {
        return null;
    }

    public final void D1s() {
    }

    public final void D9T(AnonymousClass3UM r8, String str, int i) {
        0qQ.A0B(r8, 0);
        C14474Tww A002 = C14434TwI.A00(this.A01);
        User CCd = r8.CCd();
        0qQ.A0B(CCd, 0);
        C49516Ewv ewv = A002.A02;
        if (ewv != null) {
            ewv.A01.remove(CCd);
        }
        C49516Ewv ewv2 = A002.A02;
        if (ewv2 != null && ewv2.A01.isEmpty()) {
            A002.A02 = null;
        }
        C14467Twp twp = A002.A03;
        if (twp != null) {
            twp.A00();
        }
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = str;
            if (str != null) {
                this.A03.A01(r8.getId(), str2, str3, r8.getAlgorithm(), r8.BxN(), i);
            }
        }
    }

    public final void DDm(C66967Mg0 mg0, C66632Ma1 ma1) {
    }

    public final void DGN(AnonymousClass3UM r8, String str, int i) {
        0qQ.A0B(r8, 0);
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = str;
            if (str != null) {
                this.A03.A02(r8.getId(), str2, str3, r8.getAlgorithm(), r8.BxN(), i);
            }
        }
        C14467Twp twp = C14434TwI.A00(this.A01).A03;
        if (twp != null) {
            twp.A00();
        }
    }

    public final void DIe(C69160Nfj nfj, C66967Mg0 mg0) {
        HashtagImpl hashtagImpl = nfj.A00;
        A01((AnonymousClass0iw) null, nfj, mg0, AnonymousClass05K.A0C, (String) null);
        UserSession userSession = this.A01;
        AnonymousClass72K.A00(userSession, hashtagImpl.A0C, (String) null, 1);
        this.A0E.A06(hashtagImpl, this.A05.E4p(), mg0.A06, mg0.A00);
        A00();
        C14416Tvl.A00(userSession).A00(hashtagImpl);
        String str = hashtagImpl.A0D;
        if (str != null) {
            A04(C14407Tva.HASHTAG, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        if (r8 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        if (r7.equals("SUGGESTED") == false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMv(X.C67387Mn4 r23, X.C66967Mg0 r24) {
        /*
            r22 = this;
            r1 = 0
            r3 = r23
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r2 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r10 = X.0qQ.A0K(r2, r0)
            com.instagram.model.keyword.Keyword r0 = r3.A01
            X.0qQ.A0B(r0, r1)
            boolean r0 = r0.A0A
            r2 = r24
            if (r0 == 0) goto L_0x0139
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x0139
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x001e:
            r14 = 0
            r4 = r22
            r5 = r14
            r6 = r3
            r7 = r2
            r9 = r14
            r4.A01(r5, r6, r7, r8, r9)
            com.instagram.common.session.UserSession r5 = r4.A01
            r7 = 4
            if (r10 == 0) goto L_0x002f
            r7 = 13
        L_0x002f:
            java.lang.String r6 = r3.A01()
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r0 = r0.A04
            X.AnonymousClass72K.A00(r5, r6, r0, r7)
            java.lang.String r7 = r2.A08
            int r9 = r7.hashCode()
            r8 = -1881589157(0xffffffff8fd93a5b, float:-2.142033E-29)
            r0 = 2845(0xb1d, float:3.987E-42)
            java.lang.String r19 = X.C273654mx.A00(r0)
            r0 = 636(0x27c, float:8.91E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            if (r9 == r8) goto L_0x010a
            r0 = -1192641789(0xffffffffb8e9bb03, float:-1.11451394E-4)
            if (r9 == r0) goto L_0x0122
            r0 = 465802046(0x1bc3933e, float:3.2355197E-22)
            if (r9 != r0) goto L_0x012a
            java.lang.String r0 = "AI_CLOUD"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x012a
            boolean r7 = r4.A0L
            r0 = 630(0x276, float:8.83E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            r0 = 2842(0xb1a, float:3.982E-42)
            java.lang.String r19 = X.C273654mx.A00(r0)
        L_0x0071:
            if (r10 == 0) goto L_0x00a3
            if (r7 != 0) goto L_0x00a3
            X.TwL r7 = r4.A0E
            X.X4b r0 = r4.A05
            java.lang.String r2 = r0.E4p()
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A03
            r7.A0A(r6, r2, r1, r0)
        L_0x0086:
            r4.A00()
            X.Tvp r1 = X.C14417Tvm.A00(r5)
            com.instagram.model.keyword.Keyword r0 = r3.A01
            r1.A00(r0)
            X.6ra r1 = X.C319996rZ.A00(r5)
            java.lang.String r0 = r4.A07
            r1.A02(r0)
            if (r10 == 0) goto L_0x00a2
            X.0sa r0 = r4.A0J
            r0.invoke()
        L_0x00a2:
            return
        L_0x00a3:
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r6 = r0.A04
            X.X4X r0 = r4.A0A
            java.lang.String r0 = r0.E4o()
            boolean r8 = X.C51966G9m.A1a(r6, r0)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x00ee
            if (r8 == 0) goto L_0x00ee
            java.lang.String r0 = r4.A0H
            if (r0 != 0) goto L_0x00ee
            X.X4a r0 = r4.A0C
            if (r0 == 0) goto L_0x00c2
            r0.EIK()
        L_0x00c2:
            X.X8b r0 = r4.A0D
            if (r0 == 0) goto L_0x00c9
            r0.Euf()
        L_0x00c9:
            java.lang.String r0 = r2.A09
            java.lang.String r18 = X.VGE.A00(r0)
            X.TwL r11 = r4.A0E
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r12 = r0.A04
            X.X6r r0 = r4.A0B
            java.lang.String r13 = r0.E4z()
            int r2 = r2.A01
            com.instagram.model.keyword.Keyword r0 = r3.A01
            java.lang.String r0 = r0.A03
            r15 = r14
            r16 = r14
            r20 = r2
            r21 = r1
            r17 = r0
            r11.A0B(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0086
        L_0x00ee:
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x00f9
            if (r8 == 0) goto L_0x00f9
            java.lang.String r0 = r4.A0H
            if (r0 != 0) goto L_0x00f9
            goto L_0x00c2
        L_0x00f9:
            X.TwL r0 = r4.A0E
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            com.instagram.common.session.UserSession r6 = r0.A04
            X.6Yo r0 = new X.6Yo
            r0.<init>(r7, r6)
            r0.A0G(r14, r1)
            if (r8 == 0) goto L_0x0086
            goto L_0x00c9
        L_0x010a:
            java.lang.String r0 = "RECENT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x012a
            boolean r7 = r4.A0K
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            r0 = 744(0x2e8, float:1.043E-42)
            java.lang.String r19 = X.C273654mx.A00(r0)
            goto L_0x0071
        L_0x0122:
            java.lang.String r0 = "SUGGESTED"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0135
        L_0x012a:
            java.lang.String r0 = " should not have an entrypoint into MetaAI"
            java.lang.String r7 = X.002.A0R(r7, r0)
            java.lang.String r0 = "invalid_meta_ai_entrypoint"
            X.0wb.A03(r0, r7)
        L_0x0135:
            boolean r7 = r4.A0M
            goto L_0x0071
        L_0x0139:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14140Tqa.DMv(X.Mn4, X.Mg0):void");
    }

    public final void DcJ(F1A f1a, String str, int i) {
    }

    public final void Dw1(AnonymousClass3UM r8, String str, int i) {
        0qQ.A0B(r8, 0);
        int i2 = i;
        this.A0E.A09(r8.CCd(), this.A05.E4p(), (String) null, i);
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = str;
            if (str != null) {
                this.A03.A03(r8.getId(), str2, str3, r8.getAlgorithm(), r8.BxN(), i2);
            }
        }
    }

    public final void Dw5(AnonymousClass0iw r13, C66967Mg0 mg0, C66632Ma1 ma1) {
        C51973G9u.A1E(ma1, mg0, r13);
        A01(r13, ma1, mg0, AnonymousClass05K.A0C, (String) null);
        this.A0E.A09(ma1.A06(), this.A05.E4p(), mg0.A06, mg0.A00);
        if (!mg0.A0H) {
            UserSession userSession = this.A01;
            C14025ToR.A00(userSession).A01(ma1.A06());
            AnonymousClass72K.A00(userSession, ma1.A01(), (String) null, 0);
        }
        A00();
        A04(C14407Tva.USERS, ma1.A06().getUsername());
        C319996rZ.A00(this.A01).A02(this.A07);
    }

    public final void DwE(AnonymousClass0iw r12, C66967Mg0 mg0, C66632Ma1 ma1) {
        String str;
        15p r8;
        1NY A0b;
        if (mg0.A0H) {
            UserSession userSession = this.A01;
            C230012om r7 = new C230012om(r12, userSession);
            String A012 = ma1.A01();
            int i = mg0.A00;
            AnonymousClass6KM r1 = new AnonymousClass6KM("su_in_search_null_state", A012, r12.getModuleName());
            r1.A00 = i;
            r7.A08(new AnonymousClass6KN(r1));
            if ((ma1.A06().B6o() == FollowStatus.A05 || ma1.A06().B6o() == FollowStatus.A07) && (!ma1.A06().A2L())) {
                C14474Tww A002 = C14434TwI.A00(userSession);
                User A062 = ma1.A06();
                if (A002.A06) {
                    if (A002.A00 >= A002.A04) {
                        A002.A02 = null;
                        C14467Twp twp = A002.A03;
                        if (twp != null) {
                            twp.A00();
                        }
                    } else {
                        EDV edv = new EDV(33, A062, A002);
                        if (A002.A07 || A062.A0N() != AnonymousClass05K.A01) {
                            UserSession userSession2 = A002.A05;
                            String id = A062.getId();
                            0qQ.A0B(userSession2, 0);
                            r8 = null;
                            A0b = AnonymousClass7TG.A0b(userSession2);
                            A0b.A0A("discover/chaining/");
                            A0b.A9m("target_id", id);
                            A0b.A9m("surface", "search_typeahead");
                        } else {
                            UserSession userSession3 = A002.A05;
                            String id2 = A062.getId();
                            0qQ.A0B(userSession3, 0);
                            String A063 = 0mp.A06(AnonymousClass000.A00(3161), new Object[]{id2});
                            r8 = null;
                            A0b = AnonymousClass7TG.A0b(userSession3);
                            A0b.A0A(A063);
                            A0b.A9m("target_user_id", id2);
                            A0b.A9m("surface", "search_typeahead");
                            A0b.A9m(AnonymousClass000.A00(1455), "true");
                            A0b.A0C(AnonymousClass000.A00(3831), 0);
                        }
                        1OC A0R = DbT.A0R(r8, A0b, C334247ax.class, C334257ay.class, false);
                        A0R.A00 = edv;
                        A002.A01 = A0R;
                        1ES.A06(A0R, 359266386, false);
                    }
                }
                str = ma1.A06().getId();
            } else {
                C14474Tww A003 = C14434TwI.A00(userSession);
                1OC r0 = A003.A01;
                if (r0 != null) {
                    r0.cancel();
                }
                A003.A02 = null;
                C14467Twp twp2 = A003.A03;
                if (twp2 != null) {
                    twp2.A00();
                }
                str = null;
            }
            this.A00 = str;
            return;
        }
        OVV A004 = C70326O2e.A00(ma1);
        String str2 = mg0.A09;
        A004.A07 = str2;
        A004.A01 = mg0.A05;
        C14486Tx8 A013 = A004.A01();
        C358448av r2 = this.A04;
        String E4p = this.A05.E4p();
        int i2 = mg0.A00;
        r2.CiD(A013, this.A06.E51(), AnonymousClass05K.A0C, E4p, mg0.A06, VGE.A00(str2), ma1.A03, i2);
    }

    private final void A00() {
        C14475Twx A002 = C14139TqZ.A00(this.A01);
        C14478Tx0 tx0 = C14478Tx0.A03;
        long j = tx0.A00;
        if (j != 0) {
            A002.A00.flowEndSuccess(j);
            tx0.A00 = 0;
        }
    }

    private final void A01(AnonymousClass0iw r24, C66942Mfb mfb, C66967Mg0 mg0, Integer num, String str) {
        C66967Mg0 mg02 = mg0;
        String str2 = str;
        C66942Mfb mfb2 = mfb;
        if (mg02.A0H) {
            AnonymousClass0iw r2 = r24;
            if (r24 != null) {
                C230012om r6 = new C230012om(r2, this.A01);
                String A012 = mfb2.A01();
                int i = mg02.A00;
                0qQ.A0B(A012, 0);
                AnonymousClass6KM r1 = new AnonymousClass6KM("su_in_search_null_state", A012, r2.getModuleName());
                r1.A00 = i;
                r6.A0B(new AnonymousClass6KN(r1));
                return;
            }
            return;
        }
        OVV A002 = C70326O2e.A00(mfb2);
        String str3 = mg02.A09;
        A002.A07 = str3;
        if (str == null) {
            str2 = mg02.A05;
        }
        A002.A01 = str2;
        C14486Tx8 A013 = A002.A01();
        String A0j = AnonymousClass7TG.A0j();
        String E4p = this.A05.E4p();
        C324656zg A003 = C324636ze.A00(this.A01);
        String str4 = this.A07;
        String str5 = mg02.A06;
        A003.A00 = new SearchContext(str4, str5, E4p, (String) null, (String) null, A0j, (String) null, (String) null);
        Integer num2 = num;
        this.A04.CkM(A013, this.A06.E51(), num2, E4p, str5, VGE.A00(str3), mfb2.A03, A0j, mg02.A00);
    }

    private final void A02(C66942Mfb mfb, C66967Mg0 mg0) {
        this.A04.CkN(mg0.A06, mfb.A01(), mfb.A02(), mfb.A04(), mg0.A08, mg0.A00);
    }

    private final void A03(C66942Mfb mfb, C66967Mg0 mg0, Integer num, String str) {
        C66942Mfb mfb2 = mfb;
        String str2 = str;
        OVV A002 = C70326O2e.A00(mfb2);
        C66967Mg0 mg02 = mg0;
        String str3 = mg02.A09;
        A002.A07 = str3;
        if (str == null) {
            str2 = mg02.A05;
        }
        A002.A01 = str2;
        A002.A04 = "INVITE_UPSELL";
        C14486Tx8 A012 = A002.A01();
        String A0j = AnonymousClass7TG.A0j();
        String E4p = this.A05.E4p();
        C324656zg A003 = C324636ze.A00(this.A01);
        String str4 = this.A07;
        String str5 = mg02.A06;
        A003.A00 = new SearchContext(str4, str5, E4p, (String) null, (String) null, A0j, (String) null, (String) null);
        Integer num2 = num;
        this.A04.CkM(A012, this.A06.E51(), num2, E4p, str5, VGE.A00(str3), mfb2.A03, A0j, mg02.A00);
    }

    private final void A04(C14407Tva tva, String str) {
        String str2;
        C320006ra A002 = C319996rZ.A00(this.A01);
        String E4p = this.A05.E4p();
        int ordinal = tva.ordinal();
        if (ordinal == 1) {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        } else if (ordinal != 2) {
            str2 = "place";
        } else {
            str2 = "hashtag";
        }
        String str3 = this.A07;
        0qQ.A0B(E4p, 0);
        if (E4p.length() != 0) {
            A002.A00 = new AnonymousClass72L(str2, str, E4p, str3, A002.A02.now());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r4 = (X.C16194UqJ) r4;
        A01((X.AnonymousClass0iw) null, r4.A00, r4.A04(), X.AnonymousClass05K.A0C, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r3.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r1 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r19 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        r9 = (X.AnonymousClass4DH) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        X.C49129Eps.A00(r7, r9, r1, X.EX9.SEARCH_NULLSTATE_UPSELL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(androidx.fragment.app.Fragment r18, X.AnonymousClass0iw r19, java.lang.Object r20) {
        /*
            r17 = this;
            r9 = r19
            r4 = r20
            r2 = 0
            r1 = 1
            boolean r6 = r4 instanceof X.C16194UqJ
            r12 = 0
            if (r6 == 0) goto L_0x00d8
            r0 = r4
            X.UqJ r0 = (X.C16194UqJ) r0
            java.lang.String r3 = r0.A05
        L_0x0010:
            int r0 = r3.hashCode()
            r11 = r17
            r7 = r18
            switch(r0) {
                case -1514078657: goto L_0x001c;
                case -1219602631: goto L_0x0020;
                case 482408823: goto L_0x006e;
                case 1570316561: goto L_0x0085;
                case 2093168605: goto L_0x00c3;
                default: goto L_0x001b;
            }
        L_0x001b:
            return
        L_0x001c:
            java.lang.String r0 = "search_nullstate_ci_row_upsell"
            goto L_0x00c5
        L_0x0020:
            java.lang.String r0 = "search_invites_upsell"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.UqJ r4 = (X.C16194UqJ) r4
            X.Nfe r5 = r4.A00
            X.Mg0 r0 = r4.A04()
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r11.A03(r5, r0, r3, r12)
            boolean r0 = r7 instanceof X.C14137TqX
            if (r0 == 0) goto L_0x0043
            r0 = r7
            X.TqX r0 = (X.C14137TqX) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A06
            if (r0 == 0) goto L_0x0043
            r0.A04()
        L_0x0043:
            if (r6 == 0) goto L_0x0061
            java.lang.Integer r0 = r4.A01
            if (r0 != r3) goto L_0x0061
            X.EZn r8 = X.C48145EZn.SEARCH_TYPEAHEAD
        L_0x004b:
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r10 = r11.A01
            boolean r0 = X.C267044ar.A01(r0, r10)
            if (r0 == 0) goto L_0x0064
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.C48958Emw.A00(r0, r8, r10, r1, r2)
            return
        L_0x0061:
            X.EZn r8 = X.C48145EZn.SEARCH_ACCOUNT_TAB
            goto L_0x004b
        L_0x0064:
            boolean r0 = r7 instanceof X.AnonymousClass4D6
            if (r0 == 0) goto L_0x001b
            X.EWV r11 = X.EWV.A0J
            X.C46395DeI.A0S(r7, r8, r9, r10, r11, r12)
            return
        L_0x006e:
            r0 = 816(0x330, float:1.143E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r2 = r11.A01
            r1 = r7
            X.4DH r1 = (X.AnonymousClass4DH) r1
            X.EX9 r0 = X.EX9.SERP_USERS_CI_UPSELL
            X.C49129Eps.A00(r7, r1, r2, r0)
            goto L_0x00b3
        L_0x0085:
            r0 = 4160(0x1040, float:5.83E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            com.instagram.common.session.UserSession r1 = r11.A01
            boolean r0 = X.FC6.A02()
            if (r0 == 0) goto L_0x00b3
            X.6Yo r2 = new X.6Yo
            r2.<init>(r3, r1)
            X.1pQ r0 = X.FC6.A00()
            X.Ebd r1 = r0.A00()
            java.lang.String r0 = "serp_users_dp_upsell"
            X.E3O r0 = r1.A01(r0, r12)
            X.Dba.A0w(r12, r0, r2)
        L_0x00b3:
            X.UqJ r4 = (X.C16194UqJ) r4
            X.Nfe r13 = r4.A00
            X.Mg0 r14 = r4.A04()
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            r16 = r12
            r11.A01(r12, r13, r14, r15, r16)
            return
        L_0x00c3:
            java.lang.String r0 = "search_nullstate_ci_megaphone_upsell"
        L_0x00c5:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r1 = r11.A01
            if (r19 != 0) goto L_0x00d2
            r9 = r7
            X.4DH r9 = (X.AnonymousClass4DH) r9
        L_0x00d2:
            X.EX9 r0 = X.EX9.SEARCH_NULLSTATE_UPSELL
            X.C49129Eps.A00(r7, r9, r1, r0)
            return
        L_0x00d8:
            boolean r0 = r4 instanceof X.C16189UqE
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = "search_nullstate_ci_megaphone_upsell"
            goto L_0x0010
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14140Tqa.A05(androidx.fragment.app.Fragment, X.0iw, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(androidx.fragment.app.Fragment r19, X.AnonymousClass0iw r20, java.lang.Object r21) {
        /*
            r18 = this;
            r3 = r19
            r6 = r21
            r2 = r20
            boolean r11 = X.DbW.A1Y(r2)
            boolean r10 = r6 instanceof X.C16194UqJ
            r12 = 0
            if (r10 == 0) goto L_0x013a
            r0 = r6
            X.UqJ r0 = (X.C16194UqJ) r0
            java.lang.String r7 = r0.A05
            java.lang.Integer r4 = r0.A01
        L_0x0016:
            int r1 = r7.hashCode()
            r0 = -1514078657(0xffffffffa5c0fe3f, float:-3.3478975E-16)
            r5 = r18
            if (r1 == r0) goto L_0x00aa
            r0 = -1219602631(0xffffffffb74e5739, float:-1.2298865E-5)
            if (r1 == r0) goto L_0x0034
            r0 = 2093168605(0x7cc337dd, float:8.1090474E36)
            if (r1 != r0) goto L_0x0033
            java.lang.String r0 = "search_nullstate_ci_megaphone_upsell"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b2
        L_0x0033:
            return
        L_0x0034:
            java.lang.String r0 = "search_invites_upsell"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r7 = "Required value was null."
            if (r4 != r0) goto L_0x00f3
            if (r10 == 0) goto L_0x0033
            X.UqJ r6 = (X.C16194UqJ) r6
            if (r6 == 0) goto L_0x0033
            X.Mg0 r9 = r6.A04()
            com.instagram.common.session.UserSession r2 = r5.A01
            X.1Av r8 = X.1Au.A00(r2)
            X.0s0 r4 = r8.A1t
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 488(0x1e8, float:6.84E-43)
            X.AnonymousClass7TF.A1J(r8, r4, r1, r0, r11)
            X.TwK r0 = r5.A0G
            com.instagram.common.session.UserSession r13 = r0.A01
            java.lang.String r0 = r9.A08
            java.lang.String r15 = "invite"
            r17 = 12
            r14 = r12
            r16 = r0
            X.VGH.A00(r12, r13, r14, r15, r16, r17)
            X.EZn r1 = X.C48145EZn.SEARCH_ACCOUNT_TAB
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.C267044ar.A01(r0, r2)
            X.C49947FGb.A04(r1, r2, r0)
            X.Nfe r4 = r6.A00
            X.Mg0 r2 = r6.A04()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "contact_invites_upsell_dismiss"
            r5.A03(r4, r2, r1, r0)
            boolean r0 = r3 instanceof X.C15286UZq
            if (r0 == 0) goto L_0x0033
            X.UZq r3 = (X.C15286UZq) r3
            X.MuC r0 = r3.A07()
            X.Ocm r5 = r0.A0C
            java.lang.String r4 = r0.A0F
            java.lang.String r3 = r0.A0G
            X.05G r0 = X.C71108Ocm.A02(r5, r4, r3)
            java.lang.Object r2 = r0.getValue()
            r1 = 11
            X.Wxc r0 = new X.Wxc
            r0.<init>(r2, r1)
            X.C71108Ocm.A03(r5, r4, r3, r0)
            return
        L_0x00aa:
            java.lang.String r0 = "search_nullstate_ci_row_upsell"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
        L_0x00b2:
            com.instagram.common.session.UserSession r6 = r5.A01
            r1 = 0
            X.0xa r0 = X.AnonymousClass7TE.A0q(r6)
            java.lang.String r4 = "search_nullstate_ci_upsell_dismissed_count"
            int r1 = r0.getInt(r4, r1)
            X.1Av r0 = X.1Au.A00(r6)
            int r1 = r1 + 1
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r4, r1)
            X.1Av r0 = X.1Au.A00(r6)
            long r4 = java.lang.System.currentTimeMillis()
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "search_nullstate_ci_upsell_dismissed_timestamp"
            r1.E5c(r0, r4)
            r1.apply()
            X.6cm r0 = new X.6cm
            r0.<init>(r2, r6)
            X.0wc r1 = r0.A02
            r0 = 3353(0xd19, float:4.699E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            r0.Cgf()
            goto L_0x0126
        L_0x00f3:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            if (r4 != r9) goto L_0x0033
            com.instagram.common.session.UserSession r8 = r5.A01
            X.1Av r4 = X.1Au.A00(r8)
            X.0s0 r2 = r4.A1u
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 487(0x1e7, float:6.82E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r11)
            X.EZn r1 = X.C48145EZn.SEARCH_TYPEAHEAD
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x014d
            boolean r0 = X.C267044ar.A01(r0, r8)
            X.C49947FGb.A04(r1, r8, r0)
            if (r10 == 0) goto L_0x0126
            X.UqJ r6 = (X.C16194UqJ) r6
            if (r6 == 0) goto L_0x0126
            X.Nfe r2 = r6.A00
            X.Mg0 r1 = r6.A04()
            java.lang.String r0 = "contact_invites_upsell_dismiss"
            r5.A03(r2, r1, r9, r0)
        L_0x0126:
            boolean r0 = r3 instanceof X.C14137TqX
            if (r0 == 0) goto L_0x0033
            X.TqY r3 = (X.C14138TqY) r3
            X.Trf r0 = r3.A07
            if (r0 != 0) goto L_0x0149
            java.lang.String r0 = "dataSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x013a:
            boolean r0 = r6 instanceof X.C16189UqE
            if (r0 == 0) goto L_0x0033
            java.lang.String r7 = "search_nullstate_ci_megaphone_upsell"
            r4 = r12
            goto L_0x0016
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0149:
            X.C14488TxA.A00(r0, r3)
            return
        L_0x014d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14140Tqa.A06(androidx.fragment.app.Fragment, X.0iw, java.lang.Object):void");
    }

    public final void A07(AnonymousClass0iw r6) {
        UserSession userSession = this.A01;
        C311496cm r3 = new C311496cm(r6, userSession);
        r3.A00();
        r3.A01(false, (Integer) null, (String) null);
        JTS.A1S(AnonymousClass7TE.A0q(userSession), "search_nullstate_ci_upsell_impression_count", 0);
        1Av A002 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c("search_nullstate_ci_upsell_impression_timestamp", currentTimeMillis);
        A0p.apply();
    }

    public final Integer C9C(C66569MWx mWx) {
        C59830Ja5 ja5 = this.A0F;
        if (ja5 != null) {
            return ja5.A02.C9D(mWx.BUq());
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Cwp(C69159Nfi nfi, C66967Mg0 mg0) {
        A01((AnonymousClass0iw) null, nfi, mg0, AnonymousClass05K.A0C, (String) null);
        UserSession userSession = this.A01;
        AnonymousClass72K.A00(userSession, nfi.A01(), (String) null, 7);
        C14437TwL twL = this.A0E;
        C66569MWx A062 = nfi.A06();
        if (A062 != null) {
            twL.A03(AnonymousClass8ZN.SEARCH_ROW, A062);
            C14472Twu A002 = C14433TwH.A00(userSession);
            C66569MWx A063 = nfi.A06();
            if (A063 != null) {
                A002.A00(A063);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D01(MusicAttributionConfig musicAttributionConfig) {
        this.A0E.A08(musicAttributionConfig);
    }

    public final void D2H(Reel reel, AnonymousClass3N3 r21, C66967Mg0 mg0, C66632Ma1 ma1, boolean z) {
        String str;
        if (z) {
            str = "live_ring";
        } else {
            str = "story_ring";
        }
        C66967Mg0 mg02 = mg0;
        A01((AnonymousClass0iw) null, ma1, mg02, AnonymousClass05K.A0C, str);
        C14437TwL twL = this.A0E;
        WNL wnl = new WNL(2, mg02, this);
        C19489Wab wab = new C19489Wab(this, 5);
        AnonymousClass32A r7 = this.A08;
        AnonymousClass3BQ r5 = AnonymousClass3BQ.SEARCH_ITEM_HEADER;
        SearchContext searchContext = this.A09;
        0qQ.A0B(r7, 5);
        Reel reel2 = reel;
        AnonymousClass3N3 r8 = r21;
        if (!z) {
            C14437TwL.A01(wnl, reel2, r5, wab, r7, r8, searchContext, twL);
        } else if (reel2.A0H != null) {
            C14437TwL.A01(wnl, reel2, r5, wab, r7, r8, (SearchContext) null, twL);
        } else {
            UserSession userSession = twL.A04;
            1OC A062 = LTC.A06(userSession, JTP.A0r(reel2), true);
            A062.A00 = new UYF(wnl, userSession, r5, wab, r7, r8, twL);
            1ES.A03(A062);
        }
    }

    public final void DUo() {
        this.A0I.invoke();
    }

    public final void DXI(C69158Nfh nfh, C66967Mg0 mg0) {
        A01((AnonymousClass0iw) null, nfh, mg0, AnonymousClass05K.A0C, (String) null);
        UserSession userSession = this.A01;
        AnonymousClass72K.A00(userSession, nfh.A01(), (String) null, 2);
        this.A0E.A07(nfh.A00, this.A05.E4p(), mg0.A06, mg0.A00);
        A00();
        C14418Tvn A002 = C14415Tvk.A00(userSession);
        C18072Vl0 vl0 = nfh.A00;
        0qQ.A0B(vl0, 0);
        A002.A00.A04(vl0);
        A04(C14407Tva.PLACES, nfh.A00.A01());
    }

    public final void DXQ(C66569MWx mWx, LBD lbd) {
        C59830Ja5 ja5 = this.A0F;
        if (ja5 != null) {
            ja5.A00(mWx, lbd.A03);
        }
    }

    public final void DgN(AnonymousClass3UM r10, String str, int i) {
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = str;
            if (str != null) {
                this.A03.A04(r10.getId(), str2, str3, r10.getAlgorithm(), r10.BxN(), i, 0);
            }
        }
    }

    public final void DiF(Integer num) {
        C14407Tva tva;
        if (num == AnonymousClass05K.A00) {
            C14437TwL twL = this.A0E;
            String E4z = this.A0B.E4z();
            Integer E51 = this.A06.E51();
            if (E51 != null) {
                switch (E51.intValue()) {
                    case 0:
                    case 1:
                        tva = C14407Tva.BLENDED;
                        break;
                    case 2:
                        tva = C14407Tva.HASHTAG;
                        break;
                    case 3:
                        tva = C14407Tva.USERS;
                        break;
                    case 6:
                        tva = C14407Tva.PLACES;
                        break;
                    case 9:
                        tva = C14407Tva.AUDIO;
                        break;
                    case 14:
                        tva = C14407Tva.MAP;
                        break;
                }
            }
            tva = null;
            0eP r8 = new 0eP("argument_search_session_id", twL.A07);
            0eP r6 = new 0eP("shopping_session_id", (Object) null);
            0eP r5 = new 0eP("rank_token", E4z);
            0eP r4 = new 0eP("edit_searches_type", tva);
            AnonymousClass0iw r3 = twL.A02;
            Bundle A002 = Q21.A00(r8, r6, r5, r4, new 0eP("argument_parent_module_name", r3.getModuleName()));
            C309516Yo A0Q = DbU.A0Q(twL.A01, twL.A04);
            A0Q.A09 = r3;
            C14398TvR.A00();
            A0Q.A0B(A002, new C15398Uc1());
            A0Q.A04();
        } else if (num == AnonymousClass05K.A0N) {
            C14437TwL twL2 = this.A0E;
            C46649DiU A042 = C46649DiU.A04("com.instagram.explore.zeitgeist.Zeitgeist", 0Yt.A06(new 0eP[]{new 0eP("timezone_offset", String.valueOf(1G0.A00())), new 0eP("entrypoint_for_logging", "search_nullstate")}));
            FragmentActivity fragmentActivity = twL2.A01;
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) twL2.A04);
            igBloksScreenConfig.A0U = fragmentActivity.getResources().getString(2131962682);
            igBloksScreenConfig.A0l = true;
            igBloksScreenConfig.A0P = AnonymousClass05K.A01;
            A042.A0D(fragmentActivity, igBloksScreenConfig);
        } else if (num == AnonymousClass05K.A1F) {
            this.A0E.A02();
        }
    }

    public final void onStopButtonClicked() {
        C59830Ja5 ja5 = this.A0F;
        if (ja5 != null) {
            C13988Tno.A1K(ja5);
        }
    }

    public final void Cwq(C69159Nfi nfi, C66967Mg0 mg0) {
        A02(nfi, mg0);
        C14436TwK twK = this.A0G;
        C66569MWx A062 = nfi.A06();
        if (A062 != null) {
            twK.A04(A062, mg0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D9S(AnonymousClass0iw r4, C66942Mfb mfb, C66967Mg0 mg0) {
        boolean A1Z = AnonymousClass7TG.A1Z(mfb, mg0);
        A02(mfb, mg0);
        int i = mfb.A01;
        if (i == 0) {
            this.A0G.A00(r4, mg0, (C14407Tva) null, ((C66632Ma1) mfb).A06());
        } else if (i == A1Z) {
            this.A0G.A01(((C69160Nfj) mfb).A00, mg0, (C14407Tva) null);
        } else if (i == 2) {
            this.A0G.A03(((C69158Nfh) mfb).A00, mg0, (C14407Tva) null);
        } else if (i == 4) {
            this.A0G.A02(((C67387Mn4) mfb).A01, mg0);
        } else if (i == 7) {
            C14436TwK twK = this.A0G;
            TrackDataImpl trackDataImpl = ((C69159Nfi) mfb).A01;
            if (trackDataImpl != null) {
                twK.A04(new JVX(trackDataImpl), mg0);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else {
            throw new IllegalStateException("Invalid entry type");
        }
    }
}
