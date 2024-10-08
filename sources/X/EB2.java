package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;

public final class EB2 extends C336937fQ {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final E6a A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-2085550915);
        if (view == null) {
            view = DbU.A08(LayoutInflater.from(this.A00), R.layout.featured_user_header);
            view.setTag(new C50900Fkf(view));
        }
        Context context = this.A00;
        AnonymousClass0iw r6 = this.A01;
        C50900Fkf fkf = (C50900Fkf) DbT.A0o(view);
        DwA dwA = (DwA) obj3;
        UserSession userSession = this.A02;
        E6a e6a = this.A03;
        User user = dwA.A03;
        IgImageView igImageView = fkf.A0B;
        DbU.A1S(r6, igImageView, user);
        DbU.A1H(fkf.A08, user);
        String fullName = user.getFullName();
        boolean isEmpty = TextUtils.isEmpty(fullName);
        TextView textView = fkf.A06;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(fullName);
        }
        fkf.A07.setText(user.A03.Bgn());
        C267064at r0 = fkf.A0D.A0J;
        r0.A07(new EUC(1, context, userSession, fkf, e6a));
        r0.A03(r6, userSession, user);
        FP7.A00(fkf.A09, 12, e6a, user);
        C324576zY r62 = dwA.A02;
        Reel reel = dwA.A01;
        if (!(reel != null || r62 == null || r62.A00() == null)) {
            reel = 1OP.A05(userSession).A0I(r62.A00(), false);
            dwA.A01 = reel;
        }
        if (!dwA.A04.booleanValue() || reel == null || (reel.A15(userSession) && reel.A0z(userSession))) {
            fkf.A03 = null;
            fkf.A0C.setVisibility(4);
            fkf.A05.setOnTouchListener((View.OnTouchListener) null);
        } else {
            fkf.A03 = reel.getId();
            boolean A16 = reel.A16(userSession);
            GradientSpinner gradientSpinner = fkf.A0C;
            if (A16) {
                gradientSpinner.A04();
            } else {
                gradientSpinner.A02();
            }
            gradientSpinner.setVisibility(0);
            igImageView.setClickable(false);
            fkf.A05.setOnTouchListener(fkf.A0A);
        }
        fkf.A0A.A02();
        AnonymousClass6VJ r1 = fkf.A01;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A0C);
            fkf.A01 = null;
        }
        fkf.A02 = new C49525Ex5(fkf, e6a);
        AnonymousClass0fD.A0A(1313919961, A032);
        return view;
    }

    public EB2(Context context, AnonymousClass0iw r2, UserSession userSession, E6a e6a) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = e6a;
    }
}
