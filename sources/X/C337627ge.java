package X;

import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.7ge  reason: invalid class name and case insensitive filesystem */
public final class C337627ge implements C338257hf {
    public final /* synthetic */ 2We A00;

    public C337627ge(2We r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C338557i9 D73(ViewGroup viewGroup, int i) {
        return new C337457gN(new LithoView(this.A00.A0R, (AttributeSet) null), true);
    }

    public final long getItemId(int i) {
        return (long) ((C295015nP) this.A00.A0i.get(i)).A0B;
    }

    public final boolean hasStableIds() {
        return this.A00.A0l;
    }

    public final /* bridge */ /* synthetic */ void DzF(C338557i9 r1) {
    }

    public final /* bridge */ /* synthetic */ void CyA(ComponentTree componentTree, C338557i9 r2, C338367hq r3, int i) {
    }
}
