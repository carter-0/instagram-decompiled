package X;

import android.app.Activity;
import android.util.Pair;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Aax  reason: case insensitive filesystem */
public final class C40364Aax implements C41818B1y {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ C364758lx A01;
    public final /* synthetic */ LD4 A02;
    public final /* synthetic */ AnonymousClass8PW A03;
    public final /* synthetic */ C381779cJ A04;
    public final /* synthetic */ C352218Cl A05;

    public final void Dgl(boolean z, String str) {
    }

    public C40364Aax(AnonymousClass8K4 r1, C364758lx r2, LD4 ld4, AnonymousClass8PW r4, C381779cJ r5, C352218Cl r6) {
        this.A00 = r1;
        this.A02 = ld4;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public final void Ddm(boolean z, String str) {
        String str2;
        String str3 = str;
        if (!z || str == null) {
            Activity activity = this.A00.A0A;
            if (str == null) {
                str2 = "render_finished_path_is_null";
            } else {
                str2 = "render_finished_success_is_false";
            }
            C59689JTv.A0A(activity, str2);
            return;
        }
        AnonymousClass8K4 r2 = this.A00;
        LD4 ld4 = this.A02;
        C352218Cl r1 = this.A05;
        AnonymousClass8PW r3 = this.A03;
        C364758lx r5 = this.A01;
        List list = r3.A0E;
        C353918Jw r13 = r2.A0U;
        int A022 = C59895JbK.A02(ld4);
        1iA r19 = 1iA.A0Q;
        int i = r1.A08;
        String str4 = r1.A0a;
        String A052 = r1.A05();
        CameraAREffect cameraAREffect = r5.A01;
        UserSession userSession = r2.A0D;
        HashMap A0D = C59895JbK.A0D(userSession, list);
        C59895JbK.A09(r3.A0D);
        C254743sy A023 = AnonymousClass8K4.A02(r2, ld4);
        String A0B = C59895JbK.A0B(r2.A0I);
        String str5 = r1.A0b;
        boolean z2 = true;
        if (!r3.A00()) {
            z2 = false;
        }
        int A002 = C59895JbK.A00(r3.A06);
        Pair A042 = C59895JbK.A04(list, r3.A0F);
        MediaTransformation A003 = AEE.A00(r5.A04);
        AEE.A01(r5);
        Integer A043 = r1.A04();
        MediaUploadMetadata A012 = r1.A01();
        List A004 = C394979z0.A00(r1);
        String str6 = str4;
        r13.A02(A042, cameraAREffect, A012, A003, A023, r19, A043, str6, A052, A0B, str5, (String) null, (String) null, r1.A0g, r1.A0e, r1.A0i, A004, A0D, A022, i, A002, z2);
        DirectShareTarget directShareTarget = ld4.A00;
        directShareTarget.getClass();
        C254783t2 r32 = directShareTarget.A09;
        r32.getClass();
        if (r32 instanceof AnonymousClass9HR) {
            Activity activity2 = r2.A0A;
            C381779cJ r12 = this.A04;
            AGu aGu = C39622A2m.A02;
            AGu.A00(activity2, userSession, directShareTarget, r12, "PhotoViewController_sendPhotoToMsys", str3);
            return;
        }
        C66551pM.A00().EMG((C53401GnY) null, r1.A01(), userSession, r2.A0P, ld4, this.A04, (A6R) null, (AnonymousClass3Q2) null, str3, false);
    }
}
