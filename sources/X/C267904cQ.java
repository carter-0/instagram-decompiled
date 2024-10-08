package X;

/* renamed from: X.4cQ  reason: invalid class name and case insensitive filesystem */
public abstract class C267904cQ extends 1Em {
    public final C262094Cc getContext() {
        return 19B.A00;
    }

    public C267904cQ(AnonymousClass4D7 r3) {
        super(r3);
        if (r3 != null && r3.getContext() != 19B.A00) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }
}
