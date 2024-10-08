package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.ArrayList;

/* renamed from: X.PSh  reason: case insensitive filesystem */
public final class C72998PSh implements 1aV {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ AnonymousClass7H6 A01;
    public final /* synthetic */ AnonymousClass77B A02;
    public final /* synthetic */ C254933tI A03;
    public final /* synthetic */ DirectCameraViewModel A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ boolean A06;

    public C72998PSh(RectF rectF, AnonymousClass7H6 r2, AnonymousClass77B r3, C254933tI r4, DirectCameraViewModel directCameraViewModel, ArrayList arrayList, boolean z) {
        this.A04 = directCameraViewModel;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = rectF;
        this.A05 = arrayList;
        this.A03 = r4;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImageUrl imageUrl = (ImageUrl) obj;
        1aq r6 = 1as.A04.A01;
        DirectCameraViewModel directCameraViewModel = this.A04;
        AnonymousClass7H6 r1 = this.A01;
        C254743sy r13 = r1.A0S;
        if (r13 != null) {
            AnonymousClass77B r2 = this.A02;
            String str = r2.A0T;
            String str2 = r2.A0N;
            boolean z = r2.A0m;
            String CFp = C327657Br.A00().A01(2FW.A1A).CFp();
            28D r9 = 28D.A2N;
            RectF rectF = this.A00;
            ArrayList arrayList = this.A05;
            boolean z2 = r2.A0p;
            FragmentActivity fragmentActivity = r1.A0t;
            AnonymousClass6W8.A02(fragmentActivity, r6.A00(rectF, rectF, r9, imageUrl, this.A03, directCameraViewModel, r13, str, str2, "permanent", CFp, arrayList, z, z2, this.A06), r1.A0w, TransparentModalActivity.class, "direct_visual_reply_fragment").A0C(fragmentActivity);
            fragmentActivity.overridePendingTransition(0, 0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
