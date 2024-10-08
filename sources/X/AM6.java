package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.text.fittingtextview.FittingTextView;

public final class AM6 implements View.OnClickListener {
    public final /* synthetic */ AZU A00;

    public AM6(AZU azu) {
        this.A00 = azu;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(596027802);
        AZU azu = this.A00;
        azu.A0D = true;
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.before_and_after_image);
        igSimpleImageView.setImageAlpha(128);
        azu.A09 = igSimpleImageView;
        IgEditText igEditText = azu.A06;
        if (igEditText != null) {
            0nA.A0N(igEditText);
        }
        AZU.A03(azu, (FittingTextView) AnonymousClass7TE.A14(azu.A0Q));
        azu.A0K.E3H(new Object());
        AnonymousClass0fD.A0C(-1190937513, A05);
    }
}
