package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsSpecialResponseType;
import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.4hD  reason: invalid class name and case insensitive filesystem */
public abstract class C270734hD implements C270744hE, C270764hG {
    public C290515fR A00 = null;
    public Context A01;
    public final C270694h9 A02;
    public final C270654h5 A03;
    public final GF2 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final C54575HJk A08;
    public final Integer A09;
    public final String A0A;
    public final C62320sa A0B;
    public final boolean A0C;

    public C270734hD(Context context, C270694h9 r3, C54575HJk hJk, C270654h5 r5, GF2 gf2, Integer num, String str, String str2, String str3, C62320sa r11, boolean z, boolean z2) {
        this.A06 = str;
        this.A04 = gf2;
        this.A03 = r5;
        this.A0A = str2;
        this.A02 = r3;
        this.A09 = num;
        this.A07 = z;
        this.A0C = z2;
        this.A08 = hJk;
        this.A01 = context;
        this.A05 = str3;
        this.A0B = r11;
    }

    public static final void A02(Context context, UserSession userSession, C270734hD r49, String str, String str2, double d, boolean z, boolean z2) {
        String str3;
        1NY A002;
        String A003;
        String str4;
        String str5;
        boolean containsKey;
        1FZ A022;
        String str6;
        String str7;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93C r3 = AnonymousClass93C.A04;
        AnonymousClass93F A004 = AnonymousClass93D.A00(userSession2, r3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass93M(userSession2));
        A004.EBM(r3, arrayList);
        Context context2 = context;
        C270734hD r1 = r49;
        String str8 = str;
        String str9 = str2;
        double d2 = d;
        boolean z3 = z2;
        if (1KU.A0B(userSession2)) {
            AnonymousClass9MG r32 = new AnonymousClass9MG(18, userSession2, r1, A004);
            GF2 gf2 = r1.A04;
            if (gf2 != null) {
                str5 = gf2.A01();
            } else {
                str5 = null;
            }
            String A005 = r1.A03.A00();
            1Ga A006 = 1GZ.A00(userSession2);
            synchronized (A006) {
                containsKey = A006.A01.containsKey("clips_discover_prefetch");
            }
            if (!containsKey) {
                C40244AXi aXi = new C40244AXi(userSession2, r1);
                C40246AXk aXk = new C40246AXk(userSession2, str8, r32);
                1GP r21 = null;
                AXD axd = AXD.A00;
                if (!z) {
                    AnonymousClass93Q r16 = AnonymousClass93Q.A00;
                    String str10 = r1.A06;
                    C270694h9 r14 = r1.A02;
                    C290515fR r12 = r1.A00;
                    0Tu r33 = 0Tu.A05;
                    boolean A062 = 182.A06(r33, userSession2, 2342156429420398516L);
                    String A042 = 182.A04(r33, userSession2, 36876370160320611L);
                    String valueOf = String.valueOf(182.A06(r33, userSession2, 2342156429420529590L));
                    String valueOf2 = String.valueOf(182.A06(r33, userSession2, 2342156429420464053L));
                    String A043 = 182.A04(r33, userSession2, 36876370160386148L);
                    if (A062) {
                        str7 = new JSONObject(AnonymousClass93R.A01(A042, valueOf2, valueOf, A043, A062)).toString();
                    } else {
                        str7 = null;
                    }
                    C270694h9 r18 = r14;
                    UserSession userSession3 = userSession2;
                    C290515fR r20 = r12;
                    String str11 = str10;
                    r21 = r16.A08(context2, r18, userSession3, r20, (C54575HJk) null, (Integer) null, (Long) null, str11, (String) null, str5, A005, str8, str7, (String) null, AnonymousClass93S.A00(userSession2).A01, (String) null, (String) null, str9, 0sn.A00, (C62320sa) null, d2, true, z3, false, false, true, false, false);
                }
                if (AnonymousClass93Q.A05(userSession2)) {
                    A022 = AnonymousClass93V.A01(userSession2);
                    str6 = "mixed_media/discover/stream/";
                } else {
                    A022 = AnonymousClass93V.A02(userSession2, 1617547344);
                    str6 = "clips/discover/stream/";
                }
                AnonymousClass93Q.A03(A022, userSession2, AnonymousClass05K.A0C, (Integer) null, str8, (String) null, str6, (String) null, (String) null, (String) null, (String) null, false, false);
                AnonymousClass93Q.A01(context2, A022, userSession2, (C54575HJk) null, str8, (String) null, (String) null, (Map) null, (C62320sa) null, true, false, true, true, false);
                1Ga.A00(A006, axd, aXk, aXi, r21, A022.A0M(), "clips_discover_prefetch", AnonymousClass93Q.A00(userSession2), true, 182.A06(0Tu.A05, userSession2, 36317010799366909L));
                return;
            }
            return;
        }
        AnonymousClass9MC r34 = new AnonymousClass9MC(45, r1, A004, userSession2);
        GF2 gf22 = r1.A04;
        if (gf22 != null) {
            str3 = gf22.A01();
        } else {
            str3 = null;
        }
        String A007 = r1.A03.A00();
        1P2 A008 = 1P1.A00(userSession2);
        if (!A008.A0A("clips_discover_prefetch")) {
            AnonymousClass93O r9 = new AnonymousClass93O(userSession2, r1, str8, r34);
            1OC r44 = null;
            AnonymousClass93P r41 = AnonymousClass93P.A00;
            if (!z) {
                AnonymousClass93Q r162 = AnonymousClass93Q.A00;
                String str12 = r1.A06;
                C270694h9 r142 = r1.A02;
                0Tu r4 = 0Tu.A05;
                boolean A063 = 182.A06(r4, userSession2, 2342156429420398516L);
                String A044 = 182.A04(r4, userSession2, 36876370160320611L);
                String valueOf3 = String.valueOf(182.A06(r4, userSession2, 2342156429420529590L));
                String valueOf4 = String.valueOf(182.A06(r4, userSession2, 2342156429420464053L));
                String A045 = 182.A04(r4, userSession2, 36876370160386148L);
                if (A063) {
                    str4 = new JSONObject(AnonymousClass93R.A01(A044, valueOf4, valueOf3, A045, A063)).toString();
                } else {
                    str4 = null;
                }
                r44 = r162.A07(context2, (AnonymousClass9JG) null, r142, userSession2, (C290515fR) null, (C54575HJk) null, (Integer) null, str12, (String) null, str3, A007, str8, str4, AnonymousClass93S.A00(userSession2).A01, r1.A05, str9, (C62320sa) null, d2, true, z3, false, false, true);
            }
            if (AnonymousClass93Q.A05(userSession2)) {
                A002 = new 1NY(userSession2, -2);
                A002.A0O((15p) null, C43827CEt.class, C45656D0g.class, false);
                A003 = "mixed_media/discover/";
            } else {
                A002 = AnonymousClass93V.A00(userSession2);
                A003 = AnonymousClass000.A00(1174);
            }
            1NY r24 = A002;
            AnonymousClass93Q.A03(r24, userSession2, AnonymousClass05K.A0C, (Integer) null, str8, (String) null, A003, (String) null, (String) null, (String) null, (String) null, false, false);
            AnonymousClass93Q.A01(context2, A002, userSession2, (C54575HJk) null, str8, (String) null, (String) null, (Map) null, (C62320sa) null, true, false, true, false, false);
            1P2.A00(A008, r41, (1P0) null, r9, r44, A002.A0M(), "clips_discover_prefetch", AnonymousClass93Q.A00(userSession2), true, 182.A06(0Tu.A05, userSession2, 36317010799366909L));
        }
    }

    private final void A03(UserSession userSession, AnonymousClass5M5 r17) {
        Long l;
        long j;
        UserSession userSession2 = userSession;
        AHo(userSession2);
        AnonymousClass5M5 r3 = r17;
        r3.A00++;
        Throwable th = new Throwable();
        if (1KU.A0B(userSession2)) {
            1Ga A002 = 1GZ.A00(userSession2);
            synchronized (A002) {
                C228862mS r0 = (C228862mS) A002.A00.get("clips_discover_prefetch");
                if (r0 != null) {
                    l = Long.valueOf(r0.A00);
                } else {
                    AnonymousClass1Gh r02 = (AnonymousClass1Gh) A002.A00.A00.get("clips_discover_prefetch");
                    if (r02 != null) {
                        l = Long.valueOf(r02.A00);
                    } else {
                        l = null;
                    }
                }
            }
        } else {
            l = 1P1.A00(userSession2).A07("clips_discover_prefetch");
        }
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
        } else {
            j = 0;
        }
        LinkedHashMap A062 = 0Yt.A06(new 0eP[]{new 0eP("response_age_in_ms", String.valueOf(j)), new 0eP("invalidation_count", String.valueOf(r3.A00))});
        0qQ.A0B(A062, 2);
        0kD.A0J("invalidate_prefetch_cache", th, A062, 817893023);
        int i = r3.A01;
        if (i < 1) {
            r3.A01 = i + 1;
            AQ0(this.A01, userSession2, this.A0A, (String) null, false, true);
        }
    }

    public static final boolean A05(C298835u7 r3) {
        if (r3 instanceof C298815u5) {
            C298815u5 r32 = (C298815u5) r3;
            return r32.A00 != ClipsSpecialResponseType.FALLBACK_TO_CLIENT_CACHE && (!r32.Ao1().isEmpty() || !r32.Ao4().isEmpty());
        }
    }

    public final Integer AJJ(UserSession userSession, C324596za r12, C324356z9 r13) {
        C324356z9 r3 = r13;
        0qQ.A0B(r13, 1);
        C270784hI A002 = C270774hH.A00(userSession);
        A002.A01 = null;
        A002.A00 = 0;
        A002.A03.clear();
        if (this.A07 || 182.A06(0Tu.A05, userSession, 36317010800153350L) || this.A06 != null) {
            return AnonymousClass05K.A0C;
        }
        C324596za r4 = r12;
        if (1KU.A0B(userSession)) {
            return r3.A02(r4, "clips_discover_prefetch", 43200, true, false);
        }
        return r3.A01(r4, "clips_discover_prefetch", 43200, true);
    }

    public final boolean ARQ(UserSession userSession) {
        return false;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93Q r14 = AnonymousClass93Q.A00;
        String str2 = this.A06;
        GF2 gf2 = this.A04;
        if (gf2 != null) {
            str = gf2.A01();
        } else {
            str = null;
        }
        String A002 = this.A03.A00();
        String str3 = this.A0A;
        C270694h9 r9 = this.A02;
        C290515fR r8 = this.A00;
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, userSession2, 2342156429420398516L);
        String A003 = AnonymousClass93R.A00(182.A04(r4, userSession2, 36876370160320611L), String.valueOf(182.A06(r4, userSession2, 2342156429420464053L)), String.valueOf(182.A06(r4, userSession2, 2342156429420529590L)), 182.A04(r4, userSession2, 36876370160386148L), A062);
        C54575HJk hJk = this.A08;
        Integer num = this.A09;
        boolean z2 = this.A0C;
        Context context = this.A01;
        String str4 = AnonymousClass93S.A00(userSession2).A01;
        return r14.A07(context, (AnonymousClass9JG) null, r9, userSession2, r8, hJk, num, str2, (String) null, str, A002, str3, A003, str4, this.A05, (String) null, this.A0B, -1.0d, false, false, z2, z, true);
    }

    public final Integer Bec(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (1KU.A03(userSession) && (this.A07 || 182.A06(0Tu.A05, userSession, 36317010800153350L) || this.A06 != null)) {
            return AnonymousClass05K.A0C;
        }
        if (1KU.A0B(userSession)) {
            return 1GZ.A00(userSession).A06("clips_discover_prefetch", 43200, true);
        }
        return 1P1.A00(userSession).A06("clips_discover_prefetch", 43200, true);
    }

    public final 1OC C42(UserSession userSession, String str) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93Q r5 = AnonymousClass93Q.A00;
        String str3 = this.A06;
        GF2 gf2 = this.A04;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        String A002 = this.A03.A00();
        String str4 = this.A0A;
        C270694h9 r8 = this.A02;
        C290515fR r10 = this.A00;
        C54575HJk hJk = this.A08;
        Integer num = this.A09;
        Context context = this.A01;
        String str5 = AnonymousClass93S.A00(userSession2).A01;
        return r5.A07(context, (AnonymousClass9JG) null, r8, userSession2, r10, hJk, num, str3, str, str2, A002, str4, (String) null, str5, this.A05, (String) null, this.A0B, -1.0d, false, false, false, false, false);
    }

    public final 1GP Cmt(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        int i;
        long j;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        List list2 = list;
        0qQ.A0B(list2, 3);
        AnonymousClass93Q r17 = AnonymousClass93Q.A00;
        String str4 = this.A06;
        GF2 gf2 = this.A04;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        String A002 = this.A03.A00();
        String str5 = this.A0A;
        C270694h9 r14 = this.A02;
        C290515fR r13 = this.A00;
        0Tu r3 = 0Tu.A05;
        boolean A062 = 182.A06(r3, userSession2, 2342156429420398516L);
        String A003 = AnonymousClass93R.A00(182.A04(r3, userSession2, 36876370160320611L), String.valueOf(182.A06(r3, userSession2, 2342156429420464053L)), String.valueOf(182.A06(r3, userSession2, 2342156429420529590L)), 182.A04(r3, userSession2, 36876370160386148L), A062);
        C54575HJk hJk = this.A08;
        Integer num = this.A09;
        boolean z4 = this.A0C;
        String str6 = AnonymousClass93S.A00(userSession2).A01;
        String str7 = this.A05;
        if (!182.A06(r3, userSession2, 36325918562268535L)) {
            str3 = null;
        } else {
            List<C52324GNr> list3 = C52166GHi.A00(userSession2).A04;
            str3 = null;
            if (!list3.isEmpty()) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                    A0A2.A0b();
                    for (C52324GNr gNr : list3) {
                        A0A2.A0c();
                        A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, gNr.A02);
                        Integer num2 = gNr.A00;
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            i = 0;
                        }
                        A0A2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                        Long l2 = gNr.A01;
                        if (l2 != null) {
                            j = l2.longValue();
                        } else {
                            j = 0;
                        }
                        A0A2.A0Q("server_ranked_at", j);
                        A0A2.A0Z();
                    }
                    A0A2.A0Y();
                    A0A2.close();
                    str3 = stringWriter.toString();
                } catch (Exception e) {
                    0KC.A0F(AnonymousClass000.A00(4326), "Failed to encode cache items list into json string", e);
                }
            }
        }
        List list4 = list2;
        String str8 = str4;
        return r17.A08(context, r14, userSession2, r13, hJk, num, l, str8, (String) null, str2, A002, str5, A003, str, str6, str7, str3, (String) null, list4, this.A0B, -1.0d, false, false, z4, z, true, z2, z3);
    }

    public final 1GP Cmv(Context context, UserSession userSession, String str, List list, boolean z) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        List list2 = list;
        0qQ.A0B(list2, 3);
        AnonymousClass93Q r7 = AnonymousClass93Q.A00;
        String str3 = this.A06;
        GF2 gf2 = this.A04;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        String A002 = this.A03.A00();
        String str4 = this.A0A;
        C270694h9 r9 = this.A02;
        C290515fR r11 = this.A00;
        C54575HJk hJk = this.A08;
        Integer num = this.A09;
        String str5 = AnonymousClass93S.A00(userSession2).A01;
        return r7.A08(context, r9, userSession2, r11, hJk, num, (Long) null, str3, str, str2, A002, str4, (String) null, (String) null, str5, this.A05, (String) null, (String) null, list2, this.A0B, -1.0d, false, false, false, false, false, z, false);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final void AQ0(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        IgSignalsClipsOpenTabTracker A002 = 2II.A00(userSession2);
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        boolean z3 = z;
        boolean z4 = z2;
        if (A002 == null || A002.A02 == null) {
            A02(context2, userSession2, this, str3, str4, -1.0d, z3, z4);
            return;
        }
        C20711Wxi wxi = new C20711Wxi(this, userSession2, context2, str3, str4, 1, z3, z4);
        OCU ocu = A002.A04;
        if (ocu != null) {
            double d = ocu.A00;
            if ((((Number) A002.A0D.invoke()).longValue() - ocu.A01) / 1000 < 900) {
                wxi.invoke(Double.valueOf(d));
                return;
            }
        }
        C262224Cq r3 = A002.A0E;
        1Eo.A05(19B.A00, new MH0((Object) wxi, (Object) A002, (AnonymousClass4D7) null, 28), r3);
    }

    public final String Beh() {
        return "clips_discover_prefetch";
    }

    public final boolean CTp(boolean z) {
        boolean z2;
        if (this.A05 != null) {
            return false;
        }
        if (z) {
            z2 = this.A0C;
        } else {
            z2 = this.A07;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    public final void Cn2(UserSession userSession, String str) {
        boolean z;
        AnonymousClass5M5 r3 = (AnonymousClass5M5) userSession.A01(AnonymousClass5M5.class, AnonymousClass5M4.A00);
        if (1KU.A0B(userSession)) {
            1Ga A002 = 1GZ.A00(userSession);
            synchronized (A002) {
                z = A002.A01.containsKey("clips_discover_prefetch");
            }
        } else {
            z = 1P1.A00(userSession).A0A("clips_discover_prefetch");
        }
        if (z) {
            r3.A02.add(str);
        } else if (C270774hH.A00(userSession).A03.contains(str)) {
            A03(userSession, r3);
        }
    }

    public static final List A00(C298835u7 r3) {
        List Ao4 = r3.Ao4();
        ArrayList<C267324bN> arrayList = new ArrayList<>();
        for (Object next : Ao4) {
            if (((C267324bN) next).A02 != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C267324bN r0 : arrayList) {
            1Xj r02 = r0.A02;
            if (r02 != null) {
                arrayList2.add(r02);
            }
        }
        return arrayList2;
    }

    public static final List A01(C298835u7 r5) {
        String str;
        List Ao4 = r5.Ao4();
        ArrayList<C267324bN> arrayList = new ArrayList<>();
        for (Object next : Ao4) {
            C267324bN r2 = (C267324bN) next;
            if (r2.A01 == C295365o2.ORGANIC && r2.A02 != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (C267324bN r0 : arrayList) {
            1Xj r02 = r0.A02;
            if (r02 != null) {
                str = r02.getId();
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return 00k.A0X(arrayList2);
    }

    public static final void A04(UserSession userSession, C270734hD r8) {
        Object obj;
        C270784hI A002 = C270774hH.A00(userSession);
        AnonymousClass5M5 r4 = (AnonymousClass5M5) userSession.A01(AnonymousClass5M5.class, AnonymousClass5M4.A00);
        Set set = r4.A02;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            0qQ.A0B(obj, 0);
            if (A002.A03.contains(obj)) {
                break;
            }
        }
        set.clear();
        if (obj != null) {
            r8.A03(userSession, r4);
        }
    }

    public final void AHo(UserSession userSession) {
        C270784hI A002 = C270774hH.A00(userSession);
        A002.A01 = null;
        A002.A00 = 0;
        A002.A03.clear();
        1Gc.A00(userSession).A03("clips_discover_prefetch", true);
        1Gd.A00(1Gc.A00(userSession));
    }

    public final 1Xj B65(UserSession userSession) {
        C270784hI A002 = C270774hH.A00(userSession);
        if (SystemClock.elapsedRealtime() - A002.A00 < TimeUnit.SECONDS.toMillis(AnonymousClass93Q.A00(A002.A02))) {
            return A002.A01;
        }
        return null;
    }

    public final void ESn(Context context) {
        this.A01 = context;
    }

    public final void Elk(C290515fR r1) {
        this.A00 = r1;
    }
}
