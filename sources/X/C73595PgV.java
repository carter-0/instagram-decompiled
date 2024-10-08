package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.PgV  reason: case insensitive filesystem */
public final /* synthetic */ class C73595PgV extends 03J implements 0sP {
    public final /* synthetic */ 0r1 A00;
    public final /* synthetic */ 0rm A01;
    public final /* synthetic */ 0rm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73595PgV(0r1 r7, 0rm r8, 0rm r9) {
        super(1, C61920qH.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.A00 = r7;
        this.A02 = r8;
        this.A01 = r9;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        0qQ.A0B(obj, 0);
        0r1 r3 = this.A00;
        0rm r4 = this.A02;
        0rm r2 = this.A01;
        if (!r3.A00) {
            ? obj3 = new Object();
            obj3.A00 = true;
            Object obj4 = r4.A00;
            Object obj5 = r2.A00;
            if (obj4 == obj5) {
                obj4 = 00k.A0U((Collection) obj5);
                r4.A00 = obj4;
            }
            ((List) obj4).add(obj);
            return new C58218IoM(46, r2, r3, r4, obj2, obj3);
        }
        throw AnonymousClass7TE.A0z("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
    }
}
