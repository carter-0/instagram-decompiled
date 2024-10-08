package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LGc  reason: case insensitive filesystem */
public final class C63972LGc {
    public int A00 = -1;
    public final Context A01;
    public final Bitmap A02;
    public final C21416XaQ A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final boolean A05;
    public final UserSession A06;

    public final Bitmap A00() {
        float[] fArr;
        Bitmap bitmap = this.A02;
        C59721JVf jVf = (C59721JVf) 00k.A0O(this.A04, this.A00);
        if (jVf != null) {
            fArr = (float[]) jVf.A00;
        } else {
            fArr = null;
        }
        int i = C56445Hyd.A00;
        if (fArr == null || fArr.length != JTT.A03(bitmap)) {
            return null;
        }
        return C22014Xr7.A01(fArr, bitmap.getWidth(), bitmap.getHeight());
    }

    public final Bitmap A01() {
        float[] fArr;
        Bitmap bitmap = this.A02;
        C59721JVf jVf = (C59721JVf) 00k.A0O(this.A04, this.A00);
        if (jVf != null) {
            fArr = (float[]) jVf.A00;
        } else {
            fArr = null;
        }
        int i = C56445Hyd.A00;
        Bitmap bitmap2 = null;
        if (fArr != null && JTT.A03(bitmap) == fArr.length) {
            bitmap2 = C22014Xr7.A00.A02(bitmap, fArr);
            Canvas A0B = JTO.A0B(bitmap2);
            0sn<PointF> A022 = A02();
            if (A022 == null) {
                A022 = 0sn.A00;
            }
            for (PointF pointF : A022) {
                float f = pointF.x;
                float f2 = pointF.y;
                float dimension = this.A01.getResources().getDimension(R.dimen.abc_control_corner_material);
                Paint A0C = JTO.A0C();
                A0C.setColor(-1);
                AnonymousClass7TE.A1Q(A0C);
                A0C.setAlpha(128);
                A0B.drawCircle(f, f2, dimension, A0C);
            }
        }
        return bitmap2;
    }

    public final List A02() {
        int i;
        List list = this.A04;
        if (list.isEmpty() || (i = this.A00) < 0) {
            return 0sn.A00;
        }
        List<C59721JVf> subList = list.subList(0, i + 1);
        ArrayList A0r = AnonymousClass7TG.A0r(subList);
        for (C59721JVf jVf : subList) {
            A0r.add(jVf.A01);
        }
        return A0r;
    }

    public final List A03(Integer num, Integer num2) {
        if (num2 != null) {
            int intValue = num2.intValue();
            if (num != null) {
                int intValue2 = num.intValue();
                List<PointF> A0i = 00k.A0i(A02(), new 2HY(0, this.A00));
                ArrayList A0r = AnonymousClass7TG.A0r(A0i);
                for (PointF pointF : A0i) {
                    Integer num3 = AnonymousClass05K.A01;
                    float[] A1b = C51965G9l.A1b();
                    A1b[0] = pointF.x / ((float) intValue2);
                    A1b[1] = pointF.y / ((float) intValue);
                    A0r.add(new C63959LFj(num3, A1b));
                }
                return A0r;
            }
        }
        return 0sn.A00;
    }

    public final boolean A04() {
        List list = this.A04;
        if (!(!list.isEmpty()) || this.A00 >= DbT.A02(list, 1)) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (!(!this.A04.isEmpty()) || this.A00 < 0) {
            return false;
        }
        return true;
    }

    public C63972LGc(Context context, Bitmap bitmap, UserSession userSession, C21416XaQ xaQ, boolean z) {
        this.A01 = context;
        this.A06 = userSession;
        this.A03 = xaQ;
        this.A02 = bitmap;
        this.A05 = z;
    }
}
