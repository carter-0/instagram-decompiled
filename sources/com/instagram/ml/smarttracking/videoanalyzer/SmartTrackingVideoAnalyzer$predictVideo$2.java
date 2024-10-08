package com.instagram.ml.smarttracking.videoanalyzer;

import X.0eS;
import X.0kD;
import X.0sL;
import X.0sn;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8L5;
import X.AnonymousClass9SY;
import X.AnonymousClass9TX;
import X.AnonymousClass9TY;
import X.C14279TtC;
import X.C378989Rz;
import X.C379229Ta;
import X.C59783JYc;
import X.C59784JYd;
import X.C60340gF;
import X.C67266Ml0;
import X.C7234Q0g;
import X.C7237Q0j;
import X.JYY;
import X.JYZ;
import X.Q0X;
import X.Q1F;
import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ml.smarttracking.videoanalyzer.SmartTrackingVideoAnalyzer$predictVideo$2", f = "SmartTrackingVideoAnalyzer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SmartTrackingVideoAnalyzer$predictVideo$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass8L5 A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartTrackingVideoAnalyzer$predictVideo$2(AnonymousClass8L5 r2, String str, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A01 = r2;
        this.A02 = str;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ml.smarttracking.videoanalyzer.SmartTrackingVideoAnalyzer$predictVideo$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new SmartTrackingVideoAnalyzer$predictVideo$2(this.A01, this.A02, r8, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SmartTrackingVideoAnalyzer$predictVideo$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Integer[] numArr = {new Integer(0), new Integer(0)};
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AnonymousClass8L5 r6 = this.A01;
        HashMap hashMap = r6.A04;
        String str = this.A02;
        hashMap.put(str, atomicBoolean);
        Context context = r6.A01;
        UserSession userSession = r6.A02;
        File A0t = AnonymousClass7TE.A0t(str);
        long j = this.A00 * 1000;
        C67266Ml0 A002 = JYY.A00(userSession);
        C379229Ta A003 = JYZ.A00(userSession);
        AnonymousClass9TX r30 = new AnonymousClass9TX(r6.A03, r6.A00, A1C, A1C2, A1C3, A1C4, atomicBoolean, numArr, j);
        AnonymousClass9TY r20 = new AnonymousClass9TY(r6, str, A1C4, A1C, A1C2, A1C3, atomicBoolean, numArr);
        C378989Rz r11 = new C378989Rz(224);
        AnonymousClass7TF.A1E(A002, 6, A003);
        try {
            UserSession userSession2 = A003.A00;
            ClipInfo A022 = Q0X.A02(userSession2, A0t, j);
            C59783JYc A004 = C59784JYd.A00(r11.A00(new Point(A022.A09, A022.A06)), r11.A00(new Point(A022.A09, A022.A06)), A022);
            C7234Q0g q0g = new C7234Q0g(context, userSession2, AnonymousClass9SY.A00(context, userSession2), C14279TtC.A01, A004);
            Point point = A004.A03;
            int i = point.x;
            C67266Ml0 ml0 = A002;
            UserSession userSession3 = userSession;
            C7237Q0j q0j = new C7237Q0j(context, q0g, userSession3, ml0, r30, A0t, 0sn.A00, i, point.y, 0, j, false, true, false);
            q0j.A04 = new Q1F(q0j, r20);
            q0j.A01();
        } catch (RuntimeException e) {
            0kD.A09(AnonymousClass000.A00(1057), "extractMultipleFrames failed.", e);
        }
        return C60340gF.A00;
    }
}
