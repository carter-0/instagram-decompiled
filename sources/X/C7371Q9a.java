package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Q9a  reason: case insensitive filesystem */
public final class C7371Q9a extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A0E;
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public TextView A09;
    public final int A0A = 5;
    public final TypedArray A0B;
    public final 0s0 A0C;
    public final 0s0 A0D;

    public C7371Q9a(Context context) {
        super(context, (AttributeSet) null, 0);
        String str;
        AnonymousClass2E0.A0A();
        int[] iArr = C71382cm.A0e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132017579, iArr);
        0qQ.A07(obtainStyledAttributes);
        this.A0B = obtainStyledAttributes;
        this.A0C = new C13408TYs(53, this, 0sn.A00);
        this.A0D = new C13408TYs(54, this, 0);
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_multi_image_icon, this, true);
        this.A01 = findViewById(R.id.list_cell_left_add_on_multi_image_container);
        this.A04 = DbS.A0G(this, R.id.list_cell_left_add_on_image_1);
        this.A05 = DbS.A0G(this, R.id.list_cell_left_add_on_image_2);
        this.A06 = DbS.A0G(this, R.id.list_cell_left_add_on_image_3);
        this.A07 = DbS.A0G(this, R.id.list_cell_left_add_on_image_4);
        this.A08 = DbS.A0G(this, R.id.list_cell_left_add_on_multi_image_outline);
        this.A03 = findViewById(R.id.list_cell_left_add_on_vertical_divider);
        this.A00 = findViewById(R.id.list_cell_left_add_on_horizontal_divider_1);
        this.A02 = findViewById(R.id.list_cell_left_add_on_horizontal_divider_2);
        this.A09 = AnonymousClass7TE.A0d(this, R.id.list_cell_left_add_on_badge_icon);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(AnonymousClass2E0.A0A().A02(this.A0A), iArr);
        C11409SSh.A00(obtainStyledAttributes2, this, 18, 2132017587);
        obtainStyledAttributes2.recycle();
        AnonymousClass2E0.A0A();
        int color = context2.getColor(R.color.igds_separator);
        View view = this.A03;
        if (view == null) {
            str = "verticalDivider";
        } else {
            view.setBackgroundColor(color);
            View view2 = this.A00;
            if (view2 == null) {
                str = "leftHalfDivider";
            } else {
                view2.setBackgroundColor(color);
                View view3 = this.A02;
                if (view3 == null) {
                    str = "rightHalfDivider";
                } else {
                    view3.setBackgroundColor(color);
                    Drawable drawable = context2.getDrawable(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                    String A002 = C273654mx.A00(0);
                    0qQ.A0C(drawable, A002);
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.mutate();
                    gradientDrawable.setStroke(context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), color);
                    ImageView imageView = this.A08;
                    str = "imageViewOutline";
                    if (imageView != null) {
                        TypedArray typedArray = this.A0B;
                        C11409SSh.A00(typedArray, imageView, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                        ImageView imageView2 = this.A08;
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(gradientDrawable);
                            ImageView imageView3 = this.A08;
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                                View view4 = this.A01;
                                str = "multiImageContainer";
                                if (view4 != null) {
                                    C11409SSh.A00(typedArray, view4, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                                    View view5 = this.A01;
                                    if (view5 != null) {
                                        view5.setBackgroundResource(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                                        View view6 = this.A01;
                                        if (view6 != null) {
                                            Drawable background = view6.getBackground();
                                            0qQ.A0C(background, A002);
                                            GradientDrawable gradientDrawable2 = (GradientDrawable) background;
                                            gradientDrawable2.mutate();
                                            gradientDrawable2.setStroke(AnonymousClass7TF.A02(context2, R.dimen.account_recs_header_image_margin), color);
                                            View view7 = this.A01;
                                            if (view7 != null) {
                                                view7.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                                View view8 = this.A01;
                                                if (view8 != null) {
                                                    view8.setClipToOutline(true);
                                                    TextView textView = this.A09;
                                                    if (textView != null) {
                                                        C11409SSh.A05(textView, typedArray.getResourceId(0, R.style.FBPayUIListCellLeftAddOnBadgeIcon), false);
                                                        TextView textView2 = this.A09;
                                                        if (textView2 != null) {
                                                            SRn.A02(textView2, RH2.A07);
                                                            TextView textView3 = this.A09;
                                                            if (textView3 != null) {
                                                                textView3.setBackgroundResource(R.drawable.fbpay_widget_multi_item_badge);
                                                                TextView textView4 = this.A09;
                                                                if (textView4 != null) {
                                                                    Drawable background2 = textView4.getBackground();
                                                                    0qQ.A0C(background2, A002);
                                                                    GradientDrawable gradientDrawable3 = (GradientDrawable) background2;
                                                                    gradientDrawable3.mutate();
                                                                    AnonymousClass2E0.A0A();
                                                                    gradientDrawable3.setColor(context2.getColor(R.color.igds_elevated_background));
                                                                    int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
                                                                    AnonymousClass2E0.A0A();
                                                                    gradientDrawable3.setStroke(dimensionPixelSize, context2.getColor(R.color.igds_separator));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    0qQ.A0F("badgeIcon");
                                                    throw AnonymousClass00P.createAndThrow();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setImageThumbnailUrls(List list) {
        0qQ.A0B(list, 0);
        DbS.A1a(this, list, this.A0C, A0E, 0);
    }

    static {
        Class<C7371Q9a> cls = C7371Q9a.class;
        A0E = new AnonymousClass0YZ[]{Pxh.A0y(cls, "imageThumbnailUrls", "getImageThumbnailUrls()Ljava/util/List;"), Pxh.A0y(cls, "numItems", "getNumItems()I")};
    }

    public static final void A01(C7371Q9a q9a) {
        ImageView imageView = q9a.A04;
        String str = "imageView1";
        if (imageView != null) {
            q9a.setQuarterImageViewStyle(imageView);
            ImageView imageView2 = q9a.A05;
            str = "imageView2";
            if (imageView2 != null) {
                q9a.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = q9a.A06;
                str = "imageView3";
                if (imageView3 != null) {
                    q9a.setQuarterImageViewStyle(imageView3);
                    ImageView imageView4 = q9a.A07;
                    str = "imageView4";
                    if (imageView4 != null) {
                        q9a.setQuarterImageViewStyle(imageView4);
                        Pxi.A19(imageView, q9a, q9a.getImageThumbnailUrls(), 0);
                        Pxi.A19(imageView2, q9a, q9a.getImageThumbnailUrls(), 1);
                        Pxi.A19(imageView3, q9a, q9a.getImageThumbnailUrls(), 2);
                        Pxi.A19(imageView4, q9a, q9a.getImageThumbnailUrls(), 3);
                        View view = q9a.A03;
                        if (view == null) {
                            str = "verticalDivider";
                        } else {
                            view.setVisibility(0);
                            View view2 = q9a.A02;
                            if (view2 == null) {
                                str = "rightHalfDivider";
                            } else {
                                view2.setVisibility(0);
                                View view3 = q9a.A00;
                                if (view3 == null) {
                                    str = "leftHalfDivider";
                                } else {
                                    view3.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C7371Q9a q9a) {
        ImageView imageView = q9a.A04;
        String str = "imageView1";
        if (imageView != null) {
            q9a.setHalfImageViewStyle(imageView);
            ImageView imageView2 = q9a.A05;
            str = "imageView2";
            if (imageView2 != null) {
                q9a.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = q9a.A06;
                str = "imageView3";
                if (imageView3 != null) {
                    q9a.setQuarterImageViewStyle(imageView3);
                    Pxi.A19(imageView, q9a, q9a.getImageThumbnailUrls(), 0);
                    Pxi.A19(imageView2, q9a, q9a.getImageThumbnailUrls(), 1);
                    Pxi.A19(imageView3, q9a, q9a.getImageThumbnailUrls(), 2);
                    View view = q9a.A03;
                    if (view == null) {
                        str = "verticalDivider";
                    } else {
                        view.setVisibility(0);
                        View view2 = q9a.A02;
                        if (view2 == null) {
                            str = "rightHalfDivider";
                        } else {
                            view2.setVisibility(0);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C7371Q9a q9a) {
        ImageView imageView = q9a.A04;
        String str = "imageView1";
        if (imageView != null) {
            q9a.setHalfImageViewStyle(imageView);
            ImageView imageView2 = q9a.A05;
            str = "imageView2";
            if (imageView2 != null) {
                q9a.setHalfImageViewStyle(imageView2);
                Pxi.A19(imageView, q9a, q9a.getImageThumbnailUrls(), 0);
                Pxi.A19(imageView2, q9a, q9a.getImageThumbnailUrls(), 1);
                View view = q9a.A03;
                if (view == null) {
                    str = "verticalDivider";
                } else {
                    view.setVisibility(0);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void setHalfImageViewStyle(ImageView imageView) {
        C11409SSh.A05(imageView, this.A0B.getResourceId(2, R.style.FBPayUIListCellLeftAddOnHalfIcon), false);
    }

    private final void setQuarterImageViewStyle(ImageView imageView) {
        C11409SSh.A05(imageView, this.A0B.getResourceId(5, R.style.FBPayUIListCellLeftAddOnQuarterIcon), false);
    }

    public final int getFbpayWidgetStyleType() {
        return this.A0A;
    }

    public final List getImageThumbnailUrls() {
        return (List) Pxe.A0s(this, this.A0C, A0E, 0);
    }

    public final int getNumItems() {
        return AnonymousClass7TE.A0M(Pxe.A0s(this, this.A0D, A0E, 1));
    }

    public final TypedArray getStyle() {
        return this.A0B;
    }

    public final void setNumItems(int i) {
        this.A0D.Epx(this, Integer.valueOf(i), A0E[1]);
    }

    public static final void A00(ImageView imageView, C7371Q9a q9a, String str) {
        C10911S0m A0G = AnonymousClass2E0.A0G();
        if (A0G.A00(str)) {
            0qQ.A0B(str, 0);
            C8287QnT qnT = new C8287QnT(A0G.A00, str, "ListCell");
            qnT.A07 = true;
            qnT.A02(imageView);
        } else {
            imageView.setImageDrawable(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(q9a), 34, 33));
        }
        imageView.setVisibility(0);
    }
}
