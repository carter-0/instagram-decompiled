package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.FyM  reason: case insensitive filesystem */
public final class C51660FyM extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51660FyM(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<String> cls = String.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            String A002 = C49902FCf.A00();
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable(A002, Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, A002);
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, C49902FCf.A00());
        } else {
            throw DbY.A0Y(C49902FCf.A00());
        }
        if (A0Z instanceof String) {
            return A0Z;
        }
        return null;
    }
}
