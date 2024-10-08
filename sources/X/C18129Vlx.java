package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.Vlx  reason: case insensitive filesystem */
public abstract class C18129Vlx {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public static void A00(C19517Wb3 wb3) {
        MediaFrameLayout mediaFrameLayout = wb3.A0E;
        mediaFrameLayout.setVisibility(8);
        wb3.A0A.A02();
        wb3.A00 = null;
        wb3.A02.setVisibility(8);
        wb3.A0D.setVisibility(8);
        wb3.A04.setVisibility(8);
        mediaFrameLayout.setBackgroundDrawable((Drawable) null);
        wb3.A0B.A03(8);
        wb3.A0C.A03(8);
        wb3.A06.setVisibility(8);
    }

    public static void A01(C19517Wb3 wb3, long j, boolean z) {
        View view;
        int i;
        if (z) {
            Date A0t = C13989Tnp.A0t(j);
            TimeZone timeZone = C14240TsN.A03;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d", Locale.getDefault());
            TimeZone timeZone2 = C14240TsN.A03;
            simpleDateFormat.setTimeZone(timeZone2);
            String format = simpleDateFormat.format(A0t);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", Locale.getDefault());
            simpleDateFormat2.setTimeZone(timeZone2);
            String format2 = simpleDateFormat2.format(A0t);
            wb3.A05.setText(format);
            wb3.A07.setText(format2);
            view = wb3.A02;
            i = 0;
        } else {
            view = wb3.A02;
            i = 8;
        }
        view.setVisibility(i);
    }
}
