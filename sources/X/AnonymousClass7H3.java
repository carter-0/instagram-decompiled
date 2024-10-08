package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.7H3  reason: invalid class name */
public final class AnonymousClass7H3 extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass7H3(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-927433184);
        0qQ.A0B(view, 1);
        if (view.getTag() == null) {
            i2 = -706891885;
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.commands.core.CommandData");
            C3260875i r11 = (C3260875i) obj;
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.mentions.AutoCompleteMentionUserRowViewBinder.Holder");
            C49541Exc exc = (C49541Exc) tag;
            0qQ.A0B(exc, 0);
            0qQ.A0B(r11, 1);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = exc.A02;
            ? r3 = gradientSpinnerAvatarView.A0K;
            Context context = r3.getContext();
            0qQ.A07(context);
            r3.setImageDrawable(AnonymousClass4Ed.A01(context, r11.A00(), 2Yu.A0H(context, R.attr.glyphColorPrimary)));
            r3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            exc.A00.setText(r11.A05());
            exc.A01.setText(r11.A04());
            i2 = -734270162;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-470344027);
        0qQ.A0B(viewGroup, 1);
        View A002 = C48873ElZ.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(-1813577787, A03);
        return A002;
    }
}
