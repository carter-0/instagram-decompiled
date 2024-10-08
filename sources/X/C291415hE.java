package X;

import android.util.Base64;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphservice.interfaces.Tree;
import java.nio.ByteBuffer;
import java.util.Collection;

/* renamed from: X.5hE  reason: invalid class name and case insensitive filesystem */
public abstract class C291415hE {
    public static void A00(17Z r6, C269504fE r7, Object obj) {
        String name;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            boolean z = obj instanceof Tree;
            if (C271214iQ.class.isAssignableFrom(cls)) {
                17k.A0E(z);
                Tree tree = (Tree) obj;
                int typeTag = tree.getTypeTag();
                if (z) {
                    ByteBuffer serializeTreeToByteBuffer = SN1.A00().serializeTreeToByteBuffer(tree);
                    byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
                    serializeTreeToByteBuffer.get(bArr);
                    name = 002.A0g("tree:", StringFormatUtil.formatStrLocaleSafe("type_tag:%08x;", Integer.valueOf(typeTag)), Base64.encodeToString(bArr, 2));
                } else {
                    0KC.A0E("AutoGenJsonHelper", "Use of deprecated flatbuffer infra");
                    return;
                }
            } else if (C250673ls.class.isAssignableFrom(cls)) {
                ByteBuffer serializeTreeToByteBuffer2 = SN1.A00().serializeTreeToByteBuffer((Tree) obj);
                byte[] bArr2 = new byte[serializeTreeToByteBuffer2.limit()];
                serializeTreeToByteBuffer2.get(bArr2);
                name = Base64.encodeToString(bArr2, 2);
            } else if (C252523pF.class.isAssignableFrom(cls)) {
                ((C252523pF) obj).EN9(r6, r7);
                return;
            } else if (cls.isEnum()) {
                name = ((Enum) obj).name();
            } else if (Collection.class.isAssignableFrom(cls)) {
                A01(r6, r7, (Collection) obj);
                return;
            } else {
                r6.A0J(obj);
                return;
            }
            r6.A0t(name);
        }
    }

    public static void A01(17Z r2, C269504fE r3, Collection collection) {
        if (collection != null) {
            r2.A0b();
            for (Object A00 : collection) {
                A00(r2, r3, A00);
            }
            r2.A0Y();
        }
    }

    public static void A02(17Z r1, Boolean bool, String str) {
        if (bool != null) {
            r1.A0q(str);
            r1.A0x(bool.booleanValue());
        }
    }

    public static void A03(17Z r1, Integer num, String str) {
        if (num != null) {
            r1.A0q(str);
            r1.A0g(num.intValue());
        }
    }

    public static void A04(17Z r0, String str, String str2) {
        if (str2 != null) {
            r0.A0q(str);
            r0.A0t(str2);
        }
    }
}
