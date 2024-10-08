package X;

public abstract class XCq {
    public static final int A00 = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public void A01(YAl yAl) {
        ((C67255Mkp) this).A00.Eyt(new C21066XDe(yAl));
    }

    public final void A00(YCU ycu) {
        1aP.A01(ycu, "s is null");
        try {
            1aP.A01(ycu, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A01(ycu);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9877Riq.A00(th);
            C318176oW.A01(th);
            NullPointerException A11 = AnonymousClass7TE.A11("Actually not, but can't throw other exceptions due to RS");
            A11.initCause(th);
            throw A11;
        }
    }
}
