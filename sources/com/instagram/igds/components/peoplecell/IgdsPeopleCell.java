package com.instagram.igds.components.peoplecell;

import X.0nA;
import X.0qQ;
import X.1OP;
import X.2b1;
import X.2eS;
import X.AnonymousClass0iw;
import X.AnonymousClass32A;
import X.AnonymousClass3NW;
import X.AnonymousClass3PQ;
import X.AnonymousClass3Z5;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8DV;
import X.AnonymousClass9IV;
import X.C244273av;
import X.C252063oV;
import X.C308436Ug;
import X.C49550Exl;
import X.C71382cm;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.FO6;
import X.FPH;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsPeopleCell extends LinearLayout implements AnonymousClass0iw {
    public AnonymousClass32A A00;
    public String A01;
    public int A02;
    public int A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final C252063oV A07;
    public final GradientSpinnerAvatarView A08;
    public final StackedAvatarView A09;
    public final boolean A0A;
    public final LinearLayout A0B;
    public final TextView A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context) {
        this(context, (AttributeSet) null, 0, false);
        0qQ.A0B(context, 1);
    }

    public static final void A00(Bitmap bitmap, Drawable drawable, View.OnClickListener onClickListener, UserSession userSession, ImageUrl imageUrl, IgdsPeopleCell igdsPeopleCell, C49550Exl exl, User user, boolean z, boolean z2) {
        Context context;
        int i;
        IgdsPeopleCell igdsPeopleCell2 = igdsPeopleCell;
        igdsPeopleCell.A09.setVisibility(8);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell.A08;
        gradientSpinnerAvatarView.setVisibility(0);
        2eS.A01(gradientSpinnerAvatarView);
        Resources resources = gradientSpinnerAvatarView.getResources();
        int i2 = R.dimen.action_button_settings_height;
        if (z) {
            i2 = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int i3 = R.dimen.abc_list_item_height_material;
        if (z) {
            i3 = R.dimen.alert_dialog_button_cell_height;
        }
        gradientSpinnerAvatarView.A0B(dimensionPixelSize, resources.getDimensionPixelSize(i3));
        if (exl == null || userSession == null) {
            if (imageUrl != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, igdsPeopleCell, imageUrl);
            } else if (drawable != null) {
                gradientSpinnerAvatarView.A0D(drawable);
            } else if (bitmap != null) {
                AnonymousClass8DV r2 = new AnonymousClass8DV(resources, bitmap);
                r2.A02((float) (bitmap.getHeight() / 2));
                r2.A08.setAntiAlias(true);
                r2.invalidateSelf();
                gradientSpinnerAvatarView.setGradientSpinnerVisible(!z2);
                gradientSpinnerAvatarView.A0D(r2);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setOnClickListener(onClickListener);
        } else {
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, igdsPeopleCell, exl.A02.Bh3());
            View.OnClickListener onClickListener2 = exl.A00;
            if (onClickListener2 != null) {
                gradientSpinnerAvatarView.setOnClickListener(onClickListener2);
            } else if (user != null) {
                1OP r0 = 1OP.$redex_init_class;
                Reel A022 = AnonymousClass3PQ.A02(userSession, user);
                if (A022 != null) {
                    gradientSpinnerAvatarView.setGradientColor(AnonymousClass3NW.A00(userSession, A022));
                    gradientSpinnerAvatarView.setOnClickListener(new FO6(10, gradientSpinnerAvatarView, A022, igdsPeopleCell2, AnonymousClass7TE.A1I(A022)));
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
                    context = gradientSpinnerAvatarView.getContext();
                    i = 2131973009;
                } else {
                    gradientSpinnerAvatarView.setOnClickListener(new FPH(33, (Object) user, (Object) igdsPeopleCell, (Object) userSession));
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                    context = gradientSpinnerAvatarView.getContext();
                    i = 2131963112;
                }
                gradientSpinnerAvatarView.setContentDescription(DbY.A0b(context, user, i));
            }
        }
        gradientSpinnerAvatarView.A07();
    }

    public final void A03(UserSession userSession, C49550Exl exl, User user) {
        0qQ.A0B(userSession, 0);
        this.A00 = new AnonymousClass32A(this, userSession, DbV.A0f(exl.A01));
        this.A01 = AnonymousClass7TF.A0b();
        A00((Bitmap) null, (Drawable) null, (View.OnClickListener) null, userSession, (ImageUrl) null, this, exl, user, this.A0A, false);
    }

    public final void A04(ImageUrl imageUrl, View.OnClickListener onClickListener) {
        0qQ.A0B(imageUrl, 0);
        A00((Bitmap) null, (Drawable) null, onClickListener, (UserSession) null, imageUrl, this, (C49550Exl) null, (User) null, this.A0A, true);
    }

    public final void A05(AnonymousClass3Z5 r5, AnonymousClass3Z5 r6) {
        View view;
        View view2;
        0qQ.A0B(r5, 0);
        if ((r5 instanceof View) && (view = (View) r5) != null) {
            int generateViewId = View.generateViewId();
            this.A02 = generateViewId;
            view.setId(generateViewId);
            LinearLayout linearLayout = this.A0B;
            linearLayout.removeAllViews();
            linearLayout.addView(view);
            linearLayout.setVisibility(0);
            if (r6 != null && (r6 instanceof View) && (view2 = (View) r6) != null) {
                this.A03 = R.id.secondary_right_add_on_button;
                view2.setId(R.id.secondary_right_add_on_button);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.leftMargin = DbS.A02(AnonymousClass7TE.A0S(this), 12);
                linearLayout.addView(view2, layoutParams);
            }
        }
    }

    public final void A06(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.A0C.setVisibility(8);
            return;
        }
        TextView textView = this.A0C;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public final void A07(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.A06.setVisibility(8);
            return;
        }
        TextView textView = this.A06;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public final void A08(CharSequence charSequence, boolean z) {
        0qQ.A0B(charSequence, 0);
        if (charSequence.length() > 0) {
            TextView textView = this.A05;
            textView.setText(charSequence);
            C244273av.A0B(textView, z);
            return;
        }
        throw AnonymousClass7TE.A0w("You must specify non-empty primary text.");
    }

    public String getModuleName() {
        return "igds_people_cell_component";
    }

    public static /* synthetic */ void setImageViewInternal$default(IgdsPeopleCell igdsPeopleCell, boolean z, UserSession userSession, C49550Exl exl, ImageUrl imageUrl, Drawable drawable, View.OnClickListener onClickListener, Bitmap bitmap, boolean z2, User user, int i, Object obj) {
        int i2 = i;
        boolean z3 = z2;
        Bitmap bitmap2 = bitmap;
        View.OnClickListener onClickListener2 = onClickListener;
        Drawable drawable2 = drawable;
        ImageUrl imageUrl2 = imageUrl;
        C49550Exl exl2 = exl;
        UserSession userSession2 = userSession;
        User user2 = null;
        if ((i & 2) != 0) {
            userSession2 = null;
        }
        if ((i & 4) != 0) {
            exl2 = null;
        }
        if ((i & 8) != 0) {
            imageUrl2 = null;
        }
        if ((i & 16) != 0) {
            drawable2 = null;
        }
        if ((i & 32) != 0) {
            onClickListener2 = null;
        }
        if ((i & 64) != 0) {
            bitmap2 = null;
        }
        if ((i2 & 128) != 0) {
            z3 = false;
        }
        if ((i2 & 256) == 0) {
            user2 = user;
        }
        A00(bitmap2, drawable2, onClickListener2, userSession2, imageUrl2, igdsPeopleCell, exl2, user2, z, z3);
    }

    public final void A01() {
        View view = this.A04;
        view.setBackgroundResource(0);
        this.A06.setVisibility(8);
        this.A0C.setVisibility(8);
        LinearLayout linearLayout = this.A0B;
        linearLayout.setVisibility(8);
        int i = this.A02;
        if (i != -1) {
            linearLayout.removeView(view.findViewById(i));
        }
        int i2 = this.A03;
        if (i2 != -1) {
            linearLayout.removeView(view.findViewById(i2));
        }
        this.A08.setVisibility(8);
        this.A09.setVisibility(8);
    }

    public final GradientSpinnerAvatarView getImageView() {
        return this.A08;
    }

    public final TextView getPrimaryTextView() {
        return this.A05;
    }

    public final TextView getSecondaryTextView() {
        return this.A06;
    }

    public final void A02(View.OnClickListener onClickListener, User user) {
        A08(user.getUsername(), user.isVerified());
        A07(user.getFullName());
        this.A07.setVisibility(DbW.A01(C308436Ug.A02(user) ? 1 : 0));
        A04(user.Bh3(), onClickListener);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            DbU.A11(getContext(), this.A04, R.drawable.menu_row_pressed_state);
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        if (onLongClickListener != null) {
            DbU.A11(getContext(), this.A04, R.drawable.menu_row_pressed_state);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = -1;
        this.A03 = -1;
        View inflate = View.inflate(getContext(), R.layout.people_cell, this);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (inflate.getId() == -1) {
            inflate.setId(View.generateViewId());
        }
        0nA.A0l(inflate, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_button_padding_horizontal_material);
        this.A04 = inflate;
        this.A05 = AnonymousClass7TE.A0d(inflate, R.id.primary_text);
        this.A0B = (LinearLayout) inflate.findViewById(R.id.add_on_container);
        this.A06 = AnonymousClass7TE.A0d(inflate, R.id.secondary_text);
        this.A0C = AnonymousClass7TE.A0d(inflate, R.id.additional_supporting_text);
        this.A08 = (GradientSpinnerAvatarView) inflate.findViewById(R.id.imageview);
        this.A09 = (StackedAvatarView) inflate.findViewById(R.id.stacked_avatar);
        this.A07 = 2b1.A01(inflate.findViewById(R.id.internal_badge), false, false);
        inflate.findViewById(R.id.text_container).setImportantForAccessibility(1);
        inflate.setImportantForAccessibility(2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1Y, i, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A0A = obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsPeopleCell(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, boolean z) {
        this(context, (AttributeSet) null, 0, z);
        0qQ.A0B(context, 1);
    }
}
