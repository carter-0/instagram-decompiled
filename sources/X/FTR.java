package X;

import java.util.ArrayList;
import java.util.List;

public final class FTR implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FTR(C49880FBe fBe, 02m r2, 0lg r3, List list, int i) {
        this.A00 = i;
        this.A02 = fBe;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = list;
    }

    public static 02m A00(FTR ftr, String str, List list) {
        ((C49880FBe) ftr.A02).A03((0lg) ftr.A04, str, list);
        return (02m) ftr.A03;
    }

    public static void A01(FTR ftr, String str) {
        ((C49880FBe) ftr.A02).A01((0lg) ftr.A04, str);
    }

    public static void A02(Object obj, Object obj2, List list, 0eP r8, C376119Gp r9) {
        list.add(0Yt.A06(new 0eP[]{r8, new 0eP("uid", obj), new 0eP("credential_type", obj2), new 0eP("token", r9.A00)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        r2.markerPoint(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0063, code lost:
        r3.A02(r2, r1, "other_exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFailure(java.lang.Throwable r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x004d;
                case 2: goto L_0x0036;
                case 3: goto L_0x001d;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r4.A03
            X.02m r2 = (X.02m) r2
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_saved_msgr_accounts_end"
            r2.markerPoint(r1, r0)
            java.lang.Object r3 = r4.A02
            X.FBe r3 = (X.C49880FBe) r3
            java.lang.Object r2 = r4.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.String r1 = "messenger_local_auth"
            goto L_0x0063
        L_0x001d:
            java.lang.Object r3 = r4.A02
            X.FBe r3 = (X.C49880FBe) r3
            java.lang.Object r2 = r4.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.String r1 = "facebook_local_auth"
            java.lang.String r0 = "other_exception"
            r3.A02(r2, r1, r0)
            java.lang.Object r2 = r4.A03
            X.02m r2 = (X.02m) r2
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_saved_fb_accounts_end"
            goto L_0x0081
        L_0x0036:
            java.lang.Object r2 = r4.A03
            X.02m r2 = (X.02m) r2
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_active_fblite_account_end"
            r2.markerPoint(r1, r0)
            java.lang.Object r3 = r4.A02
            X.FBe r3 = (X.C49880FBe) r3
            java.lang.Object r2 = r4.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.String r1 = "facebook_lite_active_session"
            goto L_0x0063
        L_0x004d:
            java.lang.Object r2 = r4.A03
            X.02m r2 = (X.02m) r2
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_active_msgr_account_end"
            r2.markerPoint(r1, r0)
            java.lang.Object r3 = r4.A02
            X.FBe r3 = (X.C49880FBe) r3
            java.lang.Object r2 = r4.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.String r1 = "messenger_active_session"
        L_0x0063:
            java.lang.String r0 = "other_exception"
            r3.A02(r2, r1, r0)
            return
        L_0x0069:
            java.lang.Object r3 = r4.A02
            X.FBe r3 = (X.C49880FBe) r3
            java.lang.Object r2 = r4.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.String r1 = "facebook_active_session"
            java.lang.String r0 = "other_exception"
            r3.A02(r2, r1, r0)
            java.lang.Object r2 = r4.A03
            X.02m r2 = (X.02m) r2
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_active_fb_account_end"
        L_0x0081:
            r2.markerPoint(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTR.onFailure(java.lang.Throwable):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        02m r1;
        String str;
        switch (this.A00) {
            case 0:
                List<C376139Gr> list = (List) obj;
                ArrayList A1C = AnonymousClass7TE.A1C();
                int i2 = 0;
                if (list != null) {
                    List list2 = (List) this.A01;
                    for (C376139Gr r0 : list) {
                        C376119Gp r12 = r0.A01;
                        String str2 = r12.A01.A02;
                        list2.add(DbY.A0q("token", r12.A00, AnonymousClass7TE.A1L("uid", str2), AnonymousClass7TE.A1L("credential_type", "facebook_active_session")));
                        i2++;
                        A1C.add(C49934FFn.A01(str2));
                    }
                }
                i = 896612552;
                if (i2 == 0) {
                    A01(this, "facebook_active_session");
                } else {
                    A00(this, "facebook_active_session", A1C).markerAnnotate(896612552, "count_of_fb_sso_accounts", i2);
                }
                r1 = (02m) this.A03;
                str = "add_active_fb_account_end";
                break;
            case 1:
                List<C376139Gr> list3 = (List) obj;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                int i3 = 0;
                if (list3 != null) {
                    List list4 = (List) this.A01;
                    for (C376139Gr r3 : list3) {
                        0eP A1L = AnonymousClass7TE.A1L("account_type", "");
                        C376119Gp r13 = r3.A01;
                        String str3 = r13.A01.A02;
                        A02(str3, "messenger_active_session", list4, A1L, r13);
                        i3++;
                        A1C2.add(C49934FFn.A01(str3));
                    }
                }
                i = 896612552;
                if (i3 == 0) {
                    A01(this, "messenger_active_session");
                } else {
                    A00(this, "messenger_active_session", A1C2).markerAnnotate(896612552, "count_of_msgr_sso_accounts", i3);
                }
                r1 = (02m) this.A03;
                str = "add_active_msgr_account_end";
                break;
            case 2:
                List<C376139Gr> list5 = (List) obj;
                if (list5 != null) {
                    List list6 = (List) this.A01;
                    String str4 = "";
                    boolean z = false;
                    for (C376139Gr r14 : list5) {
                        0eP A1L2 = AnonymousClass7TE.A1L("account_type", "");
                        C376119Gp r15 = r14.A01;
                        str4 = r15.A01.A02;
                        A02(str4, "facebook_lite_active_session", list6, A1L2, r15);
                        z = true;
                    }
                    if (z) {
                        ((C49880FBe) this.A02).A03((0lg) this.A04, "facebook_lite_active_session", 0sr.A1L(new String[]{str4}));
                        ((02m) this.A03).markerPoint(896612552, "add_active_fblite_account_end");
                        return;
                    }
                }
                A01(this, "facebook_lite_active_session");
                ((02m) this.A03).markerPoint(896612552, "add_active_fblite_account_end");
                return;
            case 3:
                List<C376139Gr> list7 = (List) obj;
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                int i4 = 0;
                if (list7 != null) {
                    List list8 = (List) this.A01;
                    for (C376139Gr r32 : list7) {
                        0eP A1L3 = AnonymousClass7TE.A1L("account_type", "");
                        C376119Gp r16 = r32.A01;
                        String str5 = r16.A01.A02;
                        A02(str5, "facebook_local_auth", list8, A1L3, r16);
                        i4++;
                        A1C3.add(C49934FFn.A01(str5));
                    }
                }
                i = 896612552;
                if (i4 == 0) {
                    A01(this, "facebook_local_auth");
                } else {
                    A00(this, "facebook_local_auth", A1C3).markerAnnotate(896612552, "count_of_fb_local_auth_accounts", i4);
                }
                r1 = (02m) this.A03;
                str = "add_saved_fb_accounts_end";
                break;
            case 4:
                List<C376139Gr> list9 = (List) obj;
                ArrayList A1C4 = AnonymousClass7TE.A1C();
                int i5 = 0;
                if (list9 != null) {
                    List list10 = (List) this.A01;
                    for (C376139Gr r33 : list9) {
                        0eP A1L4 = AnonymousClass7TE.A1L("account_type", "");
                        C376119Gp r17 = r33.A01;
                        String str6 = r17.A01.A02;
                        A02(str6, "messenger_local_auth", list10, A1L4, r17);
                        i5++;
                        A1C4.add(C49934FFn.A01(str6));
                    }
                }
                i = 896612552;
                if (i5 == 0) {
                    A01(this, "messenger_local_auth");
                } else {
                    A00(this, "messenger_local_auth", A1C4).markerAnnotate(896612552, "count_of_msgr_local_auth_accounts", i5);
                }
                r1 = (02m) this.A03;
                str = "add_saved_msgr_accounts_end";
                break;
            default:
                return;
        }
        r1.markerPoint(i, str);
    }
}
