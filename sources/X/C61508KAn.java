package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.KAn  reason: case insensitive filesystem */
public final class C61508KAn extends C67620Mqs {
    public final /* synthetic */ C59870Jat A00;

    public C61508KAn(C59870Jat jat) {
        this.A00 = jat;
    }

    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Object obj;
        String str;
        AnonymousClass3Q2 r2 = ((AnonymousClass3Q2[]) objArr)[0];
        C59870Jat jat = this.A00;
        C59873Jaw jaw = jat.A06.A01;
        LinkedList linkedList = jaw.A01;
        if (linkedList.size() >= 1) {
            SystemClock.elapsedRealtime();
            if (!linkedList.isEmpty()) {
                obj = 00k.A0I(linkedList);
            } else {
                obj = null;
            }
            C59796JYp jYp = (C59796JYp) obj;
            jYp.getClass();
            int i = jYp.A02;
            int i2 = i;
            int i3 = jYp.A00;
            if (i > i3) {
                i2 = i3;
                i3 = i;
            }
            r2.A0K = 1;
            r2.A0H = i2;
            r2.A0G = i3;
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = jaw.iterator();
            while (it.hasNext()) {
                C59796JYp jYp2 = (C59796JYp) it.next();
                if (jYp2.A05 == AnonymousClass05K.A01 && (str = jYp2.A07) != null) {
                    A1C.add(AnonymousClass7TE.A0t(str));
                    ClipInfo clipInfo = new ClipInfo();
                    clipInfo.A0F = str;
                    clipInfo.A03 = jYp2.A01;
                    long j = jYp2.A03;
                    clipInfo.A07 = 0;
                    clipInfo.A05 = (int) j;
                    clipInfo.A09 = i2;
                    clipInfo.A06 = i3;
                    A1C2.add(clipInfo);
                }
            }
            0qQ.A0B(A1C2, 0);
            r2.A4G = A1C2;
            String absolutePath = ((File) A1C.get(0)).getAbsolutePath();
            String A0R = 002.A0R(absolutePath.substring(0, absolutePath.length() - 4), "-stitched.mp4");
            File A0t = AnonymousClass7TE.A0t(A0R);
            02m A0l = C51965G9l.A0l();
            A0l.markerStart(54722561);
            float A002 = C11101SAc.A00(A0t, A1C);
            A0l.markerAnnotate(54722561, TraceFieldType.Duration, (double) A002);
            A0l.markerEnd(54722561, 2);
            ClipInfo clipInfo2 = new ClipInfo();
            clipInfo2.A0F = A0R;
            Integer num = jat.A05.A00.A0A;
            num.getClass();
            clipInfo2.A03 = num.intValue();
            clipInfo2.A07 = 0;
            float f = A002 * 1000.0f;
            clipInfo2.A05 = (int) f;
            clipInfo2.A0A = (long) f;
            clipInfo2.A09 = i2;
            clipInfo2.A06 = i3;
            0qQ.A0B(clipInfo2, 0);
            r2.A1N = clipInfo2;
            r2.A44 = Q0Y.A02(A0R);
            Context context = (Context) jat.A09.get();
            if (context != null) {
                C3499682q A0k = JTR.A0k(context);
                A0k.ExH(A0t.getPath());
                A0k.EfU(r2.A35);
                A0k.EOx(1.0f);
            }
            SystemClock.elapsedRealtime();
        }
        return r2;
    }

    public final void A04() {
        MQA mqa = (MQA) this.A00.A0A.get();
        if (mqa != null) {
            C59867Jal jal = (C59867Jal) mqa;
            Context context = jal.getContext();
            AnonymousClass6ST r1 = new AnonymousClass6ST(context);
            jal.A09 = r1;
            DbU.A18(context, r1, 2131969783);
            jal.A09.setCancelable(false);
            jal.postDelayed(new M2I(jal), 500);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        r1 = (X.C59867Jal) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A05(java.lang.Object r5) {
        /*
            r4 = this;
            X.3Q2 r5 = (X.AnonymousClass3Q2) r5
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A1N
            if (r0 != 0) goto L_0x0023
            java.lang.String r3 = "Null stitchedClipInfo clipStackManager.size(): "
            X.Jat r0 = r4.A00
            X.Jav r0 = r0.A06
            X.Jaw r0 = r0.A01
            java.util.LinkedList r0 = r0.A01
            int r2 = r0.size()
            java.lang.String r1 = " hasClips() "
            boolean r0 = X.DbT.A1b(r0)
            java.lang.String r1 = X.002.A0d(r3, r1, r2, r0)
            java.lang.String r0 = "VideoCaptureController"
            X.0kD.A01(r0, r1)
        L_0x0023:
            X.Jat r3 = r4.A00
            java.lang.ref.WeakReference r0 = r3.A0A
            java.lang.Object r2 = r0.get()
            X.MQA r2 = (X.MQA) r2
            if (r2 == 0) goto L_0x003c
            r1 = r2
            X.Jal r1 = (X.C59867Jal) r1
            X.6ST r0 = r1.A09
            if (r0 == 0) goto L_0x003c
            r0.dismiss()
            r0 = 0
            r1.A09 = r0
        L_0x003c:
            java.lang.ref.WeakReference r0 = r3.A09
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x004e
            X.1ua r1 = r3.A08
            X.3Q2 r0 = r3.A00
            r0.getClass()
            r1.A0F(r0)
        L_0x004e:
            if (r2 == 0) goto L_0x0057
            X.Jal r2 = (X.C59867Jal) r2
            X.4mm r0 = r2.A05
            r0.Cqm(r5)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61508KAn.A05(java.lang.Object):void");
    }
}
