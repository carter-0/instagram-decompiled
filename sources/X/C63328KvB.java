package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KvB  reason: case insensitive filesystem */
public abstract class C63328KvB {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.pendingmedia.model.BrandedContentTag, java.lang.Object] */
    public static final List A00(C270194gL r6) {
        ArrayList A0q = AnonymousClass7TF.A0q(r6, 0);
        List<AnonymousClass535> list = r6.A0l;
        if (list != null) {
            for (AnonymousClass535 r3 : list) {
                0qQ.A0A(r3);
                0qQ.A0B(r3, 1);
                ? obj = new Object();
                String str = "";
                obj.A02 = str;
                obj.A01 = r3.A03;
                String str2 = r3.A04;
                if (str2 != null) {
                    str = str2;
                }
                obj.A02 = str;
                boolean z = false;
                obj.A04 = AnonymousClass7TG.A1X(r3.A02);
                obj.A00 = r3.A00;
                Boolean bool = r3.A01;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                obj.A03 = z;
                A0q.add(obj);
            }
        }
        return C51966G9m.A1J(A0q);
    }
}
