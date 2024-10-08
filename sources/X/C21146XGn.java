package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import androidx.media3.common.Timeline;

/* renamed from: X.XGn  reason: case insensitive filesystem */
public final class C21146XGn extends C22078Xv4 implements Handler.Callback {
    public final Handler A00;
    public final YBB A01;
    public final Y89 A02;
    public final C21140XGh A03;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QDu, X.XGh] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21146XGn(Looper looper, Y89 y89) {
        super(5);
        Handler handler;
        YBB ybb = YBB.A00;
        this.A02 = y89;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A00 = handler;
        ybb.getClass();
        this.A01 = ybb;
        this.A03 = new C7455QDu(1);
    }

    private void A00(Metadata metadata) {
        C22042XuR xuR = (C22042XuR) this.A02;
        C22056Xui xui = xuR.A00;
        C22056Xui xui2 = C22056Xui.$redex_init_class;
        Xo1 xo1 = new Xo1(xui.A06);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].E36(xo1);
            i++;
        }
        xui.A06 = new C21979XoR(xo1);
        Timeline A04 = C21055XCg.A04(xui);
        if (AnonymousClass7TF.A1Q(A04.A02())) {
            C21979XoR xoR = xui.A06;
            if (!xoR.equals(xui.A05)) {
                xui.A05 = xoR;
                C22007Xqi.A01(xui.A0T, xuR, 13, 14);
            }
            C22007Xqi xqi = xui.A0T;
            C22007Xqi.A01(xqi, metadata, 14, 28);
            xqi.A02();
            return;
        }
        A04.A0A(xui.A0R, xui.AuC());
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00((Metadata) message.obj);
            return true;
        }
        throw Pxe.A0i();
    }
}
