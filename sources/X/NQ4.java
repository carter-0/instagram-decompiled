package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class NQ4 extends C232232tF {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74446Pv1 A03;
    public final C67077Mhs A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67994MyM(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_channel_discovery_row_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        Context context;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        N64 n64 = (N64) r14;
        C67994MyM myM = (C67994MyM) r15;
        boolean A1U = AnonymousClass7TF.A1U(0, n64, myM);
        boolean z = n64.A09;
        TextView textView = myM.A01;
        textView.setText(n64.A08);
        TextView textView2 = myM.A00;
        Context A0S = AnonymousClass7TE.A0S(textView2);
        Resources resources = A0S.getResources();
        String str = n64.A04;
        String A0e = AnonymousClass7TF.A0e(resources, str, 2131959456);
        0qQ.A07(A0e);
        textView2.setText(C69914NuG.A00(A0S, A0e, str, n64.A0A));
        ImageUrl imageUrl = n64.A02;
        if (imageUrl != null) {
            Integer num = n64.A03;
            if (num == null || AnonymousClass48O.A01(num.intValue()) != A1U) {
                gradientSpinnerAvatarView = myM.A03;
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this.A01, imageUrl);
            } else {
                gradientSpinnerAvatarView = myM.A03;
                gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, this.A01, imageUrl, n64.A01);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
        if (!z || !this.A05) {
            textView.setTypeface((Typeface) null, 0);
            context = this.A00;
            DbY.A11(textView2, context);
            textView2.setTypeface((Typeface) null, 0);
        } else {
            textView.setTypeface((Typeface) null, A1U ? 1 : 0);
            context = this.A00;
            DbY.A12(textView2, context);
            textView2.setTypeface((Typeface) null, A1U);
        }
        if (this.A05) {
            C46488Dfr.A00(myM.A02, this.A04, C66696Mb3.A00(context, z, false, false, false, false));
        }
        C71405Ok4.A01(myM.itemView, 30, n64, this);
        myM.itemView.setOnLongClickListener(new FPY(A1U, myM, this, n64));
        this.A03.Dg4(n64.A07, n64.A00, n64.A03);
    }

    public final Class modelClass() {
        return N64.class;
    }

    public NQ4(Context context, AnonymousClass0iw r3, UserSession userSession, C74446Pv1 pv1, boolean z) {
        C51972G9s.A1C(userSession, pv1);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = pv1;
        this.A05 = z;
        this.A04 = new C67077Mhs(context);
    }
}
