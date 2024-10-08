package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.4Dm  reason: invalid class name and case insensitive filesystem */
public final class C262384Dm implements AnonymousClass1MK {
    public static final Set A08 = new HashSet();
    public int A00;
    public Paint A01;
    public C226952iF A02;
    public ImageUrl A03;
    public List A04 = new ArrayList();
    public final Queue A05 = new ConcurrentLinkedQueue();
    public volatile Bitmap A06;
    public volatile boolean A07;

    public final void DJx(C226952iF r3, C254673sr r4) {
        this.A07 = false;
        Set set = A08;
        synchronized (set) {
            this.A05.clear();
            set.remove(this);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public static void A00(C262384Dm r1) {
        C226952iF r0;
        List list = r1.A04;
        if (list != null && list.isEmpty() && r1.A05.isEmpty() && (r0 = r1.A02) != null) {
            r0.AGE();
            r1.A07 = false;
        }
    }

    public static void A01(C262384Dm r2) {
        Set set = A08;
        synchronized (set) {
            if (r2.A05.isEmpty()) {
                set.remove(r2);
            }
        }
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        List list = this.A04;
        this.A04 = null;
        this.A06 = r6.A01;
        while (true) {
            C262424Dq r1 = (C262424Dq) this.A05.poll();
            if (r1 == null) {
                break;
            }
            r1.CyE(this.A06);
        }
        A01(this);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Drawable drawable = (Drawable) ((Reference) list.get(i)).get();
            if (drawable != null) {
                drawable.invalidateSelf();
            }
        }
        list.clear();
        this.A04 = list;
    }

    public C262384Dm(Paint paint) {
        this.A01 = paint;
    }
}
