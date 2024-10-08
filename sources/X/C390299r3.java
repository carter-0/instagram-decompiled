package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.view.ViewGroup;

/* renamed from: X.9r3  reason: invalid class name and case insensitive filesystem */
public final class C390299r3 extends C15291UZw {
    public static final String __redex_internal_original_name = "FanClubExclusivePostOrReelFragment";

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context requireContext = requireContext();
        float A09 = (float) 0nA.A09(requireContext);
        float A08 = (float) 0nA.A08(requireContext);
        RectF A0C = AnonymousClass7TF.A0C(A09, A08);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        AnonymousClass80D A00 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A00, this.A03, this);
        AnonymousClass80I r3 = AnonymousClass80H.A02;
        0qQ.A07(this.A00);
        C363138jC r2 = C363138jC.A00;
        C279284yO[] r0 = {r2, AnonymousClass80N.A00};
        0qQ.A0B(r0, 0);
        AnonymousClass80H A02 = r3.A02(03t.A0K(r0));
        A02.getClass();
        A00.A0W = A02;
        AnonymousClass80D.A05(viewGroup, A00, this, true);
        AnonymousClass80D.A07(28D.A5O, this, A00);
        AnonymousClass80D.A02(A0C, rectF, A00);
        AnonymousClass80D.A0B(A00);
        A00.A38 = true;
        A00.A3Q = true;
        A00.A3O = true;
        A00.A3a = false;
        A00.A3p = false;
        C39605A1v.A00((AnonymousClass84B) null, C358098aM.A00(r2, new C358088aL[0]), A00, (C62622Kit) null, (String) null, (String) null, (String) null, (String) null);
        return A00;
    }

    public final String getModuleName() {
        return "fan_club_exclusive_post_or_reel_fragment";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass7TG.A1C(this, i2, -1);
    }
}
