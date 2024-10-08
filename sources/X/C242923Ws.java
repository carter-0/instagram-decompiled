package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.CollabFollowButtonInfo;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Ws  reason: invalid class name and case insensitive filesystem */
public final class C242923Ws {
    public static final AtomicBoolean A0E = new AtomicBoolean(false);
    public final UserSession A00;
    public final C242813Wa A01;
    public final 0Pl A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 5));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 6));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 7));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 8));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 9));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 10));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 11));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 12));
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 13));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 14));
    public final boolean A0D;

    public C242923Ws(UserSession userSession, C242813Wa r4, 0Pl r5, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 3);
        this.A00 = userSession;
        this.A0D = z;
        this.A01 = r4;
        this.A02 = r5;
    }

    public static final String A00(1Xj r1) {
        0qQ.A0B(r1, 0);
        String id = r1.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int A02(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        return A03(userSession, r3, r4, r3.A69());
    }

    public final int A03(UserSession userSession, 1Xj r20, AnonymousClass3W1 r21, boolean z) {
        Integer valueOf;
        String str;
        Object[] objArr;
        int i;
        OriginalSoundDataIntf BZB;
        1Xj r2 = r20;
        0qQ.A0B(r2, 1);
        AnonymousClass3W1 r3 = r21;
        0qQ.A0B(r3, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        User A2A = r2.A2A(userSession2);
        int i2 = 0;
        if (A2A == null) {
            0f9 AEf = 0wj.A01.AEf("MediaHeaderInvalidHashCalculation", 817899586);
            AEf.ABQ("media_id", r2.getId());
            AEf.report();
            objArr = new Object[]{r2.getId()};
        } else {
            Integer num = null;
            if (z || r3.A2a) {
                valueOf = Integer.valueOf(A2A.B6o().ordinal());
            } else {
                valueOf = null;
            }
            Boolean valueOf2 = Boolean.valueOf(A2A.A26());
            C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
            if (clipsMetadata == null || (BZB = clipsMetadata.BZB()) == null) {
                str = null;
            } else {
                str = BZB.getOriginalAudioTitle();
            }
            if (!this.A0D) {
                if (A2A.A03.BNG() != null) {
                    i = 2;
                } else {
                    i = 0;
                    if (AnonymousClass3X0.A00.A00(this.A00, r2, r3) != null) {
                        i = 1;
                    }
                }
                num = Integer.valueOf(i);
            }
            Boolean valueOf3 = Boolean.valueOf(r2.A5x());
            AnonymousClass3X1 A1w = r2.A1w();
            List coauthorProducers = r2.A0C.getCoauthorProducers();
            Venue A23 = r2.A23();
            C2605946h A1O = r2.A1O();
            OriginalSoundDataIntf A1J = r2.A1J();
            OpenCarouselSubmissionState BYK = r2.A0C.BYK();
            Integer AoG = r2.A0C.AoG();
            if (AoG != null) {
                i2 = AoG.intValue();
            }
            objArr = new Object[]{valueOf, valueOf2, str, num, valueOf3, A1w, coauthorProducers, A23, A1O, A1J, BYK, Integer.valueOf(i2)};
        }
        return Arrays.hashCode(objArr);
    }

    public final C243513Zb A04(Context context, 1Xj r10, AnonymousClass4DU r11, AnonymousClass3YB r12, AnonymousClass3W1 r13, String str) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(r13, 1);
        AnonymousClass3YB r4 = r12;
        0qQ.A0B(r12, 2);
        Context context2 = context;
        0qQ.A0B(context, 3);
        AnonymousClass4DU r3 = r11;
        0qQ.A0B(r11, 4);
        return A05(context2, r10, r3, r4, r13, str, false);
    }

    public static final boolean A01(1Xj r10, C242923Ws r11, AnonymousClass3YB r12, C243503Za r13) {
        ClipsMashupType clipsMashupType;
        Boolean bool;
        boolean z;
        boolean z2;
        C67161s9 BP1;
        UserSession userSession = r11.A00;
        User A2A = r10.A2A(userSession);
        C67231sQ clipsMetadata = r10.A0C.getClipsMetadata();
        Boolean bool2 = null;
        if (clipsMetadata == null || (BP1 = clipsMetadata.BP1()) == null) {
            clipsMashupType = null;
        } else {
            clipsMashupType = BP1.BP2();
        }
        boolean z3 = false;
        if (clipsMashupType != null) {
            z3 = true;
        }
        if (A2A == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (A2A.B6o() == FollowStatus.A08 || !r12.A09 || r13.A07.A00 || r13.A0O || r10.A5m() || r10.A1t() == AnonymousClass3QO.CLOSE_FRIENDS || ((!r10.CcK() && r10.A5l()) || r10.A0C.AaD() != null)) {
            return false;
        } else {
            if (r10.A4b()) {
                if (!r10.A4b()) {
                    return false;
                }
                CollabFollowButtonInfo AoX = r10.A0C.AoX();
                if (AoX == null || !0qQ.A0K(AoX.CYn(), true)) {
                    List coauthorProducers = r10.A0C.getCoauthorProducers();
                    Boolean bool3 = null;
                    if (coauthorProducers != null) {
                        if (!(coauthorProducers instanceof Collection) || !coauthorProducers.isEmpty()) {
                            Iterator it = coauthorProducers.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                User user = (User) it.next();
                                if (!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), user) && AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A06) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        bool = Boolean.valueOf(z2);
                    } else {
                        bool = null;
                    }
                    List coauthorProducers2 = r10.A0C.getCoauthorProducers();
                    if (coauthorProducers2 != null) {
                        if (!(coauthorProducers2 instanceof Collection) || !coauthorProducers2.isEmpty()) {
                            Iterator it2 = coauthorProducers2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!(!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), it2.next()))) {
                                    z = false;
                                    break;
                                }
                            }
                            bool2 = Boolean.valueOf(z);
                        }
                        z = true;
                        bool2 = Boolean.valueOf(z);
                    }
                    boolean z4 = !0qQ.A0K(r10.A2A(userSession), AnonymousClass0t1.A01.A01(userSession));
                    User CCd = r10.A0C.CCd();
                    if (CCd != null) {
                        boolean z5 = false;
                        if (AnonymousClass2f1.A00(userSession).A0N(CCd) == FollowStatus.A06) {
                            z5 = true;
                        }
                        bool3 = Boolean.valueOf(z5);
                    }
                    if ((0qQ.A0K(bool, true) || 0qQ.A0K(bool3, true)) && 0qQ.A0K(bool2, true) && z4 && 182.A06(0Tu.A05, userSession, 36325987281089983L)) {
                        return true;
                    }
                    return false;
                }
                CollabFollowButtonInfo AoX2 = r10.A0C.AoX();
                if (AoX2 != null) {
                    return 0qQ.A0K(AoX2.BvQ(), true);
                }
                return false;
            } else if (r10.A6R(userSession)) {
                return AnonymousClass3Y8.A04(userSession, r10, (AnonymousClass3W1) null);
            } else {
                if (z3 && AnonymousClass3Y9.A02(userSession, r10)) {
                    return AnonymousClass3Y8.A02(userSession, r10, (AnonymousClass3W1) null);
                }
                if (r10.A6H()) {
                    return AnonymousClass3Y8.A03(userSession, r10, (AnonymousClass3W1) null);
                }
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0288, code lost:
        if (r2 != com.instagram.api.schemas.AdsAPIInstagramPosition.PROFILE_FEED) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        if (r0 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0899, code lost:
        if (X.C231122qu.A0Q(r4, r1) != false) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0986, code lost:
        if (X.182.A06(r24, r4, 36317788188448298L) == false) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ab, code lost:
        if (r11 == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0256, code lost:
        if (X.AnonymousClass3ZJ.A0E(r4, r1) != false) goto L_0x0258;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0811  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0a30  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0a64  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C243513Zb A05(android.content.Context r92, X.1Xj r93, X.AnonymousClass4DU r94, X.AnonymousClass3YB r95, X.AnonymousClass3W1 r96, java.lang.String r97, boolean r98) {
        /*
            r91 = this;
            r5 = 0
            r1 = r93
            X.0qQ.A0B(r1, r5)
            r8 = 1
            r52 = r96
            r0 = r52
            X.0qQ.A0B(r0, r8)
            r7 = 2
            r22 = 3
            r21 = 4
            r3 = r91
            com.instagram.common.session.UserSession r4 = r3.A00
            com.instagram.user.model.User r17 = r1.A2A(r4)
            if (r17 != 0) goto L_0x0037
            X.0wj r3 = X.0wj.A01
            r2 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r0 = "MediaHeaderInvalidUiState"
            X.0f9 r2 = r3.AEf(r0, r2)
            java.lang.String r1 = r1.getId()
            java.lang.String r0 = "media_id"
            r2.ABQ(r0, r1)
            r2.report()
            X.3Zm r38 = X.AnonymousClass3Zm.A00
            return r38
        L_0x0037:
            boolean r0 = r1.CcK()
            r18 = 0
            r12 = r92
            if (r0 == 0) goto L_0x006c
            X.Gmc r0 = r1.A0A
            if (r0 != 0) goto L_0x006c
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x07d5
            boolean r0 = r0.A2Q()
            if (r0 != r8) goto L_0x07d5
            r0 = r52
            int r0 = r0.A03
            boolean r0 = X.AnonymousClass6L4.A01(r12, r4, r1, r0)
            if (r0 == 0) goto L_0x006c
            X.0Tu r0 = X.0Tu.A05
            r9 = 36318849045961218(0x8107cd00091a02, double:3.031524608708045E-306)
            boolean r0 = X.182.A06(r0, r4, r9)
        L_0x0068:
            if (r0 != 0) goto L_0x006c
            r18 = 1
        L_0x006c:
            r0 = r52
            X.1sy r0 = r0.A0o
            boolean r16 = X.1sx.A0O(r1, r0)
            X.0eM r13 = r3.A03
            java.lang.Object r9 = r13.getValue()
            X.3YE r9 = (X.AnonymousClass3YE) r9
            boolean r29 = r1.A4j()
            com.instagram.common.session.UserSession r6 = r9.A00
            com.instagram.user.model.User r28 = r1.A2A(r6)
            if (r28 == 0) goto L_0x0a78
            boolean r30 = r1.A5D()
            boolean r0 = r1.A4b()
            if (r0 == 0) goto L_0x07d1
            X.0eM r0 = r9.A02
            java.lang.Object r2 = r0.getValue()
            X.4i0 r2 = (X.C271164i0) r2
            r0 = r52
            X.9bp r27 = r2.A00(r6, r1, r0)
        L_0x00a0:
            X.0eM r0 = r9.A03
            java.lang.Object r6 = r0.getValue()
            X.3Z1 r6 = (X.AnonymousClass3Z1) r6
            r2 = r18
            r0 = r52
            X.9J2 r26 = r6.A00(r1, r0, r2)
            X.9If r25 = new X.9If
            r25.<init>((X.AnonymousClass9J2) r26, (X.C381479bp) r27, (com.instagram.user.model.User) r28, (boolean) r29, (boolean) r30)
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.3Z8 r0 = (X.AnonymousClass3Z8) r0
            X.9IZ r42 = r0.A00(r1)
            X.0eM r0 = r3.A08
            r0.getValue()
            com.instagram.user.model.User r6 = r1.A2A(r4)
            if (r6 == 0) goto L_0x0a70
            X.0Tu r0 = X.0Tu.A06
            r9 = 36313888359123220(0x81034a000f0914, double:3.028387450376613E-306)
            boolean r0 = X.182.A06(r0, r4, r9)
            if (r0 == 0) goto L_0x00e8
            r0 = r52
            X.1sy r2 = r0.A0o
            X.1sy r0 = X.1sy.A0H
            if (r2 != r0) goto L_0x00e8
            boolean r0 = r6.A26()
            r6 = 1
            if (r0 != 0) goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            X.9IP r19 = new X.9IP
            r2 = r21
            r0 = r19
            r0.<init>((X.1Xj) r1, (int) r2, (boolean) r6)
            X.0Tu r24 = X.0Tu.A05
            r9 = 36319029434063670(0x8107f700011b36, double:3.0316386868704005E-306)
            r0 = r24
            boolean r0 = X.182.A06(r0, r4, r9)
            if (r0 == 0) goto L_0x07c4
            X.1Xy r0 = r1.A0C
            java.lang.Boolean r2 = r0.C2M()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x07c4
            X.3QO r2 = r1.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r2 == r0) goto L_0x07c4
            boolean r0 = r1.A5p()
            if (r0 != 0) goto L_0x07b7
            boolean r0 = r1.A56()
            if (r0 != 0) goto L_0x07b7
            boolean r0 = r1.A5v()
            if (r0 != 0) goto L_0x07b7
            boolean r0 = r1.A6A()
            if (r0 == 0) goto L_0x07c4
            r37 = 13
            X.Jvg r20 = new X.Jvg
            r2 = r20
            r0 = r37
            r2.<init>((boolean) r8, (boolean) r8, (int) r0)
        L_0x013c:
            com.instagram.user.model.User r2 = r1.A2A(r4)
            r6 = 0
            if (r2 == 0) goto L_0x07aa
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x07aa
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r2)
            boolean r0 = X.2R8.A05(r4, r0)
            if (r0 != 0) goto L_0x07aa
            boolean r0 = r2.A29()
            if (r0 == 0) goto L_0x016d
            boolean r0 = r2.A2A()
            if (r0 == 0) goto L_0x016d
            r9 = 36325282906387266(0x810da700003342, double:3.0355934079485545E-306)
            r0 = r24
            boolean r0 = X.182.A06(r0, r4, r9)
            if (r0 == 0) goto L_0x016d
            r6 = 1
        L_0x016d:
            r38 = 12
            X.JTb r23 = new X.JTb
            r2 = r23
            r0 = r38
            r2.<init>(r6, r0)
        L_0x0178:
            X.0eM r0 = r3.A09
            r0.getValue()
            X.Gmc r0 = r1.A0A
            r6 = 0
            if (r0 == 0) goto L_0x0183
            r6 = 1
        L_0x0183:
            r2 = 5
            X.9IP r26 = new X.9IP
            r0 = r26
            r0.<init>((X.1Xj) r1, (int) r2, (boolean) r6)
            boolean r0 = r1.CcK()
            r35 = 0
            r14 = r94
            if (r0 != 0) goto L_0x01f9
            X.1Xy r0 = r1.A0C
            com.instagram.model.hashtag.Hashtag r29 = r0.B6n()
            if (r29 == 0) goto L_0x01f9
            X.1Xy r0 = r1.A0C
            com.instagram.model.venue.LocationDictIntf r0 = r0.BNh()
            if (r0 == 0) goto L_0x07a7
            java.lang.String r11 = r0.getName()
            r32 = 1
            if (r11 != 0) goto L_0x01af
        L_0x01ad:
            r32 = 0
        L_0x01af:
            boolean r0 = r1.A5l()
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x078a
            java.util.List r0 = r1.A3Q()
            java.util.ArrayList r2 = X.00k.A0U(r0)
            X.1Xy r0 = r1.A0C
            java.util.List r0 = r0.getCoauthorProducers()
            if (r0 == 0) goto L_0x01ca
            r2.removeAll(r0)
        L_0x01ca:
            boolean r0 = r1.A5l()
            X.BIU r9 = new X.BIU
            r9.<init>(r2, r0)
        L_0x01d3:
            X.DQT r9 = (X.DQT) r9
        L_0x01d5:
            X.3ZT r0 = new X.3ZT
            r0.<init>(r1)
            com.instagram.user.model.User r2 = r1.A2A(r4)
            if (r2 == 0) goto L_0x0a64
            java.lang.String r31 = r2.getUsername()
            X.33q r6 = X.C2364033p.A02
            X.33p r2 = r6.A00(r4, r14)
            boolean r33 = r2.A01(r1)
            X.9cQ r35 = new X.9cQ
            r27 = r35
            r28 = r9
            r30 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33)
        L_0x01f9:
            boolean r2 = r1.A55()
            boolean r0 = r1.CcK()
            boolean r0 = X.AnonymousClass3ZC.A0T(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x0654
            X.0eM r0 = r3.A04
            r0.getValue()
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0650
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
        L_0x021b:
            X.N4R r2 = new X.N4R
            r2.<init>((X.1Xj) r1, (java.util.List) r0)
            X.0eM r0 = r3.A07
            r0.getValue()
            com.instagram.user.model.User r0 = r1.A2A(r4)
            X.9Iy r0 = X.AnonymousClass4i1.A00(r1, r0)
            X.9IU r9 = new X.9IU
            r9.<init>(r8, r2, r0)
        L_0x0232:
            X.3ZE r9 = (X.AnonymousClass3ZE) r9
            r0 = r25
            java.lang.Object r0 = r0.A01
            r40 = r0
            r0 = r40
            X.9bp r0 = (X.C381479bp) r0
            r40 = r0
            X.3ZH r48 = r1.A1Y()
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 != 0) goto L_0x0258
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r4, r1)
            if (r0 != 0) goto L_0x0258
            boolean r0 = X.AnonymousClass3ZJ.A0E(r4, r1)
            r58 = 0
            if (r0 == 0) goto L_0x025a
        L_0x0258:
            r58 = 1
        L_0x025a:
            X.3X0 r2 = X.AnonymousClass3X0.A00
            r0 = r52
            com.instagram.model.reels.Reel r53 = r2.A00(r4, r1, r0)
            java.util.ArrayList r0 = r1.A3B()
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r0 = r0.A0B
            r39 = r0
        L_0x0272:
            boolean r59 = X.AnonymousClass3ZN.A03(r4, r1, r8)
            X.Gmc r0 = r1.A0A
            r2 = 0
            if (r0 == 0) goto L_0x027c
            r2 = 1
        L_0x027c:
            r56 = 0
            if (r2 == 0) goto L_0x028a
            if (r0 == 0) goto L_0x0648
            com.instagram.api.schemas.AdsAPIInstagramPosition r2 = r0.A00
        L_0x0284:
            com.instagram.api.schemas.AdsAPIInstagramPosition r0 = com.instagram.api.schemas.AdsAPIInstagramPosition.PROFILE_FEED
            r60 = 1
            if (r2 == r0) goto L_0x028c
        L_0x028a:
            r60 = 0
        L_0x028c:
            X.0eM r0 = r3.A0C
            java.lang.Object r11 = r0.getValue()
            X.3ZP r11 = (X.AnonymousClass3ZP) r11
            r49 = r95
            r0 = r49
            boolean r0 = r0.A07
            r90 = r0
            com.instagram.common.session.UserSession r2 = r11.A00
            if (r35 == 0) goto L_0x038c
            r0 = r35
            java.lang.Object r0 = r0.A02
            boolean r6 = r0 instanceof X.BIU
            if (r6 == 0) goto L_0x0380
            X.3py r10 = X.C252953py.ORGANIC_BRANDED_CONTENT
        L_0x02aa:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.HASHTAG_USER
        L_0x02ae:
            r0[r5] = r6
        L_0x02b0:
            r0[r8] = r10
        L_0x02b2:
            java.util.ArrayList r0 = X.0sr.A1M(r0)
        L_0x02b6:
            boolean r6 = r1.A6Y(r2)
            if (r6 == 0) goto L_0x02c7
            X.3py r6 = X.C252953py.GEN_AI_ATTRIBUTION
            boolean r10 = r0.contains(r6)
            if (r10 != 0) goto L_0x02c7
            r0.add(r6)
        L_0x02c7:
            boolean r6 = r1.A6H()
            if (r6 == 0) goto L_0x02d8
            java.lang.String r6 = X.C55010Hah.A00(r12, r2, r1)
            if (r6 == 0) goto L_0x02d8
            X.3py r6 = X.C252953py.OPEN_CAROUSEL_SUBTITLE
            r0.add(r6)
        L_0x02d8:
            boolean r6 = X.AnonymousClass3ZI.A05(r2, r1)
            if (r6 == 0) goto L_0x02e9
            X.3py r6 = X.C252953py.ORIGINALITY_INFO_LABEL
            boolean r10 = r0.contains(r6)
            if (r10 != 0) goto L_0x02e9
            r0.add(r6)
        L_0x02e9:
            java.util.ArrayList r6 = X.00k.A0U(r0)
            boolean r0 = r1.A5b()
            if (r0 != 0) goto L_0x0301
            X.1Xy r0 = r1.A0C
            java.lang.Boolean r0 = r0.CTL()
            if (r0 == 0) goto L_0x035d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x035d
        L_0x0301:
            int r10 = r6.size()
            X.3py r0 = X.C252953py.INTERNAL_ONLY
        L_0x0307:
            if (r10 > r8) goto L_0x0359
            r6.add(r0)
        L_0x030c:
            java.lang.String r0 = r1.A2h()
            if (r0 != 0) goto L_0x0318
            java.lang.String r0 = r1.A2f()
            if (r0 == 0) goto L_0x0329
        L_0x0318:
            X.33q r10 = X.C2364033p.A02
            X.33p r0 = r10.A00(r2, r14)
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0329
            X.3py r0 = X.C252953py.MEDIA_TOPIC
            r6.add(r5, r0)
        L_0x0329:
            if (r16 != 0) goto L_0x033e
            X.33q r10 = X.C2364033p.A02
            X.33p r0 = r10.A00(r2, r14)
            java.lang.Integer r10 = r0.A00(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r10 != r0) goto L_0x033e
            X.3py r0 = X.C252953py.TIMESTAMP
            r6.add(r5, r0)
        L_0x033e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r10 = r6.iterator()
        L_0x0347:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x07e7
            java.lang.Object r0 = r10.next()
            X.3py r6 = X.C252953py.HIDDEN
            if (r0 == r6) goto L_0x0347
            r13.add(r0)
            goto L_0x0347
        L_0x0359:
            r6.add(r8, r0)
            goto L_0x030c
        L_0x035d:
            X.3QO r10 = r1.A1t()
            X.3QO r0 = X.AnonymousClass3QO.FOLLOWERS_ONLY
            if (r10 != r0) goto L_0x030c
            java.lang.String r10 = r2.A06
            com.instagram.user.model.User r0 = r1.A2A(r2)
            if (r0 == 0) goto L_0x037e
            java.lang.String r0 = r0.getId()
        L_0x0371:
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x030c
            int r10 = r6.size()
            X.3py r0 = X.C252953py.FOLLOWER_ONLY_AUDIENCE_CONTROL
            goto L_0x0307
        L_0x037e:
            r0 = 0
            goto L_0x0371
        L_0x0380:
            boolean r0 = r0 instanceof X.BIV
            if (r0 == 0) goto L_0x0388
            X.3py r10 = X.C252953py.LOCATION
            goto L_0x02aa
        L_0x0388:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x02aa
        L_0x038c:
            if (r16 == 0) goto L_0x03cb
            boolean r0 = r1.A6Y(r2)
            if (r0 == 0) goto L_0x039e
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.SPONSORED
            r0[r5] = r6
            X.3py r10 = X.C252953py.GEN_AI_ATTRIBUTION
            goto L_0x02b0
        L_0x039e:
            r1.CEL()
            X.3WR r0 = r1.CEL()
            boolean r0 = X.AnonymousClass3WS.A0B(r2, r0)
            if (r0 != 0) goto L_0x03c1
            boolean r0 = X.AnonymousClass3WS.A09(r2, r1)
            if (r0 != 0) goto L_0x03c1
            boolean r0 = r1.A6N()
            if (r0 == 0) goto L_0x0640
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.SPONSORED
            r0[r5] = r6
            X.3py r10 = X.C252953py.RAY_BAN_STORIES
            goto L_0x02b0
        L_0x03c1:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.SPONSORED
            r0[r5] = r6
            X.3py r10 = X.C252953py.CLIPS_AUDIO_TRANSLATION_ATTRIBUTION
            goto L_0x02b0
        L_0x03cb:
            r1.CEL()
            X.3WR r0 = r1.CEL()
            boolean r0 = X.AnonymousClass3WS.A0B(r2, r0)
            if (r0 != 0) goto L_0x063b
            boolean r0 = X.AnonymousClass3WS.A09(r2, r1)
            if (r0 != 0) goto L_0x063b
            boolean r0 = r1.A6J()
            if (r0 == 0) goto L_0x0408
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0408
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x03fc
            X.3py r10 = X.C252953py.LOCATION
        L_0x03f6:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.BARCELONA_ATTRIBUTION
            goto L_0x02ae
        L_0x03fc:
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r0 == 0) goto L_0x0405
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
            goto L_0x03f6
        L_0x0405:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x03f6
        L_0x0408:
            boolean r6 = r1.A4j()
            boolean r0 = X.AnonymousClass3ZJ.A0E(r2, r1)
            if (r6 == 0) goto L_0x044c
            if (r0 == 0) goto L_0x041c
            X.3py r10 = X.C252953py.MUSIC_ATTRIBUTION
        L_0x0416:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.GROUP_PROFILE_ATTRIBUTION
            goto L_0x02ae
        L_0x041c:
            boolean r0 = r1.A6Y(r2)
            if (r0 == 0) goto L_0x0425
            X.3py r10 = X.C252953py.GEN_AI_ATTRIBUTION
            goto L_0x0416
        L_0x0425:
            boolean r0 = r1.A6N()
            if (r0 == 0) goto L_0x042e
            X.3py r10 = X.C252953py.RAY_BAN_STORIES
            goto L_0x0416
        L_0x042e:
            boolean r0 = r1.A6d(r2)
            if (r0 == 0) goto L_0x0437
            X.3py r10 = X.C252953py.WORLD_PAGES
            goto L_0x0416
        L_0x0437:
            boolean r0 = r1.A6Z(r2)
            if (r0 == 0) goto L_0x0440
            X.3py r10 = X.C252953py.HORIZON_WORLDS
            goto L_0x0416
        L_0x0440:
            boolean r0 = r1.A6c(r2)
            if (r0 == 0) goto L_0x0449
            X.3py r10 = X.C252953py.META_QUEST
            goto L_0x0416
        L_0x0449:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x0416
        L_0x044c:
            if (r0 == 0) goto L_0x04fe
            com.instagram.user.model.User r0 = r1.A2A(r2)
            if (r0 == 0) goto L_0x0a38
            boolean r0 = X.AnonymousClass3ZQ.A03(r0)
            if (r0 == 0) goto L_0x0464
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.AUTHENTICITY_TAG
            r0[r5] = r6
            X.3py r10 = X.C252953py.MUSIC_ATTRIBUTION
            goto L_0x02b0
        L_0x0464:
            boolean r0 = r1.A6d(r2)
            if (r0 == 0) goto L_0x0474
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.WORLD_PAGES
            goto L_0x02b0
        L_0x0474:
            boolean r0 = r1.A6Z(r2)
            if (r0 == 0) goto L_0x0484
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.HORIZON_WORLDS
            goto L_0x02b0
        L_0x0484:
            boolean r0 = r1.A6c(r2)
            if (r0 == 0) goto L_0x0494
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.META_QUEST
            goto L_0x02b0
        L_0x0494:
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x04ae
            boolean r0 = r1.A5b()
            if (r0 != 0) goto L_0x04ae
            X.1Xy r0 = r1.A0C
            java.lang.Boolean r0 = r0.CTL()
            if (r0 == 0) goto L_0x04f4
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04f4
        L_0x04ae:
            boolean r0 = r1.A6Y(r2)
            if (r0 == 0) goto L_0x04be
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.GEN_AI_ATTRIBUTION
            goto L_0x02b0
        L_0x04be:
            boolean r0 = r1.A6a(r2)
            if (r0 == 0) goto L_0x04ce
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.ICONIC_ENTRYPOINTS
            goto L_0x02b0
        L_0x04ce:
            boolean r0 = r1.A6N()
            if (r0 == 0) goto L_0x04de
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.RAY_BAN_STORIES
            goto L_0x02b0
        L_0x04de:
            boolean r0 = X.AnonymousClass3ZI.A05(r2, r1)
            if (r0 == 0) goto L_0x04ee
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            r0[r5] = r6
            X.3py r10 = X.C252953py.ORIGINALITY_INFO_LABEL
            goto L_0x02b0
        L_0x04ee:
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.MUSIC_ATTRIBUTION
            goto L_0x0644
        L_0x04f4:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.LOCATION
            r0[r5] = r6
            X.3py r10 = X.C252953py.MUSIC_ATTRIBUTION
            goto L_0x02b0
        L_0x04fe:
            boolean r0 = r1.A6Y(r2)
            if (r0 == 0) goto L_0x0539
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r0 == 0) goto L_0x0512
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
        L_0x050c:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.GEN_AI_ATTRIBUTION
            goto L_0x02ae
        L_0x0512:
            boolean r0 = r1.A6d(r2)
            if (r0 == 0) goto L_0x051b
            X.3py r10 = X.C252953py.WORLD_PAGES
            goto L_0x050c
        L_0x051b:
            boolean r0 = r1.A6d(r2)
            if (r0 == 0) goto L_0x0524
            X.3py r10 = X.C252953py.HORIZON_WORLDS
            goto L_0x050c
        L_0x0524:
            boolean r0 = r1.A6c(r2)
            if (r0 == 0) goto L_0x052d
            X.3py r10 = X.C252953py.META_QUEST
            goto L_0x050c
        L_0x052d:
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x0536
            X.3py r10 = X.C252953py.LOCATION
            goto L_0x050c
        L_0x0536:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x050c
        L_0x0539:
            boolean r0 = r1.A6d(r2)
            if (r0 == 0) goto L_0x0545
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.WORLD_PAGES
            goto L_0x0644
        L_0x0545:
            boolean r0 = r1.A6Z(r2)
            if (r0 == 0) goto L_0x0551
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.HORIZON_WORLDS
            goto L_0x0644
        L_0x0551:
            boolean r0 = r1.A6c(r2)
            if (r0 == 0) goto L_0x055d
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.META_QUEST
            goto L_0x0644
        L_0x055d:
            boolean r0 = r1.A6a(r2)
            if (r0 == 0) goto L_0x0569
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.ICONIC_ENTRYPOINTS
            goto L_0x0644
        L_0x0569:
            boolean r0 = r1.A6N()
            if (r0 == 0) goto L_0x0589
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r0 == 0) goto L_0x057d
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
        L_0x0577:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.RAY_BAN_STORIES
            goto L_0x02ae
        L_0x057d:
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x0586
            X.3py r10 = X.C252953py.LOCATION
            goto L_0x0577
        L_0x0586:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x0577
        L_0x0589:
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x05af
            boolean r0 = r1.A5l()
            if (r0 == 0) goto L_0x05af
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x05a3
            X.3py r10 = X.C252953py.LOCATION
        L_0x059d:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.ORGANIC_BRANDED_CONTENT
            goto L_0x02ae
        L_0x05a3:
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r0 == 0) goto L_0x05ac
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
            goto L_0x059d
        L_0x05ac:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x059d
        L_0x05af:
            X.1Xy r0 = r1.A0C
            X.3ZV r0 = r0.AaD()
            if (r0 == 0) goto L_0x05bd
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.AFFILIATE_TAG
            goto L_0x0644
        L_0x05bd:
            X.1s9 r0 = r1.A1N()
            if (r0 == 0) goto L_0x05da
            X.4bJ r0 = r0.BZ6()
            if (r0 == 0) goto L_0x05da
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r0 == 0) goto L_0x05d7
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
        L_0x05d1:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.REMIX_TAG
            goto L_0x02ae
        L_0x05d7:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x05d1
        L_0x05da:
            boolean r6 = X.AnonymousClass3ZI.A05(r2, r1)
            boolean r0 = X.AnonymousClass3ZI.A04(r12, r2, r1)
            if (r6 == 0) goto L_0x0609
            if (r0 == 0) goto L_0x05ee
            X.3py r10 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
        L_0x05e8:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.ORIGINALITY_INFO_LABEL
            goto L_0x02ae
        L_0x05ee:
            com.instagram.user.model.User r0 = r1.A2A(r2)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = X.AnonymousClass3ZQ.A03(r0)
            if (r0 == 0) goto L_0x05fd
            X.3py r10 = X.C252953py.AUTHENTICITY_TAG
            goto L_0x05e8
        L_0x05fd:
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r0 == 0) goto L_0x0606
            X.3py r10 = X.C252953py.LOCATION
            goto L_0x05e8
        L_0x0606:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x05e8
        L_0x0609:
            if (r0 == 0) goto L_0x0610
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.CLIPS_AUDIO_ATTRIBUTION
            goto L_0x0644
        L_0x0610:
            com.instagram.user.model.User r0 = r1.A2A(r2)
            if (r0 == 0) goto L_0x0a48
            boolean r6 = X.AnonymousClass3ZQ.A03(r0)
            boolean r0 = X.AnonymousClass3ZI.A06(r1)
            if (r6 == 0) goto L_0x062d
            if (r0 == 0) goto L_0x062a
            X.3py r10 = X.C252953py.LOCATION
        L_0x0624:
            X.3py[] r0 = new X.C252953py[r7]
            X.3py r6 = X.C252953py.AUTHENTICITY_TAG
            goto L_0x02ae
        L_0x062a:
            X.3py r10 = X.C252953py.HIDDEN
            goto L_0x0624
        L_0x062d:
            if (r0 == 0) goto L_0x0634
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.LOCATION
            goto L_0x0644
        L_0x0634:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x02b6
        L_0x063b:
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.CLIPS_AUDIO_TRANSLATION_ATTRIBUTION
            goto L_0x0644
        L_0x0640:
            X.3py[] r0 = new X.C252953py[r8]
            X.3py r6 = X.C252953py.SPONSORED
        L_0x0644:
            r0[r5] = r6
            goto L_0x02b2
        L_0x0648:
            r2 = r56
            goto L_0x0284
        L_0x064c:
            r39 = 0
            goto L_0x0272
        L_0x0650:
            X.0sn r0 = X.0sn.A00
            goto L_0x021b
        L_0x0654:
            boolean r0 = r1.A4b()
            if (r0 == 0) goto L_0x0682
            com.instagram.user.model.User r6 = r1.A2A(r4)
            java.lang.Object r0 = r13.getValue()
            X.3YE r0 = (X.AnonymousClass3YE) r0
            X.0eM r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.4i0 r2 = (X.C271164i0) r2
            r0 = r52
            X.9bp r2 = r2.A00(r4, r1, r0)
            X.0eM r0 = r3.A07
            r0.getValue()
            X.9Iy r0 = X.AnonymousClass4i1.A00(r1, r6)
            X.9IU r9 = new X.9IU
            r9.<init>(r7, r2, r0)
            goto L_0x0232
        L_0x0682:
            boolean r0 = X.C231122qu.A0P(r4, r1)
            if (r0 == 0) goto L_0x06c5
            com.instagram.user.model.User r6 = r1.A2A(r4)
            X.0eM r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            X.HmP r0 = (X.C55728HmP) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            com.instagram.user.model.User r30 = r1.A2A(r0)
            if (r30 == 0) goto L_0x0a50
            boolean r32 = r1.A5D()
            boolean r0 = X.C231122qu.A0Q(r0, r1)
            r31 = 2
            if (r0 == 0) goto L_0x06aa
            r31 = 1
        L_0x06aa:
            X.GlT r2 = new X.GlT
            r27 = r2
            r28 = r1
            r29 = r52
            r27.<init>(r28, r29, r30, r31, r32)
            X.0eM r0 = r3.A07
            r0.getValue()
            X.9Iy r0 = X.AnonymousClass4i1.A00(r1, r6)
            X.9IU r9 = new X.9IU
            r9.<init>(r5, r0, r2)
            goto L_0x0232
        L_0x06c5:
            boolean r6 = r1.A6V(r4)
            java.lang.String r2 = "Required value was null."
            r0 = 0
            if (r6 != 0) goto L_0x070c
            X.1Xy r6 = r1.A0C
            java.util.List r6 = r6.Aay()
            if (r6 == 0) goto L_0x06dc
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x070c
        L_0x06dc:
            boolean r6 = r1.A5m()
            if (r6 == 0) goto L_0x076d
            r9 = 2342163288483700893(0x2081091a0008209d, double:4.065822677513458E-152)
            r6 = r24
            boolean r6 = X.182.A06(r6, r4, r9)
            if (r6 == 0) goto L_0x076d
            X.I5b r27 = X.C56623I5b.A00
            X.3Wa r6 = r3.A01
            r28 = r12
            r29 = r4
            r30 = r1
            r31 = r6
            r32 = r52
            r33 = r18
            X.Jw5 r6 = r27.A02(r28, r29, r30, r31, r32, r33)
            if (r6 == 0) goto L_0x0a58
            X.3a7 r9 = new X.3a7
            r9.<init>(r0, r0, r6)
            goto L_0x0232
        L_0x070c:
            boolean r6 = r1.A5m()
            if (r6 != 0) goto L_0x06dc
            r9 = 36320279269679256(0x81091a00032098, double:3.032429087946381E-306)
            r6 = r24
            boolean r6 = X.182.A06(r6, r4, r9)
            if (r6 == 0) goto L_0x06dc
            com.instagram.user.model.User r9 = r1.A2A(r4)
            X.1Xy r6 = r1.A0C
            java.util.List r6 = r6.Aay()
            if (r6 == 0) goto L_0x0731
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0747
        L_0x0731:
            java.lang.Object r0 = r13.getValue()
            X.3YE r0 = (X.AnonymousClass3YE) r0
            X.0eM r0 = r0.A03
            java.lang.Object r10 = r0.getValue()
            X.3Z1 r10 = (X.AnonymousClass3Z1) r10
            r6 = r18
            r0 = r52
            X.9J2 r0 = r10.A00(r1, r0, r6)
        L_0x0747:
            X.I5b r27 = X.C56623I5b.A00
            X.3Wa r6 = r3.A01
            r28 = r12
            r29 = r4
            r30 = r1
            r31 = r6
            r32 = r52
            r33 = r18
            X.Jw5 r6 = r27.A02(r28, r29, r30, r31, r32, r33)
            if (r6 == 0) goto L_0x0a5e
            X.0eM r2 = r3.A07
            r2.getValue()
            X.9Iy r2 = X.AnonymousClass4i1.A00(r1, r9)
            X.3a7 r9 = new X.3a7
            r9.<init>(r2, r0, r6)
            goto L_0x0232
        L_0x076d:
            java.lang.Object r0 = r13.getValue()
            X.3YE r0 = (X.AnonymousClass3YE) r0
            X.0eM r0 = r0.A03
            java.lang.Object r6 = r0.getValue()
            X.3Z1 r6 = (X.AnonymousClass3Z1) r6
            r2 = r18
            r0 = r52
            X.9J2 r0 = r6.A00(r1, r0, r2)
            X.3ZD r9 = new X.3ZD
            r9.<init>(r0)
            goto L_0x0232
        L_0x078a:
            if (r32 == 0) goto L_0x07a3
            if (r11 == 0) goto L_0x07a3
            java.lang.Integer r6 = r1.A2M()
            boolean r2 = r1.A4m()
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x0a6a
            X.BIV r9 = new X.BIV
            r9.<init>(r6, r0, r11, r2)
            goto L_0x01d5
        L_0x07a3:
            X.DHO r9 = X.DHO.A00
            goto L_0x01d3
        L_0x07a7:
            r11 = 0
            goto L_0x01ad
        L_0x07aa:
            r38 = 12
            X.JTb r23 = new X.JTb
            r2 = r23
            r0 = r38
            r2.<init>(r5, r0)
            goto L_0x0178
        L_0x07b7:
            r37 = 13
            X.Jvg r20 = new X.Jvg
            r2 = r20
            r0 = r37
            r2.<init>((boolean) r8, (boolean) r5, (int) r0)
            goto L_0x013c
        L_0x07c4:
            r37 = 13
            X.Jvg r20 = new X.Jvg
            r2 = r20
            r0 = r37
            r2.<init>((boolean) r5, (boolean) r5, (int) r0)
            goto L_0x013c
        L_0x07d1:
            r27 = 0
            goto L_0x00a0
        L_0x07d5:
            X.1Xy r0 = r1.A0C
            X.4xI r0 = r0.Aq4()
            boolean r0 = X.C2803051e.A01(r0, r4)
            if (r0 == 0) goto L_0x006c
            boolean r0 = X.C2803051e.A03(r4)
            goto L_0x0068
        L_0x07e7:
            X.33q r6 = X.C2364033p.A02
            X.33p r0 = r6.A00(r2, r14)
            boolean r77 = r0.A01(r1)
            java.lang.Integer r69 = r1.A2I()
            java.lang.Integer r70 = r1.A2J()
            boolean r78 = r1.CcK()
            X.1Xy r0 = r1.A0C
            X.3ZV r63 = r0.AaD()
            java.lang.Integer r71 = r1.A2M()
            boolean r79 = r1.A4m()
            java.lang.String r72 = r1.getId()
            if (r72 == 0) goto L_0x0a30
            com.instagram.model.venue.Venue r67 = r1.A23()
            X.1Xy r0 = r1.A0C
            X.JSO r0 = r0.CGF()
            if (r0 == 0) goto L_0x09b8
            java.lang.String r73 = r0.getAttributionTitle()
        L_0x0821:
            X.1Xy r0 = r1.A0C
            java.lang.String r74 = r0.Ad2()
            X.3Wa r10 = r11.A01
            X.33p r6 = r6.A00(r2, r14)
            int r0 = r13.size()
            if (r0 < r7) goto L_0x09ad
            boolean r0 = r6.A01(r1)
            if (r0 == 0) goto L_0x09ad
            X.Ioc r6 = new X.Ioc
            r80 = r6
            r81 = r14
            r82 = r11
            r83 = r13
            r84 = r52
            r85 = r1
            r86 = r10
            r87 = r12
            r88 = r2
            r89 = r7
            r80.<init>(r81, r82, r83, r84, r85, r86, r87, r88, r89, r90)
            r10 = 2500(0x9c4, double:1.235E-320)
            X.3ZS r0 = new X.3ZS
            r0.<init>(r6, r10, r8)
        L_0x0859:
            X.3ZT r6 = new X.3ZT
            r6.<init>(r1)
            X.3ZH r64 = r1.A1Y()
            boolean r10 = r1.A6H()
            if (r10 == 0) goto L_0x09a9
            java.lang.String r75 = X.C55010Hah.A00(r12, r2, r1)
        L_0x086c:
            X.3ZU r50 = new X.3ZU
            r61 = r50
            r62 = r35
            r65 = r0
            r66 = r52
            r68 = r6
            r76 = r13
            r80 = r90
            r81 = r18
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
            boolean r0 = r1.A4j()
            if (r0 != 0) goto L_0x089b
            boolean r0 = r1.A4b()
            if (r0 != 0) goto L_0x089b
            boolean r0 = X.C231122qu.A0Z(r1)
            if (r0 != 0) goto L_0x089b
            boolean r0 = X.C231122qu.A0Q(r4, r1)
            r62 = 0
            if (r0 == 0) goto L_0x089d
        L_0x089b:
            r62 = 1
        L_0x089d:
            r2 = 15
            X.9Lw r36 = new X.9Lw
            r0 = r36
            r0.<init>(r2, r1, r3)
            r2 = 8
            X.9MG r34 = new X.9MG
            r0 = r34
            r0.<init>(r2, r1, r3, r9)
            r2 = 9
            X.9MG r33 = new X.9MG
            r0 = r33
            r0.<init>(r2, r1, r3, r9)
            r6 = 26
            X.9MC r32 = new X.9MC
            r2 = r32
            r0 = r17
            r2.<init>(r6, r3, r1, r0)
            X.3ZX r31 = new X.3ZX
            r6 = r31
            r2 = r0
            r0 = r18
            r6.<init>(r1, r3, r2, r0)
            r2 = 14
            X.9Lv r30 = new X.9Lv
            r0 = r30
            r0.<init>(r2, r1, r3)
            X.9LE r29 = new X.9LE
            r0 = r29
            r0.<init>(r3, r7)
            X.9MB r28 = new X.9MB
            r2 = r28
            r0 = r18
            r2.<init>(r8, r1, r3, r0)
            X.9MF r27 = new X.9MF
            r6 = r27
            r2 = r22
            r0 = r17
            r6.<init>(r2, r1, r3, r0)
            r0 = 38
            X.9Ls r15 = new X.9Ls
            r15.<init>(r0, r1, r3)
            X.9MS r78 = new X.9MS
            r63 = r78
            r64 = r7
            r65 = r3
            r67 = r1
            r68 = r49
            r63.<init>(r64, r65, r66, r67, r68)
            X.9MB r14 = new X.9MB
            r0 = r18
            r14.<init>(r5, r1, r3, r0)
            X.9M2 r13 = new X.9M2
            r13.<init>(r2, r3, r1)
            X.3ZY r68 = X.AnonymousClass3ZY.A00
            r0 = 11
            X.9Lv r11 = new X.9Lv
            r11.<init>(r0, r1, r3)
            X.9Lv r10 = new X.9Lv
            r0 = r38
            r10.<init>(r0, r1, r3)
            X.B06 r7 = new X.B06
            r0 = r16
            r7.<init>(r1, r3, r0)
            X.9M2 r6 = new X.9M2
            r0 = r21
            r6.<init>(r0, r3, r1)
            X.9Lv r2 = new X.9Lv
            r0 = r37
            r2.<init>(r0, r1, r3)
            X.9IT r41 = new X.9IT
            r63 = r41
            r64 = r27
            r65 = r15
            r66 = r32
            r67 = r30
            r69 = r11
            r70 = r10
            r71 = r2
            r72 = r36
            r73 = r34
            r74 = r33
            r75 = r28
            r76 = r14
            r77 = r29
            r79 = r13
            r80 = r7
            r81 = r6
            r82 = r31
            r63.<init>((X.C62320sa) r64, (X.C62320sa) r65, (X.0sP) r66, (X.0sP) r67, (X.0sP) r68, (X.0sP) r69, (X.0sP) r70, (X.0sP) r71, (X.0sL) r72, (X.0sL) r73, (X.0sL) r74, (X.0sL) r75, (X.0sL) r76, (X.0sK) r77, (X.0sK) r78, (X.0sK) r79, (X.0sK) r80, (X.0sK) r81, (X.0sJ) r82)
            X.0eM r0 = r3.A05
            r0.getValue()
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x0988
            X.1Xy r0 = r1.A0C
            X.1eD r0 = r0.AZ0()
            if (r0 == 0) goto L_0x0988
            boolean r0 = r1.A60()
            if (r0 != 0) goto L_0x0988
            r2 = 36317788188448298(0x8106d60000162a, double:3.0308537181451444E-306)
            r0 = r24
            boolean r0 = X.182.A06(r0, r4, r2)
            r6 = 1
            if (r0 != 0) goto L_0x0989
        L_0x0988:
            r6 = 0
        L_0x0989:
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x09e5
            X.1Xy r0 = r1.A0C
            X.1eD r0 = r0.AZ0()
            if (r0 == 0) goto L_0x09e5
            boolean r0 = r1.A60()
            if (r0 != 0) goto L_0x09e5
            r2 = 36880738141995363(0x8306d600020163, double:3.386865535585823E-306)
            r0 = r24
            java.lang.String r2 = X.182.A04(r0, r4, r2)
            goto L_0x09bc
        L_0x09a9:
            r75 = 0
            goto L_0x086c
        L_0x09ad:
            r10 = 4000(0xfa0, double:1.9763E-320)
            X.3ZR r6 = X.AnonymousClass3ZR.A00
            X.3ZS r0 = new X.3ZS
            r0.<init>(r6, r10, r5)
            goto L_0x0859
        L_0x09b8:
            r73 = 0
            goto L_0x0821
        L_0x09bc:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ IllegalArgumentException -> 0x09e8 }
            java.lang.String r2 = r2.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            X.0qQ.A07(r2)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            java.lang.String r0 = "OUTLINED_16"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            if (r0 == 0) goto L_0x09d0
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ IllegalArgumentException -> 0x09e8 }
            goto L_0x09ea
        L_0x09d0:
            r0 = 2267(0x8db, float:3.177E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            if (r0 == 0) goto L_0x09df
            java.lang.Integer r2 = X.AnonymousClass05K.A01     // Catch:{ IllegalArgumentException -> 0x09e8 }
            goto L_0x09ea
        L_0x09df:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x09e8 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x09e8 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x09e8 }
        L_0x09e5:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x09ea
        L_0x09e8:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x09ea:
            X.9IZ r0 = new X.9IZ
            r0.<init>((X.1Xj) r1, (java.lang.Integer) r2, (boolean) r6)
            if (r40 == 0) goto L_0x0a0c
            r1 = r40
            java.util.List r2 = r1.A03
            if (r2 == 0) goto L_0x0a0c
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r8) goto L_0x0a0c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            int r2 = r2.size()
            java.lang.String r56 = X.AnonymousClass4i2.A01(r12, r1, r2, r5, r8)
        L_0x0a0c:
            X.3Za r38 = new X.3Za
            r57 = r97
            r65 = r98
            r43 = r0
            r44 = r25
            r45 = r23
            r46 = r20
            r47 = r35
            r51 = r9
            r54 = r17
            r55 = r39
            r61 = r16
            r63 = r90
            r64 = r18
            r39 = r19
            r40 = r26
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            return r38
        L_0x0a30:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a38:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a40:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a48:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a50:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0a5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0a64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0a6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0a70:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a78:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242923Ws.A05(android.content.Context, X.1Xj, X.4DU, X.3YB, X.3W1, java.lang.String, boolean):X.3Zb");
    }
}
