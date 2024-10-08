package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.ERe  reason: case insensitive filesystem */
public final class C48017ERe extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AutomaticPreviewsSettingsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C13998To0(this, 34));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953408);
    }

    public final String getModuleName() {
        return "automatic_previews_toggle";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        1Av r4 = (1Av) this.A01.getValue();
        C47518E6c.A05(this, A1C, 20, 2131953410, AnonymousClass7TG.A1a(r4, r4.A7r, 1Av.A8a, 510));
        Context requireContext = requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131953409);
        ESx eSx = new ESx(this, DbV.A02(requireContext));
        SpannableStringBuilder A0E = DbY.A0E(this, A16, 2131953411);
        AnonymousClass7AV.A04(A0E, eSx, A16);
        FGF fgf = new FGF(A0E);
        fgf.A01 = R.style.PrivacyTextStyle;
        A1C.add(fgf);
        setItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }
}
