package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.5I2  reason: invalid class name */
public final class AnonymousClass5I2 extends 0Yg implements 0sP {
    public static final AnonymousClass5I2 A00 = new AnonymousClass5I2();

    public AnonymousClass5I2() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof AnonymousClass0g9) {
            return tag;
        }
        return null;
    }
}
