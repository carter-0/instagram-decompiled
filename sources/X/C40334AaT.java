package X;

import android.content.Intent;
import android.os.Parcel;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AaT  reason: case insensitive filesystem */
public final class C40334AaT implements MTT {
    public final /* synthetic */ AnonymousClass8X3 A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ boolean A02;

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C40334AaT(AnonymousClass8X3 r1, ArrayList arrayList, boolean z) {
        this.A00 = r1;
        this.A01 = arrayList;
        this.A02 = z;
    }

    public final void DkH(Intent intent, boolean z) {
        AnonymousClass8BA r4;
        ShareMediaLoggingInfo shareMediaLoggingInfo;
        AnonymousClass8X3 r3 = this.A00;
        if (z) {
            if (182.A06(0Tu.A05, r3.A06, 36316662907998783L)) {
                ArrayList arrayList = this.A01;
                Parcel obtain = Parcel.obtain();
                ((ShareMediaLoggingInfo) arrayList.get(0)).writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                shareMediaLoggingInfo = (ShareMediaLoggingInfo) ShareMediaLoggingInfo.CREATOR.createFromParcel(obtain);
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(shareMediaLoggingInfo.A0B);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A1C.add(((ShareMediaLoggingInfo) it.next()).A0B);
                }
                MediaUploadMetadata A002 = AnonymousClass3QN.A00(A1C);
                0qQ.A0B(A002, 0);
                shareMediaLoggingInfo.A0B = A002;
            } else {
                shareMediaLoggingInfo = (ShareMediaLoggingInfo) AnonymousClass7TE.A12(this.A01);
            }
            AnonymousClass8X3.A02(intent, shareMediaLoggingInfo, r3);
            r4 = r3.A0E;
            r4.A0Z();
        } else {
            r4 = r3.A0E;
            r4.A0c();
        }
        ((AnonymousClass80T) r3.A0Y).A01.A04(new C356458Ty(intent, z));
        if (z) {
            27p.A01(r3.A06).A04.A09();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r3.A07;
        touchInterceptorFrameLayout.setScaleX(1.0f);
        touchInterceptorFrameLayout.setScaleY(1.0f);
        C356798Vg.A00(r3.A0P);
        r4.D19(true);
        r4.A0a();
        if (this.A02) {
            r3.A0B.A0c.A0C(true, false);
        }
        AnonymousClass815 r2 = r3.A0M;
        r2.A00.A0e.A1q.A04(intent.getBooleanExtra(AnonymousClass000.A00(25), false));
    }
}
