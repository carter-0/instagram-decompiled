package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* renamed from: X.MzZ  reason: case insensitive filesystem */
public final class C68068MzZ extends C249703kE implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final Drawable A01 = C328037De.A00();
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final CountdownTimerPill A07;
    public final IgdsButton A08;
    public final IgdsFaceSwarm A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68068MzZ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = DbX.A0Y(view, R.id.prompt_header_icon);
        this.A04 = DbX.A0Z(view, R.id.prompt_header_title);
        this.A05 = DbX.A0Z(view, R.id.prompt_xma_title);
        this.A07 = (CountdownTimerPill) AnonymousClass7TF.A0F(view, R.id.prompt_timer_pill);
        this.A08 = JTR.A0n(view, R.id.prompt_xma_cta_button);
        this.A06 = DbX.A0b(view, R.id.prompt_xma_facepile);
        this.A09 = (IgdsFaceSwarm) AnonymousClass7TF.A0F(view, R.id.prompt_xma_faceswarm);
        this.A03 = DbX.A0Z(view, R.id.prompt_footer);
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final View BJd() {
        return JTO.A0F(this);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
