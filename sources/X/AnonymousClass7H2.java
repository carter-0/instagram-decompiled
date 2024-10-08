package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.7H2  reason: invalid class name */
public final class AnonymousClass7H2 extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass7H2(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(519982683);
        0qQ.A0B(view, 1);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.commands.core.MentionedUserData");
        AnonymousClass77I r10 = (AnonymousClass77I) obj;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.mentions.AutoCompleteMentionUserRowViewBinder.Holder");
        C49541Exc exc = (C49541Exc) tag;
        AnonymousClass0iw r5 = this.A01;
        0qQ.A0B(exc, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r5, 2);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = exc.A02;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, r10.A01);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.A0K.setScaleType(ImageView.ScaleType.FIT_CENTER);
        exc.A00.setText(r10.A09);
        String str = r10.A0A;
        if (str == null || str.length() == 0) {
            TextView textView = exc.A01;
            textView.setVisibility(8);
            C244273av.A0B(textView, false);
        } else {
            TextView textView2 = exc.A01;
            textView2.setVisibility(0);
            textView2.setText(str);
            C244273av.A0B(textView2, r10.A0D);
        }
        AnonymousClass0fD.A0A(946340197, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1835686367);
        0qQ.A0B(viewGroup, 1);
        View A002 = C48873ElZ.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(-238093154, A03);
        return A002;
    }
}
