package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5bB  reason: invalid class name and case insensitive filesystem */
public final class C287985bB extends AnonymousClass2DO implements AnonymousClass2DP {
    public final Drawable A00;
    public final C284945Oz A01;
    public final C284945Oz A02;
    public final AnonymousClass0eM A03;

    public final boolean A02(AnonymousClass5Q8 r5) {
        0qQ.A0B(r5, 0);
        int i = 0;
        Drawable drawable = this.A00;
        int ordinal = r5.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    public final void A04(AnonymousClass5Q3 r8) {
        0qQ.A0B(r8, 0);
        AnonymousClass5QA r5 = ((AnonymousClass5QC) r8.Ayw()).A02.A02.A01;
        ((Number) this.A01.getValue()).intValue();
        Drawable drawable = this.A00;
        long Bwg = r8.Bwg();
        drawable.setBounds(0, 0, AnonymousClass1GB.A01(C288025bF.A02(Bwg)), AnonymousClass1GB.A01(C288025bF.A00(Bwg)));
        try {
            r5.EJt();
            drawable.draw(AnonymousClass5R4.A00(r5));
        } finally {
            r5.EIm();
        }
    }

    public final long A03() {
        return ((C288025bF) this.A02.getValue()).A00;
    }

    public final boolean A05(float f) {
        Drawable drawable = this.A00;
        int A012 = AnonymousClass1GB.A01(f * 255.0f);
        if (A012 < 0) {
            A012 = 0;
        } else if (A012 > 255) {
            A012 = 255;
        }
        drawable.setAlpha(A012);
        return true;
    }

    public final boolean A06(C288195bW r3) {
        ColorFilter colorFilter;
        Drawable drawable = this.A00;
        if (r3 != null) {
            colorFilter = r3.A00;
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    public final void DGg() {
        Drawable drawable = this.A00;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback((Drawable.Callback) null);
    }

    public final void DdA() {
        Drawable drawable = this.A00;
        drawable.setCallback((Drawable.Callback) this.A03.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public C287985bB(Drawable drawable) {
        long j;
        this.A00 = drawable;
        C284885Or r5 = C284885Or.A00;
        0qQ.A0C(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A01 = new ParcelableSnapshotMutableState(r5, 0);
        AnonymousClass0eM r02 = C287995bC.A00;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            j = 9205357640488583168L;
        } else {
            j = C288015bE.A00((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        C288025bF r1 = new C288025bF(j);
        0qQ.A0C(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = new ParcelableSnapshotMutableState(r5, r1);
        this.A03 = AnonymousClass0eN.A01(new C377129Kq(this, 47));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public final void Csx() {
        DGg();
    }
}
