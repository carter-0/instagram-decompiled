package X;

import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.aiplatform.processors.smartcrop.SaliencyDetectionProcessor;
import java.util.List;

/* renamed from: X.Xvu  reason: case insensitive filesystem */
public final class C22130Xvu implements AnonymousClass8CQ {
    public final int A00;
    public final Object A01;

    public C22130Xvu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D5A(Exception exc, List list) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    C39701A5r a5r = (C39701A5r) this.A01;
                    a5r.A00 = A00(list, 0);
                    list.get(0);
                    if (a5r.A01 == null) {
                        a5r.A01 = C347997xi.A00(a5r.A00);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    XHF xhf = (XHF) this.A01;
                    xhf.A00 = A00(list, 0);
                    list.get(0);
                    if (xhf.A01 == null && xhf.A08()) {
                        C39660A4a A002 = C39660A4a.A00(xhf.A00, 0);
                        A002.A00.loadMethod("forward");
                        xhf.A01 = A002;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    AnonymousClass8K5 r5 = (AnonymousClass8K5) list.get(0);
                    AnonymousClass9ZF r4 = (AnonymousClass9ZF) this.A01;
                    r4.A01 = r5.A01;
                    List list2 = AnonymousClass8Eg.SCENEX_EXECUTORCH.A03;
                    Object A0J = 00k.A0J(list2);
                    String str = null;
                    if (A0J != null) {
                        Object obj = r5.A03.get(A0J);
                        if (obj == null) {
                            obj = null;
                        }
                        r4.A02 = (String) obj;
                    }
                    Object A0L = 00k.A0L(list2);
                    if (A0L != null) {
                        Object obj2 = r5.A03.get(A0L);
                        if (obj2 != null) {
                            str = obj2;
                        }
                        r4.A00 = str;
                    }
                    AnonymousClass9ZF.A00(r4);
                    return;
                }
                return;
            case 3:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    XHJ xhj = (XHJ) this.A01;
                    xhj.A01 = A00(list, 0);
                    list.get(0);
                    if (xhj.A02 == null && xhj.A08()) {
                        C39660A4a A003 = C39660A4a.A00(xhj.A01, 0);
                        A003.A00.loadMethod("forward");
                        xhj.A02 = A003;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                0qQ.A0B(list, 0);
                if (!list.isEmpty()) {
                    XHG xhg = (XHG) this.A01;
                    xhg.A03 = A00(list, 0);
                    xhg.A04 = A00(list, 1);
                    Integer num = ((AnonymousClass8K5) list.get(1)).A00;
                    if ((num == null || num.intValue() >= 9020) && xhg.A08()) {
                        String str2 = xhg.A03;
                        if (str2 != null) {
                            SaliencyDetectionProcessor saliencyDetectionProcessor = new SaliencyDetectionProcessor(new AQ5(AnonymousClass7TE.A1I(str2)));
                            xhg.A01 = saliencyDetectionProcessor;
                            saliencyDetectionProcessor.A02.AUy(new C22130Xvu(saliencyDetectionProcessor, 6), true);
                        }
                        String str3 = xhg.A04;
                        if (str3 != null) {
                            SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV2 = new SegmentAnythingOnDeviceProcessorV2(new AQ5(AnonymousClass7TE.A1I(str3)));
                            xhg.A00 = segmentAnythingOnDeviceProcessorV2;
                            segmentAnythingOnDeviceProcessorV2.CgM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV22 = (SegmentAnythingOnDeviceProcessorV2) this.A01;
                    segmentAnythingOnDeviceProcessorV22.A01 = A00(list, 0);
                    list.get(0);
                    if (segmentAnythingOnDeviceProcessorV22.A02 == null && segmentAnythingOnDeviceProcessorV22.A08()) {
                        segmentAnythingOnDeviceProcessorV22.A02 = C347997xi.A00(segmentAnythingOnDeviceProcessorV22.A01);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    SaliencyDetectionProcessor saliencyDetectionProcessor2 = (SaliencyDetectionProcessor) this.A01;
                    String A004 = A00(list, 0);
                    saliencyDetectionProcessor2.A00 = A004;
                    if (saliencyDetectionProcessor2.A01 == null) {
                        saliencyDetectionProcessor2.A01 = C347997xi.A00(A004);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                0qQ.A0B(list, 0);
                if (AnonymousClass7TE.A1b(list)) {
                    XHI xhi = (XHI) this.A01;
                    xhi.A00 = A00(list, 0);
                    if (xhi.A01 == null && xhi.CaO()) {
                        try {
                            xhi.A01 = C347997xi.A00(xhi.A00);
                            return;
                        } catch (Exception unused) {
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                0qQ.A0B(list, 0);
                if ((!list.isEmpty()) && list.size() > 1) {
                    XHH xhh = (XHH) this.A01;
                    xhh.A04 = A00(list, 0);
                    xhh.A03 = A00(list, 1);
                    if (xhh.A08()) {
                        String str4 = xhh.A04;
                        if (str4 != null) {
                            XHI xhi2 = new XHI(new AQ5(AnonymousClass7TE.A1I(str4)));
                            xhh.A01 = xhi2;
                            xhi2.CgM();
                        }
                        String str5 = xhh.A03;
                        if (str5 != null) {
                            XHJ xhj2 = new XHJ(new AQ5(AnonymousClass7TE.A1I(str5)));
                            xhh.A00 = xhj2;
                            xhj2.CgM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public static String A00(List list, int i) {
        return ((AnonymousClass8K5) list.get(i)).A01;
    }
}
