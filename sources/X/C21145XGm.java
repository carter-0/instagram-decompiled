package X;

import android.media.MediaCodec;
import java.nio.ByteOrder;
import java.util.ArrayDeque;

/* renamed from: X.XGm  reason: case insensitive filesystem */
public abstract class C21145XGm extends C22078Xv4 {
    public float A00;
    public float A01;
    public C21459XbP A02;
    public C21965Xmv A03;
    public final float A04;
    public final MediaCodec.BufferInfo A05;
    public final C7455QDu A06 = new C7455QDu(0);
    public final C7455QDu A07 = new C7455QDu(2);
    public final C21955Xmk A08;
    public final C21141XGi A09;
    public final Y88 A0A;
    public final YBA A0B;
    public final ArrayDeque A0C;
    public final C7455QDu A0D = new C7455QDu(0);

    public void A01() {
        this.A09.A00();
        this.A07.A00();
        this.A08.A00 = YBY.A00;
        A02();
        this.A00 = -1.0f;
    }

    public void A02() {
        this.A06.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.QDu, X.XGi] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.XbP] */
    public C21145XGm(Y88 y88, YBA yba, float f, int i) {
        super(i);
        this.A0A = y88;
        yba.getClass();
        this.A0B = yba;
        this.A04 = f;
        ? qDu = new C7455QDu(2);
        this.A09 = qDu;
        this.A05 = new MediaCodec.BufferInfo();
        this.A01 = 1.0f;
        this.A0C = new ArrayDeque();
        this.A03 = C21965Xmv.A02;
        qDu.A01(0);
        qDu.A01.order(ByteOrder.nativeOrder());
        this.A08 = new C21955Xmk();
        this.A00 = -1.0f;
        this.A02 = new Object();
    }
}
