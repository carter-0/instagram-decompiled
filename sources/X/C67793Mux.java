package X;

import android.content.Context;
import android.view.ViewGroup;
import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mux  reason: case insensitive filesystem */
public final class C67793Mux extends 2Rw {
    public List A00 = 0sn.A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        Long A10;
        C67891MwZ mwZ = (C67891MwZ) r8;
        0qQ.A0B(mwZ, 0);
        OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) this.A00.get(i);
        IgdsListCell igdsListCell = mwZ.A00;
        igdsListCell.A05(R.drawable.instagram_device_phone_pano_outline_24);
        Context A07 = DbS.A07(mwZ);
        String str = oneTimeCodeDevice.A01;
        if (str == null) {
            str = oneTimeCodeDevice.A00;
        }
        igdsListCell.A0I(str);
        0qQ.A0A(A07);
        String str2 = oneTimeCodeDevice.A02;
        String str3 = null;
        if (!(str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null)) {
            str3 = 1G0.A03(A07, (double) A10.longValue());
        }
        List A11 = C66581MXm.A11(str3, oneTimeCodeDevice.A03);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A11) {
            String str4 = (String) next;
            if (str4 != null && !00l.A0W(str4)) {
                A1C.add(next);
            }
        }
        igdsListCell.A0H(C66581MXm.A0w(" • ", A1C));
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1139896456);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1351761601, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        DbS.A1W(viewGroup);
        return new C67891MwZ(C66581MXm.A0d(AnonymousClass7TE.A0S(viewGroup)));
    }
}
