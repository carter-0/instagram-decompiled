package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hq0  reason: case insensitive filesystem */
public final class C55936Hq0 {
    public final UserSession A00;
    public final 1vn A01;

    public final Object A00(String str, String str2, AnonymousClass4D7 r8, boolean z) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A03("section_content_at_stream_initial_count", 0);
        A04.A01("enable_section_content_at_stream");
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, "creator_inspiration_hub_type");
        0Df.A00(A03, str2, "max_id");
        DbW.A18(A03, A04, "input");
        A04.A01("enable_section_content_at_stream");
        PandoGraphQLRequest A002 = II3.A00(A04, A042);
        if (z) {
            HZR.A00(this.A00).A02(str);
        }
        1vn r0 = this.A01;
        0qQ.A0A(A002);
        return r0.A04(A002, r8);
    }

    public C55936Hq0(UserSession userSession, 1vn r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
