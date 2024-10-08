package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.AsU  reason: case insensitive filesystem */
public final class C41347AsU implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C41347AsU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object call() {
        Object obj;
        switch (this.A00) {
            case 0:
                AnonymousClass9RJ r6 = (AnonymousClass9RJ) this.A01;
                Object obj2 = this.A02;
                int i = 0;
                try {
                    C340767ln r3 = r6.A0Q;
                    obj = null;
                    C340577lU.A00(24, AnonymousClass7TF.A1Q(2Ob.A00(obj2, r3.A03) ? 1 : 0) ? 1 : 0, (Object) null);
                    r6.A0A();
                    C340577lU.A00(25, 2Ob.A00(obj2, r3.A03) ^ true ? 1 : 0, (Object) null);
                    break;
                } catch (Exception e) {
                    if (!2Ob.A00(obj2, r6.A0Q.A03)) {
                        i = 1;
                    }
                    C340577lU.A00(26, i, e);
                    throw e;
                } catch (Throwable th) {
                    C340577lU.A00(25, 2Ob.A00(obj2, r6.A0Q.A03) ^ true ? 1 : 0, (Object) null);
                    throw th;
                }
            case 1:
                AnonymousClass9RJ r1 = (AnonymousClass9RJ) this.A01;
                C342717p3 r4 = (C342717p3) this.A02;
                if (!r1.isConnected()) {
                    return null;
                }
                r1.A0K.A02(r1.A0Z, (C343047pa) r4.A02(C342717p3.A0q), AnonymousClass7TG.A08(C342717p3.A0m, r4));
                return null;
            case 2:
                AnonymousClass9RJ r42 = (AnonymousClass9RJ) this.A01;
                C343147pk r32 = (C343147pk) this.A02;
                if (r42.A0b != null) {
                    r42.A0b.CEH();
                }
                r42.A0E("Cannot modify settings");
                int i2 = r42.A00;
                if (r42.A0b != null) {
                    r42.A0b.CEH();
                }
                C378969Rx r12 = r42.A0N;
                r12.A00(i2).A04(r32);
                return r12.A02(r42.A00);
            case 3:
                ((AnonymousClass9RJ) this.A01).A0J.A01.A01(this.A02);
                return null;
            case 4:
                AnonymousClass9RJ r43 = (AnonymousClass9RJ) this.A01;
                Rect rect = (Rect) this.A02;
                obj = null;
                if (r43.isConnected()) {
                    AnonymousClass9RJ.A07(r43);
                    r43.A0I.A03(rect, new C64425Lbg(r43, 0));
                    return null;
                }
                break;
            case 5:
                AnonymousClass9RJ r33 = (AnonymousClass9RJ) this.A01;
                Rect rect2 = (Rect) this.A02;
                obj = null;
                if (r33.isConnected()) {
                    if (AnonymousClass7TG.A1V(C342687p0.A0W, r33.AlD())) {
                        C378979Ry A012 = AnonymousClass9RJ.A01(r33, r33.A00);
                        A012.A00.A01(C342717p3.A0f, C14254Tsc.A00(rect2));
                        A012.A02();
                        return null;
                    }
                }
                break;
            case 6:
                ((AnonymousClass9RJ) this.A01).A0J.A01.A02(this.A02);
                return null;
            case 7:
                AnonymousClass9RJ r44 = (AnonymousClass9RJ) this.A01;
                C378949Rv r13 = r44.A0J;
                Camera camera = (Camera) this.A02;
                r13.A01(true, camera);
                obj = null;
                try {
                    camera.setPreviewTexture((SurfaceTexture) null);
                } catch (IOException e2) {
                    Log.e("Camera1Device", "Unable to remove the current SurfaceTexture", e2);
                }
                r44.A0K.A01(camera);
                AnonymousClass0fI.A00(camera);
                C341877nf r2 = r44.A0a;
                if (r2 != null) {
                    String A022 = r44.A0Q.A02();
                    if (!r2.A00.isEmpty()) {
                        C342057ny.A00(new C367468qn(r2, A022));
                        return null;
                    }
                }
                break;
            case 8:
                AnonymousClass9RJ r22 = (AnonymousClass9RJ) ((UP0) this.A01).A01;
                Object A002 = ((C363988kg) this.A02).A00(C363988kg.A08);
                A002.getClass();
                boolean A1a = AnonymousClass7TE.A1a(A002);
                C342057ny.A01("Performing post photo capture on UI thread");
                if (!r22.isConnected()) {
                    return null;
                }
                if (A1a) {
                    AnonymousClass9RJ.A05(r22);
                }
                r22.A0L.A01(0);
                return null;
            default:
                FilmstripTimelineView filmstripTimelineView = ((WUW) this.A02).A05;
                if (filmstripTimelineView == null) {
                    0qQ.A0F("trimmerTimelineView");
                    throw AnonymousClass00P.createAndThrow();
                }
                C39735A7b a7b = (C39735A7b) this.A01;
                filmstripTimelineView.A01(a7b.A00, a7b.A01);
                return AnonymousClass7TE.A0v();
        }
        return obj;
    }
}
