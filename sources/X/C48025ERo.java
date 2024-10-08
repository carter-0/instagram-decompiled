package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.ERo  reason: case insensitive filesystem */
public final class C48025ERo extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LanguagesSettingsFragment";
    public C68504NKx A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131964653);
    }

    public final String getModuleName() {
        return "languages_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0F = DbV.A0F(this);
        0qQ.A07(A0F);
        DbT.A16(requireContext(), A0F, 2Yu.A0C(getContext()));
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A02(requireContext(), FP4.A00(this, 5), A1C, 2131952963);
        C50989Fmc.A02(requireContext(), FP4.A00(this, 6), A1C, 2131956613);
        C68504NKx nKx = this.A00;
        if (nKx != null) {
            nKx.setItems(A1C);
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            C68504NKx nKx2 = this.A00;
            if (nKx2 != null) {
                scrollingViewProxy.ENw(nKx2);
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1259096493);
        super.onCreate(bundle);
        this.A00 = new C68504NKx(requireContext(), DbT.A0X(this.A01), this);
        AnonymousClass0fD.A09(1966581046, A02);
    }
}
