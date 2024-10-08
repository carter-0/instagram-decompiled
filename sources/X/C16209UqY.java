package X;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.UqY  reason: case insensitive filesystem */
public final class C16209UqY extends C15286UZq {
    public static final String __redex_internal_original_name = "ClipsSerpGridFragment";
    public C229352nF A00;
    public C14411Tvf A01 = C14411Tvf.NINE_BY_SIXTEEN;
    public final C20911X4c A02 = C19545WbV.A00;
    public final Set A03 = new LinkedHashSet();
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C13998To0(this, 0));

    public final String getModuleName() {
        return "serp_reels_subtab";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbV.A1F(getViewLifecycleOwner(), A07().A05, new C20705Wxc(this, 6), 41);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-143426657);
        super.onCreate(bundle);
        this.A00 = C229342nE.A00(AnonymousClass7TE.A0l(this.A0m));
        AnonymousClass0fD.A09(-493913553, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(997099355);
        super.onDestroy();
        C229352nF r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("clipsGridItemsStore");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A07(C13988Tno.A0a(this));
        AnonymousClass0fD.A09(-901122554, A022);
    }
}
