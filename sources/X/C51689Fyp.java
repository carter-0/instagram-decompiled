package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.Fyp  reason: case insensitive filesystem */
public final class C51689Fyp extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51689Fyp(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<String> cls = String.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable("ARG_WELCOME_STORY_FILE_PATH", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "ARG_WELCOME_STORY_FILE_PATH");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "ARG_WELCOME_STORY_FILE_PATH");
        } else {
            throw DbY.A0Y("ARG_WELCOME_STORY_FILE_PATH");
        }
        if (A0Z instanceof String) {
            return A0Z;
        }
        return null;
    }
}
