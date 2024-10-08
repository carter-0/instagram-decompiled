package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: X.Fg4  reason: case insensitive filesystem */
public final class C50644Fg4 implements X8Y {
    public final /* synthetic */ G7Y A00;
    public final /* synthetic */ FGL A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C50644Fg4(G7Y g7y, FGL fgl, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = fgl;
        this.A03 = str;
        this.A06 = z;
        this.A02 = num;
        this.A07 = z2;
        this.A04 = str2;
        this.A00 = g7y;
        this.A08 = z3;
        this.A09 = z4;
        this.A05 = str3;
    }

    public final void DZN() {
        FGL fgl = this.A01;
        C311496cm r1 = fgl.A03;
        String str = this.A03;
        Boolean valueOf = Boolean.valueOf(this.A06);
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r1.A02, "ci_settings_modal_settings_tapped");
        DbS.A1N(A0e, str);
        A0e.A7p("is_partial_ci", valueOf);
        A0e.Cgf();
        if (this.A02 != null) {
            AnonymousClass0iw r0 = fgl.A01;
            Fragment fragment = fgl.A00;
            C51950G8t g8t = fgl.A04;
            C49498Ewd ewd = fgl.A05;
            Et4.A02 = r0;
            Et4.A07 = new WeakReference(fragment);
            Et4.A04 = g8t;
            Et4.A05 = ewd;
            boolean z = this.A07;
            String str2 = this.A04;
            G7Y g7y = this.A00;
            boolean z2 = this.A08;
            Et4.A08 = z;
            Et4.A00 = str;
            Et4.A06 = str2;
            Et4.A03 = g7y;
            Et4.A09 = z2;
            boolean z3 = this.A09;
            String str3 = this.A05;
            Et4.A0A = z3;
            Et4.A01 = str3;
        }
    }

    public final void onCancel() {
        C311496cm r1 = this.A01.A03;
        String str = this.A03;
        Boolean valueOf = Boolean.valueOf(this.A06);
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r1.A02, "ci_settings_modal_cancelled");
        DbS.A1N(A0e, str);
        A0e.A7p("is_partial_ci", valueOf);
        A0e.Cgf();
    }

    public final void onDismiss() {
        G7Y g7y = this.A00;
        if (g7y != null) {
            g7y.onDismiss();
        }
    }

    public final void onShow() {
        G7Y g7y = this.A00;
        if (g7y != null) {
            g7y.onShow();
        }
    }
}
