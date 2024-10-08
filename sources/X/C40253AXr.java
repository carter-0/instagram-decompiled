package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;

/* renamed from: X.AXr  reason: case insensitive filesystem */
public final class C40253AXr implements AnonymousClass1MK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass88F A01;
    public final /* synthetic */ 0sP A02;

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        float A04;
        0qQ.A0B(r7, 1);
        AnonymousClass88F r1 = this.A01;
        if (AnonymousClass88F.A05(r1)) {
            Bitmap bitmap = r7.A01;
            Float f = null;
            if (r1.A0U) {
                try {
                    Context context = this.A00;
                    0qQ.A0A(context);
                    f = Float.valueOf(0nA.A04(context, context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height)));
                } catch (Resources.NotFoundException unused) {
                    0wj.A01.AEf("Resource.NotFoundException when getting R.dimen.intermediate_viewer_selfie_reply_media_corner_radius", 20134884).report();
                }
            }
            Context context2 = this.A00;
            0qQ.A0A(context2);
            0qQ.A0B(context2, 0);
            AnonymousClass8DV r12 = new AnonymousClass8DV(context2.getResources(), bitmap);
            if (f != null) {
                A04 = f.floatValue();
            } else {
                A04 = 0nA.A04(context2, 12);
            }
            r12.A02(A04);
            this.A02.invoke(r12);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C40253AXr(Context context, AnonymousClass88F r2, 0sP r3) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }
}
