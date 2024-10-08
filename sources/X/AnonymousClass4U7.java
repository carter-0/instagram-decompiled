package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.4U7  reason: invalid class name */
public final class AnonymousClass4U7 {
    public final UserSession A00;
    public final C252593pM A01;
    public final C245813dW A02;
    public final 0Pl A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 5));
    public final 0rQ A05;
    public final C249763kK A06;

    public AnonymousClass4U7(UserSession userSession, C252593pM r4, C245813dW r5, 0Pl r6, C249763kK r7) {
        0qQ.A0B(r4, 2);
        0qQ.A0B(r5, 5);
        this.A00 = userSession;
        this.A01 = r4;
        this.A06 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = new 0rQ(userSession);
    }

    public final int A00(1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        UserSession userSession = this.A00;
        return Arrays.hashCode(new Object[]{Integer.valueOf(C243163Xq.A00(userSession, r4, r5, r6)), Integer.valueOf(((C242923Ws) this.A04.getValue()).A02(userSession, r4, r6))});
    }

    public final AnonymousClass4WX A01(Context context, 1Xj r37, AnonymousClass4DU r38, AnonymousClass3W1 r39, AnonymousClass2xS r40) {
        UserSession userSession;
        0Tu r6;
        long j;
        Float f;
        Integer num;
        String str;
        ClipsShoppingInfoIntf Btl;
        List Bga;
        1Xj r2 = r37;
        0qQ.A0B(r2, 0);
        AnonymousClass3W1 r11 = r39;
        0qQ.A0B(r11, 1);
        Context context2 = context;
        0qQ.A0B(context2, 2);
        AnonymousClass4DU r13 = r38;
        0qQ.A0B(r13, 4);
        AnonymousClass2kQ A002 = C227942kP.A00(r13);
        int A012 = (int) (((float) AnonymousClass0nB.A01(context2)) / r2.A0l());
        C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
        boolean z = false;
        if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null || (Bga = Btl.Bga()) == null || !(!Bga.isEmpty())) {
            userSession = this.A00;
            r6 = 0Tu.A05;
            j = 2342160449509856404L;
        } else {
            userSession = this.A00;
            r6 = 0Tu.A05;
            j = 36317440296096915L;
        }
        if (!182.A06(r6, userSession, j)) {
            z = true;
        }
        C246623eu A1S = r2.A1S();
        if ((A1S == null || !AnonymousClass4U5.A00(A1S)) && !r2.A6U(userSession)) {
            f = null;
        } else {
            f = Float.valueOf(-1.0f);
        }
        if (r2.A6U(userSession)) {
            num = Integer.valueOf(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_media_background)));
        } else {
            num = null;
        }
        boolean A6U = r2.A6U(userSession);
        UserSession userSession2 = this.A05.A00;
        String A042 = 182.A04(r6, userSession2, 36879488307364115L);
        Map map = AnonymousClass4WV.A01;
        AnonymousClass4WV r0 = (AnonymousClass4WV) map.get(A042);
        if (r0 == null) {
            r0 = AnonymousClass4WV.ALMOST_TALL;
        }
        AnonymousClass4WV r3 = AnonymousClass4WV.ALMOST_TALL;
        if (r0 == r3 && ((r2.CcK() || (r0 = (AnonymousClass4WV) map.get(182.A04(r6, userSession2, 36892764050949060L))) == null || r0 == r3) && (r0 = (AnonymousClass4WV) map.get(182.A04(r6, userSession2, 36892764050424769L))) == null)) {
            r0 = r3;
        }
        float A003 = (float) 182.A00(r6, userSession2, 37160963284205737L);
        boolean A0Q = 1sx.A0Q(r2, r11.A03);
        AnonymousClass2xS r1 = r40;
        1Xj A0G = r1.A0G.A0G();
        if (A0G != null) {
            str = A0G.getId();
        } else {
            str = null;
        }
        boolean A0K = 0qQ.A0K(str, r2.getId());
        int A004 = A00(r2, A002, r11);
        AnonymousClass3TO A022 = r1.A02(r2);
        C245853da A013 = r1.A01(r2);
        AnonymousClass4WW r27 = new AnonymousClass4WW(context2, this, r2, r13, A002, r11);
        int i = A012;
        return new AnonymousClass4WX(new C376509Ig(5, (Object) new AnonymousClass9MS(1, this, A002, r11, r2), (Object) new C377089Km(r2, 46), (Object) r27, (Object) new AnonymousClass9LP(this, 4)), r11, r0, A013, A022, f, num, A003, i, A004, z, A6U, A0Q, A0K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r34 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3YB A02(android.content.Context r30, X.1Xj r31, X.AnonymousClass4DU r32, X.AnonymousClass3W1 r33, boolean r34) {
        /*
            r29 = this;
            r17 = 0
            r2 = 1
            r0 = r31
            X.0qQ.A0B(r0, r2)
            r1 = 2
            r5 = r33
            X.0qQ.A0B(r5, r1)
            r19 = 0
            com.instagram.search.common.analytics.SearchContext r21 = new com.instagram.search.common.analytics.SearchContext
            r6 = r21
            r7 = r19
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r23 = ""
            r1 = r29
            com.instagram.common.session.UserSession r4 = r1.A00
            boolean r3 = X.AnonymousClass3Y8.A01(r4, r0, r5)
            if (r3 != 0) goto L_0x0048
            boolean r3 = X.AnonymousClass3Y8.A00(r4, r0)
            if (r3 != 0) goto L_0x0048
            boolean r3 = X.AnonymousClass3Y8.A03(r4, r0, r5)
            if (r3 != 0) goto L_0x0048
            boolean r3 = X.AnonymousClass3Y8.A04(r4, r0, r5)
            if (r3 != 0) goto L_0x0048
            boolean r3 = X.AnonymousClass3Y8.A02(r4, r0, r5)
            if (r3 != 0) goto L_0x0048
            r24 = 0
            if (r34 == 0) goto L_0x004a
        L_0x0048:
            r24 = 1
        L_0x004a:
            r4 = r30
            X.C243693Zv.A00(r4)
            X.3Zu r6 = X.C243683Zu.A0C
            if (r6 != 0) goto L_0x008e
            r3 = 2130970279(0x7f0406a7, float:1.7549264E38)
            r6 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r3 = X.2Yu.A0H(r4, r3)
            int r7 = r4.getColor(r3)
            r5 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r3 = X.2Yu.A0H(r4, r5)
            int r11 = r4.getColor(r3)
            r3 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r12 = r4.getColor(r3)
            int r14 = X.2Yu.A0H(r4, r6)
            int r15 = X.2Yu.A0H(r4, r5)
            int r3 = X.2Yu.A0H(r4, r5)
            int r16 = r4.getColor(r3)
            X.3Zu r6 = new X.3Zu
            r8 = r7
            r9 = r7
            r10 = r7
            r13 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C243683Zu.A0C = r6
        L_0x008e:
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
            X.0rQ r3 = r1.A05
            java.lang.String r1 = r32.getModuleName()
            boolean r27 = r3.A06(r0, r1)
            X.3YB r18 = new X.3YB
            r20 = r6
            r25 = r2
            r26 = r2
            r28 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U7.A02(android.content.Context, X.1Xj, X.4DU, X.3W1, boolean):X.3YB");
    }
}
