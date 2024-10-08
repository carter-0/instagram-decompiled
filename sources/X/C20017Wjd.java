package X;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Wjd  reason: case insensitive filesystem */
public final class C20017Wjd implements Runnable {
    public final /* synthetic */ MediaMapFragment A00;

    public C20017Wjd(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }

    public final void run() {
        MediaMapFragment mediaMapFragment = this.A00;
        if (mediaMapFragment.isResumed() && mediaMapFragment.getContext() != null) {
            Context requireContext = mediaMapFragment.requireContext();
            AnonymousClass61R A002 = C303756Aq.A00(requireContext, R.raw.map_nux);
            A002.getClass();
            A002.EFK();
            A002.A8s(new W3z(A002, 3));
            int A05 = AnonymousClass7TE.A05((float) requireContext.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width), 0.5588235f);
            C358248ab r2 = new C358248ab(requireContext);
            r2.A09(2131960860);
            r2.A08(2131960859);
            r2.A0s(true);
            r2.A0I(new C49969FHc(3), 2131960858);
            r2.A0g(new C71252OgJ(A002, 9));
            r2.A07 = true;
            Dialog A02 = r2.A02();
            ViewStub viewStub = (ViewStub) A02.requireViewById(R.id.dialog_image_holder);
            viewStub.setLayoutResource(R.layout.dialog_rounded_corner_framed_image);
            ViewGroup.MarginLayoutParams A0D = DbS.A0D(viewStub);
            A0D.height = A05;
            A0D.width = -1;
            A0D.setMargins(0, 0, 0, 0);
            viewStub.setLayoutParams(A0D);
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) viewStub.inflate();
            float A022 = (float) AnonymousClass7TG.A02(requireContext);
            roundedCornerFrameLayout.A01(A022, A022, 0.0f, 0.0f);
            ImageView A0F = DbU.A0F(roundedCornerFrameLayout, R.id.dialog_image);
            A0F.setImageDrawable(A002);
            A0F.setScaleType(ImageView.ScaleType.CENTER_CROP);
            AnonymousClass0fN.A00(A02);
            0xY AR4 = C2593341h.A00(mediaMapFragment.A02).A00.AR4();
            AR4.E5T("has_seen_main_nux", true);
            AR4.apply();
        }
    }
}
