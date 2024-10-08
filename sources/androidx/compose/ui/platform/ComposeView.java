package androidx.compose.ui.platform;

import X.0qQ;
import X.0sL;
import X.AnonymousClass0eM;
import X.AnonymousClass54O;
import X.C284885Or;
import X.C284905Ot;
import X.C284945Oz;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ComposeView extends AnonymousClass54O {
    public boolean A00;
    public final C284945Oz A01;

    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(0sL r2) {
        this.A00 = true;
        this.A01.Epw(r2);
        if (isAttachedToWindow()) {
            A03();
        }
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A01 = new ParcelableSnapshotMutableState(r1, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
