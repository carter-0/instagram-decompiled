package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MdQ  reason: case insensitive filesystem */
public final class C66832MdQ {
    public static final C66832MdQ A00 = new Object();

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000f: MOVE  (r3v0 X.Njt) = (r19v0 X.Njt)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final X.N3L A00(com.instagram.common.session.UserSession r18, X.C69354Njt r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32) {
        /*
            r2 = 0
            r9 = r24
            if (r24 == 0) goto L_0x0038
            r10 = r25
            if (r25 == 0) goto L_0x0038
            r15 = r26
            if (r26 == 0) goto L_0x0038
            X.Njt r0 = X.C69354Njt.UNDEFINED
            r3 = r19
            if (r3 == r0) goto L_0x0038
            X.O0Y r0 = X.O0Y.$redex_init_class
            int r1 = r3.ordinal()
            r0 = 1
            r16 = r32
            if (r1 != r0) goto L_0x0039
            X.17i r1 = X.17h.A00(r18)
            java.lang.String r0 = java.lang.String.valueOf(r16)
            com.instagram.user.model.User r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0039
            boolean r0 = r1.CXO()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.isRestricted()
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            return r2
        L_0x0039:
            X.N3L r2 = new X.N3L
            r14 = r31
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66832MdQ.A00(com.instagram.common.session.UserSession, X.Njt, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):X.N3L");
    }

    public static final void A01(UserSession userSession, C46199DQb dQb, 1Av r19, String str, long j) {
        boolean z;
        Integer num;
        UserSession userSession2 = userSession;
        1Av r4 = r19;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, r4);
        0Tu r10 = 0Tu.A06;
        long A01 = 182.A01(r10, userSession2, 36592464231989816L);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j2 = j;
        String valueOf = String.valueOf(j2);
        long millis = timeUnit.toMillis(r4.A01.getLong(002.A0R("proactive_warning_banner_cache_expiration_override/", valueOf), A01));
        C46199DQb dQb2 = dQb;
        String str2 = str;
        UserSession userSession3 = userSession2;
        1Av r18 = r4;
        String str3 = str2;
        long j3 = j2;
        C41866B4k b4k = new C41866B4k(userSession3, dQb2, r18, str3, j3);
        C41871B4p b4p = new C41871B4p(userSession3, dQb2, r18, str3, j3);
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession2, 36314485360888411L)) {
            AnonymousClass3U9 B33 = 2L2.A00(userSession2).B33(new DirectThreadKey(str2, (List) null));
            if (!182.A06(r8, userSession2, 36310989255999897L) || ((B33 == null || !B33.CVa(userSession2)) && !182.A06(r8, userSession2, 36310989255934360L))) {
                z = false;
            } else {
                z = true;
            }
            if (B33 != null) {
                num = Integer.valueOf(B33.C6a());
            } else {
                num = null;
            }
            boolean A002 = C66831MdP.A00(userSession2, num, str2);
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            A04.A02("should_skip_extra_data", Boolean.valueOf(A1U));
            boolean A1Z = C41848B3p.A1Z(A04, "target_user_id", valueOf);
            if (z) {
                A04.A02("should_skip_extra_data", DbT.A0l(A002));
                1vm.A01(userSession2).A06(new PandoGraphQLRequest(C41845B3m.A06(A1Z), "IGProactiveWarningEpdBannerQuery", A04.getParamsCopy(), A042.getParamsCopy(), Bq7.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_proactive_warning_epd_banner_query", AnonymousClass7TE.A1C()).setFreshCacheAgeMs(millis).setMaxToleratedCacheAgeMs(millis), b4p);
                return;
            }
            A04.A04(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A04.A02("should_skip_extra_data", DbT.A0l(A002));
            1vm.A01(userSession2).A06(new PandoGraphQLRequest(C41845B3m.A06(A1Z), "IGProactiveWarningBannerQuery", A04.getParamsCopy(), A042.getParamsCopy(), C41865B4j.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_proactive_warning_banner_query", AnonymousClass7TE.A1C()).setFreshCacheAgeMs(millis).setMaxToleratedCacheAgeMs(millis), b4k);
            return;
        }
        2IS A043 = C41845B3m.A04();
        boolean A1Z2 = C41848B3p.A1Z(A043, "target_user_id", valueOf);
        A043.A04(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        17k.A0E(A1Z2);
        C239123Fb A0S = JTS.A0S(A043, userSession2, BAQ.class, "IGProactiveWarningBannerQuery", false);
        A0S.A03 = AnonymousClass05K.A0C;
        A0S.A05 = 002.A0Q("pw_", j2);
        A0S.A04 = Long.valueOf(millis);
        1OC A06 = A0S.A06();
        A06.A00 = new NMK(b4k, A0S);
        int A044 = DbS.A04(r10, userSession2, 36592464232383033L);
        if (A044 > 0) {
            1ES.A04(A06, 260155899, 4, A044, A1U, false);
        } else {
            1ES.A05(A06, 260155899, 4, A1U, false);
        }
    }

    public static final void A02(1Av r1, Boolean bool, String str) {
        Set A0j;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            0xa r2 = r1.A01;
            if (booleanValue) {
                A0j = 00k.A0j(r2.C1t("odn_pre_send_inferencing_marked_threads"));
                A0j.add(str);
            } else if (r2.contains("odn_pre_send_inferencing_marked_threads")) {
                A0j = 00k.A0j(r2.C1t("odn_pre_send_inferencing_marked_threads"));
                A0j.remove(str);
            } else {
                return;
            }
            JTU.A1E(r2, "odn_pre_send_inferencing_marked_threads", A0j);
        }
    }
}
