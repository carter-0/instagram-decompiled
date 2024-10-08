package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6V6  reason: invalid class name */
public final class AnonymousClass6V6 extends C308586Uv {
    public final List A00 = new ArrayList();
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 13));
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 14));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 15));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6V6(ViewStub viewStub) {
        super(viewStub, R.id.reel_viewer_superlative_conclusion_card_container);
        0qQ.A0B(viewStub, 1);
    }

    public final void A08(Context context, AnonymousClass0iw r20, UserSession userSession, 1Xj r22, User user, CharSequence charSequence, String str, int i, int i2, int i3, int i4, boolean z) {
        I05 i05;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        LayoutInflater from = LayoutInflater.from(context2);
        AnonymousClass0eM r7 = this.A02;
        int i5 = i4;
        View inflate = from.inflate(i5, (ViewGroup) r7.getValue(), false);
        inflate.setTag(str);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
        inflate.setLayoutParams(layoutParams);
        ((ViewGroup) r7.getValue()).addView(inflate);
        IgImageView requireViewById = inflate.requireViewById(R.id.superlative_conclusion_item_image);
        0qQ.A07(requireViewById);
        IgImageView igImageView = requireViewById;
        IgTextView requireViewById2 = inflate.requireViewById(R.id.superlative_conclusion_item_description_text);
        0qQ.A07(requireViewById2);
        IgTextView igTextView = requireViewById2;
        AnonymousClass0iw r10 = r20;
        1Xj r12 = r22;
        if (z) {
            i05 = new I05(r10, igImageView, r12, (Integer) null, "conclusion_card", (float) context2.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), true, true);
        } else {
            i05 = new I05(r10, igImageView, r12, (Integer) null, "conclusion_card", 240, false, false);
        }
        A07(i05);
        User user2 = user;
        if (user != null) {
            IgImageView requireViewById3 = inflate.requireViewById(R.id.superlative_conclusion_item_mention);
            0qQ.A07(requireViewById3);
            IgImageView igImageView2 = requireViewById3;
            igImageView2.setImageDrawable(ADW.A00.A00(context2, userSession2, user2, 16));
            igImageView2.setOnTouchListener(new C56816IDn(this, user2));
            int i6 = i3;
            if (!inflate.isLaidOut() || inflate.isLayoutRequested()) {
                inflate.addOnLayoutChangeListener(new LYQ(inflate, igImageView2, this, user2, i6));
            } else {
                float height = ((float) igImageView2.getHeight()) / ((float) igImageView2.getDrawable().getIntrinsicHeight());
                this.A00.add(new SuperlativeMentionSticker(C63412KwY.A00(A04(), igImageView2, i6, ((View) r7.getValue()).getTop() + inflate.getTop()), user2, 0.0f, height, 16));
            }
        }
        CharSequence charSequence2 = charSequence;
        if (!igTextView.isLaidOut() || igTextView.isLayoutRequested()) {
            igTextView.addOnLayoutChangeListener(new C40029AOl(igTextView, charSequence2, i5));
            return;
        }
        igTextView.setText(charSequence2);
        float height2 = (float) igTextView.getHeight();
        float f = 1.3f;
        if (i5 == R.layout.layout_superlative_conclusion_card_item_top_post) {
            f = 2.5f;
        }
        igTextView.setTextSize(0, height2 / f);
    }
}
