package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MjR  reason: case insensitive filesystem */
public final class C67169MjR extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final C67155MjD A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        if (DbS.A04(DbS.A0J(userSession, 0), userSession, 36609906094512069L) > 0) {
            inflate = 2Su.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.layout_header_with_action_text);
        } else {
            inflate = layoutInflater.inflate(R.layout.layout_header_with_action_text, viewGroup, false);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C67473MoT(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        Context context;
        AnonymousClass59G A002;
        C66938MfX mfX = (C66938MfX) r12;
        C67473MoT moT = (C67473MoT) r13;
        AnonymousClass7TF.A1H(mfX, moT);
        moT.A03.setText(mfX.A01);
        TextView textView = moT.A04;
        2eS.A01(textView);
        ImageView imageView = moT.A02;
        2eS.A04(imageView, AnonymousClass05K.A15);
        if (mfX.A02) {
            textView.setVisibility(8);
            C71395Oju.A00(moT.A00, 35, this);
            boolean A06 = 182.A06(0Tu.A06, this.A01, 36322293609408565L);
            ImageView imageView2 = moT.A01;
            int i = R.drawable.instagram_x_pano_outline_8;
            if (A06) {
                i = R.drawable.instagram_x_pano_outline_12;
            }
            imageView2.setImageResource(i);
            imageView2.setVisibility(0);
            return;
        }
        UserSession userSession = this.A01;
        C67028Mh1 A003 = C67026Mgz.A00(userSession, AnonymousClass61K.DIRECT_INBOX);
        if (A003 == null || !A003.A08.get()) {
            context = this.A00;
            A002 = C66827MdJ.A00(context, userSession, mfX.A00);
        } else {
            context = this.A00;
            A002 = C66862Mdv.A00(AnonymousClass7TF.A0A(context), mfX.A00, A003.A09.get(), A003.A0A.get());
        }
        textView.setText((String) A002.A02);
        C71395Oju.A00(textView, 36, this);
        moT.A01.setVisibility(8);
        DbT.A17(context, textView, 1QE.A01(context));
        textView.setVisibility(0);
        if (!182.A06(0Tu.A05, userSession, 36329393190092888L) || AnonymousClass0oH.A01(context)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        C71395Oju.A00(imageView, 37, this);
    }

    public final Class modelClass() {
        return C66938MfX.class;
    }

    public C67169MjR(Context context, UserSession userSession, C67155MjD mjD) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = mjD;
    }
}
