package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.FyU  reason: case insensitive filesystem */
public final class C51668FyU extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51668FyU(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<Integer> cls = Integer.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable("CAROUSEL_CHILD_INDEX_ARGUMENT", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "CAROUSEL_CHILD_INDEX_ARGUMENT");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "CAROUSEL_CHILD_INDEX_ARGUMENT");
        } else {
            throw DbY.A0Y("CAROUSEL_CHILD_INDEX_ARGUMENT");
        }
        if (A0Z instanceof Integer) {
            return A0Z;
        }
        return null;
    }
}
