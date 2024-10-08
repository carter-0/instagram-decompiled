package com.instagram.creation.capture.quickcapture.controller.helper;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C293505kq;
import X.C60340gF;
import X.C63145KsE;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1", f = "ClipsDirectSendHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C293505kq A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(Context context, FragmentActivity fragmentActivity, UserSession userSession, C293505kq r5, AnonymousClass3Q2 r6, String str, String str2, String str3, List list, AnonymousClass4D7 r11, boolean z, boolean z2) {
        super(2, r11);
        this.A05 = str;
        this.A04 = r6;
        this.A02 = userSession;
        this.A08 = list;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A07 = str2;
        this.A03 = r5;
        this.A0A = z;
        this.A06 = str3;
        this.A09 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        String str = this.A05;
        AnonymousClass3Q2 r5 = this.A04;
        UserSession userSession = this.A02;
        List list = this.A08;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str2 = this.A07;
        return new ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(context, fragmentActivity, userSession, this.A03, r5, str, str2, this.A06, list, r15, this.A0A, this.A09);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        String str = this.A05;
        AnonymousClass3Q2 r4 = this.A04;
        UserSession userSession = this.A02;
        List list = this.A08;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str2 = this.A07;
        C63145KsE.A00(fragmentActivity, context, userSession, this.A03, r4, str, str2, this.A06, list, this.A0A, this.A09);
        return C60340gF.A00;
    }
}
