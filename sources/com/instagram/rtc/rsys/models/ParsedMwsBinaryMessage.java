package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;
import java.util.Map;

public class ParsedMwsBinaryMessage {
    public static 2LV CONVERTER = new C71545Omg(24);
    public static long sMcfTypeId;
    public final Map collisionContext;
    public final byte[] data;
    public final DismissNotification dismissData;
    public final boolean isResponse;
    public final RingNotification ringData;

    public static native ParsedMwsBinaryMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ParsedMwsBinaryMessage)) {
                return false;
            }
            ParsedMwsBinaryMessage parsedMwsBinaryMessage = (ParsedMwsBinaryMessage) obj;
            if (!Arrays.equals(this.data, parsedMwsBinaryMessage.data)) {
                return false;
            }
            RingNotification ringNotification = this.ringData;
            RingNotification ringNotification2 = parsedMwsBinaryMessage.ringData;
            if (ringNotification == null) {
                if (ringNotification2 != null) {
                    return false;
                }
            } else if (!ringNotification.equals(ringNotification2)) {
                return false;
            }
            DismissNotification dismissNotification = this.dismissData;
            DismissNotification dismissNotification2 = parsedMwsBinaryMessage.dismissData;
            if (dismissNotification == null) {
                if (dismissNotification2 != null) {
                    return false;
                }
            } else if (!dismissNotification.equals(dismissNotification2)) {
                return false;
            }
            Map map = this.collisionContext;
            Map map2 = parsedMwsBinaryMessage.collisionContext;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            return this.isResponse == parsedMwsBinaryMessage.isResponse;
        }
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((C66583MXo.A01(Arrays.hashCode(this.data)) + AnonymousClass7TG.A0C(this.ringData)) * 31) + AnonymousClass7TG.A0C(this.dismissData)) * 31;
        Map map = this.collisionContext;
        if (map != null) {
            i = map.hashCode();
        }
        return ((A01 + i) * 31) + (this.isResponse ? 1 : 0);
    }

    public ParsedMwsBinaryMessage(byte[] bArr, RingNotification ringNotification, DismissNotification dismissNotification, Map map, boolean z) {
        bArr.getClass();
        this.data = bArr;
        this.ringData = ringNotification;
        this.dismissData = dismissNotification;
        this.collisionContext = map;
        this.isResponse = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParsedMwsBinaryMessage{data=");
        A1A.append(this.data);
        A1A.append(",ringData=");
        A1A.append(this.ringData);
        A1A.append(",dismissData=");
        A1A.append(this.dismissData);
        A1A.append(",collisionContext=");
        A1A.append(this.collisionContext);
        A1A.append(",isResponse=");
        return C66584MXp.A0b(A1A, this.isResponse);
    }
}
