package X;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: X.TNl  reason: case insensitive filesystem */
public final /* synthetic */ class C13153TNl implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ STX A02;
    public final /* synthetic */ C10767Rxl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C13153TNl(Bundle bundle, STX stx, C10767Rxl rxl, String str, String str2, int i) {
        this.A02 = stx;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = rxl;
        this.A01 = bundle;
    }

    public final Object call() {
        STX stx = this.A02;
        int i = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        return stx.A0K.FPu(this.A01, stx.A01.getPackageName(), str, str2, (String) null, i);
    }
}
