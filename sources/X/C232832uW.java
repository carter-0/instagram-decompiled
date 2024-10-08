package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.2uW  reason: invalid class name and case insensitive filesystem */
public final class C232832uW implements C232842uX {
    public final UserSession A00;
    public final C232852uY A01;
    public final StringBuilder A02 = new StringBuilder();

    public final /* bridge */ /* synthetic */ void Cke(0jB r7, 1Nv r8, AnonymousClass4DU r9, int i, int i2) {
        1Xj r3 = (1Xj) r8;
        C232852uY r1 = this.A01;
        0qQ.A0B(r9, 1);
        0qQ.A0B(r3, 2);
        C254523sc A022 = r1.A02(r3, r9, i2);
        if (A022 != null) {
            UserSession userSession = this.A00;
            A022.A8B = C231122qu.A0R(userSession, r3);
            C232852uY.A02.A03(userSession, A022, r3, (AnonymousClass3W1) null, this.A02);
            A00(A022, r3, r9, i2);
            A022.A0E(r7);
            C233822wX.A0E(userSession, A022, r3, r9, i);
        }
    }

    public final /* bridge */ /* synthetic */ void Ckf(1Nv r8, AnonymousClass4DU r9, int i, int i2) {
        1Xj r2 = (1Xj) r8;
        C232852uY r1 = this.A01;
        String A002 = C273654mx.A00(401);
        0qQ.A0B(r2, 2);
        C254523sc A05 = r1.A05(r2, r9, A002, i2, -1);
        if (A05 != null) {
            C233822wX.A0E(this.A00, A05, r2, r9, i);
        }
    }

    public final /* bridge */ /* synthetic */ void Cku(C254223s8 r8, 1Nv r9, AnonymousClass4DU r10, int i, int i2, long j) {
        1Xj r2 = (1Xj) r9;
        C233822wX.A0E(this.A00, this.A01.A01(r8, r2, r10, i2, j), r2, r10, i);
    }

    public final /* bridge */ /* synthetic */ void ClD(1Nv r8, AnonymousClass4DU r9, int i, int i2) {
        1Xj r2 = (1Xj) r8;
        C232852uY r1 = this.A01;
        0qQ.A0B(r2, 2);
        C254523sc A05 = r1.A05(r2, r9, "viewed_impression", i2, -1);
        if (A05 != null) {
            C233822wX.A0E(this.A00, A05, r2, r9, i);
        }
    }

    public final void ChS(1Xj r9, AnonymousClass4DU r10, int i, int i2) {
        1Xj r3 = r9;
        AnonymousClass4DU r4 = r10;
        int i3 = i;
        C254523sc A03 = this.A01.A03(r3, r4, "impression", i3, i2);
        if (A03 != null) {
            UserSession userSession = this.A00;
            A03.A8B = C231122qu.A0R(userSession, r9);
            C233822wX.A0F(userSession, A03, r3, r4, AnonymousClass05K.A01, i3, true);
        }
    }

    public final void ChT(1Xj r9, AnonymousClass4DU r10, int i, int i2) {
        1Xj r3 = r9;
        AnonymousClass4DU r4 = r10;
        int i3 = i;
        C254523sc A03 = this.A01.A03(r3, r4, "sub_impression", i3, i2);
        if (A03 != null) {
            UserSession userSession = this.A00;
            A03.A8B = C231122qu.A0R(userSession, r9);
            C233822wX.A0F(userSession, A03, r3, r4, AnonymousClass05K.A00, i3, true);
        }
    }

    public final void ChU(1Xj r8, AnonymousClass4DU r9, int i, int i2) {
        C232852uY r1 = this.A01;
        String A002 = C273654mx.A00(401);
        1Xj r2 = r8;
        0qQ.A0B(r8, 2);
        AnonymousClass4DU r3 = r9;
        int i3 = i;
        C254523sc A03 = r1.A03(r2, r3, A002, i3, i2);
        if (A03 != null) {
            C233822wX.A0F(this.A00, A03, r2, r3, AnonymousClass05K.A00, i3, true);
        }
    }

    public final void ChW(1Xj r9, AnonymousClass4DU r10, int i, int i2, long j) {
        UserSession userSession = this.A01.A00;
        C254523sc A04 = C254513sb.A04(r9, r10, 002.A0R("carousel_", "time_spent"));
        A04.A0G(userSession, r9);
        A04.A09(i2);
        A04.A0B(j);
        C233822wX.A0F(this.A00, A04, r9, r10, AnonymousClass05K.A00, i, true);
    }

    public final void ChX(1Xj r8, AnonymousClass4DU r9, int i, int i2) {
        C232852uY r1 = this.A01;
        1Xj r2 = r8;
        0qQ.A0B(r8, 2);
        AnonymousClass4DU r3 = r9;
        int i3 = i;
        C254523sc A03 = r1.A03(r2, r3, "viewed_impression", i3, i2);
        if (A03 != null) {
            C233822wX.A0F(this.A00, A03, r2, r3, AnonymousClass05K.A00, i3, true);
        }
    }

    public final /* bridge */ /* synthetic */ void Cir(0jB r15, 1Nv r16, AnonymousClass4DU r17, int i, int i2) {
        1Xj r4 = (1Xj) r16;
        C232852uY r3 = this.A01;
        AnonymousClass4DU r5 = r17;
        0qQ.A0B(r5, 1);
        0qQ.A0B(r4, 2);
        int i3 = i2;
        C254523sc A04 = r3.A04(r4, r5, "impression", i3, -1);
        if (A04 != null) {
            UserSession userSession = this.A00;
            A04.A8B = C231122qu.A0R(userSession, r4);
            C232852uY.A02.A03(userSession, A04, r4, (AnonymousClass3W1) null, this.A02);
            A04.A0E(r15);
            A00(A04, r4, r5, i3);
            C233822wX.A0F(userSession, A04, r4, r5, AnonymousClass05K.A01, i, false);
        }
    }

    public C232832uW(UserSession userSession, C249763kK r3) {
        this.A01 = new C232852uY(userSession, r3);
        this.A00 = userSession;
    }

    public static void A00(C254523sc r4, 1Xj r5, AnonymousClass4DU r6, int i) {
        Integer num;
        if (("feed_timeline".equals(r6.getModuleName()) || "feed_contextual_chain".equals(r6.getModuleName()) || "feed_contextual_keyword".equals(r6.getModuleName())) && r5.CcK()) {
            C238233Bb r3 = C238233Bb.A02;
            r4.A0Q(Integer.valueOf(r3.A00(C267004ai.AD, i)));
            r4.A0S(Integer.valueOf(r3.A00(C267004ai.NETEGO, i)));
            String id = r5.getId();
            0qQ.A0B(id, 0);
            String str = (String) AnonymousClass59U.A00.get(id);
            if (str == null) {
                str = "timeline_request";
            }
            r4.A4T = str;
            C267004ai r2 = C267004ai.STANDALONE_MULTI_AD;
            C267004ai r1 = C267004ai.PAE_MULTI_AD;
            r4.A0R(Integer.valueOf(r3.A01(Arrays.asList(new C267004ai[]{r2, r1}), i)));
            C267004ai A022 = r3.A02(Arrays.asList(new C267004ai[]{r2, r1}), i);
            if (A022 == r1) {
                num = AnonymousClass05K.A0N;
            } else if (A022 == r2) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A00;
            }
            r4.A0U(Integer.valueOf(AnonymousClass59V.A00(num)));
        }
    }
}
