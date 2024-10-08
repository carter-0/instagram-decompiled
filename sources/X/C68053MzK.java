package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.MzK  reason: case insensitive filesystem */
public final class C68053MzK extends C249703kE {
    public C67591MqP A00;
    public final float A01;
    public final Drawable A02;
    public final ConstraintLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final NoteBubbleView A07;
    public final /* synthetic */ NQC A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68053MzK(View view, NQC nqc) {
        super(view);
        this.A08 = nqc;
        this.A03 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.floaty_cluster_item_container);
        this.A06 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.floaty_cluster_pog_view);
        this.A07 = (NoteBubbleView) AnonymousClass7TE.A0b(view, R.id.floaty_cluster_item_note_bubble_view);
        this.A05 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.floaty_cluster_item_name_plate);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A01 = (float) AnonymousClass7TF.A02(A0S, R.dimen.accent_edge_thickness);
        this.A04 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.floaty_cluster_like_view);
        this.A02 = C67587MqL.A03(A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.OIR A00(X.N4t r6) {
        /*
            X.4AB r1 = r6.A05
            r4 = 0
            if (r1 == 0) goto L_0x002a
            java.util.List r0 = r1.A0J
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = X.00k.A0J(r0)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x002a
            X.4zZ r5 = r0.BWY()
        L_0x0015:
            com.instagram.api.schemas.NotePogVideoDict r4 = r1.A08
        L_0x0017:
            com.facebook.android.maps.model.LatLng r3 = r6.A04
            double r0 = r3.A00
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            double r0 = r3.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            X.OIR r0 = X.C71047OaP.A02(r4, r5, r2, r0)
            return r0
        L_0x002a:
            r5 = r4
            if (r1 == 0) goto L_0x0017
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68053MzK.A00(X.N4t):X.OIR");
    }
}
