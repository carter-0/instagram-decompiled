package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.33m  reason: invalid class name and case insensitive filesystem */
public final class C2363733m {
    public static final void A04(AnonymousClass1eD r15, UserSession userSession, 1Xj r17, C53157GjT gjT, AnonymousClass3W1 r19) {
        AnonymousClass1eD r9 = r15;
        ConfirmationStyle Apx = r15.Apx();
        if (Apx == null) {
            Apx = ConfirmationStyle.TOMBSTONE_V1;
        }
        UserSession userSession2 = userSession;
        1Xj r11 = r17;
        C53157GjT gjT2 = gjT;
        AnonymousClass3W1 r13 = r19;
        if (Apx.ordinal() != 1) {
            A01(new IAM(gjT2), r9, userSession2, r11, gjT2, r13);
            ConfirmationTitleStyle Apz = r15.Apz();
            if (Apz == null) {
                Apz = ConfirmationTitleStyle.DEFAULT;
            }
            UndoStyle CBP = r15.CBP();
            if (CBP == null) {
                CBP = UndoStyle.A04;
            }
            A03(Apx, Apz, CBP, gjT2);
            return;
        }
        C56160Hto hto = new C56160Hto(userSession2);
        List<C246193eB> B73 = r15.B73();
        if (B73 != null) {
            for (C246193eB r152 : B73) {
                Object obj = MediaOptionStyle.A01.get(r152.C27());
                if (obj == null) {
                    obj = MediaOptionStyle.A08;
                }
                Context context = gjT2.A07.getContext();
                0qQ.A07(context);
                String text = r152.getText();
                boolean z = false;
                if (obj == MediaOptionStyle.A05) {
                    z = true;
                }
                hto.A03(context, new ICH(r152, userSession, r17, gjT, r19), text, (String) null, -1, z);
            }
            C17897Vho vho = new C17897Vho(hto);
            Context context2 = gjT2.A07.getContext();
            0qQ.A07(context2);
            vho.A00(context2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A06(C53157GjT gjT) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200).setInterpolator(new LinearInterpolator());
        View view = gjT.A0B;
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ofFloat.addUpdateListener(new C56679I7j(gjT));
        ofFloat.addListener(new HG2(gjT));
        ofFloat.start();
    }

    public final void A09(C61079JwH jwH, UserSession userSession, C53157GjT gjT, AnonymousClass3W1 r25) {
        GSY gsy;
        int i;
        ImmutableList copyOf;
        AnonymousClass3W1 r1;
        AnonymousClass3W1 r5 = r25;
        0qQ.A0B(r5, 2);
        C53157GjT gjT2 = gjT;
        gjT2.A01();
        C61079JwH jwH2 = jwH;
        GTI gti = (GTI) jwH2.A00;
        C53385GnH gnH = (C53385GnH) ((C62320sa) gti.A01).invoke();
        Resources resources = gjT2.itemView.getContext().getResources();
        C266444Yx r0 = (C266444Yx) gnH.A03;
        if (r0 != null) {
            TextView textView = gjT2.A0F;
            0qQ.A0A(resources);
            0qQ.A0B(resources, 0);
            textView.setText(r0.A00(resources));
        }
        C266444Yx r02 = (C266444Yx) gnH.A02;
        if (r02 != null) {
            TextView textView2 = gjT2.A0E;
            textView2.setVisibility(0);
            0qQ.A0A(resources);
            0qQ.A0B(resources, 0);
            textView2.setText(r02.A00(resources));
        }
        C266444Yx r03 = (C266444Yx) gnH.A04;
        if (r03 != null) {
            TextView textView3 = gjT2.A0G;
            0qQ.A0A(resources);
            0qQ.A0B(resources, 0);
            textView3.setText(r03.A00(resources));
        }
        if (gnH.A0B) {
            IAJ iaj = new IAJ(jwH2);
            TextView textView4 = gjT2.A0G;
            textView4.getPaint().setFakeBoldText(true);
            2eS.A01(textView4);
            AnonymousClass0fU.A00(iaj, textView4);
            C56310HwN.A01(gjT2, 0);
        }
        if (gnH.A09) {
            1Xj r2 = gjT2.A01;
            if (r2 != null) {
                View view = gjT2.A06;
                AnonymousClass0fU.A00(new C56743IAs(r2, gjT2), view);
                view.setVisibility(0);
                view.bringToFront();
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (gnH.A07) {
            C56310HwN.A01(gjT2, 8);
        }
        if (gnH.A08 && (r1 = gjT2.A03) != null) {
            r1.A0L(gjT2, (Integer) null, false);
        }
        UserSession userSession2 = userSession;
        if (gnH.A0A) {
            if (((C62320sa) gti.A04).invoke() != null) {
                1Xj r12 = gjT2.A01;
                if (r12 != null) {
                    A04((AnonymousClass1eD) ((C62320sa) gti.A05).invoke(), userSession2, r12, gjT2, r5);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (((C62320sa) gti.A02).invoke() != null) {
                1Xj r13 = gjT2.A01;
                if (r13 != null) {
                    List list = r13.A0S;
                    if (list == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null) {
                        gjT2.A02(0);
                        i = 2131975468;
                    } else {
                        gjT2.A02(copyOf.size());
                        int size = copyOf.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C42036BEo bEo = (C42036BEo) copyOf.get(i2);
                            Object obj = gjT2.A0J.get(i2);
                            0qQ.A07(obj);
                            View view2 = (View) obj;
                            String str = bEo.A00;
                            String str2 = bEo.A01;
                            View requireViewById = view2.requireViewById(R.id.survey_tombstone_reason_text);
                            0qQ.A07(requireViewById);
                            ((TextView) requireViewById).setText(str2);
                            AnonymousClass0fU.A00(new C56771IBu(r13, gjT2, r5, str), view2);
                        }
                        i = 2131972988;
                    }
                    String string = gjT2.A08.getResources().getString(i);
                    0qQ.A07(string);
                    Integer num = AnonymousClass05K.A01;
                    gjT2.A03(new IAM(gjT2), UndoStyle.A04, num, string, (String) null);
                    A02(new IBO(r13, gjT2, r5), gjT2);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        if (gnH.A06 && (gsy = (GSY) gnH.A05) != null) {
            String str3 = gsy.A02;
            String str4 = gsy.A03;
            UndoStyle undoStyle = (UndoStyle) gsy.A01;
            gjT2.A03(new IAM(gjT2), undoStyle, (Integer) gsy.A00, str3, str4);
            0Tu r122 = 0Tu.A05;
            boolean A06 = 182.A06(r122, userSession2, 36311951328609098L);
            int i3 = 2;
            int i4 = 1;
            if (A06) {
                i4 = 2;
            }
            boolean A062 = 182.A06(r122, userSession2, 36311951328674635L);
            if (A062) {
                i4++;
            }
            gjT2.A02(i4);
            ArrayList arrayList = gjT2.A0J;
            Object obj2 = arrayList.get(0);
            0qQ.A07(obj2);
            View view3 = (View) obj2;
            View requireViewById2 = view3.requireViewById(R.id.survey_tombstone_reason_text);
            0qQ.A07(requireViewById2);
            String string2 = view3.getContext().getString(2131972205);
            0qQ.A07(string2);
            ((TextView) requireViewById2).setText(string2);
            AnonymousClass0fU.A00(new C56744IAt(jwH2, gjT2), view3);
            if (A06) {
                Object obj3 = arrayList.get(1);
                0qQ.A07(obj3);
                View view4 = (View) obj3;
                View requireViewById3 = view4.requireViewById(R.id.survey_tombstone_reason_text);
                0qQ.A07(requireViewById3);
                String string3 = view4.getContext().getString(2131967927, new Object[]{jwH2.A02});
                0qQ.A07(string3);
                ((TextView) requireViewById3).setText(string3);
                AnonymousClass0fU.A00(new IAK(jwH2), view4);
            } else {
                i3 = 1;
            }
            if (A062) {
                Object obj4 = arrayList.get(i3);
                0qQ.A07(obj4);
                View view5 = (View) obj4;
                View requireViewById4 = view5.requireViewById(R.id.survey_tombstone_reason_text);
                0qQ.A07(requireViewById4);
                String string4 = view5.getContext().getString(2131975869, new Object[]{jwH2.A02});
                0qQ.A07(string4);
                ((TextView) requireViewById4).setText(string4);
                AnonymousClass0fU.A00(new IAL(jwH2), view5);
            }
            if (undoStyle == UndoStyle.A04) {
                1Xj r14 = (1Xj) jwH2.A01;
                if (r14 != null) {
                    A02(new IBO(r14, gjT2, r5), gjT2);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            A07(gjT2, 8);
            C56310HwN.A01(gjT2, 8);
        }
    }

    public static final View A00(Context context, ViewGroup viewGroup, String str, int i) {
        C2363633l.A02 = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_tombstone, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C53157GjT(inflate, i));
        return inflate;
    }

    public static final void A01(View.OnClickListener onClickListener, AnonymousClass1eD r24, UserSession userSession, 1Xj r26, C53157GjT gjT, AnonymousClass3W1 r28) {
        int i;
        UndoStyle undoStyle;
        Context context;
        int i2;
        int i3;
        UserSession userSession2 = userSession;
        182.A06(0Tu.A05, userSession2, 36317100993680154L);
        List B73 = r24.B73();
        1Xj r4 = r26;
        C53157GjT gjT2 = gjT;
        AnonymousClass3W1 r2 = r28;
        if (B73 != null) {
            gjT2.A02(B73.size());
            int size = B73.size();
            for (int i4 = 0; i4 < size; i4++) {
                C246193eB r11 = (C246193eB) B73.get(i4);
                Object obj = gjT2.A0J.get(i4);
                0qQ.A07(obj);
                View view = (View) obj;
                View requireViewById = view.requireViewById(R.id.survey_tombstone_reason);
                0qQ.A07(requireViewById);
                LinearLayout linearLayout = (LinearLayout) requireViewById;
                View requireViewById2 = view.requireViewById(R.id.survey_tombstone_reason_text);
                0qQ.A07(requireViewById2);
                TextView textView = (TextView) requireViewById2;
                MediaOptionStyle mediaOptionStyle = (MediaOptionStyle) MediaOptionStyle.A01.get(r11.C27());
                if (mediaOptionStyle == null) {
                    mediaOptionStyle = MediaOptionStyle.A08;
                }
                int ordinal = mediaOptionStyle.ordinal();
                if (ordinal != 1) {
                    context = textView.getContext();
                    if (ordinal != 2) {
                        i2 = R.attr.igds_color_primary_text;
                    } else {
                        i2 = R.attr.igds_color_error_or_destructive;
                    }
                } else {
                    context = textView.getContext();
                    i2 = R.attr.igds_color_primary_button;
                }
                textView.setTextColor(context.getColor(2Yu.A0H(context, i2)));
                CharSequence fromHtml = Html.fromHtml(r11.getText(), 63);
                0qQ.A07(fromHtml);
                if (r26 != null) {
                    Context context2 = gjT2.A08.getContext();
                    0qQ.A0B(userSession2, 0);
                    C253003q3 r13 = new C253003q3(new SpannableStringBuilder(fromHtml), userSession2);
                    r13.A0L = true;
                    r13.A01 = 2Yu.A0F(context2, R.attr.textColorBoldLink);
                    r13.A03(new C253013q4(userSession2, r4, false));
                    r13.A0Q = true;
                    fromHtml = r13.A00();
                    0qQ.A07(fromHtml);
                }
                textView.setText(fromHtml);
                textView.getPaint().setFakeBoldText(false);
                if (mediaOptionStyle == MediaOptionStyle.A07) {
                    linearLayout.setGravity(3);
                }
                View requireViewById3 = view.requireViewById(R.id.survey_tombstone_reason_icon);
                0qQ.A07(requireViewById3);
                ImageView imageView = (ImageView) requireViewById3;
                C54667HMy A01 = C56315HwS.A01(r11.getId());
                if (!(!r11.BvY() || A01 == null || (i3 = A01.A00) == 0)) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(i3);
                    linearLayout.setGravity(19);
                }
                if (!(r26 == null || r28 == null)) {
                    C246193eB r18 = r11;
                    AnonymousClass0fU.A00(new ICH(r18, userSession2, r4, gjT2, r2), view);
                }
            }
            i = 2131972988;
        } else {
            gjT2.A02(0);
            i = 2131975468;
        }
        String Apy = r24.Apy();
        String Apv = r24.Apv();
        if (Apv == null || Apv.length() == 0) {
            Apv = gjT2.A08.getResources().getString(i);
        }
        Integer A00 = C55013Hak.A00(r24.Apw());
        UndoStyle CBP = r24.CBP();
        View.OnClickListener onClickListener2 = onClickListener;
        if (Apv != null) {
            if (CBP == null) {
                undoStyle = UndoStyle.A04;
            } else {
                undoStyle = CBP;
            }
            gjT2.A03(onClickListener2, undoStyle, A00, Apv, Apy);
        }
        if (CBP != UndoStyle.A04) {
            A07(gjT2, 8);
            C56310HwN.A01(gjT2, 8);
        } else if (r26 == null || r28 == null) {
            A02(onClickListener2, gjT2);
        } else {
            A02(new IBO(r4, gjT2, r2), gjT2);
        }
    }

    public static final void A02(View.OnClickListener onClickListener, C53157GjT gjT) {
        TextView textView = gjT.A0I;
        Context context = textView.getContext();
        textView.getPaint().setFakeBoldText(true);
        2eS.A01(textView);
        AnonymousClass0fU.A00(onClickListener, textView);
        0qQ.A0A(context);
        textView.setTextColor(02K.A02(context, 1QE.A01(context)));
        A07(gjT, 0);
    }

    public static final void A03(ConfirmationStyle confirmationStyle, ConfirmationTitleStyle confirmationTitleStyle, UndoStyle undoStyle, C53157GjT gjT) {
        C53157GjT gjT2 = gjT;
        View view = gjT2.A07;
        Context context = view.getContext();
        boolean z = false;
        if (confirmationStyle == ConfirmationStyle.TOMBSTONE_V2) {
            z = true;
        }
        View view2 = gjT2.A00;
        if (view2 != null) {
            View requireViewById = view2.requireViewById(R.id.tombstone_header_text);
            0qQ.A07(requireViewById);
            TextView textView = (TextView) requireViewById;
            textView.setAccessibilityHeading(true);
            textView.setFocusable(1);
            View requireViewById2 = view2.requireViewById(R.id.tombstone_feedback_text);
            0qQ.A07(requireViewById2);
            TextView textView2 = (TextView) requireViewById2;
            View view3 = null;
            if (undoStyle == UndoStyle.A04) {
                view3 = gjT2.A0I;
            } else {
                ArrayList arrayList = gjT2.A0J;
                if (arrayList.size() > 0 && z) {
                    view3 = ((View) arrayList.get(arrayList.size() - 1)).requireViewById(R.id.survey_tombstone_reason);
                }
            }
            int color = context.getColor(2Yu.A0H(context, R.attr.igdsPrimaryBackground));
            int color2 = context.getColor(2Yu.A0H(context, R.attr.igdsSecondaryBackground));
            int color3 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text));
            int color4 = context.getColor(2Yu.A0H(context, R.attr.igdsSecondaryText));
            if (z) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                view.setBackgroundColor(color);
                if (confirmationTitleStyle == ConfirmationTitleStyle.LARGE_LEFT) {
                    textView.setGravity(3);
                    textView2.setGravity(3);
                    textView2.setTextSize(2, 12.0f);
                    textView.setTextAppearance(R.style.igds_emphasized_title);
                } else {
                    textView.setGravity(17);
                    textView2.setGravity(1);
                    textView2.setTextSize(2, 14.0f);
                    textView.setTextAppearance(R.style.igds_emphasized_body_1);
                    C48948Emm.A00(textView);
                }
                if (textView.getVisibility() == 0) {
                    color3 = color4;
                }
                textView2.setTextColor(color3);
                if (view3 != null) {
                    view2.setBackgroundResource(R.drawable.rounded_top_corner_background);
                    view3.setBackgroundResource(R.drawable.rounded_bottom_corner_background);
                    return;
                }
                view2.setBackgroundResource(R.drawable.rounded_corner_background_secondary_color);
                return;
            }
            view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
            view.setBackgroundColor(color2);
            view2.setBackgroundColor(color2);
            textView.setTextAppearance(R.style.igds_body_1);
            textView.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
            textView.setGravity(17);
            textView2.setTextColor(color4);
            if (view3 != null) {
                view3.setBackgroundColor(color2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(1Xj r4, C53157GjT gjT, AnonymousClass3W1 r6) {
        View view = gjT.A00;
        if (view != null) {
            view.setVisibility(8);
            C56310HwN.A00(gjT);
            TextView textView = gjT.A0F;
            textView.setText(2131975467);
            textView.getPaint().setFakeBoldText(true);
            IBL ibl = new IBL(r4, gjT, r6);
            TextView textView2 = gjT.A0G;
            textView2.getPaint().setFakeBoldText(true);
            2eS.A01(textView2);
            AnonymousClass0fU.A00(ibl, textView2);
            C56310HwN.A01(gjT, 0);
            A06(gjT);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A07(C53157GjT gjT, int i) {
        gjT.A0C.setVisibility(i);
        gjT.A0I.setVisibility(i);
    }

    public static final void A08(C53157GjT gjT, boolean z) {
        TextView textView = gjT.A0H;
        textView.setVisibility(0);
        textView.setText(2131975469);
        textView.getPaint().setFakeBoldText(true);
        C56310HwN.A01(gjT, 8);
        TextView textView2 = gjT.A0F;
        textView2.setText(2131975468);
        textView2.getPaint().setFakeBoldText(true);
        TextView textView3 = gjT.A0E;
        if (z) {
            textView3.setVisibility(0);
            textView3.setText(2131975451);
            return;
        }
        textView3.setVisibility(4);
    }
}
