package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Mg3  reason: case insensitive filesystem */
public final class C66970Mg3 extends C249703kE {
    public static final /* synthetic */ AnonymousClass0YZ[] A0E;
    public final TextView A00;
    public final TextView A01;
    public final IgLinearLayout A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final CircularImageView A05;
    public final C71662eb A06;
    public final C256033v7 A07;
    public final IgImageButton A08;
    public final AnonymousClass0eM A09;
    public final 0w6 A0A;
    public final 0w6 A0B;
    public final 0w6 A0C;
    public final C71662eb A0D;

    static {
        Class<C66970Mg3> cls = C66970Mg3.class;
        A0E = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "clipPlayCount", "getClipPlayCount()Landroid/widget/TextView;"), C66580MXl.A16(cls, "playCountContainer", "getPlayCountContainer()Landroid/view/View;"), C66580MXl.A16(cls, "selectedCheckbox", "getSelectedCheckbox()Landroid/widget/CheckBox;")};
    }

    public C66970Mg3(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.preview_clip_thumbnail);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        igImageButton.A00 = 0.5625f;
        0qQ.A07(requireViewById);
        this.A08 = igImageButton;
        C71662eb A0T = DbY.A0T(view, R.id.play_count_stub);
        this.A0D = A0T;
        this.A0A = new C258293ym(A0T, R.id.preview_clip_play_count);
        this.A0B = new C258293ym(A0T, R.id.play_count_container);
        this.A04 = DbX.A0Y(view, R.id.sender_facepile);
        this.A02 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.primary_label);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.primary_label_text);
        this.A05 = DbX.A0a(view, R.id.primary_label_profile_picture);
        this.A03 = DbX.A0Y(view, R.id.indicator_icon);
        this.A07 = C256013v5.A00(DbU.A0D(view, R.id.media_cover_view_stub));
        C71662eb A0T2 = DbY.A0T(view, R.id.selection_container);
        this.A06 = A0T2;
        this.A0C = new C258293ym(A0T2, R.id.selection_checkbox);
        this.A09 = AnonymousClass0eN.A01(new C58710IwJ(view, 20));
        this.A00 = AnonymousClass7TG.A0R(view, R.id.clip_just_watched_overlay);
    }
}
