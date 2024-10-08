package X;

/* renamed from: X.Il9  reason: case insensitive filesystem */
public final class C58077Il9 extends C267904cQ {
    public int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ 0sL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58077Il9(Object obj, AnonymousClass4D7 r2, 0sL r3) {
        super(r2);
        this.A02 = r3;
        this.A01 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        if (i == 0) {
            this.A00 = 1;
            0eS.A00(obj);
            0sL r1 = this.A02;
            0qQ.A0C(r1, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            0u4.A05(r1, 2);
            return r1.invoke(this.A01, this);
        } else if (i == 1) {
            this.A00 = 2;
            0eS.A00(obj);
            return obj;
        } else {
            throw AnonymousClass7TE.A0z("This coroutine had already completed");
        }
    }
}
