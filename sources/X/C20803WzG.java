package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WzG  reason: case insensitive filesystem */
public final class C20803WzG extends C2590540f {
    public List A00 = 0sn.A00;
    public final Map A01;
    public final Map A02;
    public final AnonymousClass0eM A03;
    public final C62230ry A04;

    public static C20803WzG A00(C62230ry r9, C62230ry r10) {
        return new C20803WzG("com.facebook.flipper.plugins.bloksdebugger.Instruction", r10, new Annotation[0], new C62230ry[]{r9, new 0Yh(WHD.class), new 0Yh(WHE.class), new 0Yh(WHG.class), new 0Yh(WHF.class), new 0Yh(WHH.class)}, new C255463uA[]{C20444Wrm.A00, C20446Wro.A00, C20447Wrp.A00, C20449Wrr.A00, C20450Wrs.A00, C20452Wru.A00});
    }

    public final C62230ry A01() {
        return this.A04;
    }

    public final C255483uC A02(String str, C2590240b r3) {
        C255483uC r0 = (C255483uC) this.A02.get(str);
        if (r0 == null) {
            return super.A02(str, r3);
        }
        return r0;
    }

    public final C255473uB A03(Object obj, Encoder encoder) {
        C255473uB r0 = (C255473uB) this.A01.get(C51969G9p.A0x(obj));
        if (r0 != null) {
            return r0;
        }
        C255473uB A032 = super.A03(obj, encoder);
        if (A032 == null) {
            return null;
        }
        return A032;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A03.getValue();
    }

    public C20803WzG(String str, C62230ry r8, Annotation[] annotationArr, C62230ry[] r10, C255463uA[] r11) {
        this.A04 = r8;
        this.A03 = AnonymousClass0eN.A00(0eO.A03, new C20413Wqx(str, this));
        int length = r10.length;
        int length2 = r11.length;
        if (length == length2) {
            int min = Math.min(length, length2);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                AnonymousClass7TF.A1I(r10[i], r11[i], arrayList);
            }
            Map A08 = 0Yt.A08(arrayList);
            this.A01 = A08;
            Set<Map.Entry> entrySet = A08.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : entrySet) {
                String BsV = ((C255463uA) entry.getValue()).getDescriptor().BsV();
                Object obj = linkedHashMap.get(BsV);
                if (obj == null) {
                    linkedHashMap.containsKey(BsV);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(BsV, entry);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple sealed subclasses of '");
                    sb.append(this.A04);
                    sb.append("' have the same serial name '");
                    sb.append(BsV);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    sb.append("', '");
                    sb.append(entry.getKey());
                    throw new IllegalStateException(C51967G9n.A0r(sb, '\''));
                }
            }
            LinkedHashMap A0o = C51975G9x.A0o(linkedHashMap);
            Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                A0o.put(A1J.getKey(), ((Map.Entry) A1J.getValue()).getValue());
            }
            this.A02 = A0o;
            0qQ.A0B(annotationArr, 0);
            List asList = Arrays.asList(annotationArr);
            0qQ.A07(asList);
            this.A00 = asList;
            return;
        }
        throw Pxg.A0c("All subclasses of sealed class ", 0q1.A01(this.A04.A00), " should be marked @Serializable");
    }
}
