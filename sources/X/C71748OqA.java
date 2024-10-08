package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.OqA  reason: case insensitive filesystem */
public final class C71748OqA implements C74436Pur {
    public static final C71748OqA A00 = new Object();

    public final String BdN() {
        return "byte_to_string";
    }

    public final Object E4V(N31 n31) {
        N4x n4x;
        0qQ.A0B(n31, 0);
        C74376Ptr ptr = n31.A06;
        if (ptr instanceof N4x) {
            IllegalArgumentException A0w = AnonymousClass7TE.A0w("Byte to String conversion attempted on String input, plugin should only run when data was decompressed or decrypted into a byte array");
            0qQ.A0B(A0w, 0);
            return new 0eQ(A0w);
        }
        if (ptr instanceof N4w) {
            n4x = new N4x(new String(((N4w) ptr).A00, AnonymousClass15Q.A05));
        } else {
            n4x = null;
        }
        Context context = n31.A03;
        C74376Ptr ptr2 = n31.A05;
        PushInfraMetaData pushInfraMetaData = n31.A04;
        String str = n31.A07;
        Integer num = n31.A00;
        boolean z = n31.A02;
        boolean z2 = n31.A01;
        AnonymousClass7TG.A0w(0, context, pushInfraMetaData, str);
        return new N31(context, pushInfraMetaData, n4x, ptr2, num, str, z, z2);
    }

    public final boolean Esm(N31 n31) {
        0qQ.A0B(n31, 0);
        C74376Ptr ptr = n31.A06;
        if ((ptr instanceof N4x) || !(ptr instanceof N4w)) {
            return false;
        }
        if (n31.A01 || n31.A02) {
            return true;
        }
        return false;
    }
}
