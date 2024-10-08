package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.5xO  reason: invalid class name and case insensitive filesystem */
public final class C300555xO extends AnonymousClass4UC implements AnonymousClass4UE {
    public QPTooltipAnchor A00;
    public Integer A01;
    public String A02;

    public C300555xO(QuickPromotionSurface quickPromotionSurface, AnonymousClass4V7 r10, AnonymousClass5Jm r11, AnonymousClass4VB r12, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        super(quickPromotionSurface, r10, r11, r12, str, i, j, j2, j3, z, z2);
        QPTooltipAnchor qPTooltipAnchor;
        String str2;
        AnonymousClass4VA r7 = r11.A01;
        AnonymousClass4VP A002 = r7.A00("tooltip_anchor");
        Integer num = null;
        if (A002 != null) {
            String str3 = A002.A03;
            QPTooltipAnchor[] values = QPTooltipAnchor.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    qPTooltipAnchor = null;
                    break;
                }
                qPTooltipAnchor = values[i2];
                if (0qQ.A0K(qPTooltipAnchor.A00, str3)) {
                    break;
                }
                i2++;
            }
        } else {
            qPTooltipAnchor = null;
        }
        this.A00 = qPTooltipAnchor;
        AnonymousClass4VP A003 = r7.A00("tooltip_direction");
        if (A003 != null) {
            String str4 = A003.A03;
            Integer[] A004 = AnonymousClass05K.A00(2);
            int length2 = A004.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    num = null;
                    break;
                }
                num = A004[i3];
                if (1 - num.intValue() != 0) {
                    str2 = "UP";
                } else {
                    str2 = "DOWN";
                }
                if (str2.equals(str4)) {
                    break;
                }
                i3++;
            }
        }
        this.A01 = num;
        String str5 = r10.A09.A00;
        this.A02 = str5 == null ? "" : str5;
    }

    public C300555xO() {
    }
}
