package X;

import android.view.View;

/* renamed from: X.WkS  reason: case insensitive filesystem */
public final class C20068WkS implements Runnable {
    public final /* synthetic */ C15272UZa A00;

    public C20068WkS(C15272UZa uZa) {
        this.A00 = uZa;
    }

    public final void run() {
        String str;
        C15272UZa uZa = this.A00;
        C16294UsC usC = uZa.A0D;
        if (usC == null) {
            str = "tabbedFragmentController";
        } else {
            View A04 = usC.A04(uZa.A00);
            if (A04 != null && uZa.mView != null) {
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(uZa.requireActivity(), AnonymousClass7TF.A0d(DbV.A05(uZa), 2131953281));
                A0f.A04(A04, 0, AnonymousClass7TG.A06(uZa.requireContext()), true);
                A0f.A01();
                A0f.A00().A07(AnonymousClass7TE.A0l(uZa.A0Z));
                1Av r0 = uZa.A06;
                if (r0 == null) {
                    str = "userPreferences";
                } else {
                    AnonymousClass7TG.A0g(r0.A01, "audio_global_search_tab_nux_count").apply();
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
