package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.45Q  reason: invalid class name */
public final class AnonymousClass45Q implements Runnable {
    public final /* synthetic */ 26B A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass45Q(26B r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void run() {
        int i;
        byte[] bArr;
        26B r7 = this.A00;
        AnonymousClass450 r1 = r7.A02;
        if (r1 != null) {
            boolean z = !this.A01;
            synchronized (r1) {
                r1.A01 = z;
            }
        }
        if (this.A02) {
            C2605045x A002 = C2605045x.A00();
            boolean z2 = this.A01;
            String A03 = A002.A03(Boolean.valueOf(z2));
            if (A03 != null) {
                C2602144s r0 = r7.A07;
                if (z2) {
                    i = r0.A02;
                } else {
                    i = r0.A01;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AnonymousClass46B r12 = new AnonymousClass46B(new C2605145y((OutputStream) byteArrayOutputStream));
                    r12.A0U(AnonymousClass46G.A03);
                    r12.A0J();
                    r12.A0K();
                    r12.A0U(AnonymousClass46G.A04);
                    r12.A0Q(AnonymousClass46G.A01);
                    r12.A0X(z2);
                    r12.A0Q(AnonymousClass46G.A02);
                    r12.A0O(i);
                    r12.A0Q(AnonymousClass46G.A00);
                    r12.A0V(A03);
                    r12.A0J();
                    r12.A0K();
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (AnonymousClass5I8 unused) {
                    bArr = null;
                }
                C250773m2 r02 = r7.A0F;
                if (r02 != null) {
                    r02.setForeground(z2, bArr, (MqttPublishListener) null);
                    return;
                }
                return;
            }
            return;
        }
        C250773m2 r13 = r7.A0F;
        if (r13 != null) {
            r13.setForeground(this.A01, (byte[]) null, (MqttPublishListener) null);
        }
    }
}
