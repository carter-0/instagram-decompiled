package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.android.R;

/* renamed from: X.7OM  reason: invalid class name */
public final class AnonymousClass7OM implements C2365734g {
    public final /* synthetic */ AnonymousClass7JI A00;

    public AnonymousClass7OM(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        Drawable drawable;
        if (view != null) {
            AnonymousClass7JI r2 = this.A00;
            AnonymousClass7OK A01 = AnonymousClass7JI.A01(r2);
            int i = A01.A02;
            0nA.A0h(view, i, i);
            0nA.A0X(view, A01.A00);
            r2.A09 = (Chronometer) view.findViewById(R.id.direct_voice_messaging_composer_chronometer);
            VoiceVisualizer voiceVisualizer = (VoiceVisualizer) view.requireViewById(R.id.direct_voice_messaging_visualizer);
            r2.A0D = voiceVisualizer;
            if (voiceVisualizer != null) {
                voiceVisualizer.A05 = 100;
            }
            r2.A0B = (ImageView) view.requireViewById(R.id.direct_voice_messaging_composer_trash_can);
            View requireViewById = view.requireViewById(R.id.direct_voice_messaging_visualizer_container);
            r2.A08 = requireViewById;
            if (requireViewById != null) {
                requireViewById.setBackground((Drawable) A01.A0A.getValue());
            }
            2eQ.A02(r2.A08);
            FrameLayout frameLayout = r2.A0R.A03;
            if (frameLayout != null) {
                int top = frameLayout.getTop();
                View view2 = r2.A08;
                if (view2 != null) {
                    drawable = view2.getBackground();
                } else {
                    drawable = null;
                }
                AnonymousClass7PT.A00(drawable, top);
            }
            TextView textView = (TextView) view.findViewById(R.id.direct_voice_messaging_instructions_text_view);
            r2.A0C = textView;
            if (textView != null) {
                int i2 = 2131960731;
                if (r2.A0X) {
                    i2 = 2131960732;
                }
                textView.setText(i2);
            }
            ImageView imageView = r2.A0B;
            if (imageView != null) {
                imageView.setColorFilter(A01.A03);
            }
            ImageView imageView2 = r2.A0B;
            if (imageView2 != null) {
                imageView2.setImageDrawable(A01.A09);
            }
            ImageView imageView3 = r2.A0B;
            if (imageView3 != null) {
                imageView3.setBackground(A01.A07);
            }
            ImageView imageView4 = r2.A0B;
            if (imageView4 != null) {
                AnonymousClass0fU.A00(new C39991AMx(r2), imageView4);
            }
            ImageView imageView5 = r2.A0B;
            if (imageView5 != null) {
                imageView5.setContentDescription(r2.A0L.getString(2131960724));
            }
            ImageView imageView6 = (ImageView) view.requireViewById(R.id.direct_voice_messaging_composer_send);
            r2.A0A = imageView6;
            if (imageView6 != null) {
                imageView6.setColorFilter(A01.A01);
            }
            ImageView imageView7 = r2.A0A;
            if (imageView7 != null) {
                imageView7.setImageDrawable(A01.A08);
            }
            ImageView imageView8 = r2.A0A;
            if (imageView8 != null) {
                AnonymousClass0fU.A00(r2.A0N, imageView8);
            }
            ImageView imageView9 = r2.A0A;
            if (imageView9 != null) {
                imageView9.setContentDescription(r2.A0L.getString(2131960723));
            }
            if (r2.A0U == AnonymousClass05K.A00) {
                View requireViewById2 = view.requireViewById(R.id.direct_voice_messaging_composer_background);
                r2.A07 = requireViewById2;
                if (requireViewById2 != null) {
                    requireViewById2.setBackground((Drawable) AnonymousClass7JI.A01(r2).A0A.getValue());
                }
            }
            if (((Boolean) C62000qj.A02.A0E.invoke()).booleanValue()) {
                03T.A00(view, new C20207Wn7(view, r2));
            } else {
                view.getViewTreeObserver().addOnPreDrawListener(new WCF(view, r2));
            }
        }
    }
}
