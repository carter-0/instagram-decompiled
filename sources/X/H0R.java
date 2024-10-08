package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

public final class H0R extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorAISettingsContentFragment";
    public final AnonymousClass0eM A00 = C58702IwB.A00(this, 45);
    public final AnonymousClass0eM A01 = C51975G9x.A0r(this, "creator_ai_creator_fbid", 0eO.A02, 40);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(C58702IwB.A01(this, 46), C58702IwB.A01(this, 47), new C58689Ivy(34, this, (Object) null), DbS.A0z(C54185H2f.class));
    public final C62320sa A04 = C58702IwB.A01(this, 48);
    public final String A05 = "creator_ai_settings_content_fragment";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131956968);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        Object value;
        C54617HLa hLa;
        List list;
        int A022 = AnonymousClass0fD.A02(422466255);
        H0R.super.onCreate(bundle);
        C54185H2f h2f = (C54185H2f) this.A03.getValue();
        05G r5 = h2f.A02;
        do {
            value = r5.getValue();
            hLa = C54617HLa.LOADING;
            list = (List) ((C59721JVf) value).A00;
            AnonymousClass7TG.A1N(list, hLa);
        } while (!r5.AIY(value, new C59721JVf(hLa, list, 47)));
        C58102ImO.A02(h2f, C318116oQ.A00(h2f), 36);
        AnonymousClass0fD.A09(-1288352483, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1131538296);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 42), 1889625010);
        AnonymousClass0fD.A09(1062092152, A022);
        return A0H;
    }
}
