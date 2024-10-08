package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import java.lang.ref.Reference;

public final class ID7 implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public ID7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources;
        Configuration configuration;
        int i9;
        0sP r0;
        switch (this.A00) {
            case 0:
                C52876GeB geB = (C52876GeB) this.A01;
                View view2 = geB.A01;
                if (view2 != null && (resources = view2.getResources()) != null && (configuration = resources.getConfiguration()) != null && (i9 = configuration.orientation) != geB.A00) {
                    geB.A00 = i9;
                    C62320sa r02 = geB.A03;
                    if (r02 != null) {
                        r02.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C56726I9m i9m = (C56726I9m) this.A01;
                i9m.A01.removeOnLayoutChangeListener(this);
                C56726I9m.A00(i9m);
                return;
            case 2:
                IOA.A01((IOA) this.A01);
                return;
            case 3:
                int i10 = i3 - i;
                if (i7 - i5 != i10 && (r0 = (0sP) ((Reference) this.A01).get()) != null) {
                    C51967G9n.A0w(i10, r0);
                    return;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((C54566HJb) this.A01).A00();
                return;
        }
    }
}
