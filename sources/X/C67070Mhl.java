package X;

import android.text.Editable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Mhl  reason: case insensitive filesystem */
public final class C67070Mhl {
    public final Comparator A00 = C67467MoM.A00;

    public static void A00(AbstractCollection abstractCollection, Matcher matcher, int i) {
        abstractCollection.add(new C67600MqY(i + matcher.start(1), i + matcher.end(1)));
    }

    public final ArrayList A01(Editable editable, List list) {
        List singletonList;
        0qQ.A0B(editable, 0);
        0qQ.A0B(list, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C67071Mhm mhm = (C67071Mhm) it.next();
            Matcher matcher = mhm.A03.matcher(editable);
            0qQ.A07(matcher);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                boolean z = mhm.A05;
                C67600MqY mqY = new C67600MqY(matcher.start(1), matcher.end(1));
                if (z) {
                    singletonList = 0sr.A1P(new C67600MqY[]{mqY, new C67600MqY(matcher.start(matcher.groupCount()), matcher.end(matcher.groupCount()))});
                } else {
                    singletonList = Collections.singletonList(mqY);
                    0qQ.A07(singletonList);
                }
                arrayList.add(new C67601MqZ(mhm, singletonList, start, end));
            }
        }
        return arrayList;
    }

    public final ArrayList A02(Editable editable, List list, boolean z) {
        int i;
        01N r0;
        01N r13;
        List list2 = list;
        0qQ.A0B(list2, 2);
        Editable editable2 = editable;
        ArrayList A01 = A01(editable2, list2);
        Collections.sort(A01, this.A00);
        int length = editable2.length();
        LinkedList linkedList = new LinkedList();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A01.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C67601MqZ mqZ = (C67601MqZ) it.next();
            while (true) {
                int i4 = mqZ.A01;
                if (i4 > length) {
                    if (AnonymousClass7TE.A1b(linkedList)) {
                        length = AnonymousClass7TE.A0M(linkedList.removeFirst());
                    } else {
                        throw AnonymousClass7TE.A0z("Start index of range is beyond end of text");
                    }
                } else if (i2 <= i4 && (i = mqZ.A00) <= length) {
                    C67071Mhm mhm = mqZ.A02;
                    List<Object> AN4 = mhm.A01.AN4(new C70644OEq(editable2, i4, i, z));
                    if (mhm.A02 == AnonymousClass05K.A03) {
                        editable2.setSpan(AN4.get(i3), i4, i, 33);
                        i3++;
                    } else {
                        for (Object span : AN4) {
                            editable2.setSpan(span, i4, i, 33);
                        }
                    }
                    switch (((C67280MlF) mhm.A00).A00) {
                        case 0:
                            r0 = mqZ.A03;
                            break;
                        case 1:
                            Matcher matcher = Pattern.compile("(^\\s*[*-] ?)(.*?$)", 8).matcher(editable2.subSequence(i4, i));
                            r13 = 0jo.A1H();
                            while (matcher.find()) {
                                A00(r13, matcher, i4);
                            }
                            break;
                        case 2:
                            Pattern compile = Pattern.compile("\\[([^\\]]+)\\]");
                            Pattern compile2 = Pattern.compile(".*\\(([^)]+)\\)");
                            Matcher matcher2 = compile.matcher(editable2.subSequence(i4, i));
                            Matcher matcher3 = compile2.matcher(editable2.subSequence(i4, i));
                            0qQ.A07(matcher3);
                            r13 = 0jo.A1H();
                            while (matcher3.find() && matcher2.find()) {
                                r13.add(new C67600MqY((i4 + matcher2.start(1)) - 1, i4 + matcher2.start(1)));
                                r13.add(new C67600MqY(i4 + matcher2.end(1), matcher2.end(1) + i4 + 1));
                                r13.add(new C67600MqY((i4 + matcher3.start(1)) - 1, matcher3.end(1) + i4 + 1));
                            }
                            break;
                        case 3:
                            Matcher matcher4 = Pattern.compile("(^> ?)(.*?$)", 8).matcher(editable2.subSequence(i4, i));
                            r13 = 0jo.A1H();
                            while (matcher4.find()) {
                                A00(r13, matcher4, i4);
                            }
                            break;
                        default:
                            Matcher matcher5 = Pattern.compile("(^([1-9][0-9]?)\\.\\s ?)(.*?$)", 8).matcher(editable2.subSequence(i4, i));
                            r13 = 0jo.A1H();
                            while (matcher5.find()) {
                                A00(r13, matcher5, i4);
                            }
                            break;
                    }
                    r0 = 0jo.A1I(r13);
                    A1C.addAll(r0);
                    if (mhm.A04) {
                        linkedList.addFirst(Integer.valueOf(length));
                        i2 = i4 + 1;
                        length = i - (JTQ.A1P(mqZ.A03.size(), 2) ? 1 : 0);
                    } else {
                        i2 = i;
                    }
                }
            }
        }
        return A1C;
    }
}
