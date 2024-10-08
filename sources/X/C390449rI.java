package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: X.9rI  reason: invalid class name and case insensitive filesystem */
public final class C390449rI extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelHallPassShareFragment";
    public boolean A00;
    public 28D A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass80E r0;
        String str;
        0qQ.A0B(viewGroup, 0);
        RectF A0C = AnonymousClass7TF.A0C((float) AnonymousClass0nB.A01(requireContext()), (float) AnonymousClass0nB.A00(requireContext()));
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        28D r02 = this.A01;
        if (r02 == null) {
            str = "entryPoint";
        } else {
            AnonymousClass80D.A07(r02, this, A002);
            AnonymousClass80D.A01(A0C, (RectF) null, A002);
            if (this.A00) {
                r0 = AnonymousClass80E.CAMPFIRE_ONLY;
            } else {
                r0 = AnonymousClass80E.HALL_PASS_ONLY;
            }
            A002.A0y = r0;
            A002.A3g = true;
            AnonymousClass80D.A0B(A002);
            A002.A3Q = true;
            String str2 = this.A02;
            if (str2 == null) {
                str = "targetHallPassId";
            } else {
                String str3 = this.A03;
                if (str3 == null) {
                    str = "targetHallPassName";
                } else {
                    BF0 bf0 = new BF0("", 0, str2, 0, str3);
                    A002.A0J = new BF0("", 0, bf0.A03, 0, bf0.A04);
                    A002.A3S = this.A04;
                    return A002;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "reel_hall_pass_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-380546115);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C320236s2.A01(requireArguments, AnonymousClass000.A00(1013));
        this.A03 = C320236s2.A01(requireArguments, AnonymousClass000.A00(1014));
        this.A04 = requireArguments.getBoolean(AnonymousClass000.A00(1015));
        this.A00 = requireArguments.getBoolean(AnonymousClass000.A00(1016), false);
        28D serializable = requireArguments.getSerializable(AnonymousClass000.A00(1012));
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
        this.A01 = serializable;
        AnonymousClass0fD.A09(-116753126, A022);
    }
}
