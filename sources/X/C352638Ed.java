package X;

import java.util.LinkedHashMap;

/* renamed from: X.8Ed  reason: invalid class name and case insensitive filesystem */
public final class C352638Ed implements C3495480u {
    public final /* synthetic */ C358088aL A00;
    public final /* synthetic */ AnonymousClass8EP A01;
    public final /* synthetic */ LinkedHashMap A02;

    public C352638Ed(C358088aL r1, AnonymousClass8EP r2, LinkedHashMap linkedHashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C352618Eb.A00(r4) == r6) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            int r6 = r13.intValue()
            X.8EP r5 = r12.A01
            com.instagram.common.session.UserSession r11 = r5.A07
            X.8aL r4 = r12.A00
            boolean r0 = X.C352618Eb.A06(r4)
            if (r0 == 0) goto L_0x0019
            int r0 = X.C352618Eb.A00(r4)
            r2 = 1
            if (r0 != r6) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.util.LinkedHashMap r0 = r12.A02
            java.lang.Object r3 = r0.get(r4)
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r3 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r3
            if (r3 == 0) goto L_0x008d
            r3.setSelected(r2)
            android.view.ViewGroup r0 = r5.A05
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            float r0 = r1.getDimension(r0)
            int r9 = (int) r0
            boolean r8 = r5.A09
            if (r8 != 0) goto L_0x0043
            r7 = 1
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            java.util.List r2 = X.C347067wD.A01(r11, r4)
            r1 = 0
            if (r6 < 0) goto L_0x005f
            int r0 = r2.size()
            if (r6 >= r0) goto L_0x005f
            java.lang.Object r0 = X.00k.A0O(r2, r6)
            X.7wI r0 = (X.C347117wI) r0
            if (r0 == 0) goto L_0x005f
            int r0 = r0.A01
            android.graphics.drawable.Drawable r1 = X.C347067wD.A00(r10, r0, r9, r7)
        L_0x005f:
            r3.A05 = r1
            r0 = 0
            r3.A06 = r0
            r3.invalidate()
            if (r8 == 0) goto L_0x007e
            r3.A06 = r0
            r0 = 1
            r3.A0B = r0
            r3.postInvalidate()
            X.AjT r2 = new X.AjT
            r2.<init>(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A01(r2)
            X.11Z.A04(r2, r0)
        L_0x007e:
            r3.postInvalidate()
            X.8aL r0 = X.C358088aL.A10
            if (r4 != r0) goto L_0x008d
            X.7kS r0 = new X.7kS
            r0.<init>(r4, r5, r6)
            X.03v.A0B(r3, r0)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352638Ed.onChanged(java.lang.Object):void");
    }
}
