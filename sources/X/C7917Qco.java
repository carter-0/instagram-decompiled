package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;

/* renamed from: X.Qco  reason: case insensitive filesystem */
public abstract class C7917Qco extends QCA {
    public RE7 A00;
    public IdCaptureLogger A01;
    public IdCaptureUi A02;
    public C9866Rif A03;
    public boolean A04;
    public Bundle A05;

    public void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof C13949TmA) {
            IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) ((C13949TmA) context);
            idCaptureBaseActivity.A01().A01();
            this.A02 = idCaptureBaseActivity.A07;
            this.A01 = idCaptureBaseActivity.A02();
            this.A03 = idCaptureBaseActivity.A08;
            this.A05 = idCaptureBaseActivity.A01().A03;
            RE7 A002 = idCaptureBaseActivity.A01().A00();
            0qQ.A07(A002);
            this.A00 = A002;
            this.A04 = idCaptureBaseActivity.A01().A0I;
            0qQ.A07(idCaptureBaseActivity.A01().A03());
        }
    }
}
