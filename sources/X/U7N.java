package X;

import android.os.Bundle;
import android.view.View;

public final class U7N extends 02Z {
    public final int A00;
    public final Object A01;

    public U7N(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        switch (this.A00) {
            case 0:
                return ((C14912UEu) this.A01).A00.A0V(view, i, bundle);
            case 1:
                if (i == 1048576) {
                    QAL qal = (QAL) this.A01;
                    if (qal.A04) {
                        qal.cancel();
                        return true;
                    }
                }
                break;
            case 5:
                if (i == 1048576) {
                    ((W1m) this.A01).A07(3);
                    return true;
                }
                break;
        }
        return U7N.super.A0V(view, i, bundle);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(android.view.View r4, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0049;
                case 2: goto L_0x0005;
                case 3: goto L_0x002a;
                case 4: goto L_0x0005;
                case 5: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.U7N.super.A0Y(r4, r5)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            r0.setCollectionInfo(r1)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r3.A01
            X.UEu r1 = (X.C14912UEu) r1
            X.02Z r0 = r1.A00
            r0.A0Y(r4, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A02
            int r2 = androidx.recyclerview.widget.RecyclerView.A03(r4)
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.UAT
            if (r0 == 0) goto L_0x000e
            X.UAT r1 = (X.UAT) r1
            r1.A02(r2)
            return
        L_0x002a:
            X.U7N.super.A0Y(r4, r5)
            java.lang.Object r2 = r3.A01
            X.QCH r2 = (X.QCH) r2
            android.view.View r0 = r2.A00
            int r1 = r0.getVisibility()
            r0 = 2131967677(0x7f133ebd, float:1.9572227E38)
            if (r1 != 0) goto L_0x003f
            r0 = 2131967678(0x7f133ebe, float:1.957223E38)
        L_0x003f:
            java.lang.String r1 = r2.getString(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            r0.setHintText(r1)
            return
        L_0x0049:
            X.U7N.super.A0Y(r4, r5)
            java.lang.Object r0 = r3.A01
            X.QAL r0 = (X.QAL) r0
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x005e
            r1 = 0
        L_0x0055:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            r0.setDismissable(r1)
            return
        L_0x005b:
            X.U7N.super.A0Y(r4, r5)
        L_0x005e:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r5.addAction(r0)
            r1 = 1
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7N.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
