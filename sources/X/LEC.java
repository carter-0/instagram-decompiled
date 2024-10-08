package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class LEC {
    public ConstraintLayout A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public RoundedCornerImageView A05;
    public IgdsButton A06;
    public ViewGroup A07;
    public final ViewStub A08;

    public LEC(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A08 = viewStub;
    }

    public final void A00() {
        ConstraintLayout constraintLayout;
        IgTextView igTextView;
        IgTextView igTextView2;
        IgTextView igTextView3;
        RoundedCornerImageView roundedCornerImageView;
        IgSimpleImageView igSimpleImageView;
        ViewStub viewStub = this.A08;
        if (this.A07 == null) {
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A07 = viewGroup;
            IgdsButton igdsButton = null;
            if (viewGroup != null) {
                constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.select_profile_song_layout);
            } else {
                constraintLayout = null;
            }
            this.A00 = constraintLayout;
            ViewGroup viewGroup2 = this.A07;
            if (viewGroup2 != null) {
                igTextView = JTO.A0X(viewGroup2, R.id.select_song_text);
            } else {
                igTextView = null;
            }
            this.A02 = igTextView;
            ViewGroup viewGroup3 = this.A07;
            if (viewGroup3 != null) {
                igTextView2 = JTO.A0X(viewGroup3, R.id.selected_song_title);
            } else {
                igTextView2 = null;
            }
            this.A04 = igTextView2;
            ViewGroup viewGroup4 = this.A07;
            if (viewGroup4 != null) {
                igTextView3 = JTO.A0X(viewGroup4, R.id.selected_song_artist_name);
            } else {
                igTextView3 = null;
            }
            this.A03 = igTextView3;
            ViewGroup viewGroup5 = this.A07;
            if (viewGroup5 != null) {
                roundedCornerImageView = (RoundedCornerImageView) viewGroup5.findViewById(R.id.selected_album_image);
            } else {
                roundedCornerImageView = null;
            }
            this.A05 = roundedCornerImageView;
            ViewGroup viewGroup6 = this.A07;
            if (viewGroup6 != null) {
                igSimpleImageView = (IgSimpleImageView) viewGroup6.findViewById(R.id.add_song_button_image);
            } else {
                igSimpleImageView = null;
            }
            this.A01 = igSimpleImageView;
            ViewGroup viewGroup7 = this.A07;
            if (viewGroup7 != null) {
                igdsButton = (IgdsButton) viewGroup7.findViewById(R.id.remove_button);
            }
            this.A06 = igdsButton;
        }
    }
}
