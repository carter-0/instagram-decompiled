package X;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.UUID;

public final class WMG implements C21005X9c {
    public static final X30 A03 = new WME();
    public int A00 = 1;
    public final MediaDrm A01;
    public final UUID A02;

    public final int At5() {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17189VLt BK8(java.util.HashMap r19, java.util.List r20, byte[] r21, int r22) {
        /*
            r18 = this;
            r6 = 0
            r3 = r18
            r8 = r20
            if (r20 == 0) goto L_0x0095
            java.util.UUID r5 = r3.A02
            java.util.UUID r0 = X.AnonymousClass4T7.A04
            boolean r0 = r0.equals(r5)
            r4 = 0
            if (r0 == 0) goto L_0x008e
            r2 = 1
            int r0 = r8.size()
            if (r0 <= r2) goto L_0x006e
            java.lang.Object r9 = r8.get(r4)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r9
            r7 = 0
            r6 = 0
        L_0x0021:
            int r0 = r8.size()
            if (r7 >= r0) goto L_0x0051
            java.lang.Object r11 = r8.get(r7)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r11 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r11
            byte[] r10 = r11.A04
            r10.getClass()
            java.lang.String r1 = r11.A02
            java.lang.String r0 = r9.A02
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = r11.A01
            java.lang.String r0 = r9.A01
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x006e
            X.Ruo r0 = X.C11303SKn.A00(r10)
            if (r0 == 0) goto L_0x006e
            int r0 = r10.length
            int r6 = r6 + r0
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0051:
            byte[] r7 = new byte[r6]
            r6 = 0
            r2 = 0
        L_0x0055:
            int r0 = r8.size()
            if (r6 >= r0) goto L_0x0099
            java.lang.Object r0 = r8.get(r6)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r0
            byte[] r1 = r0.A04
            r1.getClass()
            int r0 = r1.length
            java.lang.System.arraycopy(r1, r4, r7, r2, r0)
            int r2 = r2 + r0
            int r6 = r6 + 1
            goto L_0x0055
        L_0x006e:
            r1 = 0
        L_0x006f:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x008e
            java.lang.Object r6 = r8.get(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r6
            byte[] r0 = r6.A04
            r0.getClass()
            X.Ruo r0 = X.C11303SKn.A00(r0)
            if (r0 == 0) goto L_0x008b
            int r0 = r0.A00
            if (r0 != r2) goto L_0x008b
            goto L_0x00a4
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x008e:
            java.lang.Object r6 = r8.get(r4)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r6
            goto L_0x00a4
        L_0x0095:
            r14 = r6
            r15 = r6
            goto L_0x01b5
        L_0x0099:
            java.util.UUID r2 = r9.A03
            java.lang.String r1 = r9.A01
            java.lang.String r0 = r9.A02
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            r6.<init>(r1, r0, r2, r7)
        L_0x00a4:
            byte[] r14 = r6.A04
            r14.getClass()
            java.util.UUID r7 = X.AnonymousClass4T7.A02
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x017a
            byte[] r0 = X.C11303SKn.A01(r5, r14)
            if (r0 == 0) goto L_0x00b8
            r14 = r0
        L_0x00b8:
            X.4XV r12 = new X.4XV
            r12.<init>((byte[]) r14)
            byte[] r10 = r12.A02
            int r0 = r12.A01
            int r8 = r0 + 1
            byte r0 = r10[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r8 + 1
            byte r0 = r10[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r2 | r0
            int r8 = r1 + 1
            byte r0 = r10[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r2 = r2 | r0
            int r1 = r8 + 1
            r12.A01 = r1
            byte r0 = r10[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r13 = r0 << 24
            r13 = r13 | r2
            int r8 = r1 + 1
            byte r0 = r10[r1]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r8 + 1
            r12.A01 = r1
            byte r0 = r10[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r2
            short r8 = (short) r0
            int r9 = r1 + 1
            byte r0 = r10[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r9 + 1
            r12.A01 = r2
            byte r0 = r10[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            java.lang.String r1 = "FrameworkMediaDrm"
            r9 = 1
            if (r8 != r9) goto L_0x0200
            if (r0 != r9) goto L_0x0200
            int r11 = r2 + 1
            byte r0 = r10[r2]
            r8 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r11 + 1
            r12.A01 = r2
            byte r0 = r10[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r8
            short r0 = (short) r0
            java.nio.charset.Charset r8 = X.AnonymousClass2RN.A04
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10, r2, r0, r8)
            java.lang.String r0 = "<LA_URL>"
            boolean r0 = r11.contains(r0)
            if (r0 != 0) goto L_0x0175
            java.lang.String r0 = "</DATA>"
            int r10 = r11.indexOf(r0)
            r0 = -1
            if (r10 != r0) goto L_0x013e
            java.lang.String r0 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            X.2AG.A04(r1, r0)
        L_0x013e:
            java.lang.String r2 = r11.substring(r4, r10)
            java.lang.String r1 = "<LA_URL>https://x</LA_URL>"
            java.lang.String r0 = r11.substring(r10)
            java.lang.String r4 = X.002.A0g(r2, r1, r0)
            int r2 = r13 + 52
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r0)
            r1.putInt(r2)
            r1.putShort(r9)
            r1.putShort(r9)
            int r0 = r4.length()
            int r0 = r0 * 2
            short r0 = (short) r0
            r1.putShort(r0)
            byte[] r0 = r4.getBytes(r8)
            r1.put(r0)
            byte[] r14 = r1.array()
        L_0x0175:
            r0 = 0
            byte[] r14 = X.C11303SKn.A02(r7, r14, r0)
        L_0x017a:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x01b3
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b3
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "AFTB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "AFTS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "AFTM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "AFTT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b3
        L_0x01ac:
            byte[] r0 = X.C11303SKn.A01(r5, r14)
            if (r0 == 0) goto L_0x01b3
            r14 = r0
        L_0x01b3:
            java.lang.String r15 = r6.A02
        L_0x01b5:
            android.media.MediaDrm r12 = r3.A01
            r17 = r19
            r13 = r21
            r16 = r22
            android.media.MediaDrm$KeyRequest r5 = r12.getKeyRequest(r13, r14, r15, r16, r17)
            java.util.UUID r1 = r3.A02
            byte[] r4 = r5.getData()
            java.util.UUID r0 = X.AnonymousClass4T7.A00
            r0.equals(r1)
            java.lang.String r3 = r5.getDefaultUrl()
            java.lang.String r0 = "<LA_URL>https://x</LA_URL>"
            boolean r0 = r0.equals(r3)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x01e8
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 33
            if (r1 != r0) goto L_0x01fe
            java.lang.String r0 = "https://default.url"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01fe
        L_0x01e8:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x01f5
            if (r6 == 0) goto L_0x01f5
            java.lang.String r0 = r6.A01
            android.text.TextUtils.isEmpty(r0)
        L_0x01f5:
            r5.getRequestType()
            X.VLt r0 = new X.VLt
            r0.<init>(r4)
            return r0
        L_0x01fe:
            r2 = r3
            goto L_0x01e8
        L_0x0200:
            X.2AG.A02()
            goto L_0x0175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WMG.BK8(java.util.HashMap, java.util.List, byte[], int):X.VLt");
    }

    public final synchronized void release() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A01.release();
        }
    }

    public final void AI9(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    public final /* bridge */ /* synthetic */ X10 ALl(byte[] bArr) {
        UUID uuid = this.A02;
        return new WM4(new MediaCrypto(uuid, bArr), uuid, bArr);
    }

    public final C10457RsY Bi7() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new C10457RsY(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public final byte[] E1G() {
        return this.A01.openSession();
    }

    public final byte[] E4w(byte[] bArr, byte[] bArr2) {
        AnonymousClass4T7.A00.equals(this.A02);
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    public final void E4y(byte[] bArr) {
        this.A01.provideProvisionResponse(bArr);
    }

    public final Map E5n(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    public final boolean EHl(byte[] bArr, String str) {
        if (Util.A00 >= 31) {
            return C18107Vlb.A01(this.A01, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.A02, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public final void EIu(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    public final void EeO(X14 x14) {
        this.A01.setOnEventListener(new W60(x14, this));
    }

    public final void Eg5(C264894Rs r3, byte[] bArr) {
        if (Util.A00 >= 31) {
            try {
                C18107Vlb.A00(this.A01, r3, bArr);
            } catch (UnsupportedOperationException unused) {
                2AG.A04("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public final void EhO(String str, String str2) {
        this.A01.setPropertyString("securityLevel", str2);
    }

    public WMG(UUID uuid) {
        uuid.getClass();
        C256703wD.A05(!AnonymousClass4T7.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A02 = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.A01 = mediaDrm;
        if (AnonymousClass4T7.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }
}
