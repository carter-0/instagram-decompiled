package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;
import java.util.List;

/* renamed from: X.934  reason: invalid class name */
public final class AnonymousClass934 implements 2IR {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C371478yM A01;
    public final /* synthetic */ AnonymousClass8yT A02;
    public final /* synthetic */ C314366i5 A03;
    public final /* synthetic */ XplatModelPaths A04;
    public final /* synthetic */ C352728Ep A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        C371548ya.A00(this.A00, new C41192Apq(this.A01, this.A03, this.A05, th));
    }

    public AnonymousClass934(Handler handler, C371478yM r2, AnonymousClass8yT r3, C314366i5 r4, XplatModelPaths xplatModelPaths, C352728Ep r6, File file, List list, List list2) {
        this.A02 = r3;
        this.A06 = file;
        this.A04 = xplatModelPaths;
        this.A08 = list;
        this.A07 = list2;
        this.A05 = r6;
        this.A00 = handler;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass8yT r0 = this.A02;
        File file = this.A06;
        XplatModelPaths xplatModelPaths = this.A04;
        0sn r4 = this.A08;
        if (r4 == null) {
            r4 = 0sn.A00;
        }
        0sn r5 = this.A07;
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        r0.A00(xplatModelPaths, this.A05, file, r4, r5);
    }
}
