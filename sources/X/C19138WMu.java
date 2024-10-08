package X;

import android.content.Context;
import com.facebook.pando.Summary;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.WMu  reason: case insensitive filesystem */
public final class C19138WMu implements 2IR {
    public Integer A00 = AnonymousClass05K.A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass4D6 A03;
    public final C324356z9 A04;
    public final AnonymousClass2mA A05;
    public final C321636uV A06;
    public final C294265mA A07;
    public final boolean A08;
    public final boolean A09;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A03.schedule(new C72226Oyu(0, this, th));
    }

    public C19138WMu(Context context, UserSession userSession, AnonymousClass4D6 r4, C324356z9 r5, AnonymousClass2mA r6, C321636uV r7, C294265mA r8, boolean z, boolean z2) {
        0qQ.A0B(r5, 8);
        this.A08 = z;
        this.A09 = z2;
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3JC r11 = (AnonymousClass3JC) obj;
        if (Systrace.A0E(1)) {
            0fS.A01("PROFILE_ON_SUCCESS", -1284189814);
        }
        if (r11 == null) {
            onFailure(new Throwable("Unexpected null IGProfileTimelineQueryResponse result"));
            return;
        }
        C321636uV r5 = this.A06;
        r5.DQ7("profile_on_data_bg", (Long) null);
        Summary summary = r11.A00;
        long j = summary.requestStartTime;
        if (j > 0) {
            r5.DQ7("profile_request_start", Long.valueOf(j));
        }
        long j2 = summary.networkStartTime;
        if (j2 > 0) {
            r5.DQ7("profile_network_start", Long.valueOf(j2));
        }
        long j3 = summary.networkEndTime;
        if (j3 > 0) {
            r5.DQ7("profile_network_end", Long.valueOf(j3));
        }
        long j4 = summary.networkResponseStartTime;
        if (j4 > 0) {
            r5.DQ7("profile_network_response_start", Long.valueOf(j4));
        }
        long j5 = summary.parseStartTime;
        if (j5 > 0) {
            r5.DQ7("profile_parse_start", Long.valueOf(j5));
        }
        long j6 = summary.parseEndTime;
        if (j6 > 0) {
            r5.DQ7("profile_parse_end", Long.valueOf(j6));
        }
        C61082JwK jwK = new C61082JwK(37, (Object) Boolean.valueOf(summary.isFinal), true);
        r5.DQ7("profile_graphql_model_conversion_start", (Long) null);
        C273664mz A002 = B6X.A00(r11, this.A02);
        r5.DQ7("profile_graphql_model_conversion_end", (Long) null);
        if (Systrace.A0E(1)) {
            0fS.A00(1781092601);
        }
        this.A03.schedule(new WTA(jwK, r11, this, A002));
    }
}
