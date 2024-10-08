package X;

import com.google.common.collect.RegularImmutableMap;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3x2  reason: invalid class name and case insensitive filesystem */
public abstract class C257213x2 implements C257113ws {
    public int A00;
    public C257263x7 A01;
    public final ArrayList A02 = new ArrayList(1);
    public final boolean A03;

    public final void A02() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(C257263x7 r5) {
        this.A01 = r5;
        for (int i = 0; i < this.A00; i++) {
            ((C250823m7) this.A02.get(i)).Dtf(this, r5, this.A03, false);
        }
    }

    public final /* synthetic */ void cancel() {
    }

    public final void A01() {
        C257263x7 r3 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((C250823m7) this.A02.get(i)).DtX(this, r3, this.A03);
        }
        this.A01 = null;
    }

    public final void A03(int i) {
        C257263x7 r3 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((C250823m7) this.A02.get(i2)).Czk(this, r3, i, this.A03);
        }
    }

    public final /* synthetic */ Map getResponseHeaders() {
        if (!(this instanceof C257303xB)) {
            return Collections.emptyMap();
        }
        HttpURLConnection httpURLConnection = ((C257303xB) this).A03;
        if (httpURLConnection == null) {
            return RegularImmutableMap.A02;
        }
        return new C8678Qzl(httpURLConnection.getHeaderFields());
    }

    public C257213x2(boolean z) {
        this.A03 = z;
    }

    public final void addTransferListener(C250823m7 r3) {
        r3.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
            this.A00++;
        }
    }
}
