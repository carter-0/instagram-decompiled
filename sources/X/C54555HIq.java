package X;

import android.content.Context;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.HIq  reason: case insensitive filesystem */
public final class C54555HIq extends C56604I4d {
    public C262204Co A00;
    public C262204Co A01;
    public C262204Co A02;
    public boolean A03;
    public final C56564I1s A04;
    public final HMQ A05;
    public final C56144HtW A06;
    public final Integer A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final 0sP A0C;
    public final boolean A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F;

    public C54555HIq(Context context, FoaUserSession foaUserSession, C56144HtW htW, 0sP r10) {
        super(context, foaUserSession);
        HMQ hmq;
        Integer num;
        this.A06 = htW;
        this.A0C = r10;
        0eO r3 = 0eO.A02;
        this.A09 = AnonymousClass0eN.A00(r3, C58714IwN.A01(foaUserSession, 18));
        this.A08 = AnonymousClass0eN.A00(r3, C58714IwN.A01(foaUserSession, 17));
        int intValue = htW.A02.intValue();
        if (intValue == 1) {
            hmq = HMQ.CAPTURE_CONSENT;
        } else if (intValue != 2) {
            if (intValue != 0) {
                if (intValue != 3) {
                    throw AnonymousClass7TE.A1K();
                } else if (AnonymousClass7TF.A1Z(this.A09)) {
                    hmq = HMQ.IMAGE_PICKER;
                }
            }
            hmq = (HMQ) this.A08.getValue();
        } else {
            hmq = HMQ.PRE_CAPTURE;
        }
        this.A05 = hmq;
        this.A0D = 182.A06(0Tu.A05, C56316HwT.A00(foaUserSession), 36328894973886118L);
        this.A0E = "IMPLEMENTATION";
        this.A04 = C250563lf.A0B("IMPLEMENTATION").A00;
        this.A0F = DbS.A0I(C58714IwN.A01(this, 25), C58688Ivx.A00(foaUserSession, this, 13), C317496nM.A00, DbS.A0z(C52970GgN.class));
        this.A0B = AnonymousClass0eN.A00(r3, C58560Itt.A00);
        this.A0A = AnonymousClass0eN.A00(r3, C58688Ivx.A00(foaUserSession, this, 12));
        if (htW.A09) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        this.A07 = num;
    }

    public static final void A02(C54555HIq hIq) {
        C54555HIq hIq2 = hIq;
        C56145HtX htX = (C56145HtX) hIq.A03.getValue();
        String A16 = AnonymousClass7TE.A16(hIq.A00, 2131966333);
        I1u i1u = new I1u(HNN.A0G, (HNN) null, HNO.A0W, (CharSequence) null, AnonymousClass05K.A00, "Close Bottom Sheet", C59105J6n.A02(hIq, 21));
        Integer num = htX.A08;
        long j = htX.A00;
        boolean z = htX.A0B;
        boolean z2 = htX.A09;
        2WX r4 = htX.A02;
        hIq2.A0G(new C56145HtX(htX.A01, r4, (C56143HtV) null, i1u, A16, htX.A05, num, htX.A07, j, z, z2, htX.A0A));
    }

    public static final C52970GgN A00(C54555HIq hIq) {
        return (C52970GgN) hIq.A0F.getValue();
    }

    public static final void A01(C54555HIq hIq) {
        C56143HtV htV;
        C54555HIq hIq2 = hIq;
        C55670HlT hlT = new C55670HlT(C58714IwN.A01(hIq2, 19));
        Integer num = hIq2.A07;
        C58688Ivx A002 = C58688Ivx.A00(hlT, hIq2, 11);
        I4X i4x = new I4X(CdsBottomSheetDimmingBehaviour.Default.A00, C46626Di6.FULL_SHEET, num, (Integer) null, A002, 48, false);
        J6T j6t = new J6T(49, (Object) hlT, (Object) hIq2);
        if (hIq2.A0I()) {
            hIq2.A0E(i4x, "ExtendedCaptureScreen", j6t);
        } else {
            hIq2.A0F(i4x, "ExtendedCaptureScreen", j6t);
        }
        if (!hIq2.A06.A0A) {
            Integer num2 = AnonymousClass05K.A01;
            Context context = hIq2.A00;
            htV = new C56143HtV((HNN) null, HNO.A0W, HNO.A0O, context.getString(2131966031), num2, AnonymousClass7TE.A16(context, 2131966031), C59346JFy.A00(hIq2, 46), true);
        } else {
            htV = null;
        }
        C56145HtX htX = (C56145HtX) hIq2.A03.getValue();
        Context context2 = hIq2.A00;
        String A16 = AnonymousClass7TE.A16(context2, 2131966333);
        String A162 = AnonymousClass7TE.A16(context2, 2131966346);
        I1u i1u = new I1u(HNN.A0E, (HNN) null, HNO.A0W, (CharSequence) null, AnonymousClass05K.A00, A162, C59105J6n.A02(hIq2, 22));
        Integer num3 = htX.A08;
        long j = htX.A00;
        boolean z = htX.A0B;
        2WX r4 = htX.A02;
        hIq2.A0G(new C56145HtX(htX.A01, r4, htV, i1u, A16, htX.A05, num3, htX.A07, j, z, true, htX.A0A));
        I49.A01(C54687HOs.A08, (I49) hIq2.A0A.getValue());
    }

    public static final void A03(C54555HIq hIq, boolean z) {
        String str;
        String str2 = C250563lf.A0B(hIq.A0E).A02;
        if (z) {
            str = "MEmuConsentScreen";
        } else {
            str = "MEmuOnboardingScreen";
        }
        C73948PmS pmS = new C73948PmS(hIq, str2, 5, z);
        if (hIq.A0I()) {
            hIq.A0E(I4X.A00(C46626Di6.FULL_SHEET, AnonymousClass05K.A0C, (Integer) null, C58714IwN.A01(hIq, 21), 48), str, C59105J6n.A02(pmS, 17));
        } else {
            hIq.A0F(I4X.A00(C46626Di6.FULL_SHEET, AnonymousClass05K.A0C, (Integer) null, C58714IwN.A01(hIq, 22), 48), str, C59105J6n.A02(pmS, 18));
        }
        A02(hIq);
    }

    public final void A0J() {
        if (this.A06.A02 != AnonymousClass05K.A0C) {
            I49.A01(C54687HOs.A0L, (I49) this.A0A.getValue());
        }
        HMQ hmq = this.A05;
        int ordinal = hmq.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            Integer num = this.A07;
            C58714IwN A012 = C58714IwN.A01(this, 20);
            I4X i4x = new I4X(CdsBottomSheetDimmingBehaviour.Default.A00, C46626Di6.FULL_SHEET, num, (Integer) null, A012, 48, true);
            if (A0I()) {
                C56145HtX htX = (C56145HtX) this.A03.getValue();
                Context context = this.A00;
                String A16 = AnonymousClass7TE.A16(context, 2131966333);
                String A162 = AnonymousClass7TE.A16(context, 2131966346);
                I1u i1u = new I1u(HNN.A0E, (HNN) null, HNO.A0W, (CharSequence) null, AnonymousClass05K.A00, A162, C59105J6n.A02(this, 20));
                Integer num2 = htX.A08;
                long j = htX.A00;
                boolean z2 = htX.A0B;
                C56143HtV htV = htX.A03;
                2WX r5 = htX.A02;
                A0G(new C56145HtX(htX.A01, r5, htV, i1u, A16, htX.A05, num2, htX.A07, j, z2, true, htX.A0A));
                A0E(i4x, "MEmuNuxScreen", C59105J6n.A02(this, 15));
                return;
            }
            A02(this);
            C46626Di6 di6 = C46626Di6.WRAP_CONTENT_SHEET;
            Integer num3 = i4x.A04;
            A0F(new I4X(i4x.A02, di6, num3, i4x.A00, i4x.A05, 48, true), "MEmuNuxScreen", C59105J6n.A02(this, 16));
        } else if (ordinal != 16) {
            if (hmq != HMQ.CAPTURE_CONSENT) {
                z = false;
            }
            A03(this, z);
        } else {
            A01(this);
        }
    }
}
