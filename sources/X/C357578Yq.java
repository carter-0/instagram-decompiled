package X;

/* renamed from: X.8Yq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C357578Yq extends 03J implements 0sK {
    public static final C357578Yq A00 = new C357578Yq();

    public C357578Yq() {
        super(3, C357568Yp.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C357568Yp r7 = (C357568Yp) obj;
        1Wm r8 = (1Wm) obj2;
        long j = r7.A00;
        if (j <= 0) {
            r8.A01 = C60340gF.A00;
        } else {
            AnonymousClass8Yr r4 = new AnonymousClass8Yr(r7, r8);
            0qQ.A0C(r8, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C262094Cc r1 = r8.A04;
            r8.A00 = C241603Pv.A04(r1).CO5(r4, r1, j);
        }
        return C60340gF.A00;
    }
}
