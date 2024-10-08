package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9QZ  reason: invalid class name */
public final class AnonymousClass9QZ {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C71662eb A05;
    public final C378499Qa A06;

    public static final void A00(AnonymousClass9QZ r2, Integer num) {
        C59762JXa.A02(r2.A04, num);
        r2.A00 = false;
        AnonymousClass7TE.A1U(r2.A05.A01(), true);
        C353498Hw r0 = r2.A06.A00;
        C353498Hw.A0m(r0);
        C353498Hw.A1B(r0, true);
        r0.A1U.A00().EuK();
    }

    public AnonymousClass9QZ(Context context, ViewStub viewStub, FragmentActivity fragmentActivity, UserSession userSession, C378499Qa r6, boolean z) {
        Integer A002;
        this.A02 = context;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A06 = r6;
        this.A05 = new C71662eb(viewStub);
        if (z && (A002 = C59762JXa.A00(userSession)) != null) {
            A01(this, A002);
        }
    }

    public static final void A01(AnonymousClass9QZ r11, Integer num) {
        int i;
        UserSession userSession;
        int intValue = num.intValue();
        if (intValue == 2 || intValue == 1 || intValue == 0 || intValue == 3) {
            r11.A00 = true;
            View A012 = r11.A05.A01();
            0qQ.A07(A012);
            View findViewById = A012.findViewById(R.id.clips_close_nux_button);
            if (findViewById != null) {
                AnonymousClass3NG A0m = AnonymousClass7TE.A0m(findViewById);
                A0m.A04 = new C47793EHe(0, r11, num);
                A0m.A00();
            }
            TextView A0R = AnonymousClass7TG.A0R(A012, R.id.clips_nux_page_subtitle);
            TextView A0d = AnonymousClass7TE.A0d(A012, R.id.clips_nux_page_footnote);
            Context context = A012.getContext();
            Resources resources = A012.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (intValue != 2) {
                if (intValue == 1) {
                    A0R.setText(2131955539);
                    i = 2131955534;
                } else if (intValue == 0) {
                    A0R.setText(2131955539);
                    i = 2131955535;
                } else if (intValue != 3) {
                    0kD.A07("ClipsNuxController", "Unknown New User NUX", (Throwable) null);
                } else {
                    A0R.setText(2131955537);
                }
                spannableStringBuilder.append(resources.getString(i)).append(" ");
            } else {
                A0R.setText(2131955538);
                i = 2131955533;
                spannableStringBuilder.append(resources.getString(i)).append(" ");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(resources.getString(2131955499));
            spannableStringBuilder.setSpan(new C48050ESt(context, resources, r11, context.getColor(R.color.badge_color)), length, spannableStringBuilder.length(), 33);
            if (A0d != null) {
                A0d.setMovementMethod(LinkMovementMethod.getInstance());
                A0d.setText(spannableStringBuilder);
            }
            AnonymousClass0fU.A00(new AOW(9, num, r11), A012.requireViewById(R.id.clips_nux_page_button));
            A012.setVisibility(4);
            r11.A01 = true;
            A012.getViewTreeObserver().addOnPreDrawListener(new LZ3(0, A012, r11));
            userSession = r11.A04;
        } else if (intValue == 4) {
            Context context2 = r11.A02;
            C358248ab r6 = new C358248ab(context2);
            Resources resources2 = context2.getResources();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(DialogModule.KEY_TITLE, resources2.getString(2131955204));
            r6.A09(2131956094);
            r6.A08(2131956093);
            r6.A08 = true;
            IgImageView A002 = C358248ab.A00(r6);
            Context context3 = r6.A0Q;
            Drawable drawable = context3.getResources().getDrawable(R.drawable.clips_introduce_remix_camera_nux);
            if (drawable instanceof C262364Dk) {
                ((C262364Dk) drawable).A01(new AZN(A002, r6));
            } else {
                Bitmap decodeResource = BitmapFactory.decodeResource(context3.getResources(), R.drawable.clips_introduce_remix_camera_nux);
                if (decodeResource != null) {
                    A002.setImageDrawable(new C59985Jcu(decodeResource, (Matrix) null, (float) r6.A0O, 3));
                }
            }
            A002.setScaleType(ImageView.ScaleType.FIT_START);
            A002.setVisibility(0);
            r6.A09 = true;
            r6.A0E(new AKK(r11, 7));
            r6.A0G(new C50025FJk(11, (Object) resources2, (Object) r11), 2131956091);
            r6.A0H(new C50025FJk(12, (Object) A0a, (Object) r11), 2131956092);
            AnonymousClass7TH.A0a(r6, false);
            userSession = r11.A04;
            C59762JXa.A02(userSession, num);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        27p.A01(userSession);
    }
}
