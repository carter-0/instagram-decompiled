package X;

import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Draft;
import java.lang.ref.WeakReference;

/* renamed from: X.KIs  reason: case insensitive filesystem */
public final class C61702KIs extends 0ng {
    public final /* synthetic */ Draft A00;
    public final /* synthetic */ AnonymousClass8XV A01;
    public final /* synthetic */ WeakReference A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61702KIs(Draft draft, AnonymousClass8XV r5, WeakReference weakReference) {
        super(1910247448, 3, false, false);
        this.A01 = r5;
        this.A00 = draft;
        this.A02 = weakReference;
    }

    public final void run() {
        AnonymousClass8XV r6 = this.A01;
        Draft draft = this.A00;
        WeakReference weakReference = this.A02;
        C41814B1u b1u = (C41814B1u) weakReference.get();
        if (b1u != null && b1u.CWO(draft)) {
            String str = draft.A03;
            if (str == null) {
                0wb.A01(0kg.A03, AnonymousClass000.A00(442), "thumbnailImageFilePath in DraftThumbnailLoader::loadThumbnail is null");
                return;
            }
            BitmapFactory.Options options = r6.A01;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int i3 = r6.A00;
            int i4 = 1;
            while (i / i4 > i3 && i2 / i4 > i3) {
                i4 *= 2;
            }
            1OO A0J = 1NK.A00().A0J(C253833rU.A01(AnonymousClass7TE.A0t(str)), (String) null);
            A0J.A0I = false;
            A0J.A08 = new C39682A4y(draft, weakReference);
            A0J.A02(r6);
            A0J.A01 = i4;
            A0J.A01();
        }
    }
}
