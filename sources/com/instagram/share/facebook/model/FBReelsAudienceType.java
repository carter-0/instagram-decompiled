package com.instagram.share.facebook.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.XRN;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FBReelsAudienceType {
    A07(0),
    A08(1),
    A04(2),
    A05(3),
    A06(4);
    
    public static final Map A01 = null;
    public final XRN A00;

    /* access modifiers changed from: public */
    static {
        int i;
        FBReelsAudienceType[] fBReelsAudienceTypeArr;
        A02 = 0oU.A00(fBReelsAudienceTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (FBReelsAudienceType fBReelsAudienceType : values()) {
            A0x.put(fBReelsAudienceType.A00, fBReelsAudienceType);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    FBReelsAudienceType(int i) {
        this.A00 = r1;
    }
}
