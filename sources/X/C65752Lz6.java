package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Lz6  reason: case insensitive filesystem */
public final class C65752Lz6 implements C332277Ui {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ K4U A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void D9a() {
    }

    public C65752Lz6(FragmentActivity fragmentActivity, K4U k4u, String str, boolean z) {
        this.A01 = k4u;
        this.A00 = fragmentActivity;
        this.A03 = z;
        this.A02 = str;
    }

    public final void D9V() {
        C52480GUi gUi = C63556Kz5.A01;
        K4U k4u = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(k4u.A07);
        C267624bv r4 = k4u.A03;
        gUi.A03(this.A00, r4, A0l, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", (String) null, this.A02, (String) null, (List) null, false, this.A03);
    }
}
