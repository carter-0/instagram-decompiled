package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.Fya  reason: case insensitive filesystem */
public final class C51674Fya extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51674Fya(Fragment fragment) {
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
                A0Z = requireArguments.getSerializable("should_pin_to_profile", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "should_pin_to_profile");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "should_pin_to_profile");
        } else {
            throw DbY.A0Y("should_pin_to_profile");
        }
        if (A0Z instanceof Boolean) {
            return A0Z;
        }
        return null;
    }
}
