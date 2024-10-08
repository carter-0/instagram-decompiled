package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7dj  reason: invalid class name and case insensitive filesystem */
public final class C335907dj extends C333827aD {
    public final C335867df A00;
    public final C335897di A01;
    public final C337227fv A02;
    public final C337197fs A03;
    public final C335887dh A04;
    public final C335857de A05;
    public final C333897aK A06;
    public final C335847dd A07;
    public final AnonymousClass571 A08;
    public final 1bK A09;
    public final AnonymousClass572 A0A;
    public final C337207ft A0B;
    public final User A0C;
    public final C337217fu A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Long A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
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
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;

    public final boolean A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!this.A0T || !this.A0l) {
            return false;
        }
        if (!this.A0X || !182.A06(0Tu.A05, userSession, 36321073838433343L)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335907dj) {
                C335907dj r5 = (C335907dj) obj;
                if (!(0qQ.A0K(this.A0K, r5.A0K) && this.A0V == r5.A0V && 0qQ.A0K(this.A0N, r5.A0N) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A0J, r5.A0J) && 0qQ.A0K(this.A0O, r5.A0O) && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A08, r5.A08) && 0qQ.A0K(this.A0A, r5.A0A) && this.A0l == r5.A0l && this.A0j == r5.A0j && this.A0U == r5.A0U && this.A0Y == r5.A0Y && 0qQ.A0K(this.A0P, r5.A0P) && this.A0d == r5.A0d && this.A0X == r5.A0X && this.A0a == r5.A0a && this.A0S == r5.A0S && 0qQ.A0K(this.A0G, r5.A0G) && this.A0T == r5.A0T && 0qQ.A0K(this.A0I, r5.A0I) && 0qQ.A0K(this.A07, r5.A07) && this.A0b == r5.A0b && this.A0h == r5.A0h && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A06 == r5.A06 && this.A0c == r5.A0c && 0qQ.A0K(this.A0M, r5.A0M) && 0qQ.A0K(this.A0L, r5.A0L) && this.A0H == r5.A0H && this.A0W == r5.A0W && 0qQ.A0K(this.A04, r5.A04) && this.A0Z == r5.A0Z && this.A0R == r5.A0R && this.A0k == r5.A0k && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A0B, r5.A0B) && 0qQ.A0K(this.A0D, r5.A0D) && this.A0i == r5.A0i && this.A0e == r5.A0e && 0qQ.A0K(this.A02, r5.A02) && 0qQ.A0K(this.A0E, r5.A0E) && 0qQ.A0K(this.A0F, r5.A0F) && 0qQ.A0K(this.A0Q, r5.A0Q) && this.A01 == r5.A01 && this.A0g == r5.A0g && this.A0f == r5.A0f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17 = this.A0K.hashCode() * 31;
        int i = 1237;
        if (this.A0V) {
            i = 1231;
        }
        int i2 = (hashCode17 + i) * 31;
        String str2 = this.A0N;
        int i3 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int hashCode18 = (((i2 + hashCode) * 31) + this.A0C.hashCode()) * 31;
        String str3 = this.A0J;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i4 = (hashCode18 + hashCode2) * 31;
        String str4 = this.A0O;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C337197fs r0 = this.A03;
        if (r0 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r0.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        AnonymousClass571 r02 = this.A08;
        if (r02 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r02.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        AnonymousClass572 r03 = this.A0A;
        if (r03 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r03.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        int i9 = 1237;
        if (this.A0l) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0j) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0U) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0Y) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        List list = this.A0P;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        int i18 = 1237;
        if (this.A0d) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0X) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0a) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0S) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        Integer num = this.A0G;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i26 = (i25 + hashCode8) * 31;
        int i27 = 1237;
        if (this.A0T) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        Long l = this.A0I;
        if (l == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l.hashCode();
        }
        int hashCode19 = (((i28 + hashCode9) * 31) + this.A07.hashCode()) * 31;
        int i29 = 1237;
        if (this.A0b) {
            i29 = 1231;
        }
        int i30 = (hashCode19 + i29) * 31;
        int i31 = 1237;
        if (this.A0h) {
            i31 = 1231;
        }
        int hashCode20 = (((((((i30 + i31) * 31) + this.A05.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i32 = 1237;
        if (this.A0c) {
            i32 = 1231;
        }
        int hashCode21 = (((hashCode20 + i32) * 31) + this.A0M.hashCode()) * 31;
        String str5 = this.A0L;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i33 = (hashCode21 + hashCode10) * 31;
        int intValue = this.A0H.intValue();
        switch (intValue) {
            case 1:
                str = "LOCAL_PENDING";
                break;
            case 2:
                str = "LOCAL_DELETING";
                break;
            case 3:
                str = "LOCAL_HIDING";
                break;
            case 4:
                str = "LOCAL_UNHIDING";
                break;
            case 5:
                str = "LOCAL_UNCOVERING";
                break;
            case 6:
                str = "LOCAL_ALL_REPLIES_HIDING";
                break;
            case 7:
                str = "LOCAL_BLOCKING";
                break;
            default:
                str = "NETWORK";
                break;
        }
        int hashCode22 = (i33 + str.hashCode() + intValue) * 31;
        int i34 = 1237;
        if (this.A0W) {
            i34 = 1231;
        }
        int hashCode23 = (((hashCode22 + i34) * 31) + this.A04.hashCode()) * 31;
        int i35 = 1237;
        if (this.A0Z) {
            i35 = 1231;
        }
        int i36 = (hashCode23 + i35) * 31;
        int i37 = 1237;
        if (this.A0R) {
            i37 = 1231;
        }
        int i38 = (i36 + i37) * 31;
        int i39 = 1237;
        if (this.A0k) {
            i39 = 1231;
        }
        int i40 = (i38 + i39) * 31;
        1bK r04 = this.A09;
        if (r04 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = r04.hashCode();
        }
        int i41 = (i40 + hashCode11) * 31;
        C337207ft r05 = this.A0B;
        if (r05 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = r05.hashCode();
        }
        int i42 = (i41 + hashCode12) * 31;
        C337217fu r06 = this.A0D;
        if (r06 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = r06.hashCode();
        }
        int i43 = (i42 + hashCode13) * 31;
        int i44 = 1237;
        if (this.A0i) {
            i44 = 1231;
        }
        int i45 = (i43 + i44) * 31;
        int i46 = 1237;
        if (this.A0e) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        C337227fv r07 = this.A02;
        if (r07 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = r07.hashCode();
        }
        int i48 = (i47 + hashCode14) * 31;
        Boolean bool = this.A0E;
        if (bool == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool.hashCode();
        }
        int i49 = (i48 + hashCode15) * 31;
        Boolean bool2 = this.A0F;
        if (bool2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool2.hashCode();
        }
        int i50 = (i49 + hashCode16) * 31;
        List list2 = this.A0Q;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        int hashCode24 = (((i50 + i3) * 31) + this.A01.hashCode()) * 31;
        int i51 = 1237;
        if (this.A0g) {
            i51 = 1231;
        }
        int i52 = (hashCode24 + i51) * 31;
        int i53 = 1237;
        if (this.A0f) {
            i53 = 1231;
        }
        return i52 + i53;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C335907dj(X.C335867df r2, X.C335897di r3, X.C337227fv r4, X.C337197fs r5, X.C335887dh r6, X.C335857de r7, X.C333897aK r8, X.C335847dd r9, X.AnonymousClass571 r10, X.1bK r11, X.AnonymousClass572 r12, X.C337207ft r13, com.instagram.user.model.User r14, X.C337217fu r15, java.lang.Boolean r16, java.lang.Boolean r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27, java.util.List r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            r1 = this;
            r0 = r21
            r1.<init>(r0)
            r1.A0K = r0
            r0 = r29
            r1.A0V = r0
            r0 = r22
            r1.A0N = r0
            r1.A0C = r14
            r0 = r23
            r1.A0J = r0
            r0 = r24
            r1.A0O = r0
            r1.A03 = r5
            r1.A08 = r10
            r1.A0A = r12
            r0 = r30
            r1.A0l = r0
            r0 = r31
            r1.A0j = r0
            r0 = r32
            r1.A0U = r0
            r0 = r33
            r1.A0Y = r0
            r0 = r27
            r1.A0P = r0
            r0 = r34
            r1.A0d = r0
            r0 = r35
            r1.A0X = r0
            r0 = r36
            r1.A0a = r0
            r0 = r37
            r1.A0S = r0
            r0 = r18
            r1.A0G = r0
            r0 = r38
            r1.A0T = r0
            r0 = r20
            r1.A0I = r0
            r1.A07 = r9
            r0 = r39
            r1.A0b = r0
            r0 = r40
            r1.A0h = r0
            r1.A05 = r7
            r1.A00 = r2
            r1.A06 = r8
            r0 = r41
            r1.A0c = r0
            r0 = r25
            r1.A0M = r0
            r0 = r26
            r1.A0L = r0
            r0 = r19
            r1.A0H = r0
            r0 = r42
            r1.A0W = r0
            r1.A04 = r6
            r0 = r43
            r1.A0Z = r0
            r0 = r44
            r1.A0R = r0
            r0 = r45
            r1.A0k = r0
            r1.A09 = r11
            r1.A0B = r13
            r1.A0D = r15
            r0 = r46
            r1.A0i = r0
            r0 = r47
            r1.A0e = r0
            r1.A02 = r4
            r0 = r16
            r1.A0E = r0
            r0 = r17
            r1.A0F = r0
            r0 = r28
            r1.A0Q = r0
            r1.A01 = r3
            r0 = r48
            r1.A0g = r0
            r0 = r49
            r1.A0f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335907dj.<init>(X.7df, X.7di, X.7fv, X.7fs, X.7dh, X.7de, X.7aK, X.7dd, X.571, X.1bK, X.572, X.7ft, com.instagram.user.model.User, X.7fu, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ C335907dj A00(C335867df r56, C335907dj r57, C337227fv r58, C335857de r59, C333897aK r60, C337207ft r61, C337217fu r62, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        int i3 = i2;
        List list2 = list;
        Boolean bool3 = bool2;
        C337227fv r22 = r58;
        C337207ft r27 = r61;
        boolean z9 = z8;
        String str3 = str;
        boolean z10 = z4;
        String str4 = str2;
        Boolean bool4 = bool;
        boolean z11 = z2;
        C335867df r69 = r56;
        boolean z12 = z;
        boolean z13 = z3;
        boolean z14 = z6;
        C333897aK r68 = r60;
        int i4 = i;
        Integer num3 = num;
        C337217fu r29 = r62;
        Long l2 = l;
        boolean z15 = z5;
        boolean z16 = z7;
        C335857de r9 = r59;
        Integer num4 = num2;
        C335897di r14 = null;
        List list3 = null;
        C335907dj r15 = r57;
        if ((i & 1) != 0) {
            str3 = r15.A0K;
        }
        boolean z17 = (i & 2) != 0 ? r15.A0V : false;
        String str5 = (i & 4) != 0 ? r15.A0N : null;
        User user = (i & 8) != 0 ? r15.A0C : null;
        String str6 = (i & 16) != 0 ? r15.A0J : null;
        if ((i & 32) != 0) {
            str4 = r15.A0O;
        }
        C337197fs r66 = (i & 64) != 0 ? r15.A03 : null;
        AnonymousClass571 r65 = (i4 & 128) != 0 ? r15.A08 : null;
        AnonymousClass572 r64 = (i4 & 256) != 0 ? r15.A0A : null;
        boolean z18 = (i4 & 512) != 0 ? r15.A0l : false;
        if ((i4 & 1024) != 0) {
            z12 = r15.A0j;
        }
        boolean z19 = (i4 & C249703kE.FLAG_MOVED) != 0 ? r15.A0U : false;
        boolean z20 = (i4 & 4096) != 0 ? r15.A0Y : false;
        if ((i4 & 8192) != 0) {
            list3 = r15.A0P;
        }
        boolean z21 = (i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? r15.A0d : false;
        boolean z22 = (i & Constants.LOAD_RESULT_PGO) != 0 ? r15.A0X : false;
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z11 = r15.A0a;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z13 = r15.A0S;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            num3 = r15.A0G;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z10 = r15.A0T;
        }
        if ((i & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            l2 = r15.A0I;
        }
        C335847dd r11 = (i & 2097152) != 0 ? r15.A07 : null;
        if ((i & 4194304) != 0) {
            z15 = r15.A0b;
        }
        boolean z23 = (i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? r15.A0h : false;
        if ((i & 16777216) != 0) {
            r9 = r15.A05;
        }
        if ((i & 33554432) != 0) {
            r69 = r15.A00;
        }
        if ((i & 67108864) != 0) {
            r68 = r15.A06;
        }
        boolean z24 = (i & 134217728) != 0 ? r15.A0c : false;
        String str7 = (i & 268435456) != 0 ? r15.A0M : null;
        String str8 = (i & 536870912) != 0 ? r15.A0L : null;
        if ((i & SN3.MAX_SIGNED_POWER_OF_TWO) != 0) {
            num4 = r15.A0H;
        }
        if ((i & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            z14 = r15.A0W;
        }
        C335887dh r6 = (i2 & 1) != 0 ? r15.A04 : null;
        if ((i2 & 2) != 0) {
            z16 = r15.A0Z;
        }
        if ((i2 & 4) != 0) {
            z9 = r15.A0R;
        }
        boolean z25 = (i2 & 8) != 0 ? r15.A0k : false;
        1bK r25 = (i2 & 16) != 0 ? r15.A09 : null;
        if ((i2 & 32) != 0) {
            r27 = r15.A0B;
        }
        if ((i2 & 64) != 0) {
            r29 = r15.A0D;
        }
        boolean z26 = (i3 & 128) != 0 ? r15.A0i : false;
        boolean z27 = (i3 & 256) != 0 ? r15.A0e : false;
        if ((i3 & 512) != 0) {
            r22 = r15.A02;
        }
        if ((i3 & 1024) != 0) {
            bool4 = r15.A0E;
        }
        if ((i3 & C249703kE.FLAG_MOVED) != 0) {
            bool3 = r15.A0F;
        }
        if ((i3 & 4096) != 0) {
            list2 = r15.A0Q;
        }
        if ((i3 & 8192) != 0) {
            r14 = r15.A01;
        }
        boolean z28 = (i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? r15.A0g : false;
        boolean z29 = (i2 & Constants.LOAD_RESULT_PGO) != 0 ? r15.A0f : false;
        0qQ.A0B(str3, 0);
        0qQ.A0B(user, 3);
        0qQ.A0B(r11, 21);
        0qQ.A0B(r9, 24);
        0qQ.A0B(r69, 25);
        0qQ.A0B(r68, 26);
        0qQ.A0B(str7, 28);
        0qQ.A0B(num4, 30);
        0qQ.A0B(r6, 32);
        0qQ.A0B(r14, 45);
        return new C335907dj(r69, r14, r22, r66, r6, r9, r68, r11, r65, r25, r64, r27, user, r29, bool4, bool3, num3, num4, l2, str3, str5, str6, str4, str7, str8, list3, list2, z17, z18, z12, z19, z20, z21, z22, z11, z13, z10, z15, z23, z24, z14, z16, z9, z25, z26, z27, z28, z29);
    }
}
