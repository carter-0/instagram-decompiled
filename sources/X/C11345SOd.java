package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.SOd  reason: case insensitive filesystem */
public abstract class C11345SOd {
    public final C10783Ry4 A00;

    public static void A01(View view, float f, int i) {
        String A002 = AnonymousClass000.A00(6);
        if (i == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, A002);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = f;
            layoutParams2.width = 0;
        } else if (i == 2) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            0qQ.A0C(layoutParams3, A002);
            layoutParams3.height = -1;
        }
    }

    public final void A03(C249703kE r9) {
        Drawable drawable;
        Drawable newDrawable;
        0qQ.A0B(r9, 0);
        C10783Ry4 ry4 = this.A00;
        SO0 so0 = ry4.A02;
        if (so0 != null) {
            r9.itemView.setFocusable(true);
            View view = r9.itemView;
            0qQ.A06(view);
            so0.A02(view);
        }
        int i = ry4.A00;
        if (i != 0) {
            r9.itemView.setId(i);
        }
        if (this instanceof C8093Qgl) {
            if (r9 instanceof C8107Qgz) {
                ProgressBar progressBar = ((C8107Qgz) r9).A00;
                Drawable.ConstantState constantState = progressBar.getIndeterminateDrawable().getConstantState();
                if (constantState == null || (newDrawable = constantState.newDrawable()) == null) {
                    drawable = null;
                } else {
                    drawable = newDrawable.mutate();
                    if (drawable != null) {
                        drawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A05, C11426STk.A03().A00(AnonymousClass7TE.A0S(progressBar), 20)));
                    }
                }
                progressBar.setIndeterminateDrawable(drawable);
            } else {
                throw Pxk.A0K(this);
            }
        } else if (this instanceof C8098Qgq) {
            C8098Qgq qgq = (C8098Qgq) this;
            if (r9 instanceof C8110Qh2) {
                C8092Qgk qgk = qgq.A00;
                C13889TjC tjC = qgk.A01;
                if (tjC != null) {
                    View view2 = r9.itemView;
                    0qQ.A06(view2);
                    tjC.EOw(view2);
                }
                SIE sie = qgk.A04;
                if (sie != null) {
                    sie.A03(((C8110Qh2) r9).A00);
                }
                SIE sie2 = qgk.A05;
                if (sie2 != null) {
                    sie2.A03(((C8110Qh2) r9).A01);
                }
                SIE sie3 = qgk.A06;
                if (sie3 != null) {
                    sie3.A03(((C8110Qh2) r9).A02);
                }
                View.OnClickListener onClickListener = qgk.A03;
                if (onClickListener != null) {
                    AnonymousClass0fU.A00(onClickListener, r9.itemView);
                }
                C8110Qh2 qh2 = (C8110Qh2) r9;
                A01(qh2.A03, qgk.A00, qgk.A01);
                A01(qh2.A04, 1.0f, qgk.A02);
            } else {
                throw Pxk.A0K(qgq);
            }
        } else if (this instanceof C8094Qgm) {
            if (r9 instanceof C8106Qgy) {
                C8106Qgy qgy = (C8106Qgy) r9;
                Pxf.A1B(qgy.A00, C11426STk.A03().A00(AnonymousClass7TE.A0S(qgy.itemView), 14));
            } else {
                throw Pxk.A0K(this);
            }
        } else if (this instanceof C8096Qgo) {
            C8096Qgo qgo = (C8096Qgo) this;
            if (r9 instanceof C8108Qh0) {
                C8108Qh0 qh0 = (C8108Qh0) r9;
                ViewGroup viewGroup = qh0.A01;
                viewGroup.removeAllViews();
                List list = qh0.A02;
                list.clear();
                C8091Qgj qgj = qgo.A00;
                View view3 = r9.itemView;
                0qQ.A06(view3);
                C13889TjC tjC2 = qgj.A01;
                if (tjC2 != null) {
                    tjC2.EOw(view3);
                }
                for (C11345SOd sOd : qgj.A00) {
                    C7465QEu D75 = ((C13606TdY) qh0.A00.get(sOd.A00.A05)).D75(viewGroup);
                    list.add(D75);
                    viewGroup.addView(D75.itemView);
                    sOd.A03(D75);
                }
            } else {
                throw Pxk.A0K(qgo);
            }
        } else {
            C8095Qgn qgn = (C8095Qgn) this;
            if (r9 instanceof C8109Qh1) {
                View view4 = r9.itemView;
                0qQ.A06(view4);
                C8087Qgf qgf = qgn.A00;
                C13889TjC tjC3 = qgf.A00;
                if (tjC3 != null) {
                    tjC3.EOw(view4);
                }
                r9.itemView.setElevation(1.0f);
                SIE sie4 = qgf.A02;
                if (sie4 != null) {
                    sie4.A03(((C8109Qh1) r9).A01);
                }
                SIE sie5 = qgf.A01;
                if (sie5 != null) {
                    sie5.A03(((C8109Qh1) r9).A00);
                }
            } else {
                throw Pxk.A0K(qgn);
            }
        }
        ry4.A04.invoke();
    }

    public static void A02(C8092Qgk qgk, ImmutableList.Builder builder) {
        builder.add(new C8098Qgq(qgk));
    }

    public boolean A04(C11345SOd sOd) {
        C13889TjC tjC;
        C13889TjC tjC2;
        if (sOd != null) {
            C10783Ry4 ry4 = this.A00;
            int i = ry4.A00;
            C10783Ry4 ry42 = sOd.A00;
            if (i == ry42.A00 && ry4.A05 == ry42.A05 && 0qQ.A0K(ry4.A03, ry42.A03)) {
                if (ry4 instanceof C8087Qgf) {
                    tjC = ((C8087Qgf) ry4).A00;
                } else {
                    tjC = ry4.A01;
                }
                if (ry42 instanceof C8087Qgf) {
                    tjC2 = ((C8087Qgf) ry42).A00;
                } else {
                    tjC2 = ry42.A01;
                }
                if (!0qQ.A0K(tjC, tjC2) || !0qQ.A0K(ry4.A04, ry42.A04)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C11345SOd(C10783Ry4 ry4) {
        this.A00 = ry4;
    }
}
