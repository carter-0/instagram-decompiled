package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class SQD {
    public static void A01(C257513xW r5, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection AXL = r5.AXL(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                AXL.add(objectInputStream.readObject());
            }
        }
    }

    public static C10907S0h A00(Class cls, String str) {
        try {
            return new C10907S0h(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw Pxe.A0e(e);
        }
    }

    public static void A02(C257513xW r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.ACX().size());
        Iterator A0u = AnonymousClass7TF.A0u(r2.ACX());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            objectOutputStream.writeObject(A1J.getKey());
            objectOutputStream.writeInt(Pxe.A18(A1J).size());
            for (Object writeObject : Pxe.A18(A1J)) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static void A03(AnonymousClass3W6 r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.entrySet().size());
        for (S79 s79 : r2.entrySet()) {
            objectOutputStream.writeObject(s79.A01());
            objectOutputStream.writeInt(s79.A00());
        }
    }
}
