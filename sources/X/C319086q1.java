package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import java.util.List;

/* renamed from: X.6q1  reason: invalid class name and case insensitive filesystem */
public final class C319086q1 implements AnonymousClass2gO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass36O A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C318956po A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ 0sK A08;

    public C319086q1(Context context, AnonymousClass36O r2, UserSession userSession, C318956po r4, String str, C62320sa r6, C62320sa r7, 0sL r8, 0sK r9) {
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = str;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass36O r2;
        Context context;
        Tab tab;
        C62320sa r0;
        String str;
        C48159Ea1 ea1 = (C48159Ea1) obj;
        if (ea1 instanceof C47376Dwn) {
            r0 = this.A05;
        } else if (ea1 instanceof Dwk) {
            C318956po r22 = this.A03;
            if (r22 != null) {
                C267624bv r5 = r22.A07;
                Dwk dwk = (Dwk) ea1;
                String str2 = dwk.A02;
                String str3 = dwk.A00;
                String str4 = dwk.A01;
                List A002 = C319076q0.A00(this.A02);
                0qQ.A0B(r5, 0);
                0qQ.A0B(str2, 1);
                0qQ.A0B(str3, 2);
                Activity activity = (Activity) r22.A0C.get();
                if (activity != null) {
                    C63556Kz5.A01.A03(activity, r5, r22.A09, str2, str3, (String) null, str4, (String) null, A002, false, false);
                    return;
                }
                return;
            }
            return;
        } else {
            if ((ea1 instanceof C47378Dwp) || (ea1 instanceof C47377Dwo)) {
                r2 = this.A01;
                context = this.A00;
                tab = JXL.A00;
            } else if (ea1 instanceof C47379Dwq) {
                r2 = this.A01;
                context = this.A00;
                tab = JXL.A01;
            } else if (ea1 instanceof C47381Dws) {
                this.A01.A04(this.A00);
                return;
            } else if (ea1 instanceof C47380Dwr) {
                AnonymousClass36O r52 = this.A01;
                1NY r4 = new 1NY(r52.A04, -2);
                r4.A04();
                r4.A02();
                String A0u = 002.A0u("api/", "v1/", "users/", "set_birthday_opt_in_settings/");
                0qQ.A07(A0u);
                r4.A0E = A0u;
                r4.A0Q(C47294DuN.class, F46.class);
                r4.A9m("effects_enabled", "false");
                r4.A9m("surface", "profile");
                1OC A0M = r4.A0M();
                0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>>");
                A0M.A00 = new C47672ECg(r52);
                Fragment fragment = r52.A01;
                1ES.A00(fragment.requireContext(), AnonymousClass07i.A00(fragment), A0M);
                return;
            } else if (ea1 instanceof C47382Dwt) {
                this.A01.A03(this.A00);
                return;
            } else if (ea1 instanceof C47374Dwl) {
                C47374Dwl dwl = (C47374Dwl) ea1;
                this.A08.invoke(Integer.valueOf(dwl.A00), Integer.valueOf(dwl.A01), dwl.A02);
                return;
            } else if (ea1 instanceof C47373Dwj) {
                0sL r23 = this.A07;
                if (r23 != null) {
                    if (0qQ.A0K(this.A04, "ig_self_profile")) {
                        str = "ig_self_profile_identity_sheet";
                    } else {
                        str = "ig_edit_profile_identity_sheet";
                    }
                    r23.invoke(str, Boolean.valueOf(((C47373Dwj) ea1).A00));
                    return;
                }
                return;
            } else if (ea1 instanceof C47375Dwm) {
                r0 = this.A06;
            } else if (ea1 != null) {
                throw new RuntimeException();
            } else {
                return;
            }
            r2.A06(context, tab);
            return;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }
}
