package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5iV  reason: invalid class name and case insensitive filesystem */
public final class C292165iV extends CharacterStyle implements UpdateAppearance {
    public final C284945Oz A00;
    public final C298605tj A01;
    public final float A02;
    public final C270284gU A03 = new AnonymousClass5TX((C284895Os) null, new AnonymousClass9L8(this, 40));

    public final void updateDrawState(TextPaint textPaint) {
        C16756V4p.A00(textPaint, this.A02);
        textPaint.setShader((Shader) this.A03.getValue());
    }

    public C292165iV(C298605tj r5, float f) {
        this.A01 = r5;
        this.A02 = f;
        C288025bF r3 = new C288025bF(9205357640488583168L);
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A00 = new ParcelableSnapshotMutableState(r1, r3);
    }
}
