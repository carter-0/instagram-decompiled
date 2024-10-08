package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;

public final class NgG extends C63667L2d {
    public C68166N3g A00;
    public boolean A01;
    public final View.OnClickListener A02;
    public final View A03;
    public final RtcCallParticipantCellView A04;
    public final C70525O9y A05;
    public final 0sL A06;
    public final 0sK A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NgG(View view, C70525O9y o9y, C62320sa r6, C62320sa r7, 0sL r8, 0sK r9) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A07 = r9;
        this.A05 = o9y;
        this.A06 = r8;
        this.A02 = new C71396Ojv(r6, 47);
        RtcCallParticipantCellView rtcCallParticipantCellView = (RtcCallParticipantCellView) AnonymousClass7TF.A0F(view, R.id.call_participant_cell_view);
        this.A04 = rtcCallParticipantCellView;
        rtcCallParticipantCellView.setVideoSizeChangeListener(new C72892POc(this));
        rtcCallParticipantCellView.setFrameRenderListener(new C73894PlV(this, 8));
        rtcCallParticipantCellView.setOnVisibilityChangedListener(new C74180PqM(this, 25));
        0nA.A0p(rtcCallParticipantCellView, new C73132PXR(this));
        rtcCallParticipantCellView.A03 = r7;
    }

    public final void A01() {
        this.A00 = null;
        RtcCallParticipantCellView rtcCallParticipantCellView = this.A04;
        C71743Oq3 oq3 = rtcCallParticipantCellView.A0F;
        AnonymousClass7TE.A0c(oq3.A0A).removeOnLayoutChangeListener(rtcCallParticipantCellView.A07);
        oq3.A01();
        rtcCallParticipantCellView.A04 = null;
    }

    public static final void A00(NgG ngG, C68166N3g n3g, boolean z) {
        C68166N3g n3g2;
        if (!z && (n3g2 = ngG.A00) != null && n3g.A02 == n3g2.A02 && n3g.A0N == n3g2.A0N) {
            return;
        }
        if (n3g.A0N) {
            RtcCallParticipantCellView rtcCallParticipantCellView = ngG.A04;
            0sP r4 = n3g.A05.A00;
            C73607Pgi pgi = new C73607Pgi(ngG, 9);
            C71743Oq3 oq3 = rtcCallParticipantCellView.A0F;
            r4.invoke(oq3);
            if (rtcCallParticipantCellView.A04 == null) {
                AnonymousClass7TE.A0c(oq3.A0A).addOnLayoutChangeListener(rtcCallParticipantCellView.A07);
            }
            rtcCallParticipantCellView.A04 = pgi;
            rtcCallParticipantCellView.A0A.setVisibility(0);
            return;
        }
        RtcCallParticipantCellView rtcCallParticipantCellView2 = ngG.A04;
        rtcCallParticipantCellView2.A0A.setVisibility(8);
        C71743Oq3 oq32 = rtcCallParticipantCellView2.A0F;
        C67679MsF msF = oq32.A01;
        if (msF != null) {
            msF.A0C.clearImage();
        }
        AnonymousClass7TE.A0c(oq32.A0A).removeOnLayoutChangeListener(rtcCallParticipantCellView2.A07);
        oq32.A01();
        rtcCallParticipantCellView2.A04 = null;
    }
}
