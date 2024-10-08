package com.facebook.rendercore;

import X.0eO;
import X.0qQ;
import X.2Th;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C245503d1;
import X.C245663dH;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final RenderTreeNode A05;
    public final 2Th A06;
    public final Object A07;
    public final AnonymousClass0eM A08;

    public final String A00(C245663dH r20) {
        int i;
        long j;
        2Th r0 = this.A06;
        long A0H = r0.A0H();
        String A042 = r0.A04();
        C245663dH r02 = r20;
        if (r20 != null) {
            i = ((Number) r02.A02.A06(A0H, -1)).intValue();
        } else {
            i = -1;
        }
        String shortString = this.A03.toShortString();
        0qQ.A07(shortString);
        int size = ((List) this.A08.getValue()).size();
        RenderTreeNode renderTreeNode = this.A05;
        if (renderTreeNode != null) {
            j = renderTreeNode.A06.A0H();
        } else {
            j = -1;
        }
        String format = String.format(Locale.US, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(new Object[]{Long.valueOf(A0H), A042, Integer.valueOf(i), Integer.valueOf(this.A02), shortString, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(size), Long.valueOf(j)}, 9));
        0qQ.A07(format);
        return format;
    }

    public final void A01(Rect rect) {
        int i = this.A00;
        rect.left = i;
        int i2 = this.A01;
        rect.top = i2;
        Rect rect2 = this.A03;
        rect.right = i + rect2.width();
        rect.bottom = i2 + rect2.height();
    }

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, 2Th r7, Object obj, int i) {
        int i2;
        this.A05 = renderTreeNode;
        this.A06 = r7;
        this.A07 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        int i3 = 0;
        if (renderTreeNode != null) {
            i2 = renderTreeNode.A00;
        } else {
            i2 = 0;
        }
        this.A00 = i2 + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : i3) + rect.top;
        this.A08 = AnonymousClass0eN.A00(0eO.A02, C245503d1.A00);
    }
}
