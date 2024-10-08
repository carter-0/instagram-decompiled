package X;

import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

/* renamed from: X.IoD  reason: case insensitive filesystem */
public final class C58209IoD extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58209IoD(Object obj, Object obj2, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy = (IMqttSubscribeListener$Stub$Proxy) this.A02;
                String str = this.A04;
                byte[] bArr = (byte[]) this.A03;
                long j = this.A01;
                int A032 = AnonymousClass0fD.A03(-1445684537);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Pxd.A00(680));
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    iMqttSubscribeListener$Stub$Proxy.A00.transact(1, obtain, (Parcel) null, 1);
                    break;
                } finally {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-442580223, A032);
                }
            case 1:
                C55703Hm0 hm0 = (C55703Hm0) this.A02;
                String str2 = this.A04;
                AnonymousClass95J r2 = hm0.A01;
                String A002 = AnonymousClass000.A00(4287);
                String str3 = hm0.A02;
                int i = hm0.A00;
                String A0V = 002.A0V(A002, str3, '_', i);
                0qQ.A0B(A0V, 0);
                0xa r4 = ((AnonymousClass95I) r2).A00;
                0xY AR4 = r4.AR4();
                AR4.E5g(A0V, str2);
                AR4.apply();
                long j2 = this.A01;
                String A0V2 = 002.A0V(AnonymousClass000.A00(4288), str3, '_', i);
                0qQ.A0B(A0V2, 0);
                0xY AR42 = r4.AR4();
                AR42.E5c(A0V2, j2);
                AR42.apply();
                ((AnonymousClass95H) this.A03).A00.markerEnd(966997352, 2);
                break;
            case 2:
                C61058Jvw jvw = ((AnonymousClass6DL) ((C299575vQ) this.A03)).A01;
                String str4 = jvw.A03;
                ((C299635va) this.A02).CqF(2EG.A2q, str4, this.A04, jvw.A05, this.A01);
                break;
            default:
                C61058Jvw jvw2 = ((C53333GmJ) this.A03).A00;
                if (jvw2 != null) {
                    String str5 = this.A04;
                    long j3 = this.A01;
                    ((C299635va) this.A02).CqF(2EG.A2q, jvw2.A03, str5, jvw2.A05, j3);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
