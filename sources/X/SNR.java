package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.modal.TransparentModalActivity;

public final class SNR {
    public C8746R7k A00;
    public Boolean A01;
    public String A02;

    public static final void A00(Activity activity, Intent intent, 0lg r10, SNR snr) {
        String str;
        String str2;
        02m r2 = 02m.A0p;
        if (snr.A02 == null || snr.A01 == null) {
            0qQ.A07(r2);
            A01(r2, "not_initialized_background_file_path_nor_user_is_eligible_for_linked_fundraiser");
            return;
        }
        if (r2.isMarkerOn(18951415)) {
            r2.markerEnd(18951415, 2);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("interactive_asset_uri");
        String A002 = AnonymousClass000.A00(148);
        String stringExtra = intent.getStringExtra(A002);
        Bundle A0a = AnonymousClass7TE.A0a();
        String str3 = snr.A02;
        String str4 = null;
        if (str3 == null) {
            0qQ.A0F("backgroundFilePath");
            throw AnonymousClass00P.createAndThrow();
        }
        A0a.putString("bg_file_path", str3);
        A0a.putParcelable("interactive_asset_uri", parcelableExtra);
        A0a.putString(A002, stringExtra);
        A0a.putInt("is_linked_fundraiser", DbX.A1a(snr.A01) ? 1 : 0);
        C8746R7k r7k = snr.A00;
        if (r7k != null) {
            str = r7k.A00;
        } else {
            str = null;
        }
        A0a.putString("charity_pfp", str);
        C8746R7k r7k2 = snr.A00;
        if (r7k2 != null) {
            str2 = r7k2.A02;
        } else {
            str2 = null;
        }
        A0a.putString("sticker_title", str2);
        C8746R7k r7k3 = snr.A00;
        if (r7k3 != null) {
            str4 = r7k3.A01;
        }
        A0a.putString("sticker_subtitle", str4);
        AnonymousClass6W8.A02(activity, A0a, r10, TransparentModalActivity.class, C273654mx.A00(917)).A0C(activity);
    }

    public static final void A01(02m r2, String str) {
        if (r2.isMarkerOn(18951415)) {
            Pxf.A1I(r2, TraceFieldType.FailureReason, str, 18951415);
        }
    }
}
