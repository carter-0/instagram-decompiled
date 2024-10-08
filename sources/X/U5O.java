package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashSet;
import java.util.Set;

public final class U5O extends LinearLayout implements XBN {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public U5O(Context context) {
        super(context);
        Context context2 = getContext();
        LayoutInflater from = LayoutInflater.from(context2);
        0qQ.A07(from);
        DbY.A0z(from.inflate(R.layout.promote_row_with_radio_button, this, true));
        setGravity(16);
        int A0G = AnonymousClass7TE.A0G(getResources());
        setPadding(A0G, A0G, A0G, A0G);
        C13988Tno.A0q(context2, this, R.attr.backgroundDrawable);
        setOnClickListener(new WB8((Object) this, 11));
    }

    public final void A9W(MT5 mt5) {
        0qQ.A0B(mt5, 0);
        this.A02.add(mt5);
    }

    public final void EEF(MT5 mt5) {
        0qQ.A0B(mt5, 0);
        this.A02.remove(mt5);
    }

    public final void setRecommendedButton(UserSession userSession, FragmentActivity fragmentActivity, int i, View.OnClickListener onClickListener) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1C(fragmentActivity, 1, onClickListener);
        View A0G = AnonymousClass7TF.A0G(this, R.id.recommended_button);
        A0G.setOnClickListener(onClickListener);
        A0G.setVisibility(0);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (!A0q.getBoolean("has_seen_promote_objective_recommendation_button_tooltip", false)) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(fragmentActivity, AnonymousClass7TF.A0d(getResources(), i));
            A0f.A03(A0G);
            A0f.A0B = true;
            A0f.A02();
            A0G.post(new C20191Wmp(userSession, A0f));
            DbX.A1V(A0q, "has_seen_promote_objective_recommendation_button_tooltip", true);
        }
    }

    public final void setRecommendedTextV2(FragmentActivity fragmentActivity, UserSession userSession, boolean z, Boolean bool, View.OnClickListener onClickListener) {
        0xa A0q;
        String str;
        Runnable wmq;
        boolean A1U = AnonymousClass7TF.A1U(0, fragmentActivity, userSession);
        TextView A0B = DbW.A0B(this, R.id.recommended_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources resources = getResources();
        spannableStringBuilder.append(resources.getString(2131961000)).append(resources.getString(2131970431));
        spannableStringBuilder.setSpan(new StyleSpan(A1U ? 1 : 0), 0, DbX.A05(spannableStringBuilder.toString()), 34);
        A0B.setText(spannableStringBuilder);
        if (z) {
            A0B.setOnClickListener(new WBH(65, (Object) fragmentActivity, (Object) userSession));
            A0q = AnonymousClass7TE.A0q(userSession);
            str = "has_seen_promote_messaging_ads_recommendation_tooltip";
            if (!A0q.getBoolean(str, false)) {
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(fragmentActivity, AnonymousClass7TF.A0d(resources, 2131970432));
                A0f.A03(A0B);
                A0f.A0B = A1U;
                A0f.A02();
                wmq = new Wj1(A0f);
            } else {
                return;
            }
        } else if (AnonymousClass7TF.A1Y(bool, A1U)) {
            A0B.setVisibility(0);
            A0B.setOnClickListener(onClickListener);
            A0q = AnonymousClass7TE.A0q(userSession);
            str = "has_seen_promote_objective_recommendation_button_tooltip";
            if (!A0q.getBoolean(str, false)) {
                AnonymousClass5Gt A0f2 = AnonymousClass7TG.A0f(fragmentActivity, AnonymousClass7TF.A0d(resources, 2131970433));
                A0f2.A03(A0B);
                A0f2.A0B = A1U;
                A0f2.A02();
                wmq = new C20192Wmq(userSession, A0f2);
            } else {
                return;
            }
        } else {
            return;
        }
        A0B.post(wmq);
        DbX.A1V(A0q, str, A1U);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        DbX.A1G(AnonymousClass7TG.A0R(this, R.id.secondary_text), charSequence);
    }

    public final void setSecondaryWarningText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        DbX.A1G(AnonymousClass7TG.A0R(this, R.id.secondary_warning_text), charSequence);
    }

    public final void setWarningText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        DbX.A1G(AnonymousClass7TG.A0R(this, R.id.warning_text), charSequence);
    }

    public static /* synthetic */ void setRecommendedTextV2$default(U5O u5o, FragmentActivity fragmentActivity, UserSession userSession, boolean z, Boolean bool, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        if ((i & 16) != 0) {
            onClickListener = null;
        }
        u5o.setRecommendedTextV2(fragmentActivity, userSession, z, bool, onClickListener);
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        0qQ.A07(onCreateDrawableState);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (MT5 D1Y : this.A02) {
                    D1Y.D1Y(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public final void setSubtitleContainerOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            requireViewById(R.id.subtitle_container).setOnClickListener(onClickListener);
        }
    }

    public final void A00() {
        View A0b = AnonymousClass7TE.A0b(this, R.id.select_radio);
        A0b.setEnabled(false);
        A0b.setAlpha(0.3f);
        setOnClickListener((View.OnClickListener) null);
    }

    public final void A01() {
        View A0b = AnonymousClass7TE.A0b(this, R.id.select_radio);
        A0b.setEnabled(true);
        A0b.setAlpha(1.0f);
        setOnClickListener(new WB8((Object) this, 12));
    }

    public final void A02() {
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.primary_text_description);
        CharSequence text = A0R.getText();
        if (text != null && text.length() != 0) {
            A0R.setVisibility(0);
        }
    }

    public final void A03(boolean z) {
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.action_label_text);
        CharSequence text = A0R.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0R.setVisibility(i);
        }
    }

    public final void A04(boolean z) {
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.secondary_text);
        CharSequence text = A0R.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0R.setVisibility(i);
            if (z && AnonymousClass7TF.A0G(this, R.id.primary_text_description).getVisibility() == 0) {
                0nA.A0c(A0R, DbY.A01(getContext()));
            }
        }
    }

    public final void A05(boolean z) {
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.secondary_warning_text);
        CharSequence text = A0R.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0R.setVisibility(i);
        }
    }

    public final void A06(boolean z) {
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.warning_text);
        CharSequence text = A0R.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0R.setVisibility(i);
        }
    }

    public final TextView getActionLabelView() {
        return AnonymousClass7TG.A0R(this, R.id.action_label_text);
    }

    public final void setActionLabel(String str, UserSession userSession, View.OnClickListener onClickListener) {
        DbY.A1S(str, onClickListener);
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.action_label_text);
        A0R.setText(str);
        A0R.setOnClickListener(onClickListener);
        if (userSession != null && 182.A06(0Tu.A05, userSession, 36326240684226196L)) {
            Context context = getContext();
            DbT.A17(context, A0R, 2Yu.A06(context));
        }
    }

    public final void setImageView(ImageUrl imageUrl, AnonymousClass0iw r3) {
        AnonymousClass7TG.A1N(imageUrl, r3);
        DbX.A0b(this, R.id.promote_row_image).setUrl(imageUrl, r3);
    }

    public final void setPrimaryText(int i) {
        DbU.A0G(this, R.id.primary_text).setText(i);
    }

    public final void setPrimaryTextDescription(int i) {
        DbU.A0G(this, R.id.primary_text_description).setText(i);
    }

    public final void setRecommendedText(Integer num) {
        TextView A0B = DbW.A0B(this, R.id.secondary_text);
        String obj = A0B.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources resources = getResources();
        String A0d = AnonymousClass7TF.A0d(resources, 2131970431);
        spannableStringBuilder.append(A0d);
        if (num != null) {
            spannableStringBuilder.append(resources.getString(2131961000)).append(resources.getString(num.intValue()));
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, A0d.length(), 17);
        A0B.setText(new SpannableStringBuilder().append(spannableStringBuilder).append(10).append(10).append(obj));
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }

    public final void setPrimaryText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        DbX.A1E(this, charSequence, R.id.primary_text);
    }

    public final void setPrimaryTextDescription(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        DbX.A1E(this, charSequence, R.id.primary_text_description);
    }

    public final void setSecondaryText(int i) {
        DbU.A0G(this, R.id.secondary_text).setText(i);
    }

    public final void setSecondaryText(String str) {
        0qQ.A0B(str, 0);
        DbX.A1E(this, str, R.id.secondary_text);
    }
}
