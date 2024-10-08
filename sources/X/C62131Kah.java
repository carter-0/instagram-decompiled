package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Kah  reason: case insensitive filesystem */
public final class C62131Kah extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CameraSettingsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C66300MMj(this, 8));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass0eM r1 = this.A00;
        r4.Eom(((C66530MVi) r1.getValue()).C7q());
        if (((C66530MVi) r1.getValue()).Esz()) {
            r4.Eu4(true);
        } else {
            r4.AA9(new LY0(this, 32), 2131960992);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(((C66530MVi) this.A00.getValue()).BRl());
    }

    public final String getModuleName() {
        return ((C66530MVi) this.A00.getValue()).getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(-1595978341);
        super.onDestroy();
        ((C66530MVi) this.A00.getValue()).onDestroy();
        AnonymousClass0fD.A09(119752673, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(339453987);
        super.onResume();
        AnonymousClass0eM r1 = this.A00;
        ((C66530MVi) r1.getValue()).onResume();
        setItems(((C66530MVi) r1.getValue()).BRl());
        AnonymousClass0fD.A09(1951626944, A02);
    }
}
