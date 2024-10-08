package com.instagram.igds.components.emptystate;

import X.0qQ;
import X.C3255072w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsEmptyState extends FrameLayout implements C3255072w {
    public final C3255072w A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    public final void CLQ() {
        this.A00.CLQ();
    }

    public final void ENc(View.OnClickListener onClickListener, int i) {
        this.A00.ENc(onClickListener, i);
    }

    public final void EZe(int i, boolean z) {
        this.A00.EZe(i, z);
    }

    public void setAction(String str, View.OnClickListener onClickListener) {
        this.A00.setAction(str, onClickListener);
    }

    public void setBody(int i) {
        this.A00.setBody(i);
    }

    public void setDetailText(CharSequence charSequence) {
        this.A00.setDetailText(charSequence);
    }

    public void setHeadline(int i) {
        this.A00.setHeadline(i);
    }

    public void setImageResource(int i) {
        this.A00.setImageResource(i);
    }

    public void setIsEmphasized(boolean z) {
        this.A00.setIsEmphasized(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }

    public void setBody(CharSequence charSequence) {
        this.A00.setBody(charSequence);
    }

    public void setHeadline(CharSequence charSequence) {
        this.A00.setHeadline(charSequence);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.DkD} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.72w] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsEmptyState(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r4.<init>(r5, r6, r7, r8)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x002f
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320330812170574(0x810926002f214e, double:3.0324616836254356E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002f
            X.DkD r0 = new X.DkD
            r0.<init>(r5, r6, r7, r8)
        L_0x0027:
            r4.A00 = r0
            android.view.View r0 = (android.view.View) r0
            r4.addView(r0)
            return
        L_0x002f:
            X.72x r0 = new X.72x
            r0.<init>(r5, r6, r7, r8)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.emptystate.IgdsEmptyState.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsEmptyState(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }
}
