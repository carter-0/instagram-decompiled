package com.facebook.smartcapture.ui;

import X.C10973S3g;
import X.C7910Qcg;
import X.C7925Qcw;
import X.C9951Rk5;
import X.NEZ;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public class DefaultIdCaptureUi extends C10973S3g implements IdCaptureUi {
    public static final Parcelable.Creator CREATOR = C10973S3g.A00(DefaultIdCaptureUi.class);

    public final void AAp(FragmentActivity fragmentActivity) {
    }

    public final Class Bbl() {
        if (this instanceof FbCreditCardUi) {
            return NEZ.class;
        }
        return C7910Qcg.class;
    }

    public final Class BcA() {
        return C7925Qcw.class;
    }

    public final Map C1o() {
        return C9951Rk5.A00;
    }
}
