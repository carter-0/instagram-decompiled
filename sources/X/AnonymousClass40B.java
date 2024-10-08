package X;

import java.util.AbstractList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.40B  reason: invalid class name */
public abstract class AnonymousClass40B extends C258633zO {
    public final C255463uA A00;

    public void A07(Object obj, int i, Object obj2) {
        if ((this instanceof AnonymousClass409) || (this instanceof C2592440y)) {
            AbstractList abstractList = (AbstractList) obj;
            0qQ.A0B(abstractList, 0);
            abstractList.add(i, obj2);
            return;
        }
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public SerialDescriptor getDescriptor() {
        if (this instanceof C2592040u) {
            return ((C2592040u) this).A00;
        }
        if (this instanceof AnonymousClass409) {
            return ((AnonymousClass409) this).A00;
        }
        return ((C2592440y) this).A01;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor descriptor;
        AnonymousClass484 ADJ;
        if (this instanceof C2592040u) {
            C2592040u r2 = (C2592040u) this;
            0qQ.A0B(encoder, 0);
            int A01 = r2.A01(obj);
            descriptor = r2.A00;
            0qQ.A0B(descriptor, 1);
            ADJ = encoder.ADJ(descriptor);
            r2.A09(obj, ADJ, A01);
        } else {
            0qQ.A0B(encoder, 0);
            int A012 = A01(obj);
            descriptor = getDescriptor();
            0qQ.A0B(descriptor, 1);
            ADJ = encoder.ADJ(descriptor);
            Iterator A05 = A05(obj);
            for (int i = 0; i < A012; i++) {
                ADJ.AS8(A05.next(), this.A00, descriptor, i);
            }
        }
        ADJ.AST(descriptor);
    }

    public AnonymousClass40B(C255463uA r1) {
        this.A00 = r1;
    }
}
