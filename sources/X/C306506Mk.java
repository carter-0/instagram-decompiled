package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Mk  reason: invalid class name and case insensitive filesystem */
public final class C306506Mk {
    public List A00 = new ArrayList();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6Mo] */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6Mm] */
    public final void A00() {
        List list = this.A00;
        ? obj = new Object();
        ? obj2 = new Object();
        obj2.A01 = obj;
        list.add(obj2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6Mn] */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6Mm] */
    public final void A01(float f, float f2) {
        List list = this.A00;
        ? obj = new Object();
        obj.A00 = f;
        obj.A01 = f2;
        ? obj2 = new Object();
        obj2.A02 = obj;
        list.add(obj2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Ml, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6Mm] */
    public final void A02(float f, float f2) {
        List list = this.A00;
        ? obj = new Object();
        obj.A00 = f;
        obj.A01 = f2;
        ? obj2 = new Object();
        obj2.A03 = obj;
        list.add(obj2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Mq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.6Mm] */
    public final void A03(RectF rectF, Path.Direction direction) {
        List list = this.A00;
        ? obj = new Object();
        obj.A03 = rectF.left;
        obj.A05 = rectF.top;
        obj.A04 = rectF.right;
        obj.A02 = rectF.bottom;
        obj.A00 = 100.0f;
        obj.A01 = 100.0f;
        obj.A06 = direction;
        ? obj2 = new Object();
        obj2.A00 = obj;
        list.add(obj2);
    }
}
