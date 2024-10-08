package X;

/* renamed from: X.PgJ  reason: case insensitive filesystem */
public final /* synthetic */ class C73584PgJ extends 03J implements C62320sa {
    public final /* synthetic */ 0r1 A00;
    public final /* synthetic */ 0rm A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73584PgJ(0r1 r7, 0rm r8) {
        super(0, C61920qH.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.A00 = r7;
        this.A01 = r8;
    }

    public final Object invoke() {
        0r1 r0 = this.A00;
        0rm r1 = this.A01;
        if (!r0.A00) {
            return r1.A00;
        }
        throw AnonymousClass7TE.A0z("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another\nthread.  Try createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
    }
}
