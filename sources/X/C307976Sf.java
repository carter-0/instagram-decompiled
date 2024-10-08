package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.reels.Reel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6Sf  reason: invalid class name and case insensitive filesystem */
public abstract class C307976Sf {
    public static C255773uh A00;
    public static C273404mW A01;
    public static Integer A02 = AnonymousClass05K.A00;
    public static boolean A03;
    public static C309426Yf A04;
    public static final HashMap A05 = new HashMap();
    public static final HashSet A06 = new HashSet();

    public static final void A00() {
        A03 = false;
        if (A02 != AnonymousClass05K.A01) {
            C309426Yf r1 = A04;
            if (r1 == null) {
                0qQ.A0F("itemState");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A04(A00, r1);
            }
        }
    }

    public static final void A02(UserSession userSession, AnonymousClass4DU r26, C255773uh r27, C250973mM r28, C309426Yf r29, C307286Pn r30, boolean z) {
        C42124BIc bIc;
        String str;
        String str2;
        String str3;
        List list;
        C42124BIc bIc2;
        String str4;
        String str5;
        int i;
        List list2;
        boolean z2 = false;
        C255773uh r19 = r27;
        A00 = r27;
        C309426Yf r18 = r29;
        A04 = r29;
        if (z) {
            r18.A02(0.0f);
            A03 = false;
            A02 = AnonymousClass05K.A00;
        }
        C307286Pn r5 = r30;
        r5.A04.setVisibility(0);
        C250973mM r31 = r28;
        Reel reel = r31.A0H;
        AnonymousClass3IB r0 = reel.A0I;
        String str6 = null;
        if (r0 == null || (list2 = r0.A09) == null) {
            bIc = null;
        } else {
            bIc = (C42124BIc) 00k.A0O(list2, 0);
        }
        AnonymousClass3IB r02 = reel.A0I;
        if (r02 != null) {
            str = r02.A06;
        } else {
            str = null;
        }
        if (bIc != null && str != null && str.length() != 0) {
            IgTextView igTextView = r5.A02;
            if (igTextView != null) {
                String str7 = bIc.A02;
                if (str7 == null) {
                    str7 = "";
                }
                igTextView.setText(str7);
                LinearLayout linearLayout = r5.A01;
                if (linearLayout != null) {
                    int i2 = 0;
                    linearLayout.setVisibility(0);
                    linearLayout.removeAllViews();
                    List<C42103BHg> list3 = bIc.A04;
                    UserSession userSession2 = userSession;
                    if (!(list3 == null || Integer.valueOf(list3.size()) == null)) {
                        for (C42103BHg bHg : list3) {
                            String str8 = bIc.A01;
                            if (str8 != null) {
                                String str9 = Cs3.A00;
                                if (str9 != null && !str8.equals(str9)) {
                                    Cs3.A01.clear();
                                }
                                if (Cs3.A01.isEmpty()) {
                                    Cs3.A00 = str8;
                                }
                            }
                            if (182.A06(0Tu.A05, userSession2, 2342172694461563133L)) {
                                str4 = "v3";
                            } else {
                                str4 = "v2";
                            }
                            boolean equals = str4.equals("v3");
                            int i3 = R.layout.brand_survey_question_answer_row_view_v2;
                            if (equals) {
                                i3 = R.layout.brand_survey_question_answer_row_view_v3;
                            }
                            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(i3, linearLayout, false);
                            0qQ.A0A(inflate);
                            C49647F0e f0e = new C49647F0e(inflate);
                            inflate.setTag(f0e);
                            f0e.A00 = str4;
                            TextView textView = f0e.A05;
                            if (textView != null) {
                                Context context = textView.getContext();
                                if (context != null) {
                                    i = Math.round(50.0f * context.getResources().getDisplayMetrics().density);
                                } else {
                                    i = 0;
                                }
                                textView.setMinHeight(i);
                            }
                            View view = f0e.A03;
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            Object tag = inflate.getTag();
                            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.viewer.sponsored.BrandSurveyAnswerRowViewBinder.Holder");
                            C49647F0e f0e2 = (C49647F0e) tag;
                            int i4 = i2 + 1;
                            HashSet hashSet = (HashSet) A05.get(str8);
                            0qQ.A0B(f0e2, 0);
                            0qQ.A0B(bHg, 1);
                            TextView textView2 = f0e2.A05;
                            if (textView2 != null) {
                                if (hashSet != null) {
                                    Cs3.A01 = hashSet;
                                }
                                textView2.setText(bHg.A02);
                                textView2.setGravity(16);
                                TextView textView3 = f0e2.A06;
                                if (textView3 != null) {
                                    if (i2 < 0 || i2 > 25) {
                                        str5 = "";
                                    } else {
                                        str5 = String.valueOf((char) ((i2 % 26) + 65));
                                    }
                                    textView3.setText(str5);
                                }
                                if (0qQ.A0K(f0e2.A00, "v3")) {
                                    textView2.setTextAppearance(R.style.igds_emphasized_body_1);
                                    C48948Emm.A00(textView2);
                                }
                                HashSet hashSet2 = Cs3.A01;
                                boolean z3 = true;
                                String str10 = bHg.A03;
                                if (!hashSet2.contains(str10)) {
                                    z3 = false;
                                }
                                if (z3) {
                                    ImageView imageView = f0e2.A04;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    View view2 = f0e2.A02;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                    }
                                    boolean contains = Cs3.A01.contains(str10);
                                    Drawable drawable = null;
                                    View view3 = f0e2.A01;
                                    if (!contains) {
                                        if (view3 != null) {
                                            view3.setBackgroundResource(R.drawable.brand_survey_answer_background_transition);
                                            drawable = view3.getBackground();
                                        }
                                        TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
                                        if (str10 != null) {
                                            Cs3.A01.add(str10);
                                        }
                                        if (transitionDrawable != null) {
                                            transitionDrawable.startTransition(150);
                                        }
                                    } else {
                                        if (view3 != null) {
                                            view3.setBackground((Drawable) null);
                                        }
                                        boolean A0K = 0qQ.A0K(f0e2.A00, "v3");
                                        int i5 = R.drawable.answer_background_selected;
                                        if (A0K) {
                                            i5 = R.drawable.brand_survey_answer_background_selected_v3;
                                        }
                                        if (view3 != null) {
                                            view3.setBackgroundResource(i5);
                                        }
                                    }
                                    if (0qQ.A0K(f0e2.A00, "v2")) {
                                        Context context2 = textView2.getContext();
                                        textView2.setTextColor(context2.getColor(2Yu.A0E(context2)));
                                    }
                                } else {
                                    Cs3.A01.remove(str10);
                                    ImageView imageView2 = f0e2.A04;
                                    if (imageView2 != null) {
                                        imageView2.setVisibility(8);
                                    }
                                    View view4 = f0e2.A02;
                                    if (view4 != null) {
                                        view4.setVisibility(0);
                                    }
                                    View view5 = f0e2.A01;
                                    if (view5 != null) {
                                        view5.setBackgroundResource(R.drawable.brand_survey_answer_background);
                                    }
                                }
                                linearLayout.addView(inflate);
                                i2 = i4;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    AnonymousClass3IB r03 = reel.A0I;
                    if (!(r03 == null || (list = r03.A09) == null || (bIc2 = (C42124BIc) 00k.A0O(list, 0)) == null)) {
                        str6 = bIc2.A03;
                    }
                    if (str6 != null) {
                        z2 = str6.equals("multiple");
                    }
                    A03(bIc, r5, str, z2);
                    IgdsButton igdsButton = r5.A03;
                    if (igdsButton != null) {
                        AnonymousClass4DU r22 = r26;
                        AnonymousClass0fU.A00(new DEW(userSession2, r22, r19, r31, r5, str), igdsButton);
                        if (A02 != AnonymousClass05K.A01) {
                            A04(r19, r18);
                        }
                        AnonymousClass3IB r04 = reel.A0I;
                        if (r04 != null && (str3 = r04.A06) != null && str3.length() != 0) {
                            LinearLayout linearLayout2 = r5.A01;
                            if (linearLayout2 != null) {
                                int childCount = linearLayout2.getChildCount();
                                int i6 = 0;
                                while (i6 < childCount) {
                                    LinearLayout linearLayout3 = r5.A01;
                                    if (linearLayout3 != null) {
                                        AnonymousClass0fU.A00(new DEX(userSession2, r22, bIc, r19, r31, r18, r5, str3, i6, z2), linearLayout3.getChildAt(i6));
                                        i6++;
                                    }
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        str2 = "submitButton";
                    }
                }
                str2 = "questionList";
            } else {
                str2 = "questionTitle";
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(UserSession userSession, AnonymousClass4DU r6, AnonymousClass3IB r7, String str) {
        if (r7 != null && str != null && str.length() != 0) {
            A06.add(str);
            List list = r7.A09;
            C42124BIc bIc = null;
            if (list != null) {
                bIc = (C42124BIc) 00k.A0O(list, 0);
            }
            String A0R = 002.A0R("instagram_ad_", "survey_question_response");
            if (!(bIc == null || A0R == null)) {
                HashMap hashMap = A05;
                String str2 = bIc.A01;
                HashSet hashSet = (HashSet) hashMap.get(str2);
                0qQ.A0C(hashSet, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                C254523sc r1 = new C254523sc(r6, A0R);
                r1.A7J = r7.A08;
                r1.A6X = str2;
                r1.A83 = new ArrayList(hashSet);
                r1.A6w = "in_feed_survey";
                C233822wX.A0H(userSession, r1, r6);
            }
            new Handler(Looper.getMainLooper()).postDelayed(C57992Ijl.A00, 2000);
        }
    }

    public static final void A03(C42124BIc bIc, C307286Pn r6, String str, boolean z) {
        boolean z2;
        boolean A0u = 00k.A0u(A06, str);
        boolean z3 = true;
        AbstractCollection abstractCollection = (AbstractCollection) A05.get(bIc.A01);
        if (abstractCollection != null) {
            z2 = abstractCollection.isEmpty();
        } else {
            z2 = true;
        }
        IgdsButton igdsButton = r6.A03;
        if (z) {
            if (igdsButton != null) {
                igdsButton.setVisibility(0);
                IgdsButton igdsButton2 = r6.A03;
                if (igdsButton2 != null) {
                    if (A0u || z2) {
                        z3 = false;
                    }
                    igdsButton2.setEnabled(z3);
                    return;
                }
            }
        } else if (igdsButton != null) {
            igdsButton.setVisibility(8);
            return;
        }
        0qQ.A0F("submitButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C255773uh r4, C309426Yf r5) {
        if (r5.A0B < 1.0f && !A03) {
            new Handler(Looper.getMainLooper()).postDelayed(new C57854IhX(r4, r5), 100);
        }
    }
}
