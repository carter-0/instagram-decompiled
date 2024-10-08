package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7LQ  reason: invalid class name */
public final class AnonymousClass7LQ implements C331837So {
    public int A00 = 4;
    public int A01 = 8;
    public int A02;
    public int A03 = 8;
    public int A04 = 8;
    public int A05 = 0;
    public int A06 = 8;
    public long A07;
    public long A08;
    public C53368Gms A09;
    public ImmutableList A0A;
    public ImmutableMap A0B;
    public C327627Bo A0C = C327627Bo.NUX_TYPE_NONE;
    public AnonymousClass7IK A0D;
    public AnonymousClass7LQ A0E = null;
    public C327637Bp A0F;
    public AnonymousClass7SD A0G;
    public AnonymousClass5H7 A0H;
    public 0tS A0I;
    public AnonymousClass4UC A0J;
    public User A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public Integer A0N;
    public boolean A0O = false;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z = false;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final UserSession A0d;
    public final C254703su A0e;

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01da, code lost:
        if (X.C69421Nl3.A00(r0) != X.C69421Nl3.A07) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e7, code lost:
        X.0wb.A03("DirectMessageRowData", X.002.A0O("Unsupported layout type detected: ", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0369, code lost:
        return 91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a3 A[PHI: r4 
      PHI: (r4v2 int) = (r4v1 int), (r4v1 int), (r4v6 int), (r4v6 int) binds: [B:92:0x0182, B:94:0x018a, B:112:0x01af, B:105:0x01a1] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(com.instagram.common.session.UserSession r14, X.C254703su r15) {
        /*
            r13 = this;
            X.3tC r4 = r15.A0j
            X.7SD r0 = r13.A0G
            X.3Tu r3 = r0.A0H
            r2 = 0
            boolean r0 = r15.A1T()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15.A2P
            if (r0 != 0) goto L_0x001b
            X.2FW r1 = r15.A10
            X.2FW r0 = X.2FW.A1s
            if (r1 == r0) goto L_0x001b
            boolean r2 = X.C3263776n.A00(r14, r3)
        L_0x001b:
            r12 = 38
            r6 = 0
            if (r2 == 0) goto L_0x0049
            com.google.common.collect.ImmutableList r1 = r15.A0H()
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0048
            java.lang.Object r0 = r1.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r0.A0c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r15.A1q
            if (r0 == 0) goto L_0x02e9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e9
        L_0x0046:
            r12 = 82
        L_0x0048:
            return r12
        L_0x0049:
            if (r4 == 0) goto L_0x0077
            java.lang.String r2 = r4.A12
            if (r2 == 0) goto L_0x0048
            java.lang.String r0 = "sticker"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0319
            java.lang.String r0 = "placeholder"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0316
            java.lang.String r3 = "DirectMessageRowData"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported ig template type detected: "
            r1.append(r0)
            r1.append(r2)
        L_0x006e:
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r3, r0)
        L_0x0075:
            r12 = -1
            return r12
        L_0x0077:
            com.google.common.collect.ImmutableList r8 = r15.A0H()
            r11 = 188(0xbc, float:2.63E-43)
            r4 = 93
            r3 = 92
            r5 = 3
            if (r8 == 0) goto L_0x0153
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0093
            X.2FW r1 = r15.A0z
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x0093
            r12 = 97
            return r12
        L_0x0093:
            int r1 = r8.size()
            r0 = 1
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 8
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 9
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 10
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 13
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 18
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 11
            if (r1 != r0) goto L_0x00ee
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            boolean r0 = X.C254873tC.A00(r0)
            if (r0 != 0) goto L_0x00fa
        L_0x00ee:
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            int r1 = r0.A02
            r0 = 20
            if (r1 != r0) goto L_0x03fb
        L_0x00fa:
            java.lang.Object r4 = r8.get(r6)
            X.3tC r4 = (X.C254873tC) r4
            r0 = r4
            boolean r1 = X.C3255573c.A00(r14, r15)
            if (r1 == 0) goto L_0x0117
            java.util.List r2 = r15.A2B
            if (r2 == 0) goto L_0x0117
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0117
            java.lang.Object r0 = r2.get(r6)
            X.3tC r0 = (X.C254873tC) r0
        L_0x0117:
            int r7 = r0.A02
            if (r7 != 0) goto L_0x01b8
            if (r4 == 0) goto L_0x0151
            com.google.common.collect.ImmutableList r0 = r4.A01()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = X.00k.A0J(r0)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = r0.A05
        L_0x012d:
            java.lang.String r0 = "xma_igd_live_location_sharing"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x014c
            r0 = 0
            if (r4 == 0) goto L_0x014f
            java.lang.String r1 = r4.A1G
        L_0x013a:
            java.lang.String r2 = "live_location"
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 != 0) goto L_0x014c
            if (r4 == 0) goto L_0x0146
            java.lang.String r0 = r4.A1M
        L_0x0146:
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x01b8
        L_0x014c:
            r12 = 169(0xa9, float:2.37E-43)
            return r12
        L_0x014f:
            r1 = r0
            goto L_0x013a
        L_0x0151:
            r1 = 0
            goto L_0x012d
        L_0x0153:
            X.5yB r0 = r15.A0v
            if (r0 == 0) goto L_0x03fb
            X.1iA r1 = r0.A01
            X.1iA r0 = X.1iA.A0E
            if (r1 != r0) goto L_0x0160
            r12 = 180(0xb4, float:2.52E-43)
            return r12
        L_0x0160:
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r14)
            X.5yB r0 = r15.A0v
            java.lang.String r0 = r0.A06
            X.3Q2 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x03fb
            java.util.List r0 = r1.A0L()
            int r0 = r0.size()
            if (r0 <= r5) goto L_0x03fa
            java.util.List r0 = r1.A0L()
            java.lang.Object r0 = r0.get(r6)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            if (r0 == 0) goto L_0x01a3
            float r1 = r0.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            return r11
        L_0x018d:
            X.2FW r0 = X.2FW.A1x
            if (r1 == r0) goto L_0x0199
            X.2FW r0 = X.2FW.A1y
            if (r1 == r0) goto L_0x0199
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x01e7
        L_0x0199:
            X.2FW r0 = X.2FW.A0m
            r4 = 150(0x96, float:2.1E-43)
            if (r2 != r0) goto L_0x01a4
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r15.A16
            if (r0 == 0) goto L_0x031c
        L_0x01a3:
            return r4
        L_0x01a4:
            if (r2 == r10) goto L_0x031c
            X.2FW r0 = X.2FW.A1k
            if (r2 != r0) goto L_0x01ad
            r12 = 134(0x86, float:1.88E-43)
            return r12
        L_0x01ad:
            X.2FW r0 = X.2FW.A0N
            if (r2 == r0) goto L_0x01a3
            X.2FW r0 = X.2FW.A0K
            if (r2 != r0) goto L_0x02cc
            r12 = 72
            return r12
        L_0x01b8:
            X.2FW r2 = r15.A0z
            java.lang.String r9 = r15.A1q
            r1 = 26
            X.Pm0 r0 = new X.Pm0
            r0.<init>(r15, r1)
            X.2FW r10 = X.2FW.A1g
            if (r2 != r10) goto L_0x01cd
            if (r9 != 0) goto L_0x01cd
            r0.invoke()
            r2 = 0
        L_0x01cd:
            java.lang.String r0 = r15.A0n()
            if (r0 == 0) goto L_0x01dc
            X.Nl3 r1 = X.C69421Nl3.A00(r0)
            X.Nl3 r0 = X.C69421Nl3.MEDIA_NOTE
            r9 = 1
            if (r1 == r0) goto L_0x01dd
        L_0x01dc:
            r9 = 0
        L_0x01dd:
            if (r7 == 0) goto L_0x0296
            r1 = 91
            switch(r7) {
                case 4: goto L_0x0259;
                case 5: goto L_0x023a;
                case 6: goto L_0x0296;
                case 7: goto L_0x01f4;
                case 8: goto L_0x0369;
                case 9: goto L_0x0334;
                case 10: goto L_0x0360;
                case 11: goto L_0x02d5;
                case 12: goto L_0x035d;
                case 13: goto L_0x0369;
                default: goto L_0x01e4;
            }
        L_0x01e4:
            switch(r7) {
                case 18: goto L_0x0322;
                case 19: goto L_0x01fb;
                case 20: goto L_0x031f;
                default: goto L_0x01e7;
            }
        L_0x01e7:
            java.lang.String r1 = "DirectMessageRowData"
            java.lang.String r0 = "Unsupported layout type detected: "
            java.lang.String r0 = X.002.A0O(r0, r7)
            X.0wb.A03(r1, r0)
            goto L_0x0075
        L_0x01f4:
            X.2FW r1 = r15.A10
            X.2FW r0 = X.2FW.A20
            if (r1 == r0) goto L_0x0199
            goto L_0x018d
        L_0x01fb:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321018003989527(0x8109c600022417, double:3.032896266498841E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x0296
            if (r2 == 0) goto L_0x0237
            X.7Cz r0 = X.C327987Cz.$redex_init_class
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0331
            if (r1 == r5) goto L_0x032e
            r0 = 12
            if (r1 == r0) goto L_0x032b
            r0 = 14
            if (r1 == r0) goto L_0x0328
            r0 = 81
            if (r1 == r0) goto L_0x0325
            java.lang.String r3 = "DirectMessageRowData"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message item type detected: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r3, r0)
        L_0x0237:
            r12 = 171(0xab, float:2.4E-43)
            return r12
        L_0x023a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A0c
            boolean r3 = r1.equals(r0)
            if (r2 == 0) goto L_0x0256
            X.7Cz r0 = X.C327987Cz.$redex_init_class
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x02bb
            if (r9 != 0) goto L_0x0373
            r12 = 83
        L_0x0251:
            if (r3 == 0) goto L_0x0048
            r12 = 77
            return r12
        L_0x0256:
            r12 = 75
            goto L_0x0251
        L_0x0259:
            if (r2 == 0) goto L_0x0376
            boolean r0 = r15.A1M()
            if (r0 == 0) goto L_0x0263
            X.2FW r2 = X.2FW.A0N
        L_0x0263:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A0c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0271
            java.lang.Long r0 = r4.A0p
            if (r0 == 0) goto L_0x0272
        L_0x0271:
            r6 = 1
        L_0x0272:
            boolean r3 = r4.A05()
            X.7Cz r0 = X.C327987Cz.$redex_init_class
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x02e0
            if (r1 == r5) goto L_0x0370
            r0 = 12
            if (r1 == r0) goto L_0x036d
            r0 = 54
            if (r1 == r0) goto L_0x036a
            r0 = 9
            if (r1 == r0) goto L_0x036a
            r0 = 10
            if (r1 != r0) goto L_0x02bb
            if (r3 == 0) goto L_0x036a
            r12 = 96
            return r12
        L_0x0296:
            if (r2 == 0) goto L_0x0048
            X.7Cz r0 = X.C327987Cz.$redex_init_class
            int r1 = r2.ordinal()
            r0 = 2
            r12 = 97
            if (r1 == r0) goto L_0x02ff
            if (r1 == r5) goto L_0x03f5
            r0 = 12
            if (r1 == r0) goto L_0x02f2
            r0 = 14
            if (r1 == r0) goto L_0x03f2
            r0 = 81
            if (r1 == r0) goto L_0x03ef
            if (r1 == r3) goto L_0x03ec
            r0 = 9
            if (r1 == r0) goto L_0x0048
            r0 = 10
            if (r1 == r0) goto L_0x02ef
        L_0x02bb:
            java.lang.String r3 = "DirectMessageRowData"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message item type detected: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x006e
        L_0x02cc:
            X.2FW r0 = X.2FW.A1A
            r12 = 70
            if (r2 != r0) goto L_0x0048
            r12 = 138(0x8a, float:1.93E-43)
            return r12
        L_0x02d5:
            boolean r0 = X.C254873tC.A00(r4)
            r12 = 111(0x6f, float:1.56E-43)
            if (r0 == 0) goto L_0x0048
            r12 = 114(0x72, float:1.6E-43)
            return r12
        L_0x02e0:
            if (r9 != 0) goto L_0x0373
            r12 = 115(0x73, float:1.61E-43)
            if (r6 == 0) goto L_0x0048
            r12 = 54
            return r12
        L_0x02e9:
            X.2FW r1 = r15.A0z
            X.2FW r0 = X.2FW.A0N
            if (r1 != r0) goto L_0x0048
        L_0x02ef:
            r12 = 113(0x71, float:1.58E-43)
            return r12
        L_0x02f2:
            X.53G r0 = r15.A12
            if (r0 == 0) goto L_0x02fc
            boolean r0 = r0.A05
            r12 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0048
        L_0x02fc:
            r12 = 129(0x81, float:1.81E-43)
            return r12
        L_0x02ff:
            X.3tI r0 = r15.A0P()
            if (r0 != 0) goto L_0x0046
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r4.A1h
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0048
            r12 = 160(0xa0, float:2.24E-43)
            return r12
        L_0x0316:
            r12 = 23
            return r12
        L_0x0319:
            r12 = 39
            return r12
        L_0x031c:
            r12 = 71
            return r12
        L_0x031f:
            r12 = 184(0xb8, float:2.58E-43)
            return r12
        L_0x0322:
            r12 = 179(0xb3, float:2.51E-43)
            return r12
        L_0x0325:
            r12 = 174(0xae, float:2.44E-43)
            return r12
        L_0x0328:
            r12 = 175(0xaf, float:2.45E-43)
            return r12
        L_0x032b:
            r12 = 177(0xb1, float:2.48E-43)
            return r12
        L_0x032e:
            r12 = 173(0xad, float:2.42E-43)
            return r12
        L_0x0331:
            r12 = 172(0xac, float:2.41E-43)
            return r12
        L_0x0334:
            int r0 = r8.size()
            if (r0 <= r5) goto L_0x03fa
            java.lang.Object r0 = r8.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r0.A0X
            if (r0 == 0) goto L_0x035a
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            if (r1 <= 0) goto L_0x035a
            if (r0 <= 0) goto L_0x035a
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x035a
            return r11
        L_0x035a:
            r11 = 93
            return r11
        L_0x035d:
            r12 = 98
            return r12
        L_0x0360:
            int r0 = r8.size()
            if (r0 > r5) goto L_0x0369
            r12 = 105(0x69, float:1.47E-43)
            return r12
        L_0x0369:
            return r1
        L_0x036a:
            r12 = 31
            return r12
        L_0x036d:
            r12 = 8
            return r12
        L_0x0370:
            r12 = 78
            return r12
        L_0x0373:
            r12 = 161(0xa1, float:2.26E-43)
            return r12
        L_0x0376:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A0c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03f8
            java.lang.Long r0 = r4.A0p
            if (r0 != 0) goto L_0x03f8
            r3 = 78
            com.instagram.common.session.UserSession r4 = r13.A0d
            X.7Qj r1 = X.C331287Qh.A00(r4)
            java.lang.String r0 = r15.A0g()
            if (r0 == 0) goto L_0x03a5
            java.lang.String r5 = r15.A0g()
        L_0x0396:
            if (r5 == 0) goto L_0x03fa
            java.util.List r1 = r1.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x03aa
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03aa
            return r3
        L_0x03a5:
            java.lang.String r5 = r15.A0f()
            goto L_0x0396
        L_0x03aa:
            java.util.Iterator r2 = r1.iterator()
        L_0x03ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03fa
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x03c5
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03c5
            goto L_0x03ae
        L_0x03c5:
            java.util.Iterator r1 = r1.iterator()
        L_0x03c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ae
            java.lang.Object r0 = r1.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A0g()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x03c9
            boolean r0 = X.C328447Ev.A00(r4)
            if (r0 == 0) goto L_0x03fa
            r3 = 178(0xb2, float:2.5E-43)
            return r3
        L_0x03ec:
            r12 = 186(0xba, float:2.6E-43)
            return r12
        L_0x03ef:
            r12 = 146(0x92, float:2.05E-43)
            return r12
        L_0x03f2:
            r12 = 122(0x7a, float:1.71E-43)
            return r12
        L_0x03f5:
            r12 = 128(0x80, float:1.794E-43)
            return r12
        L_0x03f8:
            r3 = 43
        L_0x03fa:
            return r3
        L_0x03fb:
            r12 = 65
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LQ.A00(com.instagram.common.session.UserSession, X.3su):int");
    }

    public final int A01() {
        if (this.A0G.A1G) {
            return this.A05;
        }
        return 2;
    }

    public final C267324bN A02() {
        1Xj A0S2;
        C254703su r3 = this.A0e;
        if (r3.A1T instanceof AnonymousClass77X) {
            AnonymousClass77X r2 = r3.A0S;
            if (r2 == null) {
                return null;
            }
            AnonymousClass3OA r1 = r2.A02;
            if (r1 != null) {
                A0S2 = r1.A0K;
            } else {
                A0S2 = r2.A01;
            }
        } else {
            2FW r22 = r3.A10;
            if (r22 != 2FW.A1p) {
                if (r22 != 2FW.A1v || r3.A0H() == null || r3.A0H().isEmpty() || ((C254873tC) r3.A0H().get(0)).A0u == null) {
                    return null;
                }
                Uri A032 = 0cp.A03(((C254873tC) r3.A0H().get(0)).A0u);
                if (A032.getPath() == null || !A032.getPath().contains("reel")) {
                    return null;
                }
            }
            A0S2 = r3.A0S();
        }
        if (A0S2 != null) {
            return C295375o3.A02(A0S2);
        }
        return null;
    }

    public final C327627Bo A03() {
        if (this.A0G.A1G) {
            return C327627Bo.NUX_TYPE_NONE;
        }
        return this.A0C;
    }

    public final ArrayList A04() {
        Object obj;
        if (this.A0G.A08 == 29) {
            ArrayList A0q = this.A0e.A0q();
            if (A0q == null || A0q.isEmpty() || (obj = A0q.get(0)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            return arrayList;
        }
        User A002 = AnonymousClass0eD.A00(this.A0d);
        if (A002 != null) {
            return this.A0e.A0r(A002);
        }
        return null;
    }

    public final boolean A05() {
        C300625xW r0 = this.A0e.A0W;
        if (r0 == null || r0.A00 <= 0 || this.A0Q) {
            return false;
        }
        User user = this.A0K;
        if (user == null || !user.Cdl()) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (this.A0G.A13 && this.A0e.A0Q != null && this.A0W) {
            if (!182.A06(0Tu.A05, this.A0d, 36327039548012673L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final long C7Z() {
        return this.A0e.C7c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0214, code lost:
        if (r1 == 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03b2, code lost:
        if (r1 == X.AnonymousClass7Q3.AVATAR_REACTION) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x03d8, code lost:
        if (r5.A0F == false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03e0, code lost:
        if (r3 == false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03ed, code lost:
        if (r5.A0F != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0780, code lost:
        return A00(r10.A0d, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x04a6 A[PHI: r15 
      PHI: (r15v16 int) = (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v13 int), (r15v17 int), (r15v22 int), (r15v17 int), (r15v24 int), (r15v28 int), (r15v28 int), (r15v28 int), (r15v28 int), (r15v30 int), (r15v32 int), (r15v35 int), (r15v38 int), (r15v40 int), (r15v40 int), (r15v40 int), (r15v44 int), (r15v40 int), (r15v46 int), (r15v53 int), (r15v55 int), (r15v59 int), (r15v59 int), (r15v63 int), (r15v59 int), (r15v65 int), (r15v70 int), (r15v75 int), (r15v81 int), (r15v83 int), (r15v86 int), (r15v86 int), (r15v86 int), (r15v90 int), (r15v86 int), (r15v86 int), (r15v96 int), (r15v96 int), (r15v96 int), (r15v100 int), (r15v96 int), (r15v96 int) binds: [B:420:0x05cb, B:422:0x05cf, B:424:0x05d8, B:428:0x05e4, B:443:0x060e, B:438:0x0603, B:441:0x060a, B:365:0x0504, B:367:0x050a, B:371:0x051b, B:433:0x05f6, B:430:0x05ef, B:329:0x0497, B:313:0x046a, B:324:0x048a, B:316:0x0471, B:318:0x0477, B:274:0x03f2, B:289:0x0419, B:291:0x0423, B:293:0x0427, B:284:0x040b, B:280:0x0402, B:237:0x036c, B:233:0x0353, B:208:0x02ec, B:210:0x02fd, B:226:0x0323, B:228:0x032d, B:221:0x0316, B:223:0x031c, B:204:0x02e3, B:199:0x02d2, B:150:0x0232, B:152:0x0243, B:177:0x0280, B:169:0x0267, B:171:0x026d, B:146:0x021f, B:148:0x0227, B:112:0x01b9, B:109:0x01a5, B:65:0x010c, B:77:0x013f, B:94:0x016d, B:96:0x0173, B:71:0x0125, B:73:0x0129, B:32:0x00a0, B:44:0x00d3, B:61:0x0101, B:63:0x0107, B:38:0x00b9, B:40:0x00bd] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getType() {
        /*
            r16 = this;
            r10 = r16
            boolean r0 = r10.A05()
            if (r0 != 0) goto L_0x0781
            boolean r0 = r10.A0P
            if (r0 != 0) goto L_0x0781
            X.3su r4 = r10.A0e
            X.2FW r5 = r4.A10
            X.7Cz r0 = X.C327987Cz.$redex_init_class
            int r1 = r5.ordinal()
            r3 = 0
            switch(r1) {
                case 0: goto L_0x06af;
                case 1: goto L_0x01be;
                case 2: goto L_0x04a7;
                case 3: goto L_0x042c;
                case 4: goto L_0x006c;
                case 5: goto L_0x06a9;
                case 6: goto L_0x06a4;
                case 7: goto L_0x06a1;
                case 9: goto L_0x0681;
                case 10: goto L_0x0681;
                case 11: goto L_0x06a6;
                case 12: goto L_0x0287;
                case 13: goto L_0x06e6;
                case 14: goto L_0x022c;
                case 15: goto L_0x06ac;
                case 20: goto L_0x003a;
                case 21: goto L_0x075d;
                case 22: goto L_0x0371;
                case 28: goto L_0x0204;
                case 30: goto L_0x0358;
                case 32: goto L_0x0332;
                case 34: goto L_0x069b;
                case 36: goto L_0x069e;
                case 37: goto L_0x0178;
                case 40: goto L_0x0693;
                case 42: goto L_0x0690;
                case 45: goto L_0x06b2;
                case 46: goto L_0x0178;
                case 52: goto L_0x0681;
                case 56: goto L_0x068d;
                case 61: goto L_0x0698;
                case 62: goto L_0x0695;
                case 69: goto L_0x068a;
                case 72: goto L_0x068d;
                case 81: goto L_0x065a;
                case 82: goto L_0x065a;
                case 100: goto L_0x0687;
                case 105: goto L_0x0684;
                default: goto L_0x001a;
            }
        L_0x001a:
            boolean r0 = X.C254903tF.A00(r5)
            if (r0 != 0) goto L_0x077a
            com.instagram.common.session.UserSession r0 = r10.A0d
            X.1Zn r2 = X.1Zm.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.1Zp r2 = r2.A01(r1, r0, r3)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "item_type"
            r2.A03(r0, r1)
            r2.A00()
            r11 = -1
        L_0x0039:
            return r11
        L_0x003a:
            java.lang.Object r1 = r4.A1T
            boolean r0 = r4.A1X()
            if (r0 == 0) goto L_0x0045
            r11 = 69
            return r11
        L_0x0045:
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r1)
            if (r0 == 0) goto L_0x0057
            X.9JI r1 = (X.AnonymousClass9JI) r1
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            boolean r0 = r4.A1Y()
            if (r0 == 0) goto L_0x0065
            r11 = 18
            if (r1 == 0) goto L_0x0039
            r11 = 19
            return r11
        L_0x0065:
            r11 = 17
            if (r1 == 0) goto L_0x0039
            r11 = 20
            return r11
        L_0x006c:
            X.7SD r3 = r10.A0G
            com.instagram.common.session.UserSession r2 = r10.A0d
            X.0Tu r8 = X.0Tu.A05
            r0 = 2342154780152955657(0x2081015d00000309, double:4.058608334782941E-152)
            boolean r1 = X.182.A06(r8, r2, r0)
            boolean r0 = r3.A1G
            r15 = 59
            if (r0 == 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            return r15
        L_0x0084:
            X.3tI r7 = r4.A0P()
            boolean r0 = r4.A1V()
            java.lang.String r13 = "permanent"
            java.lang.String r12 = "once"
            java.lang.String r11 = "replayable"
            r9 = 96
            r6 = 14
            r5 = 12
            r4 = 11
            r3 = 3
            r2 = 2
            if (r0 == 0) goto L_0x010c
            r15 = 60
            if (r7 == 0) goto L_0x04a6
            X.2FW r1 = r7.A0F
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x00c6
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r14 = r0.A00
            r0 = 2342161196835346412(0x20810733001317ec, double:4.064049137138409E-152)
            boolean r0 = X.182.A06(r8, r14, r0)
            if (r0 == 0) goto L_0x00c6
            X.4ik r0 = r7.A07
            if (r0 == 0) goto L_0x04a6
            java.lang.String r1 = r0.A09
            if (r1 == 0) goto L_0x04a6
            int r0 = r1.hashCode()
            switch(r0) {
                case -1212837439: goto L_0x00f6;
                case 3415681: goto L_0x00f1;
                case 668488878: goto L_0x00e8;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 36318187621455849(0x810733001017e9, double:3.031106321187507E-306)
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r0 == 0) goto L_0x04a6
            X.2FW r0 = r7.A0F
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x070d
            if (r0 == r3) goto L_0x070a
            if (r0 == r4) goto L_0x070d
            if (r0 == r5) goto L_0x00ff
            if (r0 == r6) goto L_0x0707
            if (r0 == r9) goto L_0x070d
            return r15
        L_0x00e8:
            boolean r0 = r1.equals(r13)
            if (r0 == 0) goto L_0x00c6
            r15 = 167(0xa7, float:2.34E-43)
            return r15
        L_0x00f1:
            boolean r0 = r1.equals(r12)
            goto L_0x00fa
        L_0x00f6:
            boolean r0 = r1.equals(r11)
        L_0x00fa:
            if (r0 == 0) goto L_0x00c6
            r15 = 166(0xa6, float:2.33E-43)
            return r15
        L_0x00ff:
            X.53G r0 = r7.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r15 = 155(0x9b, float:2.17E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 156(0x9c, float:2.19E-43)
            return r15
        L_0x010c:
            if (r7 == 0) goto L_0x04a6
            X.2FW r1 = r7.A0F
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x0132
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r14 = r0.A00
            r0 = 2342161196835346412(0x20810733001317ec, double:4.064049137138409E-152)
            boolean r0 = X.182.A06(r8, r14, r0)
            if (r0 == 0) goto L_0x0132
            X.4ik r0 = r7.A07
            if (r0 == 0) goto L_0x04a6
            java.lang.String r1 = r0.A09
            if (r1 == 0) goto L_0x04a6
            int r0 = r1.hashCode()
            switch(r0) {
                case -1212837439: goto L_0x0162;
                case 3415681: goto L_0x015d;
                case 668488878: goto L_0x0154;
                default: goto L_0x0132;
            }
        L_0x0132:
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 36318187621455849(0x810733001017e9, double:3.031106321187507E-306)
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r0 == 0) goto L_0x04a6
            X.2FW r0 = r7.A0F
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0716
            if (r0 == r3) goto L_0x0713
            if (r0 == r4) goto L_0x0716
            if (r0 == r5) goto L_0x016b
            if (r0 == r6) goto L_0x0710
            if (r0 == r9) goto L_0x0716
            return r15
        L_0x0154:
            boolean r0 = r1.equals(r13)
            if (r0 == 0) goto L_0x0132
            r15 = 165(0xa5, float:2.31E-43)
            return r15
        L_0x015d:
            boolean r0 = r1.equals(r12)
            goto L_0x0166
        L_0x0162:
            boolean r0 = r1.equals(r11)
        L_0x0166:
            if (r0 == 0) goto L_0x0132
            r15 = 164(0xa4, float:2.3E-43)
            return r15
        L_0x016b:
            X.53G r0 = r7.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r15 = 153(0x99, float:2.14E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 154(0x9a, float:2.16E-43)
            return r15
        L_0x0178:
            r0 = 37
            r5 = 0
            if (r1 == r0) goto L_0x01a9
            r0 = 46
            if (r1 != r0) goto L_0x01bb
            com.instagram.common.session.UserSession r3 = r10.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313334308145032(0x8102c9000c0788, double:3.0280370663070225E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            java.lang.Object r1 = r4.A1T
            boolean r0 = r1 instanceof X.AnonymousClass77X
            if (r0 == 0) goto L_0x01a1
            X.77X r1 = (X.AnonymousClass77X) r1
            java.lang.String r0 = r1.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a1
            r5 = 1
        L_0x01a1:
            if (r2 == 0) goto L_0x01b7
            r15 = 78
            if (r5 == 0) goto L_0x04a6
            goto L_0x0355
        L_0x01a9:
            com.instagram.common.session.UserSession r3 = r10.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313334308079495(0x8102c9000b0787, double:3.0280370662655766E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            goto L_0x01a1
        L_0x01b7:
            r15 = 81
            if (r5 != 0) goto L_0x04a6
        L_0x01bb:
            r15 = 25
            return r15
        L_0x01be:
            boolean r0 = r4.A1M()
            if (r0 == 0) goto L_0x01d5
            X.2FW r3 = X.2FW.A0N
        L_0x01c6:
            X.2FW r0 = X.2FW.A1g
            if (r3 == r0) goto L_0x0429
            X.2FW r0 = X.2FW.A0m
            if (r3 == r0) goto L_0x0429
            X.2FW r0 = X.2FW.A0N
            if (r3 != r0) goto L_0x01eb
            r15 = 96
            return r15
        L_0x01d5:
            X.2FW r3 = r4.A0z
            java.lang.String r2 = r4.A1q
            r0 = 26
            X.Pm0 r1 = new X.Pm0
            r1.<init>(r4, r0)
            X.2FW r0 = X.2FW.A1g
            if (r3 != r0) goto L_0x01c6
            if (r2 != 0) goto L_0x01c6
            r1.invoke()
            r3 = 0
            goto L_0x01c6
        L_0x01eb:
            X.2FW r0 = X.2FW.A0K
            if (r3 == r0) goto L_0x040d
            X.2FW r0 = X.2FW.A1j
            if (r3 != r0) goto L_0x01f6
            r15 = 112(0x70, float:1.57E-43)
            return r15
        L_0x01f6:
            X.2FW r0 = X.2FW.A1k
            if (r3 != r0) goto L_0x01fd
            r15 = 134(0x86, float:1.88E-43)
            return r15
        L_0x01fd:
            X.2FW r0 = X.2FW.A1A
            if (r3 != r0) goto L_0x0223
            r15 = 138(0x8a, float:1.93E-43)
            return r15
        L_0x0204:
            java.lang.Object r2 = r4.A1T
            X.7FJ r2 = (X.AnonymousClass7FJ) r2
            r2.getClass()
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0216
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0217
        L_0x0216:
            r0 = 1
        L_0x0217:
            r1 = r0 ^ 1
            X.1Xj r0 = r2.A01
            if (r0 == 0) goto L_0x0229
            r15 = 44
            if (r1 != 0) goto L_0x04a6
            goto L_0x0355
        L_0x0223:
            X.2FW r0 = X.2FW.A0O
            r15 = 150(0x96, float:2.1E-43)
            if (r3 == r0) goto L_0x04a6
        L_0x0229:
            r15 = 70
            return r15
        L_0x022c:
            X.3tI r4 = r4.A0P()
            r15 = 61
            if (r4 == 0) goto L_0x04a6
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318187621521386(0x810733001117ea, double:3.031106321228953E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x04a6
            X.2FW r0 = r4.A0F
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x071f
            r0 = 3
            if (r1 == r0) goto L_0x071c
            r0 = 11
            if (r1 == r0) goto L_0x071f
            r0 = 4
            if (r1 == r0) goto L_0x0272
            r0 = 12
            if (r1 == r0) goto L_0x0265
            r0 = 14
            if (r1 == r0) goto L_0x0719
            r0 = 96
            if (r1 == r0) goto L_0x071f
            return r15
        L_0x0265:
            X.53G r0 = r4.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r15 = 139(0x8b, float:1.95E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 140(0x8c, float:1.96E-43)
            return r15
        L_0x0272:
            X.4ik r0 = r4.A07
            if (r0 == 0) goto L_0x0285
            java.lang.String r1 = r0.A09
        L_0x0278:
            java.lang.String r0 = "permanent"
            boolean r0 = r0.equals(r1)
            r15 = 120(0x78, float:1.68E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 121(0x79, float:1.7E-43)
            return r15
        L_0x0285:
            r1 = 0
            goto L_0x0278
        L_0x0287:
            X.3tI r9 = r4.A0P()
            java.lang.Object r0 = r4.A1T
            com.instagram.model.direct.gifs.DirectAnimatedMedia r0 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r0
            if (r0 != 0) goto L_0x02e8
            r0 = 0
        L_0x0292:
            java.lang.String r8 = "permanent"
            r11 = 96
            r7 = 14
            r6 = 12
            r5 = 4
            r4 = 11
            r3 = 3
            r2 = 2
            if (r0 == 0) goto L_0x02eb
            if (r9 == 0) goto L_0x02c8
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r12 = r0.A00
            X.0Tu r10 = X.0Tu.A05
            r0 = 2342161196835018727(0x20810733000e17e7, double:4.06404913686056E-152)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x02c8
            X.2FW r0 = r9.A0F
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0728
            if (r0 == r3) goto L_0x0725
            if (r0 == r4) goto L_0x0728
            if (r0 == r5) goto L_0x02d7
            if (r0 == r6) goto L_0x02ca
            if (r0 == r7) goto L_0x0722
            if (r0 == r11) goto L_0x0728
        L_0x02c8:
            r11 = 3
            return r11
        L_0x02ca:
            X.53G r0 = r9.A0G
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r0.A05
            r15 = 147(0x93, float:2.06E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 148(0x94, float:2.07E-43)
            return r15
        L_0x02d7:
            X.4ik r0 = r9.A07
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = r0.A09
            boolean r0 = r8.equals(r0)
            r15 = 142(0x8e, float:1.99E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 143(0x8f, float:2.0E-43)
            return r15
        L_0x02e8:
            boolean r0 = r0.A06
            goto L_0x0292
        L_0x02eb:
            r15 = 7
            if (r9 == 0) goto L_0x04a6
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r12 = r0.A00
            X.0Tu r10 = X.0Tu.A05
            r0 = 2342161196835018727(0x20810733000e17e7, double:4.06404913686056E-152)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x04a6
            X.2FW r0 = r9.A0F
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0731
            if (r0 == r3) goto L_0x072e
            if (r0 == r4) goto L_0x0731
            if (r0 == r5) goto L_0x0321
            if (r0 == r6) goto L_0x0314
            if (r0 == r7) goto L_0x072b
            if (r0 == r11) goto L_0x0731
            return r15
        L_0x0314:
            X.53G r0 = r9.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r15 = 144(0x90, float:2.02E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 145(0x91, float:2.03E-43)
            return r15
        L_0x0321:
            X.4ik r0 = r9.A07
            if (r0 == 0) goto L_0x04a6
            java.lang.String r0 = r0.A09
            boolean r0 = r8.equals(r0)
            r15 = 109(0x6d, float:1.53E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 110(0x6e, float:1.54E-43)
            return r15
        L_0x0332:
            java.lang.Object r0 = r4.A1T
            r0.getClass()
            X.Cw5 r0 = (X.C45425Cw5) r0
            X.0qQ.A0B(r0, r3)
            java.lang.String r0 = r0.A08
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0734
            com.instagram.common.session.UserSession r3 = r10.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313334308341643(0x8102c9000f078b, double:3.02803706643136E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r15 = 13
            if (r0 == 0) goto L_0x04a6
        L_0x0355:
            r15 = 43
            return r15
        L_0x0358:
            java.lang.Object r0 = r4.A1T
            r0.getClass()
            X.N4Q r0 = (X.N4Q) r0
            X.0qQ.A0B(r0, r3)
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x036e
            int r0 = r0.length()
            r15 = 27
            if (r0 != 0) goto L_0x04a6
        L_0x036e:
            r15 = 26
            return r15
        L_0x0371:
            java.lang.Object r5 = r4.A1T
            r5.getClass()
            X.7FN r5 = (X.AnonymousClass7FN) r5
            boolean r10 = X.OXE.A02(r5)
            X.0qQ.A0B(r5, r3)
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.COUNTDOWN
            r9 = 1
            r8 = 0
            if (r1 != r0) goto L_0x038b
            r8 = 1
        L_0x038b:
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.SMB_SUPPORT
            r7 = 0
            if (r1 != r0) goto L_0x0396
            r7 = 1
        L_0x0396:
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.MENTION
            r6 = 0
            if (r1 != r0) goto L_0x03a1
            r6 = 1
        L_0x03a1:
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.EMOJI_REACTION
            if (r1 == r0) goto L_0x03b4
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.AVATAR_REACTION
            r4 = 0
            if (r1 != r0) goto L_0x03b5
        L_0x03b4:
            r4 = 1
        L_0x03b5:
            X.7Q3 r1 = r5.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.CHALLENGE_NOMINATION
            if (r1 != r0) goto L_0x03bf
            r3 = 1
        L_0x03bf:
            X.7Q3 r0 = r5.A01
            X.7Q3 r2 = X.AnonymousClass7Q3.REPLY_GIF
            r1 = 0
            if (r0 != r2) goto L_0x03c7
            r1 = 1
        L_0x03c7:
            if (r6 != 0) goto L_0x0407
            if (r4 == 0) goto L_0x03da
            X.1Xj r0 = r5.A02
            X.0qQ.A07(r0)
            boolean r0 = r0.A5N()
            if (r0 == 0) goto L_0x0407
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x0407
        L_0x03da:
            if (r8 != 0) goto L_0x0407
            if (r1 != 0) goto L_0x0407
            if (r7 != 0) goto L_0x0407
            if (r3 != 0) goto L_0x0407
        L_0x03e2:
            X.1Xj r0 = r5.A02
            boolean r0 = r0.A5N()
            if (r0 == 0) goto L_0x03ef
            boolean r0 = r5.A0F
            r1 = 1
            if (r0 == 0) goto L_0x03f0
        L_0x03ef:
            r1 = 0
        L_0x03f0:
            r15 = 31
            if (r10 != 0) goto L_0x04a6
            X.7Q3 r0 = r5.A01
            if (r0 != r2) goto L_0x0410
            X.53G r0 = r5.A03
            r0.getClass()
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0409
            r15 = 4
            if (r1 == 0) goto L_0x04a6
            r15 = 74
            return r15
        L_0x0407:
            r9 = 0
            goto L_0x03e2
        L_0x0409:
            r15 = 8
            if (r1 == 0) goto L_0x04a6
        L_0x040d:
            r15 = 72
            return r15
        L_0x0410:
            r11 = 71
            if (r9 == 0) goto L_0x0419
            if (r1 != 0) goto L_0x0039
            r11 = 54
            return r11
        L_0x0419:
            if (r1 == 0) goto L_0x04a6
            r0.getClass()
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x04a6
            r0 = 8
            if (r1 == r0) goto L_0x04a6
        L_0x0429:
            r15 = 71
            return r15
        L_0x042c:
            X.3tI r5 = r4.A0P()
            r15 = 21
            if (r5 == 0) goto L_0x0464
            X.7IK r0 = r10.A0D
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318187621390312(0x810733000f17e8, double:3.0311063211460614E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0464
            X.2FW r0 = r5.A0F
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x075a
            r0 = 3
            if (r1 == r0) goto L_0x0757
            r0 = 11
            if (r1 == r0) goto L_0x075a
            r0 = 4
            if (r1 == r0) goto L_0x047c
            r0 = 12
            if (r1 == r0) goto L_0x046f
            r0 = 14
            if (r1 == r0) goto L_0x0737
            r0 = 96
            if (r1 == r0) goto L_0x075a
        L_0x0464:
            X.1iA r1 = r4.A0W()
            X.1iA r0 = X.1iA.A0E
            if (r1 != r0) goto L_0x04a6
            r15 = 180(0xb4, float:2.52E-43)
            return r15
        L_0x046f:
            X.53G r0 = r5.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r15 = 151(0x97, float:2.12E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 152(0x98, float:2.13E-43)
            return r15
        L_0x047c:
            X.4ik r0 = r5.A07
            if (r0 == 0) goto L_0x048f
            java.lang.String r1 = r0.A09
        L_0x0482:
            java.lang.String r0 = "permanent"
            boolean r0 = r0.equals(r1)
            r15 = 126(0x7e, float:1.77E-43)
            if (r0 == 0) goto L_0x04a6
            r15 = 127(0x7f, float:1.78E-43)
            return r15
        L_0x048f:
            r1 = 0
            goto L_0x0482
        L_0x0491:
            java.lang.String r0 = r7.A03()
            if (r0 != 0) goto L_0x0547
            java.lang.String r1 = "DirectMessageRowData"
            X.2FW r0 = r7.A0F
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.002.A0R(r5, r0)
            X.0wb.A03(r1, r0)
        L_0x04a6:
            return r15
        L_0x04a7:
            X.3tI r7 = r4.A0P()
            X.5FV r1 = r4.A0G()
            if (r7 == 0) goto L_0x0644
            com.instagram.common.session.UserSession r9 = r10.A0d
            X.2FW r0 = r7.A0F
            int r1 = r0.ordinal()
            r13 = 3
            r0 = 2
            java.lang.String r5 = "replied to message type: "
            r15 = 49
            if (r1 == r0) goto L_0x0491
            r12 = 4
            if (r1 == r13) goto L_0x0754
            r14 = 5
            r0 = 22
            if (r1 == r0) goto L_0x05c3
            r0 = 28
            if (r1 == r0) goto L_0x0601
            r11 = 9
            r0 = 20
            if (r1 == r0) goto L_0x05e6
            r0 = 36
            if (r1 == r0) goto L_0x0777
            r8 = 19
            r0 = 46
            if (r1 == r0) goto L_0x0608
            r0 = 45
            if (r1 == r0) goto L_0x0491
            r0 = 11
            if (r1 == r0) goto L_0x0491
            if (r1 == r12) goto L_0x0631
            r0 = 52
            if (r1 == r0) goto L_0x0751
            r0 = 96
            if (r1 == r0) goto L_0x0491
            r0 = 53
            if (r1 == r0) goto L_0x05e6
            r0 = 23
            if (r1 == r0) goto L_0x05ba
            switch(r1) {
                case 12: goto L_0x05f4;
                case 13: goto L_0x05e9;
                case 14: goto L_0x074e;
                default: goto L_0x04fa;
            }
        L_0x04fa:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r7.A0I
            if (r0 == 0) goto L_0x05a1
            X.2FW r2 = X.2FW.A0N
        L_0x0500:
            com.google.common.collect.ImmutableList r1 = r7.A01()
            if (r1 == 0) goto L_0x04a6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04a6
            int r6 = r1.size()
            r0 = 1
            if (r6 == r0) goto L_0x051d
            java.lang.Object r0 = r1.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            int r0 = r0.A02
            if (r0 != r11) goto L_0x04a6
        L_0x051d:
            java.lang.Object r3 = r1.get(r3)
            X.3tC r3 = (X.C254873tC) r3
            X.0tS r15 = r10.A0I
            X.0s0 r6 = r15.A1d
            X.0YZ[] r0 = X.0tS.A4G
            r0 = r0[r14]
            java.lang.Object r0 = r6.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r6 = ", replied to message layout type: "
            if (r0 != 0) goto L_0x073a
            X.2FW r0 = X.2FW.A1g
            if (r2 == r0) goto L_0x0541
            X.2FW r0 = X.2FW.A0m
            if (r2 != r0) goto L_0x054a
        L_0x0541:
            java.lang.String r0 = r7.A03()
            if (r0 == 0) goto L_0x054a
        L_0x0547:
            r11 = 50
            return r11
        L_0x054a:
            X.2FW r0 = X.2FW.A0N
            if (r2 == r0) goto L_0x05e6
            int r2 = r3.A02
            if (r2 != r11) goto L_0x055b
            int r0 = r1.size()
            if (r0 > r13) goto L_0x0613
            r11 = 94
            return r11
        L_0x055b:
            if (r2 != r14) goto L_0x0560
            r11 = 77
            return r11
        L_0x0560:
            X.2FW r1 = r7.A0F
            X.2FW r0 = X.2FW.A20
            r11 = 87
            if (r1 == r0) goto L_0x0039
            if (r2 != r12) goto L_0x0576
            X.7SD r0 = r10.A0G
            X.3Tu r0 = r0.A0H
            boolean r0 = X.C3263776n.A01(r9, r0, r4, r3)
            if (r0 == 0) goto L_0x0039
            goto L_0x0777
        L_0x0576:
            X.2FW r0 = X.2FW.A1w
            if (r1 == r0) goto L_0x0777
            if (r2 != 0) goto L_0x0584
            X.3tD r1 = r3.A0Q
            X.3tD r0 = X.C254883tD.GRID_VIEW_3X2
            if (r1 != r0) goto L_0x0584
            goto L_0x0777
        L_0x0584:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r3.A0X
            if (r0 == 0) goto L_0x058c
            if (r2 != 0) goto L_0x05e6
            goto L_0x0777
        L_0x058c:
            if (r2 != 0) goto L_0x0596
            boolean r0 = r4.A1S()
            if (r0 == 0) goto L_0x0596
            goto L_0x0777
        L_0x0596:
            java.lang.String r0 = r3.A11
            if (r0 != 0) goto L_0x0547
            if (r2 == 0) goto L_0x0777
            if (r2 != r8) goto L_0x073a
            r11 = 176(0xb0, float:2.47E-43)
            return r11
        L_0x05a1:
            X.2FW r2 = r7.A0E
            java.lang.String r6 = r7.A03()
            r0 = 27
            X.Pm0 r1 = new X.Pm0
            r1.<init>(r7, r0)
            X.2FW r0 = X.2FW.A1g
            if (r2 != r0) goto L_0x0500
            if (r6 != 0) goto L_0x0500
            r1.invoke()
            r2 = 0
            goto L_0x0500
        L_0x05ba:
            X.2FW r1 = r7.A0E
            X.2FW r0 = X.2FW.A1j
            if (r1 != r0) goto L_0x04fa
            r11 = 107(0x6b, float:1.5E-43)
            return r11
        L_0x05c3:
            java.lang.String r0 = r7.A03()
            if (r0 != 0) goto L_0x0547
            X.7FN r2 = r7.A03
            if (r2 == 0) goto L_0x04a6
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x04a6
            X.7Q3 r1 = r2.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.MENTION
            if (r1 != r0) goto L_0x04a6
            X.1Xj r0 = r2.A02
            boolean r0 = r0.A5N()
            if (r0 == 0) goto L_0x05e6
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x04a6
        L_0x05e6:
            r11 = 48
            return r11
        L_0x05e9:
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = r7.A0H
            com.instagram.model.direct.stickerstore.DirectStoreSticker r0 = X.C45892D9v.A01(r0)
            if (r0 == 0) goto L_0x04a6
            r11 = 182(0xb6, float:2.55E-43)
            return r11
        L_0x05f4:
            X.53G r0 = r7.A0G
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r0.A05
            r11 = 89
            if (r0 == 0) goto L_0x0039
            r11 = 90
            return r11
        L_0x0601:
            X.7FJ r0 = r7.A04
            if (r0 == 0) goto L_0x04a6
            X.1Xj r0 = r0.A01
            goto L_0x060e
        L_0x0608:
            X.77X r0 = r7.A02
            if (r0 == 0) goto L_0x04a6
            X.1Xj r0 = r0.A01
        L_0x060e:
            if (r0 == 0) goto L_0x04a6
            r15 = 48
            return r15
        L_0x0613:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r3.A0X
            if (r0 == 0) goto L_0x062e
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            if (r1 <= 0) goto L_0x062e
            if (r0 <= 0) goto L_0x062e
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 189(0xbd, float:2.65E-43)
            if (r0 > 0) goto L_0x0039
        L_0x062e:
            r11 = 95
            return r11
        L_0x0631:
            X.4ik r0 = r7.A07
            if (r0 == 0) goto L_0x0777
            java.lang.String r1 = r0.A09
            java.lang.String r0 = "permanent"
            boolean r0 = r0.equals(r1)
            r11 = 51
            if (r0 == 0) goto L_0x0039
            r11 = 52
            return r11
        L_0x0644:
            X.5FV r0 = X.AnonymousClass5FV.None
            if (r1 == r0) goto L_0x0651
            boolean r0 = r1.A01
            r11 = 46
            if (r0 == 0) goto L_0x0039
            r11 = 116(0x74, float:1.63E-43)
            return r11
        L_0x0651:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r4.A13
            r11 = 45
            if (r0 == 0) goto L_0x0039
            r11 = 170(0xaa, float:2.38E-43)
            return r11
        L_0x065a:
            com.instagram.common.session.UserSession r2 = r10.A0d
            X.3tI r0 = r4.A0P()
            if (r0 == 0) goto L_0x0676
            X.2FW r0 = r0.A0F
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x067e
            r0 = 3
            if (r1 == r0) goto L_0x067b
            r0 = 11
            if (r1 == r0) goto L_0x067e
            r0 = 96
            if (r1 == r0) goto L_0x067e
        L_0x0676:
            int r11 = r10.A00(r2, r4)
            return r11
        L_0x067b:
            r11 = 100
            return r11
        L_0x067e:
            r11 = 99
            return r11
        L_0x0681:
            r11 = 183(0xb7, float:2.56E-43)
            return r11
        L_0x0684:
            r11 = 163(0xa3, float:2.28E-43)
            return r11
        L_0x0687:
            r11 = 149(0x95, float:2.09E-43)
            return r11
        L_0x068a:
            r11 = 67
            return r11
        L_0x068d:
            r11 = 65
            return r11
        L_0x0690:
            r11 = 39
            return r11
        L_0x0693:
            r11 = 5
            return r11
        L_0x0695:
            r11 = 66
            return r11
        L_0x0698:
            r11 = 62
            return r11
        L_0x069b:
            r11 = 29
            return r11
        L_0x069e:
            r11 = 58
            return r11
        L_0x06a1:
            r11 = 162(0xa2, float:2.27E-43)
            return r11
        L_0x06a4:
            r11 = 1
            return r11
        L_0x06a6:
            r11 = 12
            return r11
        L_0x06a9:
            r11 = 11
            return r11
        L_0x06ac:
            r11 = 30
            return r11
        L_0x06af:
            r11 = 23
            return r11
        L_0x06b2:
            X.OMp r2 = r4.A0p
            r2.getClass()
            com.instagram.model.direct.gifs.DirectAnimatedMedia r0 = r2.A00()
            if (r0 == 0) goto L_0x06c0
            r15 = 41
            return r15
        L_0x06c0:
            java.lang.String r0 = r2.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06e0
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x06e0
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x06e3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x06e3
            java.lang.String r0 = "❤"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x06e3
        L_0x06e0:
            r15 = 42
            return r15
        L_0x06e3:
            r15 = 40
            return r15
        L_0x06e6:
            X.3tI r1 = r4.A0P()
            java.lang.Object r0 = r4.A1T
            if (r1 == 0) goto L_0x0701
            if (r0 == 0) goto L_0x0701
            X.2FW r0 = r1.A0F
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0704
            r0 = 11
            if (r1 == r0) goto L_0x0704
            r0 = 96
            if (r1 == r0) goto L_0x0704
        L_0x0701:
            r15 = 181(0xb5, float:2.54E-43)
            return r15
        L_0x0704:
            r15 = 191(0xbf, float:2.68E-43)
            return r15
        L_0x0707:
            r15 = 137(0x89, float:1.92E-43)
            return r15
        L_0x070a:
            r15 = 136(0x88, float:1.9E-43)
            return r15
        L_0x070d:
            r15 = 135(0x87, float:1.89E-43)
            return r15
        L_0x0710:
            r15 = 133(0x85, float:1.86E-43)
            return r15
        L_0x0713:
            r15 = 132(0x84, float:1.85E-43)
            return r15
        L_0x0716:
            r15 = 131(0x83, float:1.84E-43)
            return r15
        L_0x0719:
            r15 = 119(0x77, float:1.67E-43)
            return r15
        L_0x071c:
            r15 = 118(0x76, float:1.65E-43)
            return r15
        L_0x071f:
            r15 = 117(0x75, float:1.64E-43)
            return r15
        L_0x0722:
            r15 = 141(0x8d, float:1.98E-43)
            return r15
        L_0x0725:
            r15 = 104(0x68, float:1.46E-43)
            return r15
        L_0x0728:
            r15 = 102(0x66, float:1.43E-43)
            return r15
        L_0x072b:
            r15 = 108(0x6c, float:1.51E-43)
            return r15
        L_0x072e:
            r15 = 106(0x6a, float:1.49E-43)
            return r15
        L_0x0731:
            r15 = 103(0x67, float:1.44E-43)
            return r15
        L_0x0734:
            r15 = 14
            return r15
        L_0x0737:
            r15 = 125(0x7d, float:1.75E-43)
            return r15
        L_0x073a:
            java.lang.String r2 = "DirectMessageRowData"
            X.2FW r0 = r7.A0F
            java.lang.String r1 = r0.toString()
            int r0 = r3.A02
            java.lang.String r0 = X.002.A07(r0, r5, r1, r6)
            X.0wb.A03(r2, r0)
            r11 = 85
            return r11
        L_0x074e:
            r11 = 53
            return r11
        L_0x0751:
            r11 = 185(0xb9, float:2.59E-43)
            return r11
        L_0x0754:
            r11 = 47
            return r11
        L_0x0757:
            r15 = 124(0x7c, float:1.74E-43)
            return r15
        L_0x075a:
            r15 = 123(0x7b, float:1.72E-43)
            return r15
        L_0x075d:
            com.google.common.collect.ImmutableList r0 = r4.A0H()
            if (r0 == 0) goto L_0x077a
            com.google.common.collect.ImmutableList r0 = r4.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r0.A0c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x077a
        L_0x0777:
            r11 = 84
            return r11
        L_0x077a:
            com.instagram.common.session.UserSession r0 = r10.A0d
            int r11 = r10.A00(r0, r4)
            return r11
        L_0x0781:
            r11 = 24
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LQ.getType():int");
    }

    public AnonymousClass7LQ(UserSession userSession, AnonymousClass7SD r7, C254703su r8, User user) {
        long j;
        ImmutableMap immutableMap;
        ImmutableMap immutableMap2;
        ImmutableList of;
        Integer num;
        this.A0d = userSession;
        this.A0G = r7;
        this.A0e = r8;
        this.A0K = user;
        long A0D2 = r8.A0D();
        this.A07 = A0D2;
        if (r8.A1P != null) {
            j = r8.C7c();
        } else {
            j = 0;
        }
        this.A08 = j;
        this.A0F = new C327637Bp(A0D2, j);
        synchronized (r8) {
            LinkedHashMap linkedHashMap = r8.A1y;
            if (linkedHashMap != null) {
                immutableMap = ImmutableMap.copyOf(linkedHashMap);
            } else {
                immutableMap = null;
            }
        }
        if (immutableMap == null || immutableMap.isEmpty()) {
            immutableMap2 = RegularImmutableMap.A02;
        } else {
            Set entrySet = immutableMap.entrySet();
            0qQ.A07(entrySet);
            List<Map.Entry> A0g = 00k.A0g(entrySet, new C3255773e());
            int A0L2 = 0se.A0L(0Yv.A1E(A0g, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
            for (Map.Entry entry : A0g) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            immutableMap2 = ImmutableMap.copyOf(linkedHashMap2);
        }
        0qQ.A07(immutableMap2);
        this.A0B = immutableMap2;
        ImmutableList A0J2 = r8.A0J();
        if (A0J2 == null || A0J2.isEmpty()) {
            of = ImmutableList.of();
            0qQ.A07(of);
        } else {
            of = C66850Mdj.A01(A0J2, A0J2.size());
        }
        this.A0A = of;
        if (!r7.A1C) {
            num = AnonymousClass05K.A00;
        } else if (r8.A0o() == null) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A0N = num;
        this.A0I = 0tS.A00();
        this.A0D = new AnonymousClass7IK(userSession);
    }
}
