package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.newsfeed.model.PillsFilterCategory;
import java.io.Serializable;

/* renamed from: X.DgD  reason: case insensitive filesystem */
public final class C46510DgD extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46510DgD(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Object A0Z;
        Class<PillsFilterCategory> cls = PillsFilterCategory.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable("newsfeed_filter", Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, "newsfeed_filter");
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, "newsfeed_filter");
        } else {
            throw DbY.A0Y("newsfeed_filter");
        }
        if (A0Z instanceof PillsFilterCategory) {
            return A0Z;
        }
        return null;
    }
}
