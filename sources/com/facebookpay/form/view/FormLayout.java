package com.facebookpay.form.view;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11647Sdp;
import X.C13602TdU;
import X.C62320sa;
import X.C9676Reu;
import X.DbW;
import X.QD8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class FormLayout extends TableLayout implements C13602TdU {
    public float A00;
    public QD8 A01;
    public C62320sa A02;
    public int A03;
    public final C11647Sdp A04;

    public final void AAg(View view, APMLinkCellParams aPMLinkCellParams) {
        int i = 0;
        0qQ.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
        float f = ((LinearLayout.LayoutParams) layoutParams).weight;
        Context A0S = AnonymousClass7TE.A0S(this);
        int A002 = (int) C9676Reu.A00(A0S, R.attr.fbpay_cell_horizontal_margin);
        float f2 = this.A00;
        boolean z = true;
        if (f2 != 0.0f && f2 + f <= 1.0f) {
            z = false;
        }
        if (z) {
            this.A00 = 0.0f;
            TableRow tableRow = new TableRow(A0S);
            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
            if (aPMLinkCellParams == null) {
                if (getChildCount() > 0) {
                    i = this.A03;
                }
                addView(tableRow, layoutParams2);
            }
            layoutParams2.topMargin = i;
            addView(tableRow, layoutParams2);
        } else {
            View childAt = getChildAt(getChildCount() - 1);
            0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.TableRow");
            ViewGroup viewGroup = (ViewGroup) childAt;
            DbW.A0A(viewGroup.getChildAt(viewGroup.getChildCount() - 1), "null cannot be cast to non-null type android.widget.TableRow.LayoutParams").rightMargin = A002;
            DbW.A0A(view, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams").leftMargin = A002;
        }
        this.A00 += f;
        View childAt2 = getChildAt(getChildCount() - 1);
        0qQ.A0C(childAt2, "null cannot be cast to non-null type android.widget.TableRow");
        ((ViewGroup) childAt2).addView(view);
    }

    public final void addView(View view) {
        0qQ.A0B(view, 0);
        AAg(view, (APMLinkCellParams) null);
    }

    public final void setOnRebuild(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormLayout(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, R.style.Ig4aFbPay), attributeSet);
        AnonymousClass2E0.A0E();
        this.A04 = C11647Sdp.A00(this, 2);
    }

    public void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1312790527);
        super.onAttachedToWindow();
        QD8 qd8 = this.A01;
        if (qd8 != null) {
            qd8.A04.A09(this.A04);
        }
        AnonymousClass0fD.A0D(-944951535, A06);
    }

    public void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(519839021);
        super.onDetachedFromWindow();
        QD8 qd8 = this.A01;
        if (qd8 != null) {
            qd8.A04.A08(this.A04);
        }
        AnonymousClass0fD.A0D(-1439790898, A06);
    }

    public final void setRowSpacing(int i) {
        this.A03 = getResources().getDimensionPixelOffset(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public FormLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
