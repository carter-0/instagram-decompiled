package X;

import com.hierynomus.asn1.types.constructed.ASN1Sequence;
import java.util.Collections;
import java.util.Iterator;

public abstract class R7R extends RRQ implements Iterable {
    public byte[] A00;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.S58] */
    public final Iterator iterator() {
        if (this.A00.A01 != C8871RDn.Constructed) {
            return Collections.singletonList(this).iterator();
        }
        SPJ spj = SPJ.A0C;
        return ((ASN1Sequence) spj.A01(new Object()).A00(spj, this.A00)).iterator();
    }
}
