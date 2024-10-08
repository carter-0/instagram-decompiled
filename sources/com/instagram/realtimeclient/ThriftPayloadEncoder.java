package com.instagram.realtimeclient;

import X.AnonymousClass46B;
import X.AnonymousClass5I8;
import X.C11147SCc;
import X.C12292Sqq;
import X.C12293Sqr;
import X.C12294Sqs;
import X.C21961Xmq;
import X.C2601944q;
import X.C2605145y;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ThriftPayloadEncoder extends C2601944q {
    public static C12294Sqs buildForegroundState(String str, Boolean bool, Integer num, List list, List list2) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList linkedList3;
        LinkedList linkedList4 = null;
        if (list != null) {
            Iterator it = list.iterator();
            linkedList2 = null;
            linkedList = null;
            while (it.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                String str2 = subscribeTopic.A01;
                Object obj = C11147SCc.A01.get(str2);
                if (obj != null) {
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    linkedList2.add(obj);
                } else {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(new C12293Sqr(str2, Integer.valueOf(subscribeTopic.A00)));
                }
            }
        } else {
            linkedList2 = null;
            linkedList = null;
        }
        if (list2 != null) {
            linkedList3 = null;
            for (Object next : list2) {
                Object obj2 = C11147SCc.A01.get(next);
                if (obj2 != null) {
                    if (linkedList4 == null) {
                        linkedList4 = new LinkedList();
                    }
                    linkedList4.add(obj2);
                } else {
                    if (linkedList3 == null) {
                        linkedList3 = new LinkedList();
                    }
                    linkedList3.add(next);
                }
            }
        } else {
            linkedList3 = null;
        }
        return new C12294Sqs(bool, num, str, linkedList2, linkedList, linkedList4, linkedList3);
    }

    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2) {
        C12294Sqs buildForegroundState = buildForegroundState(str, bool, num, list, list2);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass46B r1 = new AnonymousClass46B(new C2605145y((OutputStream) byteArrayOutputStream));
            r1.A0U(C12292Sqq.A01);
            r1.A0J();
            r1.A0K();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AnonymousClass46B r4 = new AnonymousClass46B(new C2605145y((OutputStream) byteArrayOutputStream2));
            r4.A0U(C12294Sqs.A0G);
            Boolean bool2 = buildForegroundState.A00;
            if (bool2 != null) {
                r4.A0Q(C12294Sqs.A08);
                r4.A0X(bool2.booleanValue());
            }
            Integer num2 = buildForegroundState.A01;
            if (num2 != null) {
                r4.A0Q(C12294Sqs.A0A);
                r4.A0O(num2.intValue());
            }
            List<Number> list3 = buildForegroundState.A04;
            if (list3 != null) {
                r4.A0Q(C12294Sqs.A0D);
                r4.A0R(new C21961Xmq(list3.size(), (byte) 8));
                for (Number intValue : list3) {
                    r4.A0O(intValue.intValue());
                }
            }
            List<C12293Sqr> list4 = buildForegroundState.A03;
            if (list4 != null) {
                r4.A0Q(C12294Sqs.A0C);
                r4.A0R(new C21961Xmq(list4.size(), (byte) 12));
                for (C12293Sqr sqr : list4) {
                    r4.A0U(C12293Sqr.A04);
                    String str2 = sqr.A01;
                    if (str2 != null) {
                        r4.A0Q(C12293Sqr.A03);
                        r4.A0V(str2);
                    }
                    Integer num3 = sqr.A00;
                    if (num3 != null) {
                        r4.A0Q(C12293Sqr.A02);
                        r4.A0O(num3.intValue());
                    }
                    r4.A0J();
                    r4.A0K();
                }
            }
            List<Number> list5 = buildForegroundState.A06;
            if (list5 != null) {
                r4.A0Q(C12294Sqs.A0F);
                r4.A0R(new C21961Xmq(list5.size(), (byte) 8));
                for (Number intValue2 : list5) {
                    r4.A0O(intValue2.intValue());
                }
            }
            List<String> list6 = buildForegroundState.A05;
            if (list6 != null) {
                r4.A0Q(C12294Sqs.A0E);
                r4.A0R(new C21961Xmq(list6.size(), (byte) 11));
                for (String A0V : list6) {
                    r4.A0V(A0V);
                }
            }
            String str3 = buildForegroundState.A02;
            if (str3 != null) {
                r4.A0Q(C12294Sqs.A07);
                r4.A0V(str3);
            }
            r4.A0J();
            r4.A0K();
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            int length = byteArray.length;
            int length2 = byteArray2.length;
            byte[] copyOf = Arrays.copyOf(byteArray, length + length2);
            System.arraycopy(byteArray2, 0, copyOf, length, length2);
            return copyOf;
        } catch (AnonymousClass5I8 unused) {
            return null;
        }
    }
}
