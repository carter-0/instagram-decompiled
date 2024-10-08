package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.state.gen.State;

/* renamed from: X.Pqm  reason: case insensitive filesystem */
public final class C74205Pqm extends 0Yg implements 0sK {
    public static final C74205Pqm A00 = new C74205Pqm();

    public C74205Pqm() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        0sP r2;
        Object nce;
        Integer num;
        C59628JQw jQw = (C59628JQw) obj;
        0sP r10 = (0sP) obj2;
        AnonymousClass7TG.A1N(jQw, r10);
        0qQ.A0B(obj3, 2);
        C73540PeW peW = (C73540PeW) jQw;
        0qQ.A0B(peW, 0);
        C70404O5h o5h = (C70404O5h) ((N4A) peW.B9B().invoke()).A00(C70404O5h.class);
        if (o5h == null) {
            o5h = NCJ.A00;
        }
        if (!o5h.A00 && (obj3 instanceof C69662Npk)) {
            C69662Npk npk = (C69662Npk) obj3;
            State A002 = C69726Nr9.A00(npk);
            boolean z = true;
            if (A002.callState == 4) {
                0qQ.A0B(npk, 0);
                2LV r1 = EndedModel.CONVERTER;
                0qQ.A08(r1);
                EndedModel endedModel = (EndedModel) ((C68372NDp) npk).A00.A00(r1);
                r2 = peW.A00;
                if (endedModel == null || endedModel.reason != 0) {
                    z = false;
                }
                nce = new NCF(z);
            } else {
                if (A002.isActive) {
                    0qQ.A0B(npk, 0);
                    2LV r12 = CallModel.CONVERTER;
                    0qQ.A08(r12);
                    CallModel callModel = (CallModel) ((C68372NDp) npk).A00.A00(r12);
                    if (callModel != null && callModel.inCallState == 2 && (o5h instanceof NCG)) {
                        r2 = peW.A00;
                        nce = NCI.A00;
                    }
                }
                if (o5h instanceof NCJ) {
                    State A003 = C69726Nr9.A00(npk);
                    if (A003.isActive) {
                        r2 = peW.A00;
                        nce = NCH.A00;
                    } else if (A003.callState == 2) {
                        0qQ.A0B(npk, 0);
                        2LV r13 = CallModel.CONVERTER;
                        0qQ.A08(r13);
                        CallModel callModel2 = (CallModel) ((C68372NDp) npk).A00.A00(r13);
                        if (callModel2 == null || callModel2.inCallState != 2) {
                            C71004OWb oWb = C71004OWb.A00;
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append("Received inactive IN_CALL models that aren't incoming ringing. InCallState: ");
                            if (callModel2 != null) {
                                num = Integer.valueOf(callModel2.inCallState);
                            } else {
                                num = null;
                            }
                            oWb.A00("MultiCallMiddleware", AnonymousClass7TF.A0i(num, A1A));
                        } else {
                            r2 = peW.A00;
                            nce = NCG.A00;
                        }
                    }
                } else if (!(o5h instanceof NCG)) {
                    C71004OWb.A00.A02("MultiCallMiddleware", AnonymousClass7TG.A0m(o5h, "Unhandled MultiCallState: ", AnonymousClass7TE.A1A()), (Throwable) null);
                } else {
                    0qQ.A0B(npk, 0);
                    2LV r14 = CallModel.CONVERTER;
                    0qQ.A08(r14);
                    CallModel callModel3 = (CallModel) ((C68372NDp) npk).A00.A00(r14);
                    if (callModel3 != null && callModel3.inCallState > 2) {
                        r2 = peW.A00;
                        nce = new NCE(callModel3.inviteRequestedVideo);
                    }
                }
            }
            r2.invoke(nce);
        }
        return r10.invoke(obj3);
    }
}
