package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.ImmutableList;

/* renamed from: X.XGo  reason: case insensitive filesystem */
public final class C21147XGo extends C22078Xv4 implements Handler.Callback {
    public long A00;
    public long A01;
    public final Handler A02;
    public final C7455QDu A03;
    public final YBD A04;
    public final Y8B A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21147XGo(Looper looper, Y8B y8b) {
        super(3);
        Handler handler;
        YBD ybd = YBD.A00;
        this.A05 = y8b;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A02 = handler;
        this.A04 = ybd;
        this.A03 = new C7455QDu(1);
        this.A01 = -9223372036854775807L;
        this.A00 = -9223372036854775807L;
    }

    private void A00(C21957Xmm xmm) {
        Y8B y8b = this.A05;
        ImmutableList immutableList = xmm.A00;
        C22056Xui xui = ((C22042XuR) y8b).A00;
        C22056Xui xui2 = C22056Xui.$redex_init_class;
        C22007Xqi xqi = xui.A0T;
        xqi.A03(new C22066Xus((Object) immutableList, 12), 27);
        xqi.A02();
        xui.A09 = xmm;
        C22007Xqi.A01(xqi, xmm, 15, 27);
        xqi.A02();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00((C21957Xmm) message.obj);
            return true;
        }
        throw Pxe.A0i();
    }
}
