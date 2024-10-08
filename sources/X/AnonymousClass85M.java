package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.85M  reason: invalid class name */
public final class AnonymousClass85M {
    public FrameLayout A00;
    public ProgressBar A01;
    public ProgressBar A02;
    public AnonymousClass9QS A03;
    public final AnonymousClass85L A04;

    public final void A00() {
        AnonymousClass9QS r0 = this.A03;
        if (r0 != null) {
            r0.A04.setLoadingStatus(JY5.SUCCESS);
            AnonymousClass9QS r02 = this.A03;
            if (r02 != null) {
                r02.A00.setVisibility(8);
                AnonymousClass9QS r03 = this.A03;
                if (r03 != null) {
                    r03.A03.setVisibility(8);
                    AnonymousClass9QS r04 = this.A03;
                    if (r04 != null) {
                        r04.A02.setVisibility(8);
                        AnonymousClass9QS r05 = this.A03;
                        if (r05 != null) {
                            r05.A01.setVisibility(8);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("loadingViewsHolder");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01() {
        AnonymousClass9QS r0 = this.A03;
        if (r0 != null) {
            r0.A04.setLoadingStatus(JY5.LOADING);
            AnonymousClass9QS r02 = this.A03;
            if (r02 == null) {
                0qQ.A0F("loadingViewsHolder");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r02.A00.setVisibility(0);
            }
        }
    }

    public final void A02() {
        AnonymousClass9QS r0 = this.A03;
        if (r0 != null) {
            r0.A01.setVisibility(0);
            AnonymousClass9QS r02 = this.A03;
            if (r02 == null) {
                0qQ.A0F("loadingViewsHolder");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r02.A00.setVisibility(0);
            }
        }
    }

    public AnonymousClass85M(AnonymousClass85L r1) {
        this.A04 = r1;
    }

    public final void A03(Context context, Activity activity) {
        if (this.A00 == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.A00 = frameLayout;
            frameLayout.setClickable(true);
            ((TextView) activity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, this.A00).requireViewById(R.id.processing_video_text)).setText(activity.getResources().getText(2131969785));
            activity.addContentView(this.A00, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
