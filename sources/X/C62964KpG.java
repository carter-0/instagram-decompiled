package X;

import com.facebook.pando.TreeJNI;
import java.util.List;

/* renamed from: X.KpG  reason: case insensitive filesystem */
public abstract class C62964KpG {
    public static final Object A00(AnonymousClass6Tm r8) {
        Object A01 = r8.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type com.facebook.pando.IPandoTree");
        TreeJNI treeJNI = (TreeJNI) A01;
        List list = r8.A00;
        int size = list.size() - 2;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Object field_UNTYPED = treeJNI.getField_UNTYPED((String) DbT.A0q(r8, "null cannot be cast to non-null type kotlin.String", i));
                0qQ.A0C(field_UNTYPED, "null cannot be cast to non-null type com.facebook.pando.IPandoTree");
                treeJNI = (TreeJNI) field_UNTYPED;
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        Object field_UNTYPED2 = treeJNI.getField_UNTYPED((String) DbT.A0q(r8, "null cannot be cast to non-null type kotlin.String", DbT.A02(list, 1)));
        if (field_UNTYPED2 != null) {
            return field_UNTYPED2;
        }
        throw AnonymousClass7TE.A0y();
    }
}
