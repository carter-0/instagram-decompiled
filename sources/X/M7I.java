package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class M7I implements Runnable {
    public final /* synthetic */ ClipsCoverPhotoPickerController A00;
    public final /* synthetic */ AnonymousClass51W A01;

    public M7I(ClipsCoverPhotoPickerController clipsCoverPhotoPickerController, AnonymousClass51W r2) {
        this.A00 = clipsCoverPhotoPickerController;
        this.A01 = r2;
    }

    public final void run() {
        String str;
        ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = this.A00;
        if (clipsCoverPhotoPickerController.filmStripFramesContainer != null) {
            List A012 = this.A01.A01();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A012) {
                if (next instanceof AnonymousClass51M) {
                    A1C.add(next);
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                AnonymousClass51M A0g = JTO.A0g(it);
                long A08 = (long) JTP.A08(A0g);
                String str2 = A0g.A0F.A0F;
                int abs = (int) (Math.abs(A0g.A00) * 100.0f);
                if (AnonymousClass51Q.A05(A0g)) {
                    str = A0g.A0F.A0I;
                } else {
                    str = null;
                }
                A0r.add(new C63814L7u(A08, str2, abs, str));
            }
            LinearLayout linearLayout = clipsCoverPhotoPickerController.filmStripFramesContainer;
            if (linearLayout != null) {
                int width = linearLayout.getWidth();
                int i = clipsCoverPhotoPickerController.A05;
                int i2 = (width / i) + 1;
                Context context = clipsCoverPhotoPickerController.A06;
                UserSession userSession = clipsCoverPhotoPickerController.A09;
                Fragment fragment = clipsCoverPhotoPickerController.A08;
                LA8 la8 = clipsCoverPhotoPickerController.A0D.A0E;
                0qQ.A0B(la8, 0);
                String str3 = la8.A05;
                long j = la8.A03;
                LA8 la82 = new LA8(str3, (String) null, la8.A02, la8.A01, -1, j);
                int i3 = clipsCoverPhotoPickerController.A04;
                C64137LPm.A01(context, fragment, userSession, (FilmstripTimelineView) null, la82, "post_capture", A0r, i2, i, i3);
                int i4 = 0;
                while (i4 < i2) {
                    ImageView imageView = new ImageView(context);
                    JTP.A14(imageView, i, i3);
                    imageView.setPadding(0, 0, 0, 0);
                    LinearLayout linearLayout2 = clipsCoverPhotoPickerController.filmStripFramesContainer;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(imageView);
                        i4++;
                    }
                }
                JTS.A0N(fragment).A01("post_capture").A06.A06(fragment, new C64320LZv(new MP9(clipsCoverPhotoPickerController, 5), 13));
                return;
            }
            0qQ.A0F("filmStripFramesContainer");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
