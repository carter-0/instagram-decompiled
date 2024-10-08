package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.8XY  reason: invalid class name */
public final class AnonymousClass8XY extends 2Cn {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final 2Cn A01;
    public final Executor A02;
    public final /* synthetic */ AnonymousClass8XW A03;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        0wb.A07("MediaLoaderController", exc);
        AnonymousClass8XQ r0 = this.A03.A0A.A0C;
        if (r0 != null) {
            r0.DCx(exc);
        }
        2Cn r02 = this.A01;
        if (r02 != null) {
            r02.onFail(exc);
        }
    }

    public AnonymousClass8XY(2Cn r3, AnonymousClass8XW r4) {
        this.A03 = r4;
        this.A01 = r3;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A02 = newSingleThreadExecutor;
    }

    public final void onFinish() {
        2Cn r0 = this.A01;
        if (r0 != null) {
            r0.onFinish();
        }
    }

    public final void onStart() {
        2Cn r0 = this.A01;
        if (r0 != null) {
            r0.onStart();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        C347987xh r12 = (C347987xh) obj;
        0qQ.A0B(r12, 0);
        AnonymousClass8XW r7 = this.A03;
        boolean z = r7.A0D;
        List<Medium> list2 = r12.A01;
        int i = r12.A00;
        if (z) {
            this.A02.execute(new C348227y6(this, r7, list2, AnonymousClass8XW.A00(r7), i));
        } else {
            AnonymousClass8XW.A03(r7);
            AnonymousClass8XX r0 = r7.A01;
            if (r0 == null || (list = r0.AN0()) == null) {
                list = 0sn.A00;
            }
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (Medium medium : list2) {
                AnonymousClass8XW.A02(medium, r7, r7.A0B);
                arrayList.remove(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
            }
            A00(this, arrayList, size, i);
        }
        2Cn r02 = this.A01;
        if (r02 != null) {
            r02.onSuccess(r12);
        }
    }

    public static final void A00(AnonymousClass8XY r5, List list, int i, int i2) {
        AnonymousClass8XX r0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            if (galleryItem.A02() && (r0 = r5.A03.A01) != null) {
                r0.Ejh(galleryItem, false, false);
            }
        }
        AnonymousClass8XW r2 = r5.A03;
        AnonymousClass8XX r52 = r2.A01;
        if (r52 != null) {
            List A012 = r2.A02.A01();
            String str = r2.A02.A03;
            if (str == null) {
                str = "";
            }
            r52.Ecr(Integer.valueOf(r2.A00), str, A012);
        }
        AnonymousClass8XU r4 = r2.A0A;
        AnonymousClass8XQ r53 = r4.A0C;
        if (r53 != null) {
            Object obj = r2.A0B.get(-1);
            if (obj != null) {
                r53.DQY(r2, ((Folder) obj).A01(), r2.A02.A01(), i2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (!r2.A05) {
            r2.A05 = true;
            Runnable runnable = r2.A03;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i == list.size() && (!r2.A02.A01().isEmpty()) && r4.A0J) {
            r2.A0B((Medium) r2.A02.A01().get(0));
        }
    }
}
