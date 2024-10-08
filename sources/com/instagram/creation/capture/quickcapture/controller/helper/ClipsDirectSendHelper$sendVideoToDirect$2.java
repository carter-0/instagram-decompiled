package com.instagram.creation.capture.quickcapture.controller.helper;

import X.0eS;
import X.0sL;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C293505kq;
import X.C60340gF;
import X.C63145KsE;
import X.C9841RiD;
import X.N4L;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2", f = "ClipsDirectSendHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsDirectSendHelper$sendVideoToDirect$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C293505kq A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDirectSendHelper$sendVideoToDirect$2(Context context, FragmentActivity fragmentActivity, UserSession userSession, C293505kq r5, AnonymousClass3Q2 r6, String str, String str2, List list, AnonymousClass4D7 r10, boolean z, boolean z2) {
        super(2, r10);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = r6;
        this.A07 = list;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A03 = r5;
        this.A09 = z;
        this.A05 = str2;
        this.A08 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass3Q2 r5 = this.A04;
        List list = this.A07;
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        return new ClipsDirectSendHelper$sendVideoToDirect$2(context, fragmentActivity, userSession, this.A03, r5, str, this.A05, list, r14, this.A09, this.A08);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDirectSendHelper$sendVideoToDirect$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        0eS.A00(obj);
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass3Q2 r5 = this.A04;
        if (!(!C9841RiD.A00(context, (N4L) null, userSession, r5, AnonymousClass05K.A01) || (str = r5.A3V) == null || str.length() == 0)) {
            List list = this.A07;
            FragmentActivity fragmentActivity = this.A01;
            String str2 = this.A06;
            C63145KsE.A00(fragmentActivity, context, userSession, this.A03, r5, str, str2, this.A05, list, this.A09, this.A08);
        }
        return C60340gF.A00;
    }
}
