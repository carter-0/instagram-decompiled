package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.44q  reason: invalid class name and case insensitive filesystem */
public class C2601944q {
    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2) {
        return null;
    }

    public List getConnectSubscribeTopics(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
            if (C11147SCc.A01.get(subscribeTopic.A01) != null) {
                arrayList.add(subscribeTopic);
            }
        }
        return arrayList;
    }

    public int handleConnectMessage(DataOutputStream dataOutputStream, C7879Qc3 qc3) {
        Long valueOf;
        SNX snx = qc3.A00;
        C11207SFh sFh = (C11207SFh) qc3.A02;
        C11253SHn sHn = (C11253SHn) qc3.A01;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        C22008Xqr xqr = new C22008Xqr(byteArrayOutputStream);
        SOV sov = sHn.A02;
        C22026XtL xtL = new C22026XtL(AnonymousClass05K.A00);
        XZz xZz = C21954Xmj.A0P;
        Long l = sov.A0B;
        Map map = xtL.A01;
        map.put(xZz, l);
        map.put(C21954Xmj.A0O, sov.A0I);
        map.put(C21954Xmj.A01, sov.A07);
        map.put(C21954Xmj.A09, sov.A09);
        map.put(C21954Xmj.A0L, Integer.valueOf(sov.A00));
        map.put(C21954Xmj.A0J, sov.A03);
        map.put(C21954Xmj.A0G, sov.A01);
        map.put(C21954Xmj.A07, sov.A0G);
        map.put(C21954Xmj.A0E, sov.A02);
        map.put(C21954Xmj.A0I, sov.A06);
        map.put(C21954Xmj.A0H, sov.A05);
        map.put(C21954Xmj.A03, sov.A0A);
        map.put(C21954Xmj.A02, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : sov.A0J) {
            Object obj2 = C11147SCc.A01.get(obj);
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        map.put(C21954Xmj.A0N, arrayList);
        map.put(C21954Xmj.A05, sov.A0D);
        XZz xZz2 = C21954Xmj.A00;
        String str = sov.A0C;
        if (str == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        map.put(xZz2, valueOf);
        map.put(C21954Xmj.A0K, (Object) null);
        map.put(C21954Xmj.A06, (Object) null);
        map.put(C21954Xmj.A0M, sov.A0F);
        map.put(C21954Xmj.A08, sov.A0H);
        map.put(C21954Xmj.A04, sov.A04);
        map.put(C21954Xmj.A0F, sov.A08);
        C22026XtL xtL2 = new C22026XtL(AnonymousClass05K.A0Y);
        XZz xZz3 = C21954Xmj.A0U;
        String str2 = sHn.A03;
        Map map2 = xtL2.A01;
        map2.put(xZz3, str2);
        map2.put(C21954Xmj.A0d, sHn.A06);
        map2.put(C21954Xmj.A0c, sHn.A05);
        map2.put(C21954Xmj.A0V, xtL);
        map2.put(C21954Xmj.A0Y, sHn.A04);
        map2.put(C21954Xmj.A0X, (Object) null);
        map2.put(C21954Xmj.A0a, (Object) null);
        map2.put(C21954Xmj.A0W, (Object) null);
        map2.put(C21954Xmj.A0e, (Object) null);
        map2.put(C21954Xmj.A0T, sov.A0K);
        map2.put(C21954Xmj.A0b, (Object) null);
        String str3 = sHn.A00;
        if (str3 != null) {
            C22026XtL xtL3 = new C22026XtL(AnonymousClass05K.A0j);
            XZz xZz4 = C21954Xmj.A0s;
            Map map3 = xtL3.A01;
            map3.put(xZz4, str3);
            map3.put(C21954Xmj.A0t, 0);
            map3.put(C21954Xmj.A0r, (Object) null);
            map2.put(C21954Xmj.A0Z, xtL3);
        }
        xtL2.A06(xqr);
        byte[] A00 = 0gU.A00(byteArrayOutputStream.toByteArray());
        int length = A00.length;
        int i = length + 12;
        dataOutputStream.writeByte(C11369SPu.A01(snx));
        int A02 = 1 + C11369SPu.A02(dataOutputStream, i);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(6);
        dataOutputStream.writeByte(77);
        dataOutputStream.writeByte(81);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(111);
        dataOutputStream.writeByte(84);
        dataOutputStream.write(sFh.A01);
        dataOutputStream.write(C11369SPu.A00(sFh));
        dataOutputStream.writeShort(sFh.A00);
        dataOutputStream.write(A00, 0, length);
        dataOutputStream.flush();
        return A02 + i;
    }
}
