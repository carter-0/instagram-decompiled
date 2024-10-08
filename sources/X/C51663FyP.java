package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;
import java.io.Serializable;

/* renamed from: X.FyP  reason: case insensitive filesystem */
public final class C51663FyP extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51663FyP(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<ImageUrl> cls = ImageUrl.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable("PROFILE_PIC_URL_ARGUMENT", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "PROFILE_PIC_URL_ARGUMENT");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "PROFILE_PIC_URL_ARGUMENT");
        } else {
            throw DbY.A0Y("PROFILE_PIC_URL_ARGUMENT");
        }
        if (A0Z instanceof ImageUrl) {
            return A0Z;
        }
        return null;
    }
}
