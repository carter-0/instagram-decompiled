package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.state.CreationState;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.Jb9  reason: case insensitive filesystem */
public final class C59885Jb9 implements 1wn {
    public 1Ng A00;
    public Map A01;
    public final Stack A02 = new Stack();

    public final CreationState A00() {
        Stack stack = this.A02;
        if (stack.isEmpty()) {
            return null;
        }
        return (CreationState) stack.peek();
    }

    public final void A01(1wn r5) {
        this.A00.A01(r5, C59890JbF.class);
        CreationState creationState = CreationState.A0L;
        CreationState A002 = A00();
        A002.getClass();
        r5.onEvent(new C59890JbF(new C59888JbD(new C59887JbC()), creationState, A002));
    }

    public final void A02(CreationState creationState, CreationState creationState2, Class cls) {
        Map map = this.A01;
        Map map2 = (Map) map.get(creationState);
        if (map2 == null) {
            map2 = AnonymousClass7TE.A1E();
            map.put(creationState, map2);
        }
        map2.put(cls, creationState2);
    }

    public C59885Jb9(UserSession userSession, CreationState[] creationStateArr) {
        this.A00 = AnonymousClass1Nd.A00(userSession);
        this.A01 = AnonymousClass7TE.A1E();
        Stack stack = this.A02;
        stack.clear();
        for (CreationState push : creationStateArr) {
            stack.push(push);
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1003267307);
        C59888JbD jbD = (C59888JbD) obj;
        int A032 = AnonymousClass0fD.A03(886215928);
        CreationState A002 = A00();
        if (A002 == null) {
            0kD.A01("CreationStateMachine", 002.A0R("previousState is null. cannot handle onEvent ", jbD.A00.A00));
            i = 1458109566;
        } else {
            C59889JbE jbE = jbD.A00;
            if (jbE instanceof KPF) {
                this.A02.pop();
            } else if (jbE instanceof KPP) {
                CreationState creationState = ((KPP) jbE).A00;
                Stack stack = this.A02;
                if (!stack.contains(creationState)) {
                    i = 366306802;
                } else {
                    while (A00() != creationState) {
                        stack.pop();
                    }
                }
            } else {
                Map map = (Map) this.A01.get(A002);
                if (map == null) {
                    i = -852841992;
                } else {
                    Object obj2 = map.get(jbE.getClass());
                    if (obj2 == null) {
                        i = 1751881249;
                    } else {
                        if ((jbE instanceof C61867KPg) && ((C61867KPg) jbE).A01) {
                            this.A02.clear();
                        }
                        this.A02.push(obj2);
                    }
                }
            }
            CreationState A003 = A00();
            if (A003 != null) {
                this.A00.A05(new C59890JbF(jbD, A002, A003));
            } else {
                0kD.A01("CreationStateMachine", 002.A0R("currentState is null. cannot handle onEvent ", jbE.A00));
            }
            i = 1998990215;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1993818787, A03);
    }
}
