package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

public final class NOM extends C232222tE {
    public final AnonymousClass0iw A00;
    public final O87 A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67999MyR(DbT.A0D(layoutInflater, viewGroup, R.layout.emoji_reaction_row, false));
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        String A0h;
        ReactionViewModel reactionViewModel = (ReactionViewModel) r9;
        C67999MyR myR = (C67999MyR) r10;
        boolean A1U = AnonymousClass7TF.A1U(0, reactionViewModel, myR);
        TextView textView = myR.A00;
        String str = reactionViewModel.A06;
        textView.setText(str);
        if (!reactionViewModel.A08 || !reactionViewModel.A07) {
            C71408Ok7.A00(myR.itemView, 50, this, reactionViewModel);
            A0h = DbW.A0h(DbS.A07(myR), str, 2131959222);
        } else {
            C71402Ok1.A00(myR.itemView, 4, this);
            A0h = DbS.A07(myR).getString(2131971974);
        }
        0qQ.A0A(A0h);
        View view = myR.itemView;
        Context context = view.getContext();
        String str2 = reactionViewModel.A04;
        view.setContentDescription(DbV.A0u(context, str, str2, 2131959221));
        03v.A0B(myR.itemView, new C67704MtI(A0h, A1U ? 1 : 0));
        if (str2 != null) {
            myR.A03.setUrl(C317486nL.A04.A04(str2), this.A00);
        }
        ImageUrl imageUrl = reactionViewModel.A02;
        if (imageUrl != null) {
            IgImageView igImageView = myR.A02;
            igImageView.setVisibility(0);
            igImageView.setUrl(imageUrl, this.A00);
        } else {
            myR.A02.setVisibility(8);
        }
        int i = reactionViewModel.A00;
        if (i == 0 || !reactionViewModel.A07) {
            myR.A01.setVisibility(8);
            return;
        }
        TextView textView2 = myR.A01;
        textView2.setVisibility(0);
        textView2.setText(i);
    }

    public final Class modelClass() {
        return ReactionViewModel.class;
    }

    public NOM(AnonymousClass0iw r1, O87 o87) {
        this.A01 = o87;
        this.A00 = r1;
    }
}
