package X;

import android.app.Activity;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzc;

/* renamed from: X.Syz  reason: case insensitive filesystem */
public final class C12600Syz implements C365558nJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12600Syz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void D59(AnonymousClass9GD r8) {
        AnonymousClass9GD r2;
        if (this.A00 != 0) {
            0qQ.A0B(r8, 0);
            if (r8.A0E()) {
                C69102Neh neh = (C69102Neh) this.A02;
                Activity activity = neh.A04;
                SzS szS = (SzS) ((C13488TbF) this.A01);
                zza zza = (zza) ((ReviewInfo) r8.A06());
                if (zza.A01) {
                    r2 = new AnonymousClass9GD();
                    r2.A0C((Object) null);
                } else {
                    Intent A0A = C66580MXl.A0A(activity, PlayCoreDialogWrapperActivity.class);
                    A0A.putExtra("confirmation_intent", zza.A00);
                    A0A.putExtra("window_flags", C66581MXm.A0A(activity).getWindowSystemUiVisibility());
                    C365498nD r22 = new C365498nD();
                    A0A.putExtra("result_receiver", new zzc(szS.A00, r22));
                    activity.startActivity(A0A);
                    r2 = r22.A00;
                }
                0qQ.A07(r2);
                r2.A03(new C12596Syv(neh, 2));
                return;
            }
            return;
        }
        0qQ.A0B(r8, 0);
        ((C3024463i) this.A02).A02.execute(new C73173PY8((C71087ObS) this.A01, r8));
    }
}
