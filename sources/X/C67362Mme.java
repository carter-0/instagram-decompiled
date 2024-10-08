package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Mme  reason: case insensitive filesystem */
public final class C67362Mme extends C249703kE implements C20976X7p, X1S {
    public static final /* synthetic */ AnonymousClass0YZ[] A0B;
    public C71662eb A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final ConstraintLayout A05;
    public final FixedAspectRatioVideoLayout A06;
    public final IgImageButton A07;
    public final 0w6 A08;
    public final 0w6 A09;
    public final C71662eb A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67362Mme(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A06 = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        this.A07 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.image_preview);
        this.A05 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.overlay);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = DbW.A0B(view, R.id.text);
        this.A02 = (ImageView) AnonymousClass7TE.A0b(view, R.id.trending_badge);
        this.A04 = DbW.A0B(view, R.id.trending_badge_label);
        this.A00 = DbY.A0S(view, R.id.client_branding_icon_stub);
        C71662eb A0S = DbY.A0S(view, R.id.play_count_stub);
        this.A0A = A0S;
        this.A09 = new C258293ym(A0S, R.id.play_count_container);
        this.A08 = new C258293ym(A0S, R.id.preview_clip_play_count);
        view.setTag(this);
    }

    public final void ABK(C232822uV r1, int i) {
    }

    static {
        Class<C67362Mme> cls = C67362Mme.class;
        A0B = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "playCountContainer", "getPlayCountContainer()Landroid/view/View;"), C66580MXl.A16(cls, "clipPlayCount", "getClipPlayCount()Landroid/widget/TextView;")};
    }

    public final IgImageButton BGE() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A06;
    }
}
