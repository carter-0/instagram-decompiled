package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.Fyg  reason: case insensitive filesystem */
public final class C51680Fyg extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51680Fyg(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<Boolean> cls = Boolean.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable("argument_is_unship", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "argument_is_unship");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "argument_is_unship");
        } else {
            throw DbY.A0Y("argument_is_unship");
        }
        if (A0Z instanceof Boolean) {
            return A0Z;
        }
        return null;
    }
}
