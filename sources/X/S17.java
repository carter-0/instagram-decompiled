package X;

import com.facebook.systrace.SystraceMessage;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;

public final class S17 {
    public final C10207RoO A00;
    public final HashMap A01 = new HashMap(64);

    /* JADX INFO: finally extract failed */
    public final synchronized AnonymousClass50J A00(String str) {
        AnonymousClass50J r0;
        RuntimeException runtimeException;
        String[] list;
        C12825T8u t8u;
        synchronized (this) {
            HashMap hashMap = this.A01;
            String str2 = str;
            r0 = (AnonymousClass50J) hashMap.get(str2);
            if (r0 == null) {
                try {
                    C10207RoO roO = this.A00;
                    0eu r20 = SystraceMessage.A00;
                    0et A002 = SystraceMessage.A00(r20, "MetadataDeserializer.readEntireNamespace", 4);
                    A002.A00(str2, "firstTypeClassName");
                    A002.A02();
                    try {
                        String parent = AnonymousClass7TE.A0t(str2.replace(".", "/")).getParent();
                        if (parent == null) {
                            list = new String[0];
                        } else {
                            list = roO.A00.list(parent);
                        }
                        for (String str3 : list) {
                            if (str3.endsWith(".meta")) {
                                0et A003 = SystraceMessage.A00(r20, "MetadataDeserializer.parse", 4);
                                A003.A00(str3, "structGroup");
                                A003.A02();
                                try {
                                    t8u = new C12825T8u(new DataInputStream(roO.A00.open(002.A0g(parent, "/", str3))), hashMap);
                                    DataInputStream dataInputStream = t8u.A02;
                                    t8u.A00 = dataInputStream.readBoolean();
                                    int readShort = dataInputStream.readShort();
                                    t8u.A01 = new String[readShort];
                                    for (int i = 0; i < readShort; i++) {
                                        t8u.A01[i] = dataInputStream.readUTF();
                                    }
                                    short readShort2 = dataInputStream.readShort();
                                    for (int i2 = 0; i2 < readShort2; i2++) {
                                        short readShort3 = dataInputStream.readShort();
                                        C21412XaL[] xaLArr = new C21412XaL[readShort3];
                                        for (int i3 = 0; i3 < readShort3; i3++) {
                                            short readShort4 = dataInputStream.readShort();
                                            String str4 = null;
                                            if (t8u.A00) {
                                                str4 = dataInputStream.readUTF();
                                            }
                                            xaLArr[i3] = new C21412XaL(C12825T8u.A00(t8u), str4, readShort4);
                                        }
                                        t8u.A03.put(t8u.A01[i2], new AnonymousClass50J(xaLArr));
                                    }
                                    t8u.close();
                                    0fc.A00(4, -916237450);
                                } catch (Throwable th) {
                                    0fc.A00(4, 706125580);
                                    throw th;
                                }
                            }
                        }
                        0fc.A00(4, -586043676);
                        r0 = (AnonymousClass50J) hashMap.get(str2);
                        if (r0 == null) {
                            runtimeException = Pxg.A0k("No type found for ", str2);
                            throw runtimeException;
                        }
                    } catch (Throwable th2) {
                        0fc.A00(4, 912372005);
                        throw th2;
                    }
                } catch (IOException e) {
                    runtimeException = Pxe.A0u(002.A0R("Failed to find ", str2), e);
                }
            }
        }
        return r0;
        throw th;
    }

    public S17(C10207RoO roO) {
        this.A00 = roO;
    }
}
