package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.OqD  reason: case insensitive filesystem */
public final class C71751OqD implements C74436Pur {
    public static final C71751OqD A00 = new Object();

    public final String BdN() {
        return "hpke_notif_decryption";
    }

    public final Object E4V(N31 n31) {
        IllegalArgumentException A0w;
        0qQ.A0B(n31, 0);
        PushInfraMetaData pushInfraMetaData = n31.A04;
        String str = pushInfraMetaData.A02;
        if (str == null) {
            A0w = AnonymousClass7TE.A0w("Ciphersuite is null");
        } else {
            String str2 = pushInfraMetaData.A03;
            if (str2 == null) {
                A0w = AnonymousClass7TE.A0w("encappedKey is null");
            } else {
                String str3 = pushInfraMetaData.A04;
                if (str3 == null) {
                    A0w = AnonymousClass7TE.A0w("keystoreId is null");
                } else {
                    Context context = n31.A03;
                    0qQ.A0B(context, 0);
                    C70679OGa A002 = OX2.A00(new C39736A7c(context, str3, str), Base64.decode(C66582MXn.A1a(str2), 0), new byte[0]);
                    C74376Ptr ptr = n31.A06;
                    C74376Ptr ptr2 = n31.A05;
                    if (ptr instanceof N4w) {
                        A0w = AnonymousClass7TE.A0w("HPKE decryption failed, plugin expects type \"String\" not \"ByteArray\"");
                    } else {
                        if (ptr instanceof N4x) {
                            byte[] A02 = OX2.A02(A002, str, new byte[0], Base64.decode(((N4x) ptr).A00, 0));
                            0qQ.A07(A02);
                            ptr = new N4w(A02);
                        }
                        if (ptr2 instanceof N4w) {
                            A0w = AnonymousClass7TE.A0w("HPKE decryption failed, plugin expects type \"String\" not \"ByteArray\"");
                        } else {
                            if (ptr2 instanceof N4x) {
                                byte[] A022 = OX2.A02(A002, str, new byte[0], Base64.decode(((N4x) ptr2).A00, 0));
                                0qQ.A07(A022);
                                ptr2 = new N4w(A022);
                            }
                            String str4 = n31.A07;
                            Integer num = n31.A00;
                            boolean z = n31.A01;
                            0qQ.A0B(str4, 4);
                            return new N31(context, pushInfraMetaData, ptr, ptr2, num, str4, true, z);
                        }
                    }
                }
            }
        }
        0qQ.A0B(A0w, 0);
        return new 0eQ(A0w);
    }

    public final boolean Esm(N31 n31) {
        0qQ.A0B(n31, 0);
        PushInfraMetaData pushInfraMetaData = n31.A04;
        if (pushInfraMetaData.A02 == null || pushInfraMetaData.A03 == null || pushInfraMetaData.A04 == null) {
            return false;
        }
        return true;
    }
}
