package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* renamed from: X.6q4  reason: invalid class name and case insensitive filesystem */
public final class C319116q4 {
    public static final C319116q4 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0.A2q != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36324977963774497L) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009b, code lost:
        if (r1.A02 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009f, code lost:
        if (r19 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a1, code lost:
        r3 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a3, code lost:
        if (r3 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a5, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a9, code lost:
        if (r3.A01 == true) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ab, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ad, code lost:
        if (r1 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00af, code lost:
        r2 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b1, code lost:
        if (r2 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b5, code lost:
        if (r2 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b7, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bb, code lost:
        if (r2 != com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bd, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bf, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c1, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c5, code lost:
        if (r1.A0O != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c7, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d2, code lost:
        return new com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r0.A5O);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d6, code lost:
        if (r0.A0t != null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures A00(com.instagram.common.session.UserSession r18, X.C293505kq r19, X.AnonymousClass3Q2 r20, boolean r21, boolean r22) {
        /*
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r0 = r20
            if (r21 != 0) goto L_0x0015
            java.util.List r1 = r0.A4T
            if (r1 == 0) goto L_0x00df
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r2) goto L_0x00df
        L_0x0015:
            r7 = 1
        L_0x0016:
            boolean r8 = r0.A5t
            com.instagram.model.fundraiser.NewFundraiserInfo r1 = r0.A1E
            if (r1 != 0) goto L_0x0021
            java.lang.String r1 = r0.A2q
            r9 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r9 = 1
        L_0x0022:
            X.Jw0 r1 = r0.A0q
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r1.A01()
        L_0x002a:
            r10 = r1 ^ 1
            com.instagram.user.model.UpcomingEventImpl r3 = r0.A1p
            r1 = r19
            if (r3 != 0) goto L_0x0038
            if (r19 == 0) goto L_0x00d9
            com.instagram.user.model.UpcomingEventImpl r3 = r1.A0Q
            if (r3 == 0) goto L_0x00d9
        L_0x0038:
            r11 = 1
        L_0x0039:
            java.lang.String r3 = r0.A2d
            r12 = 0
            if (r3 == 0) goto L_0x003f
            r12 = 1
        L_0x003f:
            java.util.List r3 = r0.A4L
            if (r3 == 0) goto L_0x0049
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0057
        L_0x0049:
            if (r19 == 0) goto L_0x006f
            java.util.List r3 = r1.A0n
            if (r3 == 0) goto L_0x006f
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 != r2) goto L_0x006f
        L_0x0057:
            r6 = r18
            r3 = r22
            boolean r3 = X.C271174i4.A04(r6, r3)
            if (r3 != 0) goto L_0x006f
            X.0Tu r5 = X.0Tu.A05
            r3 = 36324977963774497(0x810d6000013221, double:3.035400561012334E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            r13 = 1
            if (r3 != 0) goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            java.util.List r3 = r0.A4C
            if (r3 == 0) goto L_0x00d3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 != r2) goto L_0x00d3
        L_0x007c:
            r14 = 1
        L_0x007d:
            X.3QO r4 = r0.A1F
            X.3QO r3 = X.AnonymousClass3QO.DEFAULT
            r15 = 0
            if (r4 == r3) goto L_0x0085
            r15 = 1
        L_0x0085:
            X.3QO r3 = X.AnonymousClass3QO.CLOSE_FRIENDS
            r16 = 0
            if (r4 != r3) goto L_0x008d
            r16 = 1
        L_0x008d:
            X.3QO r3 = X.AnonymousClass3QO.FAN_CLUB
            r17 = 0
            if (r4 != r3) goto L_0x0095
            r17 = 1
        L_0x0095:
            if (r19 == 0) goto L_0x009d
            X.JwI r3 = r1.A02
            r18 = 1
            if (r3 != 0) goto L_0x00a1
        L_0x009d:
            r18 = 0
            if (r19 == 0) goto L_0x00ab
        L_0x00a1:
            X.Jw4 r3 = r1.A03
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r3.A01
            r19 = 1
            if (r3 == r2) goto L_0x00af
        L_0x00ab:
            r19 = 0
            if (r1 == 0) goto L_0x00bd
        L_0x00af:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r1.A07
            if (r2 == 0) goto L_0x00bd
            com.instagram.api.schemas.MediaGenAIDetectionMethod r3 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            if (r2 == r3) goto L_0x00bd
            com.instagram.api.schemas.MediaGenAIDetectionMethod r3 = com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF
            r20 = 1
            if (r2 != r3) goto L_0x00c1
        L_0x00bd:
            r20 = 0
            if (r1 == 0) goto L_0x00c7
        L_0x00c1:
            X.4jy r1 = r1.A0O
            r21 = 1
            if (r1 != 0) goto L_0x00c9
        L_0x00c7:
            r21 = 0
        L_0x00c9:
            boolean r0 = r0.A5O
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r6 = new com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures
            r22 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r6
        L_0x00d3:
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = r0.A0t
            r14 = 0
            if (r3 == 0) goto L_0x007d
            goto L_0x007c
        L_0x00d9:
            r11 = 0
            goto L_0x0039
        L_0x00dc:
            r1 = 1
            goto L_0x002a
        L_0x00df:
            java.lang.Boolean r1 = r0.A23
            boolean r1 = X.0qQ.A0K(r1, r3)
            if (r1 != 0) goto L_0x0015
            java.lang.Boolean r1 = r0.A21
            boolean r1 = X.0qQ.A0K(r1, r3)
            if (r1 != 0) goto L_0x0015
            java.lang.Integer r1 = r0.A2C
            if (r1 != 0) goto L_0x0015
            java.util.List r1 = r0.A4N
            if (r1 == 0) goto L_0x0101
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r2) goto L_0x0101
            goto L_0x0015
        L_0x0101:
            java.util.List r1 = r0.A4O
            if (r1 == 0) goto L_0x010f
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r2) goto L_0x010f
            goto L_0x0015
        L_0x010f:
            r7 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319116q4.A00(com.instagram.common.session.UserSession, X.5kq, X.3Q2, boolean, boolean):com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    public static final C46424Del A01(Context context, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        C46424Del del = new C46424Del(str2);
        del.A06 = "SCHEDULED_CONTENT";
        del.A07 = context.getString(2131956687);
        del.A08 = str;
        del.A09(0sr.A1L(new String[]{str}));
        del.A05 = str3;
        del.A0D = true;
        return del;
    }

    public static final void A04(Context context, FragmentActivity fragmentActivity, AnonymousClass2k4 r17, AnonymousClass0iw r18, UserSession userSession, 1Xj r20) {
        Integer Bpd;
        String CDB;
        AnonymousClass0iw r1 = r18;
        0qQ.A0B(r1, 4);
        1Xj r7 = r20;
        boolean A5v = r7.A5v();
        DSX Aqj = r7.A0C.Aqj();
        if (Aqj != null && (Bpd = Aqj.Bpd()) != null) {
            int intValue = Bpd.intValue();
            int i = r7.BR7().A00;
            DSX Aqj2 = r7.A0C.Aqj();
            if (Aqj2 != null && (CDB = Aqj2.CDB()) != null) {
                UserSession userSession2 = userSession;
                LPH lph = new LPH(C59722JVg.RESCHEDULE, r1, userSession2);
                Context context2 = context;
                C46498Dg1 dg1 = new C46498Dg1(context, userSession2);
                int i2 = 2131956676;
                if (A5v) {
                    i2 = 2131956677;
                }
                FragmentActivity fragmentActivity2 = fragmentActivity;
                dg1.A04(new C50073FNo(fragmentActivity2, userSession2, r7, i), i2);
                dg1.A04(new C64258LXk(fragmentActivity2, lph, userSession2, r7, CDB, intValue, A5v), 2131956681);
                dg1.A04(new LXX(context, userSession2, r7, CDB), 2131956693);
                dg1.A02(new C64252LXe(context2, userSession2, r7, CDB, A5v), 2131957531);
                dg1.A02 = r17;
                new C49945FFy(dg1).A03(fragmentActivity2);
            }
        }
    }

    public static final void A05(LPH lph, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        0qQ.A0B(lph, 0);
        if (nonSupportedContentSchedulingFeatures.A06) {
            lph.A08(AnonymousClass05K.A0u, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A00) {
            lph.A08(AnonymousClass05K.A15, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A07) {
            lph.A08(AnonymousClass05K.A1F, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0C) {
            lph.A08(AnonymousClass05K.A1I, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0F) {
            lph.A08(AnonymousClass05K.A02, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A02) {
            lph.A08(AnonymousClass05K.A03, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A04) {
            lph.A08(AnonymousClass05K.A05, AnonymousClass05K.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0A) {
            lph.A08(AnonymousClass05K.A06, AnonymousClass05K.A0Y);
        }
    }

    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A08(userSession, false)) {
            return 182.A06(0Tu.A05, userSession, 36315842568457827L);
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A02(userSession, false) != AnonymousClass05K.A01 || !182.A06(0Tu.A05, userSession, 36325639389066348L)) {
            return false;
        }
        return true;
    }

    public final boolean A09(UserSession userSession) {
        int intValue = A02(userSession, true).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1 || A07(userSession)) {
            return false;
        }
        boolean A06 = 182.A06(0Tu.A05, userSession, 2342168648602629226L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public final boolean A0A(UserSession userSession) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        Integer A02 = A02(userSession, false);
        if (A02 == AnonymousClass05K.A00) {
            r2 = 0Tu.A05;
            j = 36323848387309121L;
        } else if (A02 != AnonymousClass05K.A01) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36325639388869737L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static final void A03(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, LPH lph, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        C358248ab r2 = new C358248ab(context);
        r2.A04();
        r2.A09(2131956692);
        r2.A08(2131956689);
        r2.A0H(new LUE(onClickListener2, lph), 2131956691);
        r2.A0B(new C64206LTw(lph));
        r2.A0I(new LUR(onClickListener, lph, nonSupportedContentSchedulingFeatures), 2131956690);
        AnonymousClass0fN.A00(r2.A02());
    }

    public static final Integer A02(UserSession userSession, boolean z) {
        0Tu r2;
        0Tu r22;
        if (C319126q5.A07(userSession)) {
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            boolean A06 = 182.A06(r22, userSession, 36315842568261216L);
            0qQ.A0A(Boolean.valueOf(A06));
            if (A06) {
                return AnonymousClass05K.A00;
            }
        } else {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            boolean A062 = 182.A06(r2, userSession, 36325639388738663L);
            0qQ.A0A(Boolean.valueOf(A062));
            if (A062) {
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A0C;
    }

    public static final boolean A08(UserSession userSession, boolean z) {
        if (A02(userSession, z) != AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }
}
