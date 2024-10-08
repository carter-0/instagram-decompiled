package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.Mi7  reason: case insensitive filesystem */
public final class C67089Mi7 implements AnonymousClass0lh {
    public AnonymousClass2Ep A00;
    public C254923tH A01;
    public EK7 A02;
    public C67210Mk6 A03;
    public Boolean A04;
    public Integer A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public final 2Dm A0D;
    public final boolean A0E;
    public final ScheduledExecutorService A0F = C61560nl.A00().A00;

    public final void A02() {
        this.A07 = null;
        this.A08 = null;
        this.A09 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        this.A00 = null;
        this.A0C = false;
        this.A0B = false;
        this.A04 = false;
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null) {
            this.A0A = false;
            mk6.A02 = null;
            mk6.A04 = false;
            mk6.A08();
        }
        EK7 ek7 = this.A02;
        if (ek7 != null) {
            ek7.A00 = null;
            ek7.A01 = null;
        }
    }

    public static C67089Mi7 A00(UserSession userSession, Boolean bool) {
        C67089Mi7 mi7 = (C67089Mi7) userSession.A01(C67089Mi7.class, new C73467Pd9(userSession, 9));
        mi7.A04 = Boolean.valueOf(bool.booleanValue());
        if (182.A06(0Tu.A05, userSession, 36313471746377750L)) {
            C67210Mk6 mk6 = (C67210Mk6) userSession.A01(C67210Mk6.class, new C73466Pd8(0, mi7, userSession));
            mi7.A03 = mk6;
            0qQ.A0B(mk6, 1);
            mi7.A02 = (EK7) userSession.A01(EK7.class, C73913Plo.A00(mk6, 16));
        }
        return mi7;
    }

    public static HashSet A01(C67089Mi7 mi7) {
        if (mi7.A04.booleanValue()) {
            List list = mi7.A08;
            if (list != null) {
                return C66580MXl.A12(list);
            }
        } else {
            List list2 = mi7.A09;
            if (list2 != null) {
                HashSet A1F = AnonymousClass7TE.A1F();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A1F.add(DbT.A0f(it).A09());
                }
                return A1F;
            }
        }
        return AnonymousClass7TE.A1F();
    }

    public final void A04(int i) {
        if (this.A07 != null) {
            A02();
        }
        this.A07 = AnonymousClass7TF.A0b();
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null) {
            this.A0A = false;
            if (mk6.A02 != null) {
                mk6.A02 = null;
                mk6.A04 = false;
                mk6.A08();
            }
            String str = mk6.A02;
            if (str == null) {
                str = AnonymousClass7TF.A0b();
                mk6.A02 = str;
            }
            mk6.A01 = null;
            if (str != null) {
                0Aj A0e = AnonymousClass7TE.A0e(mk6.A05, "omnipicker_search_start");
                if (A0e.isSampled()) {
                    C66580MXl.A1I(A0e, str);
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 4;
                    }
                    AnonymousClass7TE.A1W(A0e, "entry_surface", i2);
                    AnonymousClass7TE.A1W(A0e, "omnipicker_type", 2);
                    if (mk6.A09) {
                        C66581MXm.A1G(A0e, mk6.A08);
                    }
                    A0e.Cgf();
                }
            }
        }
        EK7 ek7 = this.A02;
        if (ek7 != null) {
            ek7.A00 = null;
            ek7.A01 = null;
            ek7.A00();
        }
    }

    public final void A05(int i) {
        String str;
        C69484NmS nmS;
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null && mk6.A0A && (str = mk6.A02) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(mk6.A05, "omnipicker_search_error_state");
            if (A0e.isSampled()) {
                C66580MXl.A1I(A0e, str);
                A0e.AAJ("query_string", mk6.A01);
                if (i == 1) {
                    nmS = C69484NmS.NO_RESULTS;
                } else if (i != 2) {
                    nmS = C69484NmS.GENERAL_ERROR;
                } else {
                    nmS = C69484NmS.NO_INTERNET;
                }
                A0e.A8M(nmS, "error_state");
                A0e.Cgf();
            }
        }
    }

    public final void A06(AnonymousClass0iw r5, 0lg r6, C68273N8k n8k, String str, List list, boolean z) {
        if (this.A07 != null) {
            this.A0C = z;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, r6), "direct_compose_select_recipient");
            if (A0e.isSampled()) {
                C66581MXm.A1E(A0e, n8k.A01);
                A0e.A9F("relative_position", Long.valueOf(n8k.A02));
                DbS.A1N(A0e, str);
                A0e.AAJ("section_type", C69838Nt2.A00(n8k.A00));
                String str2 = n8k.A06;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                Pattern pattern = 0mp.A06;
                C66581MXm.A1F(A0e, (long) DbX.A05(str3));
                A0e.AAJ("search_string", str2);
                C66580MXl.A1I(A0e, this.A07);
                DirectSearchResult directSearchResult = n8k.A03;
                if (directSearchResult instanceof DirectShareTarget) {
                    A0e.A9F("recipient", DbV.A0q(((DirectShareTarget) directSearchResult).A09()));
                }
                DbX.A1L(A0e);
            }
        }
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null) {
            mk6.A0A(n8k, list);
        }
        EK7 ek7 = this.A02;
        if (ek7 != null) {
            ek7.A02(n8k);
        }
    }

    public final void A07(AnonymousClass0iw r10, UserSession userSession, String str) {
        if (this.A07 != null && !this.A0C) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), "direct_exit_search");
            if (A0e.isSampled()) {
                C66580MXl.A1I(A0e, this.A07);
                Pattern pattern = 0mp.A06;
                C66581MXm.A1F(A0e, (long) DbX.A05(str));
                A0e.Cgf();
            }
            EK7 ek7 = this.A02;
            if (ek7 != null) {
                ek7.A01();
            }
            C67210Mk6 mk6 = this.A03;
            if (mk6 != null && !this.A0A) {
                this.A0A = true;
                mk6.A09((C254923tH) null, (Boolean) null, AnonymousClass05K.A0j, (Integer) null, (String) null, (String) null, (Set) null);
            }
            A02();
        }
    }

    public final void A08(AnonymousClass0iw r7, UserSession userSession, String str) {
        long A052;
        String str2;
        if (this.A07 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "direct_compose_search");
            if (A0e.isSampled()) {
                boolean isEmpty = TextUtils.isEmpty(str);
                if (isEmpty) {
                    A052 = 0;
                } else {
                    Pattern pattern = 0mp.A06;
                    A052 = (long) DbX.A05(str);
                }
                C66581MXm.A1F(A0e, A052);
                if (isEmpty) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                A0e.AAJ("search_string", str2);
                C66580MXl.A1I(A0e, this.A07);
                A0e.Cgf();
            }
        }
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null && !0mp.A0G(str, mk6.A01)) {
            mk6.A08();
            String str3 = mk6.A02;
            if (str3 != null) {
                if (mk6.A01 == null) {
                    mk6.A00 = AnonymousClass7TF.A0b();
                }
                mk6.A01 = str;
                0Aj A0e2 = AnonymousClass7TE.A0e(mk6.A05, "omnipicker_search_query_changed");
                if (A0e2.isSampled()) {
                    C66580MXl.A1I(A0e2, str3);
                    A0e2.AAJ("query_string", str);
                    A0e2.A9F("query_length", DbS.A0j(DbX.A05(mk6.A01)));
                    if (182.A06(0Tu.A05, mk6.A06, 36328508426894718L)) {
                        A0e2.AAJ("query_session_id", mk6.A00);
                    }
                    A0e2.Cgf();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r1.length() == 0) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C68273N8k r10, java.util.List r11) {
        /*
            r9 = this;
            X.Mk6 r0 = r9.A03
            if (r0 == 0) goto L_0x008d
            r3 = 1
            X.0qQ.A0B(r11, r3)
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L_0x008d
            X.0wc r1 = r0.A05
            java.lang.String r0 = "omnipicker_search_result_unselected"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x008d
            X.N0x r7 = new X.N0x
            r7.<init>()
            long r0 = r10.A01
            X.C66583MXo.A1A(r7, r0)
            java.lang.Integer r8 = r10.A04
            com.instagram.model.direct.DirectSearchResult r4 = r10.A03
            boolean r5 = r4 instanceof com.instagram.model.direct.DirectShareTarget
            r0 = 0
            if (r5 == 0) goto L_0x0034
            r1 = r4
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = r1.A0L
        L_0x0034:
            X.Nmn r1 = X.C67210Mk6.A03(r8, r0)
            java.lang.String r0 = "result_type"
            r7.A01(r1, r0)
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "query_string"
            r7.A06(r0, r1)
            java.lang.String r0 = "search_result"
            r2.AAK(r7, r0)
            int r7 = X.C67210Mk6.A01(r10)
            if (r1 == 0) goto L_0x0056
            int r1 = r1.length()
            r0 = 0
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            int r1 = X.C67210Mk6.A00(r7, r0)
            java.lang.String r0 = "ui_section"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            long r0 = r10.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ui_section_index"
            r2.A9F(r0, r1)
            X.C66580MXl.A1I(r2, r6)
            java.util.List r1 = X.C67210Mk6.A07(r11)
            java.lang.String r0 = "preselected_items"
            r2.AAe(r0, r1)
            if (r5 == 0) goto L_0x008a
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            java.lang.Boolean r0 = r4.A0B
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x008a
            java.util.List r1 = r4.A0P
            java.lang.String r0 = "recipient_ids"
            r2.AAe(r0, r1)
        L_0x008a:
            r2.Cgf()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67089Mi7.A09(X.N8k, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.NSY, java.lang.Runnable] */
    public final void A0A(C254783t2 r14, boolean z) {
        String str;
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null) {
            AnonymousClass2Ep r0 = this.A00;
            if (r0 != null) {
                str = r0.C6C();
            } else {
                str = this.A06;
            }
            if (str == null && r14 != null) {
                if (r14 instanceof C254763t0) {
                    str = ((C254763t0) r14).A00;
                } else if (r14 instanceof C291175gg) {
                    List list = ((C291175gg) r14).A00;
                    if (this.A09 == null) {
                        this.A09 = AnonymousClass7TE.A1C();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.A09.add(new DirectShareTarget(r14, C66580MXl.A0k(it)));
                    }
                    AnonymousClass3U9 B35 = this.A0D.B35(list);
                    if (B35 != null) {
                        str = B35.C6C();
                    }
                }
            }
            if (r14 instanceof C254773t1) {
                this.A01 = C254923tH.DJANGO;
            }
            EK7 ek7 = this.A02;
            if (ek7 != null) {
                ek7.A01();
            }
            HashSet A012 = A01(this);
            mk6.A03 = mk6.A07.schedule(new NSY(this.A01, mk6, Boolean.valueOf(this.A0B), this.A05, (String) null, str, A012, z), 2, TimeUnit.SECONDS);
        }
    }

    public final void A0B(Integer num, Integer num2) {
        C67210Mk6 mk6 = this.A03;
        if (this.A07 != null && mk6 != null) {
            mk6.A09((C254923tH) null, Boolean.valueOf(this.A0B), num, num2, (String) null, (String) null, A01(this));
        }
    }

    public final void A0C(boolean z, boolean z2) {
        Integer num;
        C69495Nmd nmd;
        C69471NmF nmF;
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null && !this.A0A) {
            this.A0A = true;
            mk6.A08();
            String str = mk6.A02;
            if (str != null) {
                0Aj A0e = AnonymousClass7TE.A0e(mk6.A05, "omnipicker_search_end");
                if (A0e.isSampled()) {
                    C66580MXl.A1I(A0e, str);
                    if (!z2) {
                        num = AnonymousClass05K.A0j;
                    } else if (z) {
                        num = AnonymousClass05K.A15;
                    } else {
                        num = AnonymousClass05K.A0u;
                    }
                    switch (num.intValue()) {
                        case 5:
                            nmd = C69495Nmd.ABANDON;
                            break;
                        case 6:
                            nmd = C69495Nmd.CREATE_BROADCAST_FLOW_CHAT;
                            break;
                        default:
                            nmd = C69495Nmd.CREATE_PUBLIC_FLOW_CHAT;
                            break;
                    }
                    A0e.A8M(nmd, "end_action");
                    A0e.A8M(C69505Nmn.A06, "result_type");
                    int ordinal = C254923tH.DJANGO.ordinal();
                    if (ordinal == 2) {
                        nmF = C69471NmF.IG_ADVANCED_CRYPTO_TRANSPORT;
                    } else if (ordinal != 1) {
                        nmF = C69471NmF.IG_DJANGO;
                    } else {
                        nmF = C69471NmF.IG_MESSENGER_INFRA;
                    }
                    A0e.A8M(nmF, TraceFieldType.TransportType);
                    int i = 1;
                    if (z) {
                        i = 2;
                    }
                    AnonymousClass7TE.A1W(A0e, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, i);
                    A0e.Cgf();
                }
                mk6.A02 = null;
            }
        }
        A02();
    }

    public C67089Mi7(UserSession userSession) {
        this.A0D = 2L2.A00(userSession);
        0Tu r2 = 0Tu.A05;
        182.A06(r2, userSession, 36312745897035002L);
        this.A0E = 182.A06(r2, userSession, 36313471746574361L);
    }

    public final void A03() {
        String str;
        HashSet A012 = A01(this);
        C67210Mk6 mk6 = this.A03;
        if (mk6 != null && !this.A0A) {
            this.A0A = true;
            mk6.A08();
            Integer num = AnonymousClass05K.A0j;
            Integer num2 = this.A05;
            C254923tH r2 = this.A01;
            Boolean valueOf = Boolean.valueOf(this.A0B);
            if (r2 == C254923tH.DJANGO) {
                str = this.A06;
            } else {
                str = null;
            }
            mk6.A09(r2, valueOf, num, num2, (String) null, str, A012);
        }
        A02();
    }

    public final void onSessionWillEnd() {
        A02();
    }
}
