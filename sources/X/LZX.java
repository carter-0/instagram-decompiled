package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;

public final class LZX implements 06c {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;

    public LZX(Context context, FragmentActivity fragmentActivity, 0hq r3, AnonymousClass0iw r4, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = r4;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void DGi(String str, Bundle bundle) {
        0qQ.A0B(bundle, 1);
        boolean z = bundle.getBoolean("result_sticker_creation_status");
        FragmentActivity fragmentActivity = this.A01;
        Application A0A = JTP.A0A(fragmentActivity);
        UserSession userSession = this.A04;
        AnonymousClass8N2 A002 = JTO.A0L(new AnonymousClass8N1(A0A, userSession), fragmentActivity).A00(AnonymousClass8N2.class);
        if (z) {
            L6A l6a = new L6A(fragmentActivity, userSession);
            AnonymousClass0iw r5 = this.A03;
            Bitmap bitmap = ((CutoutStickerRepository) A002.A0F.getValue()).A00;
            WeakReference A0v = C51965G9l.A0v(this.A00);
            DbY.A1S(r5, A0v);
            if (!(!l6a.A02.A1o()) || bitmap == null) {
                Context context = (Context) A0v.get();
                if (context != null) {
                    LSX.A03(context, AnonymousClass7TE.A16(context, 2131957329), (String) null, ((NineSixteenLayoutConfigImpl) C226132fh.A00(context, l6a.A01)).A0G);
                }
            } else {
                AnonymousClass7TF.A0D().postDelayed(new M8Z(bitmap, r5, l6a), 500);
            }
        }
        this.A02.A0x(AnonymousClass000.A00(144));
    }
}
