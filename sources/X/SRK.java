package X;

import android.media.AudioProfile;
import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SRK {
    public static final SRK A02 = new SRK(ImmutableList.of(SOx.A03));
    public static final ImmutableList A03;
    public static final ImmutableMap A04;
    public final SparseArray A00 = Pxe.A0L();
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0115, code lost:
        if ("Xiaomi".equals(r2) == false) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.SRK A00(android.content.Context r10, X.SIH r11) {
        /*
            r3 = 0
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            android.content.Intent r6 = r10.registerReceiver(r3, r0)
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r10.getSystemService(r0)
            r2.getClass()
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r4 = 33
            int r7 = androidx.media3.common.util.Util.A01
            if (r7 < r4) goto L_0x0021
            X.RnP r3 = X.C11052S7x.A01(r2, r11)
        L_0x0021:
            if (r7 < r4) goto L_0x003e
            boolean r0 = androidx.media3.common.util.Util.A0C(r10)
            if (r0 != 0) goto L_0x0039
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x003e
        L_0x0039:
            X.SRK r1 = X.C11052S7x.A00(r2, r11)
            return r1
        L_0x003e:
            r5 = 0
            r1 = 1
            if (r3 != 0) goto L_0x009f
            r2.getClass()
            r0 = 2
            android.media.AudioDeviceInfo[] r8 = r2.getDevices(r0)
        L_0x004a:
            X.1R1 r3 = new X.1R1
            r3.<init>()
            r9 = 2
            java.lang.Integer r2 = X.Pxe.A0n()
            java.lang.Integer r0 = X.Pxe.A0m()
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r0}
            r3.A07(r0)
            r0 = 31
            if (r7 < r0) goto L_0x0081
            r0 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r0}
            r3.A07(r0)
            if (r7 < r4) goto L_0x0081
            r0 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04(r0)
        L_0x0081:
            com.google.common.collect.ImmutableSet r4 = r3.A05()
            int r3 = r8.length
            r2 = 0
        L_0x0087:
            if (r2 >= r3) goto L_0x00a6
            r0 = r8[r2]
            int r0 = r0.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x009c
            X.SRK r1 = A02
            return r1
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0087
        L_0x009f:
            android.media.AudioDeviceInfo r0 = r3.A00
            android.media.AudioDeviceInfo[] r8 = new android.media.AudioDeviceInfo[]{r0}
            goto L_0x004a
        L_0x00a6:
            X.1R1 r4 = new X.1R1
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A04(r0)
            r0 = 29
            r3 = 10
            if (r7 < r0) goto L_0x00f6
            boolean r0 = androidx.media3.common.util.Util.A0C(r10)
            if (r0 != 0) goto L_0x00ce
            android.content.pm.PackageManager r2 = r10.getPackageManager()
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x00f6
        L_0x00ce:
            com.google.common.collect.ImmutableList r0 = X.RS1.A00(r11)
            r4.A06(r0)
        L_0x00d5:
            com.google.common.collect.ImmutableSet r0 = r4.A05()
            int[] r4 = X.1WJ.A04(r0)
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            r2 = 0
            if (r4 != 0) goto L_0x00e6
            int[] r4 = new int[r5]
        L_0x00e6:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x016f
            r1 = r4[r2]
            X.SOx r0 = new X.SOx
            r0.<init>((int) r1, (int) r3)
            r6.add(r0)
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00f6:
            android.content.ContentResolver r8 = r10.getContentResolver()
            java.lang.String r0 = "use_external_surround_sound_flag"
            int r0 = android.provider.Settings.Global.getInt(r8, r0, r5)
            r7 = 1
            if (r0 == r1) goto L_0x0117
            r7 = 0
            java.lang.String r2 = androidx.media3.common.util.Util.A04
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0124
        L_0x0117:
            java.lang.String r0 = "external_surround_sound_enabled"
            int r0 = android.provider.Settings.Global.getInt(r8, r0, r5)
            if (r0 != r1) goto L_0x0124
            com.google.common.collect.ImmutableList r0 = A03
            r4.A06(r0)
        L_0x0124:
            if (r6 == 0) goto L_0x00d5
            if (r7 != 0) goto L_0x00d5
            java.lang.String r0 = "android.media.extra.AUDIO_PLUG_STATE"
            int r0 = r6.getIntExtra(r0, r5)
            if (r0 != r1) goto L_0x00d5
            java.lang.String r0 = "android.media.extra.ENCODINGS"
            int[] r2 = r6.getIntArrayExtra(r0)
            if (r2 == 0) goto L_0x0142
            int r1 = r2.length
            if (r1 != 0) goto L_0x0169
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x013f:
            r4.A06(r0)
        L_0x0142:
            com.google.common.collect.ImmutableSet r0 = r4.A05()
            int[] r4 = X.1WJ.A04(r0)
            java.lang.String r0 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r6.getIntExtra(r0, r3)
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            r2 = 0
            if (r4 != 0) goto L_0x0159
            int[] r4 = new int[r5]
        L_0x0159:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x016f
            r1 = r4[r2]
            X.SOx r0 = new X.SOx
            r0.<init>((int) r1, (int) r3)
            r6.add(r0)
            int r2 = r2 + 1
            goto L_0x0159
        L_0x0169:
            X.4TU r0 = new X.4TU
            r0.<init>(r2, r5, r1)
            goto L_0x013f
        L_0x016f:
            com.google.common.collect.ImmutableList r0 = r6.build()
            X.SRK r1 = new X.SRK
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRK.A00(android.content.Context, X.SIH):X.SRK");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRK)) {
            return false;
        }
        SRK srk = (SRK) obj;
        return Util.A0D(this.A00, srk.A00) && this.A01 == srk.A01;
    }

    static {
        Integer A0q = C66580MXl.A0q();
        Integer A0l = Pxe.A0l();
        A03 = ImmutableList.of(A0q, A0l, 6);
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        A0Q.put(A0l, 6);
        A0Q.put(17, 6);
        A0Q.put(Pxe.A0m(), 6);
        A0Q.put(30, 10);
        A0Q.put(18, 6);
        Integer A0n = Pxe.A0n();
        A0Q.put(6, A0n);
        A0Q.put(A0n, A0n);
        A0Q.put(14, A0n);
        A04 = A0Q.buildOrThrow();
    }

    public final int hashCode() {
        return this.A01 + (Util.A01(this.A00) * 31);
    }

    public SRK(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            SOx sOx = (SOx) list.get(i2);
            this.A00.put(sOx.A00, sOx);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                i3 = Math.max(i3, ((SOx) sparseArray.valueAt(i)).A01);
                i++;
            } else {
                this.A01 = i3;
                return;
            }
        }
    }

    public static ImmutableList A01(List list) {
        int format;
        Collection r1;
        Collection r12;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C66580MXl.A0q(), C66580MXl.A12(new AnonymousClass4TU(new int[]{12}, 0, 1)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = (AudioProfile) list.get(i);
            if (audioProfile.getEncapsulationType() != 1 && ((format = audioProfile.getFormat()) == 3 || format == 2 || format == 268435456 || format == 21 || format == 1342177280 || format == 22 || format == 1610612736 || format == 4 || A04.containsKey(Integer.valueOf(format)))) {
                Integer valueOf = Integer.valueOf(format);
                if (A1E.containsKey(valueOf)) {
                    Object obj = A1E.get(valueOf);
                    obj.getClass();
                    Set set = (Set) obj;
                    int[] channelMasks = audioProfile.getChannelMasks();
                    int length = channelMasks.length;
                    if (length == 0) {
                        r12 = Collections.emptyList();
                    } else {
                        r12 = new AnonymousClass4TU(channelMasks, 0, length);
                    }
                    set.addAll(r12);
                } else {
                    int[] channelMasks2 = audioProfile.getChannelMasks();
                    int length2 = channelMasks2.length;
                    if (length2 == 0) {
                        r1 = Collections.emptyList();
                    } else {
                        r1 = new AnonymousClass4TU(channelMasks2, 0, length2);
                    }
                    A1E.put(valueOf, C66580MXl.A12(r1));
                }
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            SOx sOx = SOx.A03;
            builder.add(new SOx((Set) A1J.getValue(), AnonymousClass7TE.A0M(A1J.getKey())));
        }
        return builder.build();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioCapabilities[maxChannelCount=");
        A1A.append(this.A01);
        A1A.append(", audioProfiles=");
        return Pxg.A0r(this.A00, A1A);
    }
}
