package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.4K6  reason: invalid class name */
public final class AnonymousClass4K6 implements C263244Jw {
    public final Context A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final C258273yk A03;
    public final AnonymousClass4K4 A04;
    public final AnonymousClass3W1 A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final AnonymousClass4DU A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public AnonymousClass4K6(Context context, UserSession userSession, AnonymousClass4DU r4, C258273yk r5, AnonymousClass4K4 r6, AnonymousClass3W1 r7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        1Xj r0;
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A0A = r4;
        this.A01 = userSession;
        this.A00 = context;
        this.A0C = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A06 = z4;
        this.A0D = z5;
        this.A08 = z6;
        this.A07 = z7;
        this.A09 = z8;
        if (z2) {
            r0 = C250563lf.A08(r4, userSession);
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }

    public static final void A05(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setStartDelay(200).setDuration(400);
    }

    private final Drawable A00() {
        AnonymousClass0eM r0;
        AnonymousClass4K4 r3 = this.A04;
        if (r3.A04 || this.A05.A0o == 1sy.A0O) {
            return null;
        }
        if (this.A0D) {
            boolean z = this.A09;
            C258273yk r02 = this.A03;
            if (z) {
                r0 = r02.A0G;
            } else {
                r0 = r02.A0F;
            }
        } else if (!r3.A02 && !r3.A03) {
            return null;
        } else {
            r0 = this.A03.A0H;
        }
        return (Drawable) r0.getValue();
    }

    private final View A01() {
        1Xj r0 = this.A02;
        C258273yk r1 = this.A03;
        if (r0 != null) {
            r1.A01().setVisibility(8);
            C252063oV r02 = r1.A0B;
            if (r02 != null) {
                return r02.getView();
            }
            throw new IllegalStateException("Required value was null.");
        }
        ViewGroup viewGroup = r1.A04;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return r1.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r6 != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r9 = this;
            boolean r6 = r9.A09
            r2 = 0
            X.3yk r5 = r9.A03
            if (r6 == 0) goto L_0x0191
            X.3oV r0 = r5.A0C
            if (r0 == 0) goto L_0x018e
            android.view.View r3 = r0.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x0011:
            android.graphics.drawable.Drawable r1 = r9.A00()
            if (r1 == 0) goto L_0x0187
            if (r6 != 0) goto L_0x0187
            if (r3 == 0) goto L_0x0031
            android.content.Context r0 = r9.A00
            A04(r0, r1, r3)
        L_0x0020:
            X.4K4 r0 = r9.A04
            boolean r1 = r0.A02
            r0 = 2131975016(0x7f135b68, float:1.9587112E38)
            if (r1 == 0) goto L_0x002c
            r0 = 2131975027(0x7f135b73, float:1.9587135E38)
        L_0x002c:
            r3.setText(r0)
        L_0x002f:
            if (r6 != 0) goto L_0x004a
        L_0x0031:
            android.content.Context r2 = r9.A00
            boolean r1 = r9.A0D
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            if (r1 == 0) goto L_0x003d
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
        L_0x003d:
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            if (r3 == 0) goto L_0x004a
            r3.setTextColor(r0)
        L_0x004a:
            X.1Xj r4 = r9.A02
            if (r4 == 0) goto L_0x005d
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A0A
            if (r2 == 0) goto L_0x005d
            com.instagram.common.typedurl.ImageUrl r1 = r4.A1Q()
            if (r1 == 0) goto L_0x01a7
            X.4DU r0 = r9.A0A
            r2.setUrl(r1, r0)
        L_0x005d:
            android.view.ViewGroup r2 = r5.A01()
            android.content.Context r3 = r9.A00
            boolean r1 = r9.A0D
            r0 = 2131239899(0x7f0823db, float:1.8096118E38)
            if (r1 == 0) goto L_0x006d
            r0 = 2131239558(0x7f082286, float:1.8095426E38)
        L_0x006d:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.setBackground(r0)
            android.view.ViewGroup r0 = r5.A01()
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x009a
            android.view.ViewGroup r7 = r5.A01()
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            if (r2 == 0) goto L_0x019f
            X.2dQ r2 = (X.C71492dQ) r2
            boolean r1 = r9.A06
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0095
            r0 = 1062836634(0x3f59999a, float:0.85)
        L_0x0095:
            r2.A09 = r0
            r7.setLayoutParams(r2)
        L_0x009a:
            android.widget.TextView r1 = r5.A06
            if (r1 == 0) goto L_0x00d1
            android.view.ViewGroup r2 = r5.A03
            if (r2 == 0) goto L_0x00d1
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x00d1
            X.0eM r0 = r5.A0J
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            A04(r3, r0, r1)
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r1.setText(r0)
            android.view.ViewGroup r1 = r5.A01()
            r0 = 2131239821(0x7f08238d, float:1.809596E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r1.setBackground(r0)
            r0 = 2131239898(0x7f0823da, float:1.8096116E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.setBackground(r0)
        L_0x00d1:
            if (r6 == 0) goto L_0x0183
            X.3oV r0 = r5.A0D
            if (r0 == 0) goto L_0x011b
            android.view.View r8 = r0.getView()
            android.widget.TextView r8 = (android.widget.TextView) r8
        L_0x00dd:
            if (r8 == 0) goto L_0x011b
            r7 = 2131165216(0x7f070020, float:1.7944643E38)
            if (r4 == 0) goto L_0x00e7
            r7 = 2131165249(0x7f070041, float:1.794471E38)
        L_0x00e7:
            if (r6 == 0) goto L_0x0179
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
        L_0x00ec:
            int r2 = X.2Yu.A0H(r3, r0)
            android.graphics.drawable.Drawable r0 = r9.A00()
            if (r0 == 0) goto L_0x00fb
            if (r6 == 0) goto L_0x00fb
            A04(r3, r0, r8)
        L_0x00fb:
            boolean r1 = r9.A06
            r0 = 2131975025(0x7f135b71, float:1.958713E38)
            if (r1 == 0) goto L_0x0105
            r0 = 2131975016(0x7f135b68, float:1.9587112E38)
        L_0x0105:
            r8.setText(r0)
            r1 = 0
            android.content.res.Resources r0 = r3.getResources()
            float r0 = r0.getDimension(r7)
            r8.setTextSize(r1, r0)
            int r0 = r3.getColor(r2)
            r8.setTextColor(r0)
        L_0x011b:
            android.widget.TextView r6 = r5.A07
            if (r6 == 0) goto L_0x0178
            r5 = 2131165216(0x7f070020, float:1.7944643E38)
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            if (r4 == 0) goto L_0x012d
            r5 = 2131165249(0x7f070041, float:1.794471E38)
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
        L_0x012d:
            int r1 = X.2Yu.A0H(r3, r0)
            r0 = 2131974634(0x7f1359ea, float:1.9586338E38)
            r6.setText(r0)
            r2 = 0
            android.content.res.Resources r0 = r3.getResources()
            float r0 = r0.getDimension(r5)
            r6.setTextSize(r2, r0)
            int r0 = r3.getColor(r1)
            r6.setTextColor(r0)
            com.instagram.common.session.UserSession r0 = r9.A01
            X.4lm r1 = X.C272994ll.A00(r0)
            X.4K4 r0 = r9.A04
            java.lang.String r3 = r0.A01
            X.0qQ.A0B(r3, r2)
            X.0wc r2 = r1.A00
            java.lang.String r1 = "ig_fan_club_reels_end_card_cta_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.String r1 = "feed"
            java.lang.String r0 = "container_module"
            r2.AAJ(r0, r1)
            long r0 = java.lang.Long.parseLong(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "creator_igid"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x0178:
            return
        L_0x0179:
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            if (r4 == 0) goto L_0x00ec
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            goto L_0x00ec
        L_0x0183:
            android.widget.TextView r8 = r5.A08
            goto L_0x00dd
        L_0x0187:
            if (r3 == 0) goto L_0x002f
            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            goto L_0x0020
        L_0x018e:
            r3 = r2
            goto L_0x0011
        L_0x0191:
            android.widget.TextView r3 = r5.A05
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = "feedPreviewOverlayTextView"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x019f:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x01a7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4K6.A03():void");
    }

    private final boolean A06() {
        if (!this.A0E && this.A04.A02) {
            if (!182.A06(0Tu.A05, this.A01, 36325407460438975L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void ABH() {
        View view;
        this.A05.A0f(true);
        C258273yk r1 = this.A03;
        View view2 = r1.A0E.getView();
        View A012 = A01();
        View A002 = r1.A00();
        if (this.A09) {
            TextView textView = r1.A08;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = r1.A05;
            if (textView2 != null) {
                textView2.setVisibility(8);
                C252063oV r0 = r1.A0D;
                if (r0 != null) {
                    view = r0.getView();
                } else {
                    view = null;
                }
            } else {
                0qQ.A0F("feedPreviewOverlayTextView");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            C252063oV r02 = r1.A0D;
            if (r02 != null) {
                r02.setVisibility(8);
            }
            C252063oV r03 = r1.A0C;
            if (r03 != null) {
                r03.setVisibility(8);
            }
            view = r1.A08;
        }
        TextView textView3 = r1.A07;
        ViewGroup viewGroup = r1.A03;
        ViewGroup viewGroup2 = r1.A01;
        view2.setVisibility(0);
        A012.setVisibility(0);
        A05(A012);
        if (view != null) {
            if (!this.A0C || this.A0B) {
                view.setVisibility(8);
            } else {
                A05(view);
            }
        }
        if (textView3 != null) {
            if (this.A0B) {
                A05(textView3);
            } else {
                textView3.setVisibility(8);
            }
        }
        if (viewGroup != null) {
            if (A06()) {
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                A05(viewGroup);
                A002.setAlpha(0.0f);
                A002.animate().alpha(1.0f).setDuration(400);
                A03();
                A02();
            }
            viewGroup.setVisibility(8);
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        A002.setAlpha(0.0f);
        A002.animate().alpha(1.0f).setDuration(400);
        A03();
        A02();
    }

    public final void Eua() {
        this.A05.A0f(true);
        this.A03.A0E.setVisibility(0);
        A01().setVisibility(0);
        A03();
        A02();
    }

    public final void hide() {
        C258273yk r1 = this.A03;
        r1.A02(this.A05);
        r1.A0E.setVisibility(8);
    }

    private final void A02() {
        View view;
        C252063oV r0;
        ViewGroup viewGroup;
        boolean A062 = A06();
        C258273yk r1 = this.A03;
        ViewGroup A012 = r1.A01();
        Y1w y1w = new Y1w(this);
        boolean z = this.A0D;
        A012.setOnTouchListener(new C378039Og(A012, y1w, z, A062, true));
        ViewGroup viewGroup2 = r1.A04;
        if (viewGroup2 != null) {
            AnonymousClass3NG r2 = new AnonymousClass3NG(viewGroup2);
            r2.A02 = 0.95f;
            r2.A04 = new XPR(this);
            r1.A09 = r2.A00();
        }
        if (A062 && (viewGroup = r1.A03) != null) {
            viewGroup.setOnTouchListener(new C378039Og(viewGroup, new C22391Y1x(this), z, true, false));
        }
        View.OnClickListener xuV = new C22046XuV(this);
        View.OnClickListener xuU = new C22045XuU(this);
        View.OnClickListener xuT = new C22044XuT(this);
        if (this.A06) {
            xuU = xuT;
        } else {
            if (this.A08 || this.A09) {
                xuV = xuT;
            }
            if (this.A07) {
                xuU = xuT;
            }
            xuT = xuV;
        }
        if (!this.A09 ? (view = r1.A08) != null : !((r0 = r1.A0D) == null || (view = r0.getView()) == null)) {
            AnonymousClass0fU.A00(xuT, view);
        }
        AnonymousClass0fU.A00(xuU, r1.A00());
        TextView textView = r1.A07;
        if (textView != null) {
            AnonymousClass0fU.A00(new C22043XuS(this), textView);
        }
    }

    public static final void A04(Context context, Drawable drawable, TextView textView) {
        if (0mk.A02(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
