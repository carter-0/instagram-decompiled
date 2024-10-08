package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.io.Closeables;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.R9h  reason: case insensitive filesystem */
public final class C8780R9h extends 2Cl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C58960Br A01;
    public final /* synthetic */ 1x2 A02;

    public final int getRunnableId() {
        return 502;
    }

    public C8780R9h(Context context, C58960Br r2, 1x2 r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Pair pair;
        String str;
        InputStream inputStream;
        C10706Rwk rwk = new C10706Rwk(this.A01);
        1x2 r5 = this.A02;
        r5.A00 = rwk;
        synchronized (rwk) {
            1JG r7 = rwk.A02;
            C227082ic AX8 = r7.AX8("previous_session");
            if (AX8.A00 != null) {
                DataInputStream dataInputStream = new DataInputStream((InputStream) AX8.A00());
                0Zt A05 = ((C59560Zm) rwk.A00.A03).A03();
                try {
                    0Rg r12 = rwk.A01;
                    if (dataInputStream.readShort() == 251 && dataInputStream.readShort() == 2 && dataInputStream.readLong() == r12.A00() && r12.A02(A05, dataInputStream)) {
                        pair = Pxe.A0K(Boolean.valueOf(dataInputStream.readBoolean()), A05);
                        Closeables.A01(dataInputStream);
                        Closeables.A01((InputStream) AX8.A00());
                    } else {
                        Closeables.A01(dataInputStream);
                        inputStream = (InputStream) AX8.A00();
                        Closeables.A01(inputStream);
                    }
                } catch (IOException e) {
                    0wb.A07("BatteryMetricsPersistentCache", e);
                    Closeables.A01(dataInputStream);
                    inputStream = (InputStream) AX8.A00();
                } catch (Throwable th) {
                    Closeables.A01(dataInputStream);
                    Closeables.A01((InputStream) AX8.A00());
                    throw th;
                }
            }
            if (r7.CJV("previous_session")) {
                r7.ED4("previous_session");
            }
            pair = null;
        }
        if (pair != null) {
            if (AnonymousClass7TE.A1a(pair.first)) {
                str = AppStateModule.APP_STATE_BACKGROUND;
            } else {
                str = "foreground";
            }
            0CA A002 = r5.A02.A00((0Bs) pair.second, str);
            if (A002 != null) {
                A002.A7h("source", "disk");
                A002.ChA();
            }
        }
        1ES.A04(rwk.A03, 501, 4, 600000, false, true);
        return null;
    }
}
