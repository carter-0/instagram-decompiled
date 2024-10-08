package X;

import android.location.Geocoder;
import java.util.List;

/* renamed from: X.SVj  reason: case insensitive filesystem */
public final class C11447SVj implements Geocoder.GeocodeListener {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ C13920TlM A02;
    public final /* synthetic */ SIV A03;

    public final void onGeocode(List list) {
        0qQ.A0B(list, 0);
        if (AnonymousClass7TE.A1b(list)) {
            this.A02.onSuccess(SIV.A00(list, this.A00, this.A01));
        }
    }

    public C11447SVj(C13920TlM tlM, SIV siv, double d, double d2) {
        this.A02 = tlM;
        this.A03 = siv;
        this.A00 = d;
        this.A01 = d2;
    }

    public final void onError(String str) {
        this.A02.onError(new Throwable(str));
    }
}
