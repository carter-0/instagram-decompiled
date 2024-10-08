package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.JaM  reason: case insensitive filesystem */
public abstract class C59846JaM {
    public static final String A00(Resources resources, C61083JwL jwL) {
        ArrayList arrayList;
        String string;
        0qQ.A0B(jwL, 0);
        Iterable iterable = (Iterable) jwL.A01;
        if (iterable != null) {
            List<C66459MSn> A0X = 00k.A0X(iterable);
            arrayList = new ArrayList(0Yv.A1E(A0X, 10));
            for (C66459MSn C4l : A0X) {
                arrayList.add(A00(resources, C4l.C4l()));
            }
        } else {
            arrayList = 0sn.A00;
        }
        MR0 mr0 = (MR0) jwL.A00;
        if (mr0 instanceof C61238JzW) {
            String str = ((C61238JzW) mr0).A00;
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            Object[] copyOf = Arrays.copyOf(charSequenceArr, charSequenceArr.length);
            string = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        } else if (mr0 instanceof C61237JzV) {
            int i = ((C61237JzV) mr0).A00;
            CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            string = resources.getString(i, Arrays.copyOf(charSequenceArr2, charSequenceArr2.length));
        } else {
            throw new RuntimeException();
        }
        0qQ.A07(string);
        return string;
    }

    public static final String A01(C286575Wy r2, C61083JwL jwL) {
        0qQ.A0B(jwL, 0);
        if (0fL.A02()) {
            0fL.A01(1080350398, "com.instagram.settings2.core.view.fbtWrapper (Fbt.kt:25)");
        }
        Resources resources = ((Context) r2.AJO(AndroidCompositionLocals_androidKt.A01)).getResources();
        0qQ.A07(resources);
        String A00 = A00(resources, jwL);
        if (0fL.A02()) {
            0fL.A00(1582267144);
        }
        return A00;
    }

    public static final String A02(Fragment fragment, C61083JwL jwL) {
        AnonymousClass7TG.A1N(fragment, jwL);
        return A00(JTR.A0R(fragment), jwL);
    }
}
