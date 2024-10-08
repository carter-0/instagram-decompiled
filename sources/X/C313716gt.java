package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6gt  reason: invalid class name and case insensitive filesystem */
public final class C313716gt implements C313726gu {
    public AnonymousClass4DU A00;
    public C249763kK A01;
    public String A02 = "0";
    public String A03 = "0";
    public String A04 = "0";
    public String A05;
    public Set A06 = new LinkedHashSet();
    public final AnonymousClass0iw A07;
    public final 0wc A08;
    public final UserSession A09;

    public C313716gt(AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A09 = userSession;
        this.A07 = r3;
        this.A08 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void Cjo(long j, String str, String str2) {
        0qQ.A0B(str, 1);
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_delete_question");
        A002.A9F("question_id", Long.valueOf(j));
        A002.AAJ("question_source", str);
        A002.AAJ("question_text", str2);
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.AAJ("m_pk", this.A04);
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAJ("view_mode", "viewer");
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final /* synthetic */ void Cjp(long j, String str, String str2) {
    }

    public final void Cjq(int i, String str, String str2, long j) {
        0qQ.A0B(str, 1);
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_question_liked");
        A002.AAJ("view_mode", "viewer");
        A002.A9F("question_id", Long.valueOf(j));
        A002.AAJ("question_source", str);
        A002.AAJ("question_text", str2);
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.AAJ("m_pk", this.A04);
        A002.A9F("question_index", Long.valueOf((long) i));
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final /* synthetic */ void Cjr(int i, String str, String str2, long j) {
    }

    public final void Cjt(String str) {
        0qQ.A0B(str, 0);
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_question_submitted");
        A002.AAJ("view_mode", "viewer");
        A002.AAJ("question_text", str);
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAJ("m_pk", this.A04);
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final void Cju(int i, String str, String str2, long j) {
        0qQ.A0B(str, 1);
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_question_unliked");
        A002.AAJ("view_mode", "viewer");
        A002.A9F("question_id", Long.valueOf(j));
        A002.AAJ("question_source", str);
        A002.AAJ("question_text", str2);
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.AAJ("m_pk", this.A04);
        A002.A9F("question_index", Long.valueOf((long) i));
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final /* synthetic */ void Ckw(boolean z) {
    }

    public final void A00(String str, String str2, String str3) {
        Long l;
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "live_follow_generated");
        A002.AAE(C263944Ny.A00(this.A03), "a_pk");
        A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(this.A02)));
        A002.AAJ("m_pk", this.A04);
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAJ("method", str);
        A002.AAJ("view_mode", "viewer");
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        A002.A9F("c_pk", l);
        A002.A9F("followed_user_id", 00y.A0n(10, str2));
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final void ChB() {
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_ask_question_tapped");
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAJ("m_pk", this.A04);
        A002.AAJ("view_mode", "viewer");
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }

    public final void Cjs(int i, int i2, int i3, int i4, int i5) {
        0wc r2 = this.A08;
        0Aj A002 = r2.A00(r2.A00, "ig_live_question_tray_impression");
        A002.A9F("question_count", Long.valueOf((long) i));
        A002.A9F("live_question_count", Long.valueOf((long) i2));
        A002.A9F("stories_question_count", Long.valueOf((long) i3));
        A002.A9F("answered_question_count", Long.valueOf((long) i4));
        A002.A9F("unanswered_question_count", Long.valueOf((long) i5));
        A002.A9F("a_pk", 00y.A0n(10, this.A03));
        A002.AAJ("m_pk", this.A04);
        A002.A9F(TraceFieldType.BroadcastId, 00y.A0n(10, this.A02));
        A002.AAJ("container_module", this.A07.getModuleName());
        A002.AAJ("view_mode", "viewer");
        A002.AAe("current_guest_ids", 00k.A0a(this.A06));
        A002.Cgf();
    }
}
