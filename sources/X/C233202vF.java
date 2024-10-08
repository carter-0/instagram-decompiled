package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2vF  reason: invalid class name and case insensitive filesystem */
public abstract class C233202vF implements AnonymousClass2vG {
    public String A00 = "";
    public String A01;
    public final UserSession A02;
    public final C233172vA A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass57O A05;
    public final String A06;
    public final String A07;
    public final C233182vC A08;

    public final void Cgs(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A02;
        AnonymousClass4DU r3 = this.A04;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_ads_client_platform_debug");
        if (A002.isSampled()) {
            A002.AAJ("debug_event_name", str3);
            A002.AAJ("container_module", r3.getModuleName());
            A002.AAJ("debug_string", str2);
            A002.AAJ("ad_id", str);
            A002.Cgf();
        }
    }

    public final void Cgz(int i, boolean z, long j) {
        Ch0((String) null, i, j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a5, code lost:
        if (r1 > 0) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ch2(X.AnonymousClass4LN r16, java.util.List r17, int r18, long r19, boolean r21) {
        /*
            r15 = this;
            r0 = 0
            r1 = r17
            X.0qQ.A0B(r1, r0)
            r0 = 4
            r2 = r16
            X.0qQ.A0B(r2, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r2.next()
            X.2vC r0 = r15.A08
            java.lang.String r0 = r0.ATn(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = ""
        L_0x0029:
            r12.add(r0)
            goto L_0x0015
        L_0x002d:
            X.4DU r9 = r15.A04
            com.instagram.common.session.UserSession r5 = r15.A02
            r11 = 0
            r0 = r19
            double r6 = (double) r0
            r0 = r18
            long r0 = (long) r0
            java.lang.String r10 = r15.A06
            java.lang.String r8 = r15.A07
            java.lang.String r4 = r15.A00
            X.2vA r3 = r15.A03
            X.0wc r14 = X.AnonymousClass0kN.A01(r9, r5)
            java.lang.String r13 = "instagram_ad_request_success"
            X.0kJ r2 = r14.A00
            X.0Aj r2 = r14.A00(r2, r13)
            boolean r13 = r2.isSampled()
            if (r13 == 0) goto L_0x021e
            java.lang.String r13 = "organic_ids"
            r2.AAe(r13, r11)
            java.lang.String r11 = "ads_ids"
            r2.AAe(r11, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r21)
            java.lang.String r11 = "first_request"
            r2.A7p(r11, r12)
            java.lang.Double r7 = java.lang.Double.valueOf(r6)
            java.lang.String r6 = "latency"
            r2.A8D(r6, r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "status_code"
            r2.A9F(r0, r1)
            java.lang.String r0 = "viewer_session_id"
            r2.AAJ(r0, r10)
            java.lang.String r0 = "tray_session_id"
            r2.AAJ(r0, r8)
            java.lang.String r1 = r9.getModuleName()
            java.lang.String r0 = "container_module"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "ad_client_delivery_session_id"
            r2.AAJ(r0, r4)
            java.lang.String r1 = r3.A0Z
            java.lang.String r0 = "request_id"
            r2.AAJ(r0, r1)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r3.A0N
            if (r0 == 0) goto L_0x00a7
            long r6 = r0.longValue()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "was_target_surface_visible_upon_delivery"
            r2.A7p(r0, r1)
            java.lang.Long r1 = r3.A0J
            java.lang.String r0 = "num_content_delivered"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = r3.A01
            java.lang.String r0 = "is_first_page"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r3.A02
            java.lang.String r0 = "is_prefetch"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r3.A00
            java.lang.String r0 = "is_carry_over_first_page"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "previous_injection_tray_session_id"
            r2.AAJ(r0, r1)
            java.lang.Long r0 = r3.A0N
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_user_entered_session_millis"
            r2.A8D(r0, r1)
            java.lang.Long r0 = r3.A0M
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_request_start_millis"
            r2.A8D(r0, r1)
            long r6 = X.C64031Cc.A02()
            double r0 = (double) r6
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_since_app_start_millis"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = "reason"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0c
            java.lang.String r0 = "sub_reason"
            r2.AAJ(r0, r1)
            java.lang.Long r0 = r3.A00()
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_previous_injection_millis"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A0b
            java.lang.String r0 = "request_uuid"
            r2.AAJ(r0, r1)
            java.lang.Boolean r1 = r3.A03
            if (r1 == 0) goto L_0x016e
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "is_refresh"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r3.A06
            java.lang.String r0 = "is_subsequent_refresh"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A0V
            java.lang.String r0 = "refresh_outcome"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0W
            java.lang.String r0 = "refresh_outcome_reason"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0X
            java.lang.String r0 = "refresh_trigger"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0Y
            java.lang.String r0 = "refresh_trigger_signal"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r3.A0C
            if (r0 == 0) goto L_0x015d
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "num_items_in_pool_discarded"
            r2.A9F(r0, r1)
        L_0x015d:
            java.lang.Integer r0 = r3.A0G
            if (r0 == 0) goto L_0x016e
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "num_sponsored_items_impressed_after_request_sent"
            r2.A9F(r0, r1)
        L_0x016e:
            java.lang.String r1 = r3.A0R
            if (r1 == 0) goto L_0x0177
            java.lang.String r0 = "ad_pool_snapshot"
            r2.AAJ(r0, r1)
        L_0x0177:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36329152671924056(0x81112c00003f58, double:3.0380406632563156E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x01f4
            java.lang.Boolean r1 = r3.A04
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = "is_on_time"
            r2.A7p(r0, r1)
        L_0x018d:
            java.lang.String r1 = r3.A0P
            if (r1 == 0) goto L_0x0196
            java.lang.String r0 = "delay_reason"
            r2.AAJ(r0, r1)
        L_0x0196:
            java.lang.String r1 = r3.A0Q
            if (r1 == 0) goto L_0x019f
            java.lang.String r0 = "delay_sub_reason"
            r2.AAJ(r0, r1)
        L_0x019f:
            java.lang.Integer r0 = r3.A0D
            if (r0 == 0) goto L_0x01b0
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "earliest_eligible_ad_slot_position"
            r2.A9F(r0, r1)
        L_0x01b0:
            java.lang.Integer r0 = r3.A0A
            if (r0 == 0) goto L_0x01c1
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "highest_position_rule"
            r2.A9F(r0, r1)
        L_0x01c1:
            java.lang.Integer r0 = r3.A09
            if (r0 == 0) goto L_0x01d2
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_viewer_entry_position"
            r2.A9F(r0, r1)
        L_0x01d2:
            java.lang.Integer r0 = r3.A0E
            if (r0 == 0) goto L_0x01e3
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "current_position"
            r2.A9F(r0, r1)
        L_0x01e3:
            java.lang.Integer r0 = r3.A0F
            if (r0 == 0) goto L_0x01f4
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "request_sent_position"
            r2.A9F(r0, r1)
        L_0x01f4:
            java.lang.Integer r0 = r3.A0H
            if (r0 == 0) goto L_0x0212
            r0 = 36318556990216460(0x8107890028190c, double:3.031339911479046E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0212
            java.lang.Integer r0 = r3.A0H
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "num_unseen_items_in_last_page"
            r2.A9F(r0, r1)
        L_0x0212:
            java.lang.Boolean r1 = r3.A05
            if (r1 == 0) goto L_0x021b
            java.lang.String r0 = "is_self_pog_chaining"
            r2.A7p(r0, r1)
        L_0x021b:
            r2.Cgf()
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233202vF.Ch2(X.4LN, java.util.List, int, long, boolean):void");
    }

    public void Ch3(AnonymousClass4LN r11, Iterable iterable) {
        0qQ.A0B(r11, 0);
        AnonymousClass4DU r9 = this.A04;
        UserSession userSession = this.A02;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        List list = r11.A08;
        C233172vA r3 = this.A03;
        0wc A012 = AnonymousClass0kN.A01(r9, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_ad_requested");
        if (A002.isSampled()) {
            A002.AAJ("viewer_session_id", str);
            A002.AAJ("tray_session_id", str2);
            A002.AAJ("container_module", r9.getModuleName());
            A002.AAJ("ad_client_delivery_session_id", str3);
            A002.AAe("organic_ids", list);
            A002.AAJ("afs_enablement_status", C233832wY.A00(userSession));
            A002.AAJ("ad_pool_snapshot", r3.A0R);
            Boolean bool = r3.A05;
            if (bool != null) {
                A002.A7p("is_self_pog_chaining", bool);
            }
            A002.Cgf();
        }
    }

    public final void Cj9(String str, String str2) {
    }

    public final void CjA(C251373n0 r10, Iterable iterable) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(iterable, 1);
        Object BTb = r10.BTb();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String ATn = this.A08.ATn(((C251373n0) it.next()).BTb());
            if (ATn != null) {
                arrayList.add(ATn);
            }
        }
        AnonymousClass4DU r7 = this.A04;
        UserSession userSession = this.A02;
        C233182vC r1 = this.A08;
        r1.AUT(BTb);
        String ATn2 = r1.ATn(BTb);
        if (ATn2 == null) {
            ATn2 = "";
        }
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        0wc A012 = AnonymousClass0kN.A01(r7, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_item_exit_pool");
        if (A002.isSampled()) {
            A002.AAJ("ad_id", ATn2);
            A002.AAe("ad_ids_in_pool", arrayList);
            A002.AAJ("viewer_session_id", str);
            A002.AAJ("tray_session_id", str2);
            A002.AAJ("container_module", r7.getModuleName());
            A002.AAJ("ad_client_delivery_session_id", str3);
            A002.Cgf();
        }
    }

    public void Ckm(AnonymousClass3VZ r9) {
        0qQ.A0B(r9, 0);
        AnonymousClass4DU r3 = this.A04;
        UserSession userSession = this.A02;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        String str4 = this.A01;
        C233822wX.A08(userSession, this.A03, r9, r3, str, str2, str3, str4);
    }

    public void Dpj(AnonymousClass3VZ r16) {
        String str;
        AnonymousClass3VZ r4 = r16;
        0qQ.A0B(r4, 0);
        AnonymousClass4DU r5 = this.A04;
        UserSession userSession = this.A02;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A00;
        String str5 = this.A01;
        C233172vA r3 = this.A03;
        C233822wX.A08(userSession, r3, r4, r5, str2, str3, str4, str5);
        AnonymousClass57O r0 = this.A05;
        if (r0 != null) {
            str = r0.AmZ();
        } else {
            str = null;
        }
        this.A01 = str;
        C233822wX.A09(userSession, r3, r5, str2, str3, this.A00, str);
    }

    public final void ERc(String str) {
        0qQ.A0B(str, 0);
        this.A00 = str;
    }

    public void Cgt(Integer num, Object obj) {
        1Xj A022;
        Object obj2 = obj;
        Integer num2 = num;
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass2vE r4 = (AnonymousClass2vE) this;
            AnonymousClass4EB r14 = (AnonymousClass4EB) obj2;
            0qQ.A0B(r14, 0);
            0qQ.A0B(num2, 1);
            int i = -1;
            if (r4.A04.CXm(r14)) {
                UserSession userSession = r4.A00;
                if (182.A06(0Tu.A05, userSession, 36327950081145676L)) {
                    1Xg r6 = r14.A01;
                    1UQ r2 = r6.A06;
                    if (r2 == 1UQ.A0l) {
                        1Xj A023 = 1Xi.A02(r6.A05);
                        if (A023 != null) {
                            C45441CwO A002 = C44851Cm1.A00(userSession);
                            Integer num3 = r6.A07;
                            if (num3 != null) {
                                i = num3.intValue();
                            }
                            C54077Gz1 A003 = A002.A00(A023, i);
                            r4.A03.A0G(A003);
                            for (C55923Hpk A004 : A003.A0B) {
                                AnonymousClass2vE.A05(A004.A00(), r4, r14, num2);
                            }
                            return;
                        }
                        return;
                    } else if (r2 == 1UQ.A0T) {
                        for (C55923Hpk A005 : r6.A01().A0B) {
                            AnonymousClass2vE.A05(A005.A00(), r4, r14, num2);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            1Xg r3 = r14.A01;
            1UQ r22 = r3.A06;
            if (r22 == 1UQ.A0T) {
                C55923Hpk hpk = (C55923Hpk) 00k.A0O(r3.A01().A0B, 0);
                if (hpk != null) {
                    A022 = hpk.A00();
                } else {
                    return;
                }
            } else {
                A022 = 1Xi.A02(r3.A05);
            }
            if (A022 != null) {
                AnonymousClass2vE.A05(A022, r4, r14, num2);
                if (r22 == 1UQ.A0l) {
                    C45441CwO A006 = C44851Cm1.A00(r4.A00);
                    Integer num4 = r3.A07;
                    if (num4 != null) {
                        i = num4.intValue();
                    }
                    r4.A03.A0G(A006.A00(A022, i));
                }
            }
        } else if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r15 = (AnonymousClass3CD) this;
            C250973mM r142 = (C250973mM) obj2;
            0qQ.A0B(r142, 0);
            0qQ.A0B(num2, 1);
            if (r15.A08.CXm(r142)) {
                List A0O = r142.A0H.A0O(r15.A02);
                0qQ.A07(A0O);
                int i2 = 0;
                int size = A0O.size();
                while (i2 < size) {
                    1Nv A09 = ((C255773uh) A0O.get(i2)).A09();
                    if (A09 != null) {
                        AnonymousClass3CD.A01(A09, r142, r15, num2, AnonymousClass3CD.A00(r15, r15.A06.Bdf()), i2);
                        i2++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return;
            }
            1Nv A092 = r142.A09(r15.A02).A09();
            if (A092 != null) {
                Integer num5 = num2;
                AnonymousClass3CD.A01(A092, r142, r15, num5, AnonymousClass3CD.A00(r15, r15.A06.Bdf()), r142.A01);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            0qQ.A0B(obj2, 0);
            AnonymousClass4DU r11 = this.A04;
            UserSession userSession2 = this.A02;
            C233182vC r0 = this.A08;
            String AU6 = r0.AU6(obj2);
            if (AU6 == null) {
                AU6 = "";
            }
            String AUT = r0.AUT(obj2);
            if (AUT == null) {
                AUT = "";
            }
            String ATn = r0.ATn(obj2);
            if (ATn == null) {
                ATn = "";
            }
            String AUK = r0.AUK(obj2);
            if (AUK == null) {
                AUK = "";
            }
            String str = this.A06;
            String str2 = this.A07;
            String str3 = this.A00;
            String ATt = r0.ATt(obj2);
            if (ATt == null) {
                ATt = "";
            }
            Boolean AU2 = r0.AU2(obj2);
            0wc A012 = AnonymousClass0kN.A01(r11, userSession2);
            0Aj A007 = A012.A00(A012.A00, "instagram_ad_delivery");
            if (A007.isSampled()) {
                A007.AAJ("m_pk", AU6);
                A007.AAJ("tracking_token", AUT);
                A007.AAJ("ad_id", ATn);
                A007.AAJ("source_of_action", r11.getModuleName());
                A007.AAJ("container_module", r11.getModuleName());
                A007.AAJ("tray_session_id", str2);
                A007.AAJ("viewer_session_id", str);
                A007.AAJ("ad_client_delivery_session_id", str3);
                A007.AAJ(TraceFieldType.RequestID, AUK);
                A007.AAJ("request_uuid", "");
                A007.AAJ("delivery_flags", ATt);
                A007.A7p("is_demo", AU2);
                A007.AAJ("afs_enablement_status", C233832wY.A00(userSession2));
                if (C228342lQ.A02(userSession2)) {
                    A007.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession2)).toString());
                    A007.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession2).toString());
                }
                A007.Cgf();
            }
        }
    }

    public void Cgu(C251373n0 r27, Object obj) {
        Integer num;
        Object obj2 = obj;
        C251373n0 r1 = r27;
        if (this instanceof AnonymousClass2vE) {
            1PW r14 = (1PW) obj2;
            0qQ.A0B(r1, 0);
            0qQ.A0B(r14, 1);
            AnonymousClass2vE.A08((AnonymousClass2vE) this, r1, r14);
        } else if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r5 = (AnonymousClass3CD) this;
            1PW r142 = (1PW) obj2;
            0qQ.A0B(r1, 0);
            0qQ.A0B(r142, 1);
            UserSession userSession = r5.A02;
            List<Reel> A0U = 1OP.A05(userSession).A0U(false);
            C270414gh r0 = r5.A07;
            if (r0 != null) {
                num = Integer.valueOf(r0.getCount());
            } else {
                num = null;
            }
            AnonymousClass4DU r12 = r5.A04;
            C250973mM r13 = (C250973mM) r1.BTb();
            int i = r5.A00;
            int BnH = r1.BnH();
            Integer Bxj = r1.Bxj();
            String str = r5.A00;
            C233172vA r11 = r5.A03;
            boolean CUo = r1.CUo();
            ArrayList arrayList = new ArrayList();
            for (Reel A0D : A0U) {
                User A0D2 = A0D.A0D();
                if (A0D2 != null) {
                    arrayList.add(A0D2.getId());
                }
            }
            AnonymousClass3PI.A01(userSession, r11, r12, r13, r142, Bxj, Integer.valueOf(A0U.size()), num, "invalidation", str, r5.A01, arrayList, i, BnH, CUo, r5.A0B);
        } else {
            0qQ.A0B(r1, 0);
            0qQ.A0B(obj2, 1);
            Object BTb = r1.BTb();
            AnonymousClass4DU r6 = this.A04;
            UserSession userSession2 = this.A02;
            C233182vC r2 = this.A08;
            String str2 = "";
            String AUT = r2.AUT(BTb);
            if (AUT == null) {
                AUT = str2;
            }
            String ATn = r2.ATn(BTb);
            if (ATn != null) {
                str2 = ATn;
            }
            String str3 = this.A06;
            String str4 = this.A07;
            String str5 = this.A00;
            1PW r15 = (1PW) obj2;
            0qQ.A0B(r15, 0);
            String str6 = (String) 00k.A0O(r15.A00(), 0);
            Long valueOf = Long.valueOf((long) r15.A03);
            List A0a = 00k.A0a(r2.AUG(obj2));
            Boolean AU2 = r2.AU2(BTb);
            0wc A012 = AnonymousClass0kN.A01(r6, userSession2);
            0Aj A002 = A012.A00(A012.A00, "instagram_ad_insertion_failure");
            if (A002.isSampled()) {
                A002.AAJ("tracking_token", AUT);
                A002.AAJ("ad_id", str2);
                A002.AAJ("viewer_session_id", str3);
                A002.AAJ("tray_session_id", str4);
                A002.AAJ(TraceFieldType.FailureReason, str6);
                A002.AAJ("brand_safe_organic_id", (String) null);
                A002.A9F("desired_insertion_position", valueOf);
                A002.AAe("adjacent_organic_media_ids", A0a);
                A002.AAJ("container_module", r6.getModuleName());
                A002.AAJ("ad_client_delivery_session_id", str5);
                A002.A7p("is_demo", AU2);
                A002.Cgf();
            }
        }
    }

    public final void Cgx(Iterable iterable, String str, String str2) {
        if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r4 = (AnonymousClass3CD) this;
            0qQ.A0B("hp0_unavailable", 0);
            0qQ.A0B(iterable, 2);
            AnonymousClass4DU r3 = r4.A04;
            C254523sc r1 = new C254523sc((C270594gz) null, r3, "instagram_ad_peek_failure");
            r1.A6b = 002.A0R("story_", "hp0_unavailable");
            r1.A74 = str2;
            r1.A4s = r3.getModuleName();
            r1.A6t = r4.A09;
            r1.A4Q = AnonymousClass3CD.A00(r4, iterable);
            C233822wX.A0H(r4.A02, r1, r3);
        }
    }

    public void Cgy(1Xj r36, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        List list4;
        int i2;
        ArrayList arrayList;
        1Xj A022;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        List Afw;
        Integer A0l;
        1Xj A023;
        BrandSafetyContentBlocklistBitmapQLObj AiG2;
        List Afw2;
        Integer A0l2;
        List list5 = list;
        HashMap hashMap2 = hashMap;
        List list6 = list3;
        List list7 = list2;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass2vE r1 = (AnonymousClass2vE) this;
            0qQ.A0B(list5, 0);
            0qQ.A0B(list7, 1);
            0qQ.A0B(list6, 2);
            0qQ.A0B(str6, 3);
            0qQ.A0B(str7, 5);
            0qQ.A0B(str8, 7);
            0qQ.A0B(hashMap2, 8);
            UserSession userSession = r1.A00;
            AnonymousClass4DU r15 = r1.A01;
            String str9 = r1.A00;
            ArrayList arrayList2 = null;
            1Xj r14 = r36;
            if (r36 != null) {
                list4 = r14.A3S();
            } else {
                list4 = null;
            }
            AnonymousClass2rI r11 = r1.A02;
            List A082 = r11.A08();
            String str10 = (String) 00k.A0O(list6, 0);
            int i3 = -1;
            if (str10 == null || (A0l2 = 00y.A0l(str10)) == null) {
                i2 = -1;
            } else {
                i2 = A0l2.intValue() - 1;
            }
            1Xg r0 = (1Xg) 00k.A0O(A082, i2);
            if (r0 == null || (A023 = 1Xi.A02(r0.A05)) == null || (AiG2 = A023.A0C.AiG()) == null || (Afw2 = AiG2.Afw()) == null) {
                arrayList = null;
            } else {
                arrayList = C271914jn.A00.A01(Afw2);
            }
            List A083 = r11.A08();
            String str11 = (String) 00k.A0O(list6, 0);
            if (!(str11 == null || (A0l = 00y.A0l(str11)) == null)) {
                i3 = A0l.intValue();
            }
            1Xg r02 = (1Xg) 00k.A0O(A083, i3);
            if (!(r02 == null || (A022 = 1Xi.A02(r02.A05)) == null || (AiG = A022.A0C.AiG()) == null || (Afw = AiG.Afw()) == null)) {
                arrayList2 = C271914jn.A00.A01(Afw);
            }
            Integer num5 = num;
            String str12 = str6;
            String str13 = str7;
            String str14 = str8;
            String str15 = str9;
            C233822wX.A0R(userSession, r14, r15, num5, num2, num3, num4, str12, str13, str14, str15, str4, str5, hashMap2, list5, list7, list6, list4, arrayList, arrayList2, f, i);
            return;
        }
        0qQ.A0B(list5, 0);
        0qQ.A0B(list7, 1);
        0qQ.A0B(list6, 2);
        0qQ.A0B(str6, 3);
        0qQ.A0B(str7, 5);
        0qQ.A0B(str8, 7);
        0qQ.A0B(hashMap2, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0076, code lost:
        if (r1 > 0) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ch0(java.lang.String r14, int r15, long r16, boolean r18) {
        /*
            r13 = this;
            X.4DU r7 = r13.A04
            com.instagram.common.session.UserSession r10 = r13.A02
            r2 = r16
            double r0 = (double) r2
            long r4 = (long) r15
            java.lang.String r9 = r13.A06
            java.lang.String r8 = r13.A07
            java.lang.String r6 = r13.A00
            X.2vA r3 = r13.A03
            r11 = 0
            X.0wc r12 = X.AnonymousClass0kN.A01(r7, r10)
            java.lang.String r10 = "instagram_ad_request_failure"
            X.0kJ r2 = r12.A00
            X.0Aj r2 = r12.A00(r2, r10)
            boolean r10 = r2.isSampled()
            if (r10 == 0) goto L_0x00f3
            java.lang.String r10 = "organic_ids"
            r2.AAe(r10, r11)
            java.lang.String r10 = "ads_ids"
            r2.AAe(r10, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            java.lang.String r10 = "first_request"
            r2.A7p(r10, r11)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "latency"
            r2.A8D(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "status_code"
            r2.A9F(r0, r1)
            java.lang.String r0 = "viewer_session_id"
            r2.AAJ(r0, r9)
            java.lang.String r0 = "tray_session_id"
            r2.AAJ(r0, r8)
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "container_module"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "ad_client_delivery_session_id"
            r2.AAJ(r0, r6)
            java.lang.String r1 = r3.A0Z
            java.lang.String r0 = "request_id"
            r2.AAJ(r0, r1)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r3.A0N
            if (r0 == 0) goto L_0x0078
            long r4 = r0.longValue()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "was_target_surface_visible_upon_delivery"
            r2.A7p(r0, r1)
            java.lang.Long r1 = r3.A0J
            java.lang.String r0 = "num_content_delivered"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = r3.A01
            java.lang.String r0 = "is_first_page"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r3.A02
            java.lang.String r0 = "is_prefetch"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r3.A00
            java.lang.String r0 = "is_carry_over_first_page"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "previous_injection_tray_session_id"
            r2.AAJ(r0, r1)
            java.lang.Long r0 = r3.A0N
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_user_entered_session_millis"
            r2.A8D(r0, r1)
            java.lang.Long r0 = r3.A0M
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_request_start_millis"
            r2.A8D(r0, r1)
            long r4 = X.C64031Cc.A02()
            double r0 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_since_app_start_millis"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = "reason"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0c
            java.lang.String r0 = "sub_reason"
            r2.AAJ(r0, r1)
            java.lang.Long r0 = r3.A00()
            java.lang.Double r1 = X.C233822wX.A02(r0)
            java.lang.String r0 = "time_since_previous_injection_millis"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A0b
            java.lang.String r0 = "request_uuid"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "network_response_error_message"
            r2.AAJ(r0, r14)
            r2.Cgf()
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233202vF.Ch0(java.lang.String, int, long, boolean):void");
    }

    public final void Ch1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass4DU r5 = this.A04;
        UserSession userSession = this.A02;
        String str5 = this.A01;
        String str6 = this.A06;
        String str7 = this.A07;
        String str8 = this.A00;
        0wc A012 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_ad_request_skipped");
        if (A002.isSampled()) {
            A002.AAJ("chaining_session_id", str5);
            A002.AAJ("viewer_session_id", str6);
            A002.AAJ("tray_session_id", str7);
            A002.AAJ("container_module", r5.getModuleName());
            A002.AAJ("ad_client_delivery_session_id", str8);
            A002.AAJ("seed_ad_id", str);
            A002.A7p("is_headload", Boolean.valueOf(z));
            A002.A7p("is_refresh", Boolean.valueOf(z2));
            A002.AAJ("refresh_trigger", str2);
            A002.AAJ("refresh_trigger_signal", str3);
            A002.AAJ("reason", str4);
            A002.Cgf();
        }
    }

    public void Chf(C251373n0 r18, Object obj, String str) {
        String str2;
        Object obj2 = obj;
        C251373n0 r1 = r18;
        if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r2 = (AnonymousClass3CD) this;
            1PW r3 = (1PW) obj2;
            0qQ.A0B(r1, 0);
            0qQ.A0B(r3, 1);
            UserSession userSession = r2.A02;
            AnonymousClass4DU r5 = r2.A04;
            C250973mM r9 = (C250973mM) r1.BTb();
            String str3 = r2.A09;
            String str4 = r2.A0A;
            int i = r3.A02;
            int i2 = r3.A01;
            int i3 = r3.A04;
            int i4 = r3.A09;
            int i5 = r3.A0A;
            String str5 = r2.A00;
            0qQ.A0B(r9, 2);
            Reel reel = r9.A0H;
            C296215pf r10 = new C296215pf(userSession, reel, str3, str4, r9.A01, r9.A0E);
            if (reel.A0m()) {
                str2 = "netego_exit_pool";
            } else if (r9.A0N) {
                str2 = "ad_exit_pool";
            } else {
                throw new IllegalArgumentException(C273654mx.A00(62));
            }
            C254523sc r8 = new C254523sc(r10, r5, str2);
            C233472vm r0 = reel.A0b;
            if (r0 != null) {
                r8.A0O(r0);
                r8.A48 = Long.valueOf((long) i);
                r8.A44 = Long.valueOf((long) r9.A01);
                r8.A06(i2);
                r8.A0A(i3);
                r8.A42 = Long.valueOf((long) i4);
                r8.A43 = Long.valueOf((long) i5);
                r8.A4M = str5;
                r8.A6b = str;
                C239613Hd r02 = reel.A0X;
                if (r02 != null) {
                    String str6 = r02.A02;
                    int i6 = r02.A00;
                    r8.A4P = str6;
                    r8.A3b = Long.valueOf((long) i6);
                }
                C233822wX.A0I(userSession, r8, r5, AnonymousClass05K.A01);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (this instanceof AnonymousClass2vE) {
            ((AnonymousClass2vE) this).A0A(r1);
        }
    }

    public void Cj5(C251373n0 r4) {
        if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r2 = (AnonymousClass3CD) this;
            0qQ.A0B(r4, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("mViewerSource:");
            sb.append(r2.A05.A00);
            sb.append("mViewerSessionId: ");
            sb.append(r2.A0A);
            sb.append(" || mTraySessionId: ");
            sb.append(r2.A09);
            sb.append(" || Reel ID: ");
            String id = ((C250973mM) r4.BTb()).A0H.getId();
            0qQ.A07(id);
            sb.append(id);
            sb.append(" || adClientDeliverySessionId: ");
            sb.append(r2.A00);
            0wb.A03("processInsertionAction: Reel is not ad or netego", sb.toString());
        }
    }

    public final void CjQ(Object obj) {
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass2vE r1 = (AnonymousClass2vE) this;
            AnonymousClass4EB r11 = (AnonymousClass4EB) obj;
            0qQ.A0B(r11, 0);
            AnonymousClass5ET.A00(r1.A00, r11.A01, r1.A01, r11.A00.A03);
        } else if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r2 = (AnonymousClass3CD) this;
            C250973mM r112 = (C250973mM) obj;
            0qQ.A0B(r112, 0);
            UserSession userSession = r2.A02;
            AnonymousClass4DU r3 = r2.A04;
            C254523sc r12 = new C254523sc(C297805sN.A00(userSession, r112, r2.A09, r2.A0A), r3, "instagram_netego_delivery");
            AnonymousClass3PI.A06(r12, r112.A0H);
            C233822wX.A0I(userSession, r12, r3, AnonymousClass05K.A01);
        } else {
            0qQ.A0B(obj, 0);
            AnonymousClass4DU r9 = this.A04;
            UserSession userSession2 = this.A02;
            C233182vC r13 = this.A08;
            String AU6 = r13.AU6(obj);
            if (AU6 == null) {
                AU6 = "";
            }
            String AUT = r13.AUT(obj);
            if (AUT == null) {
                AUT = "";
            }
            String str = this.A06;
            String str2 = this.A07;
            String ATn = r13.ATn(obj);
            String AUE = r13.AUE(obj);
            r13.AUF(obj);
            0wc A012 = AnonymousClass0kN.A01(r9, userSession2);
            0Aj A002 = A012.A00(A012.A00, "instagram_netego_delivery");
            if (A002.isSampled()) {
                A002.AAJ("m_pk", AU6);
                A002.AAJ("tracking_token", AUT);
                A002.AAJ("source_of_action", r9.getModuleName());
                A002.AAJ("tray_session_id", str2);
                A002.AAJ("viewer_session_id", str);
                A002.AAJ("ad_id", ATn);
                A002.AAJ("netego_id", AUE);
                A002.Cgf();
            }
        }
    }

    public final void CjR(C251373n0 r15, Object obj) {
        Object obj2 = obj;
        if (this instanceof AnonymousClass2vE) {
            1PW r6 = (1PW) obj2;
            0qQ.A0B(r6, 1);
            AnonymousClass2vE.A08((AnonymousClass2vE) this, r15, r6);
        } else if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r1 = (AnonymousClass3CD) this;
            1PW r62 = (1PW) obj2;
            0qQ.A0B(r62, 1);
            C310036aK.A07.A01(r1.A02, r1.A04, (C250973mM) r15.BTb(), r62, r15.Bxj(), "invalidation", r1.A09, r1.A0A, r1.A00, r15.BnH(), r15.CUo());
        } else {
            Object BTb = r15.BTb();
            AnonymousClass4DU r7 = this.A04;
            UserSession userSession = this.A02;
            C233182vC r0 = this.A08;
            String AUT = r0.AUT(BTb);
            if (AUT == null) {
                AUT = "";
            }
            String str = this.A06;
            String str2 = this.A07;
            String ATn = r0.ATn(BTb);
            0wc A012 = AnonymousClass0kN.A01(r7, userSession);
            0Aj A002 = A012.A00(A012.A00, "instagram_netego_insertion_failure");
            if (A002.isSampled()) {
                A002.AAJ("tracking_token", AUT);
                A002.AAJ("viewer_session_id", str);
                A002.AAJ("tray_session_id", str2);
                A002.AAJ(TraceFieldType.FailureReason, (String) null);
                A002.AAJ("brand_safe_organic_id", (String) null);
                A002.AAJ("container_module", r7.getModuleName());
                A002.AAJ("ad_id", ATn);
                A002.Cgf();
            }
        }
    }

    public final void CjS(C251373n0 r19, Object obj) {
        Long l;
        Long l2;
        int i;
        Object obj2 = obj;
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass2vE r2 = (AnonymousClass2vE) this;
            AnonymousClass4EB r6 = (AnonymousClass4EB) r19.BTb();
            C254523sc r7 = new C254523sc(r2.A01, "instagram_netego_insertion_success");
            1Xg r4 = r6.A01;
            r7.A7J = r4.A05.C9L();
            C233462vl r3 = r6.A03;
            r7.A0G = r3.A09();
            Integer num = r4.A07;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            r7.A09 = i;
            Long valueOf = Long.valueOf((long) r3.A02());
            r7.A3h = valueOf;
            r7.A3a = Long.valueOf((long) r3.A03());
            r7.A3k = Long.valueOf((long) r3.A06());
            r7.A2Y = Double.valueOf(r3.A00());
            r7.A3n = valueOf;
            r7.A66 = r4.A09;
            0xI A002 = r7.A00();
            UserSession userSession = r2.A00;
            C60510iO.A00(userSession).EHF(A002);
            AnonymousClass9J8 r1 = r6.A00;
            int A09 = r3.A09();
            0qQ.A0B(r1, 0);
            C241323Ot.A05(r1, userSession, r4, A09);
        } else if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r22 = (AnonymousClass3CD) this;
            1PW r9 = (1PW) obj2;
            0qQ.A0B(r9, 1);
            C233172vA r12 = r22.A03;
            r12.A00();
            r12.A0S = r12.A0d;
            C310036aK.A07.A01(r22.A02, r22.A04, (C250973mM) r19.BTb(), r9, r19.Bxj(), "insertion_success", r22.A09, r22.A0A, r22.A00, r19.BnH(), r19.CUo());
        } else {
            0qQ.A0B(obj2, 1);
            Object BTb = r19.BTb();
            AnonymousClass4DU r17 = this.A04;
            UserSession userSession2 = this.A02;
            C233182vC r5 = this.A08;
            String str = "";
            String AUT = r5.AUT(BTb);
            if (AUT == null) {
                AUT = str;
            }
            String AU6 = r5.AU6(BTb);
            if (AU6 != null) {
                str = AU6;
            }
            String str2 = this.A06;
            String str3 = this.A07;
            Long valueOf2 = Long.valueOf((long) r5.ATy(BTb));
            Long valueOf3 = Long.valueOf((long) r5.ATm(obj2));
            Long valueOf4 = Long.valueOf((long) r5.AUD(obj2));
            Long valueOf5 = Long.valueOf((long) r5.AU9(BTb));
            Long valueOf6 = Long.valueOf((long) r5.AUA(BTb));
            Long valueOf7 = Long.valueOf((long) r5.AUB(BTb));
            Long valueOf8 = Long.valueOf((long) r5.AUC(BTb));
            String ATn = r5.ATn(BTb);
            if (ATn != null) {
                l = 00y.A0n(10, ATn);
            } else {
                l = null;
            }
            String AUE = r5.AUE(BTb);
            if (AUE != null) {
                l2 = 00y.A0n(10, AUE);
            } else {
                l2 = null;
            }
            0wc A012 = AnonymousClass0kN.A01(r17, userSession2);
            0Aj A003 = A012.A00(A012.A00, "instagram_netego_insertion_success");
            if (A003.isSampled()) {
                A003.AAJ("tracking_token", AUT);
                A003.AAJ("viewer_session_id", str2);
                A003.AAJ("tray_session_id", str3);
                A003.AAJ("source_of_action", r17.getModuleName());
                A003.AAJ("m_pk", str);
                A003.A9F("gap_to_last_ad", (Long) null);
                A003.A9F("gap_to_last_netego", (Long) null);
                A003.A9F("highest_position_rule", valueOf2);
                A003.A9F("ad_consumed_media_gap", valueOf3);
                A003.A9F("netego_consumed_media_gap", valueOf4);
                A003.A9F("min_consumed_media_gap_to_previous_ad", valueOf5);
                A003.A9F("min_consumed_media_gap_to_previous_netego", valueOf6);
                A003.A9F("min_consumed_reel_gap_to_previous_ad", valueOf7);
                A003.A9F("min_consumed_reel_gap_to_previous_netego", valueOf8);
                A003.A9F("netego_id", l2);
                A003.A9F("ad_id", l);
                A003.Cgf();
            }
        }
    }

    public final void CjT(Object obj, String str, Collection collection) {
        Long l;
        Object obj2 = obj;
        Collection collection2 = collection;
        if (this instanceof AnonymousClass3CD) {
            AnonymousClass3CD r4 = (AnonymousClass3CD) this;
            C250973mM r1 = (C250973mM) obj2;
            0qQ.A0B(r1, 0);
            0qQ.A0B(collection2, 2);
            UserSession userSession = r4.A02;
            AnonymousClass4DU r6 = r4.A04;
            String str2 = r4.A09;
            String str3 = r4.A0A;
            ArrayList arrayList = new ArrayList(collection2);
            C254523sc r2 = new C254523sc(C297805sN.A00(userSession, r1, str2, str3), r6, "instagram_netego_invalidation");
            AnonymousClass3PI.A06(r2, r1.A0H);
            r2.A7x = arrayList;
            r2.A6o = (String) arrayList.get(0);
            C233822wX.A0H(userSession, r2, r6);
            return;
        }
        String str4 = str;
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass4EB r12 = (AnonymousClass4EB) obj2;
            0qQ.A0B(r12, 0);
            0qQ.A0B(str4, 1);
            0qQ.A0B(collection2, 2);
            AnonymousClass2vE.A07((AnonymousClass2vE) this, r12, (Long) null, str4, (String) null, (String) null, (String) null, (Collection) null, collection2, false);
            return;
        }
        0qQ.A0B(obj2, 0);
        0qQ.A0B(str4, 1);
        0qQ.A0B(collection2, 2);
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(collection2, 10));
        int i = 0;
        for (Object next : collection2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                arrayList2.add(new 0eP(Long.valueOf((long) i), next));
                i = i2;
            }
        }
        Map A082 = 0Yt.A08(arrayList2);
        AnonymousClass4DU r5 = this.A04;
        UserSession userSession2 = this.A02;
        C233182vC r0 = this.A08;
        String AUT = r0.AUT(obj2);
        if (AUT == null) {
            AUT = "";
        }
        String str5 = this.A06;
        String str6 = this.A07;
        Long l2 = null;
        Long valueOf = Long.valueOf((long) r0.AU9(obj2));
        Long valueOf2 = Long.valueOf((long) r0.AUA(obj2));
        Long valueOf3 = Long.valueOf((long) r0.AUB(obj2));
        Long valueOf4 = Long.valueOf((long) r0.AUC(obj2));
        r0.AUF(obj2);
        String AUE = r0.AUE(obj2);
        if (AUE != null) {
            l = 00y.A0n(10, AUE);
        } else {
            l = null;
        }
        String ATn = r0.ATn(obj2);
        if (ATn != null) {
            l2 = 00y.A0n(10, ATn);
        }
        C233822wX.A07(r5, userSession2, valueOf, valueOf2, valueOf3, valueOf4, l, l2, AUT, str5, str6, A082);
    }

    public final void Cjj(Integer num, Object obj, String str, List list) {
        0Aj A002;
        String moduleName;
        String str2;
        Long l;
        1Xg r0;
        String str3;
        C233462vl r02;
        C233462vl r03;
        if (this instanceof AnonymousClass2vE) {
            AnonymousClass2vE r4 = (AnonymousClass2vE) this;
            AnonymousClass4EB r10 = (AnonymousClass4EB) obj;
            0qQ.A0B(str, 0);
            0qQ.A0B(list, 1);
            UserSession userSession = r4.A00;
            AnonymousClass4DU r5 = r4.A01;
            0wc A012 = AnonymousClass0kN.A01(r5, userSession);
            A002 = A012.A00(A012.A00, "instagram_ad_push_up_failure");
            if (A002.isSampled()) {
                0bb r3 = new 0bb();
                r3.A06("surface", "feed");
                Long l2 = null;
                if (r10 == null || (r03 = r10.A03) == null) {
                    l = null;
                } else {
                    l = Long.valueOf((long) r03.A05());
                }
                r3.A05("min_gap", l);
                if (!(r10 == null || (r02 = r10.A03) == null)) {
                    l2 = Long.valueOf((long) r02.A09());
                }
                r3.A05("target_position", l2);
                if (!(r10 == null || (r0 = r10.A01) == null || (str3 = r0.A09) == null)) {
                    r3.A05("current_position", Long.valueOf((long) r4.A02.BJU(str3)));
                }
                A002.AAJ("reason", str);
                A002.AAJ("sub_reason", (String) 00k.A0O(list, 0));
                A002.AAJ("container_module", r5.getModuleName());
                A002.AAJ("ad_client_delivery_session_id", r4.A00);
                A002.AAK(r3, "moat_info");
                if (r10 != null) {
                    C233182vC r32 = r4.A05;
                    A002.AAJ("ad_id", r32.ATn(r10));
                    A002.AAJ("tracking_token", r32.AUT(r10));
                    moduleName = r10.A03.A08;
                    str2 = "surface_snapshot";
                }
                A002.Cgf();
            }
            return;
        }
        0qQ.A0B(str, 0);
        0qQ.A0B(list, 1);
        UserSession userSession2 = this.A02;
        AnonymousClass4DU r33 = this.A04;
        0wc A013 = AnonymousClass0kN.A01(r33, userSession2);
        A002 = A013.A00(A013.A00, "instagram_ad_push_up_failure");
        if (A002.isSampled()) {
            A002.AAJ("reason", str);
            A002.AAJ("sub_reason", (String) list.get(0));
            moduleName = r33.getModuleName();
            str2 = "container_module";
        } else {
            return;
        }
        A002.AAJ(str2, moduleName);
        A002.Cgf();
    }

    public final void Cjk(AnonymousClass9I2 r9, String str, long j, long j2, long j3) {
        0qQ.A0B(r9, 3);
        UserSession userSession = this.A02;
        AnonymousClass4DU r4 = this.A04;
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_ad_push_up_failure");
        if (A002.isSampled()) {
            0bb r2 = new 0bb();
            r2.A05(AnonymousClass000.A00(3755), Long.valueOf((long) r9.A04));
            r2.A05("is_time_rule_paused", Long.valueOf((long) r9.A01));
            r2.A05(AnonymousClass000.A00(3630), Long.valueOf((long) r9.A03));
            r2.A05("next_sponsored_item_position_invalid", Long.valueOf((long) r9.A02));
            r2.A05(AnonymousClass000.A00(4174), Long.valueOf((long) r9.A06));
            r2.A05("time_gap_not_satisfied", Long.valueOf((long) r9.A05));
            r2.A05(AnonymousClass000.A00(3182), Long.valueOf((long) r9.A00));
            A002.AAJ("reason", "feed_tbi");
            A002.A9F("gre_not_start_count", Long.valueOf(j3));
            A002.A9F("push_up_failure_count", 0L);
            A002.AAK(r2, "push_up_failure_reasons_count_map");
            A002.A9F("push_up_hit_count", Long.valueOf(j));
            A002.AAJ("container_module", r4.getModuleName());
            A002.Cgf();
        }
    }

    public void EVW(int i) {
        String str;
        AnonymousClass57O r0 = this.A05;
        if (r0 != null) {
            str = r0.AmZ();
        } else {
            str = null;
        }
        this.A01 = str;
        AnonymousClass4DU r2 = this.A04;
        C233822wX.A09(this.A02, this.A03, r2, this.A06, this.A07, this.A00, str);
    }

    public C233202vF(UserSession userSession, C233172vA r3, AnonymousClass4DU r4, AnonymousClass57O r5, C233182vC r6, String str, String str2) {
        this.A02 = userSession;
        this.A04 = r4;
        this.A06 = str;
        this.A03 = r3;
        this.A07 = str2;
        this.A08 = r6;
        this.A05 = r5;
    }
}
