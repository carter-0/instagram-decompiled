package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.Closeable;
import java.io.DataInputStream;
import java.util.Map;

/* renamed from: X.T8u  reason: case insensitive filesystem */
public final class C12825T8u implements Closeable {
    public boolean A00;
    public String[] A01;
    public final DataInputStream A02;
    public final Map A03;

    public static C21427Xac A00(C12825T8u t8u) {
        C21427Xac xac;
        C21427Xac xac2;
        DataInputStream dataInputStream = t8u.A02;
        byte readByte = dataInputStream.readByte();
        String str = null;
        switch (readByte) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                xac = null;
                str = t8u.A01[dataInputStream.readShort()];
                xac2 = null;
                break;
            case 13:
            case 14:
            case 15:
                xac2 = A00(t8u);
                if (readByte != 13) {
                    xac = null;
                    break;
                } else {
                    xac = A00(t8u);
                    break;
                }
            default:
                xac2 = null;
                xac = null;
                break;
        }
        return new C21427Xac(xac2, xac, str, readByte);
    }

    public final void close() {
        this.A02.close();
    }

    public C12825T8u(DataInputStream dataInputStream, Map map) {
        this.A02 = dataInputStream;
        this.A03 = map;
    }
}
