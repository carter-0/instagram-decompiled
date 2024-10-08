package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ts5  reason: case insensitive filesystem */
public abstract class C14225Ts5 {
    public static C14221Ts1 A00(UserSession userSession, AnonymousClass4D6 r5, C337247fx r6, G9d g9d, C337287g2 r8, Integer num, long j, long j2, boolean z, boolean z2) {
        C337247fx r2 = r6;
        if (!(r6 instanceof C337267fz)) {
            if (g9d == null) {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
            r2 = new Af9(r5, g9d);
        }
        0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.RequestTaskTypeaheadManagerResultProvider.Delegate<ValueType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder, ResponseType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder>");
        return new C14221Ts1(userSession, r2, new C14223Ts3((C337267fz) r2), r8, num, j2, j, z2, z);
    }

    public static C14221Ts1 A01(UserSession userSession, AnonymousClass4D6 r11, C337247fx r12, G9d g9d, C337287g2 r14, Integer num, boolean z) {
        C337247fx r2 = r12;
        if (!(r12 instanceof C337267fz)) {
            if (g9d == null) {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
            r2 = new Af9(r11, g9d);
        }
        0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.RequestTaskTypeaheadManagerResultProvider.Delegate<ValueType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder, ResponseType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder>");
        return new C14221Ts1(userSession, r2, new C14223Ts3((C337267fz) r2), r14, num, 200, 0, z, false);
    }
}
