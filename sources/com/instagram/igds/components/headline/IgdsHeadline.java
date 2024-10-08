package com.instagram.igds.components.headline;

import X.0qQ;
import X.2Yu;
import X.2eO;
import X.2eQ;
import X.2eS;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.C240963Ni;
import X.C273014lo;
import X.C3255172x;
import X.C3255272z;
import X.C71662eb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.facepile.IgdsFacepile;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsHeadline extends ConstraintLayout implements AnonymousClass0iw {
    public C71662eb A00;
    public C3255272z A01;
    public boolean A02;
    public Integer[] A03;
    public C71662eb A04;
    public C71662eb A05;
    public C71662eb A06;
    public C71662eb A07;
    public C71662eb A08;
    public final boolean A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    public String getModuleName() {
        return "igds_headline_component";
    }

    public final void setBody(int i) {
        A08(R.id.igds_headline_body, i);
        View requireViewById = requireViewById(R.id.igds_headline_body);
        0qQ.A07(requireViewById);
        requireViewById.setOnClickListener((View.OnClickListener) null);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setCircularImageBitmap(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        A01(this, (Integer) null).setImageBitmap(bitmap);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setCircularImageDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        A01(this, (Integer) null).setImageDrawable(drawable);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 0);
        A01(this, (Integer) null).setUrl(imageUrl, this);
    }

    public final void setFacepile(List list) {
        setFacepile(list, (String) null);
    }

    public final void setImageBitmap(Bitmap bitmap, C240963Ni r3) {
        0qQ.A0B(bitmap, 0);
        A02(r3).setImageBitmap(bitmap);
    }

    public final void setImageResource(int i) {
        EZe(i, false);
    }

    public final void setImageURL(ImageUrl imageUrl) {
        setImageURL(imageUrl, (AnonymousClass0iw) null, (C240963Ni) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r7.A02 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRoundedCornerImageUrl(com.instagram.common.typedurl.ImageUrl r8, X.AnonymousClass0iw r9) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.2eb r2 = r7.A00
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x0014
            android.view.ViewStub r1 = r2.A01
            if (r1 == 0) goto L_0x0014
            r0 = 2131626069(0x7f0e0855, float:1.8879364E38)
            r1.setLayoutResource(r0)
        L_0x0014:
            android.view.View r3 = r2.A01()
            X.0qQ.A07(r3)
            r3.setVisibility(r5)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L_0x0073
            boolean r0 = r7 instanceof X.C3255172x
            if (r0 != 0) goto L_0x0031
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0031
            boolean r0 = r7.A02
            r2 = 1
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            if (r2 == 0) goto L_0x003e
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
        L_0x003e:
            int r0 = r1.getDimensionPixelSize(r0)
            r4.width = r0
            r4.height = r0
            r3.setLayoutParams(r4)
            java.lang.Integer[] r6 = r7.A03
            if (r6 == 0) goto L_0x0073
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0073
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L_0x0073
            r0 = r6[r5]
            int r5 = r0.intValue()
            r0 = 1
            r0 = r6[r0]
            int r2 = r0.intValue()
            r0 = 2
            r0 = r6[r0]
            int r1 = r0.intValue()
            r0 = 3
            r0 = r6[r0]
            int r0 = r0.intValue()
            r4.setMargins(r5, r2, r1, r0)
        L_0x0073:
            r7.A03()
            r7.A07()
            r7.A04()
            r7.A06()
            r0 = 2131434233(0x7f0b1af9, float:1.8490274E38)
            android.view.View r0 = r3.requireViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            if (r9 != 0) goto L_0x008e
            r9 = r7
        L_0x008e:
            r0.setUrl(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.headline.IgdsHeadline.setRoundedCornerImageUrl(com.instagram.common.typedurl.ImageUrl, X.0iw):void");
    }

    public final void setType(C3255272z r4) {
        0qQ.A0B(r4, 0);
        this.A01 = r4;
        if (r4.A00 == 1) {
            Context context = getContext();
            A09(R.id.igds_headline_headline, 2Yu.A0A(context));
            A09(R.id.igds_headline_emphasized_headline, 2Yu.A0A(context));
            A09(R.id.igds_headline_body, 2Yu.A0A(context));
            A09(R.id.igds_headline_detail_text, 2Yu.A0A(context));
            if ((this instanceof C3255172x) || !this.A09) {
                A09(R.id.igds_headline_link, 2Yu.A0A(context));
                return;
            }
            View requireViewById = requireViewById(R.id.igds_headline_primary_action_button);
            0qQ.A07(requireViewById);
            ((IgdsButton) requireViewById).setStyle(C273014lo.PRIMARY_ON_COLOR);
            View requireViewById2 = requireViewById(R.id.igds_headline_secondary_action_text_button);
            0qQ.A07(requireViewById2);
            ((IgdsButton) requireViewById2).setTextColor(context.getColor(2Yu.A0A(context)));
        }
    }

    public static final ImageView A00(IgdsHeadline igdsHeadline) {
        ViewStub viewStub;
        C71662eb r2 = igdsHeadline.A07;
        if (r2.A00 == null && (viewStub = r2.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_image);
        }
        ImageView imageView = (ImageView) r2.A01();
        imageView.setVisibility(0);
        if (!(igdsHeadline instanceof C3255172x) && igdsHeadline.A09 && !igdsHeadline.A02 && igdsHeadline.A01 != C3255272z.PROMO_TYPE) {
            Resources resources = igdsHeadline.getResources();
            imageView.setMaxHeight(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
            imageView.setMaxWidth(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Integer[] numArr = igdsHeadline.A03;
            if (numArr != null) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            imageView.setLayoutParams(marginLayoutParams);
            igdsHeadline.A05();
            igdsHeadline.A03();
            igdsHeadline.A04();
            igdsHeadline.A07();
            return imageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public static final CircularImageView A01(IgdsHeadline igdsHeadline, Integer num) {
        Resources resources;
        int intValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewStub viewStub;
        C71662eb r2 = igdsHeadline.A05;
        if (r2.A00 == null && (viewStub = r2.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_circular_image);
        }
        View A012 = r2.A01();
        0qQ.A07(A012);
        ? r4 = (CircularImageView) A012;
        r4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r4.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
        if (layoutParams != null) {
            if ((igdsHeadline instanceof C3255172x) || !igdsHeadline.A09 || igdsHeadline.A02 || igdsHeadline.A01 == C3255272z.PROMO_TYPE) {
                resources = igdsHeadline.getResources();
                if (num == null) {
                    intValue = R.dimen.appreciation_reels_grid_item_width;
                } else {
                    intValue = num.intValue();
                }
            } else {
                resources = igdsHeadline.getResources();
                intValue = R.dimen.action_button_settings_height;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(intValue);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            Integer[] numArr = igdsHeadline.A03;
            if (!(numArr == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null)) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            r4.setLayoutParams(layoutParams);
        }
        igdsHeadline.A05();
        igdsHeadline.A07();
        igdsHeadline.A04();
        igdsHeadline.A06();
        return r4;
    }

    private final IgImageView A02(C240963Ni r8) {
        ViewStub viewStub;
        C71662eb r2 = this.A08;
        if (r2.A00 == null && (viewStub = r2.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_url_image);
        }
        IgImageView A012 = r2.A01();
        0qQ.A07(A012);
        IgImageView igImageView = A012;
        igImageView.setId(R.id.igds_headline_url_image);
        igImageView.setVisibility(0);
        if (r8 != null) {
            igImageView.A0E = r8;
        }
        if (!(this instanceof C3255172x) && this.A09 && !this.A02) {
            Resources resources = getResources();
            igImageView.setMaxHeight(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
            igImageView.setMaxWidth(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
        }
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Integer[] numArr = this.A03;
            if (numArr != null) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            igImageView.setLayoutParams(marginLayoutParams);
            A05();
            A03();
            A04();
            A06();
            return igImageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void A03() {
        C71662eb r1 = this.A05;
        if (r1.A00 != null) {
            r1.A01().setVisibility(8);
        }
    }

    private final void A04() {
        C71662eb r1 = this.A06;
        if (r1.A00 != null) {
            r1.A01().setVisibility(8);
        }
    }

    private final void A05() {
        C71662eb r1 = this.A00;
        if (r1.A00 != null) {
            r1.A01().setVisibility(8);
        }
    }

    private final void A06() {
        if (this.A07.A00 != null) {
            this.A06.A01().setVisibility(8);
        }
    }

    private final void A07() {
        C71662eb r1 = this.A08;
        if (r1.A00 != null) {
            r1.A01().setVisibility(8);
        }
    }

    public static /* synthetic */ void setCircularImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, String str, AnonymousClass0iw r5, Integer num, View.OnClickListener onClickListener, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                r5 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                onClickListener = null;
            }
            igdsHeadline.setCircularImageUrl(imageUrl, str, r5, num, onClickListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCircularImageUrl");
    }

    public static /* synthetic */ void setCustomImageMargin$default(IgdsHeadline igdsHeadline, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            igdsHeadline.A0E(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCustomImageMargin");
    }

    public static /* synthetic */ void setFacepile$default(IgdsHeadline igdsHeadline, List list, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            igdsHeadline.setFacepile(list, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFacepile");
    }

    public static /* synthetic */ void setHeadline$default(IgdsHeadline igdsHeadline, CharSequence charSequence, View.OnClickListener onClickListener, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                onClickListener = null;
            }
            igdsHeadline.setHeadline(charSequence, onClickListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeadline");
    }

    public static /* synthetic */ void setImageURL$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, AnonymousClass0iw r4, C240963Ni r5, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r4 = null;
            }
            if ((i & 4) != 0) {
                r5 = null;
            }
            igdsHeadline.setImageURL(imageUrl, r4, r5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageURL");
    }

    public static /* synthetic */ void setRoundedCornerImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, AnonymousClass0iw r3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r3 = null;
            }
            igdsHeadline.setRoundedCornerImageUrl(imageUrl, r3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRoundedCornerImageUrl");
    }

    public final void CLQ() {
        C71662eb r1 = this.A07;
        if (r1.A00 != null) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            A012.setVisibility(8);
        }
    }

    public final void ENc(View.OnClickListener onClickListener, int i) {
        if ((this instanceof C3255172x) || !this.A09) {
            A08(R.id.igds_headline_link, i);
            View requireViewById = requireViewById(R.id.igds_headline_link);
            0qQ.A07(requireViewById);
            requireViewById.setOnClickListener(onClickListener);
            return;
        }
        setPrimaryActionButton(getContext().getString(i), true, onClickListener);
    }

    public final int getHeadlineId() {
        if (this.A02) {
            return R.id.igds_headline_emphasized_headline;
        }
        return R.id.igds_headline_headline;
    }

    public final void setAction(String str, View.OnClickListener onClickListener) {
        if ((this instanceof C3255172x) || !this.A09) {
            A0A(R.id.igds_headline_link, str);
            View requireViewById = requireViewById(R.id.igds_headline_link);
            0qQ.A07(requireViewById);
            requireViewById.setOnClickListener(onClickListener);
            return;
        }
        setPrimaryActionButton(str, true, onClickListener);
    }

    public final void setBulletList(List list) {
        View A012 = this.A04.A01();
        0qQ.A07(A012);
        ViewGroup viewGroup = (ViewGroup) A012;
        viewGroup.removeAllViews();
        if (list == null || list.isEmpty()) {
            viewGroup.setVisibility(8);
            if (list == null) {
                return;
            }
        } else {
            viewGroup.setVisibility(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
        }
    }

    public final void setSecondaryActionTextButton(String str, View.OnClickListener onClickListener) {
        if (!(this instanceof C3255172x) && this.A09) {
            View requireViewById = requireViewById(R.id.igds_headline_secondary_action_text_button);
            0qQ.A07(requireViewById);
            IgdsButton igdsButton = (IgdsButton) requireViewById;
            igdsButton.setVisibility(0);
            igdsButton.setOnClickListener(onClickListener);
            igdsButton.setText(str);
        }
    }

    private final void A08(int i, int i2) {
        int i3;
        View requireViewById = requireViewById(i);
        0qQ.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        if (i2 != 0) {
            A0B(textView, i);
            textView.setText(i2);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    private final void A09(int i, int i2) {
        View requireViewById = requireViewById(i);
        0qQ.A07(requireViewById);
        Context context = getContext();
        ((TextView) requireViewById).setTextColor(context.getColor(i2));
        View requireViewById2 = requireViewById(i);
        0qQ.A07(requireViewById2);
        ((TextView) requireViewById2).setShadowLayer((float) getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, context.getColor(2Yu.A0H(context, R.attr.igds_color_shadow_on_media)));
    }

    private final void A0A(int i, CharSequence charSequence) {
        View requireViewById = requireViewById(i);
        0qQ.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        A0B(textView, i);
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
        textView.setVisibility(0);
    }

    public static final void A0B(TextView textView, int i) {
        if (i == R.id.igds_headline_headline || i == R.id.igds_headline_emphasized_headline || i == R.id.igds_headline_body) {
            textView.setImportantForAccessibility(1);
        } else if (i == R.id.igds_headline_link) {
            2eS.A04(textView, AnonymousClass05K.A01);
        }
    }

    public final void A0D() {
        if (2eO.A00(getContext())) {
            boolean z = this.A02;
            int i = R.id.igds_headline_headline;
            if (z) {
                i = R.id.igds_headline_emphasized_headline;
            }
            View requireViewById = requireViewById(i);
            0qQ.A0A(requireViewById);
            requireViewById.setImportantForAccessibility(1);
            2eQ.A03(requireViewById);
            View requireViewById2 = requireViewById(R.id.igds_headline_body);
            0qQ.A07(requireViewById2);
            requireViewById2.setImportantForAccessibility(1);
        }
    }

    public final void A0E(int i, int i2, int i3, int i4) {
        this.A03 = new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
    }

    public final void EZe(int i, boolean z) {
        int i2;
        ImageView A002 = A00(this);
        A002.setImageResource(i);
        int i3 = this.A01.A00;
        Context context = getContext();
        if (i3 == 1) {
            i2 = R.color.canvas_bottom_sheet_description_text_color;
        } else if (z) {
            i2 = 2Yu.A0H(context, R.attr.igdsPrimaryIcon);
        } else {
            i2 = R.color.fds_transparent;
        }
        A002.setColorFilter(context.getColor(i2));
    }

    public final void setDetailText(int i) {
        A08(R.id.igds_headline_detail_text, i);
    }

    public final void setHeadline(int i) {
        A08(getHeadlineId(), i);
    }

    public final void setImageDrawable(Drawable drawable) {
        A00(this).setImageDrawable(drawable);
    }

    public final void setPrimaryActionButton(String str, boolean z, View.OnClickListener onClickListener) {
        C273014lo r0;
        View requireViewById = requireViewById(R.id.igds_headline_primary_action_button);
        0qQ.A07(requireViewById);
        IgdsButton igdsButton = (IgdsButton) requireViewById;
        if (str == null || str.length() == 0) {
            igdsButton.setVisibility(8);
            return;
        }
        igdsButton.setVisibility(0);
        igdsButton.setOnClickListener(onClickListener);
        igdsButton.setText(str);
        if (z) {
            r0 = C273014lo.PRIMARY;
        } else {
            r0 = C273014lo.SECONDARY;
        }
        igdsButton.setStyle(r0);
    }

    public final void setIsEmphasized(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }

    public final void setBody(CharSequence charSequence) {
        setBody(charSequence, (View.OnClickListener) null);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, AnonymousClass0iw r9) {
        0qQ.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, r9, (Integer) null, (View.OnClickListener) null);
    }

    public final void setDetailText(CharSequence charSequence) {
        A0A(R.id.igds_headline_detail_text, charSequence);
    }

    public final void setFacepile(List list, String str) {
        ViewStub viewStub;
        C71662eb r2 = this.A06;
        if (r2.A00 == null && (viewStub = r2.A01) != null) {
            viewStub.setLayoutResource(R.layout.dialog_facepile);
        }
        View A012 = r2.A01();
        0qQ.A07(A012);
        IgdsFacepile igdsFacepile = (IgdsFacepile) A012;
        if (list != null) {
            if (str == null) {
                str = "igds_headline_component";
            }
            igdsFacepile.setImageUris(list, str);
        }
        igdsFacepile.setVisibility(0);
        A05();
        A03();
        A06();
        A07();
    }

    public final void setHeadline(CharSequence charSequence) {
        setHeadline(charSequence, (View.OnClickListener) null);
    }

    public final void setImageURL(ImageUrl imageUrl, AnonymousClass0iw r3, C240963Ni r4) {
        if (imageUrl != null) {
            IgImageView A022 = A02(r4);
            if (r3 == null) {
                r3 = this;
            }
            A022.setUrl(imageUrl, r3);
        }
    }

    public final void setBody(CharSequence charSequence, View.OnClickListener onClickListener) {
        A0A(R.id.igds_headline_body, charSequence);
        View requireViewById = requireViewById(R.id.igds_headline_body);
        0qQ.A07(requireViewById);
        requireViewById.setOnClickListener(onClickListener);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, AnonymousClass0iw r9, Integer num) {
        0qQ.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, r9, num, (View.OnClickListener) null);
    }

    public final void setHeadline(CharSequence charSequence, View.OnClickListener onClickListener) {
        A0A(getHeadlineId(), charSequence);
        if (onClickListener != null) {
            View requireViewById = requireViewById(getHeadlineId());
            0qQ.A07(requireViewById);
            requireViewById.setOnClickListener(onClickListener);
        }
    }

    public final void setImageURL(ImageUrl imageUrl, AnonymousClass0iw r3) {
        setImageURL(imageUrl, r3, (C240963Ni) null);
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsHeadline(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            r3 = 1
            X.0qQ.A0B(r7, r3)
            r6.<init>(r7, r8, r9, r10)
            X.72z r2 = X.C3255272z.DEFAULT
            r6.A01 = r2
            boolean r1 = X.C61670oa.A0A()
            r6.A09 = r1
            boolean r0 = r6 instanceof X.C3255172x
            if (r0 == 0) goto L_0x0016
            r1 = 0
        L_0x0016:
            r0 = 2131626068(0x7f0e0854, float:1.8879362E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2131626086(0x7f0e0866, float:1.8879398E38)
        L_0x001e:
            android.view.View r5 = android.view.View.inflate(r7, r0, r6)
            r0 = 2131434238(0x7f0b1afe, float:1.8490284E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            r4 = 0
            if (r0 == 0) goto L_0x0102
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0030:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A08 = r0
            r0 = 2131434221(0x7f0b1aed, float:1.849025E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00ff
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0044:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A05 = r0
            r0 = 2131434234(0x7f0b1afa, float:1.8490276E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00fc
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0058:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A00 = r0
            r0 = 2131434236(0x7f0b1afc, float:1.849028E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00f9
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x006c:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A07 = r0
            r0 = 2131434224(0x7f0b1af0, float:1.8490256E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00f7
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0080:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A06 = r0
            r0 = 2131434220(0x7f0b1aec, float:1.8490248E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0095
            r4 = r1
            android.view.ViewStub r4 = (android.view.ViewStub) r4
        L_0x0095:
            X.2eb r0 = new X.2eb
            r0.<init>(r4)
            r6.A04 = r0
            r0 = 32
            float r0 = X.0nA.A04(r7, r0)
            int r0 = (int) r0
            r6.setPadding(r0, r0, r0, r0)
            if (r8 == 0) goto L_0x00f3
            int[] r0 = X.C71382cm.A1S
            android.content.res.TypedArray r4 = r7.obtainStyledAttributes(r8, r0)
            X.0qQ.A07(r4)
            r0 = 3
            r5 = 0
            int r0 = r4.getResourceId(r0, r5)
            if (r0 == 0) goto L_0x00bc
            r6.EZe(r0, r5)
        L_0x00bc:
            r0 = 5
            boolean r0 = r4.getBoolean(r0, r5)
            r6.A02 = r0
            r0 = 6
            int r1 = r4.getInt(r0, r5)
            if (r1 == 0) goto L_0x00d1
            if (r1 == r3) goto L_0x00f4
            r0 = 2
            if (r1 != r0) goto L_0x00d1
            X.72z r2 = X.C3255272z.PROMO_TYPE
        L_0x00d1:
            r0 = 2
            int r0 = r4.getResourceId(r0, r5)
            r6.setHeadline((int) r0)
            int r1 = r4.getResourceId(r5, r5)
            r0 = 2131434216(0x7f0b1ae8, float:1.849024E38)
            r6.A08(r0, r1)
            int r1 = r4.getResourceId(r3, r5)
            r0 = 2131434222(0x7f0b1aee, float:1.8490252E38)
            r6.A08(r0, r1)
            r4.recycle()
            r6.setType(r2)
        L_0x00f3:
            return
        L_0x00f4:
            X.72z r2 = X.C3255272z.ON_MEDIA
            goto L_0x00d1
        L_0x00f7:
            r1 = r4
            goto L_0x0080
        L_0x00f9:
            r1 = r4
            goto L_0x006c
        L_0x00fc:
            r1 = r4
            goto L_0x0058
        L_0x00ff:
            r1 = r4
            goto L_0x0044
        L_0x0102:
            r1 = r4
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.headline.IgdsHeadline.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsHeadline(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, AnonymousClass0iw r7, Integer num, View.OnClickListener onClickListener) {
        0qQ.A0B(imageUrl, 0);
        IgImageView A012 = A01(this, num);
        if (r7 == null) {
            r7 = this;
        }
        A012.setUrl(imageUrl, r7);
        if (str != null) {
            A012.setContentDescription(getContext().getString(2131963311, new Object[]{str}));
        }
        if (onClickListener != null) {
            A012.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str) {
        0qQ.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, (AnonymousClass0iw) null, (Integer) null, (View.OnClickListener) null);
    }
}
