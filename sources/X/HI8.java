package X;

public final class HI8 extends HQ2 {
    public final JMS A00;

    public HI8(JMS jms) {
        0qQ.A0B(jms, 1);
        this.A00 = jms;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HI8) && 0qQ.A0K(this.A00, ((HI8) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuggestionScreen(imagineSuggestionResponse=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
