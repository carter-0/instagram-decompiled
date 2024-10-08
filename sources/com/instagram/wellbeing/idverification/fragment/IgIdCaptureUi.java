package com.instagram.wellbeing.idverification.fragment;

import X.0Yt;
import X.C10973S3g;
import X.C68374NEa;
import X.C68377NEd;
import X.C7911Qch;
import X.C7914Qcl;
import X.C7926Qcx;
import X.C9951Rk5;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.facebook.smartcapture.ui.IgCreditCardUi;
import com.instagram.android.R;
import java.util.Map;

public class IgIdCaptureUi extends C10973S3g implements IdCaptureUi {
    public static final Parcelable.Creator CREATOR = C10973S3g.A00(IgIdCaptureUi.class);

    public final Class Bbl() {
        if (this instanceof XMDSIgIdCaptureUi) {
            return C68377NEd.class;
        }
        if (this instanceof IgCreditCardUi) {
            return C68374NEa.class;
        }
        return C7911Qch.class;
    }

    public final Class BcA() {
        if (this instanceof XMDSIgIdCaptureUi) {
            return C7914Qcl.class;
        }
        return C7926Qcx.class;
    }

    public final Map C1o() {
        if (this instanceof IgCreditCardUi) {
            return 0Yt.A0E();
        }
        return C9951Rk5.A00;
    }

    public final void AAp(FragmentActivity fragmentActivity) {
        fragmentActivity.getTheme().applyStyle(R.style.IgdsSemanticColors, true);
    }
}
