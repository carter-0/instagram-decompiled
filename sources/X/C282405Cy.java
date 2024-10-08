package X;

import com.facebook.msys.mci.PlatformLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;

/* renamed from: X.5Cy  reason: invalid class name and case insensitive filesystem */
public final class C282405Cy implements 2Ag {
    public final UserSession A00;
    public final C282395Cx A01;

    public final void D0Y(1OS r3) {
        0qQ.A0B(r3, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r3.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationCancel();
        }
    }

    public final void D5W(1OS r3) {
        0qQ.A0B(r3, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r3.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationConfirm();
            A002.annotateEndPointReason("confirm_mutation");
            A002.onEndFlowSucceed();
        }
    }

    public final void D9f(1OS r6, String str, boolean z) {
        0qQ.A0B(r6, 0);
        int hashCode = r6.A05.hashCode();
        UserSession userSession = this.A00;
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(userSession, hashCode);
        C66667Maa A003 = this.A01.A00(r6);
        if (A002 != null) {
            A002.onLogDirectMutationDispatch();
            A002.annotateDirectMutationType(C395289zW.A00(r6));
            A002.annotateDirectMutationTypeStr(r6.A02());
            if (A003.A02) {
                String str2 = r6.A05;
                String A004 = C70121Nxb.A00(A003.A00);
                A002.annotateFirstSend(A004);
                PlatformLogger.platformEventStructuredLoggerAddFirtSendAnnotationWithAliasId(str2, A004);
            }
        }
        IGFOAMessagingLocalSendSpeedLogger A005 = C328727Fx.A00(userSession, Integer.valueOf(r6.A05.hashCode()));
        if (A005 != null && A003.A02) {
            A005.annotateFirstSendType(C70121Nxb.A00(A003.A00));
        }
    }

    public final void D9g(1OS r6, boolean z) {
        0qQ.A0B(r6, 0);
        if (z && (r6 instanceof 1bp) && 0qQ.A0K(r6.A02(), "send_text_message")) {
            Integer num = AnonymousClass05K.A00;
            UserSession userSession = this.A00;
            1bp r62 = (1bp) r6;
            C69242Nhw A012 = AnonymousClass7G0.A01(userSession, num, r62.A06().hashCode(), AnonymousClass796.A01(userSession, r62).A00(), true);
            if (A012 != null) {
                A012.onStartFlow();
                A012.annotateDispatchedFromDisk();
            }
        }
    }

    public final void DB7(1OS r3) {
        0qQ.A0B(r3, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r3.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationDrop();
        }
    }

    public final void DTK(0xF r3, 1OS r4, boolean z) {
        0qQ.A0B(r4, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r4.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationExecute();
        }
    }

    public final void DTL(0xF r4, 1OS r5, C270214gN r6, boolean z) {
        IGFOAMessagingSendToSentLogger A002;
        0qQ.A0B(r5, 0);
        if (!z && (A002 = AnonymousClass7G0.A00(this.A00, r5.A05.hashCode())) != null) {
            if (r6 != null) {
                A002.onLogMQTTFailure(r6.toString());
                PlatformLogger.platformEventStructuredLoggerInstamadilloAddFailReasonAnnotationWithAliasId(r5.A05, r6.toString());
            }
            A002.annotateEndPointReason("direct_mutation_failure");
            A002.onEndFlowFail("direct_mutation_failure");
        }
    }

    public final void DTP(0xF r3, 1OS r4) {
        0qQ.A0B(r4, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r4.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationSuccess();
            A002.annotateEndPointReason(RealtimeConstants.SEND_SUCCESS);
            A002.onEndFlowSucceed();
        }
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r3, String str, boolean z) {
        0qQ.A0B(r3, 0);
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(this.A00, r3.A05.hashCode());
        if (A002 != null) {
            A002.onLogDirectMutationRetry();
        }
    }

    public C282405Cy(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new C282395Cx(userSession);
    }
}
