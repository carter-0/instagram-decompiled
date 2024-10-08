package X;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.8vl  reason: invalid class name and case insensitive filesystem */
public final class C370058vl {
    public int A00;
    public C366618pO A01;
    public C370078vn A02;
    public List A03;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.A6D, java.lang.Object] */
    public C370058vl(C366678pU r40) {
        0sn arrayList;
        C366608pN r5 = r40.A01.A04;
        Map map = r5.A05;
        if (map == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = new ArrayList();
            0sn r0 = r5.A04;
            for (B2K b2k : r0 == null ? 0sn.A00 : r0) {
                Drawable drawable = ((C378669Qs) b2k).A0B;
                C369458un r2 = (C369458un) map.get(drawable);
                r2 = r2 == null ? new C369458un(AnonymousClass0HM.A00().toString(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, false) : r2;
                C2802350v A002 = C63157KsQ.A00(drawable);
                if (A002 != null) {
                    AnonymousClass513 r1 = new AnonymousClass513(A002);
                    Object C3s = b2k.C3s();
                    C310416b1 r9 = (!(C3s instanceof C310416b1) || (r9 = (C310416b1) C3s) == null) ? new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false) : r9;
                    ? obj = new Object();
                    obj.A00 = r1;
                    obj.A02 = r2;
                    obj.A01 = r9;
                    arrayList.add(obj);
                }
            }
        }
        this.A03 = arrayList;
        SparseArray sparseArray = r5.A02;
        C370078vn r02 = new C370078vn();
        r02.A00 = sparseArray;
        this.A02 = r02;
        this.A01 = r5.A03;
        this.A00 = r5.A00;
    }

    public C370058vl() {
    }
}
