package X;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pb7  reason: case insensitive filesystem */
public final class C73348Pb7 implements Runnable {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ C3024463i A01;
    public final /* synthetic */ AnonymousClass9GD A02;
    public final /* synthetic */ List A03;

    public C73348Pb7(C71087ObS obS, C3024463i r2, AnonymousClass9GD r3, List list) {
        this.A02 = r3;
        this.A00 = obS;
        this.A01 = r2;
        this.A03 = list;
    }

    public final void run() {
        byte[] bArr;
        boolean z;
        AnonymousClass9GD r1 = this.A02;
        boolean A0E = r1.A0E();
        C71087ObS obS = this.A00;
        if (A0E) {
            Object A06 = r1.A06();
            0qQ.A07(A06);
            RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) A06;
            Iterator it = this.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bArr = C3024463i.A03;
                    z = false;
                    break;
                }
                Object next = it.next();
                RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) Collections.unmodifiableMap(retrieveBytesResponse.A00).get(next);
                if (blockstoreData != null && (bArr = blockstoreData.A01) != null) {
                    z = 0qQ.A0K(next, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
                    break;
                }
            }
            obS.A05(new OB5(bArr, z));
            return;
        }
        obS.A03();
    }
}
