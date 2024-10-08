package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EWH {
    IGT("IGT"),
    LVI("LVI"),
    LVG("LVG"),
    IAC("IAC"),
    IGF("IGF"),
    ITB("ITB"),
    ISI("ISI"),
    IBC("IBC"),
    IBB("IBB"),
    IOO("IOO"),
    IOA("IOA"),
    GTI("GTI"),
    IGS("IGS");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWH[] ewhArr;
        A02 = 0oU.A00(ewhArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (EWH ewh : values()) {
            A0x.put(ewh.A00, ewh);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EWH(String str) {
        this.A00 = str;
    }
}
