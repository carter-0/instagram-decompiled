package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Amp  reason: case insensitive filesystem */
public final /* synthetic */ class C41005Amp implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ AnonymousClass8D6 A01;

    public /* synthetic */ C41005Amp(AnonymousClass8BA r1, AnonymousClass8D6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r0 = this.A00;
        AnonymousClass8D6 r3 = this.A01;
        Context A0T = AnonymousClass7TE.A0T(r0);
        int dimensionPixelSize = A0T.getResources().getDimensionPixelSize(R.dimen.achievement_details_image_height_v2);
        UserSession userSession = r0.A0v;
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(r3.A00);
        float f = (float) dimensionPixelSize;
        String A002 = C273654mx.A00(1426);
        UserSession userSession2 = userSession;
        C369768vI r32 = new C369768vI(A0T, (RingSpec) null, userSession2, C317966o8.A00(simpleImageUrl, A002, A002, f, f, 1.0f), C318046oG.ACHIEVEMENTS, (AnonymousClass3ID) null, A002);
        r32.A04();
        Integer num = AnonymousClass05K.A01;
        AnonymousClass8BG r33 = new AnonymousClass8BG(1.0f, 0.1f);
        List singletonList = Collections.singletonList(A002);
        AnonymousClass8BA r28 = r0;
        C369768vI r29 = r32;
        r28.A0f(r29, AnonymousClass57C.CREATE_MODE_USER_SEARCH, new C310416b1((AnonymousClass8BH) r33, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, 0.4f, -1.0f, 6, false, false, true, false, false, false, false, true, false, true, true, true, false, false), A002, singletonList);
    }
}
