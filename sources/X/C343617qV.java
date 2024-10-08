package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7qV  reason: invalid class name and case insensitive filesystem */
public final class C343617qV extends C342687p0 {
    public int A00 = -1;
    public final CameraExtensionCharacteristics A01;
    public final C342687p0 A02;
    public final List A03;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();

    public C343617qV(CameraExtensionCharacteristics cameraExtensionCharacteristics, C342687p0 r5) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = r5;
        this.A01 = cameraExtensionCharacteristics;
        arrayList.add(-1);
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r0.contains(r2) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        if (((java.lang.Boolean) r10.A02.A01(X.C342687p0.A0d)).booleanValue() == false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C342697p1 r11) {
        /*
            r10 = this;
            r4 = r10
            int r3 = r10.A00
            r0 = -1
            if (r0 == r3) goto L_0x002b
            int r1 = r11.A00
            r0 = 41
            if (r1 == r0) goto L_0x010e
            r0 = 52
            if (r1 == r0) goto L_0x00ca
            r0 = 71
            if (r1 == r0) goto L_0x006a
            r0 = 84
            if (r1 == r0) goto L_0x0067
            r0 = 89
            if (r1 == r0) goto L_0x0064
            r0 = 92
            if (r1 == r0) goto L_0x0064
            r0 = 49
            if (r1 == r0) goto L_0x0049
            r0 = 50
            if (r1 == r0) goto L_0x00e4
            switch(r1) {
                case 79: goto L_0x0032;
                case 80: goto L_0x0032;
                case 81: goto L_0x0032;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.7p0 r0 = r10.A02
            java.lang.Object r0 = r0.A01(r11)
            return r0
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.util.Map r1 = r10.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0064
            goto L_0x002b
        L_0x0049:
            java.util.Map r0 = r10.A06
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0103
            int r9 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 1
            r8 = 256(0x100, float:3.59E-43)
            X.7p1 r6 = X.C342687p0.A10
            goto L_0x00fc
        L_0x0064:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x006a:
            java.util.Map r0 = r10.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0103
            java.util.Map r3 = r10.A07
            int r1 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L_0x0098
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.7p1 r6 = X.C342687p0.A0t
            r7 = 1
            r8 = 35
            java.util.List r1 = r4.A00(r5, r6, r7, r8, r9)
            r3.put(r2, r1)
        L_0x0098:
            int r1 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00be
            X.7p0 r2 = r10.A02
            X.7p1 r1 = X.C342687p0.A0d
            java.lang.Object r1 = r2.A01(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            r1 = 1
            if (r2 != 0) goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            int r1 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00ca:
            java.util.Map r0 = r10.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0103
            int r9 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.7p1 r6 = X.C342687p0.A0t
            r7 = 1
            r8 = 35
            goto L_0x00fc
        L_0x00e4:
            java.util.Map r0 = r10.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0103
            int r9 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 0
            X.7p1 r6 = X.C342687p0.A14
            r8 = r7
        L_0x00fc:
            java.util.List r2 = r4.A00(r5, r6, r7, r8, r9)
        L_0x0100:
            r0.put(r1, r2)
        L_0x0103:
            int r1 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            return r0
        L_0x010e:
            java.util.List r0 = r10.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343617qV.A01(X.7p1):java.lang.Object");
    }

    private List A00(CameraExtensionCharacteristics cameraExtensionCharacteristics, C342697p1 r9, int i, int i2, int i3) {
        List extensionSupportedSizes;
        List list;
        if (cameraExtensionCharacteristics == null) {
            return Collections.emptyList();
        }
        if (i == 1) {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2);
        } else {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
        }
        if (extensionSupportedSizes == null || extensionSupportedSizes.isEmpty()) {
            list = Collections.emptyList();
        } else {
            int size = extensionSupportedSizes.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new C343047pa(((Size) extensionSupportedSizes.get(i4)).getWidth(), ((Size) extensionSupportedSizes.get(i4)).getHeight()));
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return C343037pZ.A00((List) this.A02.A01(r9), list);
    }

    public final void A02(int i) {
        this.A00 = i;
        if (i != -1) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
            }
        }
    }
}
