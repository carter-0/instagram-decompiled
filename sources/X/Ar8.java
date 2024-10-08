package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.HashMap;
import java.util.List;

public final class Ar8 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass9I6 A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ AnonymousClass8L1 A04;
    public final /* synthetic */ C366688pV A05;
    public final /* synthetic */ LD4 A06;
    public final /* synthetic */ AnonymousClass8PW A07;
    public final /* synthetic */ C381539bv A08;
    public final /* synthetic */ FilterGroupModel A09;
    public final /* synthetic */ DirectCameraViewModel A0A;
    public final /* synthetic */ C381779cJ A0B;
    public final /* synthetic */ L8M A0C;
    public final /* synthetic */ AnonymousClass8VT A0D;
    public final /* synthetic */ C349307zv A0E;
    public final /* synthetic */ Boolean A0F;
    public final /* synthetic */ Integer A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ List A0N;
    public final /* synthetic */ List A0O;
    public final /* synthetic */ boolean A0P;
    public final /* synthetic */ boolean A0Q;

    public Ar8(Bitmap bitmap, AnonymousClass9I6 r3, AnonymousClass0iw r4, 1GK r5, AnonymousClass8L1 r6, C366688pV r7, LD4 ld4, AnonymousClass8PW r9, C381539bv r10, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C381779cJ r13, L8M l8m, AnonymousClass8VT r15, C349307zv r16, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z, boolean z2) {
        this.A04 = r6;
        this.A06 = ld4;
        this.A07 = r9;
        this.A0E = r16;
        this.A05 = r7;
        this.A01 = r3;
        this.A0L = str;
        this.A00 = bitmap;
        this.A03 = r5;
        this.A0B = r13;
        this.A0C = l8m;
        this.A0D = r15;
        this.A0M = str2;
        this.A0K = str3;
        this.A09 = filterGroupModel;
        this.A0N = list;
        this.A0O = list2;
        this.A0H = str4;
        this.A0F = bool;
        this.A0J = str5;
        this.A08 = r10;
        this.A0Q = z;
        this.A0I = str6;
        this.A0A = directCameraViewModel;
        this.A0P = z2;
        this.A02 = r4;
        this.A0G = num;
    }

    public final void run() {
        1GK r16;
        AnonymousClass8L1 r2 = this.A04;
        C353918Jw r54 = r2.A08;
        C41713Az4 az4 = C41713Az4.A00;
        LD4 ld4 = this.A06;
        AnonymousClass8PW r6 = this.A07;
        int A022 = C59895JbK.A02(ld4);
        1iA r46 = 1iA.A0a;
        C349307zv r1 = this.A0E;
        int i = r1.A0F;
        String str = r1.A0f;
        String A052 = r1.A05();
        C366688pV r9 = this.A05;
        CameraAREffect cameraAREffect = r9.A00;
        UserSession userSession = r2.A02;
        HashMap A0D2 = C59895JbK.A0D(userSession, r6.A0E);
        C59895JbK.A09(r6.A0D);
        String A0B2 = C59895JbK.A0B(r2.A05);
        String str2 = r1.A0g;
        boolean z = true;
        if (!r6.A00()) {
            z = false;
        }
        int A002 = C59895JbK.A00(r6.A06);
        Pair A042 = C59895JbK.A04(r6.A0E, r6.A0F);
        MediaTransformation A003 = AEE.A00(r9.A04);
        AEE.A02(r9);
        Integer A043 = r1.A04();
        String str3 = this.A0L;
        MediaUploadMetadata A023 = r1.A02();
        0qQ.A0B(az4, 2);
        AnonymousClass8L3 r48 = r2.A07;
        Context context = r2.A01;
        Bitmap bitmap = this.A00;
        AnonymousClass7TG.A1N(userSession, context);
        if (bitmap != null) {
            r16 = AEI.A01(context, bitmap, userSession, false);
        } else {
            r16 = null;
        }
        1GK r45 = this.A03;
        C381779cJ r25 = this.A0B;
        L8M l8m = this.A0C;
        AnonymousClass8VT r24 = this.A0D;
        String str4 = this.A0M;
        String str5 = this.A0K;
        String str6 = r2.A0B;
        FilterGroupModel filterGroupModel = this.A09;
        List list = this.A0N;
        List list2 = this.A0O;
        Boolean bool = this.A0F;
        String str7 = this.A0J;
        C381539bv r13 = this.A08;
        boolean z2 = this.A0Q;
        String str8 = this.A0I;
        C40367Ab0 ab0 = new C40367Ab0(userSession, r16, r45, r9, r48, ld4, r13, filterGroupModel, this.A0A, r25, (A6R) null, l8m, r24, r1, bool, str4, str3, str5, str6, this.A0H, str7, str8, list, list2, false, z2);
        if (this.A0P) {
            C394279xp.A00(userSession).A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, "activity_result", 0sr.A1M(new A52[]{new A52(new C365798nh(r1.A0N, r1, r1.A07()), ab0)}), true);
            return;
        }
        C39651A3r ELx = ab0.ELx((C53401GnY) null, (String) null, false);
        r54.A02(A042, cameraAREffect, A023, A003, (C254743sy) null, r46, A043, str, A052, A0B2, str2, ELx.A00, str3, (String) null, (String) null, (String) null, (List) null, A0D2, A022, i, A002, z);
        C245983dn.A01(new C41244Aqg(bitmap, this.A02, r2, ELx, ld4, this.A0G));
    }
}
