package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: X.R9j  reason: case insensitive filesystem */
public final class C8782R9j extends 2Cl {
    public final /* synthetic */ ESF A00;
    public final /* synthetic */ PR9 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final int getRunnableId() {
        return 438;
    }

    public C8782R9j(ESF esf, PR9 pr9, boolean z, boolean z2) {
        this.A00 = esf;
        this.A01 = pr9;
        this.A03 = z;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            ESF esf = this.A00;
            C11205SFf sFf = esf.A00;
            ContentResolver contentResolver = esf.requireContext().getContentResolver();
            Uri A0I = Pxh.A0I(sFf.A06);
            ContentValues contentValues = new ContentValues();
            Pxe.A1K(contentValues, "auto_updates", sFf.A02 ? 1 : 0);
            Pxe.A1K(contentValues, "notif_update_available", sFf.A04 ? 1 : 0);
            Pxe.A1K(contentValues, "notif_update_installed", sFf.A05 ? 1 : 0);
            String str = sFf.A00;
            if (str == null) {
                contentValues.putNull("rollout_token");
            } else {
                contentValues.put("rollout_token", str);
            }
            Pxe.A1K(contentValues, "terms_of_service_accepted", sFf.A03 ? 1 : 0);
            Pxe.A1K(contentValues, "updates_over_cellular_enabled", sFf.A01 ? 1 : 0);
            if (contentResolver.update(A0I, contentValues, (String) null, (String[]) null) >= 0) {
                return null;
            }
            throw AnonymousClass7TE.A0z("Failed to update settings");
        } catch (IllegalStateException e) {
            this.A00.getActivity().runOnUiThread(new C13001THj(this, e));
            return null;
        }
    }

    public final void onFail(Exception exc) {
        if (this.A02) {
            ESF esf = this.A00;
            PR9 pr9 = this.A01;
            boolean z = this.A03;
            C358248ab r3 = new C358248ab(esf.getContext());
            r3.A09(2131953380);
            r3.A08(2131953379);
            r3.A0I(new C50017FJc(5, (Object) esf, (Object) pr9, z), 2131953381);
            r3.A0C(new C50017FJc(6, (Object) esf, (Object) pr9, z));
            DbT.A1V(r3);
        }
        0wb.A07("omvp_app_updates", exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A01 == null) {
            ESF esf = this.A00;
            esf.A01.A1x();
            esf.A01.A01.getBoolean(AnonymousClass000.A00(1665), true);
            esf.A01.A01.getBoolean("oxp_show_app_update_installed_notifications", true);
        }
    }
}
