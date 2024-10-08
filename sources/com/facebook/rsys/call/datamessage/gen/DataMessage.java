package com.facebook.rsys.call.datamessage.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66581MXm;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Arrays;

public class DataMessage {
    public static 2LV CONVERTER = C22180Xwq.A00(14);
    public static long sMcfTypeId;
    public final byte[] payload;
    public final ArrayList recipients;
    public final String topic;

    public static native DataMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataMessage)) {
            return false;
        }
        DataMessage dataMessage = (DataMessage) obj;
        return this.recipients.equals(dataMessage.recipients) && this.topic.equals(dataMessage.topic) && Arrays.equals(this.payload, dataMessage.payload);
    }

    public int hashCode() {
        return AnonymousClass7TF.A08(this.topic, C21056XCh.A01(this.recipients)) + Arrays.hashCode(this.payload);
    }

    public DataMessage(ArrayList arrayList, String str, byte[] bArr) {
        C66581MXm.A1R(arrayList, str, bArr);
        this.recipients = arrayList;
        this.topic = str;
        this.payload = bArr;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DataMessage{recipients=");
        A1A.append(this.recipients);
        A1A.append(",topic=");
        A1A.append(this.topic);
        A1A.append(",payload=");
        return C66582MXn.A0v(this.payload, A1A);
    }
}
