package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.AIv  reason: case insensitive filesystem */
public abstract class C39906AIv {
    public static final C310416b1 A00() {
        return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.78f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C310416b1 A01() {
        return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.7f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.67f, -1.0f, -1.0f, -3, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C310416b1 A03(C3510387i r30) {
        return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.7f), (AnonymousClass8DA) null, (C3510487j) r30, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.67f, -1.0f, -1.0f, -3, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C349307zv A05(Context context, Medium medium, UserSession userSession) {
        0qQ.A0B(context, 0);
        AnonymousClass7TF.A1B(medium, 1, userSession);
        try {
            return new JZ5(context, medium, userSession, false).call();
        } catch (Exception e) {
            String format = String.format("Error importing video of file path %s", Arrays.copyOf(new Object[]{medium.A0X}, 1));
            0qQ.A07(format);
            0kD.A07("CanvasReshareMediaUtil", format, e);
            String str = medium.A0X;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new C349307zv(medium, options.outWidth, options.outHeight, medium.A07);
        }
    }

    public static final C310416b1 A02(Context context, TargetViewSizeProvider targetViewSizeProvider, 1Xj r33) {
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        1Xj r1 = r33;
        Context context2 = context;
        AnonymousClass7TF.A1B(context2, 0, targetViewSizeProvider2);
        if (!r1.A5D() || (r1 = r1.A1c(0)) != null) {
            int A0y = r1.A0y();
            int A0x = r1.A0x();
            AnonymousClass81W r2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K;
            int A05 = AnonymousClass7TE.A05(((float) AnonymousClass7TE.A05((float) r2.getWidth(), 0.8f)) / ((float) A0y), (float) A0x);
            int height = r2.getHeight() - context2.getResources().getDimensionPixelSize(R.dimen.canvas_media_safe_padding);
            Integer num = AnonymousClass05K.A00;
            float f = 1.0f;
            if (height > 0 && A05 > 0) {
                float f2 = ((float) A05) / ((float) height);
                if (f2 > 1.0f) {
                    f = 1.0f / f2;
                }
            }
            return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.5f), (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, f, -1.0f, -1.0f, 0, false, false, true, false, false, false, false, true, true, true, true, true, false, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C310416b1 A04(TargetViewSizeProvider targetViewSizeProvider) {
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 0);
        float f = 0.5f;
        if (((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getHeight() >= 1080) {
            f = 0.6f;
        }
        return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.7f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, f, -1.0f, -1.0f, 0, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }
}
