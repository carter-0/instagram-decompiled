package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3CP  reason: invalid class name */
public abstract class AnonymousClass3CP implements C233012uo {
    public int A00;
    public int A01;
    public C233072uu A02;
    public Integer A03 = AnonymousClass05K.A00;
    public List A04;
    public AtomicBoolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public long A09;
    public AnonymousClass49H A0A;
    public C233042ur A0B;
    public boolean A0C;
    public final long A0D;
    public final UserSession A0E;
    public final C233172vA A0F;
    public final AnonymousClass3CL A0G;
    public final C233212vI A0H;
    public final C249763kK A0I;
    public final String A0J;
    public final boolean A0K;
    public final int A0L;
    public final Context A0M;
    public final AnonymousClass07i A0N;
    public final 1P0 A0O;
    public final AnonymousClass3BQ A0P;
    public final C270424gi A0Q;
    public final 1PX A0R;
    public final C228232l0 A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;

    public AnonymousClass3CP(Context context, AnonymousClass07i r7, UserSession userSession, C233172vA r9, AnonymousClass3BQ r10, AnonymousClass3CL r11, C270424gi r12, 1PX r13, C233212vI r14, C228232l0 r15, C249763kK r16, String str, boolean z, boolean z2, boolean z3) {
        this.A0G = r11;
        this.A0M = context;
        this.A0J = str;
        this.A0N = r7;
        this.A0E = userSession;
        this.A0I = r16;
        this.A0P = r10;
        this.A0R = r13;
        this.A0H = r14;
        this.A0Q = r12;
        this.A0Y = z3;
        boolean z4 = true;
        this.A06 = true;
        this.A07 = true;
        this.A0B = new C233032uq();
        this.A0O = r11.AM1();
        this.A05 = new AtomicBoolean();
        0Tu r2 = 0Tu.A05;
        this.A0U = 182.A06(r2, userSession, 36310542584185015L);
        if (!182.A06(r2, userSession, 36321718083593882L) && !182.A06(0Tu.A06, userSession, 36321666543920757L)) {
            z4 = false;
        }
        this.A0b = z4;
        this.A0K = 182.A06(r2, userSession, 36321718083528345L);
        this.A0W = 182.A06(r2, userSession, 36321468976276885L);
        this.A0X = 182.A06(r2, userSession, 36326949353699419L);
        this.A0V = 182.A06(r2, userSession, 36321468976932255L);
        this.A0D = 182.A01(r2, userSession, 36602943953703772L);
        r11.EQK(this);
        this.A0c = 182.A06(r2, userSession, 36310542579662981L);
        this.A0L = (int) 182.A01(r2, userSession, 36592017556308086L);
        this.A0Z = 182.A06(r2, userSession, 36310542579925129L);
        this.A0S = r15;
        this.A0a = z;
        this.A0d = 182.A06(r2, userSession, 36310542582612133L);
        this.A0T = z2;
        this.A0F = r9;
    }

    public final C268314dB A01(String str, Collection collection, Collection collection2, UUID uuid, int i, long j, boolean z) {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection collection3 = collection2;
        0qQ.A0B(collection3, 3);
        boolean z2 = z;
        if (!z) {
            C233172vA r2 = this.A0F;
            r2.A03 = false;
            r2.A06 = false;
            r2.A0V = null;
            r2.A0W = null;
            r2.A0C = null;
            r2.A0G = null;
            r2.A0X = null;
            r2.A0Y = null;
            r2.A0E = null;
        }
        UserSession userSession = this.A0E;
        ReelStore A032 = ReelStore.A03(userSession);
        0qQ.A07(A032);
        ArrayList arrayList3 = new ArrayList();
        Collection<AnonymousClass3HX> collection4 = collection;
        arrayList3.addAll(collection4);
        if (this.A0V) {
            for (AnonymousClass3HX r1 : collection4) {
                Reel A0M2 = A032.A0M(r1.A1U);
                if (A0M2 != null) {
                    A0M2.A0k = Long.valueOf(System.currentTimeMillis());
                }
            }
            ArrayList arrayList4 = new ArrayList(0Yv.A1E(collection4, 10));
            for (AnonymousClass3HX r12 : collection4) {
                arrayList4.add(r12.A1U);
            }
            ArrayList<AnonymousClass9JE> arrayList5 = new ArrayList<>();
            for (Object next : collection3) {
                if (!arrayList4.contains(((AnonymousClass9JE) next).A03)) {
                    arrayList5.add(next);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (AnonymousClass9JE r22 : arrayList5) {
                Reel A0M3 = A032.A0M(r22.A03);
                if (A0M3 != null) {
                    AnonymousClass3HX r4 = A0M3.A0N;
                    if (r4 != null) {
                        List list = r4.A1j;
                        List<1Xj> list2 = list;
                        if (list != null) {
                            for (1Xj r6 : list2) {
                                C250513lZ injected = r6.A0C.getInjected();
                                if (injected != null) {
                                    C2592741b r5 = new C2592741b(injected);
                                    r5.A0y = r22.A04;
                                    C239613Hd r13 = (C239613Hd) r22.A00;
                                    r5.A0C = r13;
                                    r5.A0D = r13;
                                    r6.A46(r5.A01());
                                }
                            }
                        }
                        AnonymousClass3HZ r40 = r4.A0I;
                        String str3 = r4.A1O;
                        C239593Hb r14 = r4.A0P;
                        Long l = r4.A1H;
                        AdsIAWRatingInfo adsIAWRatingInfo = r4.A0Y;
                        AdsRatingInfo adsRatingInfo = r4.A0Z;
                        String str4 = r4.A1P;
                        String str5 = r4.A1Q;
                        Boolean bool = r4.A0b;
                        C239633Hj r11 = r4.A0Q;
                        C239653Hl r10 = r4.A00;
                        String str6 = r4.A1R;
                        Boolean bool2 = r4.A0c;
                        Boolean bool3 = r4.A0d;
                        Boolean bool4 = r4.A0e;
                        Integer num = r4.A15;
                        CarouselRenderingType carouselRenderingType = r4.A01;
                        List list3 = r4.A1e;
                        Float f = r4.A13;
                        Boolean bool5 = r4.A0f;
                        Boolean bool6 = r4.A0g;
                        C239673Ho r39 = r4.A0R;
                        List<C250073kr> list4 = r4.A1f;
                        C239693Hq r38 = r4.A0L;
                        Integer num2 = r4.A16;
                        List list5 = r4.A1g;
                        Boolean bool7 = r4.A0h;
                        C239713Hs r37 = r4.A0K;
                        Long l2 = r4.A1I;
                        FanClubStoriesTeaserType fanClubStoriesTeaserType = r4.A02;
                        String str7 = r4.A1S;
                        HallpassDetailsDictImpl hallpassDetailsDictImpl = r4.A03;
                        Boolean bool8 = r4.A0i;
                        Boolean bool9 = r4.A0j;
                        Boolean bool10 = r4.A0k;
                        String str8 = r4.A1T;
                        Boolean bool11 = r4.A0l;
                        Boolean bool12 = r4.A0m;
                        Boolean bool13 = r4.A0n;
                        HighlightReelTypeStr highlightReelTypeStr = r4.A04;
                        List list6 = r4.A1h;
                        String str9 = r4.A1U;
                        C239733Hx r35 = r4.A05;
                        Long l3 = r4.A1J;
                        Boolean bool14 = r4.A0o;
                        IntentAwareAdsInfo intentAwareAdsInfo = r4.A06;
                        List<AnonymousClass3HY> list7 = r4.A1i;
                        String str10 = r4.A1V;
                        AnonymousClass3I1 r33 = r4.A0U;
                        Boolean bool15 = r4.A0p;
                        Boolean bool16 = r4.A0q;
                        Boolean bool17 = r4.A0r;
                        Boolean bool18 = r4.A0s;
                        Boolean bool19 = r4.A0t;
                        Boolean bool20 = r4.A0u;
                        Boolean bool21 = r4.A0v;
                        Boolean bool22 = r4.A0w;
                        Boolean bool23 = r4.A0x;
                        Float f2 = r4.A14;
                        Long l4 = r4.A1K;
                        Long l5 = r4.A1L;
                        Integer num3 = r4.A17;
                        List list8 = r4.A1k;
                        AnonymousClass3I3 r32 = r4.A07;
                        AnonymousClass3I5 r31 = r4.A08;
                        Boolean bool24 = r4.A0y;
                        1Xj r66 = r4.A0H;
                        String str11 = r4.A1W;
                        Integer num4 = r4.A18;
                        AnonymousClass3I7 r30 = r4.A0A;
                        String str12 = r4.A1X;
                        List list9 = r4.A1l;
                        Integer num5 = r4.A19;
                        Long l6 = r4.A1M;
                        Integer num6 = r4.A1B;
                        AnonymousClass3HV r29 = r4.A0M;
                        C239673Ho r28 = r4.A0S;
                        AnonymousClass3I9 r27 = r4.A0B;
                        ReelType reelType = r4.A0N;
                        AnonymousClass3IB r26 = r4.A0J;
                        AnonymousClass3ID r25 = r4.A0W;
                        RingSpecImpl ringSpecImpl = r4.A0C;
                        Integer num7 = r4.A1C;
                        Integer num8 = r4.A1D;
                        AnonymousClass3IH r23 = r4.A0D;
                        Boolean bool25 = r4.A0z;
                        Boolean bool26 = r4.A10;
                        Boolean bool27 = r4.A11;
                        Boolean bool28 = r4.A12;
                        AnonymousClass3IJ r222 = r4.A0V;
                        String str13 = r4.A1Y;
                        AnonymousClass3IL r21 = r4.A0E;
                        String str14 = r4.A1Z;
                        String str15 = r4.A1a;
                        Integer num9 = r4.A1E;
                        Integer num10 = r4.A1F;
                        String str16 = r4.A1b;
                        AnonymousClass3IN r20 = r4.A0O;
                        AnonymousClass3IP r19 = r4.A0F;
                        AnonymousClass3IR r18 = r4.A0G;
                        String str17 = r4.A1c;
                        AnonymousClass3IT r17 = r4.A09;
                        Long l7 = r4.A1N;
                        List list10 = r4.A1m;
                        List list11 = r4.A1n;
                        Integer num11 = r4.A1G;
                        User user = r4.A0a;
                        List list12 = r4.A1o;
                        List list13 = r4.A1d;
                        C233492vo r8 = (C233492vo) r22.A01;
                        Integer num12 = (Integer) r22.A02;
                        C239613Hd r7 = (C239613Hd) r22.A00;
                        1E9 r42 = new 1E9(new 1hu((UserSession) null), 6, false);
                        AnonymousClass3HZ r67 = null;
                        if (r40 != null) {
                            r67 = r40;
                        }
                        C239593Hb r74 = null;
                        if (r14 != null) {
                            r74 = r14;
                        }
                        C239613Hd r78 = null;
                        if (r7 != null) {
                            r78 = r7;
                        }
                        AdsIAWRatingInfo adsIAWRatingInfo2 = null;
                        if (adsIAWRatingInfo != null) {
                            adsIAWRatingInfo2 = adsIAWRatingInfo;
                        }
                        AdsRatingInfo adsRatingInfo2 = null;
                        if (adsRatingInfo != null) {
                            adsRatingInfo2 = adsRatingInfo;
                        }
                        C239633Hj r75 = null;
                        if (r11 != null) {
                            r75 = r11;
                        }
                        C239653Hl r49 = null;
                        if (r10 != null) {
                            r49 = r10;
                        }
                        C233492vo r82 = null;
                        if (r8 != null) {
                            r82 = r8;
                        }
                        C239673Ho r76 = null;
                        if (r39 != null) {
                            r76 = r39;
                        }
                        if (list4 != null) {
                            arrayList = new ArrayList(0Yv.A1E(list4, 10));
                            for (C250073kr F16 : list4) {
                                arrayList.add(F16.F16());
                            }
                        } else {
                            arrayList = null;
                        }
                        C239693Hq r70 = null;
                        if (r38 != null) {
                            r70 = r38;
                        }
                        C239713Hs r69 = null;
                        if (r37 != null) {
                            r69 = r37;
                        }
                        HallpassDetailsDictImpl hallpassDetailsDictImpl2 = null;
                        if (hallpassDetailsDictImpl != null) {
                            hallpassDetailsDictImpl2 = hallpassDetailsDictImpl;
                        }
                        C239733Hx r54 = null;
                        if (r35 != null) {
                            r54 = r35;
                        }
                        IntentAwareAdsInfo intentAwareAdsInfo2 = null;
                        if (intentAwareAdsInfo != null) {
                            intentAwareAdsInfo2 = intentAwareAdsInfo;
                        }
                        if (list7 != null) {
                            arrayList2 = new ArrayList(0Yv.A1E(list7, 10));
                            for (AnonymousClass3HY FEq : list7) {
                                arrayList2.add(FEq.FEq(r42));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        AnonymousClass3I1 r79 = null;
                        if (r33 != null) {
                            r79 = r33;
                        }
                        AnonymousClass3I3 r56 = null;
                        if (r32 != null) {
                            r56 = r32;
                        }
                        AnonymousClass3I5 r57 = null;
                        if (r31 != null) {
                            r57 = r31;
                        }
                        AnonymousClass3I7 r59 = null;
                        if (r30 != null) {
                            r59 = r30;
                        }
                        AnonymousClass3HV r71 = null;
                        if (r29 != null) {
                            r71 = r29;
                        }
                        C239673Ho r77 = null;
                        if (r28 != null) {
                            r77 = r28;
                        }
                        AnonymousClass3I9 r60 = null;
                        if (r27 != null) {
                            r60 = r27;
                        }
                        AnonymousClass3IB r68 = null;
                        if (r26 != null) {
                            r68 = r26;
                        }
                        AnonymousClass3ID r81 = null;
                        if (r25 != null) {
                            r81 = r25;
                        }
                        RingSpecImpl ringSpecImpl2 = null;
                        if (ringSpecImpl != null) {
                            ringSpecImpl2 = ringSpecImpl;
                        }
                        AnonymousClass3IH r62 = null;
                        if (r23 != null) {
                            r62 = r23;
                        }
                        AnonymousClass3IJ r80 = null;
                        if (r222 != null) {
                            r80 = r222;
                        }
                        AnonymousClass3IL r63 = null;
                        if (r21 != null) {
                            r63 = r21;
                        }
                        AnonymousClass3IN r73 = null;
                        if (r20 != null) {
                            r73 = r20;
                        }
                        AnonymousClass3IP r64 = null;
                        if (r19 != null) {
                            r64 = r19;
                        }
                        AnonymousClass3IR r65 = null;
                        if (r18 != null) {
                            r65 = r18;
                        }
                        AnonymousClass3IT r58 = null;
                        if (r17 != null) {
                            r58 = r17;
                        }
                        arrayList6.add(new AnonymousClass3HX(r49, carouselRenderingType, fanClubStoriesTeaserType, hallpassDetailsDictImpl2, highlightReelTypeStr, r54, intentAwareAdsInfo2, r56, r57, r58, r59, r60, ringSpecImpl2, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, reelType, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, adsIAWRatingInfo2, adsRatingInfo2, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, f, f2, num, num2, num3, num4, num5, num12, num6, num7, num8, num9, num10, num11, l, l2, l3, l4, l5, l6, l7, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, list3, arrayList, list5, list6, arrayList2, list2, list8, list9, list10, list11, list12, list13));
                    } else {
                        throw new NullPointerException("Recent response item captured for this Reel is null.");
                    }
                }
            }
            arrayList3.addAll(arrayList6);
        }
        ArrayList A0S2 = A032.A0S(arrayList3);
        01V.A1D(A0S2, new C291215gn(C291205gm.A00));
        ArrayList arrayList7 = new ArrayList(A0S2.size());
        Iterator it = A0S2.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            int i2 = ((int) reel.A04) + this.A01;
            boolean CcK = reel.CcK();
            long currentTimeMillis = System.currentTimeMillis();
            if (uuid != null) {
                str2 = uuid.toString();
            } else {
                str2 = null;
            }
            arrayList7.add(new C250973mM(userSession, reel, str, str2, i2, currentTimeMillis, CcK));
            if (this.A0X) {
                C233472vm r24 = reel.A0b;
                if (r24 != null) {
                    r24.A01 = this.A0Y;
                }
                this.A0F.A05 = Boolean.valueOf(this.A0Y);
            }
        }
        long j2 = j;
        if (!this.A07 ? j > 2600 : j > 1650) {
            this.A0F.A0Q = "bad_network";
        }
        C233072uu r210 = this.A02;
        if (r210 != null) {
            C268314dB Dlz = r210.Dlz(A02(z2), arrayList7);
            this.A0H.Ch2(AnonymousClass4LN.A0D, arrayList7, i, j2, this.A07);
            this.A07 = false;
            return Dlz;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A03(C233632w4 r3, C233042ur r4, C233072uu r5) {
        this.A01 = r3.A02;
        this.A00 = r3.A01;
        this.A02 = r5;
        this.A0B = r4;
        this.A04 = r3.A03;
        this.A05.set(true);
        this.A09 = SystemClock.elapsedRealtime();
        this.A0C = r3.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0182, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0183, code lost:
        X.0wb.A03("ReelApiUtil.createReelsSponsoredContentRequestTask", r0.getMessage());
        r11 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C238523Ce r38, int r39, boolean r40) {
        /*
            r37 = this;
            r6 = 1
            r7 = r37
            X.2vA r3 = r7.A0F
            boolean r0 = r7.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.3CL r0 = r7.A0G
            r35 = r0
            boolean r0 = r35.CaQ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r36 = r40
            r0 = r36
            java.lang.Integer r2 = r7.A02(r0)
            r5 = 0
            r0 = 0
            if (r1 != r2) goto L_0x002a
            r0 = 1
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            r8 = r39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A0F = r0
            java.util.List r0 = r7.A04
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0555
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x051a
            X.3kK r0 = r7.A0I
            java.lang.String r0 = r0.getSessionId()
            if (r0 == 0) goto L_0x051a
            r7.A03 = r1
            r7.A08 = r8
            X.2ur r2 = r7.A0B
            java.util.List r0 = r7.A04
            X.0qQ.A0A(r0)
            r10 = 0
            X.4LN r9 = new X.4LN
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r0
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.DFK(r9)
            X.4gi r10 = r7.A0Q
            if (r10 == 0) goto L_0x00bd
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x00bd
            X.2uu r0 = r7.A02
            if (r0 == 0) goto L_0x00b7
            java.util.Map r0 = r0.Bk0()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x008b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r2.getValue()
            X.4jW r3 = (X.C271744jW) r3
            X.3mM r2 = r10.Bl0(r0)
            boolean r0 = r3.CVX()
            if (r0 != 0) goto L_0x008b
            if (r2 == 0) goto L_0x008b
            int r0 = r10.CMI(r2)
            r3.EZv(r0)
            goto L_0x008b
        L_0x00b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x00bd:
            X.2uu r0 = r7.A02
            if (r0 == 0) goto L_0x0514
            r0.CsF(r8)
            r0 = r36
            X.4LO r3 = r7.A05(r0)
            android.content.Context r9 = r3.A05
            com.instagram.common.session.UserSession r8 = r3.A06
            java.lang.String r0 = r3.A08
            r34 = r0
            java.lang.String r2 = r3.A09
            java.util.Collection r0 = r3.A0A
            r33 = r0
            int r0 = r3.A01
            r32 = r0
            int r0 = r3.A04
            r31 = r0
            boolean r0 = r3.A0H
            r30 = r0
            java.util.Map r0 = r3.A0C
            r29 = r0
            java.util.Map r0 = r3.A0B
            r23 = r0
            boolean r10 = r3.A0K
            int r0 = r3.A03
            r19 = r0
            int r0 = r3.A00
            r18 = r0
            boolean r0 = r3.A0I
            r17 = r0
            int r0 = r3.A02
            r28 = r0
            boolean r12 = r3.A0J
            boolean r0 = r3.A0G
            r22 = r0
            java.util.Map r0 = r3.A0D
            r21 = r0
            boolean r0 = r3.A0E
            r27 = r0
            boolean r0 = r3.A0F
            r26 = r0
            java.lang.Double r0 = r3.A07
            r20 = r0
            boolean r0 = r3.A0L
            r25 = r0
            boolean r0 = r3.A0M
            r24 = r0
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Set r0 = r29.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x012e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r15 = r16.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r3 = r15.getValue()
            X.4jW r3 = (X.C271744jW) r3
            java.lang.Integer r0 = r3.BJb()
            int r11 = r0.intValue()
            r0 = 2
            if (r11 == r0) goto L_0x0156
            r0 = 3
            if (r11 != r0) goto L_0x012e
            java.lang.Object r0 = r15.getKey()
            r14.put(r0, r3)
            goto L_0x012e
        L_0x0156:
            java.lang.Object r0 = r15.getKey()
            r13.put(r0, r3)
            goto L_0x012e
        L_0x015e:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r28)
            java.lang.Class<X.4LT> r11 = X.AnonymousClass4LT.class
            monitor-enter(r11)     // Catch:{ IOException | JSONException -> 0x0182 }
            X.4LU r0 = X.AnonymousClass4LT.A01     // Catch:{ all -> 0x017f }
            X.4LT r3 = r0.A00()     // Catch:{ all -> 0x017f }
            monitor-exit(r11)     // Catch:{ IOException | JSONException -> 0x0182 }
            java.lang.String r0 = "IGCanvasDocumentQuery"
            java.lang.String r11 = r3.clientDocIdForQuery(r0)     // Catch:{ IOException | JSONException -> 0x0182 }
            goto L_0x018d
        L_0x017f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IOException | JSONException -> 0x0182 }
            throw r0     // Catch:{ IOException | JSONException -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r0 = "ReelApiUtil.createReelsSponsoredContentRequestTask"
            X.0wb.A03(r0, r3)
            r11 = 0
        L_0x018d:
            X.1NY r3 = new X.1NY
            r3.<init>(r8)
            r3.A08(r1)
            java.lang.String r0 = "feed/injected_reels_media/"
            r3.A0A(r0)
            java.lang.String r1 = "tray_session_id"
            r0 = r34
            r3.A9m(r1, r0)
            java.lang.String r0 = "viewer_session_id"
            r3.A9m(r0, r2)
            java.lang.String r1 = java.lang.Integer.toString(r32)
            java.lang.String r0 = "entry_point_index"
            r3.A9m(r0, r1)
            java.lang.String r0 = "client_doc_id"
            r3.A0G(r0, r11)
            java.lang.String r1 = java.lang.Integer.toString(r31)
            java.lang.String r0 = "ad_request_index"
            r3.A9m(r0, r1)
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ IOException -> 0x020c }
            r11.<init>()     // Catch:{ IOException -> 0x020c }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x020c }
            X.17W r2 = r0.A0A(r11)     // Catch:{ IOException -> 0x020c }
            r2.A0b()     // Catch:{ IOException -> 0x020c }
            java.util.Collection r0 = r13.values()     // Catch:{ IOException -> 0x020c }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x020c }
        L_0x01d3:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x020c }
            if (r0 == 0) goto L_0x0201
            java.lang.Object r13 = r15.next()     // Catch:{ IOException -> 0x020c }
            X.4jW r13 = (X.C271744jW) r13     // Catch:{ IOException -> 0x020c }
            r2.A0c()     // Catch:{ IOException -> 0x020c }
            java.lang.String r1 = "ad_id"
            java.lang.String r0 = r13.getId()     // Catch:{ IOException -> 0x020c }
            r2.A0R(r1, r0)     // Catch:{ IOException -> 0x020c }
            java.lang.String r1 = "position"
            int r0 = r13.BHd()     // Catch:{ IOException -> 0x020c }
            r2.A0P(r1, r0)     // Catch:{ IOException -> 0x020c }
            java.lang.String r1 = "is_client_inserted_ad"
            boolean r0 = r13.CVX()     // Catch:{ IOException -> 0x020c }
            r2.A0S(r1, r0)     // Catch:{ IOException -> 0x020c }
            r2.A0Z()     // Catch:{ IOException -> 0x020c }
            goto L_0x01d3
        L_0x0201:
            r2.A0Y()     // Catch:{ IOException -> 0x020c }
            r2.close()     // Catch:{ IOException -> 0x020c }
            java.lang.String r1 = r11.toString()     // Catch:{ IOException -> 0x020c }
            goto L_0x0217
        L_0x020c:
            r11 = move-exception
            java.lang.Class<X.1NP> r2 = X.1NP.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Failed to convert a collection to json"
            X.0KC.A07(r2, r0, r11, r1)
            r1 = 0
        L_0x0217:
            java.lang.String r0 = "inserted_ad_indices"
            r3.AA0(r0, r1)
            java.io.StringWriter r13 = new java.io.StringWriter     // Catch:{ IOException -> 0x050c }
            r13.<init>()     // Catch:{ IOException -> 0x050c }
            X.15p r11 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x050c }
            X.17W r2 = r11.A0A(r13)     // Catch:{ IOException -> 0x050c }
            r2.A0b()     // Catch:{ IOException -> 0x050c }
            java.util.Collection r0 = r14.values()     // Catch:{ IOException -> 0x050c }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x050c }
        L_0x0232:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x050c }
            if (r0 == 0) goto L_0x0260
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x050c }
            X.4jW r14 = (X.C271744jW) r14     // Catch:{ IOException -> 0x050c }
            r2.A0c()     // Catch:{ IOException -> 0x050c }
            java.lang.String r1 = "netego_id"
            java.lang.String r0 = r14.getId()     // Catch:{ IOException -> 0x050c }
            r2.A0R(r1, r0)     // Catch:{ IOException -> 0x050c }
            java.lang.String r1 = "position"
            int r0 = r14.BHd()     // Catch:{ IOException -> 0x050c }
            r2.A0P(r1, r0)     // Catch:{ IOException -> 0x050c }
            java.lang.String r1 = "is_client_inserted_netego"
            boolean r0 = r14.CVX()     // Catch:{ IOException -> 0x050c }
            r2.A0S(r1, r0)     // Catch:{ IOException -> 0x050c }
            r2.A0Z()     // Catch:{ IOException -> 0x050c }
            goto L_0x0232
        L_0x0260:
            r2.A0Y()     // Catch:{ IOException -> 0x050c }
            r2.close()     // Catch:{ IOException -> 0x050c }
            java.lang.String r1 = r13.toString()     // Catch:{ IOException -> 0x050c }
            java.lang.String r0 = "inserted_netego_indices"
            r3.AA0(r0, r1)
            java.lang.String r1 = "is_first_page"
            r0 = r30
            r3.A0H(r1, r0)
            java.lang.String r0 = "is_media_based_insertion_enabled"
            r3.A0H(r0, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312526854947996(0x81020d0016049c, double:3.027526429653864E-306)
            boolean r1 = X.182.A06(r2, r8, r0)
            java.lang.String r0 = "is_ad_pod_enabled"
            r3.A0H(r0, r1)
            java.lang.String r0 = "is_prefetch"
            r3.A0H(r0, r12)
            java.lang.String r1 = "is_ads_sensitive"
            r0 = r27
            r3.A0H(r1, r0)
            java.lang.String r1 = "is_carry_over_first_page"
            r0 = r26
            r3.A0H(r1, r0)
            java.lang.String r1 = "is_refresh"
            r0 = r25
            r3.A0H(r1, r0)
            java.lang.Class<X.3mF> r1 = X.C250903mF.class
            java.lang.Class<X.49F> r0 = X.AnonymousClass49F.class
            r3.A0R(r1, r0)
            if (r23 == 0) goto L_0x0313
            java.io.StringWriter r14 = new java.io.StringWriter     // Catch:{ IOException -> 0x0303 }
            r14.<init>()     // Catch:{ IOException -> 0x0303 }
            X.17W r13 = r11.A0A(r14)     // Catch:{ IOException -> 0x0303 }
            r13.A0c()     // Catch:{ IOException -> 0x0303 }
            java.util.Set r0 = r23.entrySet()     // Catch:{ IOException -> 0x0303 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0303 }
        L_0x02c2:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0303 }
            if (r0 == 0) goto L_0x02f8
            java.lang.Object r1 = r15.next()     // Catch:{ IOException -> 0x0303 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0303 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ IOException -> 0x0303 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0303 }
            r13.A0q(r0)     // Catch:{ IOException -> 0x0303 }
            r13.A0b()     // Catch:{ IOException -> 0x0303 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0303 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x0303 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x0303 }
        L_0x02e4:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0303 }
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0303 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0303 }
            r13.A0t(r0)     // Catch:{ IOException -> 0x0303 }
            goto L_0x02e4
        L_0x02f4:
            r13.A0Y()     // Catch:{ IOException -> 0x0303 }
            goto L_0x02c2
        L_0x02f8:
            r13.A0Z()     // Catch:{ IOException -> 0x0303 }
            r13.close()     // Catch:{ IOException -> 0x0303 }
            java.lang.String r1 = r14.toString()     // Catch:{ IOException -> 0x0303 }
            goto L_0x030e
        L_0x0303:
            r14 = move-exception
            java.lang.Class<X.1NP> r13 = X.1NP.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Failed to convert a collection to json"
            X.0KC.A07(r13, r0, r14, r1)
            r1 = 0
        L_0x030e:
            java.lang.String r0 = "cached_ads"
            r3.AA0(r0, r1)
        L_0x0313:
            if (r12 == 0) goto L_0x0353
            if (r20 == 0) goto L_0x0353
            double r0 = r20.doubleValue()
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x0353
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0353
            java.io.StringWriter r13 = new java.io.StringWriter     // Catch:{ IOException -> 0x0343 }
            r13.<init>()     // Catch:{ IOException -> 0x0343 }
            X.17W r12 = r11.A0A(r13)     // Catch:{ IOException -> 0x0343 }
            r12.A0c()     // Catch:{ IOException -> 0x0343 }
            java.lang.String r11 = "story_prefetch_score"
            r12.A0N(r11, r0)     // Catch:{ IOException -> 0x0343 }
            r12.A0Z()     // Catch:{ IOException -> 0x0343 }
            r12.close()     // Catch:{ IOException -> 0x0343 }
            java.lang.String r1 = r13.toString()     // Catch:{ IOException -> 0x0343 }
            goto L_0x034e
        L_0x0343:
            r12 = move-exception
            java.lang.Class<X.1NP> r11 = X.1NP.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Failed to convert a collection to json"
            X.0KC.A07(r11, r0, r12, r1)
            r1 = 0
        L_0x034e:
            java.lang.String r0 = "odml"
            r3.AA0(r0, r1)
        L_0x0353:
            java.lang.String r1 = "tray_user_ids"
            java.lang.String r0 = X.AnonymousClass49G.A01(r33)     // Catch:{ IOException -> 0x035d }
            r3.AA0(r1, r0)     // Catch:{ IOException -> 0x035d }
            goto L_0x0365
        L_0x035d:
            r11 = move-exception
            java.lang.String r1 = "ReelApiUtil"
            java.lang.String r0 = "Failed to convert a collection to json"
            X.0KC.A0G(r1, r0, r11)
        L_0x0365:
            if (r22 == 0) goto L_0x0420
            X.1CE r0 = X.1CE.A04
        L_0x0369:
            r3.A06 = r0
            if (r19 == 0) goto L_0x037a
            int r0 = r19.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "num_items_in_pool"
            r3.A9m(r0, r1)
        L_0x037a:
            if (r18 == 0) goto L_0x0389
            int r0 = r18.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "earliest_request_position"
            r3.A9m(r0, r1)
        L_0x0389:
            if (r17 == 0) goto L_0x0394
            boolean r1 = r17.booleanValue()
            java.lang.String r0 = "is_inventory_based_request_enabled"
            r3.A0H(r0, r1)
        L_0x0394:
            if (r16 == 0) goto L_0x03a3
            int r0 = r16.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "reel_position"
            r3.A9m(r0, r1)
        L_0x03a3:
            if (r10 == 0) goto L_0x0424
            java.lang.String r1 = X.AnonymousClass4LV.A00(r29)
            java.lang.String r0 = "ad_and_netego_request_information"
            r3.AA0(r0, r1)
            X.3Va r1 = X.AnonymousClass4LW.A00(r8)
            java.util.HashMap r11 = new java.util.HashMap
            r0 = r29
            r11.<init>(r0)
            com.instagram.common.session.UserSession r10 = r1.A00
            r0 = 36316860475642555(0x8105fe000212bb, double:3.030267028831193E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0424
            java.util.Collection r0 = r11.values()
            X.0qQ.A07(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x03d1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0424
            java.lang.Object r12 = r13.next()
            X.4jW r12 = (X.C271744jW) r12
            X.4jX r1 = r12.Bz6()
            X.4jX r0 = X.C271754jX.UNDEFINED
            if (r1 != r0) goto L_0x03d1
            X.1Zn r11 = X.1Zm.A00(r10)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            X.1Zp r11 = r11.A01(r1, r0, r5)
            java.lang.Integer r0 = r12.BJb()
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x041a;
                case 2: goto L_0x041c;
                case 3: goto L_0x041e;
                default: goto L_0x03fc;
            }
        L_0x03fc:
            r1 = 0
        L_0x03fd:
            java.lang.String r0 = "item_type"
            r11.A01(r0, r1)
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = "item_id"
            r11.A03(r0, r1)
            X.4jX r0 = r12.Bz6()
            int r1 = r0.A00
            java.lang.String r0 = "current_state"
            r11.A01(r0, r1)
            r11.A00()
            goto L_0x03d1
        L_0x041a:
            r1 = 1
            goto L_0x03fd
        L_0x041c:
            r1 = 2
            goto L_0x03fd
        L_0x041e:
            r1 = 3
            goto L_0x03fd
        L_0x0420:
            X.1CE r0 = X.1CE.A02
            goto L_0x0369
        L_0x0424:
            if (r21 == 0) goto L_0x0468
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0468
            java.util.Set r0 = r21.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x0434:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0450
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.AA0(r1, r0)
            goto L_0x0434
        L_0x0450:
            java.lang.String r0 = r21.toString()
            int r0 = r0.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "X_IG_PERF_QPL_JOIN_ID"
            r3.A0F(r0, r1)
            java.lang.String r1 = "823333654"
            java.lang.String r0 = "X_IG_PERF_QPL_MARKER_ID"
            r3.A0F(r0, r1)
        L_0x0468:
            r0 = 18302148433416678(0x4105b5000011e6, double:1.8937929684134124E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x048a
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r1 = X.1DL.A07(r9, r0)
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.1DL.A07(r9, r0)
            if (r1 == 0) goto L_0x04f7
            if (r0 == 0) goto L_0x04f7
            java.lang.String r1 = "1"
        L_0x0485:
            java.lang.String r0 = "has_camera_permission"
            r3.A9m(r0, r1)
        L_0x048a:
            r0 = 36326949353699419(0x810f2b0000385b, double:3.036647275939005E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x049c
            java.lang.String r1 = "is_self_pog_chaining"
            r0 = r24
            r3.A0H(r1, r0)
        L_0x049c:
            r3.A0V = r6
            r3.A0R = r6
            X.1Cn r0 = new X.1Cn
            r0.<init>(r9)
            X.1G2.A00(r9, r3, r8, r0, r5)
            X.49H r1 = new X.49H
            r1.<init>()
            X.1OC r0 = r3.A0M()
            r1.A00 = r0
            r7.A0A = r1
            X.0qQ.A0A(r1)
            X.1OC r3 = r1.A00
            if (r3 == 0) goto L_0x0506
            X.49H r0 = r7.A0A
            X.0qQ.A0A(r0)
            java.util.UUID r2 = r0.A06
            r8 = r38
            r1 = r35
            r0 = r36
            X.1P0 r0 = r1.AMj(r8, r2, r0)
            r3.A00 = r0
            boolean r0 = r7.A0c
            if (r0 == 0) goto L_0x04e6
            X.49H r0 = r7.A0A
            X.0qQ.A0A(r0)
            X.1OC r2 = r0.A00
            if (r2 == 0) goto L_0x04fa
            r1 = 796(0x31c, float:1.115E-42)
            int r0 = r7.A0L
            X.1ES.A05(r2, r1, r0, r6, r6)
        L_0x04e3:
            r7.A06 = r5
            return
        L_0x04e6:
            android.content.Context r2 = r7.A0M
            X.07i r1 = r7.A0N
            X.49H r0 = r7.A0A
            X.0qQ.A0A(r0)
            X.1OC r0 = r0.A00
            if (r0 == 0) goto L_0x0500
            X.1ES.A00(r2, r1, r0)
            goto L_0x04e3
        L_0x04f7:
            java.lang.String r1 = "0"
            goto L_0x0485
        L_0x04fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0500:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0506:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x050c:
            java.lang.String r1 = "Failed to convert received Netego info to JSON"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0514:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x051a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReelAdsController"
            r1.append(r0)
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x054f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0533
            java.lang.String r0 = "#No reels id"
            r1.append(r0)
        L_0x0533:
            X.3kK r0 = r7.A0I
            java.lang.String r0 = r0.getSessionId()
            if (r0 != 0) goto L_0x0540
            java.lang.String r0 = "#No viewer session id"
            r1.append(r0)
        L_0x0540:
            java.lang.String r1 = r1.toString()
            X.0qQ.A07(r1)
            java.lang.String r0 = r7.A06()
            X.0wb.A03(r1, r0)
            return
        L_0x054f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0555:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CP.A04(X.3Ce, int, boolean):void");
    }

    public boolean A7L(C233632w4 r9, C233042ur r10, C233072uu r11) {
        C56455Hyn hyn;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r9, 2);
        this.A0G.A7K(r9);
        1PX r2 = this.A0R;
        r2.A04 = false;
        r2.A06 = true;
        A03(r9, r10, r11);
        String str = this.A0J;
        0qQ.A0A(str);
        int i = r9.A01;
        C250903mF r3 = new C250903mF();
        r3.A01 = 2;
        r3.A03 = Integer.valueOf(i + 1);
        r3.A05 = str;
        this.A0F.A09 = Integer.valueOf(r9.A02);
        if (this.A0a) {
            hyn = C56455Hyn.A00;
        } else {
            hyn = null;
        }
        if (!r2.A02(this.A0O, hyn, r3)) {
            A07(this.A00, false);
        } else {
            if (!182.A06(0Tu.A05, this.A0E, 36310542578614394L)) {
                this.A03 = AnonymousClass05K.A01;
            }
            this.A06 = false;
            this.A07 = false;
        }
        r10.Dpg(str);
        return true;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r11, C238523Ce r12, boolean z) {
        if (this instanceof AnonymousClass3CO) {
            0qQ.A0B(r11, 0);
            0qQ.A0B(r12, 2);
            Cn8((AnonymousClass9J0) null, r11, r12, (String) null, (String) null, 0.0d, z);
        }
    }

    public /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
        Cn7(r3, r4, z);
    }

    public void DsJ(int i) {
    }

    public final Integer A02(boolean z) {
        if (this instanceof AnonymousClass3CO) {
            return AnonymousClass05K.A01;
        }
        if (z) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.4LO] */
    public AnonymousClass4LO A05(boolean z) {
        String str;
        ? obj = new Object();
        C233072uu r0 = this.A02;
        if (r0 != null) {
            Map Bk0 = r0.Bk0();
            if (z && this.A0b && (!this.A0W || !this.A06)) {
                Map linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : Bk0.entrySet()) {
                    if (((C271744jW) entry.getValue()).Bz6() == C271754jX.SEEN) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Bk0 = linkedHashMap;
            }
            obj.A05 = this.A0M;
            UserSession userSession = this.A0E;
            obj.A06 = userSession;
            obj.A08 = this.A0J;
            obj.A09 = this.A0I.getSessionId();
            obj.A01 = this.A00;
            obj.A04 = this.A08;
            obj.A0K = true;
            obj.A0H = this.A06;
            obj.A0C = Bk0;
            obj.A0G = this.A0Z;
            obj.A0E = this.A0C;
            obj.A0F = this.A0G.CaQ();
            obj.A0D = this.A0S.AUH("feed/injected_reels_media/");
            obj.A0L = z;
            if (this.A0X) {
                obj.A0M = this.A0Y;
            }
            if (this.A0V) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                long j = this.A0D;
                if (j > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(j);
                    ReelStore A032 = ReelStore.A03(userSession);
                    0qQ.A07(A032);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry value : A032.A0D.entrySet()) {
                        Reel reel = (Reel) value.getValue();
                        if (reel.CcK() && reel.A0k.longValue() >= currentTimeMillis) {
                            arrayList.add(reel);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Reel reel2 = (Reel) it.next();
                        0qQ.A0A(reel2);
                        if (!C297785sK.A0U(reel2)) {
                            String id = reel2.getId();
                            List<C255773uh> A0O2 = reel2.A0O(userSession);
                            0qQ.A07(A0O2);
                            ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0O2, 10));
                            for (C255773uh r02 : A0O2) {
                                1Xj r03 = r02.A0b;
                                if (r03 == null || (str = r03.getId()) == null) {
                                    str = "";
                                }
                                arrayList2.add(str);
                            }
                            linkedHashMap2.put(id, arrayList2);
                        }
                    }
                }
                obj.A0B = linkedHashMap2;
            }
            C270424gi r1 = this.A0Q;
            if (this.A0U && r1 != null) {
                List<C250973mM> AZQ = r1.AZQ();
                if (!AZQ.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (C250973mM r04 : AZQ) {
                        arrayList3.add(r04.A0H);
                    }
                    this.A04 = AnonymousClass414.A00(arrayList3, (List) null, 0).A03;
                }
            }
            List list = this.A04;
            if (list != null) {
                obj.A0A = list;
                return obj;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public String A06() {
        StringBuilder sb = new StringBuilder();
        sb.append("mViewerSource:");
        sb.append(this.A0P.A00);
        sb.append(" mViewerSessionId: ");
        sb.append(this.A0I.getSessionId());
        sb.append(" mTraySessionId: ");
        sb.append(this.A0J);
        sb.append(" adRequestIndex:");
        sb.append(this.A08);
        return sb.toString();
    }

    public void A07(int i, boolean z) {
        A04(C238523Ce.A04, i, z);
    }

    public final boolean AFi() {
        return this.A0R.A01();
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final int BWK() {
        return this.A0G.BW4();
    }

    public final int BfG() {
        return this.A0G.BfC();
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final boolean CTb() {
        if (this.A03 != AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final void Cmj(boolean z) {
        C250903mF B6A = this.A0G.B6A();
        if (B6A != null) {
            1PX r1 = this.A0R;
            if (r1.A01()) {
                if (z) {
                    Integer num = AnonymousClass05K.A0C;
                    num.getClass();
                    B6A.A02 = num;
                }
                r1.A00(B6A);
            }
        }
    }

    public final void Cn9(int i) {
        if (this.A03 == AnonymousClass05K.A00) {
            C233172vA r1 = this.A0F;
            r1.A0X = "TAILLOAD";
            r1.A0C = null;
            A07(i, true);
        }
    }

    public void deactivate() {
        boolean z;
        1PX r5 = this.A0R;
        if (r5.A00 == this.A0O) {
            r5.A00 = r5.A09;
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A09;
        if (z && elapsedRealtime > TimeUnit.SECONDS.toMillis(30)) {
            0wb.A03("stories_ads_prefetch", 002.A0r("Detected stories session that awaited external request that hasn't completed. Fetcher was active for ", " millis.  Error message: ", A06(), elapsedRealtime));
        }
        AnonymousClass49H r1 = this.A0A;
        if (r1 != null && !this.A0T) {
            1OC r0 = r1.A00;
            if (r0 != null) {
                r0.cancel();
                this.A0A = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r5.A04 = false;
        r5.A06 = false;
        this.A05.set(false);
    }
}
