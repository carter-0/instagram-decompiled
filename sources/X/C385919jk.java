package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9jk  reason: invalid class name and case insensitive filesystem */
public final class C385919jk extends 2Cn {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C353498Hw A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C353498Hw r1 = this.A01;
        r1.A1h.A0H("load video from medium failed");
        C353498Hw.A16(r1, exc, String.valueOf(this.A00.A05), "load video from medium failed", true, false);
    }

    public C385919jk(Medium medium, C353498Hw r2, Integer num, boolean z) {
        this.A01 = r2;
        this.A00 = medium;
        this.A02 = num;
        this.A03 = z;
    }

    public final void onFinish() {
        this.A01.A0f = false;
    }

    public final void onStart() {
        C353498Hw r1 = this.A01;
        r1.A0f = true;
        r1.A1h.A06(r1.A1v.A00, MediaStreamTrack.VIDEO_TRACK_KIND, this.A00.A03, false, r1.CVJ());
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.07Z, X.4DH] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C353278Gz r1;
        C353278Gz r9;
        AnonymousClass8XA A002;
        C349307zv r3 = (C349307zv) obj;
        0qQ.A0B(r3, 0);
        if (r3.A07 <= 0) {
            onFail(AnonymousClass7TE.A15("video with <= 0 duration"));
            return;
        }
        int i = 0;
        if (this.A00.A0G.A0B) {
            i = 54;
        }
        r3.A0F = i;
        C353498Hw r2 = this.A01;
        r2.A1h.A0I("video_import_success");
        Integer num = this.A02;
        boolean z = this.A03;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = r2.A1s;
        C2801950r r5 = r2.A1t;
        if (ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel) == null) {
            ClipsCreationDraftViewModel.A08(clipsCreationDraftViewModel, r5, (PendingRecipient) null);
        }
        int A012 = C348947zL.A01(r2.A0J) + r3.A07;
        C3495880y r7 = r2.A0I;
        if (r7 != null) {
            int i2 = r7.A01;
            if (Integer.valueOf(i2) != null && A012 > i2) {
                UserSession userSession = r2.A1D;
                if (r7 != C3495980z.A00(userSession)) {
                    C353498Hw.A0u(r2, C3495980z.A00(userSession).A01);
                }
            }
        }
        UserSession userSession2 = r2.A1D;
        27r A013 = 27p.A01(userSession2);
        boolean A1X = C353498Hw.A1X(r2);
        29f r14 = A013.A0A;
        C360948fP r20 = C360948fP.GALLERY;
        int i3 = r3.A0K;
        int i4 = r3.A08;
        Long valueOf = Long.valueOf(r3.A00());
        String str = r3.A0k;
        Double valueOf2 = Double.valueOf(((double) r3.A07) / 1000.0d);
        Long valueOf3 = Long.valueOf(((long) C353498Hw.A00(r2)) / 1000);
        C391579tJ Aje = r2.Aje();
        Boolean valueOf4 = Boolean.valueOf(z);
        long j = r3.A0M;
        if (j <= 0) {
            j = r3.A0L;
        }
        r14.A0W(Aje, r20, (Boolean) null, valueOf4, valueOf2, valueOf, valueOf3, str, 2, i3, i4, j / 1000, A1X);
        if (A1X) {
            A013.A0k();
        }
        C3511387s r92 = r2.A1k.A03;
        if (r92.A0N()) {
            AnonymousClass85M r11 = r2.A1d;
            Context context = r2.A11;
            FragmentActivity requireActivity = r2.A1B.requireActivity();
            if (r11.A00 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                r11.A00 = frameLayout;
                frameLayout.setClickable(true);
                FrameLayout frameLayout2 = r11.A00;
                if (frameLayout2 != null) {
                    frameLayout2.setBackgroundColor(AnonymousClass7TF.A03(context, R.attr.igds_color_media_background));
                }
                ((TextView) requireActivity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, r11.A00).requireViewById(R.id.processing_video_text)).setText(requireActivity.getResources().getText(2131969785));
                requireActivity.addContentView(r11.A00, new FrameLayout.LayoutParams(-1, -1));
                C353498Hw.A0m(r2);
            }
        }
        if ((A1X || ((!r2.A1g() && !r2.CVJ() && !C353498Hw.A1Z(r2) && !r2.A1x.A02()) || C353498Hw.A1V(r2))) && num != AnonymousClass05K.A0Y) {
            if (!(!r2.CTi()) || !182.A06(0Tu.A05, userSession2, 36320043046412175L)) {
                C353498Hw.A0h(r2);
            }
            if (!r2.A1F.A0P() || (r9 = r2.A0C) == null || !182.A06(0Tu.A05, userSession2, 36327387440626064L)) {
                C353498Hw.A15(r2, r3, num);
                return;
            }
            AnonymousClass7TE.A0n(userSession2).A00(r5);
            r9.A00(r3);
            AnonymousClass8WX r0 = r2.A0B;
            if (r0 != null && (A002 = r0.A00()) != null) {
                A002.A0M(false);
                return;
            }
            return;
        }
        AnonymousClass0eM r12 = r2.A25;
        if (r12.getValue() == null) {
            if (!C353498Hw.A1V(r2)) {
                C353498Hw.A0h(r2);
            }
            if (C357638Yz.A03(C358088aL.A0z, r2.A1F) && (r1 = r2.A0C) != null) {
                AnonymousClass7TE.A0n(userSession2).A00(r5);
                r1.A00(r3);
            } else if (r92.A0N()) {
                C353498Hw.A13(r2, r3);
            } else if (!C353498Hw.A1V(r2)) {
                C353498Hw.A14(r2, r3, num);
            }
        } else {
            Object value = r12.getValue();
            if (value != null) {
                AnonymousClass2g9.A00(19B.A00, new MHJ(value, (Object) r3, (AnonymousClass4D7) null, 25, 42)).A06(r2.A1B, new C353658Io(new C66312MMv(41, num, r2)));
            }
        }
    }
}
