package com.facebookpay.widget.listcell;

import X.00l;
import X.0qQ;
import X.0s0;
import X.AnonymousClass00P;
import X.AnonymousClass0YZ;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11353SOm;
import X.C11409SSh;
import X.C11499SbM;
import X.C13407TYr;
import X.C13408TYs;
import X.C13448Tab;
import X.C54770HSc;
import X.C66581MXm;
import X.C71492dQ;
import X.C8922RFq;
import X.DbS;
import X.DbU;
import X.DbV;
import X.Pxe;
import X.Pxh;
import X.Pxj;
import X.Q9O;
import X.Q9Q;
import X.Q9R;
import X.Q9S;
import X.RFp;
import X.RH2;
import X.Re4;
import X.SPB;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.instagram.android.R;

public class ListCell extends FrameLayout implements C13448Tab {
    public static final /* synthetic */ AnonymousClass0YZ[] A0r;
    public float A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public ShimmerFrameLayout A0K;
    public ShimmerFrameLayout A0L;
    public ComponentLoggingData A0M;
    public LoggingContext A0N;
    public Q9S A0O;
    public Q9Q A0P;
    public Q9R A0Q;
    public FrameLayout A0R;
    public FrameLayout A0S;
    public Q9O A0T;
    public final 0s0 A0U;
    public final 0s0 A0V;
    public final 0s0 A0W;
    public final 0s0 A0X;
    public final 0s0 A0Y;
    public final 0s0 A0Z;
    public final 0s0 A0a;
    public final 0s0 A0b;
    public final 0s0 A0c;
    public final 0s0 A0d;
    public final 0s0 A0e;
    public final 0s0 A0f;
    public final 0s0 A0g;
    public final 0s0 A0h;
    public final 0s0 A0i;
    public final 0s0 A0j;
    public final 0s0 A0k;
    public final 0s0 A0l;
    public final 0s0 A0m;
    public final 0s0 A0n;
    public final 0s0 A0o;
    public final 0s0 A0p;
    public final 0s0 A0q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        0qQ.A0B(context, 1);
        this.A0a = new C13408TYs((Object) this, 40);
        this.A0h = new C13408TYs((Object) this, 44);
        this.A0m = new C13408TYs((Object) this, 45);
        this.A0d = new C13408TYs((Object) this, 46);
        this.A0k = new C13407TYr(1, context, this);
        this.A0c = new C13407TYr(2, context, this);
        this.A0g = new C13408TYs((Object) this, 47);
        this.A0l = new C13408TYs((Object) this, 48);
        this.A0i = new C13408TYs((Object) this, 49);
        this.A0o = new C13408TYs((Object) this, 30);
        this.A0e = new C13408TYs((Object) this, 31);
        this.A0f = new C13408TYs((Object) this, 32);
        this.A0V = new C13408TYs((Object) this, 33);
        this.A0W = new C13408TYs((Object) this, 34);
        this.A0q = new C13408TYs(35, this, C8922RFq.A0O);
        this.A0b = new C13408TYs(36, this, RH2.PRIMARY_TEXT);
        this.A0j = new C13408TYs(37, this, RH2.A14);
        this.A0p = new C13408TYs(38, this, RH2.A1C);
        this.A0X = new C13408TYs(39, this, false);
        this.A0Y = new C13408TYs(41, this, false);
        this.A0Z = new C13408TYs(42, this, false);
        this.A0U = new C13408TYs(43, this, RFp.DEFAULT_CELL);
        this.A0n = new C13407TYr(0, context, this);
        this.A00 = Pxj.A06(context);
        View.inflate(context, R.layout.fbpay_ui_list_cell, this);
        this.A02 = findViewById(R.id.top_divider);
        this.A0B = DbS.A0G(this, R.id.image);
        this.A0C = Pxe.A0M(this, R.id.shimmer_container);
        this.A01 = findViewById(R.id.list_cell_container);
        this.A0E = AnonymousClass7TE.A0d(this, R.id.primary_text);
        this.A0J = (ShimmerFrameLayout) findViewById(R.id.primary_shimmer_view);
        this.A0G = AnonymousClass7TE.A0d(this, R.id.secondary_text);
        this.A0K = (ShimmerFrameLayout) findViewById(R.id.secondary_shimmer_view);
        this.A0H = AnonymousClass7TE.A0d(this, R.id.tertiary_text);
        this.A0L = (ShimmerFrameLayout) findViewById(R.id.tertiary_shimmer_view);
        this.A0F = AnonymousClass7TE.A0d(this, R.id.quaternary_text);
        this.A06 = (FrameLayout) findViewById(R.id.left_add_on_container);
        this.A09 = (FrameLayout) findViewById(R.id.right_add_on_container);
        this.A08 = (FrameLayout) findViewById(R.id.primary_text_add_on_container);
        this.A0D = AnonymousClass7TE.A0d(this, R.id.error_text);
        this.A0I = (ShimmerFrameLayout) findViewById(R.id.image_shimmer);
        this.A05 = (FrameLayout) findViewById(R.id.custom_view_container);
        this.A03 = (FrameLayout) findViewById(R.id.inline_action_menu_container);
        Context context2 = getContext();
        TypedArray A012 = SPB.A01(context2, this);
        View view = this.A01;
        if (view == null) {
            str = "containerView";
        } else {
            C11409SSh.A00(A012, view, 10, R.style.FBPayUIListCellContainer);
            int resourceId = A012.getResourceId(13, R.style.FBPayUIListCellElement);
            TextView textView = this.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                C11409SSh.A05(textView, resourceId, false);
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    C11409SSh.A05(textView2, resourceId, false);
                    TextView textView3 = this.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        C11409SSh.A05(textView3, resourceId, false);
                        TextView textView4 = this.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            C11409SSh.A05(textView4, resourceId, false);
                            TextView textView5 = this.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                C11409SSh.A05(textView5, resourceId, false);
                                LinearLayout linearLayout = this.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    C11409SSh.A00(A012, linearLayout, 26, R.style.FBPayUIListShimmerContainer);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0J;
                                    if (shimmerFrameLayout == null) {
                                        str = "primaryShimmerView";
                                    } else {
                                        C11409SSh.A00(A012, shimmerFrameLayout, 28, 2132017609);
                                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
                                        if (shimmerFrameLayout2 == null) {
                                            str = "secondaryShimmerView";
                                        } else {
                                            C11409SSh.A00(A012, shimmerFrameLayout2, 29, 2132017610);
                                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                                            if (shimmerFrameLayout3 == null) {
                                                str = "tertiaryShimmerView";
                                            } else {
                                                C11409SSh.A00(A012, shimmerFrameLayout3, 30, 2132017611);
                                                ImageView imageView = this.A0B;
                                                if (imageView == null) {
                                                    str = "imageView";
                                                } else {
                                                    C11409SSh.A00(A012, imageView, 16, 2132017591);
                                                    FrameLayout frameLayout = this.A06;
                                                    if (frameLayout == null) {
                                                        str = "leftAddOnContainer";
                                                    } else {
                                                        C11409SSh.A00(A012, frameLayout, 18, 2132017588);
                                                        FrameLayout frameLayout2 = this.A09;
                                                        if (frameLayout2 == null) {
                                                            str = "rightAddOnContainer";
                                                        } else {
                                                            C11409SSh.A00(A012, frameLayout2, 21, 2132017587);
                                                            FrameLayout frameLayout3 = this.A08;
                                                            if (frameLayout3 == null) {
                                                                str = "primaryTextAddOnContainer";
                                                            } else {
                                                                C11409SSh.A00(A012, frameLayout3, 20, 2132017590);
                                                                FrameLayout frameLayout4 = this.A03;
                                                                if (frameLayout4 == null) {
                                                                    str = "actionMenuContainer";
                                                                } else {
                                                                    C11409SSh.A00(A012, frameLayout4, 17, 2132017595);
                                                                    A012.recycle();
                                                                    AnonymousClass2E0.A0A();
                                                                    int color = context2.getColor(R.color.igds_primary_text);
                                                                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0J;
                                                                    if (shimmerFrameLayout4 != null) {
                                                                        AnonymousClass2E0.A0A();
                                                                        Drawable drawable = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                        if (drawable != null) {
                                                                            drawable.setTint(color);
                                                                            shimmerFrameLayout4.setBackground(drawable);
                                                                            ShimmerFrameLayout shimmerFrameLayout5 = this.A0K;
                                                                            if (shimmerFrameLayout5 != null) {
                                                                                AnonymousClass2E0.A0A();
                                                                                Drawable drawable2 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                                if (drawable2 != null) {
                                                                                    drawable2.setTint(color);
                                                                                    shimmerFrameLayout5.setBackground(drawable2);
                                                                                    ShimmerFrameLayout shimmerFrameLayout6 = this.A0L;
                                                                                    if (shimmerFrameLayout6 != null) {
                                                                                        AnonymousClass2E0.A0A();
                                                                                        Drawable drawable3 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                                        if (drawable3 != null) {
                                                                                            drawable3.setTint(color);
                                                                                            shimmerFrameLayout6.setBackground(drawable3);
                                                                                            ShimmerFrameLayout shimmerFrameLayout7 = this.A0I;
                                                                                            if (shimmerFrameLayout7 != null) {
                                                                                                AnonymousClass2E0.A0A();
                                                                                                Drawable drawable4 = context2.getDrawable(R.drawable.listcell_image_shimmer_background);
                                                                                                if (drawable4 != null) {
                                                                                                    drawable4.setTint(color);
                                                                                                    shimmerFrameLayout7.setBackground(drawable4);
                                                                                                    ShimmerFrameLayout shimmerFrameLayout8 = this.A0J;
                                                                                                    if (shimmerFrameLayout8 != null) {
                                                                                                        shimmerFrameLayout8.setImportantForAccessibility(2);
                                                                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A0K;
                                                                                                        if (shimmerFrameLayout9 != null) {
                                                                                                            shimmerFrameLayout9.setImportantForAccessibility(2);
                                                                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A0L;
                                                                                                            if (shimmerFrameLayout10 != null) {
                                                                                                                shimmerFrameLayout10.setImportantForAccessibility(2);
                                                                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A0I;
                                                                                                                if (shimmerFrameLayout11 != null) {
                                                                                                                    shimmerFrameLayout11.setImportantForAccessibility(2);
                                                                                                                    setImportantForAccessibility(1);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                                }
                                                                                            }
                                                                                            0qQ.A0F("imageShimmer");
                                                                                            throw AnonymousClass00P.createAndThrow();
                                                                                        }
                                                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                    }
                                                                                    0qQ.A0F("tertiaryShimmerView");
                                                                                    throw AnonymousClass00P.createAndThrow();
                                                                                }
                                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                                            }
                                                                            0qQ.A0F("secondaryShimmerView");
                                                                            throw AnonymousClass00P.createAndThrow();
                                                                        }
                                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                                    }
                                                                    0qQ.A0F("primaryShimmerView");
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
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A08(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            0qQ.A0F("primaryShimmerView");
            throw AnonymousClass00P.createAndThrow();
        }
        C54770HSc.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A09(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0K;
        if (shimmerFrameLayout == null) {
            0qQ.A0F("secondaryShimmerView");
            throw AnonymousClass00P.createAndThrow();
        }
        C54770HSc.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0A(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0L;
        if (shimmerFrameLayout == null) {
            0qQ.A0F("tertiaryShimmerView");
            throw AnonymousClass00P.createAndThrow();
        }
        C54770HSc.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void setBackgroundStyle(RFp rFp) {
        0qQ.A0B(rFp, 0);
        DbS.A1a(this, rFp, this.A0U, A0r, 21);
    }

    public final void setPrimaryTextStyle(RH2 rh2) {
        0qQ.A0B(rh2, 0);
        DbS.A1a(this, rh2, this.A0b, A0r, 15);
    }

    public final void setSecondaryTextStyle(RH2 rh2) {
        0qQ.A0B(rh2, 0);
        DbS.A1a(this, rh2, this.A0j, A0r, 16);
    }

    public final void setTertiaryTextStyle(RH2 rh2) {
        0qQ.A0B(rh2, 0);
        DbS.A1a(this, rh2, this.A0p, A0r, 17);
    }

    public final void setTextStyle(C8922RFq rFq) {
        0qQ.A0B(rFq, 0);
        DbS.A1a(this, rFq, this.A0q, A0r, 14);
    }

    static {
        Class<ListCell> cls = ListCell.class;
        A0r = new AnonymousClass0YZ[]{Pxh.A0y(cls, "primaryText", "getPrimaryText()Ljava/lang/String;"), Pxh.A0y(cls, "secondaryText", "getSecondaryText()Ljava/lang/String;"), Pxh.A0y(cls, "tertiaryText", "getTertiaryText()Ljava/lang/String;"), Pxh.A0y(cls, "quaternaryText", "getQuaternaryText()Ljava/lang/String;"), Pxh.A0y(cls, "tertiaryLinkableText", "getTertiaryLinkableText()Ljava/lang/CharSequence;"), Pxh.A0y(cls, "quaternaryLinkableText", "getQuaternaryLinkableText()Ljava/lang/CharSequence;"), Pxh.A0y(cls, "secondarySpannableText", "getSecondarySpannableText()Landroid/text/SpannableStringBuilder;"), Pxh.A0y(cls, "tertiarySpannableText", "getTertiarySpannableText()Landroid/text/SpannableStringBuilder;"), Pxh.A0y(cls, "secondaryTextSizePx", "getSecondaryTextSizePx()Ljava/lang/Float;"), Pxh.A0y(cls, "tertiaryTextSizePx", "getTertiaryTextSizePx()Ljava/lang/Float;"), Pxh.A0y(cls, "quaternaryTextSizePx", "getQuaternaryTextSizePx()Ljava/lang/Float;"), Pxh.A0y(cls, "quaternaryTextVerticalSpacing", "getQuaternaryTextVerticalSpacing()Ljava/lang/Integer;"), Pxh.A0y(cls, "errorText", "getErrorText()Ljava/lang/String;"), Pxh.A0y(cls, "imageUrl", "getImageUrl()Ljava/lang/String;"), Pxh.A0y(cls, "textStyle", "getTextStyle()Lcom/facebookpay/widget/listcell/ListCellTextStyle;"), Pxh.A0y(cls, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), Pxh.A0y(cls, "secondaryTextStyle", "getSecondaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), Pxh.A0y(cls, "tertiaryTextStyle", "getTertiaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), Pxh.A0y(cls, "isPrimaryTextLineBreaks", "isPrimaryTextLineBreaks()Z"), Pxh.A0y(cls, "isSecondaryTextLineBreaks", "isSecondaryTextLineBreaks()Z"), Pxh.A0y(cls, "isTertiaryTextLineBreaks", "isTertiaryTextLineBreaks()Z"), Pxh.A0y(cls, "backgroundStyle", "getBackgroundStyle()Lcom/facebookpay/widget/listcell/ListCellBackgroundStyle;"), Pxh.A0y(cls, "tertiaryTextOnClickListener", "getTertiaryTextOnClickListener()Landroid/view/View$OnClickListener;")};
    }

    public final void A01() {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            0qQ.A0F("leftAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        C71492dQ A0N2 = Pxj.A0N(frameLayout);
        A0N2.A0u = 0;
        A0N2.A0F = R.id.error_text;
    }

    public final void A02() {
        String str;
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            str = "primaryShimmerView";
        } else {
            shimmerFrameLayout.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
            if (shimmerFrameLayout2 == null) {
                str = "secondaryShimmerView";
            } else {
                shimmerFrameLayout2.setVisibility(8);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                if (shimmerFrameLayout3 == null) {
                    str = "tertiaryShimmerView";
                } else {
                    shimmerFrameLayout3.setVisibility(8);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0I;
                    if (shimmerFrameLayout4 == null) {
                        str = "imageShimmer";
                    } else {
                        shimmerFrameLayout4.setVisibility(8);
                        String imageUrl = getImageUrl();
                        if (imageUrl != null && !00l.A0W(imageUrl)) {
                            ImageView imageView = this.A0B;
                            if (imageView == null) {
                                str = "imageView";
                            } else {
                                imageView.setVisibility(0);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04() {
        ShimmerFrameLayout shimmerFrameLayout = this.A0I;
        String str = "imageShimmer";
        if (shimmerFrameLayout != null) {
            C54770HSc.A00(shimmerFrameLayout, (Integer) null);
            shimmerFrameLayout.setVisibility(0);
            ImageView imageView = this.A0B;
            if (imageView == null) {
                str = "imageView";
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A07(ComponentLoggingData componentLoggingData, LoggingContext loggingContext) {
        this.A0N = loggingContext;
        this.A0M = componentLoggingData;
        C11353SOm.A00().Cgl("client_load_fbpayui_init", Re4.A00(this));
    }

    public final FrameLayout getActionMenu() {
        return this.A0R;
    }

    public final RFp getBackgroundStyle() {
        return (RFp) Pxe.A0s(this, this.A0U, A0r, 21);
    }

    public ComponentLoggingData getComponentLoggingData() {
        return this.A0M;
    }

    public final FrameLayout getCustomView() {
        return this.A04;
    }

    public final String getErrorText() {
        return DbV.A13(this, this.A0V, A0r, 12);
    }

    public int getFbpayWidgetStyleType() {
        return 0;
    }

    public final String getImageUrl() {
        return DbV.A13(this, this.A0W, A0r, 13);
    }

    public final Q9S getLeftAddOnIcon() {
        return this.A0O;
    }

    public final Q9Q getLeftAddOnText() {
        return this.A0P;
    }

    public final FrameLayout getLeftAddOnView() {
        return this.A07;
    }

    public LoggingContext getLoggingContext() {
        return this.A0N;
    }

    public final String getPrimaryText() {
        return DbV.A13(this, this.A0a, A0r, 0);
    }

    public final FrameLayout getPrimaryTextAddOnView() {
        return this.A0S;
    }

    public final RH2 getPrimaryTextStyle() {
        return (RH2) Pxe.A0s(this, this.A0b, A0r, 15);
    }

    public final CharSequence getQuaternaryLinkableText() {
        return (CharSequence) Pxe.A0s(this, this.A0c, A0r, 5);
    }

    public final String getQuaternaryText() {
        return DbV.A13(this, this.A0d, A0r, 3);
    }

    public final Float getQuaternaryTextSizePx() {
        return (Float) Pxe.A0s(this, this.A0e, A0r, 10);
    }

    public final Integer getQuaternaryTextVerticalSpacing() {
        return (Integer) Pxe.A0s(this, this.A0f, A0r, 11);
    }

    public final Q9O getRightAddOnIcon() {
        return this.A0T;
    }

    public final Q9R getRightAddOnText() {
        return this.A0Q;
    }

    public final FrameLayout getRightAddOnView() {
        return this.A0A;
    }

    public final SpannableStringBuilder getSecondarySpannableText() {
        return (SpannableStringBuilder) Pxe.A0s(this, this.A0g, A0r, 6);
    }

    public final String getSecondaryText() {
        return DbV.A13(this, this.A0h, A0r, 1);
    }

    public final Float getSecondaryTextSizePx() {
        return (Float) Pxe.A0s(this, this.A0i, A0r, 8);
    }

    public final RH2 getSecondaryTextStyle() {
        return (RH2) Pxe.A0s(this, this.A0j, A0r, 16);
    }

    public final CharSequence getTertiaryLinkableText() {
        return (CharSequence) Pxe.A0s(this, this.A0k, A0r, 4);
    }

    public final SpannableStringBuilder getTertiarySpannableText() {
        return (SpannableStringBuilder) Pxe.A0s(this, this.A0l, A0r, 7);
    }

    public final String getTertiaryText() {
        return DbV.A13(this, this.A0m, A0r, 2);
    }

    public final View.OnClickListener getTertiaryTextOnClickListener() {
        return (View.OnClickListener) Pxe.A0s(this, this.A0n, A0r, 22);
    }

    public final Float getTertiaryTextSizePx() {
        return (Float) Pxe.A0s(this, this.A0o, A0r, 9);
    }

    public final RH2 getTertiaryTextStyle() {
        return (RH2) Pxe.A0s(this, this.A0p, A0r, 17);
    }

    public final C8922RFq getTextStyle() {
        return (C8922RFq) Pxe.A0s(this, this.A0q, A0r, 14);
    }

    public final void setActionMenu(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 == null) {
            0qQ.A0F("actionMenuContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A0R = frameLayout;
    }

    public void setComponentLoggingData(ComponentLoggingData componentLoggingData) {
        this.A0M = componentLoggingData;
    }

    public final void setCustomView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A05;
        if (frameLayout2 == null) {
            0qQ.A0F("customViewContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        if (frameLayout != null) {
            C66581MXm.A1A(frameLayout, -1);
            A0B(false, true);
        }
        this.A04 = frameLayout;
    }

    public final void setErrorText(String str) {
        DbS.A1a(this, str, this.A0V, A0r, 12);
    }

    public final void setImageUrl(String str) {
        DbS.A1a(this, str, this.A0W, A0r, 13);
    }

    public final void setLeftAddOnIcon(Q9S q9s) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            0qQ.A0F("leftAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(q9s, frameLayout);
        this.A0O = q9s;
    }

    public final void setLeftAddOnText(Q9Q q9q) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            0qQ.A0F("leftAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(q9q, frameLayout);
        this.A0P = q9q;
    }

    public final void setLeftAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A06;
        if (frameLayout2 == null) {
            0qQ.A0F("leftAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A07 = frameLayout;
    }

    public void setLoggingContext(LoggingContext loggingContext) {
        this.A0N = loggingContext;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C11499SbM sbM;
        if (onClickListener != null) {
            sbM = C11499SbM.A00(onClickListener, this, 40);
        } else {
            sbM = null;
        }
        super.setOnClickListener(sbM);
    }

    public final void setPrimaryText(String str) {
        DbS.A1a(this, str, this.A0a, A0r, 0);
    }

    public final void setPrimaryTextAddOnView(FrameLayout frameLayout) {
        String str;
        FrameLayout frameLayout2 = this.A08;
        if (frameLayout2 == null) {
            str = "primaryTextAddOnContainer";
        } else {
            A00(frameLayout, frameLayout2);
            this.A0S = frameLayout;
            if (frameLayout != null) {
                TextView textView = this.A0E;
                if (textView == null) {
                    str = "primaryTextView";
                } else {
                    Pxj.A0N(textView).A0N = -1;
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setPrimaryTextLineBreaks(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0X, A0r, 18, z);
    }

    public final void setQuaternaryLinkableText(CharSequence charSequence) {
        DbS.A1a(this, charSequence, this.A0c, A0r, 5);
    }

    public final void setQuaternaryText(String str) {
        DbS.A1a(this, str, this.A0d, A0r, 3);
    }

    public final void setQuaternaryTextSizePx(Float f) {
        DbS.A1a(this, f, this.A0e, A0r, 10);
    }

    public final void setQuaternaryTextVerticalSpacing(Integer num) {
        DbS.A1a(this, num, this.A0f, A0r, 11);
    }

    public final void setRightAddOnIcon(Q9O q9o) {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            0qQ.A0F("rightAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(q9o, frameLayout);
        this.A0T = q9o;
    }

    public final void setRightAddOnText(Q9R q9r) {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            0qQ.A0F("rightAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(q9r, frameLayout);
        this.A0Q = q9r;
    }

    public final void setRightAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A09;
        if (frameLayout2 == null) {
            0qQ.A0F("rightAddOnContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A0A = frameLayout;
    }

    public final void setSecondarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        DbS.A1a(this, spannableStringBuilder, this.A0g, A0r, 6);
    }

    public final void setSecondaryText(String str) {
        DbS.A1a(this, str, this.A0h, A0r, 1);
    }

    public final void setSecondaryTextLineBreaks(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0Y, A0r, 19, z);
    }

    public final void setSecondaryTextSizePx(Float f) {
        DbS.A1a(this, f, this.A0i, A0r, 8);
    }

    public final void setShimmerAccessibilityLabel(String str) {
        LinearLayout linearLayout = this.A0C;
        if (linearLayout == null) {
            0qQ.A0F("shimmerContainer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            linearLayout.setContentDescription(str);
        }
    }

    public final void setTertiaryLinkableText(CharSequence charSequence) {
        DbS.A1a(this, charSequence, this.A0k, A0r, 4);
    }

    public final void setTertiarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        DbS.A1a(this, spannableStringBuilder, this.A0l, A0r, 7);
    }

    public final void setTertiaryText(String str) {
        DbS.A1a(this, str, this.A0m, A0r, 2);
    }

    public final void setTertiaryTextLineBreaks(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0Z, A0r, 20, z);
    }

    public final void setTertiaryTextOnClickListener(View.OnClickListener onClickListener) {
        DbS.A1a(this, onClickListener, this.A0n, A0r, 22);
    }

    public final void setTertiaryTextSizePx(Float f) {
        DbS.A1a(this, f, this.A0o, A0r, 9);
    }

    public final void setTertiaryTextViewStyleRes(int i) {
        TextView textView = this.A0H;
        if (textView == null) {
            0qQ.A0F("tertiaryTextView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11409SSh.A05(textView, i, false);
        }
    }

    public static final void A00(FrameLayout frameLayout, FrameLayout frameLayout2) {
        int i = 0;
        if (frameLayout2.getChildCount() <= 0 || !0qQ.A0K(frameLayout2.getChildAt(0), frameLayout)) {
            frameLayout2.removeAllViews();
            if (frameLayout != null) {
                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -1));
            } else {
                i = 8;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public final void A03() {
        TypedArray A012 = SPB.A01(getContext(), this);
        View view = this.A01;
        if (view == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        }
        C11409SSh.A05(view, A012.getResourceId(8, 2132017583), false);
        A012.recycle();
    }

    public final void A05(int i, String str) {
        Context context = getContext();
        this.A00 = DbU.A00(context, i);
        setImageUrl(str);
        this.A00 = Pxj.A06(context);
    }

    public final void A06(View view, Integer num, int i) {
        TypedArray A012 = SPB.A01(getContext(), this);
        0qQ.A07(A012);
        if (num != null) {
            i = A012.getResourceId(num.intValue(), i);
        }
        C11409SSh.A05(view, i, false);
        A012.recycle();
    }

    public final void A0B(boolean z, boolean z2) {
        String str;
        TypedArray A012 = SPB.A01(getContext(), this);
        if (!z) {
            View view = this.A01;
            if (view == null) {
                str = "containerView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C11409SSh.A05(view, A012.getResourceId(9, 2132017584), false);
        }
        if (!z2) {
            int resourceId = A012.getResourceId(12, 2132017600);
            TextView textView = this.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                C11409SSh.A05(textView, resourceId, false);
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    C11409SSh.A05(textView2, resourceId, false);
                    TextView textView3 = this.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        C11409SSh.A05(textView3, resourceId, false);
                        TextView textView4 = this.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            C11409SSh.A05(textView4, resourceId, false);
                            TextView textView5 = this.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                C11409SSh.A05(textView5, resourceId, false);
                                LinearLayout linearLayout = this.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    C11409SSh.A00(A012, linearLayout, 26, 2132017613);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0I;
                                    if (shimmerFrameLayout == null) {
                                        str = "imageShimmer";
                                    } else {
                                        C11409SSh.A00(A012, shimmerFrameLayout, 27, 2132017886);
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
        A012.recycle();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InlineActionMenu inlineActionMenu;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A0R;
        if ((frameLayout instanceof InlineActionMenu) && (inlineActionMenu = (InlineActionMenu) frameLayout) != null) {
            TextView textView = inlineActionMenu.A01;
            String str = "editView";
            if (textView != null) {
                if (textView.getVisibility() == 0) {
                    TextView textView2 = inlineActionMenu.A01;
                    if (textView2 != null) {
                        C11409SSh.A03(textView2, inlineActionMenu.A04, this);
                    }
                }
                TextView textView3 = inlineActionMenu.A02;
                str = "removeView";
                if (textView3 != null) {
                    if (textView3.getVisibility() == 0) {
                        C11409SSh.A03(textView3, inlineActionMenu.A04, this);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListCell(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
