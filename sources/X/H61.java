package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;

public final class H61 extends C228042kh {
    public final Bundle A00;
    public final UserSession A01;

    public H61(Bundle bundle, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        String string;
        Bundle bundle = this.A00;
        if (bundle == null || (string = bundle.getString("creator_ai_creator_igid")) == null) {
            throw AnonymousClass7TE.A0z("expected nonnull creator igid");
        }
        String string2 = bundle.getString("creator_ai_creator_fbid");
        if (string2 != null) {
            String string3 = bundle.getString(AnonymousClass000.A00(2950));
            if (string3 == null) {
                string3 = "";
            }
            String string4 = bundle.getString("creator_ai_link_keyword_link");
            if (string4 == null) {
                string4 = "";
            }
            String string5 = bundle.getString(AnonymousClass000.A00(576));
            if (string5 == null) {
                string5 = "";
            }
            String string6 = bundle.getString("creator_ai_link_keyword_description");
            if (string6 == null) {
                string6 = "";
            }
            long j = bundle.getLong(AnonymousClass000.A00(575));
            return new C54184H2e(new KeywordRepository(1vm.A01(this.A01), string, string2), Long.valueOf(j), string5, string3, bundle.getString("creator_ai_entry_point_extra"), string4, string6);
        }
        throw AnonymousClass7TE.A0z("expected nonnull creator fbid");
    }
}
