package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.K6d  reason: case insensitive filesystem */
public final class C61407K6d extends AnonymousClass4DH implements AnonymousClass8MN {
    public static final String __redex_internal_original_name = "CanvasFundraiserStickerBottomSheetFragment";
    public C39643A3j A00;
    public ViewStub A01;
    public UserSession A02;
    public C64970Ll9 A03;

    public final void Ctb(C384659hg r1) {
    }

    public final String getModuleName() {
        return "canvas_fundraiser_sticker_bottom_sheet_fragment";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r3 = r10
            super.onViewCreated(r11, r12)
            r0 = 2131429557(0x7f0b08b5, float:1.848079E38)
            android.view.ViewStub r2 = X.DbU.A0D(r11, r0)
            r10.A01 = r2
            com.instagram.common.session.UserSession r6 = r10.A02
            com.instagram.api.schemas.NonprofitSelectorSurfaceEnum r4 = com.instagram.api.schemas.NonprofitSelectorSurfaceEnum.STORY
            java.lang.Boolean r8 = X.AnonymousClass7TE.A0u()
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            r0 = 207(0xcf, float:2.9E-43)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.Ll9 r0 = new X.Ll9
            r5 = r10
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.A03 = r0
            r0.E0h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61407K6d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void DHJ(User user, String str) {
        C39643A3j a3j = this.A00;
        if (a3j != null) {
            C387459mF r3 = a3j.A00;
            Context context = r3.A05;
            0qQ.A0A(user);
            C19475WaN A012 = C14628Tza.A01(context, user, AnonymousClass000.A00(207));
            AnonymousClass87H r1 = r3.A09;
            0qQ.A0A(r1);
            r1.A08(r3.A0C);
            r3.A0B.E3H(new AnonymousClass8TP(A012));
            AnonymousClass37D A022 = AnonymousClass37D.A00.A02(getContext());
            A022.getClass();
            A022.A0B();
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-422173836);
        C61407K6d.super.onCreate(bundle);
        this.A02 = DbX.A0U(this);
        AnonymousClass0fD.A09(983994210, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-379030675);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.canvas_fundraiser_sticker_bottom_sheet);
        AnonymousClass0fD.A09(-902666958, A022);
        return A0C;
    }
}
