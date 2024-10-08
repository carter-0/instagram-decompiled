package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.ERf  reason: case insensitive filesystem */
public final class C48018ERf extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MessageLinksSettingsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C13998To0(this, 44));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C13998To0(this, 45));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131966192);
    }

    public final String getModuleName() {
        return "message_links_toggle";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        1Av r3 = (1Av) this.A02.getValue();
        C47518E6c.A05(this, A1C, 24, 2131966193, AnonymousClass7TG.A1a(r3, r3.A15, 1Av.A8a, 476));
        FGF fgf = new FGF(2131966194);
        fgf.A01 = R.style.PrivacyTextStyle;
        A1C.add(fgf);
        setItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }
}
