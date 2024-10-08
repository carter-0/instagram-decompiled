package com.instagram.share.facebook.widget;

import X.002;
import X.0nA;
import X.0qQ;
import X.1QE;
import X.2Yu;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9IV;
import X.C71382cm;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public class FindPeopleButton extends LinearLayout {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public CircularImageView A07;
    public GradientSpinnerAvatarView A08;
    public String A09;
    public String A0A;
    public String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A01(context, (AttributeSet) null);
    }

    public final void setActionButtonOnClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            0qQ.A0F("container");
            throw AnonymousClass00P.createAndThrow();
        } else {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setAvatar(ImageUrl imageUrl, AnonymousClass0iw r6) {
        String str;
        AnonymousClass7TF.A1H(imageUrl, r6);
        ? r1 = this.A07;
        if (r1 == 0) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        } else {
            r1.setVisibility(8);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A08;
            str = "avatar";
            if (gradientSpinnerAvatarView != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r6, imageUrl);
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A08;
                if (gradientSpinnerAvatarView2 != null) {
                    gradientSpinnerAvatarView2.A07();
                    GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A08;
                    if (gradientSpinnerAvatarView3 != null) {
                        gradientSpinnerAvatarView3.setVisibility(0);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setDismissButtonOnClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        ImageView imageView = this.A02;
        if (imageView == null) {
            0qQ.A0F("dismissButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            imageView.setOnClickListener(onClickListener);
        }
    }

    private final void A00() {
        String str;
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            str = "container";
        } else {
            String str2 = this.A0B;
            if (str2 == null) {
                str = "defaultTitle";
            } else {
                String str3 = this.A0A;
                if (str3 == null) {
                    str = "defaultSubtitle";
                } else {
                    linearLayout.setContentDescription(002.A0g(str2, ", ", str3));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setChevronButtonVisibility(int i) {
        ImageView imageView = this.A01;
        if (imageView == null) {
            0qQ.A0F("chevronButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            imageView.setVisibility(i);
        }
    }

    public final void setDismissButtonEnabled(boolean z) {
        ImageView imageView = this.A02;
        if (imageView == null) {
            0qQ.A0F("dismissButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            imageView.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setIcon(int i) {
        ? r1 = this.A07;
        if (r1 == 0) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbU.A13(getContext(), r1, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    private final void A01(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        View inflate = DbV.A0D(this).inflate(R.layout.layout_find_people_button, this);
        this.A03 = (LinearLayout) inflate.requireViewById(R.id.layout_container_main);
        this.A07 = DbU.A0X(inflate, R.id.find_people_imageview);
        this.A08 = (GradientSpinnerAvatarView) inflate.requireViewById(R.id.find_people_avatarview);
        this.A06 = DbU.A0G(inflate, R.id.find_people_title);
        this.A05 = DbU.A0G(inflate, R.id.find_people_subtitle);
        this.A04 = DbU.A0G(inflate, R.id.find_people_action_button);
        this.A02 = DbU.A0F(inflate, R.id.find_people_dismiss_button);
        this.A01 = DbU.A0F(inflate, R.id.find_people_chevron_button);
        this.A0B = "";
        this.A0A = "";
        this.A09 = "";
        String str = "actionButton";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0m);
            0qQ.A07(obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(3)) {
                ? r1 = this.A07;
                if (r1 != 0) {
                    r1.setImageDrawable(obtainStyledAttributes.getDrawable(3));
                }
                0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                throw AnonymousClass00P.createAndThrow();
            }
            this.A00 = obtainStyledAttributes.getColor(4, 2Yu.A01(context));
            int color = obtainStyledAttributes.getColor(6, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            CircularImageView circularImageView = this.A07;
            if (circularImageView != null) {
                circularImageView.A0H(dimensionPixelSize, color);
                if (obtainStyledAttributes.hasValue(2) && (resourceId2 = obtainStyledAttributes.getResourceId(2, 0)) != 0) {
                    this.A0B = context.getString(resourceId2);
                }
                if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                    this.A0A = context.getString(resourceId);
                }
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId3 != 0) {
                        this.A09 = context.getString(resourceId3);
                    }
                } else {
                    TextView textView = this.A04;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                    ? r0 = this.A07;
                    if (r0 != 0) {
                        r0.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            throw AnonymousClass00P.createAndThrow();
        }
        int A022 = AnonymousClass7TG.A02(context);
        TextView textView2 = this.A04;
        if (textView2 != null) {
            0nA.A0h(textView2, A022, A022);
            LinearLayout linearLayout = this.A03;
            if (linearLayout == null) {
                str = "container";
            } else {
                2eS.A01(linearLayout);
                A00();
                TextView textView3 = this.A04;
                if (textView3 != null) {
                    1QE.A0G(textView3, textView3);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        TextView textView = this.A06;
        String str = DialogModule.KEY_TITLE;
        if (textView != null) {
            Context context = getContext();
            DbY.A12(textView, context);
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.getPaint().setFakeBoldText(true);
                TextView textView3 = this.A05;
                String str2 = "subtitle";
                if (textView3 != null) {
                    DbY.A11(textView3, context);
                    TextView textView4 = this.A06;
                    if (textView4 != null) {
                        String str3 = this.A0B;
                        if (str3 == null) {
                            str = "defaultTitle";
                        } else {
                            textView4.setText(str3);
                            TextView textView5 = this.A05;
                            if (textView5 != null) {
                                String str4 = this.A0A;
                                if (str4 == null) {
                                    str = "defaultSubtitle";
                                } else {
                                    textView5.setText(str4);
                                    TextView textView6 = this.A04;
                                    if (textView6 == null) {
                                        str2 = "actionButton";
                                    } else {
                                        String str5 = this.A09;
                                        if (str5 == null) {
                                            str = "defaultActionText";
                                        } else {
                                            textView6.setText(str5);
                                            ? r0 = this.A07;
                                            str = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
                                            if (r0 != 0) {
                                                if (r0.getDrawable() != null) {
                                                    ? r02 = this.A07;
                                                    if (r02 != 0) {
                                                        AnonymousClass7TE.A1R(r02.getDrawable().mutate(), this.A00);
                                                        return;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setButtonText(int i) {
        this.A09 = getContext().getString(i);
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(i);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        0qQ.A0F("actionButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setSubtitle(int i) {
        this.A0A = getContext().getString(i);
        TextView textView = this.A05;
        if (textView == null) {
            0qQ.A0F("subtitle");
            throw AnonymousClass00P.createAndThrow();
        }
        textView.setText(i);
        A00();
    }

    public final void setTitle(int i) {
        this.A0B = getContext().getString(i);
        TextView textView = this.A06;
        if (textView == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        textView.setText(i);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }

    public final void setButtonText(String str) {
        0qQ.A0B(str, 0);
        this.A09 = str;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(str);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        0qQ.A0F("actionButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setSubtitle(String str) {
        0qQ.A0B(str, 0);
        this.A0A = str;
        TextView textView = this.A05;
        if (textView == null) {
            0qQ.A0F("subtitle");
            throw AnonymousClass00P.createAndThrow();
        }
        textView.setText(str);
        A00();
    }

    public final void setTitle(String str) {
        0qQ.A0B(str, 0);
        this.A0B = str;
        TextView textView = this.A06;
        if (textView == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        textView.setText(str);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }
}
