package X;

/* renamed from: X.45X  reason: invalid class name */
public final class AnonymousClass45X extends AnonymousClass45Y {
    public final /* synthetic */ Runnable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45X(Runnable runnable) {
        super("MqttXplatNativeClient");
        this.A00 = runnable;
    }

    public final void run() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
