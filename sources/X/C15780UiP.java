package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.UiP  reason: case insensitive filesystem */
public final class C15780UiP extends C232222tE {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        Object A0U = C13988Tno.A0U(A09, new UE3(A09));
        if (A0U instanceof UE3) {
            return (C249703kE) A0U;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        View view;
        int A0B;
        C19272WSf wSf = (C19272WSf) r10;
        UE3 ue3 = (UE3) r11;
        boolean A1U = AnonymousClass7TF.A1U(0, wSf, ue3);
        Context context = this.A00;
        UserSession userSession = this.A01;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, A1U ? 1 : 0);
        IgTextView igTextView = ue3.A03;
        CharSequence charSequence = wSf.A06;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = wSf.A00;
        }
        igTextView.setText(charSequence2);
        Typeface typeface = wSf.A01;
        if (typeface != null) {
            igTextView.setTypeface(typeface);
        }
        View view2 = ue3.A00;
        view2.setContentDescription(charSequence);
        if (wSf.A09) {
            ? r7 = ue3.A04;
            Drawable mutate = wSf.A03.mutate();
            if (wSf.A08) {
                A0B = R.color.igds_error_or_destructive;
            } else {
                A0B = 2Yu.A0B(context);
            }
            DbX.A11(context, mutate, A0B);
            r7.setImageDrawable(mutate);
            r7.A0H(A1U, 2Yu.A0B(context));
            view = r7;
        } else {
            ? r72 = ue3.A04;
            r72.setImageDrawable(wSf.A03);
            view = r72;
        }
        Drawable drawable = wSf.A02;
        if (drawable != null) {
            ImageView imageView = ue3.A01;
            Drawable mutate2 = drawable.mutate();
            DbX.A11(context, mutate2, 2Yu.A09(context));
            imageView.setImageDrawable(mutate2);
            imageView.setVisibility(0);
        }
        igTextView.setAlpha(1.0f);
        view.setAlpha(1.0f);
        IgTextView igTextView2 = ue3.A02;
        if (igTextView2.isEnabled()) {
            String str = wSf.A05;
            if (str != null) {
                igTextView2.setVisibility(0);
            } else {
                str = null;
            }
            igTextView2.setText(str);
        } else {
            C66581MXm.A15(context, igTextView2, 2131969640);
            igTextView2.setVisibility(0);
        }
        if (wSf.A07) {
            IgdsSwitch igdsSwitch = ue3.A05;
            igdsSwitch.setVisibility(0);
            igdsSwitch.A07 = new C65371LsC(5, context, userSession, ue3);
        }
        AnonymousClass0fU.A00(wSf.A04, view2);
        2eS.A01(view2);
    }

    public final Class modelClass() {
        return C19272WSf.class;
    }

    public C15780UiP(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
