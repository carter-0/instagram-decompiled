package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.ONb  reason: case insensitive filesystem */
public final class C70829ONb {
    public final Uri A00;
    public final C69644NpS A01;
    public final MY4 A02;
    public final String A03;
    public final WeakReference A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70829ONb) {
                C70829ONb oNb = (C70829ONb) obj;
                if (!0qQ.A0K(this.A04, oNb.A04) || !0qQ.A0K(this.A01, oNb.A01) || !0qQ.A0K(this.A00, oNb.A00) || this.A02 != oNb.A02 || !0qQ.A0K(this.A03, oNb.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A04))) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31) + 1231;
    }

    public C70829ONb(Uri uri, C69644NpS npS, MY4 my4, String str, WeakReference weakReference) {
        this.A04 = weakReference;
        this.A01 = npS;
        this.A00 = uri;
        this.A02 = my4;
        this.A03 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FileReceivingParams(context=");
        A1A.append(this.A04);
        A1A.append(", scope=");
        A1A.append(this.A01);
        A1A.append(", uri=");
        A1A.append(this.A00);
        A1A.append(", forcedDestination=");
        A1A.append(this.A02);
        A1A.append(", inboundPrefix=");
        A1A.append(this.A03);
        A1A.append(", preferCacheIfInternal=");
        return G9t.A1C(A1A, true);
    }
}
