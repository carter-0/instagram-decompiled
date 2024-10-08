package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.A2o  reason: case insensitive filesystem */
public abstract class C39624A2o {
    public static Handler A00;
    public static ASS A01;
    public static C39730A6v A02;
    public static C392399uk A03;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.QcV, android.view.View] */
    public static void A00() {
        Looper mainLooper;
        C39730A6v a6v = A02;
        if (a6v != null) {
            QLA qla = a6v.A02;
            Context context = ((SystemWebView) qla).A04.getContext();
            if (context == null || (mainLooper = context.getMainLooper()) == null) {
                qla.A08();
            } else {
                new Handler(mainLooper).post(new Ai6(qla));
            }
        }
        A02 = null;
    }
}
