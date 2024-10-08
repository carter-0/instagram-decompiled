package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8jd  reason: invalid class name and case insensitive filesystem */
public final class C363378jd {
    public static final C363388je A08 = new Object();
    public final UserSession A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public final C299935wF A00(CallerContext callerContext) {
        String str;
        String str2;
        String str3;
        C375999Gd r1;
        int intValue = C363038ix.A00(this.A00).intValue();
        CallerContext callerContext2 = callerContext;
        if (intValue == 0) {
            A5I a5i = (A5I) this.A03.getValue();
            String str4 = callerContext.A02;
            0qQ.A07(str4);
            AnonymousClass9JK r5 = new AnonymousClass9JK(callerContext2, "ig_android_ig_to_fb_crossposting", str4, "crossposting", "loading");
            C46478Dfh dfh = (C46478Dfh) ((AnonymousClass9F7) a5i.A01.getValue()).Au3(r5);
            if (dfh == null || (r1 = dfh.A00) == null) {
                str = null;
            } else {
                str = r1.A00(r5, a5i.A00);
            }
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                Integer num = AnonymousClass05K.A00;
                return new C299935wF((C299945wG) null, num, num, "", "", "", 0sn.A00);
            }
            if (dfh == null || (str2 = dfh.A02) == null) {
                str2 = "";
            }
            Integer num2 = AnonymousClass05K.A0N;
            Integer num3 = AnonymousClass05K.A00;
            if (dfh == null || (str3 = dfh.A03) == null) {
                str3 = "";
            }
            return new C299935wF((C299945wG) null, num2, num3, str, str2, str3, 0sn.A00);
        } else if (intValue == 1) {
            return ((C363398jf) this.A04.getValue()).A00(callerContext);
        } else {
            return new C299935wF((C299945wG) null, AnonymousClass05K.A00, AnonymousClass05K.A0C, "", "", "", 0sn.A00);
        }
    }

    public final void A01(CallerContext callerContext, C363658k8 r16, String str) {
        0eP r0;
        String str2;
        AtomicBoolean atomicBoolean = this.A01;
        if (atomicBoolean.get() && System.currentTimeMillis() - ((Number) this.A06.getValue()).longValue() < 30000) {
            if (182.A06(0Tu.A05, this.A00, 36326962238863459L)) {
                return;
            }
        }
        atomicBoolean.set(true);
        String str3 = str;
        ((C363668k9) this.A05.getValue()).A00(str3);
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        C363678kA r2 = new C363678kA(r16, this, obj);
        CallerContext callerContext2 = callerContext;
        if (C363038ix.A00(this.A00).intValue() == 0) {
            A5I a5i = (A5I) this.A03.getValue();
            ((AnonymousClass9F7) a5i.A01.getValue()).AUs(new AnonymousClass9JK(callerContext2, "ig_android_ig_to_fb_crossposting", str3, "crossposting", "loading"), AnonymousClass9F1.A00, new AnonymousClass9S1(a5i, r2));
            str2 = "OneLink";
        } else {
            C363398jf r3 = (C363398jf) this.A04.getValue();
            C363408jg r4 = (C363408jg) r3.A02.getValue();
            List singletonList = Collections.singletonList("CROSS_POSTING_SETTING");
            0qQ.A07(singletonList);
            C363688kB r10 = new C363688kB(r3, r2);
            0eP r8 = new 0eP("CROSSPOSTING_DESTINATION_APP", "FB");
            0eP r7 = new 0eP("CROSSPOSTING_SHARE_TO_SURFACE", "");
            if (182.A06(0Tu.A05, r3.A00, 36326558511675207L)) {
                r0 = new 0eP("OVERRIDE_USER_VALIDATION_WITH_CXP_ELIGIBILITY_RULE", "true");
            } else {
                r0 = null;
            }
            0eP[] r02 = {r8, r7, r0};
            0qQ.A0B(r02, 0);
            r4.A00.A03(callerContext2, r10, "ig_android_service_cache_crossposting_setting", singletonList, 0Yt.A08(03t.A0I(r02)));
            str2 = "FXServiceCache";
        }
        C363758kI r32 = (C363758kI) r2.A01.A02.getValue();
        String str4 = r2.A02;
        0wc r22 = (0wc) r32.A01.getValue();
        0Aj A002 = r22.A00(r22.A00, "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(r32.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A002.AAJ(AnonymousClass9PN.A02(9, 10, 41), str4);
        A002.AAJ(TraceFieldType.AdhocEventName, "xposting_destination_fetch_attempt");
        A002.AAJ("data_source", str2);
        A002.AAJ("source_account_type", A0J.A01);
        A002.Cgf();
    }

    public final void A02(CallerContext callerContext, C363658k8 r8, String str, boolean z) {
        long j;
        UserSession userSession;
        0Tu r2;
        long j2;
        if (str.equals("reels")) {
            j = 604800000;
        } else {
            if (str.equals(AnonymousClass000.A00(3114))) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j2 = 36608437215368909L;
            } else if (str.equals("camera_open_prefetch")) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j2 = 36608437215499982L;
            } else {
                j = 0;
            }
            j = 182.A01(r2, userSession, j2);
        }
        long currentTimeMillis = System.currentTimeMillis() - ((Number) this.A06.getValue()).longValue();
        if (z || currentTimeMillis >= j) {
            A01(callerContext, r8, str);
        }
    }

    public C363378jd(UserSession userSession) {
        this.A00 = userSession;
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 32));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 31));
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 33));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 30));
        02z r0 = new 02z(0L);
        this.A06 = r0;
        this.A07 = r0;
    }
}
