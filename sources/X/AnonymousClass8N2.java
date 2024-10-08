package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3;
import com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.8N2  reason: invalid class name */
public final class AnonymousClass8N2 extends C361478gI {
    public C63972LGc A00;
    public C262204Co A01;
    public C262204Co A02;
    public C262204Co A03;
    public C262204Co A04;
    public C262204Co A05;
    public C262204Co A06;
    public 05G A07 = new 02z("");
    public 05G A08 = new 02z(false);
    public 05G A09 = new 02z(false);
    public 05G A0A = 106.A01((Object) null);
    public boolean A0B;
    public C262204Co A0C;
    public final Application A0D;
    public final UserSession A0E;
    public final AnonymousClass0eM A0F;
    public final CoroutineExceptionHandler A0G = new CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
    public final 05G A0H;
    public final AnonymousClass0Ud A0I;

    public final void A0I(Bitmap bitmap, boolean z) {
        Object value;
        AnonymousClass8N5 r7;
        Bitmap bitmap2;
        float[] fArr;
        Bitmap bitmap3;
        Integer num;
        boolean z2;
        Object value2;
        AnonymousClass8N5 r0;
        Integer num2;
        Bitmap bitmap4;
        float[] fArr2;
        Bitmap bitmap5 = bitmap;
        0qQ.A0B(bitmap5, 0);
        05G r4 = this.A07;
        do {
        } while (!r4.AIY(r4.getValue(), ""));
        05G r1 = this.A0H;
        do {
            value = r1.getValue();
            r7 = (AnonymousClass8N5) value;
            bitmap2 = r7.A00;
            fArr = r7.A08;
            bitmap3 = r7.A01;
            num = r7.A05;
            z2 = r7.A07;
        } while (!r1.AIY(value, new AnonymousClass8N5(bitmap5, bitmap2, bitmap3, r7.A03, r7.A04, num, fArr, z2, r7.A06)));
        Application application = this.A0D;
        Context applicationContext = application.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = this.A0E;
        Context applicationContext2 = application.getApplicationContext();
        0qQ.A07(applicationContext2);
        boolean z3 = z;
        this.A00 = new C63972LGc(applicationContext, bitmap5, userSession, new C21416XaQ(applicationContext2, userSession), z3);
        do {
            value2 = r1.getValue();
            r0 = (AnonymousClass8N5) value2;
            num2 = AnonymousClass05K.A00;
            bitmap4 = r0.A02;
            fArr2 = r0.A08;
        } while (!r1.AIY(value2, new AnonymousClass8N5(bitmap4, bitmap5, (Bitmap) null, r0.A03, r0.A04, num2, fArr2, false, false)));
        C318136oS A002 = C318116oQ.A00(this);
        this.A0C = 1Eo.A03(num2, 19B.A00, new CutoutStickerViewModel$loadOriginalBitmap$3(bitmap5, this, (AnonymousClass4D7) null, z3), A002);
    }

    public final Bitmap A0E(C289295dM r11, AnonymousClass5VN r12, C288025bF r13, Integer num, boolean z) {
        Rect rect;
        C63972LGc lGc;
        float[] fArr;
        Integer num2;
        Integer num3;
        AnonymousClass0Ud r5 = this.A0I;
        Integer num4 = ((AnonymousClass8N5) r5.getValue()).A05;
        if (((Boolean) this.A08.getValue()).booleanValue()) {
            Bitmap bitmap = ((AnonymousClass8N5) r5.getValue()).A02;
            if (bitmap != null) {
                num2 = Integer.valueOf(bitmap.getWidth());
            } else {
                num2 = null;
            }
            Bitmap bitmap2 = ((AnonymousClass8N5) r5.getValue()).A02;
            if (bitmap2 != null) {
                num3 = Integer.valueOf(bitmap2.getHeight());
            } else {
                num3 = null;
            }
            int i = C56445Hyd.A00;
            rect = null;
            if (!(num2 == null || num3 == null || r12 == null || r11 == null || r13 == null)) {
                float intValue = (float) num2.intValue();
                long j = r13.A00;
                float A022 = intValue / C288025bF.A02(j);
                float intValue2 = ((float) num3.intValue()) / C288025bF.A00(j);
                AnonymousClass5VN A032 = r12.A03(r11.A00 ^ -9223372034707292160L);
                RectF rectF = new RectF(A032.A01 * A022, A032.A03 * intValue2, A032.A02 * A022, A032.A00 * intValue2);
                rect = new Rect();
                rectF.roundOut(rect);
            }
        } else {
            rect = null;
        }
        if (num4 == AnonymousClass05K.A01) {
            return C56445Hyd.A00(((AnonymousClass8N5) r5.getValue()).A02, rect, num, ((AnonymousClass8N5) r5.getValue()).A08, z);
        }
        if (num4 != AnonymousClass05K.A0j || (lGc = this.A00) == null) {
            return null;
        }
        Bitmap bitmap3 = lGc.A02;
        C59721JVf jVf = (C59721JVf) 00k.A0O(lGc.A04, lGc.A00);
        if (jVf != null) {
            fArr = (float[]) jVf.A00;
        } else {
            fArr = null;
        }
        return C56445Hyd.A00(bitmap3, rect, num, fArr, z);
    }

    public final Integer A0F() {
        Integer num = ((AnonymousClass8N5) this.A0H.getValue()).A05;
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 6:
                return AnonymousClass05K.A00;
            case 3:
            case 4:
            case 5:
                return AnonymousClass05K.A01;
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public final void A0G() {
        C262204Co r0 = this.A0C;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C262204Co r02 = this.A05;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        C262204Co r03 = this.A01;
        if (r03 != null) {
            r03.AG7((CancellationException) null);
        }
        C262204Co r04 = this.A06;
        if (r04 != null) {
            r04.AG7((CancellationException) null);
        }
        C262204Co r05 = this.A03;
        if (r05 != null) {
            r05.AG7((CancellationException) null);
        }
        if (this.A0B) {
            C262204Co r06 = this.A02;
            if (r06 != null) {
                r06.AG7((CancellationException) null);
            }
            C262204Co r07 = this.A04;
            if (r07 != null) {
                r07.AG7((CancellationException) null);
            }
        }
        this.A0B = false;
        this.A08.Epw(false);
        this.A0H.Epw(new AnonymousClass8N5((Bitmap) null, (Bitmap) null, (Bitmap) null, (C61029JvT) null, (AnonymousClass8N6) null, (Integer) null, (float[]) null, false, false));
    }

    public final void A0H() {
        Object value;
        AnonymousClass8N5 r0;
        Integer num;
        Bitmap bitmap = ((AnonymousClass8N5) this.A0I.getValue()).A02;
        05G r2 = this.A0H;
        do {
            value = r2.getValue();
            r0 = (AnonymousClass8N5) value;
            num = AnonymousClass05K.A0N;
        } while (!r2.AIY(value, new AnonymousClass8N5(r0.A02, bitmap, (Bitmap) null, r0.A03, r0.A04, num, r0.A08, r0.A07, r0.A06)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass8N2(Application application, UserSession userSession) {
        super(application);
        Context applicationContext = application.getApplicationContext();
        0qQ.A07(applicationContext);
        AnonymousClass8N3 r3 = new AnonymousClass8N3(applicationContext, userSession);
        0qQ.A0B(userSession, 2);
        this.A0D = application;
        this.A0E = userSession;
        this.A0F = AnonymousClass0eN.A01(new C377429Lu(6, r3, new AnonymousClass8ZA(r3.A00)));
        02z r0 = new 02z(new AnonymousClass8N5((Bitmap) null, (Bitmap) null, (Bitmap) null, (C61029JvT) null, (AnonymousClass8N6) null, (Integer) null, (float[]) null, false, false));
        this.A0H = r0;
        this.A0I = r0;
    }
}
