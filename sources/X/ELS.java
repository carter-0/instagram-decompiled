package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class ELS extends DdO {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, UserSession userSession, E6P e6p) {
        super(fragmentActivity, e6p, userSession);
        this.A01 = e6p;
        0qQ.A0A(fragmentActivity);
    }

    public final void D9T(AnonymousClass3UM r13, String str, int i) {
        AnonymousClass3UH r0;
        List list;
        List list2;
        String str2;
        List list3;
        int i2 = i;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r13, 0);
                String A0q = DbU.A0q(r13);
                C47537E7a e7a = ((F2T) ((C47539E7c) ((C47525E6l) this.A01).A0H.getValue()).A04.A04.getValue()).A01;
                AnonymousClass7TE.A1Z(new C66187MGy(e7a, A0q, (AnonymousClass4D7) null, 33), e7a.A03());
                return;
            case 1:
                super.D9T(r13, str, i);
                E91 e91 = ((E6Z) this.A01).A02;
                0qQ.A0B(r13, 0);
                AnonymousClass3UH r02 = e91.A01;
                if (r02 != null) {
                    if (!r02.A08()) {
                        AnonymousClass3UH r1 = e91.A01;
                        if (r1 != null) {
                            r1.A06(r13.getId());
                        }
                    } else {
                        AnonymousClass3UH r03 = e91.A01;
                        if (!(r03 == null || r03.A07() || (r0 = e91.A01) == null || (list = r0.A0M) == null)) {
                            list.remove(i);
                        }
                    }
                    E91.A01(e91);
                    return;
                }
                return;
            case 2:
                0qQ.A0B(r13, 0);
                super.D9T(r13, str, i);
                C47587E8z e8z = ((E6a) this.A01).A02;
                if (e8z == null) {
                    str2 = "adapter";
                    break;
                } else {
                    AnonymousClass3UH r12 = e8z.A00;
                    if (r12 != null) {
                        if (!r12.A08()) {
                            r12.A06(r13.getId());
                        } else if (!r12.A07() && (list2 = r12.A0M) != null) {
                            list2.remove(i);
                        }
                        C47587E8z.A00(e8z);
                        return;
                    }
                    return;
                }
            case 3:
                0qQ.A0B(r13, 0);
                String A0q2 = DbU.A0q(r13);
                E6P e6p = (E6P) this.A01;
                String str3 = e6p.A04;
                str2 = "targetId";
                if (str3 != null) {
                    if (!(str3.length() == 0 || A0q2.length() == 0)) {
                        UserSession A0l = AnonymousClass7TE.A0l(e6p.A0C);
                        String str4 = e6p.A04;
                        if (str4 != null) {
                            1ES.A03(F88.A00(A0l, str4, A0q2));
                        }
                    }
                    E90 A0c = e6p.A0c();
                    A0c.A04.A00.remove(r13);
                    E90.A00(A0c);
                    C293005js r5 = e6p.A01;
                    if (r5 == null) {
                        str2 = "followChainingLogger";
                        break;
                    } else {
                        String A0q3 = DbU.A0q(r13);
                        String str5 = e6p.A04;
                        if (str5 != null) {
                            Integer num = e6p.A03;
                            if (num == null) {
                                str2 = "chainingSource";
                                break;
                            } else {
                                String A002 = C49180Eql.A00(num);
                                String A012 = E6P.A01(r13, e6p);
                                if (A012 == null) {
                                    A012 = "";
                                }
                                r5.A01(A0q3, str5, A002, A012, r13.BxN(), i2);
                                return;
                            }
                        }
                    }
                }
                break;
            case 4:
                0qQ.A0B(r13, 0);
                super.D9T(r13, str, i);
                C46435Dex dex = ((C46430Der) this.A01).A0E;
                if (dex == null) {
                    str2 = "followListAdapter";
                    break;
                } else {
                    User CCd = r13.CCd();
                    0qQ.A0B(CCd, 0);
                    AnonymousClass3UH r14 = dex.A03;
                    if (r14 != null) {
                        if (!r14.A08()) {
                            r14.A06(CCd.getId());
                        } else if (!r14.A07() && (list3 = r14.A0M) != null) {
                            list3.remove(i);
                        }
                        dex.A0y.remove(CCd.getId());
                        dex.A0G(false, false);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            default:
                0qQ.A0B(r13, 0);
                super.D9T(r13, str, i);
                C47585E8x e8x = ((C47521E6h) this.A01).A03;
                if (e8x == null) {
                    str2 = "socialContextFollowListAdapter";
                    break;
                } else {
                    e8x.A06.remove(r13);
                    e8x.A08.remove(r13.getId());
                    e8x.A0C();
                    return;
                }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGN(AnonymousClass3UM r10, String str, int i) {
        String str2;
        int i2 = i;
        if (3 - this.A00 != 0) {
            super.DGN(r10, str, i);
            return;
        }
        0qQ.A0B(r10, 0);
        E6P e6p = (E6P) this.A01;
        C293005js r2 = e6p.A01;
        if (r2 == null) {
            str2 = "followChainingLogger";
        } else {
            String A0q = DbU.A0q(r10);
            String str3 = e6p.A04;
            if (str3 == null) {
                str2 = "targetId";
            } else {
                Integer num = e6p.A03;
                if (num == null) {
                    str2 = "chainingSource";
                } else {
                    String A002 = C49180Eql.A00(num);
                    String A012 = E6P.A01(r10, e6p);
                    if (A012 == null) {
                        A012 = "";
                    }
                    r2.A02(A0q, str3, A002, A012, r10.BxN(), i2);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DgN(AnonymousClass3UM r13, String str, int i) {
        String str2;
        int i2 = i;
        if (3 - this.A00 != 0) {
            super.DgN(r13, str, i);
            return;
        }
        0qQ.A0B(r13, 0);
        E6P e6p = (E6P) this.A01;
        if (e6p.A0B.add(DbU.A0q(r13))) {
            C293005js r3 = e6p.A01;
            if (r3 == null) {
                str2 = "followChainingLogger";
            } else {
                String A0q = DbU.A0q(r13);
                String str3 = e6p.A04;
                if (str3 == null) {
                    str2 = "targetId";
                } else {
                    Integer num = e6p.A03;
                    if (num == null) {
                        str2 = "chainingSource";
                    } else {
                        String A002 = C49180Eql.A00(num);
                        String A012 = E6P.A01(r13, e6p);
                        if (A012 == null) {
                            A012 = "";
                        }
                        r3.A04(A0q, str3, A002, A012, r13.BxN(), i2, 0);
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        X.F8F.A00(r0, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        super.Dw1(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dw1(X.AnonymousClass3UM r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.A00
            r8 = r12
            switch(r0) {
                case 3: goto L_0x0083;
                case 4: goto L_0x000a;
                case 5: goto L_0x0021;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.Dw1(r10, r11, r12)
            return
        L_0x000a:
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.Object r4 = r9.A01
            X.Der r4 = (X.C46430Der) r4
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x0006
            r9.A00(r10, r11, r12)
            java.lang.Integer r0 = r4.A0K
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "type"
            goto L_0x00b9
        L_0x0021:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r4 = r9.A01
            X.E6h r4 = (X.C47521E6h) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x004b
            r9.A00(r10, r11, r12)
            X.0eM r0 = r4.A0C
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = X.DbU.A0q(r10)
            java.lang.String r1 = "profile_social_context"
            java.lang.String r0 = "social_context_follow_list"
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = X.C46474Dfc.A01(r3, r2, r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            goto L_0x0075
        L_0x004b:
            super.Dw1(r10, r11, r12)
            X.DbZ.A15(r4)
            return
        L_0x0052:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x007c
            if (r1 == r2) goto L_0x0079
            java.lang.String r3 = "follow_list_user_row"
        L_0x005d:
            com.instagram.common.session.UserSession r5 = X.C46430Der.A03(r4)
            com.instagram.common.session.UserSession r2 = X.C46430Der.A03(r4)
            java.lang.String r1 = X.DbU.A0q(r10)
            java.lang.String r0 = r4.getModuleName()
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = X.C46474Dfc.A01(r2, r1, r3, r0)
            android.app.Activity r0 = r4.getRootActivity()
        L_0x0075:
            X.F8F.A00(r0, r5, r1)
            return
        L_0x0079:
            r0 = 703(0x2bf, float:9.85E-43)
            goto L_0x007e
        L_0x007c:
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x007e:
            java.lang.String r3 = X.C273654mx.A00(r0)
            goto L_0x005d
        L_0x0083:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r6 = r9.A01
            X.E6P r6 = (X.E6P) r6
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.0eM r1 = r6.A0C
            X.6Yo r7 = X.DbX.A0N(r0, r1)
            r0 = 1
            r7.A0F = r0
            X.1a1 r5 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = X.DbU.A0q(r10)
            java.lang.String r1 = "see_all_suggested_user_fragment"
            java.lang.String r0 = "similar_accounts_user_button"
            X.Dfc r0 = X.C46548Dgp.A01(r3, r2, r0, r1)
            X.C46474Dfc.A03(r7, r4, r5, r0)
            X.5js r2 = r6.A01
            if (r2 != 0) goto L_0x00c1
            java.lang.String r0 = "followChainingLogger"
        L_0x00b9:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c1:
            java.lang.String r3 = X.DbU.A0q(r10)
            java.lang.String r4 = r6.A04
            if (r4 != 0) goto L_0x00cc
            java.lang.String r0 = "targetId"
            goto L_0x00b9
        L_0x00cc:
            java.lang.Integer r0 = r6.A03
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "chainingSource"
            goto L_0x00b9
        L_0x00d3:
            java.lang.String r5 = X.C49180Eql.A00(r0)
            java.lang.String r6 = X.E6P.A01(r10, r6)
            if (r6 != 0) goto L_0x00df
            java.lang.String r6 = ""
        L_0x00df:
            java.lang.String r7 = r10.BxN()
            r2.A03(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELS.Dw1(X.3UM, java.lang.String, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, E6Z e6z) {
        super(fragmentActivity, r3, userSession);
        this.A01 = e6z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, UserSession userSession, C46430Der der) {
        super(fragmentActivity, der, userSession);
        this.A01 = der;
        0qQ.A0A(fragmentActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C47525E6l e6l) {
        super(fragmentActivity, r3, userSession);
        this.A01 = e6l;
        0qQ.A0A(fragmentActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, UserSession userSession, E6a e6a) {
        super(fragmentActivity, e6a, userSession);
        this.A01 = e6a;
        0qQ.A0A(fragmentActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELS(FragmentActivity fragmentActivity, UserSession userSession, C47521E6h e6h) {
        super(fragmentActivity, e6h, userSession);
        this.A01 = e6h;
        0qQ.A0A(fragmentActivity);
    }
}
