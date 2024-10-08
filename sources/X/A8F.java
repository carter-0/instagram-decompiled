package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;

public final class A8F {
    public final Bundle A00(RectF rectF, 28D r7, UserSession userSession, CreativeConfigIntf creativeConfigIntf) {
        Bundle A0a = AnonymousClass7TE.A0a();
        String B3W = creativeConfigIntf.B3W();
        if (B3W != null) {
            A0a.putString("effect_id", B3W);
        }
        String Bbn = creativeConfigIntf.Bbn();
        if (Bbn != null) {
            A0a.putString("effect_persisted_metadata", Bbn);
        }
        C306106Ku A03 = C284745Nt.A03(creativeConfigIntf);
        if (A03 != null) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36325957216253329L);
            Parcelable A00 = A03.A00();
            if (!A06) {
                A00 = 0B0.A00(A00);
            }
            A0a.putParcelable(C273654mx.A00(22), A00);
        }
        C62622Kit A04 = C284745Nt.A04(creativeConfigIntf);
        if (A04 != null) {
            A0a.putSerializable(C66579MXk.A00(12), A04);
        }
        A0a.putParcelable("camera_entry_bounds", new OpaqueParcelable((Parcelable) rectF));
        A0a.putSerializable("camera_entry_point", r7);
        return A0a;
    }
}
