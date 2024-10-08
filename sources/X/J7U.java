package X;

import androidx.compose.ui.Modifier;

public final class J7U extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ JNV A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ AnonymousClass5RG A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7U(JNV jnv, Modifier modifier, AnonymousClass5RG r4, long j, boolean z) {
        super(2);
        this.A03 = r4;
        this.A00 = j;
        this.A04 = z;
        this.A02 = modifier;
        this.A01 = jnv;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r9 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-873381943, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            C286705Xl A022 = AnonymousClass5YA.A0D.A02(this.A03);
            long j = this.A00;
            boolean z = this.A04;
            C51971G9r.A11(r9, A022, new J75(this.A01, this.A02, j, z), -1426434671);
            if (0fL.A02()) {
                0fL.A00(-1157394781);
            }
        } else {
            r9.Evl();
        }
        return C60340gF.A00;
    }
}
