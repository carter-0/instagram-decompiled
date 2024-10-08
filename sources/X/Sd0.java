package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class Sd0 implements 1MD {
    public final int A00;
    public final Object A01;

    public Sd0(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C7799QXk A0E;
        QVG qvg;
        QXH A0H;
        QXG A0G;
        QXW A0E2;
        C7719QUi A0E3;
        C7790QXb A0E4;
        QVE A0E5;
        QXN A0E6;
        QSH A0E7;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                ParcelableResult parcelableResult = (ParcelableResult) S83.A00(ParcelableResult.CREATOR, (byte[]) obj2);
                AnonymousClass389.A00();
                SHS shs = ((RemoteListenableWorker) this.A01).A02;
                synchronized (shs.A02) {
                    C11441SVc sVc = shs.A00;
                    if (sVc != null) {
                        shs.A01.unbindService(sVc);
                        shs.A00 = null;
                    }
                }
                return parcelableResult.A00;
            case 1:
                return this.A01;
            case 3:
                QXI qxi = (QXI) obj2;
                if (qxi == null || (A0E = qxi.A0E()) == null) {
                    return null;
                }
                QXF A0F = A0E.A0F();
                if ((A0F == null || (A0E6 = A0F.A0E()) == null || (A0E7 = A0E6.A0E()) == null || (qvg = Pxj.A0S(A0E7)) == null) && (((A0H = A0E.A0H()) == null || (A0E4 = A0H.A0E()) == null || (A0E5 = A0E4.A0E()) == null || (qvg = Pxj.A0S(A0E5)) == null) && ((A0G = A0E.A0G()) == null || (A0E2 = A0G.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (qvg = Pxj.A0S(A0E3)) == null))) {
                    return null;
                }
                return SPz.A03(qvg);
            case 4:
                return SNY.A01((QXI) obj2);
            case 5:
                return Stc.A02((QXI) obj2);
            case 6:
                return C9627Re7.A00((S4g) obj2);
            case 7:
                return ((C10696Rwa) this.A01).A03.A00((S4g) obj2);
            case 8:
                return C8294Qna.A00((S4g) obj2, ((C10445RsM) this.A01).A01.A00, new PandoGraphQLRequest(C41845B3m.A05(), "ShowConnectFBPayQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43353Bwr.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "transaction_hub_metadata", AnonymousClass7TE.A1C()), DGU.A00);
            case 9:
                return AnonymousClass7TE.A0v();
            case 10:
                return Boolean.valueOf(((C11330SNj) obj2).A08.containsKey("BIO"));
            case 11:
                Bitmap bitmap = (Bitmap) obj2;
                if (bitmap == null) {
                    return bitmap;
                }
                Canvas A0B = JTO.A0B(bitmap);
                Bitmap bitmap2 = ((C64993LlW) this.A01).A00;
                if (bitmap2 == null) {
                    return bitmap;
                }
                A0B.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                return bitmap;
            default:
                return ((0sP) this.A01).invoke(obj2);
        }
    }

    public Sd0(SSZ ssz, int i) {
        this.A00 = i;
        this.A01 = ssz;
    }

    public Sd0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
