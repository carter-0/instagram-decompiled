package X;

import com.hierynomus.asn1.types.constructed.ASN1Sequence;
import com.hierynomus.asn1.types.constructed.ASN1Set;
import com.hierynomus.asn1.types.constructed.ASN1TaggedObject;
import com.hierynomus.asn1.types.primitive.ASN1Boolean;
import com.hierynomus.asn1.types.primitive.ASN1Enumerated;
import com.hierynomus.asn1.types.primitive.ASN1Integer;
import com.hierynomus.asn1.types.primitive.ASN1Null;
import com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier;
import com.hierynomus.asn1.types.string.ASN1BitString;
import com.hierynomus.asn1.types.string.ASN1OctetString;
import java.util.Arrays;
import java.util.BitSet;

public abstract class RRQ {
    public SPJ A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RRQ rrq = (RRQ) obj;
            if (this.A00 == rrq.A00) {
                if (A00() != null) {
                    return A00().equals(rrq.A00());
                }
                return rrq.A00() == null;
            }
        }
        return false;
    }

    public final Object A00() {
        if (this instanceof ASN1OctetString) {
            byte[] bArr = ((R7R) this).A00;
            return Arrays.copyOf(bArr, bArr.length);
        } else if (this instanceof ASN1BitString) {
            return BitSet.valueOf(((R7R) this).A00);
        } else {
            if (this instanceof ASN1ObjectIdentifier) {
                return ((ASN1ObjectIdentifier) this).A00;
            }
            if (this instanceof ASN1Null) {
                return null;
            }
            if (this instanceof ASN1Integer) {
                return ((ASN1Integer) this).A00;
            }
            if (this instanceof ASN1Enumerated) {
                return ((ASN1Enumerated) this).A00;
            }
            if (this instanceof ASN1Boolean) {
                return Boolean.valueOf(((ASN1Boolean) this).A00);
            }
            if (this instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) this;
                try {
                    return new RCA(aSN1TaggedObject.A00, aSN1TaggedObject.A01).A00();
                } catch (TQK e) {
                    throw new RuntimeException(String.format("Unable to parse the explicit Tagged Object with %s, it might be implicit", new Object[]{aSN1TaggedObject.A00}), e);
                }
            } else if (this instanceof ASN1Set) {
                return C66580MXl.A12(((ASN1Set) this).A01);
            } else {
                return AnonymousClass7TE.A1D(((ASN1Sequence) this).A01);
            }
        }
    }

    public final int hashCode() {
        return this.A00.A00;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(C51968G9o.A16(this));
        Pxh.A1P(A1A);
        return Pxg.A0r(A00(), A1A);
    }
}
