package com.fasterxml.jackson.databind.ext;

import X.16F;
import X.16L;
import X.AnonymousClass4iD;
import X.AnonymousClass4iI;
import X.C268894eF;
import X.C269024eS;
import X.C269134ed;
import X.C269454f9;
import X.C269674fV;
import X.C41845B3m;
import X.Pxe;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public final class CoreXMLDeserializers extends AnonymousClass4iI {
    public static final DatatypeFactory A00;

    public class Std extends FromStringDeserializer {
        public final int A00;

        public final Object A0D(16F r3, C269674fV r4) {
            if (this.A00 != 2 || !r3.A19(16L.A0I)) {
                return super.A0D(r3, r4);
            }
            Date A0m = A0m(r3, r4);
            if (A0m == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(A0m);
            TimeZone timeZone = r4.A02.A01.A0A;
            if (!(timeZone == null && (timeZone = C269024eS.A0B) == null)) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
        }

        public final Object A10(C269674fV r3, String str) {
            int i = this.A00;
            if (i == 1) {
                return CoreXMLDeserializers.A00.newDuration(str);
            }
            if (i == 2) {
                try {
                    Date A0n = A0n(r3, str);
                    if (A0n == null) {
                        return null;
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(A0n);
                    TimeZone timeZone = r3.A02.A01.A0A;
                    if (timeZone == null) {
                        timeZone = C269024eS.A0B;
                    }
                    if (timeZone != null) {
                        gregorianCalendar.setTimeZone(timeZone);
                    }
                    return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
                } catch (AnonymousClass4iD unused) {
                    return CoreXMLDeserializers.A00.newXMLGregorianCalendar(str);
                }
            } else if (i == 3) {
                return QName.valueOf(str);
            } else {
                throw Pxe.A0i();
            }
        }

        public Std(Class cls, int i) {
            super(cls);
            this.A00 = i;
        }
    }

    public final JsonDeserializer AVC(C269454f9 r4, C268894eF r5, C269134ed r6) {
        int i;
        Class<Duration> cls = r5.A00;
        if (cls == QName.class) {
            i = 3;
        } else if (cls == XMLGregorianCalendar.class) {
            i = 2;
        } else if (cls != Duration.class) {
            return null;
        } else {
            i = 1;
        }
        return new Std(cls, i);
    }

    static {
        try {
            A00 = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
