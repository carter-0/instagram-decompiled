package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.2pH  reason: invalid class name and case insensitive filesystem */
public final class C230252pH {
    public AnonymousClass2oI A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final Set A06;
    public final String A07;
    public final Set A08;

    public C230252pH(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = str2;
        if (str3 == null) {
            str3 = UUID.randomUUID().toString();
            0qQ.A07(str3);
        }
        this.A04 = str3;
        this.A07 = str;
        this.A08 = new HashSet();
        this.A06 = new HashSet();
        this.A05 = new HashSet();
    }

    public final void A02(Reel reel, AnonymousClass3BN r12, Boolean bool, Boolean bool2, Integer num, int i) {
        0qQ.A0B(reel, 0);
        String id = reel.getId();
        0qQ.A07(id);
        A00(reel, r12, this, bool, bool2, (Boolean) null, num, id, i);
    }

    public final void A03(AnonymousClass3BN r15, C228102kn r16, Double d, Integer num, long j, boolean z) {
        Integer num2 = num;
        0qQ.A0B(num2, 4);
        AnonymousClass3PI.A00.A0C(this.A01, this.A02, r15, r16, d, num2, (Integer) null, this.A04, this.A03, j, z, true);
    }

    public static final void A00(Reel reel, AnonymousClass3BN r18, C230252pH r19, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, int i) {
        String str2;
        long j;
        long j2;
        Long l;
        String str3;
        String str4;
        C278114wI r5;
        String id;
        C230252pH r3 = r19;
        Set set = r3.A08;
        String str5 = str;
        if (!set.contains(str5)) {
            set.add(str5);
            Long l2 = null;
            UserSession userSession = r3.A02;
            AnonymousClass0iw r1 = r3.A01;
            String str6 = r3.A04;
            String str7 = r3.A07;
            if (num != null) {
                str2 = C293305kV.A00(num);
            } else {
                str2 = null;
            }
            String str8 = null;
            0qQ.A0B(str6, 3);
            0wc A002 = AnonymousClass0kN.A00(r1, 0kJ.A03, userSession);
            0Aj A003 = A002.A00(A002.A00, "reel_tray_impression");
            if (A003.isSampled()) {
                AnonymousClass3BO r7 = r18.A01;
                AnonymousClass3BP r10 = r7.A01;
                boolean z = false;
                if (r10.A02 != 0) {
                    z = true;
                }
                if (z) {
                    j = 1L;
                } else {
                    j = 0L;
                }
                A003.A9F("has_my_reel", j);
                A003.A9F("viewed_reel_count", Long.valueOf((long) r10.A03));
                A003.A9F("new_reel_count", Long.valueOf((long) r10.A01));
                A003.A9F("live_reel_count", Long.valueOf((long) r7.A00.A01));
                A003.A9F("tray_position", Long.valueOf((long) i));
                A003.AAJ("tray_session_id", str6);
                A003.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                Reel reel2 = reel;
                A003.AAJ("reel_id", reel2.getId());
                A003.A7p("seen_state_ring", Boolean.valueOf(reel2.A1S));
                if (reel2.A16(userSession)) {
                    j2 = 0L;
                } else {
                    j2 = 1L;
                }
                A003.A9F("is_new_reel", j2);
                A003.AAJ("reel_type", reel2.A0H(userSession));
                1Ns r0 = reel2.A0W;
                if (r0 == null || (id = r0.getId()) == null) {
                    l = null;
                } else {
                    l = 00y.A0n(10, id);
                }
                A003.A9F("a_pk", l);
                String str9 = null;
                if (reel2.A0d()) {
                    C270194gL r6 = reel2.A0H;
                    if (r6 != null) {
                        r5 = r6.A06;
                        if (r5 == null) {
                            r5 = C278114wI.UNKNOWN;
                        }
                    } else {
                        r5 = null;
                    }
                    if (r5 == C278114wI.ACTIVE && r6 != null) {
                        str9 = r6.A0e;
                        str9.getClass();
                    }
                }
                A003.AAJ("m_pk", str9);
                A003.AAJ("shopping_session_id", str7);
                A003.AAJ("broadcast_source", (String) null);
                C72695PFz pFz = reel2.A0E;
                if (pFz != null) {
                    str8 = pFz.getId();
                }
                A003.AAJ("media_preview_id", str8);
                A003.A7p("sifu_end_card", false);
                Boolean bool4 = bool3;
                A003.A7p("is_group_story_pog", bool4);
                Boolean bool5 = bool;
                if (bool != null) {
                    if (bool5.equals(true)) {
                        str4 = "CARDS";
                    } else {
                        str4 = "DEFAULT";
                    }
                    A003.AAJ("highlight_cover_size", str4);
                }
                if (0qQ.A0K(bool2, true)) {
                    A003.A7p("sifu_end_card", true);
                }
                if (reel2.getId().equals("election:rollcall_v2") || reel2.A0o()) {
                    List A0O = reel2.A0O(userSession);
                    0qQ.A07(A0O);
                    List<User> A004 = C56337Hwo.A00(A0O);
                    ArrayList arrayList = new ArrayList(0Yv.A1E(A004, 10));
                    for (User id2 : A004) {
                        arrayList.add(00y.A0n(10, id2.getId()));
                    }
                    A003.AAe("facepile_ids", arrayList);
                } else {
                    List<User> list = reel2.A1p;
                    0qQ.A07(list);
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(list, 10));
                    for (User id3 : list) {
                        arrayList2.add(00y.A0n(10, id3.getId()));
                    }
                    A003.AAe("facepile_ids", arrayList2);
                }
                if (0qQ.A0K(bool4, true)) {
                    HallpassDetailsDict hallpassDetailsDict = reel2.A08;
                    if (hallpassDetailsDict != null) {
                        String BAL = hallpassDetailsDict.BAL();
                        str3 = hallpassDetailsDict.getName();
                        if (BAL != null) {
                            l2 = 00y.A0n(10, BAL);
                        }
                    } else {
                        str3 = null;
                    }
                    A003.A9F("audience_list_id", l2);
                    A003.AAJ("audience_list_name", str3);
                }
                A003.Cgf();
            }
        }
    }

    public final void A01(int i) {
        Set set = this.A08;
        if (!set.contains("spinner")) {
            set.add("spinner");
            0wc A012 = AnonymousClass0kN.A01(this.A01, this.A02);
            0Aj A002 = A012.A00(A012.A00, "reel_tray_impression");
            if (A002.isSampled()) {
                A002.AAJ("tray_session_id", this.A04);
                A002.AAJ("reel_type", "spinner");
                A002.A9F("tray_position", Long.valueOf((long) i));
                A002.Cgf();
            }
        }
    }

    public final void A04(AnonymousClass3BN r15, C228102kn r16, Integer num, int i, long j, boolean z) {
        AnonymousClass3PI r0 = AnonymousClass3PI.A00;
        UserSession userSession = this.A02;
        AnonymousClass3BN r3 = r15;
        C228102kn r4 = r16;
        Integer num2 = num;
        r0.A0C(this.A01, userSession, r3, r4, (Double) null, num2, Integer.valueOf(i), this.A04, this.A03, j, z, false);
    }
}
