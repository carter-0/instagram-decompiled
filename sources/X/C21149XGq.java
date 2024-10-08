package X;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.util.Util;
import java.util.List;

/* renamed from: X.XGq  reason: case insensitive filesystem */
public final class C21149XGq extends C21145XGm implements Y8I {
    public static final int[] A0B = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public int A00 = -1000;
    public int A01 = 0;
    public Surface A02;
    public C21974XoJ A03 = C21974XoJ.A01;
    public C21981Xoa A04 = C21981Xoa.A02;
    public Y8H A05;
    public List A06;
    public final Context A07;
    public final C21433Xaj A08;
    public final C21375XZi A09;
    public final boolean A0A = "NVIDIA".equals(Util.A04);

    public C21149XGq(Context context, Handler handler, Y88 y88, YBA yba, Y8J y8j) {
        super(y88, yba, 30.0f, 2);
        Context applicationContext = context.getApplicationContext();
        this.A07 = applicationContext;
        this.A09 = new C21375XZi(handler, y8j);
        this.A08 = new C21433Xaj(applicationContext, this);
    }

    public final void A01() {
        super.A01();
    }

    public final void A02() {
        super.A02();
    }
}
