package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.EBy  reason: case insensitive filesystem */
public final class C47664EBy extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1ZT A02;
    public final /* synthetic */ 1Xj A03;

    public C47664EBy(FragmentActivity fragmentActivity, UserSession userSession, 1ZT r3, 1Xj r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(34022935);
        C43796CDo cDo = (C43796CDo) obj;
        int A0D = AnonymousClass7TG.A0D(cDo, -610328636);
        C47138DrF drF = cDo.A02;
        if (drF == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        C47185DsX dsX = drF.A00;
        if (dsX != null) {
            1ZT r10 = this.A02;
            1Xj r11 = this.A03;
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            if (AnonymousClass7TE.A1b(dsX.A03)) {
                int i = 5000;
                if (182.A06(0Tu.A05, userSession, 36323058114571061L)) {
                    i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
                }
                C310336ap A0W = DbV.A0W();
                A0W.A01 = i;
                A0W.A0D = dsX.A02;
                A0W.A0I = dsX.A01;
                A0W.A0J = true;
                A0W.A0R = true;
                if (r11.A1Q() != null) {
                    A0W.A03();
                    ImageUrl A1Q = r11.A1Q();
                    if (A1Q != null) {
                        A0W.A09 = A1Q;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                A0W.A0D(dsX.A00);
                A0W.A0A = new C57267IVc(fragmentActivity, dsX, userSession, r10, r11, i);
                A0W.A0L = true;
                1xC.A01.A01(new AnonymousClass3GP(A0W.A00()));
            } else {
                I6J i6j = I6J.A00;
                ProductType A1v = r11.A1v();
                String A2n = r11.A2n();
                if (A2n != null) {
                    i6j.A03(userSession, A1v, (String) null, "toast_info_validation", (String) null, A2n, "achievementIds is empty", (List) null, (List) null, (List) null, (Map) null, (Map) null);
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0A(-272770162, A0D);
                    throw A0y;
                }
            }
        }
        AnonymousClass0fD.A0A(1439184645, A0D);
        AnonymousClass0fD.A0A(-1748222053, A032);
    }

    public final void onFail(C268654dm r17) {
        C268654dm r1 = r17;
        int A0D = AnonymousClass7TG.A0D(r1, -456153266);
        I6J i6j = I6J.A00;
        UserSession userSession = this.A01;
        1Xj r0 = this.A03;
        ProductType A1v = r0.A1v();
        String A2n = r0.A2n();
        if (A2n != null) {
            i6j.A03(userSession, A1v, (String) null, "toast_info_fetch", (String) null, A2n, Dbb.A0b(r1), (List) null, (List) null, (List) null, (Map) null, (Map) null);
            AnonymousClass0fD.A0A(1560264083, A0D);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-55686020, A0D);
        throw A0y;
    }
}
