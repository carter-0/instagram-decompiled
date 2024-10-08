package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.EBz  reason: case insensitive filesystem */
public final class C47665EBz extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1ZT A02;
    public final /* synthetic */ 1Xj A03;

    public C47665EBz(FragmentActivity fragmentActivity, UserSession userSession, 1ZT r3, 1Xj r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(51690313);
        C43796CDo cDo = (C43796CDo) obj;
        int A0D = AnonymousClass7TG.A0D(cDo, 1986249024);
        C47138DrF drF = cDo.A02;
        if (drF == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        C47191Dsd dsd = drF.A01;
        if (dsd != null) {
            1ZT r11 = this.A02;
            1Xj r8 = this.A03;
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            if (AnonymousClass7TE.A1b(dsd.A04)) {
                C310336ap A0W = DbV.A0W();
                A0W.A01 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
                A0W.A0D = dsd.A03;
                A0W.A0I = dsd.A02;
                A0W.A0J = true;
                A0W.A02();
                A0W.A04 = fragmentActivity.getDrawable(R.drawable.instagram_trophy_pano_outline_24);
                A0W.A0R = true;
                A0W.A0D(dsd.A00);
                A0W.A0A(new C57277IVm(3, r8, dsd, userSession, r11, fragmentActivity));
                A0W.A0L = true;
                1xC.A01.A01(new AnonymousClass3GP(A0W.A00()));
            } else {
                I6J i6j = I6J.A00;
                ProductType A1v = r8.A1v();
                String A2n = r8.A2n();
                if (A2n != null) {
                    i6j.A03(userSession, A1v, (String) null, "toast_info_validation", (String) null, A2n, "challengeIds is empty", (List) null, (List) null, (List) null, (Map) null, AnonymousClass7TF.A0w(AnonymousClass000.A00(543), "true"));
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0A(-1867593473, A0D);
                    throw A0y;
                }
            }
        }
        AnonymousClass0fD.A0A(-629670735, A0D);
        AnonymousClass0fD.A0A(2110772055, A032);
    }

    public final void onFail(C268654dm r17) {
        C268654dm r1 = r17;
        int A0D = AnonymousClass7TG.A0D(r1, 756050148);
        I6J i6j = I6J.A00;
        UserSession userSession = this.A01;
        1Xj r0 = this.A03;
        ProductType A1v = r0.A1v();
        String A2n = r0.A2n();
        if (A2n != null) {
            i6j.A03(userSession, A1v, (String) null, "toast_info_fetch", (String) null, A2n, Dbb.A0b(r1), (List) null, (List) null, (List) null, (Map) null, AnonymousClass7TF.A0w(AnonymousClass000.A00(543), "true"));
            AnonymousClass0fD.A0A(482506903, A0D);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-519601133, A0D);
        throw A0y;
    }
}
