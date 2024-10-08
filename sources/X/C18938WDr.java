package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.WDr  reason: case insensitive filesystem */
public final class C18938WDr implements AnonymousClass04L {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    public final void CvA(View view) {
        this.A01 = true;
    }

    public C18938WDr(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    public final void CvE(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A03 = null;
            C18938WDr.super.setVisibility(this.A00);
        }
    }

    public final void CvM(View view) {
        C18938WDr.super.setVisibility(0);
        this.A01 = false;
    }
}
