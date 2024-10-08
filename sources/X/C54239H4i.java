package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.H4i  reason: case insensitive filesystem */
public final class C54239H4i extends 1P0 {
    public final /* synthetic */ C233122uz A00;

    public C54239H4i(C233122uz r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 722274530);
        SystemClock.elapsedRealtime();
        AnonymousClass0fD.A0A(-750048627, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1131938887);
        this.A00.A00.A00.A08 = AnonymousClass05K.A00;
        AnonymousClass0fD.A0A(1813754337, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(759331999);
        SystemClock.elapsedRealtime();
        AnonymousClass0fD.A0A(151009884, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C233862wb r2;
        HashMap hashMap;
        String str2;
        int A03 = AnonymousClass0fD.A03(-210846590);
        C54046GyV gyV = (C54046GyV) obj;
        int A0D = AnonymousClass7TG.A0D(gyV, 1708147893);
        C233112uy r7 = this.A00.A00;
        SystemClock.elapsedRealtime();
        C53263GlB glB = gyV.A01;
        if (glB != null) {
            C53278GlQ glQ = glB.A01;
            if (!(glQ == null || (hashMap = glQ.A03) == null)) {
                C233092uw r22 = r7.A00;
                Boolean bool = r22.A07;
                if (bool == null || (str2 = bool.toString()) == null) {
                    str2 = "";
                }
                hashMap.put("is_iaa_eligible", str2);
                hashMap.put("ads_category", r22.A0A);
            }
            C233092uw r3 = r7.A00;
            C233072uu r23 = r3.A06;
            if (r23 instanceof C233862wb) {
                r2 = (C233862wb) r23;
            } else {
                r2 = null;
            }
            str = "triggerSource";
            if (r2 != null) {
                r2.A02 = gyV;
                r2.A00 = r3.A00;
                r2.A06 = r3.A0B;
                r2.A03 = r3.A04;
                r2.A04 = r3.A05;
                Integer num = r3.A09;
                if (num != null) {
                    r2.A05 = num;
                    r2.A01 = r3.A02;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C53263GlB glB2 = gyV.A01;
            if (glB2 != null) {
                if (glB2.A02) {
                    C230662pz r24 = r3.A0F;
                    1Xj r1 = r3.A04;
                    AnonymousClass3W1 r0 = r3.A05;
                    Integer num2 = r3.A09;
                    if (num2 != null) {
                        if (!(r1 == null || r0 == null)) {
                            UserSession userSession = r24.A00;
                            if (182.A06(0Tu.A06, userSession, 36318965010078490L)) {
                                C55040HbB.A00(userSession, num2);
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                r7.Dlz(AnonymousClass05K.A00, AnonymousClass7TE.A1C());
                AnonymousClass0fD.A0A(1050644881, A0D);
                AnonymousClass0fD.A0A(-261803409, A03);
                return;
            }
        }
        str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
