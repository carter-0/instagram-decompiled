package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

public abstract class I7N {
    public static final int A00(C270164gI r5) {
        String BCo;
        int i = 0;
        List BH2 = r5.BH2();
        if (BH2 != null && BH2.size() >= 1) {
            List<IGAdsGenericCardInfoTypeEnum> BH22 = r5.BH2();
            0qQ.A0C(BH22, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum>");
            for (IGAdsGenericCardInfoTypeEnum A02 : BH22) {
                int A022 = DbU.A02(A02, 1);
                if (A022 == 2) {
                    BCo = r5.BCo();
                } else if (A022 == 3) {
                    BCo = r5.BJi();
                } else if (A022 == 4) {
                    if (r5.BXT() == null) {
                    }
                    i++;
                } else if (A022 == 10) {
                    BCo = r5.Btv();
                }
                if (BCo != null) {
                    if (BCo.length() == 0) {
                    }
                    i++;
                }
            }
        }
        return i;
    }

    public static final C255783ui A01(Context context, View view, TextView textView, UserSession userSession, C255773uh r12, C270164gI r13, C309426Yf r14, C309686Zf r15) {
        String str;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C255773uh r8 = r12;
        CharSequence A05 = AnonymousClass4EQ.A05(context2, userSession, r12);
        if (A05.length() == 0) {
            throw AnonymousClass7TE.A0w("Unsupported empty CTA text on AdsGenericCardInfo");
        }
        Locale A02 = AnonymousClass1Q2.A02();
        String upperCase = String.valueOf(A05.charAt(0)).toUpperCase(A02);
        0qQ.A07(upperCase);
        String substring = DbT.A12(A02, A05.toString()).substring(1);
        0qQ.A07(substring);
        String A0R = 002.A0R(upperCase, substring);
        IGAdsCardStickerCTATypeEnum AtS = r13.AtS();
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.STICKER_CTA;
        if (!(AtS == iGAdsCardStickerCTATypeEnum || AtS == IGAdsCardStickerCTATypeEnum.STICKER_CTA_BG_HIGHLIGHT)) {
            AtS = iGAdsCardStickerCTATypeEnum;
        }
        TextView textView2 = textView;
        textView.setText(A0R);
        if (AtS == IGAdsCardStickerCTATypeEnum.STICKER_CTA_BG_HIGHLIGHT) {
            DbT.A17(context2, textView, R.color.igds_icon_on_color);
            DbU.A11(context2, textView, R.drawable.reel_generic_lead_gen_card_rounded_bottom_corner_background);
        }
        C309686Zf r10 = r15;
        A05(context2, textView2, userSession, r12, r15);
        String str2 = A0R.toString();
        if (AnonymousClass7TF.A1Y(r13.Buq(), true)) {
            str = r13.CGM();
        } else {
            str = null;
        }
        return A02(context2, view, userSession2, r8, r14, r10, C273654mx.A00(3364), str2, str);
    }

    public static final C255783ui A02(Context context, View view, UserSession userSession, C255773uh r18, C309426Yf r19, C309686Zf r20, String str, String str2, String str3) {
        int i;
        String str4 = str2;
        0qQ.A0B(str4, 3);
        int A09 = 0nA.A09(context);
        int A02 = C316216lI.A02(context);
        if (C316216lI.A0B(context)) {
            i = C316216lI.A03(context);
        } else {
            i = 0;
        }
        HDT hdt = new HDT(context);
        C255783ui r5 = new C255783ui();
        View view2 = view;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IE1(view2, userSession, r18, r5, r19, r20, hdt, str4, str, str3, A09, A02, i));
        }
        return r5;
    }

    public static final CharSequence A03(Context context, IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum, C270164gI r7) {
        CharSequence charSequence = "";
        if (iGAdsGenericCardInfoTypeEnum == null) {
            return charSequence;
        }
        int ordinal = iGAdsGenericCardInfoTypeEnum.ordinal();
        if (ordinal == 2) {
            String BCo = r7.BCo();
            CharSequence charSequence2 = charSequence;
            if (BCo != null) {
                charSequence2 = charSequence;
                if (BCo.length() != 0) {
                    CharSequence append = C51965G9l.A0E().append(r7.BCo());
                    0qQ.A0A(append);
                    charSequence2 = append;
                }
            }
            return charSequence2;
        } else if (ordinal == 3) {
            String BJi = r7.BJi();
            SpannableStringBuilder spannableStringBuilder = charSequence;
            if (BJi != null) {
                spannableStringBuilder = charSequence;
                if (BJi.length() != 0) {
                    SpannableStringBuilder A0E = C51965G9l.A0E();
                    A0E.append(context.getString(2131971448));
                    A0E.append(" ");
                    A0E.append(r7.BJi());
                    spannableStringBuilder = A0E;
                }
            }
            return spannableStringBuilder;
        } else if (ordinal == 4) {
            SpannableStringBuilder spannableStringBuilder2 = charSequence;
            if (r7.BXT() != null) {
                SpannableStringBuilder A0E2 = C51965G9l.A0E();
                A0E2.append(C14066TpE.A00(context.getResources(), r7.BXT(), (Integer) null, true));
                A0E2.append(" ");
                A0E2.append(context.getString(2131971449));
                spannableStringBuilder2 = A0E2;
            }
            return spannableStringBuilder2;
        } else if (ordinal != 10) {
            return charSequence;
        } else {
            String Btv = r7.Btv();
            CharSequence charSequence3 = charSequence;
            if (Btv != null) {
                charSequence3 = charSequence;
                if (Btv.length() != 0) {
                    CharSequence append2 = C51965G9l.A0E().append(r7.Btv());
                    0qQ.A0A(append2);
                    charSequence3 = append2;
                }
            }
            return charSequence3;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.Hiz, X.HDS] */
    public static final void A05(Context context, View view, UserSession userSession, C255773uh r17, C309686Zf r18) {
        UserSession userSession2 = userSession;
        C238833Dp.A00(userSession2).A05(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON);
        C244083ac.A05(view, C244063aa.CARD_OVERLAY_CTA);
        HDT hdt = new HDT(context);
        ? hiz = new C55517Hiz(0.35d);
        int width = view.getWidth();
        hiz.A01 = width;
        double d = (double) width;
        double d2 = hiz.A00;
        hiz.A00 = d * d2;
        if (!(d2 == 0.0d || d2 == 0.5d)) {
            WeakReference A0v = C51965G9l.A0v(new C74190PqW(hiz, 5));
            if (182.A06(0Tu.A05, userSession2, 36316220526235750L)) {
                view.addOnLayoutChangeListener(new ID7(A0v, 3));
            } else {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new C56824IDv(0, A0v, C51965G9l.A0v(view)));
            }
        }
        C309686Zf r10 = r18;
        view.setOnTouchListener(new C54038GyN(userSession2, r10, new C57314IWx(r17, r10), 0sr.A1P(new C55517Hiz[]{hdt, hiz}), true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r2 != 1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.content.Context r5, X.C270164gI r6, X.C307166Pb r7) {
        /*
            r3 = 1
            r1 = 2
            int r0 = A00(r6)
            if (r0 == 0) goto L_0x009f
            if (r0 == r3) goto L_0x0071
            if (r0 <= r1) goto L_0x0024
            java.lang.String r4 = "Received more than 2 valid signals: "
            java.util.List r2 = r6.BH2()
            if (r2 == 0) goto L_0x006f
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r0 = X.DbT.A0z(r1, r2, r0)
        L_0x001b:
            java.lang.String r1 = X.002.A0R(r4, r0)
            java.lang.String r0 = "GenericCardViewBinder"
            X.0wb.A03(r0, r1)
        L_0x0024:
            java.util.List r1 = r6.BH2()
            if (r1 == 0) goto L_0x006d
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum.NUMBER_OF_FOLLOWERS
            int r2 = r1.indexOf(r0)
            r1 = 0
            if (r2 == r3) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            java.util.List r0 = r6.BH2()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006a
            java.util.List r0 = r6.BH2()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum) r0
        L_0x004c:
            java.lang.CharSequence r1 = A03(r5, r0, r6)
        L_0x0050:
            java.lang.CharSequence r2 = A04(r5, r6, r2)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0067
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0067
        L_0x0060:
            java.lang.Boolean r0 = r6.Bui()
            r7.EvG(r0, r1, r2)
        L_0x0067:
            return
        L_0x0068:
            r0 = 0
            goto L_0x004c
        L_0x006a:
            java.lang.String r1 = ""
            goto L_0x0050
        L_0x006d:
            r2 = 0
            goto L_0x0033
        L_0x006f:
            r0 = 0
            goto L_0x001b
        L_0x0071:
            r1 = 0
            java.util.List r0 = r6.BH2()
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009c
            java.util.List r0 = r6.BH2()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum) r0
        L_0x008a:
            java.lang.CharSequence r1 = A03(r5, r0, r6)
        L_0x008e:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0098
            java.lang.CharSequence r1 = A04(r5, r6, r3)
        L_0x0098:
            r2 = 0
            goto L_0x0060
        L_0x009a:
            r0 = 0
            goto L_0x008a
        L_0x009c:
            java.lang.String r1 = ""
            goto L_0x008e
        L_0x009f:
            r7.CLo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7N.A06(android.content.Context, X.4gI, X.6Pb):void");
    }

    public static final void A07(View view, View view2, C255773uh r6) {
        GradientDrawable.Orientation orientation;
        GradientDrawable A0O;
        1Xj r0 = r6.A0b;
        r0.getClass();
        String A2u = r0.A2u();
        String A2t = r0.A2t();
        if (A2u == null || A2u.length() == 0 || A2t == null || A2t.length() == 0) {
            Context A0S = AnonymousClass7TE.A0S(view);
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            A0O = C51970G9q.A0O(orientation, AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_grey_09), AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_grey_03));
            RectF rectF = 0nA.A01;
        } else {
            RectF rectF2 = 0nA.A01;
            int parseColor = Color.parseColor(A2u);
            int parseColor2 = Color.parseColor(A2t);
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            A0O = C51970G9q.A0O(orientation, parseColor, parseColor2);
        }
        view.setBackground(A0O);
        Context A0S2 = AnonymousClass7TE.A0S(view2);
        view2.setBackground(C51970G9q.A0O(orientation, AnonymousClass7TF.A03(A0S2, R.attr.igds_color_drawer_shadow), AnonymousClass7TF.A03(A0S2, R.attr.igds_color_legibility_gradient)));
    }

    public static final void A0B(TextView textView, UserSession userSession, C255773uh r6) {
        User A2A;
        1Xj r3 = r6.A0b;
        r3.getClass();
        String str = "";
        if (r3.CcK() && (A2A = r3.A2A(userSession)) != null) {
            str = A2A.getFullName();
            if ((A2A.A2Q() || str == null || str.length() <= 0) && ((str = C231122qu.A08(userSession, r3)) == null || (!C231122qu.A0V(userSession, r3) && (!A2A.A2Q() || str.length() <= 0)))) {
                str = A2A.getUsername();
            }
        }
        textView.setText(str);
        C244083ac.A05(textView, C244063aa.CARD_OVERLAY_TITLE);
    }

    public static final CharSequence A04(Context context, C270164gI r3, int i) {
        List BH2;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum;
        List BH22 = r3.BH2();
        if (BH22 == null || BH22.isEmpty() || (BH2 = r3.BH2()) == null || BH2.size() != 2 || A00(r3) < 1) {
            return "";
        }
        List BH23 = r3.BH2();
        if (BH23 != null) {
            iGAdsGenericCardInfoTypeEnum = (IGAdsGenericCardInfoTypeEnum) 00k.A0O(BH23, i);
        } else {
            iGAdsGenericCardInfoTypeEnum = null;
        }
        return A03(context, iGAdsGenericCardInfoTypeEnum, r3);
    }

    public static final void A08(View view, View view2, C255773uh r5, C270164gI r6) {
        if (r6.Aes() != IGAdsCardBackgroundTypeEnum.DIMMED_IMAGE || !1AW.A06(0Tu.A05, 18310897281807192L)) {
            A07(view, view2, r5);
        } else {
            DbT.A16(view.getContext(), view2, R.color.clips_overlay_ads_end_background_color);
        }
    }

    public static final void A09(View view, C255783ui r5, C309686Zf r6) {
        view.setOnTouchListener(new IDT(2, new GestureDetector(view.getContext(), new C380299Xl(2, r6, r5)), r6));
    }

    public static final void A0A(TextView textView, AnonymousClass0iw r3, IgImageView igImageView, C255773uh r5) {
        User A0L = r5.A0L();
        1Xj r0 = r5.A0b;
        if (r0 != null && r0.A5l() && A0L != null && A0L.B8Q().length() != 0) {
            A0L.Bh3();
            User A0L2 = r5.A0L();
            if (A0L2 != null) {
                ImageUrl Bh3 = A0L2.Bh3();
                String B8Q = A0L2.B8Q();
                igImageView.setUrl(Bh3, r3);
                textView.setText(B8Q);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
