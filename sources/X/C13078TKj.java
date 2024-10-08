package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.TKj  reason: case insensitive filesystem */
public final class C13078TKj implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Rect A03;
    public final /* synthetic */ Medium A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ String A07;

    public C13078TKj(Context context, Rect rect, Medium medium, UserSession userSession, AnonymousClass3Q2 r5, String str, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = context;
        this.A05 = userSession;
        this.A04 = medium;
        this.A07 = str;
        this.A06 = r5;
        this.A03 = rect;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.Tgw, java.lang.Object] */
    public final void run() {
        IOException iOException;
        try {
            if (this.A00 != this.A01) {
                Context context = this.A02;
                UserSession userSession = this.A05;
                String str = this.A04.A0X;
                String str2 = this.A07;
                0qQ.A0A(str2);
                AnonymousClass3Q2 r8 = this.A06;
                SSv A022 = SSv.A02(context, userSession, r8, r8.A5x, new C11387SRa(userSession, r8.A0E(), false, r8.A5D, true, false).A06());
                Point point = A022.A00;
                0qQ.A07(point);
                int i = point.x;
                int i2 = point.y;
                C11354SOn sOn = new C11354SOn();
                sOn.A0C = i;
                sOn.A0A = i2;
                sOn.A00 = r8.A02;
                int A042 = A022.A04();
                sOn.A04 = A042;
                sOn.A01 = A042;
                sOn.A02 = 30;
                sOn.A03 = 4;
                sOn.A0K = C9862Rib.A00(userSession, r8.A0E());
                0qQ.A0B(str, 1);
                0qQ.A0B(str2, 4);
                AtomicReference atomicReference = new AtomicReference();
                C7955Qdw qdw = new C7955Qdw(atomicReference);
                C266824aP r9 = new C266824aP();
                Pxh.A1F(r9, new C266764aJ(C266714aE.VIDEO), new C266744aH(AnonymousClass7TE.A0t(str)));
                SF8 sf8 = new SF8();
                sf8.A00 = 128000;
                sf8.A01 = 2;
                SQv sQv = new SQv();
                sQv.A08 = new MediaComposition(r9);
                sQv.A06 = sOn;
                sQv.A0F = str2;
                sQv.A07 = qdw;
                sQv.A0C = new SFQ(sf8);
                sQv.A0Q = true;
                sQv.A0B = new C7967QeF(userSession, r8);
                File cacheDir = context.getCacheDir();
                0qQ.A07(cacheDir);
                C10683RwN rwN = new C10683RwN(userSession, cacheDir, true, false);
                ? obj = new Object();
                C11261SHv.A00(context, rwN, obj, new C10862RzN(sQv));
                obj.A0B = new Object();
                obj.A06 = new C12322SrS(context);
                obj.A02 = C9935Rjo.A00;
                try {
                    C7255Q1d.A00(obj, userSession).FNH();
                    if (atomicReference.get() != null) {
                        iOException = Pxe.A0c("Failure when updating video", (Throwable) atomicReference.get());
                        throw iOException;
                    }
                } catch (ExecutionException e) {
                    iOException = Pxe.A0c("Failure when updating video", e);
                } catch (InterruptedException e2) {
                    iOException = Pxe.A0c("Failure when updating video", e2);
                }
            }
            LS2.A00(this.A02, this.A05, this.A06);
        } catch (Exception e3) {
            UserSession userSession2 = this.A05;
            AnonymousClass3Q2 r3 = this.A06;
            if (182.A06(0Tu.A05, userSession2, 2342163288483897504L)) {
                AnonymousClass1Nd.A00(userSession2).A00(new C64670Lfw(r3, true));
            }
            0wb.A06("open_carousel_submission_uploader", "Error cropping or posting video", e3);
            C56588I2s.A00(this.A02);
        }
    }
}
