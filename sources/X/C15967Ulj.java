package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ulj  reason: case insensitive filesystem */
public final class C15967Ulj extends C232942uh {
    public final /* synthetic */ C15690Ugv A00;

    public final void A04(MotionEvent motionEvent, 2cs r11) {
        V44 v44;
        TextView textView;
        Integer num;
        0qQ.A0B(r11, 1);
        C15690Ugv ugv = this.A00;
        C71412ct r8 = r11.A09;
        double d = r8.A00;
        List list = C15690Ugv.A0U;
        if (!(ugv.A09 != AnonymousClass05K.A0j || (v44 = ugv.A08) == null || (textView = v44.A04) == null)) {
            if (!ugv.A0C) {
                textView.setAlpha((float) d);
            }
            if (d >= 1.0d) {
                ugv.A0C = true;
            }
            textView.setVisibility(0);
            int[] iArr = ugv.A0F;
            int i = iArr[0];
            View view = ugv.A02;
            if (view != null) {
                textView.setTranslationX((float) ((i + (view.getWidth() / 2)) - (textView.getWidth() / 2)));
                int i2 = iArr[1];
                View view2 = ugv.A02;
                if (view2 != null) {
                    num = Integer.valueOf(view2.getHeight());
                } else {
                    num = null;
                }
                textView.setTranslationY((float) (((double) (((i2 + (JTP.A09(num) / 2)) - (textView.getHeight() / 2)) - ugv.A0H)) - (d * ((double) ugv.A0G))));
            } else {
                throw new IllegalStateException("currentHoldingView should not be null");
            }
        }
        if (r11.A01 != 1.0d) {
            ugv.A03 = null;
        } else if (ugv.A03 == null && r8.A00 > 0.800000011920929d) {
            ugv.A03 = ugv.A02;
            AnonymousClass2S0.A01.A03();
        }
    }

    public final void A06(MotionEvent motionEvent, 2cs r5) {
        0qQ.A0B(r5, 1);
        C15690Ugv.A02(this.A00, r5.A09.A00);
    }

    public final boolean A07(MotionEvent motionEvent) {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView;
        Product product;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        0qQ.A0B(motionEvent, 0);
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        Integer num = ugv.A09;
        Integer num2 = AnonymousClass05K.A0N;
        boolean z = false;
        if (num == num2 || num == AnonymousClass05K.A0j) {
            UserSession userSession = ugv.A0L;
            AnonymousClass1Nd.A00(userSession).A05(new C52451GTd(true));
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            V44 v44 = ugv.A08;
            if (v44 == null || (igBouncyUfiButtonImageView = v44.A05) == null) {
                throw new IllegalStateException("Holder not initialized.");
            }
            Context context = ugv.A0J;
            C323506xb A002 = C323496xa.A00(userSession);
            ProductTile productTile = ugv.A07;
            if (productTile != null) {
                product = productTile.A07;
            } else {
                product = null;
            }
            0qQ.A0C(product, "null cannot be cast to non-null type com.instagram.model.shopping.productintfs.SaveableProductItem");
            int i = 2131972587;
            if (A002.A03(product)) {
                i = 2131972049;
            }
            if (!C15690Ugv.A04(igBouncyUfiButtonImageView, ugv, AnonymousClass7TE.A16(context, i), rawX, rawY)) {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                V44 v442 = ugv.A08;
                if (v442 == null || (imageView = v442.A02) == null) {
                    throw new IllegalStateException("Holder not initialized.");
                } else if (!C15690Ugv.A04(imageView, ugv, AnonymousClass7TE.A16(context, 2131973441), rawX2, rawY2)) {
                    float rawX3 = motionEvent.getRawX();
                    float rawY3 = motionEvent.getRawY();
                    V44 v443 = ugv.A08;
                    if (v443 == null || (imageView2 = v443.A01) == null) {
                        throw new IllegalStateException("Holder not initialized.");
                    } else if (!C15690Ugv.A04(imageView2, ugv, AnonymousClass7TE.A16(context, 2131966173), rawX3, rawY3)) {
                        float rawX4 = motionEvent.getRawX();
                        float rawY4 = motionEvent.getRawY();
                        V44 v444 = ugv.A08;
                        if (v444 == null || (imageView3 = v444.A03) == null) {
                            throw new IllegalStateException("Holder not initialized.");
                        } else if (!C15690Ugv.A04(imageView3, ugv, AnonymousClass7TE.A16(context, 2131976671), rawX4, rawY4)) {
                            ugv.A02 = null;
                            ugv.A09 = num2;
                        }
                    }
                }
            }
            z = true;
            num2 = AnonymousClass05K.A0j;
            ugv.A09 = num2;
        }
        return z;
    }

    public C15967Ulj(C15690Ugv ugv) {
        this.A00 = ugv;
    }

    public final void A00(MotionEvent motionEvent) {
        C15690Ugv ugv = this.A00;
        ugv.A09 = AnonymousClass05K.A00;
        ugv.A03 = null;
        ugv.A02 = null;
        ((2cs) ugv.A0Q.getValue()).A04();
    }

    public final void A01(MotionEvent motionEvent) {
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        if (ugv.A09 == AnonymousClass05K.A0C) {
            ugv.A09 = AnonymousClass05K.A0N;
        }
    }

    public final void A02(MotionEvent motionEvent) {
        C15690Ugv.A00(this.A00);
    }

    public final void A03(MotionEvent motionEvent, 2cs r8) {
        TextView textView;
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        if (ugv.A09 != AnonymousClass05K.A00 && r8.A09.A00 != 1.0d) {
            V44 v44 = ugv.A08;
            if (!(v44 == null || (textView = v44.A04) == null)) {
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
            }
            ugv.A02 = null;
            ugv.A0C = false;
            if (ugv.A09 == AnonymousClass05K.A0j) {
                ugv.A09 = AnonymousClass05K.A0N;
            }
        }
    }

    public final void A05(MotionEvent motionEvent, 2cs r7) {
        if (r7.A09.A00 != 1.0d) {
            C15690Ugv ugv = this.A00;
            List list = C15690Ugv.A0U;
            Integer num = ugv.A09;
            Integer num2 = AnonymousClass05K.A00;
            if (num != num2) {
                ugv.A09 = num2;
                AnonymousClass7TH.A0R(ugv.A04);
                Runnable runnable = ugv.A0A;
                if (runnable != null) {
                    runnable.run();
                }
                ugv.A0A = null;
                AnonymousClass1Po.A00.A00();
            }
        }
    }

    public final boolean A08(MotionEvent motionEvent) {
        C15690Ugv ugv = this.A00;
        Integer num = AnonymousClass05K.A01;
        List list = C15690Ugv.A0U;
        ugv.A09 = num;
        View view = ugv.A04;
        if (view != null) {
            view.setVisibility(4);
        }
        C15690Ugv.A01(ugv);
        return true;
    }

    public final boolean A09(MotionEvent motionEvent) {
        ImageView imageView;
        ImageView imageView2;
        String A002;
        C2355830k r1;
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        V44 v44 = ugv.A08;
        if (v44 == null) {
            return false;
        }
        View view = ugv.A03;
        ImageView imageView3 = null;
        if (0qQ.A0K(view, v44.A05)) {
            C17641VbX vbX = (C17641VbX) ugv.A0R.getValue();
            ProductTile productTile = ugv.A07;
            if (productTile != null) {
                int i = ugv.A01;
                int i2 = ugv.A00;
                String str = ugv.A0B;
                boolean z = ugv.A0E;
                FragmentActivity fragmentActivity = vbX.A01;
                DbS.A1X(fragmentActivity);
                C231142qw A02 = C231132qv.A02(fragmentActivity, fragmentActivity, vbX.A02, vbX.A03, vbX.A05, str, vbX.A06, false);
                Product product = productTile.A07;
                if (product != null) {
                    User user = product.A0B;
                    if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                        throw new IllegalStateException("productTile product merchant id must not be null");
                    }
                    C18591Vui vui = new C18591Vui((1Xj) null, A02, product, A002);
                    vui.A07 = C320166rs.A01(i, i2);
                    vui.A09 = z;
                    vui.A00();
                    V44 v442 = ugv.A08;
                    if (!(v442 == null || (r1 = v442.A06) == null)) {
                        r1.A00();
                    }
                    AnonymousClass0eM r5 = ugv.A0Q;
                    ((2cs) r5.getValue()).A08(0.0d, true);
                    ((2cs) r5.getValue()).A03();
                    ugv.A09 = AnonymousClass05K.A0Y;
                    C15690Ugv.A01(ugv);
                } else {
                    throw new IllegalStateException("productTile product must not be null");
                }
            } else {
                throw new IllegalStateException("No productTile supplied");
            }
        } else {
            V44 v443 = ugv.A08;
            if (v443 != null) {
                imageView = v443.A02;
            } else {
                imageView = null;
            }
            if (0qQ.A0K(view, imageView)) {
                C17641VbX vbX2 = (C17641VbX) ugv.A0R.getValue();
                ProductTile productTile2 = ugv.A07;
                if (productTile2 != null) {
                    AnonymousClass37D A022 = AnonymousClass37D.A00.A02(vbX2.A01);
                    if (A022 != null) {
                        C49731F3w A07 = 1as.A04.A02.A07(vbX2.A03, vbX2.A02, 2FW.A1Y);
                        A07.A07.putParcelable(C66579MXk.A00(19), productTile2.A07);
                        A022.A0J(A07.A00());
                    }
                } else {
                    throw new IllegalStateException("No productTile supplied");
                }
            } else {
                V44 v444 = ugv.A08;
                if (v444 != null) {
                    imageView2 = v444.A01;
                } else {
                    imageView2 = null;
                }
                if (0qQ.A0K(view, imageView2)) {
                    C17641VbX vbX3 = (C17641VbX) ugv.A0R.getValue();
                    ProductTile productTile3 = ugv.A07;
                    if (productTile3 != null) {
                        String str2 = ugv.A0B;
                        Product product2 = productTile3.A07;
                        if (product2 != null) {
                            Context context = vbX3.A01;
                            C46498Dg1 dg1 = new C46498Dg1(context, vbX3.A02);
                            dg1.A02(new WBF(24, (Object) vbX3, (Object) productTile3, (Object) product2, (Object) dg1), 2131972191);
                            dg1.A02(new WA3(dg1, vbX3, product2, str2, 2), 2131968504);
                            C13988Tno.A0r(context, dg1);
                        } else {
                            throw new IllegalStateException("productTile product must not be null");
                        }
                    } else {
                        throw new IllegalStateException("No productTile supplied");
                    }
                } else {
                    V44 v445 = ugv.A08;
                    if (v445 != null) {
                        imageView3 = v445.A03;
                    }
                    if (0qQ.A0K(view, imageView3)) {
                        ugv.A0A = new C20070WkU(ugv);
                    }
                }
            }
        }
        Integer num = ugv.A09;
        if (num != AnonymousClass05K.A0N && num != AnonymousClass05K.A0C && num != AnonymousClass05K.A0j) {
            return true;
        }
        C15690Ugv.A00(ugv);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ad, code lost:
        if (r1 == null) goto L_0x01af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            X.Ugv r4 = r0.A00
            java.util.List r0 = X.C15690Ugv.A0U
            X.2cv r0 = r4.A06
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            com.instagram.model.shopping.productfeed.ProductTile r0 = r4.A07
            if (r0 == 0) goto L_0x0050
            com.instagram.user.model.Product r1 = r0.A07
            if (r1 == 0) goto L_0x0050
            X.0eM r0 = r4.A0P
            java.lang.Object r6 = r0.getValue()
            X.VZp r6 = (X.C17536VZp) r6
            java.lang.String r5 = r1.A0H
            java.lang.String r3 = X.C13989Tnp.A0q(r1)
            X.0qQ.A0A(r3)
            java.lang.String r2 = r4.A0B
            X.AnonymousClass7TG.A1N(r5, r3)
            X.0wc r1 = r6.A00
            java.lang.String r0 = "instagram_shopping_product_preview_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0050
            X.C13991Tnr.A17(r1, r5)
            X.C13988Tno.A1A(r1, r3)
            java.lang.String r0 = r6.A02
            X.C13988Tno.A1D(r1, r0)
            java.lang.String r0 = r6.A01
            X.C13988Tno.A1C(r1, r0)
            java.lang.String r0 = "prior_submodule"
            X.C51973G9u.A14(r1, r0, r2)
            r1.Cgf()
        L_0x0050:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r4.A09 = r6
            X.2cv r0 = r4.A06
            X.0qQ.A0A(r0)
            r0.CNi(r4)
            r3 = 1
            r0.setFocusable(r3)
            android.content.Context r5 = r4.A0J
            com.instagram.common.session.UserSession r9 = r4.A0L
            com.instagram.model.shopping.productfeed.ProductTile r7 = r4.A07
            if (r7 == 0) goto L_0x0243
            android.view.View r0 = r4.A04
            if (r0 == 0) goto L_0x023b
            X.WWg r2 = r4.A0N
            X.Dba.A0j(r3, r5, r9)
            X.C51972G9s.A1C(r7, r2)
            java.lang.Object r8 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.widget.productcard.peek.ProductCardPeekViewBinder.Holder"
            X.0qQ.A0C(r8, r0)
            X.V44 r8 = (X.V44) r8
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r10 = r8.A07
            X.0qQ.A0B(r10, r3)
            r0 = 2131438278(0x7f0b2ac6, float:1.8498478E38)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = X.DbX.A0b(r10, r0)
            com.instagram.user.model.Product r12 = r7.A07
            if (r12 == 0) goto L_0x0233
            int r0 = X.0nA.A09(r5)
            int r13 = r0 / 2
            X.1Xj r0 = r7.A05
            if (r0 == 0) goto L_0x0209
            com.instagram.model.mediasize.ImageInfo r1 = r0.A1p()
            if (r1 == 0) goto L_0x0209
            r0 = 1080(0x438, float:1.513E-42)
            int r0 = java.lang.Math.min(r13, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A05(r1, r6, r0)
            if (r0 == 0) goto L_0x0209
        L_0x00ab:
            r11.setUrl(r0, r2)
        L_0x00ae:
            android.content.res.Resources r6 = r5.getResources()
            r1 = 2131967982(0x7f133fee, float:1.9572846E38)
            java.lang.String r0 = r12.A0J
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r6, r0, r1)
            r11.setContentDescription(r0)
            r0 = 2131438263(0x7f0b2ab7, float:1.8498448E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r10, r0)
            r0 = 2131433809(0x7f0b1951, float:1.8489414E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            r0 = 2131440851(0x7f0b34d3, float:1.8503697E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r1, r0)
            r0 = 2131436140(0x7f0b226c, float:1.8494142E38)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = X.DbX.A0b(r1, r0)
            r0 = 2131436151(0x7f0b2277, float:1.8494164E38)
            android.view.View r0 = r1.requireViewById(r0)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.C13988Tno.A16(r10, r3)
            X.0qQ.A07(r0)
            com.instagram.user.model.Product r12 = r7.A07
            if (r12 == 0) goto L_0x022b
            java.lang.String r0 = r12.A0J
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x0102
            android.text.SpannableStringBuilder r0 = X.W2t.A00(r5)
            r1.append(r0)
        L_0x0102:
            r6.setText(r1)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            int r0 = X.C324476zN.A00(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            java.lang.CharSequence r0 = X.C324476zN.A08(r5, r12, r0, r1)
            r6.append(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r12.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x015f
            r15 = 1
            java.lang.Boolean r0 = r0.A05
            boolean r14 = X.AnonymousClass7TF.A1Y(r0, r3)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r12.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0206
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r0 = r0.A01
            if (r0 == 0) goto L_0x0206
            com.instagram.model.payments.CurrencyAmountInfo r0 = r0.Bo7()
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = r0.getAmountWithOffset()
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            boolean r0 = r1.equals(r0)
            if (r0 != r3) goto L_0x0206
        L_0x0148:
            java.lang.String r0 = " · "
            if (r14 == 0) goto L_0x01fb
            android.text.SpannableStringBuilder r1 = r6.append(r0)
            r0 = 2131962676(0x7f132b34, float:1.9562084E38)
            if (r15 == 0) goto L_0x0158
            r0 = 2131962675(0x7f132b33, float:1.9562082E38)
        L_0x0158:
            java.lang.String r0 = r5.getString(r0)
            r1.append(r0)
        L_0x015f:
            r13.setText(r6)
            com.instagram.user.model.User r6 = r12.A0B
            if (r6 == 0) goto L_0x01f6
            X.DbU.A1S(r2, r11, r6)
        L_0x0169:
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131970055(0x7f134807, float:1.957705E38)
            java.lang.String r0 = X.C51971G9r.A0t(r6)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r11.setContentDescription(r0)
            java.lang.String r0 = X.C51971G9r.A0t(r6)
            r10.setText(r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r6 = r8.A05
            X.6xb r2 = X.C323496xa.A00(r9)
            com.instagram.user.model.Product r1 = r7.A07
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.shopping.productintfs.SaveableProductItem"
            X.0qQ.A0C(r1, r0)
            boolean r1 = r2.A03(r1)
            r6.setSelected(r1)
            r0 = 2131972587(0x7f1351eb, float:1.9582186E38)
            if (r1 == 0) goto L_0x019e
            r0 = 2131972049(0x7f134fd1, float:1.9581095E38)
        L_0x019e:
            X.DbU.A12(r5, r6, r0)
            r6.A05()
            android.widget.ImageView r2 = r8.A03
            com.instagram.user.model.Product r0 = r7.A07
            if (r0 == 0) goto L_0x01af
            com.instagram.user.model.User r1 = r0.A0B
            r0 = 0
            if (r1 != 0) goto L_0x01b1
        L_0x01af:
            r0 = 8
        L_0x01b1:
            r2.setVisibility(r0)
            android.view.View r1 = r4.A04
            if (r1 == 0) goto L_0x01c3
            android.view.ViewGroup r0 = r4.A05
            if (r0 == 0) goto L_0x0223
            android.graphics.drawable.BitmapDrawable r0 = X.C232972uk.A00(r5, r0)
            r1.setBackground(r0)
        L_0x01c3:
            X.V44 r0 = r4.A08
            if (r0 == 0) goto L_0x021b
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r1 = r0.A07
            if (r1 == 0) goto L_0x021b
            r2 = 0
            r1.setTranslationY(r2)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            X.V44 r0 = r4.A08
            if (r0 == 0) goto L_0x01e8
            android.widget.TextView r1 = r0.A04
            if (r1 == 0) goto L_0x01e8
            r0 = 8
            r1.setVisibility(r0)
            r1.setAlpha(r2)
        L_0x01e8:
            X.0eM r0 = r4.A0Q
            java.lang.Object r0 = r0.getValue()
            X.2cs r0 = (X.2cs) r0
            r0.A03()
            r4.A0D = r3
            return r3
        L_0x01f6:
            r11.A0B()
            goto L_0x0169
        L_0x01fb:
            if (r15 == 0) goto L_0x015f
            android.text.SpannableStringBuilder r1 = r6.append(r0)
            r0 = 2131962673(0x7f132b31, float:1.9562078E38)
            goto L_0x0158
        L_0x0206:
            r15 = 0
            goto L_0x0148
        L_0x0209:
            com.instagram.model.mediasize.ImageInfo r1 = r12.A08
            if (r1 == 0) goto L_0x00ae
            r0 = 1080(0x438, float:1.513E-42)
            int r0 = java.lang.Math.min(r13, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A05(r1, r6, r0)
            if (r0 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x021b:
            java.lang.String r1 = "Holder shouldn't be null if touchInterceptorLayout nonNull"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0223:
            java.lang.String r1 = "rootView not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x022b:
            java.lang.String r1 = "Only products supported for peeking"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0233:
            java.lang.String r1 = "Peeking only supported on products"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x023b:
            java.lang.String r1 = "Peek media view not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0243:
            java.lang.String r1 = "No productTile supplied"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15967Ulj.A0A(android.view.MotionEvent):boolean");
    }

    public final boolean A0B(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        if (ugv.A09 == AnonymousClass05K.A0j) {
            float rawX = motionEvent2.getRawX();
            float rawY = motionEvent2.getRawY();
            View view = ugv.A02;
            if (view == null) {
                throw new IllegalStateException("currentHoldingView must not be null");
            } else if (!C15690Ugv.A03(view, rawX, rawY)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
