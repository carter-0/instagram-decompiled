package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.VuD  reason: case insensitive filesystem */
public final class C18561VuD {
    public final 2cs A00;
    public final C243403Yq A01;
    public final C238133Ar A02;
    public final HashMap A03 = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C18561VuD r3, int r4) {
        /*
            X.3Ar r1 = r3.A02
            X.2rL r0 = r1.AZK()
            if (r0 == 0) goto L_0x006c
            X.2rL r0 = r1.AZK()
            java.lang.Object r3 = r0.getItem(r4)
            X.2rL r0 = r1.AZK()
            java.lang.Object r2 = r0.getAdapter()
            boolean r0 = r2 instanceof X.2Ru
            if (r0 != 0) goto L_0x0065
            boolean r0 = r2 instanceof X.C331047Ph
            if (r0 == 0) goto L_0x004d
            android.widget.BaseAdapter r2 = (android.widget.BaseAdapter) r2
            int r0 = r2.getItemViewType(r4)
        L_0x0026:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            boolean r0 = r3 instanceof X.AnonymousClass1Xn
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.1Xn r3 = (X.AnonymousClass1Xn) r3
            java.lang.String r0 = r3.getId()
        L_0x0039:
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            return r0
        L_0x003e:
            boolean r0 = r3 instanceof X.C229122ms
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "ITEM_ID_LOAD_MORE"
            return r0
        L_0x0045:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ITEM_ID_OTHERS"
            goto L_0x0039
        L_0x004d:
            boolean r0 = r2 instanceof X.AnonymousClass2t9
            if (r0 != 0) goto L_0x0065
            java.lang.String r1 = "unsupported adapter type: "
            if (r2 != 0) goto L_0x0060
            r0 = 0
        L_0x0056:
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0060:
            java.lang.String r0 = X.C51968G9o.A16(r2)
            goto L_0x0056
        L_0x0065:
            X.2Rw r2 = (X.2Rw) r2
            int r0 = r2.getItemViewType(r4)
            goto L_0x0026
        L_0x006c:
            java.lang.String r1 = "unsupported adapter type: null"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18561VuD.A00(X.VuD, int):java.lang.String");
    }

    public final void A01() {
        ArrayList arrayList = new ArrayList();
        C238133Ar r6 = this.A02;
        int B6L = r6.B6L();
        int i = 0;
        if (r6.AZK() != null) {
            int i2 = 0;
            while (i < r6.AnH()) {
                int i3 = B6L + i;
                View AnC = r6.AnC(i);
                if (i3 >= r6.AZK().getCount()) {
                    0wb.A03("ListViewItemTransformAnimationHelper", StringFormatUtil.formatStrLocaleSafe("IndexOutOfBounds in %s. Index %d, count is %d.", C51968G9o.A16(r6.AZK()), Integer.valueOf(i3), Integer.valueOf(r6.AnH())));
                } else {
                    Object item = r6.AZK().getItem(i3);
                    C66581MXm.A1S(002.A0O(A00(this, i3), AnC.hashCode()), this.A03, AnC.getTop());
                    if (item != null && this.A01.CVz(item, AnC.getTag())) {
                        arrayList.add(AnC);
                        i2 += AnC.getHeight();
                    }
                }
                i++;
            }
            i = i2;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(100);
        duration.addListener(new C16310Use(this, arrayList, i));
        duration.addUpdateListener(new W4K(4, this, arrayList));
        duration.start();
    }

    public C18561VuD(C243403Yq r4, C238133Ar r5) {
        this.A02 = r5;
        this.A01 = r4;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C71392co.A00());
        A0J.A02();
        this.A00 = A0J;
        A0J.A0A(new C15165UTq(this, 3));
    }
}
