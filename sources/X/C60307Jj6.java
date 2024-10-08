package X;

import com.instagram.android.R;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.Map;

/* renamed from: X.Jj6  reason: case insensitive filesystem */
public final class C60307Jj6 extends 2YL {
    public final LTO A00;
    public final LAZ A01;
    public final C272324kW A02;
    public final UserSession A03;
    public final OnboardingRepository A04;
    public final MonetizationRepository A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(MMK.A00(this, 36));
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final C63039KqU A0E;

    public C60307Jj6(LTO lto, C63039KqU kqU, LAZ laz, C272324kW r17, UserSession userSession, OnboardingRepository onboardingRepository, MonetizationRepository monetizationRepository) {
        OnboardingRepository onboardingRepository2 = onboardingRepository;
        MonetizationRepository monetizationRepository2 = monetizationRepository;
        C51972G9s.A1D(monetizationRepository2, onboardingRepository2);
        C272324kW r4 = r17;
        C51972G9s.A1E(lto, r4);
        this.A03 = userSession;
        this.A01 = laz;
        this.A05 = monetizationRepository2;
        this.A04 = onboardingRepository2;
        this.A0E = kqU;
        this.A00 = lto;
        this.A02 = r4;
        1HR A0w = G9w.A0w();
        this.A07 = A0w;
        this.A08 = 0u9.A04(A0w);
        02z A10 = C51970G9q.A10(true);
        this.A0C = A10;
        02z A102 = DbS.A10(false);
        this.A0A = A102;
        02z A103 = DbS.A10(false);
        this.A0B = A103;
        02z A012 = 106.A01((Object) null);
        this.A0D = A012;
        this.A09 = new C62170rn(new MHA(34, (AnonymousClass4D7) null), AnonymousClass10H.A02(new MI7(this, (AnonymousClass4D7) null, 1), A10, A102, MC9.A00(JTO.A1I(new C59677JTi(this, (AnonymousClass4D7) null, 32), this.A05.A0F), 10), MC9.A00(JTO.A1I(new C59677JTi(this, (AnonymousClass4D7) null, 33), this.A01.A05), 11), AnonymousClass10H.A03(new C66189MHa(this, (AnonymousClass4D7) null, 0), A012, A103)));
    }

    public final C65488LuC A02(C61039Jvd jvd, C61077JwF jwF) {
        Integer num;
        Integer num2;
        int i;
        C61039Jvd jvd2 = jvd;
        0qQ.A0B(jvd2, 0);
        MonetizationEligibilityDecision monetizationEligibilityDecision = (MonetizationEligibilityDecision) jvd2.A01;
        int ordinal = monetizationEligibilityDecision.ordinal();
        if (ordinal == 2) {
            num = Integer.valueOf(R.drawable.instagram_circle_check_pano_outline_24);
            num2 = Integer.valueOf(R.attr.igds_color_success);
            i = 2131953068;
        } else if (ordinal == 1) {
            num = Integer.valueOf(R.drawable.instagram_warning_pano_outline_24);
            num2 = Integer.valueOf(R.attr.igds_color_gradient_orange);
            i = 2131953067;
        } else if (ordinal == 3 || ordinal == 4) {
            num = Integer.valueOf(R.drawable.instagram_circle_x_pano_outline_24);
            num2 = Integer.valueOf(R.attr.igds_color_error_or_destructive);
            i = 2131953070;
        } else {
            throw C51973G9u.A0g(monetizationEligibilityDecision, "Unsupported eligibility decision type ", AnonymousClass7TE.A1A());
        }
        Integer valueOf = Integer.valueOf(i);
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = valueOf.intValue();
        return new C65488LuC(LYA.A00(jvd2, jwF, this, 1), (C266444Yx) null, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, ML9.A00, false, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r12.A02 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03(X.C61039Jvd r12, X.C61077JwF r13) {
        /*
            r11 = this;
            r1 = 0
            X.0qQ.A0B(r12, r1)
            boolean r9 = r12.A05
            if (r9 != 0) goto L_0x000f
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x000f
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x000f:
            X.01N r2 = X.0jo.A1H()
            r10 = 1
            if (r9 == 0) goto L_0x001b
            boolean r0 = r12.A02
            r8 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            X.LsC r5 = new X.LsC
            r5.<init>(r1, r13, r11, r12)
            r4 = 0
            r6 = 2131430684(0x7f0b0d1c, float:1.8483076E38)
            r7 = 2131953078(0x7f1305b6, float:1.9542617E38)
            X.LuB r3 = new X.LuB
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.add(r3)
            if (r9 == 0) goto L_0x004c
            X.4kW r3 = r11.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            com.instagram.common.session.UserSession r0 = r11.A03
            boolean r0 = r3.A03(r0, r1, r10)
            r1 = 2131953079(0x7f1305b7, float:1.9542619E38)
            if (r0 == 0) goto L_0x0044
            r1 = 2131953080(0x7f1305b8, float:1.954262E38)
        L_0x0044:
            X.Lu4 r0 = new X.Lu4
            r0.<init>(r1)
            r2.add(r0)
        L_0x004c:
            X.01N r0 = X.0jo.A1I(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60307Jj6.A03(X.Jvd, X.JwF):java.util.List");
    }

    public static final Map A00(ContentAppreciationMetricsDataImpl contentAppreciationMetricsDataImpl) {
        ContentAppreciationMetricsDataImpl.EstimatedEarnings A0E2;
        String A082;
        long j;
        String optionalStringField;
        Long A0n;
        String A002 = AnonymousClass000.A00(2974);
        if (!contentAppreciationMetricsDataImpl.hasFieldValue(A002) || (A0E2 = contentAppreciationMetricsDataImpl.A0E()) == null || (A082 = A0E2.A08("amount_with_offset")) == null || 00y.A0n(10, A082) == null) {
            return null;
        }
        long coercedIntField = (long) contentAppreciationMetricsDataImpl.getCoercedIntField(1, A002);
        ContentAppreciationMetricsDataImpl.EstimatedEarnings A0E3 = contentAppreciationMetricsDataImpl.A0E();
        if (A0E3 == null || (optionalStringField = A0E3.getOptionalStringField(1, "amount_with_offset")) == null || (A0n = 00y.A0n(10, optionalStringField)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        return AnonymousClass7TF.A0w(Long.valueOf(coercedIntField), Long.valueOf(j));
    }

    public static final void A01(C61039Jvd jvd, C61077JwF jwF, C60307Jj6 jj6) {
        Map map;
        LTO lto = jj6.A00;
        Integer num = AnonymousClass05K.A01;
        Integer num2 = AnonymousClass05K.A0u;
        Boolean valueOf = Boolean.valueOf(jvd.A05);
        Boolean valueOf2 = Boolean.valueOf(jvd.A02);
        if (jwF != null) {
            map = (Map) jwF.A00;
        } else {
            map = null;
        }
        lto.A08(valueOf, valueOf2, Boolean.valueOf(jvd.A03), Boolean.valueOf(jvd.A04), num, num2, map, (Map) null, 0Yt.A0E());
        MGE.A01(jj6, "https://help.instagram.com/738469380549477", C318116oQ.A00(jj6), 5);
    }

    public final void onCleared() {
        this.A05.A0E.Epw(AnonymousClass2o7.LOADING);
    }

    public final void A04(boolean z) {
        C318136oS A002 = C318116oQ.A00(this);
        MHA mha = new MHA(this, (AnonymousClass4D7) null, 30);
        19B r4 = 19B.A00;
        1Eo.A05(r4, new MHA(this, (AnonymousClass4D7) null, 31), C51967G9n.A0M(this, r4, mha, A002));
        if (z) {
            this.A00.A09((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, AnonymousClass05K.A0u, (Map) null);
            FCM.A02(EXJ.A02, this.A05, new JJQ(this, 21));
            1Eo.A05(r4, new MHA(this, (AnonymousClass4D7) null, 29), MHA.A00(this, r4, C318116oQ.A00(this), 28));
        }
    }
}
