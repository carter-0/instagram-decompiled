package X;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;

/* renamed from: X.MzW  reason: case insensitive filesystem */
public final class C68065MzW extends C249703kE implements C328007Db {
    public final Context A00;
    public final Space A01;
    public final AnonymousClass0iw A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final CircularImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgdsButton A09;
    public final RoundedCornerMediaFrameLayout A0A;
    public final List A0B;
    public final IgdsButton A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68065MzW(View view, AnonymousClass0iw r5) {
        super(view);
        0qQ.A0B(r5, 2);
        this.A02 = r5;
        this.A05 = DbX.A0Z(view, R.id.standard_dxma_title);
        this.A03 = DbX.A0Z(view, R.id.standard_dxma_caption);
        this.A04 = DbX.A0Z(view, R.id.standard_dxma_subtitle);
        IgdsButton A0n = JTR.A0n(view, R.id.standard_dxma_cta_button_primary);
        this.A09 = A0n;
        IgdsButton A0n2 = JTR.A0n(view, R.id.standard_dxma_cta_button_secondary);
        this.A0C = A0n2;
        this.A07 = DbX.A0b(view, R.id.standard_dxma_facepile);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A0A = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.standard_dxma_media_container);
        this.A06 = DbX.A0a(view, R.id.standard_dxma_favicon_circular);
        this.A08 = DbX.A0b(view, R.id.standard_dxma_media);
        this.A01 = (Space) AnonymousClass7TF.A0F(view, R.id.standard_dxma_space_below_caption);
        this.A0B = 0sr.A1P(new IgdsButton[]{A0n, A0n2});
    }

    public final View BJd() {
        return JTO.A0F(this);
    }
}
