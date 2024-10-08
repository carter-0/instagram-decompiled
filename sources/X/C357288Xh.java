package X;

import android.content.ContentResolver;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.8Xh  reason: invalid class name and case insensitive filesystem */
public final class C357288Xh implements Callable {
    public static final String[] A0E = {"_id", "image_id", "_data"};
    public static final String[] A0F = {"_id", "video_id", "_data"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final ContentResolver A05;
    public final Context A06;
    public final C348927zH A07;
    public final AnonymousClass8XO A08;
    public final C62780vc A09 = new C62780vc(0nY.A00(), 4);
    public final AnonymousClass8XR A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final UserSession A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(obj.getClass(), getClass())) {
                return false;
            }
            C357288Xh r5 = (C357288Xh) obj;
            if (!2Ob.A00(this.A08, r5.A08) || !2Ob.A00(Integer.valueOf(this.A01), Integer.valueOf(r5.A01)) || !2Ob.A00(Integer.valueOf(this.A02), Integer.valueOf(r5.A02)) || !2Ob.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(r5.A0C)) || !2Ob.A00(Long.valueOf(this.A04), Long.valueOf(r5.A04)) || !2Ob.A00(Long.valueOf(this.A03), Long.valueOf(r5.A03)) || !2Ob.A00(this.A0A, r5.A0A) || !2Ob.A00(this.A07, r5.A07) || !2Ob.A00(Boolean.valueOf(this.A0B), Boolean.valueOf(r5.A0B))) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        0nc r0;
        Object obj;
        ArrayList arrayList = new ArrayList();
        0nc r9 = new 0nc(new AnonymousClass8YY(this), 830910367, 3, false, true);
        0nc r15 = new 0nc(new AnonymousClass8YZ(this), 7019180, 3, false, true);
        0nc r16 = new 0nc(new C357478Ya(this), 927232334, 3, false, true);
        AnonymousClass8XR r5 = this.A0A;
        Object obj2 = null;
        if (r5 != null) {
            r0 = new 0nc(new AnonymousClass8Yb(r5), 852694716, 3, false, true);
        } else {
            r0 = null;
        }
        C62780vc r7 = this.A09;
        r7.ATD(r9);
        r7.ATD(r15);
        r7.ATD(r16);
        if (r0 != null) {
            r7.ATD(r0);
        }
        try {
            Object obj3 = r9.get();
            0qQ.A07(obj3);
            List<Medium> list = (List) obj3;
            Object obj4 = r15.get();
            0qQ.A07(obj4);
            Map map = (Map) obj4;
            Object obj5 = r16.get();
            0qQ.A07(obj5);
            Map map2 = (Map) obj5;
            if (r0 != null) {
                obj2 = r0.get();
            }
            for (Medium medium : list) {
                int i = medium.A08;
                Integer valueOf = Integer.valueOf(medium.A05);
                if (i == 3) {
                    obj = map2.get(valueOf);
                } else {
                    obj = map.get(valueOf);
                }
                medium.A0a = (String) obj;
                C348927zH r02 = this.A07;
                if (r02 == null || r02.CeG(medium)) {
                    arrayList.add(medium);
                }
                if (obj2 != null) {
                    if (r5 != null) {
                        AnonymousClass8XR.A00(medium, (Map) obj2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            return new C347987xh(arrayList, this.A01);
        } catch (InterruptedException | ExecutionException e) {
            0wb.A06("GalleryLoaderCallable", "failed to load recent captures", e);
            throw e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Boolean.valueOf(this.A0C), Long.valueOf(this.A04), Long.valueOf(this.A03), this.A0A, this.A07, Boolean.valueOf(this.A0B)});
    }

    public C357288Xh(Context context, C348927zH r5, AnonymousClass8XO r6, UserSession userSession, AnonymousClass8XR r8, int i, int i2, int i3, long j, long j2, boolean z, boolean z2) {
        this.A0D = userSession;
        this.A06 = context;
        this.A00 = i3;
        ContentResolver contentResolver = context.getContentResolver();
        0qQ.A07(contentResolver);
        this.A05 = contentResolver;
        this.A08 = r6;
        this.A01 = i;
        this.A02 = i2;
        this.A0C = z;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = r5;
        this.A0A = r8;
        this.A0B = z2;
    }
}
