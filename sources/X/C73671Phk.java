package X;

import android.os.Parcel;
import android.widget.ImageView;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;

/* renamed from: X.Phk  reason: case insensitive filesystem */
public final class C73671Phk extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73671Phk(Object obj, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass61R r6;
        switch (this.A00) {
            case 2:
                int i = this.A01;
                C69106Nel nel = (C69106Nel) this.A02;
                if (i <= 1) {
                    C69106Nel.A03(nel, i - 1, this.A03);
                    break;
                } else {
                    C67010Mgi mgi = nel.A04;
                    if (mgi != null) {
                        long j = nel.A05.A02;
                        int A002 = C69106Nel.A00(nel, i - 1);
                        ImageView imageView = (ImageView) nel.A0H.getValue();
                        AnonymousClass61R r1 = (AnonymousClass61R) nel.A0K.getValue();
                        C72278Ozn ozn = new C72278Ozn(nel, i, this.A03);
                        if (r1 != null) {
                            r6 = r1;
                        } else {
                            r6 = mgi.A0D;
                        }
                        mgi.A05 = r1;
                        C67010Mgi.A00(imageView, r6, ozn, mgi, AnonymousClass05K.A01, Integer.valueOf(A002), j, true, true);
                        break;
                    }
                }
                break;
            case 3:
                C52012GBj gBj = (C52012GBj) this.A02;
                gBj.A05 = null;
                C52012GBj.A05(gBj, this.A01, this.A03);
                break;
            default:
                IMqttPublishListener iMqttPublishListener = (IMqttPublishListener) this.A02;
                if (iMqttPublishListener != null) {
                    int i2 = this.A01;
                    boolean z = this.A03;
                    IMqttPublishListener.Stub.Proxy proxy = (IMqttPublishListener.Stub.Proxy) iMqttPublishListener;
                    int A032 = AnonymousClass0fD.A03(-1247145901);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                        obtain.writeInt(i2);
                        obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
                        proxy.A00.transact(3, obtain, (Parcel) null, 1);
                        break;
                    } finally {
                        obtain.recycle();
                        AnonymousClass0fD.A0A(468553876, A032);
                    }
                }
                break;
        }
        return C60340gF.A00;
    }
}
