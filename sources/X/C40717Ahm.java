package X;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ahm  reason: case insensitive filesystem */
public final class C40717Ahm implements B38, C41811B1q {
    public A8o A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final Bundle A02;
    public final C312446eR A03;

    public final void FKT(Bundle bundle) {
        C41793B0y b0y;
        0qQ.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType") && bundle.getInt("commandType") == 2 && bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
            int i = bundle.getInt("messageType");
            byte[] byteArray = bundle.getByteArray("buffer");
            if (byteArray != null) {
                C39874ACv A002 = C39874ACv.A00(byteArray, i);
                A8o a8o = this.A00;
                if (a8o != null && (b0y = a8o.A02) != null) {
                    b0y.AP7(A002);
                }
            }
        }
    }

    public static void A00(Bundle bundle, C40717Ahm ahm, ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() > 256000) {
            0KC.A0C("ServiceMessageChannelHost", "Service message exceeding buffer max size, skipping!");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        bundle.putByteArray("buffer", bArr);
        ahm.A01.add(bundle);
    }

    public final Bundle BH4() {
        return this.A02;
    }

    public final void CMw(C371698yt r4) {
        Map unmodifiableMap;
        C39674A4o a4o;
        if (r4 != null && (unmodifiableMap = Collections.unmodifiableMap(r4.A00)) != null && (a4o = (C39674A4o) unmodifiableMap.get(this.A03)) != null) {
            A8o a8o = a4o.A01;
            this.A00 = a8o;
            a8o.A01 = this;
            C39874ACv aCv = a8o.A00;
            if (aCv != null) {
                int i = aCv.A00;
                ByteBuffer byteBuffer = aCv.A01;
                setConfiguration(i, byteBuffer, byteBuffer.position());
            }
        }
    }

    public final List EzR() {
        List list = this.A01;
        ArrayList A0U = 00k.A0U(list);
        if (A0U.isEmpty()) {
            A0U.add(AnonymousClass7TH.A05(this.A03.ordinal()));
        }
        list.clear();
        return A0U;
    }

    public final void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2) {
        A00(Q21.A00(AnonymousClass7TH.A0h("offset", Integer.valueOf(i2), AnonymousClass7TF.A0x("serviceType", this.A03.ordinal()), AnonymousClass7TH.A0J(AnonymousClass05K.A01), AnonymousClass7TE.A1L("messageType", Integer.valueOf(i)))), this, byteBuffer);
    }

    public final void setConfiguration(int i, ByteBuffer byteBuffer, int i2) {
        Bundle bundle = this.A02;
        bundle.clear();
        bundle.putInt("serviceType", this.A03.ordinal());
        bundle.putInt("commandType", 0);
        bundle.putInt("messageType", i);
        bundle.putInt("offset", i2);
        A00(bundle, this, byteBuffer);
    }

    public C40717Ahm(C312446eR r2) {
        this.A03 = r2;
        this.A02 = AnonymousClass7TH.A05(r2.ordinal());
    }
}
