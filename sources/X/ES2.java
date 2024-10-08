package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public final class ES2 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TranslationOptionsFragment";
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final String A07 = "translation_options";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (!this.A02) {
            r2.Eom(2131973416);
        }
    }

    public final int getBottomPadding() {
        return 0;
    }

    public final int getTopPadding() {
        return 0;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = this.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass0eM r3 = this.A06;
        boolean A042 = AnonymousClass3WS.A04(AnonymousClass7TE.A0l(r3));
        boolean A022 = AnonymousClass3WS.A02(AnonymousClass7TE.A0l(r3));
        0lg A0X = DbT.A0X(r3);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, A0X, 36328272203758773L) && this.A02) {
            A1C.add(new C71065Oak(FP5.A00(this, 29), 2131975511));
        }
        if (182.A06(r4, DbT.A0X(r3), 36328272203627699L) && this.A02) {
            A1C.add(new C71065Oak(FP5.A00(this, 28), 2131960972));
            FGF.A01(A1C, 2131960973);
        }
        if (A042) {
            C47518E6c.A05(this, A1C, 7, 2131953364, AnonymousClass3WS.A07(AnonymousClass7TE.A0l(r3)));
            FGF.A01(A1C, 2131953365);
        }
        if (A022) {
            C47518E6c.A05(this, A1C, 8, 2131953362, AnonymousClass3WS.A05(AnonymousClass7TE.A0l(r3)));
            FGF.A01(A1C, 2131953363);
        }
        boolean A072 = AnonymousClass3WS.A07(AnonymousClass7TE.A0l(r3));
        boolean A052 = AnonymousClass3WS.A05(AnonymousClass7TE.A0l(r3));
        if ((A072 && (this.A03 || this.A05)) || (A052 && this.A04)) {
            A1C.add(new C71065Oak(new C50069FNk(this, 0, A072, A052), 2131972217));
        }
        if (z) {
            setBottomSheetMenuItems(A1C);
        } else {
            setItems(A1C);
        }
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean isElevated() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1628238721);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getBoolean("is_surface_elevated");
        String string = requireArguments.getString("entrypoint");
        C320236s2.A03(requireArguments, string, "entrypoint");
        this.A00 = string;
        this.A01 = requireArguments.getString("media_id");
        this.A03 = requireArguments.getBoolean("media_has_caption_translations");
        this.A05 = requireArguments.getBoolean("media_has_sticker_dubbing");
        this.A04 = requireArguments.getBoolean("media_has_dubbing");
        AnonymousClass0fD.A09(2029097885, A022);
    }
}
