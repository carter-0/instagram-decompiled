package X;

import com.facebook.quicklog.MarkerEditor;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* renamed from: X.2t4  reason: invalid class name */
public class AnonymousClass2t4 {
    public final AnonymousClass2t5 A00 = new AnonymousClass2t5();
    public final List A01;

    public final AnonymousClass5IN A00(AnonymousClass4VR r21, AnonymousClass426 r22) {
        AnonymousClass4VR r6 = r21;
        0qQ.A0B(r6, 0);
        AnonymousClass426 r9 = r22;
        AnonymousClass429 r3 = r9.A02;
        try {
            for (C232022sn r10 : this.A01) {
                String FNO = r10.FNO();
                if (FNO != null) {
                    AnonymousClass2t5 r11 = this.A00;
                    String str = ((AnonymousClass4VQ) r6).A01.A0D;
                    MarkerEditor withMarker = r11.A00.withMarker(716778457, 0);
                    0qQ.A0A(withMarker);
                    2bM r12 = r11.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("waterfall_");
                    sb.append(FNO);
                    sb.append('_');
                    sb.append(str);
                    sb.append("_start");
                    withMarker.point(r12.A00(sb.toString(), false, false));
                    withMarker.annotate("promotion_id", str);
                    withMarker.markerEditingCompleted();
                }
                AnonymousClass5IN ABt = r10.ABt(r6, r9);
                if (ABt.A07) {
                    if (FNO != null) {
                        r3.A00(ABt.A00, ((AnonymousClass4VQ) r6).A01.A0D, FNO, true);
                    }
                    if (ABt.A06) {
                        return ABt;
                    }
                    if (FNO != null) {
                        AnonymousClass2t5 r112 = this.A00;
                        String str2 = ((AnonymousClass4VQ) r6).A01.A0D;
                        MarkerEditor withMarker2 = r112.A00.withMarker(716778457, 0);
                        0qQ.A0A(withMarker2);
                        2bM r113 = r112.A01;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("waterfall_");
                        sb2.append(FNO);
                        sb2.append('_');
                        sb2.append(str2);
                        sb2.append("_end");
                        withMarker2.point(r113.A00(sb2.toString(), false, false));
                        withMarker2.annotate("promotion_id", str2);
                        withMarker2.markerEditingCompleted();
                    }
                } else if (FNO == null) {
                    return ABt;
                } else {
                    AnonymousClass4UC r5 = ((AnonymousClass4VQ) r6).A01;
                    r3.A00(ABt.A00, r5.A0D, FNO, false);
                    AnonymousClass2t5 r4 = this.A00;
                    String str3 = r5.A0D;
                    MarkerEditor withMarker3 = r4.A00.withMarker(716778457, 0);
                    0qQ.A0A(withMarker3);
                    2bM r42 = r4.A01;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("waterfall_");
                    sb3.append(FNO);
                    sb3.append('_');
                    sb3.append(str3);
                    sb3.append("_fail");
                    withMarker3.point(r42.A00(sb3.toString(), false, false));
                    withMarker3.annotate("promotion_id", str3);
                    withMarker3.markerEditingCompleted();
                    return ABt;
                }
            }
            return AnonymousClass5IM.A00();
        } catch (Exception e) {
            if (0 != 0) {
                String str4 = ((AnonymousClass4VQ) r6).A01.A0D;
                String message = e.getMessage();
                if (message == null) {
                    message = "[null]";
                }
                1Ln r32 = (1Ln) r3.A01.invoke(r3.A00);
                if (r32.A00.isSampled()) {
                    r32.A0Q("promotion_id", Long.valueOf(Long.parseLong(str4)));
                    r32.A0R("step", (String) null);
                    r32.A0R("eligibility_result", "Fail");
                    ImmutableMap of = ImmutableMap.of("exception", message);
                    0qQ.A07(of);
                    if (!of.isEmpty()) {
                        r32.A0x(of);
                    }
                    r32.Cgf();
                }
            }
            return new AnonymousClass5IN((AnonymousClass5IP) null, (AnonymousClass4VV) null, (AnonymousClass4VU) null, (Integer) null, e.getMessage(), e, false, false, false);
        }
    }

    public AnonymousClass2t4(List list) {
        this.A01 = list;
    }
}
