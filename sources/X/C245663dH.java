package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3dH  reason: invalid class name and case insensitive filesystem */
public final class C245663dH {
    public final int A00;
    public final long A01;
    public final 01c A02;
    public final RenderTreeNode A03;
    public final List A04;
    public final RenderTreeNode[] A05;

    public C245663dH(01c r16, RenderTreeNode renderTreeNode, List list, RenderTreeNode[] renderTreeNodeArr, int i, long j) {
        RenderTreeNode[] renderTreeNodeArr2 = renderTreeNodeArr;
        0qQ.A0B(renderTreeNodeArr2, 2);
        this.A03 = renderTreeNode;
        this.A05 = renderTreeNodeArr2;
        this.A01 = j;
        this.A00 = i;
        this.A04 = list;
        01c r0 = r16;
        if (r16 != null) {
            this.A02 = r0;
            return;
        }
        int length = renderTreeNodeArr2.length;
        this.A02 = new 01c(length);
        int i2 = 0;
        while (i2 < length) {
            01c r5 = this.A02;
            RenderTreeNode[] renderTreeNodeArr3 = this.A05;
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr3[i2];
            int intValue = ((Number) r5.A06(renderTreeNode2.A06.A0H(), -1)).intValue();
            if (intValue == -1) {
                this.A02.A09(this.A05[i2].A06.A0H(), Integer.valueOf(i2));
                i2++;
            } else {
                RenderTreeNode renderTreeNode3 = renderTreeNodeArr3[intValue];
                long A0H = renderTreeNode2.A06.A0H();
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i2);
                String A002 = renderTreeNode2.A00((C245663dH) null);
                Integer valueOf2 = Integer.valueOf(intValue);
                String A003 = renderTreeNode3.A00((C245663dH) null);
                StringBuilder sb = new StringBuilder();
                sb.append("RenderTree details:\n");
                String format = String.format(locale, "Full child list (size = %d):\n", Arrays.copyOf(new Object[]{Integer.valueOf(r4)}, 1));
                0qQ.A07(format);
                sb.append(format);
                for (RenderTreeNode A004 : renderTreeNodeArr3) {
                    String format2 = String.format(locale, "%s\n", Arrays.copyOf(new Object[]{A004.A00(this)}, 1));
                    0qQ.A07(format2);
                    sb.append(format2);
                }
                String obj = sb.toString();
                0qQ.A07(obj);
                String format3 = String.format(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", Arrays.copyOf(new Object[]{valueOf, A002, valueOf2, A003, obj}, 5));
                0qQ.A07(format3);
                throw new V21(A0H, format3);
            }
        }
    }

    public final int A00() {
        return this.A03.A03.height();
    }

    public final int A01() {
        return this.A03.A03.width();
    }
}
