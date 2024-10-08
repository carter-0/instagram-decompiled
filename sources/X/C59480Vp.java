package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0Vp  reason: invalid class name and case insensitive filesystem */
public final class C59480Vp implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.profilo.ipc.TraceContext, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ? obj = new Object();
        obj.A06 = parcel.readLong();
        obj.A0D = parcel.readString();
        obj.A01 = parcel.readInt();
        obj.A0C = null;
        obj.A0B = null;
        obj.A05 = parcel.readLong();
        obj.A02 = parcel.readInt();
        obj.A03 = parcel.readInt();
        obj.A00 = parcel.readInt();
        obj.A04 = parcel.readInt();
        obj.A08 = (TraceConfigExtras) TraceConfigExtras.CREATOR.createFromParcel(parcel);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TraceContext[i];
    }
}
