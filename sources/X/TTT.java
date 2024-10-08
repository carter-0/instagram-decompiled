package X;

import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

public final class TTT extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTT(Object obj, String str, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            TTT.super.CiF(this.A03, this.A01, this.A04);
        } else {
            IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy = (IMqttSubscribeListener$Stub$Proxy) this.A02;
            String str = this.A03;
            boolean z = this.A04;
            int i = this.A01;
            int A032 = AnonymousClass0fD.A03(862514194);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttSubscribeListener");
                obtain.writeString(str);
                obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
                obtain.writeInt(i);
                iMqttSubscribeListener$Stub$Proxy.A00.transact(2, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
                AnonymousClass0fD.A0A(-416007785, A032);
            }
        }
        return C60340gF.A00;
    }
}
