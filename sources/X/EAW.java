package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.text.DecimalFormat;

public final class EAW extends C231632rz {
    public Context A00;
    public C19388WXf A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAW(Context context, C19388WXf wXf, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = wXf;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        int intValue;
        int A032 = AnonymousClass0fD.A03(-1946988018);
        Context context = this.A00;
        C49625Ezi ezi = (C49625Ezi) view.getTag();
        Hashtag hashtag = (Hashtag) obj;
        C19388WXf wXf = this.A01;
        AnonymousClass0iw r5 = this.A02;
        UserSession userSession = this.A03;
        boolean A06 = 182.A06(DbS.A0J(userSession, 0), userSession, 36323418890579094L);
        boolean A1U = AnonymousClass7TF.A1U(0, context, ezi);
        AnonymousClass7TG.A0w(2, hashtag, wXf, r5);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = ezi.A04;
        0qQ.A0B(gradientSpinnerAvatarView, 0);
        if (C253833rU.A02(hashtag.Bh3())) {
            Context A0S = AnonymousClass7TE.A0S(gradientSpinnerAvatarView);
            Drawable drawable = A0S.getDrawable(R.drawable.instagram_hashtag_pano_outline_24);
            if (drawable != null) {
                gradientSpinnerAvatarView.A0D(drawable);
                int A022 = AnonymousClass7TG.A02(A0S);
                gradientSpinnerAvatarView.setPadding(A022, A022, A022, A022);
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        } else {
            ImageUrl Bh3 = hashtag.Bh3();
            if (Bh3 != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, Bh3);
                gradientSpinnerAvatarView.setPadding(0, 0, 0, 0);
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        }
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        ezi.A01.setText(0mp.A06("#%s", new Object[]{hashtag.getName()}));
        if (A06) {
            ezi.A02.setVisibility(8);
        } else {
            TextView textView = ezi.A02;
            String BqG = hashtag.BqG();
            if (BqG == null || BqG.length() == 0) {
                Resources A0A = AnonymousClass7TF.A0A(context);
                Integer BPt = hashtag.BPt();
                if (BPt == null || (intValue = BPt.intValue()) <= 0) {
                    str = "";
                } else {
                    DecimalFormat decimalFormat = new DecimalFormat();
                    decimalFormat.setGroupingUsed(A1U);
                    decimalFormat.setMaximumFractionDigits(0);
                    str = DbV.A0v(A0A, decimalFormat.format((long) intValue), R.plurals.number_of_posts, intValue);
                    0qQ.A0A(str);
                }
            } else {
                str = hashtag.BqG();
            }
            textView.setText(str);
        }
        ezi.A03.A01(r5, wXf, hashtag);
        FPF.A00(ezi.A00, 43, wXf, hashtag);
        AnonymousClass0fD.A0A(1551263516, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1938701344);
        Context context = this.A00;
        AnonymousClass7TF.A1H(context, viewGroup);
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.follow_list_row, false);
        A0A.setTag(new C49625Ezi(A0A, (int) DbX.A00(context)));
        AnonymousClass0fD.A0A(-1671576838, A032);
        return A0A;
    }
}
