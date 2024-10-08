package com.instagram.igds.components.actionbar;

import X.0mk;
import X.0oh;
import X.0qQ;
import X.0sP;
import X.0sr;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass3JS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C266444Yx;
import X.C61009Jv9;
import X.C61057Jvv;
import X.C61065Jw3;
import X.C61072JwA;
import X.C61084JwM;
import X.C62320sa;
import X.C66909Mes;
import X.DbS;
import X.DbU;
import X.DbX;
import X.JTP;
import X.JTT;
import X.LYE;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsActionBar extends LinearLayout {
    public C61084JwM A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final boolean A04;
    public final View A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    private final void A00(ImageView imageView, C61009Jv9 jv9) {
        C61072JwA jwA = (C61072JwA) jv9.A04;
        if (jwA != null) {
            AnonymousClass3JS r2 = new AnonymousClass3JS(AnonymousClass7TE.A0S(this), jv9.A01);
            int i = jwA.A01;
            Number number = (Number) jwA.A02;
            if (number != null) {
                r2.setLevel(number.intValue());
            } else {
                r2.A02(i, 1);
            }
            imageView.setActivated(true);
            imageView.setImageDrawable(r2);
        } else {
            imageView.setImageResource(jv9.A01);
        }
        imageView.setOnClickListener(new LYE((0sP) jv9.A07));
        Number number2 = (Number) jv9.A05;
        if (number2 != null) {
            DbU.A12(getContext(), imageView, number2.intValue());
        }
        Context context = getContext();
        DbX.A12(context, imageView, 2Yu.A0H(context, jv9.A03));
        0sP r0 = (0sP) jv9.A06;
        if (r0 != null) {
            r0.invoke(imageView);
        }
    }

    public final void A01(C61084JwM jwM) {
        Object obj;
        C62320sa r0;
        C61084JwM jwM2;
        C61057Jvv jvv;
        C61057Jvv jvv2;
        int i;
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        List list;
        List<C61009Jv9> list2;
        if (!jwM.equals(this.A00)) {
            C61057Jvv jvv3 = (C61057Jvv) jwM.A02;
            C61084JwM jwM3 = this.A00;
            LYE lye = null;
            if (jwM3 == null || !0qQ.A0K(jvv3, jwM3.A02)) {
                if (jvv3 != null) {
                    TextView textView = this.A03;
                    Context A0S = AnonymousClass7TE.A0S(this);
                    textView.setText(C66909Mes.A00(A0S, (C266444Yx) jvv3.A05));
                    textView.setVisibility(0);
                    0sP r02 = (0sP) jvv3.A01;
                    if (r02 != null) {
                        lye = new LYE(r02);
                    }
                    textView.setOnClickListener(lye);
                    Number number = (Number) jvv3.A00;
                    boolean z = jvv3.A02;
                    C61084JwM jwM4 = this.A00;
                    if (jwM4 == null || (jvv2 = (C61057Jvv) jwM4.A02) == null) {
                        obj = null;
                    } else {
                        obj = jvv2.A00;
                    }
                    if (!0qQ.A0K(number, obj) || (jwM2 = this.A00) == null || (jvv = (C61057Jvv) jwM2.A02) == null || z != jvv.A02) {
                        if (number != null) {
                            Drawable A0E = JTP.A0E(A0S, number);
                            if (A0E != null) {
                                DbX.A11(A0S, A0E, 2Yu.A0H(A0S, R.attr.igds_color_primary_icon));
                                if (z) {
                                    AnonymousClass3JS r2 = new AnonymousClass3JS(A0S, A0E, 12);
                                    textView.setActivated(true);
                                    r2.A06 = true;
                                    r2.A02(R.attr.igds_color_icon_badge, 14);
                                    A0E = r2;
                                }
                                Drawable drawable = null;
                                if (this.A04) {
                                    drawable = A0E;
                                    A0E = null;
                                }
                                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, A0E, (Drawable) null);
                            }
                            if (z && (r0 = (C62320sa) jvv3.A04) != null) {
                                r0.invoke();
                            }
                        } else {
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                } else {
                    this.A03.setVisibility(8);
                }
            }
            C61065Jw3 jw3 = (C61065Jw3) jwM.A01;
            C61084JwM jwM5 = this.A00;
            if (jwM5 == null || !0qQ.A0K(jw3, jwM5.A01)) {
                ImageView imageView = this.A01;
                if (jw3 != null) {
                    imageView.setImageResource(jw3.A01);
                    Context context = getContext();
                    DbU.A12(context, imageView, jw3.A00);
                    DbU.A14(context, imageView, 2Yu.A0H(context, R.attr.igds_color_primary_icon));
                    imageView.setOnClickListener(new LYE((Object) jw3, 67));
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
            List<C61009Jv9> list3 = (List) jwM.A00;
            C61084JwM jwM6 = this.A00;
            if (jwM6 != null) {
                obj2 = jwM6.A00;
            } else {
                obj2 = null;
            }
            if (!0qQ.A0K(list3, obj2)) {
                LinearLayout linearLayout = this.A02;
                if (list3.size() == linearLayout.getChildCount()) {
                    ArrayList A0p = AnonymousClass7TF.A0p(list3);
                    for (C61009Jv9 jv9 : list3) {
                        AnonymousClass7TF.A1M(A0p, jv9.A02);
                    }
                    C61084JwM jwM7 = this.A00;
                    if (jwM7 == null || (list2 = (List) jwM7.A00) == null) {
                        arrayList = null;
                    } else {
                        arrayList = AnonymousClass7TF.A0p(list2);
                        for (C61009Jv9 jv92 : list2) {
                            AnonymousClass7TF.A1M(arrayList, jv92.A02);
                        }
                    }
                    if (A0p.equals(arrayList)) {
                        int i2 = 0;
                        for (Object next : list3) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                0sr.A1T();
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C61009Jv9 jv93 = (C61009Jv9) next;
                            C61084JwM jwM8 = this.A00;
                            if (jwM8 == null || (list = (List) jwM8.A00) == null) {
                                obj3 = null;
                            } else {
                                obj3 = list.get(i2);
                            }
                            if (!0qQ.A0K(jv93, obj3)) {
                                View childAt = linearLayout.getChildAt(i2);
                                if (jv93 == null || jv93.A00 != 1) {
                                    throw AnonymousClass7TE.A1K();
                                }
                                0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                                A00((ImageView) childAt, jv93);
                            }
                            i2 = i3;
                        }
                    }
                }
                linearLayout.removeAllViews();
                for (C61009Jv9 jv94 : list3) {
                    if (jv94 == null || jv94.A00 != 1) {
                        throw AnonymousClass7TE.A1K();
                    }
                    Context context2 = getContext();
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    0qQ.A07(context2);
                    int A022 = DbS.A02(context2, 12);
                    int A023 = DbS.A02(context2, 16);
                    imageView2.setPaddingRelative(A022, A023, A022, A023);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 80;
                    imageView2.setLayoutParams(layoutParams);
                    linearLayout.addView(imageView2);
                    A00(imageView2, jv94);
                }
            }
            this.A00 = jwM;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = 0mk.A02(context);
        View inflate = View.inflate(context, R.layout.layout_igds_action_bar, this);
        this.A05 = inflate;
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.action_bar_title);
        this.A03 = A0d;
        this.A01 = DbS.A0G(inflate, R.id.action_bar_navigation_button);
        this.A02 = (LinearLayout) inflate.findViewById(R.id.action_bar_action_buttons);
        if (0oh.A08()) {
            0oh.A07(A0d.getContext(), (Typeface) null, A0d, AnonymousClass05K.A0C);
        }
    }

    public /* synthetic */ IgdsActionBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
