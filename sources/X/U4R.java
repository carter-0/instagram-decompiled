package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class U4R extends FrameLayout {
    public C20865X1r A00;
    public final AnonymousClass3NM A01;
    public final View A02 = requireViewById(R.id.question_close_button);
    public final TextView A03 = DbU.A0G(this, R.id.question_body);
    public final TextView A04 = DbU.A0G(this, R.id.question_title);
    public final CircularImageView A05 = DbU.A0X(this, R.id.user_avatar);

    public final void setAvatar(ImageUrl imageUrl, AnonymousClass0iw r4) {
        AnonymousClass7TF.A1H(imageUrl, r4);
        if (!C253833rU.A02(imageUrl)) {
            IgImageView igImageView = this.A05;
            igImageView.setUrl(imageUrl, r4);
            igImageView.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setQuestionBody(String str) {
        0qQ.A0B(str, 0);
        this.A03.setText(str);
        this.A05.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A00(Context context) {
        int i;
        if (this.A05.getVisibility() == 0) {
            i = JTR.A07(context);
        } else {
            i = 0;
        }
        int A09 = 0nA.A09(context) - (AnonymousClass7TG.A05(context) * 2);
        TextView textView = this.A03;
        C13989Tnp.A19(textView, (A09 - (context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 3)) - i, AnonymousClass972.MUTABLE_FLAG_MASK);
        C13988Tno.A11(this, textView.getMeasuredHeight() + this.A04.getLineHeight() + (AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap) * 2) + AnonymousClass7TG.A04(context), SN3.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(A09, SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setCloseButtonVisibility(boolean z) {
        View view = this.A02;
        view.setVisibility(DbW.A01(z ? 1 : 0));
        if (z) {
            view.setOnClickListener(new WB0(this, 38));
        }
    }

    public final void setQuestionStickerListener(C20865X1r x1r) {
        this.A00 = x1r;
    }

    public U4R(Context context) {
        super(context);
        View.inflate(context, R.layout.layout_iglive_question_sticker_redesign, this);
        AnonymousClass3NG r2 = new AnonymousClass3NG(this);
        r2.A04 = new C15848UjY(this, 31);
        this.A01 = r2.A00();
    }

    public final void setQuestionBodyWithUser(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append(str2).append(" ");
        0qQ.A0A(append);
        AnonymousClass7AV.A02(append, new CharacterStyle(), str2);
        this.A03.setText(spannableStringBuilder.append(str));
    }
}
