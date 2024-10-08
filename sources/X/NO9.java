package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class NO9 extends C232222tE {
    public final C70747OJt A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67917Mwz(DbU.A09(layoutInflater, viewGroup, R.layout.layout_timeline_visual_message_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C68188N5d n5d = (C68188N5d) r8;
        C67917Mwz mwz = (C67917Mwz) r9;
        AnonymousClass7TG.A1N(n5d, mwz);
        C71408Ok7.A00(mwz.itemView, 69, this, n5d);
        mwz.itemView.setOnLongClickListener(C71424OkP.A00);
        IgSimpleImageView igSimpleImageView = mwz.A00;
        C69618Np0 np0 = n5d.A00;
        boolean z = np0 instanceof NcX;
        int i = R.drawable.instagram_photo_filled_44;
        if (z) {
            i = R.drawable.instagram_video_chat_outline_44;
        }
        igSimpleImageView.setImageResource(i);
        int dimensionPixelSize = DbU.A05(mwz.itemView).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        long j = ((long) dimensionPixelSize) / 5;
        if (z) {
            C66580MXl.A1C(mwz.itemView, (int) (j * ((NcX) np0).A00));
            return;
        }
        C66580MXl.A1C(mwz.itemView, dimensionPixelSize);
    }

    public final Class modelClass() {
        return C68188N5d.class;
    }

    public NO9(C70747OJt oJt) {
        this.A00 = oJt;
    }
}
