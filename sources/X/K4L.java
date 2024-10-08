package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

public final class K4L extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoPreCaptureFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = MMU.A00(this, 26);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final String A0B = "potato_pre_capture_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C340297l2 r5 = (C340297l2) AnonymousClass7TE.A14(this.A00);
        r5.A00 = 1;
        r5.EdB(true);
        r5.A0J(new K04(this, 9));
        r5.AJI(new K04(this, 10), (C341047mF) null, AnonymousClass80J.A00);
        ShutterButton shutterButton = (ShutterButton) this.A09.getValue();
        shutterButton.setHandsFreeRecordingEnabled(false);
        shutterButton.setVideoRecordingEnabled(false);
        shutterButton.setOnSingleTapCaptureListener(new C65801Lzt(this, 0));
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(AnonymousClass7TE.A0c(this.A07));
        A0m.A06 = false;
        C61685KHt.A00(A0m, this, 21);
        LY0.A00(AnonymousClass7TE.A0c(this.A05), 58, this);
        LY0.A00(AnonymousClass7TE.A0c(this.A04), 59, this);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 4), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public K4L() {
        MMU mmu = new MMU(this, 37);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMU(new MMU(this, 34), 35));
        this.A0A = DbS.A0I(new MMU(A002, 36), mmu, new MJ9(32, (Object) null, A002), DbS.A0z(C60282Jid.class));
        this.A00 = MMU.A00(this, 25);
        this.A07 = MMU.A00(this, 32);
        this.A09 = MMU.A00(this, 33);
        this.A04 = MMU.A00(this, 29);
        this.A06 = MMU.A00(this, 31);
        this.A03 = MMU.A00(this, 28);
        this.A02 = MMU.A00(this, 27);
        this.A05 = MMU.A00(this, 30);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(792408086);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_potato_pre_capture_fragment, false);
        AnonymousClass0fD.A09(151491447, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(119931639);
        super.onDestroyView();
        AnonymousClass0eM r1 = this.A00;
        ((C340297l2) AnonymousClass7TE.A14(r1)).disconnect();
        C340297l2 r12 = (C340297l2) AnonymousClass7TE.A14(r1);
        r12.A0G.A04();
        C41842B2x b2x = r12.A04;
        if (b2x != null) {
            b2x.Dcz();
        }
        r12.A0K.clear();
        AnonymousClass0fD.A09(1828221818, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1292872023);
        K4L.super.onPause();
        ((C340297l2) AnonymousClass7TE.A14(this.A00)).A0D();
        AnonymousClass0fD.A09(1273063732, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1623829015);
        super.onResume();
        AnonymousClass0eM r3 = this.A00;
        ((C340297l2) AnonymousClass7TE.A14(r3)).A0P((C279284yO) null, "potato_capture_on_resume");
        ((C340297l2) AnonymousClass7TE.A14(r3)).EI4(AnonymousClass7TE.A0v());
        AnonymousClass0fD.A09(-522766737, A022);
    }
}
