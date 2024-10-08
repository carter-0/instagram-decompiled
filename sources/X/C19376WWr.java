package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.WWr  reason: case insensitive filesystem */
public final class C19376WWr implements AnonymousClass4Zh {
    public Dialog A00;
    public 1Xj A01;
    public SUL A02;
    public SUL A03;
    public VYF A04;
    public final Context A05;
    public final DialogInterface.OnClickListener A06 = new W5U(this, 29);
    public final AnonymousClass32G A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final AnonymousClass4DU A0A;
    public final SourceModelInfoParams A0B;
    public final C249763kK A0C;

    public C19376WWr(AnonymousClass32G r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass4DU r6, SourceModelInfoParams sourceModelInfoParams, C249763kK r8) {
        AnonymousClass7TG.A0w(1, userSession, r5, r6);
        this.A08 = userSession;
        this.A07 = r3;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = sourceModelInfoParams;
        this.A0C = r8;
        this.A05 = r3.requireContext();
    }

    public final Q03 A00(IgImageView igImageView, 1Xl r11, 2EG r12) {
        0qQ.A0B(r11, 0);
        return GT3.A00(this.A07, this.A08, igImageView, r11, this.A0A, this.A0B, r12, this.A0C.getSessionId());
    }

    public final void D2K(IgImageView igImageView, 1Xl r4, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(r4, 0, igImageView);
        new Q02(A00(igImageView, r4, 2EG.A2n)).A02();
    }
}
