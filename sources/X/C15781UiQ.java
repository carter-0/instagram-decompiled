package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.UiQ  reason: case insensitive filesystem */
public final class C15781UiQ extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        Object A0U = C13988Tno.A0U(A09, new C14893UDv(A09));
        if (A0U instanceof C14893UDv) {
            return (C249703kE) A0U;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        int i;
        WSV wsv = (WSV) r8;
        C14893UDv uDv = (C14893UDv) r9;
        AnonymousClass7TG.A1N(wsv, uDv);
        Context context = this.A00;
        AnonymousClass0iw r5 = this.A01;
        AnonymousClass7TF.A1C(context, 0, r5);
        Integer num = wsv.A03;
        if (num != null) {
            i = JTT.A05(uDv.A00, num.intValue());
        } else {
            i = 0;
        }
        uDv.A00.setPadding(i, 0, i, 0);
        IgTextView igTextView = uDv.A01;
        igTextView.setTypeface((Typeface) null, 0);
        igTextView.setText(wsv.A00);
        ImageUrl imageUrl = wsv.A02;
        IgImageView igImageView = uDv.A02;
        if (imageUrl != null) {
            igImageView.setVisibility(8);
            StackedAvatarView stackedAvatarView = (StackedAvatarView) uDv.A03.getView();
            stackedAvatarView.setUrls(wsv.A01, imageUrl, r5);
            stackedAvatarView.setVisibility(0);
            return;
        }
        igImageView.setUrl(wsv.A01, r5);
        context.getColor(2Yu.A0B(context));
        igImageView.invalidate();
        igImageView.setVisibility(0);
        C252063oV r1 = uDv.A03;
        if (r1.CVM()) {
            r1.getView().setVisibility(8);
        }
    }

    public final Class modelClass() {
        return WSV.class;
    }

    public C15781UiQ(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
