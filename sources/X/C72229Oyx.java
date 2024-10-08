package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;

/* renamed from: X.Oyx  reason: case insensitive filesystem */
public final class C72229Oyx implements C240963Ni {
    public final int A00;
    public final Object A01;

    public C72229Oyx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DEN() {
        switch (this.A00) {
            case 0:
                ((C66819MdB) this.A01).Ddu();
                return;
            case 1:
                AnonymousClass0eM r1 = ((PMG) this.A01).A07;
                ((ImageView) r1.getValue()).setImageBitmap((Bitmap) null);
                C51969G9p.A1M(r1.getValue());
                return;
            default:
                RtcCallParticipantCellView rtcCallParticipantCellView = (RtcCallParticipantCellView) this.A01;
                rtcCallParticipantCellView.A01 = null;
                rtcCallParticipantCellView.setBackgroundBitmap((Bitmap) null);
                return;
        }
    }

    public final void DO4(C240983Nk r3) {
        switch (this.A00) {
            case 0:
                ((C66819MdB) this.A01).Ddt();
                return;
            case 1:
                AnonymousClass7TE.A0c(((PMG) this.A01).A07).setVisibility(0);
                return;
            default:
                0qQ.A0B(r3, 0);
                ((RtcCallParticipantCellView) this.A01).setBackgroundBitmap(r3.A02);
                return;
        }
    }
}
