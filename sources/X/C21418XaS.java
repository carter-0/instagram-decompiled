package X;

import android.content.Context;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.XaS  reason: case insensitive filesystem */
public final class C21418XaS {
    public final XTs A00;
    public final ADE A01;
    public final Map A02;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.XTs] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.Y7x] */
    public C21418XaS(Context context) {
        ? obj = new Object();
        Context context2 = context;
        C21060XCm xCm = new C21060XCm(context2, 1);
        T07 t07 = new T07(context2, 0);
        C21060XCm xCm2 = new C21060XCm(context2, 0);
        C22308XzI xzI = new C22308XzI(0);
        C21060XCm xCm3 = new C21060XCm(context2, 2);
        DGZ dgz = new DGZ(0);
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        C22056Xui xui = new C22056Xui(context2, myLooper, SIH.A01, YB5.A00, new Object(), C21976XoN.A02, dgz, xCm3, xzI, t07, xCm, xCm2);
        obj.A00 = xui;
        xui.A0T.A04(new C22055Xuh(obj));
        this.A00 = obj;
        this.A02 = AnonymousClass7TE.A1H();
        ADE ade = ADE.A08;
        if (ade == null) {
            Context applicationContext = context2.getApplicationContext();
            0qQ.A07(applicationContext);
            ade = new ADE(applicationContext);
            ADE.A08 = ade;
        }
        this.A01 = ade;
        obj.A01 = this;
    }
}
