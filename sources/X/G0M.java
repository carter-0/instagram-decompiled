package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.model.hashtag.Hashtag;
import java.io.Serializable;

public final class G0M extends 0Yg implements C62320sa {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G0M(Fragment fragment, String str) {
        super(0);
        this.A00 = fragment;
        this.A01 = str;
    }

    public final Object invoke() {
        Object A0Z;
        Class<Hashtag> cls = Hashtag.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            String str = this.A01;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0Z = requireArguments.getSerializable(str, Object.class);
            } else {
                A0Z = DbV.A0l(requireArguments, str);
            }
        } else if (DbS.A1b(cls)) {
            A0Z = DbY.A0Z(this.A00, this.A01);
        } else {
            throw DbY.A0Y(this.A01);
        }
        if (A0Z instanceof Hashtag) {
            return A0Z;
        }
        return null;
    }
}
