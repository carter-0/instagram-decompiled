package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.7kA  reason: invalid class name and case insensitive filesystem */
public final class C339787kA extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C339707k2 A01;
    public final /* synthetic */ C339697k1 A02;
    public final /* synthetic */ 1pS A03;

    public C339787kA(UserSession userSession, C339707k2 r2, C339697k1 r3, 1pS r4) {
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-773220655);
        C339767k8 r9 = (C339767k8) obj;
        int A033 = AnonymousClass0fD.A03(-959568012);
        0qQ.A0B(r9, 0);
        C342467oe r3 = r9.A01;
        if (r3 == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession = this.A00;
        C342457od r32 = (C342457od) r3;
        C342487og r0 = r32.A00;
        ((C342547om) userSession.A01(C342547om.class, C342537ol.A00)).A00 = r0;
        C342557on.A00(userSession).A00 = r32.A02;
        C339637jv.A00(userSession).A00 = r32.A01;
        this.A03.A06(userSession, this.A02);
        C339707k2 r02 = this.A01;
        if (r02 != null) {
            C339297jN r5 = r02.A01;
            r5.A08.postDelayed(new C342607os(r02.A00, r5, r02.A02, r02.A03), 200);
        }
        AnonymousClass0fD.A0A(-1521386939, A033);
        AnonymousClass0fD.A0A(-622088029, A032);
    }
}
