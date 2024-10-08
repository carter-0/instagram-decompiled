package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ugm  reason: case insensitive filesystem */
public final class C15681Ugm extends C252233om {
    public final int A00;
    public final Object A01;

    public C15681Ugm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ((Fragment) this.A01).onActivityResult(i, i2, intent);
    }
}
